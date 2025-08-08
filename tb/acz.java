package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.f;

/* loaded from: classes.dex */
public class acz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static acz f25258a;
    public f b = null;

    public static /* synthetic */ void a(acz aczVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc68f40", new Object[]{aczVar});
        } else {
            aczVar.c();
        }
    }

    static {
        kge.a(-2093702562);
        f25258a = new acz();
    }

    public static acz a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (acz) ipChange.ipc$dispatch("f023f86", new Object[0]) : f25258a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = new f() { // from class: tb.acz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.f
            public void onConfigUpdate(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0b193b", new Object[]{this, str});
                } else {
                    acz.a(acz.this);
                }
            }
        };
        OrangeConfig.getInstance().registerListener(new String[]{"safemode_android"}, this.b);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:6|7|(7:9|10|11|(3:13|14|15)|17|14|15)|20|10|11|(0)|17|14|15) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[Catch: Exception -> 0x0045, TRY_LEAVE, TryCatch #0 {Exception -> 0x0045, blocks: (B:11:0x0032, B:13:0x0040), top: B:20:0x0032 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c() {
        /*
            r7 = this;
            java.lang.String r0 = "launch_crash_enable"
            java.lang.String r1 = "normal_crash_enable"
            java.lang.String r2 = "safemode_android"
            java.lang.String r3 = "true"
            com.android.alibaba.ip.runtime.IpChange r4 = tb.acz.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            r6 = 0
            if (r5 == 0) goto L1e
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r6] = r7
            java.lang.String r1 = "5889b6a"
            r4.ipc$dispatch(r1, r0)
            return
        L1e:
            com.taobao.orange.OrangeConfig r4 = com.taobao.orange.OrangeConfig.getInstance()     // Catch: java.lang.Exception -> L31
            java.lang.String r4 = r4.getConfig(r2, r1, r3)     // Catch: java.lang.Exception -> L31
            boolean r5 = android.text.StringUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L31
            if (r5 != 0) goto L31
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L31
            goto L32
        L31:
            r4 = 0
        L32:
            com.taobao.orange.OrangeConfig r5 = com.taobao.orange.OrangeConfig.getInstance()     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = r5.getConfig(r2, r0, r3)     // Catch: java.lang.Exception -> L45
            boolean r5 = android.text.StringUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L45
            if (r5 != 0) goto L45
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Exception -> L45
            goto L46
        L45:
            r2 = 0
        L46:
            android.app.Application r3 = com.taobao.tao.Globals.getApplication()
            java.lang.String r5 = "safemode_sp"
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r5, r6)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            r3.putBoolean(r1, r4)
            r3.putBoolean(r0, r2)
            r3.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.acz.c():void");
    }
}
