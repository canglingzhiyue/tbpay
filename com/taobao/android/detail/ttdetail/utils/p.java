package com.taobao.android.detail.ttdetail.utils;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.alibaba.android.aura.service.event.AURAEventKey;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.monitor.track.spm.merge.MergeUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import tb.ezh;
import tb.ezi;
import tb.gbg;
import tb.kge;

/* loaded from: classes5.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(671602668);
    }

    public static ezi a(ezh ezhVar, JSONObject jSONObject, ezh.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ezi) ipChange.ipc$dispatch("9667ef89", new Object[]{ezhVar, jSONObject, cVar});
        }
        if (ezhVar == null || jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("template");
        if (jSONObject2 == null) {
            i.a("DXUtils", "invalid data. no template");
            return null;
        }
        ezi eziVar = new ezi(jSONObject2);
        ezhVar.a(eziVar, cVar);
        return eziVar;
    }

    public static ViewGroup a(ezh ezhVar, JSONObject jSONObject, ezi eziVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("7e3319ae", new Object[]{ezhVar, jSONObject, eziVar}) : a(ezhVar, jSONObject, eziVar, gbg.a(), gbg.b());
    }

    public static ViewGroup a(ezh ezhVar, JSONObject jSONObject, ezi eziVar, int i, int i2) {
        ViewGroup a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6d0ccb0e", new Object[]{ezhVar, jSONObject, eziVar, new Integer(i), new Integer(i2)});
        }
        ViewGroup a3 = ezhVar.a(eziVar, new ezh.b() { // from class: com.taobao.android.detail.ttdetail.utils.p.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ezh.b
            public void a(ViewGroup viewGroup) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
                }
            }

            @Override // tb.ezh.b
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                i.a("DXUtils", "dinamicXEngine.createView failed:" + str);
            }
        });
        if (a3 == null || (a2 = ezhVar.a(a3, i, i2, jSONObject, new ezh.d() { // from class: com.taobao.android.detail.ttdetail.utils.p.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ezh.d
            public void a(ViewGroup viewGroup) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
                }
            }

            @Override // tb.ezh.d
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                i.a("DXUtils", "dinamicXEngine.renderView failed:" + str);
            }
        })) == null) {
            return null;
        }
        a(jSONObject);
        return a2;
    }

    public static DXResult<DXRootView> a(ezh ezhVar, DXRootView dXRootView, JSONObject jSONObject, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("c87700b7", new Object[]{ezhVar, dXRootView, jSONObject, new Integer(i), new Integer(i2)});
        }
        if (dXRootView != null && jSONObject != null) {
            return ezhVar.a(dXRootView, jSONObject, i, i2);
        }
        return null;
    }

    public static void a(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        try {
            if (!jSONObject.getBooleanValue(MergeUtil.KEY_EXPOSED) && jSONObject.get("events") != null && (jSONArray = jSONObject.getJSONObject("events").getJSONArray(AURAEventKey.exposureItem)) != null && !jSONArray.isEmpty()) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i).getJSONObject("fields");
                    m.b(2201, jSONObject2.getString("arg1"), jSONObject2.getJSONObject("args"));
                }
                jSONObject.put(MergeUtil.KEY_EXPOSED, (Object) true);
            }
        } catch (Exception e) {
            i.a("DXUtils", "exposeItem failed:" + e.getMessage());
        }
    }

    public static int a(View view) {
        WindowInsets rootWindowInsets;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9501e35d", new Object[]{view})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 23 && (rootWindowInsets = view.getRootWindowInsets()) != null) {
            return rootWindowInsets.getSystemWindowInsetBottom();
        }
        return 0;
    }

    public static DXTemplateItem b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("63ac96f8", new Object[]{jSONObject});
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f11925a = jSONObject.getString("name");
        dXTemplateItem.b = jSONObject.getLongValue("version");
        dXTemplateItem.c = jSONObject.getString("url");
        return dXTemplateItem;
    }
}
