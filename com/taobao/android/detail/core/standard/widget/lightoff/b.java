package com.taobao.android.detail.core.standard.widget.lightoff;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.i;
import com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout;
import com.taobao.android.detail.core.standard.widget.lightoff.gallery.LightOffGalleryView;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffFloatModel;
import com.taobao.android.detail.datasdk.protocol.adapter.core.c;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.emd;
import tb.emp;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends Dialog implements DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, DialogInterface.OnShowListener, ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f9900a;
    private ViewPager b;
    private FrameLayout c;
    private TransAnimLayout d;
    private Context e;
    private com.taobao.android.detail.core.standard.widget.lightoff.model.a f;
    private View g;
    private int h;
    private FrameLayout i;
    private ViewGroup j;
    private TextView k;
    private TextView l;
    private a m;
    private boolean n;
    private emp o;
    private boolean p;
    private TransAnimLayout.a q;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("59460b42", new Object[]{bVar})).intValue() : bVar.h;
    }

    public static /* synthetic */ TransAnimLayout a(b bVar, TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransAnimLayout) ipChange.ipc$dispatch("f9e7242d", new Object[]{bVar, transAnimLayout});
        }
        bVar.d = transAnimLayout;
        return transAnimLayout;
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f9900a;
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf7c1169", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.p = z;
        return z;
    }

    public static /* synthetic */ Context b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("87e44426", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ com.taobao.android.detail.core.standard.widget.lightoff.model.a c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.standard.widget.lightoff.model.a) ipChange.ipc$dispatch("473e9d7b", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ TransAnimLayout d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TransAnimLayout) ipChange.ipc$dispatch("3908612", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ ViewPager e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager) ipChange.ipc$dispatch("57ea9c77", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ FrameLayout f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("81190fef", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ TransAnimLayout.a g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TransAnimLayout.a) ipChange.ipc$dispatch("22908292", new Object[]{bVar}) : bVar.q;
    }

    public static /* synthetic */ View h(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8ce5f4aa", new Object[]{bVar}) : bVar.g;
    }

    public static /* synthetic */ emp i(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (emp) ipChange.ipc$dispatch("3449ee97", new Object[]{bVar}) : bVar.o;
    }

    public static /* synthetic */ FrameLayout j(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("99c332f3", new Object[]{bVar}) : bVar.i;
    }

    public static /* synthetic */ ViewGroup k(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("a1547270", new Object[]{bVar}) : bVar.j;
    }

    public static /* synthetic */ boolean l(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c77135e8", new Object[]{bVar})).booleanValue() : bVar.p;
    }

    public static /* synthetic */ Drawable m(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("e914117", new Object[]{bVar}) : bVar.e();
    }

    static {
        kge.a(1440641817);
        kge.a(1848919473);
        kge.a(782844747);
        kge.a(908767350);
        kge.a(687132345);
        f9900a = i.a("LightOffDialog", BTags.XLightOff);
    }

    public b(Context context, com.taobao.android.detail.core.standard.widget.lightoff.model.a aVar, c cVar) {
        super(context, 16973840);
        this.h = -1;
        this.n = false;
        this.p = false;
        this.q = new TransAnimLayout.a() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.b.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    com.taobao.android.detail.core.utils.i.a(b.a(), "enterAnimStart");
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.a
            public void a(FrameLayout.LayoutParams layoutParams) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b016271", new Object[]{this, layoutParams});
                    return;
                }
                b.i(b.this).a(b.f(b.this));
                b.j(b.this).setVisibility(0);
                b.k(b.this).setVisibility(0);
                b.e(b.this).setVisibility(0);
                b.d(b.this).hideTransView();
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.a
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                } else if (b.l(b.this)) {
                } else {
                    b.d(b.this).showTransImage(b.m(b.this));
                    b.e(b.this).setVisibility(8);
                    b.j(b.this).setVisibility(4);
                    b.k(b.this).setVisibility(4);
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.a
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                } else if (y.a(b.b(b.this))) {
                } else {
                    b.a(b.this, false);
                    b.this.dismiss();
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.a
            public void d() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                    return;
                }
                com.taobao.android.detail.core.utils.i.a(b.a(), "onStartPull");
                b.a(b.this, true);
                b.j(b.this).setVisibility(4);
                b.k(b.this).setVisibility(4);
                b.e(b.this).setVisibility(4);
                b.i(b.this).a(8);
                b.d(b.this).showTransImage(b.m(b.this));
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.a
            public void e() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
                    return;
                }
                b.a(b.this, false);
                b.j(b.this).setVisibility(0);
                b.k(b.this).setVisibility(0);
                b.e(b.this).setVisibility(0);
                b.i(b.this).a(0);
                b.d(b.this).hideTransView();
                b.h(b.this).setAlpha(1.0f);
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.a
            public void a(float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                } else {
                    b.h(b.this).setAlpha(1.0f - f);
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.a
            public boolean f() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
                }
                if (!(b.e(b.this) instanceof com.taobao.android.detail.core.standard.widget.lightoff.gallery.a)) {
                    return false;
                }
                return ((com.taobao.android.detail.core.standard.widget.lightoff.gallery.a) b.e(b.this)).isCurrentViewAllowPull();
            }
        };
        this.e = context;
        this.f = aVar;
        this.m = cVar;
        this.o = new emp(aVar, cVar);
        setOnDismissListener(this);
        setOnShowListener(this);
        if (this.f.g != null) {
            this.b = this.f.g;
        } else {
            LightOffGalleryView lightOffGalleryView = new LightOffGalleryView(this.f);
            lightOffGalleryView.setItemListener(this.m);
            lightOffGalleryView.bindData(this.f.e);
            this.b = lightOffGalleryView;
        }
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                String a2 = b.a();
                com.taobao.android.detail.core.utils.i.a(a2, "onClick:" + b.a(b.this));
            }
        });
        this.b.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                String a2 = b.a();
                com.taobao.android.detail.core.utils.i.a(a2, "onLongClick:" + b.a(b.this));
                return false;
            }
        });
        this.b.addOnPageChangeListener(this);
        this.b.setCurrentItem(this.f.h);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (getWindow() == null) {
            return;
        }
        b();
        setContentView(this.c);
        getWindow().setLayout(-1, -1);
        setOnKeyListener(this);
        if (this.n) {
            return;
        }
        this.o.a(this.c);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = new FrameLayout(this.e);
        this.g = new View(this.e);
        this.g.setBackgroundColor(-16777216);
        this.c.addView(this.g, 0, new FrameLayout.LayoutParams(-1, -1));
        this.i = new FrameLayout(this.e);
        TUrlImageView tUrlImageView = new TUrlImageView(this.e);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01YfR6ht1maliwECSdZ_!!6000000004971-2-tps-96-96.png");
        int a2 = com.taobao.android.detail.core.detail.kit.utils.b.a(this.e, 24.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.leftMargin = com.taobao.android.detail.core.detail.kit.utils.b.a(this.e, 10.0f);
        layoutParams.gravity = 16;
        this.i.addView(tUrlImageView, layoutParams);
        tUrlImageView.setClickable(true);
        tUrlImageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    b.this.a(false);
                }
            }
        });
        this.j = c();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        if (this.f.c != null && this.f.d != null) {
            this.n = true;
            a(layoutParams2);
        } else {
            this.c.addView(this.b, layoutParams2);
        }
        this.c.addView(this.i, new FrameLayout.LayoutParams(-1, com.taobao.android.detail.core.detail.kit.utils.b.a(this.e, 44.0f)));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 5;
        layoutParams3.topMargin = com.taobao.android.detail.core.detail.kit.utils.b.a(this.e, 60.0f);
        layoutParams3.rightMargin = com.taobao.android.detail.core.detail.kit.utils.b.a(this.e, 16.0f);
        this.c.addView(this.j, layoutParams3);
        d();
    }

    private void a(final FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b016271", new Object[]{this, layoutParams});
            return;
        }
        this.p = false;
        this.g.setAlpha(0.0f);
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        this.b.setVisibility(4);
        a(emd.a(this.f.d), this.e, -1, new c.a() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.b.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.c.a
            public void a(Drawable drawable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                } else if (drawable == null) {
                    b.f(b.this).addView(b.e(b.this), layoutParams);
                    b.i(b.this).a(b.f(b.this));
                    b.j(b.this).setVisibility(0);
                    b.k(b.this).setVisibility(0);
                    b.e(b.this).setVisibility(0);
                    b.d(b.this).hideTransView();
                } else {
                    b bVar = b.this;
                    b.a(bVar, new TransAnimLayout(b.b(bVar)));
                    if (b.c(b.this).j) {
                        b.d(b.this).setPullInnerBottomMargin(f.a(56.0f));
                    }
                    b.d(b.this).init(b.c(b.this).c, drawable, true);
                    b.d(b.this).addPullInnerView(b.e(b.this));
                    b.f(b.this).addView(b.d(b.this), layoutParams);
                    b.d(b.this).setTransListener(b.g(b.this));
                    b.d(b.this).runEnterAnim(b.h(b.this));
                }
            }
        });
    }

    public void a(String str, Context context, final int i, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf04877", new Object[]{this, str, context, new Integer(i), aVar});
        } else {
            com.taobao.phenix.intf.b.h().a(context).a(str).preloadWithSmall(false).scaleFromLarge(false).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.b.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    BitmapDrawable drawable = succPhenixEvent.getDrawable();
                    if (drawable != null && succPhenixEvent.getDrawable().getBitmap() != null && !succPhenixEvent.getDrawable().getBitmap().isRecycled() && i != -1) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = drawable.getIntrinsicHeight();
                        int i2 = i;
                        if (i2 != intrinsicHeight) {
                            intrinsicWidth = (i2 * intrinsicWidth) / intrinsicHeight;
                        }
                        drawable.setBounds(0, 0, intrinsicWidth, i);
                    }
                    c.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(drawable);
                    }
                    return false;
                }
            }).fetch();
        }
    }

    private ViewGroup c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6e13476b", new Object[]{this});
        }
        LinearLayout linearLayout = new LinearLayout(this.e);
        linearLayout.setBackgroundResource(R.drawable.lightoff_index_tag_bg);
        int a2 = com.taobao.android.detail.core.detail.kit.utils.b.a(this.e, 2.0f);
        int a3 = com.taobao.android.detail.core.detail.kit.utils.b.a(this.e, 3.0f);
        linearLayout.setPadding(a3, a2, a3, a2);
        this.k = a(this.e);
        linearLayout.addView(this.k);
        TextView a4 = a(this.e);
        a4.setText("/");
        linearLayout.addView(a4);
        this.l = a(this.e);
        linearLayout.addView(this.l);
        return linearLayout;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.k.setText(String.valueOf(this.b.getCurrentItem() + 1));
        this.l.setText(String.valueOf(this.b.getAdapter().getCount()));
    }

    private TextView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("56ecd4", new Object[]{this, context});
        }
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(1, 13.0f);
        return textView;
    }

    public void a(LightOffFloatModel lightOffFloatModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710750b3", new Object[]{this, lightOffFloatModel});
            return;
        }
        emp empVar = this.o;
        if (empVar == null || lightOffFloatModel == null) {
            return;
        }
        empVar.a(lightOffFloatModel);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.o.a(8);
        TransAnimLayout transAnimLayout = this.d;
        if (transAnimLayout != null && !z) {
            transAnimLayout.runExitAnim(this.g);
        } else {
            dismiss();
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        } else {
            this.m.a(i, f, i2);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else if (this.c == null || this.f == null) {
        } else {
            this.h = i;
            d();
            JSONObject jSONObject = null;
            if (this.f.e != null && i < this.f.e.size()) {
                jSONObject = this.f.e.get(i).originData;
            }
            this.b.getChildAt(i);
            this.m.a(jSONObject, i);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else {
            this.m.a(i);
        }
    }

    private Drawable e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("7af0e7ce", new Object[]{this});
        }
        ViewPager viewPager = this.b;
        if (!(viewPager instanceof com.taobao.android.detail.core.standard.widget.lightoff.gallery.a)) {
            return null;
        }
        return ((com.taobao.android.detail.core.standard.widget.lightoff.gallery.a) viewPager).getCurrentViewSnapshot();
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        a(false);
        return true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        a aVar = this.m;
        if (aVar == null) {
            return;
        }
        aVar.a(dialogInterface);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64de6c3", new Object[]{this, dialogInterface});
            return;
        }
        a aVar = this.m;
        if (aVar == null) {
            return;
        }
        aVar.b(dialogInterface);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b.setCurrentItem(i, false);
        }
    }
}
