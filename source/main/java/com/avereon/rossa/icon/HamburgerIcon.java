package com.avereon.rossa.icon;

import com.avereon.venza.image.RenderedIcon;

public class HamburgerIcon extends RenderedIcon {

	private static final double r1 = 8;

	private static final double r2 = 16;

	private static final double r3 = 24;

	private static final double e = 6;

	private static final double w = 26;

	@Override
	protected void render() {
		startPath();
		addLine( g(e),g(r1),g(w),g(r1) );
		addLine( g(e),g(r2),g(w),g(r2) );
		addLine( g(e),g(r3),g(w),g(r3) );
		closePath();
		draw();
	}

	public static void main( String[] commands ) {
		RenderedIcon.proof( new HamburgerIcon() );
	}

}
