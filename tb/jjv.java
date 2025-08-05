package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class jjv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Set<String> OPS;

    /* renamed from: a  reason: collision with root package name */
    private static Pattern f29588a;

    static {
        kge.a(-1203744243);
        f29588a = Pattern.compile("\\$\\{[a-zA-Z()\\. _\\-\\[\\]0-9]*(?!\\$\\{[a-zA-Z()\\. \\_\\-\\[\\]0-9]*\\})[a-zA-Z()\\. \\_\\-\\[\\]0-9]*\\}");
        HashSet hashSet = new HashSet();
        OPS = hashSet;
        hashSet.add("empty");
        OPS.add("not");
        OPS.add("deleteifnull");
    }

    public static Object a(Object obj, String str) {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a12221e4", new Object[]{obj, str});
        }
        if (obj == null || str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        for (Matcher matcher = f29588a.matcher(sb); matcher.find(); matcher = f29588a.matcher(sb)) {
            int start = matcher.start();
            int end = matcher.end();
            int length = sb.length();
            String group = matcher.group();
            Pair<String, String> a3 = a(group);
            if (a3 != null) {
                a a4 = a((String) a3.first, a3.second, obj);
                a2 = a4.b;
                if (a4.f29589a) {
                    return a2;
                }
            } else {
                a2 = jju.a(obj, group);
            }
            if (start == 0 && end == length) {
                return a2;
            }
            sb.replace(start, end, a2 == null ? "" : a2.toString());
        }
        return sb.toString();
    }

    private static a a(String str, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8b3f9f09", new Object[]{str, obj, obj2});
        }
        a aVar = new a();
        if ("empty".equalsIgnoreCase(str)) {
            aVar.b = Integer.valueOf(b(obj2, obj));
            return aVar;
        } else if ("not".equalsIgnoreCase(str)) {
            aVar.b = Integer.valueOf(a(obj2, obj));
            return aVar;
        } else if ("deleteIfNull".equalsIgnoreCase(str)) {
            a(obj2, obj, aVar);
            return aVar;
        } else {
            aVar.b = obj;
            return aVar;
        }
    }

    private static int a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184a7913", new Object[]{obj, obj2})).intValue();
        }
        if (!(obj2 instanceof String)) {
            return obj2 instanceof Number ? ((Number) obj2).intValue() != 0 ? 0 : 1 : (!(obj2 instanceof Boolean) || ((Boolean) obj2).booleanValue()) ? 0 : 1;
        }
        String str = "${" + obj2 + riy.BLOCK_END_STR;
        Object a2 = a(obj, str);
        if (a2 instanceof String) {
            String str2 = (String) a2;
            if ("true".equalsIgnoreCase(str2)) {
                return 0;
            }
            if ("false".equalsIgnoreCase(str2)) {
                return 1;
            }
            try {
                return Integer.parseInt(str2) == 0 ? 1 : 0;
            } catch (Exception unused) {
                return str.length() > 0 ? 0 : 1;
            }
        }
        return a(obj, a2);
    }

    private static void a(Object obj, Object obj2, a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bb70e3d", new Object[]{obj, obj2, aVar});
            return;
        }
        aVar.b = a(obj, "${" + obj2 + riy.BLOCK_END_STR);
        if (b(obj, obj2) <= 0) {
            z = false;
        }
        aVar.f29589a = z;
    }

    private static int b(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4eaa414", new Object[]{obj, obj2})).intValue();
        }
        if (obj2 instanceof String) {
            Object a2 = a(obj, "${" + obj2 + riy.BLOCK_END_STR);
            if (a2 instanceof String) {
                String trim = ((String) a2).trim();
                if ("true".equalsIgnoreCase(trim)) {
                    return 0;
                }
                return (!"false".equalsIgnoreCase(trim) && trim.length() > 0) ? 0 : 1;
            }
            return b(obj, a2);
        } else if (obj2 == null) {
            return 1;
        } else {
            if (obj2 instanceof Number) {
                return ((Number) obj2).intValue() != 0 ? 0 : 1;
            } else if (obj2 instanceof Boolean) {
                return ((Boolean) obj2).booleanValue() ? 0 : 1;
            } else if (obj2 instanceof List) {
                return ((List) obj2).isEmpty() ? 1 : 0;
            } else if (!obj2.getClass().isArray()) {
                return (!(obj2 instanceof Map) || !((Map) obj2).isEmpty()) ? 0 : 1;
            } else {
                try {
                    return Array.getLength(obj2) > 0 ? 0 : 1;
                } catch (Exception unused) {
                    return 0;
                }
            }
        }
    }

    private static Pair<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c2e055fc", new Object[]{str});
        }
        String trim = str.substring(str.indexOf(riy.BLOCK_START_STR) + 1, str.length() - 1).trim();
        String[] split = trim.split(" ");
        if (split.length <= 0) {
            return null;
        }
        String str2 = split[0];
        if (!b(str2)) {
            return null;
        }
        return new Pair<>(str2, trim.substring(str2.length()));
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : OPS.contains(str.toLowerCase());
    }

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f29589a;
        public Object b;

        static {
            kge.a(473170808);
        }

        private a() {
        }
    }
}
