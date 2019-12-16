package com.avereon.rossa.icon;

import com.avereon.venza.image.ProgramImage;

public class CloseIcon extends XIcon {

	@Override
	protected void render() {
		xPath();
		fillAndDraw();
	}

	public static void main( String[] commands ) {
		ProgramImage.proof( new CloseIcon() );
	}

}
