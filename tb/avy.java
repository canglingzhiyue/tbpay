package tb;

import com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model.AsyncModule;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class avy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, a> f25645a = new ConcurrentHashMap<>();

    /* loaded from: classes2.dex */
    public static class a {
        public static final int STATUS_TRIGGERED = 1;
        public static final int STATUS_UNTRIGGER = 0;

        /* renamed from: a  reason: collision with root package name */
        public String f25646a;
        public AtomicInteger b = new AtomicInteger(0);
        public RenderComponent c;
        public AsyncModule d;

        static {
            kge.a(942722236);
        }
    }

    static {
        kge.a(-1824193224);
    }

    public abstract AsyncModule a(String str);

    public abstract void a(String str, String str2, RenderComponent renderComponent, AsyncModule asyncModule);

    public abstract void b(String str);
}
