package tb;

import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.ChatFrame3;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.ImportantEventFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;

/* loaded from: classes5.dex */
public final class mrr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long sDelayTime = 0;

    static {
        kge.a(1308150938);
    }

    public void a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bc89ba", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (hkl.a().b() == null || !hkl.a().b().instanceofTBLiveBizDataModel(scheduleFullScreenLiveFrame.mLiveDataModel)) {
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.k().e().a("tl-room-gift"), "tl-room-gift", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_gift_stub));
        }
    }

    public void b(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1aae59", new Object[]{this, scheduleFullScreenLiveFrame});
            return;
        }
        boolean isEntranceHidden = scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_LEFT_BOTTOM, ComponentGroupConfig.LEFT_BOTTOM_GIFT_SHOW);
        boolean isEntranceHidden2 = scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_LEFT_BOTTOM, ComponentGroupConfig.LEFT_BOTTOM_IMPORTANT_NOTICE);
        boolean isEntranceHidden3 = scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_LEFT_BOTTOM, ComponentGroupConfig.LEFT_BOTTOM_ATMOS_ENTER);
        if (!isEntranceHidden && !isEntranceHidden2 && !isEntranceHidden3) {
            z = false;
        }
        if (z || !ply.s() || hkl.a().b() == null || !hkl.a().b().instanceofTBLiveBizDataModel(scheduleFullScreenLiveFrame.mLiveDataModel)) {
            return;
        }
        scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_LEFT_BOTTOM, new ImportantEventFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.getFrameContext()), ImportantEventFrame.class.getSimpleName(), (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_important_event_stub));
    }

    public void c(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d678d2f8", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_LEFT_BOTTOM, ComponentGroupConfig.LEFT_BOTTOM_COMMENTS)) {
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_LEFT_BOTTOM, new ChatFrame3(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.getFrameContext()), ChatFrame3.class.getSimpleName(), (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_msg_stub));
        }
    }
}
