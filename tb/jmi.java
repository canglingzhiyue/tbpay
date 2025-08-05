package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.e;
import com.taobao.android.tschedule.parser.ExprParserParams;
import com.taobao.android.tschedule.parser.a;
import com.taobao.android.tschedule.protocol.b;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class jmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f29630a;

    static {
        kge.a(2067034523);
        f29630a = "";
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        a();
        return TextUtils.isEmpty(f29630a) || TextUtils.equals(e.f(), f29630a);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            if (TextUtils.isEmpty(f29630a)) {
                int myPid = Process.myPid();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) e.b().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (next.pid == myPid) {
                            f29630a = next.processName;
                            break;
                        }
                    }
                }
                return f29630a;
            }
        } catch (Throwable unused) {
        }
        return f29630a;
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        b.a().a("h5", str);
        b.a().a("miniApp", str2);
        b.a().a(b.PROTOCOL_BIZ_CODE_PHA, str3);
        b.a().b("h5", str4);
        b.a().b("miniApp", str5);
    }

    public static String a(String str, String str2, String str3) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        try {
            VariationSet activate = UTABTest.activate(str, str2);
            if (activate != null && (variation = activate.getVariation(str3)) != null) {
                return variation.getValueAsString(null);
            }
            return null;
        } catch (Throwable th) {
            jkq.a("TS.utils", "parseUTABTest error", th);
            return null;
        }
    }

    public static TimeContent a(String str, List<TimeContent> list) {
        String b;
        String b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeContent) ipChange.ipc$dispatch("95420604", new Object[]{str, list});
        }
        jli b3 = jli.b(str, new Object[0]);
        jlj b4 = jlj.b(str, new Object[0]);
        if (b3 != null) {
            return TimeContent.create(b3.b(null));
        }
        if (b4 != null) {
            return b4.b(new a(new ExprParserParams(null, null, null, list), e.h()));
        }
        int indexOf = str.indexOf(jll.PREFIX);
        if (indexOf > 0) {
            try {
                int indexOf2 = str.indexOf(str.charAt(indexOf - 1), indexOf);
                if (indexOf2 >= indexOf) {
                    String substring = str.substring(indexOf, indexOf2);
                    jkq.a("TS.utils", substring);
                    jll b5 = jll.b(substring, new Object[0]);
                    if (b5 != null && (b2 = b5.b(null)) != null) {
                        return TimeContent.create(str.replace(substring, b2));
                    }
                }
            } catch (Throwable unused) {
                return TimeContent.create(str);
            }
        } else if (indexOf == 0) {
            try {
                String substring2 = str.substring(indexOf);
                jkq.a("TS.utils", substring2);
                jll b6 = jll.b(substring2, new Object[0]);
                if (b6 != null && (b = b6.b(null)) != null) {
                    return TimeContent.create(str.replace(substring2, b));
                }
            } catch (Exception e) {
                e.printStackTrace();
                return TimeContent.create(str);
            }
        }
        return TimeContent.create(str);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf(":") + 1;
        int indexOf2 = str.indexOf("?");
        if (indexOf2 > 0 && indexOf2 >= indexOf) {
            return str.substring(indexOf, indexOf2);
        }
        return indexOf > 0 ? str.substring(indexOf) : str;
    }

    public static boolean a(String str, Map<String, String> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b829021", new Object[]{str, map, str2})).booleanValue();
        }
        boolean a2 = a(str, str2);
        if (a2 || map == null) {
            return a2;
        }
        String str3 = map.get("fullUrl");
        return !TextUtils.isEmpty(str3) ? a(str3, str2) : a2;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("spm");
            if (!TextUtils.isEmpty(queryParameter)) {
                String[] split = queryParameter.split("\\.");
                if (split.length >= 2) {
                    String str3 = split[1];
                    if (!TextUtils.isEmpty(str2)) {
                        String[] split2 = str2.trim().split(",");
                        if ((split2.length == 1 && "*".equals(split2[0])) || Arrays.asList(split2).contains(str3)) {
                            return true;
                        }
                    }
                }
            } else {
                String[] split3 = str2.trim().split(",");
                if (split3.length == 1 && "*".equals(split3[0])) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return Pattern.matches(str, str2);
        }
        return false;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : (e.b().getApplicationInfo().flags & 2) != 0;
    }
}
