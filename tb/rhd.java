package tb;

import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.application.common.c;
import com.ut.mini.UTAnalytics;

/* loaded from: classes7.dex */
public class rhd implements quo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.quo
    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue();
        }
        return 0L;
    }

    @Override // tb.quo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : NetworkStatusHelper.getStatus().getType();
    }

    @Override // tb.quo
    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : SceneIdentifier.getAppLaunchTime();
    }

    @Override // tb.quo
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : String.valueOf(SceneIdentifier.getDeviceLevel());
    }

    @Override // tb.quo
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : String.valueOf(SceneIdentifier.getStartType());
    }

    @Override // tb.quo
    public long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : SceneIdentifier.getProcessId();
    }

    @Override // tb.quo
    public long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue() : SceneIdentifier.getProcessStartTime();
    }

    @Override // tb.quo
    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
    }

    @Override // tb.quo
    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : c.a().a("saveMode", false);
    }
}
