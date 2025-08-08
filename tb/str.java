package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.b;
import com.taobao.homepage.pop.utils.c;

/* loaded from: classes7.dex */
public class str extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_POPANCHORFRAME = -5235842846943672669L;

    public static /* synthetic */ Object ipc$super(str strVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        View a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Context m = dXRuntimeContext.m();
        DinamicXEngine D = dXRuntimeContext.D();
        if (m == null || D == null || objArr == null || objArr.length == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        kyu b = b.b(dXRuntimeContext);
        IPopData c = b.c(dXRuntimeContext);
        if (b == null || c == null) {
            c.a("DXDataParserPopAnchorFrame", "not found HomePopEngine");
            return jSONObject;
        }
        String obj = objArr[0].toString();
        if (StringUtils.isEmpty(obj)) {
            c.a("DXDataParserPopAnchorFrame", "sectionBizCode is empty");
            return jSONObject;
        }
        String obj2 = objArr.length > 1 ? objArr[1].toString() : "";
        if (objArr.length > 2 && Boolean.parseBoolean(objArr[2].toString())) {
            z = true;
        }
        if (z) {
            a2 = b.e().a(obj);
        } else {
            a2 = a(b.d(), obj);
        }
        c.a("DXDataParserPopAnchorFrame", "pop is main container: " + z);
        if (a2 == null) {
            c.a("DXDataParserPopAnchorFrame", "not found rootView sectionBizCode=" + obj);
            return jSONObject;
        }
        if (!StringUtils.isEmpty(obj2)) {
            View a3 = b.a(a2, obj2);
            if (a3 != null) {
                a2 = a3;
            } else {
                c.a("DXDataParserPopAnchorFrame", "not found childView itemBizCode=" + obj2);
            }
        }
        a(m, D, b, c, a2, jSONObject);
        c.a("DXDataParserPopAnchorFrame", "popAnchorFrame: " + jSONObject.toJSONString());
        return jSONObject;
    }

    private JSONObject a(Context context, DinamicXEngine dinamicXEngine, kyu kyuVar, IPopData iPopData, View view, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7c7c8624", new Object[]{this, context, dinamicXEngine, kyuVar, iPopData, view, jSONObject});
        }
        jSONObject.put("width", (Object) Integer.valueOf(gbg.b(dinamicXEngine, context, view.getWidth())));
        jSONObject.put("height", (Object) Integer.valueOf(gbg.b(dinamicXEngine, context, view.getHeight())));
        ViewGroup a2 = kyuVar.a(iPopData.getPopConfig() == null ? 1 : iPopData.getPopConfig().getHierarchy());
        if (a2 == null) {
            c.a("DXDataParserPopAnchorFrame", "popContainer is null");
            return jSONObject;
        }
        if ((a2.getWidth() <= 0 || a2.getHeight() <= 0) && a2.getParent() != null) {
            a2 = (ViewGroup) a2.getParent();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        a2.getLocationOnScreen(iArr2);
        jSONObject.put("xInPopContainer", (Object) Integer.valueOf(gbg.b(dinamicXEngine, context, iArr[0] - iArr2[0])));
        jSONObject.put("yInPopContainer", (Object) Integer.valueOf(gbg.b(dinamicXEngine, context, iArr[1] - iArr2[1])));
        return jSONObject;
    }

    public View a(lad ladVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cf82d1f5", new Object[]{this, ladVar, str});
        }
        if (StringUtils.isEmpty(str)) {
            c.a("DXDataParserPopAnchorFrame", "sectionBizCode is empty");
            return null;
        }
        int a2 = ladVar.a(str);
        if (a2 < 0) {
            c.a("DXDataParserPopAnchorFrame", "no pos in feeds, sectionBizCode=" + str);
            return null;
        }
        return ladVar.b(a2);
    }
}
