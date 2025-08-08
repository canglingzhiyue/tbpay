package com.taobao.taolive.room.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class as {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f21762a;

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue();
        }
        if (com.taobao.taolive.sdk.utils.u.aU()) {
            return com.taobao.taolive.sdk.utils.p.a("enableOpenRemoveDupCheck", false);
        }
        return false;
    }

    static {
        kge.a(478017292);
        f21762a = null;
    }

    public static String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[0]);
        }
        if (!com.taobao.taolive.sdk.utils.u.aU()) {
            return null;
        }
        if (!StringUtils.isEmpty(f21762a)) {
            return f21762a;
        }
        if (pmd.a().d() == null) {
            return null;
        }
        String a2 = pmd.a().d().a("tblive", "getWarmMockPlayUrl", "");
        f21762a = a2;
        return a2;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.p.a("enableCheckWarmLimitSwitch", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.p.a("enableAddSurfaceViewUt", true);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.p.a("enableControlScreenLightOpt", true);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue();
        }
        if (!com.taobao.taolive.sdk.utils.p.a("enableShopTwoFloorUseOpen", true)) {
            return false;
        }
        return v.a(com.taobao.taolive.sdk.utils.p.a("taolive", "EnableShopTwoFloorUseOpen", "enableShopTwoFloorUseOpen", "true"), false);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.p.a("enableJumpUpdatePageUTProperties", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.p.a("enableCustomerImplPageUTManager", true);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.p.a("disableTrackWithVideoInfo", true);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.p.a("disableSetCoverInPlaying", true);
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.p.a("enableFixFoldScreenFirstCover", true);
    }

    public static boolean a(com.taobao.taolive.sdk.controller.e eVar) {
        ATaoliveOpenLiveRoomEntity f;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("24a98202", new Object[]{eVar})).booleanValue() : com.taobao.taolive.sdk.utils.p.a("enableGuangGuangSecondLivePage", true) && (f = eVar.f()) != null && f.abilityCompontent != null && f.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedMoreLive);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.p.a("enableAddOpenAbility", true);
    }

    public static int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[0])).intValue() : v.a(com.taobao.taolive.sdk.utils.p.a("taolive", "enableRefreshOrRemoveLiveRoomWhenVisible", "partLength", "5"), 5);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.p.a("enableLiveEndRemove", true);
    }

    public static boolean a(com.taobao.taolive.sdk.controller.e eVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7087348a", new Object[]{eVar, new Long(j)})).booleanValue();
        }
        if (!com.taobao.taolive.sdk.utils.p.a("enableRefreshOrRemoveLiveRoomWhenVisible", true) || eVar == null || !eVar.J() || !eVar.D || System.currentTimeMillis() - j <= v.a(com.taobao.taolive.sdk.utils.p.a("taolive", "enableRefreshOrRemoveLiveRoomWhenVisible", "checkInterval", "600"), 600) * 1000) {
            return false;
        }
        String a2 = com.taobao.taolive.sdk.utils.p.a("taolive", "enableRefreshOrRemoveLiveRoomWhenVisible", "enable", "");
        com.taobao.taolive.sdk.utils.q.b("SampleConfigUtil", "enableRefreshOrRemoveLiveRoomWhenVisible, ret:" + a2);
        return v.a(a2, false);
    }
}
