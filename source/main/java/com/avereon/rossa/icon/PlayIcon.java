package com.avereon.rossa.icon;

import com.avereon.venza.image.ProgramIcon;

public class PlayIcon extends ProgramIcon {

	@Override
	protected void render() {
		startPath();
		moveTo( g( 7 ), g( 7 ) );
		lineTo( g( 7 ), g( 25 ) );
		lineTo( g( 25 ), g( 16 ) );
		closePath();

		fillAndDraw();
	}

	public static void main( String[] commands ) {
		proof( new PlayIcon() );
	}

}
