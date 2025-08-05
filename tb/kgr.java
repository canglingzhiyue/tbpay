package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.mrt.service.c;
import java.util.Map;

/* loaded from: classes7.dex */
public class kgr implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.mrt.service.c
    public void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || !map.containsKey("name")) {
        } else {
            TCrashSDK.instance().getCrashCaughtHeader().addHeaderInfo(Thread.currentThread().getName(), map.get("name") + "");
        }
    }

    @Override // com.taobao.mrt.service.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            TCrashSDK.instance().getCrashCaughtHeader().addHeaderInfo(Thread.currentThread().getName(), "ok");
        }
    }
}
