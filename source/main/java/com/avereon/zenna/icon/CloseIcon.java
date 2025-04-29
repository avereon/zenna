package com.avereon.zenna.icon;

import com.avereon.zerra.image.RenderedIcon;
import com.avereon.zerra.image.SvgIcon;

public class CloseIcon extends SvgIcon {

	protected void define() {
		super.define();
		draw( "M8,8L24,24" );
		draw( "M8,24L24,8" );
	}

	public static void main( String[] commands ) {
		RenderedIcon.proof( new CloseIcon() );
	}

}
