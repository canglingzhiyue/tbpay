package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexModule;

/* loaded from: classes6.dex */
public class qnj<T extends WeexModule> implements juv<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f32954a;
    private final JSONArray b = new JSONArray();

    static {
        kge.a(998119377);
        kge.a(1648055765);
    }

    @Override // tb.jut
    public jus<T> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jus) ipChange.ipc$dispatch("7c71428c", new Object[]{this, str});
        }
        return null;
    }

    public qnj(Class<T> cls, String[] strArr) {
        this.f32954a = cls;
        for (String str : strArr) {
            this.b.add(str);
        }
    }

    @Override // tb.juv
    public T a(String str, WeexInstance weexInstance) throws Exception {
        return this.f32954a.getConstructor(new Class[0]).newInstance(new Object[0]);
    }

    @Override // tb.jut
    public JSONArray a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("dc1f20d6", new Object[]{this}) : this.b;
    }
}
