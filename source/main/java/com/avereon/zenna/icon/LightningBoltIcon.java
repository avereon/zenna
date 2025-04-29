package com.avereon.zenna.icon;

import com.avereon.zerra.image.SvgIcon;

public class LightningBoltIcon extends SvgIcon {

	protected void define() {
		super.define();

		// Triangles
		//fill( "M15,2 L12,16 L14,16 L17,30 L20,16 L18,16 Z" );

		// Thin
		fill( "M16,1 L11,19 L16,19 L16,31 L21,13 L16,13 Z" );

		// Thick
		//add( "M17,3 L5,19 L18,19 L15,29 L27,13 L14,13 Z" );
	}
	public static void main( String[] commands ) {
		proof( new LightningBoltIcon() );
	}

}
