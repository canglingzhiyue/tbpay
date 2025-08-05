package tb;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.e;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.ctb;

/* loaded from: classes3.dex */
public abstract class ctc<T extends ctb, M extends e, C> implements cte<M, C> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final a f26505a;
    private static final a f;
    private static final a g;
    private static final a h;
    private static final a i;
    public boolean L;
    public int M;
    public T b;
    public cte<M, C> c;
    public Activity d;
    public List<ctc<T, M, C>> e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface a {
        void a(ctc ctcVar);
    }

    public void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
        }
    }

    public T b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("16b50a8c", new Object[]{this});
        }
        return null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public ctc(Activity activity, cte<M, C> cteVar) {
        this(activity, cteVar, true);
    }

    public ctc(Activity activity, cte<M, C> cteVar, boolean z) {
        this(activity, cteVar, z, true);
    }

    public ctc(Activity activity, cte<M, C> cteVar, boolean z, boolean z2) {
        this.L = true;
        this.M = 1;
        this.d = activity;
        this.L = z2;
        if (z) {
            a(activity);
        }
        this.c = cteVar;
        if (cteVar != null && z2) {
            cteVar.a(this);
        }
        this.b = b();
        T t = this.b;
        if (t != null) {
            t.a(this);
        }
        c();
        T t2 = this.b;
        if (t2 != null) {
            t2.z_();
        }
    }

    public ctc(Activity activity) {
        this(activity, null);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.e != null) {
        } else {
            this.e = new CopyOnWriteArrayList();
        }
    }

    public Activity s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("42aa976e", new Object[]{this}) : this.d;
    }

    @Override // tb.cte
    public void a(ctc ctcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4155b86", new Object[]{this, ctcVar});
            return;
        }
        a();
        this.e.add(ctcVar);
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        T t = this.b;
        if (t == null) {
            return;
        }
        t.a(intent);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.M = 2;
        T t = this.b;
        if (t != null) {
            t.a();
        }
        a(f26505a);
    }

    public void B_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f01664", new Object[]{this});
            return;
        }
        this.M = 3;
        T t = this.b;
        if (t != null) {
            t.b();
        }
        a(f);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.M = 4;
        a(g);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.M = 5;
        T t = this.b;
        if (t != null) {
            t.c();
        }
        a(h);
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else {
            a(i);
        }
    }

    public void a(final int i2, final String[] strArr, final int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6953b2", new Object[]{this, new Integer(i2), strArr, iArr});
        } else {
            a(new a() { // from class: tb.ctc.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ctc.a
                public void a(ctc ctcVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e4155b86", new Object[]{this, ctcVar});
                    } else {
                        ctcVar.a(i2, strArr, iArr);
                    }
                }
            });
        }
    }

    private void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33018a29", new Object[]{this, aVar});
            return;
        }
        List<ctc<T, M, C>> list = this.e;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ctc<T, M, C> ctcVar : this.e) {
            aVar.a(ctcVar);
        }
    }

    @Override // tb.cte
    public M h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ipChange.ipc$dispatch("b2c7c646", new Object[]{this});
        }
        cte<M, C> cteVar = this.c;
        if (cteVar == null) {
            return null;
        }
        return cteVar.h();
    }

    @Override // tb.cte
    public C j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("77e79761", new Object[]{this});
        }
        cte<M, C> cteVar = this.c;
        if (cteVar == null) {
            return null;
        }
        return cteVar.j();
    }

    private void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        cot.c("BaseView", "register ScreenTypeChange listener");
        ScreenType a2 = ScreenType.a(activity);
        if (a2 == null) {
            return;
        }
        a2.a(new com.taobao.android.searchbaseframe.uikit.screentype.a() { // from class: tb.ctc.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.uikit.screentype.a
            public void i_(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57263006", new Object[]{this, new Integer(i2)});
                    return;
                }
                cot.c("BaseView", "onScreenTypeChanged " + i2);
                ctc.this.a(i2);
            }
        });
    }

    public int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69459f0", new Object[]{this})).intValue();
        }
        ScreenType a2 = ScreenType.a(this.d);
        if (a2 == null) {
            return 0;
        }
        return a2.a();
    }

    static {
        kge.a(1759366721);
        kge.a(-551751325);
        kge.a(1947847914);
        f26505a = new a() { // from class: tb.ctc.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ctc.a
            public void a(ctc ctcVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e4155b86", new Object[]{this, ctcVar});
                } else {
                    ctcVar.d();
                }
            }
        };
        f = new a() { // from class: tb.ctc.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ctc.a
            public void a(ctc ctcVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e4155b86", new Object[]{this, ctcVar});
                } else {
                    ctcVar.B_();
                }
            }
        };
        g = new a() { // from class: tb.ctc.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ctc.a
            public void a(ctc ctcVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e4155b86", new Object[]{this, ctcVar});
                } else {
                    ctcVar.e();
                }
            }
        };
        h = new a() { // from class: tb.ctc.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ctc.a
            public void a(ctc ctcVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e4155b86", new Object[]{this, ctcVar});
                } else {
                    ctcVar.f();
                }
            }
        };
        i = new a() { // from class: tb.ctc.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ctc.a
            public void a(ctc ctcVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e4155b86", new Object[]{this, ctcVar});
                } else {
                    ctcVar.t();
                }
            }
        };
    }
}
