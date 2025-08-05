package com.taobao.android.dinamicx.view.richtext;

import android.graphics.Typeface;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f11962a;
    private ConcurrentHashMap<String, Typeface> b = new ConcurrentHashMap<>();

    static {
        kge.a(1738153028);
        f11962a = new c();
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("dde890c5", new Object[0]) : f11962a;
    }

    public Typeface a(String str, Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("bdcbc40a", new Object[]{this, str, typeface});
        }
        Typeface typeface2 = this.b.get(str);
        if (typeface2 != null) {
            return typeface2;
        }
        this.b.put(str, typeface);
        return typeface;
    }
}
