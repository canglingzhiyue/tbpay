package com.alibaba.ut.abtest.bucketing.expression;

import android.text.TextUtils;
import com.alibaba.evo.EVOExperimentCondition;
import com.alibaba.ut.abtest.bucketing.feature.FeatureType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.cex;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_APP_VERSION = "mtop.appVersion";
    public static final String KEY_CROWD = "service.crowd";
    public static final String KEY_PLATFORM = "mtop.platform";

    /* renamed from: a  reason: collision with root package name */
    private Set<String> f4171a = a();
    private final Set<String> b = b();
    private Map<String, a> c = c();

    static {
        kge.a(487648100);
    }

    private Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add("mtop.platform");
        hashSet.add("mtop.appVersion");
        hashSet.add("device.channel");
        hashSet.add(KEY_CROWD);
        return hashSet;
    }

    private Set<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6dc1d418", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add("mtop.platform");
        if (cex.a().j().p()) {
            hashSet.add("mtop.appVersion");
        }
        return hashSet;
    }

    private Map<String, a> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        c cVar = new c();
        hashMap.put(cVar.a(), cVar);
        l lVar = new l();
        hashMap.put(lVar.a(), lVar);
        h hVar = new h();
        hashMap.put(hVar.a(), hVar);
        i iVar = new i();
        hashMap.put(iVar.a(), iVar);
        j jVar = new j();
        hashMap.put(jVar.a(), jVar);
        k kVar = new k();
        hashMap.put(kVar.a(), kVar);
        b bVar = new b();
        hashMap.put(bVar.a(), bVar);
        m mVar = new m();
        hashMap.put(mVar.a(), mVar);
        return hashMap;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : "$and".equals(str) || "$or".equals(str);
    }

    public boolean a(Expression expression, Map<String, Object> map, long j, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a06f61e1", new Object[]{this, expression, map, new Long(j), new Long(j2), new Boolean(z)})).booleanValue();
        }
        if (expression == null || expression.criterions == null || expression.criterions.isEmpty()) {
            return true;
        }
        if (TextUtils.isEmpty(expression.operator)) {
            expression.operator = "$and";
        }
        try {
            return a(expression.operator, expression.criterions, map, j, j2, z);
        } catch (Exception e) {
            com.alibaba.ut.abtest.internal.util.b.a("ExpressionEvaluator.evaluate", e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01d4 A[Catch: Exception -> 0x0203, TryCatch #0 {Exception -> 0x0203, blocks: (B:6:0x0046, B:8:0x004e, B:9:0x0052, B:11:0x0058, B:13:0x0066, B:17:0x008c, B:19:0x0096, B:21:0x009c, B:23:0x00ab, B:25:0x00c0, B:27:0x00c7, B:28:0x00d9, B:31:0x00fd, B:34:0x010b, B:36:0x0117, B:38:0x012c, B:40:0x0133, B:41:0x0145, B:43:0x0162, B:45:0x016e, B:47:0x0183, B:49:0x018a, B:50:0x019c, B:54:0x01c2, B:56:0x01ca, B:57:0x01ce, B:59:0x01d4, B:61:0x01e2, B:66:0x01f9), top: B:75:0x0046 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.lang.String r20, java.util.List<com.alibaba.ut.abtest.bucketing.expression.ExpressionCriterion> r21, java.util.Map<java.lang.String, java.lang.Object> r22, long r23, long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ut.abtest.bucketing.expression.d.a(java.lang.String, java.util.List, java.util.Map, long, long, boolean):boolean");
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : TextUtils.equals(str, KEY_CROWD) ? "人群" : TextUtils.equals(str, "mtop.appVersion") ? "应用版本" : TextUtils.equals(str, "device.channel") ? "渠道" : TextUtils.equals(str, "mtop.platform") ? "系统平台" : str;
    }

    private boolean a(ExpressionCriterion expressionCriterion, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("515597e8", new Object[]{this, expressionCriterion, map})).booleanValue();
        }
        if (!TextUtils.isEmpty(expressionCriterion.name) && !TextUtils.isEmpty(expressionCriterion.operator)) {
            if (TextUtils.equals(expressionCriterion.name, "mtop.appName")) {
                return true;
            }
            Object obj = null;
            if (this.f4171a.contains(expressionCriterion.name)) {
                obj = c(expressionCriterion.name);
            } else if (map != null) {
                obj = map.get(expressionCriterion.name);
            }
            com.alibaba.ut.abtest.internal.util.h.a("ExpressionEvaluator", "relationalOperate (" + expressionCriterion.name + "（" + obj + "）" + expressionCriterion.operator + " " + expressionCriterion.value + riy.BRACKET_END_STR);
            if ("mtop.appVersion".equals(expressionCriterion.name)) {
                if (EVOExperimentCondition.OPERATOR_GREATER_THAN.equals(expressionCriterion.operator)) {
                    return o.a(obj, expressionCriterion.value);
                }
                if (EVOExperimentCondition.OPERATOR_GREATER_THAN_OR_EQUALS.equals(expressionCriterion.operator)) {
                    return o.b(obj, expressionCriterion.value) || o.a(obj, expressionCriterion.value);
                } else if ("$lt".equals(expressionCriterion.operator)) {
                    return cex.a().j().p() ? !o.a(obj, expressionCriterion.value) : !o.b(obj, expressionCriterion.value) && !o.a(obj, expressionCriterion.value);
                } else if ("$lte".equals(expressionCriterion.operator)) {
                    return o.b(obj, expressionCriterion.value) || !o.a(obj, expressionCriterion.value);
                }
            } else if (KEY_CROWD.equals(expressionCriterion.name)) {
                return cex.a().p().a(FeatureType.Crowd, expressionCriterion.value);
            }
            a aVar = this.c.get(expressionCriterion.operator);
            if (aVar != null && aVar.a(obj, expressionCriterion.value)) {
                return true;
            }
        }
        return false;
    }

    private static Object c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c56c56fe", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("mtop.platform".equals(str)) {
            return "android";
        }
        if ("mtop.appVersion".equals(str)) {
            return com.alibaba.ut.abtest.internal.util.o.a().c();
        }
        if (!"device.channel".equals(str)) {
            return null;
        }
        return com.alibaba.ut.abtest.internal.util.o.a().d();
    }
}
