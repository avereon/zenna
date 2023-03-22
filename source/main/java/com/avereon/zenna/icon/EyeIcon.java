package com.avereon.zenna.icon;

import com.avereon.zarra.image.SvgIcon;

public class EyeIcon extends SvgIcon {

	public EyeIcon() {
		// Iris
		draw( "M12,16 A4,4,0,0,0,20,16 A4,4,0,0,0,12,16" );
		// Lids
		draw( "M2,16 A17.5,17.5,0,0,0,30,16 M2,16 A17.5,17.5,0,0,1,30,16", 3 );
	}

	public static void main( String[] args ) {
		proof( new EyeIcon() );
	}

}
