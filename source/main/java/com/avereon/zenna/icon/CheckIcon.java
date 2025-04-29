package com.avereon.zenna.icon;

import com.avereon.zerra.image.SvgIcon;

public class CheckIcon extends SvgIcon {

	protected void define() {
		super.define();
		draw( "M9,16 L14,24 L23,6" );
	}

	public static void main( String[] commands ) {
		proof( new CheckIcon() );
	}

}
