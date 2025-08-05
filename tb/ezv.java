package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public class ezv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f27703a;
    private eyx b;
    private final String c;
    private final ReentrantLock d = new ReentrantLock();
    private final Map<String, Object> e = new HashMap(2);
    private final Map<String, List<tac>> f = new ConcurrentHashMap();

    static {
        kge.a(-1923494923);
    }

    public ezv(Context context, eyx eyxVar, String... strArr) {
        this.f27703a = context;
        this.b = eyxVar;
        if (strArr != null && strArr.length > 0 && !TextUtils.isEmpty(strArr[0])) {
            this.c = strArr[0];
            return;
        }
        this.c = "containerToken" + UUID.randomUUID().hashCode();
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.c;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        i.a("StateCenter", "setState: key is " + str + ", value is " + obj);
        if (str != null) {
            this.d.lock();
            try {
                Object obj2 = this.e.get(str);
                this.e.put(str, obj);
                this.d.unlock();
                if (!Objects.equals(obj2, obj)) {
                    b(str, obj2);
                    return;
                } else {
                    i.a("StateCenter", "setState: oldValue and newValue is same");
                    return;
                }
            } catch (Throwable th) {
                this.d.unlock();
                throw th;
            }
        }
        i.a("StateCenter", "setState: key is null");
    }

    public <T> T a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        i.a("StateCenter", "getState: key is " + str);
        if (str == null) {
            return null;
        }
        this.d.lock();
        try {
            return (T) this.e.get(str);
        } finally {
            this.d.unlock();
        }
    }

    private void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{this, str, obj});
            return;
        }
        List<tac> list = this.f.get(str);
        if (list == null) {
            return;
        }
        i.a("StateCenter", "notifyStateChanged: listeners size: " + list.size());
        for (tac tacVar : list) {
            Object a2 = a(str);
            if (Objects.equals(obj, a2)) {
                i.a("StateCenter", "notifyStateChanged: has set same value internal");
            } else {
                tacVar.a(obj, a2);
                i.a("StateCenter", "notifyStateChanged: listener id: " + tacVar);
            }
        }
    }

    public void a(String str, tac tacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff6754c", new Object[]{this, str, tacVar});
            return;
        }
        i.a("StateCenter", "registerStateChangedListener: key is " + str + ", listener is " + tacVar);
        if (tacVar == null) {
            return;
        }
        List<tac> list = this.f.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f.put(str, list);
        }
        if (!list.contains(tacVar)) {
            list.add(tacVar);
            i.a("StateCenter", "registerStateChangedListener: new listener " + tacVar);
            return;
        }
        i.a("StateCenter", "registerStateChangedListener: found same listener, id is " + tacVar);
    }

    public void b(String str, tac tacVar) {
        List<tac> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54df3d8d", new Object[]{this, str, tacVar});
            return;
        }
        i.a("StateCenter", "unregisterStateChangedListener: key is " + str + " listener is " + tacVar);
        if (tacVar == null || str == null || (list = this.f.get(str)) == null || !list.remove(tacVar)) {
            return;
        }
        i.a("StateCenter", "unregisterStateChangedListener: found listener " + tacVar);
    }
}
