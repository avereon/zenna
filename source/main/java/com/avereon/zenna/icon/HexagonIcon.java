package com.avereon.zenna.icon;

import com.avereon.zerra.image.SvgIcon;

public class HexagonIcon extends SvgIcon {

	public HexagonIcon() {
		add( generateHexagonCw( 13 ) +" " + generateHexagonCcw( 15 ) );
	}

	public static void main( String[] commands ) {
		proof( new HexagonIcon() );
	}

	private String generateHexagonCcw( double r ) {
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
		add( path );
		return path;
	}


	private String generateHexagonCw( double r ) {
		double c = 16;
		double x = r * Math.cos( Math.toRadians( 30 ) );
		double y = r * Math.sin( Math.toRadians( 30 ) );

		String path = "M" + (c + x) + "," + (c - y);
		path += " " + (c + x) + "," + (c + y);
		path += " " + c + "," + (c + r);
		path += " " + (c - x) + "," + (c + y);
		path += " " + (c - x) + "," + (c - y);
		path += " " + c + "," + (c - r);

		path += " Z";
		add( path );
		return path;
	}
}
