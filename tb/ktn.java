package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.data_highway.jni.DataHighwayNative;
import com.taobao.android.remoteso.config.RSoConfig;
import com.taobao.highway.config.a;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ktn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(872740481);
    }

    public static /* synthetic */ JSONObject a(long j, String str, String str2, String str3, long j2, String str4, int i, String str5, String str6, long j3, boolean z, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("f3a9dd40", new Object[]{new Long(j), str, str2, str3, new Long(j2), str4, new Integer(i), str5, str6, new Long(j3), new Boolean(z), map}) : b(j, str, str2, str3, j2, str4, i, str5, str6, j3, z, map);
    }

    public static /* synthetic */ void a(String str, boolean z, boolean z2, long j, long j2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af9afb13", new Object[]{str, new Boolean(z), new Boolean(z2), new Long(j), new Long(j2), map});
        } else {
            b(str, z, z2, j, j2, map);
        }
    }

    private static long a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue() : j + kto.a().b();
    }

    public static void a(final long j, final String str, final String str2, final String str3, final long j2, final String str4, final int i, final String str5, final String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6dbb203", new Object[]{new Long(j), str, str2, str3, new Long(j2), str4, new Integer(i), str5, str6});
            return;
        }
        try {
            ktk.c().execute(new Runnable() { // from class: tb.ktn.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    boolean a2 = ktk.a(str2);
                    String b = a2 ? ktk.b(str2) : str2;
                    HashMap hashMap = new HashMap();
                    String e = a.a().e();
                    MtopRequest mtopRequest = new MtopRequest();
                    if (StringUtils.isEmpty(e)) {
                        Log.e("HighwayMtopUtil", "HighwayMtopUtil empty domain:" + e);
                        return;
                    }
                    MtopBuilder build = Mtop.instance(ktk.d(), ktk.e()).build(mtopRequest, ktk.e());
                    build.mo1313setCustomDomain(e);
                    build.mo1305reqMethod(MethodEnum.POST);
                    mtopRequest.setApiName("mtop.taobao.search.highway.upload");
                    mtopRequest.setVersion("1.0");
                    mtopRequest.setNeedSession(true);
                    String str7 = b;
                    mtopRequest.setData(ktn.a(j, str, b, str3, j2, str4, i, str5, str6, currentTimeMillis, a2, hashMap).toString());
                    try {
                        MtopResponse syncRequest = build.syncRequest();
                        if (syncRequest == null) {
                            Log.e("HighwayMtopUtil", "HighwayMtopUtil mtopResponse empty");
                            return;
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j3 = currentTimeMillis2 - currentTimeMillis;
                        kto.a().a(syncRequest, j3, currentTimeMillis2);
                        ktn.a(str7, syncRequest.isApiSuccess(), a2, j3, i, hashMap);
                        String retCode = syncRequest.getRetCode();
                        String str8 = "HighwayMtopUtil requestCPP: result:" + retCode + ", featureName:" + str7;
                        DataHighwayNative.b(retCode, str7);
                    } catch (Exception e2) {
                        Log.e("HighwayMtopUtil", "HighwayMtopUtil mtopResponse error:" + e2.getMessage());
                    }
                }
            });
        } catch (Throwable unused) {
            Log.e("HighwayMtopUtil", "task is full!");
        }
    }

    private static JSONObject b(long j, String str, String str2, String str3, long j2, String str4, int i, String str5, String str6, long j3, boolean z, Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c9c91a41", new Object[]{new Long(j), str, str2, str3, new Long(j2), str4, new Integer(i), str5, str6, new Long(j3), new Boolean(z), map});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (z) {
                jSONObject.put("isClientPreview", true);
            } else if (ktk.b()) {
                jSONObject.put("enablePreview", true);
            }
            jSONObject.put("version", z ? 2L : j);
            if (!StringUtils.isEmpty(str)) {
                jSONObject.put("featureVersion", str);
            }
            jSONObject.put("eventName", str2);
            jSONObject.put(com.taobao.android.behavix.feature.a.FEATURE_NAME, str2);
            if (!StringUtils.isEmpty(str3)) {
                jSONObject.put("reason", str3);
            }
            jSONObject.put("eventId", j2);
            if (a.a().f()) {
                jSONObject.put("events", str4);
                jSONObject.put(RSoConfig.TYPE_COMPRESSED, false);
            } else {
                String a2 = a(str4, str2, map);
                if (StringUtils.isNotBlank(a2) && StringUtils.isNotBlank(str4) && a2.getBytes().length < str4.getBytes().length) {
                    jSONObject.put("events", a2);
                    jSONObject.put(RSoConfig.TYPE_COMPRESSED, true);
                } else {
                    jSONObject.put("events", str4);
                    jSONObject.put(RSoConfig.TYPE_COMPRESSED, false);
                }
            }
            jSONObject.put("count", i);
            jSONObject.put("solutionId", str5);
            jSONObject.put("triggerId", str6);
            Log.e("HighwayMtopUtil", "HighwayMtopUtil Start highway");
        } catch (Exception unused) {
            Log.e("HighwayMtopUtil", "requestMtop: add data params error!");
        }
        try {
            jSONObject.put("timestamp", a(j3));
        } catch (JSONException unused2) {
            Log.e("HighwayMtopUtil", "requestMtop: add server time param error!");
        }
        return jSONObject;
    }

    private static String a(String str, String str2, Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d869137", new Object[]{str, str2, map});
        }
        long nanoTime = System.nanoTime();
        String str3 = null;
        try {
            str3 = gsi.a(gsi.b(str));
            map.put(ktm.MEASURE_COMPRESS_TIME, Long.valueOf((System.nanoTime() - nanoTime) / 1000));
            return str3;
        } catch (Exception e) {
            Log.e("HighwayMtopUtil", "requestMtop: compress events error! " + str2 + ", " + e.getMessage());
            return str3;
        }
    }

    private static void b(String str, boolean z, boolean z2, long j, long j2, Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7003032", new Object[]{str, new Boolean(z), new Boolean(z2), new Long(j), new Long(j2), map});
            return;
        }
        map.put(ktm.MEASURE_BATCH_COUNT, Long.valueOf(j2));
        map.put("totalTime", Long.valueOf(j));
        if (z2) {
            return;
        }
        ktm.a(str, z, map);
    }
}
