package com.avereon.rossa.icon;

import com.avereon.venza.image.ProgramIcon;

public class ArrowUpIcon extends ArrowIcon {

	@Override
	protected void rotate() {}

	public static void main( String[] commands ) {
		ProgramIcon.proof( new ArrowUpIcon() );
	}

}
