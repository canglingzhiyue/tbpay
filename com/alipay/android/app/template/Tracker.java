package com.alipay.android.app.template;

import android.view.View;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public class Tracker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BirdNestEngineTracker";

    @Deprecated
    public static void enterPage(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c8184e", new Object[]{view, str});
        }
    }

    public static void errorPoint(BirdNestEngine.LogTracer logTracer, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f658b6", new Object[]{logTracer, str, str2});
        } else if (logTracer == null) {
        } else {
            logTracer.trace(2, 3, str, str2, null, null, null, null, null);
        }
    }

    public static void exceptionPoint(BirdNestEngine.LogTracer logTracer, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a098f", new Object[]{logTracer, str, str2});
        } else if (logTracer == null) {
        } else {
            logTracer.trace(2, 2, str, str2, null, null, null, null, null);
        }
    }

    @Deprecated
    public static void leavePage(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc958ecf", new Object[]{view, str});
        }
    }

    public static void recordFootprint(BirdNestEngine.LogTracer logTracer, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37961e7c", new Object[]{logTracer, str, str2});
        } else if (logTracer == null) {
        } else {
            logTracer.trace(2, 0, str, null, str2, null, null, null, null);
        }
    }

    public static void recordPerformance(BirdNestEngine.LogTracer logTracer, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45340782", new Object[]{logTracer, str, map});
        } else if (logTracer == null) {
        } else {
            logTracer.trace(2, 1, str, null, null, null, null, map, null);
        }
    }

    public static void exceptionPoint(BirdNestEngine.LogTracer logTracer, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204599e0", new Object[]{logTracer, str, map});
        } else if (logTracer == null) {
        } else {
            logTracer.trace(2, 2, str, null, null, null, null, map, null);
        }
    }

    public static void recordFootprint(String str, String str2, String str3, Map<String, String> map) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e48bd2", new Object[]{str, str2, str3, map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        if (map != null) {
            str4 = "|" + map.size();
        } else {
            str4 = "";
        }
        sb.append(str4);
        FBLogger.d(TAG, sb.toString());
    }

    public static void exceptionPoint(BirdNestEngine.LogTracer logTracer, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d480c9c6", new Object[]{logTracer, str, str2, th});
        } else if (logTracer == null) {
        } else {
            logTracer.trace(2, 2, str, str2, null, null, null, null, th);
        }
    }
}
