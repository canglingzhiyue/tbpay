package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.w;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import tb.kge;
import tb.odx;
import tb.oec;
import tb.ogl;
import tb.ogu;

/* loaded from: classes8.dex */
public class v extends e implements w.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private w f20200a;

    static {
        kge.a(-81124681);
        kge.a(-906966987);
    }

    public static /* synthetic */ Object ipc$super(v vVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1015965122) {
            super.onLayoutChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Boolean) objArr[4]).booleanValue());
            return null;
        } else if (hashCode != 1052797818) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.detach(((Boolean) objArr[0]).booleanValue());
            return null;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.e, com.taobao.tao.flexbox.layoutmanager.core.d
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ ogl mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.e, com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    public static /* synthetic */ View a(v vVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("77ec1be", new Object[]{vVar}) : vVar.view;
    }

    public static /* synthetic */ View b(v vVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ce8aa8bf", new Object[]{vVar}) : vVar.view;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa c(v vVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("2c1d5b80", new Object[]{vVar}) : vVar.node;
    }

    public FlatViewGroup a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlatViewGroup) ipChange.ipc$dispatch("c3f73431", new Object[]{this, context});
        }
        FlatViewGroup e = ogu.e(context);
        e.bindComponent(this);
        return e;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onViewCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6b63ab", new Object[]{this});
            return;
        }
        this.f20200a = w.a(this.node.k(), this, ((a) this.viewParams).f20202a);
        this.f20200a.a(this);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutChanged(int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8e65c2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        super.onLayoutChanged(i, i2, i3, i4, z);
        if (this.view == 0 || i == i3 || z) {
            return;
        }
        this.view.setTranslationY(0.0f);
        a(1.0f);
        w wVar = this.f20200a;
        if (wVar == null) {
            return;
        }
        wVar.c();
        this.f20200a.post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.v.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (v.a(v.this) == null) {
                } else {
                    v.c(v.this).b(v.b(v.this).getContext());
                }
            }
        });
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.e, com.taobao.tao.flexbox.layoutmanager.core.d, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        super.detach(z);
        w wVar = this.f20200a;
        if (wVar == null) {
            return;
        }
        wVar.b(this);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.w.a
    public void a(int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1660f9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        if (this.view != 0) {
            this.view.setTranslationY(i);
        }
        a(1.0f - ((-i) / i2));
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if (((a) this.viewParams).b) {
        } else {
            if (this.view != 0) {
                this.view.setAlpha(f);
            }
            if (this.viewParams == 0) {
                return;
            }
            this.viewParams.aT = f;
        }
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e66aa525", new Object[]{this}) : new a();
    }

    /* loaded from: classes8.dex */
    public static class a extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String[] f20202a;
        public boolean b;
        public boolean c;
        public int d = 0;

        static {
            kge.a(719833342);
        }

        @Override // tb.ogl
        public void a(Context context, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("840caf86", new Object[]{this, context, str, obj});
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1545477013:
                    if (str.equals("threshold")) {
                        c = 3;
                        break;
                    }
                    break;
                case -892259863:
                    if (str.equals("sticky")) {
                        c = 1;
                        break;
                    }
                    break;
                case 46097734:
                    if (str.equals("init-sticky")) {
                        c = 2;
                        break;
                    }
                    break;
                case 98629247:
                    if (str.equals("group")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                this.f20202a = odx.b(obj);
            } else if (c == 1) {
                this.b = oec.a(obj, false);
            } else if (c == 2) {
                this.c = "hidden".equals(obj);
            } else if (c != 3) {
            } else {
                this.d = a(h(), context, obj);
            }
        }
    }
}
