package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.android.home.component.utils.j;
import com.taobao.homepage.business.permission.c;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.infoflow.multitab.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class ktp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile ktp e;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, List<String>> f30307a = new HashMap<>();
    private HashMap<String, Boolean> b = new HashMap<>();
    private HashMap<String, HashMap<String, Boolean>> c = new HashMap<>();
    private String d;
    private String f;

    static {
        kge.a(954158077);
    }

    public static ktp a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ktp) ipChange.ipc$dispatch("f0709d7", new Object[0]);
        }
        synchronized (ktp.class) {
            if (e == null) {
                e = new ktp();
            }
        }
        return e;
    }

    private ktp() {
        this.f = "false";
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(g4.b.i);
        this.f30307a.put(h.VIEW_PROVIDER_MAIN_ENTRANCE, arrayList);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add("animation");
        this.f30307a.put(e.KEY_BG_IMG, arrayList2);
        this.f = c.a("mainEffectDegrade", "false");
        this.b.put(h.VIEW_PROVIDER_MAIN_ENTRANCE, Boolean.valueOf(c.a("mainEntranceEffectDegrade", false)));
        this.b.put(e.KEY_BG_IMG, Boolean.valueOf(c.a("bgImgEffectDegrade", false)));
        HashMap<String, Boolean> hashMap = new HashMap<>();
        hashMap.put(g4.b.i, Boolean.valueOf(c.a("mainEntrance_enter", false)));
        this.c.put(h.VIEW_PROVIDER_MAIN_ENTRANCE, hashMap);
        HashMap<String, Boolean> hashMap2 = new HashMap<>();
        hashMap2.put("animation", Boolean.valueOf(c.a("bgImg_animation", false)));
        this.c.put(e.KEY_BG_IMG, hashMap2);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f = j.a("mainEffectDegrade", "false");
        c.b("mainEffectDegrade", this.f);
        for (Map.Entry<String, List<String>> entry : this.f30307a.entrySet()) {
            String key = entry.getKey();
            Boolean valueOf = Boolean.valueOf("true".equals(j.a(key + "EffectDegrade", "false")));
            this.b.put(key, valueOf);
            c.b(key + "EffectDegrade", valueOf.booleanValue());
            List<String> list = this.f30307a.get(key);
            if (list != null && list.size() > 0) {
                for (String str : list) {
                    Boolean valueOf2 = Boolean.valueOf(b(key, str));
                    this.c.get(key).put(str, valueOf2);
                    c.b(key + "_" + str, valueOf2.booleanValue());
                }
            }
        }
    }

    private boolean b(String str, String str2) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(this.d)) {
            this.d = g.b();
            com.taobao.android.home.component.utils.e.c("EffectSwitchCoordinator", "deviceHML=" + this.d);
        }
        String a2 = j.a(str + "_" + str2, (String) null);
        if (!TextUtils.isEmpty(a2) && (hashMap = (HashMap) JSON.parseObject(a2, new TypeReference<HashMap<String, String>>() { // from class: tb.ktp.1
        }, new Feature[0])) != null) {
            return "off".equals(hashMap.get(this.d));
        }
        return false;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        return a(str, arrayList).get(str2).booleanValue();
    }

    public static HashMap<String, Boolean> a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1d4d87c6", new Object[]{str, list});
        }
        b(str, list);
        HashMap<String, Boolean> hashMap = new HashMap<>(list.size());
        if (a().f.equals("true") || a().b.get(str).booleanValue()) {
            for (String str2 : list) {
                hashMap.put(str2, true);
            }
            return hashMap;
        }
        for (String str3 : list) {
            hashMap.put(str3, a().c.get(str).get(str3));
        }
        return hashMap;
    }

    private static void b(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aab2c64", new Object[]{str, list});
            return;
        }
        ktp a2 = a();
        if (a2.f30307a.containsKey(str)) {
            for (String str2 : list) {
                if (!a2.f30307a.get(str).contains(str2)) {
                    a2.f30307a.get(str).add(str2);
                }
            }
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            arrayList.addAll(list);
            a2.f30307a.put(str, arrayList);
        }
        if (!a2.b.containsKey(str)) {
            HashMap<String, Boolean> hashMap = a2.b;
            hashMap.put(str, Boolean.valueOf("true".equals(j.a(str + "EffectDegrade", "false"))));
        }
        if (!a2.c.containsKey(str)) {
            HashMap<String, Boolean> hashMap2 = new HashMap<>();
            for (String str3 : list) {
                hashMap2.put(str3, Boolean.valueOf(a2.b(str, str3)));
            }
            a2.c.put(str, hashMap2);
            return;
        }
        HashMap<String, Boolean> hashMap3 = a2.c.get(str);
        for (String str4 : list) {
            if (!hashMap3.containsKey(str4)) {
                hashMap3.put(str4, Boolean.valueOf(a2.b(str, str4)));
            }
        }
        a2.c.put(str, hashMap3);
    }
}
