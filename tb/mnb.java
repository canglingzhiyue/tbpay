package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.e;
import com.taobao.monitor.impl.util.h;

/* loaded from: classes.dex */
public abstract class mnb implements mnf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f31127a = 0;
    private int b = 0;
    private long c;
    private long d;

    public abstract int b(View view);

    public static /* synthetic */ int a(mnb mnbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f4d0d04a", new Object[]{mnbVar})).intValue() : mnbVar.f31127a;
    }

    public static /* synthetic */ int a(mnb mnbVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a549ad7f", new Object[]{mnbVar, new Integer(i)})).intValue();
        }
        mnbVar.f31127a = i;
        return i;
    }

    public static /* synthetic */ long a(mnb mnbVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a549b141", new Object[]{mnbVar, new Long(j)})).longValue();
        }
        mnbVar.d = j;
        return j;
    }

    @Override // tb.mnf
    public int c(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d05011b", new Object[]{this, view})).intValue();
        }
        if (view.hashCode() != this.b) {
            this.b = view.hashCode();
            this.f31127a = 0;
            this.c = h.a();
            this.d = 0L;
            return this.f31127a;
        }
        if (this.f31127a != 100) {
            e.a().j().post(new Runnable() { // from class: tb.mnb.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        mnb.a(mnb.this, mnb.this.b(view));
                        if (mnb.a(mnb.this) != 100) {
                            return;
                        }
                        mnb.a(mnb.this, h.a());
                    } catch (Exception e) {
                        mpk.a(e);
                        mnb.a(mnb.this, 0);
                    }
                }
            });
        }
        long a2 = h.a();
        long j = this.d;
        if (j != 0) {
            long j2 = this.d;
            if (((float) (a2 - j2)) > ((((float) (10 - Math.min(10L, j - this.c))) * 1.5f) / 10.0f) * ((float) (j2 - this.c))) {
                return this.f31127a;
            }
        }
        return this.f31127a - 1;
    }
}
