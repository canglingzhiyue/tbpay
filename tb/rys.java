package tb;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;

/* loaded from: classes.dex */
public final class rys {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1487422414);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : str.equals("POST") || str.equals("PUT") || str.equals("PATCH");
    }

    public static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue() : "gzip".equalsIgnoreCase(HeaderHandlerUtil.getSingleHeaderFieldByKey(map, HttpConstant.CONTENT_ENCODING));
    }
}
