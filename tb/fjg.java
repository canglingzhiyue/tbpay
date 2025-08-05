package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.a;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.detail2.core.framework.view.navbar.AtmosParams;
import com.taobao.android.o;
import com.taobao.taolive.room.utils.ag;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class fjg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b f28002a;
    public fmd b;
    public String c;

    static {
        kge.a(-39179480);
        kge.a(423536253);
    }

    public fjg(b bVar, fmd fmdVar, String str) {
        this.f28002a = bVar;
        this.b = fmdVar;
        this.c = str;
    }

    public Map<String, String> a(Map<String, String> map, d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("95b64768", new Object[]{this, map, dVar}) : map == null ? new HashMap() : map;
    }

    public void a(String str, String str2, String str3, Map<String, String> map, d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb44bc9f", new Object[]{this, str, str2, str3, map, dVar, new Boolean(z)});
            return;
        }
        Map<String, String> a2 = a(this.f28002a.f(), this.f28002a.h(), a(map, dVar), dVar);
        if (!z) {
            str = "NewDetail_Button_".concat(str);
        }
        if (!z) {
            a2.putAll(a(2101, str, str2, str3, a2, dVar));
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(a(dVar, this.c), 2101, str, str2, str3, a2).build());
    }

    private HashMap<String, String> a(int i, String str, String str2, String str3, Map<String, String> map, d dVar) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("528bf765", new Object[]{this, new Integer(i), str, str2, str3, map, dVar});
        }
        List<fls> v = this.b.v();
        HashMap<String, String> hashMap = new HashMap<>();
        for (fls flsVar : v) {
            if (flsVar != null && (a2 = flsVar.a(this.f28002a.g(), i, str, str2, str3, map, dVar)) != null) {
                hashMap.putAll(a2);
            }
        }
        return hashMap;
    }

    public void a(String str, String str2, String str3, Map<String, String> map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a47e10d5", new Object[]{this, str, str2, str3, map, dVar});
            return;
        }
        Map<String, String> a2 = a(this.f28002a.f(), this.f28002a.h(), a(map, dVar), dVar);
        a2.putAll(a(2201, "NewDetail_Show_" + str, str2, str3, a2, dVar));
        String a3 = a(dVar, this.c);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(a3, 2201, "NewDetail_Show_" + str, str2, str3, a2).build());
    }

    public final void b(Map<String, String> map, d dVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c827d2", new Object[]{this, map, dVar});
            return;
        }
        Activity g = this.f28002a.g();
        if (g == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("trackPageAppear");
        sb.append(dVar == null ? "null" : Integer.valueOf(dVar.f));
        ctu.a(sb.toString());
        fjt.a(fjt.TAG_UT, "trackPageAppear执行");
        String a2 = a(dVar, this.c);
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        defaultTracker.updatePageName(g, a2);
        defaultTracker.pageAppearDonotSkip(g, a2);
        a(g, dVar);
        Map<String, String> pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(g);
        if (pageAllProperties != null && dVar.f == 0 && (str = pageAllProperties.get(ag.KEY_UTPARAM_URL)) != null) {
            this.f28002a.h().b(str);
        }
        c(map, dVar);
        fjt.a(fjt.TAG_UT, "trackPageAppear执行完毕");
        ctu.a();
    }

    public void c(Map<String, String> map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4df5531", new Object[]{this, map, dVar});
            return;
        }
        ctu.a("updateCurrentAndNextPageProperties");
        Activity g = this.f28002a.g();
        if (g == null || dVar == null) {
            ctu.a();
            return;
        }
        Map<String, String> b = b(this.f28002a.f(), this.f28002a.h(), a(map, dVar), dVar);
        ctu.a(m.UPDATE_PAGE_PROPERTIES);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(g, b);
        ctu.a();
        HashMap hashMap = new HashMap();
        hashMap.put("spm-url", b.get("spm-cnt"));
        hashMap.put("scm-url", b.get("scm-cnt"));
        hashMap.put("scm", b.get("scm-cnt"));
        hashMap.put("scm-pre", b.get("scm"));
        ctu.a(m.UPDATE_NEXT_PAGE_PROPERTIES);
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
        ctu.a();
        ctu.a();
    }

    private String a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1174d798", new Object[]{this, dVar, str}) : (dVar == null || dVar.J() == null || TextUtils.isEmpty(dVar.J().pageName)) ? str : dVar.J().pageName;
    }

    private void a(Activity activity, d dVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6d9310", new Object[]{this, activity, dVar});
            return;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        String uri = data.toString();
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        String replaceAll = uri.replaceAll("(scm=[^&]*)", "");
        if (dVar != null && dVar.f != 0) {
            replaceAll = replaceAll.replaceAll("(spm=[^&]*)", "");
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageUrl(activity, Uri.parse(replaceAll));
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.f28002a.g());
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        ctu.a(m.UPDATE_PAGE_PROPERTIES);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.f28002a.g(), map);
        ctu.a();
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(this.f28002a.g(), JSON.toJSONString(jSONObject));
        }
    }

    public static Map<String, String> a(a aVar, fkr fkrVar, Map<String, String> map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("246b71b5", new Object[]{aVar, fkrVar, map, dVar});
        }
        try {
            ctu.a("sendExposureStatusWithUT");
            if (map == null) {
                map = new HashMap<>();
            }
            if (aVar != null) {
                ctu.a("processCommonArgs.getPageAllProperties");
                Map<String, String> pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(aVar.getNewDetailContext());
                ctu.a();
                if (pageAllProperties != null) {
                    map.put("spm-url", pageAllProperties.get("spm-url"));
                    map.put(bip.KEY_UMBRELLA_SPM_PRE, pageAllProperties.get(bip.KEY_UMBRELLA_SPM_PRE));
                    map.put("spm-cnt", pageAllProperties.get("spm-cnt"));
                    map.put("scm-url", pageAllProperties.get("scm-url"));
                    map.put("scm-pre", pageAllProperties.get("scm-pre"));
                    map.put("scm-cnt", pageAllProperties.get("scm-cnt"));
                    map.put("scm", pageAllProperties.get("scm-cnt"));
                }
            }
            return c(aVar, fkrVar, map, dVar);
        } finally {
            ctu.a();
        }
    }

    public Map<String, String> b(a aVar, fkr fkrVar, Map<String, String> map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b121cbf6", new Object[]{this, aVar, fkrVar, map, dVar});
        }
        ctu.a("processPageCommonArgs");
        if (map == null) {
            map = new HashMap<>();
        }
        String a2 = fjh.a(dVar, "");
        if (!TextUtils.isEmpty(a2)) {
            map.put("spm-cnt", a2);
        }
        Map<String, String> c = c(aVar, fkrVar, map, dVar);
        c.put("scm-cnt", dVar.y());
        ctu.a(m.GET_PAGE_ALL_PROPERTIES);
        Map<String, String> pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(aVar.getNewDetailContext());
        this.b.y().e = pageAllProperties;
        ctu.a();
        if (dVar.f == 0 && (pageAllProperties == null || !pageAllProperties.containsKey("scm"))) {
            c.put("scm", fkrVar.d());
        }
        a(fkrVar, c);
        ctu.a();
        return c;
    }

    private void a(fkr fkrVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb54ba", new Object[]{this, fkrVar, map});
            return;
        }
        d R = fkrVar.R();
        if (R == null) {
            return;
        }
        String I = R.I();
        if (TextUtils.isEmpty(I)) {
            return;
        }
        map.put("pre_seller_id", I);
    }

    private static Map<String, String> c(a aVar, fkr fkrVar, Map<String, String> map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3dd82637", new Object[]{aVar, fkrVar, map, dVar});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (dVar == null) {
            return map;
        }
        map.put("user_id", o.a().e());
        map.putAll(fju.a(dVar.x(), new fjn<String>() { // from class: tb.fjg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // tb.fjn
            public /* synthetic */ String b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public String a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : String.valueOf(obj);
            }
        }));
        map.put("cardnum", String.valueOf(dVar.f));
        if (fkrVar != null) {
            map.put("entrySpm", fkrVar.c());
            map.put(pqq.KEY_ENTRY_SCM, fkrVar.d());
            map.put("entryUtparam", fkrVar.g());
            map.put("nd_orangeConfigVersion", fkrVar.U().g());
            AtmosParams G = fkrVar.G();
            if (G != null) {
                map.put("nd_navWeexVersion", G.jsVersion);
            }
        }
        if (dVar.A.contains(dVar.x().getString("nid"))) {
            map.put("is_back", "1");
        } else {
            map.put("is_back", "0");
        }
        map.put("container_type", "new_detail");
        if (aVar != null && fkrVar != null) {
            map.put("newdetailContainer", aVar.getClass().toString());
            map.put("weexKeepLiveOpen", String.valueOf(fkrVar.q()));
        }
        if (fkrVar != null) {
            map.put("feedToken", fkrVar.y());
        }
        if (dVar instanceof fhi) {
            fhi fhiVar = (fhi) dVar;
            if (fhiVar.f27944a != null) {
                map.put("nd_mainPicWeexVersion", fhiVar.f27944a.containerInfo.b());
            }
        }
        return map;
    }
}
