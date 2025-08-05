package android.taobao.windvane.jsbridge.api;

import android.content.ContextWrapper;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import tb.adn;
import tb.adp;
import tb.kge;

/* loaded from: classes2.dex */
public class WVNativeDetector extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(94462890);
    }

    public static /* synthetic */ Object ipc$super(WVNativeDetector wVNativeDetector, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getDeviceYear".equals(str)) {
            detectYearClass(str2, wVCallBackContext);
            return true;
        } else if ("getCurrentUsage".equals(str)) {
            getCurrentUsage(str2, wVCallBackContext);
            return true;
        } else if ("getModelInfo".equals(str)) {
            getModelInfo(wVCallBackContext, str2);
            return true;
        } else if ("isSimulator".equals(str)) {
            isSimulator(str2, wVCallBackContext);
            return true;
        } else if (!"getPerformanceInfo".equals(str)) {
            return false;
        } else {
            getPerformanceInfo(str2, wVCallBackContext);
            return true;
        }
    }

    private void detectYearClass(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89420d26", new Object[]{this, str, wVCallBackContext});
            return;
        }
        int a2 = adp.a(this.mContext);
        if (a2 == -1) {
            wVCallBackContext.error();
            return;
        }
        r rVar = new r();
        rVar.a("deviceYear", Integer.toString(a2));
        wVCallBackContext.success(rVar);
    }

    public void getModelInfo(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d44ea8f", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        rVar.a("model", Build.MODEL);
        rVar.a("brand", Build.BRAND);
        wVCallBackContext.success(rVar);
    }

    private void getCurrentUsage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("240493ec", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        if (android.taobao.windvane.config.a.f == null) {
            wVCallBackContext.error();
            return;
        }
        float a2 = (float) (adn.a(android.taobao.windvane.config.a.f) / 1048576);
        float c = adn.c();
        float b = a2 - ((float) (adn.b(android.taobao.windvane.config.a.f) / 1048576));
        rVar.a("cpuUsage", Float.toString(c));
        rVar.a("memoryUsage", Float.toString(b / a2));
        rVar.a("totalMemory", Float.toString(a2));
        rVar.a("usedMemory", Float.toString(b));
        wVCallBackContext.success(rVar);
    }

    private void isSimulator(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13030c8", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        try {
            boolean isSimulator = SecurityGuardManager.getInstance(new ContextWrapper(this.mContext)).getSimulatorDetectComp().isSimulator();
            m.c("WVNativeDetector", "Current phone is simulator: " + isSimulator);
            rVar.a("isSimulator", Boolean.valueOf(isSimulator));
            wVCallBackContext.success(rVar);
        } catch (Throwable th) {
            rVar.a("errMsg", th.getMessage());
            wVCallBackContext.error(rVar);
        }
    }

    private void getPerformanceInfo(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25633416", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        try {
            com.taobao.application.common.d a2 = com.taobao.application.common.c.a();
            a2.a("isApm", false);
            int a3 = a2.a("deviceScore", -1);
            int a4 = a2.a(com.taobao.tbdeviceevaluator.c.KEY_CPU_SCORE, -1);
            int a5 = a2.a(com.taobao.tbdeviceevaluator.c.KEY_MEM_SCORE, -1);
            rVar.a("deviceScore", Integer.valueOf(a3));
            rVar.a(com.taobao.tbdeviceevaluator.c.KEY_CPU_SCORE, Integer.valueOf(a4));
            rVar.a(com.taobao.tbdeviceevaluator.c.KEY_MEM_SCORE, Integer.valueOf(a5));
            wVCallBackContext.success(rVar);
        } catch (Throwable th) {
            rVar.a("errMsg", th.getMessage());
            wVCallBackContext.error(rVar);
        }
    }
}
