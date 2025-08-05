package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.d;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;

/* loaded from: classes.dex */
public class lgw implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IMulticlassTabService.a f30590a;
    private IMulticlassTabService.a b;
    private final IMulticlassTabService<?> c;

    static {
        kge.a(-196593984);
        kge.a(1257404336);
    }

    public static /* synthetic */ IMulticlassTabService.a a(lgw lgwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMulticlassTabService.a) ipChange.ipc$dispatch("533deec0", new Object[]{lgwVar}) : lgwVar.f30590a;
    }

    public lgw(ljs ljsVar) {
        this.c = (IMulticlassTabService) ljsVar.a(IMulticlassTabService.class);
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.d
    public llm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (llm) ipChange.ipc$dispatch("f075fd1", new Object[]{this});
        }
        IMulticlassTabService<?> iMulticlassTabService = this.c;
        if (iMulticlassTabService == null) {
            ldf.d("MulticlassTabInvokerImpl", "getMulticlassTabInfo, mMulticlassTabService is null");
            return null;
        }
        return iMulticlassTabService.getCurrentTabInfo();
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.d
    public void a(IMulticlassTabService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4571916c", new Object[]{this, aVar});
            return;
        }
        IMulticlassTabService<?> iMulticlassTabService = this.c;
        if (iMulticlassTabService == null) {
            ldf.d("MulticlassTabInvokerImpl", "getMulticlassTabInfo, mMulticlassTabService is null");
        } else if (aVar == null) {
            IMulticlassTabService.a aVar2 = this.b;
            if (aVar2 == null) {
                return;
            }
            iMulticlassTabService.removeTabChangeListener(aVar2);
        } else {
            this.f30590a = aVar;
            if (this.b != null) {
                return;
            }
            this.b = b();
            this.c.addTabChangeListener(this.b);
        }
    }

    private IMulticlassTabService.a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMulticlassTabService.a) ipChange.ipc$dispatch("f35d2a6d", new Object[]{this}) : new IMulticlassTabService.a() { // from class: tb.lgw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService.a
            public void a(llm llmVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f304c8cb", new Object[]{this, llmVar});
                    return;
                }
                IMulticlassTabService.a a2 = lgw.a(lgw.this);
                if (a2 == null) {
                    return;
                }
                a2.a(llmVar);
            }
        };
    }
}
