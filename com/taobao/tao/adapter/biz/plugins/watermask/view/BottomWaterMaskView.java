package com.taobao.tao.adapter.biz.plugins.watermask.view;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;
import tb.ocw;

/* loaded from: classes8.dex */
public class BottomWaterMaskView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(181191306);
    }

    public static /* synthetic */ Object ipc$super(BottomWaterMaskView bottomWaterMaskView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public BottomWaterMaskView(Context context, String str, String str2) {
        super(context);
        initView(str, str2);
    }

    private void initView(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea514f0", new Object[]{this, str, str2});
            return;
        }
        setOrientation(1);
        addLogoView(str2);
        addIdView(str);
    }

    private void addLogoView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f050282", new Object[]{this, str});
            return;
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(BitmapFactory.decodeFile(str));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ocw.a(getContext(), 76.0f), ocw.a(getContext(), 19.0f));
        layoutParams.gravity = 5;
        addView(imageView, layoutParams);
    }

    private void addIdView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97a2a32", new Object[]{this, str});
            return;
        }
        TextView textView = new TextView(getContext());
        textView.setTextSize(10.0f);
        textView.setShadowLayer(1.0f, 1.0f, 1.0f, Color.parseColor("#7F000000"));
        textView.setTextColor(Color.parseColor("#F8F8F8"));
        textView.setText(b.a(R.string.taobao_app_1010_1_18165) + str);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 5;
        layoutParams.topMargin = ocw.a(getContext(), 3.0f);
        addView(textView, layoutParams);
    }
}
