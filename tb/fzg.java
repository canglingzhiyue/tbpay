package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.fyv;

/* loaded from: classes5.dex */
public class fzg<ExposeKey, ExposeData> extends fyq<ExposeKey, ExposeData> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final WeakReference<RecyclerView> b;
    private final RecyclerView.OnScrollListener c;
    private final RecyclerView.OnChildAttachStateChangeListener d;
    private final fyr<ExposeKey, ExposeData> e;
    private boolean f;

    /* loaded from: classes5.dex */
    public interface b<ExposeKey, ExposeData> {
        void a(fyr<ExposeKey, ExposeData> fyrVar, String str, RecyclerView recyclerView, int i);

        void a(fyr<ExposeKey, ExposeData> fyrVar, String str, RecyclerView recyclerView, int i, int i2);

        void a(fyr<ExposeKey, ExposeData> fyrVar, String str, RecyclerView recyclerView, View view);

        void b(fyr<ExposeKey, ExposeData> fyrVar, String str, RecyclerView recyclerView, View view);
    }

    static {
        kge.a(-602189272);
    }

    public static /* synthetic */ Object ipc$super(fzg fzgVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 91915241) {
            super.b();
            return null;
        } else if (hashCode != 92838762) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.c();
            return null;
        }
    }

    public fzg(RecyclerView recyclerView, b<ExposeKey, ExposeData> bVar, fyr<ExposeKey, ExposeData> fyrVar) {
        this(recyclerView, bVar, fyrVar, null);
    }

    public fzg(RecyclerView recyclerView, b<ExposeKey, ExposeData> bVar, fyr<ExposeKey, ExposeData> fyrVar, String str) {
        super(str);
        this.f = false;
        this.b = new WeakReference<>(recyclerView);
        this.e = fyrVar;
        this.c = new d(bVar, fyrVar, str);
        this.d = new c(this.b, bVar, fyrVar, str);
    }

    @Override // tb.fyv
    public fyr<ExposeKey, ExposeData> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fyr) ipChange.ipc$dispatch("2619c71c", new Object[]{this}) : this.e;
    }

    @Override // tb.fyq, tb.fyv
    public void b() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (f() || (recyclerView = this.b.get()) == null) {
        } else {
            super.b();
            recyclerView.addOnScrollListener(this.c);
            recyclerView.addOnChildAttachStateChangeListener(this.d);
            this.f = true;
        }
    }

    @Override // tb.fyq, tb.fyv
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!f()) {
        } else {
            super.c();
            RecyclerView recyclerView = this.b.get();
            if (recyclerView == null) {
                this.f = false;
                return;
            }
            recyclerView.removeOnScrollListener(this.c);
            recyclerView.removeOnChildAttachStateChangeListener(this.d);
            this.f = false;
        }
    }

    @Override // tb.fyv
    public void e() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (f() && (recyclerView = this.b.get()) != null && this.d != null) {
            for (int i = 0; i < recyclerView.getChildCount(); i++) {
                this.d.onChildViewAttachedToWindow(recyclerView.getChildAt(i));
            }
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f;
    }

    /* loaded from: classes5.dex */
    public static class d<ExposeKey, ExposeData> extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final b<ExposeKey, ExposeData> f28230a;
        private final fyr<ExposeKey, ExposeData> b;
        private final String c;

        static {
            kge.a(-318054867);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 806944192) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            } else if (hashCode != 2142696127) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
        }

        public d(b<ExposeKey, ExposeData> bVar, fyr<ExposeKey, ExposeData> fyrVar, String str) {
            this.f28230a = bVar;
            this.b = fyrVar;
            this.c = str;
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            b<ExposeKey, ExposeData> bVar = this.f28230a;
            if (bVar == null) {
                return;
            }
            bVar.a(this.b, this.c, recyclerView, i, i2);
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            b<ExposeKey, ExposeData> bVar = this.f28230a;
            if (bVar == null) {
                return;
            }
            bVar.a(this.b, this.c, recyclerView, i);
        }
    }

    /* loaded from: classes5.dex */
    public static class c<ExposeKey, ExposeData> implements RecyclerView.OnChildAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<RecyclerView> f28229a;
        private final b<ExposeKey, ExposeData> b;
        private final fyr<ExposeKey, ExposeData> c;
        private final String d;

        static {
            kge.a(1128430133);
            kge.a(-1469681034);
        }

        public c(WeakReference<RecyclerView> weakReference, b<ExposeKey, ExposeData> bVar, fyr<ExposeKey, ExposeData> fyrVar, String str) {
            this.f28229a = weakReference;
            this.b = bVar;
            this.c = fyrVar;
            this.d = str;
        }

        @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("517542da", new Object[]{this, view});
                return;
            }
            WeakReference<RecyclerView> weakReference = this.f28229a;
            if (weakReference == null) {
                return;
            }
            RecyclerView recyclerView = weakReference.get();
            b<ExposeKey, ExposeData> bVar = this.b;
            if (bVar == null || recyclerView == null) {
                return;
            }
            bVar.a(this.c, this.d, recyclerView, view);
        }

        @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a66017d", new Object[]{this, view});
                return;
            }
            WeakReference<RecyclerView> weakReference = this.f28229a;
            if (weakReference == null) {
                return;
            }
            RecyclerView recyclerView = weakReference.get();
            b<ExposeKey, ExposeData> bVar = this.b;
            if (bVar == null || recyclerView == null) {
                return;
            }
            bVar.b(this.c, this.d, recyclerView, view);
        }
    }

    /* loaded from: classes5.dex */
    public static class a<ExposeKey, ExposeData> implements fyv.a<ExposeKey, ExposeData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final RecyclerView f28228a;
        private b<ExposeKey, ExposeData> b;

        static {
            kge.a(-1274969857);
            kge.a(2005862810);
        }

        @Override // tb.fyv.a
        public /* synthetic */ fyv a(fyr fyrVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fyv) ipChange.ipc$dispatch("f40c124a", new Object[]{this, fyrVar}) : b(fyrVar);
        }

        @Override // tb.fyv.a
        public /* synthetic */ fyv a(fyr fyrVar, String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fyv) ipChange.ipc$dispatch("b4a14580", new Object[]{this, fyrVar, str}) : b(fyrVar, str);
        }

        public a(RecyclerView recyclerView) {
            this.f28228a = recyclerView;
        }

        public a<ExposeKey, ExposeData> a(b<ExposeKey, ExposeData> bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b9c7286f", new Object[]{this, bVar});
            }
            this.b = bVar;
            return this;
        }

        public fzg<ExposeKey, ExposeData> b(fyr<ExposeKey, ExposeData> fyrVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fzg) ipChange.ipc$dispatch("dbadea99", new Object[]{this, fyrVar}) : new fzg<>(this.f28228a, this.b, fyrVar);
        }

        public fzg<ExposeKey, ExposeData> b(fyr<ExposeKey, ExposeData> fyrVar, String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fzg) ipChange.ipc$dispatch("15f3e40f", new Object[]{this, fyrVar, str}) : new fzg<>(this.f28228a, this.b, fyrVar, str);
        }
    }
}
