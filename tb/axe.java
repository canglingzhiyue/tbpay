package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.List;
import java.util.Map;
import tb.awc;

/* loaded from: classes2.dex */
public class axe extends aru {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_UTAP = 38447420286L;

    /* renamed from: a  reason: collision with root package name */
    private final String f25667a = "AURADXUTapEventHandler";

    static {
        kge.a(1801848368);
    }

    public static /* synthetic */ Object ipc$super(axe axeVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // tb.aru
    public boolean a(d dVar, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("673e7098", new Object[]{this, dVar, sVar})).booleanValue();
        }
        AURARenderComponent d = dVar.d();
        AURARenderComponentData aURARenderComponentData = d.data;
        if (aURARenderComponentData == null) {
            bqe.a().c("AURADXUTapEventHandler", "handleEvent#UMFRenderComponentData is null");
            return false;
        }
        Map<String, List<Event>> map = aURARenderComponentData.events;
        if (map == null || map.isEmpty()) {
            bqd a2 = bqe.a();
            a2.c("AURADXUTapEventHandler", "handleEvent#there is no events in component," + d);
            return false;
        }
        a(dVar, map, sVar);
        return true;
    }

    private void a(d dVar, Map<String, List<Event>> map, s sVar) {
        List<Event> value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("483b189f", new Object[]{this, dVar, map, sVar});
            return;
        }
        String b = dVar.b();
        awc.b(new awc.a(sVar, dVar.d(), null, dVar.b()));
        for (Map.Entry<String, List<Event>> entry : map.entrySet()) {
            if (entry != null && b.equals(entry.getKey()) && (value = entry.getValue()) != null && !value.isEmpty()) {
                int size = value.size();
                for (Event event : value) {
                    d dVar2 = size > 1 ? new d(dVar) : dVar;
                    dVar2.a(event.getFields());
                    a(event.getType(), dVar2, sVar);
                }
            }
        }
    }
}
