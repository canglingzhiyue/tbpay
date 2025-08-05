package tb;

import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class plg implements pqu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f32749a;
    private static plg b;
    private final Map<plf, plf> c = new ConcurrentHashMap();
    private pqy d = new pqy(this);

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f32750a;
        public Object b;

        static {
            kge.a(-2100226243);
        }

        public a(String str, Object obj) {
            this.f32750a = str;
            this.b = obj;
        }
    }

    static {
        kge.a(146406196);
        kge.a(-1317704444);
        f32749a = plg.class.getSimpleName();
        b = null;
    }

    public static synchronized plg a() {
        synchronized (plg.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (plg) ipChange.ipc$dispatch("f093093", new Object[0]);
            }
            if (b == null) {
                b = new plg();
            }
            return b;
        }
    }

    private plg() {
    }

    public void a(plf plfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d4fcae", new Object[]{this, plfVar});
        } else if (plfVar == null) {
        } else {
            this.c.put(plfVar, plfVar);
        }
    }

    public void b(plf plfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e858032f", new Object[]{this, plfVar});
        } else if (plfVar == null) {
        } else {
            this.c.remove(plfVar);
        }
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else if (pro.e(str) || this.d == null) {
        } else {
            this.d.obtainMessage(10101, new a(str, obj)).sendToTarget();
        }
    }

    @Override // tb.pqu
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (10101 != message.what || !(message.obj instanceof a)) {
        } else {
            a aVar = (a) message.obj;
            c(aVar.f32750a, aVar.b);
        }
    }

    private void c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f6a990", new Object[]{this, str, obj});
        } else if (!pro.e(str)) {
            for (plf plfVar : new ArrayList(this.c.values())) {
                if (plfVar != null) {
                    try {
                        plfVar.a(str, obj);
                    } catch (Exception e) {
                        String str2 = f32749a;
                        TLog.loge(str2, "handler [" + str + "] exp. listener [" + plfVar + riy.ARRAY_END_STR, e);
                    }
                }
            }
        }
    }
}
