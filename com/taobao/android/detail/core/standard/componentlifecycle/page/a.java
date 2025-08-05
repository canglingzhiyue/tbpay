package com.taobao.android.detail.core.standard.componentlifecycle.page;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.arc;
import tb.ard;
import tb.arn;
import tb.asw;
import tb.atn;
import tb.atq;
import tb.bau;
import tb.baw;
import tb.ejh;
import tb.ejo;
import tb.ema;
import tb.emj;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.lifecycle.component.page")
/* loaded from: classes4.dex */
public final class a extends arn implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<Activity, Application.ActivityLifecycleCallbacks> b;

    /* renamed from: a  reason: collision with root package name */
    private final String f9835a = "AliSDetailPageLifecycleExtension";

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != -1372880223) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.afterServiceExecute((c) objArr[0], (com.alibaba.android.aura.datamodel.a) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    static {
        kge.a(207916533);
        kge.a(-1894394539);
        b = new ConcurrentHashMap();
    }

    public a() {
        emu.a("com.taobao.android.detail.core.standard.componentlifecycle.page.AliSDetailPageLifecycleExtension");
    }

    private RecyclerView e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("1db4cd8", new Object[]{this});
        }
        AURAGlobalData c = c();
        if (c != null) {
            return (RecyclerView) c.get("render_view", RecyclerView.class);
        }
        return null;
    }

    @Override // tb.arn, tb.arp
    public void afterServiceExecute(c cVar, com.alibaba.android.aura.datamodel.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2b82a1", new Object[]{this, cVar, aVar, new Boolean(z)});
            return;
        }
        super.afterServiceExecute(cVar, aVar, z);
        if (!asw.RENDER_SERVICE_CODE.equalsIgnoreCase(aVar.c())) {
            return;
        }
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        a(activity, 2);
        ejh.e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        a(activity, 5);
        ejh.h(activity);
    }

    private void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb0489", new Object[]{this, activity, new Integer(i)});
        } else if (activity == null) {
            arc.a().c("AliSDetailPageLifecycleExtension", "callComponentLifecycle", "activity is null");
        } else if (a().e() != activity) {
            ard a2 = arc.a();
            a2.a("AliSDetailPageLifecycleExtension", "callComponentLifecycle", "skip activity:" + activity);
        } else {
            RecyclerView e = e();
            if (e == null) {
                arc.a().c("AliSDetailPageLifecycleExtension", "callComponentLifecycle", "recyclerView is null");
            } else if (e.getChildCount() == 0) {
                arc.a().c("AliSDetailPageLifecycleExtension", "callComponentLifecycle", "child count of RecyclerView is 0");
            } else {
                RecyclerView.Adapter adapter = e.getAdapter();
                if (!(adapter instanceof atq)) {
                    arc.a().c("AliSDetailPageLifecycleExtension", "onActivityStarted", "RecyclerView's adapter is not IAURARenderContainerAdapter");
                    if (baw.a()) {
                        throw new IllegalStateException("RecyclerView's adapter is not IAURARenderContainerAdapter");
                    }
                    return;
                }
                int a3 = emj.a(e, false);
                if (a3 < 0) {
                    arc.a().c("AliSDetailPageLifecycleExtension", "callComponentLifecycle", "firstVisibleItemIndex is less than 0");
                    return;
                }
                int min = Math.min(emj.b(e, false) + 1, adapter.getItemCount());
                List<ejo> b2 = b().b(ejo.class);
                if (bau.a(b2)) {
                    arc.a().c("AliSDetailPageLifecycleExtension", "callComponentLifecycle", "IAliSDetailPageLifecycleExtension is empty");
                    return;
                }
                try {
                    int[] iArr = new int[2];
                    while (a3 < min) {
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition = e.findViewHolderForAdapterPosition(a3);
                        if (!(findViewHolderForAdapterPosition instanceof atn.a)) {
                            ard a4 = arc.a();
                            a4.c("AliSDetailPageLifecycleExtension", "callComponentLifecycle", a3 + " of RecycleView's viewHolder is not AURAContainerViewHolder");
                        } else {
                            View view = findViewHolderForAdapterPosition.itemView;
                            if (view != null && !a(e, iArr, view)) {
                                for (ejo ejoVar : b2) {
                                    if (2 != i) {
                                        if (3 == i) {
                                            ejoVar.a(e, (atn.a) findViewHolderForAdapterPosition);
                                        } else if (4 == i) {
                                            ejoVar.b(e, (atn.a) findViewHolderForAdapterPosition);
                                        } else if (5 == i) {
                                            ejoVar.c(e, (atn.a) findViewHolderForAdapterPosition);
                                        }
                                    }
                                }
                            }
                        }
                        a3++;
                    }
                } catch (Exception e2) {
                    ema.a("pageLifecycle#error", e2.getMessage(), d());
                    baw.a(e2);
                }
            }
        }
    }

    private boolean a(RecyclerView recyclerView, int[] iArr, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("721d9732", new Object[]{this, recyclerView, iArr, view})).booleanValue();
        }
        view.getLocationOnScreen(iArr);
        int height = view.getHeight();
        int i = iArr[1];
        return (i < (-height)) || (i > recyclerView.getHeight());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        a(activity, 3);
        ejh.f(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        a(activity, 4);
        ejh.g(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else {
            g();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Context e = a().e();
        if (!(e instanceof Activity)) {
            return;
        }
        g();
        Activity activity = (Activity) e;
        activity.getApplication().registerActivityLifecycleCallbacks(this);
        b.put(activity, this);
    }

    private void g() {
        Application.ActivityLifecycleCallbacks remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        Context e = a().e();
        if (!(e instanceof Activity) || (remove = b.remove(e)) == null) {
            return;
        }
        ((Activity) e).getApplication().unregisterActivityLifecycleCallbacks(remove);
    }

    @Override // tb.arn, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        g();
    }
}
