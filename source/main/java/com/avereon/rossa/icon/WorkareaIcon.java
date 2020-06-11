package com.avereon.rossa.icon;

import com.avereon.venza.image.RenderedIcon;

public class WorkareaIcon extends RenderedIcon {

	@Override
	protected void render() {
		startPath();
		addArc( g( 6 ), g( 6 ), g( 2 ), g( 2 ), 90, 90 );
		addArc( g( 6 ), g( 26 ), g( 2 ), g( 2 ), 180, 90 );
		addArc( g( 26 ), g( 26 ), g( 2 ), g( 2 ), 270, 90 );
		addArc( g( 26 ), g( 6 ), g( 2 ), g( 2 ), 0, 90 );
		fill();
	}

	public static void main( String[] commands ) {
		proof( new WorkareaIcon() );
	}

}
