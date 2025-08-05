package com.taobao.alimama;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(165351613);
    }

    public static com.taobao.alimama.tkcps.b a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alimama.tkcps.b) ipChange.ipc$dispatch("618af08d", new Object[]{str}) : new com.taobao.alimama.tkcps.a(str);
    }
}
