package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic2.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.DinamicAttr;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HGifView;
import java.util.List;
import tb.fpd;
import tb.kge;
import tb.leg;

/* loaded from: classes7.dex */
public class HGifViewConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1748407807);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet}) : new HGifView(context, attributeSet);
    }

    @DinamicAttr(attrSet = {HImageViewConstructor.IMAGEVIEW_IMAGE_URL, HImageViewConstructor.IMAGEVIEW_PLACE_HOLDER_IMAGE, "dWidth", "dHeight", "hAspectRatio", "dinamicParams"})
    public void setBottomImage(HGifView hGifView, String str, Drawable drawable, String str2, String str3, String str4, fpd fpdVar) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a163fcb5", new Object[]{this, hGifView, str, drawable, str2, str3, str4, fpdVar});
            return;
        }
        hGifView.setBottomImageRatio(str2, str3, str4);
        if (drawable != null) {
            hGifView.getBottomImageView().setPlaceHoldForeground(drawable);
        }
        hGifView.setBottomImage(str);
        if (fpdVar == null) {
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) fpdVar.e();
            List list = (List) fpdVar.d();
            if (jSONObject == null || list == null || (indexOf = list.indexOf(jSONObject)) < 0 || indexOf >= 5) {
                return;
            }
            leg.a(hGifView, jSONObject);
        } catch (Throwable unused) {
        }
    }

    @DinamicAttr(attrSet = {"hGifUrl", "dWidth", "dHeight", "hAspectRatio", "dinamicParams"})
    public void setGifUrl(HGifView hGifView, String str, String str2, String str3, String str4, fpd fpdVar) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f27012", new Object[]{this, hGifView, str, str2, str3, str4, fpdVar});
            return;
        }
        hGifView.setGifImageRatio(str2, str3, str4);
        hGifView.setGifUrl(str);
        if (fpdVar == null) {
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) fpdVar.e();
            List list = (List) fpdVar.d();
            if (jSONObject == null || list == null || (indexOf = list.indexOf(jSONObject)) < 0 || indexOf >= 5) {
                return;
            }
            leg.a(hGifView, jSONObject);
        } catch (Throwable unused) {
        }
    }

    @DinamicAttr(attrSet = {"hScaleType"})
    public void setImageScaleType(HGifView hGifView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe228720", new Object[]{this, hGifView, str});
        } else if (StringUtils.isEmpty(str)) {
            hGifView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            int parseInt = Integer.parseInt(str);
            if (parseInt == 0) {
                hGifView.setScaleType(ImageView.ScaleType.FIT_XY);
            } else if (parseInt == 1) {
                hGifView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else if (parseInt != 2) {
            } else {
                hGifView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
    }
}
