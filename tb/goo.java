package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class goo extends idj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-738678694);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[LOOP:1: B:34:0x0071->B:41:0x0085, LOOP_START, PHI: r5 
      PHI: (r5v5 int) = (r5v2 int), (r5v6 int) binds: [B:33:0x006f, B:41:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    @Override // tb.idj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.goo.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r9
            r1[r3] = r10
            r10 = 2
            r1[r10] = r11
            java.lang.String r10 = "d9378d6f"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            return r10
        L1f:
            r0 = -1
            if (r10 != 0) goto L23
            return r0
        L23:
            if (r11 != 0) goto L26
            return r3
        L26:
            java.lang.String r1 = "\\."
            java.lang.String[] r10 = r10.split(r1)
            java.lang.String[] r11 = r11.split(r1)
            int r1 = r10.length
            int r4 = r11.length
            if (r1 <= r4) goto L38
            r5 = r4
            r1 = 1
        L36:
            r4 = 0
            goto L41
        L38:
            if (r1 >= r4) goto L3e
            r5 = r1
            r1 = 0
            r4 = 1
            goto L41
        L3e:
            r5 = r1
            r1 = 0
            goto L36
        L41:
            r6 = 0
        L42:
            if (r6 >= r5) goto L6b
            r7 = r10[r6]
            boolean r7 = a(r7)
            if (r7 != 0) goto L4d
            return r0
        L4d:
            r7 = r11[r6]
            boolean r7 = a(r7)
            if (r7 != 0) goto L56
            return r3
        L56:
            r7 = r10[r6]
            int r7 = java.lang.Integer.parseInt(r7)
            r8 = r11[r6]
            int r8 = java.lang.Integer.parseInt(r8)
            if (r7 <= r8) goto L65
            return r3
        L65:
            if (r7 >= r8) goto L68
            return r0
        L68:
            int r6 = r6 + 1
            goto L42
        L6b:
            java.lang.String r6 = "00"
            java.lang.String r7 = "0"
            if (r1 == 0) goto L89
        L71:
            int r11 = r10.length
            if (r5 >= r11) goto L88
            r11 = r10[r5]
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L85
            r11 = r10[r5]
            boolean r11 = r11.equals(r6)
            if (r11 != 0) goto L85
            return r3
        L85:
            int r5 = r5 + 1
            goto L71
        L88:
            return r2
        L89:
            if (r4 == 0) goto La2
        L8b:
            int r10 = r11.length
            if (r5 >= r10) goto La2
            r10 = r11[r5]
            boolean r10 = r10.equals(r7)
            if (r10 != 0) goto L9f
            r10 = r11[r5]
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L9f
            return r0
        L9f:
            int r5 = r5 + 1
            goto L8b
        La2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.goo.a(java.lang.String, java.lang.String):int");
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
