package com.avereon.rossa.icon.flat;

/**
 * Use <a href="http://www.pic2icon.com/">Pic2Icon</a> to convert to Windows icon.
 */
public class WingDiscLargeIcon extends WingDiscIcon {

	public WingDiscLargeIcon() {
		POINT_RADIUS = g( 3 );
		DISC_RADIUS = g( 7 );

		zx = g( 16 );
		zy = g( 4 );

		yx = g( 4 );
		yy = g( 28 );

		xx = g( 16 );
		xy = g( 24 );

		wx = g( 28 );
		wy = g( 28 );

		vx = g( 16 );
		vy = g( 23 );
	}

//	public static void main( String[] commands ) {
//		proof( new WingDiscLargeIcon(), Color.web( ("#427893")) );
//	}

	public static void main( String[] commands ) {
		proof( new WingDiscLargeIcon() );
	}
}