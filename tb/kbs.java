package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.component.DWComponent;
import com.taobao.avplayer.core.component.b;
import com.taobao.avplayer.core.protocol.DWInteractiveObject;
import com.taobao.avplayer.core.protocol.DWTimelineObject;
import com.taobao.avplayer.interactivelifecycle.display.a;
import com.taobao.avplayer.interactivelifecycle.display.c;
import com.taobao.avplayer.interactivelifecycle.display.d;
import java.util.ArrayList;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public class kbs extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DWTimelineObject[] e;
    private boolean f;

    static {
        kge.a(1658462324);
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "4";
    }

    public kbs(DWContext dWContext, d dVar) {
        super(dWContext, dVar);
    }

    @Override // com.taobao.avplayer.interactivelifecycle.display.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.f) {
            this.f = true;
            JSONArray interactive = this.d.getInteractive(e());
            if (interactive == null) {
                return;
            }
            int length = interactive.length();
            this.f16514a = new ArrayList(length);
            this.e = new DWTimelineObject[length];
            for (int i = 0; i < length; i++) {
                this.e[i] = new DWTimelineObject(interactive.optJSONObject(i));
            }
            for (int i2 = 0; i2 < length; i2++) {
                DWTimelineObject dWTimelineObject = this.e[i2];
                c cVar = new c();
                cVar.b = dWTimelineObject.getStartTime();
                cVar.c = dWTimelineObject.getEndTime();
                cVar.e = a(dWTimelineObject, DWVideoScreenType.NORMAL);
                cVar.f = a(dWTimelineObject, DWVideoScreenType.PORTRAIT_FULL_SCREEN);
                cVar.g = a(dWTimelineObject, DWVideoScreenType.LANDSCAPE_FULL_SCREEN);
                cVar.i = dWTimelineObject.getUtParams();
                this.f16514a.add(i2, cVar);
                a(cVar.e, cVar.f, cVar.g);
            }
        }
    }

    @Override // com.taobao.avplayer.interactivelifecycle.display.b
    public Class<? extends DWComponent> a(DWInteractiveObject dWInteractiveObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("9a038dc5", new Object[]{this, dWInteractiveObject});
        }
        if (dWInteractiveObject == null) {
            return null;
        }
        String type = dWInteractiveObject.getType();
        if (type.equalsIgnoreCase(kcf.f29958a) && kck.c) {
            return b.a(kcf.d);
        }
        if (!type.equalsIgnoreCase(kcf.b)) {
            return null;
        }
        return b.a(kcf.b);
    }
}
