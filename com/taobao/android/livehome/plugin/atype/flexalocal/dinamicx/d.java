package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.dkx;
import tb.dky;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends dlg<com.taobao.android.dinamicx.eventchain.l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLUPDATEVIEWPROPERTY = -8594539178745856614L;

    static {
        kge.a(-1390369054);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, com.taobao.android.dinamicx.eventchain.l lVar, dll dllVar) {
        DXWidgetNode queryWidgetNodeByUserId;
        View v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        JSONObject c = dlhVar == null ? null : dlhVar.c();
        if (c == null) {
            return new dky();
        }
        String string = c.getString("targetNodeId");
        String string2 = c.getString("property");
        String string3 = c.getString("value");
        if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.l.a((CharSequence) string) || com.taobao.android.livehome.plugin.atype.flexalocal.utils.l.a((CharSequence) string2) || com.taobao.android.livehome.plugin.atype.flexalocal.utils.l.a((CharSequence) string3)) {
            return new dky();
        }
        if (lVar != null) {
            DXRootView s = lVar.h().s();
            if (!com.taobao.android.livehome.plugin.atype.flexalocal.utils.l.a((CharSequence) string) && (queryWidgetNodeByUserId = s.getExpandWidgetNode().queryWidgetNodeByUserId(string)) != null && (v = queryWidgetNodeByUserId.getDXRuntimeContext().v()) != null) {
                char c2 = 65535;
                try {
                    int hashCode = string2.hashCode();
                    if (hashCode != -859610604) {
                        if (hashCode == 92909918 && string2.equals("alpha")) {
                            c2 = 0;
                        }
                    } else if (string2.equals("imageUrl")) {
                        c2 = 1;
                    }
                    v.setAlpha(Float.parseFloat(string3));
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    /* loaded from: classes6.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-567575623);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public d a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("afe00c56", new Object[]{this, obj}) : new d();
        }
    }
}
