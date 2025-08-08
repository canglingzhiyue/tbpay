package tb;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class jen {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f29504a;
    private final File b;

    public jen(Context context, File file) {
        this.f29504a = context;
        this.b = file;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.b));
            Pattern compile = Pattern.compile("-----\\spid\\s(\\d+?)\\sat\\s(.+?)\\s-----");
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (!StringUtils.isEmpty(readLine)) {
                    Matcher matcher = compile.matcher(readLine);
                    if (matcher.find()) {
                        matcher.group(1);
                        String group = matcher.group(2);
                        String readLine2 = bufferedReader.readLine();
                        if (readLine2 != null) {
                            Matcher matcher2 = Pattern.compile("Cmd\\sline:\\s(.+)").matcher(readLine2);
                            if (matcher2.find() && matcher2.group(1).equals(jgr.b(this.f29504a))) {
                                String a2 = a.a(this.f29504a);
                                if (!group.equals(a2)) {
                                    a.a(this.f29504a, a2);
                                    bufferedReader.close();
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        jfj.b("TracesFinder", "this is not my anr");
        return false;
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ String a(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : b(context);
        }

        public static /* synthetic */ void a(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            } else {
                b(context, str);
            }
        }

        private static String b(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31400281", new Object[]{context}) : c(context).getString("LAST_ANR_TIME", "");
        }

        private static void b(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            } else {
                c(context).edit().putString("LAST_ANR_TIME", str).apply();
            }
        }

        private static SharedPreferences c(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("6b8004f2", new Object[]{context}) : kgo.a(context, "TCrashSDK", 0);
        }
    }
}
