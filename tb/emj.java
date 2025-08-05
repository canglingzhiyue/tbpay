package tb;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.android.aura.AURAGlobalData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.c;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class emj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1050521650);
        emu.a("com.taobao.android.detail.core.standard.utils.AliSDetailMainGalleryRecyclerViewUtil");
    }

    public static SparseIntArray a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseIntArray) ipChange.ipc$dispatch("94120a90", new Object[]{recyclerView});
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int itemCount = layoutManager.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            if (recyclerView.findViewHolderForAdapterPosition(i) != null) {
                sparseIntArray.put(i, i);
            }
        }
        return sparseIntArray;
    }

    public static int b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e101280a", new Object[]{recyclerView})).intValue();
        }
        SparseIntArray a2 = a(recyclerView);
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            int valueAt = a2.valueAt(i);
            if (a(recyclerView, valueAt)) {
                return valueAt;
            }
        }
        return a(recyclerView, false);
    }

    public static boolean a(RecyclerView recyclerView, int i) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85acc031", new Object[]{recyclerView, new Integer(i)})).booleanValue();
        }
        if (recyclerView == null || (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) == null || (view = findViewHolderForAdapterPosition.itemView) == null) {
            return false;
        }
        int width = recyclerView.getWidth() / 2;
        return view.getLeft() <= width && view.getRight() >= width;
    }

    public static int a(RecyclerView recyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85acfff1", new Object[]{recyclerView, new Boolean(z)})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return b((LinearLayoutManager) layoutManager, z);
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return -1;
        }
        return a((StaggeredGridLayoutManager) layoutManager, z);
    }

    public static int b(RecyclerView recyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f248d90", new Object[]{recyclerView, new Boolean(z)})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return a((LinearLayoutManager) layoutManager, z);
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return -1;
        }
        return b((StaggeredGridLayoutManager) layoutManager, z);
    }

    private static int a(StaggeredGridLayoutManager staggeredGridLayoutManager, boolean z) {
        int[] findFirstVisibleItemPositions;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d00853e", new Object[]{staggeredGridLayoutManager, new Boolean(z)})).intValue();
        }
        if (z) {
            findFirstVisibleItemPositions = staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(null);
        } else {
            findFirstVisibleItemPositions = staggeredGridLayoutManager.findFirstVisibleItemPositions(null);
        }
        if (findFirstVisibleItemPositions != null && findFirstVisibleItemPositions.length != 0) {
            return findFirstVisibleItemPositions[0];
        }
        return -1;
    }

    private static int a(LinearLayoutManager linearLayoutManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("457d0ecf", new Object[]{linearLayoutManager, new Boolean(z)})).intValue();
        }
        if (z) {
            return linearLayoutManager.findLastCompletelyVisibleItemPosition();
        }
        return linearLayoutManager.findLastVisibleItemPosition();
    }

    private static int b(StaggeredGridLayoutManager staggeredGridLayoutManager, boolean z) {
        int[] findLastVisibleItemPositions;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9304509d", new Object[]{staggeredGridLayoutManager, new Boolean(z)})).intValue();
        }
        if (z) {
            findLastVisibleItemPositions = staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(null);
        } else {
            findLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(null);
        }
        if (findLastVisibleItemPositions != null && findLastVisibleItemPositions.length != 0) {
            return findLastVisibleItemPositions[findLastVisibleItemPositions.length - 1];
        }
        return -1;
    }

    private static int b(LinearLayoutManager linearLayoutManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2b7c050", new Object[]{linearLayoutManager, new Boolean(z)})).intValue();
        }
        if (z) {
            return linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        }
        return linearLayoutManager.findFirstVisibleItemPosition();
    }

    public static void c(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba1ea98", new Object[]{recyclerView});
        } else {
            c(recyclerView, R.id.standard_detail_gallery_tag_is_progressbar);
        }
    }

    private static void c(final RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89bdb6b", new Object[]{recyclerView, new Integer(i)});
        } else if (recyclerView == null || recyclerView.isComputingLayout()) {
        } else {
            SparseIntArray a2 = a(recyclerView);
            final int i3 = -1;
            View view = null;
            while (true) {
                if (i2 >= a2.size()) {
                    break;
                }
                int valueAt = a2.valueAt(i2);
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(valueAt);
                if (findViewHolderForAdapterPosition != null && (view = findViewHolderForAdapterPosition.itemView) != null && "true".equalsIgnoreCase(String.valueOf(view.getTag(i)))) {
                    i3 = valueAt;
                    break;
                }
                i2++;
            }
            if (i3 < 0) {
                arc.a().c("AliSDetailRecyclerViewUtil", "notifyItemChangedByTag", "position of target view is null");
            } else if (view.getVisibility() != 0) {
            } else {
                recyclerView.post(new Runnable() { // from class: tb.emj.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            RecyclerView.this.getAdapter().notifyItemChanged(i3);
                        } catch (Exception e) {
                            baw.a(e);
                        }
                    }
                });
            }
        }
    }

    public static void b(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f244dcc", new Object[]{recyclerView, new Integer(i)});
        } else if (recyclerView == null) {
        } else {
            Context context = recyclerView.getContext();
            c cVar = eme.a(context) ? (c) context : null;
            if (cVar != null) {
                cVar.a(recyclerView, -2, i);
                return;
            }
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.height == i) {
                    return;
                }
                layoutParams.height = i;
                recyclerView.setLayoutParams(layoutParams);
                c(recyclerView);
            }
            ViewParent parent = recyclerView.getParent();
            if (parent == null) {
                arc.a().c("AliSDetailRecyclerViewUtil", "updateLayoutSize", "parent of recyclerView is null");
                return;
            }
            View view = (View) parent;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                arc.a().c("AliSDetailRecyclerViewUtil", "updateLayoutSize", "LayoutParams of recyclerView's parent is null");
            } else if (layoutParams2.height == i) {
            } else {
                layoutParams2.height = i;
                view.setLayoutParams(layoutParams2);
            }
        }
    }

    public static void a(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed894fe", new Object[]{aURAGlobalData});
        } else if (aURAGlobalData == null) {
        } else {
            c((RecyclerView) aURAGlobalData.get("render_view", RecyclerView.class));
        }
    }

    public static boolean d(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1642ad1d", new Object[]{recyclerView})).booleanValue() : a(recyclerView, false) <= 1;
    }
}
