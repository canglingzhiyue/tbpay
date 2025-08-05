package tb;

import android.text.Editable;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXTextInputEvent;
import java.util.Map;

/* loaded from: classes2.dex */
public class brg implements brd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f26059a;

    static {
        kge.a(657449156);
        kge.a(371667525);
    }

    public brg(String str) {
        this.f26059a = str;
    }

    @Override // tb.brd
    public void a(AURARenderComponent aURARenderComponent, DXEvent dXEvent, Object[] objArr, Map<String, Object> map) {
        Editable text;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("967ab349", new Object[]{this, aURARenderComponent, dXEvent, objArr, map});
        } else if (!(dXEvent instanceof DXTextInputEvent) || (text = ((DXTextInputEvent) dXEvent).getText()) == null) {
        } else {
            map.put("text", text.toString());
        }
    }

    @Override // tb.brd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f26059a;
    }

    public Class<? extends DXEvent> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("6a1d2296", new Object[]{this}) : DXTextInputEvent.class;
    }
}
