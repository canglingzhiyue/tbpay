package com.taobao.phenix.request;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.musie.n;
import java.util.List;
import tb.ado;
import tb.kge;
import tb.nji;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LOCAL_URI = 32;
    public static final int NETWORK_URI = 1;

    /* renamed from: a  reason: collision with root package name */
    public final int f18940a;
    public String b;
    public String c;
    public String d = "";
    public int e;
    public int f;
    public int g;
    public boolean h;
    public String i;
    public int j;
    public String k;
    public int l;
    public int m;
    public boolean n;

    static {
        kge.a(331878303);
    }

    public d(int i) {
        this.f18940a = i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "type=" + this.f18940a + ", baseName=" + this.b + ", extension=" + this.d + ", width=" + this.e + ", height=" + this.f + ", cdnSize=" + this.h + ", path=" + this.i + ", resId=" + this.j + ", base64=" + this.k;
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        return "res://" + i;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return "file://" + str;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        return "asset://" + str;
    }

    public static d c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("d1c138d", new Object[]{str});
        }
        d e = e(str);
        return (e == null && (e = f(str)) == null && (e = g(str)) == null && (e = h(str)) == null && (e = d(str)) == null) ? j(str) : e;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : (this.f18940a & 32) > 0;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : (this.f18940a & 32) == 0;
    }

    private static d d(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("50a7314e", new Object[]{str});
        }
        List<nji> p = com.taobao.phenix.intf.b.h().p();
        if (p == null) {
            return null;
        }
        for (nji njiVar : p) {
            if (njiVar.isSupported(str)) {
                d dVar = new d(48);
                dVar.l = i;
                dVar.b = str;
                return dVar;
            }
            i++;
        }
        return null;
    }

    private static d e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("94324f0f", new Object[]{str});
        }
        boolean startsWith = str.startsWith("file:///");
        if (startsWith || (str.length() > 1 && str.charAt(0) == '/' && str.charAt(1) != '/')) {
            d dVar = new d(33);
            dVar.d = i(str);
            if (startsWith) {
                dVar.i = str.substring(7);
            } else {
                dVar.i = str;
            }
            dVar.b = dVar.i;
            return dVar;
        } else if (!str.startsWith("content://")) {
            return null;
        } else {
            d dVar2 = new d(33);
            dVar2.i = str;
            dVar2.b = str;
            return dVar2;
        }
    }

    private static d f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("d7bd6cd0", new Object[]{str});
        }
        if (!str.startsWith("asset://")) {
            return null;
        }
        d dVar = new d(34);
        dVar.b = str;
        dVar.i = str.substring(8);
        dVar.d = i(str);
        return dVar;
    }

    private static d g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("1b488a91", new Object[]{str});
        }
        if (!str.startsWith("res://")) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str.substring(6));
            d dVar = new d(36);
            dVar.j = parseInt;
            dVar.b = str;
            return dVar;
        } catch (Exception unused) {
            return null;
        }
    }

    private static d h(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("5ed3a852", new Object[]{str});
        }
        if (!str.startsWith(n.BASE_64_PREFIX) || (indexOf = str.indexOf(";base64,", 11)) <= 0 || indexOf >= 17) {
            return null;
        }
        d dVar = new d(40);
        int i = indexOf + 8;
        dVar.k = str.substring(i);
        dVar.b = str.substring(0, i) + "hash=" + Integer.toHexString(dVar.k.hashCode());
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        sb.append(str.substring(11, indexOf));
        dVar.d = sb.toString();
        return dVar;
    }

    private static String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2e2d9a6", new Object[]{str});
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf > 0 ? str.substring(lastIndexOf) : "";
    }

    private static d j(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("e5e9e3d4", new Object[]{str});
        }
        d dVar = new d(1);
        dVar.b = str;
        int length = str.length();
        int indexOf2 = str.indexOf(63);
        if (indexOf2 < 0) {
            indexOf2 = length;
        }
        int lastIndexOf = str.lastIndexOf(47, indexOf2 - 1);
        if (lastIndexOf >= 0 && lastIndexOf < length - 1) {
            String substring = str.substring(lastIndexOf + 1, indexOf2);
            dVar.d = i(substring);
            if (!a(substring, dVar) && !a(str, lastIndexOf, substring, dVar) && (indexOf = str.indexOf("//gw.alicdn.com")) >= 0 && indexOf <= 6) {
                if (substring.endsWith("_.webp")) {
                    dVar.b = substring.substring(0, substring.length() - 6);
                } else {
                    dVar.b = substring;
                }
                dVar.f = 10000;
                dVar.e = 10000;
                dVar.h = true;
            }
            if (!StringUtils.isEmpty(dVar.b)) {
                int lastIndexOf2 = dVar.b.lastIndexOf(47);
                if (lastIndexOf2 > 0) {
                    dVar.c = dVar.b.substring(lastIndexOf2 + 1);
                } else {
                    dVar.c = dVar.b;
                }
            }
        }
        return dVar;
    }

    private static boolean a(String str, d dVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b8fe2fb", new Object[]{str, dVar})).booleanValue();
        }
        int indexOf = str.indexOf(95);
        if (indexOf < 0) {
            return false;
        }
        int indexOf2 = str.indexOf(120, indexOf);
        int length = str.length();
        while (indexOf2 > indexOf) {
            dVar.e = a(str, indexOf2, false, indexOf);
            dVar.f = a(str, indexOf2, true, length);
            int i2 = dVar.e;
            if (i2 > 0 && i2 == (i = dVar.f)) {
                int length2 = String.valueOf(i).length();
                int i3 = indexOf2 + length2;
                int i4 = i3 + 2;
                if (i4 >= str.length() || str.charAt(i3 + 1) != 'x' || str.charAt(i4) != 'z') {
                    dVar.h = true;
                    dVar.g = a(str, str.indexOf(98, i3 + 1), true, length);
                    int i5 = (indexOf2 - length2) - 1;
                    if (i5 > 0) {
                        dVar.b = str.substring(0, i5);
                    }
                }
                return true;
            } else if ((dVar.e > 0 && dVar.f == 10000) || (dVar.f > 0 && dVar.e == 10000)) {
                return true;
            } else {
                dVar.f = 0;
                dVar.e = 0;
                indexOf = indexOf2 + 1;
                indexOf2 = str.indexOf(120, indexOf);
            }
        }
        return false;
    }

    private static boolean a(String str, int i, String str2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16357f32", new Object[]{str, new Integer(i), str2, dVar})).booleanValue();
        }
        int lastIndexOf = str2.lastIndexOf(64);
        if (lastIndexOf >= 0 && str2.indexOf(45, lastIndexOf) <= 0 && str2.indexOf(124, lastIndexOf) <= 0 && str2.indexOf("_2e", lastIndexOf) <= 0) {
            int a2 = a(str2, lastIndexOf, 'w');
            dVar.e = a2;
            if (a2 != 0) {
                int a3 = a(str2, lastIndexOf, 'h');
                dVar.f = a3;
                if (a3 != 0 && dVar.e == dVar.f) {
                    dVar.h = true;
                    int indexOf = str.indexOf(ado.URL_SEPARATOR);
                    if (indexOf <= 0 || str.charAt(indexOf - 1) != ':') {
                        indexOf = 0;
                    }
                    dVar.b = str.substring(indexOf, i + lastIndexOf + 1);
                    return true;
                }
            }
        }
        return false;
    }

    private static int a(String str, int i, char c) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a352517f", new Object[]{str, new Integer(i), new Character(c)})).intValue();
        }
        int indexOf = str.indexOf(c, i);
        while (indexOf > i) {
            if (a(str, indexOf) && (a2 = a(str, indexOf, false, i)) != 0) {
                return a2;
            }
            i = indexOf + 1;
            indexOf = str.indexOf(c, i);
        }
        return 0;
    }

    private static boolean a(String str, int i) {
        char charAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{str, new Integer(i)})).booleanValue();
        }
        int i2 = i + 1;
        return i2 >= str.length() || (charAt = str.charAt(i2)) == '.' || charAt == '_';
    }

    private static int a(String str, int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c702c773", new Object[]{str, new Integer(i), new Boolean(z), new Integer(i2)})).intValue();
        }
        if (i < 0) {
            return 0;
        }
        if (z) {
            for (int i4 = i + 1; i4 < i2; i4++) {
                int charAt = str.charAt(i4) - '0';
                if (charAt < 0 || charAt > 9) {
                    break;
                }
                i3 = (i3 * 10) + charAt;
            }
            return i3;
        }
        int i5 = i - 1;
        int i6 = 0;
        while (i5 > i2) {
            int charAt2 = str.charAt(i5) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                return i6;
            }
            i6 += charAt2 * ((int) Math.pow(10.0d, i3));
            i5--;
            i3++;
        }
        return i6;
    }
}
