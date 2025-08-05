package com.taobao.tao.flexbox.layoutmanager.component;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import com.facebook.yoga.YogaNode;
import com.taobao.tao.flexbox.layoutmanager.component.r;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.oel;
import tb.ogk;
import tb.ogl;
import tb.ogu;
import tb.ohd;

/* loaded from: classes8.dex */
public class TextComponent extends com.taobao.tao.flexbox.layoutmanager.core.d<View, ogk, com.taobao.tao.flexbox.layoutmanager.drawable.d> implements com.taobao.tao.flexbox.layoutmanager.core.q, com.taobao.tao.flexbox.layoutmanager.core.s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int lineCount;
    private float metaWidth;
    public com.taobao.tao.flexbox.layoutmanager.drawable.e textLayoutHelper;
    private YogaMeasureFunction measureFunction = new YogaMeasureFunction() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TextComponent.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("15b3ebfa", new Object[]{this, yogaNode, new Float(f), yogaMeasureMode, new Float(f2), yogaMeasureMode2})).longValue();
            }
            if (TextComponent.access$000(TextComponent.this) != null && !TextComponent.access$100(TextComponent.this).s() && !TextComponent.access$200(TextComponent.this).n() && !TextComponent.access$300(TextComponent.this, f, yogaMeasureMode)) {
                return YogaMeasureOutput.make((TextComponent.access$900(TextComponent.this).f20361a - ((ogk) TextComponent.access$1000(TextComponent.this)).ag) - ((ogk) TextComponent.access$1100(TextComponent.this)).ah, (TextComponent.access$1200(TextComponent.this).b - ((ogk) TextComponent.access$1300(TextComponent.this)).ai) - ((ogk) TextComponent.access$1400(TextComponent.this)).aj);
            }
            TextComponent.access$402(TextComponent.this, f);
            TextComponent textComponent = TextComponent.this;
            textComponent.setupLayoutHelper((ogk) TextComponent.access$500(textComponent), -1);
            TextComponent.this.textLayoutHelper.a(yogaMeasureMode, f);
            TextComponent.this.textLayoutHelper.a(((ogk) TextComponent.access$600(TextComponent.this)).y);
            if (TextUtils.isEmpty(((ogk) TextComponent.access$700(TextComponent.this)).y) || TextComponent.this.textLayoutHelper.m() == null) {
                return YogaMeasureOutput.make(0, 0);
            }
            int i = ((ogk) TextComponent.access$800(TextComponent.this)).u;
            return TextComponent.this.textLayoutHelper.m().getLineCount() > i ? YogaMeasureOutput.make(TextComponent.this.textLayoutHelper.o(), TextComponent.this.textLayoutHelper.m().getLineBottom(i - 1)) : YogaMeasureOutput.make(TextComponent.this.textLayoutHelper.o(), TextComponent.this.textLayoutHelper.p());
        }
    };
    private com.taobao.tao.flexbox.layoutmanager.core.c color = new com.taobao.tao.flexbox.layoutmanager.core.c() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TextComponent.2
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
            } else if (!(oglVar instanceof ogk) || !TextUtils.equals(str, "color")) {
            } else {
                ((ogk) oglVar).b(aaVar.N(), obj);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, Object obj, ogl oglVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b59bada", new Object[]{this, fVar, obj, oglVar, dVar});
            } else if (((ogk) TextComponent.access$1500(TextComponent.this)).s == 1) {
            } else {
                if (obj instanceof TextView) {
                    ((TextView) obj).setTextColor(((ogk) TextComponent.access$1600(TextComponent.this)).s);
                }
                if (!(obj instanceof StaticLayoutView)) {
                    return;
                }
                ((StaticLayoutView) obj).setTextColor(((ogk) TextComponent.access$1700(TextComponent.this)).s);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, Object[] objArr, ogl oglVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7423477b", new Object[]{this, fVar, objArr, oglVar, dVar});
            } else if (((ogk) TextComponent.access$1800(TextComponent.this)).s == 1 || objArr == null || objArr.length <= 2 || !(objArr[1] instanceof com.taobao.tao.flexbox.layoutmanager.drawable.d)) {
            } else {
                ((com.taobao.tao.flexbox.layoutmanager.drawable.d) objArr[1]).b(((ogk) TextComponent.access$1900(TextComponent.this)).s);
            }
        }
    };
    private com.taobao.tao.flexbox.layoutmanager.core.c boxshadow = new com.taobao.tao.flexbox.layoutmanager.core.c() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TextComponent.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

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
            } else if (!(oglVar instanceof ogk) || !TextUtils.equals(str, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_box_shadow)) {
            } else {
                ((ogk) oglVar).h(aaVar.N(), obj);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, Object obj, ogl oglVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b59bada", new Object[]{this, fVar, obj, oglVar, dVar});
            } else if (!(oglVar instanceof ogk)) {
            } else {
                ogk ogkVar = (ogk) oglVar;
                if (ogkVar.aG == null || ogkVar.aG.c <= 0 || !(obj instanceof StaticLayoutView)) {
                    return;
                }
                ((StaticLayoutView) obj).setBoxShadow(ogkVar.aG.c, ogkVar.aG.f32034a, ogkVar.aG.b, a(ogkVar));
            }
        }

        private int a(ogk ogkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f7dbf458", new Object[]{this, ogkVar})).intValue();
            }
            return ogkVar.aG.e != 0 ? ogkVar.aG.e : ogkVar.s;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, Object[] objArr, ogl oglVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7423477b", new Object[]{this, fVar, objArr, oglVar, dVar});
            } else if (objArr == null || objArr.length <= 2 || !(objArr[1] instanceof com.taobao.tao.flexbox.layoutmanager.drawable.d) || !(oglVar instanceof ogk)) {
            } else {
                ogk ogkVar = (ogk) oglVar;
                if (ogkVar.aG == null || ogkVar.aG.c <= 0) {
                    return;
                }
                ((com.taobao.tao.flexbox.layoutmanager.drawable.d) objArr[1]).b(ogkVar.aG.c, ogkVar.aG.f32034a, ogkVar.aG.b, a(ogkVar));
            }
        }
    };

    static {
        kge.a(849646901);
        kge.a(-1371349407);
        kge.a(-1420926486);
    }

    public static /* synthetic */ Object ipc$super(TextComponent textComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2141646649:
                super.applyAttrForView((TextComponent) ((View) objArr[0]), (View) ((ogl) objArr[1]), (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -1791440821:
                return new Boolean(super.setComponentAlpha(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).floatValue(), (List) objArr[2]));
            case -1333693442:
                super.applyAttrForDrawable((TextComponent) ((Drawable) objArr[0]), (Drawable) ((ogl) objArr[1]), (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case 98971100:
                return new Boolean(super.canbeDrawable());
            case 505817802:
                return super.getAttributeHandler((String) objArr[0]);
            case 978512890:
                return super.getContentDescription();
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.r access$000(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.r) ipChange.ipc$dispatch("fdc55ed7", new Object[]{textComponent}) : textComponent.measureResult;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$100(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("768f6f2c", new Object[]{textComponent}) : textComponent.node;
    }

    public static /* synthetic */ ogl access$1000(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("87a0de32", new Object[]{textComponent}) : textComponent.viewParams;
    }

    public static /* synthetic */ ogl access$1100(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("c9b80b91", new Object[]{textComponent}) : textComponent.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.r access$1200(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.r) ipChange.ipc$dispatch("344c8d48", new Object[]{textComponent}) : textComponent.measureResult;
    }

    public static /* synthetic */ ogl access$1300(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("4de6664f", new Object[]{textComponent}) : textComponent.viewParams;
    }

    public static /* synthetic */ ogl access$1400(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("8ffd93ae", new Object[]{textComponent}) : textComponent.viewParams;
    }

    public static /* synthetic */ ogl access$1500(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("d214c10d", new Object[]{textComponent}) : textComponent.viewParams;
    }

    public static /* synthetic */ ogl access$1600(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("142bee6c", new Object[]{textComponent}) : textComponent.viewParams;
    }

    public static /* synthetic */ ogl access$1700(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("56431bcb", new Object[]{textComponent}) : textComponent.viewParams;
    }

    public static /* synthetic */ ogl access$1800(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("985a492a", new Object[]{textComponent}) : textComponent.viewParams;
    }

    public static /* synthetic */ ogl access$1900(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("da717689", new Object[]{textComponent}) : textComponent.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$200(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("32389d4b", new Object[]{textComponent}) : textComponent.node;
    }

    public static /* synthetic */ boolean access$300(TextComponent textComponent, float f, YogaMeasureMode yogaMeasureMode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d230ba0c", new Object[]{textComponent, new Float(f), yogaMeasureMode})).booleanValue() : textComponent.measureModeChanged(f, yogaMeasureMode);
    }

    public static /* synthetic */ float access$402(TextComponent textComponent, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26ea4cb9", new Object[]{textComponent, new Float(f)})).floatValue();
        }
        textComponent.metaWidth = f;
        return f;
    }

    public static /* synthetic */ ogl access$500(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("403d0dc", new Object[]{textComponent}) : textComponent.viewParams;
    }

    public static /* synthetic */ ogl access$600(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("461afe3b", new Object[]{textComponent}) : textComponent.viewParams;
    }

    public static /* synthetic */ ogl access$700(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("88322b9a", new Object[]{textComponent}) : textComponent.viewParams;
    }

    public static /* synthetic */ ogl access$800(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("ca4958f9", new Object[]{textComponent}) : textComponent.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.r access$900(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.r) ipChange.ipc$dispatch("4d0700e0", new Object[]{textComponent}) : textComponent.measureResult;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public com.taobao.tao.flexbox.layoutmanager.core.c getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.c) ipChange.ipc$dispatch("1e262aca", new Object[]{this, str});
        }
        if (oeb.a("enableOptTextAttr", true)) {
            if (TextUtils.equals(str, "color")) {
                return this.color;
            }
            if (TextUtils.equals(str, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_box_shadow)) {
                return this.boxshadow;
            }
        }
        return super.getAttributeHandler(str);
    }

    private boolean measureModeChanged(float f, YogaMeasureMode yogaMeasureMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("937b1292", new Object[]{this, new Float(f), yogaMeasureMode})).booleanValue();
        }
        com.taobao.tao.flexbox.layoutmanager.drawable.e eVar = this.textLayoutHelper;
        if (eVar == null) {
            return false;
        }
        return (eVar.c() == yogaMeasureMode && this.textLayoutHelper.d() == f) ? false : true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public ogk mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogk) ipChange.ipc$dispatch("36baa10c", new Object[]{this}) : new ogk();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.d
    public com.taobao.tao.flexbox.layoutmanager.drawable.d onCreateDrawable(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.drawable.d) ipChange.ipc$dispatch("c3ffb8bd", new Object[]{this, context}) : ogu.c();
    }

    public int getLineCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a7b394bf", new Object[]{this})).intValue() : this.lineCount;
    }

    public int getLineSpacing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ea7b9873", new Object[]{this})).intValue() : ((ogk) this.viewParams).o;
    }

    public void refreshText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1481572f", new Object[]{this});
            return;
        }
        if (ensureTextLayoutHelper(true)) {
            layoutText();
        }
        updateTextLayout();
    }

    public void updateTextLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeff98e7", new Object[]{this});
        } else if (this.view instanceof StaticLayoutView) {
            ((StaticLayoutView) this.view).setLayout(this.textLayoutHelper);
        } else if (this.drawable == null || this.drawable.length <= 1 || !(this.drawable[1] instanceof com.taobao.tao.flexbox.layoutmanager.drawable.d)) {
        } else {
            ((com.taobao.tao.flexbox.layoutmanager.drawable.d) this.drawable[1]).a(this.textLayoutHelper);
        }
    }

    public boolean ensureTextLayoutHelper(boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("483cfb6e", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        int i = -1;
        if (this.textLayoutHelper == null) {
            setupLayoutHelper((ogk) this.viewParams, (((ogk) this.viewParams).aa < 0 || ((ogk) this.viewParams).ab < 0) ? -1 : (this.measureResult.f20361a - ((ogk) this.viewParams).ag) - ((ogk) this.viewParams).ah);
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !isLayoutChanged(this.textLayoutHelper, (ogk) this.viewParams) && this.textLayoutHelper.m() != null) {
            return false;
        }
        if (!z2) {
            if (((ogk) this.viewParams).aa >= 0 && ((ogk) this.viewParams).ab >= 0) {
                i = (this.measureResult.f20361a - ((ogk) this.viewParams).ag) - ((ogk) this.viewParams).ah;
            }
            setupLayoutHelper((ogk) this.viewParams, i);
        }
        this.textLayoutHelper.a(YogaMeasureMode.EXACTLY, this.node.G().f20361a);
        return true;
    }

    public void layoutText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e0007e", new Object[]{this});
        } else {
            this.textLayoutHelper.a(((ogk) this.viewParams).y);
        }
    }

    public void setFontSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec360be7", new Object[]{this, new Float(f)});
        } else {
            this.textLayoutHelper.a((float) (f * this.node.k().b()));
        }
    }

    private boolean isLayoutChanged(com.taobao.tao.flexbox.layoutmanager.drawable.e eVar, ogk ogkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bfa4559e", new Object[]{this, eVar, ogkVar})).booleanValue() : !textEquals(eVar.j(), ogkVar.y) || ogkVar.n != eVar.h() || !(ogkVar.s == 1 || ogkVar.s == eVar.g()) || ogkVar.m != eVar.k() || eVar.l() == null || !eVar.l().equals(ogkVar.E);
    }

    private boolean textEquals(CharSequence charSequence, CharSequence charSequence2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("207c651f", new Object[]{this, charSequence, charSequence2})).booleanValue();
        }
        if (TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(charSequence2)) {
            return true;
        }
        return TextUtils.equals(charSequence, charSequence2);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.d
    public void applyAttrForDrawable(com.taobao.tao.flexbox.layoutmanager.drawable.d dVar, ogk ogkVar, Map map, boolean z) {
        r.a[] aVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54861dc2", new Object[]{this, dVar, ogkVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForDrawable((TextComponent) dVar, (com.taobao.tao.flexbox.layoutmanager.drawable.d) ogkVar, map, z);
        dVar.setBounds(0, 0, this.measureResult.f20361a, this.measureResult.b);
        dVar.a(ogkVar.ag, ogkVar.ai, ogkVar.ah, ogkVar.aj);
        dVar.a(ogkVar.n);
        if (ensureTextLayoutHelper(false)) {
            layoutText();
        }
        dVar.a(this.textLayoutHelper);
        if ((this instanceof r) && (ogkVar.y instanceof Spanned) && (aVarArr = (r.a[]) ((Spanned) ogkVar.y).getSpans(0, ogkVar.y.length(), r.a.class)) != null) {
            for (r.a aVar : aVarArr) {
                aVar.a(dVar);
            }
        }
        this.lineCount = dVar.b();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void applyAttrForView(View view, ogk ogkVar, Map map, boolean z) {
        com.taobao.tao.flexbox.layoutmanager.drawable.e eVar;
        r.a[] aVarArr;
        TextView textView;
        int selectionStart;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b73a68", new Object[]{this, view, ogkVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView((TextComponent) view, (View) ogkVar, map, z);
        boolean z2 = view instanceof TextView;
        if (z2) {
            TextView textView2 = (TextView) view;
            if (ogkVar.m > 0.0f) {
                textView2.setTextSize(0, ogkVar.m);
            }
            if (ogkVar.s != 1) {
                textView2.setTextColor(ogkVar.s);
            }
            textView2.setGravity(ogkVar.n);
            if (ogkVar.p && !ogkVar.z) {
                textView2.setTypeface(Typeface.DEFAULT_BOLD);
            }
            if (ogkVar.v != null) {
                textView2.setEllipsize(ogkVar.v);
            }
            if (ogkVar.u != Integer.MAX_VALUE) {
                textView2.setMaxLines(ogkVar.u);
            }
            if (ogkVar.o > 0) {
                textView2.setLineSpacing(ogkVar.o, 1.0f);
            }
            textView2.setTypeface(ogkVar.E, ogkVar.r);
            if (ogkVar.t != 1) {
                textView2.setHintTextColor(ogkVar.t);
            }
        }
        if (ogkVar.y != null) {
            if (z2) {
                if (!oeb.a("enableFixInputIme", true) || ((TextView) view).getText() != ogkVar.y) {
                    ((TextView) view).setText(ogkVar.y);
                }
                if ((view instanceof EditText) && (selectionStart = (textView = (TextView) view).getSelectionStart()) == textView.getSelectionEnd()) {
                    ((EditText) view).setSelection(Math.min(selectionStart, ogkVar.y.length()));
                }
            } else if (considerLayoutAnimation() && (eVar = this.textLayoutHelper) != null && eVar.k() != ogkVar.m && TextUtils.equals(this.textLayoutHelper.j(), ogkVar.y)) {
                Animator a2 = oel.a(this, this.textLayoutHelper.k(), ogkVar.m);
                a2.setDuration(150L);
                a2.start();
            } else {
                if (ensureTextLayoutHelper(false)) {
                    layoutText();
                }
                StaticLayoutView staticLayoutView = (StaticLayoutView) view;
                staticLayoutView.setTextAlign(ogkVar.n);
                staticLayoutView.setLayout(this.textLayoutHelper);
            }
            if ((this instanceof r) && (ogkVar.y instanceof Spanned) && (aVarArr = (r.a[]) ((Spanned) ogkVar.y).getSpans(0, ogkVar.y.length(), r.a.class)) != null) {
                for (r.a aVar : aVarArr) {
                    aVar.a(view);
                }
            }
        }
        if (z2) {
            this.lineCount = ((TextView) view).getLineCount();
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.drawable.e eVar2 = this.textLayoutHelper;
        if (eVar2 != null) {
            this.lineCount = eVar2.f();
        } else {
            this.lineCount = 0;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        StaticLayoutView d = ogu.d(context);
        d.enableNewMarquee(false, null);
        d.setScrollAmount(ohd.a(this.node, context, oec.b(this.node.e("scrollamount"), 6)));
        d.setMarqueeScrollGap(ohd.a(this.node, context, oec.a(this.node.e("scrollgap"), 0)));
        d.setLoopCount(oec.a(this.node.e("loop"), -1));
        d.setLoopDelay(oec.a(this.node.e("delay"), 0));
        d.setDirection(oec.a(this.node.e("direction"), "left"));
        return d;
    }

    public void setupLayoutHelper(ogk ogkVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("256a158a", new Object[]{this, ogkVar, new Integer(i)});
            return;
        }
        if (this.textLayoutHelper == null) {
            this.textLayoutHelper = new com.taobao.tao.flexbox.layoutmanager.drawable.e(this);
        }
        if (oeb.aC()) {
            this.textLayoutHelper.a(ogkVar.F, ogkVar.G, ogkVar.m, i, this.measureResult != null ? this.measureResult.b : -1);
        } else if (ogkVar.m > 0.0f) {
            setFontSize(ogkVar.m);
        }
        if (ogkVar.aG != null && ogkVar.aG.c > 0) {
            int i2 = ogkVar.s;
            if (ogkVar.aG.e != 0) {
                i2 = ogkVar.aG.e;
            }
            this.textLayoutHelper.a(ogkVar.aG.c, ogkVar.aG.f32034a, ogkVar.aG.b, i2);
        }
        this.textLayoutHelper.d(ogkVar.u);
        this.textLayoutHelper.c(ogkVar.o);
        this.textLayoutHelper.f(ogkVar.n);
        this.textLayoutHelper.a(ogkVar.v);
        this.textLayoutHelper.a(!((ogk) this.viewParams).z);
        this.textLayoutHelper.a(((ogk) this.viewParams).E, ((ogk) this.viewParams).r);
        if (isDrawable()) {
            this.textLayoutHelper.b((int) (ogkVar.aT * 255.0f));
        }
        if (ogkVar.s != 1) {
            this.textLayoutHelper.e(ogkVar.s);
        }
        this.textLayoutHelper.a(((ogk) this.viewParams).A);
        this.textLayoutHelper.a(i);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public YogaMeasureFunction onCreateMeasureFunction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (YogaMeasureFunction) ipChange.ipc$dispatch("622da8f1", new Object[]{this}) : this.measureFunction;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.d, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        com.taobao.tao.flexbox.layoutmanager.drawable.e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.view != 0) {
            if (this.view instanceof StaticLayoutView) {
                ogu.a((StaticLayoutView) this.view);
            } else if (this.view instanceof TextView) {
                ogu.a((TextView) this.view);
                ((TextView) this.view).setMovementMethod(null);
            }
        }
        if (z && (eVar = this.textLayoutHelper) != null) {
            eVar.u();
            this.textLayoutHelper = null;
        }
        super.detach(z);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public CharSequence getContentDescription() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("3a52ebfa", new Object[]{this});
        }
        CharSequence contentDescription = super.getContentDescription();
        return contentDescription == null ? ((ogk) this.viewParams).y : contentDescription;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.d
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        if (!this.node.k().o()) {
            return super.canbeDrawable();
        }
        return false;
    }

    public void elementSetText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b09a7464", new Object[]{this, str});
            return;
        }
        if (this.node != null) {
            this.node.a("text", str);
            ((ogk) this.viewParams).y = str;
        }
        if (this.view instanceof TextView) {
            ((TextView) this.view).setText(str);
            if (!(this.view instanceof EditText) || str == null) {
                return;
            }
            ((EditText) this.view).setSelection(str.length());
        } else if (!(this.view instanceof StaticLayoutView)) {
        } else {
            ((StaticLayoutView) this.view).setText(str);
        }
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else if (this.textLayoutHelper == null) {
        } else {
            this.node.a("text", str);
            com.taobao.tao.flexbox.layoutmanager.core.aa L = this.node.L();
            L.l();
            L.b(this.view.getContext());
        }
    }

    public String getText() {
        CharSequence j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        com.taobao.tao.flexbox.layoutmanager.drawable.e eVar = this.textLayoutHelper;
        if (eVar != null && (j = eVar.j()) != null) {
            return j.toString();
        }
        return null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.d, com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean setComponentAlpha(boolean z, float f, List<com.taobao.tao.flexbox.layoutmanager.core.aa> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9538c84b", new Object[]{this, new Boolean(z), new Float(f), list})).booleanValue();
        }
        boolean componentAlpha = super.setComponentAlpha(z, f, list);
        if (componentAlpha && this.view != 0) {
            V v = this.view;
            if (!z) {
                f *= ((ogk) this.viewParams).aT;
            }
            v.setAlpha(f);
        }
        return componentAlpha;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        String str = eVar.c;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -552345454) {
            if (hashCode == 2122668806 && str.equals("onwillappear")) {
                c = 0;
            }
        } else if (str.equals("onwilldisappear")) {
            c = 1;
        }
        if (c == 0) {
            if (this.view instanceof StaticLayoutView) {
                ((StaticLayoutView) this.view).startMarquee();
            }
        } else if (c == 1 && (this.view instanceof StaticLayoutView)) {
            ((StaticLayoutView) this.view).stopMarquee();
        }
        return false;
    }
}
