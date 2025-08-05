package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.f;
import com.ut.device.UTDevice;

/* loaded from: classes8.dex */
public class pbb implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1322326319);
        kge.a(-1218283689);
    }

    @Override // com.taobao.taolive.sdk.utils.f
    public String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context}) : UTDevice.getUtdid(context);
    }
}
