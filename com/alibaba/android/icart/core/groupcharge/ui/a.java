package com.alibaba.android.icart.core.groupcharge.ui;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.alibaba.android.icart.core.groupcharge.b;
import com.alibaba.android.icart.core.widget.CartScrollRelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.List;
import tb.bbz;
import tb.beu;
import tb.bex;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View b;
    private CartScrollRelativeLayout f;
    private Button g;
    private ViewGroup j;
    private TextView k;
    private ImageView l;
    private ListView m;
    private View n;
    private CartGroupChargeAdapter o;
    private b p;
    private bbz q;
    private IDMComponent r;
    private InterfaceC0079a t;

    /* renamed from: a  reason: collision with root package name */
    private final String f2363a = a.class.getSimpleName();
    private int c = 0;
    private int d = 500;
    private final int e = 600;
    private boolean h = false;
    private boolean i = false;
    private final Handler s = new Handler(Looper.getMainLooper()) { // from class: com.alibaba.android.icart.core.groupcharge.ui.a.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 1) {
                a.b(a.this).clearAnimation();
                a.a(a.this, false);
            } else if (i == 2) {
                a.b(a.this).clearAnimation();
                a.this.a().setVisibility(4);
                a.b(a.this, false);
                if (a.c(a.this) == null) {
                    return;
                }
                a.c(a.this).a();
            } else if (i != 3) {
                if (i != 4) {
                    return;
                }
                if (a.d(a.this) != null && a.d(a.this).getBackground() != null) {
                    a.d(a.this).getBackground().setAlpha((int) ((a.e(a.this) / 600.0d) * 255.0d));
                }
                if (a.e(a.this) < 600) {
                    a.f(a.this);
                } else {
                    a.a(a.this, 0);
                }
            } else {
                if (a.d(a.this) != null && a.d(a.this).getBackground() != null) {
                    a.d(a.this).getBackground().setAlpha((int) ((a.g(a.this) / 500.0d) * 255.0d));
                }
                if (a.g(a.this) > 0) {
                    a.h(a.this);
                    return;
                }
                a.b(a.this, 500);
                if (a.d(a.this) == null || a.d(a.this).getBackground() == null) {
                    return;
                }
                a.d(a.this).getBackground().setAlpha(0);
            }
        }
    };

    /* renamed from: com.alibaba.android.icart.core.groupcharge.ui.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0079a {
        void a();
    }

    static {
        kge.a(-1324758830);
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b94c208", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.c = i;
        return i;
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fc86ae", new Object[]{aVar});
        } else {
            aVar.g();
        }
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b9501ea", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.i = z;
        return z;
    }

    public static /* synthetic */ int b(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44e91749", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.d = i;
        return i;
    }

    public static /* synthetic */ CartScrollRelativeLayout b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CartScrollRelativeLayout) ipChange.ipc$dispatch("e43b1d3", new Object[]{aVar}) : aVar.f;
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44e9572b", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.h = z;
        return z;
    }

    public static /* synthetic */ InterfaceC0079a c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0079a) ipChange.ipc$dispatch("3e5d6ad5", new Object[]{aVar}) : aVar.t;
    }

    public static /* synthetic */ ViewGroup d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("df3c6b2a", new Object[]{aVar}) : aVar.j;
    }

    public static /* synthetic */ int e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cc6a811d", new Object[]{aVar})).intValue() : aVar.c;
    }

    public static /* synthetic */ void f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e685ffc9", new Object[]{aVar});
        } else {
            aVar.h();
        }
    }

    public static /* synthetic */ int g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a17e5b", new Object[]{aVar})).intValue() : aVar.d;
    }

    public static /* synthetic */ void h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1abcfd07", new Object[]{aVar});
        } else {
            aVar.i();
        }
    }

    public a(bbz bbzVar, b bVar, IDMComponent iDMComponent) {
        this.q = bbzVar;
        this.p = bVar;
        this.r = iDMComponent;
        d();
        f();
        e();
        bex.b(this.q, "Page_ShoppingCart_AccountArea-SplitExpo", new String[0]);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b = LayoutInflater.from(this.q.m()).inflate(R.layout.icart_view_group_charge, (ViewGroup) null);
        this.b.setTag(this.f2363a);
        this.f = (CartScrollRelativeLayout) this.b.findViewById(R.id.layout_cart_group_charge_content);
        this.g = (Button) this.b.findViewById(R.id.button_group_charge_closecard);
        this.j = (LinearLayout) this.b.findViewById(R.id.layout_cart_group_charge);
        this.j.getBackground().setAlpha(0);
        this.k = (TextView) this.b.findViewById(R.id.textview_cart_group_charge_title);
        this.l = (ImageView) this.b.findViewById(R.id.imageview_cart_group_charge_icon);
        this.m = (ListView) this.b.findViewById(R.id.listview_cart_group_charge);
        this.n = this.b.findViewById(R.id.textview_cart_group_charge_title_container);
        if (this.o == null) {
            this.o = new CartGroupChargeAdapter(this.q, this.r);
            this.o.setListener(new View.OnClickListener() { // from class: com.alibaba.android.icart.core.groupcharge.ui.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        view.postDelayed(new Runnable() { // from class: com.alibaba.android.icart.core.groupcharge.ui.a.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    a.a(a.this);
                                }
                            }
                        }, 1000L);
                    }
                }
            });
        }
        this.m.setAdapter((ListAdapter) this.o);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.icart.core.groupcharge.ui.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    a.a(a.this);
                }
            }
        });
        this.b.findViewById(R.id.layout_cart_group_charge_top).setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.icart.core.groupcharge.ui.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    a.a(a.this);
                }
            }
        });
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        beu.a(this.k, "group_charge_title");
        beu.a(this.g, "group_charge_close_btn");
        beu.a(this.l, "groupCharge_tipsIcon");
        beu.a(this.n, "groupCharge_titleContainer");
    }

    public void a(List<com.alibaba.android.icart.core.groupcharge.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        CartGroupChargeAdapter cartGroupChargeAdapter = this.o;
        if (cartGroupChargeAdapter == null) {
            return;
        }
        cartGroupChargeAdapter.setGroupDatas(list);
        this.o.notifyDataSetChanged();
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View a2 = a();
        if (a2 == null) {
            return;
        }
        b bVar = this.p;
        if (bVar != null) {
            a(bVar.b());
            if (!StringUtils.isEmpty(this.p.a())) {
                this.k.setText(this.p.a());
            }
        }
        this.m.setSelection(0);
        a2.setVisibility(0);
        a2.bringToFront();
        h();
        this.f.bringToFront();
        CartScrollRelativeLayout cartScrollRelativeLayout = this.f;
        cartScrollRelativeLayout.smoothScrollOut(cartScrollRelativeLayout.getHeight(), 900);
        this.g.bringToFront();
        this.i = true;
        this.s.sendEmptyMessageDelayed(1, 900L);
        a2.setFocusable(true);
        a2.requestFocus();
        a2.requestLayout();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            c();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (a() == null) {
        } else {
            if (a().getVisibility() == 0 && !this.i) {
                this.h = true;
                i();
                CartScrollRelativeLayout cartScrollRelativeLayout = this.f;
                cartScrollRelativeLayout.smoothScrollIn(cartScrollRelativeLayout.getHeight(), 500);
                this.s.sendEmptyMessageDelayed(2, 400L);
            }
            a().setFocusable(false);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.k == null) {
        } else {
            this.c += 20;
            this.s.sendEmptyMessageDelayed(4, 20L);
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.k == null) {
        } else {
            this.d -= 20;
            this.s.sendEmptyMessageDelayed(3, 20L);
        }
    }

    public void a(InterfaceC0079a interfaceC0079a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ca8b51", new Object[]{this, interfaceC0079a});
        } else {
            this.t = interfaceC0079a;
        }
    }
}
