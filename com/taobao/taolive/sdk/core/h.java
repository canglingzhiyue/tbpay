package com.taobao.taolive.sdk.core;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class h extends com.taobao.alilive.aliliveframework.frame.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.taolive.sdk.mergeInfo.b o;

    static {
        kge.a(-934191467);
    }

    public com.taobao.taolive.sdk.mergeInfo.b O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.mergeInfo.b) ipChange.ipc$dispatch("5d6f1a3f", new Object[]{this}) : this.o;
    }

    public void a(com.taobao.taolive.sdk.mergeInfo.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb716667", new Object[]{this, bVar});
        } else {
            this.o = bVar;
        }
    }
}
