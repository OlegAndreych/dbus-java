/*
   D-Bus Java Implementation
   Copyright (c) 2005-2006 Matthew Johnson

   This program is free software; you can redistribute it and/or modify it
   under the terms of either the GNU Lesser General Public License Version 2 or the
   Academic Free Licence Version 2.1.

   Full licence texts are included in the COPYING file with this program.
*/
package org.freedesktop.dbus.test;

import org.freedesktop.dbus.Position;
import org.freedesktop.dbus.Struct;
import org.freedesktop.dbus.UInt32;

//CHECKSTYLE:OFF
public final class ProfileStruct extends Struct {
    @Position(0)
    public final String a;
    @Position(1)
    public final UInt32 b;
    @Position(2)
    public final long   c;

    public ProfileStruct(String _a, UInt32 _b, long _c) {
        this.a = _a;
        this.b = _b;
        this.c = _c;
    }
}
//CHECKSTYLE:ON