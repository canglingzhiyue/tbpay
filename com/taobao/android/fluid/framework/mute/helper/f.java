package com.taobao.android.fluid.framework.mute.helper;

import android.content.Context;
import android.media.AudioManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.mute.IMuteService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.avplayer.bl;
import com.taobao.avplayer.s;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.obu;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.sii;
import tb.skl;
import tb.snv;
import tb.soj;
import tb.sok;
import tb.spj;
import tb.sps;
import tb.spz;
import tb.sqc;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_FADEIN_VALUE = 1000;
    public static final int END_FADE_VOLUME = 1;
    public static final int FADE_IN_INTERVAL = 100;
    public static final int START_FADE_VLOME = 0;
    public static final float START_TH = 0.15f;

    /* renamed from: a  reason: collision with root package name */
    public static e f12600a;

    public static /* synthetic */ boolean k(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b240ba8", new Object[]{fluidContext})).booleanValue() : m(fluidContext);
    }

    static {
        kge.a(602467643);
        f12600a = null;
    }

    public static void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{fluidContext});
        } else if (a() != null) {
        } else {
            f12600a = b(fluidContext);
            c(fluidContext);
        }
    }

    public static e b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("20b550f9", new Object[]{fluidContext});
        }
        e eVar = null;
        boolean a2 = spj.a(fluidContext);
        if (!a2) {
            eVar = g.a();
        } else if (spj.d(fluidContext)) {
            if (l(fluidContext) && e()) {
                z = true;
            }
            if (z) {
                eVar = j.a();
            } else {
                eVar = c.a();
            }
        } else if (a2 && d()) {
            eVar = b.a();
        }
        spz.c("MuteHelper", "iMute 初始化为" + eVar);
        return eVar;
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("4445cdcc", new Object[0]) : f12600a;
    }

    public static void c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed73b9c", new Object[]{fluidContext});
            return;
        }
        e a2 = a();
        if (a2 == null) {
            return;
        }
        a2.a(fluidContext);
    }

    public static Map<String, Object> d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("70a5112", new Object[]{fluidContext});
        }
        HashMap hashMap = new HashMap();
        e a2 = a();
        return a2 != null ? a2.d(fluidContext) : hashMap;
    }

    public static Map<String, Object> e(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fa99d553", new Object[]{fluidContext});
        }
        HashMap hashMap = new HashMap();
        e a2 = a();
        return (a2 == null || !b(fluidContext, j(fluidContext))) ? hashMap : a2.c(fluidContext);
    }

    public static void a(FluidContext fluidContext, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56de6cab", new Object[]{fluidContext, map});
            return;
        }
        e a2 = a();
        if (a2 == null) {
            return;
        }
        a2.a(fluidContext, map);
    }

    public static void f(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d74099f", new Object[]{fluidContext});
            return;
        }
        e a2 = a();
        if (a2 == null) {
            return;
        }
        a2.e(fluidContext);
    }

    public static boolean g(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cfda3a4", new Object[]{fluidContext})).booleanValue();
        }
        String j = j(fluidContext);
        if (!b(fluidContext, j)) {
            e a2 = a();
            if (a2 == null) {
                return false;
            }
            return a2.f(fluidContext);
        }
        boolean booleanValue = ((Boolean) com.taobao.global.setting.c.a(obu.e(), j).b().b(j, "mute", false, null)).booleanValue();
        boolean a3 = com.taobao.global.setting.c.a(obu.e(), j).b().a("muteCountDown", false);
        e a4 = a();
        if (a4 != null) {
            return a4.f(fluidContext);
        }
        return l(fluidContext) || booleanValue || a3;
    }

    public static sok a(FluidContext fluidContext, final snv snvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sok) ipChange.ipc$dispatch("c463348", new Object[]{fluidContext, snvVar});
        }
        if (!b()) {
            return null;
        }
        if (spj.a(fluidContext)) {
            b.a();
        } else {
            g.a();
        }
        sok sokVar = new sok() { // from class: com.taobao.android.fluid.framework.mute.helper.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.sok
            public void a(FluidContext fluidContext2, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b7e4f7ae", new Object[]{this, fluidContext2, str, str2});
                    return;
                }
                snv snvVar2 = snv.this;
                if (snvVar2 == null) {
                    return;
                }
                if (str2 == null) {
                    z = false;
                }
                snvVar2.a(z);
            }
        };
        ((IMuteService) fluidContext.getService(IMuteService.class)).a(sokVar);
        return sokVar;
    }

    public static void b(FluidContext fluidContext, final s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa781579", new Object[]{fluidContext, sVar});
            return;
        }
        boolean a2 = spj.a(fluidContext);
        if (l(fluidContext)) {
            j.a();
        } else if (a2) {
            c.a();
        } else {
            g.a();
        }
        ((IMuteService) fluidContext.getService(IMuteService.class)).a(new sok() { // from class: com.taobao.android.fluid.framework.mute.helper.f.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.sok
            public void a(FluidContext fluidContext2, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b7e4f7ae", new Object[]{this, fluidContext2, str, str2});
                    return;
                }
                s sVar2 = s.this;
                if (sVar2 == null) {
                    return;
                }
                if (str2 == null) {
                    z = false;
                }
                sVar2.a(z);
            }
        });
    }

    public static void a(FluidContext fluidContext, final sii siiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b4e657", new Object[]{fluidContext, siiVar});
            return;
        }
        boolean a2 = spj.a(fluidContext);
        if (l(fluidContext)) {
            j.a();
        } else if (a2) {
            c.a();
        } else {
            g.a();
        }
        ((IMuteService) fluidContext.getService(IMuteService.class)).a(new sok() { // from class: com.taobao.android.fluid.framework.mute.helper.f.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.sok
            public void a(FluidContext fluidContext2, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b7e4f7ae", new Object[]{this, fluidContext2, str, str2});
                    return;
                }
                snv f = sii.this.k().f();
                if (f == null) {
                    return;
                }
                if (str2 != null) {
                    f.a(true);
                } else if (!f.k(fluidContext2)) {
                    f.a(false);
                } else {
                    f.a(fluidContext2, f, fluidContext2.getContext(), false);
                }
            }
        });
        String preCoverKey = siiVar.z().getInstanceConfig().getPreCoverKey();
        boolean a3 = com.taobao.tao.flexbox.layoutmanager.player.b.a().a(preCoverKey);
        bl e = com.taobao.tao.flexbox.layoutmanager.player.b.a().e(preCoverKey);
        if (e == null || !a3) {
            return;
        }
        e.e(g(siiVar.z()));
    }

    public static void a(snv snvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff16fb7d", new Object[]{snvVar});
        } else if (!c() || snvVar == null) {
        } else {
            snvVar.a(true);
        }
    }

    public static void b(FluidContext fluidContext, snv snvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc954db0", new Object[]{fluidContext, snvVar});
            return;
        }
        boolean c = c();
        if (b()) {
            snvVar.a(g(fluidContext));
        } else if (!c) {
        } else {
            snvVar.a(false);
        }
    }

    public static void h(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c873da1", new Object[]{fluidContext});
            return;
        }
        if (l(fluidContext) && e()) {
            z = true;
        }
        if (!z) {
            return;
        }
        j.a().b(fluidContext, "mute");
    }

    public static HashMap i(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("33962885", new Object[]{fluidContext});
        }
        String j = j(fluidContext);
        return b(fluidContext, j) ? a(j, fluidContext) : new HashMap();
    }

    public static void a(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab43ee4", new Object[]{fluidContext, str});
            return;
        }
        e eVar = f12600a;
        if (!b(fluidContext, j(fluidContext)) || eVar == null) {
            spz.c("MuteHelper", "已经是老版本，或未初始化无需回退");
        } else if ("Weex".equals(str) && ((IInteractionService) fluidContext.getService(IInteractionService.class)).isEnableGlobalWeexDSLV2()) {
            spz.c("MuteHelper", "Weex不支持新版本代码");
            eVar.b(fluidContext);
        } else if (!"TNode".equals(str) || ((IInteractionService) fluidContext.getService(IInteractionService.class)).isEnableGlobalWeexDSLV2()) {
        } else {
            spz.c("MuteHelper", "Tnode不支持新版本代码");
            eVar.b(fluidContext);
        }
    }

    public static String j(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2929d5d", new Object[]{fluidContext});
        }
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        return (sessionParams == null || sessionParams.b == null) ? "guangguang" : sessionParams.b;
    }

    public static HashMap<String, Object> a(String str, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("697644c7", new Object[]{str, fluidContext});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        boolean booleanValue = ((Boolean) com.taobao.global.setting.c.a(obu.e(), str).b().b(str, "mute", false, null)).booleanValue();
        boolean a2 = com.taobao.global.setting.c.a(obu.e(), str).b().a("muteCountDown", false);
        boolean a3 = com.taobao.global.setting.c.a(obu.e(), str).b().a("muteOpenTip", false);
        if (l(fluidContext)) {
            e eVar = f12600a;
            if (eVar == null) {
                j.a().b(fluidContext, "mute");
                hashMap.put(MusLiveVideo.ATTR_MUTE, "true");
            } else {
                hashMap.put(MusLiveVideo.ATTR_MUTE, Boolean.toString(eVar.f(fluidContext)));
            }
        } else {
            hashMap.put(MusLiveVideo.ATTR_MUTE, Boolean.toString(booleanValue));
        }
        hashMap.put("muteCountDown", Boolean.toString(a2));
        hashMap.put("muteOpenTip", Boolean.toString(a3));
        spz.c("MuteHelper", "getMuteEnvOption传入的值 muted&checkCountDown " + booleanValue + a2 + "场景：" + str);
        return hashMap;
    }

    private static void a(FluidContext fluidContext, snv snvVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7199f9", new Object[]{fluidContext, snvVar, context});
            return;
        }
        skl j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        spz.c("MuteHelper", "走了新的声音渐变");
        if (context != null && j != null && j.am != null) {
            try {
                float streamVolume = ((AudioManager) context.getSystemService("audio")).getStreamVolume(3) / ((AudioManager) context.getSystemService("audio")).getStreamMaxVolume(3);
                Map<String, Object> map = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().am.get("newMuteSettingV2");
                if (map != null && streamVolume > oec.a(map.get("startTH"), 0.15f)) {
                    snvVar.a(oec.b(map.get("startFadeVolume"), 0), oec.b(map.get("endFadeVolume"), 1), oec.a(map.get("fadeDuration"), 1000), 100);
                    return;
                }
            } catch (Exception e) {
                spz.a("MuteHelper", "", e);
            }
        }
        snvVar.a(false);
    }

    public static void a(FluidContext fluidContext, snv snvVar, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c257fb", new Object[]{fluidContext, snvVar, context, new Boolean(z)});
        } else if (soj.a(fluidContext) && !((IMuteService) fluidContext.getService(IMuteService.class)).isFadInForFirstTime() && !z) {
            ((IMuteService) fluidContext.getService(IMuteService.class)).setFadInForFirstTime(true);
            a(fluidContext, snvVar, context);
        } else {
            snvVar.a(z);
        }
    }

    public static void a(snv.a aVar, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f28f92", new Object[]{aVar, fluidContext});
        } else if (!soj.b(fluidContext)) {
        } else {
            aVar.f(true);
            aVar.g(false);
        }
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableLiveMuteConfig", false);
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        boolean orangeBooleanConfig = FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enablePreloadLive", true);
        ogg.b("直播卡片提前播放：orange开关打开：" + orangeBooleanConfig);
        return orangeBooleanConfig;
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableGuangGuangMute", true);
    }

    private static boolean l(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8aada5a9", new Object[]{fluidContext})).booleanValue();
        }
        if (((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionExtParams() == null) {
            return false;
        }
        boolean a2 = spj.a("TBXiaomiB1SceneSourceTypeList", ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionExtParams().d(), ",videoxiaomib1,videoxiaomib2,");
        spz.c("MuteHelper", "isXiaoMiB1Tab3:" + a2);
        return a2;
    }

    private static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableXiaoMiB1Tab3Mute", true);
    }

    public static boolean b(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6675baa9", new Object[]{fluidContext, str})).booleanValue();
        }
        boolean a2 = oeb.a("ShortVideo.enableGlobalMuteSetting", true);
        boolean isMuteABTestForSettings = ((IMuteService) fluidContext.getService(IMuteService.class)).isMuteABTestForSettings();
        if (a2 && isMuteABTestForSettings) {
            boolean a3 = com.taobao.global.setting.c.a(obu.e(), str).b().a("globalMuteSetting");
            spz.c("MuteHelper", "从设置端拿到值" + a3);
            return a3;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("BizCode", str);
        hashMap.put("AppVersion", sqc.e());
        com.taobao.android.fluid.business.usertrack.track.b.b(fluidContext, "Button-MuteDownGrade", hashMap);
        spz.c("MuteHelper", "静音orange开关关闭");
        return false;
    }

    private static boolean m(FluidContext fluidContext) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a373faa", new Object[]{fluidContext})).booleanValue();
        }
        Map<String, Map<String, Object>> map2 = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().am;
        boolean a2 = (map2 == null || (map = map2.get("newMuteSettingV2")) == null) ? false : oec.a(map.get("enable"), true);
        boolean a3 = oeb.a("ShortVideo.enableNewGlobalMute", true);
        spz.c("MuteHelper", a2 + "--enableNewMuteSetting " + a3 + "--boolOrangeConfig");
        return a2 && a3;
    }
}
