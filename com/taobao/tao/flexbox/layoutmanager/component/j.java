package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaFlexDirection;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ad;
import com.taobao.tao.flexbox.layoutmanager.core.c;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.tao.flexbox.layoutmanager.view.CustomRoundRectFeature;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.kin;
import tb.oeb;
import tb.oec;
import tb.ogh;
import tb.ogj;
import tb.ogl;
import tb.ogu;
import tb.ogw;
import tb.oid;

/* loaded from: classes8.dex */
public class j extends com.taobao.tao.flexbox.layoutmanager.core.d<TNodeImageView, ogj, com.taobao.tao.flexbox.layoutmanager.drawable.c> implements ImageLoader.d, com.taobao.tao.flexbox.layoutmanager.core.q, com.taobao.tao.flexbox.layoutmanager.core.s, oid {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Drawable f20132a;
    private int b;
    private int c;
    private boolean d;
    private m e;
    private ScrollViewComponent f;
    private MessageQueue.IdleHandler g;
    private ImageLoader.e h;
    private boolean i = false;
    private com.taobao.tao.flexbox.layoutmanager.core.c l = new c.a() { // from class: com.taobao.tao.flexbox.layoutmanager.component.j.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, ogl oglVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8b0d9d2", new Object[]{this, aaVar, oglVar, str, obj});
            } else if (!TextUtils.equals(str, "tint-color") || !(oglVar instanceof ogj)) {
            } else {
                ((ogj) oglVar).b(aaVar.N(), obj);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, Object obj, ogl oglVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b59bada", new Object[]{this, fVar, obj, oglVar, dVar});
            } else {
                j.a(j.this);
            }
        }
    };
    private ScrollChangeListener j = new ScrollChangeListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.j.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onNestScroll(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10a7e84b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onScroll(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9628353", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onScrollStateChanged(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faf93876", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                j.h(j.this);
            }
        }
    };
    private ScrollChangeListener k = new ScrollChangeListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.j.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onNestScroll(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10a7e84b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onScrollStateChanged(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faf93876", new Object[]{this, new Integer(i), new Integer(i2)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onScroll(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9628353", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else if (!j.j(j.this) || j.i(j.this) == null || !j.k(j.this)) {
            } else {
                Looper.myQueue().removeIdleHandler(j.i(j.this));
                j.a(j.this, null);
                j.g(j.this);
            }
        }
    };

    static {
        kge.a(-910152803);
        kge.a(622630254);
        kge.a(-1371349407);
        kge.a(727465342);
        kge.a(-1420926486);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2141646649:
                super.applyAttrForView((View) objArr[0], (ogl) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -1926757943:
                super.onLayoutComplete();
                return null;
            case -1791440821:
                return new Boolean(super.setComponentAlpha(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).floatValue(), (List) objArr[2]));
            case -1333693442:
                super.applyAttrForDrawable((Drawable) objArr[0], (ogl) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case 505817802:
                return super.getAttributeHandler((String) objArr[0]);
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.oid
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.oid
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.d
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
    public void onImageLoadFailed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3feabda6", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.d
    public /* synthetic */ void applyAttrForDrawable(com.taobao.tao.flexbox.layoutmanager.drawable.c cVar, ogj ogjVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08173fe", new Object[]{this, cVar, ogjVar, map, new Boolean(z)});
        } else {
            a(cVar, ogjVar, map, z);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ void applyAttrForView(View view, ogl oglVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805910c7", new Object[]{this, view, oglVar, map, new Boolean(z)});
        } else {
            a((TNodeImageView) view, (ogj) oglVar, map, z);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ ogl mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.tao.flexbox.layoutmanager.drawable.c, android.graphics.drawable.Drawable] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.d
    public /* synthetic */ com.taobao.tao.flexbox.layoutmanager.drawable.c onCreateDrawable(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("2ede1a72", new Object[]{this, context}) : b(context);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    public static /* synthetic */ MessageQueue.IdleHandler a(j jVar, MessageQueue.IdleHandler idleHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageQueue.IdleHandler) ipChange.ipc$dispatch("5fbd6a9c", new Object[]{jVar, idleHandler});
        }
        jVar.g = idleHandler;
        return idleHandler;
    }

    public static /* synthetic */ void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc075c08", new Object[]{jVar});
        } else {
            jVar.m();
        }
    }

    public static /* synthetic */ View b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8045e94b", new Object[]{jVar}) : jVar.view;
    }

    public static /* synthetic */ View c(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4751d04c", new Object[]{jVar}) : jVar.view;
    }

    public static /* synthetic */ ogl d(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("798a3547", new Object[]{jVar}) : jVar.viewParams;
    }

    public static /* synthetic */ View e(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d5699e4e", new Object[]{jVar}) : jVar.view;
    }

    public static /* synthetic */ boolean f(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8aad0651", new Object[]{jVar})).booleanValue() : jVar.attached;
    }

    public static /* synthetic */ void g(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4015b8e", new Object[]{jVar});
        } else {
            jVar.e();
        }
    }

    public static /* synthetic */ void h(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd55b0cf", new Object[]{jVar});
        } else {
            jVar.k();
        }
    }

    public static /* synthetic */ MessageQueue.IdleHandler i(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MessageQueue.IdleHandler) ipChange.ipc$dispatch("c1dff17a", new Object[]{jVar}) : jVar.g;
    }

    public static /* synthetic */ boolean j(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2ffe5b55", new Object[]{jVar})).booleanValue() : jVar.i;
    }

    public static /* synthetic */ boolean k(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5952b096", new Object[]{jVar})).booleanValue() : jVar.f();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public com.taobao.tao.flexbox.layoutmanager.core.c getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.c) ipChange.ipc$dispatch("1e262aca", new Object[]{this, str});
        }
        if (oeb.a("enableOptImageAttr", true) && TextUtils.equals(str, "tint-color")) {
            return this.l;
        }
        return super.getAttributeHandler(str);
    }

    public TNodeImageView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeImageView) ipChange.ipc$dispatch("2735fe7a", new Object[]{this, context});
        }
        TNodeImageView a2 = ogu.a(context);
        if (((ogj) this.viewParams).l != null) {
            if (((ogj) this.viewParams).l.equals("contain")) {
                a2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else if (((ogj) this.viewParams).l.equals("cover")) {
                a2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else if (((ogj) this.viewParams).l.equals("stretch")) {
                a2.setScaleType(ImageView.ScaleType.FIT_XY);
            }
        } else {
            a2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        a2.setReleaseDrawableOnDetach(false);
        com.taobao.tao.flexbox.layoutmanager.core.aa e = ad.e(this.node);
        if (e != null) {
            this.e = (m) e.I();
            this.e.a(this.j);
            this.e.a(this);
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa a3 = this.node.a(ScrollViewComponent.class, (aa.c) null, true);
        if (a3 != null) {
            this.f = (ScrollViewComponent) a3.I();
        }
        updateAPMToken(a2, com.taobao.monitor.procedure.v.APM_VIEW_INVALID);
        Drawable a4 = ogu.a(((ogj) this.viewParams).f, true);
        if (a4 == null && !TextUtils.isEmpty(((ogj) this.viewParams).bd)) {
            a4 = ogu.a(((ogj) this.viewParams).bd, true);
        }
        if (a4 != null) {
            a2.setImageDrawable(a4);
            if ((this.node.k().g() instanceof com.taobao.tao.flexbox.layoutmanager.container.f) && !((com.taobao.tao.flexbox.layoutmanager.container.f) this.node.k().g()).isTransitionCompleted()) {
                a2.postponedSetImageDrawable();
            }
        }
        return a2;
    }

    public ogj a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogj) ipChange.ipc$dispatch("f08a9cc", new Object[]{this}) : new ogj();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ogh.a("setImageUrl");
        this.i = false;
        i();
        if (this.view != 0) {
            ((TNodeImageView) this.view).setImageLoadCallback(this);
            TNodeImageView tNodeImageView = (TNodeImageView) this.view;
            m mVar = this.e;
            tNodeImageView.loadImageIfInSlowScroll(mVar != null ? mVar.g() : true);
            if (!oec.a(((ogj) this.viewParams).e, ((TNodeImageView) this.view).getImageSrc())) {
                if (TextUtils.isEmpty(((ogj) this.viewParams).bd) || !this.node.k().n()) {
                    if (((TNodeImageView) this.view).getDrawable() == null) {
                        if (((ogj) this.viewParams).j != 1) {
                            ((TNodeImageView) this.view).setImageDrawable(new ColorDrawable(((ogj) this.viewParams).j));
                        } else if (((ogj) this.viewParams).k != null) {
                            this.h = ogw.a(null, this.node.k(), ((ogj) this.viewParams).k, this.measureResult.f20361a, this.measureResult.b, ImageLoader.a.a("background", this.node), null, false, new ogw.a() { // from class: com.taobao.tao.flexbox.layoutmanager.component.j.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // tb.ogw.a
                                public void a(Object obj, int i) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("1e7da93f", new Object[]{this, obj, new Integer(i)});
                                    }
                                }

                                @Override // tb.ogw.a
                                public void a(Object obj, Drawable drawable) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("91476368", new Object[]{this, obj, drawable});
                                    } else if (j.b(j.this) == null || ((TNodeImageView) j.c(j.this)).getDrawable() != null || !oec.a(obj, ((ogj) j.d(j.this)).k)) {
                                    } else {
                                        ((TNodeImageView) j.e(j.this)).setImageDrawable(drawable);
                                    }
                                }
                            });
                        }
                    }
                    ((TNodeImageView) this.view).setShowAnimation(((ogj) this.viewParams).n);
                }
                String str = null;
                if (!TextUtils.equals(((ogj) this.viewParams).g, ((ogj) this.viewParams).f)) {
                    str = ((ogj) this.viewParams).g;
                }
                String str2 = str;
                int[] j = j();
                ((TNodeImageView) this.view).setImageSrc(this.node.k(), ((ogj) this.viewParams).e, str2, j[0], j[1], ImageLoader.a.a((ogj) this.viewParams, this.node), ((ogj) this.viewParams).bh, a(((ogj) this.viewParams).e));
            } else if (this.node.c("src")) {
                Drawable drawable = ((TNodeImageView) this.view).getDrawable();
                if ((drawable instanceof com.taobao.phenix.animate.b) && !TextUtils.equals(((ogj) this.viewParams).m, "png")) {
                    ((com.taobao.phenix.animate.b) drawable).b();
                }
            }
        } else if (this.drawable != null && this.drawable[1] != null) {
            ((com.taobao.tao.flexbox.layoutmanager.drawable.c) this.drawable[1]).a(this);
            com.taobao.tao.flexbox.layoutmanager.drawable.c cVar = (com.taobao.tao.flexbox.layoutmanager.drawable.c) this.drawable[1];
            m mVar2 = this.e;
            cVar.a(mVar2 != null ? mVar2.g() : true);
            if (!TextUtils.equals(((ogj) this.viewParams).g, ((com.taobao.tao.flexbox.layoutmanager.drawable.c) this.drawable[1]).c())) {
                if (((ogj) this.viewParams).j != 1) {
                    ((com.taobao.tao.flexbox.layoutmanager.drawable.c) this.drawable[1]).c(((ogj) this.viewParams).j);
                }
                ((com.taobao.tao.flexbox.layoutmanager.drawable.c) this.drawable[1]).a(((ogj) this.viewParams).g);
            }
        }
        ogh.b();
    }

    private boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
        }
        return (obj instanceof String ? ogw.a((String) obj) : false) || kin.GIF_MODE.equals(((ogj) this.viewParams).m) || "apng".equals(((ogj) this.viewParams).m) || ((ogj) this.viewParams).bh != null || (((ogj) this.viewParams).o & 1) != 0;
    }

    public void a(TNodeImageView tNodeImageView, ogj ogjVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f6c279", new Object[]{this, tNodeImageView, ogjVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(tNodeImageView, ogjVar, map, z);
        CustomRoundRectFeature customRoundRectFeature = (CustomRoundRectFeature) ((TNodeImageView) this.view).findFeature(CustomRoundRectFeature.class);
        if (this.node.s() || z) {
            ogh.a("image update attr");
            this.f20132a = null;
            if (ogjVar.aK > 0 || ogjVar.aL > 0 || ogjVar.aM > 0 || ogjVar.aN > 0) {
                if (customRoundRectFeature == null) {
                    customRoundRectFeature = new CustomRoundRectFeature();
                }
                customRoundRectFeature.setRadii(new float[]{ogjVar.aK, ogjVar.aK, ogjVar.aL, ogjVar.aL, ogjVar.aN, ogjVar.aN, ogjVar.aM, ogjVar.aM});
            } else if (ogjVar.aJ > 0) {
                if (customRoundRectFeature == null) {
                    customRoundRectFeature = new CustomRoundRectFeature();
                }
                customRoundRectFeature.setRadiusX(ogjVar.aJ);
                customRoundRectFeature.setRadiusY(ogjVar.aJ);
            }
            if (ogjVar.aO > 0) {
                if (customRoundRectFeature == null) {
                    customRoundRectFeature = new CustomRoundRectFeature();
                }
                customRoundRectFeature.setStrokeWidth(ogjVar.aO);
                int i = ogjVar.aP == 1 ? ogjVar.aE : ogjVar.aP;
                if (i == 1) {
                    i = 0;
                }
                customRoundRectFeature.setStrokeColor(i);
            }
            if (ogjVar.aF != 1 && this.f20132a == null) {
                this.f20132a = com.taobao.tao.flexbox.layoutmanager.drawable.b.b(null, ogjVar);
            }
            ogh.b();
        }
        if (!ogjVar.f() && customRoundRectFeature != null) {
            customRoundRectFeature.setRadii(null);
            customRoundRectFeature.setRadiusX(0.0f);
            customRoundRectFeature.setRadiusY(0.0f);
        }
        if (customRoundRectFeature != null && ((TNodeImageView) this.view).findFeature(CustomRoundRectFeature.class) == null) {
            ((TNodeImageView) this.view).addFeature(customRoundRectFeature);
        }
        if (this.f20132a != null) {
            ((TNodeImageView) this.view).setForeground(this.f20132a);
        }
        m();
        h();
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (((ogj) this.viewParams).d == 0 || this.view == 0 || ((TNodeImageView) this.view).getDrawable() == null) {
        } else {
            DrawableCompat.setTint(((TNodeImageView) this.view).getDrawable(), ((ogj) this.viewParams).d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean f() {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.j.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r8
            java.lang.String r2 = "5b2e1f1"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L19:
            V extends android.view.View r0 = r8.view
            if (r0 != 0) goto L1e
            return r3
        L1e:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            V extends android.view.View r1 = r8.view
            com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView r1 = (com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView) r1
            boolean r0 = r1.getGlobalVisibleRect(r0)
            if (r0 != 0) goto L74
            com.taobao.tao.flexbox.layoutmanager.core.aa r0 = r8.node
            android.content.Context r0 = r0.N()
            int r0 = tb.ohd.b(r0)
            com.taobao.tao.flexbox.layoutmanager.core.aa r1 = r8.node
            com.taobao.tao.flexbox.layoutmanager.core.r r4 = r8.measureResult
            int r4 = r4.c
        L3d:
            if (r4 >= r0) goto L70
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r1.J()
            if (r5 == 0) goto L70
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r1.J()
            com.taobao.tao.flexbox.layoutmanager.core.r r5 = r5.G()
            if (r5 == 0) goto L70
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r1.J()
            com.taobao.tao.flexbox.layoutmanager.core.r r6 = r5.G()
            int r6 = r6.c
            android.view.View r7 = r5.x()
            if (r7 == 0) goto L68
            android.view.View r5 = r5.x()
            int r5 = r5.getScrollX()
            goto L69
        L68:
            r5 = 0
        L69:
            int r6 = r6 - r5
            int r4 = r4 + r6
            com.taobao.tao.flexbox.layoutmanager.core.aa r1 = r1.J()
            goto L3d
        L70:
            if (r4 >= r0) goto L73
            return r2
        L73:
            return r3
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.j.f():boolean");
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        if (eVar.c.equals("onwillappear")) {
            g();
        }
        return false;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        k();
        if (Build.VERSION.SDK_INT >= 21 && this.view != 0 && ((TNodeImageView) this.view).getTransitionName() != null) {
            float b = oec.b(((TNodeImageView) this.view).getTag(R.id.layout_manager_share_element_original_alpha), 1);
            if (b > 0.0f && ((TNodeImageView) this.view).getAlpha() == 0.0f) {
                ((TNodeImageView) this.view).setAlpha(b);
            }
        }
        if (this.view == 0) {
            return;
        }
        Drawable drawable = ((TNodeImageView) this.view).getDrawable();
        if (!(drawable instanceof com.taobao.phenix.animate.b)) {
            return;
        }
        com.taobao.phenix.animate.b bVar = (com.taobao.phenix.animate.b) drawable;
        if (bVar.c()) {
            return;
        }
        bVar.b();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
    public void onImageLoaded(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
            return;
        }
        ogh.a("onImageLoaded");
        if (bitmapDrawable != null) {
            if (((ogj) this.viewParams).d != 0) {
                if (this.view != 0) {
                    DrawableCompat.setTint(bitmapDrawable, ((ogj) this.viewParams).d);
                } else if (this.drawable != null && this.drawable[1] != null) {
                    DrawableCompat.setTint(this.drawable[1], ((ogj) this.viewParams).d);
                }
            }
            if (getNode() != null && oec.a(getNode().e("effect-view"), false)) {
                postMessage(34, getNode().J(), "onBlurViewRefresh", null, null, null);
            }
        }
        updateAPMToken(this.view, com.taobao.monitor.procedure.v.APM_VIEW_VALID);
        ogh.b();
    }

    public com.taobao.tao.flexbox.layoutmanager.drawable.c b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.drawable.c) ipChange.ipc$dispatch("99013455", new Object[]{this, context});
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa e = ad.e(this.node);
        if (e != null) {
            this.e = (m) e.I();
            this.e.a(this.j);
        }
        return ogu.a(context.getResources());
    }

    public void a(com.taobao.tao.flexbox.layoutmanager.drawable.c cVar, ogj ogjVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c870cb", new Object[]{this, cVar, ogjVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForDrawable(cVar, ogjVar, map, z);
        if (ogjVar.aK > 0 || ogjVar.aL > 0 || ogjVar.aM > 0 || ogjVar.aN > 0) {
            cVar.a(new float[]{ogjVar.aK, ogjVar.aK, ogjVar.aL, ogjVar.aL, ogjVar.aN, ogjVar.aN, ogjVar.aM, ogjVar.aM});
        } else if (ogjVar.aJ > 0) {
            cVar.a(ogjVar.aJ);
        }
        if (ogjVar.aO > 0) {
            int i = ogjVar.aP == 1 ? ogjVar.aE : ogjVar.aP;
            if (i == 1) {
                i = 0;
            }
            cVar.b(i);
            cVar.a(ogjVar.aO);
        }
        if (ogjVar.d != 0 && this.drawable != null && this.drawable[1] != null) {
            DrawableCompat.setTint(this.drawable[1], ogjVar.d);
        }
        h();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.i = true;
        if (oeb.cn() && !f() && this.g == null && l()) {
            this.g = new MessageQueue.IdleHandler() { // from class: com.taobao.tao.flexbox.layoutmanager.component.j.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    if (!j.f(j.this)) {
                        return true;
                    }
                    j.g(j.this);
                    j.a(j.this, null);
                    return false;
                }
            };
            Looper.myQueue().addIdleHandler(this.g);
            return;
        }
        e();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.d, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.g != null) {
            Looper.myQueue().removeIdleHandler(this.g);
            this.g = null;
        }
        m mVar = this.e;
        if (mVar != null) {
            mVar.b(this.j);
            this.e.b(this);
        }
        ScrollViewComponent scrollViewComponent = this.f;
        if (scrollViewComponent != null) {
            scrollViewComponent.removeScrollChangedListener(this.k);
        }
        if (this.view != 0) {
            ((TNodeImageView) this.view).cancel();
            ((TNodeImageView) this.view).removeFeature(CustomRoundRectFeature.class);
            ogu.a((TNodeImageView) this.view);
            ((TNodeImageView) this.view).setImageLoadCallback(null);
            this.view = null;
        }
        ImageLoader.e eVar = this.h;
        if (eVar != null) {
            eVar.a();
        }
        this.f20132a = null;
        super.detach(z);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.d, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
            return;
        }
        super.onLayoutComplete();
        i();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        int[] j = j();
        if (((ogj) this.viewParams).g != null && !this.node.c("src") && !this.node.c("image")) {
            return;
        }
        ogh.a("setupUrl");
        if (getNode() != null && getNode().d() != null) {
            String b = getNode().d().b();
            String a2 = ogu.a(((ogj) this.viewParams).f, b);
            if (!TextUtils.isEmpty(a2)) {
                ((ogj) this.viewParams).g = a2;
            } else {
                ((ogj) this.viewParams).g = ogw.a(this.node.k(), this.node.N(), ((ogj) this.viewParams).f, j[0], j[1], ImageLoader.a.a((ogj) this.viewParams, this.node), a(((ogj) this.viewParams).f));
                ogu.a(((ogj) this.viewParams).f, b, ((ogj) this.viewParams).g);
            }
        } else {
            ((ogj) this.viewParams).g = ogw.a(this.node.k(), this.node.N(), ((ogj) this.viewParams).f, j[0], j[1], ImageLoader.a.a((ogj) this.viewParams, this.node), a(((ogj) this.viewParams).f));
        }
        ogh.b();
    }

    private int[] j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("b77cbf13", new Object[]{this});
        }
        if (((ogj) this.viewParams).h > 0 && ((ogj) this.viewParams).i > 0) {
            this.b = ((ogj) this.viewParams).h;
            this.c = ((ogj) this.viewParams).i;
            this.d = true;
        } else {
            this.d = false;
        }
        int i = this.measureResult.f20361a;
        int i2 = this.measureResult.b;
        if (this.d) {
            i = this.b;
            i2 = this.c;
        }
        return new int[]{i, i2};
    }

    @Override // tb.oid
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            k();
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.view != 0) {
            TNodeImageView tNodeImageView = (TNodeImageView) this.view;
            m mVar = this.e;
            if (mVar != null) {
                z = mVar.g();
            }
            tNodeImageView.loadImageIfInSlowScroll(z);
        } else if (this.drawable == null || this.drawable[1] == null) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.drawable.c cVar = (com.taobao.tao.flexbox.layoutmanager.drawable.c) this.drawable[1];
            m mVar2 = this.e;
            if (mVar2 != null) {
                z = mVar2.g();
            }
            cVar.a(z);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.d
    public void onImageLoaded(String str, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72686e27", new Object[]{this, str, bitmapDrawable});
            return;
        }
        onImageLoaded(bitmapDrawable);
        oec.a(this.node, true, ((ogj) this.viewParams).f, ((ogj) this.viewParams).g, bitmapDrawable);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.d
    public void onImageLoadFailed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6d6a1d", new Object[]{this, new Integer(i)});
            return;
        }
        onImageLoadFailed();
        oec.a(this.node, false, ((ogj) this.viewParams).f, ((ogj) this.viewParams).g, null);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public Component.b getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component.b) ipChange.ipc$dispatch("1d100afe", new Object[]{this});
        }
        Bitmap bitmap = null;
        if (this.view != 0) {
            Drawable drawable = ((TNodeImageView) this.view).getDrawable();
            if (drawable instanceof BitmapDrawable) {
                Component.b bVar = new Component.b();
                bVar.f20279a = ((ogj) this.viewParams).g;
                bVar.b = oec.b((View) this.view);
                if (drawable instanceof com.taobao.phenix.animate.b) {
                    try {
                        bitmap = ((com.taobao.phenix.animate.b) drawable).h();
                        ((com.taobao.phenix.animate.b) drawable).e();
                    } catch (Throwable unused) {
                    }
                }
                if (bitmap == null) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
                bVar.c = bitmap;
                return bVar;
            }
        }
        return null;
    }

    public Drawable d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("23d2f6ef", new Object[]{this});
        }
        if (this.view != 0) {
            return ((TNodeImageView) this.view).getDrawable();
        }
        if (this.drawable == null) {
            return null;
        }
        return this.drawable[1];
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.d, com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean setComponentAlpha(boolean z, float f, List<com.taobao.tao.flexbox.layoutmanager.core.aa> list) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9538c84b", new Object[]{this, new Boolean(z), new Float(f), list})).booleanValue();
        }
        boolean componentAlpha = super.setComponentAlpha(z, f, list);
        if (this.view != 0 && componentAlpha && (drawable = ((TNodeImageView) this.view).getDrawable()) != null) {
            if (!z) {
                f *= ((ogj) this.viewParams).aT;
            }
            drawable.setAlpha((int) (f * 255.0f));
        }
        return componentAlpha;
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        ScrollViewComponent scrollViewComponent = this.f;
        if (scrollViewComponent != null) {
            scrollViewComponent.removeScrollChangedListener(this.k);
        }
        ScrollViewComponent scrollViewComponent2 = this.f;
        if (scrollViewComponent2 == null || scrollViewComponent2.getViewParams() == null || this.f.getViewParams().av != YogaFlexDirection.ROW) {
            return false;
        }
        this.f.addScrollChangedListener(this.k);
        return true;
    }
}
