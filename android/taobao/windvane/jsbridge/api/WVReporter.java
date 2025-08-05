package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.config.j;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.monitor.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class WVReporter extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-237811378);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("reportError".equals(str)) {
            reportError(wVCallBackContext, str2);
        } else if (!"reportDomLoad".equals(str)) {
            return false;
        } else {
            reportDomLoad(wVCallBackContext, str2);
        }
        return true;
    }

    public synchronized void reportError(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51534342", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String url = wVCallBackContext.getWebview().getUrl();
            if (o.getErrorMonitor() != null) {
                o.getErrorMonitor().didOccurJSError(url, jSONObject.optString("msg"), jSONObject.optString("file"), jSONObject.optString("line"));
            }
            if (this.mWebView == null) {
                z = false;
            }
            if (j.commonConfig.bL & z) {
                com.taobao.android.riverlogger.e.a(RVLLevel.Error, "JS/Log").a("log").b(wVCallBackContext.getPid()).a("content", (Object) str).a();
            }
            wVCallBackContext.success();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public synchronized void reportDomLoad(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4145382", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String url = wVCallBackContext.getWebview().getUrl();
            long optLong = jSONObject.optLong("time", 0L);
            long optLong2 = jSONObject.optLong("firstByte", 0L);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.startsWith("self_")) {
                    Long valueOf = Long.valueOf(jSONObject.optLong(next));
                    if (o.getPerformanceMonitor() != null) {
                        o.getPerformanceMonitor().didPageOccurSelfDefinedEvent(url, next.substring(5), valueOf.longValue());
                    }
                }
            }
            if (o.getPerformanceMonitor() != null) {
                o.getPerformanceMonitor().didPageDomLoadAtTime(url, optLong);
                o.getPerformanceMonitor().didPageReceiveFirstByteAtTime(url, optLong2);
            }
            wVCallBackContext.success();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
