package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbsku.container.TBXSkuContainer;

/* loaded from: classes5.dex */
public class fhm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1820811895);
    }

    public static TBXSkuContainer a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBXSkuContainer) ipChange.ipc$dispatch("529341c8", new Object[]{context, jSONObject});
        }
        TBXSkuContainer tBXSkuContainer = new TBXSkuContainer(context);
        tBXSkuContainer.a();
        tBXSkuContainer.b();
        tBXSkuContainer.a(jSONObject);
        tBXSkuContainer.c();
        return tBXSkuContainer;
    }
}
