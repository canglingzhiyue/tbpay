package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;

/* loaded from: classes5.dex */
public class mrv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(311899118);
    }

    public void a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        BaseFrame createMediaPlatformFrame2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bc89ba", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (hkl.a().b() == null || (createMediaPlatformFrame2 = hkl.a().b().createMediaPlatformFrame2(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mLandscape, scheduleFullScreenLiveFrame.mLiveDataModel, scheduleFullScreenLiveFrame.mFrameContext)) == null) {
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(createMediaPlatformFrame2, createMediaPlatformFrame2.getComponentName(), null);
        }
    }
}
