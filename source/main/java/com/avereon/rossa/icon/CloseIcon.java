package com.avereon.rossa.icon;

import com.avereon.venza.image.ProgramIcon;
import com.avereon.venza.image.ProgramImage;

public class CloseIcon extends ProgramIcon {

	@Override
	protected void render() {
		xPath();
		fillAndDraw();
	}

	private void xPath() {
		double radius = Math.sqrt( 2 * (g( 2 ) * g( 2 )) );
		startPath();
		moveTo( g( 16 ), g( 12 ) );
		lineTo( g( 22 ), g( 6 ) );
		addArc( g( 24 ), g( 8 ), radius, radius, 135, -180 );
		lineTo( g( 20 ), g( 16 ) );
		lineTo( g( 26 ), g( 22 ) );
		addArc( g( 24 ), g( 24 ), radius, radius, 45, -180 );
		lineTo( g( 16 ), g( 20 ) );
		lineTo( g( 10 ), g( 26 ) );
		addArc( g( 8 ), g( 24 ), radius, radius, 315, -180 );
		lineTo( g( 12 ), g( 16 ) );
		lineTo( g( 6 ), g( 10 ) );
		addArc( g( 8 ), g( 8 ), radius, radius, 225, -180 );
		closePath();
	}

	public static void main( String[] commands ) {
		ProgramImage.proof( new CloseIcon() );
	}

}
