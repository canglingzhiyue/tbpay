package com.etao.feimagesearch.capture.dynamic.msg;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FUNCTION_BTN_HIDE = "hide";
    public static final String FUNCTION_BTN_SHOW = "show";
    public static final String FUNCTION_CLOSE = "close";
    public static final String FUNCTION_OPEN = "open";

    /* renamed from: a  reason: collision with root package name */
    private final String f6567a;
    private final String b;

    static {
        kge.a(-986317156);
    }

    public a(String str, String str2) {
        this.f6567a = str;
        this.b = str2;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f6567a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : "show".equals(this.f6567a);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : "open".equals(this.b);
    }
}
