package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.fluid.launcher.task.a;
import com.taobao.taolive.sdk.utils.q;

/* loaded from: classes5.dex */
public class mrz extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final Context f31219a;
    private final Handler b;
    private final Handler c;
    private final BaseFrame d;
    private final BaseFrame e;
    private ViewStub f;
    private ViewGroup g;

    static {
        kge.a(1891363940);
    }

    public static /* synthetic */ Object ipc$super(mrz mrzVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: lambda$_IEt7uLTy-Ui77geGHLuU9i6PZE */
    public static /* synthetic */ void m2470lambda$_IEt7uLTyUi77geGHLuU9i6PZE(mrz mrzVar) {
        mrzVar.k();
    }

    public static /* synthetic */ void lambda$imKgp5dHYjAXasWIEIeTH8XHoAY(mrz mrzVar, View view) {
        mrzVar.a(view);
    }

    public mrz(Context context, BaseFrame baseFrame, BaseFrame baseFrame2, View view, Handler handler) {
        this.f31219a = context;
        if (view instanceof ViewStub) {
            this.f = (ViewStub) view;
        } else if (view instanceof ViewGroup) {
            this.g = (ViewGroup) view;
        }
        this.e = baseFrame2;
        this.d = baseFrame;
        this.b = handler;
        this.c = new Handler(Looper.getMainLooper());
    }

    @Override // com.taobao.android.fluid.launcher.task.b
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.d.getComponentName();
    }

    @Override // com.taobao.android.fluid.launcher.task.b
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.d.viewCreated) {
            ViewStub viewStub = this.f;
            if (viewStub != null && viewStub.getParent() != null) {
                h();
            } else {
                i();
            }
        } else {
            Runnable runnable = new Runnable() { // from class: tb.-$$Lambda$mrz$_IEt7uLTy-Ui77geGHLuU9i6PZE
                @Override // java.lang.Runnable
                public final void run() {
                    mrz.m2470lambda$_IEt7uLTyUi77geGHLuU9i6PZE(mrz.this);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                ADaemon.postMainLooper(runnable, new long[0]);
            }
        }
    }

    public /* synthetic */ void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        if (this.d.getContainerView() != null) {
            this.d.getContainerView().setVisibility(0);
        }
        j();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.d.lazyInflate()) {
            this.d.keepViewStubWithoutInflate(this.f);
            j();
        } else if (this.d.asyncRenderComponent()) {
            q.b("FrameInstallTask", this.d + ", async inflate view by ViewStub");
            final View inflateViewNoAdd = this.d.inflateViewNoAdd(this.f);
            ADaemon.postMainLooper(new Runnable() { // from class: tb.-$$Lambda$mrz$imKgp5dHYjAXasWIEIeTH8XHoAY
                @Override // java.lang.Runnable
                public final void run() {
                    mrz.lambda$imKgp5dHYjAXasWIEIeTH8XHoAY(mrz.this, inflateViewNoAdd);
                }
            }, new long[0]);
        } else {
            q.b("FrameInstallTask", this.d + ", inflate view by ViewStub");
            this.d.onCreateView(this.f);
            j();
        }
    }

    public /* synthetic */ void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        if (this.f.getParent() != null) {
            this.d.replaceSelfWithView(view, (ViewGroup) this.f.getParent(), this.f);
            BaseFrame baseFrame = this.d;
            baseFrame.mContainer = view;
            baseFrame.onViewCreated(baseFrame.mContainer);
        } else {
            q.b("FrameInstallTask", this.d + " inflate already!");
        }
        j();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        q.b("FrameInstallTask", this.d + ", inflate view by ViewGroup");
        this.d.onCreateView2(this.g);
        j();
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        q.b("FrameInstallTask", this.d + ", invoke frame onBindDat/onDidAppear");
        if (this.e.mLiveDataModel != null && this.e.mLiveDataModel != this.d.mLiveDataModel) {
            this.d.onBindData(this.e.mLiveDataModel);
        }
        if (this.e.mViewStatus != 2 || this.d.getViewStatus() == 2) {
            return;
        }
        this.d.onDidAppear();
    }
}
