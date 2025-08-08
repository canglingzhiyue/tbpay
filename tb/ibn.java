package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchCache;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.e;
import com.alibaba.android.ultron.vfw.weex2.f;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bax;
import tb.cts;

/* loaded from: classes6.dex */
public class ibn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-86242689);
    }

    public static String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (iro.b()) {
            return f.a().a(context, str, str2, UltronTradeHybridInstanceRenderMode.SURFACE, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        return f.a().a(context, str, str2, UltronTradeHybridInstanceRenderMode.TEXTURE, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static UltronWeex2DialogFragment a(String str, String str2, String str3, p pVar, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronWeex2DialogFragment) ipChange.ipc$dispatch("46d92c7a", new Object[]{str, str2, str3, pVar, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
        }
        UltronWeex2DialogFragment.a aVar = new UltronWeex2DialogFragment.a();
        aVar.a(str).b(str2).c(str3).a(pVar).a(z).b(false).a(i).b(i2).c(i3);
        return aVar.a();
    }

    public static e a(Map<String, List<String>> map, final UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache, final OrderConfigs orderConfigs, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("93824cc", new Object[]{map, ultronWeex2DataPrefetchCache, orderConfigs, new Long(j)});
        }
        if (map == null || map.isEmpty()) {
            UnifyLog.d("OrderWeex2HighPerformanceHelper.generateUltronWeex2DataPrefetchRequest", "no orderIds");
            return null;
        }
        e.a aVar = new e.a();
        aVar.a("mtop.taobao.order.batchquery.detail").b("1.0").c("get").a(false).d("UNIT_TRADE");
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        jSONArray.addAll(map.keySet());
        hashMap.put("bizOrderIds", jSONArray.toJSONString());
        hashMap.put("appName", "tborder");
        hashMap.put("appVersion", "3.0");
        hashMap.put("pageFrom", "boughtList");
        final bax.a a2 = bax.a();
        if (a2.f25741a == 3) {
            hashMap.put("deviceLevel", "high");
        } else if (a2.f25741a == 2) {
            hashMap.put("deviceLevel", "medium");
        } else if (a2.f25741a == 1) {
            hashMap.put("deviceLevel", "low");
        } else {
            hashMap.put("deviceLevel", "unknow");
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : map.keySet()) {
            List<String> list = map.get(str);
            if (list == null || list.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("orderLineId", (Object) str);
                jSONObject2.put("taoTm3", (Object) true);
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.add(jSONObject2);
                jSONObject.put(str, (Object) jSONArray2);
            } else {
                JSONArray jSONArray3 = new JSONArray();
                for (String str2 : list) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("orderLineId", (Object) str2);
                    jSONObject3.put("taoTm3", (Object) true);
                    jSONArray3.add(jSONObject3);
                }
                jSONObject.put(str, (Object) jSONArray3);
            }
        }
        hashMap.put("extParams", jSONObject.toJSONString());
        aVar.a(hashMap);
        aVar.a(new e.b() { // from class: tb.ibn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.weex2.e.b
            public void a(JSONObject jSONObject4) {
                OrderConfigs orderConfigs2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject4});
                } else if (UltronWeex2DataPrefetchCache.this == null) {
                    UnifyLog.d("OrderWeex2HighPerformanceHelper.generateUltronWeex2DataPrefetchRequest", "onSuccess,cache is null");
                } else {
                    JSONObject jSONObject5 = jSONObject4.getJSONObject("data");
                    if (jSONObject5 == null) {
                        UnifyLog.d("OrderWeex2HighPerformanceHelper.generateUltronWeex2DataPrefetchRequest", "onSuccess,responseData is null");
                        return;
                    }
                    JSONObject jSONObject6 = jSONObject5.getJSONObject("details");
                    if (jSONObject6 == null) {
                        UnifyLog.d("OrderWeex2HighPerformanceHelper.generateUltronWeex2DataPrefetchRequest", "onSuccess,prefetchData is null");
                        return;
                    }
                    for (String str3 : jSONObject6.keySet()) {
                        JSONObject jSONObject7 = jSONObject6.getJSONObject(str3);
                        if (jSONObject7 != null) {
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject7.put(UltronWeex2DataPrefetchCache.KEY_PREFETCH_TIME_MILLIS, (Object) Long.valueOf(j));
                            jSONObject7.put("expiredTime", (Object) Long.valueOf(ibl.p()));
                            jSONObject8.put(str3, (Object) jSONObject7);
                            UltronWeex2DataPrefetchCache.this.a(cts.a.BIZ_ORDER_DETAIL, jSONObject8);
                        }
                    }
                    if (!ibl.b() || a2.f25741a != 1 || (orderConfigs2 = orderConfigs) == null || orderConfigs2.m() == null) {
                        return;
                    }
                    orderConfigs.m().sendBackgroundMessageToWeex2(jSONObject6);
                }
            }

            @Override // com.alibaba.android.ultron.vfw.weex2.e.b
            public void a(String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str3, str4});
                    return;
                }
                UnifyLog.d("OrderWeex2HighPerformanceHelper.generateUltronWeex2DataPrefetchRequest", "onFailed,errorCode:" + str3 + ",errorMsg:" + str4);
            }
        });
        return aVar.a();
    }

    public static Pair<JSONObject, String> a(String str, String str2, UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("8cb8fa4b", new Object[]{str, str2, ultronWeex2DataPrefetchCache});
        }
        JSONObject jSONObject = null;
        if (!ibl.t()) {
            UnifyLog.d("OrderWeex2PrefetchDataManager.getPrefetchDataByOrderId", "disableOrderWeex2Prefetch");
            return null;
        } else if (StringUtils.isEmpty(str)) {
            UnifyLog.d("OrderWeex2HighPerformanceHelper.getPrefetchDataByOrderId", "mainOrderId isEmpty");
            return null;
        } else if (StringUtils.isEmpty(str2)) {
            UnifyLog.d("OrderWeex2HighPerformanceHelper.getPrefetchDataByOrderId", "subOrderId isEmpty");
            return null;
        } else if (ultronWeex2DataPrefetchCache == null) {
            UnifyLog.d("OrderWeex2HighPerformanceHelper.getPrefetchDataByOrderId", "cache is null");
            return null;
        } else {
            Pair<JSONObject, String> a2 = ultronWeex2DataPrefetchCache.a(cts.a.BIZ_ORDER_DETAIL, str);
            if (a2 == null) {
                UnifyLog.d("OrderWeex2HighPerformanceHelper.getPrefetchDataByOrderId", "mainData is null");
                return null;
            }
            if (a2.first != null) {
                jSONObject = ((JSONObject) a2.first).getJSONObject(str2);
            }
            return new Pair<>(jSONObject, a2.second);
        }
    }
}
