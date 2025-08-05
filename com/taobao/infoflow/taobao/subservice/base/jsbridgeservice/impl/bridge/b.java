package com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge;

import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.model.JsActionModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.lcu;
import tb.ldf;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INFO_FLOW_WV_PLUGIN_NAME = "InfoFlowWVPlugin";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f17437a;
    private static final Map<String, a> b;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(JsActionModel jsActionModel, IJsBridgeService.a.InterfaceC0670a interfaceC0670a);
    }

    static {
        kge.a(-990301031);
        b = new ConcurrentHashMap();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f17437a) {
        } else {
            f17437a = true;
            try {
                ldf.d("InfoFlowWvPluginRegister", "registerWvPlugin : InfoFlowWVPlugin");
                q.a(INFO_FLOW_WV_PLUGIN_NAME, (Class<? extends e>) InfoFlowWVPlugin.class, true);
                lcu.a().a().a(INFO_FLOW_WV_PLUGIN_NAME, new com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.a());
            } catch (Throwable unused) {
                ldf.d("InfoFlowWvPluginRegister", "registerPlugin error");
            }
        }
    }

    public static void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678ce40a", new Object[]{str, aVar});
        } else {
            b.put(str, aVar);
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

    public static boolean a(JsActionModel jsActionModel, IJsBridgeService.a.InterfaceC0670a interfaceC0670a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36209c3b", new Object[]{jsActionModel, interfaceC0670a})).booleanValue();
        }
        String container = jsActionModel.getContainer();
        a aVar = b.get(container);
        if (aVar == null) {
            ldf.d("InfoFlowWvPluginRegister", "未查找到对应的 wvResponder， containerId ： " + container);
            interfaceC0670a.a("未找到目标容器，请联系客户端同学确认，containerId：" + container);
            return false;
        }
        return aVar.a(jsActionModel, interfaceC0670a);
    }
}
