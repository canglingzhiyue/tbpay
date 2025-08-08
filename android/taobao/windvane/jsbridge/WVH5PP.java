package android.taobao.windvane.jsbridge;

import android.content.Context;
import android.os.SystemClock;
import android.taobao.windvane.extra.performance2.IPerformance;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.v;
import com.uc.webview.export.WebView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import tb.aex;
import tb.dqn;
import tb.kge;

/* loaded from: classes2.dex */
public class WVH5PP extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVH5PP";
    private Set<String> launcherPropertiedSet;
    private Set<String> launcherStagedSet;
    private final List<JSONObject> mH5CustomProperties = new CopyOnWriteArrayList();
    private Set<String> procedurePropertiedSet;
    private Set<String> procedureStagedSet;

    static {
        kge.a(1748425061);
    }

    public static /* synthetic */ Object ipc$super(WVH5PP wvh5pp, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static boolean mark(String str, WVCallBackContext wVCallBackContext) {
        IWVWebView webview;
        View view;
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35abeddf", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        if (!android.taobao.windvane.config.j.commonConfig.bH || wVCallBackContext == null || (webview = wVCallBackContext.getWebview()) == null || (view = webview.getView()) == null || (parseObject = JSONObject.parseObject(str)) == null) {
            return false;
        }
        String string = parseObject.getString("bizId");
        if (string == null) {
            string = "";
        }
        com.taobao.monitor.procedure.g procedure = getProcedure(view);
        if (procedure == null || !procedure.c()) {
            return false;
        }
        procedure.b(string, (Map<String, Object>) parseObject);
        wVCallBackContext.success();
        return true;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("receiveFSPTime".equals(str)) {
            receiveFSPTime(str2, wVCallBackContext);
        } else if ("receiveFPTime".equals(str)) {
            receiveFPTime(str2, wVCallBackContext);
        } else if ("receiveTTITime".equals(str)) {
            receiveTTITime(str2, wVCallBackContext);
        } else if ("onStage".equals(str)) {
            onStage(str2, wVCallBackContext);
        } else if ("onProperty".equals(str)) {
            onProperty(str2, wVCallBackContext);
        } else if (com.taobao.tao.powermsg.model.a.COL_MARK.equals(str)) {
            return mark(str2, wVCallBackContext);
        } else {
            if (!"addH5CustomProperty".equals(str)) {
                return false;
            }
            addH5CustomProperty(str2, wVCallBackContext);
        }
        return true;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        this.launcherStagedSet = new HashSet();
        this.procedureStagedSet = new HashSet();
        this.launcherPropertiedSet = new HashSet();
        this.procedurePropertiedSet = new HashSet();
    }

    public final void addH5CustomProperty(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8107a2", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            if (!android.taobao.windvane.config.j.commonConfig.bX) {
                wVCallBackContext.error();
                return;
            }
            JSONObject parseObject = JSONObject.parseObject(str);
            if (parseObject == null) {
                wVCallBackContext.error();
                return;
            }
            Long l = parseObject.getLong("id");
            if (l == null) {
                wVCallBackContext.error();
                return;
            }
            HashMap hashMap = new HashMap();
            Iterator<Map.Entry<String, Object>> it = parseObject.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> next = it.next();
                if (next != null) {
                    String key = next.getKey();
                    if (!StringUtils.isEmpty(key) && !"id".equals(key)) {
                        Object value = next.getValue();
                        if ((value instanceof Integer) || (value instanceof Long)) {
                            try {
                                long a2 = aex.a(Long.parseLong(String.valueOf(value)));
                                if (key.startsWith("H5_JST_")) {
                                    next.setValue(Long.valueOf(a2));
                                } else {
                                    hashMap.put("H5_H5_" + key, Long.valueOf(a2));
                                    it.remove();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            parseObject.putAll(hashMap);
            int i2 = -1;
            while (true) {
                if (i < this.mH5CustomProperties.size()) {
                    JSONObject jSONObject = this.mH5CustomProperties.get(i);
                    if (jSONObject != null && l.equals(jSONObject.getLong("id"))) {
                        i2 = i;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            if (i2 >= 0 && i2 < this.mH5CustomProperties.size()) {
                this.mH5CustomProperties.set(i2, parseObject);
            } else {
                this.mH5CustomProperties.add(parseObject);
            }
            com.taobao.monitor.procedure.g procedure = getProcedure((View) wVCallBackContext.getWebview());
            if (procedure.c()) {
                procedure.a("h5CustomProperties", this.mH5CustomProperties);
                wVCallBackContext.success();
                return;
            }
            android.taobao.windvane.util.m.e(TAG, "LauncherProcedure is not Alive");
            wVCallBackContext.error();
        } catch (Exception unused2) {
            wVCallBackContext.error();
        }
    }

    public final void receiveFSPTime(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa52d5b", new Object[]{this, str, wVCallBackContext});
        } else if (this.performance == null) {
        } else {
            try {
                long optLong = new org.json.JSONObject(str).optLong("time");
                if (optLong != 0) {
                    this.performance.receiveJSMessageForFSP(optLong);
                }
                wVCallBackContext.success();
            } catch (Exception unused) {
                wVCallBackContext.error();
            }
        }
    }

    public final void receiveFPTime(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38304a28", new Object[]{this, str, wVCallBackContext});
        } else if (this.performance == null) {
        } else {
            try {
                long optLong = new org.json.JSONObject(str).optLong("time");
                if (optLong != 0) {
                    this.performance.receiveJSMessageForFP(optLong);
                }
                wVCallBackContext.success();
            } catch (Exception unused) {
                wVCallBackContext.error();
            }
        }
    }

    public final void receiveTTITime(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd1d1781", new Object[]{this, str, wVCallBackContext});
        } else if (this.performance == null) {
        } else {
            try {
                long optLong = new org.json.JSONObject(str).optLong("time");
                if (optLong != 0) {
                    this.performance.receiveJSMessageForTTI(optLong);
                }
                wVCallBackContext.success();
            } catch (Exception unused) {
                wVCallBackContext.error();
            }
        }
    }

    public final void onStage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd14a0ed", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            IWVWebView webview = wVCallBackContext.getWebview();
            if ((webview instanceof View) && !t.b((View) webview)) {
                r rVar = new r();
                rVar.a("msg", "apm report is manually disabled");
                wVCallBackContext.error(rVar);
                return;
            }
            org.json.JSONObject optJSONObject = new org.json.JSONObject(str).optJSONObject("stage");
            if (optJSONObject != null && optJSONObject.length() > 0) {
                if ((wVCallBackContext.getWebview() instanceof IPerformance) && ((IPerformance) wVCallBackContext.getWebview()).isPreInit()) {
                    android.taobao.windvane.util.m.e(TAG, "isPreInit skip onStage");
                    return;
                } else if ((wVCallBackContext.getWebview() instanceof android.taobao.windvane.webview.f) && ((android.taobao.windvane.webview.f) wVCallBackContext.getWebview()).isPreRender()) {
                    android.taobao.windvane.util.m.e(TAG, "isPreRender skip onStage");
                    return;
                } else {
                    procedureStage(optJSONObject, this.procedureStagedSet, wVCallBackContext.getWebview());
                }
            }
            wVCallBackContext.success();
        } catch (Throwable unused) {
            wVCallBackContext.error();
        }
    }

    private void procedureStage(org.json.JSONObject jSONObject, Set<String> set, IWVWebView iWVWebView) throws JSONException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f8bda57", new Object[]{this, jSONObject, set, iWVWebView});
        } else if (!(iWVWebView instanceof WVUCWebView)) {
        } else {
            dqn webViewPageModel = ((WVUCWebView) iWVWebView).getWebViewContext().getWebViewPageModel();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!set.contains(next)) {
                    Long valueOf = Long.valueOf(jSONObject.getLong(next));
                    Long valueOf2 = Long.valueOf(aex.a(valueOf.longValue()));
                    android.taobao.windvane.util.m.e(TAG, "stage:" + next + " time:" + valueOf2);
                    if (next.startsWith("H5_JST_")) {
                        webViewPageModel.onStageIfAbsent(next, valueOf2.longValue());
                        str = next;
                    } else {
                        str = "H5_H5_" + next;
                        webViewPageModel.onStageIfAbsent(str, valueOf2.longValue());
                    }
                    if ((iWVWebView instanceof IPerformance) && android.taobao.windvane.config.j.commonConfig.bL) {
                        ((IPerformance) iWVWebView).receiveOnStage(str);
                    }
                    if (iWVWebView instanceof android.taobao.windvane.webview.e) {
                        android.taobao.windvane.util.f.b(((android.taobao.windvane.webview.e) iWVWebView).getFalcoSpan(), str, valueOf);
                    }
                    set.add(next);
                } else {
                    android.taobao.windvane.util.m.e(TAG, "stage add abort because added:" + next);
                }
            }
        }
    }

    public final void onProperty(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede39322", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            IWVWebView webview = wVCallBackContext.getWebview();
            if ((webview instanceof View) && !t.b((View) webview)) {
                r rVar = new r();
                rVar.a("msg", "apm report is manually disabled");
                wVCallBackContext.error(rVar);
                return;
            }
            org.json.JSONObject optJSONObject = new org.json.JSONObject(str).optJSONObject("property");
            if (optJSONObject != null && optJSONObject.length() > 0) {
                if (wVCallBackContext.getWebview() instanceof IPerformance) {
                    if (((IPerformance) wVCallBackContext.getWebview()).isPreInit()) {
                        android.taobao.windvane.util.m.e(TAG, "isPreInit skip onProperty");
                        return;
                    } else if (android.taobao.windvane.config.j.commonConfig.bL) {
                        ((IPerformance) wVCallBackContext.getWebview()).receiveOnProperty(optJSONObject);
                    }
                }
                if ((wVCallBackContext.getWebview() instanceof android.taobao.windvane.webview.f) && ((android.taobao.windvane.webview.f) wVCallBackContext.getWebview()).isPreRender()) {
                    android.taobao.windvane.util.m.e(TAG, "isPreRender skip onProperty");
                    return;
                }
                procedureProperty(optJSONObject, this.launcherPropertiedSet, wVCallBackContext);
            }
            wVCallBackContext.success();
        } catch (Throwable unused) {
            wVCallBackContext.error();
        }
    }

    private void procedureProperty(org.json.JSONObject jSONObject, Set<String> set, WVCallBackContext wVCallBackContext) throws JSONException {
        com.taobao.analysis.v3.n falcoSpan;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c1df4d", new Object[]{this, jSONObject, set, wVCallBackContext});
            return;
        }
        IWVWebView webview = wVCallBackContext.getWebview();
        if (!(webview instanceof WVUCWebView)) {
            return;
        }
        dqn webViewPageModel = ((WVUCWebView) webview).getWebViewContext().getWebViewPageModel();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!set.contains(next)) {
                String string = jSONObject.getString(next);
                android.taobao.windvane.util.m.e(TAG, "key:" + next + " value:" + string);
                IWVWebView webview2 = wVCallBackContext.getWebview();
                if ("isFinished".equals(next) && "true".equalsIgnoreCase(string)) {
                    if (webview2 instanceof WebView) {
                        ((WebView) webview2).setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
                        android.taobao.windvane.util.m.e(TAG, "receive isFinished setTag " + SystemClock.uptimeMillis());
                    }
                    if (webview2 instanceof IPerformance) {
                        ((IPerformance) webview2).setReportedFSP(true);
                    }
                }
                if (next.startsWith("H5_JST_")) {
                    webViewPageModel.onPropertyIfAbsent(next, string);
                } else {
                    webViewPageModel.onPropertyIfAbsent("H5_H5_" + next, string);
                }
                if ((webview2 instanceof android.taobao.windvane.webview.e) && (falcoSpan = ((android.taobao.windvane.webview.e) webview2).getFalcoSpan()) != null) {
                    falcoSpan.a("H5_H5_" + next, string);
                }
                set.add(next);
            } else {
                android.taobao.windvane.util.m.e(TAG, "property add abort because added:" + next);
            }
        }
    }

    private static com.taobao.monitor.procedure.g getProcedure(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.monitor.procedure.g) ipChange.ipc$dispatch("878f1614", new Object[]{view}) : com.taobao.monitor.procedure.s.f18233a.b(view);
    }
}
