package com.taobao.downgrade;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import com.taobao.downgrade.DowngradeStrategy;
import com.taobao.downgrade.rule.BusinessRule;
import com.taobao.downgrade.rule.DefaultRule;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.kkr;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLD_LAUNCH = "cold_launch";
    public static final String HARDWARE = "hardware";
    public static final String RUNTIME_CPU = "runtime_CPU";
    public static final String RUNTIME_MEM = "runtime_MEM";

    /* renamed from: a  reason: collision with root package name */
    public static final SimpleDateFormat f17072a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public static boolean a(BusinessRule businessRule) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("582666d9", new Object[]{businessRule})).booleanValue() : a(businessRule.unavailableFilters) || a(businessRule.bizDegradeFilters) || a(businessRule.bizGrayFilters) || b(businessRule.scoreTacticsMappingFilters) || c(businessRule.performanceWeightsFilters);
    }

    private static boolean a(List<BusinessRule.Rule> list) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{list})).booleanValue();
        }
        if (list == null) {
            return false;
        }
        for (BusinessRule.Rule rule : list) {
            if (!a(rule.osFilters, c.i()) || !a(rule.brandFilters, c.h()) || !a(rule.deviceFilters, c.g()) || !a(rule.appVersionFilters, c.c())) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(List<BusinessRule.ScoreTacticsMappingFilter> list) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d39e1ede", new Object[]{list})).booleanValue();
        }
        if (list == null) {
            return false;
        }
        for (BusinessRule.ScoreTacticsMappingFilter scoreTacticsMappingFilter : list) {
            if (!a(scoreTacticsMappingFilter.osFilters, c.i()) || !a(scoreTacticsMappingFilter.brandFilters, c.h()) || !a(scoreTacticsMappingFilter.deviceFilters, c.g()) || !a(scoreTacticsMappingFilter.appVersionFilters, c.c())) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(List<BusinessRule.PerformanceWeightsFilter> list) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e037145f", new Object[]{list})).booleanValue();
        }
        if (list == null) {
            return false;
        }
        for (BusinessRule.PerformanceWeightsFilter performanceWeightsFilter : list) {
            if (!a(performanceWeightsFilter.osFilters, c.i()) || !a(performanceWeightsFilter.brandFilters, c.h()) || !a(performanceWeightsFilter.deviceFilters, c.g()) || !a(performanceWeightsFilter.appVersionFilters, c.c())) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(List<BusinessRule.Time> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecd009e0", new Object[]{list})).booleanValue();
        }
        if (list == null || list.size() == 0) {
            return true;
        }
        try {
            for (BusinessRule.Time time : list) {
                Date parse = f17072a.parse(time.startTime);
                Date parse2 = f17072a.parse(time.endTime);
                Date parse3 = f17072a.parse(c.f());
                if (parse.before(parse3) && parse2.after(parse3)) {
                    return true;
                }
            }
        } catch (ParseException unused) {
        }
        return false;
    }

    private static boolean a(List<BusinessRule.Filter> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c6e0ee7", new Object[]{list, str})).booleanValue();
        }
        if (list == null || list.size() == 0) {
            return true;
        }
        for (BusinessRule.Filter filter : list) {
            if (filter != null && b(filter, str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(List<BusinessRule.Filter> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f0628", new Object[]{list, str})).booleanValue();
        }
        if (list == null || list.size() == 0) {
            return true;
        }
        for (BusinessRule.Filter filter : list) {
            if (filter != null && a(filter, str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(BusinessRule.Filter filter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da749fed", new Object[]{filter, str})).booleanValue();
        }
        if (filter.compare != null && filter.value != null && str != null) {
            String str2 = filter.compare;
            String str3 = filter.value;
            float b = h.b(str);
            float b2 = h.b(str3);
            char c = 65535;
            switch (str2.hashCode()) {
                case -415169006:
                    if (str2.equals("moreAndEqual")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3318169:
                    if (str2.equals("less")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3357525:
                    if (str2.equals("more")) {
                        c = 0;
                        break;
                    }
                    break;
                case 96757556:
                    if (str2.equals(SmartLandingTask.Operation.STR_EQUAL)) {
                        c = 1;
                        break;
                    }
                    break;
                case 514320470:
                    if (str2.equals("lessAndEqual")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1552455713:
                    if (str2.equals("notEqual")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            if (c != 0) {
                return c != 1 ? c != 2 ? c != 3 ? c != 4 ? c == 5 && Float.compare(b, b2) != 0 : Float.compare(b, b2) <= 0 : Float.compare(b, b2) >= 0 : Float.compare(b, b2) < 0 : Float.compare(b, b2) == 0;
            } else if (Float.compare(b, b2) > 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(BusinessRule.Filter filter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1355008c", new Object[]{filter, str})).booleanValue();
        }
        if (filter.compare == null || filter.value == null || str == null) {
            return true;
        }
        String str2 = filter.compare;
        String str3 = filter.value;
        char c = 65535;
        switch (str2.hashCode()) {
            case -415169006:
                if (str2.equals("moreAndEqual")) {
                    c = 3;
                    break;
                }
                break;
            case 3318169:
                if (str2.equals("less")) {
                    c = 2;
                    break;
                }
                break;
            case 3357525:
                if (str2.equals("more")) {
                    c = 0;
                    break;
                }
                break;
            case 96757556:
                if (str2.equals(SmartLandingTask.Operation.STR_EQUAL)) {
                    c = 1;
                    break;
                }
                break;
            case 514320470:
                if (str2.equals("lessAndEqual")) {
                    c = 4;
                    break;
                }
                break;
            case 1552455713:
                if (str2.equals("notEqual")) {
                    c = 5;
                    break;
                }
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? c == 5 && str.compareTo(str3) != 0 : a(str, str3) <= 0 : a(str, str3) >= 0 : a(str, str3) < 0 : str.compareTo(str3) == 0 : a(str, str3) > 0;
    }

    private static int a(String str, String str2) {
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{str, str2})).intValue();
        }
        String[] split = !str.contains(".") ? new String[]{str} : str.split("\\.");
        String[] split2 = !str2.contains(".") ? new String[]{str2} : str2.split("\\.");
        if (split.length > split2.length) {
            length = split2.length;
        } else {
            length = split.length;
        }
        for (int i = 0; i < length; i++) {
            if (!split[i].equals(split2[i])) {
                if (h.a(split[i]) > h.a(split2[i])) {
                    return 1;
                }
                return h.a(split[i]) == h.a(split2[i]) ? 0 : -1;
            }
        }
        if (split.length > split2.length) {
            return 1;
        }
        return split.length == split2.length ? 0 : -1;
    }

    private static Map<String, String> a(BusinessRule businessRule, DefaultRule defaultRule, int i, int i2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("77c4945e", new Object[]{businessRule, defaultRule, new Integer(i), new Integer(i2), str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(kkr.UPLOAD_TYPE, j.EVENT_PAGE_SLAVE);
        hashMap.put(kkr.BIZ_ID, businessRule.businessRuleName);
        hashMap.put(kkr.DEVICE_RUNTIME_SORE, String.valueOf(i));
        hashMap.put(kkr.HARDWARE_SORE, String.valueOf(i2));
        hashMap.put("page_url", c.m());
        hashMap.put(kkr.DEVICE_MEM_LEFT, String.valueOf(c.k()));
        hashMap.put(kkr.DEVICE_MEM_PERCENT, String.valueOf(c.l()));
        hashMap.put(kkr.DEVICE_CPU_PERCENT, String.valueOf(c.a(defaultRule.androidCpuOpen)));
        hashMap.put("cold_launch_time", String.valueOf(c.j()));
        hashMap.put(kkr.DEVICE_TEMPERATURE, String.valueOf(c.n()));
        hashMap.put(kkr.PERFORMANCE_WEIGHTS_ID, str);
        hashMap.put(kkr.SCORE_TACTICS_MAPPING_ID, str2);
        hashMap.put(kkr.PERCENT, String.valueOf(c.o()));
        if (defaultRule.oldDeviceScore != null) {
            hashMap.put(kkr.OLD_DEVICE_SCORE_ID, defaultRule.oldDeviceScore.oldDeviceScoreId);
        }
        if (defaultRule.scoreLevelVariable != null) {
            hashMap.put(kkr.SCORE_LEVEL_VARIABLE_ID, defaultRule.scoreLevelVariable.scoreLevelVariableId);
        }
        return hashMap;
    }

    private static DowngradeStrategy a(Pair<DowngradeStrategy, String> pair, String str, BusinessRule businessRule, DefaultRule defaultRule, int i, int i2, String str2, String str3) {
        DowngradeStrategy downgradeStrategy;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DowngradeStrategy) ipChange.ipc$dispatch("d370fd75", new Object[]{pair, str, businessRule, defaultRule, new Integer(i), new Integer(i2), str2, str3});
        }
        if (pair == null || (downgradeStrategy = (DowngradeStrategy) pair.first) == null) {
            return null;
        }
        String str4 = str + " Filters hit";
        if (Downgrade.isTest) {
            Map<String, String> a2 = a(businessRule, defaultRule, i, i2, str2, str3);
            a(a2, downgradeStrategy, (String) pair.second);
            downgradeStrategy.setTraceMap(a2);
        }
        return downgradeStrategy;
    }

    public static DowngradeStrategy a(BusinessRule businessRule, DefaultRule defaultRule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DowngradeStrategy) ipChange.ipc$dispatch("2ba33b55", new Object[]{businessRule, defaultRule});
        }
        String str = null;
        if (businessRule == null || defaultRule == null) {
            return null;
        }
        Pair<Map<String, Integer>, String> b = b(businessRule, defaultRule);
        Map map = (Map) b.first;
        if (map == null) {
            return null;
        }
        String str2 = (String) b.second;
        float b2 = b(defaultRule);
        float a2 = a(defaultRule);
        float a3 = a(defaultRule, (Integer) map.get(RUNTIME_CPU));
        int e = c.e();
        int a4 = c.a(map, b2, a3, a2, e);
        Pair<Map<String, Integer>, String> c = c(businessRule, defaultRule);
        Map map2 = (Map) c.first;
        String str3 = (String) c.second;
        if (map2 == null) {
            return null;
        }
        DowngradeStrategy a5 = a(a(businessRule.unavailableFilters, a4, "unavailable", map2, defaultRule.androidCpuOpen), "unavailable", businessRule, defaultRule, a4, e, str2, str3);
        if (a5 != null) {
            return a5;
        }
        DowngradeStrategy a6 = a(a(businessRule.bizDegradeFilters, a4, "bizDegrade", map2, defaultRule.androidCpuOpen), "bizDegrade", businessRule, defaultRule, a4, e, str2, str3);
        if (a6 != null) {
            return a6;
        }
        DowngradeStrategy a7 = a(a(businessRule.bizGrayFilters, a4, "bizGray", map2, defaultRule.androidCpuOpen), "bizGray", businessRule, defaultRule, a4, e, str2, str3);
        if (a7 != null) {
            return a7;
        }
        if (a4 > ((Integer) map2.get("high")).intValue()) {
            str = "normal";
        } else if (a4 <= ((Integer) map2.get("high")).intValue() && a4 > ((Integer) map2.get("low")).intValue()) {
            str = "partDegrade";
        } else if (a4 <= ((Integer) map2.get("low")).intValue()) {
            str = "degrade";
        }
        if (Downgrade.isTest) {
            Map<String, String> a8 = a(businessRule, defaultRule, a4, e, str2, str3);
            a8.put(kkr.PERFORMANCE_WEIGHTS_ID, str2);
            a8.put(kkr.TACTICS_FUNCTION, "normal");
            a8.put(kkr.TACTICS_PERFORMANCE, str);
            a8.put(kkr.CPU_ARCH, String.valueOf(c.p()));
            return new DowngradeStrategy.a().a("normal").b(str).a(a8).a();
        }
        return new DowngradeStrategy.a().a("normal").b(str).a();
    }

    private static void a(Map<String, String> map, DowngradeStrategy downgradeStrategy, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1217acbb", new Object[]{map, downgradeStrategy, str});
            return;
        }
        map.put(kkr.TACTICS_FUNCTION, downgradeStrategy.getTacticsFunction());
        map.put(kkr.TACTICS_PERFORMANCE, downgradeStrategy.getTacticsPerformance());
        map.put(kkr.BIZ_FILTER_ID, str);
    }

    public static float a(DefaultRule defaultRule, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f54dbe5", new Object[]{defaultRule, num})).floatValue();
        }
        if (!defaultRule.androidCpuOpen || num == null || num.intValue() == 0) {
            return 0.0f;
        }
        List<String> list = null;
        if (defaultRule != null && defaultRule.scoreLevelVariable != null) {
            list = defaultRule.scoreLevelVariable.runtimeCPU;
        }
        return c.a(list);
    }

    public static float a(DefaultRule defaultRule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("def2332", new Object[]{defaultRule})).floatValue();
        }
        List<String> list = null;
        if (defaultRule != null && defaultRule.scoreLevelVariable != null) {
            list = defaultRule.scoreLevelVariable.runtimeMEM;
        }
        return c.b(list);
    }

    public static float b(DefaultRule defaultRule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0db8c91", new Object[]{defaultRule})).floatValue();
        }
        List<String> list = null;
        if (defaultRule != null && defaultRule.scoreLevelVariable != null) {
            list = defaultRule.scoreLevelVariable.coldLaunch;
        }
        return c.c(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x027a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<com.taobao.downgrade.DowngradeStrategy, java.lang.String> a(java.util.List<com.taobao.downgrade.rule.BusinessRule.Rule> r6, int r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.Integer> r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.downgrade.e.a(java.util.List, int, java.lang.String, java.util.Map, boolean):android.util.Pair");
    }

    private static boolean e(List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f968ff61", new Object[]{list})).booleanValue() : list == null || list.isEmpty();
    }

    private static Pair<Map<String, Integer>, String> b(BusinessRule businessRule, DefaultRule defaultRule) {
        List<BusinessRule.PerformanceWeightsFilter> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c333cbde", new Object[]{businessRule, defaultRule});
        }
        String str = null;
        if (businessRule == null && defaultRule == null) {
            return null;
        }
        Map hashMap = new HashMap(4);
        if (businessRule != null && (list = businessRule.performanceWeightsFilters) != null) {
            Iterator<BusinessRule.PerformanceWeightsFilter> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BusinessRule.PerformanceWeightsFilter next = it.next();
                if (a(next)) {
                    hashMap.put(COLD_LAUNCH, Integer.valueOf(h.a(next.coldLaunch, 0)));
                    hashMap.put(RUNTIME_CPU, Integer.valueOf(h.a(next.runtimeCPU, 0)));
                    hashMap.put(RUNTIME_MEM, Integer.valueOf(h.a(next.runtimeMEM, 0)));
                    hashMap.put(HARDWARE, Integer.valueOf(h.a(next.hardware, 100)));
                    str = next.performanceWeightsId;
                    break;
                }
            }
        }
        if (hashMap.isEmpty()) {
            hashMap = c(defaultRule);
            str = defaultRule.performanceWeights.performanceWeightsId;
        }
        return new Pair<>(hashMap, str);
    }

    public static Map<String, Integer> c(DefaultRule defaultRule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("39538835", new Object[]{defaultRule});
        }
        HashMap hashMap = new HashMap(4);
        if (defaultRule == null || defaultRule.performanceWeights == null) {
            return null;
        }
        hashMap.put(COLD_LAUNCH, Integer.valueOf(h.a(defaultRule.performanceWeights.coldLaunch, 0)));
        hashMap.put(RUNTIME_CPU, Integer.valueOf(h.a(defaultRule.performanceWeights.runtimeCPU, 0)));
        hashMap.put(RUNTIME_MEM, Integer.valueOf(h.a(defaultRule.performanceWeights.runtimeMEM, 0)));
        hashMap.put(HARDWARE, Integer.valueOf(h.a(defaultRule.performanceWeights.hardware, 100)));
        return hashMap;
    }

    private static boolean a(BusinessRule.PerformanceWeightsFilter performanceWeightsFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53a55bb8", new Object[]{performanceWeightsFilter})).booleanValue();
        }
        if (performanceWeightsFilter.availableTime != null && !d(performanceWeightsFilter.availableTime)) {
            return false;
        }
        if (performanceWeightsFilter.osFilters != null && !a(performanceWeightsFilter.osFilters, c.i())) {
            return false;
        }
        if (performanceWeightsFilter.deviceFilters != null && !a(performanceWeightsFilter.deviceFilters, c.g())) {
            return false;
        }
        if (performanceWeightsFilter.brandFilters != null && !a(performanceWeightsFilter.brandFilters, c.h())) {
            return false;
        }
        return performanceWeightsFilter.appVersionFilters == null || a(performanceWeightsFilter.appVersionFilters, c.c());
    }

    private static Pair<Map<String, Integer>, String> c(BusinessRule businessRule, DefaultRule defaultRule) {
        List<BusinessRule.ScoreTacticsMappingFilter> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("8b91f07d", new Object[]{businessRule, defaultRule});
        }
        String str = null;
        if (businessRule == null && defaultRule == null) {
            return null;
        }
        HashMap hashMap = new HashMap(2);
        if (businessRule != null && (list = businessRule.scoreTacticsMappingFilters) != null) {
            Iterator<BusinessRule.ScoreTacticsMappingFilter> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BusinessRule.ScoreTacticsMappingFilter next = it.next();
                if (a(next)) {
                    hashMap.put("high", Integer.valueOf(h.a(next.high, 40)));
                    hashMap.put("low", Integer.valueOf(h.a(next.low, 20)));
                    str = next.scoreTacticsMappingId;
                    break;
                }
            }
        }
        if (hashMap.isEmpty()) {
            hashMap.put("high", Integer.valueOf(h.a(defaultRule.scoreTacticsMapping.high, 40)));
            hashMap.put("low", Integer.valueOf(h.a(defaultRule.scoreTacticsMapping.low, 20)));
            str = defaultRule.scoreTacticsMapping.scoreTacticsMappingId;
        }
        return new Pair<>(hashMap, str);
    }

    private static boolean a(BusinessRule.ScoreTacticsMappingFilter scoreTacticsMappingFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d5a80a0", new Object[]{scoreTacticsMappingFilter})).booleanValue();
        }
        if (scoreTacticsMappingFilter.availableTime != null && !d(scoreTacticsMappingFilter.availableTime)) {
            return false;
        }
        if (scoreTacticsMappingFilter.osFilters != null && !a(scoreTacticsMappingFilter.osFilters, c.i())) {
            return false;
        }
        if (scoreTacticsMappingFilter.deviceFilters != null && !a(scoreTacticsMappingFilter.deviceFilters, c.g())) {
            return false;
        }
        if (scoreTacticsMappingFilter.brandFilters != null && !a(scoreTacticsMappingFilter.brandFilters, c.h())) {
            return false;
        }
        return scoreTacticsMappingFilter.appVersionFilters == null || a(scoreTacticsMappingFilter.appVersionFilters, c.c());
    }

    public static DowngradeStrategy a(DefaultRule defaultRule, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DowngradeStrategy) ipChange.ipc$dispatch("297fcf1e", new Object[]{defaultRule, str});
        }
        Map<String, Integer> c = c(defaultRule);
        float b = b(defaultRule);
        float a2 = a(defaultRule);
        float a3 = a(defaultRule, c.get(RUNTIME_CPU));
        String str3 = defaultRule.oldDeviceScore.oldDeviceScoreId;
        int e = c.e();
        int a4 = c.a(c, b, a3, a2, e);
        HashMap hashMap = new HashMap(2);
        hashMap.put("high", Integer.valueOf(h.a(defaultRule.scoreTacticsMapping.high, 40)));
        hashMap.put("low", Integer.valueOf(h.a(defaultRule.scoreTacticsMapping.low, 20)));
        String str4 = defaultRule.scoreTacticsMapping.scoreTacticsMappingId;
        if (a4 > ((Integer) hashMap.get("high")).intValue()) {
            str2 = "normal";
        } else {
            str2 = a4 > ((Integer) hashMap.get("low")).intValue() ? "partDegrade" : "degrade";
        }
        if (Downgrade.isTest) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(kkr.UPLOAD_TYPE, j.EVENT_PAGE_SLAVE);
            hashMap2.put(kkr.DEVICE_RUNTIME_SORE, String.valueOf(a4));
            hashMap2.put(kkr.HARDWARE_SORE, String.valueOf(e));
            hashMap2.put("page_url", c.m());
            hashMap2.put(kkr.DEVICE_MEM_LEFT, String.valueOf(c.k()));
            hashMap2.put(kkr.DEVICE_MEM_PERCENT, String.valueOf(c.l()));
            hashMap2.put(kkr.DEVICE_CPU_PERCENT, String.valueOf(c.a(defaultRule.androidCpuOpen)));
            hashMap2.put("cold_launch_time", String.valueOf(c.j()));
            hashMap2.put(kkr.DEVICE_TEMPERATURE, String.valueOf(c.n()));
            hashMap2.put(kkr.PERCENT, String.valueOf(c.o()));
            hashMap2.put(kkr.PERFORMANCE_WEIGHTS_ID, str3);
            hashMap2.put(kkr.SCORE_TACTICS_MAPPING_ID, str4);
            if (defaultRule.oldDeviceScore != null) {
                hashMap2.put(kkr.OLD_DEVICE_SCORE_ID, defaultRule.oldDeviceScore.oldDeviceScoreId);
            }
            if (defaultRule.scoreLevelVariable != null) {
                hashMap2.put(kkr.SCORE_LEVEL_VARIABLE_ID, defaultRule.scoreLevelVariable.scoreLevelVariableId);
            }
            hashMap2.put(kkr.TACTICS_FUNCTION, "normal");
            hashMap2.put(kkr.TACTICS_PERFORMANCE, str2);
            return new DowngradeStrategy.a().a("normal").b(str2).a(hashMap2).a();
        }
        return new DowngradeStrategy.a().a("normal").b(str2).a();
    }
}
