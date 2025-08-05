package tb;

import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public final class mrq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long sDelayTime = 0;

    static {
        kge.a(-1912366751);
    }

    public void a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bc89ba", new Object[]{this, scheduleFullScreenLiveFrame});
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask("BottomGroup", scheduleFullScreenLiveFrame.mFrameContext.k().e().a("tl-bottom-bar"), "tl-bottom-bar", (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_bottombar_stub2));
        }
    }
}
