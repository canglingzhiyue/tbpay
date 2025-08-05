package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class eml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1912810941);
        emu.a("com.taobao.android.detail.core.standard.utils.AliSDetailUriUtil");
    }

    public static Uri a(Uri uri, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("b31278fd", new Object[]{uri, map});
        }
        HashMap hashMap = new HashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null) {
            for (String str : queryParameterNames) {
                String queryParameter = uri.getQueryParameter(str);
                if (queryParameter != null) {
                    hashMap.put(str, queryParameter);
                }
            }
        }
        hashMap.putAll(map);
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        for (String str2 : hashMap.keySet()) {
            buildUpon.appendQueryParameter(str2, (String) hashMap.get(str2));
        }
        return buildUpon.build();
    }
}
