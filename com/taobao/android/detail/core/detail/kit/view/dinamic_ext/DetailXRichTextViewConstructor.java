package com.taobao.android.detail.core.detail.kit.view.dinamic_ext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.XRichTextView;
import com.taobao.android.detail.datasdk.protocol.adapter.core.c;
import com.taobao.android.dinamic.constructor.DTextViewConstructor;
import com.taobao.android.dinamic.dinamic.DinamicAttr;
import java.util.ArrayList;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.dzv;
import tb.emu;
import tb.fpr;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailXRichTextViewConstructor extends DTextViewConstructor implements IMTOPDataObject {
    public static final String VIEW_TAG = "XRichText";

    static {
        kge.a(-1622933189);
        kge.a(-350052935);
    }

    public DetailXRichTextViewConstructor() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailXRichTextViewConstructor");
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor, com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        return new XRichTextView(context, attributeSet);
    }

    @DinamicAttr(attrSet = {"rIconUrl"})
    public void setImageUrl(final XRichTextView xRichTextView, String str) {
        xRichTextView.setIcon(null);
        if (!TextUtils.isEmpty(str)) {
            dzv.a(str, xRichTextView.getContext(), new c.a() { // from class: com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailXRichTextViewConstructor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.c.a
                public void a(Drawable drawable) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                    } else {
                        xRichTextView.setIcon(drawable);
                    }
                }
            }, null);
        }
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor
    @DinamicAttr(attrSet = {"dText"})
    public void setText(TextView textView, String str) {
        if (textView != null && (textView instanceof XRichTextView) && !TextUtils.isEmpty(str)) {
            XRichTextView xRichTextView = (XRichTextView) textView;
            xRichTextView.setSpannableStringBuilder(replaceStrWithColorSpan(new SpannableStringBuilder(str), "#", "@", xRichTextView.getSpanColorInt()));
            return;
        }
        textView.setText(str);
    }

    @DinamicAttr(attrSet = {"dLineSpace"})
    public void setLineSpace(TextView textView, String str) {
        if (textView == null || !(textView instanceof XRichTextView) || TextUtils.isEmpty(str)) {
            return;
        }
        ((XRichTextView) textView).setLineSpace(fpr.a(textView.getContext(), str, 3));
    }

    @DinamicAttr(attrSet = {"dStyledColor"})
    public void setStyledFontColor(TextView textView, String str) {
        if (textView == null || !(textView instanceof XRichTextView) || TextUtils.isEmpty(str)) {
            return;
        }
        ((XRichTextView) textView).setSpanColor(str);
        setText(textView, textView.getText().toString());
    }

    private SpannableStringBuilder replaceStrWithColorSpan(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i) {
        int indexOf;
        new ArrayList();
        do {
            indexOf = spannableStringBuilder.toString().indexOf(str, 0);
            if (indexOf != -1) {
                int isCloseExp = isCloseExp(spannableStringBuilder.toString(), indexOf, str2);
                if (-1 == isCloseExp) {
                    break;
                }
                spannableStringBuilder = replaceWithSpanFinal(spannableStringBuilder, indexOf, isCloseExp, i).delete(isCloseExp, isCloseExp + 1).delete(indexOf, indexOf + 1);
                continue;
            }
        } while (indexOf != -1);
        return spannableStringBuilder;
    }

    private int isCloseExp(String str, int i, String str2) {
        int indexOf = str.indexOf(str2, i + 1);
        if (-1 != indexOf) {
            return indexOf;
        }
        return -1;
    }

    private SpannableStringBuilder replaceWithSpanFinal(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (spannableStringBuilder != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }
        return spannableStringBuilder;
    }
}
