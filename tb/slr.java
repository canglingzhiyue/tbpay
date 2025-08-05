package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.remote.MediaMixContentDetailResponse;

/* loaded from: classes5.dex */
public class slr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-348825645);
    }

    public static MediaMixContentDetailResponse a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaMixContentDetailResponse) ipChange.ipc$dispatch("1a3c099b", new Object[]{new Boolean(z), jSONObject});
        }
        if (z) {
            return sku.a(jSONObject);
        }
        return (MediaMixContentDetailResponse) JSONObject.toJavaObject(jSONObject, MediaMixContentDetailResponse.class);
    }

    public static MediaMixContentDetailResponse a(boolean z, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaMixContentDetailResponse) ipChange.ipc$dispatch("16f96dcc", new Object[]{new Boolean(z), bArr});
        }
        if (bArr == null) {
            return null;
        }
        String str = new String(bArr);
        if (z) {
            return sku.a(str);
        }
        return (MediaMixContentDetailResponse) JSONObject.parseObject(str, MediaMixContentDetailResponse.class);
    }
}
