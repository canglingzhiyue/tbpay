package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class emk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_STATE_SYNC_TOKEN = "stateSyncToken";

    static {
        kge.a(-1624326090);
        emu.a("com.taobao.android.detail.core.standard.utils.AliSDetailStateSyncUtils");
    }

    public static String a(AURARenderComponent aURARenderComponent) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{aURARenderComponent});
        }
        if (aURARenderComponent != null && aURARenderComponent.data != null && aURARenderComponent.data.fields != null && (obj = aURARenderComponent.data.fields.get(KEY_STATE_SYNC_TOKEN)) != null) {
            return obj.toString();
        }
        return null;
    }
}
