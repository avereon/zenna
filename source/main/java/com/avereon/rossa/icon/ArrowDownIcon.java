package com.avereon.rossa.icon;

import com.avereon.venza.image.ProgramIcon;

public class ArrowDownIcon extends ArrowIcon {

	protected void rotate() {
		spin( g( 16 ), g( 16 ), 180 );
	}

	public static void main( String[] commands ) {
		ProgramIcon.proof( new ArrowDownIcon() );
	}

}
