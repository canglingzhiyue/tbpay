package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class jax {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean METHOD_TRACE;

    /* renamed from: a  reason: collision with root package name */
    public static int f29443a;
    private static List<String> b;

    static {
        File file = new File("/data/local/tmp/");
        int intValue = jbc.a().a(new File(file, ".fake.txt")).intValue();
        if (intValue <= 0) {
            boolean isSpeedEdition = TBSpeed.isSpeedEdition(jar.a(), "virtual_thread");
            if (TBSpeed.isSpeedEdition(jar.a(), "virtual_thread_fake")) {
                intValue = 2;
            } else if (isSpeedEdition) {
                intValue = 1;
            }
        }
        if (intValue <= 0) {
            intValue = 1;
        }
        if (jbf.ORANGE_FAKE > 0) {
            jaq.f29439a = jbf.ORANGE_FAKE;
        } else if (intValue > 0) {
            jaq.f29439a = intValue;
        }
        METHOD_TRACE = jbf.METHOD_TRACE;
        jaq.b = jbf.KEEP_ALIVE_TIME;
        f29443a = jbf.TOTAL_GLOBAL_HANDLER_COUNT;
        b = jba.a().a(a(new File(file, "ex_thread_pool.txt"), new File(jar.a().getFilesDir(), "ex_thread_pool.txt")));
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        jaw jawVar = new jaw(map);
        int a2 = jawVar.a("ORANGE_FAKE", -1);
        if (a2 > 0) {
            jaq.f29439a = a2;
        }
        jaq.b = jawVar.a("KEEP_ALIVE_TIME", 3000);
        b = jba.a().a(new File(jar.a().getFilesDir(), "ex_thread_pool.txt"));
    }

    private static File a(File file, File file2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("73f081b7", new Object[]{file, file2}) : file.exists() ? file : file2;
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (jaq.f29439a == 2) {
            if (str.contains("com.alibaba.android.ultron.vfw.dataloader.DataRequestTask") || str.contains("UCCoreThread")) {
                return 1;
            }
            for (String str2 : b) {
                if (Pattern.matches(str2, str)) {
                    return 1;
                }
            }
        }
        return jaq.f29439a;
    }
}
