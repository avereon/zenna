package com.avereon.rossa.icon;

import com.avereon.venza.image.ProgramIcon;

public class ArrowLeftIcon extends ArrowIcon {

	@Override
	protected void rotate() {
		spin( g( 16 ), g( 16 ), -90 );
	}

	public static void main( String[] commands ) {
		ProgramIcon.proof( new ArrowLeftIcon() );
	}

}
