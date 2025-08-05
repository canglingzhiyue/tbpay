package com.alibaba.android.ultron.event.ext;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.Map;
import tb.bkd;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.kge;

/* loaded from: classes2.dex */
public class o extends dlg<com.taobao.android.dinamicx.eventchain.l> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.alibaba.android.ultron.vfw.instance.d f2596a;
    public String b;

    static {
        kge.a(-1943054182);
    }

    public o(com.alibaba.android.ultron.vfw.instance.d dVar, String str) {
        this.f2596a = null;
        this.b = "";
        this.f2596a = dVar;
        this.b = str;
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, com.taobao.android.dinamicx.eventchain.l lVar, dll dllVar) {
        DXRuntimeContext h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        com.alibaba.android.ultron.vfw.instance.d dVar = this.f2596a;
        if (dVar == null) {
            return new dkw(new dkv(-1, "ultron instance is null"), true);
        }
        com.alibaba.android.ultron.event.base.f d = dVar.d();
        if (d == null) {
            return new dkw(new dkv(-1, "ultron eventHandler is null"), true);
        }
        View g = lVar.g();
        if (g.getTag(DXWidgetNode.TAG_WIDGET_NODE) instanceof DXWidgetNode) {
            h = ((DXWidgetNode) g.getTag(DXWidgetNode.TAG_WIDGET_NODE)).getDXRuntimeContext();
        } else {
            h = lVar.h();
        }
        if (h == null || !(h.a() instanceof Map)) {
            bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "DxUserContext not map");
            return null;
        }
        Map map = (Map) h.a();
        com.alibaba.android.ultron.event.base.e a2 = d.a();
        a2.a("bizParams", map.get("bizParams"));
        a2.a("triggerView", h.v());
        Object obj = map.get(com.alibaba.android.ultron.vfw.viewholder.d.TAG_DINAMICX_VIEW_COMPONENT);
        if (!(obj instanceof DMComponent)) {
            return null;
        }
        a2.a((IDMComponent) ((DMComponent) obj));
        a2.a(new DMEvent(this.b, dlhVar.c(), null));
        a2.a(this.b);
        a2.a("ext_key_ability_callback", dllVar);
        d.a(a2);
        return new dla();
    }

    /* loaded from: classes2.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public com.alibaba.android.ultron.vfw.instance.d f2597a;
        public String b;

        static {
            kge.a(-1322715791);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public a(com.alibaba.android.ultron.vfw.instance.d dVar, String str) {
            this.f2597a = null;
            this.b = "";
            this.f2597a = dVar;
            this.b = str;
        }

        public o a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("934d2acf", new Object[]{this, obj}) : new o(this.f2597a, this.b);
        }
    }
}
