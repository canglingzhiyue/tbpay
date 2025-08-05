package tb;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.message_open_api.ICallService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;

/* loaded from: classes6.dex */
public class jlx extends jlv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_QUERY_WHITE_LIST_KEY = "queryWhitelist";
    public static final String DEFAULT_URL_KEY = "url";
    private boolean b = true;
    private String c;
    private String d;

    static {
        kge.a(-1642141029);
    }

    public static /* synthetic */ Object ipc$super(jlx jlxVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public jlx(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.c = "url";
        } else {
            this.c = str;
        }
        if (TextUtils.isEmpty(str2)) {
            this.d = DEFAULT_QUERY_WHITE_LIST_KEY;
        } else {
            this.d = str2;
        }
    }

    @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchComparator
    public MtopPrefetch.CompareResult compare(MtopBuilder mtopBuilder, MtopBuilder mtopBuilder2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopPrefetch.CompareResult) ipChange.ipc$dispatch("cca63c2e", new Object[]{this, mtopBuilder, mtopBuilder2});
        }
        a();
        MtopPrefetch.CompareResult a2 = a(mtopBuilder.getMtopContext().b, mtopBuilder2.getMtopContext().b, mtopBuilder2.getMtopPrefetch().whiteListParams);
        if (a2.isSame()) {
            this.f29619a = SystemClock.uptimeMillis();
        }
        return a2;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b = true;
        }
    }

    private MtopPrefetch.CompareResult a(MtopRequest mtopRequest, MtopRequest mtopRequest2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopPrefetch.CompareResult) ipChange.ipc$dispatch("d373501", new Object[]{this, mtopRequest, mtopRequest2, list});
        }
        MtopPrefetch.CompareResult compareResult = new MtopPrefetch.CompareResult();
        if (TextUtils.isEmpty(mtopRequest.getKey()) || !mtopRequest.getKey().equals(mtopRequest2.getKey())) {
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
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b20e93f", new Object[]{this, str, str2, str3, list, compareResult})).booleanValue();
        }
        if (TextUtils.equals(str2, str3)) {
            return true;
        }
        String str6 = "missMsg";
        String str7 = "missKey";
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            compareResult.getData().put(str7, str);
            compareResult.getData().put(str6, "emptyValue");
            compareResult.getData().put("prefetchValue", str2);
            compareResult.getData().put("realValue", str3);
            return false;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str2);
            JSONObject parseObject2 = JSON.parseObject(str3);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (String str8 : parseObject.keySet()) {
                if (!TextUtils.isEmpty(str8) && (list == null || !list.contains(str8))) {
                    hashMap.put(str8, parseObject.get(str8));
                }
            }
            for (String str9 : parseObject2.keySet()) {
                if (!TextUtils.isEmpty(str9) && (list == null || !list.contains(str9))) {
                    hashMap2.put(str9, parseObject2.get(str9));
                }
            }
            if (!a(hashMap, hashMap2, compareResult)) {
                return false;
            }
            if (hashMap.size() != hashMap2.size()) {
                compareResult.getData().put(str7, str);
                compareResult.getData().put(str6, "diffSize");
                compareResult.getData().put("prefetchValue", JSON.toJSONString(hashMap));
                compareResult.getData().put("realValue", JSON.toJSONString(hashMap2));
                return false;
            }
            for (String str10 : hashMap.keySet()) {
                Object obj = hashMap.get(str10);
                Object obj2 = hashMap2.get(str10);
                if (obj != null && obj2 != null && obj.getClass() != obj2.getClass()) {
                    compareResult.getData().put(str7, str10);
                    compareResult.getData().put(str6, "diffType");
                    compareResult.getData().put("prefetchValue", obj.getClass().toString());
                    compareResult.getData().put("realValue", obj2.getClass().toString());
                    return false;
                }
                HashMap hashMap3 = hashMap2;
                HashMap hashMap4 = hashMap;
                str4 = str7;
                str5 = str6;
                try {
                    if (!a(str10, hashMap.get(str10).toString(), hashMap2.get(str10).toString(), list, compareResult)) {
                        return false;
                    }
                    str6 = str5;
                    str7 = str4;
                    hashMap2 = hashMap3;
                    hashMap = hashMap4;
                } catch (Throwable unused) {
                    compareResult.getData().put(str4, str);
                    compareResult.getData().put(str5, "parseError");
                    compareResult.getData().put("prefetchValue", str2);
                    compareResult.getData().put("realValue", str3);
                    return false;
                }
            }
            return true;
        } catch (Throwable unused2) {
            str4 = str7;
            str5 = str6;
        }
    }

    private boolean a(Map<String, Object> map, Map<String, Object> map2, MtopPrefetch.CompareResult compareResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dba6ae10", new Object[]{this, map, map2, compareResult})).booleanValue();
        }
        if (this.b) {
            try {
                Object obj = map2.get(this.d);
                Object obj2 = map.get(this.c);
                Object obj3 = map2.get(this.c);
                if ((obj instanceof String) && (obj2 instanceof String) && (obj3 instanceof String)) {
                    this.b = false;
                    jkq.a("TS.MtopSoftComparator", "soft match start。prefetch = " + obj2 + ";real = " + obj3 + ";whitelist = " + obj);
                    map.remove(this.c);
                    map2.remove(this.c);
                    map2.remove(this.d);
                    String[] split = ((String) obj).split(",");
                    String str = (String) obj2;
                    String str2 = (String) obj3;
                    String a2 = jmi.a(str);
                    String a3 = jmi.a(str2);
                    if (a2 != null && a2.equals(a3)) {
                        Uri parse = Uri.parse(str);
                        Uri parse2 = Uri.parse(str2);
                        for (int i = 0; i < split.length; i++) {
                            String queryParameter = parse.getQueryParameter(split[i]);
                            String queryParameter2 = parse2.getQueryParameter(split[i]);
                            if (queryParameter != null && queryParameter.equals(queryParameter2)) {
                            }
                            compareResult.getData().put("missKey", this.c);
                            compareResult.getData().put("missMsg", "differentQuery");
                            compareResult.getData().put("prefetchValue", queryParameter);
                            compareResult.getData().put("realValue", queryParameter2);
                            compareResult.getData().put(DEFAULT_QUERY_WHITE_LIST_KEY, obj.toString());
                            return false;
                        }
                        jkq.a("TS.MtopSoftComparator", "soft match success");
                    } else {
                        compareResult.getData().put("missKey", this.c);
                        compareResult.getData().put("missMsg", "differentBaseUrl");
                        compareResult.getData().put("prefetchValue", str);
                        compareResult.getData().put("realValue", str2);
                        compareResult.getData().put(DEFAULT_QUERY_WHITE_LIST_KEY, obj.toString());
                        return false;
                    }
                }
            } catch (Exception e) {
                jkq.a("TS.MtopSoftComparator", "soft match error = " + e.getMessage());
                compareResult.getData().put("missKey", this.c);
                compareResult.getData().put("missMsg", "soft match exception");
                return false;
            }
        }
        return true;
    }
}
