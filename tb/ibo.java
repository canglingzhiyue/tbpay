package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchCache;
import com.alibaba.android.ultron.vfw.weex2.e;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bxb;
import tb.cts;

/* loaded from: classes6.dex */
public class ibo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashSet<String> f28897a = new HashSet<>();
    private Map<String, List<Pair<String, Long>>> b = new HashMap();
    private UltronWeex2DataPrefetchCache c;

    static {
        kge.a(1203611375);
    }

    public ibo(UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache) {
        this.c = ultronWeex2DataPrefetchCache;
    }

    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
        } else if (mtopResponse == null) {
            UnifyLog.d("OrderWeex2PrefetchDataManager.setupAllowOrderIds", "orderListResponse is null");
        } else {
            byte[] bytedata = mtopResponse.getBytedata();
            if (bytedata == null) {
                UnifyLog.d("OrderWeex2PrefetchDataManager.setupAllowOrderIds", "responseByte is null");
                return;
            }
            try {
                JSONObject parseObject = JSONObject.parseObject(new String(bytedata));
                if (parseObject == null) {
                    UnifyLog.d("OrderWeex2PrefetchDataManager.setupAllowOrderIds", "responseJson is null");
                    return;
                }
                JSONObject jSONObject = parseObject.getJSONObject("data");
                if (jSONObject == null) {
                    UnifyLog.d("OrderWeex2PrefetchDataManager.setupAllowOrderIds", "responseData is null");
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("global");
                if (jSONObject2 == null) {
                    UnifyLog.d("OrderWeex2PrefetchDataManager.setupAllowOrderIds", "global is null");
                    return;
                }
                JSONObject jSONObject3 = jSONObject2.getJSONObject("batchQueryControl");
                if (jSONObject3 == null) {
                    UnifyLog.d("OrderWeex2PrefetchDataManager.setupAllowOrderIds", "batchQueryControl is null");
                    return;
                }
                JSONArray jSONArray = jSONObject3.getJSONArray("allowOrderIds");
                if (jSONArray == null) {
                    UnifyLog.d("OrderWeex2PrefetchDataManager.setupAllowOrderIds", "allowOrderIds is null");
                    return;
                }
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof String) {
                        this.f28897a.add((String) next);
                    }
                }
            } catch (Exception e) {
                UnifyLog.d("OrderWeex2PrefetchDataManager.setupAllowOrderIds", e.toString());
            }
        }
    }

    public void a(List<IDMComponent> list, OrderConfigs orderConfigs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51fc4589", new Object[]{this, list, orderConfigs});
        } else if (!ibl.t()) {
            jqg.b("OrderWeex2PrefetchDataManager.prefetch", "disableOrderWeex2Prefetch");
        } else if (list == null || list.isEmpty()) {
            jqg.b("OrderWeex2PrefetchDataManager.prefetch", "no components");
        } else {
            HashMap hashMap = new HashMap();
            long currentTimeMillis = System.currentTimeMillis();
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent == null || iDMComponent.getData() == null || iDMComponent.getData().getJSONObject("fields") == null) {
                    jqg.b("OrderWeex2PrefetchDataManager.prefetch", "component fields is null");
                } else {
                    JSONObject jSONObject = iDMComponent.getData().getJSONObject("fields").getJSONObject("basicInfo");
                    if (jSONObject == null) {
                        jqg.b("OrderWeex2PrefetchDataManager.prefetch", "component orderIdInfo is null");
                    } else {
                        String string = jSONObject.getString("orderId");
                        String string2 = jSONObject.getString("orderLineId");
                        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                            jqg.b("OrderWeex2PrefetchDataManager.prefetch", "component mainOrderId OR subOrderId is empty");
                        } else if (!a(string)) {
                            jqg.b("OrderWeex2PrefetchDataManager.prefetch", "component mainOrderId is not in allowOrderIds");
                        } else if (a(string, string2, currentTimeMillis)) {
                            jqg.b("OrderWeex2PrefetchDataManager.prefetch", "component has prefetched");
                        } else {
                            List<String> list2 = hashMap.get(string);
                            if (list2 == null) {
                                list2 = new ArrayList<>();
                            }
                            list2.add(string2);
                            hashMap.put(string, list2);
                            bxb.a(bxb.a.b(OrderBizCode.orderList, "odetailPreRequestUsage").b(true).a("订单4预请求发起").a(5.0E-4f));
                        }
                    }
                }
            }
            e a2 = ibn.a(hashMap, this.c, orderConfigs, currentTimeMillis);
            if (a2 == null) {
                jqg.b("OrderWeex2PrefetchDataManager.prefetch", "request is null");
                return;
            }
            a2.b();
            a(hashMap, currentTimeMillis);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!ibl.t()) {
            jqg.b("OrderWeex2PrefetchDataManager.clearPrefetchData", "disableOrderWeex2Prefetch");
        } else {
            UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache = this.c;
            if (ultronWeex2DataPrefetchCache == null) {
                return;
            }
            ultronWeex2DataPrefetchCache.a(str);
        }
    }

    private boolean a(String str, String str2, long j) {
        Pair<JSONObject, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dba98cc", new Object[]{this, str, str2, new Long(j)})).booleanValue();
        }
        List<Pair<String, Long>> list = this.b.get(str);
        if (list != null && !list.isEmpty()) {
            for (Pair<String, Long> pair : list) {
                if (TextUtils.equals(str2, (CharSequence) pair.first) && j - ((Long) pair.second).longValue() < ibl.o()) {
                    return true;
                }
            }
        }
        UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache = this.c;
        return (ultronWeex2DataPrefetchCache == null || (a2 = ultronWeex2DataPrefetchCache.a(cts.a.BIZ_ORDER_DETAIL, str)) == null || a2.first == null) ? false : true;
    }

    private void a(Map<String, List<String>> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee00a847", new Object[]{this, map, new Long(j)});
            return;
        }
        for (String str : map.keySet()) {
            List<Pair<String, Long>> list = this.b.get(str);
            if (list == null) {
                list = new ArrayList<>();
            }
            List<String> list2 = map.get(str);
            if (list2 != null && !list2.isEmpty()) {
                for (String str2 : list2) {
                    list.add(new Pair<>(str2, Long.valueOf(j)));
                }
            }
            this.b.put(str, list);
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return this.f28897a.contains(str);
        }
        return false;
    }
}
