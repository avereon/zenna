package com.avereon.zenna.icon;

import com.avereon.zerra.image.RenderedIcon;

public class BulletListIcon extends RenderedIcon {

	private static final double r1 = 8;

	private static final double r2 = 16;

	private static final double r3 = 24;

	private static final double e = 6;

	private static final double gap = 6;

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
		addLine( g( e ), g( y ), g( e ), g( y ) );
		addLine( g( e + gap ), g( y ), g( w ), g( y ) );
	}

	public static void main( String[] commands ) {
		proof( new BulletListIcon() );
	}

}
