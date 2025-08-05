package tb;

import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;

/* loaded from: classes5.dex */
public final class mrw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long sDelayTime = 0;

    static {
        kge.a(329702903);
    }

    public void a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bc89ba", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_BOTTOM, ComponentGroupConfig.RIGHT_BOTTOM_RIGHT_GOODS_CARD)) {
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_RIGHT_BOTTOM, scheduleFullScreenLiveFrame.mFrameContext.k().e().a("tl-showcase-common"), "tl-showcase-common", (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_good_showcase_common_stub));
        }
    }
}
