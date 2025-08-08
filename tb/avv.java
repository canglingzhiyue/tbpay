package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.nodemodel.branch.c;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model.AsyncModule;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.b;
import java.util.List;

/* loaded from: classes2.dex */
public class avv extends avx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1336703635);
    }

    public avv(s sVar) {
        this.f25644a = new avw(sVar);
        this.b = sVar;
    }

    @Override // tb.avx
    public void a(RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc341cf", new Object[]{this, renderComponent});
        } else if (renderComponent != null && renderComponent.component != null && renderComponent.component.getEvents() != null && !StringUtils.isEmpty(renderComponent.key)) {
            String str = renderComponent.key;
            List<Event> list = renderComponent.component.getEvents().get(b.EVENT_LIST_NAME);
            if (list == null || list.isEmpty()) {
                return;
            }
            for (Event event : list) {
                if (event != null && event.getFields() != null) {
                    try {
                        AsyncModule asyncModule = (AsyncModule) JSON.toJavaObject(event.getFields(), AsyncModule.class);
                        if (asyncModule != null) {
                            this.f25644a.a(str, event.getType(), renderComponent, asyncModule);
                        }
                    } catch (Exception e) {
                        arc.a().c("AURAAsyncModuleDispatcher", "onParse", e.toString());
                    }
                }
            }
        }
    }

    @Override // tb.avx
    public void a(AURARenderComponent aURARenderComponent) {
        List<Event> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
        } else if (aURARenderComponent == null || StringUtils.isEmpty(aURARenderComponent.key)) {
        } else {
            String str = aURARenderComponent.key;
            if (this.f25644a.a(str) != null) {
                this.f25644a.b(str);
            } else if (aURARenderComponent.data == null || aURARenderComponent.data.events == null || (list = aURARenderComponent.data.events.get(b.EVENT_LIST_NAME)) == null || list.isEmpty() || aURARenderComponent.mirror == null) {
            } else {
                a(aURARenderComponent.mirror.data());
                this.f25644a.b(str);
            }
        }
    }

    @Override // tb.avx
    public void b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ed2032", new Object[]{this, aURARenderComponent});
        } else if (this.b.a(new c("aura.branch.asyncComponent.trigger.afterParser", false, "default"))) {
            a(aURARenderComponent);
        } else if (!this.b.a(new c("aura.branch.asyncComponent.trigger.lowdevicePreload", false, "default")) || !this.b.a(new c("aura.branch.deviceEvaluation.low", false, "default"))) {
        } else {
            a(aURARenderComponent);
        }
    }

    @Override // tb.avx
    public void a(AURARenderComponent aURARenderComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8565c990", new Object[]{this, aURARenderComponent, new Integer(i)});
        } else if (this.b.a(new c("aura.branch.asyncComponent.trigger.scroll", false, "default"))) {
            a(aURARenderComponent);
        } else if (!this.b.a(new c("aura.branch.asyncComponent.trigger.lowdeviceScroll", false, "default")) || !this.b.a(new c("aura.branch.deviceEvaluation.low", false, "default"))) {
        } else {
            a(aURARenderComponent);
        }
    }
}
