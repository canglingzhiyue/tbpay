package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.client.smart.core.core.remote.ITaobaoRemoteSoService;
import com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* renamed from: com.alibaba.security.ccrc.service.build.ta  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1250ta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile HashMap<String, Boolean> f3328a = new HashMap<>();
    public ITaobaoRemoteSoService b;

    /* renamed from: com.alibaba.security.ccrc.service.build.ta$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3329a;
        public String b;

        public a() {
        }

        public /* synthetic */ a(C1247sa c1247sa) {
        }
    }

    public C1250ta() {
        try {
            Class<?> cls = Class.forName("com.alibaba.wukong.plugin.remote.TaobaoRemoteSoPluginManager");
            if (cls == null) {
                return;
            }
            Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof ITaobaoRemoteSoService)) {
                return;
            }
            this.b = (ITaobaoRemoteSoService) newInstance;
        } catch (Throwable unused) {
        }
    }

    private a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3a1999fd", new Object[]{this, str});
        }
        a aVar = new a(null);
        try {
            System.loadLibrary(str);
            aVar.f3329a = true;
            aVar.b = "success";
            return aVar;
        } catch (Throwable th) {
            aVar.f3329a = false;
            aVar.b = th.getMessage();
            return aVar;
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.f3328a.containsKey(str) && this.f3328a.get(str).booleanValue()) {
            return true;
        }
        if (b(str).f3329a) {
            this.f3328a.put(str, true);
            return true;
        }
        ITaobaoRemoteSoService iTaobaoRemoteSoService = this.b;
        if (iTaobaoRemoteSoService == null || !iTaobaoRemoteSoService.isRemoteSoLoaded(str)) {
            return false;
        }
        this.f3328a.put(str, true);
        return true;
    }

    public void a(String str, OnRemoteSoLoadListener onRemoteSoLoadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdbbfb07", new Object[]{this, str, onRemoteSoLoadListener});
            return;
        }
        a b = b(str);
        if (b.f3329a) {
            this.f3328a.put(str, true);
            onRemoteSoLoadListener.onResult(str, true, b.b);
        } else if (a(str)) {
            this.f3328a.put(str, true);
            onRemoteSoLoadListener.onResult(str, true, "success");
        } else {
            ITaobaoRemoteSoService iTaobaoRemoteSoService = this.b;
            if (iTaobaoRemoteSoService == null) {
                onRemoteSoLoadListener.onResult(str, false, "remote so service is null");
            } else {
                iTaobaoRemoteSoService.loadRemoteSo(str, new C1247sa(this, onRemoteSoLoadListener));
            }
        }
    }
}
