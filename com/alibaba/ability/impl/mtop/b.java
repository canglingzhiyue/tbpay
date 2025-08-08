package com.alibaba.ability.impl.mtop;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.message_open_api.ICallService;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;
import tb.kge;

/* loaded from: classes2.dex */
public final class b implements MtopPrefetch.IPrefetchComparator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(356801532);
        kge.a(1670993055);
        Companion = new a(null);
    }

    @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchComparator
    public MtopPrefetch.CompareResult compare(MtopBuilder biz, MtopBuilder prefetch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopPrefetch.CompareResult) ipChange.ipc$dispatch("cca63c2e", new Object[]{this, biz, prefetch});
        }
        q.d(biz, "biz");
        q.d(prefetch, "prefetch");
        MtopRequest mtopRequest = biz.getMtopContext().b;
        q.b(mtopRequest, "biz.mtopContext.mtopRequest");
        MtopRequest mtopRequest2 = prefetch.getMtopContext().b;
        q.b(mtopRequest2, "prefetch.mtopContext.mtopRequest");
        List<String> list = prefetch.getMtopPrefetch().whiteListParams;
        q.b(list, "prefetch.mtopPrefetch.whiteListParams");
        return a(mtopRequest, mtopRequest2, list);
    }

    private final MtopPrefetch.CompareResult a(MtopRequest mtopRequest, MtopRequest mtopRequest2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopPrefetch.CompareResult) ipChange.ipc$dispatch("d373501", new Object[]{this, mtopRequest, mtopRequest2, list});
        }
        MtopPrefetch.CompareResult compareResult = new MtopPrefetch.CompareResult();
        if (StringUtils.isEmpty(mtopRequest.getKey()) || (!q.a((Object) mtopRequest.getKey(), (Object) mtopRequest2.getKey()))) {
            HashMap<String, String> data = compareResult.getData();
            q.b(data, "result.data");
            data.put("missKey", "apiKey");
            HashMap<String, String> data2 = compareResult.getData();
            q.b(data2, "result.data");
            data2.put("missMsg", "missApi");
            HashMap<String, String> data3 = compareResult.getData();
            q.b(data3, "result.data");
            data3.put("prefetchValue", mtopRequest2.getKey());
            HashMap<String, String> data4 = compareResult.getData();
            q.b(data4, "result.data");
            data4.put("realValue", mtopRequest.getKey());
        } else if (mtopRequest.isNeedEcode() != mtopRequest2.isNeedEcode()) {
            HashMap<String, String> data5 = compareResult.getData();
            q.b(data5, "result.data");
            data5.put("missKey", ICallService.KEY_NEED_ECODE);
            HashMap<String, String> data6 = compareResult.getData();
            q.b(data6, "result.data");
            data6.put("missMsg", "missEcode");
            HashMap<String, String> data7 = compareResult.getData();
            q.b(data7, "result.data");
            data7.put("prefetchValue", String.valueOf(mtopRequest2.isNeedEcode()));
            HashMap<String, String> data8 = compareResult.getData();
            q.b(data8, "result.data");
            data8.put("realValue", String.valueOf(mtopRequest.isNeedEcode()));
        } else {
            String data9 = mtopRequest2.getData();
            q.b(data9, "last.data");
            String data10 = mtopRequest.getData();
            q.b(data10, "current.data");
            if (a("baseKey", data9, data10, list, compareResult)) {
                compareResult.setSame(true);
            }
        }
        return compareResult;
    }

    private final boolean a(String str, String str2, String str3, List<String> list, MtopPrefetch.CompareResult compareResult) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b20e93f", new Object[]{this, str, str2, str3, list, compareResult})).booleanValue();
        }
        String str5 = str2;
        String str6 = str3;
        if (StringUtils.equals(str5, str6)) {
            return true;
        }
        String str7 = "result.data";
        if (StringUtils.isEmpty(str5) || StringUtils.isEmpty(str6)) {
            HashMap<String, String> data = compareResult.getData();
            q.b(data, str7);
            data.put("missKey", str);
            HashMap<String, String> data2 = compareResult.getData();
            q.b(data2, str7);
            data2.put("missMsg", "emptyValue");
            HashMap<String, String> data3 = compareResult.getData();
            q.b(data3, str7);
            data3.put("prefetchValue", str2);
            HashMap<String, String> data4 = compareResult.getData();
            q.b(data4, str7);
            data4.put("realValue", str3);
            return false;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str2);
            JSONObject parseObject2 = JSON.parseObject(str3);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (String key : parseObject.keySet()) {
                if (!StringUtils.isEmpty(key) && (list == null || !list.contains(key))) {
                    q.b(key, "key");
                    hashMap.put(key, parseObject.get(key));
                }
            }
            for (String key2 : parseObject2.keySet()) {
                if (!StringUtils.isEmpty(key2) && (list == null || !list.contains(key2))) {
                    q.b(key2, "key");
                    hashMap2.put(key2, parseObject2.get(key2));
                }
            }
            if (hashMap.size() != hashMap2.size()) {
                HashMap<String, String> data5 = compareResult.getData();
                q.b(data5, str7);
                data5.put("missKey", str);
                HashMap<String, String> data6 = compareResult.getData();
                q.b(data6, str7);
                data6.put("missMsg", "diffSize");
                HashMap<String, String> data7 = compareResult.getData();
                q.b(data7, str7);
                data7.put("prefetchValue", JSON.toJSONString(hashMap));
                HashMap<String, String> data8 = compareResult.getData();
                q.b(data8, str7);
                data8.put("realValue", JSON.toJSONString(hashMap2));
                return false;
            }
            for (String str8 : hashMap.keySet()) {
                Object obj = hashMap.get(str8);
                Object obj2 = hashMap2.get(str8);
                if (obj != null && obj2 != null) {
                    if (!q.a(obj.getClass(), obj2.getClass())) {
                        HashMap<String, String> data9 = compareResult.getData();
                        q.b(data9, str7);
                        data9.put("missKey", str8);
                        HashMap<String, String> data10 = compareResult.getData();
                        q.b(data10, str7);
                        data10.put("missMsg", "diffType");
                        HashMap<String, String> data11 = compareResult.getData();
                        q.b(data11, str7);
                        data11.put("prefetchValue", obj.getClass().toString());
                        HashMap<String, String> data12 = compareResult.getData();
                        q.b(data12, str7);
                        data12.put("realValue", obj2.getClass().toString());
                        return false;
                    }
                }
                HashMap hashMap3 = hashMap2;
                HashMap hashMap4 = hashMap;
                str4 = str7;
                try {
                    if (!a(str8, String.valueOf(hashMap.get(str8)), String.valueOf(hashMap2.get(str8)), list, compareResult)) {
                        return false;
                    }
                    hashMap = hashMap4;
                    str7 = str4;
                    hashMap2 = hashMap3;
                } catch (Throwable unused) {
                    HashMap<String, String> data13 = compareResult.getData();
                    q.b(data13, str4);
                    data13.put("missKey", str);
                    HashMap<String, String> data14 = compareResult.getData();
                    q.b(data14, str4);
                    data14.put("missMsg", "parseError");
                    HashMap<String, String> data15 = compareResult.getData();
                    q.b(data15, str4);
                    data15.put("prefetchValue", str2);
                    HashMap<String, String> data16 = compareResult.getData();
                    q.b(data16, str4);
                    data16.put("realValue", str3);
                    return false;
                }
            }
            return true;
        } catch (Throwable unused2) {
            str4 = str7;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(-1434551228);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
