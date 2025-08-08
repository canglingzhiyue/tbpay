package com.taobao.tbpoplayer.adapter;

import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class b implements com.alibaba.poplayer.layermanager.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f22200a = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final b f22203a;

        static {
            kge.a(831650989);
            f22203a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3e84a185", new Object[0]) : f22203a;
        }
    }

    static {
        kge.a(1270958042);
        kge.a(-1951006876);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3e84a185", new Object[0]) : a.a();
    }

    @Override // com.alibaba.poplayer.layermanager.c
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (com.taobao.tbpoplayer.info.a.a().y()) {
            return com.taobao.tbpoplayer.info.a.a().a(str);
        }
        return OrangeConfig.getInstance().getConfig("android_layermanager", str, "");
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : OrangeConfig.getInstance().getConfig("android_layermanager", str, "");
    }

    @Override // com.alibaba.poplayer.layermanager.c
    public void a(final com.alibaba.poplayer.layermanager.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ad2dd8", new Object[]{this, fVar});
        } else if (this.f22200a.getAndSet(true)) {
        } else {
            final boolean y = com.taobao.tbpoplayer.info.a.a().y();
            com.alibaba.poplayer.utils.c.b("sdkLifeCycle", "", "LayerMgrAdapter.addConfigObserver.updateCacheConfigAsync.isLocalLMConfigEnable=" + y);
            if (y) {
                com.alibaba.poplayer.utils.c.a("LayerMgrAdapter.addConfigObserver.isLocalLMConfigEnable.updateCacheConfigAsync.", new Object[0]);
                fVar.c().b();
            }
            OrangeConfig.getInstance().registerListener(new String[]{"android_layermanager"}, new com.taobao.orange.d() { // from class: com.taobao.tbpoplayer.adapter.-$$Lambda$b$DFsyYKnAmIrD7PJNxQM1-g522K4
                @Override // com.taobao.orange.d
                public final void onConfigUpdate(String str, Map map) {
                    b.this.a(y, fVar, str, map);
                }
            }, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[Catch: Throwable -> 0x0073, TryCatch #0 {Throwable -> 0x0073, blocks: (B:8:0x0029, B:10:0x002f, B:14:0x003d, B:16:0x0042, B:20:0x005c, B:19:0x0055), top: B:25:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void a(boolean r5, com.alibaba.poplayer.layermanager.f r6, java.lang.String r7, java.util.Map r8) {
        /*
            r4 = this;
            java.lang.String r0 = "configVersion"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.tbpoplayer.adapter.b.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            if (r2 == 0) goto L25
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r4
            r2 = 1
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r5)
            r0[r2] = r3
            r5 = 2
            r0[r5] = r6
            r5 = 3
            r0[r5] = r7
            r5 = 4
            r0[r5] = r8
            java.lang.String r5 = "aa8b85a7"
            r1.ipc$dispatch(r5, r0)
            return
        L25:
            java.lang.String r7 = ""
            if (r8 == 0) goto L3c
            boolean r1 = r8.containsKey(r0)     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L3c
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L73
            boolean r0 = android.text.StringUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L3c
            goto L3d
        L3c:
            r8 = r7
        L3d:
            r4.b()     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L51
            com.taobao.tbpoplayer.info.a r0 = com.taobao.tbpoplayer.info.a.a()     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = "android_layermanager"
            java.lang.String r2 = "layer_manager_config"
            java.lang.String r3 = "directlyBlackList"
            boolean r3 = r0.a(r1, r2, r3, r8)     // Catch: java.lang.Throwable -> L73
        L51:
            if (r5 == 0) goto L55
            if (r3 == 0) goto L5c
        L55:
            com.alibaba.poplayer.layermanager.config.a r5 = r6.c()     // Catch: java.lang.Throwable -> L73
            r5.b()     // Catch: java.lang.Throwable -> L73
        L5c:
            java.lang.String r5 = "configUpdate"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r6.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "configGroup=android_layermanager.configVersion="
            r6.append(r0)     // Catch: java.lang.Throwable -> L73
            r6.append(r8)     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L73
            com.alibaba.poplayer.utils.c.b(r5, r7, r6)     // Catch: java.lang.Throwable -> L73
            return
        L73:
            r5 = move-exception
            java.lang.String r6 = "LayerMgrAdapter.onConfigUpdate error"
            com.alibaba.poplayer.utils.c.a(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.adapter.b.a(boolean, com.alibaba.poplayer.layermanager.f, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0281 A[Catch: Throwable -> 0x02ae, TryCatch #5 {Throwable -> 0x02c3, blocks: (B:10:0x0033, B:13:0x0042, B:28:0x0084, B:59:0x02b8, B:44:0x026f, B:6:0x0025, B:45:0x0274, B:47:0x0281, B:51:0x029e, B:53:0x02a3, B:48:0x0295, B:15:0x004c, B:17:0x0059, B:22:0x006e, B:24:0x0073, B:18:0x0064), top: B:67:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0295 A[Catch: Throwable -> 0x02ae, TryCatch #5 {Throwable -> 0x02c3, blocks: (B:10:0x0033, B:13:0x0042, B:28:0x0084, B:59:0x02b8, B:44:0x026f, B:6:0x0025, B:45:0x0274, B:47:0x0281, B:51:0x029e, B:53:0x02a3, B:48:0x0295, B:15:0x004c, B:17:0x0059, B:22:0x006e, B:24:0x0073, B:18:0x0064), top: B:67:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a3 A[Catch: Throwable -> 0x02ae, TRY_LEAVE, TryCatch #5 {Throwable -> 0x02c3, blocks: (B:10:0x0033, B:13:0x0042, B:28:0x0084, B:59:0x02b8, B:44:0x026f, B:6:0x0025, B:45:0x0274, B:47:0x0281, B:51:0x029e, B:53:0x02a3, B:48:0x0295, B:15:0x004c, B:17:0x0059, B:22:0x006e, B:24:0x0073, B:18:0x0064), top: B:67:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b() {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.adapter.b.b():void");
    }

    private void a(SharedPreferences.Editor editor, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1795e0dd", new Object[]{this, editor, str, str2, new Boolean(z)});
            return;
        }
        try {
            String b = b(str);
            if (!StringUtils.isEmpty(b)) {
                z = Boolean.parseBoolean(b);
            }
            if (editor != null) {
                editor.putBoolean(str2, z);
            } else {
                com.taobao.tbpoplayer.info.a.a().a(str2, z);
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("LayerMgrAdapter.updateBoolean.error.orangeKey=" + str, th);
        }
    }

    private void a(SharedPreferences.Editor editor, String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1795a4cd", new Object[]{this, editor, str, str2, new Long(j)});
            return;
        }
        try {
            String b = b(str);
            if (!StringUtils.isEmpty(b)) {
                j = Long.parseLong(b);
            }
            if (editor != null) {
                editor.putLong(str2, j);
            } else {
                com.taobao.tbpoplayer.info.a.a().a(str2, j);
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("LayerMgrAdapter.updateLong.error.orangeKey=" + str, th);
        }
    }

    private void a(SharedPreferences.Editor editor, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792aee1", new Object[]{this, editor, str, str2, str3});
            return;
        }
        try {
            String b = b(str);
            if (!StringUtils.isEmpty(b)) {
                str3 = b;
            }
            if (editor != null) {
                editor.putString(str2, str3);
            } else {
                com.taobao.tbpoplayer.info.a.a().a(str2, str3);
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("LayerMgrAdapter.updateString.error.orangeKey=" + str, th);
        }
    }
}
