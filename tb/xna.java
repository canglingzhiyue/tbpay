package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.rolling.b;

/* loaded from: classes7.dex */
public class xna extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HIFCANACTIVE = -866028105002175375L;

    static {
        kge.a(1375034700);
    }

    public static /* synthetic */ Object ipc$super(xna xnaVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            ldf.d("DXDataParserHIFCanActive", "operationList == null");
            return false;
        }
        String str = (String) objArr[0];
        JSONObject jSONObject = null;
        JSONObject a2 = objArr.length >= 2 ? a(objArr[1]) : null;
        if (objArr.length >= 3) {
            jSONObject = a(objArr[2]);
        }
        if (jSONObject == null || a2 == null) {
            ldf.d("DXDataParserHIFCanActive", "motionPriority == null");
            return true;
        }
        String string = jSONObject.getString(str);
        if (!StringUtils.isEmpty(string)) {
            return Boolean.valueOf(a(str, string, jSONObject, a2));
        }
        ldf.d("DXDataParserHIFCanActive", "userId：" + str + ",priority == null");
        return false;
    }

    private JSONObject a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("62e9ad64", new Object[]{this, obj});
        }
        if (obj instanceof String) {
            return JSON.parseObject((String) obj);
        }
        ldf.d("DXDataParserHIFCanActive", "value不是string" + obj);
        return null;
    }

    private boolean a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c04f5c80", new Object[]{this, str, str2, jSONObject, jSONObject2})).booleanValue();
        }
        int parseInt = Integer.parseInt(str2);
        for (String str3 : jSONObject.keySet()) {
            if (Integer.parseInt(jSONObject.getString(str3)) < parseInt && a(str3, jSONObject2)) {
                z = false;
            }
        }
        if (!z) {
            return false;
        }
        return a(str, jSONObject2);
    }

    private boolean a(String str, JSONObject jSONObject) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6635bd02", new Object[]{this, str, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            ldf.d("DXDataParserHIFCanActive", "fatigueCount == null");
            return true;
        }
        String a2 = liz.a(str, "");
        if (a2 == null) {
            return true;
        }
        String[] split = a2.split("_");
        if (a(split)) {
            return true;
        }
        if (split.length > 1) {
            i = Integer.parseInt(split[1]);
            ldf.d("DXDataParserHIFCanActive", "currentShowCount: " + i);
        } else {
            i = 0;
        }
        int intValue = jSONObject.getIntValue(str);
        return intValue == 0 || i < intValue;
    }

    private boolean a(String[] strArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b26fbb", new Object[]{this, strArr})).booleanValue();
        }
        if (strArr.length > 1) {
            str = strArr[0];
            ldf.d("DXDataParserHIFCanActive", "uptimeMillis: " + str);
        } else {
            str = "";
        }
        if (StringUtils.isEmpty(str)) {
            ldf.d("DXDataParserHIFCanActive", "lastTimeMillis == null");
            return true;
        } else if (!b.a(Long.parseLong(str))) {
            return false;
        } else {
            ldf.d("DXDataParserHIFCanActive", "是新的一天了");
            return true;
        }
    }
}
