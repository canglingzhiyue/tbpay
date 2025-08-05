package com.taobao.infoflow.taobao.subservice.biz.pop.jsbridge;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.kyu;
import tb.ldf;
import tb.ljs;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IJsBridgeService f17497a;
    private List<IJsBridgeService.a> b;
    private boolean c = false;

    static {
        kge.a(-1121754576);
    }

    public c(ljs ljsVar) {
        this.f17497a = (IJsBridgeService) ljsVar.a(IJsBridgeService.class);
    }

    public void a(kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20ac4b1", new Object[]{this, kyuVar});
        } else if (this.c) {
            ldf.d("PopJsBridgeResister", "registerJsNativeFeature duplicate");
        } else if (this.f17497a == null) {
            ldf.d("PopJsBridgeResister", "registerJsNativeFeature jsBridgeService is null");
        } else {
            this.b = b(kyuVar);
            for (IJsBridgeService.a aVar : this.b) {
                try {
                    this.f17497a.registerJsNativeFeature(aVar);
                } catch (Throwable th) {
                    com.taobao.homepage.pop.utils.c.a("registerJsNativeFeature error", th);
                }
            }
            this.c = true;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f17497a == null) {
            ldf.d("PopJsBridgeResister", "unRegisterJsNativeFeature jsBridgeService is null");
        } else {
            List<IJsBridgeService.a> list = this.b;
            if (list == null || list.isEmpty()) {
                ldf.d("PopJsBridgeResister", "unRegisterJsNativeFeature mNativeFeatures is null");
                return;
            }
            for (IJsBridgeService.a aVar : this.b) {
                try {
                    this.f17497a.unRegisterJsNativeFeature(aVar);
                } catch (Throwable th) {
                    com.taobao.homepage.pop.utils.c.a("unRegisterJsNativeFeature error", th);
                }
            }
            this.b.clear();
            this.c = false;
        }
    }

    private List<IJsBridgeService.a> b(kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4dc5fcd5", new Object[]{this, kyuVar});
        }
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(new b(kyuVar));
        arrayList.add(new a(kyuVar));
        return arrayList;
    }
}
