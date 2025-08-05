package com.taobao.android.festival.festival;

import android.graphics.Color;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FESTIVAL_IMAGE_MODULE = "common";

    /* renamed from: a  reason: collision with root package name */
    private static final b f12356a;

    static {
        kge.a(1398240418);
        f12356a = new b();
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3e04f72e", new Object[0]) : f12356a;
    }

    private b() {
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a.a().b();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a.a().a(true);
        }
    }

    public int a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dba94fa", new Object[]{this, str, str2, new Integer(i)})).intValue();
        }
        String c = c(str, str2);
        if (TextUtils.isEmpty(c)) {
            return i;
        }
        try {
            return Color.parseColor(c);
        } catch (Exception unused) {
            return i;
        }
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        String c = c(str, str2);
        return TextUtils.isEmpty(c) ? "" : c;
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        String c = c("global", str);
        if (TextUtils.isEmpty(c)) {
            return i;
        }
        try {
            return Color.parseColor(c);
        } catch (Exception unused) {
            return i;
        }
    }

    public String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cef1bce2", new Object[]{this, str, str2}) : a.a().a(str, str2);
    }

    public Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{this, str}) : a.a().b(str);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : a.a().d();
    }

    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue() : !TextUtils.isEmpty(c(str, str2));
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : a.a().c(str);
    }
}
