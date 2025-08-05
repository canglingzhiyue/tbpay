package com.taobao.themis.container.splash;

import android.view.ViewGroup;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.e;
import com.taobao.themis.kernel.f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0017J\b\u0010\r\u001a\u00020\bH\u0016J(\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012H\u0017J\b\u0010\u0014\u001a\u00020\fH\u0017J\b\u0010\u0015\u001a\u00020\fH\u0017J\b\u0010\u0016\u001a\u00020\fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/taobao/themis/container/splash/DefaultSplashView;", "Lcom/taobao/themis/kernel/container/ui/splash/ISplashView;", "mInstance", "Lcom/taobao/themis/kernel/TMSInstance;", "mSplashView", "Landroid/view/ViewGroup;", "(Lcom/taobao/themis/kernel/TMSInstance;Landroid/view/ViewGroup;)V", "mStatus", "Lcom/taobao/themis/kernel/container/ui/splash/ISplashView$Status;", "backPressed", "", "exit", "", "getStatus", "onLaunchError", "error", "Lcom/taobao/themis/kernel/TMSError;", "extras", "", "", "showLaunch", "showLoading", "updateLoadingInfo", "Companion", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a implements ISplashView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0933a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f22388a;
    private ISplashView.Status b;
    private final f c;

    static {
        kge.a(2093071465);
        kge.a(1829967934);
        Companion = new C0933a(null);
    }

    @Override // com.taobao.themis.kernel.container.ui.splash.ISplashView
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.splash.ISplashView
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public a(f mInstance, ViewGroup mSplashView) {
        q.d(mInstance, "mInstance");
        q.d(mSplashView, "mSplashView");
        this.c = mInstance;
        this.f22388a = mSplashView;
        this.b = ISplashView.Status.LAUNCH;
    }

    public static final /* synthetic */ void a(a aVar, ISplashView.Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86aeb82f", new Object[]{aVar, status});
        } else {
            aVar.b = status;
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.splash.ISplashView
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.taobao.themis.kernel.utils.a.a(new DefaultSplashView$exit$1(this));
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.splash.ISplashView
    public void a(e error, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2baaff7", new Object[]{this, error, map});
            return;
        }
        q.d(error, "error");
        com.taobao.themis.kernel.utils.a.a(new DefaultSplashView$onLaunchError$1(this, error));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/container/splash/DefaultSplashView$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.container.splash.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0933a {
        static {
            kge.a(-1037830031);
        }

        private C0933a() {
        }

        public /* synthetic */ C0933a(o oVar) {
            this();
        }
    }
}
