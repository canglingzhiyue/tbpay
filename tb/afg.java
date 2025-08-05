package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.afd;

/* loaded from: classes5.dex */
public class afg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static afg b;

    /* renamed from: a  reason: collision with root package name */
    private afd.a f25308a;

    static {
        kge.a(1542506114);
    }

    private afg() {
    }

    public static afg a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (afg) ipChange.ipc$dispatch("f02487c", new Object[0]);
        }
        if (b == null) {
            synchronized (afg.class) {
                if (b == null) {
                    b = new afg();
                }
            }
        }
        return b;
    }

    public void a(afd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805ccb7c", new Object[]{this, aVar});
        } else {
            this.f25308a = aVar;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        afd.a aVar = this.f25308a;
        if (aVar == null) {
            return true;
        }
        return aVar.a("goBack", new JSONObject());
    }
}
