package com.tmall.android.dai.internal.config;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.internal.init.WalleInitBridgeJava;
import tb.kge;
import tb.rkq;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BasicConfigManager";

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f23684a;
    private volatile boolean b = false;
    private volatile boolean c = false;
    private String d;

    static {
        kge.a(107332848);
    }

    public static /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("56d53f15", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ String a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd63cf4b", new Object[]{aVar, str});
        }
        aVar.d = str;
        return str;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c421874d", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.b = z;
        return z;
    }

    public static /* synthetic */ boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("125fd68e", new Object[]{aVar})).booleanValue() : aVar.b;
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("399bad8e", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.c = z;
        return z;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("706de4ab", new Object[0]);
        }
        if (f23684a == null) {
            synchronized (a.class) {
                if (f23684a == null) {
                    f23684a = new a();
                }
            }
        }
        return f23684a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            com.tmall.android.dai.internal.util.b.b().a().execute(new Runnable() { // from class: com.tmall.android.dai.internal.config.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String config = OrangeConfig.getInstance().getConfig("ODCP_walle_config", "walle_config", "");
                    if (TextUtils.equals(config, a.a(a.this))) {
                        return;
                    }
                    a.a(a.this, config);
                    Config config2 = (Config) com.tmall.android.dai.internal.util.d.a(config, Config.class);
                    if (config2 == null) {
                        return;
                    }
                    rkq.d().a(config2.utEventIds);
                    rkq.d().b(config2.utDbBlacklist);
                    rkq.d().a(config2.ut2201WhiteArg1s, config2.utArgsWhiteKeys);
                    if (a.b(a.this)) {
                        return;
                    }
                    if (!com.taobao.mrt.c.a()) {
                        a.b(a.this, true);
                        return;
                    }
                    a.a(a.this, true);
                    if (d.a().e()) {
                        DAI.onBasicConfigUpdate();
                    } else {
                        WalleInitBridgeJava.a().m();
                    }
                }
            });
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            b();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.c) {
        } else {
            if (d.a().e()) {
                DAI.onBasicConfigUpdate();
            } else {
                WalleInitBridgeJava.a().m();
            }
            this.c = false;
        }
    }
}
