package android.taobao.windvane.jsbridge.api;

import android.content.Context;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.performance2.IPerformance;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.f;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import tb.adj;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class WVFalco extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FAIL_REASON = "fail_reason";
    private static final int LEVEL_PHASE = 1;
    private static final int LEVEL_STAGE = 2;
    private static final String MONITOR_MODULE = "WindVane";
    private static final String MONITOR_POINT = "WVFalco";
    private static final String TAG = "WVFalco";
    private IPerformance webView;
    private adj webviewSpanWrapper;
    private adj windvaneSpanWrapper;
    public boolean webviewSpanFinished = false;
    private int stageLimit = 1000;
    private int propertyLimit = 1000;
    private Map<String, adj> phaseMap = new HashMap();
    private Map<String, adj> stageMap = new HashMap();
    private String pageName = "h5_page";

    static {
        kge.a(268620272);
    }

    public static /* synthetic */ Object ipc$super(WVFalco wVFalco, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        m.e("WVFalco", "execute() called with: action = [" + str + "], params = [" + str2 + "], callback = [" + wVCallBackContext + riy.ARRAY_END_STR);
        if ("addLog".equals(str)) {
            addLog(str2, wVCallBackContext);
            return true;
        } else if ("addProperties".equals(str)) {
            addProperty(str2, wVCallBackContext);
            return true;
        } else if ("startPhase".equals(str)) {
            startSpan(str2, wVCallBackContext, 1);
            return true;
        } else if ("finishPhase".equals(str)) {
            finishSpan(str2, wVCallBackContext, 1);
            return true;
        } else if ("startStage".equals(str)) {
            startSpan(str2, wVCallBackContext, 2);
            return true;
        } else if (!"finishStage".equals(str)) {
            return false;
        } else {
            finishSpan(str2, wVCallBackContext, 2);
            return true;
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        j.a();
        if (!j.commonConfig.bo) {
            return;
        }
        if (iWVWebView instanceof android.taobao.windvane.webview.e) {
            this.windvaneSpanWrapper = ((android.taobao.windvane.webview.e) iWVWebView).getSpanWrapper();
        }
        if (!(iWVWebView instanceof IPerformance)) {
            return;
        }
        this.webView = (IPerformance) iWVWebView;
    }

    private void startSpan(String str, WVCallBackContext wVCallBackContext, int i) {
        n a2;
        String b;
        JSONObject optJSONObject;
        Iterator<String> keys;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aafeb29", new Object[]{this, str, wVCallBackContext, new Integer(i)});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (i == 1) {
                String optString = jSONObject.optString("phaseName");
                if (this.webviewSpanWrapper != null) {
                    a2 = f.a(this.pageName, this.pageName, this.webviewSpanWrapper);
                } else {
                    n a3 = f.a(this.pageName, this.pageName, this.windvaneSpanWrapper);
                    m.e("WVFalco", "pageName not set,use windvane span to make Span");
                    String str2 = "unknown";
                    if (this.webView != null) {
                        str2 = this.webView.getCachedUrl();
                    }
                    AppMonitor.Alarm.commitFail("WindVane", "WVFalco", str2, "1", "makeSpan");
                    a2 = a3;
                }
                if (a2 == null) {
                    wVCallBackContext.error(FAIL_REASON, "fail to make new span");
                    return;
                }
                a2.g(optString);
                b = a2.h().b();
                this.phaseMap.put(b, new adj(a2));
            } else {
                String optString2 = jSONObject.optString("phaseID");
                String optString3 = jSONObject.optString("stageName");
                adj adjVar = this.phaseMap.get(optString2);
                if (adjVar == null) {
                    wVCallBackContext.error(FAIL_REASON, "phase doesn't exist");
                    return;
                }
                a2 = f.a(this.pageName, this.pageName, adjVar);
                if (a2 == null) {
                    wVCallBackContext.error(FAIL_REASON, "fail to make new span");
                    return;
                }
                a2.g(optString3);
                b = a2.h().b();
                this.stageMap.put(b, new adj(a2));
            }
            if (a2 != null && (optJSONObject = jSONObject.optJSONObject("property")) != null && (keys = optJSONObject.keys()) != null) {
                while (this.propertyLimit > 0 && keys.hasNext()) {
                    String next = keys.next();
                    a2.a(next, optJSONObject.getString(next));
                    this.propertyLimit--;
                }
            }
            r rVar = new r();
            if (i == 1) {
                rVar.a("phaseID", b);
            } else {
                rVar.a("stageID", b);
            }
            wVCallBackContext.success(rVar);
        } catch (Throwable th) {
            wVCallBackContext.error(FAIL_REASON, th.toString());
        }
    }

    private void finishSpan(String str, WVCallBackContext wVCallBackContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e49ea2d8", new Object[]{this, str, wVCallBackContext, new Integer(i)});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("errorCode");
            if (i == 1) {
                adj remove = this.phaseMap.remove(jSONObject.optString("phaseID"));
                if (remove == null) {
                    wVCallBackContext.error(FAIL_REASON, "phase doesn't exist");
                    return;
                }
                finishSpan(optString, remove);
            } else {
                adj remove2 = this.stageMap.remove(jSONObject.optString("stageID"));
                if (remove2 == null) {
                    wVCallBackContext.error(FAIL_REASON, "stage doesn't exist");
                    return;
                }
                finishSpan(optString, remove2);
            }
            wVCallBackContext.success();
        } catch (Throwable th) {
            wVCallBackContext.error(FAIL_REASON, th.toString());
        }
    }

    private void finishSpan(String str, adj adjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29db3b7", new Object[]{this, str, adjVar});
        } else if (TextUtils.isEmpty(str)) {
            adjVar.b();
        } else {
            adjVar.a();
            adjVar.a(str);
        }
    }

    public final void addLog(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e37671", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject("log");
            if (jSONObject2 == null) {
                wVCallBackContext.error(FAIL_REASON, "There is no log");
                return;
            }
            adj adjVar = new adj();
            if (!findSpan(adjVar, wVCallBackContext, jSONObject)) {
                return;
            }
            Iterator<String> keys = jSONObject2.keys();
            if (keys != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    adjVar.c(next + "  " + jSONObject2.getString(next));
                }
            }
            wVCallBackContext.success();
        } catch (Throwable th) {
            wVCallBackContext.error(FAIL_REASON, th.toString());
        }
    }

    public final void addProperty(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba98164", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject("property");
            if (jSONObject2 == null) {
                wVCallBackContext.error(FAIL_REASON, "There is no property");
                return;
            }
            adj adjVar = new adj();
            if (!findSpan(adjVar, wVCallBackContext, jSONObject)) {
                return;
            }
            Iterator<String> keys = jSONObject2.keys();
            if (keys != null) {
                while (this.propertyLimit > 0 && keys.hasNext()) {
                    String next = keys.next();
                    adjVar.b(next, jSONObject2.getString(next));
                    this.propertyLimit--;
                }
            }
            wVCallBackContext.success();
        } catch (Throwable th) {
            wVCallBackContext.error(FAIL_REASON, th.toString());
        }
    }

    private boolean findSpan(adj adjVar, WVCallBackContext wVCallBackContext, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e7275f2", new Object[]{this, adjVar, wVCallBackContext, jSONObject})).booleanValue();
        }
        adj adjVar2 = this.webviewSpanWrapper;
        if (adjVar2 != null) {
            adjVar.a(adjVar2);
        } else {
            adjVar.a(this.windvaneSpanWrapper);
            m.e("WVFalco", "pageName not set,use windvane span to findSpan");
            IPerformance iPerformance = this.webView;
            AppMonitor.Alarm.commitFail("WindVane", "WVFalco", iPerformance != null ? iPerformance.getCachedUrl() : "unknown", "2", "findSpan");
        }
        String optString = jSONObject.optString("phaseID");
        if (!TextUtils.isEmpty(optString)) {
            adj adjVar3 = this.phaseMap.get(optString);
            if (adjVar3 == null) {
                wVCallBackContext.error(FAIL_REASON, "no such phase");
                return false;
            }
            adjVar.a(adjVar3);
        }
        String optString2 = jSONObject.optString("stageID");
        if (!TextUtils.isEmpty(optString2)) {
            adj adjVar4 = this.stageMap.get(optString2);
            if (adjVar4 == null) {
                wVCallBackContext.error(FAIL_REASON, "no such stage");
                return false;
            }
            adjVar.a(adjVar4);
        }
        return true;
    }

    public void setPageName(String str) {
        adj adjVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
            return;
        }
        j.a();
        if (!j.commonConfig.bo || TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals("h5_" + str, this.pageName)) {
            return;
        }
        String str2 = "h5_" + str;
        if (!this.webviewSpanFinished && (adjVar = this.webviewSpanWrapper) != null) {
            adjVar.b();
        }
        this.pageName = str2;
        m.e("WVFalco", "pageName=" + str2);
        this.webviewSpanWrapper = new adj(f.a(str2, str2, this.windvaneSpanWrapper));
        this.webviewSpanFinished = false;
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        adj adjVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (this.webviewSpanFinished || (adjVar = this.webviewSpanWrapper) == null) {
        } else {
            adjVar.b();
            this.webviewSpanFinished = true;
        }
    }
}
