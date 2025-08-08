package com.taobao.infoflow.jsbridge.impl.bridge;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.jsbridge.impl.bridge.a;
import com.taobao.infoflow.jsbridge.impl.bridge.model.JsActionModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.ldf;
import tb.lji;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, lji.a> f17405a = new ConcurrentHashMap();
    private final a.InterfaceC0669a c = new a.InterfaceC0669a() { // from class: com.taobao.infoflow.jsbridge.impl.bridge.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.infoflow.jsbridge.impl.bridge.a.InterfaceC0669a
        public boolean a(JsActionModel jsActionModel, lji.a.InterfaceC1153a interfaceC1153a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5bf4c76", new Object[]{this, jsActionModel, interfaceC1153a})).booleanValue();
            }
            String action = jsActionModel.getAction();
            lji.a aVar = (lji.a) b.a(b.this).get(action);
            if (aVar != null) {
                aVar.a(jsActionModel.getMethod(), jsActionModel.getParam(), interfaceC1153a);
                return true;
            }
            ldf.d("JsNativeFeatureDispatcher", "IWvResponder.onResponse nativeFeature is null. nativeFeatureName : " + action);
            interfaceC1153a.a("客户端能力未注册，联系客户端同学确认，NativeFeature：" + action);
            return false;
        }
    };

    static {
        kge.a(-1635307511);
    }

    public static /* synthetic */ Map a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("47b1c31e", new Object[]{bVar}) : bVar.f17405a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.b = str;
        a.a();
        a.a(this.b, this.c);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (!StringUtils.isEmpty(this.b)) {
            a.a(this.b);
        }
        this.f17405a.clear();
    }

    public void a(lji.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32ae130", new Object[]{this, aVar});
            return;
        }
        String a2 = aVar.a();
        if (this.f17405a.containsKey(a2)) {
            ldf.d("JsNativeFeatureDispatcher", "registerJsNativeFeature 发生异常，重复注册，featureName： " + a2);
        }
        this.f17405a.put(a2, aVar);
    }

    public void b(lji.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d064b71", new Object[]{this, aVar});
        } else {
            this.f17405a.remove(aVar.a());
        }
    }
}
