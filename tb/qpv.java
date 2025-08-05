package tb;

import com.alibaba.android.umbrella.link.export.UMLLCons;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.tbmainfragment.i;
import com.taobao.themis.inside.adapter.TLogAdapterImpl;
import com.taobao.themis.kernel.adapter.IMonitorAdapter;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.utils.k;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes9.dex */
public final class qpv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final qpv INSTANCE;

    static {
        kge.a(-1002562656);
        INSTANCE = new qpv();
    }

    private qpv() {
    }

    @JvmStatic
    public static final JSONObject a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("674e414d", new Object[]{instance});
        }
        q.d(instance, "instance");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "tmsAppId", instance.h());
        jSONObject2.put((JSONObject) "uniappId", instance.e());
        jSONObject2.put((JSONObject) "tmsAppVersion", k.d(instance));
        jSONObject2.put((JSONObject) "templateId", k.g(instance));
        jSONObject2.put((JSONObject) "url", instance.g());
        jSONObject2.put((JSONObject) "solutionType", instance.j().name());
        jSONObject2.put((JSONObject) "frameTempType", k.a(instance));
        jSONObject2.put((JSONObject) "bizType", k.b(instance));
        jSONObject2.put((JSONObject) i.SUB_KEY_FRAGMENT_JUMP, k.c(instance));
        jSONObject2.put((JSONObject) "openMode", k.e(instance));
        return jSONObject;
    }

    @JvmStatic
    public static final void a(f fVar, String apiName, boolean z, long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46bb7cfb", new Object[]{fVar, apiName, new Boolean(z), new Long(j), str, str2});
            return;
        }
        q.d(apiName, "apiName");
        if (fVar == null) {
            return;
        }
        JSONObject a2 = a(fVar);
        JSONObject jSONObject = a2;
        jSONObject.put((JSONObject) "apiName", apiName);
        jSONObject.put((JSONObject) "status", (String) Boolean.valueOf(z));
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        jSONObject.put((JSONObject) "errorCode", str);
        if (str2 != null) {
            str3 = str2;
        }
        jSONObject.put((JSONObject) "errorMsg", str3);
        jSONObject.put((JSONObject) "timeCost", (String) Long.valueOf(j));
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "API", a2, new JSONObject());
    }

    @JvmStatic
    public static final void a(f fVar, String apiName, boolean z, double d, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b5b175", new Object[]{fVar, apiName, new Boolean(z), new Double(d), str, str2});
            return;
        }
        q.d(apiName, "apiName");
        if (fVar == null) {
            return;
        }
        JSONObject a2 = a(fVar);
        JSONObject jSONObject = a2;
        jSONObject.put((JSONObject) "apiName", apiName);
        jSONObject.put((JSONObject) "status", (String) Boolean.valueOf(z));
        jSONObject.put((JSONObject) "timeCost", (String) Double.valueOf(d));
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        jSONObject.put((JSONObject) "errorCode", str);
        if (str2 != null) {
            str3 = str2;
        }
        jSONObject.put((JSONObject) "errorMsg", str3);
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, UMLLCons.FEATURE_TYPE_MTOP, a2, new JSONObject());
    }

    @JvmStatic
    public static final void a(f fVar, String apiName, String type, boolean z, double d, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0c463ff", new Object[]{fVar, apiName, type, new Boolean(z), new Double(d), str, str2});
            return;
        }
        q.d(apiName, "apiName");
        q.d(type, "type");
        if (fVar == null) {
            return;
        }
        JSONObject a2 = a(fVar);
        JSONObject jSONObject = a2;
        jSONObject.put((JSONObject) "apiName", apiName);
        jSONObject.put((JSONObject) "type", type);
        jSONObject.put((JSONObject) "status", (String) Boolean.valueOf(z));
        jSONObject.put((JSONObject) "timeCost", (String) Double.valueOf(d));
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        jSONObject.put((JSONObject) "errorCode", str);
        if (str2 != null) {
            str3 = str2;
        }
        jSONObject.put((JSONObject) "errorMsg", str3);
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "Cloud", a2, new JSONObject());
    }

    @JvmStatic
    public static final void a(f fVar, String errorMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67562b7", new Object[]{fVar, errorMsg});
            return;
        }
        q.d(errorMsg, "errorMsg");
        if (fVar == null) {
            return;
        }
        JSONObject a2 = a(fVar);
        a2.put((JSONObject) "errorMsg", errorMsg);
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "JSError", a2, new JSONObject());
    }

    @JvmStatic
    public static final void a(f fVar, String monitorPoint, String errorMsg, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f25caa4f", new Object[]{fVar, monitorPoint, errorMsg, jSONObject});
            return;
        }
        q.d(monitorPoint, "monitorPoint");
        q.d(errorMsg, "errorMsg");
        if (fVar == null) {
            return;
        }
        JSONObject a2 = a(fVar);
        a2.put((JSONObject) "errorMsg", errorMsg);
        if (jSONObject != null) {
            a2.putAll(jSONObject);
        }
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, monitorPoint, a2, new JSONObject());
    }

    public static /* synthetic */ void a(String str, String str2, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f24eab", new Object[]{str, str2, jSONObject, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            jSONObject = null;
        }
        a(str, str2, jSONObject);
    }

    @JvmStatic
    public static final void a(String monitorPoint, String errorMsg, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{monitorPoint, errorMsg, jSONObject});
            return;
        }
        q.d(monitorPoint, "monitorPoint");
        q.d(errorMsg, "errorMsg");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "errorMsg", errorMsg);
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, monitorPoint, jSONObject2, new JSONObject());
    }

    @JvmStatic
    public static final void a(String appId, String appDeveloperVersion, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6582983c", new Object[]{appId, appDeveloperVersion, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        q.d(appId, "appId");
        q.d(appDeveloperVersion, "appDeveloperVersion");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "tmsAppId", appId);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "heap_size", (String) Integer.valueOf(i));
        jSONObject3.put((JSONObject) "max_heap_size", (String) Integer.valueOf(i2));
        jSONObject3.put((JSONObject) "memory_occupy", (String) Integer.valueOf(i3));
        jSONObject3.put((JSONObject) "max_memory_occupy", (String) Integer.valueOf(i4));
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_js_memory_monitor", jSONObject, jSONObject2);
    }

    @JvmStatic
    public static final void a(String appId, String appDeveloperVersion, int i, int i2, int i3, String stack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bacfdb1", new Object[]{appId, appDeveloperVersion, new Integer(i), new Integer(i2), new Integer(i3), stack});
            return;
        }
        q.d(appId, "appId");
        q.d(appDeveloperVersion, "appDeveloperVersion");
        q.d(stack, "stack");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "tmsAppId", appId);
        jSONObject2.put((JSONObject) a.ATOM_stack, stack);
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "current_size", (String) Integer.valueOf(i));
        jSONObject4.put((JSONObject) "target_size", (String) Integer.valueOf(i2));
        jSONObject4.put((JSONObject) "limit", (String) Integer.valueOf(i3));
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_js_oom_monitor", jSONObject, jSONObject3);
    }

    @JvmStatic
    public static final void a(String appId, String appDeveloperVersion, String stack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{appId, appDeveloperVersion, stack});
            return;
        }
        q.d(appId, "appId");
        q.d(appDeveloperVersion, "appDeveloperVersion");
        q.d(stack, "stack");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "tmsAppId", appId);
        jSONObject2.put((JSONObject) a.ATOM_stack, stack);
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_js_large_memory_monitor", jSONObject, new JSONObject());
    }

    @JvmStatic
    public static final void b(String appId, String appDeveloperVersion, String stack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{appId, appDeveloperVersion, stack});
            return;
        }
        q.d(appId, "appId");
        q.d(appDeveloperVersion, "appDeveloperVersion");
        q.d(stack, "stack");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "tmsAppId", appId);
        jSONObject2.put((JSONObject) a.ATOM_stack, stack);
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_jnr_monitor", jSONObject, new JSONObject());
    }

    @JvmStatic
    public static final void a(String appId, String appDeveloperVersion, int i, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69986c17", new Object[]{appId, appDeveloperVersion, new Integer(i), new Double(d)});
            return;
        }
        q.d(appId, "appId");
        q.d(appDeveloperVersion, "appDeveloperVersion");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "tmsAppId", appId);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "jank_count", (String) Integer.valueOf(i));
        jSONObject3.put((JSONObject) RateNode.TAG, (String) Double.valueOf(d));
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_jank_monitor", jSONObject, jSONObject2);
    }

    @JvmStatic
    public static final void a(String appId, String containerType, String appDeveloperVersion, double d, double d2, double d3, List<String> latency, List<String> frequency) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cf8a5a", new Object[]{appId, containerType, appDeveloperVersion, new Double(d), new Double(d2), new Double(d3), latency, frequency});
            return;
        }
        q.d(appId, "appId");
        q.d(containerType, "containerType");
        q.d(appDeveloperVersion, "appDeveloperVersion");
        q.d(latency, "latency");
        q.d(frequency, "frequency");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "tmsAppId", appId);
        jSONObject2.put((JSONObject) "containerType", containerType);
        jSONObject2.put((JSONObject) "gmVersion", appDeveloperVersion);
        jSONObject2.put((JSONObject) "latency", (String) latency);
        jSONObject2.put((JSONObject) "frequency", (String) frequency);
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "api_quantile", (String) Double.valueOf(d));
        jSONObject4.put((JSONObject) "api_min", (String) Double.valueOf(d2));
        jSONObject4.put((JSONObject) "api_max", (String) Double.valueOf(d3));
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_api_stas_monitor", jSONObject, jSONObject3);
    }

    @JvmStatic
    public static final void a(String appId, String containerType, String appDeveloperVersion, String apiName, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd743dae", new Object[]{appId, containerType, appDeveloperVersion, apiName, new Double(d)});
            return;
        }
        q.d(appId, "appId");
        q.d(containerType, "containerType");
        q.d(appDeveloperVersion, "appDeveloperVersion");
        q.d(apiName, "apiName");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "tmsAppId", appId);
        jSONObject2.put((JSONObject) "containerType", containerType);
        jSONObject2.put((JSONObject) "gmVersion", appDeveloperVersion);
        jSONObject2.put((JSONObject) "apiName", apiName);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "latency", (String) Double.valueOf(d));
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_single_api_stas_monitor", jSONObject, jSONObject3);
    }

    @JvmStatic
    public static final void b(String oriUrl, String traceId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{oriUrl, traceId});
            return;
        }
        q.d(oriUrl, "oriUrl");
        q.d(traceId, "traceId");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "oriUrl", oriUrl);
        jSONObject2.put((JSONObject) "traceId", traceId);
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_launch_by_fragment", jSONObject, new JSONObject());
    }

    public static /* synthetic */ void a(String str, String str2, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2465447", new Object[]{str, str2, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        a(str, str2, z);
    }

    @JvmStatic
    public static final void a(String oriUrl, String traceId, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{oriUrl, traceId, new Boolean(z)});
            return;
        }
        q.d(oriUrl, "oriUrl");
        q.d(traceId, "traceId");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "oriUrl", oriUrl);
        jSONObject2.put((JSONObject) "traceId", traceId);
        jSONObject2.put((JSONObject) "downgradeActivity", (String) Boolean.valueOf(z));
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_fragment_create", jSONObject, new JSONObject());
    }

    @JvmStatic
    public static final void a(JSONObject dimensions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{dimensions});
            return;
        }
        q.d(dimensions, "dimensions");
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "commitSubPageCreateViewException", dimensions, new JSONObject());
    }

    @JvmStatic
    public static final void b(f instance, String encoding) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a008078", new Object[]{instance, encoding});
            return;
        }
        q.d(instance, "instance");
        q.d(encoding, "encoding");
        JSONObject a2 = a(instance);
        a2.put((JSONObject) "encoding", encoding);
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "file_encoding_type", a2, new JSONObject());
    }

    @JvmStatic
    public static final void c(String appId, String originUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{appId, originUrl});
            return;
        }
        q.d(appId, "appId");
        q.d(originUrl, "originUrl");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "appId", appId);
        jSONObject2.put((JSONObject) "originUrl", originUrl);
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_pha_router", jSONObject, new JSONObject());
    }

    @JvmStatic
    public static final void b(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea3462e", new Object[]{instance});
            return;
        }
        q.d(instance, "instance");
        JSONObject a2 = a(instance);
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_pub_hide_title_bar", a2, new JSONObject());
    }

    @JvmStatic
    public static final void a(String url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{url});
            return;
        }
        q.d(url, "url");
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
        if (iMonitorAdapter == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "url", url);
        t tVar = t.INSTANCE;
        iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_legacy_start_app", jSONObject, new JSONObject());
    }
}
