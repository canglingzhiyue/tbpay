package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class bki {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_CODE_CANCEL_ORDER = "cancelOrder";
    public static final String EVENT_CODE_CANCEL_ORDER_DOWNGRADE = "cancelOrderDowngrade";

    static {
        kge.a(-1549647626);
    }

    public static b a(b bVar, com.alibaba.android.ultron.vfw.instance.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7bbcadc5", new Object[]{bVar, bVar2});
        }
        if (bVar2.b() != null && bVar2.b().c() != null && (bVar2.b().c().get("events") instanceof JSONObject)) {
            JSONObject jSONObject = bVar2.b().c().getJSONObject("events");
            if (bVar.getType() != null && jSONObject != null && bVar.getType().startsWith("@") && (jSONObject.get(bVar.getType().substring(1)) instanceof JSONObject) && (jSONObject.getJSONObject(bVar.getType().substring(1)).get("type") instanceof String) && (jSONObject.getJSONObject(bVar.getType().substring(1)).get("fields") instanceof JSONObject)) {
                JSONObject jSONObject2 = new JSONObject();
                bkg.a(jSONObject2, jSONObject.getJSONObject(bVar.getType().substring(1)).getJSONObject("fields"));
                bkg.a(jSONObject2, bVar.getFields());
                return new DMEvent(jSONObject.getJSONObject(bVar.getType().substring(1)).getString("type"), jSONObject2, bVar.getComponents());
            }
        }
        return bVar;
    }

    public static void a(d dVar, String str, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9006529d", new Object[]{dVar, str, iDMComponent});
        } else if (dVar != null && iDMComponent != null) {
            bkd.a("PageEventUtils", "onReceiveEvent", "component", iDMComponent.getType(), iDMComponent.getTag(), "status:", String.valueOf(iDMComponent.getStatus()));
            List<b> list = iDMComponent.getEventMap() != null ? iDMComponent.getEventMap().get(str) : null;
            if (list == null || list.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (b bVar : list) {
                arrayList.add(a(bVar, dVar));
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    public static JSONArray a(DXRootView dXRootView, String str) {
        JSONObject tborderJson;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("4a02706b", new Object[]{dXRootView, str});
        }
        if (str != null && dXRootView != null && dXRootView.getExpandWidgetNode() != null && (tborderJson = dXRootView.getExpandWidgetNode().getTborderJson()) != null && tborderJson.getJSONArray(str) != null) {
            return bkg.a(tborderJson.getJSONArray(str));
        }
        return null;
    }

    public static String a(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b2d988aa", new Object[]{iDMComponent, str}) : (iDMComponent == null || iDMComponent.getFields() == null || iDMComponent.getFields().getJSONObject(EVENT_CODE_CANCEL_ORDER_DOWNGRADE) == null || !StringUtils.equals(iDMComponent.getFields().getJSONObject(EVENT_CODE_CANCEL_ORDER_DOWNGRADE).getString(com.taobao.tao.log.statistics.d.PARAM_OP_CODE), str)) ? str : "true".equals(iDMComponent.getFields().getJSONObject(EVENT_CODE_CANCEL_ORDER_DOWNGRADE).get("downgradeOn")) ? EVENT_CODE_CANCEL_ORDER_DOWNGRADE : EVENT_CODE_CANCEL_ORDER;
    }

    public static List<String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[0]) : Arrays.asList(spk.a(iro.ORANGE_KEY_MY_TAOBAO, "eventReportBlackList", "exposure,exposureItem").split(","));
    }
}
