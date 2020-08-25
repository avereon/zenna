package com.avereon.zenna.icon;

import com.avereon.zerra.image.RenderedIcon;

public class HexagonIcon extends RenderedIcon {

	public HexagonIcon() {}

	@Override
	protected void render() {
		startPath();
		getGraphicsContext2D().appendSVGPath( generateHexagon( 13 ) );
		closePath();
		draw();
	}

	private String generateHexagon( double r ) {
		double c = 16;
		double x = r * Math.cos( Math.toRadians( 30 ) );
		double y = r * Math.sin( Math.toRadians( 30 ) );

		String path = "M" + (c + x) + "," + (c - y);
		path += " " + c + "," + (c - r);
		path += " " + (c - x) + "," + (c - y);
		path += " " + (c - x) + "," + (c + y);
		path += " " + c + "," + (c + r);
		path += " " + (c + x) + "," + (c + y);
		path += " Z";

		return path;
	}

	public static void main( String[] commands ) {
		//proof( new HexagonIcon() );
		//		try {
		//			new VectorImageWriter().save( new HexagonIcon(), Paths.get( "target","hexagon.png" ), 256,256 );
		//			Platform.exit();
		//		} catch( Exception e ) {
		//			e.printStackTrace();
		//		}
	}

}
