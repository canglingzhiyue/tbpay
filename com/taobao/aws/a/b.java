package com.taobao.aws.a;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f16636a;

    static {
        kge.a(1589469839);
    }

    public b(int i) {
        this.f16636a = i;
    }

    public b(int i, String str) {
        super(str);
        this.f16636a = i;
    }

    public b(int i, Throwable th) {
        super(th);
        this.f16636a = i;
    }

    public int getCloseCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d42ffa49", new Object[]{this})).intValue() : this.f16636a;
    }
}
