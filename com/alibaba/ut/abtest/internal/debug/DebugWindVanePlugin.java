package com.alibaba.ut.abtest.internal.debug;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.ut.abtest.internal.util.g;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.o;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cex;
import tb.kge;

/* loaded from: classes.dex */
public class DebugWindVanePlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_SERVER_NAME = "WVUTABDebug";
    private static final String TAG = "DebugWindVanePlugin";

    static {
        kge.a(-1175316561);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        h.a(TAG, "action=" + str + ", params=" + str2 + ", callback=" + wVCallBackContext);
        if (TextUtils.equals("startRealtimeDebug", str)) {
            cex.a().a(true);
            if (!TextUtils.isEmpty(str2)) {
                Debug debug = (Debug) g.a(str2, (Class<Object>) Debug.class);
                if (debug == null) {
                    h.e(TAG, "开启实时调试失败，参数错误。params=" + str2);
                    if (wVCallBackContext != null) {
                        wVCallBackContext.error();
                    }
                    return true;
                }
                cex.a().q().a(debug);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
            } else if (wVCallBackContext != null) {
                wVCallBackContext.error();
            }
            cex.a().i().a("startRealtimeDebug");
            return true;
        } else if (!TextUtils.equals("getContextValue", str)) {
            return false;
        } else {
            if (wVCallBackContext != null) {
                r rVar = new r();
                rVar.a("utdid", o.a().b());
                rVar.a("userid", cex.a().r());
                rVar.a("usernick", cex.a().s());
                wVCallBackContext.success(rVar);
            }
            return true;
        }
    }
}
