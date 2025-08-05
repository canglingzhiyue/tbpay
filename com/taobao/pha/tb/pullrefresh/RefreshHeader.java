package com.taobao.pha.tb.pullrefresh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import tb.kge;

/* loaded from: classes7.dex */
public class RefreshHeader extends TBRefreshHeader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COLOR_SCHEME_DARK = 1;
    public static final int COLOR_SCHEME_LIGHT = 0;
    private final TextView circle1;
    private final TextView circle2;
    private final TextView circle3;
    private final View mRefreshHeaderView;
    private final View mSecondView;
    private int scheme;
    private int schemeDrawable;
    private final ValueAnimator valueAnimator;

    /* renamed from: com.taobao.pha.tb.pullrefresh.RefreshHeader$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18839a = new int[TBRefreshHeader.RefreshState.values().length];

        static {
            try {
                f18839a[TBRefreshHeader.RefreshState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18839a[TBRefreshHeader.RefreshState.PULL_TO_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18839a[TBRefreshHeader.RefreshState.REFRESHING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18839a[TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18839a[TBRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18839a[TBRefreshHeader.RefreshState.SECOND_FLOOR_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18839a[TBRefreshHeader.RefreshState.SECOND_FLOOR_END.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        kge.a(-149574521);
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setRefreshAnimation(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9e81f7", new Object[]{this, strArr, str});
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setRefreshTipColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e29913b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setRefreshTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e253df27", new Object[]{this, strArr});
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setSecondFloorView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1b4090", new Object[]{this, view});
        }
    }

    public static /* synthetic */ TextView access$000(RefreshHeader refreshHeader) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("e52db9b7", new Object[]{refreshHeader}) : refreshHeader.circle1;
    }

    public static /* synthetic */ TextView access$100(RefreshHeader refreshHeader) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("2744e716", new Object[]{refreshHeader}) : refreshHeader.circle2;
    }

    public static /* synthetic */ TextView access$200(RefreshHeader refreshHeader) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("695c1475", new Object[]{refreshHeader}) : refreshHeader.circle3;
    }

    public RefreshHeader(Context context) {
        super(context);
        this.mRefreshHeaderView = LayoutInflater.from(context).inflate(R.layout.refresh_header_v2, (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.mRefreshHeaderView.setId(R.id.uik_refresh_header);
        addView(this.mRefreshHeaderView, layoutParams);
        this.mSecondView = new View(context);
        changeToState(TBRefreshHeader.RefreshState.NONE);
        this.circle1 = (TextView) this.mRefreshHeaderView.findViewById(R.id.circle1);
        this.circle2 = (TextView) this.mRefreshHeaderView.findViewById(R.id.circle2);
        this.circle3 = (TextView) this.mRefreshHeaderView.findViewById(R.id.circle3);
        this.schemeDrawable = R.drawable.shape_circle_header_light_v2;
        this.valueAnimator = ValueAnimator.ofInt(0, 3);
        this.valueAnimator.setRepeatMode(1);
        this.valueAnimator.setDuration(1000L);
        this.valueAnimator.setRepeatCount(-1);
        this.valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.pha.tb.pullrefresh.RefreshHeader.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (intValue == 0 || intValue == 3) {
                    RefreshHeader.access$000(RefreshHeader.this).setAlpha(1.0f);
                    RefreshHeader.access$100(RefreshHeader.this).setAlpha(0.3f);
                    RefreshHeader.access$200(RefreshHeader.this).setAlpha(0.3f);
                } else if (intValue == 1) {
                    RefreshHeader.access$000(RefreshHeader.this).setAlpha(0.3f);
                    RefreshHeader.access$100(RefreshHeader.this).setAlpha(1.0f);
                    RefreshHeader.access$200(RefreshHeader.this).setAlpha(0.3f);
                } else if (intValue != 2) {
                } else {
                    RefreshHeader.access$000(RefreshHeader.this).setAlpha(0.3f);
                    RefreshHeader.access$100(RefreshHeader.this).setAlpha(0.3f);
                    RefreshHeader.access$200(RefreshHeader.this).setAlpha(1.0f);
                }
            }
        });
    }

    public void setColorScheme(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca0a11f6", new Object[]{this, new Integer(i)});
        } else if (this.scheme == i) {
        } else {
            if (i == 0) {
                this.schemeDrawable = R.drawable.shape_circle_header_light_v2;
                this.circle1.setBackgroundResource(this.schemeDrawable);
                this.circle2.setBackgroundResource(this.schemeDrawable);
                this.circle3.setBackgroundResource(this.schemeDrawable);
            } else if (i == 1) {
                this.schemeDrawable = R.drawable.shape_circle_header_dark_v2;
                this.circle1.setBackgroundResource(this.schemeDrawable);
                this.circle2.setBackgroundResource(this.schemeDrawable);
                this.circle3.setBackgroundResource(this.schemeDrawable);
            }
            this.scheme = i;
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void changeToState(TBRefreshHeader.RefreshState refreshState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2396ba61", new Object[]{this, refreshState});
        } else if (this.mRefreshHeaderView == null || this.mState == refreshState) {
        } else {
            if (this.mPullRefreshListener != null) {
                this.mPullRefreshListener.onRefreshStateChanged(this.mState, refreshState);
            }
            this.mState = refreshState;
            int i = AnonymousClass2.f18839a[this.mState.ordinal()];
            if (i == 1) {
                this.valueAnimator.cancel();
                changeHeaderAlpha(1.0f);
            } else if (i == 2 || i != 3) {
            } else {
                this.valueAnimator.start();
            }
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public View getRefreshView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("378be073", new Object[]{this}) : this.mRefreshHeaderView;
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public View getSecondFloorView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d44bd650", new Object[]{this}) : this.mSecondView;
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
        this.mRefreshHeaderView.setAlpha(f);
        this.circle1.setAlpha(1.0f);
        this.circle2.setAlpha(0.3f);
        this.circle3.setAlpha(0.3f);
    }
}
