package tb;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.view.InfoFlowRecyclerView;
import com.taobao.infoflow.protocol.model.datamodel.action.a;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.taobao.R;
import java.lang.reflect.Field;
import java.util.List;
import tb.lia;

/* loaded from: classes.dex */
public class lhx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f30637a;
    private RecyclerView b;
    private lkt<RecyclerView> c;
    private lij d;
    private lln e;
    private lio g;
    private Context h;
    private int i = 2;
    private final lin f = new lin();

    static {
        kge.a(272525069);
    }

    public static /* synthetic */ lij a(lhx lhxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lij) ipChange.ipc$dispatch("85b0eb3d", new Object[]{lhxVar}) : lhxVar.d;
    }

    public void a(ljs ljsVar, lkt<RecyclerView> lktVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810fc7e", new Object[]{this, ljsVar, lktVar});
            return;
        }
        this.f30637a = ljsVar;
        this.c = lktVar;
        this.g = new lio(lktVar);
    }

    public void a(lln llnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3053d2a", new Object[]{this, llnVar});
            return;
        }
        this.e = llnVar;
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return;
        }
        a(recyclerView, this.e);
    }

    public RecyclerView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("3fe22864", new Object[]{this, context});
        }
        this.h = context;
        RecyclerView b = b(context);
        a(b);
        this.b = b;
        return b;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        g(this.b);
        this.b = null;
    }

    public void a(List<BaseSectionModel> list, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4226b813", new Object[]{this, list, aVar});
            return;
        }
        lia m = m();
        if (m == null) {
            ldf.d("MainRecycleViewServiceImpl", "uiRefresh infoFlowAdapter is null");
            return;
        }
        m.a(list, aVar);
        o();
    }

    public void a(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc98adb0", new Object[]{this, baseSectionModel});
            return;
        }
        this.f.a(this.b, baseSectionModel);
        o();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.g.a();
    }

    public void c() {
        boolean b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!a(this.b, 0)) {
        } else {
            try {
                this.b.scrollToPosition(0);
            } finally {
                if (!b) {
                }
            }
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!a(this.b, i)) {
        } else {
            ((StaggeredGridLayoutManager) this.b.getLayoutManager()).scrollToPosition(i);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return;
        }
        recyclerView.stopScroll();
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.h == null || !a(this.b, i)) {
        } else {
            lhz lhzVar = new lhz(this.h);
            lhzVar.setTargetPosition(i);
            lhzVar.a(i2);
            ((StaggeredGridLayoutManager) this.b.getLayoutManager()).startSmoothScroll(lhzVar);
        }
    }

    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!a(this.b, i)) {
        } else {
            ((StaggeredGridLayoutManager) this.b.getLayoutManager()).scrollToPositionWithOffset(i, i2);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            if (this.b == null) {
                return;
            }
            this.b.invalidateItemDecorations();
        } catch (Exception e) {
            ldf.d("MainRecycleViewServiceImpl", "uiRefresh时 invalidateItemDecorations 出现异常: " + e);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        lia m = m();
        if (m == null) {
            ldf.d("MainRecycleViewServiceImpl", "resetErrorView adapter is null");
        } else {
            m.a();
        }
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        lia m = m();
        if (m == null) {
            ldf.d("MainRecycleViewServiceImpl", "getItemCount adapter is null");
            return -1;
        }
        return m.getItemCount();
    }

    public int[] h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("b4130dd5", new Object[]{this});
        }
        lij lijVar = this.d;
        if (lijVar == null) {
            return null;
        }
        return lijVar.a();
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return;
        }
        recyclerView.dispatchWindowVisibilityChanged(i);
    }

    public int[] i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("b5c7e674", new Object[]{this});
        }
        try {
            return this.f.a(this.b);
        } catch (Throwable th) {
            ldf.a("MainRecycleViewServiceImpl", "getVisiblePositionRange error.", th);
            return null;
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.ViewHolder childViewHolder = this.b.getChildViewHolder(this.b.getChildAt(i));
            if (childViewHolder instanceof lib) {
                ((lib) childViewHolder).a(null);
            }
        }
        this.b.getAdapter().notifyDataSetChanged();
    }

    public int a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c11928c", new Object[]{this, new Integer(i), new Boolean(z)})).intValue() : this.f.a(this.b, i, z);
    }

    public int c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue() : this.f.a(this.b, i);
    }

    public double d(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad401d66", new Object[]{this, new Integer(i)})).doubleValue() : this.f.b(this.b, i);
    }

    public View e(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("36b0d699", new Object[]{this, new Integer(i)}) : this.f.c(this.b, i);
    }

    public BaseSectionModel<?> f(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseSectionModel) ipChange.ipc$dispatch("f2c8c668", new Object[]{this, new Integer(i)}) : this.f.a(m(), i);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        RecyclerView recyclerView = this.b;
        if (!(recyclerView instanceof llo)) {
            return false;
        }
        return ((llo) recyclerView).isInterceptTouch();
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue();
        }
        RecyclerView recyclerView = this.b;
        if (!(recyclerView instanceof llo)) {
            return 0;
        }
        return ((llo) recyclerView).getVerticalScrollOffset();
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue() : this.f.a(m(), str);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            ldf.d("MainRecycleViewServiceImpl", "mRecyclerView == null");
        } else {
            ((lik) recyclerView.getLayoutManager()).a(z);
        }
    }

    public RecyclerView b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("3133b7e5", new Object[]{this, context}) : new lhy().a(context, this.c);
    }

    public void a(tbs tbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("215cf3", new Object[]{this, tbsVar});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (!(recyclerView instanceof InfoFlowRecyclerView)) {
            return;
        }
        ((InfoFlowRecyclerView) recyclerView).setGestureDetectorCallback(tbsVar);
    }

    private boolean a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("85acc031", new Object[]{this, recyclerView, new Integer(i)})).booleanValue() : recyclerView != null && recyclerView.getAdapter() != null && i >= 0 && i < recyclerView.getAdapter().getItemCount();
    }

    private void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        c(recyclerView);
        d(recyclerView);
        lik e = e(recyclerView);
        this.d = f(recyclerView);
        this.g.a(recyclerView, this.d, e);
        i(recyclerView);
        b(recyclerView);
        a(recyclerView, this.e);
    }

    private void b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1012817", new Object[]{this, recyclerView});
        } else if (!"l".equals(ldc.a())) {
        } else {
            b(recyclerView, TBPlayerConst.TBPlayerPropertyStringReadOnlyBorder);
        }
    }

    private void a(RecyclerView recyclerView, lln llnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c53c2858", new Object[]{this, recyclerView, llnVar});
        } else if (llnVar == null) {
        } else {
            Integer a2 = llnVar.a();
            if (a2 != null) {
                recyclerView.setBackgroundColor(a2.intValue());
            }
            Integer b = llnVar.b();
            if (b == null) {
                return;
            }
            b(recyclerView, b.intValue());
        }
    }

    private void b(RecyclerView recyclerView, int i) {
        try {
            Field declaredField = RecyclerView.class.getDeclaredField("mMaxFlingVelocity");
            declaredField.setAccessible(true);
            declaredField.set(recyclerView, Integer.valueOf(gbg.a(recyclerView.getContext(), i)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void c(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba1ea98", new Object[]{this, recyclerView});
        } else {
            recyclerView.setAdapter(new lia(this.f30637a, recyclerView, this.c, n()));
        }
    }

    private void d(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1642ad19", new Object[]{this, recyclerView});
            return;
        }
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        recyclerView.setOverScrollMode(2);
        recyclerView.setClipToPadding(false);
        recyclerView.setTag(R.id.tag_info_flow_data_delay_set, null);
    }

    private lik e(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lik) ipChange.ipc$dispatch("cd31b4de", new Object[]{this, recyclerView});
        }
        lik likVar = new lik(this.i, 1);
        likVar.a(recyclerView);
        recyclerView.setLayoutManager(likVar);
        return likVar;
    }

    private lij f(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lij) ipChange.ipc$dispatch("fb0a4f1e", new Object[]{this, recyclerView});
        }
        lij lijVar = new lij(this.f30637a, this.i);
        recyclerView.addItemDecoration(lijVar);
        return lijVar;
    }

    private void g(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e624f49c", new Object[]{this, recyclerView});
        } else if (recyclerView == null) {
        } else {
            this.g.b(recyclerView, this.d, (lik) recyclerView.getLayoutManager());
            h(recyclerView);
        }
    }

    private void h(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c5b71d", new Object[]{this, recyclerView});
        } else if (recyclerView.isComputingLayout()) {
        } else {
            recyclerView.removeItemDecoration(this.d);
        }
    }

    private void i(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b66799e", new Object[]{this, recyclerView});
            return;
        }
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (!(itemAnimator instanceof SimpleItemAnimator)) {
            return;
        }
        ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
    }

    private lia m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lia) ipChange.ipc$dispatch("6b5b138e", new Object[]{this});
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return (lia) recyclerView.getAdapter();
        }
        return null;
    }

    private lia.a n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lia.a) ipChange.ipc$dispatch("e2c1e750", new Object[]{this}) : new lia.a() { // from class: tb.lhx.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lia.a
            public void a(List<BaseSectionModel> list) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                } else if (lhx.a(lhx.this) == null) {
                } else {
                    lhx.a(lhx.this).a(list);
                }
            }
        };
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (q()) {
        } else {
            p();
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: tb.lhx.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    lhx.this.b(4);
                }
            }
        });
    }

    private boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        Rect rect = new Rect();
        this.b.getGlobalVisibleRect(rect);
        int b = gbg.b(this.b.getContext());
        if (rect.right >= 0 && rect.left <= b) {
            return true;
        }
        ldf.d("MainRecycleViewServiceImpl", "不在屏幕中");
        return false;
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
            return;
        }
        this.i = i;
        ldf.d("MainRecycleViewServiceImpl", "set info flow column: " + i);
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.getLayoutManager() == null) {
            return;
        }
        r();
        this.b.getRecycledViewPool().clear();
    }

    public int s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66a136d", new Object[]{this})).intValue() : this.i;
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        a((lik) this.b.getLayoutManager());
        lik e = e(this.b);
        if (this.d == null) {
            this.d = f(this.b);
        }
        this.d.a(this.i);
        b(e);
        ldf.d("MainRecycleViewServiceImpl", "reset Recycler view");
    }

    private void a(lik likVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d9998a", new Object[]{this, likVar});
        } else if (ldj.a("enableFixFoldPhoneStatusError", true)) {
            ldf.d("MainRecycleViewServiceImpl", "unRegisterListenerRelatedToLayoutManager");
            this.g.b(likVar);
        } else {
            this.g.b(this.b, this.d, likVar);
        }
    }

    private void b(lik likVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15ca00b", new Object[]{this, likVar});
        } else if (ldj.a("enableFixFoldPhoneStatusError", true)) {
            ldf.d("MainRecycleViewServiceImpl", "registerListenerRelatedToLayoutManager");
            this.g.a(likVar);
        } else {
            this.g.a(this.b, this.d, likVar);
        }
    }
}
