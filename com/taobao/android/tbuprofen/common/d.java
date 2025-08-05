package com.taobao.android.tbuprofen.common;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1456772250);
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : i == 0;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : (context.getApplicationInfo().flags & 2) > 0;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 26 && Build.VERSION.SDK_INT <= 34;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        String absolutePath = context.getFilesDir().getAbsolutePath();
        com.taobao.android.tbuprofen.log.c.c("", "The file path is %s", absolutePath);
        return absolutePath.contains("/dkplugin") || absolutePath.matches("^/data/user/.+/data/user/.+");
    }

    public static String b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("da9643a6", new Object[]{new Integer(i)}) : i != 805372417 ? i != 1879114240 ? String.valueOf(i) : "LIMIT" : "FULL_121";
    }

    public static String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th});
        }
        return String.format("%s: %s", th.getCause() != null ? th.getCause().getClass().getName() : TLogTracker.SCENE_EXCEPTION, th.getMessage());
    }
}
