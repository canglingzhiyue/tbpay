package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class lfl extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBHOMEPAGEFIRSTADTEXIU = -6834540955644463954L;

    static {
        kge.a(1180071351);
    }

    public static /* synthetic */ Object ipc$super(lfl lflVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    @Override // tb.fuf, tb.fut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evalWithArgs(java.lang.Object[] r11, com.taobao.android.dinamicx.DXRuntimeContext r12) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lfl.evalWithArgs(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }

    private void a(DXRuntimeContext dXRuntimeContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71e584a", new Object[]{this, dXRuntimeContext, new Integer(i)});
            return;
        }
        JSONObject e = dXRuntimeContext.e();
        if (e == null) {
            return;
        }
        e.put(lcb.KEY_SLIDE_LAST_INDEX, (Object) Integer.valueOf(i));
    }

    private int a(DXRuntimeContext dXRuntimeContext) {
        Integer integer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("487cd5cc", new Object[]{this, dXRuntimeContext})).intValue();
        }
        JSONObject e = dXRuntimeContext.e();
        if (e != null && (integer = e.getInteger(lcb.KEY_SLIDE_LAST_INDEX)) != null) {
            return integer.intValue();
        }
        return -1;
    }

    private void a(Object obj, int i, int i2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b137f1a4", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        } else if (!(obj instanceof JSONArray) || (jSONObject = (JSONObject) ((JSONArray) obj).get(i)) == null) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("floatMaskType", (Object) (i2 != 1 ? i2 != 2 ? i2 != 3 ? "unknown" : "pokuang" : "fuceng" : "guajian"));
            ldl.a("Page_Home", 2201, "Page_Home_ShowPendant", null, null, jSONObject2.toString());
            ldl.a("Page_Home", ConnectionResult.SERVICE_UPDATING, "Page_Home_ShowPendant", null, null, jSONObject2.toString());
        }
    }
}
