package com.taobao.tbpoplayer.nativerender;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import tb.kge;

/* loaded from: classes8.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2013455949);
    }

    public static void a(e eVar, View view, ComponentBaseModel componentBaseModel, final StyleModel styleModel) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bab3391", new Object[]{eVar, view, componentBaseModel, styleModel});
            return;
        }
        final Context a2 = eVar.a().a();
        final com.alibaba.poplayer.utils.i l = eVar.l();
        if (styleModel.borderRadius > 0 && Build.VERSION.SDK_INT >= 21) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.tbpoplayer.nativerender.r.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7054f590", new Object[]{this, view2, outline});
                    } else {
                        outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), com.alibaba.poplayer.utils.i.this.a(a2, styleModel.borderRadius));
                    }
                }
            });
            view.setClipToOutline(true);
        }
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            if (!TextUtils.isEmpty(styleModel.background)) {
                gradientDrawable.setColor(Color.parseColor(p.a(eVar, styleModel.background, false)));
                z = true;
            }
            if (styleModel.borderRadius > 0) {
                gradientDrawable.setCornerRadius(l.a(a2, styleModel.borderRadius));
                z = true;
            }
            if (z) {
                if (Build.VERSION.SDK_INT < 16) {
                    view.setBackgroundDrawable(gradientDrawable);
                } else {
                    view.setBackground(gradientDrawable);
                }
            }
        } catch (IllegalArgumentException e) {
            com.alibaba.poplayer.utils.c.a("PopComponent.initLayoutParams.parseBorderBg.error.id=" + componentBaseModel.id, e);
            eVar.a("RenderFailed.parseBorderBg.id=" + componentBaseModel.id, "");
        }
        if (!TextUtils.isEmpty(styleModel.opacity)) {
            try {
                view.setAlpha(Float.parseFloat(styleModel.opacity));
            } catch (NumberFormatException e2) {
                com.alibaba.poplayer.utils.c.a("PopComponent.initLayoutParams.setAlpha.error.id=" + componentBaseModel.id, e2);
                eVar.a("RenderFailed.setAlpha.id=" + componentBaseModel.id, "");
            }
        }
        if (!TextUtils.isEmpty(styleModel.translateX)) {
            try {
                view.setTranslationX(l.a(a2, Float.parseFloat(styleModel.translateX)));
            } catch (NumberFormatException e3) {
                com.alibaba.poplayer.utils.c.a("PopComponent.initLayoutParams.setTranslationX.error.id=" + componentBaseModel.id, e3);
                eVar.a("RenderFailed.setTranslationX.id=" + componentBaseModel.id, "");
            }
        }
        if (!TextUtils.isEmpty(styleModel.translateY)) {
            try {
                view.setTranslationY(l.a(a2, Float.parseFloat(styleModel.translateY)));
            } catch (NumberFormatException e4) {
                com.alibaba.poplayer.utils.c.a("PopComponent.initLayoutParams.setTranslationY.error.id=" + componentBaseModel.id, e4);
                eVar.a("RenderFailed.setTranslationY.id=" + componentBaseModel.id, "");
            }
        }
        if (!TextUtils.isEmpty(styleModel.rotateX)) {
            try {
                view.setRotationX(l.a(a2, Float.parseFloat(styleModel.rotateX)));
            } catch (NumberFormatException e5) {
                com.alibaba.poplayer.utils.c.a("PopComponent.initLayoutParams.setRotationX.error.id=" + componentBaseModel.id, e5);
                eVar.a("RenderFailed.setRotationX.id=" + componentBaseModel.id, "");
            }
        }
        if (!TextUtils.isEmpty(styleModel.rotateY)) {
            try {
                view.setRotationY(l.a(a2, Float.parseFloat(styleModel.rotateY)));
            } catch (NumberFormatException e6) {
                com.alibaba.poplayer.utils.c.a("PopComponent.initLayoutParams.setRotationY.error.id=" + componentBaseModel.id, e6);
                eVar.a("RenderFailed.setRotationY.id=" + componentBaseModel.id, "");
            }
        }
        if (!TextUtils.isEmpty(styleModel.rotate)) {
            try {
                view.setRotation(l.a(a2, Float.parseFloat(styleModel.rotate)));
            } catch (NumberFormatException e7) {
                com.alibaba.poplayer.utils.c.a("PopComponent.initLayoutParams.setRotation.error.id=" + componentBaseModel.id, e7);
                eVar.a("RenderFailed.setRotation.id=" + componentBaseModel.id, "");
            }
        }
        if (!TextUtils.isEmpty(styleModel.scaleX)) {
            try {
                view.setScaleX(l.a(a2, Float.parseFloat(styleModel.scaleX)));
            } catch (NumberFormatException e8) {
                com.alibaba.poplayer.utils.c.a("PopComponent.initLayoutParams.setScaleX.error.id=" + componentBaseModel.id, e8);
                eVar.a("RenderFailed.setScaleX.id=" + componentBaseModel.id, "");
            }
        }
        if (TextUtils.isEmpty(styleModel.scaleY)) {
            return;
        }
        try {
            view.setScaleY(l.a(a2, Float.parseFloat(styleModel.scaleY)));
        } catch (NumberFormatException e9) {
            com.alibaba.poplayer.utils.c.a("PopComponent.initLayoutParams.setScaleY.error.id=" + componentBaseModel.id, e9);
            eVar.a("RenderFailed.setScaleY.id=" + componentBaseModel.id, "");
        }
    }
}
