package com.taobao.android.live.plugin.atype.flexalocal.profile;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarInfoCardResponseData;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.ddw;
import tb.gbg;
import tb.hhs;
import tb.hkk;
import tb.kge;
import tb.kpj;
import tb.nlq;
import tb.phg;
import tb.pmd;
import tb.xkw;

/* loaded from: classes6.dex */
public class LiveAvatarNewView extends BasePopupView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int LIVE_AVATAR_CONTAINER_MAX_HEIGHT = 430;
    public static final String MIDDLE_AVATAR_CONTAINER_DX_TEMPLATE_NAME = "taolive_anchor_card_content";
    public static final String MIDDLE_AVATAR_CONTAINER_DX_TEMPLATE_NAME2 = "taolive_anchor_card_content2";
    public static final int SPAN_COUNT = 3;
    public static final String TAG = "LiveAvatarNewView";
    public static final String TOP_AVATAR_CONTAINER_DX_TEMPLATE_NAME = "taolive_anchor_card_header";
    public static final String VIDEO_ITEM_AVATAR_CONTAINER_DX_TEMPLATE_NAME = "taolive_anchor_card_video";
    public static final String VIDEO_ITEM_AVATAR_CONTAINER_DX_TEMPLATE_NAME2 = "taolive_anchor_card_video2";
    private boolean installedWidget;
    private AppBarLayout mAppBarLayout;
    private float mAvatarBigInitX;
    private float mAvatarBigInitY;
    private float mAvatarBigSize;
    private FrameLayout mAvatarMiddleContainer;
    private FrameLayout mAvatarRightContainer;
    private float mAvatarSmallInitX;
    private float mAvatarSmallInitY;
    private float mAvatarSmallSize;
    private TUrlImageView mAvatarViewBig;
    private TUrlImageView mAvatarViewBigBorder;
    private View mAvatarViewBigLayout;
    private View mAvatarViewSmall;
    private View mCardRootView;
    private CollapsingToolbarLayout mCollapsingToolbar;
    private View mCover;
    private LiveAvatarInfoCardResponseData mData;
    private View mEmptyView;
    private com.taobao.alilive.aliliveframework.frame.a mFrameContext;
    private final ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    private View mHeaderIconBorder;
    private boolean mIsHaveFooter;
    private boolean mIsLandscape;
    private a mLiveAvatarAdapter;
    private TBLiveDataModel mLiveDataModel;
    private NestedScrollView mNestedScrollView;
    private AppBarLayout.a mOffsetChangedListener;
    private long mOpenPageTime;
    private RecyclerView mRecyclerView;
    private FrameLayout mShortAvatarMiddleContainer;
    private View mSmallAvatarContainer;
    private String mSourceType;
    private TextView mTvUserNameSmall;

    static {
        kge.a(-53678834);
    }

    public static /* synthetic */ Object ipc$super(LiveAvatarNewView liveAvatarNewView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1775111991) {
            super.hide();
            return null;
        } else if (hashCode != -340027132) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.show();
            return null;
        }
    }

    public static /* synthetic */ void access$000(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a056f0dc", new Object[]{liveAvatarNewView});
        } else {
            liveAvatarNewView.initAvatarPosition();
        }
    }

    public static /* synthetic */ TUrlImageView access$100(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("33d8521", new Object[]{liveAvatarNewView}) : liveAvatarNewView.mAvatarViewBig;
    }

    public static /* synthetic */ String access$1000(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("632cbff3", new Object[]{liveAvatarNewView}) : liveAvatarNewView.mSourceType;
    }

    public static /* synthetic */ CollapsingToolbarLayout access$200(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CollapsingToolbarLayout) ipChange.ipc$dispatch("66a1d24a", new Object[]{liveAvatarNewView}) : liveAvatarNewView.mCollapsingToolbar;
    }

    public static /* synthetic */ TextView access$300(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("e157fcad", new Object[]{liveAvatarNewView}) : liveAvatarNewView.mTvUserNameSmall;
    }

    public static /* synthetic */ void access$400(LiveAvatarNewView liveAvatarNewView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876f968", new Object[]{liveAvatarNewView, new Float(f)});
        } else {
            liveAvatarNewView.animAvatar(f);
        }
    }

    public static /* synthetic */ boolean access$500(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("89ce037b", new Object[]{liveAvatarNewView})).booleanValue() : liveAvatarNewView.mIsHaveFooter;
    }

    public static /* synthetic */ LiveAvatarInfoCardResponseData access$600(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveAvatarInfoCardResponseData) ipChange.ipc$dispatch("e1e1bbaf", new Object[]{liveAvatarNewView}) : liveAvatarNewView.mData;
    }

    public static /* synthetic */ NestedScrollView access$700(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NestedScrollView) ipChange.ipc$dispatch("582d32cd", new Object[]{liveAvatarNewView}) : liveAvatarNewView.mNestedScrollView;
    }

    public static /* synthetic */ FrameLayout access$800(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("184f4285", new Object[]{liveAvatarNewView}) : liveAvatarNewView.mShortAvatarMiddleContainer;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a access$900(LiveAvatarNewView liveAvatarNewView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("23045228", new Object[]{liveAvatarNewView}) : liveAvatarNewView.mFrameContext;
    }

    private void initAvatarPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7533659", new Object[]{this});
            return;
        }
        this.mAvatarBigInitX = this.mSmallAvatarContainer.getPaddingLeft();
        this.mAvatarBigInitY = this.mAvatarViewBigLayout.getY();
        this.mAvatarBigSize = this.mAvatarViewBigLayout.getWidth();
        this.mAvatarSmallInitX = this.mSmallAvatarContainer.getPaddingLeft();
        this.mAvatarSmallInitY = this.mAvatarViewSmall.getY() + this.mSmallAvatarContainer.getTop();
        this.mAvatarSmallSize = this.mAvatarViewSmall.getWidth();
        q.a(TAG, "initAvatarPosition: big = [" + this.mAvatarBigInitX + "," + this.mAvatarBigInitY + "," + this.mAvatarBigSize + "], small = [" + this.mAvatarSmallInitX + "," + this.mAvatarSmallInitY + "," + this.mAvatarSmallSize + "], this = " + this);
    }

    private void animAvatar(float f) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac13438f", new Object[]{this, new Float(f)});
            return;
        }
        float f2 = this.mAvatarBigSize;
        if (f2 <= 0.0f) {
            q.a(TAG, "animAvatar skipper");
            return;
        }
        float f3 = this.mAvatarSmallInitY;
        float f4 = this.mAvatarBigInitY;
        float a2 = ((((f2 - this.mAvatarSmallSize) - (f4 / 2.0f)) - d.a(this.mContext, 40.0f)) * f) / 2.0f;
        q.a(TAG, "animAvatar pivotX：" + a2);
        this.mAvatarViewBigLayout.setPivotX(a2);
        this.mAvatarViewBigLayout.setPivotY(0.0f);
        this.mAvatarViewBigLayout.setTranslationY((f3 - (f4 / 2.0f)) * f);
        float f5 = 1.0f - ((1.0f - (this.mAvatarSmallSize / this.mAvatarBigSize)) * f);
        this.mAvatarViewBigLayout.setScaleX(f5);
        this.mAvatarViewBigLayout.setScaleY(f5);
        this.mTvUserNameSmall.setAlpha(f);
        float f6 = 1.0f - f;
        this.mAvatarRightContainer.setAlpha(f6);
        FrameLayout frameLayout = this.mAvatarRightContainer;
        if (f6 == 0.0f) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        float f7 = 1.0f - (f * 10.0f);
        if (f7 > 1.0f) {
            f7 = 1.0f;
        } else if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        this.mAvatarViewBigBorder.setAlpha(f7 * 10.0f);
    }

    public LiveAvatarNewView(com.taobao.alilive.aliliveframework.frame.a aVar, boolean z, Context context, ViewGroup viewGroup, TBLiveDataModel tBLiveDataModel, View view) {
        super(context, viewGroup);
        this.mGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                    return;
                }
                LiveAvatarNewView.access$000(LiveAvatarNewView.this);
                if (Build.VERSION.SDK_INT < 16) {
                    return;
                }
                LiveAvatarNewView.access$100(LiveAvatarNewView.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        };
        this.mOffsetChangedListener = new AppBarLayout.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.design.widget.AppBarLayout.a
            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f4cc97e1", new Object[]{this, appBarLayout, new Integer(i)});
                    return;
                }
                int measuredHeight = LiveAvatarNewView.access$200(LiveAvatarNewView.this).getMeasuredHeight() - ViewCompat.getMinimumHeight(LiveAvatarNewView.access$200(LiveAvatarNewView.this));
                float abs = measuredHeight > 0 ? Math.abs(i) / measuredHeight : 0.0f;
                q.c(LiveAvatarNewView.TAG, "onOffsetChanged: verticalOffset = " + i + ", range = " + measuredHeight + ", expandRatio = " + abs);
                if (abs > 0.0f) {
                    LiveAvatarNewView.access$300(LiveAvatarNewView.this).setVisibility(0);
                }
                LiveAvatarNewView.access$400(LiveAvatarNewView.this, abs);
            }
        };
        this.mFrameContext = aVar;
        this.mLiveDataModel = tBLiveDataModel;
        this.mIsLandscape = z;
        init(view);
    }

    public LiveAvatarNewView(com.taobao.alilive.aliliveframework.frame.a aVar, boolean z, Context context, ViewGroup viewGroup, TBLiveDataModel tBLiveDataModel, View view, boolean z2) {
        super(context, viewGroup, z2);
        this.mGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                    return;
                }
                LiveAvatarNewView.access$000(LiveAvatarNewView.this);
                if (Build.VERSION.SDK_INT < 16) {
                    return;
                }
                LiveAvatarNewView.access$100(LiveAvatarNewView.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        };
        this.mOffsetChangedListener = new AppBarLayout.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.design.widget.AppBarLayout.a
            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f4cc97e1", new Object[]{this, appBarLayout, new Integer(i)});
                    return;
                }
                int measuredHeight = LiveAvatarNewView.access$200(LiveAvatarNewView.this).getMeasuredHeight() - ViewCompat.getMinimumHeight(LiveAvatarNewView.access$200(LiveAvatarNewView.this));
                float abs = measuredHeight > 0 ? Math.abs(i) / measuredHeight : 0.0f;
                q.c(LiveAvatarNewView.TAG, "onOffsetChanged: verticalOffset = " + i + ", range = " + measuredHeight + ", expandRatio = " + abs);
                if (abs > 0.0f) {
                    LiveAvatarNewView.access$300(LiveAvatarNewView.this).setVisibility(0);
                }
                LiveAvatarNewView.access$400(LiveAvatarNewView.this, abs);
            }
        };
        this.mFrameContext = aVar;
        this.mLiveDataModel = tBLiveDataModel;
        this.mIsLandscape = z;
        init(view);
    }

    private void init(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce90a9db", new Object[]{this, view});
            return;
        }
        this.mCover = view;
        View view2 = this.mCover;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewView.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                    } else {
                        LiveAvatarNewView.this.hide();
                    }
                }
            });
        }
        setVisibility(8);
        this.mAppBarLayout.addOnOffsetChangedListener(this.mOffsetChangedListener);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.profile.BasePopupView
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        View view = this.mCover;
        if (view != null) {
            view.setVisibility(8);
        }
        ddw a2 = ddw.a();
        com.taobao.alilive.aliliveframework.frame.a aVar = this.mFrameContext;
        String str = null;
        a2.a(xkw.EVENT_NEW_PROFILE__IS_SHOWING, false, aVar == null ? null : aVar.G());
        ddw a3 = ddw.a();
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.mFrameContext;
        if (aVar2 != null) {
            str = aVar2.G();
        }
        a3.a("com.taobao.taolive.room.enable_updown_switch", "avatarCard", str);
        hideProfileTrack();
    }

    private void hideProfileTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("857d9a0b", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.mOpenPageTime;
        LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData = this.mData;
        if (liveAvatarInfoCardResponseData != null) {
            c.a(this.mFrameContext, liveAvatarInfoCardResponseData.follow, currentTimeMillis, this.mSourceType);
        } else {
            c.a(this.mFrameContext, false, currentTimeMillis, this.mSourceType);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.profile.BasePopupView
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        com.taobao.alilive.aliliveframework.frame.a aVar = this.mFrameContext;
        if (aVar != null && aVar.o() != null) {
            this.mFrameContext.o().accessListener(AccessListenerEnum.onFloatViewShow, new Object[0]);
        }
        this.mOpenPageTime = System.currentTimeMillis();
        if (this.mContentView != null) {
            this.mContentView.setVisibility(0);
        }
        View view = this.mCover;
        if (view != null) {
            view.setVisibility(0);
        }
        ddw a2 = ddw.a();
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.mFrameContext;
        String str = null;
        a2.a(xkw.EVENT_NEW_PROFILE__IS_SHOWING, true, aVar2 == null ? null : aVar2.G());
        ddw a3 = ddw.a();
        com.taobao.alilive.aliliveframework.frame.a aVar3 = this.mFrameContext;
        if (aVar3 != null) {
            str = aVar3.G();
        }
        a3.a("com.taobao.taolive.room.disable_updown_switch", "avatarCard", str);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.profile.BasePopupView
    public View onCreateContentView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a25b4d4b", new Object[]{this, viewGroup});
        }
        if (viewGroup == null) {
            return null;
        }
        this.mContentView = viewGroup;
        this.mCardRootView = LayoutInflater.from(getContext()).inflate(hkk.ah() ? R.layout.taolive_avatar_card_layout2_new_flexalocal : R.layout.taolive_avatar_card_layout_new_flexalocal, this.mContentView, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        this.mContentView.addView(this.mCardRootView, layoutParams);
        this.mContentView.setVisibility(8);
        setupView();
        return this.mContentView;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.profile.BasePopupView
    public FrameLayout.LayoutParams onCreateLayoutParams(View view, DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("46bd761c", new Object[]{this, view, displayMetrics});
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        if (y.a() && y.e(this.mContext)) {
            layoutParams.width = y.f(this.mContext);
            layoutParams.height = y.g(this.mContext);
            layoutParams.gravity = 85;
        } else if (this.mbPopFromRight) {
            layoutParams.gravity = 85;
            layoutParams.width = d.c();
            if (phg.d().a()) {
                layoutParams.width = gbg.a(hhs.a().c(), this.mContext, 375.0f);
            }
            layoutParams.height = d.c() - d.a(this.mContext, 80.0f);
        } else {
            layoutParams.gravity = 83;
            layoutParams.width = d.c();
            layoutParams.height = d.a(this.mContext, 430.0f);
        }
        return layoutParams;
    }

    public void setupView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7423b649", new Object[]{this});
        } else if (this.mContentView == null) {
        } else {
            setupTopView();
            setupRecyclerView();
        }
    }

    private void setupTopView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7013d264", new Object[]{this});
            return;
        }
        this.mAppBarLayout = (AppBarLayout) this.mContentView.findViewById(R.id.live_avatar_mini_app_bar);
        this.mCollapsingToolbar = (CollapsingToolbarLayout) this.mContentView.findViewById(R.id.live_avatar_mini_collapsing_tool_bar);
        this.mAvatarViewBig = (TUrlImageView) this.mContentView.findViewById(R.id.live_avatar_mini_avatar_big_new);
        this.mAvatarViewBigBorder = (TUrlImageView) this.mContentView.findViewById(R.id.live_avatar_mini_avatar_big_new_border);
        this.mAvatarViewBigLayout = this.mContentView.findViewById(R.id.live_avatar_mini_avatar_big_layout_new);
        this.mHeaderIconBorder = this.mContentView.findViewById(R.id.live_avatar_mini_avatar_big_common_border);
        this.mEmptyView = this.mContentView.findViewById(R.id.live_avatar_card_empty_view);
        this.mSmallAvatarContainer = this.mContentView.findViewById(R.id.live_mini_avatar_small_container);
        this.mAvatarViewSmall = this.mContentView.findViewById(R.id.personal_mini_avatar_small);
        this.mTvUserNameSmall = (TextView) this.mContentView.findViewById(R.id.personal_mini_tv_user_name_small);
        this.mAvatarRightContainer = (FrameLayout) this.mContentView.findViewById(R.id.live_avatar_card_first_container);
        this.mAvatarMiddleContainer = (FrameLayout) this.mContentView.findViewById(R.id.live_avatar_card_second_container);
        this.mShortAvatarMiddleContainer = (FrameLayout) this.mContentView.findViewById(R.id.live_avatar_card_second_short_container);
    }

    private void setupRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36f5ea8", new Object[]{this});
            return;
        }
        this.mRecyclerView = (RecyclerView) this.mContentView.findViewById(R.id.live_avatar_card_recyclerView_container);
        this.mRecyclerView.setNestedScrollingEnabled(false);
        this.mNestedScrollView = (NestedScrollView) this.mContentView.findViewById(R.id.live_avatar_card_nst);
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(this.mContext, 3);
        this.mLiveAvatarAdapter = new a(this.mFrameContext, this.mContext);
        this.mRecyclerView.setLayoutManager(gridLayoutManager);
        this.mRecyclerView.setAdapter(this.mLiveAvatarAdapter);
        this.mRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
                if (str.hashCode() == -1263079482) {
                    super.getItemOffsets((Rect) objArr[0], (View) objArr[1], (RecyclerView) objArr[2], (RecyclerView.State) objArr[3]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int b;
                int size;
                int size2;
                int i;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView, state);
                if (hkk.I()) {
                    rect.bottom = (!y.a() || !y.e(LiveAvatarNewView.this.mContext)) ? d.b(8.0f) : gbg.a(hhs.a().c(), LiveAvatarNewView.this.mContext, 8.0f);
                    int measuredWidth = (recyclerView.getMeasuredWidth() - recyclerView.getPaddingStart()) - recyclerView.getPaddingEnd();
                    int b2 = (!y.a() || !y.e(LiveAvatarNewView.this.mContext)) ? d.b(117.0f) : gbg.a(hhs.a().c(), LiveAvatarNewView.this.mContext, 117.0f);
                    int spanIndex = gridLayoutManager.getSpanSizeLookup().getSpanIndex(recyclerView.getChildAdapterPosition(view), 3);
                    rect.left = ((b2 + ((measuredWidth - (b2 * 3)) / 2)) * spanIndex) - ((measuredWidth / 3) * spanIndex);
                } else {
                    if (!y.a() || !y.e(LiveAvatarNewView.this.mContext)) {
                        rect.left = d.b(9.0f);
                        b = d.b(9.0f);
                    } else {
                        rect.left = d.a(LiveAvatarNewView.this.mContext, 3.0f);
                        b = d.a(LiveAvatarNewView.this.mContext, 9.0f);
                    }
                    rect.bottom = b;
                }
                int indexOfChild = recyclerView.indexOfChild(view);
                if (!LiveAvatarNewView.access$500(LiveAvatarNewView.this) && LiveAvatarNewView.access$600(LiveAvatarNewView.this) != null && LiveAvatarNewView.access$600(LiveAvatarNewView.this).videos != null && (size2 = (size = LiveAvatarNewView.access$600(LiveAvatarNewView.this).videos.size()) - indexOfChild) < 4 && ((i = size % 3) != 0 ? !(i != 1 ? i != 2 || size2 >= 3 : size2 >= 2) : size2 < 4)) {
                    rect.bottom = d.b(18.0f);
                }
                if (!LiveAvatarNewView.access$500(LiveAvatarNewView.this) || LiveAvatarNewView.access$600(LiveAvatarNewView.this) == null || LiveAvatarNewView.access$600(LiveAvatarNewView.this).videos == null || indexOfChild != LiveAvatarNewView.access$600(LiveAvatarNewView.this).videos.size()) {
                    return;
                }
                rect.left = 0;
                rect.bottom = 0;
            }
        });
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mRecyclerView.getLayoutParams();
        if (hkk.I()) {
            layoutParams.leftMargin = (!y.a() || !y.e(this.mContext)) ? d.b(8.0f) : gbg.a(hhs.a().c(), this.mContext, 8.0f);
            layoutParams.rightMargin = (!y.a() || !y.e(this.mContext)) ? d.b(8.0f) : gbg.a(hhs.a().c(), this.mContext, 8.0f);
        } else {
            layoutParams.leftMargin = d.b(9.0f);
            layoutParams.rightMargin = d.b(18.0f);
        }
        this.mRecyclerView.setLayoutParams(layoutParams);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        AppBarLayout appBarLayout = this.mAppBarLayout;
        if (appBarLayout != null) {
            appBarLayout.removeOnOffsetChangedListener(this.mOffsetChangedListener);
        }
        if (this.mAvatarViewBig != null && Build.VERSION.SDK_INT >= 16) {
            this.mAvatarViewBig.getViewTreeObserver().removeOnGlobalLayoutListener(this.mGlobalLayoutListener);
        }
        if (!hkk.ai()) {
            return;
        }
        hide();
    }

    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
        } else {
            this.mLiveDataModel = tBLiveDataModel;
        }
    }

    public void updateData(LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ad1e61", new Object[]{this, liveAvatarInfoCardResponseData, str, new Boolean(z)});
            return;
        }
        this.installedWidget = z;
        this.mSourceType = str;
        TUrlImageView tUrlImageView = this.mAvatarViewBig;
        if (tUrlImageView != null) {
            tUrlImageView.getViewTreeObserver().addOnGlobalLayoutListener(this.mGlobalLayoutListener);
        }
        show();
        update(liveAvatarInfoCardResponseData);
    }

    private void update(LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d890ff", new Object[]{this, liveAvatarInfoCardResponseData});
        } else if (liveAvatarInfoCardResponseData == null) {
        } else {
            this.mData = liveAvatarInfoCardResponseData;
            liveAvatarInfoCardResponseData.sourceType = this.mSourceType;
            this.mCover.setVisibility(0);
            this.mContentView.setVisibility(0);
            this.mCardRootView.setVisibility(0);
            refreshBottomUi(liveAvatarInfoCardResponseData);
            refreshTopUi(liveAvatarInfoCardResponseData, true);
            refreshMiddleUi(liveAvatarInfoCardResponseData);
            if (!hkk.ah()) {
                return;
            }
            this.mContentView.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewView.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (LiveAvatarNewView.this.mContentView.getMeasuredHeight() <= d.a(LiveAvatarNewView.this.mContext, 430.0f)) {
                    } else {
                        ViewGroup.LayoutParams layoutParams = LiveAvatarNewView.this.mContentView.getLayoutParams();
                        layoutParams.height = d.a(LiveAvatarNewView.this.mContext, 430.0f);
                        LiveAvatarNewView.this.mContentView.setLayoutParams(layoutParams);
                    }
                }
            });
        }
    }

    private void refreshBottomUi(final LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3eced0", new Object[]{this, liveAvatarInfoCardResponseData});
        } else if (liveAvatarInfoCardResponseData.videos == null || liveAvatarInfoCardResponseData.videos.size() == 0) {
            this.mRecyclerView.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = this.mContentView.getLayoutParams();
            layoutParams.height = -2;
            this.mContentView.setLayoutParams(layoutParams);
            this.mAppBarLayout.setExpanded(false);
            this.mAppBarLayout.setVisibility(8);
            setEmptyViewLayoutParams(40);
        } else {
            setEmptyViewLayoutParams(12);
            this.mAppBarLayout.setVisibility(0);
            this.mAppBarLayout.setExpanded(true);
            ViewGroup.LayoutParams layoutParams2 = this.mContentView.getLayoutParams();
            layoutParams2.height = d.a(this.mContext, 430.0f);
            if (this.mIsLandscape) {
                layoutParams2.height = d.c() - d.a(this.mContext, 80.0f);
            }
            this.mContentView.setLayoutParams(layoutParams2);
            this.mRecyclerView.setVisibility(0);
            if (liveAvatarInfoCardResponseData.videos.size() >= 12) {
                this.mLiveAvatarAdapter.a();
                this.mIsHaveFooter = true;
            } else {
                this.mLiveAvatarAdapter.b();
                this.mIsHaveFooter = false;
                this.mNestedScrollView.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewView.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (liveAvatarInfoCardResponseData.videos.size() > 3) {
                        } else {
                            int measuredHeight = LiveAvatarNewView.access$700(LiveAvatarNewView.this).getMeasuredHeight();
                            ViewGroup.LayoutParams layoutParams3 = LiveAvatarNewView.access$700(LiveAvatarNewView.this).getLayoutParams();
                            layoutParams3.height = measuredHeight + d.b(144.0f);
                            LiveAvatarNewView.access$700(LiveAvatarNewView.this).setLayoutParams(layoutParams3);
                        }
                    }
                });
            }
            this.mLiveAvatarAdapter.a(liveAvatarInfoCardResponseData.videos, this.mSourceType);
            this.mLiveAvatarAdapter.a(liveAvatarInfoCardResponseData.headJumpUrl);
        }
    }

    private void setEmptyViewLayoutParams(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4f4a9c", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mEmptyView.getLayoutParams();
        layoutParams.height = d.a(this.mContext, i);
        this.mEmptyView.setLayoutParams(layoutParams);
    }

    private void refreshMiddleUi(LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData) {
        com.taobao.alilive.aliliveframework.frame.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eece68ba", new Object[]{this, liveAvatarInfoCardResponseData});
            return;
        }
        FrameLayout frameLayout = this.mAvatarMiddleContainer;
        if (liveAvatarInfoCardResponseData.videos == null || liveAvatarInfoCardResponseData.videos.size() == 0) {
            frameLayout = this.mShortAvatarMiddleContainer;
            frameLayout.setVisibility(0);
            this.mShortAvatarMiddleContainer.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewView.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int measuredHeight = LiveAvatarNewView.access$800(LiveAvatarNewView.this).getMeasuredHeight();
                    if (measuredHeight >= d.a(LiveAvatarNewView.this.mContext, 120.0f) || !(LiveAvatarNewView.access$800(LiveAvatarNewView.this).getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                        return;
                    }
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) LiveAvatarNewView.access$800(LiveAvatarNewView.this).getLayoutParams();
                    layoutParams.bottomMargin = d.a(LiveAvatarNewView.this.mContext, 120.0f) - measuredHeight;
                    LiveAvatarNewView.access$800(LiveAvatarNewView.this).setLayoutParams(layoutParams);
                }
            });
        } else {
            this.mShortAvatarMiddleContainer.setVisibility(8);
        }
        final DXRootView createDX = f.m().createDX(this.mContext, hkk.I() ? MIDDLE_AVATAR_CONTAINER_DX_TEMPLATE_NAME2 : MIDDLE_AVATAR_CONTAINER_DX_TEMPLATE_NAME);
        if (createDX != null) {
            frameLayout.removeAllViews();
            frameLayout.addView(createDX);
            if (enableProfileReplaceQueryParam() && (aVar = this.mFrameContext) != null && aVar.n != null && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.name().equals(this.mFrameContext.n.bizCode)) {
                if (liveAvatarInfoCardResponseData.shopWindow != null) {
                    if (liveAvatarInfoCardResponseData.shopWindow.titleSection != null) {
                        liveAvatarInfoCardResponseData.shopWindow.titleSection.jumpUrl = replaceQueryParam(liveAvatarInfoCardResponseData.shopWindow.titleSection.jumpUrl, "livesource");
                    }
                    if (liveAvatarInfoCardResponseData.shopWindow.itemList != null && liveAvatarInfoCardResponseData.shopWindow.itemList.size() > 0) {
                        for (LiveAvatarInfoCardResponseData.ShopItem shopItem : liveAvatarInfoCardResponseData.shopWindow.itemList) {
                            if (shopItem != null) {
                                shopItem.itemUrl = replaceQueryParam(shopItem.itemUrl, "livesource");
                            }
                        }
                    }
                }
                if (liveAvatarInfoCardResponseData.preLiveInfo != null) {
                    liveAvatarInfoCardResponseData.preLiveInfo.jumpUrl = replaceQueryParam(liveAvatarInfoCardResponseData.preLiveInfo.jumpUrl, "livesource");
                }
                if (liveAvatarInfoCardResponseData.anchorSubscribeInfo != null) {
                    liveAvatarInfoCardResponseData.anchorSubscribeInfo.jumpUrl = replaceQueryParam(liveAvatarInfoCardResponseData.anchorSubscribeInfo.jumpUrl, "livesource");
                }
                if (liveAvatarInfoCardResponseData.playbackInfo != null) {
                    liveAvatarInfoCardResponseData.playbackInfo.jumpUrl = replaceQueryParam(liveAvatarInfoCardResponseData.playbackInfo.jumpUrl, "livesource");
                }
            }
            f.m().renderDX(createDX, JSON.parseObject(JSONObject.toJSONString(liveAvatarInfoCardResponseData)), nlq.a(this.mContext));
            if (hkk.ah()) {
                frameLayout.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewView.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams = LiveAvatarNewView.this.mContentView.getLayoutParams();
                        int i = createDX.getLayoutParams().width;
                        if (i <= layoutParams.width) {
                            return;
                        }
                        layoutParams.width = i;
                        LiveAvatarNewView.this.mContentView.setLayoutParams(layoutParams);
                    }
                });
            }
        }
        if (liveAvatarInfoCardResponseData.shopWindow != null && liveAvatarInfoCardResponseData.shopWindow.utParams != null && liveAvatarInfoCardResponseData.shopWindow.utParams.showParams != null && !StringUtils.isEmpty(liveAvatarInfoCardResponseData.shopWindow.utParams.showParams.controlName)) {
            c.a(this.mFrameContext, liveAvatarInfoCardResponseData.follow, this.mSourceType, liveAvatarInfoCardResponseData.shopWindow.utParams.showParams.params, liveAvatarInfoCardResponseData.shopWindow.utParams.showParams.controlName);
        }
        if (liveAvatarInfoCardResponseData.preLiveInfo != null && !StringUtils.isEmpty(liveAvatarInfoCardResponseData.preLiveInfo.title)) {
            c.a(this.mFrameContext, this.mSourceType, "preview");
        } else if (liveAvatarInfoCardResponseData.playbackInfo != null && !StringUtils.isEmpty(liveAvatarInfoCardResponseData.playbackInfo.content)) {
            c.a(this.mFrameContext, this.mSourceType, "playback");
        } else if (liveAvatarInfoCardResponseData.anchorSubscribeInfo != null && !StringUtils.isEmpty(liveAvatarInfoCardResponseData.anchorSubscribeInfo.title)) {
            c.a(this.mFrameContext, this.mSourceType, "subscribe");
        }
    }

    private String replaceQueryParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b74ef8c", new Object[]{this, str, str2});
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        for (String str3 : parse.getQueryParameterNames()) {
            if (!str3.equals(str2)) {
                buildUpon.appendQueryParameter(str3, parse.getQueryParameter(str3));
            }
        }
        return buildUpon.build().toString();
    }

    private boolean enableProfileReplaceQueryParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2304eb7e", new Object[]{this})).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableProfileReplaceQueryParam", "true"));
    }

    public void refreshLiveDataModel(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4936efb8", new Object[]{this, tBLiveDataModel});
            return;
        }
        this.mLiveDataModel = tBLiveDataModel;
        this.installedWidget = true;
    }

    public void refreshTopUi(final LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63372ff0", new Object[]{this, liveAvatarInfoCardResponseData, new Boolean(z)});
            return;
        }
        this.mAvatarViewBig.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.mAvatarViewBig.asyncSetImageUrl(liveAvatarInfoCardResponseData.broadCasterPic);
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.broadCaster != null && this.mLiveDataModel.mVideoInfo.broadCaster.atmosphere != null && !StringUtils.isEmpty(this.mLiveDataModel.mVideoInfo.broadCaster.atmosphere.headIcon)) {
            this.mAvatarViewBigBorder.setVisibility(0);
            this.mAvatarViewBigBorder.setImageUrl(this.mLiveDataModel.mVideoInfo.broadCaster.atmosphere.headIcon);
        } else {
            this.mAvatarViewBigBorder.setVisibility(8);
        }
        this.mTvUserNameSmall.setText(liveAvatarInfoCardResponseData.broadCasterName);
        this.mAvatarViewBigLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewView.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (StringUtils.isEmpty(liveAvatarInfoCardResponseData.headJumpUrl)) {
                } else {
                    pmd.a().r().a(LiveAvatarNewView.this.mContext, liveAvatarInfoCardResponseData.headJumpUrl, null);
                    LiveAvatarNewView.this.hide();
                    c.c(LiveAvatarNewView.access$900(LiveAvatarNewView.this), LiveAvatarNewView.access$1000(LiveAvatarNewView.this));
                }
            }
        });
        DXRootView createDX = f.m().createDX(this.mContext, TOP_AVATAR_CONTAINER_DX_TEMPLATE_NAME);
        if (createDX != null) {
            this.mAvatarRightContainer.removeAllViews();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(50, -2);
            layoutParams.gravity = 16;
            this.mAvatarRightContainer.addView(createDX, layoutParams);
            JSONObject parseObject = JSON.parseObject(JSONObject.toJSONString(liveAvatarInfoCardResponseData));
            if (hkk.V() && kpj.b(this.mFrameContext, this.mLiveDataModel)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("installedWidget", (Object) Boolean.valueOf(this.installedWidget));
                jSONObject.put("isMyWidgetAnchor", (Object) Boolean.valueOf(this.mLiveDataModel.mVideoInfo.broadCaster.widgetTip.widgetAddition));
                jSONObject.put("widgetJumpUrl", (Object) this.mLiveDataModel.mVideoInfo.broadCaster.widgetTip.widgetJumpUrl);
                jSONObject.put("jumpType", (Object) this.mLiveDataModel.mVideoInfo.broadCaster.widgetTip.jumpType);
                jSONObject.put("componentData", (Object) this.mLiveDataModel.mVideoInfo.broadCaster.widgetTip.componentData);
                parseObject.put("widgetTip", (Object) jSONObject);
            }
            f.m().renderDX(createDX, parseObject, nlq.a(this.mContext));
        }
        if (!StringUtils.isEmpty(liveAvatarInfoCardResponseData.shopJumpUrl) && z) {
            c.a(this.mFrameContext, "shop", this.mSourceType, liveAvatarInfoCardResponseData.follow);
        }
        if (!z || liveAvatarInfoCardResponseData.chatGroupInfo == null) {
            return;
        }
        if (!StringUtils.equals(liveAvatarInfoCardResponseData.chatGroupInfo.canJoinChatGroup, "true") && !StringUtils.equals(liveAvatarInfoCardResponseData.chatGroupInfo.isInChatGroup, "true")) {
            return;
        }
        c.a(this.mFrameContext, "chatGroup", this.mSourceType, liveAvatarInfoCardResponseData.follow);
    }

    public void refreshFollowStatus(boolean z) {
        LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfd586f", new Object[]{this, new Boolean(z)});
        } else if (!isShowing() || (liveAvatarInfoCardResponseData = this.mData) == null) {
        } else {
            liveAvatarInfoCardResponseData.follow = z;
            if (!z) {
                liveAvatarInfoCardResponseData.topFollow = false;
            }
            refreshTopUi(this.mData, false);
        }
    }

    public void refreshTopFollowStatus(boolean z) {
        LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d0a78b0", new Object[]{this, new Boolean(z)});
        } else if (!isShowing() || (liveAvatarInfoCardResponseData = this.mData) == null) {
        } else {
            liveAvatarInfoCardResponseData.topFollow = z;
            refreshTopUi(liveAvatarInfoCardResponseData, false);
        }
    }
}
