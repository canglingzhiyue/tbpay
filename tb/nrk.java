package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class nrk {
    static {
        kge.a(-382090963);
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f31692a;
        public String b;

        static {
            kge.a(544233167);
        }

        private a(String str, String str2) {
            this.f31692a = str;
            this.b = str2;
        }

        public static a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3c529026", new Object[]{str, str2}) : new a(str, str2);
        }
    }
}
