package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.a;

/* loaded from: classes6.dex */
public class mqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f31199a;

    static {
        kge.a(1743025057);
    }

    public mqn(a aVar) {
        this.f31199a = aVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.f31199a.getViewParams().l() && this.f31199a.getViewParams().m()) {
            z = true;
        }
        ogg.c(a.TAG, "enableMoreLive:" + z);
        return z;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : oeb.a("enableReplayStatusShowLiveEnd", true) && TextUtils.equals("true", oeb.b("liveroom.hideReplay.enableHidePlay", "false"));
    }
}
