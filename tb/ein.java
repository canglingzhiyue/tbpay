package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.DetailOptNode;
import com.taobao.android.task.Coordinator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class ein {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile ein f27326a;
    private eio<String, JSONObject> b = new eil();
    private eio<String, DetailOptNode> c = new eim();
    private AtomicBoolean d = new AtomicBoolean(false);
    private AtomicBoolean e = new AtomicBoolean(false);

    static {
        kge.a(-1873854948);
    }

    public static /* synthetic */ eio a(ein einVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eio) ipChange.ipc$dispatch("36db398d", new Object[]{einVar}) : einVar.c;
    }

    public static /* synthetic */ eio b(ein einVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eio) ipChange.ipc$dispatch("1e7d0fec", new Object[]{einVar}) : einVar.b;
    }

    private ein() {
        emu.a("com.taobao.android.detail.core.performance.conifg.DetailOptStorage");
    }

    public static ein a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ein) ipChange.ipc$dispatch("f042614", new Object[0]);
        }
        if (f27326a == null) {
            synchronized (ein.class) {
                if (f27326a == null) {
                    f27326a = new ein();
                }
            }
        }
        return f27326a;
    }

    public void a(final List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            Coordinator.execute(new Coordinator.TaggedRunnable("asyncLoad ") { // from class: tb.ein.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ein.this.b(list);
                    }
                }
            });
        }
    }

    public void b(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (!this.d.get()) {
            this.d.set(true);
            for (String str : list) {
                JSONObject a2 = this.b.a(str);
                if (a2 == null) {
                    String a3 = l.a("DetailOptStorage");
                    i.a(a3, "加载本地缓存到内存为空，读取到key:" + str);
                } else {
                    this.c.a(str, DetailOptNode.parser(a2));
                    String a4 = l.a("DetailOptStorage");
                    i.c(a4, "加载本地缓存到内存，读取到key:" + str);
                }
            }
        }
    }

    public void a(final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else {
            Coordinator.execute(new Coordinator.TaggedRunnable("asyncSave ") { // from class: tb.ein.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ein.a(ein.this).a(str, DetailOptNode.parser(jSONObject));
                    ein.b(ein.this).a(str, jSONObject);
                }
            });
        }
    }

    public void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            Coordinator.execute(new Coordinator.TaggedRunnable("asyncSave ") { // from class: tb.ein.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ein.a(ein.this).b(str);
                        ein.b(ein.this).b(str);
                    } catch (Exception unused) {
                        i.a("DetailOptStorage", "删除实验配置文件失败");
                    }
                }
            });
        }
    }

    public DetailOptNode c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailOptNode) ipChange.ipc$dispatch("fdbb96ba", new Object[]{this, str});
        }
        DetailOptNode a2 = this.c.a(str);
        if (a2 == null) {
            String a3 = l.a("DetailOptStorage");
            i.a(a3, "读取时key: " + str + "对应结果为空");
            return null;
        }
        String a4 = l.a("DetailOptStorage");
        i.c(a4, "读取时key: " + str + ", 对应结果: " + a2);
        return a2;
    }

    public String d(String str) {
        DetailOptNode c;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str}) : (!StringUtils.isEmpty(str) && (c = a().c(str)) != null) ? c.bucketId : "";
    }
}
