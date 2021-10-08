package com.avereon.zenna.icon;

import com.avereon.zarra.image.RenderedIcon;

public class ArrowRightIcon extends ArrowIcon {

	protected void rotate() {
		spin( g( 16 ), g( 16 ), 90 );
	}

	public static void main( String[] commands ) {
		RenderedIcon.proof( new ArrowRightIcon() );
	}

}
