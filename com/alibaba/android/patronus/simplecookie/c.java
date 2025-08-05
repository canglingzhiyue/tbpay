package com.alibaba.android.patronus.simplecookie;

import android.net.ParseException;
import android.util.Log;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static c f2413a = null;
    private static final int b = 6;
    private static final int c = 8;
    private static final String[] f;
    private static final b g;
    private Map<String, ArrayList<a>> d = new LinkedHashMap(200, 0.75f, true);
    private boolean e = true;

    public static /* synthetic */ Map a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("277bf982", new Object[]{cVar}) : cVar.d;
    }

    public static /* synthetic */ Map a(c cVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8a51d60d", new Object[]{cVar, map});
        }
        cVar.d = map;
        return map;
    }

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", ErrorType.NETWORK, "net", "or", "org"};
        f = strArr;
        Arrays.sort(strArr);
        g = new b();
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f2417a;
        public String b;
        public String c;
        public String d;
        public long e;
        public long f;
        public long g;
        public boolean h;
        public byte i;

        public a() {
        }

        public a(String str, String str2) {
            this.f2417a = str;
            this.b = str2;
            this.e = -1L;
        }

        public boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5b2daaf4", new Object[]{this, aVar})).booleanValue();
            }
            return this.f2417a.equals(aVar.f2417a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && (!((this.d == null) ^ (aVar.d == null)));
        }

        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
            }
            if (this.f2417a.startsWith(".")) {
                if (!str.endsWith(this.f2417a.substring(1))) {
                    return false;
                }
                int length = this.f2417a.length();
                int length2 = str.length();
                return length2 <= length + (-1) || str.charAt(length2 - length) == '.';
            }
            return str.equals(this.f2417a);
        }

        public boolean b(String str) {
            int length;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
            }
            if (!str.startsWith(this.b) || (length = this.b.length()) == 0) {
                return false;
            }
            return this.b.charAt(length + (-1)) == '/' || str.length() <= length || str.charAt(length) == '/';
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "domain: " + this.f2417a + "; path: " + this.b + "; name: " + this.c + "; value: " + this.d;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Comparator<a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private b() {
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, aVar, aVar2})).intValue() : a(aVar, aVar2);
        }

        public int a(a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3626ab5b", new Object[]{this, aVar, aVar2})).intValue();
            }
            int length = aVar2.b.length() - aVar.b.length();
            if (length != 0) {
                return length;
            }
            int length2 = aVar2.f2417a.length() - aVar.f2417a.length();
            if (length2 != 0) {
                return length2;
            }
            if (aVar2.d == null) {
                if (aVar.d != null) {
                    return -1;
                }
            } else if (aVar.d == null) {
                return 1;
            }
            return aVar.c.compareTo(aVar2.c);
        }
    }

    private c() {
    }

    public static synchronized c a() {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("6a88efcd", new Object[0]);
            }
            if (f2413a == null) {
                f2413a = new c();
            }
            return f2413a;
        }
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        throw new CloneNotSupportedException("doesn't implement Cloneable");
    }

    public synchronized void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public synchronized boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            a(new d(str), str2);
        } catch (ParseException unused) {
            Log.e("webkit", "Bad address: " + str);
        }
    }

    public synchronized void a(d dVar, String str) {
        boolean z;
        long j;
        IpChange ipChange = $ipChange;
        byte b2 = 3;
        byte b3 = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a065d36", new Object[]{this, dVar, str});
        } else if (str != null && str.length() > 4096) {
        } else {
            if (this.e && dVar != null) {
                String[] b4 = b(dVar);
                if (b4 == null) {
                    return;
                }
                if (b4[1].length() > 1) {
                    int lastIndexOf = b4[1].lastIndexOf(47);
                    String str2 = b4[1];
                    if (lastIndexOf <= 0) {
                        lastIndexOf++;
                    }
                    b4[1] = str2.substring(0, lastIndexOf);
                }
                ArrayList<a> arrayList = null;
                try {
                    arrayList = a(b4[0], b4[1], str);
                } catch (RuntimeException unused) {
                    Log.e("webkit", "parse cookie failed for: " + str);
                }
                if (arrayList != null && arrayList.size() != 0) {
                    String b5 = b(b4[0]);
                    ArrayList<a> arrayList2 = this.d.get(b5);
                    if (arrayList2 == null) {
                        arrayList2 = com.alibaba.android.patronus.simplecookie.b.a().a(b5);
                        this.d.put(b5, arrayList2);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        a aVar = arrayList.get(i);
                        Iterator<a> it = arrayList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            a next = it.next();
                            if (aVar.a(next)) {
                                if (aVar.e >= 0 && aVar.e <= currentTimeMillis) {
                                    next.g = currentTimeMillis;
                                    next.i = b3;
                                    z = true;
                                }
                                if (!next.h || "https".equals(dVar.f2418a)) {
                                    next.d = aVar.d;
                                    next.e = aVar.e;
                                    next.h = aVar.h;
                                    next.f = currentTimeMillis;
                                    next.g = currentTimeMillis;
                                    next.i = b2;
                                }
                                z = true;
                            }
                        }
                        if (z || (aVar.e >= 0 && aVar.e <= currentTimeMillis)) {
                            j = currentTimeMillis;
                        } else {
                            aVar.f = currentTimeMillis;
                            aVar.g = currentTimeMillis;
                            aVar.i = (byte) 0;
                            if (arrayList2.size() > 50) {
                                a aVar2 = new a();
                                aVar2.f = currentTimeMillis;
                                Iterator<a> it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    a next2 = it2.next();
                                    long j2 = currentTimeMillis;
                                    if (next2.f < aVar2.f && next2.i != 2) {
                                        aVar2 = next2;
                                    }
                                    currentTimeMillis = j2;
                                }
                                j = currentTimeMillis;
                                aVar2.i = (byte) 2;
                            } else {
                                j = currentTimeMillis;
                            }
                            arrayList2.add(aVar);
                        }
                        i++;
                        currentTimeMillis = j;
                        b2 = 3;
                        b3 = 2;
                    }
                }
            }
        }
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            return a(new d(str));
        } catch (ParseException unused) {
            Log.e("webkit", "Bad address: " + str);
            return null;
        }
    }

    public synchronized String a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc8ea3b4", new Object[]{this, dVar});
        }
        if (this.e && dVar != null) {
            String[] b2 = b(dVar);
            if (b2 == null) {
                return null;
            }
            String b3 = b(b2[0]);
            ArrayList<a> arrayList = this.d.get(b3);
            if (arrayList == null) {
                arrayList = com.alibaba.android.patronus.simplecookie.b.a().a(b3);
                this.d.put(b3, arrayList);
            }
            long currentTimeMillis = System.currentTimeMillis();
            boolean equals = "https".equals(dVar.f2418a);
            Iterator<a> it = arrayList.iterator();
            TreeSet<a> treeSet = new TreeSet(g);
            while (it.hasNext()) {
                a next = it.next();
                if (next.a(b2[0]) && next.b(b2[1]) && (next.e < 0 || next.e > currentTimeMillis)) {
                    if (!next.h || equals) {
                        if (next.i != 2) {
                            next.f = currentTimeMillis;
                            treeSet.add(next);
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder(256);
            for (a aVar : treeSet) {
                if (sb.length() > 0) {
                    sb.append(';');
                    sb.append(' ');
                }
                sb.append(aVar.c);
                if (aVar.d != null) {
                    sb.append('=');
                    sb.append(aVar.d);
                }
            }
            if (sb.length() <= 0) {
                return null;
            }
            return sb.toString();
        }
        return null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            new Thread(new Runnable() { // from class: com.alibaba.android.patronus.simplecookie.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (c.this) {
                        for (ArrayList arrayList : c.a(c.this).values()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((a) it.next()).e == -1) {
                                    it.remove();
                                }
                            }
                        }
                        com.alibaba.android.patronus.simplecookie.b.a().d();
                    }
                }
            }, "PatronsClearCache").start();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            new Thread(new Runnable() { // from class: com.alibaba.android.patronus.simplecookie.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (c.this) {
                        c.a(c.this, new LinkedHashMap(200, 0.75f, true));
                        com.alibaba.android.patronus.simplecookie.b.a().b();
                    }
                }
            }, "clearCache").start();
        }
    }

    public synchronized boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return com.alibaba.android.patronus.simplecookie.b.a().c();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            new Thread(new Runnable() { // from class: com.alibaba.android.patronus.simplecookie.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (c.this) {
                        long currentTimeMillis = System.currentTimeMillis();
                        for (ArrayList arrayList : c.a(c.this).values()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                a aVar = (a) it.next();
                                if (aVar.e > 0 && aVar.e < currentTimeMillis) {
                                    it.remove();
                                }
                            }
                        }
                        com.alibaba.android.patronus.simplecookie.b.a().a(currentTimeMillis);
                    }
                }
            }, "removeExpiredCookie").start();
        }
    }

    public synchronized ArrayList<a> a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("fb533536", new Object[]{this, new Long(j)});
        }
        ArrayList<a> arrayList = new ArrayList<>();
        for (ArrayList<a> arrayList2 : this.d.values()) {
            Iterator<a> it = arrayList2.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.g > j) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public synchronized void a(a aVar) {
        String b2;
        ArrayList<a> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2daaf0", new Object[]{this, aVar});
            return;
        }
        if (aVar.i == 2 && (arrayList = this.d.get((b2 = b(aVar.f2417a)))) != null) {
            arrayList.remove(aVar);
            if (arrayList.isEmpty()) {
                this.d.remove(b2);
            }
        }
    }

    public synchronized void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8906454f", new Object[]{this, aVar});
        } else {
            aVar.i = (byte) 1;
        }
    }

    public synchronized ArrayList<a> g() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("c42eda48", new Object[]{this});
        }
        int size = this.d.size();
        if (size < 15) {
            Iterator<ArrayList<a>> it = this.d.values().iterator();
            while (it.hasNext() && i < 1000) {
                i += it.next().size();
            }
        }
        ArrayList<a> arrayList = new ArrayList<>();
        if (size >= 15 || i >= 1000) {
            Object[] array = this.d.keySet().toArray();
            int i2 = (size / 10) + 1;
            while (true) {
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    break;
                }
                String obj = array[i3].toString();
                arrayList.addAll(this.d.get(obj));
                this.d.remove(obj);
                i2 = i3;
            }
        }
        return arrayList;
    }

    private String[] b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("da3f039a", new Object[]{this, dVar});
        }
        if (dVar.b == null || dVar.d == null) {
            return null;
        }
        String[] strArr = {dVar.b.toLowerCase(), dVar.d};
        int indexOf = strArr[0].indexOf(46);
        if (indexOf == -1) {
            if (dVar.f2418a.equalsIgnoreCase("file")) {
                strArr[0] = "localhost";
            }
        } else if (indexOf == strArr[0].lastIndexOf(46)) {
            strArr[0] = '.' + strArr[0];
        }
        if (strArr[1].charAt(0) != '/') {
            return null;
        }
        int indexOf2 = strArr[1].indexOf(63);
        if (indexOf2 != -1) {
            strArr[1] = strArr[1].substring(0, indexOf2);
        }
        return strArr;
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        int indexOf = str.indexOf(46);
        int lastIndexOf = str.lastIndexOf(46);
        while (indexOf < lastIndexOf) {
            i = indexOf + 1;
            indexOf = str.indexOf(46, i);
        }
        return i > 0 ? str.substring(i) : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e5, code lost:
        if (r24.charAt(r8) == r12) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e7, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0105, code lost:
        if (r24.charAt(r8) == r12) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.ArrayList<com.alibaba.android.patronus.simplecookie.c.a> a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.patronus.simplecookie.c.a(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            com.alibaba.android.patronus.simplecookie.b.a().f();
        }
    }
}
