package com.taobao.android.behavir.fatigue;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.b;
import com.taobao.android.behavix.bhxbridge.BHXCXXBaseBridge;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes4.dex */
public class FatigueManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FATIGUE = "fatigue";
    public static final String LIMIT_STATE = "limitState";
    public static final String TAG = "PopFatigueManager";
    private static final AtomicBoolean isInit;
    private static JSONArray sFatigueSummary;

    /* loaded from: classes4.dex */
    public enum FrequencyActionType {
        kExpose,
        kClick,
        kCancel
    }

    /* loaded from: classes4.dex */
    public enum FrequencyBizType {
        kBiz,
        kScheme,
        kBizPlan,
        kMaterial,
        kMaterialDelivery,
        kUnknown
    }

    /* loaded from: classes4.dex */
    public enum LimitState {
        NOT_LIMIT,
        LIMIT_FOR_ALG,
        HAS_LIMIT
    }

    private static native synchronized void increaseCount(int i, long j, long j2, long j3, long j4, long j5, String str);

    private static native synchronized long[] innerIsLimit(int i, long j);

    private static native String nativeQuerySummary(String str);

    private static native synchronized int updateUCPDB(String str);

    private static boolean isEnableFatigue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4f05a45", new Object[0])).booleanValue();
        }
        boolean z = true;
        if (!com.taobao.android.behavix.behavixswitch.a.a("enableUCPPopFatigue", true) || !BHXCXXBaseBridge.LoadCXXLib()) {
            z = false;
        }
        if (!z) {
            UmbrellaTracker.commitFailureStability("eventProcess", "user_action_track_error", "1.0", "BehaviX", "JNI", null, "fatigue disable", "");
        }
        return z;
    }

    static {
        kge.a(902723661);
        isInit = new AtomicBoolean(false);
        sFatigueSummary = null;
    }

    public static void increaseCount(FrequencyActionType frequencyActionType, long j, long j2, long j3, long j4, long j5, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996fb136", new Object[]{frequencyActionType, new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), str});
        } else if (frequencyActionType == null || !isEnableFatigue()) {
        } else {
            if (j == 0 && j2 == 0 && j3 == 0 && j4 == 0 && j5 == 0) {
                return;
            }
            ensureInit();
            increaseCount(frequencyActionType.ordinal(), j, j2, j3, j4, j5, str);
        }
    }

    public static void increaseCount(FrequencyActionType frequencyActionType, a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d29c57", new Object[]{frequencyActionType, aVar, str});
        } else if (aVar == null) {
        } else {
            increaseCount(frequencyActionType, aVar.f9140a, aVar.b, aVar.c, aVar.d, aVar.e, str);
            NotifyFatigueSummaryChanged(str);
        }
    }

    public static void NotifyFatigueSummaryChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("211e4c7d", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (sFatigueSummary == null) {
                String a2 = com.taobao.android.behavix.behavixswitch.a.a("fatigueSummaryList", "[\"Page_Home\", \"Page_MyTaobao\"]");
                if (!StringUtils.isEmpty(a2)) {
                    sFatigueSummary = JSON.parseArray(a2);
                }
            }
            JSONArray jSONArray = sFatigueSummary;
            if (jSONArray == null || !jSONArray.contains(str)) {
                return;
            }
            b a3 = b.a();
            a3.a("fatigue" + str, queryFatigueSummary(str));
        }
    }

    public static String queryFatigueSummary(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ee618688", new Object[]{str}) : isEnableFatigue() ? nativeQuerySummary(str) : "";
    }

    public static String getIdentifierFromSchemeId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54211466", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(64);
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public static int updateUCPDBByJSBridge(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a82bdc4", new Object[]{str})).intValue();
        }
        if (!isEnableFatigue()) {
            return -1;
        }
        return updateUCPDB(str);
    }

    private static void ensureInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("759cc3f5", new Object[0]);
        } else {
            isInit.compareAndSet(false, true);
        }
    }
}
