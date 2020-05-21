package com.avereon.rossa.icon.flat;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.paint.Stop;

import java.util.ArrayList;
import java.util.List;

/**
 * Use <a href="http://www.pic2icon.com/windows7_vista_icon_generator.php">Pic2Icon</a> to convert to Windows icon.
 */
public class XRingIcon extends XIcon {

	// White
	static final Color RING_HIGHLIGHT = Color.web( "#FFFFFF" );

	// Indigo 300
	static final Color RING_BASE = Color.web( "#7986CB" );

	// Yellow 200
	static final Color JET_CENTER = Color.web( "#FFF59D" );

	// Orange 500
	static final Color JET_TIP = Color.web( "#FF9800" );

	private final double outerRingMax;

	private final double innerRingMax;

	private final double outerRingMin;

	private final double innerRingMin;

	public XRingIcon() {
		this( 3, 8 );
	}

	public XRingIcon( double radius, double inset ) {
		super( radius, inset );
		//setOutlineColor( Color.web( "#404040" ) );
		//setStyle( "-xe-outline-color: #404040" );

		double tilt = 12.0 / 16.0;
		outerRingMax = 16 + getRadius() - getInset();
		outerRingMin = outerRingMax * tilt;
		innerRingMax = getTr();
		innerRingMin = innerRingMax * tilt;
	}

	protected void render() {
		double sqrt8 = Math.sqrt( 8 );
		double dr = getTr() + sqrt8;

		getGraphicsContext2D().save();
		// Top ring clip
		startPath( g( dr ), g( 0 ) );
		lineTo( g( 16 ), g( 16 - dr ) );
		lineTo( g( 32 - dr ), g( 0 ) );
		closePath();
		clip();

		// Top ring
		startPath();
		addArc( g( 16 ), g( 16 ), g( outerRingMax ), g( outerRingMin ), 0, 360 );
		addArc( g( 16 ), g( 16 ), g( innerRingMax + 2 ), g( innerRingMin + 2 ), 0, 360 );
		closePath();
		fill( RING_BASE );
		getGraphicsContext2D().restore();

		// X top (no clip needed)
		startPath();
		xTopOpen();
		addArc( g( 16 ), g( 16 ), g( innerRingMax ), g( innerRingMin ), 180, 180 );
		closePath();
		fill(  );

		// Main ring clip
		getGraphicsContext2D().save();
		startPath( g( 0 ), g( 32 ) );
		lineTo( g( 0 ), g( dr ) );
		lineTo( g( 16 - innerRingMax ), g( 16 + sqrt8 ) );
		lineTo( g( 16 + innerRingMax ), g( 16 + sqrt8 ) );
		lineTo( g( 32 ), g( dr ) );
		lineTo( g( 32 ), g( 32 ) );
		closePath();
		clip();

		// Main ring
		startPath();
		addArc( g( 16 ), g( 16 ), g( outerRingMax ), g( outerRingMin ), 0, 360 );
		addArc( g( 16 ), g( 16 ), g( innerRingMax + 2 ), g( innerRingMin + 2 ), 0, 360 );
		closePath();
		fill( RING_BASE );
		reset();
		getGraphicsContext2D().restore();

		// X bottom clip
		getGraphicsContext2D().save();
		startPath( g( 0 ), g( 16 ) );
		addArc( g( 16 ), g( 16 ), g( outerRingMax + 2 ), g( outerRingMin + 2 ), 180, 180 );
		lineTo( g( 32 ), g( 16 ) );
		lineTo( g( 32 ), g( 32 ) );
		lineTo( g( 0 ), g( 32 ) );
		closePath();
		clip();

		// X bottom
		startPath();
		xBottomOpen();
		closePath();
		fill(  );
		getGraphicsContext2D().restore();
	}

	private Paint jetPaint() {
		double jetRadius = Math.sqrt( 2 * (g( 10 ) * g( 10 )) );
		List<Stop> jetPaintStops = new ArrayList<>();
		jetPaintStops.add( new Stop( 0.1, JET_CENTER ) );
		jetPaintStops.add( new Stop( 1.0, JET_TIP ) );
		return radialPaint( g( 16 ), g( 16 ), jetRadius, jetPaintStops );
	}

	@Deprecated
	protected void renderOld() {
		double ringScale = 9.0 / 11.0;

		//		// Ring paint
		//		List<Stop> ringPaintStops = new ArrayList<>();
		//		ringPaintStops.add( new Stop( 0.6, RING_HIGHLIGHT ) );
		//		ringPaintStops.add( new Stop( 0.9, RING_BASE ) );
		//		Paint ringPaint = radialPaint( g( 16 ), (1 / ringScale) * g( 16 ), g( 11 ), ringPaintStops );

		// Bottom of jet
		getGraphicsContext2D().save();
		clip( g( 0 ), g( 16 ), g( 32 ), g( 16 ) );
		xPath();
		fill( jetPaint() );
		//fillAndDraw( jetPaint );
		getGraphicsContext2D().restore();

		// Ring
		startPath();
		addArc( g( 16 ), g( 16 ), g( 11 ), g( ringScale * 11 ), 0, 360 );
		//moveTo( g( 21 ), g( 16 ) );
		addArc( g( 16 ), g( 16 ), g( 5 ), g( ringScale * 5 ), 0, 360 );
		closePath();
		getGraphicsContext2D().save();
		getGraphicsContext2D().scale( 1, ringScale );
		fill( RING_BASE );
		//fill( ringPaint );
		getGraphicsContext2D().restore();
		//draw();

		// Top of jet
		getGraphicsContext2D().save();
		clip( g( 0 ), g( 0 ), g( 32 ), g( 16 ) );
		xPath();
		fill( jetPaint() );
		//fillAndDraw( jetPaint );
		getGraphicsContext2D().restore();
	}

	private void clip( double x, double y, double w, double h ) {
		startPath();
		addRect( x, y, w, h );
		closePath();
		clip();
	}

	public static void main( String[] commands ) {
		proof( new XRingIcon() );
		//save( new XRingIcon(), new File( System.getProperty( "user.home" ), "Downloads/xenon.png" ) );
		//save( new XRingIcon(), "../../software/xenon/source/main/assembly/xenon.png");
	}

}
