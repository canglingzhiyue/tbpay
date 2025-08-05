package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes6.dex */
public class jfv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final File f29528a;
    private final String b;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String _BUILD = "";
        public static final String _JAVA_VERSION = "";
        public static final String _MAGIC = "CrashSDK";
        public static final String _NATIVE_VERSION = "160509105620";
        public static final String _TARGET = "beta";
        public static final String _VERSION = "3.3.0.0";

        private static String a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : str != null ? str.replace("_", "&#95;") : "";
        }

        public static String a(jdy jdyVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4abec3b3", new Object[]{jdyVar, str, str2});
            }
            long currentTimeMillis = System.currentTimeMillis();
            String a2 = a(jdyVar.a("APP_VERSION", "1.0.0"));
            String a3 = a(str2);
            return "CrashSDK_3.3.0.0__df_df_df_" + jdyVar.a("APP_KEY", "0") + "_" + a2 + "_" + currentTimeMillis + "_" + byy.a(currentTimeMillis) + "_" + bzh.a(a3, "df") + "_" + str + ".log";
        }
    }

    public jfv(File file, String str) {
        this.f29528a = file;
        this.b = str;
    }

    public File a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("a060c1a5", new Object[]{this}) : this.f29528a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }
}
