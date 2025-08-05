package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.task.e;
import com.taobao.android.job.core.task.g;
import com.taobao.android.launcher.biz.launcher.au;
import com.taobao.android.launcher.biz.launcher.gm;
import com.taobao.android.launcher.biz.launcher.gw;
import com.taobao.android.launcher.biz.launcher.ig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class gup implements g<String, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, e<String, Void>> f28464a;

    public gup() {
        gvt.a("SafeModeLauncherProvider");
        this.f28464a = new HashMap(4);
        this.f28464a.put("InitChangeAppIcon", new gw("InitChangeAppIcon"));
        this.f28464a.put("InitClearSpeedFlag", new au("InitClearSpeedFlag"));
        this.f28464a.put("InitSafeMode", new gm("InitSafeMode"));
        this.f28464a.put("InitUpdate", new ig("InitUpdate"));
        gvt.a();
    }

    @Override // com.taobao.android.job.core.task.g
    public e<String, Void> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("31278f8d", new Object[]{this, str}) : this.f28464a.get(str);
    }
}
