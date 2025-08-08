package com.taobao.monitor.procedure;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.mpn;
import tb.mqk;

/* loaded from: classes.dex */
public class l implements f, j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Deprecated
    private volatile g b;
    @Deprecated
    private volatile g c;
    private final Map<Activity, IPage> e = new ConcurrentHashMap();
    private final Map<Fragment, IPage> f = new ConcurrentHashMap();
    private final Map<IPage, g> g = new ConcurrentHashMap();
    private final Map<String, g> h = new ConcurrentHashMap();
    private final Map<IPage, WeakReference<View>> i = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final g f18223a = g.DEFAULT;
    private volatile g d = g.DEFAULT;

    public IPage a(Activity activity, IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("9852537c", new Object[]{this, activity, iPage});
        }
        if (activity == null || iPage == null) {
            return null;
        }
        this.e.put(activity, iPage);
        return iPage;
    }

    @Override // com.taobao.monitor.procedure.j
    @Deprecated
    public g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("54729e9a", new Object[]{this}) : c(this.b);
    }

    @Override // com.taobao.monitor.procedure.f
    public IPage a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("251a917", new Object[]{this, activity});
        }
        if (activity == null) {
            return IPage.DEFAULT_PAGE;
        }
        return c(this.e.get(activity));
    }

    @Override // com.taobao.monitor.procedure.j
    public g b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("7a3f5227", new Object[]{this, activity});
        }
        if (activity == null) {
            return g.DEFAULT;
        }
        return c(b(this.e.get(activity)));
    }

    public IPage a(Fragment fragment, IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("39385ec", new Object[]{this, fragment, iPage});
        }
        if (fragment == null || iPage == null) {
            return null;
        }
        this.f.put(fragment, iPage);
        return iPage;
    }

    @Override // com.taobao.monitor.procedure.j
    @Deprecated
    public g b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("c8b1d6f9", new Object[]{this}) : c(this.c);
    }

    @Override // com.taobao.monitor.procedure.f
    public IPage a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("fe335387", new Object[]{this, fragment});
        }
        if (fragment == null) {
            return IPage.DEFAULT_PAGE;
        }
        return c(this.f.get(fragment));
    }

    @Override // com.taobao.monitor.procedure.j
    public g b(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("8b5c2cf9", new Object[]{this, fragment});
        }
        if (fragment == null) {
            return g.DEFAULT;
        }
        return c(b(this.f.get(fragment)));
    }

    public g a(IPage iPage, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("716d7b13", new Object[]{this, iPage, gVar});
        }
        if (iPage == null) {
            return null;
        }
        this.h.put(iPage.c(), gVar);
        return this.g.put(iPage, gVar);
    }

    public g a(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("a6cb627f", new Object[]{this, iPage});
        }
        if (iPage == null) {
            return null;
        }
        this.e.values().remove(iPage);
        this.f.values().remove(iPage);
        this.i.remove(iPage);
        this.h.remove(iPage.c());
        return this.g.remove(iPage);
    }

    @Override // com.taobao.monitor.procedure.f
    public synchronized IPage a(View view) {
        IPage iPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("808f8d67", new Object[]{this, view});
        }
        if (view == null) {
            return IPage.DEFAULT_PAGE;
        }
        Map<View, IPage> h = h();
        ArrayList arrayList = new ArrayList();
        do {
            if (h.containsKey(view) && (iPage = h.get(view)) != null) {
                arrayList.add(iPage);
            }
            if (view.getParent() == null || !(view.getParent() instanceof View)) {
                view = null;
                continue;
            } else {
                view = (View) view.getParent();
                continue;
            }
        } while (view != null);
        return new n(arrayList);
    }

    public g b(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("2916175e", new Object[]{this, iPage});
        }
        if (iPage == null) {
            return g.DEFAULT;
        }
        return c(this.g.get(iPage));
    }

    @Override // com.taobao.monitor.procedure.j
    public g a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("5ccf4590", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return g.DEFAULT;
        }
        return c(this.h.get(str));
    }

    public g e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("256f8016", new Object[]{this});
        }
        if (this.d != null && this.d.c()) {
            return this.d;
        }
        if (this.b != null) {
            return this.b;
        }
        if (this.c != null) {
            return this.c;
        }
        return c(this.f18223a);
    }

    @Override // com.taobao.monitor.procedure.j
    public synchronized g b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("b9a31c99", new Object[]{this, view});
        } else if (view == null) {
            return g.DEFAULT;
        } else {
            Map<View, g> g = g();
            while (!g.containsKey(view)) {
                if (view.getParent() == null || !(view.getParent() instanceof View)) {
                    view = null;
                    continue;
                } else {
                    view = (View) view.getParent();
                    continue;
                }
                if (view == null) {
                    return g.DEFAULT;
                }
            }
            return c(g.get(view));
        }
    }

    private Map<View, g> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<Activity, IPage> entry : this.e.entrySet()) {
            if (entry.getKey() != null && entry.getKey().getWindow() != null && entry.getKey().getWindow().peekDecorView() != null && entry.getValue() != null && this.g.get(entry.getValue()) != null) {
                hashMap.put(entry.getKey().getWindow().peekDecorView(), this.g.get(entry.getValue()));
            }
        }
        for (Map.Entry<Fragment, IPage> entry2 : this.f.entrySet()) {
            if (entry2.getKey() != null && entry2.getKey().getView() != null && entry2.getValue() != null && this.g.get(entry2.getValue()) != null) {
                hashMap.put(entry2.getKey().getView(), this.g.get(entry2.getValue()));
            }
        }
        return hashMap;
    }

    private Map<View, IPage> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3fbd54e4", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<Activity, IPage> entry : this.e.entrySet()) {
            if (entry.getKey() != null && entry.getKey().getWindow() != null && entry.getKey().getWindow().getDecorView() != null && entry.getValue() != null && this.g.get(entry.getValue()) != null) {
                hashMap.put(entry.getKey().getWindow().getDecorView(), entry.getValue());
            }
        }
        for (Map.Entry<Fragment, IPage> entry2 : this.f.entrySet()) {
            if (entry2.getKey() != null && entry2.getKey().getView() != null && entry2.getValue() != null && this.g.get(entry2.getValue()) != null) {
                hashMap.put(entry2.getKey().getView(), entry2.getValue());
            }
        }
        return hashMap;
    }

    @Override // com.taobao.monitor.procedure.j
    public g c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("3cf10f58", new Object[]{this}) : c(this.f18223a);
    }

    @Override // com.taobao.monitor.procedure.j
    public g d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("b13047b7", new Object[]{this}) : c(this.d);
    }

    public g a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("98e58b2e", new Object[]{this, gVar});
        }
        if (gVar == null) {
            this.d = g.DEFAULT;
        } else {
            this.d = gVar;
        }
        return this.d;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.g.clear();
        this.i.clear();
    }

    public void a(IPage iPage, WeakReference<View> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8cc485b", new Object[]{this, iPage, weakReference});
        } else if (weakReference == null) {
        } else {
            this.i.put(iPage, weakReference);
        }
    }

    private g c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("d1c183ec", new Object[]{this, gVar}) : gVar == null ? g.DEFAULT : gVar;
    }

    private IPage c(IPage iPage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPage) ipChange.ipc$dispatch("79a97cc", new Object[]{this, iPage}) : iPage == null ? IPage.DEFAULT_PAGE : iPage;
    }

    public List<JSONObject> b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str}) : d(str);
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        List<JSONObject> d = d(str);
        if (d != null && !d.isEmpty()) {
            return d.get(0).toString();
        }
        return null;
    }

    private List<JSONObject> d(String str) {
        u a2;
        u a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4c7331b2", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Fragment, IPage> entry : this.f.entrySet()) {
            IPage value = entry.getValue();
            if (value != null && (a3 = a(this.g.get(value), str)) != null) {
                a(c(entry.getKey()), a3);
                try {
                    arrayList.add(new JSONObject(mpn.b(a3)));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        u a4 = a(this.b, str);
        if (a4 != null) {
            try {
                arrayList.add(new JSONObject(mpn.b(a4)));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        for (IPage iPage : this.e.values()) {
            if (iPage != null && (a2 = a(this.g.get(iPage), str)) != null) {
                try {
                    arrayList.add(new JSONObject(mpn.b(a2)));
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    private u a(g gVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("215fb6d6", new Object[]{this, gVar, str});
        }
        u b = b(gVar);
        if (b != null && b.l().get("H5_URL") != null && !StringUtils.isEmpty(b.l().get("H5_URL").toString()) && a(str, b.l().get("H5_URL").toString())) {
            return b;
        }
        if (b != null && b.l().get("schemaUrl") != null && !StringUtils.isEmpty(b.l().get("schemaUrl").toString()) && a(str, b.l().get("schemaUrl").toString())) {
            return b;
        }
        return null;
    }

    public u b(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("3553893f", new Object[]{this, gVar});
        }
        if (gVar instanceof t) {
            return ((ProcedureImpl) ((t) gVar).e()).f();
        }
        if (!(gVar instanceof ProcedureImpl)) {
            return null;
        }
        return ((ProcedureImpl) gVar).f();
    }

    private boolean a(String str, String str2) {
        URI uri;
        URI uri2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            uri = new URI(str);
            uri2 = new URI(str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (uri2.equals(uri)) {
            return true;
        }
        return str.substring(uri.getScheme().length()).equals(str2.substring(uri2.getScheme().length()));
    }

    private g c(Fragment fragment) {
        IPage iPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("7cadbc7a", new Object[]{this, fragment});
        }
        FragmentActivity activity = fragment.getActivity();
        if (activity != null && (iPage = this.e.get(activity)) != null) {
            return this.g.get(iPage);
        }
        return null;
    }

    private void a(g gVar, u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8fac572", new Object[]{this, gVar, uVar});
        } else if (gVar != null && uVar != null && b(gVar) != null) {
            for (mqk mqkVar : b(gVar).i()) {
                if ("phaPageNavigationStart".equals(mqkVar.a())) {
                    uVar.i().add(new mqk(mqkVar.a(), mqkVar.b()));
                }
                if ("phaStartTime".equals(mqkVar.a())) {
                    uVar.i().add(new mqk(mqkVar.a(), mqkVar.b()));
                }
                if ("phaManifestFinishLoad".equals(mqkVar.a())) {
                    uVar.i().add(new mqk(mqkVar.a(), mqkVar.b()));
                }
                if ("phaPageCreateStart".equals(mqkVar.a())) {
                    uVar.i().add(new mqk(mqkVar.a(), mqkVar.b()));
                }
                if ("phaStartTime".equals(mqkVar.a())) {
                    uVar.i().add(new mqk(mqkVar.a(), mqkVar.b()));
                }
                if ("navStartTime".equals(mqkVar.a())) {
                    uVar.i().add(new mqk(mqkVar.a(), mqkVar.b()));
                }
            }
        }
    }
}
