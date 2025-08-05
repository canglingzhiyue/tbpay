package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class nry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-282682866);
    }

    public static final <T> String a(Collection<? extends T> toBase64String) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2afc0da7", new Object[]{toBase64String});
        }
        q.c(toBase64String, "$this$toBase64String");
        String b = npt.b(JSON.toJSONString(toBase64String));
        q.a((Object) b, "SearchBase64CacheUtil.encode(jsonStr)");
        return b;
    }
}
