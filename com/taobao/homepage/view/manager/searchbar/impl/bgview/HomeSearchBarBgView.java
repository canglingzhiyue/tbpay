package com.taobao.homepage.view.manager.searchbar.impl.bgview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.android.home.component.view.HImageView;
import tb.kge;
import tb.onq;

/* loaded from: classes7.dex */
public class HomeSearchBarBgView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HImageView mBgView;
    private int mDefaultBgColor;
    private String mDefaultBgImgUrl;

    static {
        kge.a(249719838);
    }

    public HomeSearchBarBgView(Context context) {
        super(context);
        init();
    }

    public HomeSearchBarBgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public HomeSearchBarBgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mBgView = new HImageView(getContext());
        this.mBgView.setFadeIn(true);
        this.mBgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.mBgView, new ViewGroup.LayoutParams(-1, -1));
    }

    public void recordDefaultBg(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef68d1dd", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.mDefaultBgImgUrl = str;
        this.mDefaultBgColor = i;
    }

    public void restoreToDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f59114df", new Object[]{this});
            return;
        }
        onq.a(this.mBgView, this.mDefaultBgImgUrl, "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
        this.mBgView.setBackgroundColor(this.mDefaultBgColor);
        this.mBgView.setImageUrl(this.mDefaultBgImgUrl);
    }

    public void updateCustomBg(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("849c4c33", new Object[]{this, str, new Integer(i)});
            return;
        }
        onq.a(this.mBgView, str, "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
        if (!TextUtils.isEmpty(str)) {
            this.mBgView.setImageUrl(str);
            return;
        }
        this.mBgView.setImageUrl(null);
        this.mBgView.setBackgroundColor(i);
    }
}
