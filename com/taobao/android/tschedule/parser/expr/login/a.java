package com.taobao.android.tschedule.parser.expr.login;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jku;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int b;
    public String c;

    static {
        kge.a(-545938917);
    }

    @Override // tb.jku
    public /* synthetic */ Object a(com.taobao.android.tschedule.parser.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r8.equals("@login.userId") != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(java.lang.String r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.tschedule.parser.expr.login.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r2] = r7
            r1[r3] = r8
            java.lang.String r8 = "f3a64c25"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            return r8
        L1c:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = -1
            if (r0 == 0) goto L24
            return r1
        L24:
            int r0 = r8.hashCode()
            r5 = 4
            r6 = 3
            switch(r0) {
                case -1803142043: goto L55;
                case -1737975096: goto L4b;
                case -833828088: goto L41;
                case -512240101: goto L37;
                case 2059799723: goto L2e;
                default: goto L2d;
            }
        L2d:
            goto L5f
        L2e:
            java.lang.String r0 = "@login.userId"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L5f
            goto L60
        L37:
            java.lang.String r0 = "@login.userName"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L5f
            r2 = 2
            goto L60
        L41:
            java.lang.String r0 = "@login.nick"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L5f
            r2 = 3
            goto L60
        L4b:
            java.lang.String r0 = "@login.oldUserId"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L5f
            r2 = 1
            goto L60
        L55:
            java.lang.String r0 = "@login.oldNick"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L5f
            r2 = 4
            goto L60
        L5f:
            r2 = -1
        L60:
            if (r2 == 0) goto L70
            if (r2 == r3) goto L6f
            if (r2 == r4) goto L6e
            if (r2 == r6) goto L6d
            if (r2 == r5) goto L6b
            return r1
        L6b:
            r8 = 5
            return r8
        L6d:
            return r5
        L6e:
            return r6
        L6f:
            return r4
        L70:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tschedule.parser.expr.login.a.a(java.lang.String):int");
    }

    private a(String str) {
        this.c = str;
        this.b = a(str);
    }

    public static a b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("797d7d0d", new Object[]{str, objArr});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("@login.")) {
            return null;
        }
        return new a(str);
    }

    public String b(com.taobao.android.tschedule.parser.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c78bb0", new Object[]{this, aVar});
        }
        LoginInfo e = aVar.e();
        int i = this.b;
        if (i <= 0 || e == null) {
            return null;
        }
        if (i == 1) {
            return e.getUserId();
        }
        if (i == 2) {
            return e.getOldUserId();
        }
        if (i == 3) {
            return e.getUserName();
        }
        if (i == 4) {
            return e.getNick();
        }
        if (i == 5) {
            return e.getOldNick();
        }
        return null;
    }
}
