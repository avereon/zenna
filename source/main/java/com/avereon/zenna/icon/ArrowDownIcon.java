package com.avereon.zenna.icon;

import com.avereon.zerra.image.RenderedIcon;

public class ArrowDownIcon extends ArrowIcon {

	protected void rotate() {
		spin( g( 16 ), g( 16 ), 180 );
	}

	public static void main( String[] commands ) {
		RenderedIcon.proof( new ArrowDownIcon() );
	}

}
