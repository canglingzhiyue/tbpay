package com.taobao.android.weex;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public interface j {

    /* loaded from: classes6.dex */
    public interface a {
        void a(c cVar);

        void a(String str, String str2);
    }

    /* loaded from: classes6.dex */
    public interface c {
        String a();
    }

    void a(b bVar, a aVar);

    /* loaded from: classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f15871a;
        private String b;
        private String c;

        static {
            kge.a(-112560267);
        }

        public b(String str) {
            this.b = str;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f15871a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }
    }
}
