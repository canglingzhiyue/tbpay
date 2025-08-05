package tb;

import android.content.Context;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.login4android.api.Login;
import java.util.HashMap;
import java.util.Map;
import tb.sxz;

/* loaded from: classes2.dex */
public class bci implements bch<byte[]> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final sxz f25796a;
    private static jqd b;
    private static final Map<String, byte[]> d;
    private final Context c;

    public static /* synthetic */ jqd a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jqd) ipChange.ipc$dispatch("f0688c1", new Object[0]) : b;
    }

    static {
        kge.a(-622367302);
        kge.a(279628856);
        b = jqd.a("iCart");
        f25796a = new sxz("iCart");
        d = new HashMap();
    }

    public bci(Context context) {
        this.c = context;
    }

    public static void a(Context context, final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6c4127", new Object[]{context, bArr});
        } else if (!Login.checkSessionValid()) {
        } else {
            final String f = f();
            d.put(f, bArr);
            f25796a.a(context, f, bArr, null);
            jqh.a(new Runnable() { // from class: tb.bci.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    boolean a2 = bci.a().a(f, bArr);
                    bed.a("saveFirstPageMMKVCache", a2 ? ResultCode.MSG_SUCCESS : ResultCode.MSG_FAILED, a2, a2 ? 0.001f : 1.0f);
                }
            });
        }
    }

    @Override // tb.bch
    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
        } else {
            a(this.c, bArr);
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        String f = f();
        d.remove(f);
        if (!Login.checkSessionValid()) {
            return;
        }
        f25796a.c(context, f);
        b.c(f);
    }

    @Override // tb.bch
    public void a(final sxz.a<byte[]> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abecbb66", new Object[]{this, aVar});
        } else if (!Login.checkSessionValid()) {
            jqh.a(new Runnable() { // from class: tb.bci.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        aVar.a("未登录");
                    }
                }
            });
        } else {
            jqh.a(new Runnable() { // from class: tb.bci.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    byte[] b2 = bci.this.b();
                    if (b2 == null) {
                        aVar.a("获取缓存失败");
                    } else {
                        aVar.a((sxz.a) b2);
                    }
                }
            });
        }
    }

    @Override // tb.bch
    public byte[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a9d5fa14", new Object[]{this});
        }
        if (!Login.checkSessionValid()) {
            return null;
        }
        String f = f();
        byte[] bArr = d.get(f);
        if (bArr != null) {
            return bArr;
        }
        byte[] d2 = b.d(f);
        if (d2 != null) {
            d.put(f, d2);
            return d2;
        }
        byte[] b2 = f25796a.b(this.c, f);
        if (b2 != null) {
            d.put(f, b2);
        } else {
            d.remove(f);
        }
        return b2;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        String f = f();
        if (d.get(f) != null || b.b(f)) {
            return true;
        }
        return f25796a.a(context, f);
    }

    @Override // tb.bch
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : b(this.c);
    }

    private static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        if ("CN".equalsIgnoreCase(b.d())) {
            return "iCart_query_cache_data_byte" + Login.getUserId();
        }
        return "iCart_query_cache_data_byte" + Login.getUserId() + b.d();
    }
}
