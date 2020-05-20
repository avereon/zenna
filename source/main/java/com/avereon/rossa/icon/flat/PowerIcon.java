package com.avereon.rossa.icon.flat;

import com.avereon.venza.icon.RenderedIcon;
import javafx.geometry.Point2D;

public class PowerIcon extends RenderedIcon {

	private final Point2D center = new Point2D( g( 16 ), g( 18 ) );

	private final double radius = g( 12 );

	private final double angle = 35;

	@Override
	protected void render() {
		renderWithStroke();
	}

	private void renderWithStroke() {
		startPath();
		moveTo( center.getX(), g( 4 ) );
		lineTo( center.getX(), g( 14 ) );
		draw();

		startPath();
		addCenteredArc( center.getX(), center.getY(), radius, radius, 90 + angle, 360 - (2 * angle) );
		draw();
	}

	public static void main( String[] commands ) {
		proof( new PowerIcon() );
	}

}
