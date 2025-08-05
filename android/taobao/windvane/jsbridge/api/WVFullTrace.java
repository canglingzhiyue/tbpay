package android.taobao.windvane.jsbridge.api;

import android.content.Context;
import android.taobao.windvane.config.j;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.p;
import java.util.Iterator;
import org.json.JSONObject;
import tb.adj;
import tb.kge;

/* loaded from: classes2.dex */
public class WVFullTrace extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVFullTrace";
    private adj spanWrapper;
    private int stageLimit = 1000;
    private int propertyLimit = 1000;

    static {
        kge.a(-116111063);
    }

    public static /* synthetic */ Object ipc$super(WVFullTrace wVFullTrace, String str, Object... objArr) {
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
        if ("log".equals(str)) {
            log(str2, wVCallBackContext);
            return true;
        } else if ("stage".equals(str)) {
            stage(str2, wVCallBackContext);
            return true;
        } else if (!"property".equals(str)) {
            return false;
        } else {
            property(str2, wVCallBackContext);
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
        if (!j.commonConfig.bo || !(iWVWebView instanceof android.taobao.windvane.webview.e)) {
            return;
        }
        this.spanWrapper = ((android.taobao.windvane.webview.e) iWVWebView).getSpanWrapper();
    }

    public final void log(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd6992", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            if (keys != null && this.spanWrapper != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    adj adjVar = this.spanWrapper;
                    adjVar.c(next + " " + jSONObject.getString(next));
                }
            }
            wVCallBackContext.success();
        } catch (Throwable th) {
            wVCallBackContext.error(th.toString());
        }
    }

    public final void stage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efed8cc", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            if (keys != null && this.spanWrapper != null) {
                while (this.stageLimit > 0 && keys.hasNext()) {
                    String next = keys.next();
                    p d = this.spanWrapper.d(next);
                    if (d != null) {
                        Long valueOf = Long.valueOf(jSONObject.getLong(next));
                        d.a(valueOf);
                        d.b(valueOf);
                    }
                    this.stageLimit--;
                }
            }
            wVCallBackContext.success();
        } catch (Throwable th) {
            wVCallBackContext.error(th.toString());
        }
    }

    public final void property(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951f5ae3", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            if (keys != null && this.spanWrapper != null) {
                while (this.propertyLimit > 0 && keys.hasNext()) {
                    String next = keys.next();
                    this.spanWrapper.b(next, jSONObject.getString(next));
                    this.propertyLimit--;
                }
            }
            wVCallBackContext.success();
        } catch (Throwable th) {
            wVCallBackContext.error(th.toString());
        }
    }
}
