package tb;

import android.os.Looper;
import android.os.MessageQueue;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.nodemodel.branch.c;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model.AsyncModule;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import tb.avy;

/* loaded from: classes2.dex */
public class avw extends avy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private s b;

    static {
        kge.a(-232322393);
    }

    public static /* synthetic */ Object ipc$super(avw avwVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(avw avwVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25b9900", new Object[]{avwVar, str});
        } else {
            avwVar.c(str);
        }
    }

    public avw(s sVar) {
        this.b = sVar;
    }

    @Override // tb.avy
    public void a(String str, String str2, RenderComponent renderComponent, AsyncModule asyncModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("581d4c09", new Object[]{this, str, str2, renderComponent, asyncModule});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || renderComponent == null || asyncModule == null) {
        } else {
            avy.a aVar = new avy.a();
            aVar.f25646a = str2;
            aVar.b = new AtomicInteger(0);
            aVar.c = renderComponent;
            aVar.d = asyncModule;
            this.f25645a.put(str, aVar);
        }
    }

    @Override // tb.avy
    public AsyncModule a(String str) {
        avy.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AsyncModule) ipChange.ipc$dispatch("5ea110ee", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || (aVar = this.f25645a.get(str)) == null) {
            return null;
        }
        return aVar.d;
    }

    @Override // tb.avy
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.b.a(new c("aura.branch.asyncComponent.trigger.idle", true, "default"))) {
            d(str);
        } else {
            c(str);
        }
    }

    private void c(String str) {
        avy.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || (aVar = this.f25645a.get(str)) == null || aVar.b == null || aVar.b.get() == 1) {
        } else {
            d dVar = new d();
            dVar.a(bst.d(aVar.c));
            dVar.a("" + System.currentTimeMillis());
            dVar.a(avr.EVENT_EXT_PARAMS_ASYNC_MODULE, aVar.d);
            com.alibaba.android.aura.service.event.c.a(this.b, aVar.f25646a, dVar);
            aVar.b.set(1);
        }
    }

    private void d(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        MessageQueue messageQueue = null;
        try {
            messageQueue = Looper.myQueue();
        } catch (Exception e) {
            arc.a().c("AURAAsyncModuleManager", "innerTriggerAsyncModuleIdle", e.toString());
        }
        if (messageQueue == null) {
            c(str);
        } else {
            messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: tb.avw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    avw.a(avw.this, str);
                    return false;
                }
            });
        }
    }
}
