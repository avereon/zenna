package com.avereon.zenna.icon;

import com.avereon.zarra.image.SvgIcon;

public class CheckIcon extends SvgIcon {

	public CheckIcon() {
		draw( "M9,16 L14,24 L23,6" );
	}

	public static void main( String[] commands ) {
		proof( new CheckIcon() );
	}

}
