package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.os.Build;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.gbp;

/* loaded from: classes5.dex */
public abstract class gbs<T> extends gbo<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AnimatorSet c;
    private Set<WeakReference<ViewPropertyAnimator>> d;
    private boolean e;

    static {
        kge.a(-1825121661);
    }

    public abstract PropertyValuesHolder a(String str, T t, T t2);

    public abstract Property<View, T> a(String str);

    public abstract ViewPropertyAnimator b(View view, String str, T t);

    public static /* synthetic */ gbp.a a(gbs gbsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbp.a) ipChange.ipc$dispatch("1f2fb2b4", new Object[]{gbsVar}) : gbsVar.f28292a;
    }

    public static /* synthetic */ boolean b(gbs gbsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8756365", new Object[]{gbsVar})).booleanValue() : gbsVar.e;
    }

    public static /* synthetic */ gbp.a c(gbs gbsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbp.a) ipChange.ipc$dispatch("2c3b27f2", new Object[]{gbsVar}) : gbsVar.f28292a;
    }

    public static /* synthetic */ gbp.a d(gbs gbsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbp.a) ipChange.ipc$dispatch("b2c0e291", new Object[]{gbsVar}) : gbsVar.f28292a;
    }

    public static /* synthetic */ gbp.a e(gbs gbsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbp.a) ipChange.ipc$dispatch("39469d30", new Object[]{gbsVar}) : gbsVar.f28292a;
    }

    public static /* synthetic */ gbp.a f(gbs gbsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbp.a) ipChange.ipc$dispatch("bfcc57cf", new Object[]{gbsVar}) : gbsVar.f28292a;
    }

    public static /* synthetic */ gbp.a g(gbs gbsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbp.a) ipChange.ipc$dispatch("4652126e", new Object[]{gbsVar}) : gbsVar.f28292a;
    }

    public gbs(gbu<T> gbuVar) {
        super(gbuVar);
        this.e = false;
    }

    @Override // tb.gbp
    public void d() {
        T b2;
        List<String> a2;
        gbu gbuVar;
        T a3;
        PropertyValuesHolder a4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e = true;
        e();
        this.e = false;
        List<gbm> a5 = a();
        if (a5 == null || (b2 = b()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet<ViewPropertyAnimator> hashSet = new HashSet();
        for (gbm gbmVar : a5) {
            View b3 = gbmVar.b();
            if (b3 != null && (a2 = gbmVar.a()) != null && !a2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                ViewPropertyAnimator viewPropertyAnimator = null;
                int i = 0;
                while (i < a2.size()) {
                    String str = a2.get(i);
                    T a6 = this.b != null ? this.b.a(str, b3, b2) : b2;
                    ViewPropertyAnimator a7 = a(b3, str, (String) a6);
                    if (a7 == null && (a3 = a(b3, str)) != null && (a4 = a(str, a3, a6)) != null) {
                        arrayList2.add(a4);
                    }
                    i++;
                    viewPropertyAnimator = a7;
                }
                if (viewPropertyAnimator != null && Build.VERSION.SDK_INT >= 16) {
                    hashSet.add(viewPropertyAnimator);
                    viewPropertyAnimator.setDuration(gbuVar.f28298a).setStartDelay(gbuVar.b).setInterpolator(((gbu) c()).e).withStartAction(new e(b3, a2)).withEndAction(new d(b3, a2));
                }
                if (!arrayList2.isEmpty()) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    gbu gbuVar2 = (gbu) c();
                    objectAnimator.setTarget(b3);
                    objectAnimator.setValues((PropertyValuesHolder[]) arrayList2.toArray(new PropertyValuesHolder[0]));
                    int i2 = -1;
                    if (gbuVar2.c != -1) {
                        i2 = Math.max(0, gbuVar2.c - 1);
                    }
                    objectAnimator.setRepeatCount(i2);
                    objectAnimator.setRepeatMode(gbuVar2.d);
                    if (this.f28292a != null) {
                        objectAnimator.addListener(new a(b3));
                    }
                    arrayList.add(objectAnimator);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.c = new AnimatorSet();
            gbu gbuVar3 = (gbu) c();
            this.c.setDuration(gbuVar3.f28298a);
            this.c.setStartDelay(gbuVar3.b);
            this.c.setInterpolator(gbuVar3.e);
            this.c.playTogether(arrayList);
            this.c.start();
        }
        if (hashSet.isEmpty()) {
            return;
        }
        this.d = new HashSet();
        for (ViewPropertyAnimator viewPropertyAnimator2 : hashSet) {
            this.d.add(new WeakReference<>(viewPropertyAnimator2));
            viewPropertyAnimator2.start();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = this.c;
        if (animatorSet == null) {
            return;
        }
        animatorSet.cancel();
        this.c = null;
    }

    public T a(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("432e0efe", new Object[]{this, view, str});
        }
        Property<View, T> a2 = a(str);
        if (a2 != null) {
            return a2.get(view);
        }
        return null;
    }

    public gbl<T> a(View view, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gbl) ipChange.ipc$dispatch("8a0dfc6b", new Object[]{this, view, valueAnimator});
        }
        PropertyValuesHolder[] values = valueAnimator.getValues();
        if (values == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (PropertyValuesHolder propertyValuesHolder : values) {
            Property<View, T> a2 = a(propertyValuesHolder.getPropertyName());
            if (a2 != null) {
                arrayList.add(new Pair(propertyValuesHolder.getPropertyName(), a2.get(view)));
            }
        }
        return new gbl<>(view, arrayList);
    }

    public gbl<T> a(View view, Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gbl) ipChange.ipc$dispatch("d4e94bba", new Object[]{this, view, collection});
        }
        ArrayList arrayList = new ArrayList();
        for (String str : collection) {
            Property<View, T> a2 = a(str);
            if (a2 != null) {
                arrayList.add(new Pair(str, a2.get(view)));
            }
        }
        return new gbl<>(view, arrayList);
    }

    public ViewPropertyAnimator a(View view, String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimator) ipChange.ipc$dispatch("c686ab56", new Object[]{this, view, str, t});
        }
        if (Build.VERSION.SDK_INT >= 16 || ((gbu) c()).c != 0) {
            return null;
        }
        return b(view, str, t);
    }

    /* loaded from: classes5.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<View> f28295a;

        static {
            kge.a(1693052967);
        }

        public a(View view) {
            this.f28295a = new WeakReference<>(view);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            gbl<T> a2 = a(this.f28295a, animator);
            if (a2 == null) {
                return;
            }
            gbs.a(gbs.this).a(a2);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            gbl<T> a2 = a(this.f28295a, animator);
            if (a2 == null) {
                return;
            }
            gbs.c(gbs.this).a(a2, gbs.b(gbs.this));
        }

        public gbl<T> a(WeakReference<View> weakReference, Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gbl) ipChange.ipc$dispatch("56c65c02", new Object[]{this, weakReference, animator});
            }
            View view = weakReference.get();
            if (view != null && (animator instanceof ValueAnimator) && gbs.d(gbs.this) != null) {
                return gbs.this.a(view, (ValueAnimator) animator);
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public abstract class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<View> f28296a;
        public final List<String> b;

        static {
            kge.a(-1925731048);
            kge.a(-1390502639);
        }

        public abstract void a(View view);

        public c(View view, List<String> list) {
            this.f28296a = new WeakReference<>(view);
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View view = this.f28296a.get();
            if (gbs.e(gbs.this) == null || view == null) {
                return;
            }
            a(view);
        }
    }

    /* loaded from: classes5.dex */
    public class e extends gbs<T>.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1800754282);
        }

        public e(View view, List<String> list) {
            super(view, list);
        }

        @Override // tb.gbs.c
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            } else {
                gbs.f(gbs.this).a(gbs.this.a(view, this.b));
            }
        }
    }

    /* loaded from: classes5.dex */
    public class d extends gbs<T>.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-695439153);
        }

        public d(View view, List<String> list) {
            super(view, list);
        }

        @Override // tb.gbs.c
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            } else {
                gbs.g(gbs.this).a(gbs.this.a(view, this.b), false);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class b extends gbs<Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2050011584);
        }

        @Override // tb.gbs
        public /* synthetic */ ViewPropertyAnimator b(View view, String str, Float f) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ViewPropertyAnimator) ipChange.ipc$dispatch("9646def5", new Object[]{this, view, str, f}) : a(view, str, f);
        }

        public b(gbu<Float> gbuVar) {
            super(gbuVar);
        }

        @Override // tb.gbs
        public PropertyValuesHolder a(String str, Float f, Float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PropertyValuesHolder) ipChange.ipc$dispatch("25d836e5", new Object[]{this, str, f, f2});
            }
            Property<View, Float> a2 = a(str);
            if (a2 == null) {
                return null;
            }
            return PropertyValuesHolder.ofFloat(a2, f.floatValue(), f2.floatValue());
        }

        @Override // tb.gbs
        public Property<View, Float> a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Property) ipChange.ipc$dispatch("310214e1", new Object[]{this, str});
            }
            com.taobao.android.dinamicx_v4.animation.util.a a2 = com.taobao.android.dinamicx_v4.animation.util.a.a(str, Float.class);
            if (a2 != null) {
                return (Property<View, T>) a2.c;
            }
            return null;
        }

        public ViewPropertyAnimator a(View view, String str, Float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewPropertyAnimator) ipChange.ipc$dispatch("1f3e702b", new Object[]{this, view, str, f});
            }
            com.taobao.android.dinamicx_v4.animation.util.a a2 = com.taobao.android.dinamicx_v4.animation.util.a.a(str, Float.class);
            if (a2 != null) {
                return a2.a(view, (View) f);
            }
            return null;
        }
    }
}
