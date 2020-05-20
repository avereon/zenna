package com.avereon.rossa.icon.flat;

import com.avereon.venza.icon.RenderedIcon;

public class ArrowDownIcon extends ArrowIcon {

	protected void rotate() {
		spin( g( 16 ), g( 16 ), 180 );
	}

	public static void main( String[] commands ) {
		RenderedIcon.proof( new ArrowDownIcon() );
	}

}
