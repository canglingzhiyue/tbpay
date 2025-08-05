package tb;

import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.BottomSlideGuideFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.BottomSlideNewGuideFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;

/* loaded from: classes5.dex */
public final class mrt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-230924850);
    }

    public void a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        BaseFrame liveAvatarNewFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bc89ba", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_LIVE_ANCHOR_PAGE) || (liveAvatarNewFrame = f.g().getLiveAvatarNewFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mFrameContext)) == null) {
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(liveAvatarNewFrame, "LiveAvatarNewCardFrame", (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_live_avatar_card_container));
        }
    }

    public void b(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1aae59", new Object[]{this, scheduleFullScreenLiveFrame});
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.k().e().a("tl-user-recommend-experience"), "tl-user-recommend-experience", (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_ue_stub));
        }
    }

    public void c(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d678d2f8", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (plz.a(scheduleFullScreenLiveFrame.mLiveDetailData) || scheduleFullScreenLiveFrame.mLandscape || !scheduleFullScreenLiveFrame.mFrameContext.z || !hgs.o()) {
        } else {
            BottomSlideGuideFrame bottomSlideGuideFrame = new BottomSlideGuideFrame(scheduleFullScreenLiveFrame.mContext, false, scheduleFullScreenLiveFrame.mLiveDataModel, scheduleFullScreenLiveFrame.mFrameContext);
            scheduleFullScreenLiveFrame.addFrameInstallTask(bottomSlideGuideFrame, bottomSlideGuideFrame.getComponentName(), (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_bottom_guide_stub));
        }
    }

    public void f(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9340d5", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (plz.a(scheduleFullScreenLiveFrame.mLiveDetailData) || scheduleFullScreenLiveFrame.mLandscape) {
        } else {
            BottomSlideNewGuideFrame bottomSlideNewGuideFrame = new BottomSlideNewGuideFrame(scheduleFullScreenLiveFrame.mContext, true, scheduleFullScreenLiveFrame.mLiveDataModel, scheduleFullScreenLiveFrame.mFrameContext);
            scheduleFullScreenLiveFrame.addFrameInstallTask(bottomSlideNewGuideFrame, bottomSlideNewGuideFrame.getComponentName(), (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_bottom_guide_stub2));
        }
    }

    public void d(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed6f797", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (!hgs.k() || !pmd.a().a("link")) {
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.k().d().a("tl-connect-mic"), "tl-connect-mic", (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_bbconecting_stub));
        }
    }

    public void e(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67351c36", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (hkl.a().b() == null || !hkl.a().b().liveInteractiveManagerNotNull(scheduleFullScreenLiveFrame.mLiveDataModel)) {
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.getFrameContext().k().d().a("dynamic_h5_sdk"), "dynamic_h5_sdk", scheduleFullScreenLiveFrame.getH5RootView(scheduleFullScreenLiveFrame.mContext));
        }
    }
}
