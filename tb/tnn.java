package tb;

import android.content.Context;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.f;
import com.taobao.taolive.sdk.ui.media.g;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class tnn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final long f34230a;
    private final HashMap<String, Long> b = new HashMap<>();
    private final b<String, String> c = new b<>(2);
    private final LruCache<String, tno> d = new LruCache<>(100);
    private final LruCache<String, tnp> e = new LruCache<>(100);

    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final tnn f34231a;

        static {
            kge.a(2143039705);
            f34231a = new tnn();
        }

        public static /* synthetic */ tnn a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (tnn) ipChange.ipc$dispatch("f0b0a6a", new Object[0]) : f34231a;
        }
    }

    static {
        kge.a(1518486071);
        f34230a = TimeUnit.SECONDS.toMillis(90L);
    }

    /* loaded from: classes8.dex */
    public static final class b<K, V> extends LruCache<K, V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-290859102);
        }

        public b(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbb419b3", new Object[]{this, new Boolean(z), obj, obj2, obj3});
            } else if (!z || !(obj2 instanceof String)) {
            } else {
                g.a().a((String) obj2);
            }
        }
    }

    public static tnn a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tnn) ipChange.ipc$dispatch("f0b0a6a", new Object[0]) : a.a();
    }

    public boolean a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        tno tnoVar = this.d.get(str);
        if (tnoVar != null && (str2 = tnoVar.c) != null) {
            return g.a().d(str2);
        }
        return false;
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        tnp tnpVar = this.e.get(str);
        if (tnpVar == null || tnpVar.b == null) {
            return;
        }
        b(context, tnpVar.b);
    }

    public void b(Context context, String str) {
        tno tnoVar;
        f a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{this, context, str});
        } else if (a(str) || (tnoVar = this.d.get(str)) == null || (a2 = new tla().a(context, tnoVar.b)) == null) {
        } else {
            tnoVar.c = a2.L();
            this.c.put(str, a2.L());
        }
    }

    public boolean b(String str) {
        tnp tnpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        com.taobao.taolive.room.pre.a a2 = com.taobao.taolive.room.pre.a.a();
        if (!a2.b(com.taobao.taolive.room.pre.a.PRE_CREATE_ROOM_REC + str) || (tnpVar = this.e.get(str)) == null || tnpVar.d == 0) {
            return true;
        }
        if (System.currentTimeMillis() <= tnpVar.d) {
            return false;
        }
        this.e.remove(str);
        return true;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue() : this.d.get(str) == null || !this.b.containsKey(str) || System.currentTimeMillis() - this.b.get(str).longValue() > f34230a;
    }

    public tno d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tno) ipChange.ipc$dispatch("7e7bb65c", new Object[]{this, str});
        }
        String str2 = "查找预创建：" + str;
        return this.d.get(str);
    }

    public tnp e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tnp) ipChange.ipc$dispatch("7f28621a", new Object[]{this, str});
        }
        String str2 = "查找推荐：" + str;
        return this.e.remove(str);
    }

    public void a(String str, tno tnoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b31b4d", new Object[]{this, str, tnoVar});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("liveId : ");
        sb.append(str);
        sb.append("\t");
        if (tnoVar.c != null) {
            sb.append("播放器topic id: " + tnoVar.c);
        }
        sb.toString();
        this.b.put(str, Long.valueOf(System.currentTimeMillis()));
        this.d.put(str, tnoVar);
        if (tnoVar.c == null) {
            return;
        }
        this.c.put(str, tnoVar.c);
    }

    public void a(String str, tnp tnpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b38fac", new Object[]{this, str, tnpVar});
            return;
        }
        String str2 = "liveSource: " + str + "\t";
        tnpVar.d = System.currentTimeMillis() + f34230a;
        this.e.put(str, tnpVar);
    }
}
