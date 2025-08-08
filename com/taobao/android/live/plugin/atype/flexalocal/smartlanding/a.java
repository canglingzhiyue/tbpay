package com.taobao.android.live.plugin.atype.flexalocal.smartlanding;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import com.taobao.taolive.sdk.utils.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f14012a;

    static {
        kge.a(342023846);
        f14012a = b.f14013a;
    }

    public static boolean a(HashMap<String, String> hashMap, ArrayList<ArrayList<SmartLandingTask.Condition>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("523c0a43", new Object[]{hashMap, arrayList})).booleanValue();
        }
        if (arrayList != null && arrayList.size() > 0) {
            boolean z = false;
            for (int i = 0; i < arrayList.size(); i++) {
                z = z || b(hashMap, arrayList.get(i));
            }
            return z;
        }
        q.b(f14012a, "matchConditions: conditions is empty: default result is FALSE.");
        return false;
    }

    public static boolean b(HashMap<String, String> hashMap, ArrayList<SmartLandingTask.Condition> arrayList) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecdcccc4", new Object[]{hashMap, arrayList})).booleanValue();
        }
        if (arrayList != null) {
            try {
                Iterator<SmartLandingTask.Condition> it = arrayList.iterator();
                while (true) {
                    boolean z2 = true;
                    while (it.hasNext()) {
                        try {
                            SmartLandingTask.Condition next = it.next();
                            if (!z2 || !a(hashMap, next)) {
                                z2 = false;
                            }
                        } catch (Exception e) {
                            e = e;
                            z = z2;
                            q.a(f14012a, "matchCondition exp", e);
                            return z;
                        }
                    }
                    return z2;
                }
            } catch (Exception e2) {
                e = e2;
                z = true;
            }
        } else {
            q.b(f14012a, "matchCondition: conditions is null. default result is FALSE.");
            return false;
        }
    }

    public static boolean a(HashMap<String, String> hashMap, SmartLandingTask.Condition condition) {
        List asList;
        List asList2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3c8fc9a", new Object[]{hashMap, condition})).booleanValue();
        }
        if (condition != null) {
            String str = hashMap != null ? hashMap.get(condition.paramKey) : "";
            String str2 = f14012a;
            q.b(str2, condition.behavior + " " + condition.paramKey + " : [" + str + "] " + condition.operation + " " + condition.paramValue);
            if (a((CharSequence) condition.paramValue) || a((CharSequence) str)) {
                q.b(f14012a, "matchCondition: condition.paramValue or behaviorValue is empty.");
                return false;
            } else if ("==".equals(condition.operation)) {
                return a(str) == a(condition.paramValue);
            } else if (">".equals(condition.operation)) {
                return a(str) > a(condition.paramValue);
            } else if ("<".equals(condition.operation)) {
                return a(str) < a(condition.paramValue);
            } else if (">=".equals(condition.operation)) {
                return a(str) >= a(condition.paramValue);
            } else if ("<=".equals(condition.operation)) {
                return a(str) <= a(condition.paramValue);
            } else if ("!=".equals(condition.operation)) {
                return a(str) != a(condition.paramValue);
            } else if (SmartLandingTask.Operation.STR_EQUAL.equals(condition.operation)) {
                return condition.paramValue.equals(str);
            } else {
                return SmartLandingTask.Operation.STR_UNEQUAL.equals(condition.operation) ? !condition.paramValue.equals(str) : SmartLandingTask.Operation.STR_INCLUDE.equals(condition.operation) ? !StringUtils.isEmpty(str) && (asList2 = Arrays.asList(str.split(","))) != null && asList2.contains(condition.paramValue) : "in".equals(condition.operation) && (asList = Arrays.asList(condition.paramValue.split(","))) != null && asList.contains(str);
            }
        }
        q.b(f14012a, "matchCondition: condition is null");
        return false;
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        try {
            if (!a((CharSequence) str)) {
                return Integer.parseInt(str);
            }
            return 0;
        } catch (Exception e) {
            q.a(f14012a, "parseInt exp", e);
            return 0;
        }
    }

    public static boolean a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("638f9910", new Object[]{charSequence})).booleanValue() : charSequence == null || charSequence.length() == 0;
    }
}
