package com.avereon.zenna.icon;

import com.avereon.zerra.image.SvgIcon;

public class ContextIcon extends SvgIcon {

	public ContextIcon() {
		super( 32, 32, "M7,11L7,15L15,23L17,23L25,15L25,11Z" );
	}

	public static void main( String[] commands ) {
		proof( new ContextIcon() );
	}

}
