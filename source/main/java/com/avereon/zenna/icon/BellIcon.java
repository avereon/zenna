package com.avereon.zenna.icon;

import com.avereon.zarra.image.SvgIcon;

public class BellIcon extends SvgIcon {

    public BellIcon() {
        fill("M4,24L16,4L28,24Z");
        fill("M14,26L18,26A2,2,0,0,1,14,26");
    }

    public static void main( String[] commands ) {
        proof( new BellIcon() );
    }
 }
