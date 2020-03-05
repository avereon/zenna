package com.avereon.rossa.icon;

import com.avereon.venza.image.ProgramIcon;
import javafx.scene.paint.Color;

public class TerminalIcon extends ProgramIcon {

	@Override
	protected void render() {
		// Screen
		startPath();
		addRect( g( 5 ), g( 7 ), g( 22 ), g( 18 ) );
		closePath();
		fill( getIconFillPaint( Color.web( "#606060" ), GradientTone.MEDIUM ) );
		draw();

		setDrawPaint( Color.web( "#e0e0e0" ) );
		setDrawWidth( 2 * getOutlineWidth() );

		// Arrow
		startPath();
		moveTo( g( 10 ), g( 12 ) );
		lineTo( g( 14 ), g( 16 ) );
		lineTo( g( 10 ), g( 20 ) );
		draw();

		// Prompt
		drawLine( g( 17 ), g( 21 ), g( 21 ), g( 21 ) );
	}

	public static void main( String[] args ) {
		proof( new TerminalIcon() );
	}

}
