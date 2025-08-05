package tb;

import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewParent;
import android.widget.ScrollView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.home.component.utils.e;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.d;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;

/* loaded from: classes8.dex */
public abstract class ott {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public otw f32418a;
    public String b;
    public String c;

    static {
        kge.a(-1268922085);
    }

    public abstract String a();

    public abstract boolean a(ChildRecyclerView childRecyclerView, int i);

    public ott(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final void b(ChildRecyclerView childRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f55678", new Object[]{this, childRecyclerView, new Integer(i)});
        } else if (a(childRecyclerView, i)) {
            b();
        } else {
            c();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f32418a != null) {
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "AbsStayTimeCalculator", "dismiss enter, already has stayModel");
        } else {
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "AbsStayTimeCalculator", "start enter, new stayModel");
            this.f32418a = new otw(a());
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f32418a == null) {
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "AbsStayTimeCalculator", "dismiss leave, stayModel is null");
        } else {
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "AbsStayTimeCalculator", "start leave, commit ut");
            this.f32418a.a();
            d();
            this.f32418a = null;
        }
    }

    public int a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46606589", new Object[]{this, recyclerView})).intValue();
        }
        int height = recyclerView.getHeight();
        RecyclerView e = e(recyclerView);
        if (e != null && !d(e)) {
            int c = c(e);
            if (c != e.getAdapter().getItemCount() - 1) {
                return 0;
            }
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = e.findViewHolderForAdapterPosition(c);
            if (findViewHolderForAdapterPosition != null && findViewHolderForAdapterPosition.itemView != null) {
                height = e.getHeight() - findViewHolderForAdapterPosition.itemView.getTop();
            }
        } else if (e == null && (recyclerView instanceof HomeChildRecyclerView)) {
            return c((HomeChildRecyclerView) recyclerView, height);
        }
        return height;
    }

    public int b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e101280a", new Object[]{this, recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] findFirstVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findFirstVisibleItemPositions(null);
            int i = -1;
            for (int i2 = 0; i2 < findFirstVisibleItemPositions.length; i2++) {
                if (findFirstVisibleItemPositions[i2] >= 0 && (i == -1 || i > findFirstVisibleItemPositions[i2])) {
                    i = findFirstVisibleItemPositions[i2];
                }
            }
            return i;
        } else if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        } else {
            return -1;
        }
    }

    public int c(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ba1ea8b", new Object[]{this, recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] findLastVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findLastVisibleItemPositions(null);
            int i = -1;
            for (int i2 = 0; i2 < findLastVisibleItemPositions.length; i2++) {
                if (findLastVisibleItemPositions[i2] >= 0 && (i == -1 || i < findLastVisibleItemPositions[i2])) {
                    i = findLastVisibleItemPositions[i2];
                }
            }
            return i;
        } else if (!(layoutManager instanceof LinearLayoutManager)) {
            return -1;
        } else {
            try {
                return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
            } catch (Exception e) {
                e.e(TLogTracker.SCENE_EXCEPTION, "RecommendViewExposureListener getLastVisiblePos exception:" + e.getMessage());
                return -1;
            }
        }
    }

    public boolean d(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1642ad1d", new Object[]{this, recyclerView})).booleanValue();
        }
        try {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter.getItemCount() == 0) {
                return true;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            int itemCount = adapter.getItemCount() - 1;
            if (itemCount <= 0) {
                return true;
            }
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                return (layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() == itemCount;
            }
            int[] findLastCompletelyVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findLastCompletelyVisibleItemPositions(null);
            int i = -1;
            for (int i2 = 0; i2 < findLastCompletelyVisibleItemPositions.length; i2++) {
                if (findLastCompletelyVisibleItemPositions[i2] >= 0 && (i == -1 || i < findLastCompletelyVisibleItemPositions[i2])) {
                    i = findLastCompletelyVisibleItemPositions[i2];
                }
            }
            if (i < 0) {
                int[] findLastVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findLastVisibleItemPositions(null);
                for (int i3 = 0; i3 < findLastVisibleItemPositions.length; i3++) {
                    if (findLastVisibleItemPositions[i3] >= 0 && (i == -1 || i < findLastVisibleItemPositions[i3])) {
                        i = findLastVisibleItemPositions[i3];
                    }
                }
                if (layoutManager.findViewByPosition(i) == null || layoutManager.findViewByPosition(i).getBottom() != recyclerView.getResources().getDisplayMetrics().heightPixels) {
                    i = -1;
                }
            }
            return i == itemCount;
        } catch (Throwable th) {
            e.a("AbsStayTimeCalculator", "check reach bottom error", th);
        }
        return false;
    }

    public RecyclerView e(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("407e4fea", new Object[]{this, recyclerView});
        }
        ViewParent parent = recyclerView.getParent();
        while (true) {
            if (parent == null || (parent instanceof RecyclerView)) {
                break;
            } else if (i == 10) {
                parent = null;
                break;
            } else {
                i++;
                parent = parent.getParent();
            }
        }
        if (parent != null) {
            return (RecyclerView) parent;
        }
        return null;
    }

    public int c(ChildRecyclerView childRecyclerView, int i) {
        int c;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("733c60a", new Object[]{this, childRecyclerView, new Integer(i)})).intValue();
        }
        if (childRecyclerView == null) {
            return i;
        }
        ViewParent f = f(childRecyclerView);
        if (f != null) {
            if (f instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) f;
                if (coordinatorLayout.getChildCount() == 2) {
                    c = coordinatorLayout.getHeight() - coordinatorLayout.getChildAt(0).getTop();
                    i2 = coordinatorLayout.getChildAt(1).getTop();
                } else {
                    e.e("AbsStayTimeCalculator", "CoordinatorLayout ChildCount != 2");
                    return i;
                }
            } else if (!(f instanceof ScrollView)) {
                return i;
            } else {
                View view = (View) f;
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                childRecyclerView.getLocationInWindow(iArr2);
                c = view.getHeight() + iArr[1];
                i2 = iArr2[1];
            }
        } else {
            int[] iArr3 = new int[2];
            childRecyclerView.getLocationInWindow(iArr3);
            c = gbg.c(Globals.getApplication());
            i2 = iArr3[1];
        }
        return c - i2;
    }

    public ViewParent f(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("8b0d2c93", new Object[]{this, recyclerView});
        }
        if (recyclerView == null) {
            return null;
        }
        for (ViewParent parent = recyclerView.getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof CoordinatorLayout) || (parent instanceof ScrollView)) {
                return parent;
            }
        }
        return null;
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        kss.a(this.b, 2002, this.c, a(), String.valueOf(this.f32418a.b()), e());
        String a2 = a();
        lap.a("Performance", a2, "commit stay time:" + this.f32418a.b());
    }

    private JSONObject e() {
        AwesomeGetContainerInnerData c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        ope f = d.f(this.c);
        if (f != null && (c = f.c(this.c)) != null) {
            return c.stayTimeParams;
        }
        return null;
    }
}
