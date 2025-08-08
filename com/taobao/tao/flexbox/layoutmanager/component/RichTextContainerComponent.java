package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaMeasureMode;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.component.r;
import java.util.HashMap;
import tb.kge;
import tb.odx;
import tb.oec;
import tb.oft;
import tb.ofu;
import tb.ogj;
import tb.ogk;
import tb.ogl;
import tb.ogm;
import tb.ogn;
import tb.ogu;
import tb.ogw;

/* loaded from: classes8.dex */
public class RichTextContainerComponent extends TextComponent implements r, com.taobao.tao.flexbox.layoutmanager.core.g, ogn.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.tao.flexbox.layoutmanager.core.aa ellipsizeNode;
    private boolean hasClickEventHandler;
    private boolean hasEllipsize;
    private boolean showEllipsize;

    static {
        kge.a(766094016);
        kge.a(328095190);
        kge.a(688678286);
        kge.a(941553152);
    }

    public static /* synthetic */ Object ipc$super(RichTextContainerComponent richTextContainerComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -5587276) {
            if (hashCode != 98971100) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.canbeDrawable());
        }
        return new Boolean(super.needUpdateViewParam());
    }

    public static /* synthetic */ void access$000(RichTextContainerComponent richTextContainerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df31679c", new Object[]{richTextContainerComponent, aaVar, str});
        } else {
            richTextContainerComponent.handleSpanClick(aaVar, str);
        }
    }

    public static /* synthetic */ void access$100(RichTextContainerComponent richTextContainerComponent, SpannableString spannableString, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Drawable drawable, ogj ogjVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7184195", new Object[]{richTextContainerComponent, spannableString, aaVar, drawable, ogjVar, new Integer(i), new Integer(i2)});
        } else {
            richTextContainerComponent.setupImageSpan(spannableString, aaVar, drawable, ogjVar, i, i2);
        }
    }

    public static /* synthetic */ void access$1000(RichTextContainerComponent richTextContainerComponent, ogn ognVar, ogl oglVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939126d1", new Object[]{richTextContainerComponent, ognVar, oglVar});
        } else {
            richTextContainerComponent.setupBackgroundSpan(ognVar, oglVar);
        }
    }

    public static /* synthetic */ ogl access$1300(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("262b8ba", new Object[]{richTextContainerComponent}) : richTextContainerComponent.viewParams;
    }

    public static /* synthetic */ ogl access$1400(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("eb6a7dbb", new Object[]{richTextContainerComponent}) : richTextContainerComponent.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.r access$1500(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.r) ipChange.ipc$dispatch("9adff2fc", new Object[]{richTextContainerComponent}) : richTextContainerComponent.measureResult;
    }

    public static /* synthetic */ ogl access$1600(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("bd7a07bd", new Object[]{richTextContainerComponent}) : richTextContainerComponent.viewParams;
    }

    public static /* synthetic */ ogl access$1700(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("a681ccbe", new Object[]{richTextContainerComponent}) : richTextContainerComponent.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$1800(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("1a45264b", new Object[]{richTextContainerComponent}) : richTextContainerComponent.node;
    }

    public static /* synthetic */ boolean access$202(RichTextContainerComponent richTextContainerComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e74d1b2", new Object[]{richTextContainerComponent, new Boolean(z)})).booleanValue();
        }
        richTextContainerComponent.hasClickEventHandler = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("544a3c4b", new Object[]{richTextContainerComponent})).booleanValue() : richTextContainerComponent.hasEllipsize;
    }

    public static /* synthetic */ boolean access$302(RichTextContainerComponent richTextContainerComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5f0ab73", new Object[]{richTextContainerComponent, new Boolean(z)})).booleanValue();
        }
        richTextContainerComponent.hasEllipsize = z;
        return z;
    }

    public static /* synthetic */ boolean access$402(RichTextContainerComponent richTextContainerComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d6c8534", new Object[]{richTextContainerComponent, new Boolean(z)})).booleanValue();
        }
        richTextContainerComponent.showEllipsize = z;
        return z;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$500(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("d1ff9559", new Object[]{richTextContainerComponent}) : richTextContainerComponent.ellipsizeNode;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$502(RichTextContainerComponent richTextContainerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("6a22fab3", new Object[]{richTextContainerComponent, aaVar});
        }
        richTextContainerComponent.ellipsizeNode = aaVar;
        return aaVar;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$600(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("450c919a", new Object[]{richTextContainerComponent}) : richTextContainerComponent.node;
    }

    public static /* synthetic */ void access$700(RichTextContainerComponent richTextContainerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261b520", new Object[]{richTextContainerComponent, aaVar, sb});
        } else {
            richTextContainerComponent.buildRichTextString(aaVar, sb);
        }
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$800(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("2b268a1c", new Object[]{richTextContainerComponent}) : richTextContainerComponent.node;
    }

    public static /* synthetic */ void access$900(RichTextContainerComponent richTextContainerComponent, SpannableString spannableString, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da20b38", new Object[]{richTextContainerComponent, spannableString, aaVar, new Integer(i)});
        } else {
            richTextContainerComponent.applyStyleForSpannableString(spannableString, aaVar, i);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : ogu.d(context);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.d
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue() : super.canbeDrawable() && !this.hasClickEventHandler && !this.hasEllipsize;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean needUpdateViewParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ffaabeb4", new Object[]{this})).booleanValue() : super.needUpdateViewParam() || this.node.s();
    }

    private void buildRichTextString(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, StringBuilder sb) {
        String Z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cf4034", new Object[]{this, aaVar, sb});
            return;
        }
        if (aaVar != this.node && (Z = aaVar.Z()) != null) {
            sb.append(Z);
        }
        for (com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2 : aaVar.d) {
            if (!aaVar2.K().equals("ellipsize")) {
                buildRichTextString(aaVar2, sb);
            } else {
                this.hasEllipsize = true;
                this.ellipsizeNode = aaVar2;
                aaVar2.Z();
            }
        }
    }

    private void applyStyleForSpannableString(SpannableString spannableString, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4986a4e9", new Object[]{this, spannableString, aaVar, new Integer(i)});
            return;
        }
        if (aaVar != this.node) {
            getSpannableString(aaVar, spannableString, i, aaVar.Y() + i);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < aaVar.d.size()) {
            if (!aaVar.d.get(i2).K().equals("ellipsize")) {
                i3 += i2 == 0 ? 0 : aaVar.d.get(i2 - 1).Y();
                applyStyleForSpannableString(spannableString, aaVar.d.get(i2), i + i3);
            }
            i2++;
        }
    }

    private void parseDivSpannable(SpannableString spannableString, ogl oglVar, final com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("675629ad", new Object[]{this, spannableString, oglVar, aaVar, new Integer(i), new Integer(i2)});
            return;
        }
        Drawable a2 = com.taobao.tao.flexbox.layoutmanager.drawable.b.a((Drawable) null, oglVar);
        if (a2 != null) {
            ogn ognVar = new ogn(this, a2, 0);
            setupBackgroundSpan(ognVar, oglVar);
            spannableString.setSpan(ognVar, i, i2, 33);
        }
        if (oglVar.aF != 1) {
            spannableString.setSpan(new ForegroundColorSpan(oglVar.aF), i, i2, 33);
        }
        final String str = (String) aaVar.e("onclick");
        if (StringUtils.isEmpty(str)) {
            return;
        }
        this.hasClickEventHandler = true;
        spannableString.setSpan(new ClickableSpan() { // from class: com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    RichTextContainerComponent.access$000(RichTextContainerComponent.this, aaVar, str);
                }
            }
        }, i, i2, 33);
    }

    private void parseImageSpannable(final SpannableString spannableString, final ogj ogjVar, final com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, final int i, final int i2) {
        final boolean[] zArr;
        int i3;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c774325", new Object[]{this, spannableString, ogjVar, aaVar, new Integer(i), new Integer(i2)});
            return;
        }
        int i6 = ogjVar.aa >= 0 ? ogjVar.aa : 0;
        int i7 = ogjVar.ab >= 0 ? ogjVar.ab : 0;
        boolean[] zArr2 = {false};
        if (ogjVar.e != null) {
            final int i8 = i6;
            final int i9 = i7;
            zArr = zArr2;
            i3 = i7;
            i4 = i6;
            ogw.a(null, this.node.k(), ogjVar.e, i4, i3, ImageLoader.a.a(), null, false, new ogw.a() { // from class: com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ogw.a
                public void a(Object obj, Drawable drawable) {
                    int i10;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91476368", new Object[]{this, obj, drawable});
                        return;
                    }
                    int i11 = i8;
                    if (i11 > 0 && (i10 = i9) > 0) {
                        drawable.setBounds(0, 0, i11, i10);
                    }
                    RichTextContainerComponent.access$100(RichTextContainerComponent.this, spannableString, aaVar, drawable, ogjVar, i, i2);
                    zArr[0] = true;
                    if (!(ogjVar.e instanceof String)) {
                        return;
                    }
                    oec.a(aaVar, true, (String) ogjVar.e, (String) ogjVar.e, drawable);
                }

                @Override // tb.ogw.a
                public void a(Object obj, int i10) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1e7da93f", new Object[]{this, obj, new Integer(i10)});
                    } else if (!(ogjVar.e instanceof String)) {
                    } else {
                        oec.a(aaVar, false, (String) ogjVar.e, (String) ogjVar.e, null);
                    }
                }
            });
        } else {
            zArr = zArr2;
            i3 = i7;
            i4 = i6;
            z = false;
        }
        if (!z) {
            return;
        }
        ColorDrawable colorDrawable = new ColorDrawable(placeHolder);
        if (zArr[0]) {
            return;
        }
        int i10 = i4;
        if (i10 > 0 && (i5 = i3) > 0) {
            colorDrawable.setBounds(0, 0, i10, i5);
        } else {
            colorDrawable.setBounds(0, 0, colorDrawable.getIntrinsicWidth(), colorDrawable.getIntrinsicHeight());
        }
        setupImageSpan(spannableString, aaVar, colorDrawable, ogjVar, i, i2);
    }

    private void setupImageSpan(SpannableString spannableString, final com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Drawable drawable, ogj ogjVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7759b7db", new Object[]{this, spannableString, aaVar, drawable, ogjVar, new Integer(i), new Integer(i2)});
            return;
        }
        ogm ogmVar = new ogm(drawable, 0, 0);
        ogmVar.b(ogjVar.ak);
        ogmVar.d(ogjVar.al);
        ogmVar.a(ogjVar.aJ);
        ogmVar.a(ogjVar.l);
        if (ogjVar.aa >= 0) {
            ogmVar.f(ogjVar.aa);
        }
        if (ogjVar.ab >= 0) {
            ogmVar.g(ogjVar.ab);
        }
        if (getViewParams() != 0) {
            ogmVar.e(((ogk) getViewParams()).o);
        }
        if (ogjVar.aK > 0 || ogjVar.aL > 0 || ogjVar.aM > 0 || ogjVar.aN > 0) {
            ogmVar.a(new float[]{ogjVar.aK, ogjVar.aK, ogjVar.aL, ogjVar.aL, ogjVar.aN, ogjVar.aN, ogjVar.aM, ogjVar.aM});
        }
        ogmVar.c(ogjVar.aO);
        String str = (String) aaVar.e(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_vertical_align);
        if (str != null) {
            ogmVar.a(odx.k(str));
        }
        final String str2 = (String) aaVar.e("onclick");
        synchronized (spannableString) {
            if (!StringUtils.isEmpty(str2)) {
                this.hasClickEventHandler = true;
                spannableString.setSpan(new ClickableSpan() { // from class: com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            RichTextContainerComponent.access$000(RichTextContainerComponent.this, aaVar, str2);
                        }
                    }
                }, i, i2, 33);
            }
            spannableString.setSpan(ogmVar, i, i2, 33);
        }
    }

    private void parseTextSpannable(SpannableString spannableString, ogk ogkVar, final com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d07a6c", new Object[]{this, spannableString, ogkVar, aaVar, new Integer(i), new Integer(i2)});
            return;
        }
        final int i3 = ogkVar.s != 1 ? ogkVar.s : 0;
        if (hasBackgroundDrawable(ogkVar)) {
            ogn ognVar = new ogn(this, com.taobao.tao.flexbox.layoutmanager.drawable.b.a((Drawable) null, ogkVar), 0);
            setupBackgroundSpan(ognVar, ogkVar);
            spannableString.setSpan(ognVar, i, i2, 33);
        } else {
            if (ogkVar.ak > 0 || ogkVar.al > 0) {
                ogn ognVar2 = new ogn(this, ogu.a(0), 0);
                setupBackgroundSpan(ognVar2, ogkVar);
                spannableString.setSpan(ognVar2, i, i2, 33);
            } else if (i3 != 0) {
                spannableString.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            }
            if (ogkVar.p) {
                spannableString.setSpan(new StyleSpan(1), i, i2, 33);
            }
        }
        if (ogkVar.m > 0.0f) {
            int b2 = (int) (ogkVar.m * this.node.k().b());
            spannableString.setSpan(new AbsoluteSizeSpan(b2), i, i2, 33);
            if (getViewParams() != 0) {
                float f = b2;
                if (f > ((ogk) getViewParams()).m) {
                    ((ogk) getViewParams()).m = f;
                }
            }
        }
        if (ogkVar.A != null) {
            ogn[] ognVarArr = (ogn[]) spannableString.getSpans(i, i2, ogn.class);
            if (ognVarArr != null && ognVarArr.length > 0) {
                for (ogn ognVar3 : ognVarArr) {
                    ognVar3.a(ogkVar.A);
                }
            } else if ("line-through".equals(ogkVar.A)) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            } else if ("underline".equals(ogkVar.A)) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
        }
        final String str = (String) aaVar.e("onclick");
        if (StringUtils.isEmpty(str)) {
            return;
        }
        this.hasClickEventHandler = true;
        spannableString.setSpan(new ClickableSpan() { // from class: com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    RichTextContainerComponent.access$000(RichTextContainerComponent.this, aaVar, str);
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                    return;
                }
                textPaint.setColor(i3);
                textPaint.setUnderlineText(false);
            }
        }, i, i2, 33);
    }

    private SpannableString getSpannableString(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, SpannableString spannableString, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("6ff9998e", new Object[]{this, aaVar, spannableString, new Integer(i), new Integer(i2)});
        }
        String K = aaVar.K();
        if (K.equals("text")) {
            parseTextSpannable(spannableString, (ogk) aaVar.I().getViewParams(), aaVar, i, i2);
        } else if (K.equals("image")) {
            parseImageSpannable(spannableString, (ogj) aaVar.I().getViewParams(), aaVar, i, i2);
            r.a aVar = new r.a();
            if (this.view != 0) {
                aVar.a(this.view);
            }
            spannableString.setSpan(aVar, i, i2, 33);
        } else if (K.equals("div")) {
            parseDivSpannable(spannableString, aaVar.I().getViewParams(), aaVar, i, i2);
        }
        return spannableString;
    }

    private void handleSpanClick(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82dd564f", new Object[]{this, aaVar, str});
            return;
        }
        removePerformClickCallback();
        sendMessage(aaVar, "onclick", str, clickArgs(), null);
        sendMessage(aaVar, "click", null, null, null);
    }

    private void setupBackgroundSpan(ogn ognVar, ogl oglVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceda22f2", new Object[]{this, ognVar, oglVar});
            return;
        }
        boolean z = oglVar instanceof ogk;
        if (z) {
            ogk ogkVar = (ogk) oglVar;
            if (ogkVar.s != 1) {
                i = ogkVar.s;
            }
        }
        if (oglVar.aa >= 0) {
            ognVar.f(oglVar.aa);
        }
        if (oglVar.ab >= 0) {
            ognVar.g(oglVar.ab);
        }
        ognVar.a(i);
        ognVar.d(oglVar.ag);
        ognVar.b(oglVar.ai);
        ognVar.e(oglVar.ah);
        ognVar.c(oglVar.aj);
        ognVar.h(oglVar.ak);
        ognVar.i(oglVar.al);
        if (z && ((ogk) oglVar).p) {
            ognVar.a(true);
        }
        ognVar.j(oglVar.aO);
    }

    private boolean hasBackgroundDrawable(ogl oglVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7b57b10d", new Object[]{this, oglVar})).booleanValue() : (oglVar.aE == 1 && oglVar.aF == 1 && oglVar.aP == 1 && oglVar.aO <= 0 && oglVar.aJ <= 0 && oglVar.aH == null) ? false : true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public HashMap clickArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("16a46aef", new Object[]{this});
        }
        if (!this.hasEllipsize) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("showEllipsize", Boolean.valueOf(this.showEllipsize));
        return hashMap;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public ogk mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogk) ipChange.ipc$dispatch("36baa10c", new Object[]{this}) : new d();
    }

    /* loaded from: classes8.dex */
    public class d extends ogk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1768094232);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -1185345197) {
                super.a((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public d() {
        }

        @Override // tb.ogk, tb.ogl
        public void a(Context context, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9591153", new Object[]{this, context, hashMap});
                return;
            }
            super.a(context, hashMap);
            this.y = a((String) null);
        }

        @Override // tb.ogk
        public CharSequence a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("2d0b4348", new Object[]{this, str});
            }
            RichTextContainerComponent.access$202(RichTextContainerComponent.this, false);
            RichTextContainerComponent.access$302(RichTextContainerComponent.this, false);
            RichTextContainerComponent.access$402(RichTextContainerComponent.this, false);
            RichTextContainerComponent.access$502(RichTextContainerComponent.this, null);
            StringBuilder sb = new StringBuilder();
            RichTextContainerComponent richTextContainerComponent = RichTextContainerComponent.this;
            RichTextContainerComponent.access$700(richTextContainerComponent, RichTextContainerComponent.access$600(richTextContainerComponent), sb);
            SpannableString spannableString = new SpannableString(sb.toString());
            RichTextContainerComponent richTextContainerComponent2 = RichTextContainerComponent.this;
            RichTextContainerComponent.access$900(richTextContainerComponent2, spannableString, RichTextContainerComponent.access$800(richTextContainerComponent2), 0);
            if (RichTextContainerComponent.access$300(RichTextContainerComponent.this)) {
                ofu ofuVar = new ofu(spannableString);
                ogk ogkVar = (ogk) RichTextContainerComponent.access$500(RichTextContainerComponent.this).I().getViewParams();
                Drawable a2 = com.taobao.tao.flexbox.layoutmanager.drawable.b.a((Drawable) null, ogkVar);
                if (a2 == null) {
                    a2 = ogu.a(0);
                }
                if (RichTextContainerComponent.access$500(RichTextContainerComponent.this).d.size() == 0 && RichTextContainerComponent.access$500(RichTextContainerComponent.this).e("text") != null) {
                    if (ogkVar.y != null) {
                        b bVar = new b(ogkVar.y, a2);
                        RichTextContainerComponent.access$1000(RichTextContainerComponent.this, bVar, ogkVar);
                        ofuVar.a(bVar);
                        return ofuVar;
                    }
                } else {
                    RichTextContainerComponent richTextContainerComponent3 = RichTextContainerComponent.this;
                    a aVar = new a(RichTextContainerComponent.access$500(richTextContainerComponent3), a2);
                    RichTextContainerComponent.access$1000(RichTextContainerComponent.this, aVar, ogkVar);
                    if (a.a(aVar)) {
                        if (a(spannableString)) {
                            c cVar = new c(spannableString);
                            cVar.append((CharSequence) "\n");
                            cVar.append((CharSequence) a.b(aVar));
                            cVar.a(aVar);
                            a.b(aVar).setSpan(aVar, 0, a.b(aVar).length(), 33);
                            return cVar;
                        }
                        ofuVar.a(aVar);
                        return ofuVar;
                    }
                    ofuVar.a(aVar);
                    return ofuVar;
                }
            }
            return spannableString;
        }

        private boolean a(SpannableString spannableString) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8d4745ae", new Object[]{this, spannableString})).booleanValue();
            }
            if (this.u == Integer.MAX_VALUE) {
                return true;
            }
            com.taobao.tao.flexbox.layoutmanager.drawable.e eVar = new com.taobao.tao.flexbox.layoutmanager.drawable.e();
            if (this.aa > 0) {
                eVar.a((this.aa - ((ogk) RichTextContainerComponent.access$1300(RichTextContainerComponent.this)).ag) - ((ogk) RichTextContainerComponent.access$1400(RichTextContainerComponent.this)).ah);
            } else {
                eVar.a(-1);
            }
            eVar.a(YogaMeasureMode.EXACTLY, (RichTextContainerComponent.access$1500(RichTextContainerComponent.this).f20361a - ((ogk) RichTextContainerComponent.access$1600(RichTextContainerComponent.this)).ag) - ((ogk) RichTextContainerComponent.access$1700(RichTextContainerComponent.this)).ah);
            eVar.d(this.u);
            eVar.a(spannableString);
            return eVar.m().getLineCount() <= this.u;
        }
    }

    /* loaded from: classes8.dex */
    public class a extends ogn implements oft.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private com.taobao.tao.flexbox.layoutmanager.core.aa b;
        private SpannableString c;
        private com.taobao.tao.flexbox.layoutmanager.drawable.e d;
        private boolean e;

        static {
            kge.a(1240906377);
            kge.a(2044950337);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2acd1640", new Object[]{aVar})).booleanValue() : aVar.e;
        }

        public static /* synthetic */ SpannableString b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SpannableString) ipChange.ipc$dispatch("9c8d8d1d", new Object[]{aVar}) : aVar.c;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.e;
        }

        public a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Drawable drawable) {
            super(RichTextContainerComponent.this, drawable, 0);
            this.b = aaVar;
            this.b.l();
            this.e = oec.a(this.b.e(AbsListWidgetInstance.KEY_SECTION_EXPAND), false);
            StringBuilder sb = new StringBuilder();
            RichTextContainerComponent.access$700(RichTextContainerComponent.this, aaVar, sb);
            this.c = new SpannableString(sb.toString());
            RichTextContainerComponent.access$900(RichTextContainerComponent.this, this.c, aaVar, 0);
            if (this.e) {
                this.c.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE), 0, 1, 33);
            }
            this.d = new com.taobao.tao.flexbox.layoutmanager.drawable.e();
            ogl viewParams = this.b.I().getViewParams();
            if (viewParams != null) {
                if (viewParams.aa > 0) {
                    this.d.a((this.b.G().f20361a - viewParams.ag) - viewParams.ah);
                } else {
                    this.d.a(-1);
                }
                this.d.a(YogaMeasureMode.EXACTLY, (this.b.G().f20361a - viewParams.ag) - viewParams.ah);
            }
            this.d.a(this.c);
        }

        public SpannableString b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SpannableString) ipChange.ipc$dispatch("27db9c4f", new Object[]{this}) : this.c;
        }

        @Override // tb.ogn
        public void a(Canvas canvas, CharSequence charSequence, int i, int i2, int i3, int i4, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("988534f6", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), paint});
                return;
            }
            RichTextContainerComponent.access$402(RichTextContainerComponent.this, true);
            canvas.translate(i3, i4);
            this.d.a(canvas);
        }

        @Override // tb.ogn
        public int a(int i, int i2, int i3, int i4, int i5, Paint paint) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4a84dde3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), paint})).intValue() : (i2 + ((i4 - i2) / 2)) - (a(paint) / 2);
        }

        @Override // tb.ogn
        public int a(Paint paint, CharSequence charSequence, int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1e401634", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2)})).intValue() : this.d.m().getWidth();
        }

        @Override // tb.ogn
        public int a(Paint paint) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2b8e3c70", new Object[]{this, paint})).intValue() : this.d.m().getHeight();
        }

        @Override // tb.oft.a
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            } else {
                a(RichTextContainerComponent.access$500(RichTextContainerComponent.this));
            }
        }

        private void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("691d3050", new Object[]{this, aaVar});
            } else if (aaVar != null) {
                RichTextContainerComponent.access$000(RichTextContainerComponent.this, aaVar, (String) aaVar.e("onclick"));
                for (int i = 0; i < aaVar.d.size(); i++) {
                    a(aaVar.d.get(i));
                }
            }
        }
    }

    /* loaded from: classes8.dex */
    public class b extends ogn implements oft.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f20031a;
        public int b;
        public int c;
        public boolean d;

        static {
            kge.a(159480947);
            kge.a(2044950337);
        }

        public b(CharSequence charSequence, Drawable drawable) {
            super(RichTextContainerComponent.this, drawable, 0);
            this.f20031a = charSequence;
        }

        @Override // tb.ogn
        public String a(CharSequence charSequence, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("233233b4", new Object[]{this, charSequence, new Integer(i), new Integer(i2)});
            }
            if (!this.d) {
                this.b = i;
                this.c = i2;
                this.d = true;
            }
            RichTextContainerComponent.access$402(RichTextContainerComponent.this, true);
            return (i == this.b && i2 == this.c) ? this.f20031a.toString() : "";
        }

        @Override // tb.ogn
        public int a(Paint paint, CharSequence charSequence, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1e401634", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2)})).intValue();
            }
            float textSize = paint.getTextSize();
            paint.setTextSize((float) (((ogk) RichTextContainerComponent.access$500(RichTextContainerComponent.this).I().getViewParams()).m * RichTextContainerComponent.access$1800(RichTextContainerComponent.this).k().b()));
            int round = Math.round(paint.measureText(this.f20031a.toString()));
            paint.setTextSize(textSize);
            return round;
        }

        @Override // tb.oft.a
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                return;
            }
            RichTextContainerComponent richTextContainerComponent = RichTextContainerComponent.this;
            RichTextContainerComponent.access$000(richTextContainerComponent, RichTextContainerComponent.access$500(richTextContainerComponent), (String) RichTextContainerComponent.access$500(RichTextContainerComponent.this).e("onclick"));
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !StringUtils.isEmpty((String) RichTextContainerComponent.access$500(RichTextContainerComponent.this).e("onclick"));
        }
    }

    /* loaded from: classes8.dex */
    public static class c extends SpannableStringBuilder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private a f20032a;

        static {
            kge.a(-1626911211);
        }

        public c(CharSequence charSequence) {
            super(charSequence);
        }

        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2acd163c", new Object[]{this, aVar});
            } else {
                this.f20032a = aVar;
            }
        }

        public a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1ff2cfbc", new Object[]{this}) : this.f20032a;
        }
    }
}
