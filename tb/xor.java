package tb;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0004J\u0010\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/taobao/mytaobao/pagev2/presenter/MtbPageExposureProcessor;", "", "()V", "adapter", "Lcom/taobao/mytaobao/pagev2/architecture/MtbAdapter;", "rv", "Landroid/support/v7/widget/RecyclerView;", "scrollChangeListener", "com/taobao/mytaobao/pagev2/presenter/MtbPageExposureProcessor$scrollChangeListener$1", "Lcom/taobao/mytaobao/pagev2/presenter/MtbPageExposureProcessor$scrollChangeListener$1;", "visibleHead", "", "visibleTail", "asyncPerformUT", "", "targetExposeList", "", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", "bindRv", "mAdapter", "considerTraceExposeUT", "skipSearch", "", "isVisible", "position", "layoutManager", "Landroid/support/v7/widget/RecyclerView$LayoutManager;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView f34437a;
    private xnx b;
    private int c;
    private int d;
    private final b e = new b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f34438a;

        public a(List list) {
            this.f34438a = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONObject jSONObject;
            JSONArray jSONArray;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (xol xolVar : this.f34438a) {
                JSONObject a2 = xolVar.a();
                if (a2 != null && (jSONObject = a2.getJSONObject("events")) != null && (jSONArray = jSONObject.getJSONArray("exposeUt")) != null) {
                    int size = jSONArray.size();
                    for (int i = 0; i < size; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
                        String string = jSONObject2.getString("arg1");
                        String string2 = jSONObject2.getString("page");
                        if (string2 == null) {
                            string2 = "Page_MyTaobao";
                        }
                        mua.a(string2, 2201, string, null, null, jSONObject3);
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/taobao/mytaobao/pagev2/presenter/MtbPageExposureProcessor$scrollChangeListener$1", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", OrderConfigs.RECYCLERVIEW, "Landroid/support/v7/widget/RecyclerView;", "newState", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 2142696127) {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            q.c(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                return;
            }
            xor.this.a(true);
        }
    }

    static {
        kge.a(-439342582);
    }

    public final void a(RecyclerView rv, xnx mAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d70a84", new Object[]{this, rv, mAdapter});
            return;
        }
        q.c(rv, "rv");
        q.c(mAdapter, "mAdapter");
        this.f34437a = rv;
        this.b = mAdapter;
        rv.removeOnScrollListener(this.e);
        rv.addOnScrollListener(this.e);
    }

    public static /* synthetic */ void a(xor xorVar, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62468e8", new Object[]{xorVar, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        xorVar.a(z);
    }

    public final void a(boolean z) {
        xnx xnxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            this.c = 0;
            this.d = 0;
        }
        RecyclerView recyclerView = this.f34437a;
        if (recyclerView == null || (xnxVar = this.b) == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager == null) {
            return;
        }
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        int i = findLastVisibleItemPosition;
        while (true) {
            if (i < 0) {
                break;
            } else if (a(i, linearLayoutManager)) {
                this.d = i;
                break;
            } else {
                i--;
            }
        }
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
            while (true) {
                if (!a(findFirstVisibleItemPosition, linearLayoutManager)) {
                    if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                        break;
                    }
                    findFirstVisibleItemPosition++;
                } else {
                    this.c = findFirstVisibleItemPosition;
                    break;
                }
            }
        }
        List<xol> a2 = xnxVar.a();
        int i2 = this.c;
        int min = Math.min(this.d, a2.size() - 1);
        if (i2 >= min) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (i2 <= min) {
            while (true) {
                xol xolVar = a2.get(i2);
                if (!xolVar.f()) {
                    xolVar.a(true);
                    arrayList.add(xolVar);
                }
                if (i2 == min) {
                    break;
                }
                i2++;
            }
        }
        a(arrayList);
    }

    private final void a(List<xol> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list.isEmpty()) {
        } else {
            com.taobao.mytaobao.base.b.c(new a(list));
        }
    }

    private final boolean a(int i, RecyclerView.LayoutManager layoutManager) {
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbb6644e", new Object[]{this, new Integer(i), layoutManager})).booleanValue();
        }
        RecyclerView recyclerView = this.f34437a;
        if (recyclerView == null || i < 0 || (findViewByPosition = layoutManager.findViewByPosition(i)) == null) {
            return false;
        }
        int height = findViewByPosition.getHeight();
        int top = findViewByPosition.getTop();
        if (top >= 0) {
            int height2 = recyclerView.getHeight() - top;
            if (height2 > 0 && height2 + height2 > height) {
                return true;
            }
        } else if (top + top + height > 0) {
            return true;
        }
        return false;
    }
}
