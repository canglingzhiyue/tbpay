package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = "aura.impl.aspect.lifecycle.eventTrigger.afterRender")
/* loaded from: classes2.dex */
public final class ayb extends arn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AURAInputData f25683a;

    static {
        kge.a(1045713350);
    }

    public static /* synthetic */ Object ipc$super(ayb aybVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1372880223) {
            super.afterServiceExecute((c) objArr[0], (a) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return null;
        } else if (hashCode != -362309544) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.beforeServiceExecute((AURAInputData) objArr[0], (a) objArr[1]);
            return null;
        }
    }

    @Override // tb.arn, tb.arp
    public void beforeServiceExecute(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, aVar);
        if (!aVar.c().equals(asw.RENDER_SERVICE_CODE)) {
            return;
        }
        this.f25683a = aURAInputData;
    }

    @Override // tb.arn, tb.arp
    public void afterServiceExecute(c cVar, a aVar, boolean z) {
        AURAInputData aURAInputData;
        AURARenderComponent renderTree;
        AURARenderComponentData aURARenderComponentData;
        Map<String, List<Event>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2b82a1", new Object[]{this, cVar, aVar, new Boolean(z)});
            return;
        }
        super.afterServiceExecute(cVar, aVar, z);
        if (!aVar.c().equals(asw.RENDER_SERVICE_CODE) || z || (aURAInputData = this.f25683a) == null) {
            return;
        }
        Serializable data = aURAInputData.getData();
        if (!(data instanceof AURARenderIO) || (renderTree = ((AURARenderIO) data).getRenderTree()) == null || (aURARenderComponentData = renderTree.data) == null || (map = aURARenderComponentData.events) == null) {
            return;
        }
        List<Event> list = map.get("afterRender");
        if (bau.a(list)) {
            return;
        }
        for (Event event : list) {
            String type = event.getType();
            JSONObject fields = event.getFields();
            if (!StringUtils.isEmpty(type)) {
                d dVar = new d();
                dVar.a(fields);
                dVar.a(renderTree);
                a().b().a("aura.workflow.event", new AURAEventIO(type, dVar), null);
            }
        }
    }
}
