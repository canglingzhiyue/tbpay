package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.Map;

/* loaded from: classes.dex */
public class qoe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALENDAR_CLEAR_TITLE = "calendar_clear_title";
    public static final String STORAGE_MONITOR_MIN_SIZE_KEY = "storage_monitor_min_size";

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final qoe f32978a = new qoe();

        public static /* synthetic */ qoe a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (qoe) ipChange.ipc$dispatch("f09aff7", new Object[0]) : f32978a;
        }
    }

    /* renamed from: lambda$VqQh7S-hA7mzPcz_huksUPwl5XA */
    public static /* synthetic */ void m2490lambda$VqQh7ShA7mzPcz_huksUPwl5XA(qoe qoeVar, String str, Map map) {
        qoeVar.a(str, map);
    }

    public static qoe a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qoe) ipChange.ipc$dispatch("f09aff7", new Object[0]) : a.a();
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : OrangeConfig.getInstance().getConfig("android_reach_flow", str, "");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"android_reach_flow"}, new d() { // from class: tb.-$$Lambda$qoe$VqQh7S-hA7mzPcz_huksUPwl5XA
                @Override // com.taobao.orange.d
                public final void onConfigUpdate(String str, Map map) {
                    qoe.m2490lambda$VqQh7ShA7mzPcz_huksUPwl5XA(qoe.this, str, map);
                }
            }, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00c0 A[Catch: Throwable -> 0x0194, TryCatch #1 {Throwable -> 0x0194, blocks: (B:77:0x0021, B:79:0x0027, B:83:0x0035, B:85:0x0050, B:86:0x0056, B:88:0x0062, B:89:0x0068, B:91:0x0074, B:93:0x0080, B:94:0x008e, B:96:0x009b, B:97:0x00a1, B:99:0x00ae, B:100:0x00b4, B:102:0x00c0, B:103:0x00d0, B:105:0x00dd, B:106:0x00e4, B:109:0x00ea, B:111:0x00f7, B:112:0x010b, B:114:0x0118, B:115:0x012c, B:117:0x0139, B:118:0x0144, B:120:0x0151, B:121:0x015c, B:123:0x0169, B:124:0x0170, B:126:0x017a, B:127:0x0181), top: B:135:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00dd A[Catch: Throwable -> 0x0194, TryCatch #1 {Throwable -> 0x0194, blocks: (B:77:0x0021, B:79:0x0027, B:83:0x0035, B:85:0x0050, B:86:0x0056, B:88:0x0062, B:89:0x0068, B:91:0x0074, B:93:0x0080, B:94:0x008e, B:96:0x009b, B:97:0x00a1, B:99:0x00ae, B:100:0x00b4, B:102:0x00c0, B:103:0x00d0, B:105:0x00dd, B:106:0x00e4, B:109:0x00ea, B:111:0x00f7, B:112:0x010b, B:114:0x0118, B:115:0x012c, B:117:0x0139, B:118:0x0144, B:120:0x0151, B:121:0x015c, B:123:0x0169, B:124:0x0170, B:126:0x017a, B:127:0x0181), top: B:135:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ea A[Catch: Throwable -> 0x018d, TRY_ENTER, TryCatch #1 {Throwable -> 0x0194, blocks: (B:77:0x0021, B:79:0x0027, B:83:0x0035, B:85:0x0050, B:86:0x0056, B:88:0x0062, B:89:0x0068, B:91:0x0074, B:93:0x0080, B:94:0x008e, B:96:0x009b, B:97:0x00a1, B:99:0x00ae, B:100:0x00b4, B:102:0x00c0, B:103:0x00d0, B:105:0x00dd, B:106:0x00e4, B:109:0x00ea, B:111:0x00f7, B:112:0x010b, B:114:0x0118, B:115:0x012c, B:117:0x0139, B:118:0x0144, B:120:0x0151, B:121:0x015c, B:123:0x0169, B:124:0x0170, B:126:0x017a, B:127:0x0181), top: B:135:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0050 A[Catch: Throwable -> 0x0194, TryCatch #1 {Throwable -> 0x0194, blocks: (B:77:0x0021, B:79:0x0027, B:83:0x0035, B:85:0x0050, B:86:0x0056, B:88:0x0062, B:89:0x0068, B:91:0x0074, B:93:0x0080, B:94:0x008e, B:96:0x009b, B:97:0x00a1, B:99:0x00ae, B:100:0x00b4, B:102:0x00c0, B:103:0x00d0, B:105:0x00dd, B:106:0x00e4, B:109:0x00ea, B:111:0x00f7, B:112:0x010b, B:114:0x0118, B:115:0x012c, B:117:0x0139, B:118:0x0144, B:120:0x0151, B:121:0x015c, B:123:0x0169, B:124:0x0170, B:126:0x017a, B:127:0x0181), top: B:135:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0062 A[Catch: Throwable -> 0x0194, TryCatch #1 {Throwable -> 0x0194, blocks: (B:77:0x0021, B:79:0x0027, B:83:0x0035, B:85:0x0050, B:86:0x0056, B:88:0x0062, B:89:0x0068, B:91:0x0074, B:93:0x0080, B:94:0x008e, B:96:0x009b, B:97:0x00a1, B:99:0x00ae, B:100:0x00b4, B:102:0x00c0, B:103:0x00d0, B:105:0x00dd, B:106:0x00e4, B:109:0x00ea, B:111:0x00f7, B:112:0x010b, B:114:0x0118, B:115:0x012c, B:117:0x0139, B:118:0x0144, B:120:0x0151, B:121:0x015c, B:123:0x0169, B:124:0x0170, B:126:0x017a, B:127:0x0181), top: B:135:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x009b A[Catch: Throwable -> 0x0194, TryCatch #1 {Throwable -> 0x0194, blocks: (B:77:0x0021, B:79:0x0027, B:83:0x0035, B:85:0x0050, B:86:0x0056, B:88:0x0062, B:89:0x0068, B:91:0x0074, B:93:0x0080, B:94:0x008e, B:96:0x009b, B:97:0x00a1, B:99:0x00ae, B:100:0x00b4, B:102:0x00c0, B:103:0x00d0, B:105:0x00dd, B:106:0x00e4, B:109:0x00ea, B:111:0x00f7, B:112:0x010b, B:114:0x0118, B:115:0x012c, B:117:0x0139, B:118:0x0144, B:120:0x0151, B:121:0x015c, B:123:0x0169, B:124:0x0170, B:126:0x017a, B:127:0x0181), top: B:135:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ae A[Catch: Throwable -> 0x0194, TryCatch #1 {Throwable -> 0x0194, blocks: (B:77:0x0021, B:79:0x0027, B:83:0x0035, B:85:0x0050, B:86:0x0056, B:88:0x0062, B:89:0x0068, B:91:0x0074, B:93:0x0080, B:94:0x008e, B:96:0x009b, B:97:0x00a1, B:99:0x00ae, B:100:0x00b4, B:102:0x00c0, B:103:0x00d0, B:105:0x00dd, B:106:0x00e4, B:109:0x00ea, B:111:0x00f7, B:112:0x010b, B:114:0x0118, B:115:0x012c, B:117:0x0139, B:118:0x0144, B:120:0x0151, B:121:0x015c, B:123:0x0169, B:124:0x0170, B:126:0x017a, B:127:0x0181), top: B:135:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void a(java.lang.String r9, java.util.Map r10) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qoe.a(java.lang.String, java.util.Map):void");
    }
}
