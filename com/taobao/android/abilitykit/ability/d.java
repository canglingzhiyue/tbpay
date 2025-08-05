package com.taobao.android.abilitykit.ability;

import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
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
import tb.dlo;
import tb.kge;

/* loaded from: classes4.dex */
public class d extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long REFRESH_COMPONENT_KEY = 2387479490361711282L;

    static {
        kge.a(-1473257303);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (dlhVar == null) {
            return a("params is null", true);
        }
        if (dleVar == null) {
            return a("abilityRuntimeContext is null", true);
        }
        dlo b = dleVar.b();
        if (b == null) {
            return a("abilityRuntimeContext.getContainer() is null", true);
        }
        Object f = dlhVar.f("data");
        if (!(f instanceof JSONObject)) {
            return a("params.data is not JSONObject", true);
        }
        try {
            if (b.a(dleVar, (JSONObject) f)) {
                return new dla();
            }
            return a("iContainer.refresh result=false", true);
        } catch (Throwable th) {
            return a("iContainer.refresh error=" + th.getMessage(), true);
        }
    }

    private dkw a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkw) ipChange.ipc$dispatch("5f2b9c94", new Object[]{this, str, new Boolean(z)});
        }
        Log.e(getClass().getSimpleName(), str);
        return new dkw(new dkv(30000, str), z);
    }

    /* loaded from: classes4.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-668729728);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : new d();
        }
    }
}
