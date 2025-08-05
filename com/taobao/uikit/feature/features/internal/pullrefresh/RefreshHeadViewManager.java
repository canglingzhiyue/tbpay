package com.taobao.uikit.feature.features.internal.pullrefresh;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.alibaba.android.ultron.common.page.i;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.utils.UIKITLog;
import tb.kge;

@Deprecated
/* loaded from: classes9.dex */
public class RefreshHeadViewManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RefreshHeadViewManager";
    public static final int TYPE_FOOTER = 2;
    public static final int TYPE_FOOTER_HORIZONTAL = 4;
    public static final int TYPE_HEADER = 1;
    public static final int TYPE_HEADER_HORIZONTAL = 3;
    private TextView mArrowTextView;
    private ObjectAnimator mFadeAnimationSet;
    private int mHeadContentHeight;
    private int mHeadContentWidth;
    private RefreshHeadView mHeadView;
    private boolean mIsFinish;
    private int mLogoImageHeight;
    private CustomProgressBar mProgressBar;
    private String[] mTipArray;
    private TextView mTipsTextView;
    private int mType;

    static {
        kge.a(1108136991);
    }

    public void setUpdatedTextView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244f4adc", new Object[]{this, str});
        }
    }

    public RefreshHeadViewManager(Context context, Drawable drawable, View view, View view2, int i) {
        this(context, R.string.uik_refresh_arrow, view2, true, i);
    }

    public RefreshHeadViewManager(Context context, int i, View view, boolean z, int i2) {
        this.mIsFinish = false;
        this.mLogoImageHeight = 0;
        this.mHeadView = new RefreshHeadView(context, i, view, z);
        this.mArrowTextView = this.mHeadView.getArrow();
        this.mProgressBar = this.mHeadView.getProgressbar();
        this.mTipsTextView = this.mHeadView.getRefreshStateText();
        measureView(this.mHeadView);
        this.mHeadContentHeight = this.mHeadView.getMeasuredHeight();
        this.mHeadContentWidth = this.mHeadView.getMeasuredWidth();
        if (i2 == 1 || i2 == 2) {
            this.mHeadView.setPullDownDistance(this.mHeadContentHeight);
        } else {
            this.mHeadView.setPullDownDistance(this.mHeadContentWidth);
        }
        this.mType = i2;
        if (i2 == 1) {
            this.mHeadView.setPadding(0, this.mHeadContentHeight * (-1), 0, 0);
        } else if (i2 == 2) {
            this.mHeadView.setPadding(0, 0, 0, this.mHeadContentHeight * (-1));
        } else if (i2 == 3) {
            this.mHeadView.setPadding(this.mHeadContentWidth * (-1), 0, 0, 0);
        } else {
            this.mHeadView.setPadding(0, 0, this.mHeadContentWidth * (-1), 0);
        }
        this.mHeadView.invalidate();
    }

    public void isHeadViewHeightContainImage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f5a750", new Object[]{this, new Boolean(z)});
        } else if (z) {
        } else {
            View childAt = this.mHeadView.getChildAt(1);
            if (childAt != null) {
                this.mLogoImageHeight = childAt.getMeasuredHeight();
            }
            this.mHeadView.setPullDownDistance(this.mLogoImageHeight);
        }
    }

    public void setViewPadding(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4db72183", new Object[]{this, new Boolean(z)});
            return;
        }
        int i = this.mType;
        if ((i != 2 && i != 4) || !z) {
            return;
        }
        this.mHeadView.setPadding(0, 0, 0, 0);
    }

    public void setRefreshViewColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bd8ad7", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadView refreshHeadView = this.mHeadView;
        if (refreshHeadView == null) {
            return;
        }
        refreshHeadView.setRefreshViewColor(i);
    }

    public void setRefreshBackground(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d973fd95", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadView refreshHeadView = this.mHeadView;
        if (refreshHeadView == null) {
            return;
        }
        refreshHeadView.setBackgroundColor(i);
    }

    public void setProgressBarInitState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b8f870", new Object[]{this, new Boolean(z)});
            return;
        }
        RefreshHeadView refreshHeadView = this.mHeadView;
        if (refreshHeadView == null) {
            return;
        }
        refreshHeadView.setProgressBarInitState(z);
    }

    public void setTipArray(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7fa438", new Object[]{this, strArr});
        } else {
            this.mTipArray = strArr;
        }
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.mHeadView;
    }

    public void measureView(View view) {
        int makeMeasureSpec;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca053468", new Object[]{this, view});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        if (i > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, makeMeasureSpec);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce01816", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            this.mHeadView.setPadding(i, i2, i3, i4);
        }
    }

    public int getPaddingTop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue() : this.mHeadView.getPaddingTop();
    }

    public int getPaddingBottom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("86af8f60", new Object[]{this})).intValue() : this.mHeadView.getPaddingBottom();
    }

    public int getPaddingLeft() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("111699fc", new Object[]{this})).intValue() : this.mHeadView.getPaddingLeft();
    }

    public int getPaddingRight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4f2526fb", new Object[]{this})).intValue() : this.mHeadView.getPaddingRight();
    }

    public int getHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue() : this.mHeadContentHeight;
    }

    public int getWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue() : this.mHeadContentWidth;
    }

    public int getImageHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f0bdcba6", new Object[]{this})).intValue() : this.mLogoImageHeight;
    }

    public void setFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdbdd0b8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsFinish = z;
        if (this.mIsFinish) {
            this.mArrowTextView.setVisibility(0);
            this.mTipsTextView.setVisibility(0);
            this.mProgressBar.setVisibility(0);
            this.mProgressBar.stopLoadingAnimation();
            String[] strArr = this.mTipArray;
            if (strArr == null || strArr.length <= 3) {
                return;
            }
            this.mTipsTextView.setText(strArr == null ? i.LOAD_FINISH : strArr[3]);
            return;
        }
        this.mArrowTextView.setVisibility(4);
        this.mProgressBar.setVisibility(4);
        this.mTipsTextView.setVisibility(4);
    }

    public void changeHeaderViewByState(int i) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d19ce4", new Object[]{this, new Integer(i)});
        } else if (this.mIsFinish) {
        } else {
            if (i == 0) {
                this.mProgressBar.setVisibility(0);
                this.mTipsTextView.setVisibility(0);
                TextView textView = this.mTipsTextView;
                String[] strArr = this.mTipArray;
                textView.setText((strArr == null || strArr.length < 2) ? "松开刷新" : strArr[1]);
                startArrowAnim();
                UIKITLog.v(TAG, "当前状态，松开刷新", new Object[0]);
            } else if (i == 1) {
                this.mTipsTextView.setVisibility(0);
                TextView textView2 = this.mTipsTextView;
                String[] strArr2 = this.mTipArray;
                textView2.setText((strArr2 == null || strArr2.length <= 0) ? "下拉刷新" : strArr2[0]);
                showArrow();
                UIKITLog.v(TAG, "当前状态，下拉刷新", new Object[0]);
            } else if (i == 2) {
                this.mTipsTextView.setVisibility(0);
                TextView textView3 = this.mTipsTextView;
                String[] strArr3 = this.mTipArray;
                textView3.setText((strArr3 == null || strArr3.length < 3) ? "正在刷新..." : strArr3[2]);
                this.mProgressBar.setVisibility(0);
                this.mProgressBar.startLoadingAnimaton();
                this.mArrowTextView.setVisibility(4);
                UIKITLog.v(TAG, "当前状态,正在刷新...", new Object[0]);
                View findViewById2 = this.mHeadView.findViewById(R.id.uik_refresh_header_view);
                if (findViewById2 == null) {
                    return;
                }
                findViewById2.setAlpha(1.0f);
            } else if (i != 3) {
                if (i != 5 || (findViewById = this.mHeadView.findViewById(R.id.uik_refresh_header_view)) == null) {
                    return;
                }
                findViewById.setAlpha(0.0f);
            } else {
                this.mProgressBar.stopLoadingAnimation();
                TextView textView4 = this.mTipsTextView;
                String[] strArr4 = this.mTipArray;
                textView4.setText((strArr4 == null || strArr4.length < 3) ? "数据加载完毕" : strArr4[3]);
                UIKITLog.v(TAG, "当前状态，done", new Object[0]);
                View findViewById3 = this.mHeadView.findViewById(R.id.uik_refresh_header_view);
                if (findViewById3 == null) {
                    return;
                }
                findViewById3.setAlpha(1.0f);
            }
        }
    }

    public void changeProgressBarState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8212e1", new Object[]{this, new Integer(i)});
        } else {
            this.mProgressBar.changeProgressBarState(i);
        }
    }

    public void changeHeaderAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588897b8", new Object[]{this, new Float(f)});
            return;
        }
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.mHeadView.findViewById(R.id.uik_refresh_header_view).setAlpha(f);
    }

    private void startArrowAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a536afff", new Object[]{this});
            return;
        }
        if (this.mFadeAnimationSet == null) {
            this.mFadeAnimationSet = ObjectAnimator.ofPropertyValuesHolder(this.mArrowTextView, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
            this.mFadeAnimationSet.setInterpolator(new AccelerateDecelerateInterpolator());
            this.mFadeAnimationSet.setDuration(200L);
        }
        this.mFadeAnimationSet.start();
    }

    private void showArrow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c8d1d93", new Object[]{this});
            return;
        }
        ObjectAnimator objectAnimator = this.mFadeAnimationSet;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.mArrowTextView.setScaleX(1.0f);
        this.mArrowTextView.setScaleY(1.0f);
        this.mArrowTextView.setAlpha(1.0f);
        this.mArrowTextView.setVisibility(0);
    }

    public View getRefreshView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("378be073", new Object[]{this}) : this.mHeadView;
    }
}
