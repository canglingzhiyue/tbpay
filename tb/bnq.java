package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class bnq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String d;
    private final ConcurrentHashMap<String, bnp> b = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Runnable> c = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f26004a = jqh.a(1, 5, 3, TimeUnit.SECONDS, new Runnable() { // from class: tb.bnq.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            bnq.a(bnq.this).clear();
            jqg.b(bnq.b(bnq.this), "UltronRecyclerViewDiffUtils#thread rejected");
        }
    }, "UltronRecyclerViewDiffUtils");

    static {
        kge.a(128037548);
    }

    public static /* synthetic */ ConcurrentHashMap a(bnq bnqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("f29d1d73", new Object[]{bnqVar}) : bnqVar.b;
    }

    public static /* synthetic */ bnp a(bnq bnqVar, bnn bnnVar, List list, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bnp) ipChange.ipc$dispatch("e6163ea0", new Object[]{bnqVar, bnnVar, list, new Boolean(z)}) : bnqVar.a(bnnVar, list, z);
    }

    public static /* synthetic */ void a(bnq bnqVar, String str, bnp bnpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e894eb69", new Object[]{bnqVar, str, bnpVar});
        } else {
            bnqVar.a(str, bnpVar);
        }
    }

    public static /* synthetic */ void a(bnq bnqVar, bnn bnnVar, List list, bnp bnpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e7d4de", new Object[]{bnqVar, bnnVar, list, bnpVar});
        } else {
            bnqVar.a(bnnVar, list, bnpVar);
        }
    }

    public static /* synthetic */ String b(bnq bnqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7138758c", new Object[]{bnqVar}) : bnqVar.d;
    }

    public static /* synthetic */ String c(bnq bnqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("71e5212b", new Object[]{bnqVar}) : bnqVar.b();
    }

    public bnq(String str) {
        this.d = str;
    }

    public void a(Context context, RecyclerView recyclerView, final bnn bnnVar, final List<IDMComponent> list, String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d53071d", new Object[]{this, context, recyclerView, bnnVar, list, str, new Boolean(z)});
        } else if (recyclerView == null || bnnVar == null || list == null) {
        } else {
            if (recyclerView.isComputingLayout()) {
                a(bnnVar, list);
            } else if (bnnVar.a() == null) {
            } else {
                try {
                    recyclerView.setItemAnimator(null);
                    a(str, new bns() { // from class: tb.bnq.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.bns
                        public bnp a() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (bnp) ipChange2.ipc$dispatch("f02dbfa", new Object[]{this}) : bnq.a(bnq.this, bnnVar, list, z);
                        }

                        @Override // tb.bns
                        public void a(bnp bnpVar) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("e211deb4", new Object[]{this, bnpVar});
                            } else {
                                bnq.a(bnq.this, bnnVar, list, bnpVar);
                            }
                        }
                    });
                } catch (Exception e) {
                    a(bnnVar, list);
                    String b = b();
                    jqg.b(b, "diffNotifyDataSetChanged exception, refresh all#" + e.getMessage());
                }
            }
        }
    }

    private static void a(bnn bnnVar, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b0d6e7", new Object[]{bnnVar, list});
            return;
        }
        bnnVar.b(list);
        bnnVar.notifyDataSetChanged();
    }

    private void a(String str, bns bnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21fdb19b", new Object[]{this, str, bnsVar});
            return;
        }
        bnp a2 = a(str);
        if (a2 == null) {
            a2 = bnsVar.a();
            c(str);
        }
        bnsVar.a(a2);
        b(str);
    }

    private void a(bnn bnnVar, List<IDMComponent> list, bnp bnpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be3f5a33", new Object[]{this, bnnVar, list, bnpVar});
            return;
        }
        bnnVar.b(list);
        int b = bnpVar.b();
        if (b <= 0) {
            bnnVar.notifyDataSetChanged();
            jqg.b(b(), "计算得出没有任何组件有数据变更，做全量刷新的补偿逻辑");
            return;
        }
        try {
            bnpVar.a().a(bnnVar);
            String b2 = b();
            jqg.b(b2, "执行差量刷新，有变化的组件个数：" + b);
        } catch (Exception e) {
            a(bnnVar, list);
            jqg.a(this.d, "差量刷新出错，做全量刷新补偿", e.getMessage());
        }
    }

    private bnp a(bnn bnnVar, List<IDMComponent> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bnp) ipChange.ipc$dispatch("fb6dc3f5", new Object[]{this, bnnVar, list, new Boolean(z)});
        }
        bno bnoVar = new bno(list, bnnVar.a(), z);
        return new bnp(acj.a(bnoVar), bnoVar.a());
    }

    public void a(final bnn bnnVar, final List<IDMComponent> list, final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626c9c03", new Object[]{this, bnnVar, list, str, new Boolean(z)});
            return;
        }
        try {
            a();
            Runnable runnable = new Runnable() { // from class: tb.bnq.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        bnq.a(bnq.this, str, bnq.a(bnq.this, bnnVar, list, z));
                    } catch (Exception e) {
                        String c = bnq.c(bnq.this);
                        jqg.a(c, "asyncCalculateDiff exception#" + e.getMessage());
                    }
                }
            };
            a(str, runnable);
            this.f26004a.execute(runnable);
        } catch (Exception e) {
            String b = b();
            jqg.a(b, "asyncCalculateDiff exception#" + e.getMessage());
        }
    }

    private bnp a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bnp) ipChange.ipc$dispatch("7c6d84f0", new Object[]{this, str}) : this.b.get(str);
    }

    private void a(String str, bnp bnpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21fc547e", new Object[]{this, str, bnpVar});
        } else {
            this.b.put(str, bnpVar);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b.remove(str);
        }
    }

    private void a(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d729b0", new Object[]{this, str, runnable});
        } else {
            this.c.put(str, runnable);
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.f26004a.remove(this.c.remove(str));
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (Runnable runnable : this.c.values()) {
            this.f26004a.remove(runnable);
        }
        this.c.clear();
        this.b.clear();
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        return this.d + "#UltronRecyclerViewDiffUtils";
    }
}
