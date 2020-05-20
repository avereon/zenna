package com.avereon.rossa.icon.flat;

import com.avereon.venza.icon.RenderedIcon;

public class ArrowLeftIcon extends ArrowIcon {

	@Override
	protected void rotate() {
		spin( g( 16 ), g( 16 ), -90 );
	}

	public static void main( String[] commands ) {
		RenderedIcon.proof( new ArrowLeftIcon() );
	}

}
