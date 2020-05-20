package com.avereon.rossa.icon.flat;

import com.avereon.venza.icon.RenderedIcon;

public class CloseIcon extends RenderedIcon {

	@Override
	protected void render() {
		startPath( g( 8 ), g( 8 ) );
		lineTo( g( 24 ), g( 24 ) );
		moveTo( g( 8 ), g( 24 ) );
		lineTo( g( 24 ), g( 8 ) );
		draw();
	}

	public static void main( String[] commands ) {
		RenderedIcon.proof( new CloseIcon() );
	}

}
