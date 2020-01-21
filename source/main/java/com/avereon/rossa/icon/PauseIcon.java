package com.avereon.rossa.icon;

import com.avereon.venza.image.ProgramIcon;

public class PauseIcon extends ProgramIcon {

	@Override
	protected void render() {
		fillRect( g( 7 ), g( 7 ), g( 6 ), g( 18 ) );
		fillRect( g( 19 ), g( 7 ), g( 6 ), g( 18 ) );
		drawRect( g( 7 ), g( 7 ), g( 6 ), g( 18 ) );
		drawRect( g( 19 ), g( 7 ), g( 6 ), g( 18 ) );
	}

	public static void main( String[] commands ) {
		proof( new PauseIcon() );
	}

}
