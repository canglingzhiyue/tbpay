package com.alibaba.ut.abtest.internal.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ut.abtest.internal.util.h;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.cex;
import tb.kge;

/* loaded from: classes3.dex */
public class ABConfigDebuggerPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "ABConfigDebuggerJSBridge";
    private static final String TAG = "ABConfigDebuggerPlugin";

    static {
        kge.a(612139223);
    }

    public static /* synthetic */ Object ipc$super(ABConfigDebuggerPlugin aBConfigDebuggerPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (StringUtils.equals("mockDraft", str)) {
                mockDraft(str2, wVCallBackContext);
                return true;
            }
        } catch (Exception e) {
            h.d(TAG, "ABConfigDebuggerJSBridge:" + str, e);
        }
        return false;
    }

    private void mockDraft(String str, WVCallBackContext wVCallBackContext) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e890c5", new Object[]{this, str, wVCallBackContext});
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if ("beta_test".equals(jSONObject.getString("type"))) {
            cex.a().i().a("beta_test");
        }
        r rVar = new r();
        rVar.a("data", jSONObject);
        rVar.a("msg", "force pull success.");
        wVCallBackContext.success(rVar);
    }
}
