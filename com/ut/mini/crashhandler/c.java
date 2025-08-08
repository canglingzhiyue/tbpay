package com.ut.mini.crashhandler;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1196700423);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.ut.mini.crashhandler.c.a parse(java.lang.Throwable r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.ut.mini.crashhandler.c.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r6
            java.lang.String r6 = "866d7680"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            com.ut.mini.crashhandler.c$a r6 = (com.ut.mini.crashhandler.c.a) r6
            return r6
        L15:
            if (r6 == 0) goto Lbd
            com.ut.mini.crashhandler.c$a r0 = new com.ut.mini.crashhandler.c$a
            r0.<init>()
            java.lang.Throwable r1 = r6.getCause()
            if (r1 != 0) goto L23
            r1 = r6
        L23:
            if (r1 == 0) goto Lbc
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            if (r5 <= 0) goto Lbc
            r4 = r4[r3]
            if (r4 == 0) goto Lbc
            java.lang.String r1 = r1.toString()
            java.io.StringWriter r4 = new java.io.StringWriter
            r4.<init>()
            java.io.PrintWriter r5 = new java.io.PrintWriter
            r5.<init>(r4)
            r6.printStackTrace(r5)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L54
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L54
            r5.close()     // Catch: java.lang.Exception -> L5c
            r4.close()     // Catch: java.lang.Exception -> L5c
            goto L5c
        L4c:
            r6 = move-exception
            r5.close()     // Catch: java.lang.Exception -> L53
            r4.close()     // Catch: java.lang.Exception -> L53
        L53:
            throw r6
        L54:
            r5.close()     // Catch: java.lang.Exception -> L5a
            r4.close()     // Catch: java.lang.Exception -> L5a
        L5a:
            java.lang.String r6 = ""
        L5c:
            java.lang.String r4 = "}:"
            int r4 = r1.indexOf(r4)
            if (r4 <= 0) goto L70
            int r4 = r4 + 2
            java.lang.String r1 = r1.substring(r4)
            java.lang.String r1 = r1.trim()
            goto L7c
        L70:
            java.lang.String r4 = ":"
            int r4 = r1.indexOf(r4)
            if (r4 <= 0) goto L7c
            java.lang.String r1 = r1.substring(r3, r4)
        L7c:
            r0.setExpName(r1)
            boolean r1 = android.text.StringUtils.isEmpty(r6)
            if (r1 != 0) goto L8d
            java.lang.String r1 = "\n"
            java.lang.String r4 = "++"
            java.lang.String r6 = r6.replaceAll(r1, r4)
        L8d:
            r0.setCrashDetail(r6)
            byte[] r1 = r6.getBytes()
            java.lang.String r1 = tb.aps.b(r1)
            r0.setMd5(r1)
            java.lang.String r1 = "com.taobao.statistic"
            boolean r1 = r6.contains(r1)
            if (r1 != 0) goto Lb9
            java.lang.String r1 = "com.ut"
            boolean r1 = r6.contains(r1)
            if (r1 != 0) goto Lb9
            java.lang.String r1 = "org.usertrack"
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto Lb5
            goto Lb9
        Lb5:
            r0.setmCrashedByUT(r3)
            goto Lbc
        Lb9:
            r0.setmCrashedByUT(r2)
        Lbc:
            return r0
        Lbd:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ut.mini.crashhandler.c.parse(java.lang.Throwable):com.ut.mini.crashhandler.c$a");
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f24103a = null;
        public String b = null;
        public String c = null;
        public boolean d = false;

        static {
            kge.a(-1074557448);
        }

        public String getExpName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1fe1b027", new Object[]{this}) : this.f24103a;
        }

        public void setExpName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e357dd97", new Object[]{this, str});
            } else {
                this.f24103a = str;
            }
        }

        public String getMd5() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91115b1", new Object[]{this}) : this.b;
        }

        public void setMd5(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79e834d", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public String getCrashDetail() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ad25297", new Object[]{this}) : this.c;
        }

        public void setCrashDetail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("172f2f27", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public boolean isCrashedByUT() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7f1468dd", new Object[]{this})).booleanValue() : this.d;
        }

        public void setmCrashedByUT(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23aec63c", new Object[]{this, new Boolean(z)});
            } else {
                this.d = z;
            }
        }
    }
}
