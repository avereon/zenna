package com.avereon.rossa.icon;

import com.avereon.venza.image.RenderedIcon;

public class ArrowUpIcon extends ArrowIcon {

	@Override
	protected void rotate() {}

	public static void main( String[] commands ) {
		RenderedIcon.proof( new ArrowUpIcon() );
	}

}
