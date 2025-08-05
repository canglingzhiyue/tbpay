package tb;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.n;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.protocol.c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.ovo;
import tb.ovq;

/* loaded from: classes.dex */
public class ovn extends com.taobao.tao.topmultitab.protocol.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HOME_TAB_ID_SUBSCRIBE = "subscribe";

    /* renamed from: a  reason: collision with root package name */
    private final ovq f32455a;
    private final ovo b;
    private WeakReference<Context> c;
    private final Map<String, String> d;
    private final c e;
    private Intent f;
    private String g;
    private final a i;
    private View j;

    /* loaded from: classes8.dex */
    public interface a {
        void a(IHomeSubTabController iHomeSubTabController);
    }

    static {
        kge.a(1709033706);
    }

    public static /* synthetic */ Object ipc$super(ovn ovnVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("111ff600", new Object[]{this}) : "Page_DingYueIndexAll";
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageUtParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a4393099", new Object[]{this}) : "";
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnablePullReFresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20c9b34", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onColdStartResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e9b853", new Object[]{this});
        }
    }

    public static /* synthetic */ void a(ovn ovnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b0b211", new Object[]{ovnVar});
        } else {
            ovnVar.a();
        }
    }

    public static /* synthetic */ void b(ovn ovnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e733b892", new Object[]{ovnVar});
        } else {
            ovnVar.e();
        }
    }

    public static /* synthetic */ void b(ovn ovnVar, IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89a5b80f", new Object[]{ovnVar, iHomeSubTabController});
        } else {
            ovnVar.b(iHomeSubTabController);
        }
    }

    public static /* synthetic */ a c(ovn ovnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("69acc2f", new Object[]{ovnVar}) : ovnVar.i;
    }

    public static /* synthetic */ void d(ovn ovnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c439c594", new Object[]{ovnVar});
        } else {
            ovnVar.b();
        }
    }

    public ovn(c cVar, a aVar) {
        super(cVar);
        this.d = new HashMap(3);
        this.e = cVar;
        this.i = aVar;
        this.f32455a = new ovq(c());
        this.b = new ovo(cVar, d());
        this.d.put("spm-cnt", "a21acg.b41183928");
        this.d.put("isLowDevice", String.valueOf(n.c()));
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.c = new WeakReference<>(context);
        this.b.a(context);
    }

    @Override // com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        ksp.c("SubscribeDefaultSubTabController", "创建预置订阅视图 触发下载");
        this.c = new WeakReference<>(context);
        a();
        this.j = this.f32455a.a(context);
        return this.j;
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        ovp.d();
        if (!this.f32455a.a()) {
            return;
        }
        ovp.a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
        } else if (!this.f32455a.a()) {
        } else {
            ovp.c();
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
            return;
        }
        ksp.c("SubscribeDefaultSubTabController", "onPullRefresh 触发下载");
        a();
        ovp.b();
        this.e.b(this);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdatePageProperties() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("30e122fd", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void notifyOutLinkParams(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac20293", new Object[]{this, intent, str});
            return;
        }
        this.f = intent;
        this.g = str;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        WeakReference<Context> weakReference = this.c;
        if (weakReference == null) {
            ksp.c("SubscribeDefaultSubTabController", "context 未赋值，checkLoadSubscribeBundle 未执行");
            return;
        }
        Context context = weakReference.get();
        if (context == null) {
            ksp.c("SubscribeDefaultSubTabController", "context 被回收，checkLoadSubscribeBundle 未执行");
        } else {
            a(context);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f32455a.a(false);
        }
    }

    private ovq.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ovq.a) ipChange.ipc$dispatch("34173ed5", new Object[]{this}) : new ovq.a() { // from class: tb.ovn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ovq.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                ksp.c("SubscribeDefaultSubTabController", "重试校验下载订阅bundle 触发下载");
                ovn.a(ovn.this);
                ovp.b();
            }
        };
    }

    private ovo.a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ovo.a) ipChange.ipc$dispatch("15f41fb6", new Object[]{this}) : new ovo.a() { // from class: tb.ovn.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ovo.a
            public void a(IHomeSubTabController iHomeSubTabController) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d6cd2679", new Object[]{this, iHomeSubTabController});
                    return;
                }
                ovn.b(ovn.this);
                ksp.c("SubscribeDefaultSubTabController", "远程化成功 LoadListener onSuccess");
                ovn.c(ovn.this).a(iHomeSubTabController);
                ovn.b(ovn.this, iHomeSubTabController);
            }

            @Override // tb.ovo.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                ksp.c("SubscribeDefaultSubTabController", "LoadListener onFailure: " + str);
                ovn.c(ovn.this);
                ovn.d(ovn.this);
                ovp.a(str);
            }
        };
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ksp.c("SubscribeDefaultSubTabController", "removeDefaultView mDefaultSubscribeView: ");
        View view = this.j;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return;
        }
        ksp.c("SubscribeDefaultSubTabController", "removeDefaultView mDefaultSubscribeView success: ");
        ((ViewGroup) parent).removeView(this.j);
    }

    private void b(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552e2a58", new Object[]{this, iHomeSubTabController});
            return;
        }
        if (this.f != null || this.g != null) {
            iHomeSubTabController.notifyOutLinkParams(this.f, this.g);
        }
        this.f = null;
        this.g = null;
    }
}
