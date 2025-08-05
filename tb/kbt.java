package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.component.DWComponent;
import com.taobao.avplayer.core.component.b;
import com.taobao.avplayer.core.protocol.DWInteractiveObject;
import com.taobao.avplayer.core.protocol.DWTimelineObject;
import com.taobao.avplayer.interactivelifecycle.display.DWSourceTypeEnum;
import com.taobao.avplayer.interactivelifecycle.display.a;
import com.taobao.avplayer.interactivelifecycle.display.c;
import com.taobao.avplayer.interactivelifecycle.display.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public class kbt extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DWTimelineObject[] e;

    static {
        kge.a(-2137043344);
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "1";
    }

    public kbt(DWContext dWContext, d dVar) {
        super(dWContext, dVar);
    }

    @Override // com.taobao.avplayer.interactivelifecycle.display.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        JSONArray interactive = this.d.getInteractive(e());
        if (interactive == null) {
            return;
        }
        int length = interactive.length();
        this.e = new DWTimelineObject[length];
        this.f16514a = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            this.e[i] = new DWTimelineObject(interactive.optJSONObject(i));
        }
        Arrays.sort(this.e);
        Map<String, Boolean> whiteWeexCmpList = this.c.getWhiteWeexCmpList();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < length; i2++) {
            DWTimelineObject dWTimelineObject = this.e[i2];
            if (dWTimelineObject != null) {
                if (whiteWeexCmpList.size() > 0) {
                    if (!TextUtils.isEmpty(dWTimelineObject.getSource())) {
                        Boolean bool = whiteWeexCmpList.get(dWTimelineObject.getSource());
                        if (bool != null) {
                            if (!bool.booleanValue()) {
                            }
                        }
                    }
                }
            }
            arrayList.add(dWTimelineObject.getSource());
            c cVar = new c();
            cVar.b = dWTimelineObject.getStartTime();
            cVar.c = dWTimelineObject.getEndTime();
            cVar.e = a(dWTimelineObject, DWVideoScreenType.NORMAL);
            cVar.f = a(dWTimelineObject, DWVideoScreenType.PORTRAIT_FULL_SCREEN);
            cVar.g = a(dWTimelineObject, DWVideoScreenType.LANDSCAPE_FULL_SCREEN);
            cVar.i = dWTimelineObject.getUtParams();
            cVar.k = dWTimelineObject.getSource();
            if (!this.f16514a.contains(cVar)) {
                this.f16514a.add(cVar);
            }
            a(cVar.e, cVar.f, cVar.g);
        }
        this.c.getWXCmpUtilsCallback();
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
        String str = dWInteractiveObject.mSource;
        if (type.equalsIgnoreCase(kcf.f29958a) && kck.c) {
            return b.a(kcf.f29958a);
        }
        if (type.equalsIgnoreCase(kcf.b)) {
            return b.a(kcf.b);
        }
        if (type.equalsIgnoreCase(kcf.c) && DWSourceTypeEnum.CONTENTTAGTRACE.getValue().equalsIgnoreCase(str)) {
            return b.a(kcf.f);
        }
        if (type.equalsIgnoreCase(kcf.c) && DWSourceTypeEnum.CONTENTTAG.getValue().equalsIgnoreCase(str)) {
            return b.a(kcf.g);
        }
        return null;
    }
}
