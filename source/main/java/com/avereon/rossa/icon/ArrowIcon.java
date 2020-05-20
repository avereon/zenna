package com.avereon.rossa.icon;

import com.avereon.venza.icon.RenderedIcon;

public class ArrowIcon extends RenderedIcon {

	private double offset = 7;

	@Override
	protected void render() {
		setDrawWidth( g( 4 ) );
		//setDrawJoin( StrokeLineJoin.MITER );

		rotate();

		startPath();
		moveTo( g( 16 ), g( 16 - offset ) );
		lineTo( g( 16 ), g( 16 + offset ) );
		moveTo( g( 16 - offset ), g( 16 ) );
		lineTo( g( 16 ), g( 16 - offset ) );
		lineTo( g( 16 + offset ), g( 16 ) );
		draw();

		reset();
	}

	protected void rotate() {}

	public static void main( String[] commands ) {
		RenderedIcon.proof( new ArrowIcon() );
	}

}
