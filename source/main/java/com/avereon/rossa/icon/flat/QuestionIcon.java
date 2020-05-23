package com.avereon.rossa.icon.flat;

import com.avereon.venza.icon.RenderedIcon;

public class QuestionIcon extends RenderedIcon {

	@Override
	protected void render() {
		// Squiggle
		startPath();
		moveTo( g( 9 ), g( 9 ) );
		addArc( g( 12 ), g( 9 ), g( 3 ), g( 2 ), 180, 180 );
		addArc( g( 16 ), g( 9 ), g( 1 ), g( 1 ), 180, -180 );
		curveTo( g( 17 ), g( 13 ), g( 13 ), g( 11 ), g( 13 ), g( 17 ) );
		addArc( g( 16 ), g( 17 ), g( 3 ), g( 2 ), 180, 180 );

		curveTo( g( 19 ), g( 13 ), g( 23 ), g( 13 ), g( 23 ), g( 9 ) );
		addArc( g( 16 ), g( 9 ), g( 7 ), g( 6 ), 0, 180 );
		closePath();
		fill();

		// Dot
		startPath();
		addArc( g( 16 ), g( 24 ), g( 3 ), g( 3 ), 0,360 );
		closePath();
		fill();
	}

	public static void main( String[] commands ) {
		proof( new QuestionIcon() );
	}

}
