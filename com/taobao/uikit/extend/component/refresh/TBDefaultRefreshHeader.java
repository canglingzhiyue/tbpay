package com.taobao.uikit.extend.component.refresh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import tb.kge;

/* loaded from: classes9.dex */
public class TBDefaultRefreshHeader extends TBRefreshHeader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBDefaultRefreshHeader";
    private String[] mDefaultRefreshAnimation;
    private final String[] mDefaultRefreshTips;
    private String[] mRefreshAnimation;
    private FrameLayout mRefreshHeaderView;
    private final LottieAnimationView mRefreshProgressView1;
    private final LottieAnimationView mRefreshProgressView2;
    private final LottieAnimationView mRefreshProgressView3;
    private String[] mRefreshTips;
    private FrameLayout mRefreshViewGroup;
    private View mSecondFloorView;

    /* renamed from: com.taobao.uikit.extend.component.refresh.TBDefaultRefreshHeader$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshHeaderStyle = new int[TBRefreshHeader.RefreshHeaderStyle.values().length];
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState;

        static {
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshHeaderStyle[TBRefreshHeader.RefreshHeaderStyle.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshHeaderStyle[TBRefreshHeader.RefreshHeaderStyle.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState = new int[TBRefreshHeader.RefreshState.values().length];
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.PULL_TO_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.REFRESHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.SECOND_FLOOR_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.SECOND_FLOOR_END.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        kge.a(-2123890736);
    }

    public static /* synthetic */ Object ipc$super(TBDefaultRefreshHeader tBDefaultRefreshHeader, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

    public TBDefaultRefreshHeader(Context context) {
        super(context);
        this.mDefaultRefreshTips = new String[]{getContext().getString(R.string.uik_pull_to_refresh), getContext().getString(R.string.uik_release_to_refresh), getContext().getString(R.string.uik_refreshing), getContext().getString(R.string.uik_refresh_finished)};
        this.mRefreshTips = new String[]{getContext().getString(R.string.uik_pull_to_refresh), getContext().getString(R.string.uik_release_to_refresh), getContext().getString(R.string.uik_refreshing), getContext().getString(R.string.uik_refresh_finished)};
        this.mDefaultRefreshAnimation = new String[]{"pullrefresh/normal/uik_pull_to_refresh.json", "pullrefresh/normal/uik_refreshing.json", "pullrefresh/normal/uik_refresh_finished.json"};
        this.mRefreshAnimation = new String[]{"pullrefresh/normal/uik_pull_to_refresh.json", "pullrefresh/normal/uik_refreshing.json", "pullrefresh/normal/uik_refresh_finished.json"};
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.uik_swipe_refresh_header, (ViewGroup) this, true);
        setBackgroundResource(R.color.uik_refresh_head_bg);
        this.mRefreshHeaderView = (FrameLayout) findViewById(R.id.uik_refresh_header);
        this.mRefreshViewGroup = (FrameLayout) findViewById(R.id.uik_refresh_header_fl);
        this.mRefreshProgressView1 = (LottieAnimationView) findViewById(R.id.uik_refresh_header_progress1);
        this.mRefreshProgressView2 = (LottieAnimationView) findViewById(R.id.uik_refresh_header_progress2);
        this.mRefreshProgressView3 = (LottieAnimationView) findViewById(R.id.uik_refresh_header_progress3);
        this.mSecondFloorView = findViewById(R.id.uik_refresh_header_second_floor);
        this.mRefreshProgressView1.setImageAssetsFolder("pullrefresh/normal/images");
        this.mRefreshProgressView2.setImageAssetsFolder("pullrefresh/normal/images");
        this.mRefreshProgressView3.setImageAssetsFolder("pullrefresh/normal/images");
        this.mRefreshProgressView1.setAnimation("pullrefresh/normal/uik_pull_to_refresh.json");
        this.mRefreshProgressView2.setAnimation("pullrefresh/normal/uik_refreshing.json");
        this.mRefreshProgressView3.setAnimation("pullrefresh/normal/uik_refresh_finished.json");
        this.mRefreshProgressView2.setRepeatCount(-1);
        changeToState(TBRefreshHeader.RefreshState.NONE);
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        LottieAnimationView lottieAnimationView = this.mRefreshProgressView1;
        if (lottieAnimationView != null) {
            lottieAnimationView.setProgress(f);
        }
        LottieAnimationView lottieAnimationView2 = this.mRefreshProgressView2;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setProgress(f);
        }
        LottieAnimationView lottieAnimationView3 = this.mRefreshProgressView3;
        if (lottieAnimationView3 == null) {
            return;
        }
        lottieAnimationView3.setProgress(f);
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void changeToState(TBRefreshHeader.RefreshState refreshState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2396ba61", new Object[]{this, refreshState});
        } else if (this.mState == refreshState) {
        } else {
            String str = "changeToState called: oldState is " + this.mState.toString() + " newState is " + refreshState.toString();
            if (this.mPullRefreshListener != null) {
                this.mPullRefreshListener.onRefreshStateChanged(this.mState, refreshState);
            }
            this.mState = refreshState;
            LottieAnimationView lottieAnimationView = this.mRefreshProgressView1;
            String[] strArr = this.mRefreshAnimation;
            lottieAnimationView.setAnimation(strArr == null ? this.mDefaultRefreshAnimation[0] : strArr[0]);
            LottieAnimationView lottieAnimationView2 = this.mRefreshProgressView2;
            String[] strArr2 = this.mRefreshAnimation;
            lottieAnimationView2.setAnimation(strArr2 == null ? this.mDefaultRefreshAnimation[1] : strArr2[1]);
            LottieAnimationView lottieAnimationView3 = this.mRefreshProgressView3;
            String[] strArr3 = this.mRefreshAnimation;
            lottieAnimationView3.setAnimation(strArr3 == null ? this.mDefaultRefreshAnimation[2] : strArr3[2]);
            int i = AnonymousClass1.$SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[this.mState.ordinal()];
            if (i == 1) {
                this.mRefreshProgressView3.setVisibility(0);
                this.mRefreshProgressView1.setVisibility(8);
                this.mRefreshProgressView2.setVisibility(8);
                this.mRefreshProgressView1.cancelAnimation();
                this.mRefreshProgressView2.cancelAnimation();
                this.mRefreshProgressView3.cancelAnimation();
            } else if (i == 2) {
                this.mRefreshProgressView1.setVisibility(0);
                this.mRefreshProgressView2.setVisibility(8);
                this.mRefreshProgressView3.setVisibility(8);
                this.mRefreshViewGroup.setVisibility(0);
            } else if (i == 3) {
                this.mRefreshViewGroup.setVisibility(0);
            } else if (i == 4) {
                this.mRefreshProgressView2.setVisibility(0);
                this.mRefreshProgressView1.setVisibility(8);
                this.mRefreshProgressView3.setVisibility(8);
                this.mRefreshViewGroup.setVisibility(0);
            } else if (i == 5) {
                this.mRefreshViewGroup.setVisibility(8);
            }
            if (this.mState != TBRefreshHeader.RefreshState.REFRESHING) {
                return;
            }
            this.mRefreshProgressView2.playAnimation();
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setRefreshAnimation(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9e81f7", new Object[]{this, strArr, str});
            return;
        }
        if (strArr == null || strArr.length != 3) {
            this.mRefreshAnimation = null;
        }
        this.mRefreshAnimation = strArr;
        this.mRefreshProgressView1.setImageAssetsFolder(str);
        this.mRefreshProgressView2.setImageAssetsFolder(str);
        this.mRefreshProgressView3.setImageAssetsFolder(str);
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public View getRefreshView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("378be073", new Object[]{this}) : this.mRefreshViewGroup;
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public View getSecondFloorView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d44bd650", new Object[]{this}) : this.mSecondFloorView;
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setSecondFloorView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1b4090", new Object[]{this, view});
            return;
        }
        View view2 = this.mSecondFloorView;
        if (view2 != null) {
            if (this.mRefreshHeaderView == null) {
                return;
            }
            this.mRefreshHeaderView.removeView(this.mSecondFloorView);
            this.mRefreshHeaderView.addView(view, 0, (FrameLayout.LayoutParams) view2.getLayoutParams());
            this.mSecondFloorView = view;
            this.mSecondFloorView.setId(R.id.uik_refresh_header_second_floor);
        } else if (this.mRefreshHeaderView == null) {
        } else {
            this.mRefreshHeaderView.addView(view, 0, new FrameLayout.LayoutParams(-2, -2));
            this.mSecondFloorView = view;
            this.mSecondFloorView.setId(R.id.uik_refresh_header_second_floor);
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void switchStyle(TBRefreshHeader.RefreshHeaderStyle refreshHeaderStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbda9585", new Object[]{this, refreshHeaderStyle});
            return;
        }
        int i = AnonymousClass1.$SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshHeaderStyle[refreshHeaderStyle.ordinal()];
        if (i == 1) {
            this.mDefaultRefreshAnimation = new String[]{"pullrefresh/normal/uik_pull_to_refresh.json", "pullrefresh/normal/uik_refreshing.json", "pullrefresh/normal/uik_refresh_finished.json"};
            this.mRefreshAnimation = new String[]{"pullrefresh/normal/uik_pull_to_refresh.json", "pullrefresh/normal/uik_refreshing.json", "pullrefresh/normal/uik_refresh_finished.json"};
            this.mRefreshProgressView1.setImageAssetsFolder("pullrefresh/normal/images");
            this.mRefreshProgressView2.setImageAssetsFolder("pullrefresh/normal/images");
            this.mRefreshProgressView3.setImageAssetsFolder("pullrefresh/normal/images");
        } else if (i != 2) {
        } else {
            this.mDefaultRefreshAnimation = new String[]{"pullrefresh/dark/uik_pull_to_refresh.json", "pullrefresh/dark/uik_refreshing.json", "pullrefresh/dark/uik_refresh_finished.json"};
            this.mRefreshAnimation = new String[]{"pullrefresh/dark/uik_pull_to_refresh.json", "pullrefresh/dark/uik_refreshing.json", "pullrefresh/dark/uik_refresh_finished.json"};
            this.mRefreshProgressView1.setImageAssetsFolder("pullrefresh/dark/images");
            this.mRefreshProgressView2.setImageAssetsFolder("pullrefresh/dark/images");
            this.mRefreshProgressView3.setImageAssetsFolder("pullrefresh/dark/images");
            LottieAnimationView lottieAnimationView = this.mRefreshProgressView1;
            String[] strArr = this.mRefreshAnimation;
            lottieAnimationView.setAnimation(strArr == null ? this.mDefaultRefreshAnimation[0] : strArr[0]);
            LottieAnimationView lottieAnimationView2 = this.mRefreshProgressView2;
            String[] strArr2 = this.mRefreshAnimation;
            lottieAnimationView2.setAnimation(strArr2 == null ? this.mDefaultRefreshAnimation[1] : strArr2[1]);
            LottieAnimationView lottieAnimationView3 = this.mRefreshProgressView3;
            String[] strArr3 = this.mRefreshAnimation;
            lottieAnimationView3.setAnimation(strArr3 == null ? this.mDefaultRefreshAnimation[2] : strArr3[2]);
        }
    }

    private void setHardwareEnable(LottieAnimationView lottieAnimationView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4fd236", new Object[]{this, lottieAnimationView, new Boolean(z)});
        } else if (lottieAnimationView.isHardwareAccelerated() && z) {
            lottieAnimationView.setLayerType(2, null);
        } else {
            lottieAnimationView.setLayerType(1, null);
        }
    }

    public void setHardwareEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c73b0c0", new Object[]{this, new Boolean(z)});
            return;
        }
        setHardwareEnable(this.mRefreshProgressView1, z);
        setHardwareEnable(this.mRefreshProgressView2, z);
        setHardwareEnable(this.mRefreshProgressView3, z);
    }
}
