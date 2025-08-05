package com.taobao.taolive.sdk.controller;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.sdk.utils.i;
import com.taobao.taolive.sdk.utils.m;
import tb.kge;

/* loaded from: classes8.dex */
public class b implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a mAdapter;
    public Context mContext;
    public int mItemHeight;
    public o mLayoutManager;
    public boolean mReachBottom;
    public TaoLiveRecyclerView mRecyclerView;
    public int totalDy;
    public int curStart = 0;
    public int lastStart = 0;
    public int lastEnd = 0;
    public boolean mScrollEnabled = true;
    public int mScrollState = 0;
    public boolean mFirstCell = true;

    static {
        kge.a(416313173);
        kge.a(-1235057062);
    }

    public void afterUpDownSwitchEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeda1fb5", new Object[]{this});
        }
    }

    public void beforeUpDownSwitchEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794dc532", new Object[]{this});
        }
    }

    public void handlePreload(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb1ec26c", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
        }
    }

    public void handleUpDownSwitch(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7fea474", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        }
    }

    public void onReachBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3d42326", new Object[]{this});
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        }
    }

    public b(Context context) {
        this.mContext = context;
    }

    public void initRecyclerView(TaoLiveRecyclerView taoLiveRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2a901e", new Object[]{this, taoLiveRecyclerView});
            return;
        }
        this.mRecyclerView = taoLiveRecyclerView;
        this.mRecyclerView.setHasFixedSize(true);
        this.mLayoutManager = new o(this.mContext, 1, false, this.mRecyclerView);
        this.mRecyclerView.setLayoutManager(this.mLayoutManager);
        this.mLayoutManager.setItemPrefetchEnabled(false);
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper() { // from class: com.taobao.taolive.sdk.controller.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -1700525134) {
                    return super.calculateDistanceToFinalSnap((RecyclerView.LayoutManager) objArr[0], (View) objArr[1]);
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.PagerSnapHelper, android.support.v7.widget.SnapHelper
            public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
                int i3;
                PointF computeScrollVectorForPosition;
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("b7ee3266", new Object[]{this, layoutManager, new Integer(i), new Integer(i2)})).intValue();
                }
                int itemCount = layoutManager.getItemCount();
                if (itemCount == 0 || (i3 = b.this.curStart) == -1) {
                    return -1;
                }
                boolean z2 = !layoutManager.canScrollHorizontally() ? i2 > 0 : i > 0;
                if ((layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) && (computeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) != null && (computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f)) {
                    z = true;
                }
                return z ? z2 ? i3 - 1 : i3 : z2 ? i3 + 1 : i3;
            }

            @Override // android.support.v7.widget.PagerSnapHelper, android.support.v7.widget.SnapHelper
            public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
                RecyclerView.ViewHolder viewHolder;
                RecyclerView.ViewHolder viewHolder2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (int[]) ipChange2.ipc$dispatch("9aa40bb2", new Object[]{this, layoutManager, view});
                }
                int[] calculateDistanceToFinalSnap = super.calculateDistanceToFinalSnap(layoutManager, view);
                if (calculateDistanceToFinalSnap != null) {
                    if (calculateDistanceToFinalSnap[1] != 0 && b.this.mAdapter != null) {
                        if (aa.dk() && (viewHolder2 = (RecyclerView.ViewHolder) view.getTag(R.id.tblive_tag_key_holder)) != null) {
                            b.this.mAdapter.b(viewHolder2);
                        }
                    } else if (calculateDistanceToFinalSnap[1] == 0 && b.this.mAdapter != null && (viewHolder = (RecyclerView.ViewHolder) view.getTag(R.id.tblive_tag_key_holder)) != null) {
                        b.this.beforeUpDownSwitchEnd();
                        b.this.lastStart = viewHolder.getAdapterPosition();
                        b bVar = b.this;
                        bVar.lastEnd = bVar.lastStart;
                        b bVar2 = b.this;
                        bVar2.curStart = bVar2.lastStart;
                        b.this.mAdapter.a(viewHolder);
                        if (b.this.mLayoutManager != null) {
                            b.this.mLayoutManager.a(b.this.mScrollEnabled);
                        }
                        b.this.afterUpDownSwitchEnd();
                    }
                }
                return calculateDistanceToFinalSnap;
            }
        };
        pagerSnapHelper.attachToRecyclerView(this.mRecyclerView);
        this.mRecyclerView.setItemAnimator(null);
        this.mRecyclerView.setSnapHelper(pagerSnapHelper);
        this.mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.taolive.sdk.controller.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
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

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (i2 > aa.de() || i2 < (-aa.df())) {
                    b.this.u();
                }
                b.this.totalDy += i2;
                if (b.this.mAdapter == null) {
                    return;
                }
                if (b.this.mFirstCell) {
                    b bVar = b.this;
                    bVar.mFirstCell = false;
                    b.this.mAdapter.a(bVar.mRecyclerView.findViewHolderForAdapterPosition(0));
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (linearLayoutManager == null) {
                    return;
                }
                b.this.curStart = linearLayoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (b.this.curStart > b.this.lastStart) {
                    b bVar2 = b.this;
                    bVar2.handleUpDownSwitch(false, bVar2.curStart, findLastVisibleItemPosition);
                    b bVar3 = b.this;
                    bVar3.lastStart = bVar3.curStart;
                    b.this.lastEnd = findLastVisibleItemPosition;
                } else if (b.this.curStart < b.this.lastStart) {
                    b bVar4 = b.this;
                    bVar4.handlePreload(true, bVar4.curStart, findLastVisibleItemPosition);
                }
                if (findLastVisibleItemPosition < b.this.lastEnd) {
                    b bVar5 = b.this;
                    bVar5.handleUpDownSwitch(true, bVar5.curStart, findLastVisibleItemPosition);
                    b bVar6 = b.this;
                    bVar6.lastStart = bVar6.curStart;
                    b.this.lastEnd = findLastVisibleItemPosition;
                } else if (findLastVisibleItemPosition <= b.this.lastEnd) {
                } else {
                    b bVar7 = b.this;
                    bVar7.handlePreload(false, bVar7.curStart, findLastVisibleItemPosition);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (b.this.mAdapter != null) {
                    b.this.mAdapter.a(i);
                }
                b.this.mScrollState = i;
            }
        });
        this.mRecyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.taobao.taolive.sdk.controller.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                } else {
                    b.this.mItemHeight = i4 - i2;
                }
            }
        });
        this.mRecyclerView.setOnMoveListener(new i.a() { // from class: com.taobao.taolive.sdk.controller.b.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.utils.i.a
            public void a(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                } else if (b.this.mReachBottom || i2 >= -30 || b.this.mRecyclerView.canScrollVertically(1)) {
                } else {
                    b.this.onReachBottom();
                    b.this.mReachBottom = true;
                }
            }

            @Override // com.taobao.taolive.sdk.utils.i.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    b.this.mReachBottom = false;
                }
            }
        });
    }

    public void initAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bec36126", new Object[]{this});
            return;
        }
        this.mAdapter = new a(this.mContext, this);
        this.mRecyclerView.setAdapter(this.mAdapter);
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.totalDy = 0;
        this.curStart = 0;
        this.lastStart = 0;
        this.lastEnd = 0;
        this.mFirstCell = true;
        this.mReachBottom = false;
        this.mScrollEnabled = true;
        o oVar = this.mLayoutManager;
        if (oVar == null) {
            return;
        }
        oVar.a(true);
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        a aVar = this.mAdapter;
        if (aVar == null) {
            return;
        }
        aVar.h();
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        a aVar = this.mAdapter;
        if (aVar == null) {
            return;
        }
        aVar.i();
    }

    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        a aVar = this.mAdapter;
        if (aVar == null) {
            return;
        }
        aVar.j();
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TaoLiveRecyclerView taoLiveRecyclerView = this.mRecyclerView;
        if (taoLiveRecyclerView == null) {
            return;
        }
        taoLiveRecyclerView.setAdapter(null);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        a aVar = this.mAdapter;
        if (aVar == null) {
            return false;
        }
        return aVar.a(i, keyEvent);
    }

    public void updateScrollEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5738a2", new Object[]{this, new Boolean(z)});
            return;
        }
        m.a("BaseListController", "updateScrollEnabled " + z);
        this.mScrollEnabled = z;
        if (z) {
            this.mLayoutManager.a(z);
        } else if (this.mLayoutManager == null) {
        } else {
            int i = this.mItemHeight;
            if (i != 0 && this.totalDy % i != 0) {
                return;
            }
            this.mLayoutManager.a(z);
        }
    }
}
