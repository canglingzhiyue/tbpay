package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class nww {
    static {
        kge.a(377730462);
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f31822a;
        public int b;
        public Intent c;

        static {
            kge.a(-492947470);
        }

        private a(int i, int i2, Intent intent) {
            this.f31822a = i;
            this.b = i2;
            this.c = intent;
        }

        public static a a(int i, int i2, Intent intent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("658b9f36", new Object[]{new Integer(i), new Integer(i2), intent}) : new a(i, i2, intent);
        }
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f31823a;

        static {
            kge.a(166738637);
        }

        private b(int i) {
            this.f31823a = i;
        }

        public static b a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("e27fe6ff", new Object[]{new Integer(i)}) : new b(i);
        }
    }
}
