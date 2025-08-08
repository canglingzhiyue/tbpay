package com.taobao.falco;

import android.content.Context;
import android.content.SharedPreferences;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.dit;

/* loaded from: classes7.dex */
public class FalcoLocalTool extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long DAY_MS = 86400000;
    private static final String SP_STATUS_KEY = "falco_local_debug_t";
    private static final String TAG = "falco.LocalTool";
    private static final String WV_METHOD_ENABLE = "enable";
    private static final String WV_PLUGIN_NAME = "FalcoLocalDebugPlugin";
    private static boolean enable = false;
    private static SharedPreferences preferences;

    public static /* synthetic */ Object ipc$super(FalcoLocalTool falcoLocalTool, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(FalcoLocalTool falcoLocalTool, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f29b346", new Object[]{falcoLocalTool, str, wVCallBackContext});
        } else {
            falcoLocalTool.handlerAction(str, wVCallBackContext);
        }
    }

    public static void register(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381c355e", new Object[]{context});
            return;
        }
        try {
            q.a(WV_PLUGIN_NAME, (Class<? extends e>) FalcoLocalTool.class);
        } catch (Throwable unused) {
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("falco", 0);
        preferences = sharedPreferences;
        long j = sharedPreferences.getLong(SP_STATUS_KEY, -1L);
        if (j <= 0 || System.currentTimeMillis() - j > 86400000) {
            return;
        }
        enable = true;
    }

    public static boolean isEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[0])).booleanValue() : enable;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, final String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"enable".equals(str)) {
            return false;
        }
        dit.b(new Runnable() { // from class: com.taobao.falco.FalcoLocalTool.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    FalcoLocalTool.access$000(FalcoLocalTool.this, str2, wVCallBackContext);
                }
            }
        });
        return true;
    }

    private void handlerAction(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a22a56e", new Object[]{this, str, wVCallBackContext});
        } else if (StringUtils.isEmpty(str)) {
            wVCallBackContext.error("params null.");
        } else {
            try {
                boolean equals = "1".equals(new JSONObject(str).getString("enable"));
                enable = equals;
                if (equals) {
                    preferences.edit().putLong(SP_STATUS_KEY, System.currentTimeMillis()).apply();
                } else {
                    preferences.edit().remove(SP_STATUS_KEY).apply();
                }
            } catch (Throwable unused) {
                wVCallBackContext.error("parse error.");
            }
        }
    }
}
