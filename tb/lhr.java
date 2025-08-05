package tb;

import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.e;
import java.util.List;
import tb.lks;

/* loaded from: classes7.dex */
public class lhr implements lks.c<RecyclerView> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30622a;
    private int b = -1;
    private int c = -1;
    private int d = 0;
    private int e = 0;
    private final xng f;
    private long g;
    private int h;

    static {
        kge.a(-365662146);
        kge.a(439987723);
    }

    @Override // tb.lks.c
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    public static /* synthetic */ ljs a(lhr lhrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("854bf8f", new Object[]{lhrVar}) : lhrVar.f30622a;
    }

    public static /* synthetic */ void b(lhr lhrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e151b723", new Object[]{lhrVar});
        } else {
            lhrVar.a();
        }
    }

    public lhr(ljs ljsVar) {
        this.f30622a = ljsVar;
        a();
        this.f = new xng(ljsVar);
    }

    @Override // tb.lks.c
    public void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        this.b = this.c;
        this.c = recyclerView.getScrollState();
        if (recyclerView.getScrollState() == 1) {
            b(recyclerView, 1);
        }
        if (this.d == 0 && this.e == 0) {
            return;
        }
        a(recyclerView);
    }

    @Override // tb.lks.c
    public void a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        this.d = i + this.d;
        this.e = i2 + this.e;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.g <= this.h) {
            return;
        }
        this.g = uptimeMillis;
        b(recyclerView, 2);
    }

    private void a(RecyclerView recyclerView) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        int i2 = this.c;
        if (i2 == -1 || (i = this.b) == -1) {
            return;
        }
        if (i == 1 && i2 == 2) {
            return;
        }
        if (this.b == 0 && this.c == 1) {
            return;
        }
        this.d = 0;
        this.e = 0;
        b(recyclerView, 3);
    }

    private void b(RecyclerView recyclerView, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f244dcc", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        final int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        final int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        long uptimeMillis = SystemClock.uptimeMillis();
        final List<e> a2 = this.f.a();
        final long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        ljd.a().a(new Runnable() { // from class: tb.lhr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int i2 = i;
                if (i2 == 1) {
                    ldf.d("BxUserTrackScrollListener", "滚动开始 getVisibleCardTracings 耗时：" + uptimeMillis2);
                    liw.a(lhr.a(lhr.this).a(), computeHorizontalScrollOffset, computeVerticalScrollOffset, a2, null);
                } else if (i2 == 2) {
                    liw.b(lhr.a(lhr.this).a(), computeHorizontalScrollOffset, computeVerticalScrollOffset, a2, null);
                } else if (i2 != 3) {
                } else {
                    lhr.b(lhr.this);
                    liw.c(lhr.a(lhr.this).a(), computeHorizontalScrollOffset, computeVerticalScrollOffset, a2, null);
                }
            }
        });
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.h = ldj.a("bxCaptureCardVisualInterval", 100);
        }
    }
}
