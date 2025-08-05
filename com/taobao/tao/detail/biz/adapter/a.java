package com.taobao.tao.detail.biz.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.odu;
import tb.tpc;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2109266279);
        tpc.a("com.taobao.tao.detail.biz.adapter.DetailLog");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            boolean z = odu.f31958a;
        }
    }
}
