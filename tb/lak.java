package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class lak {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, Class<? extends laj>> f30433a = new ConcurrentHashMap(4);

    public lak() {
        this.f30433a.put(1, lai.class);
    }

    public laj a(int i) {
        Class<? extends laj> cls = this.f30433a.get(Integer.valueOf(i));
        if (cls == null) {
            return null;
        }
        try {
            return cls.newInstance();
        } catch (Throwable th) {
            c.a("getViewProvider error, class=" + cls.getName(), th);
            return null;
        }
    }

    public void a(int i, Class<? extends laj> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1680d02", new Object[]{this, new Integer(i), cls});
        } else if (cls == null) {
        } else {
            this.f30433a.put(Integer.valueOf(i), cls);
        }
    }
}
