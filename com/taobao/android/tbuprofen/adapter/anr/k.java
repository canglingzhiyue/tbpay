package com.taobao.android.tbuprofen.adapter.anr;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f15475a = System.currentTimeMillis();
    public long b = 0;
    public long c = 0;
    public long d = 0;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public long k = 0;

    static {
        kge.a(1432536156);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.format("[%s][%d/%d][%d][%d][%s/%sms/%s/%sms][%s/%s]", com.taobao.android.tbuprofen.common.a.a(this.f15475a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.k), this.e, this.f, this.g, this.h, this.i, this.j);
    }
}
