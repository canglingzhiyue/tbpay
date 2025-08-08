package com.alibaba.security.realidentity.ui.webview.jsbridge.exec;

import android.content.Context;
import com.alibaba.security.realidentity.b;
import com.alibaba.security.realidentity.f2;
import com.alibaba.security.realidentity.g2;
import com.alibaba.security.realidentity.p1;
import com.alibaba.security.realidentity.q1;
import com.alibaba.security.realidentity.service.track.RPTrack;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.u4;
import com.alibaba.security.realidentity.ui.activity.RPWebViewActivity;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter;
import com.alibaba.security.realidentity.ui.webview.jsbridge.annotation.JSTopic;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

@JSTopic(topic = "option")
/* loaded from: classes3.dex */
public class OptionApi extends BaseJsExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public OptionApi(u4 u4Var) {
        super(u4Var);
    }

    public static /* synthetic */ void access$000(OptionApi optionApi, String str, boolean z, int i, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a78a73", new Object[]{optionApi, str, new Boolean(z), new Integer(i), str2, new Long(j)});
        } else {
            optionApi.collectRemoteSoEndTraceLog(str, z, i, str2, j);
        }
    }

    public static /* synthetic */ void access$100(OptionApi optionApi, JsCallbackAdapter jsCallbackAdapter, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c8a46b6", new Object[]{optionApi, jsCallbackAdapter, str, str2});
        } else {
            optionApi.wvResultCallback(jsCallbackAdapter, str, str2);
        }
    }

    public static /* synthetic */ Context access$200(OptionApi optionApi) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("840cd168", new Object[]{optionApi}) : optionApi.mContext;
    }

    public static /* synthetic */ Context access$300(OptionApi optionApi) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("dd181ce9", new Object[]{optionApi}) : optionApi.mContext;
    }

    public static /* synthetic */ void access$400(OptionApi optionApi, WVResultWrapper wVResultWrapper, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e99d66f", new Object[]{optionApi, wVResultWrapper, new Boolean(z)});
        } else {
            optionApi.finishJsBridge(wVResultWrapper, z);
        }
    }

    private void collectRemoteSoBeginTraceLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00cd7ed", new Object[]{this, str});
        } else {
            collectTraceLog(str, TrackLog.createRemoteSoBeginLog("h5"));
        }
    }

    private void collectRemoteSoEndTraceLog(String str, boolean z, int i, String str2, long j) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8cb56ec", new Object[]{this, str, new Boolean(z), new Integer(i), str2, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i));
        hashMap.put("errorMessage", str2);
        hashMap.put("costTime", Long.valueOf(j));
        if (!z) {
            i2 = -1;
        }
        collectTraceLog(str, TrackLog.createRemoteSoEndLog("h5", i2, b.b(hashMap)));
    }

    private void collectTraceLog(String str, TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0140607", new Object[]{this, str, trackLog});
            return;
        }
        trackLog.setVerifyToken(str);
        trackLog.addTag9(g2.f3421a + "/" + g2.b);
        trackLog.addTag10("Android");
        RPTrack.a(trackLog);
        RPTrack.c();
    }

    private void dynamicRequest(q1 q1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9465621", new Object[]{this, q1Var});
        } else {
            new p1(this.mContext, this.mVerifyBizCapacity).a(this.mRPBizConfig, q1Var);
        }
    }

    public static /* synthetic */ Object ipc$super(OptionApi optionApi, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private void wvResultCallback(final JsCallbackAdapter jsCallbackAdapter, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf0cafd", new Object[]{this, jsCallbackAdapter, str, str2});
        } else {
            dynamicRequest(new q1() { // from class: com.alibaba.security.realidentity.ui.webview.jsbridge.exec.OptionApi.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.security.realidentity.q1
                public void onRequestEnd(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a93d2f02", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    WVResultWrapper wVResultWrapper = new WVResultWrapper();
                    wVResultWrapper.addData("rpSdkName", f2.f3401a);
                    wVResultWrapper.addData("rpSdkVersion", g2.f3421a);
                    wVResultWrapper.addData(BaseJsExecutor.NAME_LIVENESSSDK_NAME, f2.e);
                    wVResultWrapper.addData(BaseJsExecutor.NAME_LIVENESSSDK_VERSION, g2.b);
                    wVResultWrapper.addData(BaseJsExecutor.NAME_REMOTE_SO_RESULT, str);
                    wVResultWrapper.addData(BaseJsExecutor.NAME_REMOTE_SO_MSG, str2);
                    wVResultWrapper.addData(BaseJsExecutor.NAME_SDK_NOUI, (OptionApi.access$200(OptionApi.this) == null || !(OptionApi.access$300(OptionApi.this) instanceof RPWebViewActivity)) ? "true" : "false");
                    wVResultWrapper.setSuccess();
                    jsCallbackAdapter.success(wVResultWrapper);
                    OptionApi.access$400(OptionApi.this, wVResultWrapper, true);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r11, final com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter r12) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.security.realidentity.ui.webview.jsbridge.exec.OptionApi.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            if (r2 == 0) goto L21
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r10
            r0[r3] = r11
            r11 = 2
            r0[r11] = r12
            java.lang.String r11 = "4d162c2f"
            java.lang.Object r11 = r1.ipc$dispatch(r11, r0)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L21:
            long r1 = java.lang.System.currentTimeMillis()
            r10.setStartBeginTime(r1)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L40
            r1.<init>(r11)     // Catch: java.lang.Exception -> L40
            java.lang.String r11 = "verifyToken"
            java.lang.String r11 = r1.optString(r11)     // Catch: java.lang.Exception -> L40
            boolean r1 = android.text.StringUtils.isEmpty(r11)     // Catch: java.lang.Exception -> L3e
            if (r1 != 0) goto L48
            r10.setVerifyToken(r11)     // Catch: java.lang.Exception -> L3e
            goto L48
        L3e:
            r1 = move-exception
            goto L42
        L40:
            r1 = move-exception
            r11 = r0
        L42:
            java.lang.String r2 = "option api get token fail"
            r10.trackExceptionLog(r2, r1)
        L48:
            r8 = r11
            com.alibaba.security.realidentity.g1 r11 = com.alibaba.security.realidentity.g1.f()
            r11.a(r8)
            com.alibaba.security.realidentity.m2 r11 = com.alibaba.security.realidentity.m2.a()
            android.content.Context r1 = r10.mContext
            boolean r11 = r11.a(r1)
            if (r11 == 0) goto L75
            long r6 = java.lang.System.currentTimeMillis()
            r10.collectRemoteSoBeginTraceLog(r8)
            com.alibaba.security.realidentity.m2 r11 = com.alibaba.security.realidentity.m2.a()
            android.content.Context r0 = r10.mContext
            com.alibaba.security.realidentity.ui.webview.jsbridge.exec.OptionApi$1 r1 = new com.alibaba.security.realidentity.ui.webview.jsbridge.exec.OptionApi$1
            r4 = r1
            r5 = r10
            r9 = r12
            r4.<init>()
            r11.a(r0, r1)
            return r3
        L75:
            java.lang.String r11 = "0"
            r10.wvResultCallback(r12, r11, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.realidentity.ui.webview.jsbridge.exec.OptionApi.execute(java.lang.String, com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter):boolean");
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public String getTrackMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("145b9fe3", new Object[]{this}) : "option";
    }
}
