package tb;

import android.util.Log;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class jkh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, a> f29596a;

    static {
        kge.a(-1246996039);
        f29596a = new HashMap();
    }

    public static void a(jkg jkgVar) {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8a45d2", new Object[]{jkgVar});
        } else if (jkgVar == null || (a2 = jkgVar.a()) == null) {
        } else {
            String valueOf = String.valueOf(a2.hashCode());
            a aVar = f29596a.get(valueOf);
            if (aVar == null) {
                aVar = new a();
                f29596a.put(valueOf, aVar);
            }
            aVar.b.add(jkgVar);
            Map<String, String> d = jkgVar.d();
            if (jkgVar.c() == 32768) {
                Log.e("A11yUserTrackUtils", "focused");
                a("a11y_image", "image_recognition_focus", d);
                aVar.f29597a = jkgVar.b();
            } else if (!a(jkgVar, aVar)) {
            } else {
                Log.e("A11yUserTrackUtils", "focus clear");
                long currentTimeMillis = System.currentTimeMillis() - aVar.f29597a;
                Log.e("A11yUserTrackUtils", "focused time is " + currentTimeMillis);
                d.put("focus_time", String.valueOf(currentTimeMillis));
                b("a11y_image", "image_focus_time", d);
                f29596a.remove(valueOf);
            }
        }
    }

    private static boolean a(jkg jkgVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62ae8702", new Object[]{jkgVar, aVar})).booleanValue();
        }
        if (jkgVar != null && aVar != null) {
            if (jkgVar.c() == 65536) {
                return true;
            }
            if (aVar.f29597a <= 0) {
                return false;
            }
            List<jkg> list = aVar.b;
            if (list.size() < 2) {
                return false;
            }
            jkg jkgVar2 = list.get(list.size() - 2);
            if (jkgVar.c() == 0 && jkgVar2.c() == 0) {
                return true;
            }
        }
        return false;
    }

    private static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, null, null, map).build());
        }
    }

    private static void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{str, str2, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 19999, str2, null, null, map).build());
        }
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f29597a;
        public List<jkg> b;

        static {
            kge.a(-1582939350);
        }

        private a() {
            this.b = new ArrayList();
        }
    }
}
