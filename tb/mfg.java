package tb;

import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class mfg implements pqu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31056a = "mfg";
    private static mfg b;
    private final Map<mff, mff> c = new ConcurrentHashMap();
    private pqy d = new pqy(this);

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f31057a;
        public Object b;

        public a(String str, Object obj) {
            this.f31057a = str;
            this.b = obj;
        }
    }

    public static synchronized mfg a() {
        synchronized (mfg.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mfg) ipChange.ipc$dispatch("f07bcf0", new Object[0]);
            }
            if (b == null) {
                b = new mfg();
            }
            return b;
        }
    }

    public static synchronized void b() {
        synchronized (mfg.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
                return;
            }
            if (b != null) {
                b.c();
            }
            b = null;
        }
    }

    private mfg() {
    }

    public void a(mff mffVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f461e5cb", new Object[]{this, mffVar});
        } else if (mffVar == null) {
        } else {
            this.c.put(mffVar, mffVar);
        }
    }

    public void b(mff mffVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2e4ec4c", new Object[]{this, mffVar});
        } else if (mffVar == null) {
        } else {
            this.c.remove(mffVar);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(str, null);
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

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            b(str, null);
        }
    }

    public void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{this, str, obj});
        } else if (pro.e(str)) {
        } else {
            c(str, obj);
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
            c(aVar.f31057a, aVar.b);
        }
    }

    private void c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f6a990", new Object[]{this, str, obj});
        } else if (!pro.e(str)) {
            for (mff mffVar : new ArrayList(this.c.values())) {
                if (mffVar != null) {
                    try {
                        mffVar.onLiveEvent(str, obj);
                    } catch (Exception e) {
                        String str2 = f31056a;
                        mfj.a(str2, "handler [" + str + "] exp. listener [" + mffVar + riy.ARRAY_END_STR, e);
                    }
                }
            }
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        pqy pqyVar = this.d;
        if (pqyVar != null) {
            pqyVar.removeCallbacksAndMessages(null);
        }
        this.c.clear();
    }
}
