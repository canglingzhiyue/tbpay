package com.taobao.tao.flexbox.layoutmanager.animation.shareelement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.SharedElementCallback;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.oec;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long SHARED_ANIMATION_DURATION = 200;

    /* renamed from: a  reason: collision with root package name */
    private static List<WeakReference<View>> f19972a;
    private ab b;
    private C0838b c;
    private List<aa> d;
    private List<aa> e;
    private List<String> f;
    private boolean g;
    private SharedElementCallback h = new SharedElementCallback() { // from class: com.taobao.tao.flexbox.layoutmanager.animation.shareelement.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
            if (str.hashCode() == -467145223) {
                return super.onCaptureSharedElementSnapshot((View) objArr[0], (Matrix) objArr[1], (RectF) objArr[2]);
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v4.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1003d994", new Object[]{this, list, map});
            } else if (Build.VERSION.SDK_INT >= 21) {
                if (b.a(b.this) != null) {
                    for (String str : b.a(b.this)) {
                        if (!map.containsKey(str)) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    list.clear();
                    map.clear();
                    List<String> a2 = b.a(b.this);
                    if (a2 != null) {
                        for (String str2 : a2) {
                            for (aa aaVar : b.b(b.this)) {
                                View c = b.c(aaVar);
                                if (str2 != null && c != null && str2.equals(c.getTransitionName())) {
                                    map.put(str2, c);
                                }
                            }
                        }
                    }
                }
                b.a(b.this, (List) null);
            }
        }

        @Override // android.support.v4.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Parcelable) ipChange.ipc$dispatch("e427edf9", new Object[]{this, view, matrix, rectF});
            }
            view.setAlpha(oec.b(view.getTag(R.id.layout_manager_share_element_original_alpha), 1));
            return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
        }
    };

    public static /* synthetic */ List a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("dc5c28d2", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ List a(b bVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c82585c1", new Object[]{bVar, list});
        }
        bVar.f = list;
        return list;
    }

    public static /* synthetic */ void a(b bVar, Activity activity, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec87dc0f", new Object[]{bVar, activity, aaVar});
        } else {
            bVar.a(activity, aaVar);
        }
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("353288a3", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.g = z;
        return z;
    }

    public static /* synthetic */ List b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("83d80293", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ boolean c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f882bd97", new Object[]{bVar})).booleanValue() : bVar.g;
    }

    static {
        kge.a(1736991269);
        f19972a = new ArrayList();
    }

    public b(ab abVar) {
        this.b = abVar;
    }

    public void a(final aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691d3050", new Object[]{this, aaVar});
            return;
        }
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(aaVar);
        final Context N = aaVar.N();
        if (!(N instanceof Activity)) {
            return;
        }
        final Object g = aaVar.k().g();
        boolean z = g instanceof f;
        if (z && oeb.ba()) {
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.animation.shareelement.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (!((f) g).getPageContainer().a() && ((f) g).getPageContainer().h().size() == 1) {
                        b.a(b.this, (Activity) N, aaVar);
                    }
                    ((f) aaVar.k().g()).startPostponedEnterTransition(b.this.c());
                }
            });
        } else if (z && ((f) g).getPageContainer().h().size() != 1) {
        } else {
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.animation.shareelement.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b.a(b.this, (Activity) N, aaVar);
                    oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.animation.shareelement.b.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                b.a(false);
                            }
                        }
                    }, 400L);
                    oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.animation.shareelement.b.3.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                b.a(true);
                            }
                        }
                    }, 1500L);
                }
            });
        }
    }

    private void a(Activity activity, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63f6a22", new Object[]{this, activity, aaVar});
            return;
        }
        aa a2 = aaVar.a("TabBarController", 1);
        if (a2 != null) {
            if (this.c == null) {
                this.c = new C0838b((TabBarControllerComponent) a2.I());
            }
            this.c.a(aaVar);
        } else if (this.g) {
        } else {
            this.g = true;
            ActivityCompat.setEnterSharedElementCallback(activity, new a());
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        for (WeakReference<View> weakReference : f19972a) {
            View view = weakReference.get();
            if (view != null) {
                float b = oec.b(view.getTag(R.id.layout_manager_share_element_original_alpha), 1);
                if (b > 0.0f && view.getAlpha() == 0.0f) {
                    view.setAlpha(b);
                }
            }
        }
        if (!z) {
            return;
        }
        f19972a.clear();
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
            return;
        }
        if (view.getAlpha() > 0.0f) {
            view.setTag(R.id.layout_manager_share_element_original_alpha, Float.valueOf(view.getAlpha()));
        }
        f19972a.add(new WeakReference<>(view));
    }

    public void b(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca84e11", new Object[]{this, aaVar});
            return;
        }
        List<aa> list = this.e;
        if (list == null) {
            return;
        }
        list.remove(aaVar);
    }

    public List<aa> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.e;
    }

    public aa b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("eea45475", new Object[]{this});
        }
        List<aa> list = this.e;
        if (list != null && !list.isEmpty()) {
            return this.e.get(0);
        }
        return null;
    }

    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this});
        }
        aa b = b();
        if (b == null) {
            return null;
        }
        return c(b);
    }

    public void a(List<aa> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null) {
        } else {
            this.d = new ArrayList(this.e);
            this.d.removeAll(list);
        }
    }

    public void a(int i, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d12ba58", new Object[]{this, new Integer(i), intent});
        } else {
            this.f = intent.getStringArrayListExtra("shareElements");
        }
    }

    public void d() {
        List<aa> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 21 && (this.b.l() instanceof Activity) && (list = this.d) != null && !list.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (aa aaVar : list) {
                if (c(aaVar) != null) {
                    arrayList.add(aaVar.I().getTransitionView().getTransitionName());
                }
            }
            Intent intent = new Intent();
            intent.putStringArrayListExtra("shareElements", arrayList);
            ((Activity) this.b.l()).setResult(-1, intent);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            ActivityCompat.setExitSharedElementCallback((Activity) this.b.l(), this.h);
        }
    }

    public void a(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83fa04f", new Object[]{this, tabBarControllerComponent});
            return;
        }
        if (this.c == null) {
            this.c = new C0838b(tabBarControllerComponent);
        }
        this.c.a();
    }

    /* renamed from: com.taobao.tao.flexbox.layoutmanager.animation.shareelement.b$b  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public class C0838b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private TabBarControllerComponent b;
        private HashMap<Integer, List<aa>> c;

        static {
            kge.a(-1064495500);
        }

        public static /* synthetic */ TabBarControllerComponent a(C0838b c0838b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TabBarControllerComponent) ipChange.ipc$dispatch("465e10c6", new Object[]{c0838b}) : c0838b.b;
        }

        public static /* synthetic */ HashMap b(C0838b c0838b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("dd2f6499", new Object[]{c0838b}) : c0838b.c;
        }

        public C0838b(TabBarControllerComponent tabBarControllerComponent) {
            this.b = tabBarControllerComponent;
        }

        public void a() {
            List<aa> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.c != null) {
                ArrayList arrayList = new ArrayList();
                int currentItem = this.b.getView().getCurrentItem();
                for (int i = 0; i < this.b.getNode().d.size(); i++) {
                    if (i != currentItem && (list = this.c.get(Integer.valueOf(i))) != null) {
                        arrayList.addAll(list);
                    }
                }
                b.this.a(arrayList);
            }
        }

        public void a(aa aaVar) {
            int a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("691d3050", new Object[]{this, aaVar});
            } else if (Build.VERSION.SDK_INT < 21 || (a2 = this.b.a(aaVar)) == -1) {
            } else {
                Context N = aaVar.N();
                if (!b.c(b.this)) {
                    b.a(b.this, true);
                    ActivityCompat.setEnterSharedElementCallback((Activity) N, new SharedElementCallback() { // from class: com.taobao.tao.flexbox.layoutmanager.animation.shareelement.b.b.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.support.v4.app.SharedElementCallback
                        public void onMapSharedElements(List<String> list, Map<String, View> map) {
                            IpChange ipChange2 = $ipChange;
                            boolean z = false;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("1003d994", new Object[]{this, list, map});
                                return;
                            }
                            int currentItem = C0838b.a(C0838b.this).getView().getCurrentItem();
                            List<aa> list2 = (List) C0838b.b(C0838b.this).get(Integer.valueOf(currentItem));
                            if (C0838b.a(C0838b.this).d() != currentItem) {
                                z = true;
                            } else if (list2 != null) {
                                for (aa aaVar2 : list2) {
                                    View c = b.c(aaVar2);
                                    if (c != null && !map.containsKey(c.getTransitionName())) {
                                        z = true;
                                    }
                                }
                            }
                            if (!z) {
                                return;
                            }
                            list.clear();
                            map.clear();
                            if (list2 == null) {
                                return;
                            }
                            for (aa aaVar3 : list2) {
                                View c2 = b.c(aaVar3);
                                if (c2 != null) {
                                    list.add(c2.getTransitionName());
                                    map.put(c2.getTransitionName(), c2);
                                }
                            }
                        }
                    });
                }
                if (this.c == null) {
                    this.c = new HashMap<>();
                }
                List<aa> list = this.c.get(Integer.valueOf(a2));
                if (list == null) {
                    list = new ArrayList<>();
                    this.c.put(Integer.valueOf(a2), list);
                }
                list.add(aaVar);
                a();
            }
        }
    }

    public static View c(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fe917394", new Object[]{aaVar});
        }
        if (aaVar != null && aaVar.I() != null) {
            return aaVar.I().getTransitionView();
        }
        return null;
    }

    /* loaded from: classes8.dex */
    public static class a extends SharedElementCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1801636783);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        private a() {
        }

        @Override // android.support.v4.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1003d994", new Object[]{this, list, map});
            } else if (map == null) {
            } else {
                Iterator<Map.Entry<String, View>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, View> next = it.next();
                    if (!a(next.getValue())) {
                        list.remove(next.getKey());
                        it.remove();
                    }
                }
            }
        }

        private boolean a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
            }
            if (view == null) {
                return false;
            }
            return view.getLocalVisibleRect(new Rect());
        }
    }
}
