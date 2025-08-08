package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.message_open_api.ICallService;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;

/* loaded from: classes6.dex */
public class jlw extends jlv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-685966255);
    }

    public static /* synthetic */ Object ipc$super(jlw jlwVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchComparator
    public MtopPrefetch.CompareResult compare(MtopBuilder mtopBuilder, MtopBuilder mtopBuilder2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopPrefetch.CompareResult) ipChange.ipc$dispatch("cca63c2e", new Object[]{this, mtopBuilder, mtopBuilder2});
        }
        MtopPrefetch.CompareResult a2 = a(mtopBuilder.getMtopContext().b, mtopBuilder2.getMtopContext().b, mtopBuilder2.getMtopPrefetch().whiteListParams);
        if (a2 != null && a2.isSame()) {
            this.f29619a = SystemClock.uptimeMillis();
        }
        return a2;
    }

    private MtopPrefetch.CompareResult a(MtopRequest mtopRequest, MtopRequest mtopRequest2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopPrefetch.CompareResult) ipChange.ipc$dispatch("d373501", new Object[]{this, mtopRequest, mtopRequest2, list});
        }
        MtopPrefetch.CompareResult compareResult = new MtopPrefetch.CompareResult();
        if (StringUtils.isEmpty(mtopRequest.getKey()) || !mtopRequest.getKey().equals(mtopRequest2.getKey())) {
            compareResult.getData().put("missKey", "apiKey");
            compareResult.getData().put("missMsg", "missApi");
            compareResult.getData().put("prefetchValue", mtopRequest2.getKey());
            compareResult.getData().put("realValue", mtopRequest.getKey());
        } else if (mtopRequest.isNeedEcode() != mtopRequest2.isNeedEcode()) {
            compareResult.getData().put("missKey", ICallService.KEY_NEED_ECODE);
            compareResult.getData().put("missMsg", "missEcode");
            compareResult.getData().put("prefetchValue", String.valueOf(mtopRequest2.isNeedEcode()));
            compareResult.getData().put("realValue", String.valueOf(mtopRequest.isNeedEcode()));
        } else if (mtopRequest.isNeedSession() != mtopRequest2.isNeedSession()) {
            compareResult.getData().put("missKey", "needSession");
            compareResult.getData().put("missMsg", "missSession");
            compareResult.getData().put("prefetchValue", String.valueOf(mtopRequest2.isNeedSession()));
            compareResult.getData().put("realValue", String.valueOf(mtopRequest.isNeedSession()));
        } else if (a("baseKey", mtopRequest2.getData(), mtopRequest.getData(), list, compareResult)) {
            compareResult.setSame(true);
        }
        return compareResult;
    }

    private boolean a(String str, String str2, String str3, List<String> list, MtopPrefetch.CompareResult compareResult) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b20e93f", new Object[]{this, str, str2, str3, list, compareResult})).booleanValue();
        }
        if (StringUtils.equals(str2, str3)) {
            return true;
        }
        String str5 = "missKey";
        if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            compareResult.getData().put(str5, str);
            compareResult.getData().put("missMsg", "emptyValue");
            compareResult.getData().put("prefetchValue", str2);
            compareResult.getData().put("realValue", str3);
            return false;
        } else if (jmh.a("enableCompareJsonCheck", true) && (!a(str2) || !a(str3))) {
            compareResult.getData().put(str5, str);
            compareResult.getData().put("missMsg", "diffValue");
            compareResult.getData().put("prefetchValue", str2);
            compareResult.getData().put("realValue", str3);
            return false;
        } else {
            try {
                JSONObject parseObject = JSON.parseObject(str2);
                JSONObject parseObject2 = JSON.parseObject(str3);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                for (String str6 : parseObject.keySet()) {
                    if (!StringUtils.isEmpty(str6) && (list == null || !list.contains(str6))) {
                        hashMap.put(str6, parseObject.get(str6));
                    }
                }
                for (String str7 : parseObject2.keySet()) {
                    if (!StringUtils.isEmpty(str7) && (list == null || !list.contains(str7))) {
                        hashMap2.put(str7, parseObject2.get(str7));
                    }
                }
                if (hashMap.size() != hashMap2.size()) {
                    compareResult.getData().put(str5, str);
                    compareResult.getData().put("missMsg", "diffSize");
                    compareResult.getData().put("prefetchValue", JSON.toJSONString(hashMap));
                    compareResult.getData().put("realValue", JSON.toJSONString(hashMap2));
                    return false;
                }
                for (String str8 : hashMap.keySet()) {
                    Object obj = hashMap.get(str8);
                    Object obj2 = hashMap2.get(str8);
                    if (obj != null && obj2 != null && obj.getClass() != obj2.getClass()) {
                        compareResult.getData().put(str5, str8);
                        compareResult.getData().put("missMsg", "diffType");
                        compareResult.getData().put("prefetchValue", obj.getClass().toString());
                        compareResult.getData().put("realValue", obj2.getClass().toString());
                        return false;
                    }
                    HashMap hashMap3 = hashMap2;
                    HashMap hashMap4 = hashMap;
                    str4 = str5;
                    try {
                        if (!a(str8, hashMap.get(str8).toString(), hashMap2.get(str8).toString(), list, compareResult)) {
                            return false;
                        }
                        hashMap = hashMap4;
                        str5 = str4;
                        hashMap2 = hashMap3;
                    } catch (Throwable th) {
                        th = th;
                        compareResult.getData().put(str4, str);
                        compareResult.getData().put("missMsg", "parseError");
                        compareResult.getData().put("prefetchValue", str2);
                        compareResult.getData().put("realValue", str3);
                        th.printStackTrace();
                        return false;
                    }
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
                str4 = str5;
            }
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        String trim = str.trim();
        if (trim.startsWith(riy.BLOCK_START_STR) && trim.endsWith(riy.BLOCK_END_STR)) {
            return true;
        }
        return trim.startsWith(riy.ARRAY_START_STR) && trim.endsWith(riy.ARRAY_END_STR);
    }
}
