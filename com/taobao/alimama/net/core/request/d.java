package com.taobao.alimama.net.core.request;

import com.android.alibaba.ip.runtime.IpChange;
import tb.dho;
import tb.dhp;
import tb.dhq;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1668580871);
    }

    public static a a(dho dhoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("75c646df", new Object[]{dhoVar});
        }
        if (dhoVar instanceof dhq) {
            return new MtopRequest();
        }
        if (!(dhoVar instanceof dhp)) {
            return null;
        }
        return new b();
    }
}
