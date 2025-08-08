package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.b;
import com.alibaba.android.ultron.event.base.f;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.android.umf.datamodel.service.render.UMFRenderIO;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.widget.ad;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class brq implements brk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private f b;
    private bd c;

    /* renamed from: a  reason: collision with root package name */
    private final String f26062a = "UMFRenderContainerExtension";
    private final Map<String, brs> d = new HashMap();
    private final Map<String, brs> e = new HashMap();

    static {
        kge.a(-616581001);
        kge.a(-2059716611);
    }

    public static /* synthetic */ bd a(brq brqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bd) ipChange.ipc$dispatch("5b8bf0d9", new Object[]{brqVar}) : brqVar.c;
    }

    public static /* synthetic */ brs a(brq brqVar, b.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (brs) ipChange.ipc$dispatch("7e3285ba", new Object[]{brqVar, aVar}) : brqVar.a(aVar);
    }

    private brs d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (brs) ipChange.ipc$dispatch("2617db78", new Object[]{this}) : new brt();
    }

    private f a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("b1ae0050", new Object[]{this, str, context});
        }
        if (this.b == null) {
            try {
                this.b = new f(d.a(new UltronInstanceConfig().a(str), context));
            } catch (Throwable th) {
                bqd a2 = bqe.a();
                a2.c("UMFRenderContainerExtension", "initEventHandler#init event handler exception," + th.getMessage());
            }
        }
        return this.b;
    }

    private bd a(String str, bd bdVar, Map<Long, ak> map, Map<Long, fut> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bd) ipChange.ipc$dispatch("bcbbff84", new Object[]{this, str, bdVar, map, map2});
        }
        if (bdVar == null) {
            this.c = new bd(new DXEngineConfig.a(str).b(2).a());
            this.c.a(1544903441687469454L, new bra());
            this.c.a(38447420286L, new bra());
            this.c.a(7023701163946200378L, new bqz());
            this.c.a(com.taobao.android.dinamicx.widget.f.DXCALENDARVIEW_CALENDARVIEW, new f.a());
            this.c.a(ad.DXTEXTINPUTVIEW_TEXTINPUTVIEW, new ad.a());
            if (map != null) {
                for (Map.Entry<Long, ak> entry : map.entrySet()) {
                    this.c.a(entry.getKey().longValue(), entry.getValue());
                }
            }
            if (map2 != null) {
                for (Map.Entry<Long, fut> entry2 : map2.entrySet()) {
                    this.c.a(entry2.getKey().longValue(), entry2.getValue());
                }
            }
        } else {
            this.c = bdVar;
        }
        return this.c;
    }

    @Override // tb.brk
    @Deprecated
    public void a(UMFRenderIO uMFRenderIO, com.alibaba.android.umf.datamodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01089b7", new Object[]{this, uMFRenderIO, bVar});
            return;
        }
        this.e.clear();
        bVar.a("eventHandler", a(bVar.d(), bVar.c()));
        bVar.a("dinamicXEngineRouter", a(bVar.d(), (bd) bVar.a("dinamicXEngineRouter", (Class<Object>) bd.class), (Map) bVar.a("dxWidgetMap", (Class<Object>) Map.class), (Map) bVar.a("dxDataParserMap", (Class<Object>) Map.class)));
        a(bVar.c(), uMFRenderIO);
    }

    @Override // tb.brk
    @Deprecated
    public Map<String, View> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        Map<String, brs> map = this.e;
        if (map == null || map.isEmpty()) {
            bqe.a().c("UMFRenderContainerExtension", "provideContentView#there is no active container extension delegate");
            return null;
        }
        final HashMap hashMap = new HashMap();
        a(new bqc<String, brs>() { // from class: tb.brq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bqc
            public void a(String str, brs brsVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("22360f9f", new Object[]{this, str, brsVar});
                } else {
                    hashMap.put(str, brsVar.a());
                }
            }
        });
        return hashMap;
    }

    private void a(final Context context, UMFRenderIO uMFRenderIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8af352", new Object[]{this, context, uMFRenderIO});
            return;
        }
        a(uMFRenderIO, new bqc<AURARenderComponent, b.a>() { // from class: tb.brq.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bqc
            public void a(AURARenderComponent aURARenderComponent, b.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c8c65cad", new Object[]{this, aURARenderComponent, aVar});
                    return;
                }
                brs a2 = brq.a(brq.this, aVar);
                a2.a(brq.a(brq.this));
                a2.a(context, aURARenderComponent);
            }
        });
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.e.isEmpty()) {
        } else {
            bqe.a().c("UMFRenderContainerExtension", "initContainerExtension#没有可用的Container渲染，确保传入的数据正确（确保dirtyMap中的type和key正确）");
        }
    }

    private brs a(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brs) ipChange.ipc$dispatch("c88fa4b", new Object[]{this, aVar});
        }
        String a2 = aVar.a();
        brs brsVar = this.d.get(a2);
        if (brsVar == null) {
            brsVar = d();
            this.d.put(a2, brsVar);
        }
        this.e.put(a2, brsVar);
        return brsVar;
    }

    @Override // tb.brk
    public void a(final brj brjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e247827e", new Object[]{this, brjVar});
        } else {
            a(new bqc<String, brs>() { // from class: tb.brq.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bqc
                public void a(String str, brs brsVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("22360f9f", new Object[]{this, str, brsVar});
                    } else {
                        brsVar.a(brjVar);
                    }
                }
            });
        }
    }

    @Override // tb.brk
    public void a(bri briVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2470e1f", new Object[]{this, briVar});
            return;
        }
        com.alibaba.android.ultron.event.base.f fVar = this.b;
        if (fVar == null || !(briVar instanceof brb)) {
            return;
        }
        fVar.a(briVar.a(), (com.alibaba.android.ultron.event.base.d) briVar);
    }

    @Override // tb.brk
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(new bqc<String, brs>() { // from class: tb.brq.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bqc
                public void a(String str, brs brsVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("22360f9f", new Object[]{this, str, brsVar});
                    } else {
                        brsVar.b();
                    }
                }
            });
        }
    }

    @Override // tb.brk
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a(new bqc<String, brs>() { // from class: tb.brq.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bqc
                public void a(String str, brs brsVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("22360f9f", new Object[]{this, str, brsVar});
                    } else {
                        brsVar.c();
                    }
                }
            });
        }
    }

    private void a(bqc<String, brs> bqcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2363c64", new Object[]{this, bqcVar});
            return;
        }
        for (Map.Entry<String, brs> entry : this.e.entrySet()) {
            bqcVar.a(entry.getKey(), entry.getValue());
        }
    }

    private void a(UMFRenderIO uMFRenderIO, bqc<AURARenderComponent, b.a> bqcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4502db56", new Object[]{this, uMFRenderIO, bqcVar});
            return;
        }
        b dirtyMap = uMFRenderIO.getDirtyMap();
        if (dirtyMap == null) {
            bqe.a().c("UMFRenderContainerExtension", "execute#dirtyRoot is null");
            return;
        }
        List<b.a> a2 = dirtyMap.a();
        if (a2 == null || a2.isEmpty()) {
            bqe.a().c("UMFRenderContainerExtension", "execute#dirtyRoot is is empty");
            return;
        }
        List<AURARenderComponent> renderTreeList = uMFRenderIO.getRenderTreeList();
        if (renderTreeList == null || renderTreeList.isEmpty()) {
            return;
        }
        for (b.a aVar : a2) {
            String b = aVar.b();
            if (!StringUtils.isEmpty(b)) {
                for (AURARenderComponent aURARenderComponent : renderTreeList) {
                    if (b.equals(aURARenderComponent.key)) {
                        bqcVar.a(aURARenderComponent, aVar);
                    }
                }
            }
        }
    }
}
