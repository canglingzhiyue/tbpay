package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.tao.TBMainHost;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public class gmu implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f28385a;
    private WeakReference<TaoLiveVideoView> b;

    static {
        kge.a(-1100886520);
        kge.a(-1894394539);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    public gmu(Context context, TaoLiveVideoView taoLiveVideoView) {
        this.f28385a = new WeakReference<>(context);
        this.b = new WeakReference<>(taoLiveVideoView);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        Context context = this.f28385a.get();
        TaoLiveVideoView taoLiveVideoView = this.b.get();
        if (context == null) {
            return;
        }
        if (a(context, activity, taoLiveVideoView)) {
            e.b("HVideoViewActivityLifecycleCallbacks", "videoView.release()");
            taoLiveVideoView.release();
        }
        a(context);
    }

    private boolean a(Context context, Activity activity, TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a4fa128", new Object[]{this, context, activity, taoLiveVideoView})).booleanValue();
        }
        if (taoLiveVideoView == null) {
            return false;
        }
        return context == activity || (TextUtils.equals(TBMainHost.a().getSimpleName(), activity.getLocalClassName()) && context == context.getApplicationContext());
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            e.b("HVideoViewActivityLifecycleCallbacks", "unregisterMyself");
            ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        } catch (Throwable th) {
            e.e("HVideoViewActivityLifecycleCallbacks", "unregisterMyself is error" + th);
        }
    }
}
