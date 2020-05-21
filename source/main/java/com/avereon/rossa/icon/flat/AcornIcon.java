package com.avereon.rossa.icon.flat;

import com.avereon.venza.icon.RenderedIcon;
import javafx.scene.paint.Color;

public class AcornIcon extends RenderedIcon {

	private final double centerLine = 16;

	private final double stemRadius = 2;

	private final double stemTop = 0;

	private final double capRadius = 12;

	private final double capTop = 6;

	private final double capBase = 12;

	private final double nutRadius = 10;

	private final double nutBottom = 32;

	@Override
	protected void render() {
		setRenderPaint( Color.SADDLEBROWN );

		drawStem();
		fill();

		drawNut();
		fill();

		drawCap();
		fill();
	}

	private void drawStem() {
		startPath( g( centerLine - stemRadius ), g( capTop - 2 ) );
		lineTo( g( centerLine - stemRadius ), g( stemTop ) );
		lineTo( g( centerLine + stemRadius ), g( stemTop ) );
		lineTo( g( centerLine + stemRadius ), g( capTop - 2 ) );
		closePath();
	}

	private void drawCap() {
		startPath( g( centerLine + capRadius - 1 ), g( capBase ) );
		addCenteredArc( g( centerLine + capRadius - 1 ), g( capBase - 1 ), g( 1 ), g( 1 ), 270, 90 );
		addCenteredArc( g( centerLine ), g( capBase - 1 ), g( capRadius ), g( capBase - capTop -1 ), 0, 180 );
		addCenteredArc( g( centerLine - capRadius + 1 ), g( capBase - 1 ), g( 1 ), g( 1 ), 180, 90 );
		closePath();
	}

	private void drawNut() {
		double nutTop = capBase + 2;

		double a = nutTop + 19;
		double b = nutBottom - 4;
		double c = centerLine - nutRadius;
		double d = centerLine + nutRadius;

		double r = 1;

		startPath( g( c ), g( nutTop ) );
		curveTo( g( c ), g( a ), g( centerLine - r ), g( b ), g( centerLine - r ), g( nutBottom - r ) );
		addCenteredArc( g( centerLine ), g( nutBottom - r ), g( r ), g( r ), 180, 180 );
		curveTo( g( centerLine + r ), g( b ), g( d ), g( a ), g( d ), g( nutTop ) );
		closePath();
	}

	public static void main( String[] commands ) {
		//save( new AcornIcon(), "target/icons/acorn.png" );
		proof( new AcornIcon() );
		//wrapup();
	}

}
