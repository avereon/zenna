package com.avereon.zenna.icon;

import com.avereon.zarra.image.RenderedIcon;
import com.avereon.zarra.image.SvgIcon;

public class CloseIcon extends SvgIcon {

	public CloseIcon() {
		draw( "M8,8L24,24" );
		draw( "M8,24L24,8" );
	}

	public static void main( String[] commands ) {
		RenderedIcon.proof( new CloseIcon() );
	}

}
