package com.alibaba.android.umf.datamodel;

import android.content.Context;
import com.alibaba.android.umf.e;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.bqd;
import tb.bqe;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f2838a;
    private WeakReference<Object> b;
    private HashMap<String, Object> c;
    private e d;
    private Context e;

    static {
        kge.a(-1478020845);
    }

    public Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
        }
        WeakReference<Object> weakReference = this.b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public e b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("ac213777", new Object[]{this}) : this.d;
    }

    public Context c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c833dc62", new Object[]{this});
        }
        Context context = this.e;
        if (context == null) {
            throw new NullPointerException("did you forget call setContext");
        }
        return context;
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8001f6", new Object[]{this, eVar});
        } else {
            this.d = eVar;
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.f2838a;
    }

    @Deprecated
    public <T> T a(String str, Class<T> cls) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21de4147", new Object[]{this, str, cls});
        }
        HashMap<String, Object> hashMap = this.c;
        if (hashMap == null || (t = (T) hashMap.get(str)) == null) {
            return null;
        }
        try {
        } catch (Throwable th) {
            bqd a2 = bqe.a();
            a2.c("UMFRuntimeContext", "getInnerContextObj#cast exception,error=" + th.getMessage());
        }
        if (!cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    @Deprecated
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        if (this.c == null) {
            this.c = new HashMap<>();
        }
        this.c.put(str, obj);
    }
}
