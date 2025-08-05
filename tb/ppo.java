package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.sdk.utils.u;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class ppo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32803a;
    private HashMap<Class, ppm> b = new HashMap<>();

    static {
        kge.a(1095117841);
    }

    public void a(Context context, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b9edb", new Object[]{this, context, str, aVar});
            return;
        }
        this.f32803a = str;
        if (!u.az()) {
            return;
        }
        pou pouVar = new pou(context, str, aVar);
        pouVar.f();
        this.b.put(pos.class, pouVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (Map.Entry<Class, ppm> entry : this.b.entrySet()) {
            ppm value = entry.getValue();
            if (value != null) {
                value.g();
            }
        }
        this.b.clear();
    }

    public <T extends ppm> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("271f2044", new Object[]{this, cls});
        }
        ppm ppmVar = this.b.get(cls);
        if (!cls.isInstance(ppmVar)) {
            return null;
        }
        return cls.cast(ppmVar);
    }
}
