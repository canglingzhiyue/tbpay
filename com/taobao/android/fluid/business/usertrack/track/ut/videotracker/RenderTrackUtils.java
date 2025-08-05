package com.taobao.android.fluid.business.usertrack.track.ut.videotracker;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import tb.kge;
import tb.obz;
import tb.psw;
import tb.skl;
import tb.spj;
import tb.spz;

/* loaded from: classes5.dex */
public class RenderTrackUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String detailEnd = "detailEnd";
    public static final String detailStart = "detailStart";
    public static final String pageCreate = "pageCreate";
    public static final String pageNav = "pageNav";
    public static final String renderEnd = "renderEnd";
    public static final String renderStart = "renderStart";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface TimePoint {
    }

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f12423a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;

        static {
            kge.a(-584455904);
        }
    }

    static {
        kge.a(-1018802040);
    }

    public static void a(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab43ee4", new Object[]{fluidContext, str});
        } else if (com.taobao.android.fluid.business.usertrack.track.b.a(fluidContext) > 0) {
        } else {
            a trackerRenderInfo = ((ITrackService) fluidContext.getService(ITrackService.class)).getTrackerRenderInfo();
            if (trackerRenderInfo == null) {
                trackerRenderInfo = new a();
                ((ITrackService) fluidContext.getService(ITrackService.class)).setTrackerRenderInfo(trackerRenderInfo);
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -2061154671:
                    if (str.equals(detailStart)) {
                        c = 2;
                        break;
                    }
                    break;
                case -1973105974:
                    if (str.equals(detailEnd)) {
                        c = 3;
                        break;
                    }
                    break;
                case -1638653844:
                    if (str.equals("renderStart")) {
                        c = 4;
                        break;
                    }
                    break;
                case -803565548:
                    if (str.equals(pageNav)) {
                        c = 0;
                        break;
                    }
                    break;
                case 826837099:
                    if (str.equals(pageCreate)) {
                        c = 1;
                        break;
                    }
                    break;
                case 1839619941:
                    if (str.equals(renderEnd)) {
                        c = 5;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                Long valueOf = Long.valueOf(((ITrackService) fluidContext.getService(ITrackService.class)).getNavElapsdorealTime());
                if (valueOf.longValue() <= 0) {
                    valueOf = Long.valueOf(SystemClock.elapsedRealtime());
                }
                trackerRenderInfo.f12423a = valueOf.longValue();
            } else if (c == 1) {
                trackerRenderInfo.b = SystemClock.elapsedRealtime();
            } else if (c == 2) {
                trackerRenderInfo.c = SystemClock.elapsedRealtime();
            } else if (c == 3) {
                trackerRenderInfo.d = SystemClock.elapsedRealtime();
            } else if (c == 4) {
                trackerRenderInfo.e = SystemClock.elapsedRealtime();
            } else if (c != 5) {
            } else {
                trackerRenderInfo.f = SystemClock.elapsedRealtime();
            }
        }
    }

    public static void a(FluidContext fluidContext, psw pswVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4edb36ca", new Object[]{fluidContext, pswVar, str, str2});
            return;
        }
        a trackerRenderInfo = ((ITrackService) fluidContext.getService(ITrackService.class)).getTrackerRenderInfo();
        if (trackerRenderInfo == null) {
            return;
        }
        try {
            HashMap hashMap = new HashMap(7);
            hashMap.put("beforeCreate", Long.valueOf(trackerRenderInfo.b - trackerRenderInfo.f12423a));
            hashMap.put("beforeDetail", Long.valueOf(trackerRenderInfo.c - trackerRenderInfo.b));
            hashMap.put("detailCost", Long.valueOf(trackerRenderInfo.d - trackerRenderInfo.c));
            hashMap.put("beforeRender", Long.valueOf(trackerRenderInfo.e - trackerRenderInfo.d));
            hashMap.put("renderCost", Long.valueOf(trackerRenderInfo.f - trackerRenderInfo.e));
            hashMap.put("totalCost", Long.valueOf(trackerRenderInfo.f - trackerRenderInfo.b));
            hashMap.put("totalCostNav", Long.valueOf(trackerRenderInfo.f - trackerRenderInfo.f12423a));
            hashMap.put("isTab3", Boolean.valueOf(spj.d(fluidContext)));
            skl j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
            if (str.equals("interact_first_cost")) {
                hashMap.put(IStorage.TYPE_DSL, j.d);
            } else {
                hashMap.put(IStorage.TYPE_DSL, j.g);
            }
            hashMap.put("contentId", str2);
            String a2 = obz.a(hashMap);
            spz.a("RenderTrackUtils", "report json:" + a2);
            boolean k = ((IUsePreloadService) fluidContext.getService(IUsePreloadService.class)).getConfig().k();
            boolean isFragmentMode = fluidContext.getInstanceConfig().isFragmentMode();
            boolean isQuickOpenMode = ((IQuickOpenService) fluidContext.getService(IQuickOpenService.class)).isQuickOpenMode();
            spz.c("RenderTrackUtils", "report enablePrefetchMtop:" + k + " enableFragment:" + isFragmentMode + " enableQuickOpen:" + isQuickOpenMode);
            d.a(pswVar, str, String.valueOf(k), String.valueOf(isFragmentMode), String.valueOf(isQuickOpenMode), a2);
        } catch (Exception e) {
            spz.c("RenderTrackUtils", "report e:" + e.getMessage());
        }
    }
}
