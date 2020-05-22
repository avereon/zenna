package com.avereon.rossa.icon.flat;

import com.avereon.venza.icon.RenderedIcon;

public class PasteIcon extends RenderedIcon {

	@Override
	protected void render() {
		// Board
		startPath();
		addArc( g( 6 ), g( 10 ), g( 2 ), g( 2 ), 90, 90 );
		addArc( g( 6 ), g( 26 ), g( 2 ), g( 2 ), 180, 90 );
		addArc( g( 16 ), g( 26 ), g( 4 ), g( 4 ), 210, -30 );
		lineTo( g( 12 ), g( 14 ) );
		addArc( g( 8 ), g( 12 ), g( 2 ), g( 2 ), 270, -90 );
		closePath();
		fill();

		startPath( g( 26 ), g( 14 ) );
		lineTo( g( 28 ), g( 14 ) );
		addArc( g( 26 ), g( 10 ), g( 2 ), g( 2 ), 0, 90 );
		closePath();
		fill();

		// Page
		startPath( g( 14 ), g( 14 ) );
		addArc( g( 16 ), g( 26 ), g( 2 ), g( 2 ), 180, 90 );
		addArc( g( 26 ), g( 26 ), g( 2 ), g( 2 ), 270, 90 );
		lineTo( g( 28 ), g( 14 ) );
		closePath();
		fill();

		// Clip
		startPath( g( 8 ), g( 8 ) );
		lineTo( g( 8 ), g( 12 ) );
		lineTo( g( 24 ), g( 12 ) );
		addArc( g( 16 ), g( 8 ), g( 8 ), g( 6 ), 0, 180 );

		// Hole
		moveTo( g( 14 ), g( 8 ) );
		lineTo( g( 20 ), g( 8 ) );
		addArc( g( 16 ), g( 8 ), g( 4 ), g( 2 ), 0, 180 );
		closePath();
		fill();
	}

	public static void main( String[] commands ) {
		proof( new PasteIcon() );
	}

}
