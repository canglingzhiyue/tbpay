package com.taobao.android.dinamicx.widget.viewpager.tab.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public final class TabItem extends View {
    public final int mCustomLayout;
    public final Drawable mIcon;
    public final CharSequence mText;

    static {
        kge.a(-742160927);
    }

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.TabItem);
        this.mText = obtainStyledAttributes.getText(R.styleable.TabItem_android_text);
        this.mIcon = obtainStyledAttributes.getDrawable(R.styleable.TabItem_android_icon);
        this.mCustomLayout = obtainStyledAttributes.getResourceId(R.styleable.TabItem_android_layout, 0);
        obtainStyledAttributes.recycle();
    }
}
