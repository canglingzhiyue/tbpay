package android.taobao.windvane.extra.performance2;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class WVPageTrackerAPI extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-817249062);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!str.equals("reportPerformanceInfo")) {
            return false;
        }
        reportPerformanceInfo(str2, wVCallBackContext);
        return true;
    }

    public void reportPerformanceInfo(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd613f8", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        if (this.performance == null) {
            rVar.a("HY_FAILED");
            rVar.a("msg", "performance object does not exist");
            wVCallBackContext.error(rVar);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.performance.receiveJSMessageForCustomizedFSP(jSONObject.optLong("firstScreenPaint"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("otherPerformanceStage");
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.performance.receiveJSMessageForCustomizedStage(jSONObject2.optLong(next), next);
                }
            }
            wVCallBackContext.success();
        } catch (Exception e) {
            rVar.a("HY_FAILED");
            rVar.a("msg", "exception: " + e.getMessage());
            wVCallBackContext.error(rVar);
        }
    }
}
