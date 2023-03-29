package com.avereon.zenna.icon;

import com.avereon.zarra.image.SvgIcon;

public class ExpandIcon extends SvgIcon {

	public ExpandIcon() {
		draw( "M4,2 L28,2" );
		draw( "M10,12 L16,6 L22,12 M10,20 L16,26 L22,20" );
		draw( "M4,30 L28,30" );
	}

	public static void main( String[] commands ) {
		proof( new ExpandIcon() );
	}

}
