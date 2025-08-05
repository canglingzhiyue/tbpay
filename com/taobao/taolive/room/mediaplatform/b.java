package com.taobao.taolive.room.mediaplatform;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCCoreProvider;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.svb;

/* loaded from: classes8.dex */
public class b implements svb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.alilive.aliliveframework.frame.a f21624a;
    private WVUCCoreProvider b;

    static {
        kge.a(-1316740937);
        kge.a(-658023147);
    }

    public b(com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.f21624a = aVar;
    }

    @Override // tb.svb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        WVUCCoreProvider wVUCCoreProvider = this.b;
        if (wVUCCoreProvider == null) {
            return;
        }
        wVUCCoreProvider.release();
        this.b = null;
    }

    @Override // tb.svb
    public void a(Context context, final svb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7be157f4", new Object[]{this, context, aVar});
            return;
        }
        this.b = new WVUCCoreProvider();
        this.b.request(context, new WVUCCoreProvider.WVUCCoreProviderCallback() { // from class: com.taobao.taolive.room.mediaplatform.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.extra.uc.WVUCCoreProvider.WVUCCoreProviderCallback
            public void onUCCorePrepared() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6e1aa650", new Object[]{this});
                } else {
                    aVar.onUCCorePrepared();
                }
            }

            @Override // android.taobao.windvane.extra.uc.WVUCCoreProvider.WVUCCoreProviderCallback
            public void onUCCoreFailed(android.taobao.windvane.webview.c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dbdc6d08", new Object[]{this, cVar});
                } else {
                    aVar.a();
                }
            }
        });
    }
}
