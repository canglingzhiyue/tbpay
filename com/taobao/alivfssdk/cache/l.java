package com.taobao.alivfssdk.cache;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import tb.kge;

/* loaded from: classes4.dex */
public class l extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static l f8497a;

    @Override // com.taobao.alivfssdk.cache.h
    public <T> T a(String str, String str2, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2686b011", new Object[]{this, str, str2, cls});
        }
        return null;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean a(String str, String str2, InputStream inputStream, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1a0350", new Object[]{this, str, str2, inputStream, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean a(String str, String str2, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e19a7af", new Object[]{this, str, str2, obj, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public <T> T b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4f41c855", new Object[]{this, str, str2});
        }
        return null;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        }
    }

    @Override // com.taobao.alivfssdk.cache.h
    public InputStream d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("f7041402", new Object[]{this, str, str2});
        }
        return null;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public long e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb83974", new Object[]{this, str, str2})).longValue();
        }
        return -1L;
    }

    static {
        kge.a(1418478084);
        f8497a = null;
    }

    private l() {
    }

    public static synchronized l d() {
        synchronized (l.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l) ipChange.ipc$dispatch("e6794f48", new Object[0]);
            }
            if (f8497a == null) {
                f8497a = new l();
            }
            return f8497a;
        }
    }

    @Override // com.taobao.alivfssdk.cache.h
    public List<String> f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f186af0", new Object[]{this, str}) : new ArrayList(0);
    }
}
