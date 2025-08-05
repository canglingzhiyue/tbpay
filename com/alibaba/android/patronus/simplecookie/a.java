package com.alibaba.android.patronus.simplecookie;

import android.text.format.Time;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f2411a = Pattern.compile("([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])");
    private static final Pattern b = Pattern.compile("[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})");

    /* renamed from: com.alibaba.android.patronus.simplecookie.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0083a {

        /* renamed from: a  reason: collision with root package name */
        public int f2412a;
        public int b;
        public int c;

        public C0083a(int i, int i2, int i3) {
            this.f2412a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static long a(String str) throws IllegalArgumentException {
        int b2;
        int d;
        int i;
        C0083a c0083a;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue();
        }
        Matcher matcher = f2411a.matcher(str);
        if (matcher.find()) {
            int b3 = b(matcher.group(1));
            int c = c(matcher.group(2));
            int d2 = d(matcher.group(3));
            c0083a = e(matcher.group(4));
            i = c;
            b2 = b3;
            d = d2;
        } else {
            Matcher matcher2 = b.matcher(str);
            if (matcher2.find()) {
                int c2 = c(matcher2.group(1));
                b2 = b(matcher2.group(2));
                C0083a e = e(matcher2.group(3));
                d = d(matcher2.group(4));
                i = c2;
                c0083a = e;
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (d >= 2038) {
            i3 = 1;
            i4 = 0;
            i2 = 2038;
        } else {
            i2 = d;
            i3 = b2;
            i4 = i;
        }
        Time time = new Time(com.taobao.android.weex_framework.util.a.ATOM_EXT_UTC);
        time.set(c0083a.c, c0083a.b, c0083a.f2412a, i3, i4, i2);
        return time.toMillis(false);
    }

    private static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        if (str.length() == 2) {
            return ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0');
        }
        return str.charAt(0) - '0';
    }

    private static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{str})).intValue();
        }
        int lowerCase = ((Character.toLowerCase(str.charAt(0)) + Character.toLowerCase(str.charAt(1))) + Character.toLowerCase(str.charAt(2))) - 291;
        if (lowerCase == 9) {
            return 11;
        }
        if (lowerCase == 10) {
            return 1;
        }
        if (lowerCase == 22) {
            return 0;
        }
        if (lowerCase == 26) {
            return 7;
        }
        if (lowerCase == 29) {
            return 2;
        }
        if (lowerCase == 32) {
            return 3;
        }
        if (lowerCase == 40) {
            return 6;
        }
        if (lowerCase == 42) {
            return 5;
        }
        if (lowerCase == 48) {
            return 10;
        }
        switch (lowerCase) {
            case 35:
                return 9;
            case 36:
                return 4;
            case 37:
                return 8;
            default:
                throw new IllegalArgumentException();
        }
    }

    private static int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e8", new Object[]{str})).intValue();
        }
        if (str.length() == 2) {
            int charAt = ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0');
            return charAt >= 70 ? charAt + 1900 : charAt + 2000;
        } else if (str.length() == 3) {
            return ((str.charAt(0) - '0') * 100) + ((str.charAt(1) - '0') * 10) + (str.charAt(2) - '0') + 1900;
        } else {
            if (str.length() != 4) {
                return 1970;
            }
            return ((str.charAt(0) - '0') * 1000) + ((str.charAt(1) - '0') * 100) + ((str.charAt(2) - '0') * 10) + (str.charAt(3) - '0');
        }
    }

    private static C0083a e(String str) {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0083a) ipChange.ipc$dispatch("bd7f09c0", new Object[]{str});
        }
        int charAt = str.charAt(0) - '0';
        if (str.charAt(1) != ':') {
            i = 2;
            charAt = (charAt * 10) + (str.charAt(1) - '0');
        } else {
            i = 1;
        }
        int i4 = i + 1 + 1 + 1 + 1;
        return new C0083a(charAt, ((str.charAt(i2) - '0') * 10) + (str.charAt(i3) - '0'), ((str.charAt(i4) - '0') * 10) + (str.charAt(i4 + 1) - '0'));
    }
}
