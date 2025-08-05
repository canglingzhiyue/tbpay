package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.ar;
import com.taobao.android.dinamicx.widget.as;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class iof extends ar {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-205315798);
    }

    public static /* synthetic */ Object ipc$super(iof iofVar, String str, Object... objArr) {
        if (str.hashCode() == -1561859417) {
            return super.a((as) objArr[0], (JSONObject) objArr[1], (String) objArr[2], (String) objArr[3], ((Boolean) objArr[4]).booleanValue());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public iof() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.widget.TitleUnderlineSpanGenerator");
    }

    public List<as.c> b(as asVar, JSONObject jSONObject, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d9605e69", new Object[]{this, asVar, jSONObject, str, str2, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < str2.length(); i++) {
            String valueOf = String.valueOf(str2.charAt(i));
            str = str + valueOf;
            as.c a2 = super.a(asVar, jSONObject, str, valueOf, z);
            if (a2 == null) {
                a2 = new as.c();
            }
            a2.d.add(a(asVar, jSONObject));
            arrayList.add(a2);
        }
        return arrayList;
    }

    private Object a(as asVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("24c7d271", new Object[]{this, asVar, jSONObject});
        }
        int i = -16777216;
        int textColor = asVar != null ? asVar.getTextColor() : -16777216;
        if (jSONObject != null) {
            String string = jSONObject.getString("color");
            String string2 = jSONObject.getString("lineColor");
            try {
                textColor = a(string, textColor);
                i = a(string2, textColor);
            } catch (Throwable unused) {
            }
        }
        return new iod(i, textColor, gbg.a(asVar.getDXRuntimeContext().m(), 1.5f), gbg.a(asVar.getDXRuntimeContext().m(), 2.5f));
    }

    public boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        return Boolean.parseBoolean(jSONObject.getString("underLine"));
    }
}
