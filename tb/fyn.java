package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import tb.fyo;
import tb.fyp;
import tb.fzg;

/* loaded from: classes5.dex */
public class fyn<ExposeKey, ExposeData> extends fyp<ExposeKey, ExposeData> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final WeakReference<RecyclerView> b;
    private fyn<ExposeKey, ExposeData>.b c;
    private final Set<String> d;

    static {
        kge.a(711946212);
    }

    public static /* synthetic */ Object ipc$super(fyn fynVar, String str, Object... objArr) {
        if (str.hashCode() == 1037559155) {
            super.b((String) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Set a(fyn fynVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("4626b82c", new Object[]{fynVar}) : fynVar.d;
    }

    public static /* synthetic */ fyw b(fyn fynVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fyw) ipChange.ipc$dispatch("881b1dc4", new Object[]{fynVar}) : fynVar.f28222a;
    }

    public static /* synthetic */ fyw c(fyn fynVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fyw) ipChange.ipc$dispatch("6fbcf423", new Object[]{fynVar}) : fynVar.f28222a;
    }

    public fyn(RecyclerView recyclerView, fyw<ExposeKey, ExposeData> fywVar) {
        super(fywVar);
        this.d = new HashSet();
        this.b = new WeakReference<>(recyclerView);
    }

    @Override // tb.fyp, tb.fyt
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b((String) null);
        }
    }

    @Override // tb.fyt
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (str == null) {
            for (fyv<ExposeKey, ExposeData> fyvVar : this.f28222a.g()) {
                this.d.add(fyvVar.a());
            }
        } else {
            this.d.add(str);
        }
        if (this.c != null) {
            if (str == null) {
                this.f28222a.e();
                return;
            } else {
                this.f28222a.e(str);
                return;
            }
        }
        this.c = new b();
        RecyclerView recyclerView = this.b.get();
        if (recyclerView == null) {
            return;
        }
        recyclerView.addOnAttachStateChangeListener(this.c);
    }

    @Override // tb.fyp
    public void b(String str) {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        super.b(str);
        if (str == null) {
            this.d.clear();
        } else {
            this.d.remove(str);
        }
        if (this.c == null || !this.d.isEmpty() || (recyclerView = this.b.get()) == null) {
            return;
        }
        recyclerView.removeOnAttachStateChangeListener(this.c);
    }

    /* loaded from: classes5.dex */
    public class b implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-731295156);
            kge.a(-1859085092);
        }

        private b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                return;
            }
            for (String str : fyn.a(fyn.this)) {
                fyn.b(fyn.this).e(str);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            } else {
                fyn.c(fyn.this).f();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class a<ExposeKey, ExposeData> extends fyp.a<ExposeKey, ExposeData, fyo.a<ExposeData>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final RecyclerView f28217a;

        static {
            kge.a(287974075);
        }

        public a(RecyclerView recyclerView, fzg.b<ExposeKey, ExposeData> bVar) {
            this(recyclerView, bVar, new fze());
        }

        public a(RecyclerView recyclerView, fzg.b<ExposeKey, ExposeData> bVar, fys<ExposeKey, ExposeData, fyo.a<ExposeData>> fysVar) {
            super(new fzg.a(recyclerView).a(bVar), fysVar);
            this.f28217a = recyclerView;
        }

        @Override // tb.fyp.a
        public fyt<ExposeKey, ExposeData> a(fyw<ExposeKey, ExposeData> fywVar, Collection<fyv<ExposeKey, ExposeData>> collection) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fyt) ipChange.ipc$dispatch("e10f4000", new Object[]{this, fywVar, collection}) : new fyn(this.f28217a, fywVar);
        }
    }
}
