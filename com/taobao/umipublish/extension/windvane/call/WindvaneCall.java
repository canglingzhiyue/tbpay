package com.taobao.umipublish.extension.windvane.call;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H$J\u0016\u0010\r\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/call/WindvaneCall;", "Ljava/io/Serializable;", "()V", "callback", "Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "getCallback", "()Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "setCallback", "(Landroid/taobao/windvane/jsbridge/WVCallBackContext;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "call", "", "params", "Lcom/alibaba/fastjson/JSONObject;", "onExecute", "Companion", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public abstract class WindvaneCall implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion;
    public static final String K_RET_CODE = "errorCode";
    public static final String K_RET_MSG = "message";
    public static final String TAG = "WindvaneCall";
    private WVCallBackContext callback;
    private Context context;

    static {
        kge.a(-1216796734);
        kge.a(1028243835);
        Companion = new Companion(null);
    }

    public abstract void onExecute(JSONObject jSONObject);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/call/WindvaneCall$Companion;", "", "()V", "K_RET_CODE", "", "K_RET_MSG", RPCDataItems.SWITCH_TAG_LOG, "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes9.dex */
    public static final class Companion {
        static {
            kge.a(-1638676342);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final WVCallBackContext getCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("d7f8ea11", new Object[]{this}) : this.callback;
    }

    public final void setCallback(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0e440b", new Object[]{this, wVCallBackContext});
        } else {
            this.callback = wVCallBackContext;
        }
    }

    public final Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.context;
    }

    public final void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.context = context;
        }
    }

    public final void setContext(WVCallBackContext callback, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5a1ab7", new Object[]{this, callback, context});
            return;
        }
        q.d(callback, "callback");
        q.d(context, "context");
        this.callback = callback;
        this.context = context;
    }

    public final void call(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61a4ebab", new Object[]{this, jSONObject});
            return;
        }
        try {
            onExecute(jSONObject);
        } catch (Throwable th) {
            WVCallBackContext wVCallBackContext = this.callback;
            if (wVCallBackContext == null) {
                return;
            }
            r rVar = new r("HY_FAILED");
            rVar.a("errorCode", "-1");
            rVar.a("errorMsg", Log.getStackTraceString(th));
            t tVar = t.INSTANCE;
            wVCallBackContext.error(rVar);
        }
    }
}
