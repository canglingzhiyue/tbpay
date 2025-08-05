package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.WindowType;
import com.taobao.android.autosize.h;
import com.taobao.tao.Globals;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class abh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1721687972);
    }

    public static int a(int i, int i2) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        if (!dcn.a()) {
            return i;
        }
        if (i <= 0 || i2 <= 0) {
            jqg.b("iCart", "originColumn=" + i + ",width=" + i2);
            return i;
        }
        int[] iArr = new HashMap<Integer, int[]>() { // from class: com.alibaba.android.icart.core.multiplecolumn.ColumnHelper$1
            {
                put(2, new int[]{2, 2, 4, 4, 5});
                put(3, new int[]{3, 3, 6, 6, 6});
                put(4, new int[]{4, 4, 8, 8, 8});
                put(5, new int[]{5, 5, 10, 10, 10});
            }
        }.get(Integer.valueOf(i));
        return (iArr != null && (a2 = a(h.a().a((int) gbg.a((Context) Globals.getApplication(), i2)))) >= 0 && a2 < iArr.length) ? iArr[a2] : i;
    }

    public static int a(WindowType windowType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bd2b954", new Object[]{windowType})).intValue();
        }
        if (windowType == WindowType.MIN) {
            return 0;
        }
        if (windowType == WindowType.SMALL) {
            return 1;
        }
        if (windowType == WindowType.MEDIUM) {
            return 2;
        }
        if (windowType == WindowType.LARGE) {
            return 3;
        }
        return windowType == WindowType.MAX ? 4 : -1;
    }

    public static JSONObject a(bbz bbzVar, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e8d9051b", new Object[]{bbzVar, new Integer(i), new Float(f)});
        }
        if (!dcn.a() || f == 0.0f) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        int b = bbzVar.x().b(f / i);
        jSONObject2.put("width", (Object) Integer.valueOf(b));
        jSONObject2.put("height", (Object) Integer.valueOf(b));
        jSONObject2.put("count", (Object) Integer.valueOf(i));
        jSONObject.put("_columnInfo", (Object) jSONObject2);
        return jSONObject;
    }
}
