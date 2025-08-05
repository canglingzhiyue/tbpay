package com.taobao.browser.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes6.dex */
public class FlowBarItem extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Drawable[] drawableImg;
    private View mBottomLine;
    private ImageView mImg;
    private LinearLayout mLayout;
    private TextView mText;

    static {
        kge.a(-1745906328);
    }

    public void init(int i, String str, String str2, int i2, int i3, int i4, String str3, String str4, int i5, int i6, int i7, int i8, String str5, String str6, String str7, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48f33d49", new Object[]{this, new Integer(i), str, str2, new Integer(i2), new Integer(i3), new Integer(i4), str3, str4, new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), str5, str6, str7, str8, str9});
        }
    }

    public FlowBarItem(Context context) {
        super(context);
        this.drawableImg = new Drawable[2];
    }

    public FlowBarItem(Context context, LinearLayout linearLayout) {
        super(context);
        this.drawableImg = new Drawable[2];
        this.mLayout = linearLayout;
        this.mImg = (ImageView) linearLayout.findViewById(R.id.flowBarImg);
        this.mText = (TextView) linearLayout.findViewById(R.id.flowBarText);
        this.mBottomLine = linearLayout.findViewById(R.id.flowBarBottomLine);
    }

    public void setSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6e006a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mLayout.setLayoutParams(new LinearLayout.LayoutParams(i, i2));
        int i3 = i2 / 2;
        this.mImg.setMinimumHeight(i3);
        this.mImg.setMaxHeight(i3);
    }

    public void setFont(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73d2ef5", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        this.mText.setTextColor(i);
        this.mText.setTextSize(2, f);
        this.mText.setTypeface(Typeface.defaultFromStyle(1));
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.mText.setText(str);
        }
    }

    public void setDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17dcaf4b", new Object[]{this, drawable});
        } else {
            this.mImg.setImageDrawable(drawable);
        }
    }

    public void setBottomLine(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b54cab1", new Object[]{this, str, new Integer(i)});
            return;
        }
        View view = this.mBottomLine;
        view.setBackgroundColor(Color.parseColor("#" + str));
        this.mBottomLine.setLayoutParams(new LinearLayout.LayoutParams(-1, i * 2));
    }

    public void changeState(boolean z, int i) {
        TranslateAnimation translateAnimation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55465377", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        if (z) {
            this.mBottomLine.setVisibility(0);
            if (i == 1) {
                translateAnimation = new TranslateAnimation(1, -1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            } else if (i != 2) {
                return;
            } else {
                translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            }
        } else {
            this.mBottomLine.setVisibility(8);
            if (i == 1) {
                translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
            } else if (i != 2) {
                return;
            } else {
                translateAnimation = new TranslateAnimation(1, 0.0f, 1, -1.0f, 1, 0.0f, 1, 0.0f);
            }
        }
        translateAnimation.setDuration(150L);
        this.mBottomLine.startAnimation(translateAnimation);
    }
}
