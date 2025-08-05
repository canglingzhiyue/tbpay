package com.taobao.infoflow.jsbridge.impl.bridge;

import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.jsbridge.impl.bridge.model.JsActionModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.ldf;
import tb.lji;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f17404a;
    private static final Map<String, InterfaceC0669a> b;

    /* renamed from: com.taobao.infoflow.jsbridge.impl.bridge.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public interface InterfaceC0669a {
        boolean a(JsActionModel jsActionModel, lji.a.InterfaceC1153a interfaceC1153a);
    }

    static {
        kge.a(-1952594174);
        b = new ConcurrentHashMap();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f17404a) {
        } else {
            f17404a = true;
            try {
                ldf.d("ContainerWvPluginRegister", "registerWvPlugin : TBContainerWVPlugin");
                q.a("TBContainerWVPlugin", (Class<? extends e>) TBContainerWVPlugin.class, true);
            } catch (Exception unused) {
                ldf.d("ContainerWvPluginRegister", "registerPlugin error");
            }
        }
    }

    public static void a(String str, InterfaceC0669a interfaceC0669a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8f437", new Object[]{str, interfaceC0669a});
        } else {
            b.put(str, interfaceC0669a);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (b.isEmpty()) {
        } else {
            b.remove(str);
        }
    }

    public static boolean a(JsActionModel jsActionModel, lji.a.InterfaceC1153a interfaceC1153a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bf4c76", new Object[]{jsActionModel, interfaceC1153a})).booleanValue();
        }
        String businessId = jsActionModel.getBusinessId();
        InterfaceC0669a interfaceC0669a = b.get(businessId);
        if (interfaceC0669a == null) {
            ldf.d("ContainerWvPluginRegister", "未查找到对应的 wvResponder， containerId ： " + businessId);
            interfaceC1153a.a("未找到目标容器，请联系客户端同学确认，containerId：" + businessId);
            return false;
        }
        return interfaceC0669a.a(jsActionModel, interfaceC1153a);
    }
}
