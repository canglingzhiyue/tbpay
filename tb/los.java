package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ab;
import com.taobao.android.dinamicx.widget.viewpager.tab.view.DXTabLayout;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;

/* loaded from: classes7.dex */
public class los {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IMulticlassTabService.b f30778a;
    private IMulticlassTabService.a b;
    private final DXRuntimeContext c;

    static {
        kge.a(-1556160150);
    }

    public static /* synthetic */ void a(los losVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f331c988", new Object[]{losVar});
        } else {
            losVar.b();
        }
    }

    public static /* synthetic */ void a(los losVar, ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0919123", new Object[]{losVar, ljsVar});
        } else {
            losVar.e(ljsVar);
        }
    }

    public static /* synthetic */ void b(los losVar, ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2a86a4", new Object[]{losVar, ljsVar});
        } else {
            losVar.f(ljsVar);
        }
    }

    public los(DXRuntimeContext dXRuntimeContext) {
        this.c = dXRuntimeContext;
        ljs a2 = lfq.a(dXRuntimeContext);
        if (a2 != null) {
            b(a2);
        }
    }

    public void a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eb5403", new Object[]{this, ljsVar});
            return;
        }
        IMulticlassTabService<?> c = c(ljsVar);
        if (c == null || this.b != null) {
            return;
        }
        this.b = a();
        c.addTabChangeListener(this.b);
    }

    private IMulticlassTabService.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMulticlassTabService.a) ipChange.ipc$dispatch("84d6192c", new Object[]{this}) : new IMulticlassTabService.a() { // from class: tb.los.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService.a
            public void a(llm llmVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f304c8cb", new Object[]{this, llmVar});
                } else if (!"首页".equals(llmVar.a())) {
                } else {
                    los.a(los.this);
                }
            }
        };
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        DXWidgetNode d = this.c.d();
        if (d == null || !(d.getChildAt(0) instanceof ab)) {
            return;
        }
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        DXTabLayout d = d();
        if (d == null || d.getSelectedTabPosition() <= 0) {
            return;
        }
        d.selectTab(d.getTabAt(0));
    }

    private DXTabLayout d() {
        DXWidgetNode childAt;
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTabLayout) ipChange.ipc$dispatch("c51dcd38", new Object[]{this});
        }
        DXWidgetNode d = this.c.d();
        if (d == null || (childAt = d.getChildAt(0)) == null || (dXRuntimeContext = childAt.getDXRuntimeContext()) == null) {
            return null;
        }
        View v = dXRuntimeContext.v();
        if (v instanceof DXTabLayout) {
            return (DXTabLayout) v;
        }
        return null;
    }

    private void b(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16e5a84", new Object[]{this, ljsVar});
            return;
        }
        IMulticlassTabService<?> c = c(ljsVar);
        if (c == null || this.f30778a != null) {
            return;
        }
        this.f30778a = d(ljsVar);
        c.addTabContentListener(this.f30778a);
    }

    private IMulticlassTabService<?> c(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMulticlassTabService) ipChange.ipc$dispatch("47e26466", new Object[]{this, ljsVar});
        }
        if (ljsVar != null) {
            return (IMulticlassTabService) ljsVar.a(IMulticlassTabService.class);
        }
        return null;
    }

    private IMulticlassTabService.b d(final ljs ljsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMulticlassTabService.b) ipChange.ipc$dispatch("120d8e9", new Object[]{this, ljsVar}) : new IMulticlassTabService.b() { // from class: tb.los.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService.b
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                los.a(los.this, ljsVar);
                los.b(los.this, ljsVar);
            }
        };
    }

    private void e(ljs ljsVar) {
        IMulticlassTabService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf76e07", new Object[]{this, ljsVar});
            return;
        }
        IMulticlassTabService<?> c = c(ljsVar);
        if (c == null || (aVar = this.b) == null) {
            return;
        }
        c.removeTabChangeListener(aVar);
        this.b = null;
    }

    private void f(ljs ljsVar) {
        IMulticlassTabService.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7a7488", new Object[]{this, ljsVar});
            return;
        }
        IMulticlassTabService<?> c = c(ljsVar);
        if (c == null || (bVar = this.f30778a) == null) {
            return;
        }
        c.removeTabContentListener(bVar);
        this.f30778a = null;
    }
}
