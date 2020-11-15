package com.avereon.zenna.icon;

import com.avereon.zerra.image.SvgIcon;

public class MountainIcon extends SvgIcon {

	public MountainIcon() {
		double offset = Math.sqrt( 0.5 );
		fill( circle( 16, 16, 15 ) + "M 14,8 l 5,5 -7,9 10,-10 " + (6 + offset) + " " + (6 + offset) + " A 13 13 0 1 0 " + (4 - offset) + "," + (18 + offset) );
	}

	public static void main( String[] parameters ) {
		proof( new MountainIcon() );
		//		try {
		//			new VectorImageWriter().save( (VectorImage)new MountainIcon().resize( 2048 ), Path.of( "target/mountain.png" ) );
		//		} catch( Exception e ) {
		//			e.printStackTrace();
		//		} finally {
		//			Platform.exit();
		//		}
	}

}
