package tb;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes6.dex */
public class jkw extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int b;
    public String c;

    static {
        kge.a(1186220339);
    }

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r7.equals("@os.version") != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(java.lang.String r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.jkw.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r2] = r6
            r1[r3] = r7
            java.lang.String r7 = "f3a64c25"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            return r7
        L1c:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = -1
            if (r0 == 0) goto L24
            return r1
        L24:
            int r0 = r7.hashCode()
            r5 = 3
            switch(r0) {
                case -1527361109: goto L4a;
                case -105064104: goto L40;
                case 870169311: goto L36;
                case 2133706510: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L54
        L2d:
            java.lang.String r0 = "@os.version"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L54
            goto L55
        L36:
            java.lang.String r0 = "@os.model"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L54
            r2 = 1
            goto L55
        L40:
            java.lang.String r0 = "@os.cpuMaxHz"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L54
            r2 = 3
            goto L55
        L4a:
            java.lang.String r0 = "@os.cpuNums"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L54
            r2 = 2
            goto L55
        L54:
            r2 = -1
        L55:
            if (r2 == 0) goto L62
            if (r2 == r3) goto L61
            if (r2 == r4) goto L60
            if (r2 == r5) goto L5e
            return r1
        L5e:
            r7 = 4
            return r7
        L60:
            return r5
        L61:
            return r4
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jkw.a(java.lang.String):int");
    }

    private jkw(String str) {
        this.c = str;
        this.b = a(str);
    }

    public static jkw b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkw) ipChange.ipc$dispatch("e2617d52", new Object[]{str, objArr});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("@os.")) {
            return null;
        }
        return new jkw(str);
    }

    public String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c78bb0", new Object[]{this, aVar});
        }
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        if (i == 1) {
            return String.valueOf(Build.VERSION.SDK_INT);
        }
        if (i == 2) {
            return Build.MODEL;
        }
        if (i == 3) {
            return jmd.b();
        }
        if (i == 4) {
            return jmd.a();
        }
        return null;
    }
}
