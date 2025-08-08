package tb;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.android.bindingx.core.i;
import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.o;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ae;
import com.taobao.android.dinamicx.expression.event.bindingx.DXBindingXStateChangeEvent;
import com.taobao.android.dinamicx.m;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.b;
import com.taobao.android.dinamicx.r;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.weex_framework.util.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class fqb extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public bbq c;
    public fqd d;

    static {
        kge.a(-954811363);
    }

    public static /* synthetic */ Object ipc$super(fqb fqbVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(fqb fqbVar, DXRootView dXRootView, DXWidgetNode dXWidgetNode, fqe fqeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea94aa3", new Object[]{fqbVar, dXRootView, dXWidgetNode, fqeVar});
        } else {
            fqbVar.b(dXRootView, dXWidgetNode, fqeVar);
        }
    }

    public static /* synthetic */ void a(fqb fqbVar, DXWidgetNode dXWidgetNode, fqe fqeVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62fa3335", new Object[]{fqbVar, dXWidgetNode, fqeVar, new Integer(i), new Boolean(z)});
        } else {
            fqbVar.a(dXWidgetNode, fqeVar, i, z);
        }
    }

    public static /* synthetic */ void a(fqb fqbVar, Map map, fqe fqeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e21e1a", new Object[]{fqbVar, map, fqeVar});
        } else {
            fqbVar.a(map, fqeVar);
        }
    }

    public fqb(r rVar) {
        super(rVar);
        fqc fqcVar = new fqc();
        fqg fqgVar = new fqg();
        this.d = new fqd();
        this.c = bbq.a(fqcVar, (i.b) null, fqgVar, this.d);
    }

    public fqe a(DinamicXEngine dinamicXEngine, String str, JSONObject jSONObject, Map<String, Object> map) {
        JSONObject jSONObject2;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fqe) ipChange.ipc$dispatch("188fe614", new Object[]{this, dinamicXEngine, str, jSONObject, map});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(str)) == null) {
            return null;
        }
        fqe fqeVar = new fqe();
        fqeVar.f28115a = str;
        fqeVar.c = jSONObject2.getString("eventType");
        fqeVar.k = jSONObject2;
        fqeVar.h = "true".equalsIgnoreCase(jSONObject2.getString("useConstantArgs"));
        if (map != null && map.containsKey("resetOnStop")) {
            string = (String) map.get("resetOnStop");
        } else {
            string = jSONObject2.getString("resetOnStop");
        }
        if (!StringUtils.isEmpty(string)) {
            fqeVar.e = !string.equalsIgnoreCase("false");
        }
        if (map != null && map.containsKey("resetOnFinish")) {
            string2 = (String) map.get("resetOnFinish");
        } else {
            string2 = jSONObject2.getString("resetOnFinish");
        }
        if (!StringUtils.isEmpty(string2)) {
            fqeVar.d = !string2.equalsIgnoreCase("false");
        }
        if (!fqeVar.e) {
            if (map != null && map.containsKey("updateFlattenOnlyOnStop")) {
                string5 = (String) map.get("updateFlattenOnlyOnStop");
            } else {
                string5 = jSONObject2.getString("updateFlattenOnlyOnStop");
            }
            if (!StringUtils.isEmpty(string5)) {
                fqeVar.f = "true".equalsIgnoreCase(string5);
            }
        }
        if (!fqeVar.d) {
            if (map != null && map.containsKey("updateFlattenOnlyOnFinish")) {
                string4 = (String) map.get("updateFlattenOnlyOnFinish");
            } else {
                string4 = jSONObject2.getString("updateFlattenOnlyOnFinish");
            }
            if (!StringUtils.isEmpty(string4)) {
                fqeVar.g = "true".equalsIgnoreCase(string4);
            }
        }
        if (map != null && map.containsKey(a.ATOM_EXT_repeat)) {
            string3 = (String) map.get(a.ATOM_EXT_repeat);
        } else {
            string3 = jSONObject2.getString(a.ATOM_EXT_repeat);
        }
        if (!StringUtils.isEmpty(string3)) {
            fqeVar.i = string3.equals("true");
        }
        fqeVar.j = jSONObject2.getJSONArray("props");
        fqeVar.l = jSONObject2.getJSONObject(BindingXConstants.KEY_EXIT_EXPRESSION);
        a(dinamicXEngine, fqeVar, map);
        return fqeVar;
    }

    private void a(DinamicXEngine dinamicXEngine, fqe fqeVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb486bd6", new Object[]{this, dinamicXEngine, fqeVar, map});
            return;
        }
        JSONArray jSONArray = fqeVar.j;
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                a(dinamicXEngine, jSONObject.getJSONObject("expression").getJSONObject(BindingXConstants.KEY_TRANSFORMED), map, a(jSONObject));
            }
        }
        JSONObject jSONObject2 = fqeVar.l;
        if (jSONObject2 != null) {
            a(dinamicXEngine, jSONObject2.getJSONObject(BindingXConstants.KEY_TRANSFORMED), map, false);
        }
        if (jSONArray == null) {
            return;
        }
        for (int i2 = 0; i2 < jSONArray.size(); i2++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
            String string = jSONObject3.getString(BindingXConstants.KEY_ELEMENT);
            if (!StringUtils.isEmpty(string) && string.startsWith("$")) {
                jSONObject3.put(BindingXConstants.KEY_ELEMENT, (Object) a(map, string));
            }
        }
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("property");
        return "transform.translate".equals(string) || "transform.translateX".equals(string) || "transform.translateY".equals(string) || "width".equals(string) || "height".equals(string);
    }

    private void a(DXWidgetNode dXWidgetNode, JSONObject jSONObject, int i, boolean z) {
        DXWidgetNode queryWidgetNodeByUserId;
        ViewGroup.LayoutParams layoutParams;
        View v;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        View v2;
        ViewGroup.LayoutParams layoutParams4;
        View v3;
        Drawable background;
        View v4;
        View v5;
        View v6;
        View v7;
        View v8;
        View v9;
        View v10;
        View v11;
        View v12;
        View v13;
        View v14;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a5ddfa", new Object[]{this, dXWidgetNode, jSONObject, new Integer(i), new Boolean(z)});
            return;
        }
        String string = jSONObject.getString("property");
        if (jSONObject == null || StringUtils.isEmpty(string)) {
            return;
        }
        DXWidgetNode dXWidgetNode2 = null;
        WeakReference weakReference = (WeakReference) jSONObject.get("element_widgetnode");
        if (weakReference == null || weakReference.get() == null) {
            String a2 = a(jSONObject.getString(BindingXConstants.KEY_ELEMENT));
            if ("this".equalsIgnoreCase(a2)) {
                dXWidgetNode2 = dXWidgetNode;
            } else if (!fqi.b(dXWidgetNode.getDXRuntimeContext())) {
                dXWidgetNode2 = dXWidgetNode.queryWTByUserId(a2);
            }
            queryWidgetNodeByUserId = dXWidgetNode2 == null ? dXWidgetNode.queryWidgetNodeByUserId(a2) : dXWidgetNode2;
            if (queryWidgetNodeByUserId == null) {
                return;
            }
            jSONObject.put("element_widgetnode", (Object) new WeakReference(queryWidgetNodeByUserId));
        } else {
            queryWidgetNodeByUserId = (DXWidgetNode) weakReference.get();
        }
        if ("opacity".equals(string)) {
            if (i != 1) {
                if (i != 2 || (v14 = queryWidgetNodeByUserId.getDXRuntimeContext().v()) == null) {
                    return;
                }
                v14.setAlpha(queryWidgetNodeByUserId.getAlpha());
                return;
            }
            View v15 = queryWidgetNodeByUserId.getDXRuntimeContext().v();
            if (v15 == null) {
                return;
            }
            if (!z) {
                queryWidgetNodeByUserId.setAlpha(v15.getAlpha());
            }
            DXWidgetNode a3 = a(queryWidgetNodeByUserId);
            if (a3 == null) {
                return;
            }
            a3.setAlpha(v15.getAlpha());
        } else if ("transform.translate".equals(string)) {
            if (i != 1) {
                if (i != 2 || (v13 = queryWidgetNodeByUserId.getDXRuntimeContext().v()) == null) {
                    return;
                }
                v13.setTranslationX(queryWidgetNodeByUserId.getTranslateX());
                v13.setTranslationY(queryWidgetNodeByUserId.getTranslateY());
                return;
            }
            View v16 = queryWidgetNodeByUserId.getDXRuntimeContext().v();
            if (v16 == null) {
                return;
            }
            float translationX = v16.getTranslationX();
            float translationY = v16.getTranslationY();
            if (!z) {
                queryWidgetNodeByUserId.setTranslateX(translationX);
                queryWidgetNodeByUserId.setTranslateY(translationY);
            }
            DXWidgetNode a4 = a(queryWidgetNodeByUserId);
            if (a4 == null) {
                return;
            }
            a4.setTranslateX(translationX);
            a4.setTranslateY(translationY);
        } else if ("transform.translateX".equals(string)) {
            if (i != 1) {
                if (i != 2 || (v12 = queryWidgetNodeByUserId.getDXRuntimeContext().v()) == null) {
                    return;
                }
                v12.setTranslationX(queryWidgetNodeByUserId.getTranslateX());
                return;
            }
            View v17 = queryWidgetNodeByUserId.getDXRuntimeContext().v();
            if (v17 == null) {
                return;
            }
            float translationX2 = v17.getTranslationX();
            if (!z) {
                queryWidgetNodeByUserId.setTranslateX(translationX2);
            }
            DXWidgetNode a5 = a(queryWidgetNodeByUserId);
            if (a5 == null) {
                return;
            }
            a5.setTranslateX(translationX2);
        } else if ("transform.translateY".equals(string)) {
            if (i != 1) {
                if (i != 2 || (v11 = queryWidgetNodeByUserId.getDXRuntimeContext().v()) == null) {
                    return;
                }
                v11.setTranslationY(queryWidgetNodeByUserId.getTranslateY());
                return;
            }
            View v18 = queryWidgetNodeByUserId.getDXRuntimeContext().v();
            if (v18 == null) {
                return;
            }
            float translationY2 = v18.getTranslationY();
            if (!z) {
                queryWidgetNodeByUserId.setTranslateY(translationY2);
            }
            DXWidgetNode a6 = a(queryWidgetNodeByUserId);
            if (a6 == null) {
                return;
            }
            a6.setTranslateY(translationY2);
        } else if ("transform.scale".equals(string)) {
            if (i != 1) {
                if (i != 2 || (v10 = queryWidgetNodeByUserId.getDXRuntimeContext().v()) == null) {
                    return;
                }
                v10.setScaleX(queryWidgetNodeByUserId.getScaleX());
                v10.setScaleY(queryWidgetNodeByUserId.getScaleY());
                return;
            }
            View v19 = queryWidgetNodeByUserId.getDXRuntimeContext().v();
            if (v19 == null) {
                return;
            }
            float scaleX = v19.getScaleX();
            float scaleY = v19.getScaleY();
            if (!z) {
                queryWidgetNodeByUserId.setScaleX(scaleX);
                queryWidgetNodeByUserId.setScaleY(scaleY);
            }
            DXWidgetNode a7 = a(queryWidgetNodeByUserId);
            if (a7 == null) {
                return;
            }
            a7.setScaleX(scaleX);
            a7.setScaleY(scaleY);
        } else if ("transform.scaleX".equals(string)) {
            if (i != 1) {
                if (i != 2 || (v9 = queryWidgetNodeByUserId.getDXRuntimeContext().v()) == null) {
                    return;
                }
                v9.setScaleX(queryWidgetNodeByUserId.getScaleX());
                return;
            }
            View v20 = queryWidgetNodeByUserId.getDXRuntimeContext().v();
            if (v20 == null) {
                return;
            }
            float scaleX2 = v20.getScaleX();
            if (!z) {
                queryWidgetNodeByUserId.setScaleX(scaleX2);
            }
            DXWidgetNode a8 = a(queryWidgetNodeByUserId);
            if (a8 == null) {
                return;
            }
            a8.setScaleX(scaleX2);
        } else if ("transform.scaleY".equals(string)) {
            if (i != 1) {
                if (i != 2 || (v8 = queryWidgetNodeByUserId.getDXRuntimeContext().v()) == null) {
                    return;
                }
                v8.setScaleY(queryWidgetNodeByUserId.getScaleY());
                return;
            }
            View v21 = queryWidgetNodeByUserId.getDXRuntimeContext().v();
            if (v21 == null) {
                return;
            }
            float scaleY2 = v21.getScaleY();
            if (!z) {
                queryWidgetNodeByUserId.setScaleY(scaleY2);
            }
            DXWidgetNode a9 = a(queryWidgetNodeByUserId);
            if (a9 == null) {
                return;
            }
            a9.setScaleY(scaleY2);
        } else if ("transform.rotateX".equals(string)) {
            if (i != 1) {
                if (i != 2 || (v7 = queryWidgetNodeByUserId.getDXRuntimeContext().v()) == null) {
                    return;
                }
                v7.setRotationX(queryWidgetNodeByUserId.getRotationX());
                return;
            }
            View v22 = queryWidgetNodeByUserId.getDXRuntimeContext().v();
            if (v22 == null) {
                return;
            }
            float rotationX = v22.getRotationX();
            if (!z) {
                queryWidgetNodeByUserId.setRotationX(rotationX);
            }
            DXWidgetNode a10 = a(queryWidgetNodeByUserId);
            if (a10 == null) {
                return;
            }
            a10.setRotationX(rotationX);
        } else if ("transform.rotateY".equals(string)) {
            if (i != 1) {
                if (i != 2 || (v6 = queryWidgetNodeByUserId.getDXRuntimeContext().v()) == null) {
                    return;
                }
                v6.setRotationY(queryWidgetNodeByUserId.getRotationY());
                return;
            }
            View v23 = queryWidgetNodeByUserId.getDXRuntimeContext().v();
            if (v23 == null) {
                return;
            }
            float rotationY = v23.getRotationY();
            if (!z) {
                queryWidgetNodeByUserId.setRotationY(rotationY);
            }
            DXWidgetNode a11 = a(queryWidgetNodeByUserId);
            if (a11 == null) {
                return;
            }
            a11.setRotationY(rotationY);
        } else if ("transform.rotateZ".equals(string)) {
            if (i != 1) {
                if (i != 2 || (v5 = queryWidgetNodeByUserId.getDXRuntimeContext().v()) == null) {
                    return;
                }
                v5.setRotation(queryWidgetNodeByUserId.getRotationZ());
                return;
            }
            View v24 = queryWidgetNodeByUserId.getDXRuntimeContext().v();
            if (v24 == null) {
                return;
            }
            float rotation = v24.getRotation();
            if (!z) {
                queryWidgetNodeByUserId.setRotationZ(rotation);
            }
            DXWidgetNode a12 = a(queryWidgetNodeByUserId);
            if (a12 == null) {
                return;
            }
            a12.setRotationZ(rotation);
        } else if ("background-color".equals(string)) {
            if (i != 1) {
                if (i != 2 || (v4 = queryWidgetNodeByUserId.getDXRuntimeContext().v()) == null) {
                    return;
                }
                v4.setBackgroundColor(queryWidgetNodeByUserId.getBackGroundColor());
                return;
            }
            View v25 = queryWidgetNodeByUserId.getDXRuntimeContext().v();
            if (v25 == null || (background = v25.getBackground()) == null || !(background instanceof ColorDrawable)) {
                return;
            }
            if (!z) {
                queryWidgetNodeByUserId.setBackGroundColor(((ColorDrawable) background).getColor());
            }
            DXWidgetNode a13 = a(queryWidgetNodeByUserId);
            if (a13 == null) {
                return;
            }
            a13.setBackGroundColor(((ColorDrawable) background).getColor());
        } else if ("color".equals(string)) {
            if (!(queryWidgetNodeByUserId instanceof af)) {
                return;
            }
            if (i != 1) {
                if (i != 2 || (v3 = queryWidgetNodeByUserId.getDXRuntimeContext().v()) == null || !(v3 instanceof TextView)) {
                    return;
                }
                ((TextView) v3).setTextColor(((af) queryWidgetNodeByUserId).getTextColor());
                return;
            }
            View v26 = queryWidgetNodeByUserId.getDXRuntimeContext().v();
            if (v26 == null || !(v26 instanceof TextView)) {
                return;
            }
            int currentTextColor = ((TextView) v26).getCurrentTextColor();
            if (!z) {
                ((af) queryWidgetNodeByUserId).setTextColor(currentTextColor);
            }
            DXWidgetNode a14 = a(queryWidgetNodeByUserId);
            if (a14 == null || !(a14 instanceof af)) {
                return;
            }
            ((af) a14).setTextColor(currentTextColor);
        } else if ("width".equals(string)) {
            if (i != 1) {
                if (i != 2 || (v2 = queryWidgetNodeByUserId.getDXRuntimeContext().v()) == null || (layoutParams4 = v2.getLayoutParams()) == null) {
                    return;
                }
                layoutParams4.width = queryWidgetNodeByUserId.getMeasuredWidth();
                v2.setLayoutParams(layoutParams4);
                return;
            }
            View v27 = queryWidgetNodeByUserId.getDXRuntimeContext().v();
            if (v27 == null || (layoutParams3 = v27.getLayoutParams()) == null) {
                return;
            }
            int i2 = layoutParams3.width;
            if (!z) {
                queryWidgetNodeByUserId.setMeasuredDimension(i2, queryWidgetNodeByUserId.getMeasuredHeight());
            }
            DXWidgetNode a15 = a(queryWidgetNodeByUserId);
            if (a15 == null) {
                return;
            }
            a15.setMeasuredDimension(i2, a15.getMeasuredHeight());
        } else if (!"height".equals(string)) {
        } else {
            if (i != 1) {
                if (i != 2 || (v = queryWidgetNodeByUserId.getDXRuntimeContext().v()) == null || (layoutParams2 = v.getLayoutParams()) == null) {
                    return;
                }
                layoutParams2.height = queryWidgetNodeByUserId.getMeasuredHeight();
                v.setLayoutParams(layoutParams2);
                return;
            }
            View v28 = queryWidgetNodeByUserId.getDXRuntimeContext().v();
            if (v28 == null || (layoutParams = v28.getLayoutParams()) == null) {
                return;
            }
            int i3 = layoutParams.height;
            if (!z) {
                queryWidgetNodeByUserId.setMeasuredDimension(queryWidgetNodeByUserId.getMeasuredWidth(), i3);
            }
            DXWidgetNode a16 = a(queryWidgetNodeByUserId);
            if (a16 == null) {
                return;
            }
            a16.setMeasuredDimension(a16.getMeasuredWidth(), i3);
        }
    }

    private void a(DinamicXEngine dinamicXEngine, JSONObject jSONObject, Map<String, Object> map, boolean z) {
        Object obj;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d11ee66", new Object[]{this, dinamicXEngine, jSONObject, map, new Boolean(z)});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("type");
            Object obj2 = jSONObject.get("value");
            if (obj2 instanceof String) {
                String str = (String) obj2;
                if (str.startsWith("$")) {
                    obj2 = a(map, str, string);
                }
            }
            if (z) {
                try {
                } catch (Throwable th) {
                    com.taobao.android.dinamicx.exception.a.b(th);
                    obj = 0;
                }
                if ("NumericLiteral".equals(string) && (obj2 instanceof String)) {
                    String str2 = (String) obj2;
                    if (str2.endsWith("ap")) {
                        obj = Integer.valueOf(gbg.a(dinamicXEngine, DinamicXEngine.i(), Float.parseFloat(str2.substring(0, str2.length() - 2))));
                        jSONObject.put("value", obj);
                        jSONArray = jSONObject.getJSONArray("children");
                        if (jSONArray == null || jSONArray.size() <= 0) {
                        }
                        for (int i = 0; i < jSONArray.size(); i++) {
                            a(dinamicXEngine, jSONArray.getJSONObject(i), map, z);
                        }
                        return;
                    } else if (((String) obj2).endsWith("np")) {
                        obj2 = Integer.valueOf(gbg.a(DinamicXEngine.i(), Float.parseFloat(str2.substring(0, str2.length() - 2))));
                    }
                }
            }
            obj = obj2;
            jSONObject.put("value", obj);
            jSONArray = jSONObject.getJSONArray("children");
            if (jSONArray == null) {
            }
        }
    }

    private Object a(Map<String, Object> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("76acb2a1", new Object[]{this, map, str, str2});
        }
        if (str.length() < 2) {
            return str;
        }
        String substring = str.substring(1);
        if (map == null || !map.containsKey(substring)) {
            return "";
        }
        Object obj = map.get(substring);
        if (!"StringLiteral".equals(str2) || str.startsWith("'")) {
            return obj;
        }
        return "'" + obj + "'";
    }

    private String a(Map<String, Object> map, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d0668d9", new Object[]{this, map, str}) : (StringUtils.isEmpty(str) || map == null || (obj = map.get(str.substring(1))) == null) ? "" : obj.toString();
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : (StringUtils.isEmpty(str) || !str.startsWith("@")) ? str : str.substring(1);
    }

    public void a(DXRootView dXRootView, DXWidgetNode dXWidgetNode, JSONArray jSONArray, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbaff037", new Object[]{this, dXRootView, dXWidgetNode, jSONArray, map});
        } else if (jSONArray != null && !jSONArray.isEmpty()) {
            for (int i = 0; i < jSONArray.size(); i++) {
                String string = jSONArray.getString(i);
                if (DinamicXEngine.j()) {
                    fuw.a("step2---> 开始启动" + string + "动画");
                }
                a(dXRootView, dXWidgetNode, string, map);
            }
        }
    }

    private DXWidgetNode a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("1e0c66e6", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode == null) {
            return null;
        }
        return dXWidgetNode.isFlatten() ? dXWidgetNode : dXWidgetNode.getReferenceNode();
    }

    public void a(DXRootView dXRootView, DXWidgetNode dXWidgetNode, String str, Map<String, Object> map) {
        fqe fqeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc37acd5", new Object[]{this, dXRootView, dXWidgetNode, str, map});
        } else if (dXWidgetNode == null) {
            fuw.b("启动" + str + "动画失败 原因为animationWidget == null");
        } else {
            DXWidgetNode queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode();
            if (dXRootView == null || dXWidgetNode == null || this.c == null || StringUtils.isEmpty(queryRootWidgetNode.getAnimation()) || queryRootWidgetNode.getDXRuntimeContext() == null || StringUtils.isEmpty(str)) {
                if (!DinamicXEngine.j()) {
                    return;
                }
                fuw.b("启动" + str + "动画失败 原因为rootView == null || animationWidget == null || bindingX == null\n                || StringUtils.isEmpty(rootWidget.getAnimation())\n                || rootWidget.getDXRuntimeContext() == null\n                || StringUtils.isEmpty(specName)");
            } else if (dXWidgetNode.containsExecutingAnimationSpec(str)) {
                if (!DinamicXEngine.j()) {
                    return;
                }
                fuw.b("启动" + str + "动画失败 原因为animationWidget.containsExecutingAnimationSpec(specName)");
            } else {
                Map<String, fqe> bindingXSpecMap = dXWidgetNode.getBindingXSpecMap();
                fqe fqeVar2 = null;
                if (bindingXSpecMap == null || (fqeVar = bindingXSpecMap.get(str)) == null || (!fqeVar.h && map != null && !map.isEmpty())) {
                    fqeVar = null;
                }
                if (fqeVar != null) {
                    fqeVar2 = fqeVar;
                } else if (fqi.av()) {
                    JSONObject animationObj = queryRootWidgetNode.getAnimationObj();
                    if (animationObj != null) {
                        JSONObject jSONObject = new JSONObject();
                        fxr.a(animationObj, jSONObject);
                        fqeVar2 = a(dXWidgetNode.getEngine(), str, jSONObject, map);
                    }
                } else {
                    fqeVar2 = a(dXWidgetNode.getEngine(), str, JSONObject.parseObject(queryRootWidgetNode.getAnimation()), map);
                }
                if (fqeVar2 == null) {
                    if (!DinamicXEngine.j()) {
                        return;
                    }
                    fuw.b("启动" + str + "动画失败 原因为对应的动画描述是空 请检查对应的bindingx.json是否有误");
                    return;
                }
                if (bindingXSpecMap == null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(str, fqeVar2);
                    dXWidgetNode.setBindingXSpecMap(hashMap);
                } else {
                    bindingXSpecMap.put(str, fqeVar2);
                }
                if (fqeVar2.b != null) {
                    if (!DinamicXEngine.j()) {
                        return;
                    }
                    fuw.b("启动" + str + "动画失败  当前动画已经在运行");
                    return;
                }
                a(dXRootView, fqeVar2, dXWidgetNode);
            }
        }
    }

    public void a(final DXRootView dXRootView, final fqe fqeVar, final DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28bdcf0", new Object[]{this, dXRootView, fqeVar, dXWidgetNode});
            return;
        }
        View v = dXWidgetNode.getDXRuntimeContext().v();
        if (v != null) {
            v.setTag(ae.b, dXWidgetNode);
        }
        if (DinamicXEngine.j()) {
            fuw.a("step2.1 -->  开始进入启动动画 " + fqeVar.f28115a + "的bindAnimation阶段");
        }
        Map<String, Object> a2 = this.c.a(v, fqeVar.k, new bbr() { // from class: tb.fqb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bbr
            public void a(Map<String, Object> map) {
                fqb fqbVar;
                DXWidgetNode dXWidgetNode2;
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                } else if (map == null) {
                } else {
                    String str2 = null;
                    try {
                        if (DinamicXEngine.j()) {
                            fuw.d(map.toString());
                        }
                        String str3 = (String) map.get("state");
                        String str4 = (String) map.get("token");
                        if ("exit".equals(str3)) {
                            if (DinamicXEngine.j()) {
                                fuw.a("动画 " + fqeVar.f28115a + "正常退出，收到bindingX  STATE_EXIT回调");
                            }
                            if (fqeVar.b == null || !((String) fqeVar.b.get("token")).equalsIgnoreCase(str4)) {
                                return;
                            }
                            fqb.a(fqb.this, (Map) null, fqeVar);
                            if (fqeVar.i && fqeVar.c.equalsIgnoreCase("timing")) {
                                fqb.this.a(dXRootView, fqeVar, dXWidgetNode);
                                return;
                            }
                            if (fqeVar.d) {
                                fqb.a(fqb.this, dXWidgetNode, fqeVar, 2, fqeVar.g);
                            } else {
                                fqb.a(fqb.this, dXWidgetNode, fqeVar, 1, fqeVar.g);
                            }
                            fqb.a(fqb.this, dXRootView, dXWidgetNode, fqeVar);
                            fqb.this.a(dXWidgetNode, DXBindingXStateChangeEvent.DXVIEWWIDGETNODE_ONBINDINGXFINISH, fqeVar.f28115a);
                            return;
                        }
                        if ("start".equalsIgnoreCase(str3)) {
                            if (DinamicXEngine.j()) {
                                fuw.a("step3 -->  动画 " + fqeVar.f28115a + "启动成功，收到bindingX  STATE_START回调");
                            }
                            if (!fqeVar.c.equalsIgnoreCase("timing")) {
                                return;
                            }
                            fqbVar = fqb.this;
                            dXWidgetNode2 = dXWidgetNode;
                            str = fqeVar.f28115a;
                        } else if ("end".equalsIgnoreCase(str3)) {
                            if (!DinamicXEngine.j()) {
                                return;
                            }
                            fuw.a("动画 " + fqeVar.f28115a + "手动退出，收到bindingX  STATE_END回调");
                            return;
                        } else if (!"scrollStart".equalsIgnoreCase(str3)) {
                            if (!"scrollEnd".equalsIgnoreCase(str3)) {
                                return;
                            }
                            if (fqeVar.l == null || fqeVar.l.isEmpty()) {
                                if (fqeVar.d) {
                                    fqb.a(fqb.this, dXWidgetNode, fqeVar, 2, fqeVar.g);
                                } else {
                                    fqb.a(fqb.this, dXWidgetNode, fqeVar, 1, fqeVar.g);
                                }
                            }
                            fqb.this.a(dXWidgetNode, DXBindingXStateChangeEvent.DXVIEWWIDGETNODE_ONBINDINGXSTOP, fqeVar.f28115a);
                            return;
                        } else {
                            fqbVar = fqb.this;
                            dXWidgetNode2 = dXWidgetNode;
                            str = fqeVar.f28115a;
                        }
                        fqbVar.a(dXWidgetNode2, DXBindingXStateChangeEvent.DXVIEWWIDGETNODE_ONBINDINGXSTART, str);
                    } catch (Throwable th) {
                        com.taobao.android.dinamicx.exception.a.b(th);
                        DXWidgetNode dXWidgetNode3 = dXWidgetNode;
                        if (dXWidgetNode3 != null && dXWidgetNode3.getDXRuntimeContext() != null) {
                            str2 = dXWidgetNode.getDXRuntimeContext().A();
                        }
                        if (StringUtils.isEmpty(str2)) {
                            str2 = "dinamicx";
                        }
                        b.a(str2, null, DXMonitorConstant.DX_MONITOR_BINDINGX, DXMonitorConstant.DX_BINDINGX_CRASH, s.BINDINGX_BINDINGX_CALL_BACK_CRASH, com.taobao.android.dinamicx.exception.a.a(th));
                    }
                }
            }
        });
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        a(a2, fqeVar);
        a(dXRootView, dXWidgetNode, fqeVar);
    }

    private void a(DXRootView dXRootView, DXWidgetNode dXWidgetNode, fqe fqeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a7d99c", new Object[]{this, dXRootView, dXWidgetNode, fqeVar});
        } else if (dXRootView == null || dXWidgetNode == null || fqeVar == null) {
        } else {
            dXWidgetNode.putBindingXExecutingSpec(fqeVar);
            dXRootView._addAnimationWidget(dXWidgetNode);
        }
    }

    private void b(DXRootView dXRootView, DXWidgetNode dXWidgetNode, fqe fqeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6905fe3b", new Object[]{this, dXRootView, dXWidgetNode, fqeVar});
        } else if (dXRootView == null || dXWidgetNode == null || fqeVar == null) {
        } else {
            dXWidgetNode.removeBindingXSpec(fqeVar);
            if (dXWidgetNode.hasExecutingAnimationSpec()) {
                return;
            }
            dXRootView._removeAnimationWidget(dXWidgetNode);
        }
    }

    public void a(DXWidgetNode dXWidgetNode, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9675c867", new Object[]{this, dXWidgetNode, new Long(j), str});
        } else if (dXWidgetNode == null) {
        } else {
            dXWidgetNode.postEvent(new DXBindingXStateChangeEvent(j, str));
        }
    }

    private void a(Map<String, Object> map, fqe fqeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88cda853", new Object[]{this, map, fqeVar});
        } else {
            fqeVar.b = map;
        }
    }

    private void a(DXWidgetNode dXWidgetNode, fqe fqeVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c6d4ee", new Object[]{this, dXWidgetNode, fqeVar, new Integer(i), new Boolean(z)});
            return;
        }
        JSONArray jSONArray = fqeVar.j;
        int size = jSONArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(dXWidgetNode, jSONArray.getJSONObject(i2), i, z);
        }
    }

    public void a(DXRootView dXRootView, DXWidgetNode dXWidgetNode, JSONArray jSONArray) {
        Map<String, fqe> bindingXExecutingMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e855d8e", new Object[]{this, dXRootView, dXWidgetNode, jSONArray});
        } else if (this.c != null && dXWidgetNode.getDXRuntimeContext() != null && dXRootView != null && dXRootView._containAnimationWidget(dXWidgetNode) && (bindingXExecutingMap = dXWidgetNode.getBindingXExecutingMap()) != null && !bindingXExecutingMap.isEmpty()) {
            if (jSONArray != null && !jSONArray.isEmpty()) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    fqe fqeVar = bindingXExecutingMap.get(jSONArray.getString(i));
                    if (fqeVar != null) {
                        a(dXRootView, dXWidgetNode, fqeVar, true, fqeVar.e, fqeVar.f);
                    }
                }
                return;
            }
            for (fqe fqeVar2 : bindingXExecutingMap.values()) {
                if (fqeVar2 != null) {
                    a(dXRootView, dXWidgetNode, fqeVar2, false, fqeVar2.e, fqeVar2.f);
                }
            }
            bindingXExecutingMap.clear();
            dXRootView._removeAnimationWidget(dXWidgetNode);
        }
    }

    public void a(DXRootView dXRootView) {
        List<DXWidgetNode> _getAnimationWidgets;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
        } else if (dXRootView != null && (_getAnimationWidgets = dXRootView._getAnimationWidgets()) != null && !_getAnimationWidgets.isEmpty()) {
            for (DXWidgetNode dXWidgetNode : _getAnimationWidgets) {
                Map<String, fqe> bindingXExecutingMap = dXWidgetNode.getBindingXExecutingMap();
                if (bindingXExecutingMap != null && bindingXExecutingMap.size() > 0) {
                    for (fqe fqeVar : bindingXExecutingMap.values()) {
                        a(dXRootView, dXWidgetNode, fqeVar, false, true, false);
                    }
                    bindingXExecutingMap.clear();
                }
            }
            dXRootView._clearAnimationWidgets();
        }
    }

    public void a(DXRootView dXRootView, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb8c227", new Object[]{this, dXRootView, jSONObject});
        } else if (this.c == null || jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("params")) == null) {
        } else {
            String string = jSONObject2.getString("action");
            if (o.SCROLLING.equalsIgnoreCase(string) || "scroll_beigin".equalsIgnoreCase(string) || "scroll_end".equalsIgnoreCase(string)) {
                a(jSONObject2, string);
            } else if (dXRootView == null) {
                fuw.b("processDXMsg timing动画，必须要有rootview");
            } else {
                JSONArray jSONArray = jSONObject2.getJSONArray("spec");
                if (DinamicXEngine.j()) {
                    fuw.a("step1--> 收到bindingx消息: " + a(string, jSONArray));
                }
                Object obj = jSONObject2.get("widget");
                if (!(obj instanceof DXWidgetNode)) {
                    return;
                }
                DXWidgetNode dXWidgetNode = (DXWidgetNode) obj;
                if (fqf.a(dXWidgetNode) != dXRootView.getExpandWidgetNode()) {
                    if (!DinamicXEngine.j()) {
                        return;
                    }
                    fuw.b("rootView 被复用 动画操作失败" + a(string, jSONArray));
                    return;
                }
                JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
                if ("start".equalsIgnoreCase(string)) {
                    a(dXRootView, dXWidgetNode, jSONArray, jSONObject3);
                } else if (!"stop".equalsIgnoreCase(string)) {
                } else {
                    a(dXRootView, dXWidgetNode, jSONArray);
                }
            }
        }
    }

    private String a(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aaa23686", new Object[]{this, str, jSONArray});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("msg :action: ");
        sb.append(str);
        sb.append("  spec: ");
        sb.append(jSONArray);
        return sb.toString() == null ? " spec is null" : JSON.toJSONString(jSONArray);
    }

    private void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
        } else if (jSONObject == null || this.d == null) {
        } else {
            String string = jSONObject.getString("sourceId");
            if (DinamicXEngine.j()) {
                fuw.a("step1--> 收到scroller bindingx消息:  action " + str + " sourceId " + string);
            }
            int intValue = jSONObject.containsKey("offsetX") ? jSONObject.getInteger("offsetX").intValue() : 0;
            if (jSONObject.containsKey("offsetY")) {
                i = jSONObject.getInteger("offsetY").intValue();
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            if ("scroll_beigin".equalsIgnoreCase(str)) {
                this.d.b(string, intValue, i, jSONObject2);
            } else if (o.SCROLLING.equalsIgnoreCase(str)) {
                this.d.a(string, intValue, i, jSONObject2);
            } else if (!"scroll_end".equalsIgnoreCase(str)) {
            } else {
                this.d.c(string, intValue, i, jSONObject2);
            }
        }
    }

    public bbq d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbq) ipChange.ipc$dispatch("26179f2a", new Object[]{this}) : this.c;
    }

    private void a(DXRootView dXRootView, DXWidgetNode dXWidgetNode, fqe fqeVar, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af9a1938", new Object[]{this, dXRootView, dXWidgetNode, fqeVar, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (fqeVar == null || fqeVar.b == null) {
        } else {
            this.c.a(fqeVar.b);
            a((Map<String, Object>) null, fqeVar);
            if (z2) {
                a(dXWidgetNode, fqeVar, 2, z3);
            } else {
                a(dXWidgetNode, fqeVar, 1, z3);
            }
            if (z) {
                b(dXRootView, dXWidgetNode, fqeVar);
            }
            if (!"timing".equalsIgnoreCase(fqeVar.c)) {
                return;
            }
            a(dXWidgetNode, DXBindingXStateChangeEvent.DXVIEWWIDGETNODE_ONBINDINGXSTOP, fqeVar.f28115a);
        }
    }
}
