package tb;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.tasks.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.protocol.c;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bhc;

/* loaded from: classes.dex */
public class ovo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f32458a = new AtomicBoolean(false);
    private final c b;
    private final a c;

    /* loaded from: classes.dex */
    public interface a {
        void a(IHomeSubTabController iHomeSubTabController);

        void a(String str);
    }

    static {
        kge.a(2113261332);
    }

    public static /* synthetic */ bhc.b a(ovo ovoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bhc.b) ipChange.ipc$dispatch("d119145b", new Object[]{ovoVar}) : ovoVar.b();
    }

    public static /* synthetic */ c b(ovo ovoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("52f0438", new Object[]{ovoVar}) : ovoVar.b;
    }

    public static /* synthetic */ d c(ovo ovoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("f1681eea", new Object[]{ovoVar}) : ovoVar.a();
    }

    public static /* synthetic */ AtomicBoolean d(ovo ovoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("18b68f73", new Object[]{ovoVar}) : ovoVar.f32458a;
    }

    public static /* synthetic */ a e(ovo ovoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("229bc4d", new Object[]{ovoVar}) : ovoVar.c;
    }

    public ovo(c cVar, a aVar) {
        this.b = cVar;
        this.c = aVar;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        ksp.c("SubscribeBundleLoader", "checkLoad isDownLoad：" + this.f32458a.get());
        if (this.f32458a.get()) {
            return;
        }
        ksp.c("SubscribeBundleLoader", "checkLoad 开始下载订阅bundle：set isDownLoad true");
        this.f32458a.set(true);
        b(context);
    }

    private void b(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.ovo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ksp.c("SubscribeBundleLoader", "executeLoad start");
                    h.a(context).a(j.a().a(bhf.a(context, IHomeSubTabController.class).a(c.class).a(ovo.b(ovo.this)).a(ovo.a(ovo.this)).a()).a()).a(ovo.c(ovo.this));
                }
            });
        }
    }

    private d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("73895d34", new Object[]{this}) : new d() { // from class: tb.ovo.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.tasks.d
            public void onFailure(Exception exc) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    return;
                }
                ovo.d(ovo.this).set(false);
                ovo.e(ovo.this).a(exc.getMessage());
                ksp.c("SubscribeBundleLoader", "订阅bundle 开始安装失败 set isDownLoad false");
            }
        };
    }

    private bhc.b<Object> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bhc.b) ipChange.ipc$dispatch("3b3ecf02", new Object[]{this}) : new bhc.b<Object>() { // from class: tb.ovo.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bhc.b
            public void a(Object obj, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1dee0410", new Object[]{this, obj, bundle});
                    return;
                }
                ksp.c("SubscribeBundleLoader", "onInstantiate set isDownLoad false" + obj);
                if (!(obj instanceof IHomeSubTabController)) {
                    ksp.c("SubscribeBundleLoader", "!(o instanceof IHomeSubTabController)");
                    a e = ovo.e(ovo.this);
                    e.a("加载返回的对象类型不匹配, Object : " + obj);
                    return;
                }
                ovo.d(ovo.this).set(true);
                ovo.e(ovo.this).a((IHomeSubTabController) obj);
            }

            @Override // tb.bhc.b
            public void a(String str, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                    return;
                }
                ovo.d(ovo.this).set(false);
                ovo.e(ovo.this).a(str);
                ksp.c("SubscribeBundleLoader", "订阅bundle 加载失败 set isDownLoad false");
            }
        };
    }
}
