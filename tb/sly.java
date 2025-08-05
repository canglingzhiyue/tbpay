package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.bridge.b;
import java.util.Map;
import tb.spy;

/* loaded from: classes5.dex */
public class sly extends spy.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final b f33713a;

    static {
        kge.a(-1220328911);
    }

    public static /* synthetic */ Object ipc$super(sly slyVar, String str, Object... objArr) {
        if (str.hashCode() == -162361891) {
            return new Boolean(super.a((spx) objArr[0], objArr[1]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public sly(b bVar) {
        this.f33713a = bVar;
    }

    @Override // tb.spy.a
    public boolean a(spx spxVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6528ddd", new Object[]{this, spxVar, obj})).booleanValue();
        }
        boolean a2 = super.a(spxVar, obj);
        if (a2 && this.f33713a != null) {
            if (obj instanceof Map) {
                obj = new JSONObject((Map) obj);
            }
            this.f33713a.a(obj);
        }
        return a2;
    }
}
