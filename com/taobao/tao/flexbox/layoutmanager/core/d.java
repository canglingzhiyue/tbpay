package com.taobao.tao.flexbox.layoutmanager.core;

import android.content.Context;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.ogh;
import tb.ogl;
import tb.ogu;

/* loaded from: classes8.dex */
public abstract class d<V extends View, P extends ogl, D extends Drawable> extends Component<V, P> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean canbeDrawableChecked;
    public Drawable[] drawable;
    private boolean isDrawable;
    private boolean needInvalidate = true;
    private Drawable prepareDrawable;

    static {
        kge.a(-275896580);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1926757943:
                super.onLayoutComplete();
                return null;
            case -1791440821:
                return new Boolean(super.setComponentAlpha(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).floatValue(), (List) objArr[2]));
            case -1227079444:
                super.onRender((Context) objArr[0]);
                return null;
            case 471741631:
                super.attachComponent();
                return null;
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1123088784:
                return new Boolean(super.onPrepareComponent((Context) objArr[0]));
            case 1704596732:
                return new Boolean(super.onUpdateAttribute((c) objArr[0], (String) objArr[1], objArr[2], (aa.d) objArr[3]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public abstract D onCreateDrawable(Context context);

    public void applyAttrForDrawable(D d, P p, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08173fe", new Object[]{this, d, p, map, new Boolean(z)});
            return;
        }
        ogh.a("applyAttrForDrawable");
        if (z || this.node.r()) {
            Drawable[] drawableArr = this.drawable;
            drawableArr[0] = com.taobao.tao.flexbox.layoutmanager.drawable.b.a(drawableArr[0], p);
            Drawable[] drawableArr2 = this.drawable;
            drawableArr2[2] = com.taobao.tao.flexbox.layoutmanager.drawable.b.b(drawableArr2[2], p);
            c.b.a((f) this, (Object[]) this.drawable, (Drawable[]) p, this.node.p);
            c.i.a((f) this, (Object[]) this.drawable, (Drawable[]) p, this.node.p);
            c.k.a((f) this, (Object[]) this.drawable, (Drawable[]) p, this.node.p);
        } else {
            Drawable[] drawableArr3 = this.drawable;
            Drawable drawable = drawableArr3[0];
            Drawable drawable2 = drawableArr3[2];
            drawableArr3[0] = com.taobao.tao.flexbox.layoutmanager.drawable.b.a(drawableArr3[0], p);
            Drawable[] drawableArr4 = this.drawable;
            drawableArr4[2] = com.taobao.tao.flexbox.layoutmanager.drawable.b.b(drawableArr4[2], p);
            c.b.a((f) this, (Object[]) this.drawable, (Drawable[]) p, this.node.p);
            handleUpdateAttributes(map);
            this.needInvalidate |= drawable != this.drawable[0];
            boolean z3 = this.needInvalidate;
            if (drawable2 == this.drawable[2]) {
                z2 = false;
            }
            this.needInvalidate = z3 | z2;
        }
        ogh.b();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean onUpdateAttribute(c cVar, String str, Object obj, aa.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("659a14fc", new Object[]{this, cVar, str, obj, dVar})).booleanValue();
        }
        Drawable[] drawableArr = this.drawable;
        if (drawableArr == null) {
            return super.onUpdateAttribute(cVar, str, obj, dVar);
        }
        if (cVar == null) {
            return false;
        }
        cVar.a((f) this, (Object[]) drawableArr, (Drawable[]) this.viewParams, this.node.p);
        return true;
    }

    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        aa J = this.node.J();
        return J != null && !checkViewAttrs() && this.viewParams.aI == null && this.viewParams.aT == 1.0f && this.viewParams.aY == null && this.viewParams.ba && !this.viewParams.aZ && !this.viewParams.be && this.viewParams.bg == 0 && this.viewParams.bk == null && this.viewParams.bl == 0.0f && this.viewParams.bm == 0.0f && this.viewParams.bn == 0.0f && this.viewParams.bo == 0.0f && this.viewParams.bp == 0.0f && this.viewParams.bq == 1.0f && this.viewParams.br == 1.0f && this.viewParams.bs == null && this.viewParams.bA == null && StringUtils.isEmpty(this.viewParams.bc) && StringUtils.isEmpty(this.viewParams.bd) && J.I() != null && !(J.I() instanceof g) && !(J.I() instanceof z) && !(J.I() instanceof ah) && !isScrollViewDescendant() && !(J.I() instanceof PopLayerComponent);
    }

    private boolean isScrollViewDescendant() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df5f8a04", new Object[]{this})).booleanValue();
        }
        aa J = this.node.J();
        return (J == null || J.J() == null || !(J.J().I() instanceof ScrollViewComponent)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean checkViewAttrs() {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.core.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r5
            java.lang.String r2 = "fc738ee0"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L19:
            com.taobao.tao.flexbox.layoutmanager.core.aa r0 = r5.node
            java.util.HashMap r0 = r0.y()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = "on"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L5e
            java.lang.String r4 = "id"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L5e
            java.lang.String r4 = "trackinfo"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L5e
            java.lang.String r4 = "accessibility-text"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L5e
            java.lang.String r4 = "tab-scrollable"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L27
        L5e:
            return r3
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.d.checkViewAttrs():boolean");
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onRender(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6dc40ec", new Object[]{this, context});
        } else if (this.isDrawable) {
            if (this.drawable == null) {
                this.drawable = new Drawable[3];
                ogh.a("onCreateDrawable");
                Drawable drawable = this.prepareDrawable;
                if (drawable != null) {
                    this.drawable[1] = drawable;
                    this.prepareDrawable = null;
                } else {
                    this.drawable[1] = onCreateDrawable(context);
                }
                ogh.b();
            }
            Component.a aVar = this.currentHostViewComponentInfo;
            Component.a hostViewComponent = getHostViewComponent();
            boolean z = hostViewComponent == null || aVar == null || !hostViewComponent.b.equals(aVar.b);
            this.currentHostViewComponentInfo = hostViewComponent;
            if (z || needApplyAttrForComponent()) {
                applyAttrForDrawable(this.drawable[1], this.viewParams, this.node.v(), this.initRender);
            }
            this.initRender = false;
            if (!this.attached) {
                onAttach();
                onAttachComplete();
            } else if (z) {
                onUpdateLayout();
            }
            this.needInvalidate = false;
        } else {
            super.onRender(context);
        }
    }

    public void updateDrawable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("802a3706", new Object[]{this, new Boolean(z)});
            return;
        }
        Component.a hostViewComponent = this.currentHostViewComponentInfo != null ? this.currentHostViewComponentInfo : getHostViewComponent();
        if (hostViewComponent == null || hostViewComponent.f20278a == null) {
            return;
        }
        ogh.a("addOrUpdateDrawable");
        hostViewComponent.f20278a.addOrUpdateDrawable(!this.attached, this.drawable, hostViewComponent.b, this.node, z);
        ogh.b();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void attachComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1e34bf", new Object[]{this});
        } else if (this.isDrawable) {
            updateDrawable(this.needInvalidate);
            this.attached = true;
        } else {
            super.attachComponent();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.isDrawable && this.drawable != null) {
            Component.a hostViewComponent = getHostViewComponent();
            if (hostViewComponent != null && hostViewComponent.f20278a != null) {
                hostViewComponent.f20278a.removeDrawable(this.drawable);
            }
            for (Drawable drawable : this.drawable) {
                ogu.a(drawable);
            }
            this.drawable = null;
        }
        super.detach(z);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
            return;
        }
        super.onLayoutComplete();
        if (this.canbeDrawableChecked) {
            return;
        }
        Boolean bool = getNode().d().h.p;
        if (bool != null) {
            this.isDrawable = bool.booleanValue();
        } else {
            this.isDrawable = canbeDrawable();
            getNode().d().h.p = Boolean.valueOf(this.isDrawable);
        }
        this.canbeDrawableChecked = true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean onPrepareComponent(Context context) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42f0f990", new Object[]{this, context})).booleanValue();
        }
        if (this.isDrawable) {
            if (this.drawable == null && (drawable = this.prepareDrawable) == null) {
                if (drawable == null) {
                    this.prepareDrawable = onCreateDrawable(context);
                }
                if (this.prepareDrawable != null) {
                    return true;
                }
            }
            return false;
        }
        return super.onPrepareComponent(context);
    }

    public Drawable[] getDrawable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable[]) ipChange.ipc$dispatch("9e9a6244", new Object[]{this}) : this.drawable;
    }

    public boolean isDrawable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7e37873", new Object[]{this})).booleanValue() : this.isDrawable;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean setComponentAlpha(boolean z, float f, List<aa> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9538c84b", new Object[]{this, new Boolean(z), new Float(f), list})).booleanValue();
        }
        boolean componentAlpha = super.setComponentAlpha(z, f, list);
        Drawable[] drawableArr = this.drawable;
        if (drawableArr != null && componentAlpha) {
            for (Drawable drawable : drawableArr) {
                if (drawable != null) {
                    drawable.setAlpha(z ? (int) (255.0f * f) : (int) (this.viewParams.aT * f * 255.0f));
                }
            }
        }
        return componentAlpha;
    }
}
