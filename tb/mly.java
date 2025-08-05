package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public interface mly {
    public static final long LAUNCH_SESSION_DEFAULT = -1;
    public static final String SEPARATOR = "^";
    public static final String UNESCAPED_SEPARATOR = "\\^";
    public static final String VALID_STORAGE_DATE = "valid_storage_date";
    public static final String VALID_STORAGE_LAUNCH_SESSION = "valid_storage_launch_session";
    public static final String VALID_STORAGE_PID = "valid_storage_pid";
    public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINESE);
    public static final long LAUNCH_SESSION = SystemClock.uptimeMillis();

    /* renamed from: tb.mly$-CC  reason: invalid class name */
    /* loaded from: classes9.dex */
    public final /* synthetic */ class CC {
        public static void $default$b(mly mlyVar, String str) {
            mlyVar.c(str);
            if (!str.contains("^")) {
                return;
            }
            throw new RuntimeException("The key cannot contain the special characters: ^");
        }

        public static void $default$c(mly mlyVar, String str) {
            if (!TextUtils.isEmpty(str)) {
                return;
            }
            throw new RuntimeException("The key is empty.");
        }

        public static String d(String str) {
            return TextUtils.isEmpty(str) ? str : str.replace("^", "&mksep").replace("=", "&mkequal");
        }

        public static String e(String str) {
            return TextUtils.isEmpty(str) ? str : str.replace("=", "&mkequal");
        }

        public static String f(String str) {
            return TextUtils.isEmpty(str) ? str : str.replace("&mksep", "^").replace("&mkequal", "=");
        }
    }

    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: tb.mly$a$-CC  reason: invalid class name */
        /* loaded from: classes9.dex */
        public final /* synthetic */ class CC {
            public static a $default$a(a aVar, Map map) {
                throw new RuntimeException("not impl.");
            }

            public static a $default$b(a aVar, String str, String str2) {
                if (!TextUtils.isEmpty(str2)) {
                    aVar.a(str, str2);
                }
                return aVar;
            }
        }

        a a(String str);

        a a(String str, float f);

        a a(String str, int i);

        a a(String str, long j);

        a a(String str, String str2);

        a a(String str, boolean z);

        a a(Map<String, ?> map);

        void a();

        a b(String str, long j);

        a b(String str, String str2);

        boolean b();

        a c(String str, String str2);
    }

    float a(String str, float f);

    int a(String str, int i);

    long a(String str, long j);

    String a(String str, String str2);

    Set<String> a();

    mly a(String str);

    void b(String str);

    a c();

    void c(String str);
}
