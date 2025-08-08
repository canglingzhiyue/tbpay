package com.taobao.tbpoplayer.adapter;

import com.alibaba.poplayer.norm.IConfigAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class f implements IConfigAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String b;
    private com.taobao.tbpoplayer.info.b d;
    private com.alibaba.poplayer.config.fetch.a e;
    private final String c = "poplayer_config";
    private final AtomicBoolean f = new AtomicBoolean(false);

    static {
        kge.a(-142379119);
        kge.a(-703589047);
    }

    public static /* synthetic */ void lambda$QY9aBbxKA4Wz0Yo7LwxddJXU_T0(f fVar, boolean z, String str, Map map) {
        fVar.a(z, str, map);
    }

    public f(String str) {
        this.b = str;
    }

    @Override // com.alibaba.poplayer.norm.IConfigAdapter
    public void init(com.alibaba.poplayer.config.fetch.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e36a5d", new Object[]{this, aVar});
            return;
        }
        this.d = new com.taobao.tbpoplayer.info.b();
        this.e = aVar;
    }

    @Override // com.alibaba.poplayer.norm.IConfigAdapter
    public void startFetchConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb53c61", new Object[]{this});
        } else if (this.f.getAndSet(true)) {
        } else {
            final boolean x = com.taobao.tbpoplayer.info.a.a().x();
            com.alibaba.poplayer.utils.c.c("sdkLifeCycle", "", "TBConfigAdapter.addConfigObserver.isLocalConfigEnable=" + x);
            if (x) {
                com.alibaba.poplayer.utils.c.a("TBConfigAdapter.addConfigObserver.isLocalConfigEnable.updateCacheConfigAsync.", new Object[0]);
                this.e.onConfigFetched(true, this.d.a(), null, null);
            }
            OrangeConfig.getInstance().registerListener(new String[]{this.b}, new com.taobao.orange.d() { // from class: com.taobao.tbpoplayer.adapter.-$$Lambda$f$QY9aBbxKA4Wz0Yo7LwxddJXU_T0
                @Override // com.taobao.orange.d
                public final void onConfigUpdate(String str, Map map) {
                    f.lambda$QY9aBbxKA4Wz0Yo7LwxddJXU_T0(f.this, x, str, map);
                }
            }, true);
            com.alibaba.poplayer.utils.c.a("OrangeRegisterListener.group=%s", this.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0051 A[Catch: Throwable -> 0x0099, TRY_ENTER, TryCatch #0 {Throwable -> 0x0099, blocks: (B:38:0x0026, B:40:0x002c, B:44:0x003a, B:47:0x0051, B:50:0x0069, B:54:0x007c, B:53:0x0076), top: B:59:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void a(boolean r7, java.lang.String r8, java.util.Map r9) {
        /*
            r6 = this;
            java.lang.String r0 = "configVersion"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.tbpoplayer.adapter.f.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L22
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r5] = r6
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r7)
            r0[r4] = r2
            r0[r3] = r8
            r7 = 3
            r0[r7] = r9
            java.lang.String r7 = "2499ee8f"
            r1.ipc$dispatch(r7, r0)
            return
        L22:
            java.lang.String r1 = ""
            if (r9 == 0) goto L39
            boolean r2 = r9.containsKey(r0)     // Catch: java.lang.Throwable -> L99
            if (r2 == 0) goto L39
            java.lang.Object r9 = r9.get(r0)     // Catch: java.lang.Throwable -> L99
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L99
            boolean r0 = android.text.StringUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L39
            goto L3a
        L39:
            r9 = r1
        L3a:
            java.lang.String r0 = "OrangeGetConfig.group=%s.configVersion=%s"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L99
            r2[r5] = r8     // Catch: java.lang.Throwable -> L99
            r2[r4] = r9     // Catch: java.lang.Throwable -> L99
            com.alibaba.poplayer.utils.c.a(r0, r2)     // Catch: java.lang.Throwable -> L99
            tb.bzs r0 = tb.bzs.a()     // Catch: java.lang.Throwable -> L99
            boolean r0 = r0.h()     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = "configUpdate"
            if (r0 == 0) goto L67
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            r7.<init>()     // Catch: java.lang.Throwable -> L99
            java.lang.String r8 = "is mocking. configVersion="
            r7.append(r8)     // Catch: java.lang.Throwable -> L99
            r7.append(r9)     // Catch: java.lang.Throwable -> L99
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L99
            com.alibaba.poplayer.utils.c.c(r2, r1, r7)     // Catch: java.lang.Throwable -> L99
            return
        L67:
            if (r7 == 0) goto L72
            com.taobao.tbpoplayer.info.b r0 = r6.d     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = "poplayer_config"
            boolean r5 = r0.a(r8, r3, r9)     // Catch: java.lang.Throwable -> L99
        L72:
            if (r7 == 0) goto L76
            if (r5 == 0) goto L7c
        L76:
            com.alibaba.poplayer.config.fetch.a r7 = r6.e     // Catch: java.lang.Throwable -> L99
            r0 = 0
            r7.onConfigFetched(r5, r9, r0, r0)     // Catch: java.lang.Throwable -> L99
        L7c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            r7.<init>()     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = "configGroup="
            r7.append(r0)     // Catch: java.lang.Throwable -> L99
            r7.append(r8)     // Catch: java.lang.Throwable -> L99
            java.lang.String r8 = ".configVersion="
            r7.append(r8)     // Catch: java.lang.Throwable -> L99
            r7.append(r9)     // Catch: java.lang.Throwable -> L99
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L99
            com.alibaba.poplayer.utils.c.c(r2, r1, r7)     // Catch: java.lang.Throwable -> L99
            return
        L99:
            r7 = move-exception
            java.lang.String r8 = "onConfigUpdate error"
            com.alibaba.poplayer.utils.c.a(r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.adapter.f.a(boolean, java.lang.String, java.util.Map):void");
    }

    @Override // com.alibaba.poplayer.norm.IConfigAdapter
    public String getConfigsIdSetString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0ac231c", new Object[]{this});
        }
        if (com.taobao.tbpoplayer.info.a.a().x()) {
            return this.d.a("poplayer_config");
        }
        return OrangeConfig.getInstance().getConfig(this.b, "poplayer_config", "");
    }

    @Override // com.alibaba.poplayer.norm.IConfigAdapter
    public String getConfigItemById(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22f8c3b2", new Object[]{this, str});
        }
        if (com.taobao.tbpoplayer.info.a.a().x()) {
            return this.d.a(str);
        }
        return OrangeConfig.getInstance().getConfig(this.b, str, "");
    }
}
