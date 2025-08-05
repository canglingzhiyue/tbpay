package com.etao.feimagesearch.capture;

import android.content.Context;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.quicksearch.c;
import com.etao.feimagesearch.result.IrpJsBridge;
import com.etao.feimagesearch.util.ah;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.cot;
import tb.kge;

/* loaded from: classes3.dex */
public final class CaptureJSBridge extends IrpJsBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(78679040);
    }

    public static /* synthetic */ Object ipc$super(CaptureJSBridge captureJSBridge, String str, Object... objArr) {
        if (str.hashCode() == -1126948911) {
            return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.etao.feimagesearch.result.IrpJsBridge, android.taobao.windvane.jsbridge.e
    public boolean execute(String action, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, action, str, wVCallBackContext})).booleanValue();
        }
        q.c(action, "action");
        if (super.execute(action, str, wVCallBackContext)) {
            return true;
        }
        int hashCode = action.hashCode();
        if (hashCode == 346865707) {
            if (action.equals("getCurTab")) {
                getCurrentTab(wVCallBackContext);
                return true;
            }
        } else if (hashCode == 793363092 && action.equals("addQuickSearch")) {
            if (Build.VERSION.SDK_INT < 33) {
                ah.a(this.mContext);
            } else {
                Context mContext = this.mContext;
                q.a((Object) mContext, "mContext");
                c.a(mContext);
            }
            return true;
        }
        return false;
    }

    private final void getCurrentTab(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fc8b96", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext != null) {
            if (this.mContext instanceof CaptureActivity) {
                Context context = this.mContext;
                if (context == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.etao.feimagesearch.capture.CaptureActivity");
                }
                int b = ((CaptureActivity) context).b();
                if (b < 0) {
                    wVCallBackContext.error("activity status is incorrect");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "index", String.valueOf(b));
                wVCallBackContext.success(jSONObject.toJSONString());
                return;
            }
            wVCallBackContext.error("activity is not a CaptureActivity");
        } else {
            cot.b(IrpJsBridge.NAME, "getCurrentTab has no callback");
        }
    }
}
