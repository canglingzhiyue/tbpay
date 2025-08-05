package tb;

import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.b;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.morelive.a;
import com.taobao.taolive.sdk.morelive.e;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.sdk.utils.y;

/* loaded from: classes5.dex */
public class mrx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long sDelayTime = 0;

    static {
        kge.a(1557977971);
    }

    public void a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame, boolean z) {
        a c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d5605a", new Object[]{this, scheduleFullScreenLiveFrame, new Boolean(z)});
        } else if (!u.Q() || z || scheduleFullScreenLiveFrame.getFrameContext().m() || (c = e.a().c()) == null || scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_LIVE_MORE_ENTRANCE)) {
        } else {
            scheduleFullScreenLiveFrame.mMoreLiveRightGuideFrame = c.a(scheduleFullScreenLiveFrame.mContext, false, scheduleFullScreenLiveFrame.mLiveDataModel, scheduleFullScreenLiveFrame.getFrameContext());
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_RIGHT_SIDE, scheduleFullScreenLiveFrame.mMoreLiveRightGuideFrame, mrn.MoreLiveGuideFrame, (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_more_live_guide_stub));
        }
    }

    public void a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bc89ba", new Object[]{this, scheduleFullScreenLiveFrame});
            return;
        }
        try {
            if (scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_LIVE_WATER_MARK)) {
                return;
            }
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_RIGHT_SIDE, scheduleFullScreenLiveFrame.mFrameContext.k().e().a("tl-watermark"), "tl-watermark", (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_room_watermark));
        } catch (Exception e) {
            q.b("RightTopGroupFrames", "initRoomWatermark exp :" + e.getMessage());
        }
    }

    public void b(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1aae59", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_VIRTUAL_HOST_TAG) || scheduleFullScreenLiveFrame.mLiveDetailData.roomType != 8888) {
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_RIGHT_SIDE, scheduleFullScreenLiveFrame.mFrameContext.k().e().a("tl-virtual-anchor"), "tl-virtual-anchor", (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_virtual_anchor_stub));
        }
    }

    public void c(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d678d2f8", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if ((!hgs.x() && b.a().b(scheduleFullScreenLiveFrame.mLiveDataModel)) || scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_TOP, ComponentGroupConfig.TOP_INTIMACY_ENTRANCE)) {
        } else {
            if ((!y.b(scheduleFullScreenLiveFrame.mContext) && !y.c(scheduleFullScreenLiveFrame.mContext) && scheduleFullScreenLiveFrame.isLandscape()) || hkl.a().b() == null || !hkl.a().b().liveInteractiveManagerNotNull(scheduleFullScreenLiveFrame.mLiveDataModel)) {
                return;
            }
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_TOP, scheduleFullScreenLiveFrame.getFrameContext().k().d().a("tl-intimacy"), "tl-intimacy", (ViewGroup) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_interactive_system_frame));
        }
    }

    public void d(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed6f797", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_INTERACTION_ENTRANCE) || hkl.a().b() == null || !hkl.a().b().liveInteractiveManagerNotNull(scheduleFullScreenLiveFrame.mLiveDataModel)) {
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_RIGHT_SIDE, scheduleFullScreenLiveFrame.getFrameContext().k().d().a("tl-interactive-entrance"), "tl-interactive-entrance", (ViewGroup) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_interactive_right_frame));
        }
    }
}
