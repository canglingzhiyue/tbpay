package com.taobao.android.dinamicx.widget.recycler.refresh;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class TBRefreshHeader extends TBAbsRefreshHeader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Typeface sIconfont;
    private static int sReference;
    private TextView mArrowTextView;
    private String[] mDefaultRefreshTips;
    private ObjectAnimator mFadeAnimationSet;
    private RefreshHeadView mRefreshHeadView;
    private FrameLayout mRefreshHeaderView;
    private CustomProgressBar mRefreshProgressView;
    private TextView mRefreshTipView;
    private String[] mRefreshTips;
    private View mSecondFloorView;

    /* renamed from: com.taobao.android.dinamicx.widget.recycler.refresh.TBRefreshHeader$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12150a = new int[TBAbsRefreshHeader.RefreshState.values().length];

        static {
            try {
                f12150a[TBAbsRefreshHeader.RefreshState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12150a[TBAbsRefreshHeader.RefreshState.PULL_TO_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12150a[TBAbsRefreshHeader.RefreshState.RELEASE_TO_REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12150a[TBAbsRefreshHeader.RefreshState.REFRESHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12150a[TBAbsRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12150a[TBAbsRefreshHeader.RefreshState.SECOND_FLOOR_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12150a[TBAbsRefreshHeader.RefreshState.SECOND_FLOOR_END.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(TBRefreshHeader tBRefreshHeader, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader
    public void setRefreshAnimation(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9e81f7", new Object[]{this, strArr, str});
        }
    }

    static {
        kge.a(-1094678610);
        sReference = 0;
    }

    public TBRefreshHeader(Context context) {
        super(context);
        this.mDefaultRefreshTips = new String[]{getContext().getString(R.string.dx_uik_pull_to_refresh), getContext().getString(R.string.dx_uik_release_to_refresh), getContext().getString(R.string.dx_uik_refreshing), getContext().getString(R.string.dx_uik_refresh_finished)};
        this.mRefreshTips = new String[]{getContext().getString(R.string.dx_uik_pull_to_refresh), getContext().getString(R.string.dx_uik_release_to_refresh), getContext().getString(R.string.dx_uik_refreshing), getContext().getString(R.string.dx_uik_refresh_finished)};
        this.mRefreshHeaderView = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.mRefreshHeaderView.setId(R.id.uik_refresh_header);
        addView(this.mRefreshHeaderView, layoutParams);
        this.mSecondFloorView = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        this.mSecondFloorView.setId(R.id.uik_refresh_header_second_floor);
        this.mRefreshHeaderView.addView(this.mSecondFloorView, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        this.mRefreshHeadView = new RefreshHeadView(context, R.string.dx_uik_refresh_arrow, null, false);
        this.mRefreshHeaderView.addView(this.mRefreshHeadView, layoutParams3);
        this.mRefreshTipView = this.mRefreshHeadView.getRefreshStateText();
        this.mRefreshProgressView = this.mRefreshHeadView.getProgressbar();
        this.mArrowTextView = this.mRefreshHeadView.getArrow();
        changeToState(TBAbsRefreshHeader.RefreshState.NONE);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        this.mRefreshProgressView.setPullDownDistance(getMeasuredHeight());
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader
    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
        } else if (this.mState != TBAbsRefreshHeader.RefreshState.PULL_TO_REFRESH) {
        } else {
            if (getMeasuredHeight() != 0) {
                this.mRefreshProgressView.changeProgressBarState((int) (getMeasuredHeight() * f));
            }
            changeHeaderAlpha(f);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader
    public void changeToState(TBAbsRefreshHeader.RefreshState refreshState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54293baa", new Object[]{this, refreshState});
        } else if (this.mRefreshProgressView == null || this.mState == refreshState) {
        } else {
            this.mState = refreshState;
            int i = AnonymousClass1.f12150a[this.mState.ordinal()];
            if (i == 1) {
                this.mRefreshProgressView.stopLoadingAnimation();
                TextView textView = this.mRefreshTipView;
                String[] strArr = this.mRefreshTips;
                textView.setText(strArr == null ? this.mDefaultRefreshTips[3] : strArr[3]);
                this.mRefreshProgressView.stopLoadingAnimation();
                changeHeaderAlpha(1.0f);
            } else if (i == 2) {
                showArrow();
                this.mRefreshTipView.setVisibility(0);
                TextView textView2 = this.mRefreshTipView;
                String[] strArr2 = this.mRefreshTips;
                textView2.setText(strArr2 == null ? this.mDefaultRefreshTips[0] : strArr2[0]);
                this.mRefreshHeadView.setVisibility(0);
            } else if (i == 3) {
                startArrowAnim();
                TextView textView3 = this.mRefreshTipView;
                String[] strArr3 = this.mRefreshTips;
                textView3.setText(strArr3 == null ? this.mDefaultRefreshTips[1] : strArr3[1]);
                this.mRefreshHeadView.setVisibility(0);
            } else if (i != 4) {
                if (i != 5) {
                    return;
                }
                this.mRefreshHeadView.setVisibility(8);
            } else {
                this.mRefreshProgressView.startLoadingAnimaton();
                this.mRefreshProgressView.setVisibility(0);
                this.mArrowTextView.setVisibility(4);
                TextView textView4 = this.mRefreshTipView;
                String[] strArr4 = this.mRefreshTips;
                textView4.setText(strArr4 == null ? this.mDefaultRefreshTips[2] : strArr4[2]);
                this.mRefreshHeadView.setVisibility(0);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader
    public View getRefreshView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("378be073", new Object[]{this}) : this.mRefreshHeadView;
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader
    public View getSecondFloorView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d44bd650", new Object[]{this}) : this.mSecondFloorView;
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader
    public void setSecondFloorView(View view) {
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1b4090", new Object[]{this, view});
        } else if (this.mSecondFloorView != null) {
            if (this.mRefreshHeaderView == null) {
                return;
            }
            if (view.getLayoutParams() == null) {
                layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            } else {
                layoutParams2 = new FrameLayout.LayoutParams(view.getLayoutParams());
            }
            layoutParams2.gravity = 80;
            this.mRefreshHeaderView.removeView(this.mSecondFloorView);
            this.mRefreshHeaderView.addView(view, 0, layoutParams2);
            this.mSecondFloorView = view;
            this.mSecondFloorView.setId(R.id.uik_refresh_header_second_floor);
        } else if (this.mRefreshHeaderView == null) {
        } else {
            if (view.getLayoutParams() == null) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            } else {
                layoutParams = new FrameLayout.LayoutParams(view.getLayoutParams());
            }
            layoutParams.gravity = 80;
            this.mRefreshHeaderView.addView(view, 0, layoutParams);
            this.mSecondFloorView = view;
            this.mSecondFloorView.setId(R.id.uik_refresh_header_second_floor);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader
    public void setRefreshTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e253df27", new Object[]{this, strArr});
        } else if (strArr == null || strArr.length < 4) {
            this.mRefreshTips = null;
        } else {
            this.mRefreshTips = strArr;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader
    public void setRefreshTipColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e29913b", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mRefreshTipView;
        if (textView == null) {
            return;
        }
        textView.setTextColor(i);
    }

    public void setRefreshTipSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a646859", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mRefreshTipView;
        if (textView == null) {
            return;
        }
        textView.setTextSize(i);
        this.mRefreshTipView.setSingleLine(true);
        this.mRefreshTipView.setMaxLines(1);
        ViewGroup.LayoutParams layoutParams = this.mRefreshTipView.getLayoutParams();
        layoutParams.width = -2;
        this.mRefreshTipView.setLayoutParams(layoutParams);
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
        this.mRefreshHeadView.setAlpha(f);
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
}
