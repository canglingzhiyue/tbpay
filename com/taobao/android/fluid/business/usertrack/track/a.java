package com.taobao.android.fluid.business.usertrack.track;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(870622136);
    }

    public static long a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fc4078e", new Object[]{fluidContext})).longValue();
        }
        PageStartTimeBean pageCreateTimeBean = ((ITrackService) fluidContext.getService(ITrackService.class)).getPageCreateTimeBean();
        if (pageCreateTimeBean != null) {
            return pageCreateTimeBean.pageStartTime;
        }
        return 0L;
    }

    public static PageStartTimeBean b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageStartTimeBean) ipChange.ipc$dispatch("7adc8ea6", new Object[]{fluidContext});
        }
        long navStartTime = ((ITrackService) fluidContext.getService(ITrackService.class)).getNavStartTime();
        if (navStartTime <= 0) {
            PageStartTimeBean pageCreateTimeBean = ((ITrackService) fluidContext.getService(ITrackService.class)).getPageCreateTimeBean();
            return pageCreateTimeBean == null ? new PageStartTimeBean() : pageCreateTimeBean;
        }
        PageStartTimeBean pageStartTimeBean = new PageStartTimeBean();
        pageStartTimeBean.pageStartTime = navStartTime;
        return pageStartTimeBean;
    }
}
