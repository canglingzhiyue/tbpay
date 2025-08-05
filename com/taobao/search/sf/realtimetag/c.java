package com.taobao.search.sf.realtimetag;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.android.xsearchplugin.muise.k;
import com.taobao.android.xsearchplugin.muise.m;
import com.taobao.android.xsearchplugin.muise.p;
import com.taobao.android.xsearchplugin.weex.weex.f;
import com.taobao.android.xsearchplugin.weex.weex.h;
import com.taobao.search.common.util.l;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.musie.r;
import com.taobao.search.sf.j;
import tb.iru;
import tb.itd;
import tb.jzd;
import tb.kge;
import tb.noa;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-22582913);
    }

    public static itd a(IRealTimeTagContainer iRealTimeTagContainer, Activity activity, DynamicCardBean dynamicCardBean, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("7a8273f", new Object[]{iRealTimeTagContainer, activity, dynamicCardBean, new Integer(i)}) : a(iRealTimeTagContainer, activity, dynamicCardBean, i, null);
    }

    public static itd a(IRealTimeTagContainer iRealTimeTagContainer, Activity activity, DynamicCardBean dynamicCardBean, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itd) ipChange.ipc$dispatch("4c097f63", new Object[]{iRealTimeTagContainer, activity, dynamicCardBean, new Integer(i), obj});
        }
        if (!(iRealTimeTagContainer instanceof itd)) {
            return null;
        }
        BaseCellBean baseCellBean = dynamicCardBean.mDynamicCellBean;
        if (baseCellBean instanceof WeexCellBean) {
            return b(iRealTimeTagContainer, activity, dynamicCardBean, i, obj);
        }
        if (!(baseCellBean instanceof MuiseCellBean)) {
            return null;
        }
        return c(iRealTimeTagContainer, activity, dynamicCardBean, i, obj);
    }

    private static itd b(IRealTimeTagContainer iRealTimeTagContainer, Activity activity, DynamicCardBean dynamicCardBean, int i, Object obj) {
        com.taobao.android.xsearchplugin.weex.weex.a cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itd) ipChange.ipc$dispatch("e94596c2", new Object[]{iRealTimeTagContainer, activity, dynamicCardBean, new Integer(i), obj});
        }
        itd itdVar = (itd) iRealTimeTagContainer;
        View view = itdVar.itemView;
        int round = Math.round(l.c(view.getMeasuredWidth()));
        int round2 = Math.round(l.c(view.getMeasuredHeight()));
        WeexCellBean weexCellBean = (WeexCellBean) dynamicCardBean.mDynamicCellBean;
        JSONObject jSONObject = weexCellBean.mWeexBean.model;
        jSONObject.put("containerWidth", (Object) String.valueOf(round));
        jSONObject.put("containerHeight", (Object) String.valueOf(round2));
        if (obj != null && !jSONObject.containsKey("outerBean")) {
            a(jSONObject, obj);
        }
        jzd jzdVar = null;
        if (itdVar instanceof a) {
            jzdVar = (jzd) ((a) itdVar).a(weexCellBean);
        }
        jzd cVar2 = jzdVar == null ? new com.taobao.search.sf.widgets.list.listcell.weex.c(activity, (com.taobao.search.sf.a) itdVar.j(), itdVar.getParent(), iRealTimeTagContainer.getContainerListStyle(), new FrameLayout(activity), 0) : jzdVar;
        if (dynamicCardBean.mTemplates != null) {
            cVar = new f(activity, j.f19452a, cVar2, cVar2, dynamicCardBean.mTemplates, (iru) cVar2.j());
        } else {
            cVar = new com.taobao.android.xsearchplugin.weex.weex.c(activity, j.f19452a, (iru) cVar2.j(), cVar2, cVar2);
        }
        cVar.a((h) cVar2);
        cVar2.a(cVar);
        cVar2.b(i, weexCellBean);
        return cVar2;
    }

    private static itd c(IRealTimeTagContainer iRealTimeTagContainer, Activity activity, DynamicCardBean dynamicCardBean, int i, Object obj) {
        com.taobao.android.xsearchplugin.muise.a mVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itd) ipChange.ipc$dispatch("8681ae21", new Object[]{iRealTimeTagContainer, activity, dynamicCardBean, new Integer(i), obj});
        }
        itd itdVar = (itd) iRealTimeTagContainer;
        View view = itdVar.itemView;
        int round = Math.round(l.c(view.getMeasuredWidth()));
        int round2 = Math.round(l.c(view.getMeasuredHeight()));
        MuiseCellBean muiseCellBean = (MuiseCellBean) dynamicCardBean.mDynamicCellBean;
        JSONObject jSONObject = muiseCellBean.mMuiseBean.model;
        jSONObject.put("containerWidth", (Object) String.valueOf(round));
        jSONObject.put("containerHeight", (Object) String.valueOf(round2));
        if (obj != null && !jSONObject.containsKey("outerBean")) {
            a(jSONObject, obj);
        }
        r rVar = null;
        if (itdVar instanceof a) {
            rVar = (r) ((a) itdVar).a(muiseCellBean);
        }
        r rVar2 = rVar == null ? new r(activity, (iru) itdVar.j(), itdVar.getParent(), iRealTimeTagContainer.getContainerListStyle(), new FrameLayout(activity), 0) : rVar;
        if (dynamicCardBean.mTemplates != null) {
            mVar = new p(activity, itdVar.getCore(), rVar2, rVar2, dynamicCardBean.mTemplates.get(muiseCellBean.type), (iru) itdVar.j());
        } else {
            mVar = new m(activity, itdVar.getCore(), (iru) rVar2.j(), rVar2, rVar2);
        }
        mVar.a((k) rVar2);
        rVar2.a(mVar);
        rVar2.C();
        rVar2.b(i, (int) muiseCellBean);
        return rVar2;
    }

    private static void a(JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa861964", new Object[]{jSONObject, obj});
        } else if (com.taobao.search.common.util.r.bu()) {
            if (!(obj instanceof JSONObject)) {
                return;
            }
            ((JSONObject) obj).remove(noa.VALUE_MODULE_DYNAMIC_CARD);
            jSONObject.put("outerBean", obj);
            jSONObject.put("outerBeanIsObject", "true");
        } else {
            jSONObject.put("outerBean", (Object) JSON.toJSONString(obj));
        }
    }
}
