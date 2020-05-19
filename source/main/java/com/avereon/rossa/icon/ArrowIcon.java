package com.avereon.rossa.icon;

import com.avereon.venza.image.ProgramIcon;
import com.avereon.venza.image.ProgramImage;

public class ArrowIcon extends ProgramIcon {

	private double offset = 7;

	@Override
	protected void render() {
		rotate();
		//		startPath();
		//		moveTo( g( 16 ), g( 16 - offset ) );
		//		lineTo( g( 16 - offset ), g( 16 + offset ) );
		//		lineTo( g( 16 + offset ), g( 16 + offset ) );
		//		closePath();

		setDrawWidth( g( 4 ) );
		drawLine( g( 16 ), g( 16 - offset ), g( 16 ), g( 16 + offset ) );
		drawLine( g( 16 - offset ), g( 16 ), g( 16 ), g( 16 - offset ) );
		drawLine( g( 16 ), g( 16 - offset ), g( 16 + offset ), g( 16 ) );

		reset();
		//		fillAndDraw();
	}

	protected void rotate() {}

	public static void main( String[] commands ) {
		ProgramImage.proof( new ArrowIcon() );
	}

}
