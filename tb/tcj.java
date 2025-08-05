package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class tcj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte TAG_BOOLEAN = 2;
    public static final byte TAG_FLOAT = 5;
    public static final byte TAG_INT = 3;
    public static final byte TAG_LONG = 4;
    public static final byte TAG_STRINGS = 6;
    public static final byte TAG_STRING_IN_UTF8 = 1;

    /* renamed from: a  reason: collision with root package name */
    private final qrk f34023a;

    static {
        kge.a(1387187760);
    }

    public static Map<String, Object> a(qrk qrkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4cb9d1e3", new Object[]{qrkVar}) : new tcj(qrkVar).a();
    }

    private tcj(qrk qrkVar) {
        this.f34023a = qrkVar;
    }

    public Map<String, Object> a() {
        Object b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
            d();
            d();
            this.f34023a.c();
            while (this.f34023a.e()) {
                if (e() == 1) {
                    String b2 = b();
                    switch (e()) {
                        case 1:
                            b = b();
                            break;
                        case 2:
                            b = Boolean.valueOf(this.f34023a.a() > 0);
                            break;
                        case 3:
                            b = Integer.valueOf(this.f34023a.b());
                            break;
                        case 4:
                            b = Long.valueOf(this.f34023a.c());
                            break;
                        case 5:
                            b = Float.valueOf(this.f34023a.d());
                            break;
                        case 6:
                            b = c();
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    hashMap.put(b2, b);
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } catch (Exception e) {
            hashMap.clear();
            e.printStackTrace();
        }
        return hashMap;
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        byte[] bArr = new byte[this.f34023a.b()];
        this.f34023a.a(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    private Set<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("3b6c35d9", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        int b = this.f34023a.b();
        while (true) {
            b--;
            if (b <= 0) {
                return hashSet;
            }
            hashSet.add(b());
        }
    }

    private String d() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            byte a2 = this.f34023a.a();
            if (a2 != 0) {
                sb.append((char) a2);
            } else {
                return sb.toString();
            }
        }
    }

    private int e() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f34023a.a();
    }
}
