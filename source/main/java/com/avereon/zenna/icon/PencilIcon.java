package com.avereon.zenna.icon;

import com.avereon.zarra.image.SvgIcon;

public class PencilIcon extends SvgIcon {

	public PencilIcon() {
		double width = 3;
		double w = width * 0.5 * Math.sqrt( 2 );
		double h = 0.5 * w;

		fill( "M26.5,2.5 A" + w + "," + h + ",45,1,1,29.5,5.5 L27.5,7.5 L24.5,4.5 Z" );
		fill( "M22.5,6.5 L25.5,9.5 L10.5,24.5 L7.5,21.5 Z" );
		fill( "M5.5,23.5 L8.5,26.5 L2,30 Z" );
	}

	public static void main( String[] commands ) {
		proof( new PencilIcon() );
	}

}
