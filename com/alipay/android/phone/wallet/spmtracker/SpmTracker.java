package com.alipay.android.phone.wallet.spmtracker;

import android.view.View;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class SpmTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void setIsDebug(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821af06", new Object[]{new Boolean(z)});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().setIsDebug(z);
        }
    }

    public static void onPageCreate(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5aadd57", new Object[]{obj, str});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().pageOnCreate(obj, str);
        }
    }

    public static void onPageResume(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c83f88", new Object[]{obj, str});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().pageOnResume(obj, str);
        }
    }

    public static void onPagePause(Object obj, String str, String str2, Map<String, String> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d8a30", new Object[]{obj, str, str2, map, str3});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().pageOnPause(obj, str, str2, map, str3);
        }
    }

    public static void onPagePause(Object obj, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2adcde6", new Object[]{obj, str, str2, map});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().pageOnPause(obj, str, str2, map);
        }
    }

    public static void onPageDestroy(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ac1eaf", new Object[]{obj});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().pageOnDestroy(obj);
        }
    }

    public static void click(Object obj, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd232bbf", new Object[]{obj, str, str2});
        } else {
            click(obj, str, str2, null);
        }
    }

    public static void click(Object obj, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce7d9e6", new Object[]{obj, str, str2, map});
        } else {
            click(obj, str, str2, 2, map);
        }
    }

    public static void click(Object obj, String str, String str2, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31dc6fe1", new Object[]{obj, str, str2, new Integer(i), map});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().behaviorClick(obj, str, str2, i, null, map);
        }
    }

    public static void clickWithEntityId(Object obj, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d735252d", new Object[]{obj, str, str2, str3});
        } else {
            clickWithEntityId(obj, str, str2, str3, null);
        }
    }

    public static void clickWithEntityId(Object obj, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c3216b8", new Object[]{obj, str, str2, str3, map});
        } else {
            clickWithEntityId(obj, str, str2, 2, str3, map);
        }
    }

    public static void clickWithEntityId(Object obj, String str, String str2, int i, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd2b33b", new Object[]{obj, str, str2, new Integer(i), str3, map});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().behaviorClick(obj, str, str2, i, str3, map);
        }
    }

    public static void expose(Object obj, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe4f6fb", new Object[]{obj, str, str2});
        } else {
            expose(obj, str, str2, null);
        }
    }

    public static void expose(Object obj, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926af2a", new Object[]{obj, str, str2, map});
        } else {
            expose(obj, str, str2, 2, map);
        }
    }

    public static void expose(Object obj, String str, String str2, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad78431d", new Object[]{obj, str, str2, new Integer(i), map});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().behaviorExpose(obj, str, str2, i, null, map);
        }
    }

    public static void exposeWithEntityId(Object obj, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f909f69", new Object[]{obj, str, str2, str3});
        } else {
            exposeWithEntityId(obj, str, str2, str3, null);
        }
    }

    public static void exposeWithEntityId(Object obj, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4635cfc", new Object[]{obj, str, str2, str3, map});
        } else {
            exposeWithEntityId(obj, str, str2, 2, str3, map);
        }
    }

    public static void exposeWithEntityId(Object obj, String str, String str2, int i, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bca3577", new Object[]{obj, str, str2, new Integer(i), str3, map});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().behaviorExpose(obj, str, str2, i, str3, map);
        }
    }

    public static void mergeExpose(Object obj, String str, String str2, Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3156171", new Object[]{obj, str, str2, map, new Integer(i)});
        } else {
            mergeExpose(obj, str, str2, "", map, i);
        }
    }

    public static void mergeExpose(Object obj, String str, String str2, String str3, Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4beb287b", new Object[]{obj, str, str2, str3, map, new Integer(i)});
        } else {
            mergeExposeWithEntityId(obj, str, str2, null, str3, map, i);
        }
    }

    public static void mergeExposeWithEntityId(Object obj, String str, String str2, String str3, Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0a143df", new Object[]{obj, str, str2, str3, map, new Integer(i)});
        } else {
            mergeExposeWithEntityId(obj, str, str2, str3, "", map, i);
        }
    }

    public static void mergeExposeWithEntityId(Object obj, String str, String str2, String str3, String str4, Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6388b69", new Object[]{obj, str, str2, str3, str4, map, new Integer(i)});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().mergeExpose(obj, str, str2, 2, str3, map, str4, i);
        }
    }

    public static Object getTopPage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("90bbacfd", new Object[0]) : LoggerFactory.getLogContext().getSpmMonitor().getTopPage();
    }

    public static void setViewSpmTag(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e4cbc44", new Object[]{view, str});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().setSpmTag(view, str);
        }
    }

    @Deprecated
    public static void setViewSpmTag(View view, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4b7f10", new Object[]{view, str, new Boolean(z)});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().setSpmTag(view, str);
        }
    }

    public static void clearViewSpmTag(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3db4c6f", new Object[]{view});
        } else {
            setViewSpmTag(view, "");
        }
    }

    public static void setLastClickSpm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2018bd1", new Object[]{str});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().setLastClickSpm(str);
        }
    }

    public static void setMergeConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d20c69", new Object[]{str});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().setMergeConfig(str);
        }
    }

    public static boolean isPageStarted(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("24fde60f", new Object[]{obj})).booleanValue() : LoggerFactory.getLogContext().getSpmMonitor().isPageStarted(obj);
    }

    public static void setHomePageTabSpms(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86bbbcc0", new Object[]{list});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().setHomePageTabSpms(list);
        }
    }

    @Deprecated
    public static String getPageSpm(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d082bb92", new Object[]{obj}) : LoggerFactory.getLogContext().getSpmMonitor().getPageSpm(obj);
    }

    @Deprecated
    public static String getPageId(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a357e75d", new Object[]{obj}) : LoggerFactory.getLogContext().getSpmMonitor().getPageId(obj);
    }

    @Deprecated
    public static String getSrcSpm(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c73dbbfb", new Object[]{obj}) : LoggerFactory.getLogContext().getSpmMonitor().getSrcSpm(obj);
    }

    @Deprecated
    public static String getMiniPageId(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b560df46", new Object[]{obj}) : LoggerFactory.getLogContext().getSpmMonitor().getMiniPageId(obj);
    }

    @Deprecated
    public static String getLastClickSpmId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("757147ea", new Object[0]) : LoggerFactory.getLogContext().getSpmMonitor().getLastClickSpmId();
    }

    @Deprecated
    public static String getLastClickSpmIdByPage(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("111689e8", new Object[]{obj}) : LoggerFactory.getLogContext().getSpmMonitor().getLastClickSpmIdByPage(obj);
    }

    @Deprecated
    public static Map<String, String> getTracerInfo(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f07fdf29", new Object[]{obj}) : LoggerFactory.getLogContext().getSpmMonitor().getTracerInfo(obj);
    }

    @Deprecated
    public static void mergeExpose(Object obj, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7c8bd2", new Object[]{obj, str, str2, map});
        } else {
            mergeExpose(obj, str, str2, 2, map);
        }
    }

    @Deprecated
    public static void mergeExpose(Object obj, String str, String str2, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ddfb75", new Object[]{obj, str, str2, new Integer(i), map});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().mergeExpose(obj, str, str2, i, null, map, null, -1);
        }
    }

    @Deprecated
    public static void mergeExposeWithEntityId(Object obj, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79d3a3a4", new Object[]{obj, str, str2, str3, map});
        } else {
            mergeExposeWithEntityId(obj, str, str2, 2, str3, map);
        }
    }

    @Deprecated
    public static void mergeExposeWithEntityId(Object obj, String str, String str2, int i, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4462c3cf", new Object[]{obj, str, str2, new Integer(i), str3, map});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().mergeExpose(obj, str, str2, i, str3, map, null, -1);
        }
    }

    @Deprecated
    public static void slide(Object obj, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97dc6ea8", new Object[]{obj, str, str2});
        } else {
            slide(obj, str, str2, null);
        }
    }

    @Deprecated
    public static void slide(Object obj, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("220547dd", new Object[]{obj, str, str2, map});
        } else {
            slide(obj, str, str2, 2, map);
        }
    }

    @Deprecated
    public static void slide(Object obj, String str, String str2, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b06cc0ca", new Object[]{obj, str, str2, new Integer(i), map});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().behaviorSlide(obj, str, str2, i, null, map);
        }
    }

    @Deprecated
    public static void slideWithEntityId(Object obj, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6bfa6f", new Object[]{obj, str, str2, str3, map});
        } else {
            slideWithEntityId(obj, str, str2, 2, str3, map);
        }
    }

    @Deprecated
    public static void slideWithEntityId(Object obj, String str, String str2, int i, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46d54664", new Object[]{obj, str, str2, new Integer(i), str3, map});
        } else {
            LoggerFactory.getLogContext().getSpmMonitor().behaviorSlide(obj, str, str2, i, str3, map);
        }
    }
}
