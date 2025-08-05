package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class blf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(845333820);
    }

    public static void a(Context context, blu bluVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6644a0b", new Object[]{context, bluVar, jSONObject});
        } else if (jSONObject != null && bluVar != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("margin");
            if (jSONArray != null) {
                String[] strArr = new String[4];
                for (int i = 0; i < 4 && i < jSONArray.size(); i++) {
                    strArr[i] = jSONArray.getString(i);
                }
                int[] iArr = new int[4];
                for (int i2 = 0; i2 < 4; i2++) {
                    iArr[i2] = gbg.a(context, strArr[i2], 0);
                }
                bluVar.a(iArr[3], iArr[0], iArr[1], iArr[2]);
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("padding");
            if (jSONArray2 == null) {
                return;
            }
            String[] strArr2 = new String[4];
            for (int i3 = 0; i3 < 4 && i3 < jSONArray2.size(); i3++) {
                strArr2[i3] = jSONArray2.getString(i3);
            }
            int[] iArr2 = new int[4];
            for (int i4 = 0; i4 < 4; i4++) {
                iArr2[i4] = gbg.a(context, strArr2[i4], 0);
            }
            bluVar.b(iArr2[3], iArr2[0], iArr2[1], iArr2[2]);
        }
    }
}
