package com.taobao.android.weex_uikit.ui;

import android.support.v4.view.animation.PathInterpolatorCompat;
import android.text.TextUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.common.MUSConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FUNC_CUBIC_BEZIER = 6;
    public static final int FUNC_EASE = 4;
    public static final int FUNC_EASE_IN = 1;
    public static final int FUNC_EASE_IN_OUT = 3;
    public static final int FUNC_EASE_OUT = 2;
    public static final int FUNC_LINEAR = 0;
    public static final int FUNC_STEPS = 5;
    public static final int PROP_BACKGROUND_COLOR = 2;
    public static final int PROP_OPACITY = 1;
    public static final int PROP_TRANSFORM = 0;

    static {
        kge.a(1713909140);
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f16140a;
        public final long b;
        public final long c;
        public final int d;
        public final Object[] e;

        static {
            kge.a(-2132867192);
        }

        public a(int i, long j, long j2, int i2, Object[] objArr) {
            this.f16140a = i;
            this.b = j;
            this.c = j2;
            this.d = i2;
            this.e = objArr;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "TransitionProp{prop=" + this.f16140a + ", delayInMs=" + this.b + ", durationInMs=" + this.c + ", func=" + this.d + ", args=" + Arrays.toString(this.e) + '}';
        }
    }

    private static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (str == null) {
            throw new IllegalArgumentException("Invalid Transition prop: " + str);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1267206133:
                if (str.equals("opacity")) {
                    c = 1;
                    break;
                }
                break;
            case 605322756:
                if (str.equals("background-color")) {
                    c = 3;
                    break;
                }
                break;
            case 1052666732:
                if (str.equals("transform")) {
                    c = 0;
                    break;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            return 0;
        }
        if (c == 1) {
            return 1;
        }
        if (c == 2 || c == 3) {
            return 2;
        }
        throw new IllegalArgumentException("Invalid Transition prop: " + str);
    }

    private static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1965120668:
                if (str.equals("ease-in")) {
                    c = 0;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 4;
                    break;
                }
                break;
            case -789192465:
                if (str.equals("ease-out")) {
                    c = 1;
                    break;
                }
                break;
            case -361990811:
                if (str.equals("ease-in-out")) {
                    c = 2;
                    break;
                }
                break;
            case 3105774:
                if (str.equals("ease")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            return 1;
        }
        if (c == 1) {
            return 2;
        }
        if (c == 2) {
            return 3;
        }
        if (c == 3) {
            return 4;
        }
        if (c != 4) {
            if (str.startsWith(MUSConstants.STEPS)) {
                return 5;
            }
            if (str.startsWith("cubic-bezier")) {
                return 6;
            }
        }
        return 0;
    }

    public static List<a> a(String str, String str2, String str3, String str4, String str5) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("21e4b8ad", new Object[]{str, str2, str3, str4, str5});
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        String[] strArr = null;
        if (isEmpty && isEmpty2) {
            return null;
        }
        if (!isEmpty) {
            String trim = str.trim();
            if ("none".equals(trim) || com.taobao.android.weex_framework.util.a.ATOM_EXT_unset.equals(trim)) {
                return null;
            }
            String[] a2 = a(trim, ',');
            LinkedList linkedList = new LinkedList();
            for (String str6 : a2) {
                String[] a3 = a(str6.trim(), ' ');
                if (a3.length != 3 && a3.length != 4) {
                    throw new IllegalArgumentException("split by space array's length != 3/4");
                }
                String trim2 = a3[0].trim();
                String trim3 = a3[1].trim();
                String trim4 = a3[2].trim();
                long c = a3.length == 4 ? c(a3[3].trim()) : 0L;
                int a4 = a(trim2);
                int b = b(trim4);
                linkedList.add(new a(a4, c, c(trim3.trim()), b, a(trim4, b)));
            }
            return linkedList;
        } else if (TextUtils.isEmpty(str3)) {
            return null;
        } else {
            String[] split = str2.split(",");
            String[] split2 = str3.split(",");
            String[] split3 = TextUtils.isEmpty(str4) ? null : str4.split(",");
            String[] split4 = TextUtils.isEmpty(str5) ? null : str5.split(",");
            if (split2.length != 1 && split2.length != split.length) {
                return null;
            }
            if (split3 != null && split3.length != 1 && split3.length != split.length) {
                split3 = null;
            }
            if (split4 == null || split4.length == 1 || split4.length == split.length) {
                strArr = split4;
            }
            LinkedList linkedList2 = new LinkedList();
            for (int i = 0; i < split.length; i++) {
                int a5 = a(split[i].trim());
                long c2 = c((split2.length != split.length ? split2[0] : split2[i]).trim());
                if (split3 != null) {
                    j = c((split3.length != split.length ? split3[0] : split3[i]).trim());
                } else {
                    j = 0;
                }
                String trim5 = (strArr.length != split.length ? strArr[0] : strArr[i]).trim();
                int b2 = strArr != null ? b(trim5) : 0;
                linkedList2.add(new a(a5, j, c2, b2, a(trim5, b2)));
            }
            return linkedList2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
        if (r0 != 5) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object[] a(java.lang.String r8, int r9) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.ui.l.a(java.lang.String, int):java.lang.Object[]");
    }

    private static long c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea8", new Object[]{str})).longValue();
        }
        if (str.endsWith("ms")) {
            return Float.parseFloat(str.substring(0, str.length() - 2));
        }
        if (str.endsWith("s")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) * 1000.0f;
        }
        throw new IllegalArgumentException("Invalid transition time: " + str);
    }

    public static Interpolator a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("a6ccb186", new Object[]{aVar});
        }
        switch (aVar.d) {
            case 1:
                return PathInterpolatorCompat.create(0.42f, 0.0f, 1.0f, 1.0f);
            case 2:
                return PathInterpolatorCompat.create(0.0f, 0.0f, 0.58f, 1.0f);
            case 3:
                return PathInterpolatorCompat.create(0.42f, 0.0f, 0.58f, 1.0f);
            case 4:
                return PathInterpolatorCompat.create(0.25f, 0.1f, 0.25f, 1.0f);
            case 5:
                return new p(((Integer) aVar.e[0]).intValue(), ((Integer) aVar.e[1]).intValue());
            case 6:
                return PathInterpolatorCompat.create(((Float) aVar.e[0]).floatValue(), ((Float) aVar.e[1]).floatValue(), ((Float) aVar.e[2]).floatValue(), ((Float) aVar.e[3]).floatValue());
            default:
                return new LinearInterpolator();
        }
    }

    public static String[] a(String str, char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("75bcfd9a", new Object[]{str, new Character(c)});
        }
        ArrayList arrayList = new ArrayList(4);
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '(') {
                z = true;
            } else if (charAt == ')') {
                z = false;
            } else if (!z && charAt == c) {
                if (i != i2) {
                    arrayList.add(str.substring(i, i2));
                }
                i = i2 + 1;
            }
        }
        arrayList.add(str.substring(i));
        return (String[]) arrayList.toArray(new String[0]);
    }
}
