package com.taobao.phenix.compat.stat;

import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.r;
import com.taobao.message.activity.LoadingChatActivity;
import com.taobao.pexode.d;
import com.taobao.pexode.decoder.AvifDecoder;
import com.taobao.phenix.compat.k;
import com.taobao.phenix.decode.DecodeException;
import com.taobao.phenix.loader.network.HttpCodeResponseException;
import com.taobao.phenix.loader.network.IncompleteResponseException;
import com.taobao.phenix.loader.network.NetworkResponseException;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.rxm.schedule.e;
import java.util.Map;
import tb.ado;
import tb.esr;
import tb.mto;
import tb.mys;
import tb.nec;
import tb.nhx;
import tb.niw;
import tb.riy;
import tb.tms;

/* loaded from: classes.dex */
public class TBImageFlowMonitor extends e implements d.a, AvifDecoder.a, com.taobao.phenix.request.a, e.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String[] c = {"heic.alicdn.com", "img.alicdn.com", "gw.alicdn.com", "picasso.alicdn.com", "avif.picasso.taobao.com"};
    public int b;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private final c h;
    private boolean i;
    private a j;
    private d k;
    private int l;
    private int m;
    private g n;

    /* renamed from: com.taobao.phenix.compat.stat.TBImageFlowMonitor$4  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18915a = new int[ImageStatistics.FromType.values().length];

        static {
            try {
                f18915a[ImageStatistics.FromType.FROM_LOCAL_FILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18915a[ImageStatistics.FromType.FROM_DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18915a[ImageStatistics.FromType.FROM_LARGE_SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18915a[ImageStatistics.FromType.FROM_NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(TBImageFlowMonitor tBImageFlowMonitor, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.phenix.request.a
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        return 150;
    }

    public static /* synthetic */ void a(TBImageFlowMonitor tBImageFlowMonitor, ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aedaf1b1", new Object[]{tBImageFlowMonitor, imageStatistics});
        } else {
            tBImageFlowMonitor.f(imageStatistics);
        }
    }

    public static /* synthetic */ void a(TBImageFlowMonitor tBImageFlowMonitor, ImageStatistics imageStatistics, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f903aae4", new Object[]{tBImageFlowMonitor, imageStatistics, th});
        } else {
            tBImageFlowMonitor.b(imageStatistics, th);
        }
    }

    public static /* synthetic */ void b(TBImageFlowMonitor tBImageFlowMonitor, ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("760a3dd0", new Object[]{tBImageFlowMonitor, imageStatistics});
        } else {
            tBImageFlowMonitor.g(imageStatistics);
        }
    }

    public TBImageFlowMonitor(int i, int i2, c cVar, g gVar) {
        this.h = cVar;
        this.b = i;
        this.m = i2;
        this.n = gVar;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185b3ff2", new Object[]{this, aVar});
            return;
        }
        this.j = aVar;
        niw.b("FlowMonitor", "set navigation info obtainer=%s", aVar);
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185c9d0f", new Object[]{this, dVar});
        } else {
            this.k = dVar;
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        ImageSizeWarningException.access$002(i);
        niw.b("FlowMonitor", "set image warning size=%d", Integer.valueOf(i));
    }

    private void d(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc336c4", new Object[]{this, imageStatistics});
        } else if (!imageStatistics.n) {
        } else {
            if (!this.d) {
                h();
            }
            if (imageStatistics.l() == null || StringUtils.isEmpty(imageStatistics.l().get("max-age"))) {
                return;
            }
            String b = b(imageStatistics.p().g());
            DimensionValueSet create = DimensionValueSet.create();
            MeasureValueSet create2 = MeasureValueSet.create();
            create.setValue("maxAge", imageStatistics.l().get("max-age"));
            create.setValue("eagleId", imageStatistics.l().get(HttpConstant.EAGLE_EYE_ID_3));
            create.setValue("url", b);
            AppMonitor.Stat.commit("ImageLib_Rx", "ImageTTLException", create, create2);
        }
    }

    private synchronized void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.d) {
        } else {
            niw.a("FlowMonitor", "TTL exception register start", new Object[0]);
            DimensionSet create = DimensionSet.create();
            create.addDimension("url");
            create.addDimension("eagleId");
            create.addDimension("maxAge");
            AppMonitor.register("ImageLib_Rx", "ImageTTLException", (MeasureSet) null, create);
            this.d = true;
            niw.a("FlowMonitor", "TTL exception register end", new Object[0]);
        }
    }

    private synchronized void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.e) {
        } else {
            DimensionSet create = DimensionSet.create();
            create.addDimension("bizName");
            create.addDimension("pageName");
            create.addDimension("pageURL");
            create.addDimension("originalURL");
            create.addDimension("errorCode");
            AppMonitor.register("ImageLib_Rx", "InvalidParam", (MeasureSet) null, create);
            this.e = true;
        }
    }

    private synchronized void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.f) {
        } else {
            DimensionSet create = DimensionSet.create();
            create.addDimension("remoteSoLoadSuccess");
            create.addDimension("remoteSoRetryIndex");
            AppMonitor.register("ImageLib_Rx", "RemoteSo", (MeasureSet) null, create);
        }
    }

    private void b(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ff4858", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        if (!this.f) {
            j();
        }
        DimensionValueSet create = DimensionValueSet.create();
        MeasureValueSet create2 = MeasureValueSet.create();
        create.setValue("remoteSoLoadSuccess", z ? "1" : "0");
        create.setValue("remoteSoRetryIndex", String.valueOf(i));
        AppMonitor.Stat.commit("ImageLib_Rx", "RemoteSo", create, create2);
    }

    private void e(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68dd8a3", new Object[]{this, imageStatistics});
            return;
        }
        if (!this.e) {
            i();
        }
        if (imageStatistics == null) {
            return;
        }
        String b = b(a(imageStatistics.l()));
        String b2 = b(imageStatistics.p().g());
        if (StringUtils.isEmpty(b) && StringUtils.isEmpty(b2)) {
            i = 0;
        } else if (StringUtils.isEmpty(b) || !b.equals(b2)) {
            i = -1;
        }
        if (i == -1) {
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        MeasureValueSet create2 = MeasureValueSet.create();
        create.setValue("bizName", imageStatistics.b);
        a aVar = this.j;
        if (aVar != null) {
            create.setValue("pageName", aVar.a());
            create.setValue("pageURL", this.j.b());
        }
        create.setValue("originalURL", b);
        create.setValue("errorCode", String.valueOf(i));
        AppMonitor.Stat.commit("ImageLib_Rx", "InvalidParam", create, create2);
    }

    @Override // com.taobao.phenix.compat.stat.e
    public synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f18917a) {
        } else {
            niw.a("FlowMonitor", "image flow register start", new Object[0]);
            DimensionSet create = DimensionSet.create();
            create.addDimension("domain");
            create.addDimension("error");
            create.addDimension("bizName");
            create.addDimension("format");
            create.addDimension("dataFrom");
            create.addDimension("scheduleFactor");
            create.addDimension("hitCdnCache");
            create.addDimension("hitFuzzyMemoryCache");
            create.addDimension("connectType");
            create.addDimension("cdnIpPort");
            create.addDimension("windowName");
            create.addDimension("naviUrl");
            create.addDimension("pageURL");
            create.addDimension("launchType");
            create.addDimension("appLaunchExternal");
            create.addDimension("sinceLastLaunchInternal");
            create.addDimension("sinceAppLaunchInterval");
            create.addDimension("deviceLevel");
            create.addDimension("bucketInfo");
            create.addDimension("yixiuBucket");
            create.addDimension("newThreadModel");
            create.addDimension("sdkInitTime");
            create.addDimension("requestStartTime");
            create.addDimension("RequestUrl");
            create.addDimension(LoadingChatActivity.LOAD_CHAT_KEY);
            create.addDimension("ttlExperimentId");
            create.addDimension("ttlGetTime");
            create.addDimension("ttlPutTime");
            create.addDimension("hasIcc");
            create.addDimension("skipAlivfs");
            create.addDimension("alivfsTimeout");
            create.addDimension("detectAlivfs");
            create.addDimension("recoverAlivfs");
            create.addDimension("recDataStart");
            create.addDimension("recDataEnd");
            create.addDimension("analysisErrorCode");
            create.addDimension("skipAutoSize");
            create.addDimension("skipStrageConfig");
            create.addDimension("via");
            create.addDimension("convert_format");
            create.addDimension("heicCodecReady");
            create.addDimension("isRetrying");
            create.addDimension("decoder");
            create.addDimension("imageGrayTraffic");
            create.addDimension("cache_control");
            create.addDimension("decideUrlTime");
            MeasureSet create2 = MeasureSet.create();
            a(create2, ImageStatistics.KEY_READ_MEMORY_CACHE, Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            a(create2, ImageStatistics.KEY_READ_DISK_CACHE, Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            a(create2, ImageStatistics.KEY_READ_LOCAL_FILE, Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            a(create2, "connect", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            a(create2, "download", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            a(create2, "decode", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            a(create2, ImageStatistics.KEY_BITMAP_SCALE, Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            a(create2, ImageStatistics.KEY_SCHEDULE_TIME, Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            a(create2, ImageStatistics.KEY_WAIT_FOR_MAIN, Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            a(create2, "totalTime", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(60000.0d));
            a(create2, "size", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), null, null);
            a(create2, "speed", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), null, null);
            a(create2, ImageStatistics.KEY_MASTER_WAIT_SIZE, Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), null, null);
            a(create2, ImageStatistics.KEY_NETWORK_WAIT_SIZE, Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), null, null);
            a(create2, ImageStatistics.KEY_DECODE_WAIT_SIZE, Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), null, null);
            a(create2, "firstData", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            a(create2, "sendBefore", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            a(create2, ZimMessageChannel.K_RPC_RES_CODE, Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            a(create2, "serverRT", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            a(create2, "processTimeOfContainer", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            a(create2, "totalTimeOfContainer", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(60000.0d));
            AppMonitor.register("ImageLib_Rx", "ImageFlow", create2, create);
            AppMonitor.register("ImageLib_Rx", "ImageFlowForLowDevice", create2, create);
            AppMonitor.register("ImageLib_Rx", "ImageFlowForRNF", create2, create);
            this.f18917a = true;
            niw.a("FlowMonitor", "image flow register end", new Object[0]);
        }
    }

    public synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.i) {
        } else {
            niw.a("FlowMonitor", "image error register start", new Object[0]);
            DimensionSet create = DimensionSet.create();
            create.addDimension("url");
            create.addDimension("windowName");
            create.addDimension("naviUrl");
            create.addDimension("bizName");
            create.addDimension("analysisErrorCode");
            create.addDimension("originErrorCode");
            create.addDimension("desc");
            create.addDimension("format");
            create.addDimension("dataFrom");
            create.addDimension("originUrl");
            create.addDimension("pageURL");
            AppMonitor.register("ImageLib_Rx", "ImageError", (MeasureSet) null, create);
            this.i = true;
            niw.a("FlowMonitor", "image error register end", new Object[0]);
        }
    }

    private static String a(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(ado.URL_SEPARATOR)) {
            i = 2;
        } else {
            int indexOf = str.indexOf(HttpConstant.SCHEME_SPLIT);
            i = indexOf < 0 ? 0 : indexOf + 3;
        }
        if (i >= str.length()) {
            return "";
        }
        int indexOf2 = str.indexOf(47, i);
        if (indexOf2 < 0) {
            indexOf2 = str.length();
        }
        String substring = str.substring(i, indexOf2);
        return (substring.contains(riy.BLOCK_START_STR) || substring.contains(",") || !substring.contains(".")) ? "" : substring;
    }

    private String a(Map<String, String> map, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d0668d9", new Object[]{this, map, str}) : (map == null || (str2 = map.get(str)) == null) ? "" : str2;
    }

    private String a(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map}) : (map == null || (str = map.get("origin_url")) == null) ? "" : str;
    }

    private String b(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("154c93a4", new Object[]{this, map}) : (map == null || (str = map.get("p_trace_id")) == null) ? "" : str;
    }

    private String d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c9c3aa6", new Object[]{this, map});
        }
        if (map != null) {
            try {
                String str = map.get(this.h.a());
                if (str != null) {
                    return str;
                }
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    private int a(MeasureValueSet measureValueSet, String str, Map<String, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3854d8f5", new Object[]{this, measureValueSet, str, map})).intValue();
        }
        Integer num = map.get(str);
        if (num == null) {
            return 0;
        }
        measureValueSet.setValue(str, num.intValue());
        return num.intValue();
    }

    private String c(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28f46725", new Object[]{this, map});
        }
        if (map == null || (str = map.get("pageURL")) == null || StringUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf(63, 0);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return str.substring(0, indexOf);
    }

    @Override // com.taobao.phenix.request.a
    public void a(final ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef635127", new Object[]{this, imageStatistics});
        } else {
            k.a(new Runnable() { // from class: com.taobao.phenix.compat.stat.TBImageFlowMonitor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TBImageFlowMonitor.a(TBImageFlowMonitor.this, imageStatistics);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f(com.taobao.phenix.request.ImageStatistics r26) {
        /*
            Method dump skipped, instructions count: 1337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.phenix.compat.stat.TBImageFlowMonitor.f(com.taobao.phenix.request.ImageStatistics):void");
    }

    private void a(ImageStatistics imageStatistics, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd07868d", new Object[]{this, imageStatistics, new Boolean(z)});
            return;
        }
        try {
            nec n = imageStatistics.n();
            if (n != null && n.a().equals("WEBP")) {
                String g = imageStatistics.p().g();
                String a2 = a(g);
                String[] strArr = c;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z2 = false;
                        break;
                    } else if (StringUtils.equals(strArr[i], a2)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (z2) {
                    return;
                }
                k();
                DimensionValueSet create = DimensionValueSet.create();
                MeasureValueSet create2 = MeasureValueSet.create();
                String b = b(g);
                String b2 = b(a(imageStatistics.l()));
                ImageStatistics.FromType b3 = imageStatistics.b();
                create.setValue("domain", a2);
                create.setValue("error", z ? "0" : "1");
                create.setValue("bizName", a(imageStatistics.l(), esr.BUNDLE_BIZ_CODE));
                create.setValue("format", n.b());
                create.setValue("dataFrom", String.valueOf(b3.value));
                create.setValue("RequestUrl", b);
                create.setValue(LoadingChatActivity.LOAD_CHAT_KEY, b2);
                AppMonitor.Stat.commit("ImageLib_Rx", "WebpImage", create, create2);
            }
        } catch (Throwable unused) {
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.g) {
        } else {
            niw.d("FlowMonitor", "registerWebpFormatMonitor register start", new Object[0]);
            DimensionSet create = DimensionSet.create();
            create.addDimension("domain");
            create.addDimension("error");
            create.addDimension("bizName");
            create.addDimension("format");
            create.addDimension("dataFrom");
            create.addDimension("RequestUrl");
            create.addDimension(LoadingChatActivity.LOAD_CHAT_KEY);
            AppMonitor.register("ImageLib_Rx", "WebpImage", MeasureSet.create(), create);
            this.g = true;
            niw.a("FlowMonitor", "registerWebpFormatMonitor register end", new Object[0]);
        }
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : StringUtils.isEmpty(str) ? "" : str.length() > 256 ? str.substring(0, 256) : str;
    }

    private void a(String str, int i, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6348715c", new Object[]{this, str, new Integer(i), new Integer(i2), str2});
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (str2 == null) {
                AppMonitor.Alarm.commitSuccess("ImageLib_Rx", str);
            } else {
                AppMonitor.Alarm.commitSuccess("ImageLib_Rx", str, str2);
            }
        }
        for (int i4 = 0; i4 < i2; i4++) {
            if (str2 == null) {
                AppMonitor.Alarm.commitFail("ImageLib_Rx", str, null, null);
            } else {
                AppMonitor.Alarm.commitFail("ImageLib_Rx", str, str2, null, null);
            }
        }
    }

    public String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{this, th});
        }
        return ((th instanceof DecodeException) || (th instanceof NetworkResponseException)) ? b(th) : "";
    }

    @Override // com.taobao.phenix.request.a
    public void a(final ImageStatistics imageStatistics, final Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f60b12e", new Object[]{this, imageStatistics, th});
        } else {
            k.a(new Runnable() { // from class: com.taobao.phenix.compat.stat.TBImageFlowMonitor.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TBImageFlowMonitor.a(TBImageFlowMonitor.this, imageStatistics, th);
                    }
                }
            });
        }
    }

    @Override // com.taobao.phenix.request.a
    public void a(ImageStatistics imageStatistics, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c33ebb", new Object[]{this, imageStatistics, str, str2});
        } else if (!com.taobao.phenix.compat.d.f18891a) {
        } else {
            try {
                if (StringUtils.equals(str, nhx.f31473a)) {
                    tms.a("picture", imageStatistics.p().g(), 0);
                } else if (StringUtils.equals(str, nhx.g)) {
                    tms.b("picture", imageStatistics.p().g(), 0);
                }
                Object obj = imageStatistics.x;
                if (!(obj instanceof com.taobao.analysis.v3.k)) {
                    return;
                }
                ((com.taobao.analysis.v3.k) obj).a("module=picture,stage=" + str + ",content=" + str2);
            } catch (Throwable th) {
                niw.d(FullTraceAnalysis.TAG, "log " + imageStatistics.f18937a + ", picture, " + str + ", " + str2 + ", ", th);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x033a, code lost:
        if (r3 != null) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(com.taobao.phenix.request.ImageStatistics r24, java.lang.Throwable r25) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.phenix.compat.stat.TBImageFlowMonitor.b(com.taobao.phenix.request.ImageStatistics, java.lang.Throwable):void");
    }

    private String b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5451674", new Object[]{this, th});
        }
        if (th instanceof IncompleteResponseException) {
            return "101010";
        }
        if (th instanceof HttpCodeResponseException) {
            int httpCode = ((HttpCodeResponseException) th).getHttpCode();
            return httpCode == 404 ? "102010" : httpCode == 503 ? "103010" : "104000";
        }
        if (th instanceof ImageSizeWarningException) {
            int access$400 = ImageSizeWarningException.access$400((ImageSizeWarningException) th);
            if (access$400 > 0 && access$400 < 2) {
                return "801010";
            }
            if (access$400 >= 2 && access$400 < 4) {
                return "801020";
            }
            if (access$400 >= 4) {
                return "801090";
            }
        }
        c cVar = this.h;
        if (cVar == null) {
            return null;
        }
        if (cVar.b(th)) {
            return "101011";
        }
        if (this.h.c(th)) {
            return "103011";
        }
        if (this.h.d(th)) {
            return "201010";
        }
        if (this.h.e(th)) {
            return "201011";
        }
        if (this.h.f(th)) {
            return "201012";
        }
        if (this.h.h(th)) {
            return "202000";
        }
        if (this.h.i(th)) {
            return "202001";
        }
        if (this.h.j(th)) {
            return "202002";
        }
        if (this.h.k(th)) {
            return "202003";
        }
        if (this.h.g(th)) {
            return "901000";
        }
        if (!(th instanceof DecodeException)) {
            return null;
        }
        DecodeException decodeException = (DecodeException) th;
        return decodeException.getDecodedError() + "[Local?" + decodeException.isLocalUri() + ", Disk?" + decodeException.isDataFromDisk() + riy.ARRAY_END_STR;
    }

    @Override // com.taobao.pexode.d.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.l = (this.l & (-2)) + 1;
        AppMonitor.Counter.commit("ImageLib_Rx", "Forced2System", 1.0d);
    }

    @Override // com.taobao.pexode.d.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.l = (this.l & (-3)) + 2;
        AppMonitor.Counter.commit("ImageLib_Rx", "Forced2NoAshmem", 1.0d);
    }

    @Override // com.taobao.pexode.d.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.l = (this.l & (-5)) + 4;
        AppMonitor.Counter.commit("ImageLib_Rx", "Forced2NoInBitmap", 1.0d);
    }

    @Override // com.taobao.rxm.schedule.e.a
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.l = (this.l & (-9)) + 8;
        AppMonitor.Counter.commit("ImageLib_Rx", "Forced2UnlimitedNetwork", 1.0d);
    }

    @Override // com.taobao.pexode.decoder.AvifDecoder.a
    public void a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i)});
        } else {
            b(z, i);
        }
    }

    /* loaded from: classes.dex */
    public static class ImageSizeWarningException extends NetworkResponseException {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static int sImageWarningSize;
        private final int exceededTimes;

        public static /* synthetic */ int access$002(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e1550b9d", new Object[]{new Integer(i)})).intValue();
            }
            sImageWarningSize = i;
            return i;
        }

        public static /* synthetic */ ImageSizeWarningException access$200(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ImageSizeWarningException) ipChange.ipc$dispatch("49f3b0d7", new Object[]{new Integer(i)}) : newWarningExceptionIfExceeded(i);
        }

        public static /* synthetic */ int access$400(ImageSizeWarningException imageSizeWarningException) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("37d141d9", new Object[]{imageSizeWarningException})).intValue() : imageSizeWarningException.exceededTimes;
        }

        private static ImageSizeWarningException newWarningExceptionIfExceeded(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageSizeWarningException) ipChange.ipc$dispatch("a92b0a28", new Object[]{new Integer(i)});
            }
            int i2 = sImageWarningSize;
            if (i2 > 0 && i >= i2) {
                return new ImageSizeWarningException(i);
            }
            return null;
        }

        public ImageSizeWarningException(int i) {
            super(200, "image size[" + i + "] exceeded " + (i / sImageWarningSize) + " times");
            this.exceededTimes = i / sImageWarningSize;
        }
    }

    @Override // com.taobao.phenix.request.a
    public void b(ImageStatistics imageStatistics) {
        r rVar;
        mys a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292df306", new Object[]{this, imageStatistics});
        } else if (!com.taobao.phenix.compat.d.f18891a) {
        } else {
            if (StringUtils.isEmpty(imageStatistics.f18937a)) {
                imageStatistics.f18937a = FullTraceAnalysis.getInstance().createRequest("picture");
            }
            if (imageStatistics.Q || (rVar = FalcoGlobalTracer.get()) == null) {
                return;
            }
            r.a a3 = rVar.a("picture", "Picture_UnknownScene");
            if (imageStatistics.w != null && !imageStatistics.w.isEmpty() && (a2 = rVar.a(imageStatistics.w)) != null) {
                a3.a(a2);
            }
            com.taobao.analysis.v3.k d = a3.d();
            imageStatistics.x = d;
            imageStatistics.w = rVar.a(d.h());
        }
    }

    @Override // com.taobao.phenix.request.a
    public void c(final ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f894e5", new Object[]{this, imageStatistics});
        } else {
            k.a(new Runnable() { // from class: com.taobao.phenix.compat.stat.TBImageFlowMonitor.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TBImageFlowMonitor.b(TBImageFlowMonitor.this, imageStatistics);
                    }
                }
            });
        }
    }

    private void g(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a231c61", new Object[]{this, imageStatistics});
        } else if (!com.taobao.phenix.compat.d.f18891a) {
        } else {
            a(imageStatistics, 2, "");
        }
    }

    private boolean a(ImageStatistics imageStatistics, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8be6b98a", new Object[]{this, imageStatistics, new Integer(i), str})).booleanValue();
        }
        if (!com.taobao.phenix.compat.d.f18891a || imageStatistics == null || StringUtils.isEmpty(imageStatistics.f18937a)) {
            return false;
        }
        boolean z = imageStatistics.k;
        com.taobao.analysis.fulltrace.b bVar = new com.taobao.analysis.fulltrace.b();
        bVar.g = i;
        bVar.d = imageStatistics.b;
        String str2 = "";
        bVar.L = str != null ? str : str2;
        if (imageStatistics.l() != null) {
            String str3 = imageStatistics.l().get(HttpConstant.EAGLE_EYE_ID_3);
            if (str3 != null) {
                str2 = str3;
            }
            bVar.G = str2;
        }
        if (imageStatistics.b() != ImageStatistics.FromType.FROM_NETWORK && imageStatistics.b() != ImageStatistics.FromType.FROM_UNKNOWN) {
            bVar.f = "cache";
            if (imageStatistics.b() == ImageStatistics.FromType.FROM_DISK_CACHE || imageStatistics.b() == ImageStatistics.FromType.FROM_LOCAL_FILE) {
                bVar.x = imageStatistics.j;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[falcoId:");
            sb.append(imageStatistics.f18937a);
            sb.append(riy.ARRAY_END_STR);
            sb.append("|end");
            sb.append(",ret=");
            sb.append(i);
            sb.append(",fromType=");
            sb.append(imageStatistics.b().value);
            niw.d("Phenix", sb.toString(), new Object[0]);
            nhx.a(imageStatistics, sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[falcoId:");
            sb2.append(imageStatistics.f18937a);
            sb2.append(riy.ARRAY_END_STR);
            sb2.append("|end");
            sb2.append(",ret=");
            sb2.append(i);
            Map<String, Integer> o = imageStatistics.o();
            if (o != null) {
                sb2.append(",totalTime=");
                sb2.append(b(o, "totalTime"));
                sb2.append(",wait2Main=");
                sb2.append(b(o, ImageStatistics.KEY_WAIT_FOR_MAIN));
                int b = b(o, ImageStatistics.KEY_SCHEDULE_TIME);
                sb2.append(",scheduleTime=");
                sb2.append(b);
                sb2.append(",decodeTime=");
                sb2.append(b(o, "decode"));
                sb2.append(",networkConnect=");
                sb2.append(b(o, "connect"));
                sb2.append(",networkDownload=");
                sb2.append(b(o, "download"));
                sb2.append(",cacheLookup=");
                sb2.append(b(o, ImageStatistics.KEY_READ_DISK_CACHE));
                sb2.append(",memoryLookup=");
                sb2.append(b(o, ImageStatistics.KEY_READ_MEMORY_CACHE));
                int b2 = b(o, "totalTimeOfContainer");
                if (b2 > 0) {
                    sb2.append(",processTimeOfContainer=");
                    sb2.append(b(o, "processTimeOfContainer"));
                    sb2.append(",totalTimeOfContainer=");
                    sb2.append(b2);
                    sb2.append(",dxIsReuse=");
                    sb2.append(b(o, "isReuseOfContainer"));
                }
                if (b > 5000 && com.taobao.phenix.intf.b.h().e().b()) {
                    sb2.append("|");
                    sb2.append(com.taobao.phenix.intf.b.h().e().a().c().a());
                }
            }
            niw.d("Phenix", sb2.toString(), new Object[0]);
            nhx.a(imageStatistics, sb2.toString());
        }
        Map<String, Integer> o2 = imageStatistics.o();
        if (o2 != null && o2.containsKey("decode")) {
            bVar.F = o2.get("decode").intValue();
        }
        bVar.f8567a = imageStatistics.p().g();
        bVar.h = imageStatistics.a();
        bVar.i = imageStatistics.c;
        bVar.r = imageStatistics.d;
        bVar.s = imageStatistics.e;
        bVar.t = imageStatistics.f;
        bVar.u = imageStatistics.g;
        bVar.M = b(imageStatistics.l());
        bVar.Y = d(imageStatistics.l());
        nec n = imageStatistics.n();
        bVar.V = n != null ? n.b() : "unknown";
        FullTraceAnalysis.getInstance().commitRequest(imageStatistics.f18937a, "picture", bVar);
        if (imageStatistics.x == null) {
            return z;
        }
        com.taobao.analysis.v3.k kVar = (com.taobao.analysis.v3.k) imageStatistics.x;
        kVar.a(Long.valueOf(imageStatistics.a()));
        kVar.b(Long.valueOf(imageStatistics.c));
        kVar.f(Long.valueOf(imageStatistics.d));
        kVar.a(i(imageStatistics));
        kVar.g(Long.valueOf(imageStatistics.e));
        kVar.h(Long.valueOf(imageStatistics.f));
        kVar.i(Long.valueOf(imageStatistics.g));
        kVar.a("falcoId", imageStatistics.f18937a);
        com.taobao.analysis.v3.k.URL.a(kVar, bVar.f8567a);
        com.taobao.analysis.v3.k.RET.a(kVar, Integer.valueOf(bVar.g));
        com.taobao.analysis.v3.k.BIZ_ID.a(kVar, bVar.d);
        com.taobao.analysis.v3.k.SERVER_TRACE_ID.a(kVar, bVar.G);
        com.taobao.analysis.v3.k.PROTOCOL_TYPE.a(kVar, bVar.f);
        com.taobao.analysis.v3.k.RSP_DEFLATE_SIZE.a(kVar, Long.valueOf(bVar.x));
        com.taobao.analysis.v3.k.DESERIALIZE_TIME.a(kVar, Long.valueOf(bVar.F));
        com.taobao.analysis.v3.k.PIC_DATA_FROM.a(kVar, Integer.valueOf(imageStatistics.b().value));
        com.taobao.analysis.v3.k.ERROR_CODE.a(kVar, bVar.L);
        com.taobao.analysis.v3.k.IMAGE_FORMAT.a(kVar, bVar.V);
        Map<String, Integer> o3 = imageStatistics.o();
        if (o3 != null) {
            com.taobao.analysis.v3.k.DISK_CACHE_LOOKUP_TIME.a(kVar, Long.valueOf(b(o3, ImageStatistics.KEY_READ_DISK_CACHE)));
        }
        kVar.b(i == 2 ? "cancel" : i == 1 ? "succeed" : "failed");
        return z;
    }

    private void h(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83edbe40", new Object[]{this, imageStatistics});
        } else if (imageStatistics == null || imageStatistics.l() == null) {
        } else {
            try {
                Map<String, Integer> o = imageStatistics.o();
                String str = imageStatistics.l().get("DXImageViewOnCreateTimestampKey");
                String str2 = imageStatistics.l().get("DXImageViewOnRenderTimestampKey");
                String str3 = imageStatistics.l().get("DXImageViewIsReuseKey");
                if (StringUtils.isEmpty(str3) || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
                    return;
                }
                boolean booleanValue = Boolean.valueOf(str3).booleanValue();
                long longValue = Long.valueOf(str).longValue();
                long longValue2 = Long.valueOf(str2).longValue();
                long a2 = imageStatistics.a();
                if (booleanValue) {
                    longValue = longValue2;
                }
                int i2 = longValue > 0 ? (int) (a2 - longValue) : 0;
                int b = b(o, "totalTime") + i2;
                o.put("processTimeOfContainer", Integer.valueOf(i2));
                o.put("totalTimeOfContainer", Integer.valueOf(b));
                if (!booleanValue) {
                    i = 0;
                }
                o.put("isReuseOfContainer", Integer.valueOf(i));
            } catch (Exception unused) {
            }
        }
    }

    private int b(Map<String, Integer> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39066b39", new Object[]{this, map, str})).intValue();
        }
        if (map != null && map.containsKey(str)) {
            return map.get(str).intValue();
        }
        return 0;
    }

    private long i(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdb86013", new Object[]{this, imageStatistics})).longValue();
        }
        if (imageStatistics == null || imageStatistics.l() == null || this.h == null) {
            return 0L;
        }
        String str = imageStatistics.l().get(this.h.g());
        if (StringUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0L;
        }
    }
}
