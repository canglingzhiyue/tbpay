package tb;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_plugin.WeexInitSwitch;
import com.taobao.tao.log.TLog;

/* loaded from: classes2.dex */
public class mxt implements qfy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(388289665);
        kge.a(1319401793);
    }

    @Override // tb.qfy
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            TLog.loge("WindVane", "WVJsi", "onBeforeLoadJSI");
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    WeexInitSwitch.loadRemoteQking((Application) applicationContext);
                    TLog.loge("WindVane", "WVJsi", "loadRemoteQking success");
                } else {
                    TLog.loge("WindVane", "WVJsi", "loadRemoteQking failed, applicationContext is not Application");
                }
            }
        } catch (Exception unused) {
        }
    }
}
