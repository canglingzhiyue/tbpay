package com.taobao.android.fluid.framework.mute.helper;

import android.os.CountDownTimer;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.mute.IMuteService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.obu;
import tb.occ;
import tb.oec;
import tb.skl;
import tb.spj;
import tb.sps;
import tb.spz;

/* loaded from: classes5.dex */
public class g extends e implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long COUNT_DOWN_INTERVAL = 1000;
    private final int d;
    private String e;
    private CountDownTimer f;
    private boolean g;

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final g f12605a;

        static {
            kge.a(23409712);
            f12605a = new g();
        }

        public static /* synthetic */ g a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("4445ce0a", new Object[0]) : f12605a;
        }
    }

    static {
        kge.a(-1258618486);
        kge.a(-271870066);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.e, com.taobao.android.fluid.framework.mute.helper.d
    public void e(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dea6f9e", new Object[]{this, fluidContext});
        }
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.e, com.taobao.android.fluid.framework.mute.helper.d
    public /* synthetic */ Map c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("137accd1", new Object[]{this, fluidContext}) : k(fluidContext);
    }

    private g() {
        super("shop_last_show_mute_tips_time", "shop_has_show_mute_tips_count", "common_mute_storage", e.SHOP_VIDEO_MUTE_FLAG);
        this.g = false;
        this.d = f();
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("4445ce0a", new Object[0]) : a.a();
    }

    private static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        String b = occ.b(obu.e(), "common_mute_storage", (String) null);
        return StringUtils.isEmpty(b) ? "false" : b;
    }

    private static void a(Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee00e457", new Object[]{map, new Boolean(z)});
        } else if (!StringUtils.equals(String.valueOf(map.get("isCommonMuteSet")), "true")) {
        } else {
            occ.a(obu.e(), "common_mute_storage", String.valueOf(z));
        }
    }

    private static boolean l(FluidContext fluidContext) {
        skl j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8aada5a9", new Object[]{fluidContext})).booleanValue();
        }
        if ("false".equals(e()) && (j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j()) != null) {
            String str = j.ac;
            if (!StringUtils.isEmpty(j.ab) && !StringUtils.isEmpty(str)) {
                return true;
            }
        }
        return false;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.g = true;
        CountDownTimer countDownTimer = this.f;
        if (countDownTimer == null) {
            return;
        }
        countDownTimer.cancel();
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.e, com.taobao.android.fluid.framework.mute.helper.d
    public void a(FluidContext fluidContext, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56de6cab", new Object[]{this, fluidContext, map});
        } else if (map == null) {
        } else {
            Object obj = map.get(MusLiveVideo.ATTR_MUTE);
            if ("true".equals(obj)) {
                h(fluidContext);
                a(map, true);
            } else if ("false".equals(obj)) {
                g(fluidContext);
                a(map, false);
            }
            if (!oec.a(map.get("global"), true)) {
                return;
            }
            com.taobao.global.setting.c.a(obu.e(), this.e).c().b(this.e, "mute", Boolean.valueOf("true".equals(obj)), null);
        }
    }

    public HashMap<String, Object> k(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("eb192007", new Object[]{this, fluidContext}) : f.a(this.e, fluidContext);
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.e, com.taobao.android.fluid.framework.mute.helper.d
    public Map<String, Object> d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("70a5112", new Object[]{this, fluidContext});
        }
        HashMap hashMap = new HashMap();
        skl j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        if (j != null) {
            if (!StringUtils.equals(j.ac, "true")) {
                hashMap.put(MusLiveVideo.ATTR_MUTE, "false");
                return hashMap;
            } else if (l(fluidContext)) {
                hashMap.put(MusLiveVideo.ATTR_MUTE, Boolean.valueOf(f(fluidContext)));
                hashMap.put("commonMuteCountdown", j.ab);
                hashMap.put("commonShowMuteTips", "true");
                return hashMap;
            } else {
                hashMap.put(MusLiveVideo.ATTR_MUTE, Boolean.valueOf(f(fluidContext)));
                hashMap.put("commonShowMuteTips", "false");
            }
        } else {
            hashMap.put(MusLiveVideo.ATTR_MUTE, "false");
        }
        return hashMap;
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.e, com.taobao.android.fluid.framework.mute.helper.d
    public boolean f(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d7409a3", new Object[]{this, fluidContext})).booleanValue();
        }
        if (f.b(fluidContext, f.j(fluidContext))) {
            return c();
        }
        if (!m(fluidContext)) {
            return false;
        }
        return c();
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.d
    public void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{this, fluidContext});
            return;
        }
        this.e = f.j(fluidContext);
        if (f.b(fluidContext, this.e)) {
            ((Boolean) com.taobao.global.setting.c.a(obu.e(), this.e).b().b(this.e, "mute", false, null)).booleanValue();
            com.taobao.global.setting.c.a(obu.e(), this.e).b().a("muteCountDown", false);
        } else if (!m(fluidContext)) {
        } else {
            if (StringUtils.equals(e(), "true")) {
                o(fluidContext);
            } else if (!l(fluidContext) || !StringUtils.equals(((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().ac, "true")) {
            } else {
                o(fluidContext);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.d
    public void b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4da19b", new Object[]{this, fluidContext});
            return;
        }
        ((IMuteService) fluidContext.getService(IMuteService.class)).setMuteABTestForSettings(false);
        g(fluidContext);
        if (!m(fluidContext) || this.g) {
            spz.c("ShopVideoMuteImpl", "走了降级的策略到直接打开声音");
        } else if (StringUtils.equals(e(), "true") && !this.g) {
            h(fluidContext);
        } else if (!l(fluidContext) || this.g || !StringUtils.equals(((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().ac, "true")) {
        } else {
            h(fluidContext);
        }
    }

    private boolean m(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a373faa", new Object[]{this, fluidContext})).booleanValue() : g() && !n(fluidContext);
    }

    private int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        try {
            return Integer.parseInt(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("commonMuteTimeout", "2"));
        } catch (Throwable th) {
            spz.a("ShopVideoMuteImpl", "", th);
            return 2;
        }
    }

    private boolean n(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89c0d9ab", new Object[]{this, fluidContext})).booleanValue();
        }
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams != null) {
            return spj.a("disableCommonMuteStateCheckBizTypeList", sessionParams.b, null);
        }
        return false;
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableCommonMute", true);
    }

    private void o(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894a73a8", new Object[]{this, fluidContext});
            return;
        }
        h(fluidContext);
        a(fluidContext, this.d, 1000L);
    }

    private void a(final FluidContext fluidContext, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeef619a", new Object[]{this, fluidContext, new Long(j), new Long(j2)});
            return;
        }
        d();
        this.f = new CountDownTimer(j * 1000, j2) { // from class: com.taobao.android.fluid.framework.mute.helper.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.CountDownTimer
            public void onTick(long j3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j3)});
                    return;
                }
                spz.c("ShopVideoMuteImpl", "timer onTick()" + j3);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("badeed9", new Object[]{this});
                    return;
                }
                spz.c("ShopVideoMuteImpl", "timer onFinish");
                g.this.g(fluidContext);
            }
        };
        this.f.start();
    }
}
