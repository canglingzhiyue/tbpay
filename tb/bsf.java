package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bsf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f26092a;
    private boolean b;
    private brz c;
    private brz d;
    private View e;
    private View f;

    static {
        kge.a(-820448318);
    }

    public static /* synthetic */ boolean a(bsf bsfVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6825fab5", new Object[]{bsfVar, new Boolean(z)})).booleanValue();
        }
        bsfVar.f26092a = z;
        return z;
    }

    public static /* synthetic */ boolean b(bsf bsfVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a03c454", new Object[]{bsfVar, new Boolean(z)})).booleanValue();
        }
        bsfVar.b = z;
        return z;
    }

    public void a(brz brzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24ec86e", new Object[]{this, brzVar});
        } else {
            this.c = brzVar;
        }
    }

    public void b(brz brzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d1ceef", new Object[]{this, brzVar});
        } else {
            this.d = brzVar;
        }
    }

    private brz b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brz) ipChange.ipc$dispatch("16b49193", new Object[]{this});
        }
        brz brzVar = this.c;
        if (brzVar != null) {
            return brzVar;
        }
        this.c = new bsd();
        return this.c;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f26092a;
    }

    public boolean a(View view, View view2, final bsa bsaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c630f6c", new Object[]{this, view, view2, bsaVar})).booleanValue();
        }
        if (this.f26092a) {
            return false;
        }
        this.f26092a = true;
        this.b = false;
        this.e = view;
        this.f = view2;
        a(view2);
        b().a(view, new bsa() { // from class: tb.bsf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bsa
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                bsf.a(bsf.this, false);
                bsa bsaVar2 = bsaVar;
                if (bsaVar2 == null) {
                    return;
                }
                bsaVar2.a();
            }

            @Override // tb.bsa
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                bsf.a(bsf.this, false);
                bsa bsaVar2 = bsaVar;
                if (bsaVar2 == null) {
                    return;
                }
                bsaVar2.b();
            }
        });
        return false;
    }

    public boolean a(final bsa bsaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e25182ac", new Object[]{this, bsaVar})).booleanValue();
        }
        if (this.b) {
            return false;
        }
        this.b = true;
        this.f26092a = false;
        if (this.e == null) {
            if (bsaVar != null) {
                bsaVar.b();
            }
            this.b = false;
            return false;
        }
        b(this.f);
        b().b(this.e, new bsa() { // from class: tb.bsf.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bsa
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                bsf.b(bsf.this, false);
                bsa bsaVar2 = bsaVar;
                if (bsaVar2 == null) {
                    return;
                }
                bsaVar2.a();
            }

            @Override // tb.bsa
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                bsf.b(bsf.this, false);
                bsa bsaVar2 = bsaVar;
                if (bsaVar2 == null) {
                    return;
                }
                bsaVar2.b();
            }
        });
        return true;
    }

    private void a(View view) {
        brz brzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null || (brzVar = this.d) == null) {
        } else {
            brzVar.a(view, null);
        }
    }

    private void b(View view) {
        brz brzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (view == null || (brzVar = this.d) == null) {
        } else {
            brzVar.b(view, null);
        }
    }
}
