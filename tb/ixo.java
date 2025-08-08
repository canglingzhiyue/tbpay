package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import java.util.Map;

/* loaded from: classes2.dex */
public class ixo implements brd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f29397a;
    private final String b;

    static {
        kge.a(1633466930);
        kge.a(371667525);
    }

    public ixo(Context context, String str) {
        this.f29397a = context;
        this.b = str;
    }

    @Override // tb.brd
    public void a(AURARenderComponent aURARenderComponent, DXEvent dXEvent, Object[] objArr, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("967ab349", new Object[]{this, aURARenderComponent, dXEvent, objArr, map});
        } else if (!(dXEvent instanceof DXScrollEvent) || objArr.length < 2 || objArr[0] == null) {
        } else {
            String obj = objArr[1].toString();
            if (StringUtils.isEmpty(obj)) {
                return;
            }
            map.put(obj, Integer.valueOf(gbg.c(this.f29397a, ((DXScrollEvent) dXEvent).getOffsetX())));
        }
    }

    @Override // tb.brd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public Class<? extends DXEvent> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("6a1d2296", new Object[]{this}) : DXScrollEvent.class;
    }
}
