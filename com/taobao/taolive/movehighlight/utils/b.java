package com.taobao.taolive.movehighlight.utils;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pfa;
import tb.pmd;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Point[] f21478a;

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : (b() * 9) / 16;
    }

    public static boolean a(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2df1069", new Object[]{context, aVar})).booleanValue();
        }
        if (pfa.a(aVar).b() == null) {
            return false;
        }
        return pfa.a(aVar).b().a(context);
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        DisplayMetrics displayMetrics = pmd.a().u().c().getResources().getDisplayMetrics();
        return displayMetrics.widthPixels > displayMetrics.heightPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels;
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue();
        }
        DisplayMetrics displayMetrics = pmd.a().u().c().getResources().getDisplayMetrics();
        return displayMetrics.widthPixels > displayMetrics.heightPixels ? displayMetrics.widthPixels : displayMetrics.heightPixels;
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue() : pmd.a().u().c().getResources().getDisplayMetrics().heightPixels;
    }

    static {
        kge.a(-690348192);
        f21478a = new Point[2];
    }
}
