package com.taobao.tao.flexbox.layoutmanager.core;

import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaPositionType;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ofo;
import tb.ogl;
import tb.ohd;

/* loaded from: classes8.dex */
public class ad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(457944241);
    }

    public static boolean a(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("691d3054", new Object[]{aaVar})).booleanValue();
        }
        if (oeb.ax()) {
            return c(aaVar);
        }
        return b(aaVar);
    }

    public static boolean b(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aca84e15", new Object[]{aaVar})).booleanValue();
        }
        aa L = aaVar.L();
        return (L == null || L.J() == null || (!L.J().K().equals("cell") && !L.J().K().equals("header"))) ? false : true;
    }

    public static boolean c(aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0336bd6", new Object[]{aaVar})).booleanValue() : d(aaVar) != null;
    }

    public static aa d(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("9e087b0b", new Object[]{aaVar});
        }
        aa aaVar2 = aaVar.b;
        while (aaVar2 != null && !(aaVar2.I() instanceof ofo)) {
            aaVar2 = aaVar2.b;
        }
        return aaVar2;
    }

    public static aa e(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("7e8a42ea", new Object[]{aaVar});
        }
        aa aaVar2 = aaVar.b;
        while (aaVar2 != null && !(aaVar2.I() instanceof com.taobao.tao.flexbox.layoutmanager.component.m)) {
            aaVar2 = aaVar2.b;
        }
        return aaVar2;
    }

    public static aa f(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("5f0c0ac9", new Object[]{aaVar});
        }
        if (aaVar.K().equals("cells")) {
            return aaVar.J().J();
        }
        if (aaVar.K().equals(AbsListWidgetInstance.SLOT_SECTION)) {
            return aaVar.J();
        }
        if (aaVar.I() != null) {
            return aaVar;
        }
        return null;
    }

    public static aa a(aa aaVar, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("88c1f01a", new Object[]{aaVar, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        aa b = b(aaVar, i, i2, z);
        return b != null ? f(b) : b;
    }

    private static aa b(aa aaVar, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("a77c27db", new Object[]{aaVar, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        aa aaVar2 = null;
        if (aaVar.I() instanceof com.taobao.tao.flexbox.layoutmanager.component.r) {
            return null;
        }
        for (int i3 = 0; i3 < aaVar.d.size(); i3++) {
            aa aaVar3 = aaVar.d.get(i3);
            if (b(aaVar, aaVar3) && b(aaVar3, i, i2)) {
                if ((aaVar3.I() instanceof com.taobao.tao.flexbox.layoutmanager.component.z) && aaVar3.e(com.taobao.tao.flexbox.layoutmanager.component.z.KEY_TRACK_TARGET) != null) {
                    boolean z2 = !z;
                    com.taobao.tao.flexbox.layoutmanager.component.c cVar = (com.taobao.tao.flexbox.layoutmanager.component.c) aaVar3.a(com.taobao.tao.flexbox.layoutmanager.component.c.class);
                    if (cVar != null && b(cVar.getNode(), i, i2)) {
                        z2 = z ? cVar.d() : !cVar.c();
                    }
                    if (z2) {
                        return aaVar3;
                    }
                } else {
                    aaVar2 = b(aaVar3, i, i2, z);
                }
            }
        }
        return aaVar2;
    }

    private static boolean b(aa aaVar, aa aaVar2) {
        ViewPager viewPager;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a5a923d", new Object[]{aaVar, aaVar2})).booleanValue() : !(aaVar.I() instanceof TabBarControllerComponent) || (viewPager = (ViewPager) aaVar.x()) == null || aaVar.d.get(viewPager.getCurrentItem()) == aaVar2;
    }

    private static boolean b(aa aaVar, int i, int i2) {
        Rect a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23db6e35", new Object[]{aaVar, new Integer(i), new Integer(i2)})).booleanValue();
        }
        Component I = aaVar.I();
        if ((I instanceof com.taobao.tao.flexbox.layoutmanager.component.s) || (I instanceof com.taobao.tao.flexbox.layoutmanager.component.d)) {
            return true;
        }
        if (I == null && aaVar.K().equals("cell") && !aaVar.d.isEmpty()) {
            I = aaVar.d.get(0).I();
        }
        if (I != null && (a2 = a(I)) != null) {
            return a2.contains(i, i2);
        }
        return false;
    }

    public static Rect a(Component component) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("5937672c", new Object[]{component});
        }
        Component.a hostViewComponent = component.getHostViewComponent();
        if (hostViewComponent != null) {
            View view2 = hostViewComponent.f20278a.getView();
            r rVar = hostViewComponent.b;
            if (Build.VERSION.SDK_INT >= 19 && !view2.isAttachedToWindow()) {
                return null;
            }
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            return new Rect(iArr[0] + rVar.c, iArr[1] + rVar.d, iArr[0] + rVar.c + rVar.f20361a, iArr[1] + rVar.d + rVar.b);
        }
        aa J = component.getNode().J();
        if (J == null || ((!J.K().equals("cell") && !(J.I() instanceof ae)) || (view = component.getView()) == null)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return null;
        }
        r G = component.getNode().G();
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        return new Rect(iArr2[0] + G.c, iArr2[1] + G.d, iArr2[0] + G.c + G.f20361a, iArr2[1] + G.d + G.b);
    }

    public static aa a(aa aaVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("5628330e", new Object[]{aaVar, new Integer(i), new Integer(i2)});
        }
        if (aaVar.I() instanceof com.taobao.tao.flexbox.layoutmanager.component.r) {
            return aaVar;
        }
        if (aaVar.I() instanceof com.taobao.tao.flexbox.layoutmanager.component.p) {
            return a(((com.taobao.tao.flexbox.layoutmanager.component.p) aaVar.I()).a(), i, i2);
        }
        aa aaVar2 = aaVar;
        for (int i3 = 0; i3 < aaVar.d.size(); i3++) {
            aa aaVar3 = aaVar.d.get(i3);
            if (b(aaVar, aaVar3) && b(aaVar3, i, i2)) {
                aaVar2 = a(aaVar3, i, i2);
            } else if ((aaVar2 == null || aaVar2 == aaVar) && i3 == aaVar.d.size() - 1) {
                return aaVar;
            }
        }
        return aaVar2;
    }

    private static Map l(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b7c69e90", new Object[]{aaVar});
        }
        if (aaVar == null) {
            return null;
        }
        return oec.a(aaVar.d().f.get("."), (Map) null);
    }

    public static String g(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("104d588a", new Object[]{aaVar});
        }
        Map l = l(aaVar);
        if (l == null) {
            return null;
        }
        return oec.a(l.get("md5"), (String) null);
    }

    public static int j(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9013c0c", new Object[]{aaVar})).intValue();
        }
        Map l = l(aaVar);
        if (l == null) {
            return -1;
        }
        return oec.a(l.get("version"), -1);
    }

    public static String h(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("acbb54e9", new Object[]{aaVar});
        }
        Map l = l(aaVar);
        if (l == null) {
            return null;
        }
        return oec.a(l.get("time"), (String) null);
    }

    public static aa a(aa aaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("28434de4", new Object[]{aaVar, str});
        }
        if (aaVar == null || TextUtils.isEmpty(str)) {
            return aaVar;
        }
        aa a2 = aaVar.a(str, false);
        return a2 == null ? aaVar.M().a(str, false) : a2;
    }

    public static List<Pair<aa, aa.d>> a(Set<Pair<aa, aa.d>> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9ea4410", new Object[]{set});
        }
        ArrayList arrayList = new ArrayList();
        if (set != null && !set.isEmpty()) {
            for (Pair<aa, aa.d> pair : set) {
                int i = 0;
                while (true) {
                    if (i < arrayList.size()) {
                        Pair pair2 = (Pair) arrayList.get(i);
                        if (c((aa) pair2.first, (aa) pair.first)) {
                            break;
                        } else if (c((aa) pair.first, (aa) pair2.first)) {
                            arrayList.set(i, pair);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                arrayList.add(pair);
            }
        }
        return arrayList;
    }

    private static boolean c(aa aaVar, aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba11c63e", new Object[]{aaVar, aaVar2})).booleanValue();
        }
        aa J = aaVar2.J();
        while (J != aaVar && J != null) {
            J = J.J();
        }
        return J == aaVar;
    }

    public static aa i(aa aaVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("916266", new Object[]{aaVar});
        }
        while (true) {
            if (aaVar.b == null) {
                z = false;
                break;
            } else if (aaVar.b.K().equals("TabBarController")) {
                break;
            } else {
                aaVar = aaVar.b;
            }
        }
        if (!z) {
            return null;
        }
        return aaVar;
    }

    public static boolean a(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("956925f3", new Object[]{eVar})).booleanValue();
        }
        if (eVar == null || !TextUtils.equals(eVar.c, "onwillappear")) {
            return false;
        }
        String a2 = oec.a(eVar.d.get("type"), "item");
        return TextUtils.equals(a2, "tab") || TextUtils.equals(a2, "page");
    }

    public static boolean b(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22a3d774", new Object[]{eVar})).booleanValue();
        }
        if (eVar == null || !TextUtils.equals(eVar.c, "onwilldisappear")) {
            return false;
        }
        String a2 = oec.a(eVar.d.get("type"), "item");
        return TextUtils.equals(a2, "tab") || TextUtils.equals(a2, "page");
    }

    public static String c(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e924bcf", new Object[]{eVar});
        }
        if (eVar == null) {
            return "unknown";
        }
        if (!TextUtils.equals(eVar.c, "onpagedisappear") && !TextUtils.equals(eVar.c, "onstop")) {
            return "unknown";
        }
        String a2 = oec.a(eVar.d.get("type"), "page");
        return (!TextUtils.equals(a2, "page") || com.taobao.tao.flexbox.layoutmanager.adapter.a.a().n().a()) ? a2 : "background";
    }

    public static List<aa> a(aa aaVar, aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d2e33d0f", new Object[]{aaVar, aaVar2});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(aaVar);
        for (aa J = aaVar.J(); J != aaVar2; J = J.J()) {
            arrayList.add(J);
        }
        arrayList.add(aaVar2);
        return arrayList;
    }

    public static List<aa> a(aa aaVar, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6dcefe63", new Object[]{aaVar, new Float(f), new Boolean(z)});
        }
        if (aaVar.I() != null && aaVar.I().getViewParams().ba) {
            return null;
        }
        if (z && f == 1.0f) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        a(aaVar, arrayList);
        return arrayList;
    }

    private static void a(aa aaVar, List<aa> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c11d41", new Object[]{aaVar, list});
            return;
        }
        r G = aaVar.G();
        List<aa> H = aaVar.H();
        if (H == null) {
            return;
        }
        for (aa aaVar2 : H) {
            if (aaVar2.I() != null && aaVar2.I().getViewParams().az == YogaPositionType.ABSOLUTE) {
                r G2 = aaVar2.G();
                if (G2.c < 0 || G2.c + G2.f20361a > G.f20361a || G2.d < 0 || G2.d + G2.b > G.b) {
                    list.add(aaVar2);
                }
            }
            a(aaVar2, list);
        }
    }

    public static int k(aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c8c59cd", new Object[]{aaVar})).intValue() : Math.max(ohd.a(aaVar, aaVar.N(), oec.a(aaVar.e("width"), 0)), ohd.a(aaVar, aaVar.N(), oec.a(aaVar.e(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_min_width), 0)));
    }

    public static int m(aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("93a2954f", new Object[]{aaVar})).intValue() : Math.max(ohd.a(aaVar, aaVar.N(), oec.a(aaVar.e("height"), 0)), ohd.a(aaVar, aaVar.N(), oec.a(aaVar.e(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_min_height), 0)));
    }

    public static int a(aa aaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba898c77", new Object[]{aaVar, new Boolean(z)})).intValue();
        }
        ogl oglVar = new ogl();
        oglVar.a(aaVar);
        oglVar.a(aaVar.N(), aaVar.y());
        if (z) {
            return oglVar.am + oglVar.an;
        }
        return oglVar.ak + oglVar.al;
    }
}
