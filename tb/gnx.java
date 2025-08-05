package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jqi;

/* loaded from: classes5.dex */
public class gnx extends jqi.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f28400a;
    private static volatile boolean c;

    static {
        kge.a(2086881771);
        c = false;
        f28400a = false;
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f28400a = z;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
        if (r7.equals("ultronGZipCompressWithBytes") != false) goto L11;
     */
    @Override // tb.jqi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gnx.a(java.lang.String, boolean):boolean");
    }

    @Override // tb.jqi.a
    public long a(String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue() : goc.a(str, j);
    }

    @Override // tb.jqi.a
    public float a(String str, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{this, str, new Float(f)})).floatValue() : goc.a(str, f);
    }

    @Override // tb.jqi.a
    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        char c2 = 65535;
        if (str.hashCode() == -1314810381 && str.equals(ieu.sPageScrollBottomLeftCountToPrefetch)) {
            c2 = 0;
        }
        if (c2 == 0) {
            return ((Integer) sxy.a("icart_client", nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE, str, Integer.valueOf(i))).intValue();
        }
        return goc.a(str, i);
    }

    @Override // tb.jqi.a
    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        char c2 = 65535;
        if (str.hashCode() == 689259191 && str.equals("containerWhiteListForDXButter")) {
            c2 = 0;
        }
        if (c2 == 0) {
            String str3 = (String) sxy.a("icart_client", "performance_dxbutter", str, "");
            return (TextUtils.isEmpty(str3) || str3.equals("{}")) ? mrd.b(str) : str3;
        }
        return goc.a(str, str2);
    }
}
