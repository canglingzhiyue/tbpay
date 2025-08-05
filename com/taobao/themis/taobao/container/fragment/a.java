package com.taobao.themis.taobao.container.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.entity.InstanceStartParams;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.d;
import com.uc.webview.export.media.MessageID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpu;
import tb.qqb;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001c\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\"H\u0016J\u001a\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\"H\u0016J\u0010\u0010-\u001a\u00020\"2\b\u0010.\u001a\u0004\u0018\u00010/J\u001a\u00100\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u00061"}, d2 = {"Lcom/taobao/themis/taobao/container/fragment/TMSFragmentContainerHelper;", "Lcom/taobao/themis/container/app/TMSAppContainerHelper;", "activity", "Landroid/support/v4/app/FragmentActivity;", "mFragment", "Lcom/taobao/themis/taobao/container/fragment/TMSTBHomeFragment;", "splashViewContainer", "Landroid/view/ViewGroup;", "(Landroid/support/v4/app/FragmentActivity;Lcom/taobao/themis/taobao/container/fragment/TMSTBHomeFragment;Landroid/view/ViewGroup;)V", "disableFragmentFinish", "", "isStateSaved", "mHasFinish", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mOrientation", "", "Ljava/lang/Integer;", "mPageStackStatusCallback", "Lcom/taobao/themis/kernel/page/ITMSPageManager$PageStackStatusCallback;", "getMPageStackStatusCallback", "()Lcom/taobao/themis/kernel/page/ITMSPageManager$PageStackStatusCallback;", "mSystemUIVisibility", "createPageManager", "Lcom/taobao/themis/kernel/page/ITMSPageManager;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "getContainerType", "Lcom/taobao/themis/kernel/TMSContainerType;", "init", "url", "", "extraData", "Lcom/alibaba/fastjson/JSONObject;", "launch", "", "solutionType", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "renderListener", "Lcom/taobao/themis/kernel/TMSInstance$IRenderListener;", MessageID.onDestroy, "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onResume", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "reload", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a extends com.taobao.themis.container.app.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Integer f22828a;
    private Integer b;
    private boolean c;
    private boolean d;
    private final AtomicBoolean e;
    private final TMSTBHomeFragment f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/themis/taobao/container/fragment/TMSFragmentContainerHelper$mPageStackStatusCallback$1", "Lcom/taobao/themis/kernel/page/ITMSPageManager$PageStackStatusCallback;", "onPageStackEmpty", "", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.taobao.container.fragment.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0974a implements qqb.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0974a() {
        }

        @Override // tb.qqb.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (a.a(a.this) || a.b(a.this) || !a.c(a.this).compareAndSet(false, true)) {
            } else {
                a.d(a.this).finish();
            }
        }
    }

    static {
        kge.a(1052517963);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 91915241:
                super.b();
                return null;
            case 95609325:
                super.f();
                return null;
            case 691170269:
                return super.a((String) objArr[0], (JSONObject) objArr[1]);
            case 1135491724:
                super.a((TMSSolutionType) objArr[0], (f.c) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static final /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("df58e4a2", new Object[]{aVar})).booleanValue() : aVar.c;
    }

    public static final /* synthetic */ boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d317f01", new Object[]{aVar})).booleanValue() : aVar.d;
    }

    public static final /* synthetic */ AtomicBoolean c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("a4161b9c", new Object[]{aVar}) : aVar.e;
    }

    public static final /* synthetic */ TMSTBHomeFragment d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSTBHomeFragment) ipChange.ipc$dispatch("a5a1d53b", new Object[]{aVar}) : aVar.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FragmentActivity activity, TMSTBHomeFragment mFragment, ViewGroup splashViewContainer) {
        super(activity, splashViewContainer);
        q.d(activity, "activity");
        q.d(mFragment, "mFragment");
        q.d(splashViewContainer, "splashViewContainer");
        this.f = mFragment;
        this.e = new AtomicBoolean(false);
    }

    @Override // com.taobao.themis.container.app.a
    public qqb.b h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qqb.b) ipChange.ipc$dispatch("a0889937", new Object[]{this}) : new C0974a();
    }

    @Override // com.taobao.themis.container.app.a, tb.qos, tb.trk
    public f a(String url, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("29326bdd", new Object[]{this, url, jSONObject});
        }
        q.d(url, "url");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put((JSONObject) InstanceStartParams.KEY_IS_FRAGMENT_CONTAINER, (String) true);
        return super.a(url, jSONObject);
    }

    @Override // com.taobao.themis.container.app.a, tb.trk
    public TMSContainerType j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSContainerType) ipChange.ipc$dispatch("d27e2c5", new Object[]{this}) : TMSContainerType.GENERIC;
    }

    @Override // com.taobao.themis.container.app.a, tb.qos, tb.trk
    public void a(TMSSolutionType tMSSolutionType, f.c cVar) {
        qpu k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43ae3a8c", new Object[]{this, tMSSolutionType, cVar});
            return;
        }
        d dVar = d.INSTANCE;
        Window window = d().getWindow();
        q.b(window, "mActivity.window");
        View decorView = window.getDecorView();
        q.b(decorView, "mActivity.window.decorView");
        this.f22828a = Integer.valueOf(decorView.getSystemUiVisibility());
        this.b = Integer.valueOf(d().getRequestedOrientation());
        super.a(tMSSolutionType, cVar);
        f e = e();
        if (e == null || (k = e.k()) == null) {
            return;
        }
        k.a("isTMSTBFragmentContainer");
    }

    @Override // tb.qos
    public qqb a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qqb) ipChange.ipc$dispatch("dd2781b7", new Object[]{this, instance});
        }
        q.d(instance, "instance");
        return new b(instance, this.f, h());
    }

    @Override // com.taobao.themis.container.app.a
    public boolean a(int i, KeyEvent keyEvent) {
        f e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14b42c5", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4 && (e = e()) != null) {
            return e.a(TMSBackPressedType.ON_KEY_DOWN);
        }
        return false;
    }

    @Override // com.taobao.themis.container.app.a, tb.qos
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Integer num = this.f22828a;
        if (num != null) {
            int intValue = num.intValue();
            Window window = d().getWindow();
            q.b(window, "mActivity.window");
            View decorView = window.getDecorView();
            q.b(decorView, "mActivity.window.decorView");
            decorView.setSystemUiVisibility(intValue);
        }
        Integer num2 = this.b;
        if (num2 != null) {
            d().setRequestedOrientation(num2.intValue());
        }
        super.b();
    }

    @Override // com.taobao.themis.container.app.a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        this.c = false;
    }

    public final void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
        } else {
            this.c = true;
        }
    }

    @Override // tb.qos
    public void c(String url, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a262bc", new Object[]{this, url, jSONObject});
            return;
        }
        q.d(url, "url");
        this.d = true;
        f e = e();
        if (e != null) {
            e.r();
        }
        this.d = false;
        a(url, jSONObject);
        a(s(), t());
    }
}
