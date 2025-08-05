package com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.taobao.R;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class RefreshHeadView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int STATE_ICON_LEFT_PADDING = 0;
    public static final int TYPE_FOOTER = 2;
    public static final int TYPE_FOOTER_HORIZONTAL = 4;
    public static final int TYPE_HEADER = 1;
    public static final int TYPE_HEADER_HORIZONTAL = 3;
    private static Typeface sIconfont;
    private static int sReference;
    private TextView mArrow;
    private TextView mLastRefresh;
    private CustomProgressBar mProgressbar;
    private TextView mrefreshState;

    public static /* synthetic */ Object ipc$super(RefreshHeadView refreshHeadView, String str, Object... objArr) {
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
        kge.a(-512372019);
        STATE_ICON_LEFT_PADDING = 10;
        sReference = 0;
    }

    public RefreshHeadView(Context context, int i, View view, View view2) {
        super(context);
        init(context, i, view2);
        emu.a("com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh.RefreshHeadView");
    }

    private void init(Context context, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e9c0880", new Object[]{this, context, new Integer(i), view});
            return;
        }
        float f = getResources().getDisplayMetrics().density;
        setOrientation(1);
        setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        if (view != null) {
            addView(view, layoutParams);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setGravity(1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        frameLayout.addView(relativeLayout, layoutParams2);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(123456);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(9, -1);
        layoutParams3.addRule(15, -1);
        layoutParams3.topMargin = (int) (32.0f * f);
        layoutParams3.bottomMargin = (int) (24.0f * f);
        relativeLayout.addView(frameLayout2, layoutParams3);
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 17;
        frameLayout2.addView(textView, layoutParams4);
        this.mArrow = textView;
        this.mArrow.setIncludeFontPadding(false);
        this.mArrow.setTextColor(-16442584);
        this.mArrow.setTextSize(1, 20.0f);
        this.mArrow.setText(i == 0 ? "" : getContext().getResources().getString(i));
        CustomProgressBar customProgressBar = new CustomProgressBar(context);
        int i2 = (int) (28.0f * f);
        new FrameLayout.LayoutParams(i2, i2).gravity = 16;
        this.mProgressbar = customProgressBar;
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(1, frameLayout2.getId());
        layoutParams5.leftMargin = (int) (STATE_ICON_LEFT_PADDING * f);
        layoutParams5.addRule(15);
        relativeLayout.addView(relativeLayout2, layoutParams5);
        TextView textView2 = new TextView(context);
        textView2.setText(com.alibaba.ability.localization.b.a(R.string.x_detail_app_pull_refresh));
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(-16442584);
        textView2.setMaxLines(3);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams((int) (f * 100.0f), -2);
        layoutParams6.gravity = 17;
        relativeLayout2.addView(textView2, layoutParams6);
        this.mrefreshState = textView2;
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
        TextView textView = this.mrefreshState;
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = this.mArrow;
        if (textView2 == null) {
            return;
        }
        textView2.setTextColor(i);
    }

    public void setProgressBarInitState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b8f870", new Object[]{this, new Boolean(z)});
        } else {
            this.mProgressbar.isInitShow(z);
        }
    }

    public TextView getArrow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("9a90f7ce", new Object[]{this}) : this.mArrow;
    }

    public CustomProgressBar getProgressbar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CustomProgressBar) ipChange.ipc$dispatch("22d10f66", new Object[]{this}) : this.mProgressbar;
    }

    public TextView getrefreshStateText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("3819c94", new Object[]{this}) : this.mrefreshState;
    }

    public TextView getLastRefreshText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("1f6529f7", new Object[]{this}) : this.mLastRefresh;
    }

    public void setPullDownDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6120ffe", new Object[]{this, new Integer(i)});
        } else {
            this.mProgressbar.setPullDownDistance(i);
        }
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
                sIconfont = Typeface.createFromAsset(getContext().getAssets(), "uik_iconfont.ttf");
            } catch (Exception e) {
                i.a("RefreshHeadView", "onAttachedToWindow", e);
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
}
