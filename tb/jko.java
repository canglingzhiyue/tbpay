package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jko {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29608a;
    public JSONObject b;
    public boolean c;
    public int d = 0;
    public long e = 0;
    public long f = 0;
    public long g = 0;
    public long h = 0;

    static {
        kge.a(12674448);
    }

    public void a(jkm jkmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8d000c", new Object[]{this, jkmVar});
            return;
        }
        this.d = jkmVar.f29606a;
        this.e = jkmVar.b;
        this.f = jkmVar.c;
        this.g = jkmVar.d;
    }
}
