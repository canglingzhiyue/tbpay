package com.taobao.pha.core.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.manifest.ManifestProperty;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.p;
import tb.kge;
import tb.ngr;

/* loaded from: classes7.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PRELOAD_TYPE_CACHE_INVALID = 1;
    public static final int PRELOAD_TYPE_CACHE_SLOWER = 0;
    public static final int PRELOAD_TYPE_CACHE_VALID = 2;
    public static final int PRELOAD_TYPE_UNSET = -1;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    public int f18719a = -1;
    private final AppController b;
    private ManifestModel c;
    private ManifestModel d;
    private Context e;
    private boolean f;

    static {
        kge.a(-143572123);
        TAG = h.class.getSimpleName();
    }

    public h(AppController appController) {
        this.b = appController;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.e = context;
        a();
    }

    public synchronized void a(ManifestModel manifestModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18cd715c", new Object[]{this, manifestModel});
            return;
        }
        this.c = manifestModel;
        if (this.b.i() && this.d != null) {
            if (manifestModel.version != this.d.version && this.d.version != 0) {
                this.f18719a = 1;
                ngr.b(TAG, "expired manifest cache is invalid.");
                String str = TAG;
                ngr.b(str, "currentVersion: " + manifestModel.version + ", cachedManifestVersion" + this.d.version);
                this.b.q().b();
                final l j = this.b.j();
                if (j != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.pha.core.controller.h.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                j.a();
                            }
                        }
                    });
                }
                return;
            }
            this.f18719a = 2;
            ManifestProperty z = this.b.z();
            if (z != null) {
                z.g = 2;
            }
            ngr.b(TAG, "expired manifest cache is valid.");
        }
    }

    public synchronized void b(ManifestModel manifestModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d244fefb", new Object[]{this, manifestModel});
        } else if (this.c != null) {
            this.f18719a = 0;
        } else {
            ngr.b(TAG, "onCachedManifestLoaded");
            this.d = manifestModel;
            a();
            String str = TAG;
            ngr.b(str, "setCacheManifestModel " + manifestModel);
            if (p.c().j() && (manifestModel.dataPrefetch instanceof JSONArray)) {
                this.b.q().a((JSONArray) manifestModel.dataPrefetch);
            }
        }
    }

    private synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.e == null) {
        } else {
            if (this.d == null) {
                return;
            }
            if (this.f) {
                return;
            }
            this.f = true;
            ManifestModel manifestModel = this.d;
            l j = this.b.j();
            PageModel c = c(manifestModel);
            if (j != null && c != null) {
                j.a(c);
            }
        }
    }

    private static PageModel c(ManifestModel manifestModel) {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (PageModel) ipChange.ipc$dispatch("f8b0966e", new Object[]{manifestModel});
        }
        if (manifestModel.pages.isEmpty()) {
            return null;
        }
        if (manifestModel.tabBar != null && (i = manifestModel.tabBar.selectedIndex) >= 0 && i < manifestModel.pages.size()) {
            i2 = i;
        }
        return manifestModel.pages.get(i2);
    }
}
