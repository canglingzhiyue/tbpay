package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rla implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1493047686);
        kge.a(1914895581);
    }

    @Override // com.tmall.android.dai.d
    public Map<String, String> onTask(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        String str = map.get("content");
        HashMap hashMap = new HashMap();
        String b = !StringUtils.isEmpty(str) ? gsi.b(Base64.decode(str, 0)) : "";
        if (b == null) {
            b = "";
        }
        hashMap.put("result", b);
        return hashMap;
    }
}
