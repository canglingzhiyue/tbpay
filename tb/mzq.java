package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class mzq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f31338a;
    private static final String b;

    static {
        kge.a(143541516);
        f31338a = new AtomicInteger(0);
        StringBuilder sb = new StringBuilder(1);
        a(5L, sb);
        b = sb.toString();
    }

    public static String a() {
        StringBuilder sb = new StringBuilder(8);
        a((f31338a.getAndIncrement() & Integer.MAX_VALUE) % 58, sb);
        a((System.currentTimeMillis() % 31622400000L) + 691200000, sb);
        sb.insert(0, b);
        return sb.toString();
    }

    public static String a(String str) {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    private static void a(long j, StringBuilder sb) {
        do {
            long j2 = 58;
            sb.insert(0, "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".charAt((int) (j % j2)));
            j /= j2;
        } while (j > 0);
    }
    public static void main(String[] args) {
        System.out.println(a());
    }
}
