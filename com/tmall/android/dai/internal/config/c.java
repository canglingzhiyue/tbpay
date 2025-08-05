package com.tmall.android.dai.internal.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import tb.gsc;
import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DEBUG = false;
    public static final String TAG = "ConfigManagerWrapper";

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f23686a;
    private boolean b = false;

    static {
        kge.a(893558985);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("706de4e9", new Object[0]);
        }
        if (f23686a == null) {
            synchronized (d.class) {
                if (f23686a == null) {
                    f23686a = new c();
                }
            }
        }
        return f23686a;
    }

    private c() {
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!d.a().c() || this.b) {
        } else {
            a.a().d();
            gsc.a().b();
            c();
            this.b = true;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"jarvis_config_v2", "ODCP_walle_config", "walle_feature", "ODCP_python_base_lib"}, new g() { // from class: com.tmall.android.dai.internal.config.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
                    if (android.text.TextUtils.equals(r5.get("enableFeatureCenter"), com.tmall.android.dai.DAIKVStoreage.getDiskValue("walle_orange_config_cache_name", r13 + "__enableFeatureCenter")) == false) goto L22;
                 */
                @Override // com.taobao.orange.g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onConfigUpdate(java.lang.String r13, boolean r14) {
                    /*
                        r12 = this;
                        com.android.alibaba.ip.runtime.IpChange r0 = com.tmall.android.dai.internal.config.c.AnonymousClass1.$ipChange
                        boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                        r2 = 1
                        r3 = 0
                        if (r1 == 0) goto L1d
                        r1 = 3
                        java.lang.Object[] r1 = new java.lang.Object[r1]
                        r1[r3] = r12
                        r1[r2] = r13
                        r13 = 2
                        java.lang.Boolean r2 = new java.lang.Boolean
                        r2.<init>(r14)
                        r1[r13] = r2
                        java.lang.String r13 = "9458c0f9"
                        r0.ipc$dispatch(r13, r1)
                        return
                    L1d:
                        java.lang.String r0 = "walle_feature"
                        boolean r1 = android.text.TextUtils.equals(r13, r0)
                        java.lang.String r4 = ""
                        r5 = 0
                        if (r1 == 0) goto L32
                        com.taobao.orange.OrangeConfig r6 = com.taobao.orange.OrangeConfig.getInstance()
                        java.lang.String r6 = r6.getCustomConfig(r13, r4)
                        goto L3d
                    L32:
                        com.taobao.orange.OrangeConfig r6 = com.taobao.orange.OrangeConfig.getInstance()
                        java.util.Map r6 = r6.getConfigs(r13)
                        r11 = r6
                        r6 = r5
                        r5 = r11
                    L3d:
                        java.lang.String r7 = "ODCP_walle_config"
                        boolean r7 = android.text.TextUtils.equals(r13, r7)
                        if (r7 == 0) goto L4c
                        com.tmall.android.dai.internal.config.a r7 = com.tmall.android.dai.internal.config.a.a()
                        r7.b()
                    L4c:
                        java.lang.String r7 = "ODCP_python_base_lib"
                        boolean r7 = android.text.TextUtils.equals(r7, r13)
                        if (r7 == 0) goto L5b
                        tb.gsc r7 = tb.gsc.a()
                        r7.b()
                    L5b:
                        java.lang.String r7 = "__"
                        java.lang.String r8 = "walle_orange_config_cache_name"
                        if (r14 != 0) goto L9d
                        boolean r14 = android.text.TextUtils.equals(r0, r13)
                        java.lang.String r0 = "jarvis_config_v2"
                        boolean r0 = android.text.TextUtils.equals(r0, r13)
                        if (r0 == 0) goto L95
                        if (r5 == 0) goto L95
                        java.lang.String r0 = "enableFeatureCenter"
                        java.lang.Object r9 = r5.get(r0)
                        java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                        java.lang.StringBuilder r10 = new java.lang.StringBuilder
                        r10.<init>()
                        r10.append(r13)
                        r10.append(r7)
                        r10.append(r0)
                        java.lang.String r0 = r10.toString()
                        java.lang.String r0 = com.tmall.android.dai.DAIKVStoreage.getDiskValue(r8, r0)
                        boolean r0 = android.text.TextUtils.equals(r9, r0)
                        if (r0 != 0) goto L95
                        goto L96
                    L95:
                        r2 = 0
                    L96:
                        if (r14 != 0) goto L9a
                        if (r2 == 0) goto L9d
                    L9a:
                        com.tmall.android.dai.DAI.initFeatureCenter()
                    L9d:
                        if (r1 == 0) goto La5
                        if (r6 == 0) goto Lda
                        com.tmall.android.dai.DAIKVStoreage.putToDisk(r8, r13, r6)
                        return
                    La5:
                        if (r5 == 0) goto Lda
                        java.util.Set r14 = r5.keySet()
                        java.util.Iterator r14 = r14.iterator()
                    Laf:
                        boolean r0 = r14.hasNext()
                        if (r0 == 0) goto Lda
                        java.lang.Object r0 = r14.next()
                        java.lang.String r0 = (java.lang.String) r0
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        r1.append(r4)
                        r1.append(r13)
                        r1.append(r7)
                        r1.append(r0)
                        java.lang.String r1 = r1.toString()
                        java.lang.Object r0 = r5.get(r0)
                        java.lang.String r0 = (java.lang.String) r0
                        com.tmall.android.dai.DAIKVStoreage.putToDisk(r8, r1, r0)
                        goto Laf
                    Lda:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tmall.android.dai.internal.config.c.AnonymousClass1.onConfigUpdate(java.lang.String, boolean):void");
                }
            });
        }
    }
}
