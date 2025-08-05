package tb;

import android.content.Context;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.TBPlayerConst;

/* loaded from: classes8.dex */
public class oic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f32081a = 0;
    private int b = 0;
    private long c = 0;
    private int d = Integer.MIN_VALUE;
    private int e = 0;
    private int f = Integer.MIN_VALUE;
    private int g = Integer.MIN_VALUE;
    private boolean h = false;
    private oid i = oid.EMPTY_LISTENER;

    static {
        kge.a(-1644279478);
        kge.a(203352297);
    }

    public static /* synthetic */ int a(oic oicVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7f48062", new Object[]{oicVar})).intValue() : oicVar.e;
    }

    public static /* synthetic */ oid b(oic oicVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oid) ipChange.ipc$dispatch("9cc2d0c", new Object[]{oicVar}) : oicVar.i;
    }

    public oic(Context context) {
        a(context, oeb.a(4000), oeb.b(TBPlayerConst.TBPlayerPropertyFloatReadOnlyBorder));
    }

    public void a(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c642cc0", new Object[]{this, context, new Integer(i), new Integer(i2)});
        } else if (i < i2 || i2 <= 0) {
            throw new IllegalArgumentException("应该确保upThreshold >= downThreshold > 0");
        } else {
            a(ohd.b(context, i), ohd.b(context, i2));
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i < i2 || i2 <= 0) {
            throw new IllegalArgumentException("应该确保upThreshold >= downThreshold > 0");
        } else {
            this.f = i;
            this.g = i2;
        }
    }

    public void a(oid oidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4f4ce", new Object[]{this, oidVar});
            return;
        }
        if (oidVar == null) {
            oidVar = oid.EMPTY_LISTENER;
        }
        this.i = oidVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f32081a = 0;
        this.b = 0;
        this.d = Integer.MIN_VALUE;
        this.c = 0L;
        b(0);
    }

    public final void a(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.b += i;
        int i3 = this.f32081a + 1;
        this.f32081a = i3;
        if (i3 < 8) {
            return;
        }
        long b = b();
        if (this.b != 0) {
            long j = this.c;
            if (j > 0 && b > j) {
                b((int) ((i2 * 1000) / (b - j)));
            }
        }
        this.b = 0;
        this.f32081a = 0;
        this.c = b;
    }

    private long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : SystemClock.uptimeMillis();
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (i == this.e) {
        } else {
            this.e = i;
            oec.a(new Runnable() { // from class: tb.oic.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        oic.b(oic.this).a(oic.a(oic.this));
                    }
                }
            });
            if (this.f == Integer.MIN_VALUE || this.g == Integer.MIN_VALUE) {
                return;
            }
            if (this.h) {
                if (Math.abs(this.e) >= this.g) {
                    return;
                }
                this.h = false;
                oec.a(new Runnable() { // from class: tb.oic.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            oic.b(oic.this).c();
                        }
                    }
                });
            } else if (Math.abs(this.e) <= this.f) {
            } else {
                this.h = true;
                oec.a(new Runnable() { // from class: tb.oic.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            oic.b(oic.this).b();
                        }
                    }
                });
            }
        }
    }
}
