package tb;

import android.view.Menu;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class nxa {
    static {
        kge.a(1651093904);
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Menu f31825a;

        static {
            kge.a(-1399988030);
        }

        private b(Menu menu) {
            this.f31825a = menu;
        }

        public static b a(Menu menu) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("61269b21", new Object[]{menu}) : new b(menu);
        }
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(573647349);
        }

        private a() {
        }

        public static a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6ebbbc0a", new Object[0]) : new a();
        }
    }
}
