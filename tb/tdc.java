package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.alibaba.android.aura.s;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

@AURAExtensionImpl(code = "alibuy.impl.event.adjust.cache")
/* loaded from: classes4.dex */
public final class tdc extends emt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private tcy f34041a;

    static {
        kge.a(179092667);
    }

    public static /* synthetic */ Object ipc$super(tdc tdcVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.emt
    public void a(UMFLinkageTrigger uMFLinkageTrigger, List<s> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7967f1cc", new Object[]{this, uMFLinkageTrigger, list});
        } else {
            a(uMFLinkageTrigger);
        }
    }

    private void a(UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("115c7adb", new Object[]{this, uMFLinkageTrigger});
            return;
        }
        tcy d = d();
        if (d == null) {
            arc.a().a("stream", "streamExceptionProcessor is null, is not stream response ??");
        } else {
            d.a(uMFLinkageTrigger);
        }
    }

    @Override // tb.emt
    public boolean a(b bVar, aqx<b, Void> aqxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f7afcac", new Object[]{this, bVar, aqxVar})).booleanValue();
        }
        if (!"AURANextRPCServiceDomain".equals(bVar.f())) {
            return false;
        }
        a aVar = (a) bbc.a(bVar.c(), "NextRPCRemoteResponse", a.class, null);
        if (aVar != null) {
            return "F-10000-05-15-002".equals(aVar.a()) && d() != null;
        }
        arc.a().a("stream", "remoteResponse is null");
        return false;
    }

    private tcy d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tcy) ipChange.ipc$dispatch("261fd291", new Object[]{this});
        }
        if (this.f34041a == null) {
            this.f34041a = (tcy) c().get("aliBuyGlobalDataStreamResponseProcessor", tcy.class);
        }
        return this.f34041a;
    }
}
