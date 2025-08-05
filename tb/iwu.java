package tb;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.tasks.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shake.remote.IShakeRemoteApi;
import com.taobao.android.task.Coordinator;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bhc;

/* loaded from: classes6.dex */
public class iwu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f29386a = new AtomicBoolean(false);
    private final a b;

    /* loaded from: classes6.dex */
    public interface a {
        void a(IShakeRemoteApi iShakeRemoteApi);

        void a(String str);
    }

    static {
        kge.a(-185359033);
    }

    public static /* synthetic */ bhc.b a(iwu iwuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bhc.b) ipChange.ipc$dispatch("2ee4877a", new Object[]{iwuVar}) : iwuVar.b();
    }

    public static /* synthetic */ d b(iwu iwuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("463ff76a", new Object[]{iwuVar}) : iwuVar.a();
    }

    public static /* synthetic */ AtomicBoolean c(iwu iwuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("62e9e6f3", new Object[]{iwuVar}) : iwuVar.f29386a;
    }

    public static /* synthetic */ a d(iwu iwuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("cf4332ce", new Object[]{iwuVar}) : iwuVar.b;
    }

    public iwu(a aVar) {
        this.b = aVar;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.f29386a.get()) {
        } else {
            ixb.a("ShakeSdkLoader", "checkLoad 开始下载摇一摇bundle");
            this.f29386a.set(true);
            b(context);
        }
    }

    private void b(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.iwu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ixb.a("ShakeSdkLoader", "executeLoad start");
                    h.a(context).a(j.a().a(bhf.a(context, IShakeRemoteApi.class).a(iwu.a(iwu.this)).a()).a()).a(iwu.b(iwu.this));
                }
            });
        }
    }

    private d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("73895d34", new Object[]{this}) : new d() { // from class: tb.iwu.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.tasks.d
            public void onFailure(Exception exc) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    return;
                }
                iwu.c(iwu.this).set(false);
                iwu.d(iwu.this).a(exc.getMessage());
                ixb.a("ShakeSdkLoader", "摇一摇bundle开始安装失败");
            }
        };
    }

    private bhc.b<Object> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bhc.b) ipChange.ipc$dispatch("3b3ecf02", new Object[]{this}) : new bhc.b<Object>() { // from class: tb.iwu.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bhc.b
            public void a(Object obj, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1dee0410", new Object[]{this, obj, bundle});
                    return;
                }
                ixb.a("ShakeSdkLoader", "onInstantiate ：" + obj);
                if (!(obj instanceof IShakeRemoteApi)) {
                    ixb.a("ShakeSdkLoader", "!(o instanceof IHomeSubTabController)");
                    a d = iwu.d(iwu.this);
                    d.a("加载返回的对象类型不匹配, Object : " + obj);
                    return;
                }
                ixb.a("ShakeSdkLoader", "摇一摇bundle加载成功");
                iwu.c(iwu.this).set(true);
                iwu.d(iwu.this).a((IShakeRemoteApi) obj);
            }

            @Override // tb.bhc.b
            public void a(String str, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                    return;
                }
                iwu.c(iwu.this).set(false);
                iwu.d(iwu.this).a(str);
                ixb.a("ShakeSdkLoader", "摇一摇bundle加载失败");
            }
        };
    }
}
