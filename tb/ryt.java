package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes9.dex */
public class ryt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f33424a;

    /* loaded from: classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f33426a;
        public int b;
        public int c;

        static {
            kge.a(1985662307);
        }

        public b(String str, int i) {
            this.f33426a = str;
            this.b = i;
        }
    }

    static {
        kge.a(1794115213);
        f33424a = new String[]{ResponseProtocolType.ID, ResponseProtocolType.EVENT, ResponseProtocolType.DATA, ResponseProtocolType.COMMENT, ResponseProtocolType.RETRY};
    }

    public static boolean a(byte[] bArr, byte[] bArr2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9fef71a", new Object[]{bArr, bArr2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (bArr == null && bArr2 == null) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != i2) {
            return false;
        }
        for (int i3 = 0; i3 < bArr.length; i3++) {
            if (bArr[i3] != bArr2[i3 + i]) {
                return false;
            }
        }
        return true;
    }

    public static Pair<String, Pair<Integer, Integer>> a(byte[] bArr, Pair<Integer, Integer> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("faee9ad5", new Object[]{bArr, pair});
        }
        Pair<String, Pair<Integer, Integer>> b2 = b(bArr, pair);
        if (b2 != null && b2.second != null) {
            return b2;
        }
        return null;
    }

    private static Pair<String, Pair<Integer, Integer>> b(byte[] bArr, Pair<Integer, Integer> pair) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("bddb0434", new Object[]{bArr, pair});
        }
        for (String str : f33424a) {
            byte[] bytes = str.getBytes();
            if (((Integer) pair.second).intValue() >= bytes.length) {
                int i = 0;
                for (int i2 = 0; i2 < bytes.length && bArr[((Integer) pair.first).intValue() + i2] == bytes[i2]; i2++) {
                    i++;
                }
                if (i == str.length()) {
                    return new Pair<>(str, new Pair(Integer.valueOf(((Integer) pair.first).intValue() + bytes.length), Integer.valueOf(((Integer) pair.second).intValue() - bytes.length)));
                }
            }
        }
        return null;
    }

    public static int a(byte[] bArr, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb6ab7c2", new Object[]{bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        if (bArr != null && bArr.length != 0 && i <= i2 && i2 <= bArr.length) {
            for (int max = Math.max(i, 0); max < i2; max++) {
                if (bArr[max] == 10 && (i3 = max + 1) < i2 && bArr[i3] == 10) {
                    return max;
                }
            }
        }
        return -1;
    }

    public static List<Pair<Integer, Integer>> b(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("aa6a3177", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        ArrayList arrayList = new ArrayList();
        if (bArr != null && bArr.length != 0) {
            while (i3 < i2) {
                int a2 = a(bArr, i, i2, i3, '\n');
                if (a2 == -1) {
                    a2 = i2;
                }
                arrayList.add(new Pair(Integer.valueOf(i3), Integer.valueOf(a2 - i3)));
                i3 = a2 + 1;
            }
        }
        return arrayList;
    }

    public static int a(byte[] bArr, int i, int i2, int i3, char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8baa49dc", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Character(c)})).intValue();
        }
        for (int i4 = i3 + i; i4 < i + i2; i4++) {
            if (bArr[i4] == c) {
                TBSdkLog.e("mtopsdk.SSEProtocolParser", "[------indexOf] index = " + i4);
                return i4;
            }
        }
        return -1;
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f33425a = -1;
        public b b = null;
        public int c = 0;
        public boolean d = false;
        public int e = 0;
        public Map<String, b> f = new LinkedHashMap();

        static {
            kge.a(-943450471);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.f33425a = -1;
            this.b = null;
            this.c = 0;
            this.e = 0;
            this.f.clear();
        }
    }

    public static void a(byte[] bArr, int i, int i2, a aVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27952cb5", new Object[]{bArr, new Integer(i), new Integer(i2), aVar});
        } else if (bArr == null || bArr.length == 0 || i2 <= 0 || (i3 = i2 + i) > bArr.length) {
        } else {
            int i9 = i3 - 1;
            int i10 = aVar.e;
            while (i <= i9) {
                if (bArr[i] != 10) {
                    if (i == i9) {
                        aVar.d = false;
                    }
                    if (i == i10) {
                        aVar.e = i;
                        if (bArr[i] == 105 && (i8 = i + 3) <= i9 && bArr[i + 1] == 100 && bArr[i + 2] == 58 && bArr[i8] == 32) {
                            i += 4;
                            aVar.b = new b(ResponseProtocolType.ID, i);
                            aVar.f.put(aVar.b.f33426a, aVar.b);
                        } else if (bArr[i] == 101 && (i7 = i + 6) <= i9 && bArr[i + 1] == 118 && bArr[i + 2] == 101 && bArr[i + 3] == 110 && bArr[i + 4] == 116 && bArr[i + 5] == 58 && bArr[i7] == 32) {
                            i += 7;
                            aVar.b = new b(ResponseProtocolType.EVENT, i);
                            aVar.f.put(aVar.b.f33426a, aVar.b);
                        } else if (bArr[i] == 100 && (i6 = i + 5) <= i9 && bArr[i + 1] == 97 && bArr[i + 2] == 116 && bArr[i + 3] == 97 && bArr[i + 4] == 58 && bArr[i6] == 32) {
                            i += 6;
                            aVar.b = new b(ResponseProtocolType.DATA, i);
                            aVar.f.put(aVar.b.f33426a, aVar.b);
                        } else if (bArr[i] == 114 && (i5 = i + 5) <= i9 && bArr[i + 1] == 101 && bArr[i + 2] == 116 && bArr[i + 3] == 114 && bArr[i + 4] == 121 && bArr[i5] == 32) {
                            i += 6;
                            aVar.b = new b(ResponseProtocolType.RETRY, i);
                            aVar.f.put(aVar.b.f33426a, aVar.b);
                        } else if (bArr[i] == 58 && (i4 = i + 1) <= i9 && bArr[i4] == 32) {
                            i += 2;
                            aVar.b = new b(ResponseProtocolType.COMMENT, i);
                            aVar.f.put(aVar.b.f33426a, aVar.b);
                        }
                    }
                    i++;
                } else if (i == i9) {
                    aVar.c = i;
                    aVar.d = true;
                    return;
                } else {
                    i10 = i + 1;
                    if (bArr[i10] == 10) {
                        aVar.f33425a = i;
                        aVar.c = i;
                        b bVar = aVar.b;
                        bVar.c = i - bVar.b;
                        aVar.f.put(aVar.b.f33426a, aVar.b);
                        return;
                    }
                    b bVar2 = aVar.b;
                    bVar2.c = i - bVar2.b;
                    aVar.f.put(aVar.b.f33426a, aVar.b);
                    i = i10;
                }
            }
            aVar.c = i;
            aVar.f33425a = -1;
        }
    }
}
