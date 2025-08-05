package com.taobao.android.litecreator.sdk.editor;

import android.text.TextUtils;
import com.alibaba.marvel.Const;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.java.ResourceInspector;
import com.alibaba.marvel.java.TextType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Paster;
import com.taobao.android.litecreator.sdk.editor.data.PasterChildNode;
import com.taobao.android.litecreator.sdk.editor.data.Transform;
import com.taobao.android.litecreator.sdk.editor.data.a;
import com.taobao.android.litecreator.util.at;
import java.util.ArrayList;
import java.util.List;
import tb.hek;
import tb.hff;
import tb.kge;
import tb.mto;

/* loaded from: classes5.dex */
public abstract class an extends a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private hek f13404a;
    private boolean b = com.taobao.android.litecreator.util.s.l();

    static {
        kge.a(-474772082);
    }

    public static /* synthetic */ Object ipc$super(an anVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract long a();

    public an(hek hekVar) {
        this.f13404a = hekVar;
    }

    private String c(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98adde4", new Object[]{this, paster});
        }
        if ((paster.isInTemplate || paster.isInDraft) && (paster.extra instanceof String)) {
            return (String) paster.extra;
        }
        if (paster.type == 1) {
            d(paster);
            String addTextClip = this.f13404a.E().addTextClip("", "", 0L, a());
            paster.extra = addTextClip;
            return addTextClip;
        } else if (paster.type == 2) {
            String addTextTemplateClip = this.f13404a.E().addTextTemplateClip("", paster.resPath, 0L, a(), (ResourceInspector) null);
            paster.extra = addTextTemplateClip;
            String str = addTextTemplateClip;
            this.f13404a.E().setTextTemplateExtParam(str, 0, "Script_ImagePath", paster.itemImageLocalPath);
            return str;
        } else if (paster.resType == 1 || paster.resType == 2) {
            String addPipClip = this.f13404a.E().addPipClip("", paster.path, 0L, 0L, a());
            paster.extra = addPipClip;
            return addPipClip;
        } else if (paster.resType == 3) {
            String addSubProjectClip = this.f13404a.E().addSubProjectClip("", paster.resPath, 0L, 0L, this.b ? -1L : a());
            paster.extra = addSubProjectClip;
            return addSubProjectClip;
        } else {
            String addStickerClip = this.f13404a.E().addStickerClip("", paster.resPath, 0L, a());
            paster.extra = addStickerClip;
            return addStickerClip;
        }
    }

    private void d(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8baaa19b", new Object[]{this, paster});
        } else {
            hff.e(this.f13404a.E(), paster.textFontPath);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.a.b, com.taobao.android.litecreator.sdk.editor.data.a.InterfaceC0518a
    public void a(Paster paster) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799f3f7e", new Object[]{this, paster});
            return;
        }
        boolean z2 = paster.extra == null;
        String c = c(paster);
        s(c, paster);
        k(c, paster);
        if (!paster.isInTemplate) {
            p(c, paster);
            m(c, paster);
            n(c, paster);
            o(c, paster);
            l(c, paster);
            t(c, paster);
        }
        if (paster.type != 0 || paster.resType != 3 || !z2) {
            z = false;
        }
        if (z) {
            return;
        }
        q(c, paster);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.a.b, com.taobao.android.litecreator.sdk.editor.data.a.InterfaceC0518a
    public void b(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa30add", new Object[]{this, paster});
            return;
        }
        com.taobao.android.litecreator.util.u.b("StickerDifferCBEditorV2", "onRemove:" + paster.toString());
        if (!(paster.extra instanceof String)) {
            return;
        }
        this.f13404a.E().deleteClip((String) paster.extra);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.a.b, com.taobao.android.litecreator.sdk.editor.data.a.InterfaceC0518a
    public void a(Paster paster, Paster paster2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96262ba8", new Object[]{this, paster, paster2});
            return;
        }
        com.taobao.android.litecreator.util.u.b("StickerDifferCBEditorV2", "onBringTopFront======>");
        if (com.taobao.android.litecreator.util.s.k()) {
            if (paster == null || !(paster.extra instanceof String)) {
                return;
            }
            String clipParentId = this.f13404a.E().getClipParentId((String) paster.extra);
            if (TextUtils.isEmpty(clipParentId)) {
                return;
            }
            this.f13404a.E().setTrackIndex(clipParentId, com.taobao.android.litecreator.util.s.j());
            return;
        }
        a(paster2);
        b(paster);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.a.b, com.taobao.android.litecreator.sdk.editor.data.a.InterfaceC0518a
    public void c(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85687b2", new Object[]{this, str, paster});
            return;
        }
        com.taobao.android.litecreator.util.u.b("StickerDifferCBEditorV2", "onResUpdate:" + paster.toString());
        p(str, paster);
        l(str, paster);
        q(str, paster);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.a.b, com.taobao.android.litecreator.sdk.editor.data.a.InterfaceC0518a
    public void d(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d157d951", new Object[]{this, str, paster});
            return;
        }
        com.taobao.android.litecreator.util.u.b("StickerDifferCBEditorV2", "onTextColorUpdate:" + paster.toString());
        m(str, paster);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.a.b, com.taobao.android.litecreator.sdk.editor.data.a.InterfaceC0518a
    public void e(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea592af0", new Object[]{this, str, paster});
            return;
        }
        com.taobao.android.litecreator.util.u.b("StickerDifferCBEditorV2", "onOutlineColorUpdate:" + paster.toString());
        n(str, paster);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.a.b, com.taobao.android.litecreator.sdk.editor.data.a.InterfaceC0518a
    public void f(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a7c8f", new Object[]{this, str, paster});
            return;
        }
        com.taobao.android.litecreator.util.u.b("StickerDifferCBEditorV2", "onShadowColorUpdate:" + paster.toString());
        o(str, paster);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.a.b, com.taobao.android.litecreator.sdk.editor.data.a.InterfaceC0518a
    public void a(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8653e474", new Object[]{this, str, paster});
            return;
        }
        com.taobao.android.litecreator.util.u.b("StickerDifferCBEditorV2", "onTextUpdate:" + paster.toString());
        k(str, paster);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.a.b, com.taobao.android.litecreator.sdk.editor.data.a.InterfaceC0518a
    public void b(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f553613", new Object[]{this, str, paster});
            return;
        }
        com.taobao.android.litecreator.util.u.b("StickerDifferCBEditorV2", "onTextFontUpdate:" + paster.toString());
        l(str, paster);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.a.b, com.taobao.android.litecreator.sdk.editor.data.a.InterfaceC0518a
    public void g(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c5bce2e", new Object[]{this, str, paster});
            return;
        }
        com.taobao.android.litecreator.util.u.b("StickerDifferCBEditorV2", "onMuteUpdate");
        t(str, paster);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.a.b, com.taobao.android.litecreator.sdk.editor.data.a.InterfaceC0518a
    public void h(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355d1fcd", new Object[]{this, str, paster});
            return;
        }
        com.taobao.android.litecreator.util.u.b("StickerDifferCBEditorV2", "onStartTimeUpdate. startTime:" + paster.startTimeUs + ", endTime:" + paster.endTimeUs);
        if (paster.resType == 3 && this.b) {
            this.f13404a.E().setClipStartTimeUs(str, paster.startTimeUs - 100000);
            this.f13404a.E().setClipEndTimeUs(str, paster.endTimeUs - 100000);
            return;
        }
        this.f13404a.E().setClipStartTimeUs(str, paster.startTimeUs - 100000);
        this.f13404a.E().setSourceEndTimeUs(str, (paster.endTimeUs - paster.startTimeUs) + 100000);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.a.b, com.taobao.android.litecreator.sdk.editor.data.a.InterfaceC0518a
    public void i(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5e716c", new Object[]{this, str, paster});
            return;
        }
        com.taobao.android.litecreator.util.u.b("StickerDifferCBEditorV2", "onEndTimeUpdate. startTime:" + paster.startTimeUs + ", endTime:" + paster.endTimeUs);
        if (paster.resType == 3 && this.b) {
            this.f13404a.E().setClipStartTimeUs(str, paster.startTimeUs - 100000);
            this.f13404a.E().setClipEndTimeUs(str, paster.endTimeUs + 100000);
            return;
        }
        this.f13404a.E().setSourceEndTimeUs(str, (paster.endTimeUs - paster.startTimeUs) + 100000);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.a.b, com.taobao.android.litecreator.sdk.editor.data.a.InterfaceC0518a
    public void j(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("675fc30b", new Object[]{this, str, paster});
            return;
        }
        com.taobao.android.litecreator.util.u.b("StickerDifferCBEditorV2", "onTransformUpdate: " + paster.toString());
        if (paster.isInTemplate) {
            r(str, paster);
        } else {
            q(str, paster);
        }
    }

    private void k(String str, Paster paster) {
        List<PasterChildNode> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806114aa", new Object[]{this, str, paster});
            return;
        }
        MeEditor E = this.f13404a.E();
        if (paster.type == 1) {
            E.setText(str, paster.text);
        } else if (paster.type == 2) {
            E.setTextTemplateContent(str, 0, paster.text);
        } else if (paster.type == 3 && (list = paster.pasterChildNodes) != null && list.size() > 0) {
            hff.b(E, hff.a(E, str));
            for (PasterChildNode pasterChildNode : list) {
                E.setText(pasterChildNode.clipId, pasterChildNode.content);
                if (pasterChildNode.isEdit) {
                    E.setText(pasterChildNode.clipId, paster.text);
                    pasterChildNode.content = paster.text;
                }
            }
            hff.a(E);
        }
    }

    private void l(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99626649", new Object[]{this, str, paster});
        } else if (paster.type != 1 || TextUtils.isEmpty(paster.textFontPath)) {
        } else {
            this.f13404a.E().setTextFont(str, paster.textFontPath);
        }
    }

    private void m(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b263b7e8", new Object[]{this, str, paster});
        } else if (paster.type != 1 || e(paster)) {
        } else {
            this.f13404a.E().setTextColor(str, paster.textColor == 0 ? -1 : paster.textColor);
        }
    }

    private void n(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb650987", new Object[]{this, str, paster});
        } else if (paster.type != 1 || e(paster)) {
        } else {
            this.f13404a.E().setTextOutlineEnable(str, true);
            this.f13404a.E().setTextOutlineSize(str, 2.0f);
            this.f13404a.E().setTextOutlineColor(str, paster.outlineColor);
        }
    }

    private void o(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4665b26", new Object[]{this, str, paster});
        } else if (paster.type != 1 || e(paster)) {
        } else {
            this.f13404a.E().setTextShadowEnable(str, true);
            this.f13404a.E().setTextShadowOffsetX(str, 1.0f);
            this.f13404a.E().setTextShadowOffsetY(str, 1.0f);
            this.f13404a.E().setTextShadowColor(str, paster.shadowColor);
        }
    }

    private boolean e(Paster paster) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("91ae6cfe", new Object[]{this, paster})).booleanValue() : paster.type != 1;
    }

    private void p(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd67acc5", new Object[]{this, str, paster});
        } else if (paster.type == 1) {
            this.f13404a.E().setTextPropertiesByJson(str, TextType.kTextUnknown, "", (ResourceInspector) null);
            this.f13404a.E().setTextPropertiesByJson(str, TextType.kTextBase, "", (ResourceInspector) null);
            this.f13404a.E().setTextPropertiesByJson(str, TextType.kColorText, "", (ResourceInspector) null);
            this.f13404a.E().setTextPropertiesByJson(str, TextType.kTextAnimationIn, "", (ResourceInspector) null);
            this.f13404a.E().setTextPropertiesByJson(str, TextType.kTextAnimationLoop, "", (ResourceInspector) null);
            this.f13404a.E().setTextPropertiesByJson(str, TextType.kTextAnimationOut, "", (ResourceInspector) null);
            this.f13404a.E().setTextPropertiesByJson(str, TextType.kTextBubble, "", (ResourceInspector) null);
            this.f13404a.E().setTextPropertiesByJson(str, TextType.kTextAudio, "", (ResourceInspector) null);
            this.f13404a.E().setTextPropertiesByJson(str, TextType.kTextCombo, "", (ResourceInspector) null);
            this.f13404a.E().setTextPropertiesByJson(str, TextType.kTextWidget, "", (ResourceInspector) null);
            ArrayList<String> arrayList = new ArrayList();
            this.f13404a.E().getTextWidgetList(str, arrayList);
            for (String str2 : arrayList) {
                this.f13404a.E().removeTextWidget(str, str2);
            }
            if (TextUtils.isEmpty(paster.resPath)) {
                return;
            }
            this.f13404a.E().setTextPropertiesByJson(str, TextType.kTextUnknown, paster.resPath, (ResourceInspector) null);
        }
    }

    private void q(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1668fe64", new Object[]{this, str, paster});
        } else if (TextUtils.isEmpty(str) || this.f13404a.E() == null) {
        } else {
            Transform transform = paster.transform;
            this.f13404a.E().setScale(str, transform.scale);
            this.f13404a.E().setRotate(str, (float) (((-transform.rotate) / 180.0f) * 3.141592653589793d));
            this.f13404a.E().setPosition(str, transform.postionX, transform.postionY);
        }
    }

    private void r(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f6a5003", new Object[]{this, str, paster});
        } else if (TextUtils.isEmpty(str) || this.f13404a.E() == null) {
        } else {
            MeEditor E = this.f13404a.E();
            String clipExtra = E.getClipExtra(str, "targetClipId");
            String clipExtra2 = E.getClipExtra(str, "resType");
            if (clipExtra != null && TextUtils.equals(clipExtra2, "resImage")) {
                float a2 = at.a(E.getClipExtra(str, "postionX"), 0.0f);
                float a3 = at.a(E.getClipExtra(str, "postionY"), 0.0f);
                float a4 = at.a(E.getClipExtra(str, "scale"), 0.0f);
                float a5 = at.a(E.getClipExtra(str, "rotate"), 0.0f);
                Transform transform = paster.transform;
                String clipExtra3 = E.getClipExtra(str, "targetClipLink");
                double nestedClipDblProp = E.getCoreEditor().getNestedClipDblProp(clipExtra3, "canvas", "xOffset", (double) mto.a.GEO_NOT_SUPPORT);
                double nestedClipDblProp2 = E.getCoreEditor().getNestedClipDblProp(clipExtra3, "canvas", "yOffset", (double) mto.a.GEO_NOT_SUPPORT);
                double nestedClipDblProp3 = E.getCoreEditor().getNestedClipDblProp(clipExtra3, "canvas", "xScale", 1.0d);
                double nestedClipDblProp4 = E.getCoreEditor().getNestedClipDblProp(clipExtra3, "canvas", "yScale", 1.0d);
                float f = transform.postionX;
                float f2 = transform.postionY;
                float f3 = transform.scale;
                E.setClipExtra(str, "postionX", String.valueOf(f));
                E.setClipExtra(str, "postionY", String.valueOf(f2));
                E.setClipExtra(str, "scale", String.valueOf(f3));
                E.setClipExtra(str, "rotate", String.valueOf(a5));
                double d = f3 / a4;
                double a6 = a((f - a2) + nestedClipDblProp);
                double a7 = a((f2 - a3) + nestedClipDblProp2);
                double a8 = a(nestedClipDblProp3 * d);
                double a9 = a(d * nestedClipDblProp4);
                E.getCoreEditor().setNestedClipDblProp(clipExtra3, "canvas", "xOffset", a6);
                E.getCoreEditor().setNestedClipDblProp(clipExtra3, "canvas", "yOffset", a7);
                E.getCoreEditor().setNestedClipDblProp(clipExtra3, "canvas", "xScale", a8);
                E.getCoreEditor().setNestedClipDblProp(clipExtra3, "canvas", "yScale", a9);
                return;
            }
            Transform transform2 = paster.transform;
            this.f13404a.E().setScale(str, transform2.scale);
            this.f13404a.E().setRotate(str, (float) (((-transform2.rotate) / 180.0f) * 3.141592653589793d));
            this.f13404a.E().setPosition(str, transform2.postionX, transform2.postionY);
        }
    }

    private static double a(double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a82180c4", new Object[]{new Double(d)})).doubleValue() : (Double.isNaN(d) || Double.isInfinite(d)) ? mto.a.GEO_NOT_SUPPORT : d;
    }

    private void s(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486ba1a2", new Object[]{this, str, paster});
        } else if (TextUtils.isEmpty(str) || this.f13404a.E() == null) {
        } else {
            if (paster.resType == 3 && this.b) {
                this.f13404a.E().setClipStartTimeUs(str, paster.startTimeUs);
                this.f13404a.E().setClipEndTimeUs(str, paster.endTimeUs);
                if (paster.type != 3) {
                    return;
                }
                this.f13404a.E().setClipLoopType(str, Const.ClipLoopType.kLoop);
                this.f13404a.E().setClipEndTimeUs(str, paster.endTimeUs);
                return;
            }
            this.f13404a.E().setClipStartTimeUs(str, paster.startTimeUs);
            this.f13404a.E().setSourceEndTimeUs(str, paster.endTimeUs - paster.startTimeUs);
            com.taobao.android.litecreator.util.ad.b(this.f13404a.E(), str, paster.endTimeUs - paster.startTimeUs);
        }
    }

    private void t(String str, Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616cf341", new Object[]{this, str, paster});
        } else if (!paster.hasFlag(2)) {
        } else {
            com.taobao.android.litecreator.util.ad.a(this.f13404a.E(), str, paster.mute);
        }
    }
}
