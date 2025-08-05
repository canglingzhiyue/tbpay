package com.taobao.pha.core.controller;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.model.PageModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.nfz;
import tb.ngn;
import tb.ngr;

/* loaded from: classes7.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AppController c;

    /* renamed from: a  reason: collision with root package name */
    private final String f18727a = "PageViewFactory";
    private final ConcurrentHashMap<String, nfz> b = new ConcurrentHashMap<>();
    private boolean d = true;

    static {
        kge.a(1017514170);
    }

    public static /* synthetic */ void a(l lVar, PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db72aadd", new Object[]{lVar, pageModel});
        } else {
            lVar.b(pageModel);
        }
    }

    public l(AppController appController) {
        this.c = appController;
    }

    public void a(final PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737dfcbc", new Object[]{this, pageModel});
            return;
        }
        if (pageModel.frames != null && !pageModel.frames.isEmpty()) {
            pageModel = pageModel.frames.get(pageModel.getActiveIndex());
        }
        if (pageModel == null) {
            return;
        }
        ngr.b("PageViewFactory", "preloadPageView");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b(pageModel);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.pha.core.controller.l.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        l.a(l.this, pageModel);
                    }
                }
            });
        }
    }

    public nfz a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfz) ipChange.ipc$dispatch("7c72dc92", new Object[]{this, str});
        }
        this.d = false;
        ngr.b("PageViewFactory", "getPageView " + str);
        nfz remove = this.b.remove(str);
        if (remove != null) {
            ngr.b("PageViewFactory", "hit preloaded webView");
        }
        return remove;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ngr.b("PageViewFactory", "clearPageViews");
        if (this.b.isEmpty()) {
            return;
        }
        for (Map.Entry<String, nfz> entry : this.b.entrySet()) {
            if (entry != null && entry.getValue() != null) {
                entry.getValue().g();
            }
        }
        this.b.clear();
    }

    private void b(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae331db", new Object[]{this, pageModel});
            return;
        }
        ngr.b("PageViewFactory", "preloadPageViewImpl: " + pageModel.getUrl());
        if (!this.d) {
            ngr.b("PageViewFactory", "mEnablePreload =  false");
        } else if (this.b.containsKey(pageModel.getUrl())) {
        } else {
            this.b.put(pageModel.getUrl(), ngn.a(this.c, pageModel));
        }
    }
}
