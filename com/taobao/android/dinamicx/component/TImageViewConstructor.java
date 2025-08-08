package com.taobao.android.dinamicx.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.DinamicAttr;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.android.dinamic.ext.component.view.TImageView;
import com.taobao.share.ui.engine.friend.a;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.ImageShapeFeature;
import com.taobao.uikit.feature.features.RatioFeature;
import tb.fpd;
import tb.fpn;
import tb.fpr;
import tb.mto;

/* loaded from: classes.dex */
public class TImageViewConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String IMAGEVIEW_ASPECT_RATIO = "tAspectRatio";
    private static final String IMAGEVIEW_IMAGE = "tImage";
    private static final String IMAGEVIEW_IMAGE_URL = "tImageUrl";
    private static final String IMAGEVIEW_LOCAL_IMAGE_NAME = "tLocalImageName";
    private static final String IMAGEVIEW_SCALE_TYPE = "tScaleType";
    private static final String IMAGEVIEW_SCALE_TYPE_CENTER_CROP = "centerCrop";
    private static final String IMAGEVIEW_SCALE_TYPE_FIT_CENTER = "fitCenter";
    private static final String IMAGEVIEW_SCALE_TYPE_FIT_XY = "fitXY";
    public static final String TAG = "TImageViewConstructor";

    public static /* synthetic */ Object ipc$super(TImageViewConstructor tImageViewConstructor, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int access$000(TImageViewConstructor tImageViewConstructor, Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2183bb44", new Object[]{tImageViewConstructor, context, str})).intValue() : tImageViewConstructor.getDrawableId(context, str);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeViewWithModule(String str, Context context, AttributeSet attributeSet, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dd539236", new Object[]{this, str, context, attributeSet, fpdVar});
        }
        if ("guess".equals(fpdVar.b())) {
            TImageView tImageView = new TImageView(context, attributeSet);
            tImageView.setStrategyConfig(ImageStrategyConfig.a("guess", 5120).a());
            return tImageView;
        }
        return new TImageView(context, attributeSet);
    }

    @DinamicAttr(attrSet = {"dWidth", "dHeight", IMAGEVIEW_ASPECT_RATIO})
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

    @DinamicAttr(attrSet = {IMAGEVIEW_IMAGE_URL})
    public void setImageUrl(TImageView tImageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1826ae53", new Object[]{this, tImageView, str});
        } else {
            tImageView.setImageUrl(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.android.dinamicx.component.TImageViewConstructor$1] */
    @DinamicAttr(attrSet = {IMAGEVIEW_LOCAL_IMAGE_NAME, IMAGEVIEW_IMAGE})
    public void setLocalRes(final TImageView tImageView, final String str, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a588098", new Object[]{this, tImageView, str, drawable});
        } else if (str == null) {
            tImageView.setImageDrawable(drawable);
        } else {
            final Context context = tImageView.getContext();
            new AsyncTask<Void, Void, Drawable>() { // from class: com.taobao.android.dinamicx.component.TImageViewConstructor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, android.graphics.drawable.Drawable] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Drawable doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(Drawable drawable2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, drawable2});
                    } else {
                        a(drawable2);
                    }
                }

                public Drawable a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Drawable) ipChange2.ipc$dispatch("3d6535e6", new Object[]{this, voidArr});
                    }
                    int access$000 = TImageViewConstructor.access$000(TImageViewConstructor.this, context, str);
                    Drawable drawable2 = null;
                    if (access$000 == 0) {
                        return null;
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 21) {
                            drawable2 = context.getDrawable(access$000);
                        } else {
                            drawable2 = context.getResources().getDrawable(access$000);
                        }
                    } catch (Exception e) {
                        Log.e(TImageViewConstructor.TAG, "Get layout parser exception", e);
                    }
                    return drawable2;
                }

                public void a(Drawable drawable2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable2});
                    } else {
                        tImageView.setImageDrawable(drawable2);
                    }
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    private int getDrawableId(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("409026f", new Object[]{this, context, str})).intValue();
        }
        if (context == null || StringUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return context.getResources().getIdentifier(str, a.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName());
        } catch (Exception e) {
            Log.e(TAG, "getDrawableId exception", e);
            return 0;
        }
    }

    @DinamicAttr(attrSet = {IMAGEVIEW_SCALE_TYPE})
    public void setImageScaleType(TImageView tImageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da05548", new Object[]{this, tImageView, str});
        } else if (StringUtils.isEmpty(str)) {
            tImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (IMAGEVIEW_SCALE_TYPE_FIT_XY.equals(str)) {
            tImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else if ("fitCenter".equals(str)) {
            tImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if ("centerCrop".equals(str)) {
            tImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            tImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setBackground(View view, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c88fce3", new Object[]{this, view, str, str2, str3, str4});
            return;
        }
        view.setBackgroundColor(fpn.a(str4, 0));
        TImageView tImageView = (TImageView) view;
        if (StringUtils.isEmpty(str) && StringUtils.isEmpty(str2) && StringUtils.isEmpty(str3)) {
            if (((ImageShapeFeature) tImageView.findFeature(ImageShapeFeature.class)) == null) {
                return;
            }
            tImageView.removeFeature(ImageShapeFeature.class);
            return;
        }
        int a2 = fpr.a(tImageView.getContext(), str, 0);
        int a3 = fpr.a(tImageView.getContext(), str3, 0);
        int a4 = fpn.a(str2, 0);
        if (a2 > 0 || a3 > 0) {
            ImageShapeFeature imageShapeFeature = (ImageShapeFeature) tImageView.findFeature(ImageShapeFeature.class);
            if (imageShapeFeature == null) {
                imageShapeFeature = new ImageShapeFeature();
                tImageView.addFeature(imageShapeFeature);
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
        } else if (((ImageShapeFeature) tImageView.findFeature(ImageShapeFeature.class)) == null) {
        } else {
            tImageView.removeFeature(ImageShapeFeature.class);
        }
    }
}
