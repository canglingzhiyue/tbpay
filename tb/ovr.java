package tb;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.l;
import com.taobao.tao.Globals;
import com.taobao.tao.infoflow.commonsubservice.dataservice.a;
import com.taobao.tao.topmultitab.c;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.LinkedHashSet;
import java.util.Set;
import tb.ovt;

/* loaded from: classes.dex */
public class ovr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AREA_MAINLAND = "mainland";
    public static final String FRAMEWORK_MICROSERVICES = "microservices";
    public static final String HOME_MULTI_TAB = "multiTab";
    public static final String HOME_TAB_ID_HOME = "home";
    public static final String KEY_TAB_BAR_FRAMEWORK = "framework";
    public static final ovu MICROSERVICES_INFO_FLOW_PERFORMANCE;
    public static final String TAB_ID_MAINLAND_RECOMMEND_MICROSERVICES = "home_mainland";
    public static final String TAB_ID_OVERSEA_RECOMMEND_MICROSERVICES = "home_oversea";
    private static final String[] b;

    /* renamed from: a  reason: collision with root package name */
    private final ovt f32466a = new ovt();

    static {
        kge.a(-1178271656);
        MICROSERVICES_INFO_FLOW_PERFORMANCE = new ovu();
        b = new String[]{TAB_ID_MAINLAND_RECOMMEND_MICROSERVICES, TAB_ID_OVERSEA_RECOMMEND_MICROSERVICES};
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : a.a(oqc.a().m()) != null;
    }

    public void a(c cVar, com.taobao.tao.topmultitab.protocol.c cVar2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e089cf", new Object[]{this, cVar, cVar2, str});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        qut qutVar = new qut(cVar2, str);
        ldf.d("MicroservicesRecommendTabAdapter", "大陆Controller 构建耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        cVar.a(str, qutVar);
        qutVar.setSubPageChangeListener(this.f32466a.a());
    }

    public ovt.a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ovt.a) ipChange.ipc$dispatch("523ad253", new Object[]{this}) : this.f32466a.b();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : a(c.a().z());
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : !TextUtils.equals("home", str) ? str : g();
    }

    public static String a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e721362", new Object[]{str, jSONObject});
        }
        if (TextUtils.equals("home", str) && jSONObject != null) {
            return g();
        }
        ldf.d("MicroservicesRecommendTabAdapter", "getTransformSubTabType subTabType : " + str);
        return str;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : !c(str) ? str : "home";
    }

    private static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        for (String str2 : b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static Set<String> a(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6868d06", new Object[]{set});
        }
        if (set == null || set.size() != 2) {
            return set;
        }
        String l = oqc.a().l();
        String m = oqc.a().m();
        if (!set.contains(l) || !set.contains(m)) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(2);
        linkedHashSet.add(l);
        linkedHashSet.add(m);
        return linkedHashSet;
    }

    public static ovu d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ovu) ipChange.ipc$dispatch("261dd38d", new Object[0]) : MICROSERVICES_INFO_FLOW_PERFORMANCE;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        String a2 = a("home");
        IHomeSubTabController c = c.a().c(a2);
        if (c == null) {
            ldf.d("MicroservicesRecommendTabAdapter", "获取新架构 IHomeSubTabController 失败， realType ： " + a2);
            return;
        }
        ldf.d("MicroservicesRecommendTabAdapter", "预加载新架构推荐信息流， realType ： " + a2);
        c.preCreateView(context);
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : g();
    }

    private static boolean a(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6cd267d", new Object[]{iHomeSubTabController})).booleanValue();
        }
        if (iHomeSubTabController == null) {
            return false;
        }
        if (iHomeSubTabController == c.a().c("home")) {
            return true;
        }
        for (String str : b) {
            if (c.a().c(str) == iHomeSubTabController) {
                return true;
            }
        }
        return false;
    }

    private static String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : l.d(Globals.getApplication()) ? "oversea" : AREA_MAINLAND;
    }

    private static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        return "home_" + f();
    }
}
