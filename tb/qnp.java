package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.login4android.api.Login;
import com.taobao.mytaobao.base.c;
import com.taobao.statistic.TBS;
import com.taobao.tao.flexbox.layoutmanager.container.b;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.utils.ag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\"\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\rH\u0002J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rH\u0002J\b\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J*\u0010#\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0007J&\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¨\u0006("}, d2 = {"Lcom/taobao/mytaobao/homepage/busniess/EquityNumSlideTransformer;", "", "()V", "buildAmountChanges", "Lcom/alibaba/fastjson/JSONObject;", "newBenefit", "oldBenefit", "checkFatigueValid", "", "enableNumSlide", "isFirst", "isLocalDefaultData", "filterString", "", "params", "getAmountStr", "benefit", "getBenefitMap", "", "module", "getBenefitModule", "data", "getBizPriorityList", "", "getMaxShowCountOneDay", "", "getSharePrefKey", "isAssetIncrease", "isSameBiz", "isSameNumberType", "num1", "num2", "recordShowTime", "", "reportNumSlide", "transform", b.KEY_CACHE_DATA, "transformBenefitModule", "newModuleData", "oldModuleData", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class qnp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1207199875);
    }

    public final JSONObject a(JSONObject data, JSONObject jSONObject, boolean z, boolean z2) {
        JSONObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ead7bc08", new Object[]{this, data, jSONObject, new Boolean(z), new Boolean(z2)});
        }
        q.c(data, "data");
        JSONObject c2 = c(data);
        if (c2 == null || (c = c(jSONObject)) == null) {
            return data;
        }
        b(c2, c, z, z2);
        return data;
    }

    public final void b(JSONObject newModuleData, JSONObject oldModuleData, boolean z, boolean z2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e297e9", new Object[]{this, newModuleData, oldModuleData, new Boolean(z), new Boolean(z2)});
            return;
        }
        q.c(newModuleData, "newModuleData");
        q.c(oldModuleData, "oldModuleData");
        if (!a(z, z2)) {
            return;
        }
        Map<String, JSONObject> b = b(oldModuleData);
        Map<String, JSONObject> b2 = b(newModuleData);
        if (b.isEmpty() || b2.isEmpty()) {
            return;
        }
        List<String> e = e();
        if (!(!e.isEmpty())) {
            e = null;
        }
        if (e == null) {
            return;
        }
        JSONObject jSONObject2 = null;
        Iterator<String> it = e.iterator();
        while (true) {
            if (!it.hasNext()) {
                jSONObject = jSONObject2;
                break;
            }
            String next = it.next();
            JSONObject jSONObject3 = b2.get(next);
            if (jSONObject3 != null && (jSONObject = b.get(next)) != null && jSONObject3.getBooleanValue("enableAssetsScroll") && b(jSONObject3, jSONObject) && c(jSONObject3, jSONObject)) {
                jSONObject2 = jSONObject3;
                break;
            }
        }
        if (jSONObject2 == null || jSONObject == null) {
            TLog.loge("EquityNumSlideTransform", "没有找到需要滚动的数据");
            return;
        }
        try {
            JSONObject a2 = a(jSONObject2, jSONObject);
            if (a2 != null) {
                jSONObject2.put((JSONObject) "amountChanges", (String) a2);
            } else {
                jSONObject2.remove("amountChanges");
            }
            b();
            d(jSONObject2);
            TLog.loge("EquityNumSlideTransform", jSONObject2.get("bizCode") + "执行数字滚动");
        } catch (Exception e2) {
            if (Versions.isDebug()) {
                throw e2;
            }
            TLog.loge("EquityNumSlideTransform", "buildAmountChanges error", e2);
        }
    }

    private final String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        String a2 = a(jSONObject.getString(mvx.KEY_INTEGER));
        if (a2 == null) {
            return "";
        }
        String a3 = a(jSONObject.getString(mvx.KEY_DECIMAL));
        StringBuilder sb = new StringBuilder();
        sb.append(a2);
        if (a3 == null) {
            a3 = "";
        }
        sb.append((Object) a3);
        return sb.toString();
    }

    private final Map<String, JSONObject> b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObject6;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("592eda1c", new Object[]{this, jSONObject});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((jSONObject == null || (jSONObject5 = jSONObject.getJSONObject("fields")) == null || (jSONObject6 = jSONObject5.getJSONObject("benefit")) == null || (jSONArray = jSONObject6.getJSONArray("benefitList")) == null) ? p.a() : jSONArray).iterator();
        while (true) {
            jSONObject2 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(next instanceof JSONObject)) {
                next = null;
            }
            JSONObject jSONObject7 = (JSONObject) next;
            if (jSONObject7 != null) {
                linkedHashMap.put(jSONObject7.getString("bizCode"), jSONObject7);
            }
        }
        if (jSONObject != null && (jSONObject3 = jSONObject.getJSONObject("fields")) != null && (jSONObject4 = jSONObject3.getJSONObject("benefit")) != null) {
            jSONObject2 = jSONObject4.getJSONObject("taoBaoTotalSaving");
        }
        if (jSONObject2 != null) {
            linkedHashMap.put("totalSaving", jSONObject2);
        }
        return linkedHashMap;
    }

    private final JSONObject c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject6 = null;
        JSONObject jSONObject7 = (jSONObject == null || (jSONObject4 = jSONObject.getJSONObject("data")) == null || (jSONObject5 = jSONObject4.getJSONObject("data")) == null) ? null : jSONObject5.getJSONObject("benefitModule2024V2_1");
        if (jSONObject7 != null) {
            return jSONObject7;
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("data")) != null && (jSONObject3 = jSONObject2.getJSONObject("data")) != null) {
            jSONObject6 = jSONObject3.getJSONObject("headerModule_11");
        }
        return jSONObject6;
    }

    private final String a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (!z && !q.a((Object) "null", (Object) str)) {
            return str;
        }
        return null;
    }

    private final void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
            return;
        }
        TBS.Ext.commitEvent("Page_MyTaobao", 2201, "/mytaobao.benefit.dingkeng_flip", null, null, "spm=" + jSONObject.get("spm"), ag.ARG_SCM + jSONObject.get("scm"));
    }

    private final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("87d5db88", new Object[]{this, jSONObject, jSONObject2});
        }
        String a2 = a(jSONObject);
        String a3 = a(jSONObject2);
        if (!a(a2, a3)) {
            TLog.loge("EquityNumSlideTransform", "数字类型不一致，不进行滚动");
            return null;
        }
        String str = a2;
        int a4 = n.a((CharSequence) str, '.', 0, false, 6, (Object) null);
        int a5 = n.a((CharSequence) a3, '.', 0, false, 6, (Object) null);
        if (a4 == -1 && a5 == -1) {
            if (a2.length() > a3.length()) {
                a3 = n.a((CharSequence) "0", a2.length() - a3.length()) + a3;
            }
        } else if (a4 > a5) {
            a3 = n.a((CharSequence) "0", a4 - a5) + a3;
        }
        String str2 = a3;
        if (n.a((CharSequence) str, '.', 0, false, 6, (Object) null) != n.a((CharSequence) str2, '.', 0, false, 6, (Object) null)) {
            TLog.loge("EquityNumSlideTransform", "整数位对齐错误，不进行滚动");
            return null;
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "integerChanges", (String) jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        jSONObject4.put((JSONObject) "decimalChanges", (String) jSONArray2);
        int length = str.length();
        boolean z = false;
        while (i < length) {
            char charAt = a2.charAt(i);
            char charAt2 = (i < 0 || i > n.e((CharSequence) str2)) ? '0' : str2.charAt(i);
            JSONArray jSONArray3 = new JSONArray();
            if ('0' <= charAt && '9' >= charAt) {
                if (charAt > charAt2) {
                    rvw rvwVar = new rvw(charAt2, charAt);
                    ArrayList arrayList = new ArrayList(p.a(rvwVar, 10));
                    Iterator<Character> it = rvwVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((o) it).b()));
                    }
                    jSONArray3.addAll(arrayList);
                } else if (charAt < charAt2) {
                    rvw rvwVar2 = new rvw(charAt2, '9');
                    ArrayList arrayList2 = new ArrayList(p.a(rvwVar2, 10));
                    Iterator<Character> it2 = rvwVar2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(String.valueOf(((o) it2).b()));
                    }
                    jSONArray3.addAll(arrayList2);
                    rvw rvwVar3 = new rvw('0', charAt);
                    ArrayList arrayList3 = new ArrayList(p.a(rvwVar3, 10));
                    Iterator<Character> it3 = rvwVar3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(String.valueOf(((o) it3).b()));
                    }
                    jSONArray3.addAll(arrayList3);
                } else {
                    jSONArray3.add(String.valueOf(charAt));
                }
            } else if (charAt == '.') {
                jSONArray3.add(".");
                z = true;
            }
            if (z) {
                jSONArray2.add(jSONArray3);
            } else {
                jSONArray.add(jSONArray3);
            }
            i++;
        }
        return jSONObject3;
    }

    private final boolean a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c194cec", new Object[]{this, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (mxz.h || c.g()) {
            TLog.loge("EquityNumSlideTransform", "不开启权益数字滚动");
            return false;
        } else if (z2 && z) {
            TLog.loge("EquityNumSlideTransform", "本地兜底快照数据，不进行数字滚动");
            return false;
        } else if (a()) {
            return true;
        } else {
            TLog.loge("EquityNumSlideTransform", "疲劳度校验失败");
            return false;
        }
    }

    private final boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("525e83ad", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        String a2 = a(jSONObject);
        if (!(a2.length() > 0)) {
            a2 = null;
        }
        if (a2 == null) {
            return false;
        }
        String a3 = a(jSONObject2);
        if (!(a3.length() > 0)) {
            a3 = null;
        }
        if (a3 == null) {
            return false;
        }
        try {
            return Float.parseFloat(a2) > Float.parseFloat(a3);
        } catch (Exception e) {
            TLog.loge("EquityNumSlideTransform", "数字类型错误", e);
            return false;
        }
    }

    private final boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("358a36ee", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        String string = jSONObject.getString("bizCode");
        String str = string;
        return !(str == null || str.length() == 0) && q.a((Object) string, (Object) jSONObject2.getString("bizCode"));
    }

    private final boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : n.a((CharSequence) str, '.', 0, false, 6, (Object) null) * n.a((CharSequence) str2, '.', 0, false, 6, (Object) null) > 0;
    }

    private final boolean a() {
        ArrayList arrayList;
        Long e;
        List b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        String b2 = mxv.b("equityAnimation", c(), "");
        if (b2 == null || (b = n.b((CharSequence) b2, new String[]{","}, false, 0, 6, (Object) null)) == null || (arrayList = p.d((Collection) b)) == null) {
            arrayList = new ArrayList();
        }
        int d = d();
        if (arrayList.size() < d) {
            return true;
        }
        String str = (String) p.a((List<? extends Object>) arrayList, arrayList.size() - d);
        long longValue = (str == null || (e = n.e(str)) == null) ? 0L : e.longValue();
        TLog.loge("EquityNumSlideTransform", "最近" + d + "次最早滚动时间是" + longValue);
        return System.currentTimeMillis() - longValue > 86400000;
    }

    private final void b() {
        ArrayList arrayList;
        List b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String b2 = mxv.b("equityAnimation", c(), "");
        if (b2 == null || (b = n.b((CharSequence) b2, new String[]{","}, false, 0, 6, (Object) null)) == null || (arrayList = p.d((Collection) b)) == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.size() >= d()) {
            arrayList.remove(0);
        }
        arrayList.add(String.valueOf(currentTimeMillis));
        mxv.a("equityAnimation", c(), p.a(arrayList, ",", null, null, 0, null, null, 62, null));
    }

    private final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        return Login.getUserId() + "_numSlideShowTimeList";
    }

    private final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : mxj.a("equityChangeNumSlideFreq", 3);
    }

    private final List<String> e() {
        List<String> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd625b", new Object[]{this});
        }
        String a2 = mxj.a("equityNumSlideBizPriority", "redEnvelope,coinGame,coupon,totalSaving,tmallPoint");
        return (a2 == null || (b = n.b((CharSequence) a2, new String[]{","}, false, 0, 6, (Object) null)) == null) ? p.a() : b;
    }
}
