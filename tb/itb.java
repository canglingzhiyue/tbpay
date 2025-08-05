package tb;

import android.app.Activity;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.e;
import com.taobao.android.searchbaseframe.util.k;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class itb<BASE_BEAN> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final a i;

    /* renamed from: a  reason: collision with root package name */
    private imn f29302a;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private final Map<Class, e<a, Integer>> e = new HashMap();
    private final Map<Class, e<a, Integer>> f = new HashMap();
    private final Map<Class, e<a, Integer>> g = new HashMap();
    private final SparseArray<e<a, ListStyle>> h = new SparseArray<>();

    /* loaded from: classes6.dex */
    public interface a extends ise<b, itd> {
    }

    static {
        kge.a(-1757951963);
        i = new a() { // from class: tb.itb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public itd a(b bVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("f42f608a", new Object[]{this, bVar}) : new ita(bVar.f29303a, bVar.b, bVar.d, bVar.e);
            }
        };
    }

    public itb(imn imnVar) {
        this.h.put(0, e.a(i, null));
        this.f29302a = imnVar;
    }

    public void a(ListStyle listStyle, Class<? extends BASE_BEAN> cls, a aVar) {
        Map<Class, e<a, Integer>> map;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16282d4", new Object[]{this, listStyle, cls, aVar});
            return;
        }
        if (listStyle == ListStyle.WATERFALL) {
            this.b++;
            map = this.f;
            i2 = this.b + 501;
        } else if (listStyle == ListStyle.LIST) {
            this.c++;
            map = this.e;
            i2 = this.c + 101;
        } else {
            this.d++;
            map = this.g;
            i2 = this.d + 1001;
        }
        if (map.containsKey(cls)) {
            this.f29302a.b().b("CellFactory", "creator is already registered: " + cls);
        }
        map.put(cls, e.a(aVar, Integer.valueOf(i2)));
        this.h.put(i2, e.a(aVar, listStyle));
    }

    public int a(ListStyle listStyle, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("230e046b", new Object[]{this, listStyle, cls})).intValue();
        }
        e<a, Integer> b2 = b(listStyle, cls);
        if (b2 == null) {
            k b3 = this.f29302a.b();
            b3.b("CellFactory", "No creator for: " + cls.getSimpleName());
            return 0;
        }
        return b2.b.intValue();
    }

    public e<a, Integer> b(ListStyle listStyle, Class cls) {
        Map<Class, e<a, Integer>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("a6ae7fa4", new Object[]{this, listStyle, cls});
        }
        if (listStyle == ListStyle.WATERFALL) {
            map = this.f;
        } else if (listStyle == ListStyle.LIST) {
            map = this.e;
        } else {
            map = this.g;
        }
        return map.get(cls);
    }

    public itd a(int i2, Activity activity, ium iumVar, ViewGroup viewGroup, int i3, Object obj) {
        itd a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itd) ipChange.ipc$dispatch("4fe80249", new Object[]{this, new Integer(i2), activity, iumVar, viewGroup, new Integer(i3), obj});
        }
        e<a, ListStyle> eVar = this.h.get(i2);
        b bVar = b.INSTANCE;
        bVar.f29303a = activity;
        bVar.b = iumVar;
        bVar.c = viewGroup;
        bVar.d = eVar.b;
        bVar.e = i3;
        bVar.f = obj;
        try {
            a2 = eVar.f15014a.a(bVar);
        } catch (Exception e) {
            this.f29302a.b().b("CellFactory", "Error creating cell", e);
            a2 = i.a(bVar);
        }
        b.a();
        return a2;
    }

    public itd b(int i2, Activity activity, ium iumVar, ViewGroup viewGroup, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itd) ipChange.ipc$dispatch("958944e8", new Object[]{this, new Integer(i2), activity, iumVar, viewGroup, new Integer(i3), obj});
        }
        b bVar = b.INSTANCE;
        bVar.f29303a = activity;
        bVar.b = iumVar;
        bVar.c = viewGroup;
        bVar.d = this.h.get(i2).b;
        bVar.e = i3;
        bVar.f = obj;
        itd a2 = i.a(bVar);
        b.a();
        return a2;
    }

    /* loaded from: classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE;

        /* renamed from: a  reason: collision with root package name */
        public Activity f29303a;
        public ium b;
        public ViewGroup c;
        public ListStyle d;
        public int e;
        public Object f;

        static {
            kge.a(320176868);
            INSTANCE = new b();
        }

        public static void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
                return;
            }
            b bVar = INSTANCE;
            bVar.f29303a = null;
            bVar.b = null;
            bVar.c = null;
            bVar.d = null;
            bVar.f = null;
        }
    }
}
