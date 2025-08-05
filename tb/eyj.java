package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.eyp;

/* loaded from: classes4.dex */
public abstract class eyj<C extends eyp> implements eyl<C> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f27646a;
    private C b;
    private Map<String, C> c = new ConcurrentHashMap();

    static {
        kge.a(962612589);
        kge.a(173639076);
    }

    public eyj(Context context) {
        this.f27646a = context;
    }

    @Override // tb.eyl
    public boolean a(String str, C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27b5e0ea", new Object[]{this, str, c})).booleanValue();
        }
        if (str == null || c == null) {
            return false;
        }
        this.c.put(str, c);
        return true;
    }

    @Override // tb.eyl
    public C a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("7c6f0b58", new Object[]{this, str});
        }
        if (str != null) {
            return this.c.get(str);
        }
        return null;
    }

    @Override // tb.eyl
    public void a(C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cb6b1c", new Object[]{this, c});
        } else {
            this.b = c;
        }
    }

    @Override // tb.eyl
    public C a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C) ipChange.ipc$dispatch("f046262", new Object[]{this}) : this.b;
    }
}
