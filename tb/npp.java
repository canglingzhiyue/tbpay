package tb;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class npp<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f31630a = false;

    static {
        kge.a(-716349543);
    }

    public abstract T b();

    public abstract T b(JSONObject jSONObject, nul nulVar);

    public T a(byte[] bArr, nul nulVar) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("54b74d78", new Object[]{this, bArr, nulVar});
        }
        if (this.f31630a) {
            b = nnn.a(bArr, nulVar);
        } else {
            b = nnn.b(bArr, nulVar);
        }
        if (b == null) {
            return b();
        }
        return b(b, nulVar);
    }
}
