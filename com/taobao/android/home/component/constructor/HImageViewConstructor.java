package com.taobao.android.home.component.constructor;

import android.content.Context;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.DinamicAttr;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.android.tbtheme.c;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.ImageShapeFeature;
import com.taobao.uikit.feature.features.RatioFeature;
import tb.fpd;
import tb.fpn;
import tb.fpr;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class HImageViewConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2045246558);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet}) : new HImageView(context, attributeSet);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeViewWithModule(String str, Context context, AttributeSet attributeSet, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dd539236", new Object[]{this, str, context, attributeSet, fpdVar});
        }
        if ("homepage".equals(fpdVar.b())) {
            return new HImageView(context, attributeSet);
        }
        return new TUrlImageView(context, attributeSet);
    }

    @DinamicAttr(attrSet = {"dWidth", "dHeight", "hAspectRatio"})
    public void setAspectRatio(TUrlImageView tUrlImageView, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a33971c", new Object[]{this, tUrlImageView, str, str2, str3});
            return;
        }
        boolean z = !StringUtils.equals(str, "match_content") && StringUtils.equals(str2, "match_content");
        if (!z && (!StringUtils.equals(str, "match_content") || StringUtils.equals(str2, "match_content"))) {
            return;
        }
        double d = -1.0d;
        try {
            if (!StringUtils.isEmpty(str3)) {
                d = Double.valueOf(str3).doubleValue();
            }
        } catch (Throwable unused) {
        }
        if (z) {
            if (d > mto.a.GEO_NOT_SUPPORT) {
                RatioFeature ratioFeature = (RatioFeature) tUrlImageView.findFeature(RatioFeature.class);
                if (ratioFeature == null) {
                    ratioFeature = new RatioFeature();
                    ratioFeature.setRatio((float) (1.0d / d));
                    tUrlImageView.addFeature(ratioFeature);
                } else {
                    ratioFeature.setRatio((float) (1.0d / d));
                }
                ratioFeature.setOrientation(0);
            } else if (tUrlImageView.getLayoutParams() == null) {
            } else {
                tUrlImageView.removeFeature(RatioFeature.class);
                tUrlImageView.getLayoutParams().height = 0;
            }
        } else if (d > mto.a.GEO_NOT_SUPPORT) {
            RatioFeature ratioFeature2 = (RatioFeature) tUrlImageView.findFeature(RatioFeature.class);
            if (ratioFeature2 == null) {
                ratioFeature2 = new RatioFeature();
                ratioFeature2.setRatio((float) d);
                tUrlImageView.addFeature(ratioFeature2);
            } else {
                ratioFeature2.setRatio((float) d);
            }
            ratioFeature2.setOrientation(1);
        } else if (tUrlImageView.getLayoutParams() == null) {
        } else {
            tUrlImageView.removeFeature(RatioFeature.class);
            tUrlImageView.getLayoutParams().width = 0;
        }
    }

    @DinamicAttr(attrSet = {com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic2.widget.HImageViewConstructor.IMAGEVIEW_AUTO_RELEASE})
    public void setAutoRelease(TUrlImageView tUrlImageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437a588d", new Object[]{this, tUrlImageView, str});
        } else if ("false".equals(str)) {
            tUrlImageView.setAutoRelease(false);
        } else {
            tUrlImageView.setAutoRelease(true);
        }
    }

    @DinamicAttr(attrSet = {com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic2.widget.HImageViewConstructor.IMAGEVIEW_IMAGE_URL, com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic2.widget.HImageViewConstructor.IMAGEVIEW_DARK_IMAGE_URL, com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic2.widget.HImageViewConstructor.IMAGEVIEW_PLACE_HOLDER_IMAGE, "dinamicParams"})
    public void setImageUrl(TUrlImageView tUrlImageView, String str, String str2, Drawable drawable, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf7e011", new Object[]{this, tUrlImageView, str, str2, drawable, fpdVar});
            return;
        }
        tUrlImageView.setPlaceHoldForeground(drawable);
        if (c.a(tUrlImageView.getContext()) && !StringUtils.isEmpty(str2)) {
            tUrlImageView.setImageUrl(str2);
        } else {
            tUrlImageView.setImageUrl(str);
        }
    }

    @DinamicAttr(attrSet = {"hScaleType"})
    public void setImageScaleType(TUrlImageView tUrlImageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f03242", new Object[]{this, tUrlImageView, str});
        } else if (StringUtils.isEmpty(str)) {
            tUrlImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            int intValue = Integer.valueOf(str).intValue();
            if (intValue == 0) {
                tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            } else if (intValue == 1) {
                tUrlImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else if (intValue != 2) {
            } else {
                tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
    }

    @DinamicAttr(attrSet = {com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic2.widget.HImageViewConstructor.IMAGEVIEW_CORNER_RADIUS, com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic2.widget.HImageViewConstructor.IMAGEVIEW_BORDER_COLOR, com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic2.widget.HImageViewConstructor.IMAGEVIEW_BORDER_WIDTH})
    public void setImageShapeFeature(TUrlImageView tUrlImageView, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36223c59", new Object[]{this, tUrlImageView, str, str2, str3});
        } else if (StringUtils.isEmpty(str) && StringUtils.isEmpty(str2) && StringUtils.isEmpty(str3)) {
            if (((ImageShapeFeature) tUrlImageView.findFeature(ImageShapeFeature.class)) == null) {
                return;
            }
            tUrlImageView.removeFeature(ImageShapeFeature.class);
        } else {
            int a2 = fpr.a(tUrlImageView.getContext(), str, 0);
            int a3 = fpr.a(tUrlImageView.getContext(), str3, 0);
            int a4 = fpn.a(str2, 0);
            if (a2 > 0 || a3 > 0) {
                ImageShapeFeature imageShapeFeature = (ImageShapeFeature) tUrlImageView.findFeature(ImageShapeFeature.class);
                if (imageShapeFeature == null) {
                    imageShapeFeature = new ImageShapeFeature();
                    tUrlImageView.addFeature(imageShapeFeature);
                }
                imageShapeFeature.setShape(1);
                float f = a2;
                imageShapeFeature.setCornerRadius(f, f, f, f);
                if (a3 <= 0) {
                    return;
                }
                imageShapeFeature.setStrokeEnable(true);
                imageShapeFeature.setStrokeWidth(a3);
                imageShapeFeature.setStrokeColor(a4);
            } else if (((ImageShapeFeature) tUrlImageView.findFeature(ImageShapeFeature.class)) == null) {
            } else {
                tUrlImageView.removeFeature(ImageShapeFeature.class);
            }
        }
    }
}
