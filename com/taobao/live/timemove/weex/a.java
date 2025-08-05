package com.taobao.live.timemove.weex;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f17797a;
    private HashMap<Object, Boolean> b = new HashMap<>();

    static {
        kge.a(932382835);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("dd12c6a5", new Object[0]);
        }
        if (f17797a == null) {
            f17797a = new a();
        }
        return f17797a;
    }

    public void a(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7de910", new Object[]{this, obj, new Boolean(z)});
        } else {
            this.b.put(obj, Boolean.valueOf(z));
        }
    }

    public boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
        }
        Boolean bool = this.b.get(obj);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
