package com.avereon.zenna.icon;

import com.avereon.zerra.image.SvgIcon;

public class WelcomeIcon extends SvgIcon {

	protected void define() {
		super.define();

		String tl = arc( 6, 6, 2, -90, -90 );
		String bl = arc( 6, 26, 2, -180, -90 );
		String br = arc( 26, 26, 2, -270, -90 );
		String tr = arc( 26, 6, 2, 0, -90 );
		String icon = "M6,4 " + tl + " L4,26 " + bl + " L26,28 " + br + " L28,6 " + tr + " Z";
		fill( icon );
	}

	public static void main( String[] commands ) {
		proof( new WelcomeIcon() );
	}

}
