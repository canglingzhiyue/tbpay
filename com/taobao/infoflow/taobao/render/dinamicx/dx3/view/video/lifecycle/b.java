package com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.ldf;

/* loaded from: classes7.dex */
public class b implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f17419a;
    private WeakReference<TaoLiveVideoView> b;

    static {
        kge.a(1724266915);
        kge.a(-1894394539);
    }

    private boolean a(Context context, Activity activity, TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a4fa128", new Object[]{this, context, activity, taoLiveVideoView})).booleanValue() : taoLiveVideoView != null && context == activity;
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

    public b(Context context, TaoLiveVideoView taoLiveVideoView) {
        this.f17419a = new WeakReference<>(context);
        this.b = new WeakReference<>(taoLiveVideoView);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        Context context = this.f17419a.get();
        TaoLiveVideoView taoLiveVideoView = this.b.get();
        if (context == null) {
            return;
        }
        if (a(context, activity, taoLiveVideoView)) {
            ldf.a("HVideoViewActivityLifecycleCallbacks", "videoView.release()");
            taoLiveVideoView.release();
        }
        a(context);
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            ldf.a("HVideoViewActivityLifecycleCallbacks", "unregisterMyself");
            ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        } catch (Throwable th) {
            ldf.d("HVideoViewActivityLifecycleCallbacks", "unregisterMyself is error" + th);
        }
    }
}
