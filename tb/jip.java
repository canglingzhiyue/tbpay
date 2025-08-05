package tb;

import android.app.Application;
import android.os.MessageQueue;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public class jip {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final Set<Class<?>> f29573a = new HashSet();
    private static final Set<Class<?>> b = new HashSet();
    private static final Set<Class<?>> c = new HashSet();
    private static jip e;
    private final MessageQueue.IdleHandler d = new MessageQueue.IdleHandler() { // from class: tb.-$$Lambda$jip$WFlI3WTCLYwKZexMItxzfpLCLjw
        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            return jip.lambda$WFlI3WTCLYwKZexMItxzfpLCLjw(jip.this);
        }
    };

    public static /* synthetic */ boolean lambda$WFlI3WTCLYwKZexMItxzfpLCLjw(jip jipVar) {
        return jipVar.b();
    }

    public /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        a(Globals.getApplication(), b, true);
        return false;
    }

    private jip() {
    }

    public static jip a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jip) ipChange.ipc$dispatch("f066c2d", new Object[0]);
        }
        synchronized (jip.class) {
            if (e == null) {
                e = new jip();
            }
        }
        return e;
    }

    public void a(Application application) {
        ArrayList<jiq> arrayList = new ArrayList();
        arrayList.addAll(c(application));
        arrayList.addAll(jis.a());
        List<jiq> b2 = jis.b();
        if (!arrayList.isEmpty()) {
            for (jiq jiqVar : arrayList) {
                try {
                    Class<?> cls = Class.forName(jiqVar.f29574a);
                    if (cls.newInstance() instanceof jio) {
                        if (jiq.TYPE_NOW.equals(jiqVar.b)) {
                            f29573a.add(cls);
                        } else if (jiq.TYPE_EDITION_CHANGE.equals(jiqVar.b)) {
                            c.add(cls);
                        } else {
                            b.add(cls);
                        }
                    } else {
                        String simpleName = jip.class.getSimpleName();
                        TLog.logd(simpleName, "runBeforeRender", cls.getSimpleName() + " not implementation interface ITmgTask!");
                    }
                } catch (Exception e2) {
                    TLog.logd(jip.class.getSimpleName(), "runBeforeRender", e2.toString());
                }
            }
            for (jiq jiqVar2 : b2) {
                try {
                    Class<?> cls2 = Class.forName(jiqVar2.f29574a);
                    if (jiq.TYPE_NOW.equals(jiqVar2.b)) {
                        f29573a.remove(cls2);
                    } else if (jiq.TYPE_EDITION_CHANGE.equals(jiqVar2.b)) {
                        c.remove(cls2);
                    } else {
                        b.remove(cls2);
                    }
                } catch (Exception e3) {
                    TLog.logd(jip.class.getSimpleName(), "runBeforeRender", e3.toString());
                }
            }
        }
        a(application, f29573a, true);
    }

    private List<jiq> c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("37642af2", new Object[]{this, application});
        }
        try {
            List<jiq> parseArray = JSON.parseArray(jit.a(application, "tmg/launcher.json"), jiq.class);
            return parseArray != null ? parseArray : Collections.emptyList();
        } catch (Exception e2) {
            TLog.logd(jip.class.getSimpleName(), "getDefaultTasks", e2.toString());
            return Collections.emptyList();
        }
    }

    public void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{this, application});
        } else {
            a(application, c, false);
        }
    }

    private void a(Application application, Set<Class<?>> set, boolean z) {
        if (set == null) {
            return;
        }
        for (Class<?> cls : set) {
            try {
                if (!(cls.newInstance() instanceof jio)) {
                    String simpleName = jip.class.getSimpleName();
                    TLog.logd(simpleName, "runTasks", "task name : " + cls.getSimpleName() + " not implementation interface ITmgTask!");
                }
            } catch (Exception e2) {
                TLog.logd(jip.class.getSimpleName(), "runBeforeRender", e2.toString());
            }
        }
        if (!z) {
            return;
        }
        set.clear();
    }
}
