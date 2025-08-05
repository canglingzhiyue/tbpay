package com.taobao.android.weex_framework;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public interface j {

    /* loaded from: classes6.dex */
    public interface c {
        void a();

        void a(int i, int i2);

        void a(Object obj);

        void b();

        void b(Object obj);

        int c();

        void c(Object obj);

        ViewGroup d();

        void e();

        Object f();
    }

    b a();

    void a(b bVar);

    /* loaded from: classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f15991a;
        public String b;
        public c c;

        static {
            kge.a(-1844026002);
        }

        public c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("81e3fc4c", new Object[]{this}) : this.c;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f15991a;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
        }
    }
}
