package tb;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.lks;
import tb.lkx;
import tb.lkz;

/* loaded from: classes.dex */
public class lip implements lkr<RecyclerView> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<lks.a<RecyclerView>> f30664a;
    private List<lks.c<RecyclerView>> b;
    private List<View.OnAttachStateChangeListener> c;
    private List<lkz.a> d;
    private List<lks.d> e;
    private List<lku> f;
    private List<lkx.a> g;
    private List<lks.b> h;
    private List<lks.e> i;

    static {
        kge.a(-1759441033);
        kge.a(217480330);
    }

    @Override // tb.lks
    public void a(lks.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192192a7", new Object[]{this, aVar});
            return;
        }
        if (this.f30664a == null) {
            this.f30664a = new CopyOnWriteArrayList();
        }
        this.f30664a.add(aVar);
    }

    @Override // tb.lks
    public void b(lks.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fcfce8", new Object[]{this, aVar});
            return;
        }
        List<lks.a<RecyclerView>> list = this.f30664a;
        if (list == null) {
            return;
        }
        list.remove(aVar);
    }

    @Override // tb.lkt
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        List<lks.a<RecyclerView>> list = this.f30664a;
        if (list == null) {
            return;
        }
        for (lks.a<RecyclerView> aVar : list) {
            aVar.a(i);
        }
    }

    @Override // tb.lkt
    public void a(Canvas canvas, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c157922b", new Object[]{this, canvas, recyclerView});
            return;
        }
        List<lks.a<RecyclerView>> list = this.f30664a;
        if (list == null) {
            return;
        }
        for (lks.a<RecyclerView> aVar : list) {
            aVar.a(canvas, recyclerView);
        }
    }

    @Override // tb.lks
    public void a(lks.c<RecyclerView> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19227b65", new Object[]{this, cVar});
            return;
        }
        if (this.b == null) {
            this.b = new CopyOnWriteArrayList();
        }
        this.b.add(cVar);
    }

    @Override // tb.lks
    public void b(lks.c<RecyclerView> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fde5a6", new Object[]{this, cVar});
            return;
        }
        List<lks.c<RecyclerView>> list = this.b;
        if (list == null) {
            return;
        }
        list.remove(cVar);
    }

    @Override // tb.lkt
    public void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        List<lks.c<RecyclerView>> list = this.b;
        if (list == null) {
            return;
        }
        for (lks.c<RecyclerView> cVar : list) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            cVar.a((lks.c<RecyclerView>) recyclerView, i);
            ldf.e("RecycleViewLifeCycleCenter", "onScrollStateChanged " + cVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    @Override // tb.lkt
    public void a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else if (this.b != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (lks.c<RecyclerView> cVar : this.b) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                cVar.a(recyclerView, i, i2);
                String[] strArr = new String[i3];
                strArr[0] = "onScrolled " + cVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + "ms";
                ldf.e("RecycleViewLifeCycleCenter", strArr);
                i3 = 1;
            }
            String[] strArr2 = new String[i3];
            strArr2[0] = "notifyOnScrolled  总耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms";
            ldf.e("RecycleViewLifeCycleCenter", strArr2);
        }
    }

    @Override // tb.lkt
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.b != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (lks.c<RecyclerView> cVar : this.b) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                cVar.a(z, z2);
                ldf.e("RecycleViewLifeCycleCenter", "notifyEdgeSate " + cVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + "ms");
            }
            ldf.e("RecycleViewLifeCycleCenter", "notifyReachEdge  总耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    @Override // tb.lks
    public void a(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98c4c3d", new Object[]{this, onAttachStateChangeListener});
            return;
        }
        if (this.c == null) {
            this.c = new CopyOnWriteArrayList();
        }
        this.c.add(onAttachStateChangeListener);
    }

    @Override // tb.lks
    public void b(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3764e69c", new Object[]{this, onAttachStateChangeListener});
            return;
        }
        List<View.OnAttachStateChangeListener> list = this.c;
        if (list == null) {
            return;
        }
        list.remove(onAttachStateChangeListener);
    }

    @Override // tb.lks
    public void a(lks.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1922efc4", new Object[]{this, dVar});
            return;
        }
        if (this.e == null) {
            this.e = new CopyOnWriteArrayList();
        }
        this.e.add(dVar);
    }

    @Override // tb.lks
    public void b(lks.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fe5a05", new Object[]{this, dVar});
            return;
        }
        List<lks.d> list = this.e;
        if (list == null) {
            return;
        }
        list.remove(dVar);
    }

    @Override // tb.lks
    public void a(lks.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19220706", new Object[]{this, bVar});
            return;
        }
        if (this.h == null) {
            this.h = new CopyOnWriteArrayList();
        }
        this.h.add(bVar);
    }

    @Override // tb.lks
    public void b(lks.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fd7147", new Object[]{this, bVar});
            return;
        }
        List<lks.b> list = this.h;
        if (list == null) {
            return;
        }
        list.remove(bVar);
    }

    @Override // tb.lks
    public void a(lks.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19236423", new Object[]{this, eVar});
            return;
        }
        if (this.i == null) {
            this.i = new CopyOnWriteArrayList();
        }
        this.i.add(eVar);
    }

    @Override // tb.lks
    public void b(lks.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fece64", new Object[]{this, eVar});
            return;
        }
        List<lks.e> list = this.i;
        if (list == null) {
            return;
        }
        list.remove(eVar);
    }

    @Override // tb.lkt
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        List<View.OnAttachStateChangeListener> list = this.c;
        if (list == null) {
            return;
        }
        for (View.OnAttachStateChangeListener onAttachStateChangeListener : list) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            onAttachStateChangeListener.onViewAttachedToWindow(view);
            ldf.e("RecycleViewLifeCycleCenter", "onViewAttachedToWindow " + onAttachStateChangeListener.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    @Override // tb.lkt
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        List<View.OnAttachStateChangeListener> list = this.c;
        if (list == null) {
            return;
        }
        for (View.OnAttachStateChangeListener onAttachStateChangeListener : list) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            onAttachStateChangeListener.onViewDetachedFromWindow(view);
            ldf.e("RecycleViewLifeCycleCenter", "onViewDetachedFromWindow " + onAttachStateChangeListener.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    @Override // tb.lkt
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<lks.b> list = this.h;
        if (list == null) {
            return;
        }
        for (lks.b bVar : list) {
            bVar.dM_();
        }
    }

    @Override // tb.lkt
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        List<lks.b> list = this.h;
        if (list == null) {
            return;
        }
        for (lks.b bVar : list) {
            bVar.dT_();
        }
    }

    @Override // tb.lkt
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        List<lks.e> list = this.i;
        if (list == null) {
            return;
        }
        for (lks.e eVar : list) {
            eVar.a();
        }
    }

    @Override // tb.lkz
    public void a(lkz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25137f00", new Object[]{this, aVar});
            return;
        }
        if (this.d == null) {
            this.d = new CopyOnWriteArrayList();
        }
        this.d.add(aVar);
    }

    @Override // tb.lkz
    public void b(lkz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eeee941", new Object[]{this, aVar});
            return;
        }
        List<lkz.a> list = this.d;
        if (list == null) {
            return;
        }
        list.remove(aVar);
    }

    @Override // tb.lla
    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
            return;
        }
        List<lkz.a> list = this.d;
        if (list == null) {
            return;
        }
        for (lkz.a aVar : list) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.a_(view);
            ldf.e("RecycleViewLifeCycleCenter", "onCreateView " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    @Override // tb.lla
    public void a(boolean z, int i, BaseSectionModel<?> baseSectionModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac4f93", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
            return;
        }
        List<lkz.a> list = this.d;
        if (list == null) {
            return;
        }
        for (lkz.a aVar : list) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.a(z, i, baseSectionModel, view);
            ldf.e("RecycleViewLifeCycleCenter", "onBindData " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    @Override // tb.lla
    public void a(int i, View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0524b1f", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else if (this.d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (lkz.a aVar : this.d) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                aVar.a(i, view, baseSectionModel);
                String[] strArr = new String[i2];
                strArr[0] = "itemAppear " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + "ms";
                ldf.e("RecycleViewLifeCycleCenter", strArr);
                i2 = 1;
            }
            String[] strArr2 = new String[i2];
            strArr2[0] = "notifyItemAppear  总耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms";
            ldf.e("RecycleViewLifeCycleCenter", strArr2);
        }
    }

    @Override // tb.lla
    public void b(int i, View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5fda7a0", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else if (this.d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (lkz.a aVar : this.d) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                aVar.b(i, view, baseSectionModel);
                String[] strArr = new String[i2];
                strArr[0] = "itemDisAppear " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + "ms";
                ldf.e("RecycleViewLifeCycleCenter", strArr);
                i2 = 1;
            }
            String[] strArr2 = new String[i2];
            strArr2[0] = "notifyItemDisAppear  总耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms";
            ldf.e("RecycleViewLifeCycleCenter", strArr2);
        }
    }

    @Override // tb.lla
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        List<lks.d> list = this.e;
        if (list == null) {
            return;
        }
        for (lks.d dVar : list) {
            dVar.a(z);
        }
    }

    @Override // tb.lkv
    public void a(lku lkuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2fa5442", new Object[]{this, lkuVar});
            return;
        }
        if (this.f == null) {
            this.f = new CopyOnWriteArrayList();
        }
        this.f.add(lkuVar);
    }

    @Override // tb.lkv
    public void b(lku lkuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17d5ac3", new Object[]{this, lkuVar});
            return;
        }
        List<lku> list = this.f;
        if (list == null) {
            return;
        }
        list.remove(lkuVar);
    }

    @Override // tb.lkw
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        List<lku> list = this.f;
        if (list == null) {
            return;
        }
        for (lku lkuVar : list) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            lkuVar.a();
            ldf.e("RecycleViewLifeCycleCenter", "notifyOnChanged " + lkuVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    @Override // tb.lkw
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        List<lku> list = this.f;
        if (list == null) {
            return;
        }
        for (lku lkuVar : list) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            lkuVar.a(i, i2);
            ldf.e("RecycleViewLifeCycleCenter", "notifyOnItemRangeChanged " + lkuVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    @Override // tb.lkw
    public void a(int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8120a4", new Object[]{this, new Integer(i), new Integer(i2), obj});
            return;
        }
        List<lku> list = this.f;
        if (list == null) {
            return;
        }
        for (lku lkuVar : list) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            lkuVar.a(i, i2, obj);
            ldf.e("RecycleViewLifeCycleCenter", "notifyOnItemRangeChanged 2 " + lkuVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    @Override // tb.lkw
    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        List<lku> list = this.f;
        if (list == null) {
            return;
        }
        for (lku lkuVar : list) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            lkuVar.b(i, i2);
            ldf.e("RecycleViewLifeCycleCenter", "notifyOnItemRangeInserted " + lkuVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    @Override // tb.lkw
    public void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddc94a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        List<lku> list = this.f;
        if (list == null) {
            return;
        }
        for (lku lkuVar : list) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            lkuVar.c(i, i2);
            ldf.e("RecycleViewLifeCycleCenter", "notifyOnItemRangeRemoved " + lkuVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    @Override // tb.lkw
    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        List<lku> list = this.f;
        if (list == null) {
            return;
        }
        for (lku lkuVar : list) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            lkuVar.a(i, i2, i3);
            ldf.e("RecycleViewLifeCycleCenter", "notifyOnItemRangeMoved 2 " + lkuVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    @Override // tb.lkx
    public void a(lkx.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a9cdc2", new Object[]{this, aVar});
            return;
        }
        if (this.g == null) {
            this.g = new CopyOnWriteArrayList();
        }
        this.g.add(aVar);
    }

    @Override // tb.lkx
    public void b(lkx.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b853803", new Object[]{this, aVar});
            return;
        }
        List<lkx.a> list = this.g;
        if (list == null) {
            return;
        }
        list.remove(aVar);
    }

    @Override // tb.lky
    public void a(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6090f25", new Object[]{this, viewHolder});
            return;
        }
        List<lkx.a> list = this.g;
        if (list == null) {
            return;
        }
        for (lkx.a aVar : list) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.a(viewHolder);
            ldf.e("RecycleViewLifeCycleCenter", "notifyItemRemoveStarting " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    @Override // tb.lky
    public void b(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d73f6204", new Object[]{this, viewHolder});
            return;
        }
        List<lkx.a> list = this.g;
        if (list == null) {
            return;
        }
        for (lkx.a aVar : list) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.b(viewHolder);
            ldf.e("RecycleViewLifeCycleCenter", "notifyItemRemoveFinished " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    @Override // tb.lky
    public void c(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d875b4e3", new Object[]{this, viewHolder});
            return;
        }
        List<lkx.a> list = this.g;
        if (list == null) {
            return;
        }
        for (lkx.a aVar : list) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.c(viewHolder);
            ldf.e("RecycleViewLifeCycleCenter", "notifyItemAddStarting " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    @Override // tb.lky
    public void d(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ac07c2", new Object[]{this, viewHolder});
            return;
        }
        List<lkx.a> list = this.g;
        if (list == null) {
            return;
        }
        for (lkx.a aVar : list) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d(viewHolder);
            ldf.e("RecycleViewLifeCycleCenter", "notifyItemAddFinished " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    @Override // tb.lks
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        List<lks.a<RecyclerView>> list = this.f30664a;
        if (list != null) {
            list.clear();
            this.f30664a = null;
        }
        List<lks.c<RecyclerView>> list2 = this.b;
        if (list2 != null) {
            list2.clear();
            this.b = null;
        }
        List<View.OnAttachStateChangeListener> list3 = this.c;
        if (list3 != null) {
            list3.clear();
            this.c = null;
        }
        List<lkz.a> list4 = this.d;
        if (list4 != null) {
            list4.clear();
            this.d = null;
        }
        List<lku> list5 = this.f;
        if (list5 != null) {
            list5.clear();
            this.f = null;
        }
        List<lks.b> list6 = this.h;
        if (list6 == null) {
            return;
        }
        list6.clear();
        this.h = null;
    }
}
