package com.taobao.android.detail.core.aura.utils;

import android.content.Context;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.aqt;
import tb.bav;
import tb.bss;
import tb.eip;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, AURAPluginContainerNodeModel> f9398a;
    private static final bav b;

    public static /* synthetic */ Map b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]) : f9398a;
    }

    static {
        kge.a(-1291286273);
        f9398a = new ConcurrentHashMap();
        b = new bav("AURADetailConfigLoader");
        emu.a("com.taobao.android.detail.core.aura.utils.AliDetailConfigLoader");
    }

    public static void a(Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (f9398a.containsKey(str)) {
        } else {
            b.a(context, str, new aqt<AURAPluginContainerNodeModel>() { // from class: com.taobao.android.detail.core.aura.utils.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqt
                public void a(AURAPluginContainerNodeModel aURAPluginContainerNodeModel) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7daa87aa", new Object[]{this, aURAPluginContainerNodeModel});
                    } else {
                        b.b().put(str, aURAPluginContainerNodeModel);
                    }
                }
            });
        }
    }

    public static AURAPluginContainerNodeModel b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("307d13cb", new Object[]{context, str});
        }
        AURAPluginContainerNodeModel aURAPluginContainerNodeModel = f9398a.get(str);
        return aURAPluginContainerNodeModel != null ? aURAPluginContainerNodeModel : (AURAPluginContainerNodeModel) JSON.parseObject(bss.a(context, str), AURAPluginContainerNodeModel.class);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        b.c();
        if (eip.l) {
            return;
        }
        f9398a.clear();
    }
}
