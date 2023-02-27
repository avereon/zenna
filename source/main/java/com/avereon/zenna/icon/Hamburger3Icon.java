package com.avereon.zenna.icon;

import com.avereon.zarra.image.RenderedIcon;

public class Hamburger3Icon extends RenderedIcon {

	private static final double spacing = 8;

	private static final double r1 = 8;

	private static final double r2 = r1 + spacing;

	private static final double r3 = r2 + spacing;

	private static final double e = 6;

	private static final double w = 26;

	@Override
	protected void render() {
		startPath();
		addRow( r1 );
		addRow( r2 );
		addRow( r3 );
		closePath();
		draw();
	}

	private void addRow( double y ) {
		addLine( g( e ), g( y ), g( w ), g( y ) );
	}

	public static void main( String[] commands ) {
		RenderedIcon.proof( new Hamburger3Icon() );
	}

}
