package com.taobao.search.searchdoor.shop;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.android.task.Coordinator;
import com.taobao.search.common.util.r;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.npt;
import tb.nqh;
import tb.nrx;
import tb.nry;
import tb.nrz;
import tb.ruk;

/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f19408a;
    private nqh.a b;
    private nrx c;
    private List<ActivateBean> d;
    private HistoryCellBean e;
    private Context f;

    /* renamed from: com.taobao.search.searchdoor.shop.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class RunnableC0783a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ List c;

        public RunnableC0783a(String str, List list) {
            this.b = str;
            this.c = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            a.a(a.this).a(new nrz(this.b, nry.a(this.c)));
        }
    }

    /* loaded from: classes7.dex */
    public static final class b extends i {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public b(String str) {
            this.b = str;
        }

        @Override // com.taobao.android.searchbaseframe.util.i
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            String a2 = a.a(a.this).a(this.b);
            if (a2 == null) {
                return;
            }
            List list = null;
            try {
                list = JSON.parseArray(npt.c(a2), ActivateBean.class);
            } catch (JSONException unused) {
            }
            if (list == null) {
                return;
            }
            a.a(a.this, new ShopSearchHistoryRepo$getAllHistoryData$1$runSafe$$inlined$let$lambda$1(list, this));
        }
    }

    /* loaded from: classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ruk f19411a;

        public c(ruk rukVar) {
            this.f19411a = rukVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f19411a.mo2427invoke();
            }
        }
    }

    static {
        kge.a(-632207500);
    }

    public a(Context context, String tableName) {
        q.c(context, "context");
        q.c(tableName, "tableName");
        this.f = context;
        this.f19408a = 10;
        this.c = new nrx(this.f, tableName, 0, 4, null);
        this.d = new ArrayList();
        HistoryCellBean historyCellBean = new HistoryCellBean();
        historyCellBean.name = com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16659);
        historyCellBean.type = "nt_history";
        this.e = historyCellBean;
    }

    public static final /* synthetic */ nrx a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nrx) ipChange.ipc$dispatch("880c4286", new Object[]{aVar}) : aVar.c;
    }

    public static final /* synthetic */ void a(a aVar, ruk rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53828b4", new Object[]{aVar, rukVar});
        } else {
            aVar.a(rukVar);
        }
    }

    public static final /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cc8dc0a", new Object[]{aVar});
        } else {
            aVar.b();
        }
    }

    public static final /* synthetic */ void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342e1129", new Object[]{aVar});
        } else {
            aVar.c();
        }
    }

    public final void a(nqh.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13840116", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public final void a(HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa4a10", new Object[]{this, historyCellBean});
            return;
        }
        q.c(historyCellBean, "historyCellBean");
        this.e = historyCellBean;
        HistoryCellBean historyCellBean2 = this.e;
        historyCellBean2.activateItems = this.d;
        List<ActivateBean> list = historyCellBean2.activateItems;
        q.a((Object) list, "this.historyCellBean.activateItems");
        for (ActivateBean activateBean : list) {
            activateBean.suggestRn = historyCellBean.suggestRn;
        }
    }

    public final HistoryCellBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HistoryCellBean) ipChange.ipc$dispatch("76c5b4d6", new Object[]{this}) : this.e;
    }

    public final void a(String id) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, id});
            return;
        }
        q.c(id, "id");
        Coordinator.execute(new b(id));
    }

    public final void a(ActivateBean activateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cbdd948", new Object[]{this, activateBean});
            return;
        }
        q.c(activateBean, "activateBean");
        Iterator<ActivateBean> it = this.d.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (q.a((Object) it.next().keyword, (Object) activateBean.keyword)) {
                break;
            } else {
                i++;
            }
        }
        if (i == 0) {
            return;
        }
        if (i > 0) {
            this.d.remove(i);
        }
        this.d.add(0, activateBean);
    }

    public final void b(String id) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, id});
            return;
        }
        q.c(id, "id");
        if (this.d.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int c2 = r.c(this.f19408a);
        if (this.d.size() > c2) {
            arrayList.addAll(this.d.subList(0, c2));
        } else {
            arrayList.addAll(this.d);
        }
        Coordinator.execute(new RunnableC0783a(id, arrayList));
    }

    public final void b(ActivateBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fc48e7", new Object[]{this, bean});
            return;
        }
        q.c(bean, "bean");
        this.d.remove(bean);
        b();
    }

    public final void c(String id) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, id});
            return;
        }
        q.c(id, "id");
        this.c.b(id);
        this.d.clear();
        a(new ShopSearchHistoryRepo$deleteAllHistory$1(this));
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        nqh.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        HistoryCellBean historyCellBean = this.e;
        historyCellBean.activateItems = this.d;
        aVar.onHistoryUpdated(historyCellBean);
    }

    private final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        nqh.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        HistoryCellBean historyCellBean = this.e;
        historyCellBean.activateItems = this.d;
        aVar.onHistoryDeleted(historyCellBean);
    }

    private final void a(ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbfc750", new Object[]{this, rukVar});
        } else {
            new Handler(Looper.getMainLooper()).post(new c(rukVar));
        }
    }
}
