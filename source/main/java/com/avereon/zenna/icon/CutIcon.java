package com.avereon.zenna.icon;

import com.avereon.zarra.image.RenderedIcon;

public class CutIcon extends RenderedIcon {

	@Override
	protected void render() {
		// Bottom Scissor
		startPath();
		moveTo( g( 17 ), g( 16 ) );
		lineTo( g( 3 ), g( 9 ) );
		curveTo( g( 5 ), g( 13 ), g( 7 ), g( 15 ), g( 11 ), g( 17 ) );
		curveTo( g( 15 ), g( 19 ), g( 19 ), g( 19 ), g( 23 ), g( 21 ) );
		curveTo( g( 25 ), g( 22 ), g( 27 ), g( 23 ), g( 29 ), g( 23 ) );
		addArc( g( 29 ), g( 21 ), g( 2 ), g( 2 ), 270, 90 );
		addArc( g( 27 ), g( 21 ), g( 4 ), g( 4 ), 0, 90 );
		curveTo( g( 23 ), g( 17 ), g( 19 ), g( 17 ), g( 17 ), g( 16 ) );
		// Bottom Handle
		moveTo( g( 23 ), g( 20 ) );
		curveTo( g( 25 ), g( 21 ), g( 27 ), g( 22 ), g( 29 ), g( 22 ) );
		addArc( g( 29 ), g( 21 ), g( 1 ), g( 1 ), 270, 90 );
		addArc( g( 27 ), g( 21 ), g( 3 ), g( 3 ), 0, 90 );
		lineTo( g( 25 ), g( 18 ) );
		addArc( g( 25 ), g( 20 ), g( 2 ), g( 2 ), 90, 90 );
		closePath();
		fill();

		// Left Wave
		wave();
		move(g(3),g(3));
		wave();
		reset();

		// Top Scissor
		startPath();
		moveTo( g( 16 ), g( 17 ) );
		lineTo( g( 9 ), g( 3 ) );
		curveTo( g( 13 ), g( 5 ), g( 15 ), g( 7 ), g( 17 ), g( 11 ) );
		curveTo( g( 19 ), g( 15 ), g( 19 ), g( 19 ), g( 21 ), g( 23 ) );
		curveTo( g( 22 ), g( 25 ), g( 23 ), g( 27 ), g( 23 ), g( 29 ) );
		addArc( g( 21 ), g( 29 ), g( 2 ), g( 2 ), 0, -90 );
		addArc( g( 21 ), g( 27 ), g( 4 ), g( 4 ), 270, -90 );
		curveTo( g( 17 ), g( 23 ), g( 17 ), g( 19 ), g( 16 ), g( 17 ) );
		// Top Handle
		moveTo( g( 20 ), g( 23 ) );
		curveTo(g(21),g(25),g(22),g(27),g(22),g(29));
		addArc( g( 21 ), g( 29 ), g( 1 ), g( 1 ), 0, -90 );
		addArc( g( 21 ), g( 27 ), g( 3 ), g( 3 ), 270, -90 );
		lineTo(g(18),g(25));
		addArc(g(20),g(25),g(2),g(2),180,-90);
		closePath();
		fill();

		// Hinge
		double p = 17.75;
		//drawLine( g(p),g(p),g(p),g(p) );
	}

	private void wave() {
		startPath();
		moveTo( g( 0 ), g( 16 ) );
		curveTo( g( 6 ), g( 16 ), g( 10 ), g( 4 ), g( 20 ), g( 4 ) );
		curveTo( g( 14 ), g( 4 ), g( 10 ), g( 16 ), g( 2 ), g( 16 ) );
		closePath();
		fill();
	}

	public static void main( String[] commands ) {
		proof( new CutIcon() );
	}

}
