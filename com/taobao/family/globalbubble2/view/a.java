package com.taobao.family.globalbubble2.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.taobao.util.k;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.family.FamilyMember;
import com.taobao.family.globalbubble.c;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.knk;
import tb.xmx;

/* loaded from: classes7.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final Context f17150a;
    private View c;
    private View d;
    private ImageView e;
    private TextView f;
    private TextView g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private int o;
    private int p;
    private xmx x;
    private final List<FamilyMember> b = new ArrayList();
    private boolean m = false;
    private boolean n = false;
    private float q = 0.0f;
    private float r = 0.0f;
    private long s = 0;
    private boolean t = true;
    private boolean u = false;
    private boolean v = false;
    private final Handler w = new Handler(Looper.getMainLooper());
    private final View.OnTouchListener y = new View.OnTouchListener() { // from class: com.taobao.family.globalbubble2.view.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            a.this = this;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            if (motionEvent.getAction() == 0) {
                a.a(a.this, rawX);
                a.b(a.this, rawY);
                a aVar = a.this;
                a.a(aVar, a.a(aVar).getTranslationX());
                a aVar2 = a.this;
                a.b(aVar2, a.a(aVar2).getTranslationY());
                a.a(a.this, System.currentTimeMillis());
                a.a(a.this, true);
                a.b(a.this, false);
            } else if (motionEvent.getAction() == 2) {
                int b = rawX - a.b(a.this);
                int c = rawY - a.c(a.this);
                if (System.currentTimeMillis() - a.d(a.this) >= ViewConfiguration.getTapTimeout()) {
                    a.b(a.this, true);
                }
                if (((int) Math.sqrt(Math.pow(b, 2.0d) + Math.pow(c, 2.0d))) >= ViewConfiguration.get(a.e(a.this)).getScaledTouchSlop()) {
                    a.a(a.this, false);
                }
                if (a.f(a.this) || !a.g(a.this)) {
                    a.a(a.this).setTranslationX(a.h(a.this) + b);
                    a.a(a.this).setTranslationY(a.i(a.this) + c);
                    a.a(a.this).setBackgroundResource(R.drawable.bg_family_dialog_bubble_drag);
                    a.c(a.this, false);
                    a.j(a.this);
                }
            } else if (motionEvent.getAction() == 1 && (a.f(a.this) || !a.g(a.this))) {
                a.a(a.this).setBackgroundResource(R.drawable.bg_family_dialog_bubble_normal);
                if (a.k(a.this)) {
                    a.l(a.this);
                }
                a.m(a.this);
                a.n(a.this);
                a.c(a.this, true);
                return true;
            }
            return false;
        }
    };

    public static /* synthetic */ float a(a aVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("849a9394", new Object[]{aVar, new Float(f)})).floatValue();
        }
        aVar.q = f;
        return f;
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("849a9eda", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.o = i;
        return i;
    }

    public static /* synthetic */ long a(a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("849aa29c", new Object[]{aVar, new Long(j)})).longValue();
        }
        aVar.s = j;
        return j;
    }

    public static /* synthetic */ View a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3e0d30de", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ void a(a aVar, FamilyMember familyMember) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deaecf95", new Object[]{aVar, familyMember});
        } else {
            aVar.a(familyMember);
        }
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("849adebc", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.t = z;
        return z;
    }

    public static /* synthetic */ float b(a aVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e122133", new Object[]{aVar, new Float(f)})).floatValue();
        }
        aVar.r = f;
        return f;
    }

    public static /* synthetic */ int b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7ddf8a10", new Object[]{aVar})).intValue() : aVar.o;
    }

    public static /* synthetic */ int b(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e122c79", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.p = i;
        return i;
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e126c5b", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.u = z;
        return z;
    }

    public static /* synthetic */ int c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("18804c91", new Object[]{aVar})).intValue() : aVar.p;
    }

    public static /* synthetic */ void c(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f789f9f6", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.a(z);
        }
    }

    public static /* synthetic */ long d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b3210f13", new Object[]{aVar})).longValue() : aVar.s;
    }

    public static /* synthetic */ boolean d(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1018799", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.m = z;
        return z;
    }

    public static /* synthetic */ Context e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("47db5098", new Object[]{aVar}) : aVar.f17150a;
    }

    public static /* synthetic */ boolean e(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a791538", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.n = z;
        return z;
    }

    public static /* synthetic */ boolean f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e8629425", new Object[]{aVar})).booleanValue() : aVar.u;
    }

    public static /* synthetic */ boolean g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("830356a6", new Object[]{aVar})).booleanValue() : aVar.t;
    }

    public static /* synthetic */ float h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1da41913", new Object[]{aVar})).floatValue() : aVar.q;
    }

    public static /* synthetic */ float i(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b844db94", new Object[]{aVar})).floatValue() : aVar.r;
    }

    public static /* synthetic */ void j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e59e25", new Object[]{aVar});
        } else {
            aVar.h();
        }
    }

    public static /* synthetic */ boolean k(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed8660aa", new Object[]{aVar})).booleanValue() : aVar.j();
    }

    public static /* synthetic */ void l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88272327", new Object[]{aVar});
        } else {
            aVar.l();
        }
    }

    public static /* synthetic */ void m(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c7e5a8", new Object[]{aVar});
        } else {
            aVar.i();
        }
    }

    public static /* synthetic */ void n(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd68a829", new Object[]{aVar});
        } else {
            aVar.d();
        }
    }

    public static /* synthetic */ void o(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58096aaa", new Object[]{aVar});
        } else {
            aVar.c();
        }
    }

    public static /* synthetic */ void p(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2aa2d2b", new Object[]{aVar});
        } else {
            aVar.b();
        }
    }

    public static /* synthetic */ View q(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("770574ee", new Object[]{aVar}) : aVar.l;
    }

    public static /* synthetic */ void r(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ebb22d", new Object[]{aVar});
        } else {
            aVar.m();
        }
    }

    public static /* synthetic */ Handler s(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("3ea6f58", new Object[]{aVar}) : aVar.w;
    }

    public static /* synthetic */ xmx t(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xmx) ipChange.ipc$dispatch("ecbeb0b4", new Object[]{aVar}) : aVar.x;
    }

    public a(Context context) {
        this.f17150a = context;
    }

    @Override // com.taobao.family.globalbubble2.view.b
    public void a(xmx xmxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79207d5", new Object[]{this, xmxVar});
        } else {
            this.x = xmxVar;
        }
    }

    @Override // com.taobao.family.globalbubble2.view.b
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        View view = this.c;
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) this.c.getParent()).removeView(this.c);
            }
            return this.c;
        }
        this.c = LayoutInflater.from(this.f17150a).inflate(R.layout.dialog_family, (ViewGroup) null, false);
        this.d = this.c.findViewById(R.id.family_dialog_center_bubble_rl);
        this.d.setVisibility(8);
        this.e = (ImageView) this.c.findViewById(R.id.family_dialog_center_bubble_iv);
        this.f = (TextView) this.c.findViewById(R.id.family_dialog_center_bubble_relation_tv);
        this.g = (TextView) this.c.findViewById(R.id.family_dialog_center_bubble_remark_tv);
        this.h = this.c.findViewById(R.id.family_dialog_bubble1_rl);
        this.h.setVisibility(8);
        this.i = this.c.findViewById(R.id.family_dialog_bubble2_rl);
        this.i.setVisibility(8);
        this.j = this.c.findViewById(R.id.family_dialog_bubble3_rl);
        this.j.setVisibility(8);
        this.k = this.c.findViewById(R.id.family_dialog_bubble4_rl);
        this.k.setVisibility(8);
        this.l = this.c.findViewById(R.id.family_dialog_delete_area);
        this.l.setVisibility(8);
        return this.c;
    }

    @Override // com.taobao.family.globalbubble2.view.b
    public void a(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.b.clear();
        this.b.addAll(b(list));
        if (this.c == null) {
            return;
        }
        if (this.b.isEmpty()) {
            this.c.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        this.d.setVisibility(0);
        this.d.setBackgroundResource(R.drawable.bg_family_dialog_bubble_normal);
        this.d.post(new Runnable() { // from class: com.taobao.family.globalbubble2.view.a.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.a(a.this).setTranslationX(((knk.d() - a.a(a.this).getMeasuredWidth()) / 2) - knk.a(12.0f));
                }
            }
        });
        if (this.b.size() == 1) {
            final FamilyMember familyMember = this.b.get(0);
            this.e.setVisibility(8);
            this.f.setVisibility(0);
            a(this.f, familyMember.relationName);
            this.g.setVisibility(0);
            b(this.g, familyMember.remarkName);
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.family.globalbubble2.view.a.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        a.a(a.this, familyMember);
                    }
                }
            });
            this.d.setOnTouchListener(this.y);
            a(true);
            return;
        }
        b();
    }

    private List<FamilyMember> b(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b5ee42d", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (Object obj : list) {
                if (obj instanceof FamilyMember) {
                    arrayList.add((FamilyMember) obj);
                }
            }
        }
        return arrayList;
    }

    private void a(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ccae9a6", new Object[]{this, textView, str});
            return;
        }
        textView.setText(str);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        if (str.length() <= 2) {
            textView.setTextSize(2, 16.0f);
        } else {
            textView.setTextSize(2, 17.0f);
        }
    }

    private void b(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56958b85", new Object[]{this, textView, str});
        } else if (str == null) {
            textView.setText((CharSequence) null);
        } else if (str.length() > 2) {
            textView.setText(str.substring(0, 2));
        } else {
            textView.setText(str);
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.d.postDelayed(new Runnable() { // from class: com.taobao.family.globalbubble2.view.a.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.a(a.this).setAlpha(0.38f);
                    }
                }
            }, 3000L);
        } else {
            this.d.setAlpha(1.0f);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d.setOnTouchListener(this.y);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.family.globalbubble2.view.a.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    a.o(a.this);
                }
            }
        });
        a(true);
        this.e.setVisibility(0);
        this.e.setImageDrawable(a(R.drawable.ic_family_dialog_center_bubble));
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        this.k.setVisibility(8);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.e.setImageDrawable(a(R.drawable.ic_family_dialog_close));
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.d.setOnTouchListener(null);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.family.globalbubble2.view.a.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    a.p(a.this);
                }
            }
        });
        a(false);
        final FamilyMember familyMember = this.b.get(0);
        this.h.setVisibility(0);
        this.h.setBackgroundResource(R.drawable.bg_family_dialog_bubble_normal);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.family.globalbubble2.view.a.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    a.a(a.this, familyMember);
                }
            }
        });
        a((TextView) this.h.findViewById(R.id.family_dialog_bubble1_relation_tv), familyMember.relationName);
        b((TextView) this.h.findViewById(R.id.family_dialog_bubble1_remark_tv), familyMember.remarkName);
        final FamilyMember familyMember2 = this.b.get(1);
        this.i.setVisibility(0);
        this.i.setBackgroundResource(R.drawable.bg_family_dialog_bubble_normal);
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.family.globalbubble2.view.a.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    a.a(a.this, familyMember2);
                }
            }
        });
        a((TextView) this.i.findViewById(R.id.family_dialog_bubble2_relation_tv), familyMember2.relationName);
        b((TextView) this.i.findViewById(R.id.family_dialog_bubble2_remark_tv), familyMember2.remarkName);
        if (this.b.size() >= 3) {
            final FamilyMember familyMember3 = this.b.get(2);
            this.j.setVisibility(0);
            this.j.setBackgroundResource(R.drawable.bg_family_dialog_bubble_normal);
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.family.globalbubble2.view.a.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        a.a(a.this, familyMember3);
                    }
                }
            });
            a((TextView) this.j.findViewById(R.id.family_dialog_bubble3_relation_tv), familyMember3.relationName);
            b((TextView) this.j.findViewById(R.id.family_dialog_bubble3_remark_tv), familyMember3.remarkName);
        }
        if (this.b.size() >= 4) {
            final FamilyMember familyMember4 = this.b.get(3);
            this.k.setVisibility(0);
            this.k.setBackgroundResource(R.drawable.bg_family_dialog_bubble_normal);
            this.k.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.family.globalbubble2.view.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        a.a(a.this, familyMember4);
                    }
                }
            });
            a((TextView) this.k.findViewById(R.id.family_dialog_bubble4_relation_tv), familyMember4.relationName);
            b((TextView) this.k.findViewById(R.id.family_dialog_bubble4_remark_tv), familyMember4.remarkName);
        }
        e();
    }

    private Drawable a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("e1d2d83f", new Object[]{this, new Integer(i)});
        }
        RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(this.f17150a.getResources(), BitmapFactory.decodeResource(this.f17150a.getResources(), i));
        create.setCircular(true);
        return create;
    }

    private void a(FamilyMember familyMember) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89364461", new Object[]{this, familyMember});
        } else {
            Nav.from(this.f17150a).toUri(Uri.parse("http://tb.cn/n/im/dynamic/chat.html?bizType=10001&targetType=3").buildUpon().appendQueryParameter("targetId", familyMember.userId).build());
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        int[] iArr = new int[2];
        this.d.getLocationOnScreen(iArr);
        int measuredWidth = this.d.getMeasuredWidth();
        int d = knk.d();
        int i = iArr[0] + (measuredWidth / 2);
        int a2 = ((d - measuredWidth) / 2) - knk.a(12.0f);
        if (i > d / 2) {
            this.d.setTranslationX(a2);
        } else {
            this.d.setTranslationX(-a2);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.b.size() == 3) {
            f();
        } else {
            g();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (this.d.getTranslationX() > 0.0f) {
            z = true;
        }
        float translationX = this.d.getTranslationX();
        float translationY = this.d.getTranslationY();
        int a2 = knk.a(50.0f);
        float f = z ? translationX - (a2 << 1) : (a2 << 1) + translationX;
        if (this.h.getVisibility() == 0) {
            this.h.setTranslationX(f);
            this.h.setTranslationY(translationY);
        }
        if (this.i.getVisibility() == 0) {
            this.i.setTranslationX(translationX);
            this.i.setTranslationY(translationY - (a2 << 1));
        }
        if (this.j.getVisibility() != 0) {
            return;
        }
        this.j.setTranslationX(translationX);
        this.j.setTranslationY(translationY + (a2 << 1));
    }

    private void g() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (this.d.getTranslationX() > 0.0f) {
            z = true;
        }
        float translationX = this.d.getTranslationX();
        float translationY = this.d.getTranslationY();
        int a2 = knk.a(50.0f);
        int i = (int) (a2 * 1.5d);
        float f = z ? translationX - i : i + translationX;
        if (this.h.getVisibility() == 0) {
            this.h.setTranslationX(f);
            this.h.setTranslationY(translationY - a2);
        }
        if (this.i.getVisibility() == 0) {
            this.i.setTranslationX(f);
            this.i.setTranslationY(a2 + translationY);
        }
        if (this.j.getVisibility() == 0) {
            this.j.setTranslationX(translationX);
            this.j.setTranslationY(translationY - (a2 << 1));
        }
        if (this.k.getVisibility() != 0) {
            return;
        }
        this.k.setTranslationX(translationX);
        this.k.setTranslationY(translationY + (a2 << 1));
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.l.getVisibility() == 0 || this.m) {
        } else {
            this.m = true;
            this.l.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.l, "alpha", 0.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.l, "translationY", 100.0f, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.family.globalbubble2.view.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                    if (str.hashCode() == -2145066406) {
                        super.onAnimationEnd((Animator) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    super.onAnimationEnd(animator);
                    a.d(a.this, false);
                }
            });
            animatorSet.setDuration(100L);
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.start();
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.l.getVisibility() == 8 || this.n) {
        } else {
            this.n = true;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.l, "alpha", 1.0f, 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.l, "translationY", 0.0f, 100.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.family.globalbubble2.view.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
                    if (str.hashCode() == -2145066406) {
                        super.onAnimationEnd((Animator) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    super.onAnimationEnd(animator);
                    a.q(a.this).setVisibility(8);
                    a.q(a.this).setTranslationY(0.0f);
                    a.q(a.this).setAlpha(0.0f);
                    a.e(a.this, false);
                }
            });
            animatorSet.setDuration(100L);
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.start();
        }
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        int[] iArr = new int[2];
        this.d.getLocationOnScreen(iArr);
        int measuredWidth = (this.d.getMeasuredWidth() / 2) + iArr[0];
        int measuredHeight = (this.d.getMeasuredHeight() / 2) + iArr[1];
        this.l.getLocationOnScreen(iArr);
        return ((int) Math.sqrt(Math.pow((double) (measuredWidth - ((this.l.getMeasuredWidth() / 2) + iArr[0])), 2.0d) + Math.pow((double) (measuredHeight - ((this.l.getMeasuredHeight() / 2) + iArr[1])), 2.0d))) <= Math.abs((this.l.getMeasuredWidth() / 2) - (this.d.getMeasuredWidth() / 2));
    }

    private Activity k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("33dffe76", new Object[]{this});
        }
        WeakReference<Activity> b = c.a().b();
        if (b != null && b.get() != null) {
            return b.get();
        }
        Context context = this.f17150a;
        if (!(context instanceof Activity)) {
            return null;
        }
        return (Activity) context;
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        Activity k = k();
        if (k == null) {
            return;
        }
        final android.support.design.widget.b bVar = new android.support.design.widget.b(k, R.style.BottomSheetDialog);
        View inflate = LayoutInflater.from(k).inflate(R.layout.dialog_family_delete, (ViewGroup) null, false);
        inflate.findViewById(R.id.family_dialog_delete_confirm_button).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.family.globalbubble2.view.a.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                bVar.cancel();
                a.r(a.this);
            }
        });
        inflate.findViewById(R.id.family_dialog_delete_cancel_button).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.family.globalbubble2.view.a.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    bVar.cancel();
                }
            }
        });
        bVar.setContentView(inflate);
        bVar.setCancelable(true);
        bVar.setCanceledOnTouchOutside(true);
        bVar.show();
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.family.updateGlobalBubbleSwitch");
        mtopRequest.setVersion("1.0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("switchType", (Object) 0);
        mtopRequest.setData(jSONObject.toString());
        MtopBusiness.build(Mtop.instance(null, this.f17150a.getApplicationContext(), TaoHelper.getTTID()), mtopRequest).mo1305reqMethod(MethodEnum.POST).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.family.globalbubble2.view.FamilyView$15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                if (mtopResponse != null) {
                    k.a("FamilyView", "onSystemError:" + mtopResponse.getResponseCode() + "|" + mtopResponse.getRetMsg());
                }
                a.s(a.this).post(new Runnable() { // from class: com.taobao.family.globalbubble2.view.FamilyView$15.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            Toast.makeText(a.e(a.this), "删除失败，请稍后重试", 0).show();
                        }
                    }
                });
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                if (mtopResponse != null) {
                    k.a("FamilyView", "onSuccess:" + mtopResponse.getDataJsonObject());
                }
                a.s(a.this).post(new Runnable() { // from class: com.taobao.family.globalbubble2.view.FamilyView$15.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (a.t(a.this) == null) {
                        } else {
                            a.t(a.this).a();
                        }
                    }
                });
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                if (mtopResponse != null) {
                    k.a("FamilyView", "onError:" + mtopResponse.getResponseCode() + "|" + mtopResponse.getRetMsg());
                }
                a.s(a.this).post(new Runnable() { // from class: com.taobao.family.globalbubble2.view.FamilyView$15.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            Toast.makeText(a.e(a.this), "删除失败，请稍后重试", 0).show();
                        }
                    }
                });
            }
        }).startRequest();
    }

    @Override // com.taobao.family.globalbubble2.view.b
    public boolean a(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff88d03", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            a((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
        if (!this.v) {
            return false;
        }
        try {
            this.c.dispatchTouchEvent(motionEvent);
        } catch (Throwable unused) {
        }
        return true;
    }

    private void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (!a(this.d, i, i2) && !a(this.h, i, i2) && !a(this.i, i, i2) && !a(this.j, i, i2) && !a(this.k, i, i2)) {
            z = false;
        }
        this.v = z;
    }

    private boolean a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c25114e", new Object[]{this, view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (view.getVisibility() != 0) {
            return false;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return i > rect.left && i < rect.right && i2 > rect.top && i2 < rect.bottom;
    }
}
