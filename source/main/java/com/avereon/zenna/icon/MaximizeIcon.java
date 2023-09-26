package com.avereon.zenna.icon;

import com.avereon.zarra.image.SvgIcon;

public class MaximizeIcon extends SvgIcon {

	public MaximizeIcon() {
		draw( "M4,10 L4,4 L10,4" );
		draw( "M22,4 L28,4 L28,10" );
		draw( "M28,22 L28,28 L22,28" );
		draw( "M10,28 L4,28 L4,22" );
	}

	public static void main( String[] commands ) {
		proof( new MaximizeIcon() );
	}

}
