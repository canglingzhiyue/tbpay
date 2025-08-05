package com.taobao.taopai.material.request.musicunlove;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class b extends com.taobao.taopai.material.request.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String d;
    private String e;
    private int f;

    static {
        kge.a(736204821);
    }

    public b(String str, String str2, int i) {
        this.d = str;
        this.e = str2;
        this.f = i;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.d;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.e;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.f;
    }
}
