package com.taobao.uikit.extend.component.refresh;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter;
import com.taobao.uikit.feature.features.internal.pullrefresh.CustomProgressBar;
import tb.kge;

/* loaded from: classes9.dex */
public class TBDefaultLoadMoreFooter extends TBLoadMoreFooter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String[] mDefaultLoadMoreTips;
    private String[] mLoadMoreTips;
    private TextView mLoadMoreView;
    private CustomProgressBar mProgressbar;
    private TBLoadMoreFooter.LoadMoreState mState;

    /* renamed from: com.taobao.uikit.extend.component.refresh.TBDefaultLoadMoreFooter$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$refresh$TBLoadMoreFooter$LoadMoreState = new int[TBLoadMoreFooter.LoadMoreState.values().length];

        static {
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBLoadMoreFooter$LoadMoreState[TBLoadMoreFooter.LoadMoreState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBLoadMoreFooter$LoadMoreState[TBLoadMoreFooter.LoadMoreState.PUSH_TO_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBLoadMoreFooter$LoadMoreState[TBLoadMoreFooter.LoadMoreState.RELEASE_TO_LOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBLoadMoreFooter$LoadMoreState[TBLoadMoreFooter.LoadMoreState.LOADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(123331918);
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter
    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
        }
    }

    public TBDefaultLoadMoreFooter(Context context) {
        super(context);
        this.mState = TBLoadMoreFooter.LoadMoreState.NONE;
        this.mDefaultLoadMoreTips = new String[]{getContext().getString(R.string.uik_load_more), getContext().getString(R.string.uik_release_to_load), getContext().getString(R.string.uik_loading), getContext().getString(R.string.uik_load_more_finished)};
        this.mLoadMoreTips = new String[]{getContext().getString(R.string.uik_load_more), getContext().getString(R.string.uik_release_to_load), getContext().getString(R.string.uik_loading), getContext().getString(R.string.uik_load_more_finished)};
        float f = getResources().getDisplayMetrics().density;
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        linearLayout.setGravity(1);
        int i = (int) (12.0f * f);
        linearLayout.setPadding(0, i, 0, 0);
        addView(linearLayout, layoutParams);
        this.mProgressbar = new CustomProgressBar(context);
        this.mProgressbar.setId(R.id.uik_load_more_footer_progress);
        int i2 = (int) (f * 28.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, i2);
        layoutParams2.rightMargin = i;
        this.mProgressbar.setVisibility(8);
        linearLayout.addView(this.mProgressbar, layoutParams2);
        this.mLoadMoreView = new TextView(context);
        this.mLoadMoreView.setId(R.id.uik_load_more_footer_text);
        this.mLoadMoreView.setText(R.string.uik_load_more);
        this.mLoadMoreView.setTextSize(1, 10.0f);
        this.mLoadMoreView.setGravity(16);
        this.mLoadMoreView.setTextColor(Color.parseColor("#444444"));
        linearLayout.addView(this.mLoadMoreView, new LinearLayout.LayoutParams(-2, i2));
        setBackgroundResource(R.color.uik_load_more_footer_bg);
        changeToState(TBLoadMoreFooter.LoadMoreState.NONE);
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter
    public void changeToState(TBLoadMoreFooter.LoadMoreState loadMoreState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3beb65cb", new Object[]{this, loadMoreState});
        } else if (this.mLoadMoreView == null || this.mState == loadMoreState) {
        } else {
            if (this.mPushLoadMoreListener != null) {
                this.mPushLoadMoreListener.onLoadMoreStateChanged(this.mState, loadMoreState);
            }
            this.mState = loadMoreState;
            int i = AnonymousClass1.$SwitchMap$com$taobao$uikit$extend$component$refresh$TBLoadMoreFooter$LoadMoreState[this.mState.ordinal()];
            if (i == 1) {
                this.mProgressbar.stopLoadingAnimation();
                this.mProgressbar.setVisibility(8);
                TextView textView = this.mLoadMoreView;
                String[] strArr = this.mLoadMoreTips;
                textView.setText(strArr == null ? this.mDefaultLoadMoreTips[3] : strArr[3]);
            } else if (i == 2) {
                this.mProgressbar.stopLoadingAnimation();
                this.mProgressbar.setVisibility(8);
                TextView textView2 = this.mLoadMoreView;
                String[] strArr2 = this.mLoadMoreTips;
                textView2.setText(strArr2 == null ? this.mDefaultLoadMoreTips[0] : strArr2[0]);
                setVisibility(0);
            } else if (i == 3) {
                this.mProgressbar.stopLoadingAnimation();
                this.mProgressbar.setVisibility(8);
                TextView textView3 = this.mLoadMoreView;
                String[] strArr3 = this.mLoadMoreTips;
                textView3.setText(strArr3 == null ? this.mDefaultLoadMoreTips[1] : strArr3[1]);
                setVisibility(0);
            } else if (i != 4) {
            } else {
                this.mProgressbar.setVisibility(0);
                this.mProgressbar.startLoadingAnimaton();
                TextView textView4 = this.mLoadMoreView;
                String[] strArr4 = this.mLoadMoreTips;
                textView4.setText(strArr4 == null ? this.mDefaultLoadMoreTips[2] : strArr4[2]);
                setVisibility(0);
            }
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter
    public void setLoadMoreTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4990e3", new Object[]{this, strArr});
            return;
        }
        if (strArr == null || strArr.length != 4) {
            this.mLoadMoreTips = null;
        }
        this.mLoadMoreTips = strArr;
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter
    public void setLoadMoreTipColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34ebbf7", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mLoadMoreView;
        if (textView == null) {
            return;
        }
        textView.setTextColor(i);
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter
    public TBLoadMoreFooter.LoadMoreState getCurrentState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLoadMoreFooter.LoadMoreState) ipChange.ipc$dispatch("f9bc975f", new Object[]{this}) : this.mState;
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter
    public TextView getLoadMoreTipView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("a0e7614a", new Object[]{this}) : this.mLoadMoreView;
    }
}
