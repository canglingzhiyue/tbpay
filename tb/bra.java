package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bra extends bqy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_UTAP = 38447420286L;

    /* renamed from: a  reason: collision with root package name */
    private final String f26055a = "UMFDXUTapEventHandler";

    static {
        kge.a(-407949266);
    }

    public static /* synthetic */ Object ipc$super(bra braVar, String str, Object... objArr) {
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

    @Override // tb.bqy
    public boolean a(brh brhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e24699c4", new Object[]{this, brhVar})).booleanValue();
        }
        AURARenderComponent d = brhVar.d();
        AURARenderComponentData aURARenderComponentData = d.data;
        if (aURARenderComponentData == null) {
            bqe.a().c("UMFDXUTapEventHandler", "handleEvent#UMFRenderComponentData is null");
            return false;
        }
        Map<String, List<Event>> map = aURARenderComponentData.events;
        if (map == null || map.isEmpty()) {
            bqd a2 = bqe.a();
            a2.c("UMFDXUTapEventHandler", "handleEvent#there is no events in component," + d);
            return false;
        }
        a(brhVar, map);
        return true;
    }

    private void a(brh brhVar, Map<String, List<Event>> map) {
        List<Event> value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4c89c5", new Object[]{this, brhVar, map});
            return;
        }
        String a2 = brhVar.a();
        for (Map.Entry<String, List<Event>> entry : map.entrySet()) {
            if (entry != null && a2.equals(entry.getKey()) && (value = entry.getValue()) != null && !value.isEmpty()) {
                for (Event event : value) {
                    brhVar.a(event.getType());
                    brhVar.a(event.getFields());
                    b(brhVar);
                }
            }
        }
    }
}
