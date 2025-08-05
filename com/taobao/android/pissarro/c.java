package com.taobao.android.pissarro;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.pissarro.external.Config;
import com.taobao.android.pissarro.external.b;
import tb.ica;
import tb.icb;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    private Config f14654a;
    private boolean b;
    private boolean c;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static c f14655a;

        static {
            kge.a(-479993969);
            f14655a = new c();
        }
    }

    static {
        kge.a(-668389700);
        TAG = c.class.getSimpleName();
    }

    private c() {
        this.b = false;
        this.c = false;
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("63982eab", new Object[0]) : a.f14655a;
    }

    public Config b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("7cba1a09", new Object[]{this});
        }
        if (this.f14654a == null) {
            this.f14654a = new Config.a().a();
        }
        return this.f14654a;
    }

    public c a(Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("8b72f9cb", new Object[]{this, config});
        }
        this.f14654a = config;
        if (config != null && config.getDefinitionMode() == 1) {
            this.b = true;
        }
        return this;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public icb c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icb) ipChange.ipc$dispatch("1e692a54", new Object[]{this});
        }
        icb b = b.a().b();
        return b == null ? new ica() : b;
    }
}
