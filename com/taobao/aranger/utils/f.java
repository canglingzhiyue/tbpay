package com.taobao.aranger.utils;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile f f16375a;
    private final ConcurrentHashMap<String, Pair<Class, Object>> b = new ConcurrentHashMap<>();

    static {
        kge.a(282716992);
        f16375a = null;
    }

    private f() {
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("59a45b41", new Object[0]);
        }
        if (f16375a == null) {
            synchronized (f.class) {
                if (f16375a == null) {
                    f16375a = new f();
                }
            }
        }
        return f16375a;
    }

    public Pair<Class, Object> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("c2e055fc", new Object[]{this, str}) : this.b.get(str);
    }

    public void a(String str, Pair<Class, Object> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e719c368", new Object[]{this, str, pair});
        } else {
            this.b.putIfAbsent(str, pair);
        }
    }

    public void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null) {
            for (String str : list) {
                this.b.remove(str);
            }
        }
    }
}
