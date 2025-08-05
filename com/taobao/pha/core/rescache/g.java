package com.taobao.pha.core.rescache;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.nge;

/* loaded from: classes7.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public nge f18787a;
    public String b;
    public long c;
    public long d;
    public boolean e;

    static {
        kge.a(711726184);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.e;
    }

    public nge b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nge) ipChange.ipc$dispatch("16b9da31", new Object[]{this}) : this.f18787a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.c;
    }

    public long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : this.d;
    }
}
