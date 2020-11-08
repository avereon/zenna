package com.avereon.zenna.icon;

import com.avereon.zerra.image.SvgIcon;
import com.avereon.zerra.image.VectorImageWriter;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

import java.nio.file.Path;
import java.nio.file.Paths;

public class JewelIcon extends SvgIcon {

	private static final double OUTLINE_WIDTH = 0.5;

	private static final double C = 16;

	private static final double OUTER_RADIUS = 14;

	private static final double FACE_OUTER_RADIUS = OUTER_RADIUS - OUTLINE_WIDTH;

	private static final double FACE_INNER_RADIUS = 8;

	private static final double INNER_RADIUS = FACE_INNER_RADIUS - OUTLINE_WIDTH;

	private static final int FACE_COUNT = 8;

	private static final double ANGLE = Math.PI / 4;

	private static final double HALF_ANGLE = 0.5 * ANGLE;

	public JewelIcon() {
		Color amethyst = Color.web( "#40208060" );
		Color emerald = Color.web( "#20804060" );
		Color topaz = Color.web( "#20408060" );
		Color sapphire = Color.web( "#001060c0" );

		setStyle( "-fx-stroke: #000000;" );
		fill( circle( C, C, OUTER_RADIUS - 0.5 * OUTLINE_WIDTH ), sapphire );

		String faceA = face( 3 * ANGLE + HALF_ANGLE );
		String faceB = face( 4 * ANGLE + HALF_ANGLE );
		String faceC = face( 5 * ANGLE + HALF_ANGLE );
		fill( faceA, Color.web( "#ffffff60" ) );
		fill( faceB, Color.web( "#ffffffa0" ) );
		fill( faceC, Color.web( "#ffffff60" ) );

		StringBuilder builder = new StringBuilder( circle( C, C, OUTER_RADIUS ) );
		builder.append( top() );
		for( int index = 0; index < FACE_COUNT; index++ ) {
			double angle = index * ANGLE + HALF_ANGLE;
			builder.append( face( angle ) );
		}
		fill( builder.toString() );
	}

	private String top() {
		StringBuilder builder = new StringBuilder();
		for( int index = 0; index < FACE_COUNT; index++ ) {
			double angle = index * ANGLE + HALF_ANGLE;
			double x = C + INNER_RADIUS * Math.cos( angle );
			double y = C + INNER_RADIUS * Math.sin( angle );
			builder.append( index == 0 ? "M" : "L" ).append( x ).append( "," ).append( y );
		}
		builder.append( "Z" );
		return builder.toString();
	}

	private String face( double alpha ) {
		double theta = alpha + ANGLE;
		double pAlpha = alpha + (0.5 * Math.PI);
		double pTheta = theta + (0.5 * Math.PI);
		double omega = 0.5 * (pAlpha + pTheta);

		Point2D a = new Point2D( C + FACE_INNER_RADIUS * Math.cos( alpha ), C + FACE_INNER_RADIUS * Math.sin( alpha ) );
		Point2D b = new Point2D( C + FACE_OUTER_RADIUS * Math.cos( alpha ), C + FACE_OUTER_RADIUS * Math.sin( alpha ) );
		Point2D c = new Point2D( C + FACE_OUTER_RADIUS * Math.cos( theta ), C + FACE_OUTER_RADIUS * Math.sin( theta ) );
		Point2D d = new Point2D( C + FACE_INNER_RADIUS * Math.cos( theta ), C + FACE_INNER_RADIUS * Math.sin( theta ) );

		double halfLine = 0.5 * OUTLINE_WIDTH;
		Point2D e = new Point2D( a.getX() + halfLine * Math.cos( omega ), a.getY() + halfLine * Math.sin( omega ) );
		Point2D f = new Point2D( b.getX() + halfLine * Math.cos( pAlpha ), b.getY() + halfLine * Math.sin( pAlpha ) );
		Point2D g = new Point2D( c.getX() - halfLine * Math.cos( pTheta ), c.getY() - halfLine * Math.sin( pTheta ) );
		Point2D h = new Point2D( d.getX() - halfLine * Math.cos( omega ), d.getY() - halfLine * Math.sin( omega ) );

		StringBuilder builder = new StringBuilder();
		builder.append( "M" ).append( e.getX() ).append( " " ).append( e.getY() );
		builder.append( "L" ).append( f.getX() ).append( " " ).append( f.getY() );
		builder
			.append( "A" )
			.append( FACE_OUTER_RADIUS )
			.append( " " )
			.append( FACE_OUTER_RADIUS )
			.append( " " )
			.append( omega )
			.append( " 0 1 0" )
			.append( g.getX() )
			.append( " " )
			.append( g.getY() );
		builder.append( "L" ).append( h.getX() ).append( " " ).append( h.getY() );
		builder.append( "Z" );

		return builder.toString();
	}

	public static void main( String[] parameters ) {
		Path path = Paths.get( "target/jewel.png" );
		System.err.println( "path=" + path.toAbsolutePath() );
		JewelIcon icon = new JewelIcon();
		icon.resize( 2048 );
		try {
			new VectorImageWriter().save( icon, path );
		} catch( Exception e ) {
			e.printStackTrace();
		}
		proof( new JewelIcon() );
		//System.exit( 0 );
	}

}
