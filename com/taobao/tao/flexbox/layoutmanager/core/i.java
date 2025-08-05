package com.taobao.tao.flexbox.layoutmanager.core;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.h;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import tb.kge;
import tb.ogg;
import tb.ogh;

/* loaded from: classes8.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int t_bin = 7;
        public static final int t_bool_false = 0;
        public static final int t_bool_true = 1;
        public static final int t_float = 5;
        public static final int t_int = 4;
        public static final int t_list = 3;
        public static final int t_map = 2;
        public static final int t_max = 10;
        public static final int t_string = 6;

        static {
            kge.a(-1282670903);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r6v13, types: [java.util.Map, java.util.HashMap] */
        /* JADX WARN: Type inference failed for: r6v14, types: [com.taobao.tao.flexbox.layoutmanager.core.h$b] */
        /* JADX WARN: Type inference failed for: r6v15, types: [java.util.List, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object] */
        public static Object a(a aVar) {
            ?? r6;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("17ba70f8", new Object[]{aVar});
            }
            ArrayList arrayList = new ArrayList();
            long i = aVar.i();
            ArrayList arrayList2 = new ArrayList((int) i);
            while (true) {
                long j = i - 1;
                if (i <= 0) {
                    break;
                }
                arrayList2.add(Long.valueOf(aVar.i()));
                i = j;
            }
            List<Number> a2 = d.a(arrayList2);
            long longValue = a2.get(0).longValue();
            ArrayList<Integer> arrayList3 = new ArrayList((int) longValue);
            int i2 = 1;
            while (true) {
                long j2 = longValue - 1;
                if (longValue <= 0) {
                    break;
                }
                arrayList3.add(Integer.valueOf(a2.get(i2).intValue()));
                i2++;
                longValue = j2;
            }
            int i3 = i2 + 1;
            long longValue2 = a2.get(i2).longValue();
            ArrayList<Number> arrayList4 = new ArrayList((int) longValue2);
            while (true) {
                long j3 = longValue2 - 1;
                if (longValue2 <= 0) {
                    break;
                }
                arrayList4.add(Long.valueOf(d.b(a2.get(i3).longValue())));
                i3++;
                longValue2 = j3;
            }
            int i4 = i3 + 1;
            long longValue3 = a2.get(i3).longValue();
            ArrayList<Long> arrayList5 = new ArrayList((int) longValue3);
            while (true) {
                long j4 = longValue3 - 1;
                if (longValue3 <= 0) {
                    break;
                }
                arrayList5.add(Long.valueOf(a2.get(i4).longValue()));
                i4++;
                longValue3 = j4;
            }
            List<Number> subList = a2.subList(i4, a2.size());
            for (Integer num : arrayList3) {
                arrayList.add(aVar.b(num.intValue()));
            }
            for (Number number : arrayList4) {
                arrayList.add(number);
            }
            long i5 = aVar.i();
            while (true) {
                long j5 = i5 - 1;
                if (i5 <= 0) {
                    break;
                }
                arrayList.add(Double.valueOf(Double.longBitsToDouble(aVar.e())));
                i5 = j5;
            }
            for (Long l : arrayList5) {
                arrayList.add(aVar.a((int) l.longValue()));
            }
            ArrayList arrayList6 = new ArrayList();
            int i6 = 0;
            while (i6 < subList.size()) {
                int intValue = subList.get(i6).intValue();
                if (intValue == 0) {
                    r6 = false;
                } else if (intValue == 1) {
                    r6 = true;
                } else if (intValue == 2) {
                    r6 = new HashMap();
                    i6++;
                    int intValue2 = subList.get(i6).intValue();
                    ArrayList arrayList7 = new ArrayList();
                    while (true) {
                        int i7 = intValue2 - 1;
                        if (intValue2 <= 0) {
                            break;
                        }
                        arrayList7.add(arrayList6.remove(arrayList6.size() - 1));
                        intValue2 = i7;
                    }
                    boolean z = false;
                    for (Object obj : arrayList7) {
                        Object remove = arrayList6.remove(arrayList6.size() - 1);
                        if ("uid".equals(remove)) {
                            z = true;
                        }
                        r6.put(remove, obj);
                    }
                    if (z) {
                        r6 = h.b.a(r6);
                    }
                } else if (intValue == 3) {
                    r6 = new ArrayList();
                    i6++;
                    int intValue3 = subList.get(i6).intValue();
                    while (true) {
                        int i8 = intValue3 - 1;
                        if (intValue3 <= 0) {
                            break;
                        }
                        r6.add(arrayList6.remove(arrayList6.size() - 1));
                        intValue3 = i8;
                    }
                } else if (intValue != 4) {
                    r6 = arrayList.get(intValue - 10);
                } else {
                    i6++;
                    r6 = subList.get(i6);
                }
                arrayList6.add(r6);
                i6++;
            }
            return arrayList6.get(0);
        }
    }

    static {
        kge.a(-2136710347);
    }

    public static Object a(byte[] bArr) {
        Object a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("584113e3", new Object[]{bArr});
        }
        a aVar = new a(bArr);
        if (aVar.c() == 116) {
            int c2 = aVar.c();
            boolean f = aVar.f();
            int c3 = aVar.c();
            int d2 = aVar.d();
            if (f) {
                aVar.a(a(bArr, aVar.j(), d2));
            }
            if (c2 == 1) {
                ogh.a("parse Binary DSL V1");
                a2 = c.a(aVar);
            } else {
                ogh.a("parse Binary DSL V0");
                if (c3 == 1) {
                    z = true;
                }
                a2 = b.a(aVar, z);
            }
            ogh.b();
            return a2;
        }
        ogh.a("parse JSON DSL");
        try {
            JSONObject parseObject = JSONObject.parseObject(new String(bArr, 0, bArr.length, "utf-8"));
            a(parseObject);
            ogh.b();
            return parseObject;
        } catch (Exception e) {
            e.printStackTrace();
            ogh.b();
            return null;
        }
    }

    private static void a(Object obj) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{obj});
        } else if (!(obj instanceof List)) {
            if (!(obj instanceof Map)) {
                return;
            }
            Map map = (Map) obj;
            for (Map.Entry entry : map.entrySet()) {
                if ((entry.getValue() instanceof Map) && ((Map) entry.getValue()).containsKey("uid")) {
                    h.b a2 = h.b.a((Map) entry.getValue());
                    map.put(entry.getKey(), a2);
                    a(a2.d);
                }
            }
        } else {
            while (true) {
                List list = (List) obj;
                if (i >= list.size()) {
                    return;
                }
                h.b a3 = h.b.a((Map) list.get(i));
                list.set(i, a3);
                if (a3.d != null) {
                    a(a3.d);
                }
                i++;
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public byte[] f20356a;
        public int b = 0;

        static {
            kge.a(-1133159249);
        }

        private static short a(byte[] bArr, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2713f1b1", new Object[]{bArr, new Integer(i)})).shortValue() : (short) ((bArr[i] & 255) | (bArr[i + 1] << 8));
        }

        private static int b(byte[] bArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8ef51e86", new Object[]{bArr, new Integer(i)})).intValue();
            }
            int i2 = i + 1;
            int i3 = i2 + 1;
            return ((bArr[i3 + 1] & 255) << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
        }

        private static long c(byte[] bArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f6d64b66", new Object[]{bArr, new Integer(i)})).longValue();
            }
            int i2 = i + 1;
            int i3 = i2 + 1;
            int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
            int i5 = i3 + 1;
            int i6 = i4 | ((bArr[i3] & 255) << 16);
            int i7 = i5 + 1;
            int i8 = i6 | ((bArr[i5] & 255) << 24);
            int i9 = i7 + 1;
            int i10 = i9 + 1;
            int i11 = ((bArr[i9] & 255) << 8) | (bArr[i7] & 255);
            return (i8 & 4294967295L) | ((((bArr[i10 + 1] & 255) << 24) | (i11 | ((bArr[i10] & 255) << 16))) << 32);
        }

        public a(byte[] bArr) {
            this.f20356a = bArr;
        }

        public void a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
                return;
            }
            this.f20356a = bArr;
            this.b = 0;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b > this.f20356a.length - 1;
        }

        public byte b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83d5", new Object[]{this})).byteValue();
            }
            byte[] bArr = this.f20356a;
            int i = this.b;
            byte b = bArr[i];
            this.b = i + 1;
            return b;
        }

        public byte[] a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("5c10e0a2", new Object[]{this, new Integer(i)});
            }
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                byte[] bArr2 = this.f20356a;
                int i3 = this.b;
                bArr[i2] = bArr2[i3];
                this.b = i3 + 1;
            }
            return bArr;
        }

        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : b() & 255;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
            }
            int b = b(this.f20356a, this.b);
            this.b += 4;
            return b;
        }

        public long e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue();
            }
            long c = c(this.f20356a, this.b);
            this.b += 8;
            return c;
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : b() != 0;
        }

        public short g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5c0f96b", new Object[]{this})).shortValue();
            }
            short a2 = a(this.f20356a, this.b);
            this.b += 2;
            return a2;
        }

        public int h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : g() & 65535;
        }

        public String b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{this, new Integer(i)});
            }
            try {
                String str = new String(this.f20356a, this.b, i, "utf-8");
                this.b += i;
                return str;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "";
            }
        }

        public long i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5dd2864", new Object[]{this})).longValue();
            }
            long a2 = d.a(this.f20356a, this.b);
            this.b += d.a(a2);
            return a2;
        }

        public int j() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.b;
        }
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int t_boolean = 7;
        public static final int t_double = 6;
        public static final int t_float = 5;
        public static final int t_list = 1;
        public static final int t_lstring = 4;
        public static final int t_map = 0;
        public static final int t_mref = 13;
        public static final int t_mstring = 3;
        public static final int t_ref = 12;
        public static final int t_ref0 = 14;
        public static final int t_ref1 = 15;
        public static final int t_ref2 = 16;
        public static final int t_ref3 = 17;
        public static final int t_ref4 = 18;
        public static final int t_ref5 = 19;
        public static final int t_ref6 = 20;
        public static final int t_ref7 = 21;
        public static final int t_ref8 = 22;
        public static final int t_ref9 = 23;
        public static final int t_string = 2;
        public static final int t_uint16 = 9;
        public static final int t_uint32 = 10;
        public static final int t_uint64 = 11;
        public static final int t_uint8 = 8;

        static {
            kge.a(-1282670904);
        }

        public static Object a(a aVar, boolean z) {
            int c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f5a7c5d8", new Object[]{aVar, new Boolean(z)});
            }
            ArrayList arrayList = new ArrayList(200);
            int h = aVar.h();
            ArrayList arrayList2 = new ArrayList(h);
            while (true) {
                int i = h - 1;
                if (h <= 0) {
                    break;
                }
                if (z) {
                    c = aVar.h();
                } else {
                    c = aVar.c();
                }
                if (c > 0) {
                    arrayList2.add(aVar.b(c));
                } else {
                    arrayList2.add("");
                }
                h = i;
            }
            while (!aVar.a()) {
                a(aVar.c(), aVar, arrayList, arrayList2);
            }
            return arrayList.get(0);
        }

        private static void a(int i, a aVar, List list, List list2) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d2d7dc9", new Object[]{new Integer(i), aVar, list, list2});
            } else if (i != 255) {
                switch (i) {
                    case 0:
                        int h = aVar.h();
                        HashMap hashMap = new HashMap(h);
                        int size = list.size();
                        int i2 = h;
                        while (true) {
                            int i3 = i2 - 1;
                            if (i2 > 0) {
                                size--;
                                Object obj = list.get(size);
                                String str = (String) list.get(size - h);
                                hashMap.put(str, obj);
                                if (str.equals("uid")) {
                                    z = true;
                                }
                                i2 = i3;
                            } else {
                                int size2 = list.size();
                                for (int i4 = size2 - 1; i4 >= size2 - (h * 2); i4--) {
                                    list.remove(i4);
                                }
                                if (z) {
                                    list.add(h.b.a(hashMap));
                                    return;
                                } else {
                                    list.add(hashMap);
                                    return;
                                }
                            }
                        }
                    case 1:
                        int h2 = aVar.h();
                        ArrayList arrayList = new ArrayList(h2);
                        int size3 = list.size();
                        while (true) {
                            int i5 = h2 - 1;
                            if (h2 > 0) {
                                size3--;
                                arrayList.add(list.remove(size3));
                                h2 = i5;
                            } else {
                                list.add(arrayList);
                                return;
                            }
                        }
                    case 2:
                        int c = aVar.c();
                        if (c > 0) {
                            list.add(aVar.b(c));
                            return;
                        } else {
                            list.add("");
                            return;
                        }
                    case 3:
                        int h3 = aVar.h();
                        if (h3 > 0) {
                            list.add(aVar.b(h3));
                            return;
                        } else {
                            list.add("");
                            return;
                        }
                    case 4:
                        int d = aVar.d();
                        if (d > 0) {
                            list.add(aVar.b(d));
                            return;
                        } else {
                            list.add("");
                            return;
                        }
                    case 5:
                        list.add(Float.valueOf(Float.intBitsToFloat(aVar.d())));
                        return;
                    case 6:
                        list.add(Double.valueOf(Double.longBitsToDouble(aVar.e())));
                        return;
                    case 7:
                        list.add(Boolean.valueOf(aVar.f()));
                        return;
                    case 8:
                        list.add(Integer.valueOf(aVar.c()));
                        return;
                    case 9:
                        list.add(Integer.valueOf(aVar.h()));
                        return;
                    case 10:
                        list.add(Integer.valueOf(aVar.d()));
                        return;
                    case 11:
                        list.add(Long.valueOf(aVar.e()));
                        return;
                    case 12:
                        list.add(list2.get(aVar.h()));
                        return;
                    case 13:
                        list.add(list2.get(aVar.c()));
                        return;
                    case 14:
                        list.add(list2.get(0));
                        return;
                    case 15:
                        list.add(list2.get(1));
                        return;
                    case 16:
                        list.add(list2.get(2));
                        return;
                    case 17:
                        list.add(list2.get(3));
                        return;
                    case 18:
                        list.add(list2.get(4));
                        return;
                    case 19:
                        list.add(list2.get(5));
                        return;
                    case 20:
                        list.add(list2.get(6));
                        return;
                    case 21:
                        list.add(list2.get(7));
                        return;
                    case 22:
                        list.add(list2.get(8));
                        return;
                    case 23:
                        list.add(list2.get(9));
                        return;
                    default:
                        return;
                }
            } else {
                int c2 = aVar.c();
                int c3 = aVar.c();
                while (true) {
                    int i6 = c3 - 1;
                    if (c3 <= 0) {
                        return;
                    }
                    a(c2, aVar, list, list2);
                    c3 = i6;
                }
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static long f20357a;
        public static long b;
        public static long c;
        public static long d;
        public static long e;
        public static long f;
        public static long g;
        public static long h;
        public static long i;

        public static long b(long j) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66fef", new Object[]{new Long(j)})).longValue() : (-(j & 1)) ^ (j >> 1);
        }

        static {
            kge.a(-578685993);
            f20357a = (long) Math.pow(2.0d, 7.0d);
            b = (long) Math.pow(2.0d, 14.0d);
            c = (long) Math.pow(2.0d, 21.0d);
            d = (long) Math.pow(2.0d, 28.0d);
            e = (long) Math.pow(2.0d, 35.0d);
            f = (long) Math.pow(2.0d, 42.0d);
            g = (long) Math.pow(2.0d, 49.0d);
            h = (long) Math.pow(2.0d, 56.0d);
            i = (long) Math.pow(2.0d, 63.0d);
        }

        public static int a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a821974f", new Object[]{new Long(j)})).intValue();
            }
            if (j < f20357a) {
                return 1;
            }
            if (j < b) {
                return 2;
            }
            if (j < c) {
                return 3;
            }
            if (j < d) {
                return 4;
            }
            if (j < e) {
                return 5;
            }
            if (j < f) {
                return 6;
            }
            if (j < g) {
                return 7;
            }
            if (j < h) {
                return 8;
            }
            return j < i ? 9 : 10;
        }

        public static long a(byte[] bArr, int i2) {
            IpChange ipChange = $ipChange;
            int i3 = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2713f1a8", new Object[]{bArr, new Integer(i2)})).longValue();
            }
            long j = 0;
            int length = bArr.length;
            while (true) {
                if (i2 >= length || i3 > 49) {
                    ogg.b("Could not decode varint");
                }
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                j = (long) (j + (i3 < 28 ? (i5 & 127) << i3 : (i5 & 127) * Math.pow(2.0d, i3)));
                i3 += 7;
                if (i5 < 128) {
                    return j;
                }
                i2 = i4;
            }
        }

        public static List<Number> a(List<Number> list) {
            Number number;
            int i2;
            IpChange ipChange = $ipChange;
            int i3 = 0;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{list});
            }
            ArrayList arrayList = new ArrayList(list.size());
            while (i3 < list.size()) {
                Number number2 = list.get(i3);
                if (number2.longValue() == 0) {
                    int i4 = i3 + 1;
                    i2 = list.get(i4).intValue();
                    i3 = i4 + 1;
                    number = list.get(i3);
                } else {
                    number = number2;
                    i2 = 1;
                }
                while (true) {
                    int i5 = i2 - 1;
                    if (i2 > 0) {
                        if (number instanceof Long) {
                            arrayList.add(Long.valueOf(number.longValue() - 1));
                        } else {
                            arrayList.add(Integer.valueOf(number.intValue() - 1));
                        }
                        i2 = i5;
                    }
                }
                i3++;
            }
            return arrayList;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.IOException] */
    private static byte[] a(byte[] e, int i, int i2) {
        GZIPInputStream gZIPInputStream;
        byte[] bArr;
        IpChange ipChange = $ipChange;
        ?? r1 = ipChange instanceof IpChange;
        if (r1 != 0) {
            return (byte[]) ipChange.ipc$dispatch("b1ec42ee", new Object[]{e, new Integer(i), new Integer(i2)});
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        byte[] bArr2 = null;
        byteArrayOutputStream = null;
        byteArrayOutputStream = null;
        byteArrayOutputStream = null;
        byteArrayOutputStream = null;
        byteArrayOutputStream = null;
        try {
            try {
                r1 = new ByteArrayInputStream(e, i, e.length);
                try {
                    e = new GZIPInputStream(r1);
                    try {
                        byte[] bArr3 = new byte[1024];
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(i2);
                        while (true) {
                            try {
                                int read = e.read(bArr3, 0, bArr3.length);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream2.write(bArr3, 0, read);
                            } catch (Exception e2) {
                                e = e2;
                                bArr = bArr2;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                r1 = r1;
                                gZIPInputStream = e;
                                e.printStackTrace();
                                if (byteArrayOutputStream != null) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                if (gZIPInputStream != null) {
                                    try {
                                        gZIPInputStream.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                if (r1 == 0) {
                                    return bArr;
                                }
                                try {
                                    r1.close();
                                    return bArr;
                                } catch (IOException e5) {
                                    e = e5;
                                    e.printStackTrace();
                                    return bArr;
                                }
                            } catch (Throwable th) {
                                th = th;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                if (byteArrayOutputStream != null) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (IOException e6) {
                                        e6.printStackTrace();
                                    }
                                }
                                if (e != null) {
                                    try {
                                        e.close();
                                    } catch (IOException e7) {
                                        e7.printStackTrace();
                                    }
                                }
                                if (r1 != 0) {
                                    try {
                                        r1.close();
                                    } catch (IOException e8) {
                                        e8.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        }
                        bArr2 = byteArrayOutputStream2.toByteArray();
                        byteArrayOutputStream2.flush();
                        try {
                            byteArrayOutputStream2.close();
                        } catch (IOException e9) {
                            e9.printStackTrace();
                        }
                        try {
                            e.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                        try {
                            r1.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        return bArr2;
                    } catch (Exception e12) {
                        e = e12;
                        bArr = null;
                        r1 = r1;
                        gZIPInputStream = e;
                    }
                } catch (Exception e13) {
                    e = e13;
                    gZIPInputStream = null;
                    bArr = null;
                    r1 = r1;
                } catch (Throwable th2) {
                    th = th2;
                    e = null;
                }
            } catch (Exception e14) {
                e = e14;
                gZIPInputStream = null;
                bArr = null;
                r1 = 0;
            } catch (Throwable th3) {
                th = th3;
                e = null;
                r1 = 0;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
