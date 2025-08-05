package com.alibaba.poplayer.layermanager;

import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.Event;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bzz;
import tb.kge;

/* loaded from: classes3.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1541429125);
    }

    public static boolean a(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9690e78", new Object[]{popRequest})).booleanValue();
        }
        try {
            BaseConfigItem c = com.alibaba.poplayer.trigger.d.c(popRequest);
            if (c == null || PopLayer.getReference().getCurrentTimeStamp() <= c.getEndTimeStamp()) {
                return true;
            }
            popRequest.t().T = OnePopModule.OnePopLoseReasonCode.LMLifeCycleCheckFail;
            popRequest.t().U = "endTime";
            if (popRequest instanceof com.alibaba.poplayer.trigger.d) {
                bzz.a((com.alibaba.poplayer.trigger.d) popRequest);
            }
            return false;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("LMConfigCheck.error.", th);
            return true;
        }
    }

    public static boolean b(PopRequest popRequest) {
        Event d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecf42c39", new Object[]{popRequest})).booleanValue();
        }
        try {
            BaseConfigItem c = com.alibaba.poplayer.trigger.d.c(popRequest);
            if (c == null || (d = com.alibaba.poplayer.trigger.d.d(popRequest)) == null || com.alibaba.poplayer.info.frequency.c.a().b(d.curPage, d.curPageUrl, c.layerType)) {
                return true;
            }
            popRequest.t().T = OnePopModule.OnePopLoseReasonCode.LMLifeCycleCheckFail;
            popRequest.t().U = com.taobao.tbpoplayer.info.a.SP_KEY_SCENE_FREQ;
            if (popRequest instanceof com.alibaba.poplayer.trigger.d) {
                bzz.a((com.alibaba.poplayer.trigger.d) popRequest);
            }
            return false;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("LMConfigCheck.error.", th);
            return true;
        }
    }
}
