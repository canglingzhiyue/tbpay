package com.taobao.bootimage.linked;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public interface b {
    String a();

    void a(LinkedSplashData linkedSplashData);

    boolean a(a aVar);

    void b();

    boolean b(LinkedSplashData linkedSplashData);

    void c();

    boolean c(LinkedSplashData linkedSplashData);

    void d();

    void e();

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String FROM_CLOSE = "FROM_SKIP";
        public static final String FROM_FINISH = "FROM_OTHER";

        /* renamed from: a  reason: collision with root package name */
        public String f16704a;
        public int b;
        public int c;
        public int d;
        public int e;
        public float f;

        static {
            kge.a(372262251);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "LinkedSplashAnimOptions{fromAction='" + this.f16704a + "', width=" + this.b + ", height=" + this.c + ", positionX=" + this.d + ", positionY=" + this.e + ", targetCornerRadius=" + this.f + '}';
        }
    }
}
