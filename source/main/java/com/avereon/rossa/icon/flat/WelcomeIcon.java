package com.avereon.rossa.icon.flat;

import com.avereon.venza.icon.RenderedIcon;

public class WelcomeIcon extends RenderedIcon {

	@Override
	protected void render() {
		// TODO Be a bit more creative
		// Maybe a "waving hand" or "open door"
		startPath();
		moveTo( g( 2 ), g( 4 ) );
		lineTo( g( 2 ), g( 28 ) );
		lineTo( g( 30 ), g( 28 ) );
		lineTo( g( 30 ), g( 4 ) );
		closePath();
		moveTo( g( 4 ), g( 6 ) );
		lineTo( g( 4 ), g( 26 ) );
		lineTo( g( 28 ), g( 26 ) );
		lineTo( g( 28 ), g( 6 ) );
		closePath();
		moveTo( g( 6 ), g( 8 ) );
		lineTo( g( 6 ), g( 24 ) );
		lineTo( g( 26 ), g( 24 ) );
		lineTo( g( 26 ), g( 8 ) );
		closePath();
		fill();
	}

	public static void main( String[] commands ) {
		proof( new WelcomeIcon() );
	}

}
