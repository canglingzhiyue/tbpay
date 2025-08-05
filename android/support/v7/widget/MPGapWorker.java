package android.support.v7.widget;

import android.os.Build;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.util.LruCache;
import android.view.View;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class MPGapWorker implements Runnable {
    private static boolean ALLOW_THREAD_GAP_WORK = false;
    private static final int DELAY = 24;
    private static final int FROM_DATA_CHANGE = 0;
    private static final int FROM_PREFETCH = 2;
    private static final int FROM_RESUME = 1;
    private static final int FROM_SCROLL_IDLE = 3;
    private static final String TAG = "MPGapWorker";
    private RecyclerView mAttachRecyclerView;
    private int mFrom;
    private ResetRangePrefetchListener mResetRangePrefetchListener;
    private long mScrollVersion;
    private LruCache<Integer, View> mViewCache;
    private boolean mInScrollGap = true;
    private boolean mPrefetch = false;
    private boolean mPause = false;
    private int mSingleBatchMaxSize = 0;
    private int mScrollGapDelayTime = 0;
    private int mNextPrefetchPos = -1;
    private int mDistPrefetchPost = -1;
    private List<Runnable> mNextScrollGapRunnableList = new ArrayList();

    /* loaded from: classes2.dex */
    public interface ResetRangePrefetchListener {
        void resetRangePrefetch(int i, int i2, int i3);
    }

    static {
        kge.a(-545380172);
        kge.a(-1390502639);
        ALLOW_THREAD_GAP_WORK = Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCache() {
        this.mViewCache.evictAll();
    }

    public static boolean isAllowThreadGapWork() {
        return com.taobao.application.common.c.a().a("deviceLevel", -1) == 2 ? ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "openMPGapWorkerLevel2") : !ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "closeMPGapWorker") && ALLOW_THREAD_GAP_WORK;
    }

    private void prefetchPositionFromDataChange() {
        prefetchPositionWithDeadline(this.mNextPrefetchPos, Long.MAX_VALUE);
    }

    private void prefetchPositionFromPrefetch() {
        prefetchPositionWithDeadline(this.mNextPrefetchPos, Long.MAX_VALUE);
    }

    private void prefetchPositionFromResume() {
        prefetchPositionWithDeadline(this.mNextPrefetchPos, Long.MAX_VALUE);
    }

    private void prefetchPositionFromScrollIdle() {
        prefetchPositionWithDeadline(this.mNextPrefetchPos, Long.MAX_VALUE);
    }

    private RecyclerView.ViewHolder prefetchPositionWithDeadline(int i, long j) {
        RecyclerView recyclerView = this.mAttachRecyclerView;
        if (r.a(recyclerView, i)) {
            return null;
        }
        RecyclerView.Recycler recycler = recyclerView.mRecycler;
        try {
            TraceUtil.beginSection("MPGapWorkerPreload");
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.ViewHolder tryGetViewHolderForPositionByDeadline = recycler.tryGetViewHolderForPositionByDeadline(i, false, j);
            if (tryGetViewHolderForPositionByDeadline != null) {
                if (!tryGetViewHolderForPositionByDeadline.isBound() || tryGetViewHolderForPositionByDeadline.isInvalid()) {
                    recycler.addViewHolderToRecycledViewPool(tryGetViewHolderForPositionByDeadline, false);
                } else {
                    recycleView(tryGetViewHolderForPositionByDeadline.itemView);
                }
            }
            return tryGetViewHolderForPositionByDeadline;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
            TraceUtil.endTrace();
        }
    }

    private void recycleView(View view) {
        RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.isScrap()) {
            childViewHolderInt.unScrap();
        } else if (childViewHolderInt.wasReturnedFromScrap()) {
            childViewHolderInt.clearReturnedFromScrapFlag();
        }
        this.mViewCache.put(Integer.valueOf(childViewHolderInt.getAdapterPosition()), view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetRangePrefetchInner(int i) {
        if (this.mInScrollGap && this.mAttachRecyclerView.getChildCount() > 0 && this.mSingleBatchMaxSize > 0) {
            RecyclerView recyclerView = this.mAttachRecyclerView;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(recyclerView.getChildCount() - 1));
            if (childAdapterPosition == -1) {
                return;
            }
            this.mFrom = i;
            int i2 = childAdapterPosition + 1;
            this.mNextPrefetchPos = i2;
            this.mDistPrefetchPost = this.mSingleBatchMaxSize + childAdapterPosition;
            this.mAttachRecyclerView.postDelayed(this, 24L);
            ResetRangePrefetchListener resetRangePrefetchListener = this.mResetRangePrefetchListener;
            if (resetRangePrefetchListener == null) {
                return;
            }
            resetRangePrefetchListener.resetRangePrefetch(i2, childAdapterPosition + this.mSingleBatchMaxSize, i);
        }
    }

    public void attach(RecyclerView recyclerView, int i) {
        if (ALLOW_THREAD_GAP_WORK) {
            this.mScrollGapDelayTime = ValueUtil.getInteger(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "scrollGapDelayTime", "1000"), 0);
            this.mAttachRecyclerView = recyclerView;
            this.mSingleBatchMaxSize = i;
            this.mViewCache = new LruCache<Integer, View>(i) { // from class: android.support.v7.widget.MPGapWorker.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.util.LruCache
                /* renamed from: a */
                public void entryRemoved(boolean z, Integer num, View view, View view2) {
                    RecyclerView.ViewHolder childViewHolderInt;
                    if (!z || (childViewHolderInt = RecyclerView.getChildViewHolderInt(view)) == null) {
                        return;
                    }
                    MPGapWorker.this.mAttachRecyclerView.getRecycledViewPool().putRecycledView(childViewHolderInt);
                }
            };
            this.mAttachRecyclerView.setViewCacheExtension(new RecyclerView.ViewCacheExtension() { // from class: android.support.v7.widget.MPGapWorker.2
                @Override // android.support.v7.widget.RecyclerView.ViewCacheExtension
                public View getViewForPositionAndType(RecyclerView.Recycler recycler, int i2, int i3) {
                    View view = (View) MPGapWorker.this.mViewCache.get(Integer.valueOf(i2));
                    MPGapWorker.this.mViewCache.remove(Integer.valueOf(i2));
                    if (view != null && ApplicationUtil.isDebug()) {
                        Logger.e(MPGapWorker.TAG, "hitPos|" + i2 + "|viewCache|" + MPGapWorker.this.mViewCache.toString());
                    }
                    return view;
                }
            });
            this.mAttachRecyclerView.getAdapter().registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: android.support.v7.widget.MPGapWorker.3
                @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    MPGapWorker.this.clearCache();
                    MPGapWorker.this.mAttachRecyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: android.support.v7.widget.MPGapWorker.3.1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                            MPGapWorker.this.mAttachRecyclerView.removeOnLayoutChangeListener(this);
                            MPGapWorker.this.resetRangePrefetchInner(0);
                        }
                    });
                }

                @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeChanged(int i2, int i3) {
                    MPGapWorker.this.clearCache();
                }

                @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeChanged(int i2, int i3, Object obj) {
                    MPGapWorker.this.clearCache();
                }

                @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeInserted(int i2, int i3) {
                    MPGapWorker.this.clearCache();
                }

                @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeMoved(int i2, int i3, int i4) {
                    MPGapWorker.this.clearCache();
                }

                @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeRemoved(int i2, int i3) {
                    MPGapWorker.this.clearCache();
                }
            });
            this.mAttachRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: android.support.v7.widget.MPGapWorker.4
                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView2, int i2) {
                    if (i2 == 1) {
                        MPGapWorker.this.mInScrollGap = false;
                    } else if (i2 != 0) {
                    } else {
                        if (MPGapWorker.this.mScrollGapDelayTime <= 0) {
                            MPGapWorker.this.mInScrollGap = true;
                            MPGapWorker.this.resetRangePrefetchInner(3);
                            return;
                        }
                        final long uptimeMillis = SystemClock.uptimeMillis();
                        MPGapWorker.this.mScrollVersion = uptimeMillis;
                        MPGapWorker.this.mAttachRecyclerView.postDelayed(new Runnable() { // from class: android.support.v7.widget.MPGapWorker.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (uptimeMillis == MPGapWorker.this.mScrollVersion) {
                                    MPGapWorker.this.mInScrollGap = true;
                                    MPGapWorker.this.runNextScrollGap();
                                    MPGapWorker.this.resetRangePrefetchInner(3);
                                }
                            }
                        }, 1000L);
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView2, int i2, int i3) {
                }
            });
        }
    }

    public boolean isInScrollGap() {
        return this.mInScrollGap;
    }

    public void pause() {
        if (ALLOW_THREAD_GAP_WORK) {
            this.mPause = true;
        }
    }

    public void postNextScrollGap(Runnable runnable) {
        this.mNextScrollGapRunnableList.add(runnable);
    }

    public void prefetch() {
        if (ALLOW_THREAD_GAP_WORK) {
            this.mPrefetch = true;
            resetRangePrefetchInner(2);
        }
    }

    public void resume() {
        if (ALLOW_THREAD_GAP_WORK) {
            this.mPause = false;
            if (!this.mPrefetch) {
                return;
            }
            resetRangePrefetchInner(1);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (ALLOW_THREAD_GAP_WORK && this.mInScrollGap && !this.mPause) {
            RecyclerView recyclerView = this.mAttachRecyclerView;
            if (!recyclerView.isAttachedToWindow()) {
                return;
            }
            if (this.mNextPrefetchPos < recyclerView.getAdapter().getItemCount() && this.mViewCache.get(Integer.valueOf(this.mNextPrefetchPos)) == null) {
                try {
                    if (this.mFrom == 0) {
                        prefetchPositionFromDataChange();
                    } else if (this.mFrom == 1) {
                        prefetchPositionFromResume();
                    } else if (this.mFrom == 2) {
                        prefetchPositionFromPrefetch();
                    } else if (this.mFrom == 3) {
                        prefetchPositionFromScrollIdle();
                    } else {
                        prefetchPositionWithDeadline(this.mNextPrefetchPos, Long.MAX_VALUE);
                    }
                } catch (Throwable unused) {
                }
            }
            int i = this.mNextPrefetchPos;
            if (i + 1 > this.mDistPrefetchPost) {
                return;
            }
            this.mNextPrefetchPos = i + 1;
            if (this.mNextPrefetchPos >= recyclerView.getAdapter().getItemCount() || !this.mInScrollGap) {
                return;
            }
            this.mAttachRecyclerView.postDelayed(this, 24L);
        }
    }

    public void runNextScrollGap() {
        for (Runnable runnable : this.mNextScrollGapRunnableList) {
            runnable.run();
        }
        this.mNextScrollGapRunnableList.clear();
    }

    public void setResetRangePrefetchListener(ResetRangePrefetchListener resetRangePrefetchListener) {
        this.mResetRangePrefetchListener = resetRangePrefetchListener;
    }
}
