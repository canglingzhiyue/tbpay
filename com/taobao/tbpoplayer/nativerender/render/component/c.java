package com.taobao.tbpoplayer.nativerender.render.component;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.utils.i;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import com.taobao.tbpoplayer.nativerender.e;
import com.taobao.tbpoplayer.nativerender.l;
import com.taobao.tbpoplayer.nativerender.p;
import com.taobao.tbpoplayer.nativerender.r;
import java.util.Map;
import tb.kge;
import tb.qnu;

/* loaded from: classes8.dex */
public abstract class c<T extends ComponentBaseModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public com.taobao.tbpoplayer.nativerender.e f22246a;
    public T b;
    public View c;
    public boolean d;

    static {
        kge.a(239810147);
        kge.a(717479522);
    }

    public static /* synthetic */ void lambda$PDBItpmNLRc6bxeafy2EEkrCcIw(c cVar) {
        cVar.h();
    }

    public abstract View a(Context context);

    public abstract StyleModel a();

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public c(com.taobao.tbpoplayer.nativerender.e eVar, T t, boolean z) {
        this.d = false;
        try {
            this.f22246a = eVar;
            this.b = t;
            this.d = z;
            if (!t.isValid()) {
                eVar.a("ComponentConfigInvalid.componentType=" + t.type, "");
            }
            View a2 = a(eVar.a().a());
            StyleModel a3 = a();
            if (a3 != null) {
                this.c = a(a2, a3.borderRadius);
            } else {
                this.c = a2;
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopComponent.init..error.id=" + t.id, th);
            eVar.a("ComponentInitError.componentType=" + t.type, "");
        }
    }

    public View g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d6895230", new Object[]{this}) : this.c;
    }

    public T n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("df712525", new Object[]{this}) : this.b;
    }

    public void a(View view, StyleModel styleModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41bd6b7b", new Object[]{this, view, styleModel});
            return;
        }
        try {
            b(view, styleModel);
            Context a2 = this.f22246a.a().a();
            i l = this.f22246a.l();
            view.setPadding((int) l.a(a2, (float) styleModel.paddingLeft), (int) l.a(a2, (float) styleModel.paddingTop), (int) l.a(a2, (float) styleModel.paddingRight), (int) l.a(a2, (float) styleModel.paddingBottom));
            r.a(this.f22246a, view, this.b, styleModel);
            String a3 = p.a(this.f22246a, this.b.alt, false);
            if (TextUtils.isEmpty(a3)) {
                return;
            }
            view.setContentDescription(a3);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopComponent.initLayoutParams.error.id=" + this.b.id, th);
            com.taobao.tbpoplayer.nativerender.e eVar = this.f22246a;
            eVar.a("RenderFailed.initStyle.id=" + this.b.id, "");
        }
    }

    public void b(View view, StyleModel styleModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2236c17c", new Object[]{this, view, styleModel});
            return;
        }
        int b = qnu.b(this.f22246a, styleModel.width);
        int b2 = qnu.b(this.f22246a, styleModel.height);
        if (this.d) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(b, b2);
            int b3 = b(styleModel.marginLeft);
            if (b3 > 0) {
                layoutParams.leftMargin = b3;
            }
            int b4 = b(styleModel.marginRight);
            if (b4 > 0) {
                layoutParams.rightMargin = b4;
            }
            int b5 = b(styleModel.marginTop);
            if (b5 > 0) {
                layoutParams.topMargin = b5;
            }
            int b6 = b(styleModel.marginBottom);
            if (b6 > 0) {
                layoutParams.bottomMargin = b6;
            }
            view.setLayoutParams(layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(b, b2);
        String str = styleModel.layout;
        if (TextUtils.isEmpty(str) || "leftTop".equals(str)) {
            layoutParams2.gravity = 51;
            if (!TextUtils.isEmpty(styleModel.left)) {
                layoutParams2.leftMargin = a(styleModel.left);
            }
            if (!TextUtils.isEmpty(styleModel.top)) {
                layoutParams2.topMargin = a(styleModel.top);
            }
        } else if ("leftBottom".equals(str)) {
            layoutParams2.gravity = 83;
            if (!TextUtils.isEmpty(styleModel.left)) {
                layoutParams2.leftMargin = a(styleModel.left);
            }
            if (!TextUtils.isEmpty(styleModel.bottom)) {
                layoutParams2.bottomMargin = a(styleModel.bottom);
            }
        } else if ("rightTop".equals(str)) {
            layoutParams2.gravity = 53;
            if (!TextUtils.isEmpty(styleModel.right)) {
                layoutParams2.rightMargin = a(styleModel.right);
            }
            if (!TextUtils.isEmpty(styleModel.top)) {
                layoutParams2.topMargin = a(styleModel.top);
            }
        } else if ("rightBottom".equals(str)) {
            layoutParams2.gravity = 85;
            if (!TextUtils.isEmpty(styleModel.right)) {
                layoutParams2.rightMargin = a(styleModel.right);
            }
            if (!TextUtils.isEmpty(styleModel.bottom)) {
                layoutParams2.bottomMargin = a(styleModel.bottom);
            }
        }
        view.setLayoutParams(layoutParams2);
    }

    private View a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("26df70db", new Object[]{this, view, new Integer(i)});
        }
        com.taobao.tbpoplayer.nativerender.d a2 = this.f22246a.a();
        if (view == null || i <= 0 || a2.c() != 1) {
            return view;
        }
        Map<String, String> w = a2.w();
        if (w != null && "false".equals(w.get(com.taobao.tbpoplayer.nativerender.d.WIDGET_SWITCH_ENABLE_CORNER_RADIUS))) {
            return view;
        }
        float a3 = this.f22246a.l().a(a2.a(), i);
        PopComponentCornerClipLayout popComponentCornerClipLayout = new PopComponentCornerClipLayout(view.getContext());
        popComponentCornerClipLayout.init((int) a3);
        popComponentCornerClipLayout.setLayoutParams(view.getLayoutParams());
        popComponentCornerClipLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        return popComponentCornerClipLayout;
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        try {
            if (!"auto".equals(str)) {
                return (int) this.f22246a.l().a(this.f22246a.a().a(), p.c(this.f22246a, str).floatValue());
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        try {
            return (int) this.f22246a.l().a(this.f22246a.a().a(), p.c(this.f22246a, str).floatValue());
        } catch (Throwable unused) {
            return 0;
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else {
            this.f22246a.e().a(this.f22246a, jSONObject, this.b, this.c);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            i();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            i();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            i();
        }
    }

    public void bh_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
        } else {
            i();
        }
    }

    public void a(final e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad932ea8", new Object[]{this, bVar});
        } else {
            this.f22246a.e().a(this.f22246a, "close", this.b.animation, this.c, this.b, new l.b() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$c$ztHO5dXG5o-9m1cY9qntwcCpbH8
                @Override // com.taobao.tbpoplayer.nativerender.l.b
                public final void onAnimationEnd() {
                    c.this.b(bVar);
                }
            });
        }
    }

    public /* synthetic */ void b(e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4833f129", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            com.alibaba.poplayer.utils.c.a("PopComponent.onPreClose.anim.done." + this.b.id, new Object[0]);
            bVar.onPreCloseDone(false);
        }
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : !TextUtils.isEmpty(str) && str.equals(this.b.id);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.f22246a.e().a(this.f22246a, "expose", this.b.animation, this.c, this.b, (l.b) null);
        String str = this.f22246a.a().k().focusComponent;
        if (TextUtils.isEmpty(str) || !str.equals(this.b.id)) {
            return;
        }
        this.f22246a.a(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$c$PDBItpmNLRc6bxeafy2EEkrCcIw
            {
                c.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c.lambda$PDBItpmNLRc6bxeafy2EEkrCcIw(c.this);
            }
        }, 500L);
    }

    public /* synthetic */ void h() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 19 || (view = this.c) == null || !view.isAttachedToWindow()) {
        } else {
            this.c.sendAccessibilityEvent(8);
        }
    }
}
