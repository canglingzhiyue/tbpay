package com.taobao.aws.a;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends Throwable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f16635a;

    static {
        kge.a(1589469838);
    }

    public a(int i) {
        this.f16635a = i;
    }

    public int getPreferredSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d90762e6", new Object[]{this})).intValue() : this.f16635a;
    }
}
