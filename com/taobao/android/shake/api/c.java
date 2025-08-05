package com.taobao.android.shake.api;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f15064a;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f15065a = 3;
        public boolean b = true;
        public int c = 2;
        public int d = 500;
        public float e = 0.5f;
        public boolean f = false;
        public boolean g = false;

        static {
            kge.a(-153843241);
        }
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a();
    }

    static {
        kge.a(1940267983);
        f15064a = new c();
    }

    private c() {
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("6cb8fdab", new Object[0]) : f15064a;
    }

    public void a(Context context, b bVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66348c3f", new Object[]{this, context, bVar, aVar});
        } else {
            com.taobao.android.shake.b.a().a(context, bVar, aVar);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            com.taobao.android.shake.b.a().d();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.taobao.android.shake.b.a().e();
        }
    }
}
