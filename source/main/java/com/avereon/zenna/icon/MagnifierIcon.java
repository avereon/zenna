package com.avereon.zenna.icon;

import com.avereon.zarra.image.SvgIcon;

public class MagnifierIcon extends SvgIcon {

	public MagnifierIcon() {
		super( 32, 32 );

		draw( circle( 12, 12, 9 ), 0.5 * getStrokeWidth() );
		clip( "M 0,0 L32,0 L32,32 L0,32 Z " + circle( 12, 12, 12 ) );
		fill( ellipse( 24, 24, 4, 1.5, 45 ) );
	}

	public static void main( String[] commands ) {
		proof( new MagnifierIcon() );
	}

}
