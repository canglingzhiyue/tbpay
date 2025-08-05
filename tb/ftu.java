package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes.dex */
public class ftu extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AUTO_CLEAR_VIDEO = "autoClearVideo";
    public static final String AUTO_HANDLE_APPLICATION_EVENT = "autoHandleApplicationEvent";
    public static final long DX_PARSER_VIDEOCONTROLCONFIG = -7801350391660369312L;
    public static final String LOOP_PLAY = "isLoop";
    public static final String MAX_PLATING_VIDEO = "maxParallelCount";
    public static final String ORDER = "order";
    public static final String PLAY_DELAY = "timeFactor";
    public static final String REFRESH_VIDEO_PLAY_CONTROL = "refreshVideoPlayControl";
    public static final String VIEW_AREA_PERCENT = "spaceFactor";
    public static final String WIDGET_CLASS = "widgetClass";

    static {
        kge.a(909163585);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "videoControlConfig";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || objArr.length != 1) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (!jSONObject.containsKey(WIDGET_CLASS)) {
            return null;
        }
        DXVideoControlConfig<fxw> b = DXVideoControlConfig.b();
        if (jSONObject.containsKey(VIEW_AREA_PERCENT)) {
            b.a(jSONObject.getFloatValue(VIEW_AREA_PERCENT));
        }
        if (jSONObject.containsKey(MAX_PLATING_VIDEO)) {
            b.b(jSONObject.getIntValue(MAX_PLATING_VIDEO));
        }
        if (jSONObject.containsKey(PLAY_DELAY)) {
            b.a(jSONObject.getLongValue(PLAY_DELAY));
        }
        if (jSONObject.containsKey(REFRESH_VIDEO_PLAY_CONTROL)) {
            b.f(jSONObject.getBooleanValue(REFRESH_VIDEO_PLAY_CONTROL));
        }
        if (jSONObject.containsKey(LOOP_PLAY)) {
            b.b(jSONObject.getBooleanValue(LOOP_PLAY));
        }
        if (jSONObject.containsKey("order")) {
            b.c(jSONObject.getIntValue("order"));
        }
        if (jSONObject.containsKey(AUTO_CLEAR_VIDEO)) {
            b.d(jSONObject.getBooleanValue(AUTO_CLEAR_VIDEO));
        }
        if (jSONObject.containsKey(AUTO_HANDLE_APPLICATION_EVENT)) {
            b.e(jSONObject.getBooleanValue(AUTO_HANDLE_APPLICATION_EVENT));
        }
        b.c(true);
        try {
            Object obj2 = jSONObject.get(WIDGET_CLASS);
            JSONArray jSONArray = new JSONArray();
            if (obj2 instanceof String) {
                jSONArray.add(obj2);
            }
            if (obj2 instanceof JSONArray) {
                jSONArray.addAll((JSONArray) obj2);
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                Class<?> cls = Class.forName(jSONArray.getString(i));
                if (DXWidgetNode.class.isAssignableFrom(cls)) {
                    b.a(cls);
                }
            }
            return b;
        } catch (Exception e) {
            a.b(e);
            return null;
        }
    }
}
