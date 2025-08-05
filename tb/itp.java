package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class itp<PARAMS, BEAN_BASE> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f29310a = 0;
    private final Map<Class, ise<PARAMS, ? extends iuk>> b = new HashMap();
    private final imn c;

    static {
        kge.a(537408355);
    }

    public itp(imn imnVar) {
        this.c = imnVar;
    }

    public void a(Class<? extends BEAN_BASE> cls, ise<PARAMS, ? extends iuk> iseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8eb5eea", new Object[]{this, cls, iseVar});
            return;
        }
        if (this.b.containsKey(cls)) {
            k b = this.c.b();
            b.b("ModFactory", "creator is already registered: " + cls);
        }
        this.b.put(cls, iseVar);
    }

    public iuk a(Class<? extends BEAN_BASE> cls, PARAMS params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuk) ipChange.ipc$dispatch("d7735816", new Object[]{this, cls, params});
        }
        ise<PARAMS, ? extends iuk> iseVar = this.b.get(cls);
        if (iseVar == null) {
            k b = this.c.b();
            b.b("ModFactory", "no creator registered: " + cls);
            return null;
        }
        return iseVar.a(params);
    }
}
