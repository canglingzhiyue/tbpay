package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.PageVisibleAlgorithm;
import com.taobao.monitor.impl.common.e;
import com.taobao.monitor.impl.util.h;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class mng implements Runnable, mne {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f31132a;
    private a b;
    private WeakReference<View> c;
    private volatile boolean d;
    private final mnn e;
    private PageVisibleAlgorithm f;

    /* loaded from: classes.dex */
    public interface a {
        void a(float f, long j);

        void a(View view);

        void a(WeakReference<View> weakReference);
    }

    public static /* synthetic */ a a(mng mngVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2f6d7dc4", new Object[]{mngVar, aVar});
        }
        mngVar.b = aVar;
        return aVar;
    }

    public mng(View view, String str) {
        this.d = false;
        this.e = new mnk();
        this.c = new WeakReference<>(view);
        this.f31132a = str;
    }

    public mng(View view, String str, PageVisibleAlgorithm pageVisibleAlgorithm) {
        this(view, str);
        this.f = pageVisibleAlgorithm;
    }

    public mng a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mng) ipChange.ipc$dispatch("241678eb", new Object[]{this, aVar});
        }
        this.b = aVar;
        return this;
    }

    @Override // tb.mne
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            e.a().f().postDelayed(this, 50L);
        }
    }

    @Override // tb.mne
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d = true;
        e.a().f().removeCallbacks(this);
        e.a().d().post(new Runnable() { // from class: tb.mng.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    mng.a(mng.this, (a) null);
                }
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.d) {
        } else {
            c();
            e.a().f().postDelayed(this, 75L);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        View view = this.c.get();
        if (view == null) {
            b();
            return;
        }
        try {
            View findViewById = view.findViewById(view.getResources().getIdentifier("content", "id", "android"));
            if (findViewById == null) {
                findViewById = view;
            }
            if (findViewById.getHeight() * findViewById.getWidth() == 0) {
                return;
            }
            a(findViewById, view);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void a(View view, View view2) {
        mnm a2;
        mnj a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7536b928", new Object[]{this, view, view2});
        } else if (this.b == null) {
        } else {
            long a4 = h.a();
            PageVisibleAlgorithm pageVisibleAlgorithm = this.f;
            if (pageVisibleAlgorithm != null) {
                a2 = this.e.a(pageVisibleAlgorithm, this.f31132a, view, view2);
            } else {
                a2 = this.e.a(this.f31132a, view, view2);
            }
            if (a2 == null || (a3 = a2.a()) == null) {
                return;
            }
            View d = a3.d();
            if (d != null) {
                this.c = new WeakReference<>(d);
                this.b.a(d);
                run();
            } else if (a3.c() != null) {
                this.b.a(new WeakReference<>(a3.c()));
                b();
            } else {
                this.b.a(a3.b() ? 1.0f : a3.a(), a4);
            }
        }
    }
}
