package com.taobao.analysis;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class UemAnalysis {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static a sAnalysisDelegate;

    public static void setAnalysisDelegate(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3a17b6", new Object[]{aVar});
        } else {
            sAnalysisDelegate = aVar;
        }
    }

    public static void registerStages(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd6d3a", new Object[]{str, list});
            return;
        }
        a aVar = sAnalysisDelegate;
        if (aVar == null) {
            return;
        }
        aVar.registerStages(str, list);
    }

    @Deprecated
    public static String getTraceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9afc202f", new Object[0]) : getFalcoId();
    }

    public static String getFalcoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d91c337", new Object[0]);
        }
        a aVar = sAnalysisDelegate;
        return aVar != null ? aVar.getFalcoId() : "";
    }

    public static void start(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6015f711", new Object[]{str, str2, str3, str4});
            return;
        }
        a aVar = sAnalysisDelegate;
        if (aVar == null) {
            return;
        }
        aVar.start(str, str2, str3, str4);
    }

    public static void end(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a300860a", new Object[]{str, str2, str3, str4});
            return;
        }
        a aVar = sAnalysisDelegate;
        if (aVar == null) {
            return;
        }
        aVar.end(str, str2, str3, str4);
    }

    public static void forceCommit(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2f21c1d", new Object[]{str, str2});
            return;
        }
        a aVar = sAnalysisDelegate;
        if (aVar == null) {
            return;
        }
        aVar.forceCommit(str, str2);
    }
}
