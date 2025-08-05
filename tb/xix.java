package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.handler.event.a;
import com.taobao.android.detail.ttdetail.utils.af;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class xix implements bn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ID;
    public static final String TOUCH_DOWN_SUFFIXES = "_touchdown";

    /* renamed from: a  reason: collision with root package name */
    public Context f34317a;
    public eyx b;
    public xja c = new xja();

    @Override // com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        }
    }

    static {
        kge.a(-841875011);
        kge.a(600646234);
        DX_EVENT_ID = fxa.a("handleDXTouchDownEvent");
    }

    public xix(Context context, eyx eyxVar) {
        this.f34317a = context;
        this.b = eyxVar;
    }

    @Override // com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Feature feature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        i.a("TouchDown HandleDXTouchDownEvent handleEvent");
        pir pirVar = (pir) this.b.a().a(pkw.PARSER_ID);
        if (pirVar == null || (feature = (Feature) pirVar.a(Feature.class)) == null || !feature.isEnableBuyNowTouchDown() || objArr == null || objArr.length <= 0) {
            return;
        }
        Object obj = objArr[0];
        if (obj instanceof JSONArray) {
            this.b.c().a(a((JSONArray) obj), af.a(objArr, dXRuntimeContext, this.b));
        } else if (!(obj instanceof String)) {
        } else {
            a(dXEvent, objArr, dXRuntimeContext);
        }
    }

    private List<a> a(JSONArray jSONArray) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9355ab7", new Object[]{this, jSONArray});
        }
        ArrayList arrayList = new ArrayList(1);
        Iterator<Object> it = jSONArray.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if ((next instanceof JSONObject) && (a2 = a((JSONObject) next)) != null) {
                arrayList.add(new a(a2));
                break;
            }
        }
        return arrayList;
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        String string = jSONObject.getString("type");
        if (!"buyNow".equals(string)) {
            return null;
        }
        JSONObject jSONObject2 = (JSONObject) jSONObject.clone();
        jSONObject2.put("type", (Object) (string + TOUCH_DOWN_SUFFIXES));
        return jSONObject2;
    }

    private void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd72af8", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0 || (e = dXRuntimeContext.e()) == null) {
        } else {
            this.b.c().a(new eyy(e, this.c).a((String) objArr[0]), af.a(objArr, dXRuntimeContext, this.b));
        }
    }
}
