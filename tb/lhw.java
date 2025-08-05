package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.tbpoplayer.view.c;
import tb.lks;

/* loaded from: classes7.dex */
public class lhw implements lks.c<RecyclerView> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IHostService d;

    /* renamed from: a  reason: collision with root package name */
    private int f30633a = 0;
    private int b = 0;
    private int c = -1;
    private boolean e = "l".equals(ldc.a());

    static {
        kge.a(1028333520);
        kge.a(439987723);
    }

    public static /* synthetic */ int a(lhw lhwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f2d0f670", new Object[]{lhwVar})).intValue() : lhwVar.f30633a;
    }

    public static /* synthetic */ void a(lhw lhwVar, llh llhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49da2805", new Object[]{lhwVar, llhVar});
        } else {
            lhwVar.a(llhVar);
        }
    }

    public static /* synthetic */ int b(lhw lhwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e153fcf1", new Object[]{lhwVar})).intValue() : lhwVar.b;
    }

    public static /* synthetic */ void c(lhw lhwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd7037f", new Object[]{lhwVar});
        } else {
            lhwVar.a();
        }
    }

    public lhw(ljs ljsVar) {
        this.d = (IHostService) ljsVar.a(IHostService.class);
    }

    @Override // tb.lks.c
    public void a(RecyclerView recyclerView, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        if (this.c != i) {
            ljd.a().a(new Runnable() { // from class: tb.lhw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        lhw.a(lhw.this, llh.a(c.PAGE_EVENT_SCROLL_STATE_CHANGED).a("newState", String.valueOf(i)));
                    }
                }
            });
        }
        this.c = i;
    }

    @Override // tb.lks.c
    public void a(RecyclerView recyclerView, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else if (this.e) {
        } else {
            this.b += i;
            this.f30633a += i2;
            ljd.a().a(new Runnable() { // from class: tb.lhw.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        lhw.a(lhw.this, llh.a(c.PAGE_EVENT_SCROLLED).a("dy", String.valueOf(i2)).a("dx", String.valueOf(i)).a("offsetx", String.valueOf(lhw.b(lhw.this))).a("offsety", String.valueOf(lhw.a(lhw.this))));
                    }
                }
            });
        }
    }

    @Override // tb.lks.c
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!z) {
        } else {
            ljd.a().a(new Runnable() { // from class: tb.lhw.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        lhw.c(lhw.this);
                    }
                }
            });
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f30633a != 0) {
            a(llh.a(c.PAGE_EVENT_SCROLLED).a("dy", String.valueOf(-this.f30633a)).a("dx", "0").a("offsetx", "0").a("offsety", "0"));
        }
        this.f30633a = 0;
    }

    private void a(llh llhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30282f0", new Object[]{this, llhVar});
        } else {
            this.d.getInvokeCallback().g().a(llhVar);
        }
    }
}
