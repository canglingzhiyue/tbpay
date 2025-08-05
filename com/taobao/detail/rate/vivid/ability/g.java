package com.taobao.detail.rate.vivid.ability;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;

/* loaded from: classes7.dex */
public class g extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long CUSTOMAPM = -7380526567711240510L;

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        try {
            dleVar.a();
            return new dla();
        } catch (Exception e) {
            android.taobao.util.k.a("CustomApmAbility", Log.getStackTraceString(e));
            return new dkw(new dkv(-2000, "CustomApmAbility : error info = " + e.getMessage()));
        }
    }

    /* loaded from: classes7.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public g a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("22fd2034", new Object[]{this, obj}) : new g();
        }
    }
}
