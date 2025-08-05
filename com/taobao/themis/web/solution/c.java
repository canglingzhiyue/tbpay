package com.taobao.themis.web.solution;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.kge;
import tb.qpm;
import tb.qqb;
import tb.rnc;

/* loaded from: classes9.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c INSTANCE;

    static {
        kge.a(1740447683);
        INSTANCE = new c();
    }

    private c() {
    }

    public final ViewGroup a(f fVar) {
        qqb b;
        ITMSPage c;
        qpm f;
        rnc pageContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("60946d48", new Object[]{this, fVar});
        }
        if (fVar != null && (b = fVar.b()) != null && (c = b.c()) != null && (f = c.f()) != null && (pageContainer = f.getPageContainer()) != null) {
            if (!(pageContainer instanceof com.taobao.themis.container.app.page.c)) {
                pageContainer = null;
            }
            com.taobao.themis.container.app.page.c cVar = (com.taobao.themis.container.app.page.c) pageContainer;
            if (cVar != null) {
                return cVar.b();
            }
        }
        return null;
    }
}
