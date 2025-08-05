package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.v;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class fmx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<fmw<?>> f28068a = Collections.synchronizedSet(new HashSet());

    static {
        kge.a(2083934470);
    }

    public <T> void a(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, t});
        } else {
            a(new fmw<>(str, t));
        }
    }

    public <T> void a(fmw<T> fmwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8da5848", new Object[]{this, fmwVar});
            return;
        }
        fmw<?> b = b(fmwVar.a());
        if (b != null) {
            b(b);
        }
        this.f28068a.add(fmwVar);
    }

    public void a(fmx fmxVar) {
        Object[] array;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8dacca7", new Object[]{this, fmxVar});
        } else if (Build.VERSION.SDK_INT > 23 || Build.VERSION.SDK_INT < 21) {
            this.f28068a.addAll(fmxVar.f28068a);
        } else {
            try {
                for (Object obj : fmxVar.f28068a.toArray()) {
                    if (obj instanceof fmw) {
                        this.f28068a.add((fmw) obj);
                    }
                }
            } catch (Exception e) {
                v.a("Facts", "add", e);
            }
        }
    }

    public <T> void b(fmw<T> fmwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d75d5ec9", new Object[]{this, fmwVar});
        } else {
            this.f28068a.remove(fmwVar);
        }
    }

    public <T> T a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        fmw<?> b = b(str);
        if (b == null) {
            return null;
        }
        return (T) b.b();
    }

    public fmw<?> b(String str) {
        Object[] array;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fmw) ipChange.ipc$dispatch("7d1bff23", new Object[]{this, str});
        }
        if (this.f28068a.size() == 0) {
            return null;
        }
        if (Build.VERSION.SDK_INT > 23 || Build.VERSION.SDK_INT < 21) {
            for (fmw<?> fmwVar : this.f28068a) {
                if (str != null && str.equals(fmwVar.a())) {
                    return fmwVar;
                }
            }
        } else {
            try {
                for (Object obj : this.f28068a.toArray()) {
                    if (obj instanceof fmw) {
                        fmw<?> fmwVar2 = (fmw) obj;
                        if (str != null && str.equals(fmwVar2.a())) {
                            return fmwVar2;
                        }
                    }
                }
            } catch (Exception e) {
                v.a("Facts", "getFact", e);
            }
        }
        return null;
    }

    public String toString() {
        Object[] array;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(riy.ARRAY_START_STR);
        if (Build.VERSION.SDK_INT > 23 || Build.VERSION.SDK_INT < 21) {
            Iterator<fmw<?>> it = this.f28068a.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                if (it.hasNext()) {
                    sb.append(",");
                }
            }
        } else {
            try {
                for (Object obj : this.f28068a.toArray()) {
                    if (obj instanceof fmw) {
                        sb.append(((fmw) obj).toString());
                        sb.append(",");
                    }
                }
            } catch (Exception e) {
                v.a("Facts", "toString", e);
            }
        }
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}
