package com.taobao.taolive.movehighlight.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.utils.v;
import java.util.Arrays;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAOLIVE_AB_GROUP = "taolive";
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    static {
        kge.a(-1902925704);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "isShowedLabelInfoListForNewTimeMoving1", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableHighlightKeyPointId", "true"));
    }

    public static double c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b58", new Object[0])).doubleValue() : com.taobao.taolive.sdk.utils.l.c(pmd.a().d().a("tblive", "highlightViewPageHeigh", "0.75"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableRightTouchfobid", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableLeftTouchforbid", "true"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableItemExtDataSwitch", "true"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableHighlightSkipAddCard", "false"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "EnableBackToLiveForTimeShift1", "true"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableHighlightInSecond2", "true"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableDemoteHighlight2", "true"));
    }

    public static String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[0]) : pmd.a().d().a("tblive", "tbLiveRoomReportUrl", "https://market.m.taobao.com/app/msd/buyer-aqcenter/report.html?bizSource=taobao#/poplayer");
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enablePoplayerReportNewUrl", "true"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableDestoryLocalAdapter", "true"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableHiglightSpmSwitch", "true"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableHiglightSpmFix", "true"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableHiglightGoodsKeyPointId", "true"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableHighlightPreloadTimeMoveNew", "true"));
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableHighlightExternalAdvertising", "false"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enbaleHighlightfixSjsditemId", "true"));
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "fixUpDownSwitchByHighlight", "true"));
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableHideActionByTab3", "true"));
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableTrackUtilsError", "true"));
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableLiveSourceABSwitch", "true"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue() : v.b.a("goodlist", "sourceDataOpt", true);
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        boolean d = com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "highlightSingleCardSwitch", "true"));
        String config = OrangeConfig.getInstance().getConfig("tblive", "higlightSingleCardSource", "");
        if (!TextUtils.isEmpty(config) && !TextUtils.isEmpty(str) && d) {
            return Arrays.asList(config.split(",")).contains(str);
        }
        return false;
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enablePadAdapterHighlight", "true"));
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableHighlightEmptyCard", "true"));
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "fixDestoryMMLeak", "true"));
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableCurPreOldHighlight", "true"));
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableHighlightSubscribePM", "true"));
    }
}
