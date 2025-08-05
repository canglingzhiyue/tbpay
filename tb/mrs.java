package tb;

import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.comments.messagecard.MessageCardFrame3;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.android.live.plugin.atype.flexalocal.rank.RankEntranceFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* loaded from: classes5.dex */
public final class mrs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long sDelayTime = 0;

    static {
        kge.a(1970481072);
    }

    public void a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bc89ba", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_LEFT_SIDE, ComponentGroupConfig.LEFT_SIDE_FANS_PUSH)) {
        } else {
            scheduleFullScreenLiveFrame.mFrameContext.k().a((BaseFrame) scheduleFullScreenLiveFrame, "tl_7days_subscribe", (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_subscribe_live));
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_LEFT_SIDE, scheduleFullScreenLiveFrame.mFrameContext.k().e().a("tl_7days_subscribe"), "tl_7days_subscribe", (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_subscribe_live));
        }
    }

    public void b(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1aae59", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_LEFT_SIDE, ComponentGroupConfig.LEFT_SIDE_LIVE_QA_BIZ) || !ply.I()) {
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_LEFT_SIDE, scheduleFullScreenLiveFrame.mFrameContext.k().e().a("tl-qa-explain"), "tl-qa-explain", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_qa_explain_stub));
        }
    }

    public void c(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d678d2f8", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame.isLandscape()) {
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.k().e().a("tl-top-select_comment"), "tl-top-select_comment", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_top_select_comment));
            scheduleFullScreenLiveFrame.mFrameContext.a((ViewGroup) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_left_top_container));
        }
    }

    public void d(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        VideoInfo a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed6f797", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (!k.a() || (a2 = k.a(scheduleFullScreenLiveFrame.mLiveDataModel)) == null || a2.fullScreen) {
        } else {
            if ((a2.landScape && poy.e(scheduleFullScreenLiveFrame.mFrameContext)) || scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_LEFT_SIDE, ComponentGroupConfig.LEFT_SIDE_LEFT_NOTICE)) {
                return;
            }
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_LEFT_SIDE, new MessageCardFrame3(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mFrameContext), MessageCardFrame3.class.getSimpleName(), scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_messageCard_stub));
        }
    }

    public void e(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67351c36", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_LEFT_SIDE, ComponentGroupConfig.LEFT_SIDE_LEFT_BANNER) || !hgs.i()) {
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_LEFT_SIDE, new RankEntranceFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.getFrameContext()), RankEntranceFrame.class.getSimpleName(), (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_rank_live_entrance));
        }
    }
}
