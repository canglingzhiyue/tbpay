package tb;

import android.os.Bundle;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.tasks.d;
import com.alibaba.android.split.k;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.android.information.ai.api.IInformationFlowAiApi;
import com.taobao.android.task.Coordinator;
import com.taobao.appbundle.c;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bhc;

/* loaded from: classes5.dex */
public class xjk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f34331a = new AtomicBoolean(false);
    private final a b;

    /* loaded from: classes5.dex */
    public interface a {
        void a(IInformationFlowAiApi iInformationFlowAiApi);

        void a(String str);
    }

    static {
        kge.a(1300023742);
    }

    public static /* synthetic */ bhc.b a(xjk xjkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bhc.b) ipChange.ipc$dispatch("a95e432c", new Object[]{xjkVar}) : xjkVar.c();
    }

    public static /* synthetic */ d b(xjk xjkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("7b1baf9c", new Object[]{xjkVar}) : xjkVar.b();
    }

    public static /* synthetic */ AtomicBoolean c(xjk xjkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("8fe9e981", new Object[]{xjkVar}) : xjkVar.f34331a;
    }

    public static /* synthetic */ a d(xjk xjkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6299e28e", new Object[]{xjkVar}) : xjkVar.b;
    }

    public xjk(a aVar) {
        this.b = aVar;
    }

    public void a() {
        if (!k.b()) {
            ldf.d("AfterBuyAiDownloader", "remote module has not init");
        } else if (this.f34331a.get()) {
            ldf.d("AfterBuyAiDownloader", "ready download");
        } else {
            this.f34331a.set(true);
            if (b.a().c("information_flow_ai") == null) {
                if (this.b == null) {
                    return;
                }
                Object obj = null;
                try {
                    obj = Class.forName("com.taobao.informationflowai.InfoFlowAiProvider").newInstance();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (InstantiationException e3) {
                    e3.printStackTrace();
                }
                this.b.a((IInformationFlowAiApi) obj);
                return;
            }
            Coordinator.execute(new Runnable() { // from class: tb.xjk.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ldf.d("AfterBuyAiDownloader", "executeLoad start");
                    c.Companion.a().c().a(j.a().a(bhf.a(c.Companion.a().a(), IInformationFlowAiApi.class).a(xjk.a(xjk.this)).a()).a()).a(xjk.b(xjk.this));
                }
            });
        }
    }

    private d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("3675c693", new Object[]{this}) : new d() { // from class: tb.xjk.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.tasks.d
            public void onFailure(Exception exc) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    return;
                }
                xjk.c(xjk.this).set(false);
                xjk.d(xjk.this).a(exc.getMessage());
                ldf.d("AfterBuyAiDownloader", "bundle开始安装失败");
            }
        };
    }

    private bhc.b<Object> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bhc.b) ipChange.ipc$dispatch("1d1c98a1", new Object[]{this}) : new bhc.b<Object>() { // from class: tb.xjk.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bhc.b
            public void a(Object obj, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1dee0410", new Object[]{this, obj, bundle});
                    return;
                }
                ldf.d("AfterBuyAiDownloader", "onInstantiate ：" + obj);
                if (!(obj instanceof IInformationFlowAiApi)) {
                    ldf.d("AfterBuyAiDownloader", "!(o instanceof IAfterBuyAiApi)");
                    a d = xjk.d(xjk.this);
                    d.a("加载返回的对象类型不匹配, Object : " + obj);
                    return;
                }
                ldf.d("AfterBuyAiDownloader", "bundle加载成功");
                xjk.d(xjk.this).a((IInformationFlowAiApi) obj);
            }

            @Override // tb.bhc.b
            public void a(String str, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                    return;
                }
                xjk.c(xjk.this).set(false);
                xjk.d(xjk.this).a(str);
                ldf.d("AfterBuyAiDownloader", "bundle加载失败");
            }
        };
    }
}
