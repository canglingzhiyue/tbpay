package com.alibaba.poplayer.trigger;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.android.umbrella.link.export.UMLLCons;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.trigger.Event;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.bzl;
import tb.kge;

/* loaded from: classes3.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-473990459);
    }

    /* renamed from: lambda$3Tn-x1y7SWOpWgUlhAZHmvRbiZs */
    public static /* synthetic */ void m243lambda$3Tnx1y7SWOpWgUlhAZHmvRbiZs(String str, List list) {
        b(str, list);
    }

    public static /* synthetic */ void lambda$aYWpW4TtwgB3LryVGhUgRHnI2NA(d dVar) {
        d(dVar);
    }

    public static /* synthetic */ void lambda$ew93Mwx5oipVVjN44rMfWNjY6Rc(String str, boolean z, String str2, d dVar) {
        a(str, z, str2, dVar);
    }

    /* renamed from: lambda$fH1d2jV-7nzL4vsXnPdzq88OBTI */
    public static /* synthetic */ void m244lambda$fH1d2jV7nzL4vsXnPdzq88OBTI(d dVar) {
        c(dVar);
    }

    public static /* synthetic */ void lambda$qrpfdQTq__Bzmgavr7bxGZSPCdY(String str, boolean z, String str2, d dVar) {
        b(str, z, str2, dVar);
    }

    private static void a(d dVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da01a375", new Object[]{dVar, intent});
        } else if (dVar == null || bzl.a().b() == null || !bzl.a().b().isNewNativeEventNotificationEnable()) {
        } else {
            Event y = dVar.y();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", (Object) y.uri);
            jSONObject.put("param", (Object) y.param);
            jSONObject.put("source", (Object) Event.a.b(y.source));
            intent.putExtra("triggerEvent", jSONObject.toJSONString());
            intent.putExtra("config", dVar.x().json);
            intent.putExtra("indexId", dVar.x().indexID);
            intent.putExtra("layerType", !TextUtils.isEmpty(dVar.x().layerType) ? dVar.x().layerType : "default");
            intent.putExtra("nativeUri", y.curPage);
            intent.putExtra("nativeUrl", y.curPageUrl);
        }
    }

    public static void a(final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27c3b8", new Object[]{dVar});
            return;
        }
        try {
            com.alibaba.poplayer.utils.f.a(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$e$aYWpW4TtwgB3LryVGhUgRHnI2NA
                @Override // java.lang.Runnable
                public final void run() {
                    e.lambda$aYWpW4TtwgB3LryVGhUgRHnI2NA(d.this);
                }
            });
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("NativeEventDispatcher.internalNotifyViewAddedIfPopLayerView.AsyncTask.fail.", th);
        }
    }

    public static /* synthetic */ void d(d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1f3e3b", new Object[]{dVar});
            return;
        }
        try {
            PopLayerBaseView popLayerBaseView = (PopLayerBaseView) dVar.g();
            if (popLayerBaseView == null) {
                return;
            }
            Intent intent = new Intent(PopLayer.ACTION_OUT_VIEW_ADDED);
            intent.putExtra("event", popLayerBaseView.getNativeNotifyInfo());
            if (popLayerBaseView.getVisibility() != 0) {
                z = false;
            }
            intent.putExtra("isVisible", z);
            if (popLayerBaseView.getPopRequest() != null && (popLayerBaseView.getPopRequest() instanceof d)) {
                intent.putExtra("config", ((d) popLayerBaseView.getPopRequest()).x().json);
            } else {
                intent.putExtra("config", "");
            }
            a(dVar, intent);
            LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
            com.alibaba.poplayer.utils.c.a("NativeEventDispatcher.NativeNotify.onViewAdded.", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("NativeEventDispatcher.internalNotifyViewAddedIfPopLayerView.fail.", th);
        }
    }

    public static void b(final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22cf9739", new Object[]{dVar});
            return;
        }
        try {
            com.alibaba.poplayer.utils.f.a(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$e$fH1d2jV-7nzL4vsXnPdzq88OBTI
                @Override // java.lang.Runnable
                public final void run() {
                    e.m244lambda$fH1d2jV7nzL4vsXnPdzq88OBTI(d.this);
                }
            });
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("NativeEventDispatcher.internalNotifyDisplayedIfPopLayerView.AsyncTask.fail.", th);
        }
    }

    public static /* synthetic */ void c(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36776aba", new Object[]{dVar});
            return;
        }
        try {
            PopLayerBaseView popLayerBaseView = (PopLayerBaseView) dVar.g();
            if (popLayerBaseView == null) {
                return;
            }
            Intent intent = new Intent(PopLayer.ACTION_OUT_DISPLAY);
            intent.putExtra("event", popLayerBaseView.getNativeNotifyInfo());
            if (popLayerBaseView.getPopRequest() != null && (popLayerBaseView.getPopRequest() instanceof d)) {
                intent.putExtra("config", ((d) popLayerBaseView.getPopRequest()).x().json);
            } else {
                intent.putExtra("config", "");
            }
            a(dVar, intent);
            LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
            com.alibaba.poplayer.utils.c.a("NativeEventDispatcher.NativeNotify.display.", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("NativeEventDispatcher.internalNotifyDisplayedIfPopLayerView.fail.", th);
        }
    }

    public static void a(final d dVar, PopLayerBaseView popLayerBaseView) {
        IpChange ipChange = $ipChange;
        final boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1adb94c", new Object[]{dVar, popLayerBaseView});
        } else if (popLayerBaseView == null) {
        } else {
            try {
                final String nativeNotifyInfo = popLayerBaseView.getNativeNotifyInfo();
                if (popLayerBaseView.getVisibility() != 0) {
                    z = false;
                }
                final String str = "";
                if (popLayerBaseView.getPopRequest() != null && (popLayerBaseView.getPopRequest() instanceof d)) {
                    str = ((d) popLayerBaseView.getPopRequest()).x().json;
                }
                com.alibaba.poplayer.utils.f.a(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$e$qrpfdQTq__Bzmgavr7bxGZSPCdY
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.lambda$qrpfdQTq__Bzmgavr7bxGZSPCdY(nativeNotifyInfo, z, str, dVar);
                    }
                });
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("NativeEventDispatcher.internalNotifyViewRemovedIfPopLayerView.fail.", th);
            }
        }
    }

    public static /* synthetic */ void b(String str, boolean z, String str2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf4a29b", new Object[]{str, new Boolean(z), str2, dVar});
            return;
        }
        try {
            Intent intent = new Intent(PopLayer.ACTION_OUT_VIEW_REMOVED);
            intent.putExtra("event", str);
            intent.putExtra("isVisible", z);
            intent.putExtra("config", str2);
            a(dVar, intent);
            LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
            com.alibaba.poplayer.utils.c.a("NativeEventDispatcher.NativeNotify.onViewRemoved.", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("NativeEventDispatcher.InThread.internalNotifyViewRemovedIfPopLayerView.fail.", th);
        }
    }

    public static void b(final d dVar, PopLayerBaseView popLayerBaseView) {
        IpChange ipChange = $ipChange;
        final boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16deceb", new Object[]{dVar, popLayerBaseView});
        } else if (popLayerBaseView == null) {
        } else {
            try {
                final String nativeNotifyInfo = popLayerBaseView.getNativeNotifyInfo();
                if (popLayerBaseView.getVisibility() != 0) {
                    z = false;
                }
                final String str = "";
                if (popLayerBaseView.getPopRequest() != null && (popLayerBaseView.getPopRequest() instanceof d)) {
                    str = ((d) popLayerBaseView.getPopRequest()).x().json;
                }
                com.alibaba.poplayer.utils.f.a(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$e$ew93Mwx5oipVVjN44rMfWNjY6Rc
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.lambda$ew93Mwx5oipVVjN44rMfWNjY6Rc(nativeNotifyInfo, z, str, dVar);
                    }
                });
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("NativeEventDispatcher.internalNotifyDismissedIfPopLayerView.fail.", th);
            }
        }
    }

    public static /* synthetic */ void a(String str, boolean z, String str2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d183a97c", new Object[]{str, new Boolean(z), str2, dVar});
            return;
        }
        try {
            Intent intent = new Intent(PopLayer.ACTION_OUT_DISMISS);
            intent.putExtra("event", str);
            intent.putExtra("isVisible", z);
            intent.putExtra("config", str2);
            a(dVar, intent);
            LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
            com.alibaba.poplayer.utils.c.a("NativeEventDispatcher.NativeNotify.dismiss.", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("NativeEventDispatcher.InThread.internalNotifyDismissedIfPopLayerView.fail.", th);
        }
    }

    public static void a(final String str, final List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{str, list});
            return;
        }
        try {
            com.alibaba.poplayer.utils.f.a(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$e$3Tn-x1y7SWOpWgUlhAZHmvRbiZs
                @Override // java.lang.Runnable
                public final void run() {
                    e.m243lambda$3Tnx1y7SWOpWgUlhAZHmvRbiZs(str, list);
                }
            });
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("NativeEventDispatcher.internalNotifyConfigUpdated.AsyncTask.fail.", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.support.v4.content.LocalBroadcastManager] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static /* synthetic */ void b(String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aab2c64", new Object[]{str, list});
            return;
        }
        try {
            ?? intent = new Intent(PopLayer.ACTION_OUT_CONFIG_UPDATED);
            intent.putExtra("domain", UMLLCons.FEATURE_TYPE_PAGE);
            intent.putExtra("sourceType", 0);
            intent.putExtra("configVersion", str);
            intent.putExtra("configIndexIds", list != null ? list.toArray() : 0);
            LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
            com.alibaba.poplayer.utils.c.a("NativeEventDispatcher.NativeNotify.ConfigUpdated.", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("NativeEventDispatcher.internalNotifyConfigUpdated.fail.", th);
        }
    }
}
