package com.taobao.android.detail.core.aura.source;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.bbg;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INTENT_ACTION_99_CART_UPDATE = "com.taobao.detail.inside.intent.action.cartUpdate";
    public static final String INTENT_ACTION_CLOSE_99_TM_ACTIVITY = "com.taobao.detail.inside.intent.action.closePage";
    public static final String INTENT_EXTRA_DATA = "multiDataFromWV";
    public static final String WV_ACTION_REQUEST_99_CART_UPDATE = "99tmCartUpdate";
    public static final String WV_DATA_REQUEST_99_CART_UPDATE;

    static {
        kge.a(-2001012751);
        WV_DATA_REQUEST_99_CART_UPDATE = new JSONObject() { // from class: com.taobao.android.detail.core.aura.source.MultiDataSource$1
            {
                put("action", "requestUpdate99tmCart");
                put("bizName", "insideDetail");
                put("data", (Object) null);
            }
        }.toJSONString();
        emu.a("com.taobao.android.detail.core.aura.source.MultiDataSource");
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        try {
            return JSONObject.parseObject(str).getJSONObject("param");
        } catch (Throwable th) {
            i.a("MultiDataSource", "getMultiBottomBarData error ", th);
            return null;
        }
    }

    public static com.alibaba.android.umf.datamodel.service.rule.a a(AURAGlobalData aURAGlobalData, JSONObject jSONObject) {
        List list;
        JSONObject jSONObject2;
        AURARenderComponent aURARenderComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.umf.datamodel.service.rule.a) ipChange.ipc$dispatch("6a886f79", new Object[]{aURAGlobalData, jSONObject});
        }
        if (aURAGlobalData == null || jSONObject == null || jSONObject.isEmpty() || (list = (List) aURAGlobalData.get("render_view_item_models", List.class)) == null) {
            return null;
        }
        try {
            jSONObject2 = jSONObject.getJSONObject("fields").getJSONObject("lowPriceInfo");
        } catch (Throwable th) {
            th.printStackTrace();
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                aURARenderComponent = null;
                break;
            }
            Object next = it.next();
            if (next instanceof AURARenderComponent) {
                aURARenderComponent = (AURARenderComponent) next;
                if (StringUtils.equals(aURARenderComponent.key, jSONObject.getString("componentKey"))) {
                    break;
                }
            }
        }
        if (aURARenderComponent == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("lowPriceInfo", jSONObject2);
        hashMap.put("_detailInfo", new JSONObject() { // from class: com.taobao.android.detail.core.aura.source.MultiDataSource$2
            {
                put("pageToken", (Object) ("uniqueId" + SystemClock.currentThreadTimeMillis()));
            }
        });
        return bbg.a(RuleType.PROPS_WRITE_BACK, aURARenderComponent, hashMap);
    }
}
