package com.avereon.zenna.icon;

import com.avereon.zarra.image.SvgIcon;

public class TagIcon extends SvgIcon {

	public TagIcon() {
		String tag = "M3,16 L9,9 L29,9 L29,23 L9,23 Z";
		tag += circle( 9, 16, 2 );
		fill( tag );
	}

	public static void main( String[] commands ) {
		proof( new TagIcon() );
	}

}
