package com.ali.user.mobile.utils;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class ElderUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1940915450);
    }

    public static void viewScale(final View view, final float f, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402fab69", new Object[]{view, new Float(f), new Integer(i)});
        } else if (!DataProviderFactory.getDataProvider().enableElder() || view == null) {
        } else {
            view.post(new Runnable() { // from class: com.ali.user.mobile.utils.ElderUtil.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.width = Math.round(view.getWidth() * f);
                    layoutParams.height = Math.round(view.getHeight() * f);
                    try {
                        ((RelativeLayout.LayoutParams) layoutParams).topMargin = i;
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    view.setLayoutParams(layoutParams);
                }
            });
        }
    }

    public static int getScaleSize(int i) {
        if (!DataProviderFactory.getDataProvider().enableElder()) {
            return i;
        }
        if (AliUserLogin.getAppreanceExtentions() != null && AliUserLogin.getAppreanceExtentions().getScaleHelper() != null) {
            try {
                return ((IElderScale) AliUserLogin.getAppreanceExtentions().getScaleHelper().newInstance()).getScale(i);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e2) {
                e2.printStackTrace();
            }
        }
        if (i < 12) {
            return 15;
        }
        if (i >= 12 && i < 15) {
            return 18;
        }
        if (i >= 15 && i < 18) {
            return 21;
        }
        return (i < 18 || i >= 21) ? 30 : 24;
    }

    public static void scaleTextSize(TextView... textViewArr) {
        int pxTodip;
        int scaleSize;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1591374e", new Object[]{textViewArr});
        } else if (DataProviderFactory.getDataProvider().enableElder()) {
            for (TextView textView : textViewArr) {
                if (textView != null && (scaleSize = getScaleSize((pxTodip = ScreenUtil.pxTodip(DataProviderFactory.getApplicationContext(), textView.getTextSize())))) != pxTodip) {
                    textView.setTextSize(1, scaleSize);
                }
            }
        }
    }
}
