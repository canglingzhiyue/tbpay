package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.global.setting.util.GuideUtils;
import com.taobao.global.setting.util.c;
import com.taobao.global.setting.util.d;
import com.taobao.global.setting.util.e;
import com.taobao.global.setting.util.h;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;

/* loaded from: classes7.dex */
public class ksx implements ksz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e f30297a;
    private String b;
    private final a c = new a();

    @Override // tb.ksz
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "http://m.taobao.com/go/newmytaobaocommonsettings2";
    }

    public ksx(Context context) {
        this.f30297a = e.a(context.getApplicationContext());
    }

    public ksx(String str, Context context) {
        this.b = str;
        this.f30297a = e.a(context.getApplicationContext());
    }

    @Override // tb.ksz
    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue() : this.f30297a.b("server_enable_locationsampling", z);
    }

    @Override // tb.ksz
    public boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue() : this.f30297a.b("Global_App_Auto_Play_Video", z);
    }

    @Override // tb.ksz
    public boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8b84ae", new Object[]{this, new Boolean(z)})).booleanValue() : this.f30297a.b("Global_App_Is_TaoPassWord_Cut", z);
    }

    @Override // tb.ksz
    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.f30297a.a("Global_App_Video_Play_Network_Type")) {
            return this.f30297a.a("Global_App_Video_Play_Network_Type", i);
        }
        if (this.f30297a.a("Global_App_Auto_Play_Video")) {
            i = this.f30297a.b("Global_App_Auto_Play_Video", true) ? 0 : 2;
        }
        SharedPreferences a2 = this.f30297a.a();
        if (a2 != null) {
            SharedPreferences.Editor edit = a2.edit();
            edit.putInt("Global_App_Video_Play_Network_Type", i);
            edit.commit();
        }
        return i;
    }

    @Override // tb.ksz
    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        int a2 = a(0);
        if (1 == a2) {
            return true;
        }
        if (2 == a2) {
            return false;
        }
        return a2 != 0 || 1 == c.a(context);
    }

    public Object a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c254b136", new Object[]{this, str, str2});
        }
        a.a(this.c, str, str2);
        try {
            SharedPreferences a2 = d.a();
            Object a3 = ssk.a(str2);
            return a3 == null ? a2.getAll().get(str2) : a3;
        } catch (IllegalArgumentException e) {
            TLog.loge(com.taobao.global.setting.d.BIZ_NAME, "coreGetSettingCurrentStateObj exception, bizName=" + str + " key=" + str2 + " e=" + e);
            return null;
        }
    }

    public Object b(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4f41c855", new Object[]{this, str, str2});
        }
        if (!d.a(str, str2)) {
            throw new RuntimeException("bizName and key cannot be empty!");
        }
        if (com.taobao.global.setting.d.a().b()) {
            if ("inTimeFrameMute".equals(str2) || "mute".equals(str2) || "liveMute".equals(str2)) {
                Object b = a.b(this.c, str, str2);
                TLog.loge(com.taobao.global.setting.d.BIZ_NAME, "getMuteSettingStateV2 key=" + str2 + " result=" + b);
                return b;
            }
        } else if ("liveMute".equals(str2)) {
            str2 = "mute";
        }
        SharedPreferences a2 = d.a();
        Object a3 = ssk.a(str2);
        return a3 == null ? a2.getAll().get(str2) : a3;
    }

    @Override // tb.ksz
    public <T> T a(String str, String str2, T t, com.taobao.global.setting.data.c cVar) {
        T t2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3e86b541", new Object[]{this, str, str2, t, cVar});
        }
        try {
            Object b = b(str, str2);
            if (b == null) {
                AppMonitor.Counter.commit(h.PAGE_NAME, h.ARG1_GET_SETTING_STATE, h.a(str, str2, ""), 1.0d);
                d.a(cVar, t);
                return t;
            }
            try {
                if (t instanceof Boolean) {
                    t2 = (T) ((Boolean) b);
                } else if (t instanceof String) {
                    t2 = (T) String.valueOf(b);
                } else {
                    t2 = t instanceof Integer ? (T) ((Integer) b) : (T) b;
                }
                AppMonitor.Counter.commit(h.PAGE_NAME, h.ARG1_GET_SETTING_STATE, h.a(str, str2, ""), 1.0d);
                d.a(cVar, b);
                return t2;
            } catch (Throwable th) {
                TLog.loge(com.taobao.global.setting.d.BIZ_NAME, "开关类型和defaultValue不一致,key=" + str2 + " trace=" + th.toString());
                d.a(cVar, 261, th.getMessage());
                if (Versions.isDebug()) {
                    throw th;
                }
                return null;
            }
        } catch (Throwable th2) {
            d.a(cVar, 261, th2.getMessage());
            return t;
        }
    }

    @Override // tb.ksz
    public <T> T b(String str, String str2, T t, com.taobao.global.setting.data.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7f01cae0", new Object[]{this, str, str2, t, cVar});
        }
        if (com.taobao.global.setting.d.a().b()) {
            return (T) a(str, str2, t, cVar);
        }
        T t2 = null;
        if (!d.a(str, str2)) {
            d.a(cVar, 261, "bizName and key cannot be empty!");
            return null;
        }
        if ("liveMute".equals(str2)) {
            str2 = "mute";
        }
        try {
            t2 = (T) com.taobao.global.setting.data.d.a().a(str2, t);
        } catch (IllegalArgumentException e) {
            d.a(cVar, 261, e.getMessage());
        }
        if (t2 != null) {
            AppMonitor.Counter.commit(h.PAGE_NAME, h.ARG1_GET_LIFE_CICLE_SETTING_STATE, h.a(str, str2, t2), 1.0d);
            d.a(cVar, t2);
        }
        return t2;
    }

    @Override // tb.ksz
    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue() : GuideUtils.a(this.b, str, z);
    }

    @Override // tb.ksz
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.equals(str, "tbGlobalMuteSetting")) {
            return com.taobao.global.setting.d.a().b();
        }
        boolean a2 = com.taobao.global.setting.util.a.a(str);
        AppMonitor.Counter.commit(h.PAGE_NAME, h.ARG1_GET_HIT_AB, h.a(this.b, str, Boolean.valueOf(a2)), 1.0d);
        return a2;
    }

    public static <T> T a(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("42bc9164", new Object[]{str, t});
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("key cannot be empty!");
        }
        SharedPreferences a2 = d.a();
        if (t instanceof Integer) {
            return (T) Integer.valueOf(a2.getInt(str, ((Integer) t).intValue()));
        }
        if (t instanceof String) {
            return (T) a2.getString(str, (String) t);
        }
        if (t instanceof Boolean) {
            return (T) Boolean.valueOf(a2.getBoolean(str, ((Boolean) t).booleanValue()));
        }
        throw new IllegalArgumentException("the type of defaultValue must be one of the Integer, String or Boolean!");
    }

    /* loaded from: classes7.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        public static /* synthetic */ void a(a aVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4237d67f", new Object[]{aVar, str, str2});
            } else {
                aVar.b(str, str2);
            }
        }

        public static /* synthetic */ Object b(a aVar, String str, String str2) throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("fcf32af2", new Object[]{aVar, str, str2}) : aVar.a(str, str2);
        }

        private Object a(String str, String str2) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("c254b136", new Object[]{this, str, str2});
            }
            if ("inTimeFrameMute".equals(str2)) {
                return a(str);
            }
            if (!str2.equals("mute") && !str2.equals("liveMute")) {
                throw new IllegalArgumentException("key不合法");
            }
            Object a2 = ksx.this.a(str, str2);
            return Boolean.TRUE.equals(a2) ? a2 : a(str);
        }

        private void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            } else if (!"liveMute".equals(str2) || d.a().contains(str2)) {
            } else {
                try {
                    com.taobao.global.setting.c.a(Globals.getApplication(), str).c().a("mytaobao", "liveMute", Boolean.valueOf(((Boolean) ksx.a(str2, false)).booleanValue()), null);
                } catch (IllegalArgumentException unused) {
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
            if (r1.before(r7) != false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
            if (r1.before(r7) != false) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.lang.Object a(java.lang.String r13) {
            /*
                r12 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = tb.ksx.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 1
                r3 = 0
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
                if (r1 == 0) goto L1a
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r12
                r1[r2] = r13
                java.lang.String r13 = "17307540"
                java.lang.Object r13 = r0.ipc$dispatch(r13, r1)
                return r13
            L1a:
                com.taobao.global.setting.d r0 = com.taobao.global.setting.d.a()
                boolean r0 = r0.b()
                r1 = 0
                if (r0 != 0) goto L26
                return r1
            L26:
                tb.ksx r0 = tb.ksx.this
                java.lang.String r5 = "timeFrameMute"
                java.lang.Object r0 = r0.a(r13, r5, r4, r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L38
                return r4
            L38:
                tb.ksx r0 = tb.ksx.this
                java.lang.String r4 = "timeFrameMuteSub"
                java.lang.Object r13 = r0.a(r13, r4, r1, r1)
                java.lang.String r13 = (java.lang.String) r13
                if (r13 != 0) goto L4a
                java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)
                return r13
            L4a:
                com.alibaba.fastjson.JSONObject r13 = com.alibaba.fastjson.JSONObject.parseObject(r13)     // Catch: java.lang.Throwable -> Ld6
                java.lang.String r0 = "startHour"
                java.lang.Integer r0 = r13.getInteger(r0)     // Catch: java.lang.Throwable -> Ld6
                int r0 = r0.intValue()     // Catch: java.lang.Throwable -> Ld6
                java.lang.String r4 = "starMinute"
                java.lang.Integer r4 = r13.getInteger(r4)     // Catch: java.lang.Throwable -> Ld6
                int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Ld6
                java.lang.String r5 = "endHour"
                java.lang.Integer r5 = r13.getInteger(r5)     // Catch: java.lang.Throwable -> Ld6
                int r5 = r5.intValue()     // Catch: java.lang.Throwable -> Ld6
                java.lang.String r6 = "endMinute"
                java.lang.Integer r13 = r13.getInteger(r6)     // Catch: java.lang.Throwable -> Ld6
                int r13 = r13.intValue()     // Catch: java.lang.Throwable -> Ld6
                java.util.Date r1 = new java.util.Date
                r1.<init>()
                java.util.Date r6 = new java.util.Date
                r6.<init>()
                java.util.Date r7 = new java.util.Date
                r7.<init>()
                if (r0 != r5) goto L8c
                if (r4 != r13) goto L8c
                goto Ld1
            L8c:
                if (r5 < r0) goto Lae
                if (r5 != r0) goto L93
                if (r13 > r4) goto L93
                goto Lae
            L93:
                r6.setHours(r0)
                r6.setMinutes(r4)
                r7.setHours(r5)
                r7.setMinutes(r13)
                boolean r13 = r1.after(r6)
                if (r13 == 0) goto Lac
                boolean r13 = r1.before(r7)
                if (r13 == 0) goto Lac
                goto Ld1
            Lac:
                r2 = 0
                goto Ld1
            Lae:
                r6.setHours(r0)
                r6.setMinutes(r4)
                long r8 = java.lang.System.currentTimeMillis()
                r10 = 86400000(0x5265c00, double:4.2687272E-316)
                long r8 = r8 + r10
                r7.setTime(r8)
                r7.setHours(r5)
                r7.setMinutes(r13)
                boolean r13 = r1.after(r6)
                if (r13 == 0) goto Lac
                boolean r13 = r1.before(r7)
                if (r13 == 0) goto Lac
            Ld1:
                java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)
                return r13
            Ld6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.ksx.a.a(java.lang.String):java.lang.Object");
        }
    }
}
