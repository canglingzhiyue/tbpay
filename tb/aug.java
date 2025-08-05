package tb;

import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes2.dex */
public class aug implements View.OnLayoutChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView f25608a;
    private RecyclerView.OnScrollListener b;
    private Runnable c;
    private final List<aut> d;
    private final List<aut> e;

    static {
        kge.a(1152368277);
        kge.a(-782512414);
    }

    public static /* synthetic */ void a(aug augVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0bb9345", new Object[]{augVar});
        } else {
            augVar.a();
        }
    }

    public static /* synthetic */ void a(aug augVar, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9356ab73", new Object[]{augVar, recyclerView});
        } else {
            augVar.a(recyclerView);
        }
    }

    public aug(List<aut> list, List<aut> list2) {
        this.d = list;
        this.e = list2;
    }

    public void a(View view) {
        ViewParent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null || !bbj.a(view.getContext()) || this.f25608a == (parent = view.getParent()) || !(parent instanceof RecyclerView)) {
        } else {
            this.f25608a = (RecyclerView) parent;
            this.f25608a.addOnLayoutChangeListener(this);
            RecyclerView.OnScrollListener onScrollListener = this.b;
            if (onScrollListener != null) {
                this.f25608a.removeOnScrollListener(onScrollListener);
            }
            this.b = new RecyclerView.OnScrollListener() { // from class: tb.aug.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == 2142696127) {
                        super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (i != 0) {
                        return;
                    }
                    aug.a(aug.this, recyclerView);
                }
            };
            this.f25608a.addOnScrollListener(this.b);
        }
    }

    private void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            recyclerView.removeCallbacks(runnable);
        }
        this.c = new Runnable() { // from class: tb.aug.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    aug.a(aug.this);
                }
            }
        };
        recyclerView.postDelayed(this.c, 250L);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
        } else {
            a();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (aut autVar : this.d) {
            View b = autVar.b();
            if (b != null) {
                ViewCompat.setImportantForAccessibility(b, 1);
            }
        }
        for (aut autVar2 : this.e) {
            View b2 = autVar2.b();
            if (b2 != null) {
                ViewCompat.setImportantForAccessibility(b2, 1);
            }
        }
    }
}
