package com.taobao.pha.core.rescache;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.n;
import com.taobao.pha.core.p;
import tb.kge;
import tb.ngd;
import tb.nge;

/* loaded from: classes7.dex */
public class i implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(397623444);
        kge.a(-96877230);
    }

    @Override // com.taobao.pha.core.rescache.c
    public nge a(ngd ngdVar) {
        n b;
        com.taobao.pha.core.c j;
        nge a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nge) ipChange.ipc$dispatch("b9283c6d", new Object[]{this, ngdVar});
        }
        Uri a3 = ngdVar.a();
        if (a3 != null && (b = p.b()) != null && (j = b.j()) != null && (a2 = j.a(a3.toString())) != null && a2.e() != null) {
            return a2;
        }
        return null;
    }
}
