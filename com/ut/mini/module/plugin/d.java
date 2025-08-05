package com.ut.mini.module.plugin;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.apr;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static d f24135a;
    private c b = new c();

    static {
        kge.a(-1879484841);
        f24135a = null;
    }

    private d() {
    }

    public static d getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("b60609ee", new Object[0]);
        }
        if (f24135a == null) {
            synchronized (d.class) {
                if (f24135a == null) {
                    f24135a = new d();
                }
            }
        }
        return f24135a;
    }

    @Deprecated
    public c getUTPluginConfigMgr() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("42bfd412", new Object[]{this}) : this.b;
    }

    @Deprecated
    public synchronized void registerPlugin(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781a54f2", new Object[]{this, aVar});
        } else {
            this.b.a(aVar);
        }
    }

    public synchronized void registerPlugin(a aVar, boolean z, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e170c04", new Object[]{this, aVar, new Boolean(z), list, list2});
        } else if (aVar == null) {
            apr.e("UTPluginMgr", "registerPlugin listener is null");
        } else if (TextUtils.isEmpty(aVar.getPluginName())) {
            apr.e("UTPluginMgr", "registerPlugin listenerName is null");
        } else {
            aVar.setUTPluginParam(false, z, list, list2);
            registerPlugin(aVar);
        }
    }

    public synchronized void unregisterPlugin(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("170f4539", new Object[]{this, aVar});
        } else {
            this.b.b(aVar);
        }
    }
}
