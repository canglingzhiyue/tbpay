package com.taobao.android.fluid.business.usertrack.track.mtop.mtoptracker;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.c;
import com.taobao.android.fluid.framework.analysis.IAnalysisService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.obz;
import tb.spj;
import tb.sps;
import tb.spz;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REASON_LIST_NO_REFRESH = 5;
    public static final int REASON_MTOP_EMPTY = 3;
    public static final int REASON_MTOP_FAIL = 2;
    public static final int REASON_MTOP_NO_DATA = 4;
    public static final int REASON_MTOP_SLOW = 1;
    public static final int REASON_NORMAL = 0;
    public static final int REASON_NOT_REQUEST = -1;

    /* renamed from: com.taobao.android.fluid.business.usertrack.track.mtop.mtoptracker.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0489a {
        @JSONField(name = "visitDep")

        /* renamed from: a  reason: collision with root package name */
        public int f12422a;
        @JSONField(name = "listCount")
        public int b;
        @JSONField(name = "noRecCount")
        public int c;
        @JSONField(name = "noRecCountByFailed")
        public int d;
        @JSONField(name = "noRecCountByEmpty")
        public int e;
        @JSONField(name = "lastNoRecDep")
        public int f;
        @JSONField(name = "lastNoRecReason")
        public int g;

        static {
            kge.a(-134583137);
        }
    }

    static {
        kge.a(-1041439560);
    }

    public static int a(boolean z, boolean z2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2710c30e", new Object[]{new Boolean(z), new Boolean(z2), new Integer(i)})).intValue();
        }
        if (z) {
            return 1;
        }
        if (!z2) {
            return i;
        }
        return 4;
    }

    private static C0489a c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0489a) ipChange.ipc$dispatch("818f0f27", new Object[]{fluidContext});
        }
        if (!a()) {
            return null;
        }
        C0489a c = ((IAnalysisService) fluidContext.getService(IAnalysisService.class)).getConfig().c();
        if (c != null) {
            return c;
        }
        C0489a c0489a = new C0489a();
        ((IAnalysisService) fluidContext.getService(IAnalysisService.class)).getConfig().a(c0489a);
        return c0489a;
    }

    public static void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{fluidContext});
            return;
        }
        C0489a c = c(fluidContext);
        if (c == null) {
            return;
        }
        a(fluidContext, c);
        ExpMonitorRequest expMonitorRequest = new ExpMonitorRequest();
        expMonitorRequest.sid = d.b(fluidContext);
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams != null) {
            expMonitorRequest.source = sessionParams.c;
            expMonitorRequest.type = sessionParams.b;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("recommendResultScene", c);
        String a2 = obz.a(hashMap);
        spz.c("ExpMonitorUtils", "body=" + a2);
        expMonitorRequest.body = a2;
        FluidSDK.getMTopAdapter().send(c.a.a().a(expMonitorRequest).a(new IMTopAdapter.b() { // from class: com.taobao.android.fluid.business.usertrack.track.mtop.mtoptracker.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                }
            }

            @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
            public void a(MtopResponse mtopResponse, BaseOutDo baseOutDo) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5b39cfcd", new Object[]{this, mtopResponse, baseOutDo});
                }
            }
        }).b(true).b());
    }

    public static void b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4da19b", new Object[]{fluidContext});
        } else if (!spj.d(fluidContext)) {
        } else {
            a(fluidContext);
        }
    }

    public static void a(FluidContext fluidContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68bd5ea9", new Object[]{fluidContext, new Integer(i)});
            return;
        }
        C0489a c = c(fluidContext);
        if (c == null || c.f12422a >= i) {
            return;
        }
        c.f12422a = i;
    }

    public static void a(FluidContext fluidContext, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeee97a", new Object[]{fluidContext, new Integer(i), new Integer(i2)});
            return;
        }
        C0489a c = c(fluidContext);
        if (c == null) {
            return;
        }
        c.c++;
        if (i2 == 2) {
            c.d++;
        } else if (i2 == 3) {
            c.e++;
        }
        c.f = i;
        c.g = i2;
        spz.c("ExpMonitorUtils", "setNoRec: dep=" + i + " reason=" + i2);
    }

    private static void a(FluidContext fluidContext, C0489a c0489a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd72087", new Object[]{fluidContext, c0489a});
        } else if (c0489a == null) {
        } else {
            c0489a.b = ((IDataService) fluidContext.getService(IDataService.class)).getTotalCount();
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableExpMonitor", true);
    }
}
