package com.taobao.tao.flexbox.layoutmanager.container.dx;

import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.NavigationTabModule;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.taobao.R;
import tb.dkx;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.kge;

/* loaded from: classes8.dex */
public class j extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long SETTABBARHIDDEN = -3477103840163274253L;

    static {
        kge.a(-2109336924);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hidden", (Object) dlhVar.c("hidden"));
        jSONObject.put("animate", (Object) dlhVar.c("animate"));
        NavigationTabModule.setTabbarHidden(new g.c(((aa) ((ViewGroup) ((com.taobao.android.dinamicx.eventchain.l) dleVar).i().getParent()).getTag(R.id.layout_manager_tnode)).k(), jSONObject, null));
        return null;
    }

    /* loaded from: classes8.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1265498757);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public j a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("96abfe2f", new Object[]{this, obj}) : new j();
        }
    }
}
