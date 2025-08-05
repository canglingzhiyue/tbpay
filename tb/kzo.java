package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.homepage.pop.utils.b;
import com.taobao.homepage.pop.utils.c;

/* loaded from: classes.dex */
public class kzo extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_POPFETCHVIEWFRAME = 317648871599141328L;

    public static /* synthetic */ Object ipc$super(kzo kzoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Context m = dXRuntimeContext.m();
        String str2 = dXRuntimeContext.c().f11925a;
        if (m == null) {
            return null;
        }
        DinamicXEngine D = dXRuntimeContext.D();
        JSONObject a2 = a(m, D);
        if (objArr == null || objArr.length <= 0 || objArr[0] == null) {
            c.a("PopFetchViewFrame ", "operationList is empty, template=" + str2);
            return a2;
        }
        kyu b = b.b(dXRuntimeContext);
        if (b == null) {
            c.a("PopFetchViewFrame ", "engine is null, template=" + str2);
            return a2;
        }
        View a3 = a(b.d(), objArr[0].toString());
        if (a3 == null) {
            c.a("PopFetchViewFrame ", "rootView is null, template=" + str2);
            return a2;
        }
        if (objArr.length <= 1 || objArr[1] == null) {
            str = null;
            view = a3;
        } else {
            String obj = objArr[1].toString();
            view = b.a(a3, obj);
            str = obj;
        }
        if (view == null) {
            c.a("PopFetchViewFrame ", "anchorView is null, itemBizCode=" + str + ", template=" + str2);
            return a2;
        }
        JSONObject a4 = a(m, D, a3, view, a2);
        c.a("PopFetchViewFrame ", "frame info=" + a4.toJSONString());
        return a4;
    }

    public View a(lad ladVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cf82d1f5", new Object[]{this, ladVar, str});
        }
        if (TextUtils.isEmpty(str)) {
            c.a("PopFetchViewFrame ", "sectionBizCode is empty");
            return null;
        }
        int a2 = ladVar.a(str);
        if (a2 < 0) {
            c.a("PopFetchViewFrame ", "no pos in feeds, sectionBizCode=" + str);
            return null;
        }
        return ladVar.b(a2);
    }

    private JSONObject a(Context context, DinamicXEngine dinamicXEngine, View view, View view2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bb34789f", new Object[]{this, context, dinamicXEngine, view, view2, jSONObject});
        }
        jSONObject.put("width", (Object) Integer.valueOf(gbg.b(dinamicXEngine, context, view2.getWidth())));
        jSONObject.put("height", (Object) Integer.valueOf(gbg.b(dinamicXEngine, context, view2.getHeight())));
        jSONObject.put("x", (Object) Integer.valueOf(gbg.b(dinamicXEngine, context, view2.getX())));
        jSONObject.put("y", (Object) Integer.valueOf(gbg.b(dinamicXEngine, context, view2.getY())));
        jSONObject.put("offsetX", (Object) Integer.valueOf(gbg.b(dinamicXEngine, context, a())));
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        jSONObject.put("xOnScreen", (Object) Integer.valueOf(gbg.b(dinamicXEngine, context, iArr[0])));
        jSONObject.put("yOnScreen", (Object) Integer.valueOf(gbg.b(dinamicXEngine, context, iArr[1])));
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        jSONObject.put("xInRootView", (Object) Integer.valueOf(gbg.b(dinamicXEngine, context, iArr[0] - iArr2[0])));
        jSONObject.put("yInRootView", (Object) Integer.valueOf(gbg.b(dinamicXEngine, context, iArr[1] - iArr2[1])));
        return jSONObject;
    }

    private JSONObject a(Context context, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e89ba8b1", new Object[]{this, context, dinamicXEngine});
        }
        if (context == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(16);
        jSONObject.put("screenW", (Object) Integer.valueOf(gbg.b(dinamicXEngine, context, gbg.b(context))));
        jSONObject.put("screenH", (Object) Double.valueOf(gbg.b(dinamicXEngine, context, gbg.c(context) + b.a(context)) + 0.5d));
        return jSONObject;
    }

    private float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue();
        }
        try {
            return Float.valueOf(kyv.a("default", PopConst.STATIC_KEY_ICON_SCROLL_OFFSET)).floatValue();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }
}
