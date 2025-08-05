package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.v2.result.MaType;
import com.taobao.taobao.scancode.v2.result.a;

/* loaded from: classes8.dex */
public class oyl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1147737490);
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : i == 2050;
    }

    public static boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{new Integer(i), new Integer(i2)})).booleanValue() : i == 0 || i == 2 || (i == 127 && i2 == 128);
    }

    public static boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{new Integer(i)})).booleanValue() : i == 32768;
    }

    public static boolean c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{new Integer(i)})).booleanValue() : i == 1024;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return (str.startsWith("8") && str.length() == 20) || ((str.startsWith("10") || str.startsWith("11")) && str.length() == 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
        if (r2 == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.oyl.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r4
            java.lang.String r4 = "3dd7e577"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L19:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L20
            return r3
        L20:
            android.net.Uri r4 = android.net.Uri.parse(r4)
            if (r4 != 0) goto L27
            return r3
        L27:
            java.lang.String r0 = r4.getHost()
            if (r0 != 0) goto L2e
            return r3
        L2e:
            java.lang.String r0 = "2020-11-23_path"
            java.lang.String r1 = "the 2020-11-23 path is applied..."
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = "^/([^/]*)/"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.Throwable -> L80
            java.lang.String r1 = r4.getPath()     // Catch: java.lang.Throwable -> L80
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch: java.lang.Throwable -> L80
            boolean r1 = r0.find()     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L7f
            int r1 = r0.groupCount()     // Catch: java.lang.Throwable -> L80
            if (r1 <= 0) goto L7f
            java.lang.String r0 = r0.group(r2)     // Catch: java.lang.Throwable -> L80
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L5b
            goto L7f
        L5b:
            java.lang.String r1 = "2"
            boolean r1 = android.text.TextUtils.equals(r0, r1)     // Catch: java.lang.Throwable -> L80
            if (r1 != 0) goto L7d
            java.lang.String r1 = "3"
            boolean r1 = android.text.TextUtils.equals(r0, r1)     // Catch: java.lang.Throwable -> L80
            if (r1 != 0) goto L7d
            java.lang.String r1 = "4"
            boolean r1 = android.text.TextUtils.equals(r0, r1)     // Catch: java.lang.Throwable -> L80
            if (r1 != 0) goto L7d
            java.lang.String r1 = "5"
            boolean r0 = android.text.TextUtils.equals(r0, r1)     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L7c
            goto L7d
        L7c:
            r2 = 0
        L7d:
            if (r2 != 0) goto L80
        L7f:
            return r3
        L80:
            java.lang.String r4 = r4.getHost()
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r0 = "s.tb.cn"
            boolean r4 = android.text.TextUtils.equals(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oyl.b(java.lang.String):boolean");
    }

    public static MaType a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaType) ipChange.ipc$dispatch("16888839", new Object[]{aVar});
        }
        int i = aVar.f21289a;
        if (i == 0) {
            return MaType.PRODUCT;
        }
        if (i != 1) {
            if (i == 2) {
                if (a(aVar.c)) {
                    return MaType.MEDICINE;
                }
                return MaType.EXPRESS;
            } else if (i != 127 || aVar.b != 128) {
                return null;
            } else {
                return MaType.PRODUCT;
            }
        } else if (b(aVar.c)) {
            return MaType.TB_ANTI_FAKE;
        } else {
            if (b(aVar.b)) {
                return MaType.GEN3;
            }
            if (a(aVar.b)) {
                return MaType.TB_4G;
            }
            if (c(aVar.b)) {
                return MaType.DM;
            }
            return MaType.QR;
        }
    }

    public static boolean a(int i, MaType maType, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d4d4845", new Object[]{new Integer(i), maType, new Integer(i2)})).booleanValue() : i == 1 && maType == MaType.QR && i2 == 512;
    }

    public static boolean a(int i, MaType maType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1b448b06", new Object[]{new Integer(i), maType})).booleanValue() : i == 1 && maType == MaType.TB_ANTI_FAKE;
    }

    public static boolean b(int i, MaType maType, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7b25e2a4", new Object[]{new Integer(i), maType, new Integer(i2)})).booleanValue() : i == 1 && maType == MaType.GEN3 && i2 == 32768;
    }
}
