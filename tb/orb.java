package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.tao.Globals;

/* loaded from: classes.dex */
public class orb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1943969800);
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        jSONObject.put(d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (Object) String.valueOf(gbg.b(Globals.getApplication())));
        jSONObject.put("screenHeight", (Object) String.valueOf(gbg.c(Globals.getApplication())));
    }
}
