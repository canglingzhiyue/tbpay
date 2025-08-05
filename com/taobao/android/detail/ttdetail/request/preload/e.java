package com.taobao.android.detail.ttdetail.request.preload;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.callback.PreloadRequestCallback;
import com.taobao.android.detail.ttdetail.request.params.PreloadRequestParams;
import com.taobao.android.detail.ttdetail.utils.av;
import tb.kge;
import tb.snw;
import tb.tbt;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final f f10792a;
    private final PreloadRequestParams b;

    static {
        kge.a(931075221);
    }

    public static /* synthetic */ f a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("ec49462d", new Object[]{eVar}) : eVar.f10792a;
    }

    public e(f fVar, PreloadRequestParams preloadRequestParams) {
        this.f10792a = fVar;
        this.b = preloadRequestParams;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        snw snwVar = new snw(this.b);
        PreloadRequestCallback preloadRequestCallback = new PreloadRequestCallback(this.b);
        preloadRequestCallback.setTaskCallback(new a() { // from class: com.taobao.android.detail.ttdetail.request.preload.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.request.preload.a
            public void onFinish() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("badeed9", new Object[]{this});
                } else {
                    e.a(e.this).b(e.this);
                }
            }
        });
        snwVar.a(preloadRequestCallback);
        if (this.b.isNavPreload()) {
            av.c(this.b.getDetailToken(), tbt.PRE_REQUEST, System.currentTimeMillis());
        }
        com.taobao.android.detail.ttdetail.utils.i.a("PreloadTask", "执行预加载请求, isNavPreload=" + this.b.isNavPreload());
        snwVar.k();
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.b.isContainItem(str);
    }
}
