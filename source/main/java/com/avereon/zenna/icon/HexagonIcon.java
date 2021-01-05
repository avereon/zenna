package com.avereon.zenna.icon;

import com.avereon.zerra.image.SvgIcon;
import com.avereon.zerra.image.VectorIcon;
import com.avereon.zerra.image.VectorImageWriter;
import javafx.application.Platform;

import java.nio.file.Path;
import java.nio.file.Paths;

public class HexagonIcon extends SvgIcon {

	public HexagonIcon() {
		draw( generateHexagon( 12 ) );
	}

	private String generateHexagon( double r ) {
		double c = 16;
		double x = r * Math.cos( Math.toRadians( 30 ) );
		double y = r * Math.sin( Math.toRadians( 30 ) );

		String path = "M" + (c + x) + "," + (c - y);
		path += " " + c + "," + (c - r);
		path += " " + (c - x) + "," + (c - y);
		path += " " + (c - x) + "," + (c + y);
		path += " " + c + "," + (c + r);
		path += " " + (c + x) + "," + (c + y);
		path += " Z";

		return path;
	}

	public static void main( String[] commands ) {
		proof( new HexagonIcon() );
		try {
			//new VectorImageWriter().save( new HexagonIcon(), Paths.get( "target","hexagon.png" ), 2048, 2048 );
			Path home = Paths.get( System.getProperty( "user.home" ) );
			Path icons = home.resolve( "Profile/etc/icons" );
			new VectorImageWriter().save( (VectorIcon)new HexagonIcon().resize( 2048 ), icons.resolve( "molecule-graphene.png" ) );
			Platform.exit();
		} catch( Exception e ) {
			e.printStackTrace();
		}
	}

}
