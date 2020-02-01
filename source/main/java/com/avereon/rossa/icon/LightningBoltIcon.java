package com.avereon.rossa.icon;

import com.avereon.venza.image.ProgramIcon;

public class LightningBoltIcon extends ProgramIcon {

	@Override
	protected void render() {
		thickBolt();
	}

	private void thickBolt() {
		startPath();
		moveTo( g( 17 ), g( 3 ) );
		lineTo( g( 5 ), g( 19 ) );
		lineTo( g( 18 ), g( 19 ) );
		lineTo( g( 15 ), g( 29 ) );
		lineTo( g( 27 ), g( 13 ) );
		lineTo( g( 14 ), g( 13 ) );
		closePath();
		fill( GradientTone.LIGHT );
		draw();
	}

	private void thinBolt() {
		startPath();
		moveTo( g( 16 ), g( 1 ) );
		lineTo( g( 11 ), g( 19 ) );
		lineTo( g( 16 ), g( 19 ) );
		lineTo( g( 16 ), g( 31 ) );
		lineTo( g( 21 ), g( 13 ) );
		lineTo( g( 16 ), g( 13 ) );
		closePath();
		fill( GradientTone.LIGHT );
		draw();
	}

	public static void main( String[] commands ) {
		proof( new LightningBoltIcon() );
	}

}
