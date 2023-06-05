package com.avereon.zenna.icon;

import com.avereon.zarra.image.SvgIcon;
import javafx.scene.paint.Color;

public class BellIcon extends SvgIcon {

	public BellIcon() {
		this( null );
	}

	public BellIcon( Color color ) {
		setStrokePaint( color );

		// Bell
		fill( "M4,24C4,18,8,20,8,10A5,5,0,0,1,24,10C24,20,28,18,28,24" );

		// Gong
		fill( "M13,26L19,26A3,3,0,0,1,13,26" );
	}

	public static void main( String[] commands ) {
		proof( new BellIcon() );
	}

}
