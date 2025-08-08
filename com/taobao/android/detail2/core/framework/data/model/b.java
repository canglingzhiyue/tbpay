package com.taobao.android.detail2.core.framework.data.model;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int e;

    /* renamed from: a  reason: collision with root package name */
    public int f11521a;
    public String b;
    public int c;
    public int d;
    public int f;
    public int g;

    public b() {
        int i = e;
        this.f = i;
        this.g = i;
    }

    static {
        kge.a(48456502);
        e = -1;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f11521a >= 0 && !StringUtils.isEmpty(this.b) && this.c >= 0;
    }
}
