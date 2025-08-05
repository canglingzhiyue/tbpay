package com.taobao.android.detail.industry.fullfeeds;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dkx;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long FULLFEEDSCLOSE = 2973211005389138078L;

    static {
        kge.a(387347721);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (dleVar.a() == null) {
            return null;
        }
        ((Activity) dleVar.a()).finish();
        return null;
    }

    /* loaded from: classes4.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(719336160);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public b a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f13b858e", new Object[]{this, obj}) : new b();
        }
    }
}
