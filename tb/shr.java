package tb;

import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class shr implements View.OnClickListener, sht {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final long f33586a;
    private final sht c;
    private long b = 0;
    private final a d = new a();

    public static /* synthetic */ long a(shr shrVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d953791d", new Object[]{shrVar, new Long(j)})).longValue();
        }
        shrVar.b = j;
        return j;
    }

    public static /* synthetic */ sht a(shr shrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sht) ipChange.ipc$dispatch("8ded144c", new Object[]{shrVar}) : shrVar.c;
    }

    static {
        kge.a(-861484770);
        kge.a(-1201612728);
        kge.a(-1514374609);
        f33586a = ViewConfiguration.getDoubleTapTimeout();
    }

    public shr(sht shtVar) {
        this.c = shtVar;
    }

    @Override // tb.sht
    public void onPendingClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bcd6a37", new Object[]{this});
        } else {
            this.c.onPendingClick();
        }
    }

    @Override // tb.sht
    public void onSingleClick(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e461e8c8", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.c.onSingleClick(f, f2);
        }
    }

    @Override // tb.sht
    public void onDoubleClick(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f84119f", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.c.onDoubleClick(f, f2);
        }
    }

    @Override // tb.sht
    public void onTripleClick(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52af96f2", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.c.onTripleClick(f, f2);
        }
    }

    @Override // tb.sht
    public void onLongClickCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b73f2e", new Object[]{this});
        } else {
            this.c.onLongClickCancel();
        }
    }

    @Override // tb.sht
    public boolean onLongClick(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f358e04", new Object[]{this, new Boolean(z)})).booleanValue() : this.c.onLongClick(z);
    }

    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float b;
        private float c;

        static {
            kge.a(-1496384609);
            kge.a(-1390502639);
        }

        private a() {
        }

        public static /* synthetic */ float a(a aVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ac667112", new Object[]{aVar, new Float(f)})).floatValue();
            }
            aVar.b = f;
            return f;
        }

        public static /* synthetic */ float b(a aVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8df84ef1", new Object[]{aVar, new Float(f)})).floatValue();
            }
            aVar.c = f;
            return f;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            shr.a(shr.this, 0L);
            shr.a(shr.this).onSingleClick(this.b, this.c);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.b < f33586a) {
            this.b = 0L;
            view.removeCallbacks(this.d);
            this.c.onDoubleClick(view.getPivotX(), view.getPivotY());
            return;
        }
        this.b = currentTimeMillis;
        this.c.onPendingClick();
        a.a(this.d, view.getPivotX());
        a.b(this.d, view.getPivotY());
        view.postDelayed(this.d, f33586a);
    }
}
