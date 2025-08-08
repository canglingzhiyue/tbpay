package com.taobao.android.fluid.business.usertrack.track.ut.videotracker;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.monitor.track.spm.merge.MergeUtil;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.j;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.c;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.weex.common.WXPerformance;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.kzb;
import tb.obu;
import tb.obz;
import tb.ogv;
import tb.psw;
import tb.spz;

/* loaded from: classes5.dex */
public class VideoTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AUTO_SCROLL_VALUE = 0;
    public static final int INTERRUPT_BY_LIST_SCROLL = 2;
    public static final int INTERRUPT_BY_REFRESH = 1;
    public static final String POINT_CACHE_CLEAR = "ggpick_cache_version_clean";
    public static final String PRE_CRETE_AUTO_SCROLL = "pre_crete_auto_scroll";
    private final FluidContext f;
    private kzb g;
    private c.b h;
    private long k;
    private boolean l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private long q;
    private a.d r;
    private String e = "";
    private c i = new c();
    private int j = -1;

    /* renamed from: a  reason: collision with root package name */
    public StringBuilder f12424a = null;
    public float b = 0.0f;
    public long c = 0;
    public String d = "";
    private int s = 1;
    private int t = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface AutoScrollType {
    }

    static {
        kge.a(-1396584343);
    }

    public static /* synthetic */ FluidContext a(VideoTracker videoTracker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("e62717a", new Object[]{videoTracker}) : videoTracker.f;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public VideoTracker(FluidContext fluidContext, psw pswVar) {
        this.f = fluidContext;
        if (pswVar != null) {
            this.g = pswVar.v();
        }
        this.h = ((ITrackService) this.f.getService(ITrackService.class)).getVideoTrackerPageInfo();
        if (this.h == null) {
            this.h = new c.b();
            ((ITrackService) this.f.getService(ITrackService.class)).setVideoTrackerPageInfo(this.h);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        k();
        c.b bVar = this.h;
        if (bVar != null) {
            bVar.f12428a = SystemClock.elapsedRealtime();
            this.h.d = UUID.randomUUID().toString();
            this.h.c = j(str);
        }
        a("info", "page_start", this.e, this.i.a(this.h).a().b().i());
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c.b bVar = this.h;
        if (bVar == null) {
            return;
        }
        bVar.b = SystemClock.elapsedRealtime();
    }

    private boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        c.b bVar = this.h;
        if (bVar == null) {
            return false;
        }
        return bVar.i;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c.b bVar = this.h;
        if (bVar == null) {
            return;
        }
        bVar.i = false;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!m()) {
        } else {
            b();
            c.a f = f();
            f.a(z ? 0L : SystemClock.elapsedRealtime() - this.h.b);
            a("first_video_start_play", f);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        c.b bVar = this.h;
        if (bVar == null) {
            return;
        }
        bVar.e = 0;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        c.b bVar = this.h;
        if (bVar == null) {
            return;
        }
        bVar.j = str;
    }

    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        c.b bVar = this.h;
        if (bVar != null) {
            bVar.f++;
        }
        c cVar = this.i;
        cVar.c = str2;
        c.a e = cVar.a(this.h).a().e();
        if (!StringUtils.isEmpty(str3)) {
            e.b(str3);
        }
        if (!StringUtils.isEmpty(str4)) {
            e.d(str4);
        }
        a("info", str, this.e, e.i());
    }

    public void a(String str, String str2, long j, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695b80f0", new Object[]{this, str, str2, new Long(j), str3, str4, str5, str6});
            return;
        }
        c cVar = this.i;
        cVar.c = str2;
        c.a a2 = cVar.a(this.h).a().e().a(j);
        if (!StringUtils.isEmpty(str3)) {
            a2.a(str3);
        }
        if (!StringUtils.isEmpty(str4)) {
            a2.b(str4);
        }
        if (!StringUtils.isEmpty(str5)) {
            a2.c(str5);
        }
        if (!StringUtils.isEmpty(str6)) {
            a2.d(str6);
        }
        a("info", str, this.e, a2.i());
    }

    public void a(String str, MtopResponse mtopResponse, long j, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646e84b", new Object[]{this, str, mtopResponse, new Long(j), str2, str3, str4});
        } else if (mtopResponse == null) {
        } else {
            this.i.c = mtopResponse.getApi();
            this.i.f = mtopResponse.getRetCode();
            this.i.g = j(mtopResponse.getRetMsg());
            c.a a2 = this.i.a(this.h).a().e().d().a(j);
            if ("rec_mtop_error".equals(str)) {
                FluidContext fluidContext = this.f;
                if (fluidContext != null) {
                    z = ((IInteractionService) fluidContext.getService(IInteractionService.class)).getConfig().m();
                }
                a2.a(String.valueOf(z));
            }
            if (!StringUtils.isEmpty(str2)) {
                a2.b(str2);
            }
            if (!StringUtils.isEmpty(str3)) {
                a2.c(str3);
            }
            if (!StringUtils.isEmpty(str4)) {
                a2.d(str4);
            }
            a("error", str, this.e, a2.i());
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        c.a a2 = this.i.a(this.h).a();
        a2.b.put("httpurl", str2);
        a("info", str, this.e, a2.i());
    }

    public void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        c.a a2 = this.i.a(this.h).a().a(j);
        a2.b.put("httpurl", str2);
        a("info", str, this.e, a2.i());
    }

    public void a(String str, String str2, int i, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b118add3", new Object[]{this, str, str2, new Integer(i), str3, new Long(j)});
            return;
        }
        c.a a2 = this.i.a(this.h).a().a(j);
        a2.b.put("httpurl", str2);
        a2.b.put("code", String.valueOf(i));
        a2.b.put("msg", str3);
        a("error", str, this.e, a2.i());
    }

    public void b(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551fcde7", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        c.a a2 = this.i.a(this.h).a().a(j);
        a2.a(str2);
        a("error", str, this.e, a2.i());
    }

    private void a(final String str, final String str2, final String str3, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{this, str, str2, str3, map});
        } else if (obu.i()) {
            spz.c("VideoTracker", "低端机优化，不发送19997。return。");
        } else {
            d.a(new Runnable() { // from class: com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FluidSDK.getUTAdapter().withFluidContext(VideoTracker.a(VideoTracker.this)).trackCustom("ShortVideoMonitor", 19997, str, str2, str3, map);
                    }
                }
            });
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        this.i.h = UUID.randomUUID().toString();
        if (this.i.y < 0) {
            try {
                this.i.y = 1;
            } catch (Exception unused) {
            }
        }
        i("vv_start");
        return this.i.h;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.i.z = str;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        this.i.i = str;
        c.b bVar = this.h;
        if (bVar == null) {
            return;
        }
        if (bVar.h != null && this.h.h.length() > 0) {
            this.i.j = this.h.h;
        }
        this.h.h = str;
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (this.h == null) {
        } else {
            if (!StringUtils.isEmpty(str)) {
                this.h.k = str;
            }
            if (StringUtils.isEmpty(str2)) {
                return;
            }
            this.h.l = str2;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else if (this.h == null || StringUtils.isEmpty(str)) {
        } else {
            this.h.m = str;
        }
    }

    public Map a(FluidContext fluidContext, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dfb8dea5", new Object[]{this, fluidContext, str, new Boolean(z)});
        }
        HashMap hashMap = new HashMap();
        if (this.h != null && fluidContext != null && fluidContext.getService(IUsePreloadService.class) != null) {
            HashMap<String, String> tab3CacheTrackParams = ((IUsePreloadService) fluidContext.getService(IUsePreloadService.class)).getTab3CacheTrackParams();
            if (!ogv.a(tab3CacheTrackParams)) {
                hashMap.put("isHitCache", tab3CacheTrackParams.get("tab3_use_cache_data"));
            }
            hashMap.put("cacheScene", this.h.m);
            hashMap.put(WXPerformance.CACHE_TYPE, this.h.k);
            hashMap.put(MergeUtil.KEY_EXPOSED, z ? "1" : "0");
            hashMap.put("pre_playerid", str);
        }
        return hashMap;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        c cVar = this.i;
        if (cVar == null || j <= 0) {
            return;
        }
        cVar.w = j;
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else if (this.h == null || StringUtils.isEmpty(str)) {
        } else {
            this.h.o = str;
        }
    }

    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        c.b bVar = this.h;
        if (bVar == null) {
            return;
        }
        String str = "1";
        bVar.p = z ? str : null;
        c.b bVar2 = this.h;
        if (!z || !z2) {
            str = null;
        }
        bVar2.q = str;
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else if (this.h == null || StringUtils.isEmpty(str)) {
        } else {
            this.h.n = str;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.i.d = SystemClock.elapsedRealtime();
        }
        this.i.t = z ? 1 : 0;
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.i.f = String.valueOf(i);
        i(str);
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.i.x = j(j.a(map));
            i("player_qos");
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        StringBuilder sb = this.f12424a;
        if (sb == null || sb.length() <= 0) {
            return;
        }
        c.a f = f();
        f.a(j(this.f12424a.toString()));
        f.b(String.valueOf(Boolean.valueOf(((IMediaService) this.f.getService(IMediaService.class)).getConfig().f())));
        a("buffer_remain_duration", f);
        this.f12424a = new StringBuilder();
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        c.a f = f();
        f.a(str2);
        f.b(str3);
        f.c(str4);
        f.d(str5);
        a(str, f);
    }

    public c.a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.a) ipChange.ipc$dispatch("f38f858a", new Object[]{this}) : this.i.a(this.h);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{this, str, strArr});
            return;
        }
        try {
            c.a f = f();
            char c = 65535;
            switch (str.hashCode()) {
                case -1271786460:
                    if (str.equals("ggpick_cache_video_pdl_fail")) {
                        c = 5;
                        break;
                    }
                    break;
                case -758110180:
                    if (str.equals("ggpick_cache_video_pdl_start")) {
                        c = 3;
                        break;
                    }
                    break;
                case -528545893:
                    if (str.equals("ggpick_cache_hit3")) {
                        c = 7;
                        break;
                    }
                    break;
                case -370940924:
                    if (str.equals("ggpick_cache_video_toobject_fail")) {
                        c = 6;
                        break;
                    }
                    break;
                case 618450480:
                    if (str.equals("ggpick_cache_request_end")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1625560605:
                    if (str.equals("ggpick_cache_request_error")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1630575933:
                    if (str.equals("ggpick_cache_video_pdl_success")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1638533239:
                    if (str.equals("ggpick_cache_request_start")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            String str2 = BaseFBPlugin.PWD_TIPS_TYPE.typeWarning;
            switch (c) {
                case 0:
                    this.i.A = SystemClock.elapsedRealtime();
                    str2 = "info";
                    break;
                case 1:
                    f.a(SystemClock.elapsedRealtime() - this.i.A);
                    str2 = "info";
                    break;
                case 2:
                    f.a(SystemClock.elapsedRealtime() - this.i.A);
                    break;
                case 3:
                    this.i.B = SystemClock.elapsedRealtime();
                    if (!StringUtils.isEmpty(strArr[0])) {
                        f.a(strArr[0]);
                    }
                    if (!StringUtils.isEmpty(strArr[1])) {
                        f.b(strArr[1]);
                    }
                    str2 = "info";
                    break;
                case 4:
                    f.a(SystemClock.elapsedRealtime() - this.i.B);
                    str2 = "info";
                    break;
                case 5:
                    f.a(SystemClock.elapsedRealtime() - this.i.B);
                    if (!StringUtils.isEmpty(strArr[0])) {
                        f.a(strArr[0]);
                    }
                    if (!StringUtils.isEmpty(strArr[1])) {
                        f.b(strArr[1]);
                        break;
                    }
                    break;
                case 6:
                    if (!StringUtils.isEmpty(strArr[0])) {
                        f.a(strArr[0]);
                        break;
                    }
                    break;
                case 7:
                    if (!StringUtils.isEmpty(strArr[0])) {
                        f.a(strArr[0]);
                    }
                    if (!StringUtils.isEmpty(strArr[1])) {
                        f.b(strArr[1]);
                    }
                    if (!StringUtils.isEmpty(strArr[2])) {
                        f.c(strArr[2]);
                    }
                    if (!StringUtils.isEmpty(strArr[3])) {
                        f.d(strArr[3]);
                    }
                    str2 = "info";
                    break;
                default:
                    str2 = "info";
                    break;
            }
            a(str2, str, this.e, f.a().i());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        c.a a2 = f().a();
        a2.a(String.valueOf(i));
        a("info", PRE_CRETE_AUTO_SCROLL, this.e, a2.i());
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
        } else {
            a(str, (c.a) null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
        if (r8.equals("cell_active") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r8, com.taobao.android.fluid.business.usertrack.track.ut.videotracker.c.a r9) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r7
            r1[r3] = r8
            r1[r2] = r9
            java.lang.String r8 = "bbe7f33b"
            r0.ipc$dispatch(r8, r1)
            return
        L18:
            tb.kzb r0 = r7.g
            if (r0 != 0) goto L1e
            r0 = 0
            goto L22
        L1e:
            boolean r0 = r0.f()
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.c r1 = r7.i
            boolean r0 = r0.booleanValue()
            r1.s = r0
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.c r0 = r7.i
            com.taobao.android.fluid.core.FluidContext r1 = r7.f
            int r1 = com.taobao.android.fluid.business.usertrack.track.b.a(r1)
            r0.p = r1
            if (r9 != 0) goto L3e
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.c$a r9 = r7.f()
        L3e:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.c$a r0 = r9.a()
            r0.g()
            r0 = -1
            int r1 = r8.hashCode()
            java.lang.String r6 = "error"
            switch(r1) {
                case -1578631037: goto L8b;
                case -1334679324: goto L81;
                case -965805898: goto L77;
                case 3135262: goto L6d;
                case 96784904: goto L65;
                case 109757344: goto L5a;
                case 2096179127: goto L50;
                default: goto L4f;
            }
        L4f:
            goto L94
        L50:
            java.lang.String r1 = "player_qos"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L94
            r2 = 4
            goto L95
        L5a:
            java.lang.String r1 = "stall"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L94
            r2 = 3
            goto L95
        L65:
            boolean r1 = r8.equals(r6)
            if (r1 == 0) goto L94
            r2 = 0
            goto L95
        L6d:
            java.lang.String r1 = "fail"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L94
            r2 = 1
            goto L95
        L77:
            java.lang.String r1 = "first_frame_rendered"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L94
            r2 = 5
            goto L95
        L81:
            java.lang.String r1 = "first_video_start_play"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L94
            r2 = 6
            goto L95
        L8b:
            java.lang.String r1 = "cell_active"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L94
            goto L95
        L94:
            r2 = -1
        L95:
            switch(r2) {
                case 0: goto Lc5;
                case 1: goto Lbe;
                case 2: goto Lba;
                case 3: goto Lb6;
                case 4: goto Lb2;
                case 5: goto L99;
                case 6: goto L99;
                default: goto L98;
            }
        L98:
            goto Lc9
        L99:
            tb.kzb r0 = r7.g
            if (r0 != 0) goto La0
            r0 = 0
            goto La4
        La0:
            long r0 = r0.e()
        La4:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r0 == 0) goto Lc9
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.a(r0)
            goto Lc9
        Lb2:
            r9.f()
            goto Lc9
        Lb6:
            r9.c()
            goto Lc9
        Lba:
            r9.h()
            goto Lc9
        Lbe:
            r9.d()
            java.lang.String r6 = "warning"
            goto Lcb
        Lc5:
            r9.d()
            goto Lcb
        Lc9:
            java.lang.String r6 = "info"
        Lcb:
            java.lang.String r0 = r7.e
            java.util.Map r9 = r9.i()
            r7.a(r6, r8, r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker.a(java.lang.String, com.taobao.android.fluid.business.usertrack.track.ut.videotracker.c$a):void");
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.j = i;
        this.k = SystemClock.elapsedRealtime();
        i("seek");
    }

    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        c cVar = this.i;
        cVar.l = i2;
        float f = i;
        float f2 = i2;
        cVar.m = Math.round((f * 100.0f) / f2);
        if (this.j >= 0) {
            this.j = -1;
            b(-1L);
            this.p = false;
        }
        try {
            if (this.f12424a == null) {
                this.f12424a = new StringBuilder();
            }
            float f3 = (((i3 / 100.0f) * f2) - f) / 1000.0f;
            if (f3 > 0.0f && (f3 > this.b || SystemClock.elapsedRealtime() - this.c > 1200)) {
                if (this.f12424a.length() > 0) {
                    this.f12424a.append("|");
                }
                this.f12424a.append(String.format("%.1f", Float.valueOf(f3)));
                this.c = SystemClock.elapsedRealtime();
            }
            this.b = f3;
        } catch (Exception unused) {
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.l = true;
        this.m = SystemClock.elapsedRealtime();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.p) {
        } else {
            long j = 0;
            if (this.l) {
                c cVar = this.i;
                cVar.u = 1;
                if (this.m > 0) {
                    j = SystemClock.elapsedRealtime() - this.m;
                }
                cVar.v = j;
            } else if (this.j >= 0) {
                this.p = true;
                c cVar2 = this.i;
                cVar2.u = 2;
                if (this.k > 0) {
                    j = SystemClock.elapsedRealtime() - this.k;
                }
                cVar2.v = j;
            } else {
                this.i.u = 0;
            }
            this.l = false;
            this.n = SystemClock.elapsedRealtime();
            i("stall");
        }
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        if (j > 0) {
            if (this.j >= 0) {
                this.o += j;
                this.q = SystemClock.elapsedRealtime();
            } else {
                this.o = j;
            }
        }
        if (this.n <= 0 || this.j >= 0) {
            return;
        }
        c.a a2 = f().c().a(this.q - this.n);
        long j2 = this.o;
        a("stall_end", a2.a(j2 > 0 ? String.valueOf(j2) : null));
        this.n = 0L;
        this.q = 0L;
        this.o = 0L;
        this.p = false;
    }

    public void a(a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5f4ea4", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            try {
                this.d = dVar.f12530a.a().name;
            } catch (Exception unused) {
            }
            this.r = dVar;
            this.i.n = dVar.a();
            if (dVar.h() == null) {
                return;
            }
            this.i.o = j(obz.a(dVar.h()));
            this.i.l = dVar.h().duration * 1000;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.s = 1;
        } else {
            this.s++;
        }
        this.i.q = this.s;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.t = 0;
        } else {
            this.t++;
        }
        this.i.r = this.t;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        c cVar = this.i;
        cVar.q = this.s;
        cVar.r = this.t;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.s = 1;
        this.t = 0;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        c.b bVar = this.h;
        if (bVar == null) {
            return;
        }
        bVar.f12428a = 0L;
        bVar.b = 0L;
        bVar.c = "";
        bVar.d = "";
        bVar.f = -1;
        bVar.h = "";
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            this.i = new c();
        }
    }

    public static String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a00ca85", new Object[]{str});
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }
}
