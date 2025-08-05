package com.taobao.browser.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes6.dex */
public class TabBarItem extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView mBtn;
    private String mId;
    private LinearLayout mLayout;
    public int normalColor;
    private int selectedColor;

    static {
        kge.a(-732297791);
    }

    public static /* synthetic */ Object ipc$super(TabBarItem tabBarItem, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TabBarItem(Context context) {
        super(context);
        this.selectedColor = -10591122;
        this.normalColor = -1118482;
    }

    public TabBarItem(Context context, LinearLayout linearLayout) {
        super(context);
        this.selectedColor = -10591122;
        this.normalColor = -1118482;
        this.mLayout = linearLayout;
        this.mBtn = (TextView) linearLayout.findViewById(R.id.tabBarButton);
    }

    public void setButton(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e95ce5", new Object[]{this, str, new Integer(i), new Integer(i2)});
            return;
        }
        this.mBtn.setText(str);
        this.mBtn.setWidth(i);
        GradientDrawable makeGd = makeGd(i2);
        makeGd.setColor(this.normalColor);
        this.mBtn.setBackgroundDrawable(makeGd);
        this.mBtn.setTag(Integer.valueOf(i2));
    }

    public void doClick(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63c2590", new Object[]{this, new Boolean(z)});
            return;
        }
        GradientDrawable makeGd = makeGd(((Integer) this.mBtn.getTag()).intValue());
        if (z) {
            makeGd.setColor(this.selectedColor);
            this.mBtn.setTextColor(-1);
        } else {
            makeGd.setColor(this.normalColor);
            this.mBtn.setTextColor(this.selectedColor);
        }
        this.mBtn.setBackgroundDrawable(makeGd);
    }

    public void setItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7375121", new Object[]{this, str});
        } else {
            this.mId = str;
        }
    }

    public String getItemId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this}) : this.mId;
    }

    private GradientDrawable makeGd(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("27a563f9", new Object[]{this, new Integer(i)});
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i == 1) {
            gradientDrawable.setCornerRadii(new float[]{8.0f, 8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 8.0f});
        } else if (i == 2) {
            gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 8.0f, 8.0f, 8.0f, 8.0f, 0.0f, 0.0f});
        }
        gradientDrawable.setStroke(2, this.selectedColor);
        return gradientDrawable;
    }
}
