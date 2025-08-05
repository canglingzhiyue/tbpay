package com.taobao.tao.infoflow.multitab.viewprovider.tablayout;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.android.home.component.utils.j;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.MultiTabLayout;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;
import tb.kin;
import tb.lmt;
import tb.onq;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lmt f20650a;
    private final boolean c = j.a("fixHomeSubTabLayoutImageMargin", true);
    private final boolean b = j.a("fixHomeSubTabLayoutImageSize", true);

    static {
        kge.a(-117665095);
    }

    public b(lmt lmtVar) {
        this.f20650a = lmtVar;
    }

    public View a(Context context, int i, boolean z) {
        View textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c2a16293", new Object[]{this, context, new Integer(i), new Boolean(z)});
        }
        lmt.a aVar = this.f20650a.u.get(Integer.valueOf(i));
        String a2 = this.f20650a.a(i, z);
        if (aVar == null) {
            return null;
        }
        String str = aVar.f30723a;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int a3 = f.a(context, this.f20650a.n);
        int a4 = f.a(context, this.f20650a.E);
        if (!this.f20650a.a(aVar) || TextUtils.isEmpty(a2)) {
            textView = new TextView(context);
            TextView textView2 = (TextView) textView;
            textView2.setTextColor(this.f20650a.a(z));
            textView2.setTextSize(0, f.a(context, z ? this.f20650a.i : this.f20650a.h));
            textView2.setText(str);
            textView2.setTypeface(Typeface.defaultFromStyle(1));
            textView2.setMaxLines(1);
            textView2.setIncludeFontPadding(false);
            textView2.setGravity(17);
            if (i != 0) {
                a4 = a3;
            }
            textView.setPadding(a4, 0, a3, 0);
        } else {
            textView = new TUrlImageView(context);
            if (a2.endsWith("apng") || a2.endsWith(kin.GIF_MODE)) {
                ((TUrlImageView) textView).setSkipAutoSize(true);
            }
            TUrlImageView tUrlImageView = (TUrlImageView) textView;
            onq.a(tUrlImageView, a2, "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
            tUrlImageView.setImageUrl(a2);
            tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            layoutParams.gravity = 17;
            layoutParams.width = f.a(context, this.f20650a.j);
            layoutParams.height = f.a(context, this.f20650a.k);
            a(context, layoutParams, str);
            if (this.f20650a.d() && this.f20650a.e()) {
                if (i != 0) {
                    a4 = a3;
                }
                layoutParams.leftMargin = a4;
                layoutParams.rightMargin = a3;
            } else if (this.c && this.f20650a.n > 7) {
                int i2 = this.f20650a.n - 7;
                if (i != 0) {
                    a4 = f.a(context, i2);
                }
                layoutParams.leftMargin = a4;
                layoutParams.rightMargin = f.a(context, i2);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(",");
            sb.append(z ? "已选中" : "未选中");
            textView.setContentDescription(sb.toString());
        }
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private void a(Context context, LinearLayout.LayoutParams layoutParams, String str) {
        Rect rect;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b281df", new Object[]{this, context, layoutParams, str});
        } else if (!this.b || TextUtils.isEmpty(str) || this.f20650a.h == 0) {
        } else {
            TextPaint textPaint = new TextPaint();
            float a2 = f.a(context, this.f20650a.h);
            textPaint.setTextSize(a2);
            textPaint.setTypeface(Typeface.defaultFromStyle(1));
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            textPaint.getTextBounds(str, 0, str.length(), new Rect());
            float f = ((rect.top + rect.bottom) / 2.0f) - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
            float f2 = (rect.bottom - rect.top) / a2;
            if (f2 >= 1.0f) {
                return;
            }
            layoutParams.width = f.a(context, this.f20650a.j * f2);
            layoutParams.height = f.a(context, this.f20650a.k * f2);
            layoutParams.topMargin = Math.round(f);
        }
    }

    public View a(MultiTabLayout multiTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1a2b9e8a", new Object[]{this, multiTabLayout});
        }
        MultiTabLayout.a indicatorConfig = multiTabLayout.getIndicatorConfig();
        View view = new View(multiTabLayout.getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(indicatorConfig.d);
        gradientDrawable.setColor(indicatorConfig.e);
        view.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(indicatorConfig.b, indicatorConfig.f20649a);
        view.setPadding(0, 0, 0, indicatorConfig.c);
        view.setLayoutParams(layoutParams);
        return view;
    }

    public void a(View view, View view2, int i, lmt lmtVar, boolean z) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f561f7c", new Object[]{this, view, view2, new Integer(i), lmtVar, new Boolean(z)});
        } else if (view == null) {
        } else {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                textView.setTextColor(lmtVar.a(z));
                g.a("TabCustomViewBuilder", "updateTabView isSelected:" + z);
                textView.setTextSize(0, f.a(view.getContext(), z ? lmtVar.i : lmtVar.h));
            }
            if (view instanceof TUrlImageView) {
                String a2 = lmtVar.a(i, z);
                TUrlImageView tUrlImageView = (TUrlImageView) view;
                onq.a(tUrlImageView, a2, "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
                tUrlImageView.setImageUrl(a2);
            }
            if (view2 == null) {
                return;
            }
            if (!z) {
                i2 = 8;
            }
            view2.setVisibility(i2);
            Drawable background = view2.getBackground();
            if (!(background instanceof GradientDrawable)) {
                return;
            }
            ((GradientDrawable) background).setColor(lmtVar.b());
        }
    }
}
