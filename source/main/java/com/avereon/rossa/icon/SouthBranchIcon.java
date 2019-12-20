package com.avereon.rossa.icon;

import com.avereon.venza.image.ProgramIcon;
import javafx.scene.paint.Color;

public class SouthBranchIcon extends ProgramIcon {

	double b = g( 32 );

	double c = g( 16 );

	double f = g( 4 );

	double g = g( 12 );

	double k = g( 6 );

	double q = g( 30 );

	double ze = g( 9 );

	@Override
	protected void render() {
		startPath();
		addOval( c, c, g, g );
		moveTo( c + ze, c );
		addOval( c, c, ze, ze );
		closePath();
		fill( Color.web( "#204080") );

		startPath();
		moveTo( b - f, k );
		lineTo( c, q );
		lineTo( f, k );
		lineTo( c, g );
		closePath();
		fillAndDraw( Color.LIGHTGRAY );
		drawLine( c, g, c, q );
	}

	public static void main( String[] args ) {
		SouthBranchIcon icon = new SouthBranchIcon();
		icon.setOpacity( 0.2 );
		save( icon.setSize( 4096 ), "target/sbc-watermark.png" );

		//proof( new SouthBranchIcon().setSize( 1024 ) );
		//save( new SouthBranchIcon().setSize( 4096 ), "target/sbc-transparent.png" );
	}

}
