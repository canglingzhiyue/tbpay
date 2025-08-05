package com.taobao.tao.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes.dex */
public class BuiltConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-359098829);
    }

    private BuiltConfig() {
    }

    public static boolean getBoolean(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2037feae", new Object[]{new Integer(i)})).booleanValue() : !"0".equals(Globals.getApplication().getString(i));
    }

    public static int getInt(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9ab0c236", new Object[]{new Integer(i)})).intValue() : Integer.parseInt(Globals.getApplication().getString(i));
    }

    public static String getString(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{new Integer(i)}) : Globals.getApplication().getString(i);
    }
}
