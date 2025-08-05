package com.taobao.mytaobao.ultron;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.bkp;
import tb.ble;
import tb.bll;
import tb.bnn;
import tb.bnv;
import tb.bny;
import tb.boz;
import tb.bpp;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0016H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0016J*\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u001c2\u000e\u0010)\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+2\b\u0010#\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010,\u001a\u00020-H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006."}, d2 = {"Lcom/taobao/mytaobao/ultron/MyTBLayoutExtendV1;", "Lcom/alibaba/android/ultron/vfw/layout/ILayoutExtend;", "()V", "mAdapter", "Lcom/alibaba/android/ultron/ext/adapter/RecyclerViewWaterfallAdapter;", "getMAdapter", "()Lcom/alibaba/android/ultron/ext/adapter/RecyclerViewWaterfallAdapter;", "setMAdapter", "(Lcom/alibaba/android/ultron/ext/adapter/RecyclerViewWaterfallAdapter;)V", "mDXCLayoutManager", "Lcom/alibaba/android/ultron/ext/layout/DXCLayoutManager;", "getMDXCLayoutManager", "()Lcom/alibaba/android/ultron/ext/layout/DXCLayoutManager;", "setMDXCLayoutManager", "(Lcom/alibaba/android/ultron/ext/layout/DXCLayoutManager;)V", "mLayoutManager", "Lcom/alibaba/android/ultron/ext/vlayout/VirtualLayoutManager;", "getMLayoutManager", "()Lcom/alibaba/android/ultron/ext/vlayout/VirtualLayoutManager;", "setMLayoutManager", "(Lcom/alibaba/android/ultron/ext/vlayout/VirtualLayoutManager;)V", "mViewEngine", "Lcom/alibaba/android/ultron/vfw/core/ViewEngine;", "getMViewEngine", "()Lcom/alibaba/android/ultron/vfw/core/ViewEngine;", "setMViewEngine", "(Lcom/alibaba/android/ultron/vfw/core/ViewEngine;)V", "getLayoutManager", "Landroid/support/v7/widget/RecyclerView$LayoutManager;", "context", "Landroid/content/Context;", "getRecyclerViewAdapter", "Lcom/alibaba/android/ultron/vfw/adapter/RecyclerViewAdapter;", "init", "", "viewEngine", "rebuildBody", com.taobao.android.fluid.framework.data.remote.c.KEY_DATA_SOURCE, "Lcom/alibaba/android/ultron/vfw/core/DataSource;", "reportException", "layoutManager", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "useCustomLayout", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class g implements boz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private VirtualLayoutManager f18522a;
    private bkp b;
    private bny c;
    private ble d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bH\u0016¨\u0006\t"}, d2 = {"com/taobao/mytaobao/ultron/MyTBLayoutExtendV1$init$1", "Lcom/alibaba/android/ultron/ext/vlayout/AbsLayoutManagerExceptionCallback;", "onException", "", "layoutManager", "Landroid/support/v7/widget/RecyclerView$LayoutManager;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a extends com.alibaba.android.ultron.ext.vlayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ bny b;

        public a(bny bnyVar) {
            this.b = bnyVar;
        }

        @Override // com.alibaba.android.ultron.ext.vlayout.a
        public void a(RecyclerView.LayoutManager layoutManager, Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c354798f", new Object[]{this, layoutManager, exc});
                return;
            }
            q.c(layoutManager, "layoutManager");
            g.a(g.this, layoutManager, exc, this.b);
        }
    }

    static {
        kge.a(1395023826);
        kge.a(-745436470);
    }

    @Override // tb.boz
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static final /* synthetic */ void a(g gVar, RecyclerView.LayoutManager layoutManager, Exception exc, bny bnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("813472b1", new Object[]{gVar, layoutManager, exc, bnyVar});
        } else {
            gVar.a(layoutManager, exc, bnyVar);
        }
    }

    @Override // tb.boz
    public void a(bny viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e215f60b", new Object[]{this, viewEngine});
            return;
        }
        q.c(viewEngine, "viewEngine");
        this.c = viewEngine;
        this.d = new ble();
        if (this.f18522a == null) {
            Context k = viewEngine.k();
            q.a((Object) k, "viewEngine.context");
            this.f18522a = new c(k, 1, false);
            VirtualLayoutManager virtualLayoutManager = this.f18522a;
            if (virtualLayoutManager == null) {
                q.a();
            }
            virtualLayoutManager.a(new a(viewEngine));
        }
        if (this.b != null) {
            return;
        }
        this.b = new bkp(this.c, this.f18522a);
    }

    private final void a(RecyclerView.LayoutManager layoutManager, Exception exc, bny bnyVar) {
        String r;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480dec32", new Object[]{this, layoutManager, exc, bnyVar});
            return;
        }
        int itemCount = layoutManager.getItemCount();
        int childCount = layoutManager.getChildCount();
        if (bnyVar == null) {
            r = "none";
        } else {
            r = bnyVar.r();
            q.a((Object) r, "viewEngine.getBizName()");
        }
        UMLinkLogInterface a2 = bpp.a();
        if (exc == null || (str = exc.getMessage()) == null) {
            str = "";
        }
        String str2 = str;
        HashMap hashMap = new HashMap();
        hashMap.put("itemCount", String.valueOf(itemCount));
        hashMap.put("childCount", String.valueOf(childCount));
        HashMap hashMap2 = hashMap;
        a2.logError("AURAMonitor", r, "VirtualLayoutManager", null, "VirtualLayoutManagerException", str2, new HashMap(), com.alibaba.android.umbrella.link.export.a.a(hashMap2));
        a2.commitFailure("VirtualLayoutManager", "AURAMonitor", "1.0", "AURAMonitor", r, hashMap2, "VirtualLayoutManagerException", str2);
        UnifyLog.d("UltronLayoutExtend", "bizName=" + r + ",message=" + str2);
    }

    @Override // tb.boz
    public RecyclerView.LayoutManager a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutManager) ipChange.ipc$dispatch("9b5f6525", new Object[]{this, context});
        }
        VirtualLayoutManager virtualLayoutManager = this.f18522a;
        if (virtualLayoutManager == null) {
            q.a();
        }
        return virtualLayoutManager;
    }

    @Override // tb.boz
    public void a(bnv dataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21498ee", new Object[]{this, dataSource});
            return;
        }
        q.c(dataSource, "dataSource");
        if (!com.taobao.mytaobao.base.c.r() && com.taobao.mytaobao.basement.a.b()) {
            bkp bkpVar = this.b;
            if (bkpVar == null) {
                q.a();
            }
            bkpVar.b(dataSource.f());
            return;
        }
        ArrayList arrayList = new ArrayList();
        IDMComponent f = dataSource.a().f();
        bny bnyVar = this.c;
        if (bnyVar == null) {
            q.a();
        }
        ArrayList arrayList2 = arrayList;
        List<com.alibaba.android.ultron.ext.vlayout.c> a2 = bll.a(bnyVar.k(), f, arrayList2, this.d);
        bkp bkpVar2 = this.b;
        if (bkpVar2 == null) {
            q.a();
        }
        bkpVar2.a(a2);
        bkp bkpVar3 = this.b;
        if (bkpVar3 == null) {
            q.a();
        }
        bkpVar3.b(arrayList2);
    }

    @Override // tb.boz
    public bnn b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bnn) ipChange.ipc$dispatch("16b4811b", new Object[]{this});
        }
        bkp bkpVar = this.b;
        if (bkpVar == null) {
            q.a();
        }
        return bkpVar;
    }
}
