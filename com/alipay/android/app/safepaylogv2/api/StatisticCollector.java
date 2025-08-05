package com.alipay.android.app.safepaylogv2.api;

import com.alipay.android.app.safepaylog.utils.LogMessage;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.nfc;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class StatisticCollector {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Object GLOBAL_AGENT = null;
    private static OnAddErrorListener b;

    /* renamed from: a  reason: collision with root package name */
    private static final Object f4393a = new Object();
    private static Map<Object, Map<String, List<Map>>> c = new HashMap();
    private static WalletLogAgent d = new WalletLogAgent();

    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: classes3.dex */
    public interface OnAddErrorListener {
        void onAddError(String str, String str2, String str3, String str4);
    }

    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: classes3.dex */
    public class WalletLogAgent {
    }

    public static void logEvent(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba084194", new Object[]{str, str2, map});
        }
    }

    private static Map<String, List<Map>> a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("42d7dd79", new Object[]{obj});
        }
        if (obj == GLOBAL_AGENT) {
            obj = f4393a;
        }
        Map<String, List<Map>> map = c.get(obj);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error", new ArrayList());
        hashMap.put("count", new ArrayList());
        hashMap.put(nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE, new ArrayList());
        hashMap.put(a.ATOM_EXT_window, new ArrayList());
        c.put(obj, hashMap);
        return hashMap;
    }

    public static synchronized void addShortError(Object obj, String str, String str2, Throwable th) {
        synchronized (StatisticCollector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4039c211", new Object[]{obj, str, str2, th});
                return;
            }
            addError(obj, str, str2, LogMessage.getStackTraceMessage(th, false));
            LogUtils.printExceptionStackTrace(th);
        }
    }

    public static synchronized void addError(Object obj, String str, String str2, Throwable th) {
        synchronized (StatisticCollector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7468d357", new Object[]{obj, str, str2, th});
            } else {
                addError(obj, str, str2, LogMessage.getStackTraceMessage(th));
            }
        }
    }

    public static synchronized void addError(Object obj, String str, String str2, String str3) {
        synchronized (StatisticCollector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6c555a8", new Object[]{obj, str, str2, str3});
                return;
            }
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            String sb2 = sb.toString();
            hashMap.put("errorType", str);
            hashMap.put("errorCode", str2);
            hashMap.put("errorMsg", str3);
            hashMap.put("errorTime", sb2);
            List<Map> list = a(obj).get("error");
            if (list != null) {
                list.add(hashMap);
            }
            if (b != null) {
                b.onAddError(str, str2, str3, sb2);
            }
        }
    }

    public static synchronized void addCount(Object obj, String str, String str2, String str3) {
        synchronized (StatisticCollector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a0eca2f", new Object[]{obj, str, str2, str3});
            }
        }
    }

    public static synchronized void addPerformance(Object obj, String str, String str2, Long l) {
        synchronized (StatisticCollector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4259c85", new Object[]{obj, str, str2, l});
            }
        }
    }

    public static synchronized void addWindow(Object obj, TemplateInfo templateInfo) {
        synchronized (StatisticCollector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("654bd561", new Object[]{obj, templateInfo});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(StWindow.WIN_NAME, templateInfo.mWinName);
            hashMap.put("netType", templateInfo.mNetType);
            hashMap.put(StWindow.UPDATE_TYPE, templateInfo.mUpdateType);
            hashMap.put("status", templateInfo.mUpdateResult);
            hashMap.put(StWindow.UPDATE_TIME, templateInfo.mUpdateTime);
            hashMap.put(StWindow.WINDOW_TIME, templateInfo.mUpdateSource);
            List<Map> list = a(obj).get(a.ATOM_EXT_window);
            if (list != null) {
                list.add(hashMap);
            }
        }
    }

    public static synchronized List getErrorList(Object obj) {
        synchronized (StatisticCollector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("48ae3d34", new Object[]{obj});
            }
            new ArrayList();
            return a(obj).get("error");
        }
    }

    public static synchronized List getCountList(Object obj) {
        synchronized (StatisticCollector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("782b120d", new Object[]{obj});
            }
            new ArrayList();
            return a(obj).get("count");
        }
    }

    public static synchronized List getPerformanceList(Object obj) {
        synchronized (StatisticCollector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("aeb3fb8c", new Object[]{obj});
            }
            new ArrayList();
            return a(obj).get(nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE);
        }
    }

    public static synchronized List getWindowList(Object obj) {
        synchronized (StatisticCollector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("bf3f2d20", new Object[]{obj});
            }
            new ArrayList();
            return a(obj).get(a.ATOM_EXT_window);
        }
    }

    public static synchronized void clearInstance(Object obj) {
        synchronized (StatisticCollector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb19c525", new Object[]{obj});
                return;
            }
            if (obj == GLOBAL_AGENT) {
                obj = f4393a;
            }
            c.remove(obj);
        }
    }

    public static void setOnErrorListener(OnAddErrorListener onAddErrorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3ef3238", new Object[]{onAddErrorListener});
        } else {
            b = onAddErrorListener;
        }
    }

    public static void setLogAgent(WalletLogAgent walletLogAgent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9a19e90", new Object[]{walletLogAgent});
        } else if (walletLogAgent == null) {
        } else {
            d = walletLogAgent;
        }
    }
}
