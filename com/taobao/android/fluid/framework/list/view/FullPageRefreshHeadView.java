package com.taobao.android.fluid.framework.list.view;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.features.internal.pullrefresh.CustomProgressBar;
import tb.kge;

/* loaded from: classes5.dex */
public class FullPageRefreshHeadView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Typeface sIconfont;
    private static int sReference;
    private TextView mArrow;
    private CustomProgressBar mProgressbar;
    private TextView mRefreshState;

    public static /* synthetic */ Object ipc$super(FullPageRefreshHeadView fullPageRefreshHeadView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    static {
        kge.a(1732404800);
        sReference = 0;
    }

    public FullPageRefreshHeadView(Context context, int i) {
        super(context);
        init(context, i);
    }

    public TextView getArrow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("9a90f7ce", new Object[]{this}) : this.mArrow;
    }

    public CustomProgressBar getProgressbar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CustomProgressBar) ipChange.ipc$dispatch("72dd132b", new Object[]{this}) : this.mProgressbar;
    }

    public TextView getRefreshStateText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("a5f470b4", new Object[]{this}) : this.mRefreshState;
    }

    public void setProgressBarColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd7bb5dd", new Object[]{this, new Integer(i)});
            return;
        }
        CustomProgressBar customProgressBar = this.mProgressbar;
        if (customProgressBar == null) {
            return;
        }
        customProgressBar.setPaintColor(i);
    }

    public void setProgressBarInitState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b8f870", new Object[]{this, new Boolean(z)});
        } else {
            this.mProgressbar.isInitShow(z);
        }
    }

    public void setPullDownDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6120ffe", new Object[]{this, new Integer(i)});
        } else {
            this.mProgressbar.setPullDownDistance(i);
        }
    }

    public void setRefreshViewColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bd8ad7", new Object[]{this, new Integer(i)});
            return;
        }
        CustomProgressBar customProgressBar = this.mProgressbar;
        if (customProgressBar != null) {
            customProgressBar.setPaintColor(i);
        }
        TextView textView = this.mRefreshState;
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = this.mArrow;
        if (textView2 == null) {
            return;
        }
        textView2.setTextColor(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (sIconfont == null) {
            try {
                sIconfont = Typeface.createFromAsset(getContext().getAssets(), "uik_core_iconfont.ttf");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.mArrow.setTypeface(sIconfont);
        sReference++;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        this.mArrow.setTypeface(null);
        sReference--;
        if (sReference == 0) {
            sIconfont = null;
        }
        super.onDetachedFromWindow();
    }

    private void init(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b35ae312", new Object[]{this, context, new Integer(i)});
            return;
        }
        float f = getResources().getDisplayMetrics().density;
        setOrientation(1);
        setGravity(17);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setId(R.id.fluid_sdk_uik_refresh_header_view);
        linearLayout.setPadding((int) (f * 12.0f), 0, (int) (15.0f * f), 0);
        linearLayout.setBackgroundResource(R.drawable.fluid_sdk_pull_refresh_bg);
        addView(linearLayout, new ViewGroup.LayoutParams(-2, (int) (36.0f * f)));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-2, -2));
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(textView, layoutParams);
        this.mArrow = textView;
        this.mArrow.setIncludeFontPadding(false);
        this.mArrow.setTextColor(-6710887);
        this.mArrow.setText(i == 0 ? "" : getContext().getResources().getString(i));
        CustomProgressBar customProgressBar = new CustomProgressBar(context);
        int i2 = (int) (24.0f * f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.gravity = 16;
        frameLayout.addView(customProgressBar, layoutParams2);
        this.mProgressbar = customProgressBar;
        TextView textView2 = new TextView(context);
        textView2.setText("下拉刷新");
        textView2.setTextSize(12.0f);
        textView2.setTextColor(-6710887);
        textView2.setMaxLines(3);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = (int) (f * 9.0f);
        linearLayout.addView(textView2, layoutParams3);
        this.mRefreshState = textView2;
    }
}
