package com.taobao.android.fluid.framework.preload.dwinstance;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.monitor.track.spm.merge.MergeUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.c;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import tb.kge;
import tb.obz;
import tb.snv;
import tb.soo;
import tb.sor;
import tb.spz;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BEGIN_USE_CACHE = "begin_use_cache";

    /* renamed from: a  reason: collision with root package name */
    private VideoTracker f12635a;

    static {
        kge.a(-1760438977);
    }

    public VideoTracker a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoTracker) ipChange.ipc$dispatch("6ee5b8d4", new Object[]{this}) : this.f12635a;
    }

    public void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{this, fluidContext});
        } else if (this.f12635a != null) {
        } else {
            this.f12635a = new VideoTracker(fluidContext, null);
            this.f12635a.a("gg_pick_native_cache");
        }
    }

    public void a(VideoTracker videoTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96dac80e", new Object[]{this, videoTracker});
            return;
        }
        spz.a("PreloadVideoTracker", "更新tracker");
        this.f12635a = videoTracker;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r17.equals("ggpick_cache_request_error") != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r17, java.lang.String... r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.fluid.framework.preload.dwinstance.b.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            r5 = 2
            r6 = 1
            r7 = 3
            r8 = 0
            if (r4 == 0) goto L1e
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r8] = r0
            r4[r6] = r1
            r4[r5] = r2
            java.lang.String r1 = "d04957ad"
            r3.ipc$dispatch(r1, r4)
            return
        L1e:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r3 = r0.f12635a
            if (r3 == 0) goto Lb3
            int r4 = r17.hashCode()
            java.lang.String r9 = "ggpick_cache_request_start"
            java.lang.String r10 = "ggpick_cache_video_pdl_success"
            java.lang.String r11 = "ggpick_cache_request_error"
            java.lang.String r12 = "ggpick_cache_request_end"
            java.lang.String r13 = "ggpick_cache_video_toobject_fail"
            java.lang.String r14 = "ggpick_cache_hit3"
            java.lang.String r15 = "ggpick_cache_video_pdl_start"
            java.lang.String r3 = "ggpick_cache_video_pdl_fail"
            switch(r4) {
                case -1271786460: goto L71;
                case -758110180: goto L69;
                case -528545893: goto L61;
                case -370940924: goto L59;
                case 618450480: goto L51;
                case 1625560605: goto L4a;
                case 1630575933: goto L42;
                case 1638533239: goto L3a;
                default: goto L39;
            }
        L39:
            goto L79
        L3a:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L79
            r5 = 0
            goto L7a
        L42:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L79
            r5 = 4
            goto L7a
        L4a:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L79
            goto L7a
        L51:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L79
            r5 = 1
            goto L7a
        L59:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L79
            r5 = 7
            goto L7a
        L61:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L79
            r5 = 6
            goto L7a
        L69:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L79
            r5 = 3
            goto L7a
        L71:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L79
            r5 = 5
            goto L7a
        L79:
            r5 = -1
        L7a:
            switch(r5) {
                case 0: goto Lac;
                case 1: goto La4;
                case 2: goto L9c;
                case 3: goto L96;
                case 4: goto L90;
                case 5: goto L8a;
                case 6: goto L84;
                case 7: goto L7e;
                default: goto L7d;
            }
        L7d:
            goto Lb3
        L7e:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r1 = r0.f12635a
            r1.a(r13, r2)
            goto Lb3
        L84:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r1 = r0.f12635a
            r1.a(r14, r2)
            return
        L8a:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r1 = r0.f12635a
            r1.a(r3, r2)
            return
        L90:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r1 = r0.f12635a
            r1.a(r10, r2)
            return
        L96:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r1 = r0.f12635a
            r1.a(r15, r2)
            return
        L9c:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r1 = r0.f12635a
            java.lang.String[] r2 = new java.lang.String[r8]
            r1.a(r11, r2)
            return
        La4:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r1 = r0.f12635a
            java.lang.String[] r2 = new java.lang.String[r8]
            r1.a(r12, r2)
            return
        Lac:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r1 = r0.f12635a
            java.lang.String[] r2 = new java.lang.String[r8]
            r1.a(r9, r2)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.preload.dwinstance.b.a(java.lang.String, java.lang.String[]):void");
    }

    public String a(FluidContext fluidContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8931d966", new Object[]{this, fluidContext, new Boolean(z)});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(MergeUtil.KEY_EXPOSED, z ? "1" : "0");
        snv dWInstance = ((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).getDWInstance();
        if (dWInstance != null) {
            String h = dWInstance.h();
            if (StringUtils.isEmpty(h)) {
                h = "";
            }
            hashMap.put("pre_playerid", h);
        }
        return obz.a(hashMap);
    }

    public void a(sor sorVar, soo sooVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47b763f", new Object[]{this, sorVar, sooVar, new Boolean(z), new Boolean(z2)});
        } else if (a() == null) {
        } else {
            boolean a2 = c.a(sorVar, sooVar, z);
            a(z2, a2, true);
            spz.c("PreloadVideoTracker", "getCache埋点,isFirstStartRender:" + z2 + ",isAutoScroll:" + a2 + ",enableUseUnexposedCache:true");
        }
    }

    private void a(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271102ec", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        try {
            if (a() == null) {
                return;
            }
            final c.a a2 = a().f().a();
            a2.a(String.valueOf(z));
            a2.b(String.valueOf(z2));
            a2.c(String.valueOf(z3));
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d.a(new Runnable() { // from class: com.taobao.android.fluid.framework.preload.dwinstance.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("ShortVideoMonitor", 19997, "info", b.BEGIN_USE_CACHE, "", a2.i()).build());
                    }
                }
            });
        } catch (Throwable th) {
            spz.a("PreloadVideoTracker", "trackBeginUseCache error", th);
        }
    }
}
