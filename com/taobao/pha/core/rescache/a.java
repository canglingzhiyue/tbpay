package com.taobao.pha.core.rescache;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.n;
import com.taobao.pha.core.p;
import java.io.InputStream;
import java.util.HashMap;
import tb.kge;
import tb.ngd;
import tb.nge;
import tb.ngm;

/* loaded from: classes7.dex */
public class a implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1670834804);
        kge.a(-96877230);
    }

    @Override // com.taobao.pha.core.rescache.c
    public nge a(ngd ngdVar) {
        n b;
        com.taobao.pha.core.g w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nge) ipChange.ipc$dispatch("b9283c6d", new Object[]{this, ngdVar});
        }
        ngm ngmVar = null;
        if (ngdVar.a() == null || (b = p.b()) == null || (w = b.w()) == null) {
            return null;
        }
        synchronized (this) {
            InputStream a2 = w.a(ngdVar.a());
            if (a2 != null) {
                ngmVar = new ngm("application/javascript", "UTF-8", a2);
                HashMap hashMap = new HashMap();
                hashMap.put(c.HEADER_ACAO, "*");
                ngmVar.a(hashMap);
            }
        }
        return ngmVar;
    }
}
