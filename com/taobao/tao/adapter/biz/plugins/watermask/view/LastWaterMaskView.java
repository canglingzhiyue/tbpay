package com.taobao.tao.adapter.biz.plugins.watermask.view;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.widget.FrameLayout;
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
public class LastWaterMaskView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-78123201);
    }

    public static /* synthetic */ Object ipc$super(LastWaterMaskView lastWaterMaskView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public LastWaterMaskView(Context context, String str, String str2, String str3, String str4) {
        super(context);
        initView(str, str2, str3, str4);
    }

    private void initView(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da649204", new Object[]{this, str, str2, str3, str4});
            return;
        }
        setOrientation(1);
        addNameView(str2);
        addSearchView(str, str3);
        addGuideView(str4);
    }

    private void addNameView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5bb5f62", new Object[]{this, str});
            return;
        }
        TextView textView = new TextView(getContext());
        textView.setTextSize(14.0f);
        textView.getPaint().setFakeBoldText(true);
        textView.setGravity(1);
        textView.setShadowLayer(1.0f, 1.0f, 1.0f, Color.parseColor("#7F000000"));
        textView.setTextColor(Color.parseColor("#999999"));
        textView.setText(str);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = ocw.a(getContext(), 10.0f);
        layoutParams.gravity = 1;
        addView(textView, layoutParams);
    }

    private void addSearchView(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("175dfc09", new Object[]{this, str, str2});
            return;
        }
        LinearLayout addSearchContainer = addSearchContainer();
        addSearchIcon(addSearchContainer, str2);
        addSearchTv(str, addSearchContainer);
    }

    private LinearLayout addSearchContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("82d74236", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundDrawable(ocw.a(ocw.a(getContext(), 20.0f), ocw.a(getContext(), 1.0f), Color.parseColor("#ff5000")));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ocw.a(getContext(), 300.0f), ocw.a(getContext(), 40.0f));
        layoutParams.topMargin = ocw.a(getContext(), 15.0f);
        layoutParams.gravity = 1;
        addView(frameLayout, layoutParams);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        frameLayout.addView(linearLayout, layoutParams2);
        return linearLayout;
    }

    private void addSearchIcon(LinearLayout linearLayout, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad0da88", new Object[]{this, linearLayout, str});
            return;
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(BitmapFactory.decodeFile(str));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ocw.a(getContext(), 14.0f), ocw.a(getContext(), 14.0f));
        layoutParams.rightMargin = ocw.a(getContext(), 5.0f);
        layoutParams.gravity = 16;
        linearLayout.addView(imageView, layoutParams);
    }

    private void addSearchTv(String str, LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ded40b", new Object[]{this, str, linearLayout});
            return;
        }
        TextView textView = new TextView(getContext());
        textView.setTextSize(15.0f);
        textView.setSingleLine();
        textView.getPaint().setFakeBoldText(true);
        textView.setShadowLayer(1.0f, 1.0f, 1.0f, Color.parseColor("#7F000000"));
        textView.setGravity(16);
        textView.setTextColor(Color.parseColor("#F8F8F8"));
        textView.setText(b.a(R.string.taobao_app_1010_1_18151) + str);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 16;
        linearLayout.addView(textView, layoutParams);
    }

    private void addGuideView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7613ab1", new Object[]{this, str});
            return;
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(BitmapFactory.decodeFile(str));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ocw.a(getContext(), 300.0f), ocw.a(getContext(), 75.0f));
        layoutParams.gravity = 1;
        addView(imageView, layoutParams);
    }
}
