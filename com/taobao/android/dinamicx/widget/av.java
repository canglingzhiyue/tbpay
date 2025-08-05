package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f12067a = -1;
    public String b;
    public String c;

    static {
        kge.a(-1415608832);
    }

    public av a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (av) ipChange.ipc$dispatch("68323e4c", new Object[]{this});
        }
        av avVar = new av();
        avVar.f12067a = this.f12067a;
        avVar.b = this.b;
        avVar.c = this.c;
        return avVar;
    }
}
