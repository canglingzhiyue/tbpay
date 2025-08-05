package com.taobao.android.detail2.core.framework.view.feeds.visibility;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView;
import com.taobao.android.detail2.core.framework.view.feeds.d;
import tb.fjt;
import tb.fmd;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailVerticalRecyclerView.a f11595a;
    private fmd b;
    private b c;
    private VisibilityData d;

    static {
        kge.a(-244776769);
    }

    public static /* synthetic */ VisibilityData a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VisibilityData) ipChange.ipc$dispatch("d893bdff", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ void a(a aVar, RecyclerView.ViewHolder viewHolder, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988a9918", new Object[]{aVar, viewHolder, new Boolean(z)});
        } else {
            aVar.a(viewHolder, z);
        }
    }

    public static /* synthetic */ void a(a aVar, RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1e5304", new Object[]{aVar, recyclerView, new Integer(i)});
        } else {
            aVar.a(recyclerView, i);
        }
    }

    public a(fmd fmdVar, b bVar) {
        this.b = fmdVar;
        this.c = bVar;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        fjt.a("VisibilityHandler", "生命周期，processVisibility，cardType:" + str);
        this.d = new VisibilityData();
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f11595a != null) {
        } else {
            this.f11595a = new com.taobao.android.detail2.core.framework.view.feeds.b() { // from class: com.taobao.android.detail2.core.framework.view.feeds.visibility.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private int b;

                @Override // com.taobao.android.detail2.core.framework.view.feeds.b, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    }
                }

                @Override // com.taobao.android.detail2.core.framework.view.feeds.b, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a
                public void a(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
                    } else if (i != 2) {
                    } else {
                        fjt.a("VisibilityHandler", "生命周期，用户松手,recyclerViewDy:" + this.b);
                        if (a.a(a.this) != null) {
                            if (this.b < 0 && a.a(a.this).e() != null) {
                                a aVar = a.this;
                                a.a(aVar, (RecyclerView.ViewHolder) a.a(aVar).e(), false);
                            }
                            a.a(a.this).a();
                        }
                        this.b = 0;
                    }
                }

                @Override // com.taobao.android.detail2.core.framework.view.feeds.b, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a
                public void a(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                        return;
                    }
                    this.b = i2;
                    if (recyclerView.getScrollState() != 1 || i2 == 0) {
                        return;
                    }
                    a.a(a.this, recyclerView, i2);
                    a.a(a.this).a(true);
                }
            };
            this.b.a(this.f11595a);
        }
    }

    private void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        try {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager == null) {
                return;
            }
            if (TextUtils.equals(this.d.b(), "none")) {
                String str = i > 0 ? "up" : "down";
                this.d.a(str);
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                int i2 = TextUtils.equals(str, "up") ? findFirstVisibleItemPosition : findLastVisibleItemPosition;
                this.d.a(i2);
                fjt.a("VisibilityHandler", "生命周期，mCurrentPosition初始化:" + i2 + "，lastVisibleItemPosition：" + findLastVisibleItemPosition + "，firstVisibleItemPosition：" + findFirstVisibleItemPosition + ",mStartUp:" + str);
            }
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(this.d.c());
            if (findViewHolderForAdapterPosition == null) {
                fjt.a("VisibilityHandler", "生命周期，currentViewHolder为null，" + this.d.c());
                return;
            }
            View view = findViewHolderForAdapterPosition.itemView;
            boolean z = view.getBottom() > 1 && view.getBottom() < recyclerView.getHeight();
            boolean z2 = view.getTop() - 1 > 0 && view.getTop() < recyclerView.getHeight();
            fjt.a("VisibilityHandler", "生命周期，区域，top:" + view.getTop() + "，bottom:" + view.getBottom() + ",height:" + recyclerView.getHeight());
            if (z) {
                fjt.a("VisibilityHandler", "生命周期，上滑未离屏:");
                this.d.b(linearLayoutManager.findLastVisibleItemPosition());
            } else if (z2) {
                fjt.a("VisibilityHandler", "生命周期，下滑未离屏:");
                this.d.b(linearLayoutManager.findFirstVisibleItemPosition());
            } else {
                this.d.a("none");
                fjt.a("VisibilityHandler", "生命周期，离屏更换当前position:" + this.d.c());
                if (this.d.e() != null) {
                    a((RecyclerView.ViewHolder) this.d.e(), false);
                    return;
                }
            }
            if (this.d.d() >= 0 && this.d.d() < linearLayoutManager.getItemCount()) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(this.d.d());
                if (findViewHolderForAdapterPosition2 == null) {
                    fjt.a("VisibilityHandler", "生命周期，willDisplayViewHolder为null，" + this.d.d());
                    return;
                }
                fjt.a("VisibilityHandler", "生命周期，mVisibilityData:" + this.d.toString() + ",isNextItemPartiallyVisible:" + z + ",isPreItemPartiallyVisible:" + z2 + ",willDisplayViewHolder:" + findViewHolderForAdapterPosition2);
                a(findViewHolderForAdapterPosition2, true);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(RecyclerView.ViewHolder viewHolder, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb19884f", new Object[]{this, viewHolder, new Boolean(z)});
        } else if (!(viewHolder instanceof d)) {
        } else {
            d dVar = (d) viewHolder;
            if (this.d.e() != viewHolder) {
                this.d.a(dVar);
            }
            if (z) {
                dVar.V();
            } else {
                dVar.W();
            }
        }
    }
}
