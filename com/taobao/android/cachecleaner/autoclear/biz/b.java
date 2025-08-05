package com.taobao.android.cachecleaner.autoclear.biz;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizOpConditionData;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f9278a;

    static {
        kge.a(-221432498);
        f9278a = new ArrayList<String>() { // from class: com.taobao.android.cachecleaner.autoclear.biz.ConditionOpChecker$1
            {
                add("&&");
                add("||");
            }
        };
    }

    public static boolean a(BizOpConditionData bizOpConditionData, Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("445ae851", new Object[]{bizOpConditionData, map})).booleanValue();
        }
        if (bizOpConditionData == null) {
            return true;
        }
        if (f9278a.contains(bizOpConditionData.operation)) {
            if (TextUtils.equals(bizOpConditionData.operation, "&&")) {
                return a(bizOpConditionData.leftCondition, map) && a(bizOpConditionData.rightCondition, map);
            } else if (TextUtils.equals(bizOpConditionData.operation, "||")) {
                return a(bizOpConditionData.leftCondition, map) || a(bizOpConditionData.rightCondition, map);
            }
        }
        long a2 = a(bizOpConditionData.leftValue, map);
        long a3 = a(bizOpConditionData.rightValue, map);
        String str = bizOpConditionData.operation;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 60) {
            if (hashCode != 62) {
                if (hashCode != 1921) {
                    if (hashCode != 1952) {
                        if (hashCode == 1983 && str.equals(">=")) {
                            c = 2;
                        }
                    } else if (str.equals("==")) {
                        c = 0;
                    }
                } else if (str.equals("<=")) {
                    c = 4;
                }
            } else if (str.equals(">")) {
                c = 1;
            }
        } else if (str.equals("<")) {
            c = 3;
        }
        if (c == 0) {
            return a2 == a3;
        } else if (c == 1) {
            return a2 > a3;
        } else if (c == 2) {
            return a2 >= a3;
        } else if (c == 3) {
            return a2 < a3;
        } else if (c == 4) {
            return a2 <= a3;
        } else {
            TLog.loge(CacheCleaner.MODULE, "ConditionOpChecker", "checkCondition: unknown operation" + bizOpConditionData.operation);
            return false;
        }
    }

    private static long a(List<String> list, Map<String, Long> map) {
        long longValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeebb500", new Object[]{list, map})).longValue();
        }
        if (list == null || list.isEmpty()) {
            return 0L;
        }
        long j = 0;
        while (true) {
            String str = riy.PLUS;
            for (String str2 : list) {
                if (TextUtils.equals(str2, riy.PLUS)) {
                    break;
                } else if (TextUtils.equals(str2, "-")) {
                    str = "-";
                } else {
                    if (a(str2)) {
                        longValue = a(str2, 0L);
                    } else {
                        longValue = map.containsKey(str2) ? map.get(str2).longValue() : 0L;
                    }
                    char c = 65535;
                    int hashCode = str.hashCode();
                    if (hashCode != 43) {
                        if (hashCode == 45 && str.equals("-")) {
                            c = 1;
                        }
                    } else if (str.equals(riy.PLUS)) {
                        c = 0;
                    }
                    if (c == 0) {
                        j += longValue;
                    } else if (c == 1) {
                        j -= longValue;
                    }
                }
            }
            return j;
        }
    }

    private static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            Log.e("ConditionOpChecker", "safeParseLong: NumberFormatException with str " + str);
            return j;
        }
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
