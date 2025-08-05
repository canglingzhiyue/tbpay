package tb;

import android.content.Context;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class phc implements phb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(251470256);
        kge.a(-508950784);
    }

    @Override // tb.phb
    public void a(Map<String, Object> map, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5423244b", new Object[]{this, map, context});
            return;
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority("sku.taobao.com");
        builder.path("index.htm");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!(value instanceof Map)) {
                hashMap.put(key, String.valueOf(value));
            } else if (key.equals("exParams")) {
                Map map2 = (Map) value;
                StringBuilder sb = new StringBuilder();
                for (Object obj : map2.keySet()) {
                    sb.append(obj.toString());
                    sb.append(",");
                    hashMap.put(String.valueOf(obj), map2.get(obj));
                }
                sb.deleteCharAt(sb.length() - 1);
                hashMap.put(noa.KEY_MSOA_TRANS_KEY, sb.toString());
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            builder.appendQueryParameter((String) entry2.getKey(), String.valueOf(entry2.getValue()));
        }
        Nav.from(context).toUri(builder.build());
    }
}
