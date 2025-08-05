package tb;

import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.banner.TaoLiveBannerFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.b;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.TopFakeBarFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;

/* loaded from: classes5.dex */
public final class mry {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long sDelayTime = 0;

    static {
        kge.a(-1917458359);
    }

    public void a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bc89ba", new Object[]{this, scheduleFullScreenLiveFrame});
            return;
        }
        if (plz.a(scheduleFullScreenLiveFrame.mLiveDetailData) && !scheduleFullScreenLiveFrame.mLandscape) {
            TaoLiveBannerFrame taoLiveBannerFrame = new TaoLiveBannerFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mFrameContext);
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_TOP, taoLiveBannerFrame, taoLiveBannerFrame.getComponentName(), (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_topbar_stub2));
        }
        if (!scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_TOP, ComponentGroupConfig.TOP_ACCOUNT_INFO)) {
            BaseFrame a2 = scheduleFullScreenLiveFrame.mFrameContext.k().e().a("tl-top-bar");
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_TOP, a2, a2.getComponentName(), (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_topbar_stub2));
        } else if (!TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.name().equals(scheduleFullScreenLiveFrame.mFrameContext.n.bizCode) && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.name().equals(scheduleFullScreenLiveFrame.mFrameContext.n.bizCode)) {
        } else {
            TopFakeBarFrame topFakeBarFrame = new TopFakeBarFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mFrameContext);
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_TOP, topFakeBarFrame, topFakeBarFrame.getComponentName(), (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_topbar_stub2));
            BaseFrame a3 = scheduleFullScreenLiveFrame.mFrameContext.k().e().a("tl-top-bar");
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_TOP, a3, a3.getComponentName(), (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_topbar_stub2));
        }
    }

    public void b(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1aae59", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (b.a().a(scheduleFullScreenLiveFrame.mFrameContext, scheduleFullScreenLiveFrame.mLiveDataModel) || !b.a().a(scheduleFullScreenLiveFrame.mLiveDataModel)) {
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.k().e().a("tl-official-live-entry"), "tl-official-live-entry", (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_official_live_entry_stub));
        }
    }
}
