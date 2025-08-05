package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class axs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f25678a;
    private static final Pattern b;

    static {
        kge.a(1069084924);
        b = Pattern.compile("\\$\\{[a-zA-Z()\\. _\\-\\[\\]0-9]*(?!\\$\\{[a-zA-Z()\\. \\_\\-\\[\\]0-9]*\\})[a-zA-Z()\\. \\_\\-\\[\\]0-9]*\\}");
        HashSet hashSet = new HashSet();
        f25678a = hashSet;
        hashSet.add("empty");
        f25678a.add("not");
        f25678a.add("deleteifnull");
    }

    public static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a12221e4", new Object[]{obj, str}) : a(obj, str, true);
    }

    public static Object a(Object obj, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9936326c", new Object[]{obj, str, new Boolean(z)}) : a(obj, null, str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(java.lang.Object r5, java.lang.Object r6, java.lang.String r7, boolean r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.axs.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L21
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            r1[r5] = r6
            r5 = 2
            r1[r5] = r7
            r5 = 3
            java.lang.Boolean r6 = new java.lang.Boolean
            r6.<init>(r8)
            r1[r5] = r6
            java.lang.String r5 = "5f5a5b48"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            return r5
        L21:
            if (r5 == 0) goto L8c
            if (r7 != 0) goto L26
            goto L8c
        L26:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            java.util.regex.Pattern r7 = tb.axs.b
            java.util.regex.Matcher r7 = r7.matcher(r0)
        L31:
            boolean r1 = r7.find()
            if (r1 == 0) goto L87
            int r1 = r7.start()
            int r2 = r7.end()
            int r3 = r0.length()
            java.lang.String r7 = r7.group()
            android.util.Pair r4 = a(r7)
            if (r4 == 0) goto L61
            if (r8 != 0) goto L50
            goto L6f
        L50:
            java.lang.Object r7 = r4.first
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r4 = r4.second
            tb.axs$a r7 = a(r7, r4, r5)
            java.lang.Object r4 = r7.b
            boolean r7 = r7.f25679a
            if (r7 == 0) goto L6e
            return r4
        L61:
            java.lang.Object r4 = tb.axr.a(r5, r7)
            if (r4 != 0) goto L6e
            if (r6 == 0) goto L6e
            java.lang.Object r7 = tb.axr.a(r6, r7)
            goto L6f
        L6e:
            r7 = r4
        L6f:
            if (r1 != 0) goto L74
            if (r2 != r3) goto L74
            return r7
        L74:
            if (r7 != 0) goto L79
            java.lang.String r7 = ""
            goto L7d
        L79:
            java.lang.String r7 = r7.toString()
        L7d:
            r0.replace(r1, r2, r7)
            java.util.regex.Pattern r7 = tb.axs.b
            java.util.regex.Matcher r7 = r7.matcher(r0)
            goto L31
        L87:
            java.lang.String r5 = r0.toString()
            return r5
        L8c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.axs.a(java.lang.Object, java.lang.Object, java.lang.String, boolean):java.lang.Object");
    }

    private static a a(String str, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7ca7ed63", new Object[]{str, obj, obj2});
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
        Object a2 = jpe.a(obj, str);
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
            ipChange.ipc$dispatch("a4452e17", new Object[]{obj, obj2, aVar});
            return;
        }
        aVar.b = jpe.a(obj, "${" + obj2 + riy.BLOCK_END_STR);
        if (b(obj, obj2) <= 0) {
            z = false;
        }
        aVar.f25679a = z;
    }

    private static int b(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4eaa414", new Object[]{obj, obj2})).intValue();
        }
        if (obj2 instanceof String) {
            Object a2 = jpe.a(obj, "${" + obj2 + riy.BLOCK_END_STR);
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
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : f25678a.contains(str.toLowerCase());
    }

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f25679a;
        public Object b;

        static {
            kge.a(-712899673);
        }

        private a() {
        }
    }
}
