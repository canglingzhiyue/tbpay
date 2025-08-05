package com.alibaba.android.ultron.vfw.perf.rebuilddelay;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import tb.ifp;
import tb.jqg;
import tb.jqi;
import tb.kge;

/* loaded from: classes2.dex */
public final class a extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;
    private final RecyclerView c;
    private LinearLayoutManager d;
    private ConcurrentHashMap<String, Runnable> e;

    /* renamed from: a  reason: collision with root package name */
    private final String f2722a = "UltronViewRebuildDelayTask";
    private int f = 5;

    static {
        kge.a(1905174249);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
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

    public a(String str, RecyclerView recyclerView) {
        this.b = str;
        this.c = recyclerView;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            this.d = (LinearLayoutManager) layoutManager;
        } else if (ifp.a()) {
            throw new IllegalStateException("仅支持LinearLayoutManager");
        }
        recyclerView.addOnScrollListener(this);
    }

    public void a(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d729b0", new Object[]{this, str, runnable});
            return;
        }
        if (this.e == null) {
            this.e = new ConcurrentHashMap<>();
        }
        this.f = jqi.a(this.b, "resumeDelayTaskItemCountWhenReachEnd", 5);
        this.e.put(str, runnable);
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        if (this.d == null || recyclerView.getAdapter() == null || this.d.findLastVisibleItemPosition() != recyclerView.getAdapter().getItemCount() - this.f) {
            return;
        }
        c();
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (i != 0) {
            return;
        }
        d();
    }

    private void c() {
        Runnable remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ConcurrentHashMap<String, Runnable> concurrentHashMap = this.e;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty() || (remove = this.e.remove(UltronViewRebuildDelayType.rebuildWhenIdleOrLastItemVisible)) == null) {
            return;
        }
        jqg.b("UltronViewRebuildDelayTask", "倒数第" + this.f + "个item显示，恢复刷新任务");
        remove.run();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ConcurrentHashMap<String, Runnable> concurrentHashMap = this.e;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        jqg.b("UltronViewRebuildDelayTask", "滚动停止，恢复刷新任务");
        for (Runnable runnable : this.e.values()) {
            runnable.run();
        }
        this.e.clear();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ConcurrentHashMap<String, Runnable> concurrentHashMap = this.e;
        if (concurrentHashMap == null) {
            return;
        }
        concurrentHashMap.clear();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ConcurrentHashMap<String, Runnable> concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
            this.e = null;
        }
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            return;
        }
        recyclerView.removeOnScrollListener(this);
    }
}
