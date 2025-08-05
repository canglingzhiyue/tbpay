package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class fes implements fer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2055957454);
        kge.a(2117711513);
    }

    public fes() {
        emu.a("com.taobao.android.detail.wrapper.ext.request.params.impl.ShowLiveShowParamsAppender");
    }

    @Override // tb.fer
    public Map<String, String> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d84e95", new Object[]{this, context});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("liveAutoPlay", String.valueOf(a.a(context)));
        return hashMap;
    }
}
