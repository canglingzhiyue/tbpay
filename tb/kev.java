package tb;

import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.crash.WVUTCrashCaughtListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.tcrash.UncaughtCrashType;
import com.taobao.taobao.R;
import java.util.Map;

/* loaded from: classes6.dex */
public class kev extends WVUTCrashCaughtListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2075320535);
    }

    public static /* synthetic */ Object ipc$super(kev kevVar, String str, Object... objArr) {
        if (str.hashCode() == -642401982) {
            return super.onJvmUncaughtCrash((Thread) objArr[0], (Throwable) objArr[1]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public kev() {
        TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.NATIVE_ONLY).addHeaderInfo("isGalileo", acg.a().getString(R.bool.isGalileo));
        UncaughtCrashHeader crashCaughtHeaderByType = TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.NATIVE_ONLY);
        crashCaughtHeaderByType.addHeaderInfo("require_render_multi", "" + WVCore.getInstance().getUsedWebMulti());
        UncaughtCrashHeader crashCaughtHeaderByType2 = TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.NATIVE_ONLY);
        crashCaughtHeaderByType2.addHeaderInfo("require_gpu_multi", "" + WVCore.getInstance().getUsedGpuMulti());
    }

    @Override // android.taobao.windvane.extra.crash.WVUTCrashCaughtListener, com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        Map<String, Object> onJvmUncaughtCrash = super.onJvmUncaughtCrash(thread, th);
        onJvmUncaughtCrash.put("isGalileo", acg.a().getString(R.bool.isGalileo));
        onJvmUncaughtCrash.put("require_render_multi", "" + WVCore.getInstance().getUsedWebMulti());
        onJvmUncaughtCrash.put("require_gpu_multi", "" + WVCore.getInstance().getUsedGpuMulti());
        return onJvmUncaughtCrash;
    }
}
