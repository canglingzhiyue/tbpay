package com.taobao.live.home.dinamic.ability;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.view.DXNativeViewPagerView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.dkx;
import tb.dky;
import tb.dla;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.tio;

/* loaded from: classes7.dex */
public class j extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLVIEWPAGERABILITY = 7889033866540594253L;

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        DXRootView s;
        DXWidgetNode queryWidgetNodeByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        JSONObject c = dlhVar == null ? null : dlhVar.c();
        if (c == null) {
            return new dky();
        }
        String string = c.getString("action");
        String string2 = c.getString("targetNodeId");
        String string3 = c.getString("value");
        if (tio.a(string) || tio.a(string3) || tio.a(string2)) {
            return new dky();
        }
        if ("scrollEnabled".equals(string)) {
            if (lVar != null && (s = lVar.h().s()) != null && s.getExpandWidgetNode() != null && !tio.a(string2) && (queryWidgetNodeByUserId = s.getExpandWidgetNode().queryWidgetNodeByUserId(string2)) != null) {
                View v = queryWidgetNodeByUserId.getDXRuntimeContext().v();
                if (v instanceof DXNativeViewPagerView) {
                    DXNativeViewPagerView dXNativeViewPagerView = (DXNativeViewPagerView) v;
                    dXNativeViewPagerView.setEnableScroll_Android(Boolean.parseBoolean(string3));
                    dXNativeViewPagerView.setScrollable(Boolean.parseBoolean(string3));
                }
            }
            return new dla();
        }
        "header".equals(string);
        return new dky();
    }

    /* loaded from: classes7.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public j a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("a22bff1c", new Object[]{this, obj}) : new j();
        }
    }
}
