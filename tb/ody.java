package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class ody {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ody f31965a;
    private HashMap<String, odz> b = new HashMap<>();

    static {
        kge.a(1728323235);
    }

    private ody() {
    }

    public static ody a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ody) ipChange.ipc$dispatch("f08a05a", new Object[0]);
        }
        if (f31965a == null) {
            synchronized (ody.class) {
                if (f31965a == null) {
                    f31965a = new ody();
                }
            }
        }
        return f31965a;
    }

    public void a(String str, odz odzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37a2f53d", new Object[]{this, str, odzVar});
            return;
        }
        HashMap<String, odz> hashMap = this.b;
        if (hashMap == null) {
            return;
        }
        hashMap.put(str, odzVar);
    }

    public odz a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (odz) ipChange.ipc$dispatch("7c73496f", new Object[]{this, str});
        }
        HashMap<String, odz> hashMap = this.b;
        if (hashMap != null && hashMap.size() > 0) {
            return this.b.get(str);
        }
        return null;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.b == null || TextUtils.isEmpty(str)) {
        } else {
            ogg.d("SharePlayer", "清空convertObject，key:" + str);
            this.b.remove(str);
        }
    }
}
