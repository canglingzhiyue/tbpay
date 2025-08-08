package com.taobao.tao.flexbox.layoutmanager.filter;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.ogg;
import tb.ohe;

/* loaded from: classes8.dex */
public class ArrayUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1656654534);
    }

    @FilterHandler(name = "concat")
    public static Object concat(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d59a76bf", new Object[]{obj, obj2});
        }
        if ((obj instanceof String[]) && (obj2 instanceof String[])) {
            String[] strArr = (String[]) obj;
            String[] strArr2 = (String[]) obj2;
            int length = strArr.length;
            int length2 = strArr2.length + length;
            String[] strArr3 = new String[length2];
            for (int i = 0; i < length2; i++) {
                if (i < length) {
                    strArr3[i] = strArr[i];
                } else if (i < length2) {
                    strArr3[i] = strArr2[i - length];
                }
            }
            return strArr3;
        }
        if (obj instanceof List) {
            if (obj2 instanceof List) {
                ((List) obj).addAll((List) obj2);
                return obj;
            } else if (obj2 instanceof Map) {
                ((List) obj).add(obj2);
                return obj;
            }
        } else if (obj instanceof Map) {
            if (obj2 instanceof List) {
                ((List) obj2).add(0, obj);
                return obj2;
            } else if (obj2 instanceof Map) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.add(obj);
                jSONArray.add(obj2);
                return jSONArray;
            }
        }
        return obj;
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_join)
    public static String join(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7dd2dd34", new Object[]{list, str});
        }
        if (list == null) {
            return "";
        }
        if (StringUtils.isEmpty(str)) {
            str = ",";
        }
        ohe.a a2 = ohe.a();
        for (String str2 : list) {
            a2.a(str2).a(str);
        }
        return a2.a() > 1 ? a2.a(0, a2.a() - 1) : "";
    }

    @FilterHandler(name = "pop")
    public static Object pop(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("865c6f09", new Object[]{list});
        }
        if (list != null && list.size() > 0) {
            return list.remove(list.size() - 1);
        }
        return null;
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_shift)
    public static Object shift(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d1ed762d", new Object[]{obj});
        }
        if (!(obj instanceof List)) {
            return null;
        }
        List list = (List) obj;
        if (list.size() <= 0) {
            return null;
        }
        return list.remove(0);
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_unshift)
    public static int unshift(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8acbc63b", new Object[]{obj, obj2})).intValue();
        }
        if (!(obj instanceof List)) {
            return 0;
        }
        List list = (List) obj;
        list.add(0, obj2);
        return list.size();
    }

    @FilterHandler(name = "push")
    public static List push(List list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eaa6799", new Object[]{list, obj});
        }
        if (list == null) {
            list = new ArrayList();
        }
        if (obj != null) {
            list.add(obj);
        }
        return list;
    }

    @FilterHandler(name = "first")
    public static Object first(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("37de983f", new Object[]{obj});
        }
        if (obj != null && (obj instanceof List)) {
            List list = (List) obj;
            if (list.size() > 0) {
                return list.get(0);
            }
        }
        return null;
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_last)
    public static Object last(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bfb86199", new Object[]{obj});
        }
        if (!(obj instanceof List)) {
            return null;
        }
        List list = (List) obj;
        if (list.size() <= 0) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_reverse)
    public static Object reverse(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4f8823cd", new Object[]{obj});
        }
        if (!(obj instanceof List)) {
            return null;
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayList.add(list.get(size));
        }
        return arrayList;
    }

    @FilterHandler(name = "slice")
    public static Object slice(List list, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8260bb0", new Object[]{list, obj, obj2});
        }
        if (list == null) {
            return null;
        }
        int a2 = oec.a(obj, 0);
        int a3 = oec.a(obj2, 0);
        if (list.size() <= 0) {
            return null;
        }
        if (a3 < 0) {
            return list.subList((list.size() - 1) - a2, list.size() - 1);
        }
        return list.subList(a2, Math.min(Math.min(a3, list.size() + a2), list.size()));
    }

    @FilterHandler(name = "slice")
    public static Object slice(List list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a6a82a8c", new Object[]{list, obj});
        }
        if (list == null) {
            return null;
        }
        int a2 = oec.a(obj, 0);
        if (list.size() <= 0) {
            return null;
        }
        return list.subList(a2, list.size() - 1);
    }

    @FilterHandler(name = "sort")
    public static Object sort(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("df6b2591", new Object[]{obj});
        }
        if (obj != null && (obj instanceof List)) {
            Arrays.sort(((List) obj).toArray());
        }
        return null;
    }

    @FilterHandler(name = "splice")
    public static Object splice(List list, int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("39faf302", new Object[]{list, new Integer(i), new Integer(i2), obj});
        }
        if (list != null && list.size() > 0 && i < list.size() && i > 0) {
            if (i2 == 0) {
                if (obj != null) {
                    list.add(i, obj);
                }
                return list;
            } else if (i2 > 0) {
                if (obj == null) {
                    while (i3 < i2) {
                        list.remove(i);
                        i3++;
                    }
                    return list;
                }
                while (i3 < i2) {
                    list.remove(i);
                    i3++;
                }
                list.add(i, obj);
                return list;
            }
        }
        return null;
    }

    @FilterHandler(name = "at")
    public static Object at(List list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d3d42dfa", new Object[]{list, new Integer(i)});
        }
        if (list != null && i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_indexOf)
    public static Object indexOf(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d24e512a", new Object[]{obj, obj2});
        }
        List list = null;
        if (obj instanceof List) {
            list = (List) obj;
        } else if (obj instanceof String) {
            try {
                list = JSONArray.parseArray((String) obj);
            } catch (Exception e) {
                ogg.a("ArrayUtils", e.getMessage());
            }
        }
        if (list != null) {
            return Integer.valueOf(list.indexOf(obj2));
        }
        return -1;
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_length)
    public static int length(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e306afc", new Object[]{obj})).intValue();
        }
        if (obj instanceof List) {
            return ((List) obj).size();
        }
        if (obj instanceof Map) {
            return ((Map) obj).size();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        return ((String) obj).length();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077 A[SYNTHETIC] */
    @com.taobao.tao.flexbox.layoutmanager.filter.FilterHandler(name = "filterSimilarOne")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object filterSimilarOne(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.filter.ArrayUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L19
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r6 = 1
            r1[r6] = r7
            r6 = 2
            r1[r6] = r8
            java.lang.String r6 = "c575f4c4"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            return r6
        L19:
            r0 = 0
            if (r6 == 0) goto L87
            boolean r1 = r6 instanceof java.util.List
            if (r1 == 0) goto L87
            boolean r1 = r7 instanceof java.lang.String
            if (r1 == 0) goto L87
            java.util.List r6 = (java.util.List) r6
            r7.toString()
            r1 = 0
            if (r8 == 0) goto L38
            java.lang.String r8 = r8.toString()
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            float r1 = r8.floatValue()
        L38:
            r8 = -1
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L3c:
            int r4 = r6.size()
            if (r2 >= r4) goto L7a
            java.lang.Object r4 = r6.get(r2)     // Catch: java.lang.Exception -> L59
            if (r4 == 0) goto L59
            if (r7 == 0) goto L59
            boolean r5 = r4 instanceof java.util.Map     // Catch: java.lang.Exception -> L59
            if (r5 == 0) goto L59
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L59
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Exception -> L59
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Exception -> L59
            goto L5a
        L59:
            r4 = r0
        L5a:
            if (r4 == 0) goto L77
            java.lang.String r4 = r4.toString()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            float r4 = r4.floatValue()
            float r4 = r4 - r1
            float r5 = java.lang.Math.abs(r4)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 >= 0) goto L77
            float r8 = java.lang.Math.abs(r4)
            r3 = r8
            r8 = r2
        L77:
            int r2 = r2 + 1
            goto L3c
        L7a:
            if (r8 < 0) goto L87
            int r7 = r6.size()
            if (r8 >= r7) goto L87
            java.lang.Object r6 = r6.get(r8)
            return r6
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.filter.ArrayUtils.filterSimilarOne(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @FilterHandler(name = "contains")
    public static boolean contains(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17fed8e2", new Object[]{obj, obj2})).booleanValue();
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return ((List) obj).contains(obj2);
    }

    @FilterHandler(name = "indexOfKey")
    public static int indexOfKey(List list, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b3e3d79", new Object[]{list, obj, obj2})).intValue();
        }
        if (list == null) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj3 = list.get(i);
            if ((obj3 instanceof Map) && oec.a(((Map) obj3).get(obj2), obj)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Object a(String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f1cf6c6f", new Object[]{str, list});
        }
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -1354795244:
                    if (str.equals("concat")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1106363674:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_length)) {
                        c = 14;
                        break;
                    }
                    break;
                case -895859076:
                    if (str.equals("splice")) {
                        c = 11;
                        break;
                    }
                    break;
                case -567445985:
                    if (str.equals("contains")) {
                        c = 16;
                        break;
                    }
                    break;
                case -277637751:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_unshift)) {
                        c = 4;
                        break;
                    }
                    break;
                case 3123:
                    if (str.equals("at")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 111185:
                    if (str.equals("pop")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3267882:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_join)) {
                        c = 1;
                        break;
                    }
                    break;
                case 3314326:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_last)) {
                        c = 7;
                        break;
                    }
                    break;
                case 3452698:
                    if (str.equals("push")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3536286:
                    if (str.equals("sort")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 97440432:
                    if (str.equals("first")) {
                        c = 6;
                        break;
                    }
                    break;
                case 109407362:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_shift)) {
                        c = 3;
                        break;
                    }
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 503432723:
                    if (str.equals("filterSimilarOne")) {
                        c = 15;
                        break;
                    }
                    break;
                case 731926358:
                    if (str.equals("indexOfKey")) {
                        c = 17;
                        break;
                    }
                    break;
                case 1099846370:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_reverse)) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1943291465:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_indexOf)) {
                        c = '\r';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return concat(list.get(0), list.get(1));
                case 1:
                    return join((List) list.get(0), (String) list.get(1));
                case 2:
                    return pop((List) list.get(0));
                case 3:
                    return shift(list.get(0));
                case 4:
                    return Integer.valueOf(unshift(list.get(0), list.get(1)));
                case 5:
                    return push((List) list.get(0), list.get(1));
                case 6:
                    return first(list.get(0));
                case 7:
                    return last(list.get(0));
                case '\b':
                    return reverse(list.get(0));
                case '\t':
                    if (list.size() > 0) {
                        Object obj = list.get(list.size() - 1);
                        if (obj instanceof y) {
                            list.remove(obj);
                        }
                    }
                    if (list.size() == 2) {
                        return slice((List) list.get(0), list.get(1));
                    }
                    if (list.size() > 2) {
                        return slice((List) list.get(0), list.get(1), list.get(2));
                    }
                    break;
                case '\n':
                    break;
                case 11:
                    return splice((List) list.get(0), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue(), list.get(3));
                case '\f':
                    return at((List) list.get(0), ((Integer) list.get(1)).intValue());
                case '\r':
                    return indexOf(list.get(0), list.get(1));
                case 14:
                    return Integer.valueOf(length(list.get(0)));
                case 15:
                    return filterSimilarOne(list.get(0), list.get(1), list.get(2));
                case 16:
                    return Boolean.valueOf(contains(list.get(0), list.get(1)));
                case 17:
                    return Integer.valueOf(indexOfKey((List) list.get(0), list.get(1), list.get(2)));
                default:
                    return "";
            }
            return sort(list.get(0));
        } catch (Throwable th) {
            ogg.a("array.filter", "error:" + str + th.getMessage());
            return "";
        }
    }
}
