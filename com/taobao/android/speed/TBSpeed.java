package com.taobao.android.speed;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.gateway.util.c;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mtopsdk.common.util.RemoteConfig;
import tb.tbt;

@Deprecated
/* loaded from: classes.dex */
public class TBSpeed {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Set<String> sWhiteList = new HashSet<String>() { // from class: com.taobao.android.speed.TBSpeed.1
        {
            add("hLauncher");
            add("DIo");
            add("hAsyncCreV");
            add("DMtop");
            add("DTemplate");
            add("hTbMainFg");
            add("hReTypeOpt");
            add("DNavBar");
            add("hDRefresh");
            add("DSurface");
            add("DQuery");
            add("hRequest");
            add("hOlMo");
            add("nextLaunch");
            add("h2Back");
            add("bcwx");
            add("hDinamicX");
            add("Olaunch");
            add("hViewType");
            add("M1DepDown");
            add("hGapHandle");
            add("MtbDifUtil");
            add(c.KEY_ORANGE);
            add("tlog");
            add("hRmdDecora");
            add("ZCache3");
            add("hImgAutoR");
            add("DLogic");
            add("hImgReLay");
            add("DVideo2");
            add("hIcons");
            add("DReDraw");
            add("M2TF");
            add("M2ALL");
            add("M2INIT");
            add("hRmd2Delay");
            add("UCLazyInit");
            add("mEnablePR");
            add("DInflate");
            add("DRender2");
            add("DPreset");
            add("DLaunch2");
            add("NWServiceB");
            add("weexH5Off");
            add("hPreCreOff");
            add("link2Head");
            add("prewvWeb");
            add("ngLaunch");
            add("preLink");
            add(tbt.PRE_RENDER);
            add(RemoteConfig.TB_SPEED_U_LAND);
            add("hAdvLau");
            add("hPreCre2");
            add("hPreReq2");
            add("hGW2");
            add("hThread");
            add("hDXCreView");
            add("hPreParam");
            add("hDX3");
            add("hEventRe");
            add("hAdvCre");
            add("tucaoba");
            add("daiPre");
            add("rmOldApm");
            add("launchUseAPM");
        }
    };

    public static String getCurrentSpeedStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16e04ee3", new Object[0]) : "";
    }

    @Deprecated
    public static int getSpeedAdvInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db7bd441", new Object[0])).intValue();
        }
        return -1;
    }

    @Deprecated
    public static String getSpeedDesc(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5d7c2e1", new Object[]{context});
        }
        return null;
    }

    public static String getSpeedPassParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d11c591", new Object[0]) : "";
    }

    public static String getSubEdition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dba8cc25", new Object[0]) : "";
    }

    @Deprecated
    public static boolean isSpeedEdition(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cf56f04", new Object[]{context})).booleanValue();
        }
        return false;
    }

    @Deprecated
    public static void setSpeedEdition(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70575eb3", new Object[]{context, str, map});
        }
    }

    @Deprecated
    public static void setSpeedPassParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4ec16d", new Object[]{str});
        }
    }

    @Deprecated
    public static void updateDataTrack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba62b589", new Object[]{str});
        }
    }

    @Deprecated
    public static void updateSpeedConfigStatus(Context context, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa22dc51", new Object[]{context, list, list2});
        }
    }

    @Deprecated
    public static void updateTopLevelStatus(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ad19ac", new Object[]{context, new Integer(i)});
        }
    }

    @Deprecated
    public static void updateUTParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8210a55", new Object[0]);
        }
    }

    public static boolean isSpeedEdition(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cdcd8ce", new Object[]{context, str})).booleanValue();
        }
        if (!sWhiteList.contains(str)) {
            return ABGlobal.isFeatureOpened(context, str);
        }
        return true;
    }
}
