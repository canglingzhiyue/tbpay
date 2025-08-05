package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.j;
import com.taobao.android.launcher.common.e;
import com.taobao.android.launcher.common.g;

/* loaded from: classes5.dex */
public class tpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f34254a;
    private final e b;

    private tpl(Context context, gtk gtkVar) {
        this.f34254a = context;
        this.b = gtkVar.g();
    }

    public static tpl a(Context context, gtk gtkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tpl) ipChange.ipc$dispatch("dd8d4de4", new Object[]{context, gtkVar}) : new tpl(context, gtkVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e eVar = this.b;
        if (!(eVar instanceof g)) {
            return;
        }
        g<String> gVar = (g) eVar;
        if (c(gVar) || b(gVar)) {
            return;
        }
        a(gVar);
    }

    private boolean a(g<String> gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e0aef1c", new Object[]{this, gVar})).booleanValue();
        }
        gVar.b("minKernel", new g.a<String>() { // from class: tb.tpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.launcher.common.g.a
            public void a(j<String> jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("707ae49a", new Object[]{this, jVar});
                    return;
                }
                jVar.a("InitDXMin", "InitHomeCache");
                jVar.a("InitDeviceScore", "InitHomeCache");
                jVar.a("InitHomeGatewayLauncher", "InitHomeCache");
                jVar.a("InitPhenixMin", "InitHomeCache");
                jVar.c("InitRevisionSwitch");
                jVar.c("InitProtoDBMin");
                jVar.c("InitHomePreParamsLauncher");
                jVar.c("InitHomePreCreateNativeView");
            }
        });
        return true;
    }

    private boolean b(g<String> gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34c5ddd", new Object[]{this, gVar})).booleanValue();
        }
        if (!guc.a(this.f34254a, "minKernelDXMerged")) {
            return false;
        }
        gVar.b("minKernelDXMerged", new g.a<String>() { // from class: tb.tpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.launcher.common.g.a
            public void a(j<String> jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("707ae49a", new Object[]{this, jVar});
                    return;
                }
                jVar.a("InitDXMin", "InitHomeCache");
                jVar.a("InitDeviceScore", "InitHomeCache");
                jVar.a("InitHomeMin", "InitHomeCache");
                jVar.a("InitPhenixMin", "InitHomeCache");
            }
        });
        return true;
    }

    private boolean c(g<String> gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e88dcc9e", new Object[]{this, gVar})).booleanValue();
        }
        if (!guc.a(this.f34254a, "Home_Page_SecondRefreshOpt")) {
            return false;
        }
        gVar.b("homePageSecondRefreshOpt", new g.a<String>() { // from class: tb.tpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.launcher.common.g.a
            public void a(j<String> jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("707ae49a", new Object[]{this, jVar});
                    return;
                }
                jVar.a("InitDXMin", "InitHomeCache");
                jVar.a("InitDeviceScore", "InitHomeCache");
                jVar.a("InitHomeMinOpt", "InitHomeCache");
                jVar.a("InitPhenixMin", "InitHomeCache");
                jVar.a("InitHomeMinOpt", "InitHomePreRequestLauncher");
            }
        });
        return true;
    }
}
