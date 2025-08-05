package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.android.task.Coordinator;
import com.taobao.login4android.api.Login;
import com.taobao.muniontaobaosdk.util.b;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.util.e;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import tb.npr;

/* loaded from: classes7.dex */
public class nqh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_KEY = "historycache";
    public static final String HISTORY_GROUP = "nt_history";
    public static final int MAX_HISTORY_SIZE = 10;

    /* renamed from: a  reason: collision with root package name */
    private static String f31654a;
    private volatile List<ActivateBean> b;
    private volatile boolean c;
    private a d;
    private String e;

    /* loaded from: classes7.dex */
    public interface a {
        void onHistoryDeleted(HistoryCellBean historyCellBean);

        void onHistoryUpdated(HistoryCellBean historyCellBean);
    }

    static {
        kge.a(501253126);
    }

    public static /* synthetic */ String a(nqh nqhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d0f874d", new Object[]{nqhVar}) : nqhVar.f();
    }

    public static /* synthetic */ List a(nqh nqhVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("82748523", new Object[]{nqhVar, list});
        }
        nqhVar.b = list;
        return list;
    }

    public static /* synthetic */ void a(nqh nqhVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39a1ecbd", new Object[]{nqhVar, str});
        } else {
            nqhVar.c(str);
        }
    }

    public static /* synthetic */ boolean a(nqh nqhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfa33f85", new Object[]{nqhVar, new Boolean(z)})).booleanValue();
        }
        nqhVar.c = z;
        return z;
    }

    public static /* synthetic */ a b(nqh nqhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("23d487d0", new Object[]{nqhVar}) : nqhVar.d;
    }

    public static /* synthetic */ List c(nqh nqhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b5ac3af2", new Object[]{nqhVar}) : nqhVar.e();
    }

    public static /* synthetic */ List d(nqh nqhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a67d4251", new Object[]{nqhVar}) : nqhVar.b;
    }

    public nqh(a aVar) {
        this(aVar, null);
    }

    public nqh(a aVar, String str) {
        this.c = false;
        this.d = aVar;
        this.e = str;
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Coordinator.execute(new i() { // from class: tb.nqh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.i
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        nqh.a(nqh.this, str);
                    }
                }
            });
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = new ArrayList();
        Coordinator.execute(new i() { // from class: tb.nqh.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.util.i
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    npu.b(nqh.a(nqh.this));
                }
            }
        });
        new npr.b().a(new npk()).a().a().c().a(new iud<nno>() { // from class: tb.nqh.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iud
            public void a(nno nnoVar) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f68b91c9", new Object[]{this, nnoVar});
                    return;
                }
                e.a(nnoVar.e ? "DeleteHistorySuccess" : "DeleteHistoryFail");
                nqh.b(nqh.this).onHistoryDeleted(nqh.this.b());
            }
        }, new npj("clear_history"));
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.c) {
            q.a("SearchHistoryManager", "local history is loading");
        } else {
            this.c = true;
            Coordinator.execute(new i() { // from class: tb.nqh.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.i
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    final List c = nqh.c(nqh.this);
                    if (c == null) {
                        c = new ArrayList();
                    }
                    new Handler(Looper.getMainLooper()).post(new i() { // from class: tb.nqh.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.searchbaseframe.util.i
                        public void a() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            nqh.a(nqh.this, c);
                            nqh.b(nqh.this).onHistoryUpdated(nqh.this.b());
                            nqh.a(nqh.this, false);
                        }
                    });
                }
            });
        }
    }

    private List<ActivateBean> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd625b", new Object[]{this});
        }
        try {
            String a2 = npt.a(f());
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            return JSON.parseArray(a2, ActivateBean.class);
        } catch (Exception e) {
            q.c("SearchHistoryManager", "解析持久化历史数据失败", e);
            return null;
        }
    }

    private String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        String g = g();
        String str = CACHE_KEY;
        if (!TextUtils.isEmpty(this.e)) {
            str = str + "_" + this.e;
        }
        if (TextUtils.isEmpty(g)) {
            return str;
        }
        return str + "_" + b.a(g);
    }

    private static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        String nick = Login.getNick();
        return nick == null ? "" : nick;
    }

    private void c(String str) {
        List<ActivateBean> list;
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            if (this.b == null) {
                list = e();
            } else {
                list = this.b;
            }
            HashSet hashSet = new HashSet();
            ActivateBean activateBean = new ActivateBean();
            activateBean.keyword = str;
            activateBean.groupType = "nt_history";
            arrayList.add(activateBean);
            hashSet.add(str);
            int c = r.c(10);
            if (list != null) {
                for (ActivateBean activateBean2 : list) {
                    if (i >= c) {
                        break;
                    } else if (activateBean2 != null && !hashSet.contains(activateBean2.keyword)) {
                        arrayList.add(activateBean2);
                        hashSet.add(activateBean2.keyword);
                        i++;
                    }
                }
            }
            this.b = arrayList;
            boolean a2 = npt.a(f(), arrayList);
            q.i("SearchHistoryManager", "新增搜索词，持久化：" + a2);
        }
    }

    public void a(ActivateBean activateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cbdd948", new Object[]{this, activateBean});
            return;
        }
        if (this.b != null) {
            this.b.remove(activateBean);
            h();
        }
        if (!TextUtils.isEmpty(activateBean.keyword)) {
            d(activateBean.keyword);
        }
        this.d.onHistoryDeleted(b());
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            Coordinator.execute(new i() { // from class: tb.nqh.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.i
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (nqh.d(nqh.this) == null) {
                    } else {
                        boolean a2 = npt.a(nqh.a(nqh.this), nqh.d(nqh.this));
                        q.i("SearchHistoryManager", "删除本地单条历史：" + a2);
                    }
                }
            });
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            new npr.b().a(new npl(str)).a().a().a(new iud<nno>() { // from class: tb.nqh.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iud
                public void a(nno nnoVar) throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f68b91c9", new Object[]{this, nnoVar});
                        return;
                    }
                    q.i("SearchHistoryManager", "删除云端单条历史：" + nnoVar.e);
                }
            }, new npj("delete_cloud_history"));
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.b != null) {
                int size = this.b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    } else if (TextUtils.equals(this.b.get(size).keyword, str)) {
                        this.b.remove(size);
                        break;
                    } else {
                        size--;
                    }
                }
                h();
            }
            d(str);
            this.d.onHistoryDeleted(b());
        }
    }

    public HistoryCellBean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryCellBean) ipChange.ipc$dispatch("54b91ab5", new Object[]{this});
        }
        HistoryCellBean historyCellBean = new HistoryCellBean();
        historyCellBean.name = com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16659);
        historyCellBean.type = "nt_history";
        historyCellBean.activateItems = i();
        return historyCellBean;
    }

    private List<ActivateBean> i() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9f84bbd7", new Object[]{this});
        }
        String g = g();
        if (!g.equals(f31654a)) {
            this.b = null;
            f31654a = g;
        }
        if (this.b == null) {
            d();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("获取已有历史数据：");
        if (this.b != null) {
            z = true;
        }
        sb.append(z);
        q.i("SearchHistoryManager", sb.toString());
        return this.b;
    }

    public List<ActivateBean> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        this.b = e();
        if (this.b == null) {
            this.b = new ArrayList();
        }
        return this.b;
    }
}
