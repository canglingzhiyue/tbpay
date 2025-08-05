package com.taobao.android.icart.widget.touch;

import android.os.Build;
import android.view.View;
import com.alibaba.android.ultron.vfw.viewholder.h;
import com.alibaba.android.ultron.vfw.viewholder.j;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.widget.touch.DragFloatLayer;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.c;
import java.util.Map;
import tb.bbz;
import tb.bed;
import tb.bga;
import tb.bny;
import tb.kge;
import tb.kgt;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1643885823);
    }

    public static DragFloatLayer.c a(bbz bbzVar, IDMComponent iDMComponent) {
        DMComponent dMComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DragFloatLayer.c) ipChange.ipc$dispatch("9a924645", new Object[]{bbzVar, iDMComponent});
        }
        if (bbzVar.O() instanceof com.taobao.android.ultron.datamodel.imp.b) {
            com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) bbzVar.O();
            c t = bVar.t();
            JSONObject jSONObject = (JSONObject) iDMComponent.getData().clone();
            jSONObject.put("fields", iDMComponent.getFields().clone());
            jSONObject.put("status", (Object) "normal");
            dMComponent = t.a(bVar, jSONObject, iDMComponent.getKey());
        } else {
            dMComponent = null;
        }
        if (dMComponent == null) {
            return null;
        }
        bny p = bbzVar.x().p();
        j jVar = (j) p.a(j.class);
        if (jVar == null) {
            return null;
        }
        h a2 = jVar.a(p.p(), jVar.a(dMComponent));
        if (a2 == null) {
            UnifyLog.d("DragFloatViewCreator", "viewHolder is empty");
            bga.a.a("iCart", "DragFloatViewCreator", kgt.EVENT_DRAG, "viewHolder 为null");
            return null;
        } else if (!(a2.itemView instanceof DXRootView)) {
            UnifyLog.d("DragFloatViewCreator", "viewHolder is empty");
            bga.a.a("iCart", "DragFloatViewCreator", kgt.EVENT_DRAG, "viewHolder item = " + a2.itemView);
            return null;
        } else {
            dMComponent.writeFields("_dragFloat", "true");
            dMComponent.writeFields("cornerType", "both");
            jVar.a(a2, dMComponent);
            a(a2.itemView, "main", 20.0f);
            a(a2);
            View a3 = a(a2.itemView, "main");
            if (a3 == null) {
                a3 = a2.itemView;
            }
            return new DragFloatLayer.c(a2.itemView, a3);
        }
    }

    public static DragFloatLayer.c a(bbz bbzVar, JSONObject jSONObject) {
        DMComponent dMComponent;
        h a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DragFloatLayer.c) ipChange.ipc$dispatch("f7a86a29", new Object[]{bbzVar, jSONObject});
        }
        IDMComponent e = bbzVar.n().e("dragFolder");
        if (e == null) {
            return null;
        }
        if (bbzVar.O() instanceof com.taobao.android.ultron.datamodel.imp.b) {
            com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) bbzVar.O();
            c t = bVar.t();
            JSONObject jSONObject2 = (JSONObject) e.getData().clone();
            jSONObject2.put("fields", (Object) new JSONObject());
            jSONObject2.put("status", (Object) "normal");
            dMComponent = t.a(bVar, jSONObject2, e.getKey());
        } else {
            dMComponent = null;
        }
        if (dMComponent == null) {
            return null;
        }
        bny p = bbzVar.x().p();
        j jVar = (j) p.a(j.class);
        if (jVar == null || (a2 = jVar.a(p.p(), jVar.a(dMComponent))) == null) {
            return null;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            dMComponent.writeFields(entry.getKey(), entry.getValue());
        }
        dMComponent.writeFields("_dragFloat", "true");
        jVar.a(a2, dMComponent);
        a(a2.itemView, "folderMain", 17.0f);
        a(a2.itemView, "folderBk", 8.0f);
        View a3 = a(a2.itemView, "folderMain");
        if (a3 == null) {
            a3 = a2.itemView;
        }
        return new DragFloatLayer.c(a2.itemView, a3);
    }

    private static void a(h hVar) {
        DXWidgetNode flattenWidgetNode;
        DXWidgetNode queryWidgetNodeByUserId;
        View v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d3bcd", new Object[]{hVar});
        } else if (!(hVar.itemView instanceof DXRootView) || (flattenWidgetNode = ((DXRootView) hVar.itemView).getFlattenWidgetNode()) == null || (queryWidgetNodeByUserId = flattenWidgetNode.queryWidgetNodeByUserId(com.taobao.android.weex_framework.util.a.ATOM_EXT_button)) == null || queryWidgetNodeByUserId.getDXRuntimeContext() == null || (v = queryWidgetNodeByUserId.getDXRuntimeContext().v()) == null) {
        } else {
            v.setVisibility(8);
        }
    }

    private static View a(View view, String str) {
        DXWidgetNode queryWidgetNodeByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("52a699f6", new Object[]{view, str});
        }
        if (!(view instanceof DXRootView)) {
            bed.a("DragFloatViewCreator/findDXInnerViewException", "itemView is not DXRootView," + view);
            return null;
        }
        DXRootView dXRootView = (DXRootView) view;
        if (dXRootView.getFlattenWidgetNode() != null && (queryWidgetNodeByUserId = dXRootView.getFlattenWidgetNode().queryWidgetNodeByUserId(str)) != null && queryWidgetNodeByUserId.getDXRuntimeContext() != null) {
            return queryWidgetNodeByUserId.getDXRuntimeContext().v();
        }
        return null;
    }

    private static void a(View view, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158778c", new Object[]{view, str, new Float(f)});
        } else if (!(view instanceof DXRootView) || Build.VERSION.SDK_INT < 22) {
        } else {
            View a2 = a(view, str);
            if (a2 != null) {
                a2.setElevation(f);
            }
            View a3 = a(view, "sideBar");
            if (a3 == null) {
                return;
            }
            a3.setElevation(f);
        }
    }
}
