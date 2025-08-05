package com.alibaba.wireless.security.framework;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class ApmMonitorAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1828982371);
    }

    public static boolean isEnableFullTrackRecord() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1ca35ceb", new Object[0])).booleanValue() : SGApmMonitorManager.getInstance().isEnableFullTrackRecord();
    }

    public static boolean isForeground() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("845d1c18", new Object[0])).booleanValue() : SGApmMonitorManager.getInstance().isForeground();
    }

    public static void jstage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781352ef", new Object[]{str, str2});
            return;
        }
        SGApmMonitorManager sGApmMonitorManager = SGApmMonitorManager.getInstance();
        sGApmMonitorManager.addTrackInfo("j_" + str + "_" + str2);
    }

    public static void jstageEnd(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd20a82", new Object[]{str, str2});
            return;
        }
        SGApmMonitorManager sGApmMonitorManager = SGApmMonitorManager.getInstance();
        sGApmMonitorManager.addTrackInfo("j_" + str + "_" + str2 + "_e");
    }

    public static void jstageStart(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e778009", new Object[]{str, str2});
            return;
        }
        SGApmMonitorManager sGApmMonitorManager = SGApmMonitorManager.getInstance();
        sGApmMonitorManager.addTrackInfo("j_" + str + "_" + str2 + "_s");
    }

    public static void stage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac92af19", new Object[]{str, str2});
            return;
        }
        SGApmMonitorManager sGApmMonitorManager = SGApmMonitorManager.getInstance();
        sGApmMonitorManager.addTrackInfo(str + "_" + str2);
    }

    public static void stageEnd(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd84618", new Object[]{str, str2});
            return;
        }
        SGApmMonitorManager sGApmMonitorManager = SGApmMonitorManager.getInstance();
        sGApmMonitorManager.addTrackInfo(str + "_" + str2 + "_e");
    }

    public static void stageStart(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96dd2e1f", new Object[]{str, str2});
            return;
        }
        SGApmMonitorManager sGApmMonitorManager = SGApmMonitorManager.getInstance();
        sGApmMonitorManager.addTrackInfo(str + "_" + str2 + "_s");
    }
}
