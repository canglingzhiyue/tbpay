package tb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.IpChange;
import tb.meh;

/* loaded from: classes7.dex */
public class mee implements mef {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private meh f31035a;
    private meh.e c;
    private meh.f d;
    private meh.b e;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private int k = Result.ALIPAY_VERIFY_UNREG_NODE_FAILED;
    private a b = new a();

    public static /* synthetic */ meh a(mee meeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (meh) ipChange.ipc$dispatch("5026226b", new Object[]{meeVar}) : meeVar.f31035a;
    }

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            b(str);
        }
    }

    public mee(meh mehVar) {
        this.f31035a = mehVar;
        mehVar.b(this.b);
    }

    public void a() {
        meh.e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b("onMoreViewShowed");
        if (this.g || (eVar = this.c) == null) {
            return;
        }
        this.g = true;
        eVar.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        meh.e eVar = this.c;
        if (eVar == null) {
            return;
        }
        eVar.b();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        meh.b bVar = this.e;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        meh.f fVar = this.d;
        if (fVar == null) {
            return;
        }
        fVar.a();
    }

    @Override // tb.mef
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        b("addData " + i);
        if (this.h) {
            if (i == 0) {
                int i2 = this.k;
                if (i2 == 291 || i2 == 260) {
                    this.b.c();
                    this.k = 408;
                }
            } else {
                this.b.b();
                this.k = 260;
                this.f = true;
            }
        } else if (this.i) {
            this.b.c();
            this.k = 408;
        }
        this.g = false;
    }

    @Override // tb.mef
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        b(com.taobao.android.weex_framework.util.a.ATOM_EXT_clear);
        this.f = false;
        this.k = Result.ALIPAY_VERIFY_UNREG_NODE_FAILED;
        this.b.d();
        this.g = false;
    }

    @Override // tb.mef
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        b("stopLoadMore");
        this.b.c();
        this.k = 408;
        this.g = false;
    }

    @Override // tb.mef
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        b("pauseLoadMore");
        this.b.a();
        this.k = 732;
        this.g = false;
    }

    @Override // tb.mef
    public void a(int i, meh.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3619e21a", new Object[]{this, new Integer(i), eVar});
            return;
        }
        this.b.a(i);
        this.c = eVar;
        this.h = true;
        if (this.f31035a.i() > 0) {
            a(this.f31035a.i());
        }
        b("setMore");
    }

    @Override // tb.mef
    public void a(int i, meh.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361a5679", new Object[]{this, new Integer(i), fVar});
            return;
        }
        this.b.b(i);
        this.d = fVar;
        this.i = true;
        b("setNoMore");
    }

    @Override // tb.mef
    public void a(int i, meh.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361884fd", new Object[]{this, new Integer(i), bVar});
            return;
        }
        this.b.c(i);
        this.e = bVar;
        this.j = true;
        b("setErrorMore");
    }

    /* loaded from: classes7.dex */
    public class a implements meh.a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int Hide = 0;
        public static final int ShowError = 2;
        public static final int ShowMore = 1;
        public static final int ShowNoMore = 3;
        private View d = null;
        private View e = null;
        private View f = null;
        private int g = 0;
        private int h = 0;
        private int i = 0;
        private int j = 0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f31036a = false;
        public boolean b = false;

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2bb98341", new Object[]{aVar})).intValue() : aVar.j;
        }

        public a() {
        }

        @Override // tb.meh.a
        public View a(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
            }
            mee.a("onCreateView");
            return b(viewGroup);
        }

        @Override // tb.meh.a
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                return;
            }
            mee.a("onBindView");
            view.post(new Runnable() { // from class: tb.mee.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int a2 = a.a(a.this);
                    if (a2 == 1) {
                        mee.this.a();
                    } else if (a2 == 2) {
                        a.this.f31036a = false;
                    } else if (a2 != 3) {
                    } else {
                        a.this.b = false;
                    }
                }
            });
        }

        public View b(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("70dee36a", new Object[]{this, viewGroup});
            }
            View view = null;
            int i = this.j;
            if (i == 1) {
                View view2 = this.d;
                if (view2 != null) {
                    view = view2;
                } else if (this.g != 0) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(this.g, viewGroup, false);
                }
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: tb.mee.a.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                            } else {
                                mee.this.b();
                            }
                        }
                    });
                }
            } else if (i == 2) {
                View view3 = this.f;
                if (view3 != null) {
                    view = view3;
                } else if (this.i != 0) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(this.i, viewGroup, false);
                }
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: tb.mee.a.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view4) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view4});
                            } else {
                                mee.this.c();
                            }
                        }
                    });
                }
            } else if (i == 3) {
                View view4 = this.e;
                if (view4 != null) {
                    view = view4;
                } else if (this.h != 0) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(this.h, viewGroup, false);
                }
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: tb.mee.a.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view5) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view5});
                            } else {
                                mee.this.d();
                            }
                        }
                    });
                }
            }
            return view == null ? new FrameLayout(viewGroup.getContext()) : view;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            mee.a("footer showError");
            this.f31036a = true;
            this.j = 2;
            if (mee.a(mee.this).getItemCount() <= 0) {
                return;
            }
            mee.a(mee.this).notifyItemChanged(mee.a(mee.this).getItemCount() - 1);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            mee.a("footer showMore");
            this.j = 1;
            if (mee.a(mee.this).getItemCount() <= 0) {
                return;
            }
            mee.a(mee.this).notifyItemChanged(mee.a(mee.this).getItemCount() - 1);
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            mee.a("footer showNoMore");
            this.b = true;
            this.j = 3;
            if (mee.a(mee.this).getItemCount() <= 0) {
                return;
            }
            mee.a(mee.this).notifyItemChanged(mee.a(mee.this).getItemCount() - 1);
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            mee.a("footer hide");
            this.j = 0;
            if (mee.a(mee.this).getItemCount() <= 0) {
                return;
            }
            mee.a(mee.this).notifyItemChanged(mee.a(mee.this).getItemCount() - 1);
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            this.d = null;
            this.g = i;
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                return;
            }
            this.e = null;
            this.h = i;
        }

        public void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
                return;
            }
            this.f = null;
            this.i = i;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : this.j + 13589;
        }
    }

    private static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            mfj.a("DefaultEventDelegate", str);
        }
    }
}
