package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"overwriteQueryParameter", "", "key", "value", "taobao_mytaobao_release"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class muc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1438974854);
    }

    public static final String a(String overwriteQueryParameter, String key, String value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{overwriteQueryParameter, key, value});
        }
        q.c(overwriteQueryParameter, "$this$overwriteQueryParameter");
        q.c(key, "key");
        q.c(value, "value");
        try {
            Uri uri = Uri.parse(overwriteQueryParameter);
            q.a((Object) uri, "uri");
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Uri.Builder clearQuery = uri.buildUpon().clearQuery();
            for (String str : queryParameterNames) {
                if (!q.a((Object) key, (Object) str)) {
                    clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
                }
            }
            String uri2 = clearQuery.appendQueryParameter(key, value).build().toString();
            q.a((Object) uri2, "uriBuilder.appendQueryPa…value).build().toString()");
            return uri2;
        } catch (Throwable unused) {
            return overwriteQueryParameter;
        }
    }
}
