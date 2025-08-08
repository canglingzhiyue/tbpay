package com.taobao.android.detail.core.detail.kit.view.dinamic_ext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.XRichTextViewByCategoryCoupon;
import com.taobao.android.detail.datasdk.protocol.adapter.core.c;
import com.taobao.android.dinamic.constructor.DTextViewConstructor;
import com.taobao.android.dinamic.dinamic.DinamicAttr;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.dzv;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailRichTextViewByCategoryCoupon extends DTextViewConstructor implements IMTOPDataObject {
    public static final String VIEW_TAG = "XCategoryCoupon";

    static {
        kge.a(-1268487632);
        kge.a(-350052935);
    }

    public DetailRichTextViewByCategoryCoupon() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailRichTextViewByCategoryCoupon");
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor, com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        return new XRichTextViewByCategoryCoupon(context, attributeSet);
    }

    @DinamicAttr(attrSet = {"xIconHeight", "xTextBgPaddingV", "xVIPTextColor", "xTextLeftGap", "xVIPTextLeftGap", "xVIPTextRightGap", "xBonusList", "xCouponGap", "xIconUrl", "xSplitLineColor", "xSplitLineWidth", "xSplitLineGap", "xEllipsis", "xEllipsisSize"})
    public void setAttr(View view, String str, String str2, String str3, String str4, String str5, String str6, JSONArray jSONArray, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        if (view == null) {
            return;
        }
        final XRichTextViewByCategoryCoupon xRichTextViewByCategoryCoupon = (XRichTextViewByCategoryCoupon) view;
        if (!StringUtils.isEmpty(str)) {
            xRichTextViewByCategoryCoupon.setXIconHeight(Float.parseFloat(str));
        }
        if (!StringUtils.isEmpty(str2)) {
            xRichTextViewByCategoryCoupon.setTextBgPaddingV(Float.parseFloat(str2));
        }
        if (!StringUtils.isEmpty(str3)) {
            xRichTextViewByCategoryCoupon.setVIPTextColor(str3);
        }
        if (!StringUtils.isEmpty(str4)) {
            xRichTextViewByCategoryCoupon.setTextLeftGap(Float.parseFloat(str4));
        }
        if (!StringUtils.isEmpty(str5)) {
            xRichTextViewByCategoryCoupon.setVIPTextLeftGap(Float.parseFloat(str5));
        }
        if (!StringUtils.isEmpty(str6)) {
            xRichTextViewByCategoryCoupon.setVIPTextRightGap(Float.parseFloat(str6));
        }
        if (!StringUtils.isEmpty(str7)) {
            xRichTextViewByCategoryCoupon.setCouponGap(Float.parseFloat(str7));
        }
        if (!StringUtils.isEmpty(str9)) {
            xRichTextViewByCategoryCoupon.setSplitLineColor(str9);
        }
        if (!StringUtils.isEmpty(str10)) {
            xRichTextViewByCategoryCoupon.setSplitLineWidth(Float.parseFloat(str10));
        }
        if (!StringUtils.isEmpty(str11)) {
            xRichTextViewByCategoryCoupon.setSplitLineGap(Float.parseFloat(str11));
        }
        if (!StringUtils.isEmpty(str13)) {
            xRichTextViewByCategoryCoupon.setEllipsisSize(Integer.parseInt(str13));
        }
        if (jSONArray != null) {
            xRichTextViewByCategoryCoupon.setBonusList(jSONArray);
        }
        if (!StringUtils.isEmpty(str12)) {
            xRichTextViewByCategoryCoupon.setEllipsis(str12);
        }
        xRichTextViewByCategoryCoupon.setIcon(null);
        if (StringUtils.isEmpty(str8)) {
            return;
        }
        dzv.a(str8, xRichTextViewByCategoryCoupon.getContext(), new c.a() { // from class: com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailRichTextViewByCategoryCoupon.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.c.a
            public void a(Drawable drawable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                } else {
                    xRichTextViewByCategoryCoupon.setIcon(drawable);
                }
            }
        }, null);
    }
}
