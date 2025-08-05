package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.e;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes6.dex */
public class jkv extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int b;
    public String c;

    static {
        kge.a(798018786);
    }

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r7.equals("@app.deviceId") == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(java.lang.String r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.jkv.$ipChange
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
            r5 = 749588275(0x2cadcf33, float:4.9399595E-12)
            if (r0 == r5) goto L4b
            r5 = 1409623944(0x54052788, float:2.2875755E12)
            if (r0 == r5) goto L41
            r5 = 1974065022(0x75a9d77e, float:4.3060003E32)
            if (r0 == r5) goto L38
            goto L55
        L38:
            java.lang.String r0 = "@app.deviceId"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L55
            goto L56
        L41:
            java.lang.String r0 = "@app.ttid"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L55
            r2 = 2
            goto L56
        L4b:
            java.lang.String r0 = "@app.utdid"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L55
            r2 = 1
            goto L56
        L55:
            r2 = -1
        L56:
            if (r2 == 0) goto L60
            if (r2 == r3) goto L5f
            if (r2 == r4) goto L5d
            return r1
        L5d:
            r7 = 3
            return r7
        L5f:
            return r4
        L60:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jkv.a(java.lang.String):int");
    }

    private jkv(String str) {
        this.c = str;
        this.b = a(str);
    }

    public static jkv b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkv) ipChange.ipc$dispatch("e2617d33", new Object[]{str, objArr});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("@app.")) {
            return null;
        }
        return new jkv(str);
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
            return e.e();
        }
        if (i == 2) {
            return e.d();
        }
        if (i == 3) {
            return e.c();
        }
        return null;
    }
}
