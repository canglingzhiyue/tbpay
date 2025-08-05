package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.map.model.OrderMapBubbleModel;
import com.taobao.android.ultron.datamodel.imp.b;
import com.taobao.android.weex_framework.util.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class qzt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-309438040);
    }

    public static List<OrderMapBubbleModel> a(b bVar) {
        JSONObject o;
        ConcurrentHashMap<String, JSONObject> j;
        String str;
        JSONObject jSONObject;
        String string;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ede47755", new Object[]{bVar});
        }
        if (bVar == null) {
            return null;
        }
        try {
            JSONArray jSONArray = bVar.n().getJSONObject("structure").getJSONArray(a.ATOM_EXT_bubbles);
            if (jSONArray == null || (o = bVar.o()) == null || (j = bVar.j()) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if ((next instanceof String) && (jSONObject = o.getJSONObject((str = (String) next))) != null && (string = jSONObject.getString("type")) != null && (jSONObject2 = j.get(string)) != null) {
                    OrderMapBubbleModel orderMapBubbleModel = new OrderMapBubbleModel(str, jSONObject2);
                    orderMapBubbleModel.a(jSONObject.getJSONObject("fields"));
                    orderMapBubbleModel.b(jSONObject.getJSONObject("events"));
                    arrayList.add(orderMapBubbleModel);
                }
            }
            return arrayList;
        } catch (Exception e) {
            bxb.a(OrderBizCode.logisticsDetail, "bundle#getOrderMapBubbleModels", e.getMessage());
            return null;
        }
    }

    public static View a(Context context, OrderMapBubbleModel orderMapBubbleModel, bd bdVar, rac racVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f7e87a25", new Object[]{context, orderMapBubbleModel, bdVar, racVar});
        }
        if (bdVar == null) {
            bxb.a(OrderBizCode.logisticsDetail, "showBubbleError", "dxEngineRouter is null");
            return null;
        }
        JSONObject f = orderMapBubbleModel.f();
        String string = f.getString("name");
        if (!"dinamicx".equals(f.getString("containerType"))) {
            bxb.a(OrderBizCode.logisticsDetail, "showBubbleError", "不是DX组件,name:" + string);
            return null;
        }
        long j = -1;
        try {
            j = Long.parseLong(f.getString("version"));
        } catch (Exception unused) {
        }
        long j2 = j;
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.b = j2;
        dXTemplateItem.c = f.getString("url");
        dXTemplateItem.f11925a = string;
        DXTemplateItem a2 = bdVar.a(dXTemplateItem);
        if (a2 == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(dXTemplateItem);
            bdVar.a(arrayList);
            bxb.a(OrderBizCode.logisticsDetail, "showBubbleError", "获取模板失败，开始下载,name:" + string + ",version:" + j2);
            return null;
        }
        DXResult<DXRootView> a3 = bdVar.a(context, (ViewGroup) null, a2);
        if (a3 == null || a3.b()) {
            bxb.a(OrderBizCode.logisticsDetail, "showBubbleError", "创建View出错,name:" + string + ",version:" + j2);
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject c = orderMapBubbleModel.c();
        if (c != null) {
            jSONObject.put("fields", (Object) c);
        }
        JSONObject d = orderMapBubbleModel.d();
        if (d != null) {
            jSONObject.put("events", (Object) d);
        }
        DXResult<DXRootView> a4 = bdVar.a(context, jSONObject, a3.f11780a, -1, racVar == null ? null : new DXRenderOptions.a().a(racVar.f33076a).a());
        if (a4 == null || a4.b()) {
            bxb.a(OrderBizCode.logisticsDetail, "showBubbleError", "渲染View出错,name:" + string + ",version:" + j2);
            return null;
        }
        return a4.f11780a;
    }
}
