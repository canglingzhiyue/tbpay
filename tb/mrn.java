package tb;

import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.FluidTaskConfig;
import com.taobao.android.live.plugin.atype.flexalocal.comments.messagecard.MessageCardFrame3;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.tbliveinteractive.view.system_component.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class mrn implements mri {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MoreLiveGuideFrame = "TaoMoreLiveRightGuideFrame";

    static {
        kge.a(-1519757688);
        kge.a(-712267529);
    }

    @Override // tb.mri
    public List<FluidTaskConfig> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FluidTaskConfig("tl-chat", 500L, "background"));
        arrayList.add(new FluidTaskConfig(f.TAG, 1500L, "main"));
        arrayList.add(new FluidTaskConfig("RankEntranceFrame", 1500L, "main"));
        arrayList.add(new FluidTaskConfig(MessageCardFrame3.TAG, 1500L, "main"));
        arrayList.add(new FluidTaskConfig(MoreLiveGuideFrame, 2000L, "main"));
        arrayList.add(new FluidTaskConfig("tl-important-event", Constants.STARTUP_TIME_LEVEL_1, "background"));
        if (p.B()) {
            arrayList.add(new FluidTaskConfig("tl-favor-anim", 3100L, "main"));
        }
        return arrayList;
    }
}
