package com.taobao.mytaobao.basement;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.mytaobao.basement.BasementCeilingHelper$onScrollListener$2;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import kotlin.d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\r\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0007J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u001fH\u0007R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001b\u0010\u001c¨\u0006$"}, d2 = {"Lcom/taobao/mytaobao/basement/BasementCeilingHelper;", "", "rv", "Lcom/taobao/mytaobao/view/MTPtrRecyclerView;", "(Lcom/taobao/mytaobao/view/MTPtrRecyclerView;)V", "enable", "", "getEnable", "()Z", "enable$delegate", "Lkotlin/Lazy;", "isOnTouch", "onScrollListener", "com/taobao/mytaobao/basement/BasementCeilingHelper$onScrollListener$2$1", "getOnScrollListener", "()Lcom/taobao/mytaobao/basement/BasementCeilingHelper$onScrollListener$2$1;", "onScrollListener$delegate", "onTouchListener", "Landroid/view/View$OnTouchListener;", "getOnTouchListener", "()Landroid/view/View$OnTouchListener;", "onTouchListener$delegate", "getRv", "()Lcom/taobao/mytaobao/view/MTPtrRecyclerView;", Constants.Name.SCROLL_DIRECTION, "", "threshold", "getThreshold", "()I", "threshold$delegate", "considerCeiling", "", "registerListener", "traceCeiling", "scrollOffsetFromBottom", "unregisterListener", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k[] f18314a;
    private final d b;
    private final d c;
    private int d;
    private boolean e;
    private final d f;
    private final d g;
    private final MTPtrRecyclerView h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c.this.c().smoothScrollToPosition(this.b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TBS.Ext.commitEvent(com.taobao.mytaobao.basement.monitor.b.MODULE_NAME, 19999, "samplingAutoCeiling", null, null, "ceilingSampling=" + c.d(c.this));
        }
    }

    static {
        kge.a(-2026848738);
        f18314a = new k[]{t.a(new PropertyReference1Impl(t.b(c.class), "threshold", "getThreshold()I")), t.a(new PropertyReference1Impl(t.b(c.class), "enable", "getEnable()Z")), t.a(new PropertyReference1Impl(t.b(c.class), "onTouchListener", "getOnTouchListener()Landroid/view/View$OnTouchListener;")), t.a(new PropertyReference1Impl(t.b(c.class), "onScrollListener", "getOnScrollListener()Lcom/taobao/mytaobao/basement/BasementCeilingHelper$onScrollListener$2$1;"))};
    }

    private final int d() {
        IpChange ipChange = $ipChange;
        return ((Number) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("596b2de", new Object[]{this}) : this.b.getValue())).intValue();
    }

    private final boolean e() {
        IpChange ipChange = $ipChange;
        return ((Boolean) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a4ca70", new Object[]{this}) : this.c.getValue())).booleanValue();
    }

    private final View.OnTouchListener f() {
        IpChange ipChange = $ipChange;
        return (View.OnTouchListener) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("6a61be3f", new Object[]{this}) : this.f.getValue());
    }

    private final BasementCeilingHelper$onScrollListener$2.AnonymousClass1 g() {
        IpChange ipChange = $ipChange;
        return (BasementCeilingHelper$onScrollListener$2.AnonymousClass1) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("f6251efe", new Object[]{this}) : this.g.getValue());
    }

    public c(MTPtrRecyclerView rv) {
        q.c(rv, "rv");
        this.h = rv;
        this.b = kotlin.e.a(new BasementCeilingHelper$threshold$2(this));
        this.c = kotlin.e.a(BasementCeilingHelper$enable$2.INSTANCE);
        Coordinator.execute(new b());
        this.f = kotlin.e.a(new BasementCeilingHelper$onTouchListener$2(this));
        this.g = kotlin.e.a(new BasementCeilingHelper$onScrollListener$2(this));
    }

    public static final /* synthetic */ void a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ce8091", new Object[]{cVar, new Integer(i)});
        } else {
            cVar.d = i;
        }
    }

    public static final /* synthetic */ void a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28cec062", new Object[]{cVar, new Boolean(z)});
        } else {
            cVar.e = z;
        }
    }

    public static final /* synthetic */ void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e2afb4", new Object[]{cVar});
        } else {
            cVar.h();
        }
    }

    public static final /* synthetic */ boolean d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("448a8339", new Object[]{cVar})).booleanValue() : cVar.e();
    }

    public final MTPtrRecyclerView c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MTPtrRecyclerView) ipChange.ipc$dispatch("4643c5f8", new Object[]{this}) : this.h;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.h.registerOnTouchListener(f());
        this.h.addOnScrollListener(g());
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.h.unregisterOnTouchListener(f());
        this.h.removeOnScrollListener(g());
    }

    private final void h() {
        int height;
        Boolean bool;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        com.taobao.mytaobao.ultron.b a2 = com.taobao.mytaobao.ultron.b.a();
        q.a((Object) a2, "MTBDataProvider.getInstance()");
        JSONObject o = a2.o();
        if (o != null && (bool = o.getBoolean("disableAutoCeiling")) != null) {
            z = bool.booleanValue();
        }
        if (z) {
            TLog.loge(BasementConstants.TAG, "服务端关闭自动吸顶");
        } else if (d() <= 0) {
            TLog.loge(BasementConstants.TAG, "淘友圈关闭自动吸顶：阈值<=0");
        } else if (!e()) {
            TLog.loge(BasementConstants.TAG, "淘友圈自动吸顶降级");
        } else {
            int a3 = e.a(this.h);
            if (a3 <= 0 || (height = this.h.getHeight() - a3) <= 0 || height > d()) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = this.h.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager == null) {
                return;
            }
            this.h.post(new a(linearLayoutManager.findLastVisibleItemPosition()));
            a(height);
        }
    }

    private final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        TLog.loge(BasementConstants.TAG, "淘友圈自动吸顶,rv height=" + this.h.getHeight() + ", 露头高度=" + (this.h.getHeight() - i));
        if (this.h.getHeight() <= 0) {
            return;
        }
        float height = (this.h.getHeight() - i) / this.h.getHeight();
        TBS.Ext.commitEvent(com.taobao.mytaobao.basement.monitor.b.MODULE_NAME, 19999, "triggerAutoCeiling", null, null, "triggerCoefficient=" + height);
    }
}
