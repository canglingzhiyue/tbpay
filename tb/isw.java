package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.home.component.utils.e;
import com.taobao.tao.homepage.d;
import com.taobao.tao.recommend3.util.c;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public class isw extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RTABITEMTAP = 305530556085745992L;

    static {
        kge.a(1892176103);
    }

    public static /* synthetic */ Object ipc$super(isw iswVar, String str, Object... objArr) {
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

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        ksp.a("RTabItemTapEventHandler", "d3 handleEvent");
        if (objArr == null || objArr.length <= 0) {
            lap.a("RTabItemTapEventHandler", "argsObj check", "argsObj :" + Arrays.toString(objArr));
            return;
        }
        View a2 = c.a(dXRuntimeContext.s());
        JSONObject e = dXRuntimeContext.e();
        List asList = Arrays.asList(objArr);
        if (e == null || a2 == null) {
            return;
        }
        a(asList, e);
        a(asList, dXRuntimeContext);
        a(asList, e, a2, a(asList));
        b(asList, e);
    }

    private boolean a(List list, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("19a074ce", new Object[]{this, list, new Integer(i)})).booleanValue() : i < list.size();
    }

    private void a(List list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bd60b7", new Object[]{this, list, jSONObject});
            return;
        }
        JSONObject jSONObject2 = null;
        if (!a(list, 0)) {
            e.e("RTabItemTapEventHandler", "selectStatus isAllowParamsIndex false. index : 0");
            return;
        }
        if (list.get(0) instanceof JSONObject) {
            jSONObject2 = (JSONObject) list.get(0);
        }
        if (jSONObject.getJSONObject("_recmdStatus") == null) {
            jSONObject.put("_recmdStatus", (Object) jSONObject2);
            e.e("RTabItemTapEventHandler", "current status json is " + jSONObject2);
            return;
        }
        jSONObject.getJSONObject("_recmdStatus").putAll(jSONObject2);
        e.e("RTabItemTapEventHandler", "current status json is " + jSONObject.getJSONObject("_recmdStatus"));
    }

    private void a(List list, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c2a950a", new Object[]{this, list, dXRuntimeContext});
        } else if (!a(list, 1)) {
            e.e("RTabItemTapEventHandler", "refreshUi isAllowParamsIndex false. index : 1");
        } else {
            if (!(list.get(1) instanceof String ? Boolean.parseBoolean((String) list.get(1)) : false)) {
                return;
            }
            dXRuntimeContext.D().a(dXRuntimeContext.d().queryRootWidgetNode(), 0, new DXWidgetRefreshOption.a().a(true).a(3).a());
        }
    }

    private String a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{this, list});
        }
        if (!a(list, 5)) {
            e.e("RTabItemTapEventHandler", "getRefreshType isAllowParamsIndex false. index : 5");
            return null;
        } else if (!(list.get(5) instanceof String)) {
            return null;
        } else {
            return (String) list.get(5);
        }
    }

    private void a(List list, JSONObject jSONObject, View view, String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a136a7c5", new Object[]{this, list, jSONObject, view, str});
        } else if (!a(list, 3)) {
            e.e("RTabItemTapEventHandler", "doRequest isAllowParamsIndex false. index : INDEX_NEED_REQUEST");
        } else {
            if (list.get(3) instanceof String) {
                z = Boolean.parseBoolean((String) list.get(3));
            }
            if (!z) {
                return;
            }
            if (!a(list, 2)) {
                e.e("RTabItemTapEventHandler", "doRequest isAllowParamsIndex false. index : INDEX_REQUEST_PARAM");
                return;
            }
            JSONObject jSONObject2 = null;
            if (list.get(2) instanceof JSONObject) {
                jSONObject2 = (JSONObject) list.get(2);
            }
            Object tag = view.getTag(R.id.tag_recommend_datasource);
            Object tag2 = view.getTag(R.id.tag_recommend_container);
            if (tag == null && (tag2 instanceof osm)) {
                a((osm) tag2, jSONObject, jSONObject2, str);
            } else if (tag instanceof osm) {
                a((osm) tag, jSONObject, jSONObject2, str);
            } else if (tag != null) {
            } else {
                a(jSONObject, view, jSONObject2, str);
            }
        }
    }

    private void a(osm osmVar, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        int a2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6855979", new Object[]{this, osmVar, jSONObject, jSONObject2, str});
        } else if (osmVar == null) {
        } else {
            e.e("RTabItemTapEventHandler", "r4ReplaceRequest  refreshType :" + str);
            if (!TextUtils.equals("all", str)) {
                i = ((str == null || TextUtils.equals("afterSelf", str)) && (a2 = opb.a(jSONObject.getString("sectionBizCode"), new ArrayList(osmVar.j()))) != -1) ? a2 + 1 : -1;
            }
            if (i == -1) {
                return;
            }
            osmVar.a(new kso(i, -1), jSONObject2);
        }
    }

    private void b(List list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd8df56", new Object[]{this, list, jSONObject});
            return;
        }
        JSONObject jSONObject2 = null;
        if (list.get(4) instanceof JSONObject) {
            jSONObject2 = (JSONObject) list.get(4);
        }
        if (jSONObject2 == null) {
            return;
        }
        kss.a(jSONObject, jSONObject2.getJSONObject("item"), jSONObject2.getJSONObject("custom"));
    }

    private void a(JSONObject jSONObject, View view, JSONObject jSONObject2, String str) {
        int a2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d76830", new Object[]{this, jSONObject, view, jSONObject2, str});
            return;
        }
        Object tag = view.getTag(R.id.tag_recommend_containerId);
        String obj = tag == null ? null : tag.toString();
        if (!TextUtils.equals("all", str)) {
            i = ((str == null || TextUtils.equals("afterSelf", str)) && (a2 = opb.a(jSONObject.getString("sectionBizCode"), d.f(obj).g(obj))) != -1) ? a2 + 1 : -1;
        }
        if (i == -1) {
            return;
        }
        a(obj, new kso(i, -1), jSONObject2);
    }

    public void a(String str, kso ksoVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22cdb15", new Object[]{this, str, ksoVar, jSONObject});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                jSONObject2.putAll(jSONObject);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("bizParam", (Object) jSONObject2);
            jSONObject3.put("forceRequest", (Object) "true");
            jSONObject3.put(osp.NATIVE_CUSTOM_PARAMS, (Object) ksoVar);
            if (oqc.b(str)) {
                opb.a("ViewClick", oqc.f32275a, new String[]{str}, jSONObject3);
                return;
            }
            JSONObject k = c.k(str);
            opb.a("ViewClick", opb.b, k, c.a(k), jSONObject3);
        }
    }
}
