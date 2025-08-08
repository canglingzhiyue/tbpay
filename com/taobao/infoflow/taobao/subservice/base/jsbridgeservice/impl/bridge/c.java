package com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.b;
import com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.model.JsActionModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.lcz;
import tb.ldf;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, IJsBridgeService.a> f17438a = new ConcurrentHashMap();
    private final b.a c = new b.a() { // from class: com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.b.a
        public boolean a(JsActionModel jsActionModel, IJsBridgeService.a.InterfaceC0670a interfaceC0670a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("36209c3b", new Object[]{this, jsActionModel, interfaceC0670a})).booleanValue();
            }
            String action = jsActionModel.getAction();
            IJsBridgeService.a aVar = (IJsBridgeService.a) c.a(c.this).get(action);
            if (aVar != null) {
                aVar.a(jsActionModel.getParam(), interfaceC0670a);
                return true;
            }
            ldf.d("JsNativeFeatureDispatcher", "IWvResponder.onResponse nativeFeature is null. nativeFeatureName : " + action);
            interfaceC0670a.a("客户端能力未注册，联系客户端同学确认，NativeFeature：" + action);
            return false;
        }
    };

    static {
        kge.a(-1058665835);
    }

    public static /* synthetic */ Map a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("57b7ebf1", new Object[]{cVar}) : cVar.f17438a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.b = str;
        b.a();
        b.a(this.b, this.c);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (!StringUtils.isEmpty(this.b)) {
            b.a(this.b);
        }
        this.f17438a.clear();
    }

    public void a(IJsBridgeService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("324f7907", new Object[]{this, aVar});
            return;
        }
        String a2 = aVar.a();
        if (this.f17438a.containsKey(a2)) {
            String str = "registerJsNativeFeature 发生异常，重复注册，featureName： " + a2;
            ldf.d("JsNativeFeatureDispatcher", str);
            if (lcz.b()) {
                throw new InfoFlowRuntimeException(str);
            }
        }
        this.f17438a.put(a2, aVar);
    }

    public void b(IJsBridgeService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2fd9a6", new Object[]{this, aVar});
        } else {
            this.f17438a.remove(aVar.a());
        }
    }
}
