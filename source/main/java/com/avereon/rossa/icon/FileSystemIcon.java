package com.avereon.rossa.icon;

import com.avereon.venza.image.ProgramIcon;

public class FileSystemIcon extends ProgramIcon {

	private final double w = 13;

	private final double h = 5;

	private final double s = 4;

	@Override
	protected void render() {
		move( g( 0 ), g( 1.5 * s ) );
		renderStack();
		move( g( 0 ), g( -s ) );
		renderStack();
		move( g( 0 ), g( -s ) );
		renderStack();
		move( g( 0 ), g( -s ) );
		renderDisk();
	}

	private void renderStack() {
		startPath();
		moveTo( g( 16 - w ), g( 16 - s ) );
		lineTo( g( 16 - w ), g( 16 ) );
		addArc( g( 16 ), g( 16 ), g( w ), g( h ), 180, 180 );
		lineTo( g( 16 + w ), g( 16 - s ) );
		fillAndDraw();
	}

	private void renderDisk() {
		setFillTone( GradientTone.LIGHT );
		fillCenteredOval( g( 16 ), g( 16 ), g( w ), g( h ) );
		drawCenteredOval( g( 16 ), g( 16 ), g( w ), g( h ) );
	}

	public static void main( String[] args ) {
		proof( new FileSystemIcon() );
	}

}
