package com.taobao.android.detail.core.detail.kit.view.dinamic_ext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.XRichTextViewByCoupon;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.protocol.adapter.core.c;
import com.taobao.android.dinamic.constructor.DTextViewConstructor;
import com.taobao.android.dinamic.dinamic.DinamicAttr;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.dzv;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailRichTextViewByCouponConstructor extends DTextViewConstructor implements IMTOPDataObject {
    public static final String VIEW_TAG = "XRichTextByCoupon";

    static {
        kge.a(-1222521592);
        kge.a(-350052935);
    }

    public DetailRichTextViewByCouponConstructor() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailRichTextViewByCouponConstructor");
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor, com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        return new XRichTextViewByCoupon(context, attributeSet);
    }

    @DinamicAttr(attrSet = {"xSeparator", "xTextBackground", "rIconUrl", "xIconHeight", "xTextBgPaddingH", "xTextBgPaddingV", "xPreTextBackground", "xPreTextBackgroundType"})
    public void setAttr(View view, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (view == null) {
            return;
        }
        final XRichTextViewByCoupon xRichTextViewByCoupon = (XRichTextViewByCoupon) view;
        i.a(VIEW_TAG, " xSeparator : " + str + ", xTextBackground : " + str2 + ", iconUrl:" + str3);
        if (!StringUtils.isEmpty(str)) {
            xRichTextViewByCoupon.setSeparator(str);
        }
        if (!StringUtils.isEmpty(str4)) {
            xRichTextViewByCoupon.setXIconHeight(Integer.parseInt(str4));
        }
        if (!StringUtils.isEmpty(str5)) {
            xRichTextViewByCoupon.setTextBgPaddingH(Integer.parseInt(str5));
        }
        if (!StringUtils.isEmpty(str6)) {
            xRichTextViewByCoupon.setTextBgPaddingV(Integer.parseInt(str6));
        }
        xRichTextViewByCoupon.setIcon(null);
        if (!StringUtils.isEmpty(str2)) {
            dzv.a(str2, xRichTextViewByCoupon.getContext(), new c.a() { // from class: com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailRichTextViewByCouponConstructor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.c.a
                public void a(Drawable drawable) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                    } else {
                        xRichTextViewByCoupon.setTextBackground(drawable);
                    }
                }
            }, null);
        }
        if (StringUtils.isEmpty(str3)) {
            return;
        }
        dzv.a(str3, xRichTextViewByCoupon.getContext(), new c.a() { // from class: com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailRichTextViewByCouponConstructor.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.c.a
            public void a(Drawable drawable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                } else {
                    xRichTextViewByCoupon.setIcon(drawable);
                }
            }
        }, null);
    }
}
