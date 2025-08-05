package tb;

import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.utils.o;

/* loaded from: classes5.dex */
public final class mru {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(857727953);
    }

    public void d(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed6f797", new Object[]{this, scheduleFullScreenLiveFrame});
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.k().e().a("tl-favor-anim"), "tl-favor-anim", (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_favor_stub3));
        }
    }

    public void a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bc89ba", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (!hgs.h() || scheduleFullScreenLiveFrame.mLandscape) {
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.k().d().a("tl-favor-effect"), "tl-favor-effect", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_favor_effect_stub));
        }
    }

    public void b(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1aae59", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (!hkk.Z()) {
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.k().e().a("tl-live-ready-recommend"), "tl-live-ready-recommend", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_live_ready_recommend_container));
        }
    }

    public void c(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d678d2f8", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (!o.D()) {
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.k().e().a("tl-live-end-recommend"), "tl-live-end-recommend", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_live_end_recommend_container));
        }
    }
}
