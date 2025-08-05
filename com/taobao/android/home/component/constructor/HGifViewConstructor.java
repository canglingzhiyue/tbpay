package com.taobao.android.home.component.constructor;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.DinamicAttr;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.android.home.component.view.HGifView;
import tb.fpd;
import tb.kge;

/* loaded from: classes.dex */
public class HGifViewConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(635359189);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet}) : new HGifView(context, attributeSet);
    }

    @DinamicAttr(attrSet = {com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic2.widget.HImageViewConstructor.IMAGEVIEW_IMAGE_URL, com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic2.widget.HImageViewConstructor.IMAGEVIEW_PLACE_HOLDER_IMAGE, "dWidth", "dHeight", "hAspectRatio", "dinamicParams"})
    public void setBottomImage(HGifView hGifView, String str, Drawable drawable, String str2, String str3, String str4, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ab554f2", new Object[]{this, hGifView, str, drawable, str2, str3, str4, fpdVar});
            return;
        }
        hGifView.setBottomImageRatio(str2, str3, str4);
        if (drawable != null) {
            hGifView.getBottomImageView().setPlaceHoldForeground(drawable);
        }
        hGifView.setBottomImage(str);
    }

    @DinamicAttr(attrSet = {"hGifUrl", "dWidth", "dHeight", "hAspectRatio", "dinamicParams"})
    public void setGifUrl(HGifView hGifView, String str, String str2, String str3, String str4, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae608f4f", new Object[]{this, hGifView, str, str2, str3, str4, fpdVar});
            return;
        }
        hGifView.setGifImageRatio(str2, str3, str4);
        hGifView.setGifUrl(str);
    }

    @DinamicAttr(attrSet = {"hScaleType"})
    public void setImageScaleType(HGifView hGifView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fefaec1d", new Object[]{this, hGifView, str});
        } else if (TextUtils.isEmpty(str)) {
            hGifView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            int intValue = Integer.valueOf(str).intValue();
            if (intValue == 0) {
                hGifView.setScaleType(ImageView.ScaleType.FIT_XY);
            } else if (intValue == 1) {
                hGifView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else if (intValue != 2) {
            } else {
                hGifView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
    }
}
