package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/alibaba/android/icart/core/utils/CartProtocolCropper;", "", "()V", "cropSubProtocol", "Lcom/alibaba/fastjson/JSONObject;", "originFullProtocol", "newRootKey", "", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class ipo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ipo INSTANCE;

    static {
        kge.a(-824931922);
        INSTANCE = new ipo();
    }

    private ipo() {
    }

    public final JSONObject a(JSONObject jSONObject, String newRootKey) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5543672", new Object[]{this, jSONObject, newRootKey});
        }
        q.d(newRootKey, "newRootKey");
        if (jSONObject == null || (a2 = bst.a(jSONObject, newRootKey)) == null) {
            return null;
        }
        q.b(a2, "UMFParseUtils.toProtocol…ewRootKey) ?: return null");
        a2.remove("features");
        JSONObject jSONObject2 = jSONObject.getJSONObject("linkage");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        a2.put("linkage", (Object) jSONObject2);
        Boolean bool = jSONObject.getBoolean("reload");
        jqg.b("CartProtocolCropper", "reload=" + bool);
        if (bool != null) {
            z = bool.booleanValue();
        }
        a2.put("reload", (Object) Boolean.valueOf(z));
        return a2;
    }
}
