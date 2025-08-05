package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class dwm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f27036a;
    private static final List<String> b;

    static {
        kge.a(-117997205);
        f27036a = new ArrayList();
        b = new ArrayList();
        f27036a.add("tmallMarketCompare");
        f27036a.add("TMGSpaceXList");
        f27036a.add("DetailCollocation");
        f27036a.add("TMGCoudan");
        f27036a.add("JKCollocation");
        f27036a.add("CarCollocation");
        f27036a.add("DetailO2O");
        f27036a.add("DetailLocalStoreDefault");
        f27036a.add("tmgShopRecommend");
        f27036a.add("JKShopRecommendTop");
        f27036a.add("crossShopRecommend");
        f27036a.add("commonCrossShopRecommend");
        f27036a.add("tmgEvaluation");
        f27036a.add("JKGlobalBrandDesc");
        f27036a.add("DetailBrandevent");
        f27036a.add("TMGBrandStation");
        f27036a.add("commonShopRecommend");
        f27036a.add("detailShopRecommend");
        f27036a.add("detailRecommendCommonUpgrade");
        f27036a.add("DetailTBCombo");
        f27036a.add("DetailLocalGuiderList");
        b.add("dependency");
        b.add("bottomPadding");
        b.add("cardPadding");
        b.add("screenItemCount");
        b.add("cornerType");
        b.add("kvmap");
        b.add("dataMergeParams");
        b.add("mainSubMargin");
        b.add("option");
        emu.a("com.taobao.android.detail.core.aura.compare.CompareIgnoreUtils");
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        List<String> a2 = a(f.c());
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        f27036a.clear();
        f27036a.addAll(a2);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        List<String> a2 = a(f.d());
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        b.clear();
        b.addAll(a2);
    }

    public static List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[0]) : f27036a;
    }

    public static List<String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[0]) : b;
    }

    private static List<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{str});
        }
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        try {
            return JSONObject.parseArray(str, String.class);
        } catch (Throwable unused) {
            return arrayList;
        }
    }
}
