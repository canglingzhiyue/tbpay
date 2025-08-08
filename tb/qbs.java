package tb;

import android.content.Context;
import android.os.Environment;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes8.dex */
public class qbs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f32890a;
    private static String b;
    private static String c;

    static {
        kge.a(-1124204526);
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : ".tptemp";
    }

    public static void a(Context context) {
        String absolutePath;
        String absolutePath2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
        } else {
            if (c != null && f32890a != null) {
                return;
            }
            if ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
                File externalCacheDir = context.getExternalCacheDir();
                if (qcg.a(externalCacheDir)) {
                    absolutePath = externalCacheDir.getAbsolutePath();
                } else {
                    absolutePath = context.getCacheDir().getAbsolutePath();
                }
                absolutePath2 = StringUtils.isEmpty(absolutePath) ? context.getCacheDir().getAbsolutePath() : absolutePath;
            } else {
                absolutePath2 = context.getCacheDir().getAbsolutePath();
            }
            if (StringUtils.isEmpty(absolutePath2)) {
                return;
            }
            if (!absolutePath2.endsWith(File.separator)) {
                absolutePath2 = absolutePath2 + File.separator;
            }
            c = absolutePath2;
            String str = absolutePath2 + "material_download" + File.separator;
            b = str;
            b(str);
            String str2 = absolutePath2 + "taopai" + File.separator;
            f32890a = str2;
            b(str2);
        }
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        if (StringUtils.isEmpty(f32890a)) {
            a(context);
        }
        return f32890a;
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (qcg.a(str)) {
            return false;
        }
        return new File(str).mkdirs();
    }

    public static String a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7b527fe", new Object[]{str, new Boolean(z)});
        }
        if (b == null) {
            return null;
        }
        String str2 = b + str;
        if (z) {
            b(str2);
        }
        return str2;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (b == null) {
            return null;
        }
        String str2 = b + "music" + File.separator + str;
        b(str2);
        return str2;
    }

    public static String a(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec05af1d", new Object[]{str, new Integer(i), new Boolean(z)});
        }
        if (b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        if (i == -1) {
            sb.append(str);
        } else {
            sb.append(str + "_" + i);
        }
        String sb2 = sb.toString();
        if (z) {
            b(sb2);
        }
        return sb2;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        String b2 = b(str, true);
        if (b2 == null) {
            return null;
        }
        String str3 = b2 + File.separator + str2.hashCode();
        b(str3);
        return str3;
    }

    public static String b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("645552ff", new Object[]{str, new Boolean(z)});
        }
        if (b == null) {
            return null;
        }
        String str2 = a() + File.separator + str;
        if (z) {
            b(str2);
        }
        return str2;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (b == null) {
            return null;
        }
        return b + "resources";
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        String str = c + "material_response" + File.separator;
        b(str);
        return str;
    }
}
