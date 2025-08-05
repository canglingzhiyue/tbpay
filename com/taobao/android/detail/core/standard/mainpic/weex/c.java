package com.taobao.android.detail.core.standard.mainpic.weex;

import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.aqs;
import tb.arp;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "aliDetail.impl.aspect.lifecycle.windvaneApiPluginRegister")
/* loaded from: classes4.dex */
public final class c implements arp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, a> f9859a;
    private List<com.taobao.android.detail.core.standard.mainpic.weex.a> b;

    @Override // tb.arp
    public void afterFlowExecute(com.alibaba.android.aura.datamodel.c cVar, com.alibaba.android.aura.datamodel.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6cdb92", new Object[]{this, cVar, aVar, new Boolean(z)});
        }
    }

    @Override // tb.arp
    public void afterServiceExecute(com.alibaba.android.aura.datamodel.c cVar, com.alibaba.android.aura.datamodel.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2b82a1", new Object[]{this, cVar, aVar, new Boolean(z)});
        }
    }

    @Override // tb.arp
    public void beforeServiceExecute(AURAInputData aURAInputData, com.alibaba.android.aura.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    static {
        kge.a(-1134761020);
        kge.a(-1795775593);
        f9859a = new ConcurrentHashMap();
    }

    public c() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.weex.PicGalleryWindvaneApiPluginRegisterExtension");
    }

    @Override // tb.arp
    public void beforeFlowExecute(AURAInputData aURAInputData, com.alibaba.android.aura.datamodel.a aVar) {
        Map<String, Class<? extends AbsPicGalleryWindvaneApiPlugin>> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f04d21", new Object[]{this, aURAInputData, aVar});
            return;
        }
        List<com.taobao.android.detail.core.standard.mainpic.weex.a> list = this.b;
        if (list == null) {
            return;
        }
        for (com.taobao.android.detail.core.standard.mainpic.weex.a aVar2 : list) {
            if (aVar2 != null && (a2 = aVar2.a()) != null) {
                for (Map.Entry<String, Class<? extends AbsPicGalleryWindvaneApiPlugin>> entry : a2.entrySet()) {
                    if (!f9859a.containsKey(entry.getKey()) && entry.getValue() != null) {
                        a aVar3 = new a();
                        a.a(aVar3, entry.getKey());
                        a.a(aVar3, entry.getValue());
                        a.a(aVar3, new AtomicBoolean(false));
                        f9859a.put(entry.getKey(), aVar3);
                    }
                }
            }
        }
        for (a aVar4 : f9859a.values()) {
            if (!a.a(aVar4).get()) {
                q.a(a.b(aVar4), (Class<? extends e>) a.c(aVar4));
                a.a(aVar4).set(true);
            }
        }
    }

    @Override // tb.arl
    public void onCreate(com.alibaba.android.aura.q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.b = fVar.b(com.taobao.android.detail.core.standard.mainpic.weex.a.class);
        }
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f9860a;
        private Class<? extends AbsPicGalleryWindvaneApiPlugin> b;
        private AtomicBoolean c;

        static {
            kge.a(-1294740839);
        }

        private a() {
        }

        public static /* synthetic */ Class a(a aVar, Class cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Class) ipChange.ipc$dispatch("e12d1990", new Object[]{aVar, cls});
            }
            aVar.b = cls;
            return cls;
        }

        public static /* synthetic */ String a(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c19a523c", new Object[]{aVar, str});
            }
            aVar.f9860a = str;
            return str;
        }

        public static /* synthetic */ AtomicBoolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("b624e45a", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ AtomicBoolean a(a aVar, AtomicBoolean atomicBoolean) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AtomicBoolean) ipChange.ipc$dispatch("2013ab36", new Object[]{aVar, atomicBoolean});
            }
            aVar.c = atomicBoolean;
            return atomicBoolean;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e72bb225", new Object[]{aVar}) : aVar.f9860a;
        }

        public static /* synthetic */ Class c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("246470c9", new Object[]{aVar}) : aVar.b;
        }
    }
}
