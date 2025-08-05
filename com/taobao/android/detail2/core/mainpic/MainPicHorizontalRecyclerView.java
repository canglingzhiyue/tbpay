package com.taobao.android.detail2.core.mainpic;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import com.taobao.ptr.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.fjp;
import tb.fjt;
import tb.kge;

/* loaded from: classes5.dex */
public class MainPicHorizontalRecyclerView extends RecyclerView implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int PAGE_SCROLL_DIRECTION_LEFT = 1;
    private static final int PAGE_SCROLL_DIRECTION_RIGHT = -1;
    private float downX;
    private float downY;
    private float interceptDownX;
    private float interceptDownY;
    private boolean isDragingAfterFling;
    private boolean isFlinging;
    private int mBeforeScrollPosition;
    private Context mContext;
    private LinearLayoutManager mLinearLayoutManager;
    private d mMainPicScrollDeviceHelper;
    private List<a> mOnPageChangedListeners;
    private List<b> mOnScrollStatusListeners;
    private PagerSnapHelper mPageSnapHelper;
    private Map<Integer, RecyclerView.ViewHolder> mPostionHolders;
    private int mSmoothScrollTargetPosition;
    private int mTouchSlop;
    private float scrollSpeedPerPixelTime;

    /* loaded from: classes5.dex */
    public enum ScrollDirection {
        LEFT("left"),
        RIGHT("right"),
        UP("up"),
        DOWN("down");
        
        private String direction;

        ScrollDirection(String str) {
            this.direction = str;
        }

        public String getDirection() {
            return this.direction;
        }
    }

    /* loaded from: classes5.dex */
    public interface a {
        void a(int i, int i2);

        void b(int i, int i2);
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a(MotionEvent motionEvent);
    }

    static {
        kge.a(-1122537940);
        kge.a(-1419130634);
    }

    public static /* synthetic */ Object ipc$super(MainPicHorizontalRecyclerView mainPicHorizontalRecyclerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode == -407533570) {
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            }
            if (hashCode != 371177099) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.scrollToPosition(((Number) objArr[0]).intValue());
            return null;
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    @Override // com.taobao.ptr.h
    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // com.taobao.ptr.h
    public boolean isReadyForPullStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cf0e198", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterAdded(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04e19b", new Object[]{this, pullBase});
        }
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterRemoved(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea67bf7b", new Object[]{this, pullBase});
        }
    }

    public static /* synthetic */ d access$000(MainPicHorizontalRecyclerView mainPicHorizontalRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("4cae4118", new Object[]{mainPicHorizontalRecyclerView}) : mainPicHorizontalRecyclerView.mMainPicScrollDeviceHelper;
    }

    public static /* synthetic */ void access$100(MainPicHorizontalRecyclerView mainPicHorizontalRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63e059d", new Object[]{mainPicHorizontalRecyclerView});
        } else {
            mainPicHorizontalRecyclerView.notifyPageChange();
        }
    }

    public static /* synthetic */ boolean access$200(MainPicHorizontalRecyclerView mainPicHorizontalRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff3f5740", new Object[]{mainPicHorizontalRecyclerView})).booleanValue() : mainPicHorizontalRecyclerView.isFlinging;
    }

    public static /* synthetic */ boolean access$202(MainPicHorizontalRecyclerView mainPicHorizontalRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea49401e", new Object[]{mainPicHorizontalRecyclerView, new Boolean(z)})).booleanValue();
        }
        mainPicHorizontalRecyclerView.isFlinging = z;
        return z;
    }

    public static /* synthetic */ boolean access$302(MainPicHorizontalRecyclerView mainPicHorizontalRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f172225f", new Object[]{mainPicHorizontalRecyclerView, new Boolean(z)})).booleanValue();
        }
        mainPicHorizontalRecyclerView.isDragingAfterFling = z;
        return z;
    }

    public MainPicHorizontalRecyclerView(Context context) {
        super(context);
        this.mOnScrollStatusListeners = new ArrayList();
        this.mSmoothScrollTargetPosition = 0;
        this.mBeforeScrollPosition = -1;
        this.mOnPageChangedListeners = new ArrayList();
        this.mPostionHolders = new HashMap();
        this.scrollSpeedPerPixelTime = 0.3f;
        this.isFlinging = false;
        this.isDragingAfterFling = false;
        init(context);
    }

    public MainPicHorizontalRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOnScrollStatusListeners = new ArrayList();
        this.mSmoothScrollTargetPosition = 0;
        this.mBeforeScrollPosition = -1;
        this.mOnPageChangedListeners = new ArrayList();
        this.mPostionHolders = new HashMap();
        this.scrollSpeedPerPixelTime = 0.3f;
        this.isFlinging = false;
        this.isDragingAfterFling = false;
        init(context);
    }

    public MainPicHorizontalRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mOnScrollStatusListeners = new ArrayList();
        this.mSmoothScrollTargetPosition = 0;
        this.mBeforeScrollPosition = -1;
        this.mOnPageChangedListeners = new ArrayList();
        this.mPostionHolders = new HashMap();
        this.scrollSpeedPerPixelTime = 0.3f;
        this.isFlinging = false;
        this.isDragingAfterFling = false;
        init(context);
    }

    public void setMainPicScrollDeviceHelper(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f744383", new Object[]{this, dVar});
        } else {
            this.mMainPicScrollDeviceHelper = dVar;
        }
    }

    public void setScrollSpeedPerPixel(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a44db178", new Object[]{this, new Float(f)});
        } else {
            this.scrollSpeedPerPixelTime = f;
        }
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mLinearLayoutManager = new LinearLayoutManager(context, 0, false) { // from class: com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77e7cc6e", new Object[]{this, recyclerView, state, new Integer(i)});
                    return;
                }
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.support.v7.widget.LinearSmoothScroller
                    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            return ((Number) ipChange3.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
                        }
                        return (MainPicHorizontalRecyclerView.access$000(MainPicHorizontalRecyclerView.this) == null ? 120.0f : MainPicHorizontalRecyclerView.access$000(MainPicHorizontalRecyclerView.this).a()) / displayMetrics.densityDpi;
                    }
                };
                linearSmoothScroller.setTargetPosition(i);
                startSmoothScroll(linearSmoothScroller);
            }
        };
        setLayoutManager(this.mLinearLayoutManager);
        this.mPageSnapHelper = new PagerSnapHelper() { // from class: com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == -1700525134) {
                    return super.calculateDistanceToFinalSnap((RecyclerView.LayoutManager) objArr[0], (View) objArr[1]);
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.PagerSnapHelper, android.support.v7.widget.SnapHelper
            public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (int[]) ipChange2.ipc$dispatch("9aa40bb2", new Object[]{this, layoutManager, view});
                }
                MainPicHorizontalRecyclerView.access$100(MainPicHorizontalRecyclerView.this);
                return super.calculateDistanceToFinalSnap(layoutManager, view);
            }
        };
        this.mPageSnapHelper.attachToRecyclerView(this);
        addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                if (str.hashCode() == 2142696127) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    if (MainPicHorizontalRecyclerView.access$200(MainPicHorizontalRecyclerView.this)) {
                        MainPicHorizontalRecyclerView.access$302(MainPicHorizontalRecyclerView.this, true);
                    } else {
                        MainPicHorizontalRecyclerView.access$302(MainPicHorizontalRecyclerView.this, false);
                    }
                }
                if (i == 2) {
                    MainPicHorizontalRecyclerView.access$202(MainPicHorizontalRecyclerView.this, true);
                } else {
                    MainPicHorizontalRecyclerView.access$202(MainPicHorizontalRecyclerView.this, false);
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView
    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
            return;
        }
        super.scrollToPosition(i);
        this.mSmoothScrollTargetPosition = i;
        this.mBeforeScrollPosition = -1;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (checkPinchConflictProcess(motionEvent)) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.interceptDownX = motionEvent.getX();
            this.interceptDownY = motionEvent.getY();
        } else if (actionMasked == 2) {
            float x = motionEvent.getX();
            if (Math.abs(Math.abs(x - this.interceptDownX) / Math.abs(motionEvent.getY() - this.interceptDownY)) >= 1.0f && this.interceptDownX - x >= 0.0f) {
                RecyclerView.Adapter adapter = getAdapter();
                if (adapter instanceof c) {
                    if (this.isDragingAfterFling) {
                        c cVar = (c) adapter;
                        if (cVar.a(this.mLinearLayoutManager.findLastVisibleItemPosition()) + 1 >= cVar.a()) {
                            return false;
                        }
                    }
                    c cVar2 = (c) adapter;
                    if (cVar2.a(this.mSmoothScrollTargetPosition) + 1 >= cVar2.a()) {
                        return false;
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private boolean checkPinchConflictProcess(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59183deb", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            int pointerCount = motionEvent.getPointerCount();
            fjt.a(fjt.TAG_GESTURE, "checkPinchConflictProcess: " + motionEvent.getActionMasked() + " pointCount = " + pointerCount);
            return pointerCount > 1;
        } catch (Throwable th) {
            fjt.a(fjt.TAG_GESTURE, "checkPinchConflictProcess error. 未知异常.", th);
            return false;
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.downX = motionEvent.getX();
            this.downY = motionEvent.getY();
        } else if (actionMasked == 2) {
            float x = motionEvent.getX();
            if (Math.abs(Math.abs(x - this.downX) / Math.abs(motionEvent.getY() - this.downY)) >= 1.0f && this.downX - x >= 0.0f) {
                RecyclerView.Adapter adapter = getAdapter();
                if (adapter instanceof c) {
                    if (this.isDragingAfterFling) {
                        c cVar = (c) adapter;
                        if (cVar.a(this.mLinearLayoutManager.findLastVisibleItemPosition()) + 1 >= cVar.a()) {
                            return false;
                        }
                    }
                    c cVar2 = (c) adapter;
                    if (cVar2.a(this.mSmoothScrollTargetPosition) + 1 >= cVar2.a()) {
                        return false;
                    }
                }
            }
        }
        for (b bVar : this.mOnScrollStatusListeners) {
            if (bVar != null) {
                bVar.a(motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void addOnScrollStatusListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1bc75d", new Object[]{this, bVar});
            return;
        }
        if (this.mOnScrollStatusListeners == null) {
            this.mOnScrollStatusListeners = new ArrayList();
        }
        this.mOnScrollStatusListeners.add(bVar);
    }

    private void notifyPageChange() {
        RecyclerView.LayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85a47cf", new Object[]{this});
            return;
        }
        View findSnapView = this.mPageSnapHelper.findSnapView(getLayoutManager());
        if (findSnapView == null || (layoutManager = getLayoutManager()) == null) {
            return;
        }
        int position = layoutManager.getPosition(findSnapView);
        this.mBeforeScrollPosition = this.mSmoothScrollTargetPosition;
        this.mSmoothScrollTargetPosition = position;
        if (this.mSmoothScrollTargetPosition == this.mBeforeScrollPosition) {
            for (a aVar : this.mOnPageChangedListeners) {
                if (aVar != null) {
                    aVar.b(this.mBeforeScrollPosition, this.mSmoothScrollTargetPosition);
                }
            }
            return;
        }
        List<a> list = this.mOnPageChangedListeners;
        if (list == null) {
            return;
        }
        for (a aVar2 : list) {
            if (aVar2 != null) {
                aVar2.a(this.mBeforeScrollPosition, this.mSmoothScrollTargetPosition);
            }
        }
    }

    public void addOnPageChangedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f8003b8", new Object[]{this, aVar});
            return;
        }
        if (this.mOnPageChangedListeners == null) {
            this.mOnPageChangedListeners = new ArrayList();
        }
        this.mOnPageChangedListeners.add(aVar);
    }

    public int getCurrentDisplayPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a76604c2", new Object[]{this})).intValue() : this.mSmoothScrollTargetPosition;
    }

    public void clearHolders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a201e0c1", new Object[]{this});
        } else {
            this.mPostionHolders.clear();
        }
    }

    public Map<Integer, RecyclerView.ViewHolder> getAllHolders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6d6d8", new Object[]{this}) : this.mPostionHolders;
    }

    public RecyclerView.ViewHolder getHolder(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("5c979437", new Object[]{this, new Integer(i)});
        }
        if (i < 0) {
            return null;
        }
        try {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition == null) {
                return this.mPostionHolders.get(Integer.valueOf(i));
            }
            this.mPostionHolders.put(Integer.valueOf(i), findViewHolderForAdapterPosition);
            return findViewHolderForAdapterPosition;
        } catch (Exception e) {
            fjp.a("main", fjp.ERROR_CODE_COMMON_GET_HOLDER_ERROR, "getHolder调用异常", (Map<String, String>) null, e);
            return null;
        }
    }

    @Override // com.taobao.ptr.h
    public boolean isReadyForPullEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f76f3051", new Object[]{this})).booleanValue();
        }
        RecyclerView.Adapter adapter = getAdapter();
        if (!(adapter instanceof c)) {
            return false;
        }
        if (adapter.getItemCount() == 0) {
            return true;
        }
        c cVar = (c) adapter;
        return cVar.a(this.mSmoothScrollTargetPosition) == cVar.a() - 1;
    }
}
