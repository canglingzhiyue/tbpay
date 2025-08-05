package tb;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alibaba.android.ultron.vfw.popupwindow.a;
import com.alibaba.android.ultron.vfw.popupwindow.b;
import com.alibaba.android.ultron.vfw.viewholder.h;
import com.alibaba.android.ultron.vfw.viewholder.j;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.f;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class bnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static float o;

    /* renamed from: a  reason: collision with root package name */
    private bnv f25995a;
    private bny b;
    private FrameLayout c;
    private LinearLayout d;
    private RecyclerView e;
    private LinearLayout f;
    private ImageView g;
    private bnn h;
    private View i;
    private AlphaAnimation j;
    private AlphaAnimation k;
    private TranslateAnimation l;
    private TranslateAnimation m;
    private RelativeLayout n;
    private b.a p;
    private a q;
    private boolean r = false;
    private ViewGroup s;

    public static /* synthetic */ ViewGroup a(bnj bnjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("705b8c5b", new Object[]{bnjVar}) : bnjVar.s;
    }

    public static /* synthetic */ b.a b(bnj bnjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.a) ipChange.ipc$dispatch("21041f20", new Object[]{bnjVar}) : bnjVar.p;
    }

    public static /* synthetic */ View c(bnj bnjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e790e2be", new Object[]{bnjVar}) : bnjVar.i;
    }

    static {
        kge.a(788191652);
        o = 0.6f;
    }

    public bnj(bny bnyVar) {
        this.b = bnyVar;
        b();
        d();
        c();
    }

    public void a(bnv bnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21498ee", new Object[]{this, bnvVar});
        } else {
            this.f25995a = bnvVar;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = new FrameLayout(this.b.k());
        this.i = new View(this.b.k());
        this.i.setBackgroundColor(Color.parseColor("#7F000000"));
        this.c.addView(this.i);
        this.n = (RelativeLayout) LayoutInflater.from(this.b.k()).inflate(R.layout.ultron_popop_window, (ViewGroup) this.c, false);
        this.n.setClickable(true);
        this.d = (LinearLayout) this.n.findViewById(R.id.ultron_popup_header_view);
        this.e = (RecyclerView) this.n.findViewById(R.id.ultron_popup_recycler_view);
        this.f = (LinearLayout) this.n.findViewById(R.id.ultron_popup_footer_view);
        this.g = (ImageView) this.n.findViewById(R.id.ultron_popup_close_button);
        this.c.addView(this.n, new FrameLayout.LayoutParams(-1, (int) (bpl.b(this.b.k()) * o), 80));
        this.c.setFocusable(true);
        this.c.setFocusableInTouchMode(true);
        this.h = new bnn(this.b);
        this.q = new a(this.b.k());
        this.q.setOrientation(1);
        this.e.setLayoutManager(this.q);
        this.e.setAdapter(this.h);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.j = new AlphaAnimation(0.0f, 1.0f);
        this.j.setDuration(200L);
        this.k = new AlphaAnimation(1.0f, 0.0f);
        this.k.setDuration(200L);
        this.k.setAnimationListener(new Animation.AnimationListener() { // from class: tb.bnj.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                if (bnj.a(bnj.this) != null) {
                    bnj.a(bnj.this).removeAllViews();
                }
                if (bnj.b(bnj.this) == null) {
                    return;
                }
                bnj.b(bnj.this).a();
            }
        });
        this.l = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        this.l.setDuration(200L);
        this.m = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        this.m.setDuration(200L);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.i.setOnClickListener(new View.OnClickListener() { // from class: tb.bnj.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                bnj.c(bnj.this).setEnabled(false);
                bnj.this.a(false);
            }
        });
        this.c.setOnKeyListener(new View.OnKeyListener() { // from class: tb.bnj.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i), keyEvent})).booleanValue();
                }
                bnj.this.a(false);
                return false;
            }
        });
    }

    public void a(b.C0102b c0102b, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d8762b", new Object[]{this, c0102b, viewGroup});
        } else if (viewGroup == null) {
        } else {
            this.s = viewGroup;
            if (c0102b != null) {
                if (c0102b.b() < 0) {
                    this.i.setBackgroundColor(c0102b.b());
                }
                if (c0102b.a() > 0.0f && c0102b.a() != o) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.n.getLayoutParams();
                    layoutParams.height = (int) (viewGroup.getHeight() * c0102b.a());
                    this.n.setLayoutParams(layoutParams);
                }
                if (c0102b.d() != null) {
                    this.g.setVisibility(0);
                    this.g.setContentDescription(com.alibaba.ability.localization.b.a(R.string.app_close));
                    this.g.setImageDrawable(c0102b.d());
                    this.g.setOnClickListener(new View.OnClickListener() { // from class: tb.bnj.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            } else {
                                bnj.this.a(false);
                            }
                        }
                    });
                } else {
                    this.g.setVisibility(8);
                }
                if (c0102b.c() < 0) {
                    this.n.setBackgroundDrawable(bpl.a(c0102b.c(), c0102b.e(), c0102b.f()));
                }
            }
            this.i.setEnabled(true);
            e();
            f();
            g();
            this.i.startAnimation(this.j);
            this.n.startAnimation(this.l);
            viewGroup.addView(this.c);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.r = z;
        this.i.startAnimation(this.k);
        this.n.startAnimation(this.m);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            return;
        }
        if (linearLayout.getChildCount() > 0) {
            this.d.removeAllViews();
        }
        j jVar = (j) this.b.a(j.class);
        List<IDMComponent> e = this.f25995a.e();
        if (e == null || e.size() <= 0) {
            return;
        }
        for (IDMComponent iDMComponent : e) {
            h a2 = jVar.a(this.d, jVar.a(iDMComponent));
            View view = a2.itemView;
            if (view != null) {
                this.d.addView(view);
            }
            jVar.a(a2, iDMComponent);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        List<IDMComponent> f = this.f25995a.f();
        if (f != null && f.size() <= 1) {
            this.q.a(false);
        } else {
            this.q.a(true);
        }
        this.h.b(f);
        this.h.notifyDataSetChanged();
    }

    public void a(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efbcbb03", new Object[]{this, jnyVar});
        } else if (jnyVar != null) {
            List<IDMComponent> c = this.f25995a.c();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (IDMComponent iDMComponent : c) {
                IDMComponent b = jnyVar.b(iDMComponent.getKey());
                String b2 = f.b(b);
                if ("footer".equals(b2)) {
                    arrayList.add(b);
                } else if ("header".equals(b2)) {
                    arrayList3.add(b);
                } else {
                    arrayList2.add(b);
                }
            }
            bnv bnvVar = new bnv();
            bnvVar.b(arrayList2);
            bnvVar.a(arrayList3);
            bnvVar.e(arrayList);
            a(bnvVar);
            e();
            f();
            g();
            this.h.notifyDataSetChanged();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout == null) {
            return;
        }
        if (linearLayout.getChildCount() > 0) {
            this.f.removeAllViews();
        }
        List<IDMComponent> g = this.f25995a.g();
        j jVar = (j) this.b.a(j.class);
        if (g == null || g.size() <= 0) {
            return;
        }
        for (IDMComponent iDMComponent : g) {
            h a2 = jVar.a(this.f, jVar.a(iDMComponent));
            View view = a2.itemView;
            if (view != null) {
                this.f.addView(view);
            }
            jVar.a(a2, iDMComponent);
        }
    }

    public void a(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b917598d", new Object[]{this, aVar});
        } else {
            this.p = aVar;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        ViewGroup viewGroup = this.s;
        return viewGroup != null && viewGroup.getChildCount() > 0;
    }
}
