package com.taobao.android.fluid.remote.collectionpoplayer.nativecollection;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.videocollection.helper.ICollectionService;
import com.taobao.android.fluid.business.videocollection.poplayer.c;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.SpeedAdustableRecylerView;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.hhy;
import tb.kge;
import tb.kox;
import tb.koz;
import tb.ocb;
import tb.oec;
import tb.ohd;
import tb.slk;
import tb.spz;

/* loaded from: classes5.dex */
public class PopupDialog extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ANIMATION_DURATION = 300;
    public static final int BOTTOM_PADDING = 10;
    public static final String CLOSE_URL = "https://img.alicdn.com/imgextra/i4/O1CN01jMnO4D1h8J3MPVHSQ_!!6000000004232-2-tps-96-96.png";
    public static final String COLLECTION_ID = "collectionId";
    public static final String COLLECT_URL = "https://gw.alicdn.com/imgextra/i1/O1CN01yU6g0V29hOeR9n9y6_!!6000000008099-2-tps-61-61.png";
    public static final String CONTENT = "content";
    public static final int DELAY_MILLIS = 100;
    public static final int INDICATOR_HEIGHT = 8;
    public static final int INDICATOR_WIDTH = 18;
    public static final String LOADING_URL = "https://img.alicdn.com/imgextra/i2/O1CN01lrb2WY1tpbkpCc3L1_!!6000000005951-54-tps-117-117.apng";
    public static final int PADDING = 60;
    public static final int POP_LAYER_HEIGHT;
    public static final int PRELOAD_SIZE = 100;
    public static final int RECOMMAND_SIZE = 4;
    public static final String SHARE_URL = "https://img.alicdn.com/imgextra/i1/O1CN01NsZ2qd1NAmsoOBa0M_!!6000000001530-2-tps-70-70.png";
    public static final String START_INDEX = "1";
    public static final int TABS_COUNT = 2;
    public static final float TAB_WIDTH_RATIO = 0.78f;
    public static final String TAG = "PopupDialog";
    public static final int TEXT_SIZE = 16;
    public static final String TYPE = "type";
    public static final String UN_COLLECT_URL = "https://gw.alicdn.com/imgextra/i3/O1CN01XTsArb1mriPcy2PuC_!!6000000005008-2-tps-61-61.png";
    public static final String X_INDEX = "x_index";
    public static final String X_POSITION = "x_position";
    private View mBottomLayout;
    public TUrlImageView mCloseImageView;
    private TUrlImageView mCollectedImageView;
    private TextView mCollectedView;
    private ArrayList<com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b> mCollectionCells;
    private a mCollectionDataManager;
    public Runnable mDebounceRunnable;
    private TextView mFixTabView;
    private FluidContext mFluidContext;
    public int mHeightPixels;
    public c mICollectionPopLayerAnimateListener;
    private boolean mIsShowing;
    public int mLayerHeight;
    private TUrlImageView mLoadingGif;
    private hhy mPopVideoSizeAdjustHandler;
    private SpeedAdustableRecylerView mRecyclerView;
    private String mRelatedTitle;
    private ValueAnimator mSlideInAnimator;
    private ValueAnimator mSlideOutAnimator;
    private long mStartTime;
    private TextView mSubTitleView;
    private CollectionTabLayout mTabLayout;
    private String mTitle;
    private JSONObject mTransmitParams;
    public int mWidthPixels;
    public boolean mIsFirstLoad = true;
    private List mRangeList = new ArrayList();
    private boolean mHasCollected = false;
    private boolean mHasUpdateCollctStatus = false;
    private boolean mIsScrollingProgrammatically = false;
    public boolean mIsLoading = true;
    public boolean mIsLoadingMore = false;
    public boolean mHasPopupAnimation = true;
    public int mTotalCollectionNum = 0;
    public Handler mDebounceHandler = new Handler();
    public koz mUIUpdateListener = new koz() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.koz
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (PopupDialog.access$000(PopupDialog.this) == null) {
            } else {
                PopupDialog.access$000(PopupDialog.this).setVisibility(i);
            }
        }

        @Override // tb.koz
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            PopupDialog popupDialog = PopupDialog.this;
            PopupDialog.access$200(popupDialog, i, PopupDialog.access$100(popupDialog), i2);
        }

        @Override // tb.koz
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            PopupDialog.access$302(PopupDialog.this, z);
            PopupDialog.access$402(PopupDialog.this, true);
        }
    };
    public CollectionTabLayout.a mOnTabSelectedListener = new CollectionTabLayout.a() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog.10
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (i < 0 || i >= PopupDialog.access$500(PopupDialog.this).size()) {
            } else {
                String a2 = a.a((JSONObject) PopupDialog.access$500(PopupDialog.this).get(i));
                int a3 = ocb.a(a2);
                PopupDialog popupDialog = PopupDialog.this;
                if (PopupDialog.access$200(popupDialog, a3, PopupDialog.access$100(popupDialog), 0)) {
                    PopupDialog.access$000(PopupDialog.this).setVisibility(8);
                } else if (PopupDialog.access$600(PopupDialog.this)) {
                } else {
                    ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> syncloadFromCollectionPagingCache = ((ICollectionService) PopupDialog.access$700(PopupDialog.this).getService(ICollectionService.class)).syncloadFromCollectionPagingCache(a3);
                    if (syncloadFromCollectionPagingCache != null && syncloadFromCollectionPagingCache.size() > 0) {
                        PopupDialog.access$800(PopupDialog.this).a(syncloadFromCollectionPagingCache, false, true);
                        PopupDialog popupDialog2 = PopupDialog.this;
                        PopupDialog.access$200(popupDialog2, a3, PopupDialog.access$100(popupDialog2), 0);
                        PopupDialog.access$000(PopupDialog.this).setVisibility(8);
                        spz.c("PopupDialog", "onTabSelected 从缓存加载了数据");
                        return;
                    }
                    PopupDialog.access$000(PopupDialog.this).setVisibility(0);
                    boolean[] zArr = {false, false};
                    PopupDialog.access$800(PopupDialog.this).a(false, a3, a3, zArr, 0);
                    if (StringUtils.equals(a2, "1")) {
                        PopupDialog.access$800(PopupDialog.this).a(false, a3 + 4, a3, zArr, 1);
                    } else {
                        PopupDialog.access$800(PopupDialog.this).a(true, a3, a3, zArr, 1);
                    }
                    spz.c("PopupDialog", "onTabSelected，发起recommend请求" + i);
                }
            }
        }
    };
    public RecyclerView.OnChildAttachStateChangeListener mAttachStateChangeListener = new RecyclerView.OnChildAttachStateChangeListener() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog.11
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("517542da", new Object[]{this, view});
            } else if (PopupDialog.access$900(PopupDialog.this) || PopupDialog.access$100(PopupDialog.this).isInLayout()) {
            } else {
                PopupDialog.access$800(PopupDialog.this).a(view);
                PopupDialog.this.onScrollEventTriggered();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a66017d", new Object[]{this, view});
            } else if (PopupDialog.access$900(PopupDialog.this) || PopupDialog.access$100(PopupDialog.this).isInLayout()) {
            } else {
                PopupDialog.this.onScrollEventTriggered();
            }
        }
    };
    public LockableRecycerView.a mDragListener = new LockableRecycerView.a() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog.13
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            }
        }

        @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            int findLastVisibleItemPosition = ((LinearLayoutManager) PopupDialog.access$100(PopupDialog.this).getLayoutManager()).findLastVisibleItemPosition();
            if (PopupDialog.access$1100(PopupDialog.this) == null || findLastVisibleItemPosition < 0 || PopupDialog.access$700(PopupDialog.this).getService(IDataService.class) == null || findLastVisibleItemPosition != PopupDialog.access$1100(PopupDialog.this).size() - 1 || ((IDataService) PopupDialog.access$700(PopupDialog.this).getService(IDataService.class)).isLoadingMore() || PopupDialog.access$1200(PopupDialog.this) == null) {
                return;
            }
            if (PopupDialog.access$1200(PopupDialog.this).getTabsContainer().getChildCount() >= 2) {
                int a2 = ((com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b) PopupDialog.access$1100(PopupDialog.this).get(findLastVisibleItemPosition)).a() + 1;
                spz.c("PopupDialog", "最后一个元素ondrag发起请求" + a2);
                PopupDialog.access$800(PopupDialog.this).a(a2, false, 1);
            }
            if (!kox.a(PopupDialog.access$1300(PopupDialog.this)) || PopupDialog.access$100(PopupDialog.this) == null || PopupDialog.access$100(PopupDialog.this).getAdapter() == null || !(PopupDialog.access$100(PopupDialog.this).getAdapter() instanceof com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a) || !com.taobao.android.fluid.business.videocollection.poplayer.b.f() || !((com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a) PopupDialog.access$100(PopupDialog.this).getAdapter()).a() || !((com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a) PopupDialog.access$100(PopupDialog.this).getAdapter()).b()) {
                return;
            }
            spz.c("PopupDialog", "添加相关合集内容");
            PopupDialog.access$100(PopupDialog.this).getAdapter().notifyDataSetChanged();
        }
    };
    public SpeedAdustableRecylerView.a mEndlessScrollListener = new SpeedAdustableRecylerView.a() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog.14
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass14 anonymousClass14, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 806944192) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            } else if (hashCode != 2142696127) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
        }

        @Override // com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.SpeedAdustableRecylerView.a, android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            } else {
                super.onScrollStateChanged(recyclerView, i);
            }
        }

        @Override // com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.SpeedAdustableRecylerView.a, android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            } else {
                super.onScrolled(recyclerView, i, i2);
            }
        }

        @Override // com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.SpeedAdustableRecylerView.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (PopupDialog.access$1100(PopupDialog.this).size() == 0) {
            } else {
                int a2 = ((com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b) PopupDialog.access$1100(PopupDialog.this).get(PopupDialog.access$1100(PopupDialog.this).size() - 1)).a() + 1;
                if (a2 > PopupDialog.this.mTotalCollectionNum) {
                    spz.c("PopupDialog", "最后一个元素触发应请求拦截" + a2);
                    return;
                }
                spz.c("PopupDialog", "onLoadDown" + a2);
                PopupDialog popupDialog = PopupDialog.this;
                popupDialog.mIsLoadingMore = true;
                PopupDialog.access$800(popupDialog).a(a2, false, 1);
                if (PopupDialog.access$1200(PopupDialog.this) == null || PopupDialog.access$1200(PopupDialog.this).getTabsContainer().getChildCount() < 2) {
                    return;
                }
                PopupDialog.access$800(PopupDialog.this).a(a2 + 4, false, 1);
            }
        }

        @Override // com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.SpeedAdustableRecylerView.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (PopupDialog.access$1100(PopupDialog.this).size() == 0) {
            } else {
                int a2 = ((com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b) PopupDialog.access$1100(PopupDialog.this).get(0)).a() - 1;
                spz.c("PopupDialog", "onLoadUp" + a2);
                if (a2 <= 0) {
                    return;
                }
                PopupDialog.access$800(PopupDialog.this).a(a2, true, 1);
                int i = a2 - 4;
                if (i <= 0 || PopupDialog.access$1200(PopupDialog.this) == null || PopupDialog.access$1200(PopupDialog.this).getTabsContainer().getChildCount() < 2) {
                    return;
                }
                PopupDialog.access$800(PopupDialog.this).a(i, true, 1);
            }
        }
    };

    public static /* synthetic */ Object ipc$super(PopupDialog popupDialog, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 2089880052:
                super.onDismiss((DialogInterface) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ TUrlImageView access$000(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("a05918c", new Object[]{popupDialog}) : popupDialog.mLoadingGif;
    }

    public static /* synthetic */ SpeedAdustableRecylerView access$100(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpeedAdustableRecylerView) ipChange.ipc$dispatch("a690675f", new Object[]{popupDialog}) : popupDialog.mRecyclerView;
    }

    public static /* synthetic */ void access$1000(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcaa6b21", new Object[]{popupDialog});
        } else {
            popupDialog.checkTabChanged();
        }
    }

    public static /* synthetic */ ArrayList access$1100(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("251b65da", new Object[]{popupDialog}) : popupDialog.mCollectionCells;
    }

    public static /* synthetic */ CollectionTabLayout access$1200(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CollectionTabLayout) ipChange.ipc$dispatch("a3241369", new Object[]{popupDialog}) : popupDialog.mTabLayout;
    }

    public static /* synthetic */ String access$1300(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("70b7f8a2", new Object[]{popupDialog}) : popupDialog.mRelatedTitle;
    }

    public static /* synthetic */ void access$1400(PopupDialog popupDialog, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a117a64f", new Object[]{popupDialog, fluidContext});
        } else {
            popupDialog.requestRelatedCollection(fluidContext);
        }
    }

    public static /* synthetic */ void access$1500(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c871dd7c", new Object[]{popupDialog});
        } else {
            popupDialog.clickRelatedTab();
        }
    }

    public static /* synthetic */ TextView access$1600(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("c664fbcf", new Object[]{popupDialog}) : popupDialog.mFixTabView;
    }

    public static /* synthetic */ TUrlImageView access$1700(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("692dd282", new Object[]{popupDialog}) : popupDialog.mCollectedImageView;
    }

    public static /* synthetic */ TextView access$1800(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("e27d4f8d", new Object[]{popupDialog}) : popupDialog.mCollectedView;
    }

    public static /* synthetic */ void access$1900(PopupDialog popupDialog, com.taobao.android.fluid.framework.data.datamodel.a aVar, CollectionTabLayout collectionTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41d8fe86", new Object[]{popupDialog, aVar, collectionTabLayout});
        } else {
            popupDialog.updateCurrentCell(aVar, collectionTabLayout);
        }
    }

    public static /* synthetic */ boolean access$200(PopupDialog popupDialog, int i, RecyclerView recyclerView, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("371f74a4", new Object[]{popupDialog, new Integer(i), recyclerView, new Integer(i2)})).booleanValue() : popupDialog.scrolltoCollectionCellsIndex(i, recyclerView, i2);
    }

    public static /* synthetic */ boolean access$300(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("507e8111", new Object[]{popupDialog})).booleanValue() : popupDialog.mHasCollected;
    }

    public static /* synthetic */ boolean access$302(PopupDialog popupDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c6075ed", new Object[]{popupDialog, new Boolean(z)})).booleanValue();
        }
        popupDialog.mHasCollected = z;
        return z;
    }

    public static /* synthetic */ boolean access$402(PopupDialog popupDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85683aee", new Object[]{popupDialog, new Boolean(z)})).booleanValue();
        }
        popupDialog.mHasUpdateCollctStatus = z;
        return z;
    }

    public static /* synthetic */ List access$500(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a04a541c", new Object[]{popupDialog}) : popupDialog.mRangeList;
    }

    public static /* synthetic */ boolean access$600(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("778fc5ae", new Object[]{popupDialog})).booleanValue() : popupDialog.unPagedClicked();
    }

    public static /* synthetic */ FluidContext access$700(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("a1247e1f", new Object[]{popupDialog}) : popupDialog.mFluidContext;
    }

    public static /* synthetic */ a access$800(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("74c64a92", new Object[]{popupDialog}) : popupDialog.mCollectionDataManager;
    }

    public static /* synthetic */ boolean access$900(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9ea10a4b", new Object[]{popupDialog})).booleanValue() : popupDialog.mIsScrollingProgrammatically;
    }

    static {
        kge.a(-2035259270);
        POP_LAYER_HEIGHT = (int) ((ohd.a() + ohd.h(FluidSDK.getContext())) * 0.69d);
    }

    public void setCollectionPopLayerAnimateListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfa1f8a", new Object[]{this, cVar});
        } else {
            this.mICollectionPopLayerAnimateListener = cVar;
        }
    }

    private boolean unPagedClicked() {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5dbeef6", new Object[]{this})).booleanValue();
        }
        if (!kox.a(this.mRelatedTitle) || this.mTabLayout.getSelectedTabPosition() != 0 || this.mTabLayout.getTabsContainer().getChildCount() != 1 || (a2 = this.mCollectionDataManager.a()) == null) {
            return false;
        }
        scrolltoCollectionCellsIndex(oec.a((Object) a2.getString("index"), 0), this.mRecyclerView, 0);
        return true;
    }

    public void onScrollEventTriggered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5ee4b90", new Object[]{this});
            return;
        }
        Runnable runnable = this.mDebounceRunnable;
        if (runnable != null) {
            this.mDebounceHandler.removeCallbacks(runnable);
        }
        this.mDebounceRunnable = new Runnable() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    PopupDialog.access$1000(PopupDialog.this);
                }
            }
        };
        this.mDebounceHandler.postDelayed(this.mDebounceRunnable, 100L);
    }

    private void checkTabChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a9798e", new Object[]{this});
            return;
        }
        SpeedAdustableRecylerView speedAdustableRecylerView = this.mRecyclerView;
        if (speedAdustableRecylerView == null || speedAdustableRecylerView.getLayoutManager() == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.mRecyclerView.getLayoutManager();
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        ArrayList<com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b> arrayList = this.mCollectionCells;
        if (arrayList == null || findLastVisibleItemPosition < 0 || findLastVisibleItemPosition > arrayList.size() || findFirstVisibleItemPosition < 0 || findFirstVisibleItemPosition > this.mCollectionCells.size()) {
            return;
        }
        if (findFirstVisibleItemPosition < this.mCollectionCells.size() && findLastVisibleItemPosition == this.mCollectionCells.size() && this.mTabLayout.getSelectedTabPosition() == this.mTabLayout.getTabsContainer().getChildCount()) {
            spz.c("PopupDialog", "从相关合集滚动到选集");
            CollectionTabLayout collectionTabLayout = this.mTabLayout;
            collectionTabLayout.setScrollPosition(collectionTabLayout.getTabsContainer().getChildCount() - 1, true);
        } else if (findFirstVisibleItemPosition == this.mCollectionCells.size() && this.mTabLayout.getSelectedTabPosition() != this.mTabLayout.getTabsContainer().getChildCount()) {
            spz.c("PopupDialog", "从选集滚动到相关合集");
            this.mTabLayout.clickOutSide(1);
        } else if (findFirstVisibleItemPosition >= this.mCollectionCells.size()) {
            spz.c("PopupDialog", "相关合集中其他情况，防止移除");
        } else {
            if (findLastVisibleItemPosition == this.mCollectionCells.size()) {
                findLastVisibleItemPosition--;
            }
            spz.c("PopupDialog", "firstVisiblePosition" + this.mCollectionCells.get(findFirstVisibleItemPosition).a() + "lastVisiblePosition" + this.mCollectionCells.get(findLastVisibleItemPosition).a());
            int a2 = this.mCollectionCells.get(findFirstVisibleItemPosition).a();
            if (this.mTabLayout.getSelectedTabPosition() < this.mRangeList.size()) {
                JSONObject jSONObject = (JSONObject) this.mRangeList.get(this.mTabLayout.getSelectedTabPosition());
                if (a2 >= ocb.a(a.a(jSONObject)) && a2 <= ocb.a(jSONObject.getString("end"))) {
                    return;
                }
            }
            for (int i = 0; i < this.mRangeList.size(); i++) {
                JSONObject jSONObject2 = (JSONObject) this.mRangeList.get(i);
                String a3 = a.a(jSONObject2);
                String string = jSONObject2.getString("end");
                int a4 = this.mCollectionCells.get(findFirstVisibleItemPosition).a();
                int a5 = this.mCollectionCells.get(findLastVisibleItemPosition).a();
                if (a4 >= ocb.a(a3) && a4 <= ocb.a(string)) {
                    spz.c("PopupDialog", "首个元素触发应该滑动到" + i);
                    this.mTabLayout.setScrollPosition(i, true);
                    return;
                }
                if (a5 >= ocb.a(a3) && a5 <= ocb.a(string)) {
                    spz.c("PopupDialog", "末尾元素触发应该滑动到" + i);
                    this.mTabLayout.setScrollPosition(i, true);
                }
            }
        }
    }

    private void clickRelatedTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d57ba99", new Object[]{this});
            return;
        }
        this.mTabLayout.clickOutSide(1);
        int size = this.mCollectionCells.size() - 1;
        if (size < 0) {
            return;
        }
        if (this.mCollectionCells.get(size).a() == this.mTotalCollectionNum) {
            this.mLoadingGif.setVisibility(8);
            ((LinearLayoutManager) this.mRecyclerView.getLayoutManager()).scrollToPositionWithOffset(size + 1, 0);
        } else if (this.mTabLayout.getTabsContainer().getChildCount() == 1) {
            int ceil = (int) Math.ceil((this.mTotalCollectionNum - this.mCollectionCells.get(size).a()) / 4.0d);
            this.mLoadingGif.setVisibility(0);
            this.mCollectionDataManager.a(size, false, ceil);
            com.taobao.android.fluid.business.usertrack.track.b.b(this.mFluidContext, "Button-CollectionPopRelatedFilmTab", null);
            return;
        } else {
            ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> syncloadFromCollectionPagingCache = ((ICollectionService) this.mFluidContext.getService(ICollectionService.class)).syncloadFromCollectionPagingCache(this.mTotalCollectionNum);
            if (syncloadFromCollectionPagingCache.size() > 0) {
                this.mCollectionDataManager.a(syncloadFromCollectionPagingCache, false, true);
                this.mLoadingGif.setVisibility(8);
                scrolltoCollectionCellsIndex(this.mTotalCollectionNum + 1, this.mRecyclerView, 0);
            } else {
                this.mLoadingGif.setVisibility(0);
                int i = (this.mTotalCollectionNum - 4) + 1;
                while (true) {
                    if (i >= this.mTotalCollectionNum + 1) {
                        break;
                    } else if (((ICollectionService) this.mFluidContext.getService(ICollectionService.class)).syncloadFromCollectionPagingCache(i).size() == 0) {
                        this.mCollectionDataManager.a(false, i, this.mTotalCollectionNum + 1, new boolean[]{false, true}, 0);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        com.taobao.android.fluid.business.usertrack.track.b.b(this.mFluidContext, "Button-CollectionPopRelatedFilmTab", null);
    }

    public void setTransmitParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7faf0f1", new Object[]{this, jSONObject});
        } else {
            this.mTransmitParams = jSONObject;
        }
    }

    public JSONObject getTransmitParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("c6b25ef3", new Object[]{this}) : this.mTransmitParams;
    }

    public void setStartTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c94730", new Object[]{this, new Long(j)});
        } else {
            this.mStartTime = j;
        }
    }

    public void setFluidContext(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2e4d40", new Object[]{this, fluidContext});
        } else {
            this.mFluidContext = fluidContext;
        }
    }

    public void setRangeList(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2020f631", new Object[]{this, list});
        } else {
            this.mRangeList = list;
        }
    }

    public void setRelatedTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("768333c0", new Object[]{this, str});
        } else {
            this.mRelatedTitle = str;
        }
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.mTitle = str;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
        ((ViewGroup.LayoutParams) attributes).width = -1;
        ((ViewGroup.LayoutParams) attributes).height = POP_LAYER_HEIGHT;
        getDialog().getWindow().setGravity(80);
        getDialog().getWindow().setAttributes(attributes);
        if (this.mIsLoading) {
            HashMap hashMap = new HashMap();
            hashMap.put("svm_cost", String.valueOf(SystemClock.uptimeMillis() - this.mStartTime));
            hashMap.put("isNative", "true");
            com.taobao.android.fluid.business.usertrack.track.b.b(this.mFluidContext, "Button-GlobalWebPopWillShow", hashMap);
        }
        super.onResume();
    }

    @Override // android.support.v4.app.DialogFragment
    /* renamed from: onCreateDialog */
    public Dialog mo1438onCreateDialog(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("cc7a75a5", new Object[]{this, bundle});
        }
        Dialog dialog = new Dialog(getActivity(), R.style.FluidDialogTheme);
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.fluid_sdk_remote_collection_dialog_remote, (ViewGroup) null);
        dialog.getWindow().getAttributes().windowAnimations = R.style.FluiddialogAnim;
        dialog.setContentView(inflate);
        return dialog;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.FluidDialogTheme);
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        if (!isAdded() || getActivity() == null || getActivity().isFinishing()) {
            return;
        }
        this.mHasPopupAnimation = true;
        this.mLayerHeight = POP_LAYER_HEIGHT;
        this.mWidthPixels = getResources().getDisplayMetrics().widthPixels;
        this.mHeightPixels = getResources().getDisplayMetrics().heightPixels + ohd.h(getContext());
        if (getDialog().getWindow() == null || this.mICollectionPopLayerAnimateListener == null) {
            return;
        }
        this.mSlideInAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mSlideInAnimator.setDuration(300L);
        this.mSlideInAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else {
                    PopupDialog.this.mICollectionPopLayerAnimateListener.b(new com.taobao.android.fluid.framework.data.datamodel.pop.a(PopupDialog.this.mHeightPixels, PopupDialog.this.mHeightPixels - PopupDialog.this.mLayerHeight, 0, (int) ((PopupDialog.this.mHeightPixels - PopupDialog.this.mLayerHeight) + (PopupDialog.this.mLayerHeight * (1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()))), PopupDialog.this.mLayerHeight, PopupDialog.this.mWidthPixels));
                }
            }
        });
        this.mSlideInAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass16 anonymousClass16, String str, Object... objArr) {
                if (str.hashCode() == -2145066406) {
                    super.onAnimationEnd((Animator) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                super.onAnimationEnd(animator);
                PopupDialog.this.mICollectionPopLayerAnimateListener.b(IAKPopRender.LifecycleType.IN_ANIMATION_END, new com.taobao.android.fluid.framework.data.datamodel.pop.a(PopupDialog.this.mHeightPixels, PopupDialog.this.mHeightPixels - PopupDialog.this.mLayerHeight, 0, PopupDialog.this.mHeightPixels - PopupDialog.this.mLayerHeight, PopupDialog.this.mLayerHeight, PopupDialog.this.mWidthPixels));
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dcb3fd3", new Object[]{this, animator, new Boolean(z)});
                    return;
                }
                super.onAnimationStart(animator, z);
                PopupDialog.this.mICollectionPopLayerAnimateListener.b(IAKPopRender.LifecycleType.IN_ANIMATION_START, new com.taobao.android.fluid.framework.data.datamodel.pop.a(PopupDialog.this.mHeightPixels, PopupDialog.this.mHeightPixels - PopupDialog.this.mLayerHeight, 0, PopupDialog.this.mHeightPixels, PopupDialog.this.mLayerHeight, PopupDialog.this.mWidthPixels));
            }
        });
        this.mSlideInAnimator.start();
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        super.onDismiss(dialogInterface);
        this.mIsShowing = false;
        this.mCollectionDataManager.b(false);
        this.mIsFirstLoad = false;
        this.mLayerHeight = POP_LAYER_HEIGHT;
        if (getDialog() == null) {
            checkResizeVideo();
        } else if (!this.mHasPopupAnimation) {
            checkResizeVideo();
        } else if (getDialog().getWindow() != null && this.mICollectionPopLayerAnimateListener != null) {
            this.mSlideOutAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.mSlideOutAnimator.setDuration(300L);
            this.mSlideOutAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else {
                        PopupDialog.this.mICollectionPopLayerAnimateListener.b(new com.taobao.android.fluid.framework.data.datamodel.pop.a(PopupDialog.this.mHeightPixels - PopupDialog.this.mLayerHeight, PopupDialog.this.mHeightPixels, 0, (int) ((PopupDialog.this.mHeightPixels - PopupDialog.this.mLayerHeight) + (PopupDialog.this.mLayerHeight * ((Float) valueAnimator.getAnimatedValue()).floatValue())), PopupDialog.this.mLayerHeight, PopupDialog.this.mWidthPixels));
                    }
                }
            });
            this.mSlideOutAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    if (str.hashCode() == -2145066406) {
                        super.onAnimationEnd((Animator) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    super.onAnimationEnd(animator);
                    PopupDialog.this.checkResizeVideo();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dcb3fd3", new Object[]{this, animator, new Boolean(z)});
                        return;
                    }
                    super.onAnimationStart(animator, z);
                    PopupDialog.this.mICollectionPopLayerAnimateListener.b(IAKPopRender.LifecycleType.OUT_ANIMATION_START, new com.taobao.android.fluid.framework.data.datamodel.pop.a(PopupDialog.this.mHeightPixels, PopupDialog.this.mHeightPixels - PopupDialog.this.mLayerHeight, 0, PopupDialog.this.mHeightPixels - PopupDialog.this.mLayerHeight, PopupDialog.this.mLayerHeight, PopupDialog.this.mWidthPixels));
                }
            });
            this.mSlideOutAnimator.start();
        } else {
            checkResizeVideo();
        }
    }

    public void checkResizeVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("764f9306", new Object[]{this});
            return;
        }
        int i = this.mHeightPixels;
        int i2 = this.mLayerHeight;
        com.taobao.android.fluid.framework.data.datamodel.pop.a aVar = new com.taobao.android.fluid.framework.data.datamodel.pop.a(i, i - i2, 0, i, i2, this.mWidthPixels);
        c cVar = this.mICollectionPopLayerAnimateListener;
        if (cVar != null) {
            cVar.b(IAKPopRender.LifecycleType.BEFORE_CLOSE, aVar);
        }
        hhy hhyVar = this.mPopVideoSizeAdjustHandler;
        if (hhyVar == null) {
            return;
        }
        hhyVar.a(false);
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        spz.c("PopupDialog", "onCreateView");
        this.mIsShowing = true;
        this.mCollectionCells = new ArrayList<>();
        View loadViewFromXml = loadViewFromXml(layoutInflater, viewGroup);
        this.mCollectionDataManager = new a(this.mCollectionCells, this.mRecyclerView, this.mFluidContext, this.mTabLayout, this.mUIUpdateListener, this.mRelatedTitle, this.mRangeList);
        this.mCollectionDataManager.a(this.mUIUpdateListener);
        this.mCollectionDataManager.b(true);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false) { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                if (str.hashCode() == 1046880189) {
                    return new Integer(super.getExtraLayoutSpace((RecyclerView.State) objArr[0]));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.LinearLayoutManager
            public int getExtraLayoutSpace(RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("3e661fbd", new Object[]{this, state})).intValue() : super.getExtraLayoutSpace(state) + 100;
            }
        });
        this.mRecyclerView.setPadding(0, 0, 0, 10);
        com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a aVar = new com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a(this.mCollectionCells);
        aVar.a(this);
        aVar.a(this.mFluidContext);
        JSONObject jSONObject = this.mTransmitParams;
        if (jSONObject != null) {
            this.mTotalCollectionNum = oec.a(jSONObject.get("total"), 0);
            this.mCollectionDataManager.a(this.mTotalCollectionNum);
            aVar.a(this.mTotalCollectionNum);
        }
        this.mRecyclerView.setAdapter(aVar);
        addListener();
        this.mCollectionDataManager.a(loadViewFromXml, this);
        handleCollect(loadViewFromXml);
        return loadViewFromXml;
    }

    public boolean isCurrentlyShowing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a92ee174", new Object[]{this})).booleanValue() : this.mIsShowing;
    }

    private View loadViewFromXml(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1356bdda", new Object[]{this, layoutInflater, viewGroup});
        }
        View inflate = layoutInflater.inflate(R.layout.fluid_sdk_remote_collection_dialog_remote, viewGroup, false);
        this.mRecyclerView = (SpeedAdustableRecylerView) inflate.findViewById(R.id.collectionDialog_recyclerView_remote);
        this.mTabLayout = (CollectionTabLayout) inflate.findViewById(R.id.collectionDialog_tab_layout_remote);
        this.mTabLayout.setIndicatorWidth(ohd.b(getContext(), 18));
        this.mTabLayout.setIndicatorHeight(8);
        this.mCloseImageView = (TUrlImageView) inflate.findViewById(R.id.collectionDialog_close);
        this.mCollectedView = (TextView) inflate.findViewById(R.id.collectionDialog_collect_text);
        this.mCollectedImageView = (TUrlImageView) inflate.findViewById(R.id.collectionDialog_collect_img);
        this.mCloseImageView.setImageUrl(CLOSE_URL);
        this.mSubTitleView = (TextView) inflate.findViewById(R.id.collectionDialog_update_text);
        if (this.mTransmitParams != null) {
            TextView textView = this.mSubTitleView;
            textView.setText("更新至第" + this.mTransmitParams.get("total") + "集");
        }
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.collectionDialog_collect_img);
        if (!this.mHasCollected) {
            tUrlImageView.setImageUrl(UN_COLLECT_URL);
        } else {
            tUrlImageView.setImageUrl(COLLECT_URL);
            ((TextView) inflate.findViewById(R.id.collectionDialog_collect_text)).setText("已收藏");
        }
        ((TUrlImageView) inflate.findViewById(R.id.collectionDialog_share_img)).setImageUrl(SHARE_URL);
        TextView textView2 = (TextView) inflate.findViewById(R.id.collectionDialog_title);
        this.mFixTabView = (TextView) inflate.findViewById(R.id.fixed_view);
        this.mFixTabView.setVisibility(8);
        addRelatedTabView();
        this.mLoadingGif = (TUrlImageView) inflate.findViewById(R.id.collectionDialog_loading_gif);
        this.mLoadingGif.setSkipAutoSize(true);
        this.mLoadingGif.setImageUrl(LOADING_URL);
        this.mLoadingGif.setVisibility(0);
        this.mBottomLayout = inflate.findViewById(R.id.collectionDialog_bottom_layout);
        textView2.setText(this.mTitle);
        textView2.setMaxWidth((ohd.b(getContext()) - this.mCloseImageView.getWidth()) - ohd.b(getContext(), 60));
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        resizeCollectionForHeight();
        return inflate;
    }

    private void resizeCollectionForHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626ce85", new Object[]{this});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mRecyclerView.getLayoutParams();
        layoutParams.height = (layoutParams.height * POP_LAYER_HEIGHT) / ohd.b(getContext(), 600);
        this.mRecyclerView.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.mBottomLayout.getLayoutParams();
        layoutParams2.height = (layoutParams2.height * POP_LAYER_HEIGHT) / ohd.b(getContext(), 600);
        this.mBottomLayout.setLayoutParams(layoutParams2);
    }

    private void addRelatedTabView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82dca4b7", new Object[]{this});
        } else if (!kox.a(this.mRelatedTitle)) {
        } else {
            this.mFixTabView.setVisibility(0);
            this.mFixTabView.setText(this.mRelatedTitle);
            this.mFixTabView.setTextColor(-6710887);
            this.mFixTabView.setTextSize(1, 16.0f);
            this.mFixTabView.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                    }
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1) {
                            return false;
                        }
                        PopupDialog popupDialog = PopupDialog.this;
                        PopupDialog.access$1400(popupDialog, PopupDialog.access$700(popupDialog));
                        PopupDialog.access$1500(PopupDialog.this);
                    }
                    return true;
                }
            });
            this.mTabLayout.post(new Runnable() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!PopupDialog.this.isAdded() || PopupDialog.this.getActivity() == null || PopupDialog.this.getActivity().isFinishing()) {
                    } else {
                        spz.c("PopupDialog", "onCreateView" + PopupDialog.access$1200(PopupDialog.this).getWidth());
                        if (PopupDialog.access$1200(PopupDialog.this).getWidth() + PopupDialog.access$1600(PopupDialog.this).getWidth() + 60 < PopupDialog.this.getResources().getDisplayMetrics().widthPixels) {
                            return;
                        }
                        int i = PopupDialog.this.getResources().getDisplayMetrics().widthPixels;
                        ViewGroup.LayoutParams layoutParams = PopupDialog.access$1200(PopupDialog.this).getLayoutParams();
                        layoutParams.width = (int) (i * 0.78f);
                        PopupDialog.access$1200(PopupDialog.this).setLayoutParams(layoutParams);
                    }
                }
            });
        }
    }

    public void handleCollect(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af74c9", new Object[]{this, view});
        } else {
            ((LinearLayout) view.findViewById(R.id.collectCollection)).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TextView access$1800;
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        return;
                    }
                    if (!PopupDialog.access$300(PopupDialog.this)) {
                        PopupDialog.access$1700(PopupDialog.this).setImageUrl(PopupDialog.COLLECT_URL);
                        access$1800 = PopupDialog.access$1800(PopupDialog.this);
                        str = "已收藏";
                    } else {
                        PopupDialog.access$1700(PopupDialog.this).setImageUrl(PopupDialog.UN_COLLECT_URL);
                        access$1800 = PopupDialog.access$1800(PopupDialog.this);
                        str = "收藏合集";
                    }
                    access$1800.setText(str);
                    PopupDialog.access$800(PopupDialog.this).a(PopupDialog.access$300(PopupDialog.this));
                }
            });
        }
    }

    private void updateCollectStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f64ee7a", new Object[]{this});
        } else if (this.mCollectionDataManager.a() == null) {
        } else {
            if (!this.mHasUpdateCollctStatus) {
                this.mHasCollected = oec.a(this.mCollectionDataManager.a().get("collectionSubscribe"), false);
                this.mHasUpdateCollctStatus = true;
            }
            if (this.mHasCollected) {
                this.mCollectedImageView.setImageUrl(COLLECT_URL);
                this.mCollectedView.setText("已收藏");
                return;
            }
            this.mCollectedImageView.setImageUrl(UN_COLLECT_URL);
            this.mCollectedView.setText("收藏合集");
        }
    }

    private void addListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f8b27c", new Object[]{this});
            return;
        }
        this.mRecyclerView.addOnScrollListener(this.mEndlessScrollListener);
        this.mRecyclerView.addOnChildAttachStateChangeListener(this.mAttachStateChangeListener);
        this.mRecyclerView.addOnDragListener(this.mDragListener);
        this.mTabLayout.setOnTabSelectedListener(this.mOnTabSelectedListener);
        ((com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a) this.mRecyclerView.getAdapter()).a(new a.View$OnClickListenerC0498a.InterfaceC0499a() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a.View$OnClickListenerC0498a.InterfaceC0499a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else if (i >= PopupDialog.access$1100(PopupDialog.this).size()) {
                } else {
                    ((IFeedsListService) PopupDialog.access$700(PopupDialog.this).getService(IFeedsListService.class)).scrollToItem(((com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b) PopupDialog.access$1100(PopupDialog.this).get(i)).b());
                    HashMap hashMap = new HashMap();
                    hashMap.put(PopupDialog.X_INDEX, String.valueOf(((com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b) PopupDialog.access$1100(PopupDialog.this).get(i)).a()));
                    hashMap.put(PopupDialog.X_POSITION, String.valueOf(i));
                    com.taobao.android.fluid.business.usertrack.track.b.b(PopupDialog.access$700(PopupDialog.this), "Button-collection", hashMap);
                    if (PopupDialog.access$800(PopupDialog.this).a() != null && ((com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b) PopupDialog.access$1100(PopupDialog.this).get(i)).a() != oec.a((Object) PopupDialog.access$800(PopupDialog.this).a().getString("index"), 0)) {
                        PopupDialog.this.mHasPopupAnimation = false;
                    }
                    this.dismissAllowingStateLoss();
                }
            }
        });
        this.mCloseImageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    PopupDialog.this.dismissAllowingStateLoss();
                }
            }
        });
    }

    public void updateViewAfterDetail(ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> arrayList, boolean z, slk.a aVar, boolean z2) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bacf403", new Object[]{this, arrayList, new Boolean(z), aVar, new Boolean(z2)});
        } else if (!z) {
            this.mCollectionDataManager.a(aVar, z2);
        } else if (this.mTabLayout == null) {
            spz.c("PopupDialog", "updateViewAfterDetail error, mTabLayout == null");
        } else {
            this.mIsLoading = false;
            TUrlImageView tUrlImageView = this.mLoadingGif;
            if (tUrlImageView != null) {
                tUrlImageView.setVisibility(8);
            }
            if (this.mRangeList.size() == 1) {
                this.mTabLayout.addTab("选集", -6710887, 16);
            } else {
                for (int i = 0; i < this.mRangeList.size(); i++) {
                    JSONObject jSONObject = (JSONObject) this.mRangeList.get(i);
                    String a3 = a.a(jSONObject);
                    String string = jSONObject.getString("end");
                    this.mTabLayout.addTab(a3 + "-" + string, -6710887, 16);
                }
            }
            if (kox.a(this.mRelatedTitle)) {
                addRelatedTabView();
            }
            if (this.mTabLayout.getTabsContainer().getChildCount() < 2 && !kox.a(this.mRelatedTitle)) {
                this.mTabLayout.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = this.mRecyclerView.getLayoutParams();
                layoutParams.height += this.mTabLayout.getLayoutParams().height;
                this.mRecyclerView.setLayoutParams(layoutParams);
            }
            if (this.mTransmitParams == null && (a2 = this.mCollectionDataManager.a()) != null) {
                this.mTotalCollectionNum = oec.a(a2.get("count"), 0);
                ((com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a) this.mRecyclerView.getAdapter()).a(this.mTotalCollectionNum);
                this.mCollectionDataManager.a(this.mTotalCollectionNum);
                this.mSubTitleView.setText("更新至第" + this.mTotalCollectionNum + "集");
            }
            this.mCollectionDataManager.a(arrayList, false, false);
            oec.a(new Runnable() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    PopupDialog popupDialog = PopupDialog.this;
                    PopupDialog.access$1900(popupDialog, ((IDataService) PopupDialog.access$700(popupDialog).getService(IDataService.class)).getCurrentMediaSetData(), PopupDialog.access$1200(PopupDialog.this));
                }
            });
            updateCollectStatus();
            requestRelatedCollection(this.mFluidContext);
            if (this.mCollectionDataManager.a() != null) {
                ((com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a) this.mRecyclerView.getAdapter()).a(this.mCollectionDataManager.a().getString("collectionName"));
            } else {
                ((com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a) this.mRecyclerView.getAdapter()).a(this.mTitle);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("svm_cost", String.valueOf(SystemClock.uptimeMillis() - this.mStartTime));
            hashMap.put("isNative", "true");
            com.taobao.android.fluid.business.usertrack.track.b.b(this.mFluidContext, "Button-GlobalWebPopHasShow", hashMap);
        }
    }

    private void requestRelatedCollection(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8217db93", new Object[]{this, fluidContext});
            return;
        }
        JSONObject a2 = this.mCollectionDataManager.a();
        if (a2 == null || this.mRecyclerView.getAdapter() == null || !(this.mRecyclerView.getAdapter() instanceof com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a)) {
            return;
        }
        com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a aVar = (com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a) this.mRecyclerView.getAdapter();
        String string = a2.getString(COLLECTION_ID);
        if (aVar.b() && aVar.a()) {
            return;
        }
        kox.a("type", string, this.mRelatedTitle, aVar, fluidContext);
        kox.a("content", string, this.mRelatedTitle, aVar, fluidContext);
    }

    private void updateCurrentCell(com.taobao.android.fluid.framework.data.datamodel.a aVar, CollectionTabLayout collectionTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f71947", new Object[]{this, aVar, collectionTabLayout});
            return;
        }
        int i = -1;
        if (this.mCollectionCells.size() == 0 || aVar == null || aVar.a() == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.mCollectionCells.size()) {
                break;
            } else if (StringUtils.equals(this.mCollectionCells.get(i2).b(), aVar.a().g())) {
                spz.c("PopupDialog", "updateCurrentCell:" + this.mCollectionCells.get(i2).a());
                ((com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a) this.mRecyclerView.getAdapter()).b(this.mCollectionCells.get(i2).b());
                i = this.mCollectionCells.get(i2).a();
                this.mRecyclerView.getAdapter().notifyDataSetChanged();
                break;
            } else {
                i2++;
            }
        }
        scrolltoCollectionCellsIndex(i, this.mRecyclerView, 1);
        for (int i3 = 0; i3 < this.mRangeList.size(); i3++) {
            JSONObject jSONObject = (JSONObject) this.mRangeList.get(i3);
            String a2 = a.a(jSONObject);
            String string = jSONObject.getString("end");
            if (i >= ocb.a(a2) && i <= ocb.a(string)) {
                spz.c("PopupDialog", "tablayot应该滑动到" + i3);
                collectionTabLayout.setScrollPosition(i3, false);
                return;
            }
        }
    }

    private boolean scrolltoCollectionCellsIndex(int i, RecyclerView recyclerView, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35a66e4", new Object[]{this, new Integer(i), recyclerView, new Integer(i2)})).booleanValue();
        }
        if (this.mCollectionCells.size() <= 0) {
            return false;
        }
        int size = this.mCollectionCells.size() - 1;
        if (i == this.mTotalCollectionNum + 1 && this.mCollectionCells.size() > 0 && this.mCollectionCells.get(size).a() == i - 1) {
            spz.c("PopupDialog", "滑动到相关合集:");
            this.mIsScrollingProgrammatically = true;
            ((LinearLayoutManager) recyclerView.getLayoutManager()).scrollToPositionWithOffset(size + 1, 0);
            this.mIsScrollingProgrammatically = false;
            return true;
        }
        int i3 = 0;
        while (i3 < this.mCollectionCells.size()) {
            int a2 = this.mCollectionCells.get(i3).a();
            if (a2 == i) {
                int i4 = i3 > 0 ? i3 - i2 : i3;
                if (i4 >= 0 && recyclerView.getAdapter() != null && i4 < recyclerView.getAdapter().getItemCount()) {
                    spz.c("PopupDialog", "scrolltoCollectionCellsIndex:" + a2 + "position:" + i4);
                    this.mIsScrollingProgrammatically = true;
                    ((LinearLayoutManager) recyclerView.getLayoutManager()).scrollToPositionWithOffset(i4, 0);
                    this.mIsScrollingProgrammatically = false;
                    return true;
                }
            }
            i3++;
        }
        spz.c("PopupDialog", "scrolltoCollectionCellsIndex:没有找到" + i);
        return false;
    }

    public void setPopVideoSizeAdjustHandler(hhy hhyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e12c754c", new Object[]{this, hhyVar});
        } else {
            this.mPopVideoSizeAdjustHandler = hhyVar;
        }
    }
}
