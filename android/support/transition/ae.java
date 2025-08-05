package android.support.transition;

import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ae {

    /* renamed from: a  reason: collision with root package name */
    private static Transition f1273a = new AutoTransition();
    private static ThreadLocal<WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>>> b = new ThreadLocal<>();
    private static ArrayList<ViewGroup> c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        Transition f1274a;
        ViewGroup b;

        a(Transition transition, ViewGroup viewGroup) {
            this.f1274a = transition;
            this.b = viewGroup;
        }

        private void a() {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!ae.c.remove(this.b)) {
                return true;
            }
            final ArrayMap<ViewGroup, ArrayList<Transition>> a2 = ae.a();
            ArrayList<Transition> arrayList = a2.get(this.b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                a2.put(this.b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f1274a);
            this.f1274a.addListener(new ad() { // from class: android.support.transition.ae.a.1
                @Override // android.support.transition.ad, android.support.transition.Transition.d
                public void b(Transition transition) {
                    ((ArrayList) a2.get(a.this.b)).remove(transition);
                }
            });
            this.f1274a.captureValues(this.b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).resume(this.b);
                }
            }
            this.f1274a.playTransition(this.b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            ae.c.remove(this.b);
            ArrayList<Transition> arrayList = ae.a().get(this.b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().resume(this.b);
                }
            }
            this.f1274a.clearValues(true);
        }
    }

    static ArrayMap<ViewGroup, ArrayList<Transition>> a() {
        WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>> weakReference = b.get();
        if (weakReference == null || weakReference.get() == null) {
            WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>> weakReference2 = new WeakReference<>(new ArrayMap());
            b.set(weakReference2);
            weakReference = weakReference2;
        }
        return weakReference.get();
    }

    public static void a(ViewGroup viewGroup) {
        a(viewGroup, null);
    }

    public static void a(ViewGroup viewGroup, Transition transition) {
        if (c.contains(viewGroup) || !ViewCompat.isLaidOut(viewGroup)) {
            return;
        }
        c.add(viewGroup);
        if (transition == null) {
            transition = f1273a;
        }
        Transition m18clone = transition.m18clone();
        c(viewGroup, m18clone);
        aa.a(viewGroup, null);
        b(viewGroup, m18clone);
    }

    private static void b(ViewGroup viewGroup, Transition transition) {
        if (transition == null || viewGroup == null) {
            return;
        }
        a aVar = new a(transition, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void c(ViewGroup viewGroup, Transition transition) {
        ArrayList<Transition> arrayList = a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<Transition> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().pause(viewGroup);
            }
        }
        if (transition != null) {
            transition.captureValues(viewGroup, true);
        }
        aa a2 = aa.a(viewGroup);
        if (a2 != null) {
            a2.a();
        }
    }
}
