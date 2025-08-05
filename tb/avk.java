package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class avk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String USERDATA_KEY_ACTIVITY_RESULT = "userdata.activity.result";

    /* renamed from: a  reason: collision with root package name */
    public Map<Integer, a> f25631a = new ConcurrentHashMap();

    /* loaded from: classes2.dex */
    public interface a {
        void a(int i, Intent intent);
    }

    static {
        kge.a(-802863398);
    }

    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        a aVar = this.f25631a.get(Integer.valueOf(i));
        if (aVar == null) {
            return;
        }
        aVar.a(i2, intent);
    }

    public void a(int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff26f58", new Object[]{this, new Integer(i), aVar});
        } else {
            this.f25631a.put(Integer.valueOf(i), aVar);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f25631a.remove(Integer.valueOf(i));
        }
    }
}
