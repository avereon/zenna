package com.avereon.rossa.icon;

import com.avereon.venza.image.ProgramIcon;

public class HomeIcon extends ProgramIcon {

	@Override
	protected void render() {
		// House
		startPath();
		moveTo( g( 16 ), g( 8 ) );
		lineTo( g( 7 ), g( 17 ) );
		lineTo( g( 7 ), g( 29 ) );
		lineTo( g( 25 ), g( 29 ) );
		lineTo( g( 25 ), g( 17 ) );
		closePath();
		fill();

		// Door fill
		setFillTone( GradientTone.LIGHT );
		fillRect( g( 13 ), g( 21 ), g( 6 ), g( 8 ) );

		// Door outline
		startPath();
		moveTo( g( 13 ), g( 29 ) );
		lineTo( g( 13 ), g( 21 ) );
		lineTo( g( 19 ), g( 21 ) );
		lineTo( g( 19 ), g( 29 ) );
		draw();

		// House outline
		startPath();
		moveTo( g( 7 ), g( 17 ) );
		lineTo( g( 7 ), g( 29 ) );
		lineTo( g( 25 ), g( 29 ) );
		lineTo( g( 25 ), g( 17 ) );
		draw();

		// Roof
		startPath();
		moveTo( g( 16 ), g( 4 ) );
		lineTo( g( 3 ), g( 17 ) );
		lineTo( g( 5 ), g( 19 ) );
		lineTo( g( 16 ), g( 8 ) );
		lineTo( g( 27 ), g( 19 ) );
		lineTo( g( 29 ), g( 17 ) );
		closePath();
		fillAndDraw( GradientTone.LIGHT );
	}

	public static void main( String[] args ) {
		proof( new HomeIcon() );
	}

}
