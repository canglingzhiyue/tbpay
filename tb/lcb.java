package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.h;
import com.taobao.tao.log.TLog;

/* loaded from: classes.dex */
public class lcb extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBHOMEPAGETEXIUADSCROLLEVENT = -7726063652804907491L;
    public static final String KEY_SLIDE_LAST_INDEX = "_tb_home_slide_last_index";

    public static /* synthetic */ Object ipc$super(lcb lcbVar, String str, Object... objArr) {
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

    /* JADX WARN: Removed duplicated region for block: B:101:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d A[Catch: Throwable -> 0x0125, TryCatch #3 {Throwable -> 0x0125, blocks: (B:8:0x0022, B:11:0x0028, B:13:0x002c, B:16:0x0035, B:17:0x003d, B:18:0x0041, B:19:0x0049, B:34:0x006b, B:37:0x0073, B:39:0x008d, B:40:0x008e, B:70:0x00e1, B:72:0x00f1, B:73:0x00f4, B:75:0x0101, B:77:0x0106, B:80:0x011a, B:82:0x011e, B:30:0x005e, B:86:0x0127), top: B:96:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1 A[Catch: Exception -> 0x0119, Throwable -> 0x0125, TryCatch #1 {Exception -> 0x0119, blocks: (B:70:0x00e1, B:72:0x00f1, B:73:0x00f4, B:75:0x0101, B:77:0x0106), top: B:92:0x00e1, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0101 A[Catch: Exception -> 0x0119, Throwable -> 0x0125, TryCatch #1 {Exception -> 0x0119, blocks: (B:70:0x00e1, B:72:0x00f1, B:73:0x00f4, B:75:0x0101, B:77:0x0106), top: B:92:0x00e1, outer: #3 }] */
    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent r13, java.lang.Object[] r14, com.taobao.android.dinamicx.DXRuntimeContext r15) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lcb.handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
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
        e.put(KEY_SLIDE_LAST_INDEX, (Object) Integer.valueOf(i));
    }

    private int a(DXRuntimeContext dXRuntimeContext) {
        Integer integer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("487cd5cc", new Object[]{this, dXRuntimeContext})).intValue();
        }
        JSONObject e = dXRuntimeContext.e();
        if (e != null && (integer = e.getInteger(KEY_SLIDE_LAST_INDEX)) != null) {
            return integer.intValue();
        }
        return -1;
    }

    private void a(int i, float f, Object obj, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d123702", new Object[]{this, new Integer(i), new Float(f), obj, new Integer(i2)});
            return;
        }
        JSONObject jSONObject = (JSONObject) ((JSONArray) obj).get(i);
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("args");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        jSONObject2.put("maskType", (Object) Integer.valueOf(i2));
        jSONObject2.put("maskAlpha", (Object) Float.valueOf(f));
        jSONObject2.put("maskIndex", (Object) Integer.valueOf(i));
        lci.a("Page_Home", "Page_home_Texiu_Bus_Monitor", null, null, jSONObject2);
        TLog.logd("InformationFlow_TB_AD", "AdScrollEventHandler", JSON.toJSONString(jSONObject2));
    }
}
