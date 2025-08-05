package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes6.dex */
public class ioe {
    static {
        kge.a(-704295289);
    }

    /* loaded from: classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public List<iuk> f29184a;
        public List<iuk> b;
        public List<iuk> c;
        public List<iuk> d;

        static {
            kge.a(1484167302);
        }

        private b(List<iuk> list, List<iuk> list2, List<iuk> list3, List<iuk> list4) {
            this.f29184a = list;
            this.b = list2;
            this.c = list3;
            this.d = list4;
        }

        public static b a(List<iuk> list, List<iuk> list2, List<iuk> list3, List<iuk> list4) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("fba613bd", new Object[]{list, list2, list3, list4}) : new b(list, list2, list3, list4);
        }
    }
}
