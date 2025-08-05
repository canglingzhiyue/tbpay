package com.taobao.android.dinamicx_v4.loader;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dxv4common.model.node.event.DXNativeLogicEventProperty;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.fwr;
import tb.fxe;
import tb.gez;
import tb.kge;

/* loaded from: classes5.dex */
public class DXExtensionSectionLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int Async = 1;
    public static final int Sync = 2;
    public static final int TYPE_LAUNCHED = 1;

    /* renamed from: a  reason: collision with root package name */
    private h f12218a;
    private e b;
    private g c;
    private com.taobao.android.dinamicx_v4.loader.a d;
    private gez e;
    private Map<Integer, List<a>> f = new HashMap();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DXEffectThreadType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DXEffectType {
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f12219a;

        static {
            kge.a(855733375);
        }

        public void a(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47e8b50a", new Object[]{this, dXEvent, dXRuntimeContext, map});
            }
        }
    }

    static {
        kge.a(-1169535685);
        kge.a(-202982083);
    }

    public DXExtensionSectionLoader(g gVar, h hVar, e eVar, com.taobao.android.dinamicx_v4.loader.a aVar, gez gezVar) {
        this.c = gVar;
        this.f12218a = hVar;
        this.b = eVar;
        this.d = aVar;
        this.e = gezVar;
    }

    public boolean a(fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        com.taobao.android.dxv4common.model.node.event.a bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c47e4ac", new Object[]{this, fwrVar, dXRuntimeContext})).booleanValue();
        }
        fwrVar.c(this.f12218a.h());
        short e = fwrVar.e();
        for (int i = 0; i < e; i++) {
            byte d = fwrVar.d();
            short e2 = fwrVar.e();
            if (d == 1) {
                byte d2 = fwrVar.d();
                if (this.e.a() == 0 || this.e.a() == 3) {
                    bVar = new com.taobao.android.dxv4common.model.node.event.b(this.b.a(fwrVar.f()), this.b.a(fwrVar.f()), this.b.a(fwrVar.f()));
                } else if (this.e.a() == 2) {
                    String a2 = this.b.a(fwrVar.f());
                    bVar = new DXNativeLogicEventProperty(this.b.a(fwrVar.f()) + "." + a2, this.b.a(fwrVar.f()));
                } else {
                    bVar = null;
                }
                b bVar2 = new b(bVar, d2);
                List<a> list = this.f.get(1);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f.put(1, list);
                }
                list.add(bVar2);
            } else if (DinamicXEngine.j()) {
                throw new RuntimeException(" 不认识的effect类型" + ((int) d));
            } else {
                fwrVar.b(e2);
                dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_LOAD_ERROR_V4, DXMonitorConstant.DX_LOAD_ERROR_EFFECT_V4, s.DX_LOADER_4000003, " 不认识的effect类型" + ((int) d)));
            }
        }
        return this.d.a(fwrVar, dXRuntimeContext);
    }

    /* loaded from: classes5.dex */
    public static class b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public com.taobao.android.dxv4common.model.node.event.a b;
        public int c;

        static {
            kge.a(-115398208);
        }

        public b(com.taobao.android.dxv4common.model.node.event.a aVar, int i) {
            this.c = 1;
            this.b = aVar;
            this.c = i;
            this.f12219a = 1;
        }

        @Override // com.taobao.android.dinamicx_v4.loader.DXExtensionSectionLoader.a
        public void a(final DXEvent dXEvent, final DXRuntimeContext dXRuntimeContext, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47e8b50a", new Object[]{this, dXEvent, dXRuntimeContext, map});
                return;
            }
            com.taobao.android.dxv4common.model.node.event.a aVar = this.b;
            if (aVar == null) {
                return;
            }
            if (this.c != 2 && !(aVar instanceof com.taobao.android.dxv4common.model.node.event.b)) {
                fxe.e(new Runnable() { // from class: com.taobao.android.dinamicx_v4.loader.DXExtensionSectionLoader.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (dXEvent == null) {
                            b.this.b.executeEvent(new DXLaunchedEffectEvent(), dXRuntimeContext);
                        } else {
                            b.this.b.executeEvent(dXEvent, dXRuntimeContext);
                        }
                    }
                });
            } else if (dXEvent == null) {
                this.b.executeEvent(new DXLaunchedEffectEvent(), dXRuntimeContext);
            } else {
                this.b.executeEvent(dXEvent, dXRuntimeContext);
            }
        }
    }

    public Map<Integer, List<a>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f;
    }
}
