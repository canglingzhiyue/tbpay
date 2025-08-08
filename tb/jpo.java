package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import com.taobao.android.ultron.performence.model.f;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class jpo extends jpm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UltronPerformance";

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<WeakReference<Context>, jpo> f29676a;
    private String c;
    private String d;
    private final jpn b = new jpp();
    private int f = 0;

    public static /* synthetic */ Object ipc$super(jpo jpoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(743572049);
        f29676a = new ConcurrentHashMap<>();
    }

    private jpo() {
    }

    @Deprecated
    public void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{this, context, str, str2});
        } else if (c()) {
        } else {
            a(context, new rid(str, str2));
        }
    }

    public void a(Context context, rid ridVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f28fea3", new Object[]{this, context, ridVar});
        } else if (c()) {
        } else {
            try {
                b(context).b.a(context, ridVar);
                this.c = ridVar.b();
                this.d = ridVar.c();
            } catch (Exception e) {
                jqg.a(TAG, "init exception:" + e.getMessage());
            }
        }
    }

    public static jpo b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpo) ipChange.ipc$dispatch("486cfade", new Object[]{context});
        }
        jpo d = d(context);
        if (d != null) {
            return d;
        }
        jpo jpoVar = new jpo();
        f29676a.put(new WeakReference<>(context), jpoVar);
        return jpoVar;
    }

    @Override // tb.jpm
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        try {
            return this.b.a();
        } catch (Exception unused) {
            return false;
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            a(str, System.currentTimeMillis(), str2);
        }
    }

    public void a(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa210a1c", new Object[]{this, str, new Long(j), str2});
        } else {
            a(str, j, str2, false);
        }
    }

    @Override // tb.jpm
    public void a(String str, long j, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a00ec38", new Object[]{this, str, new Long(j), str2, new Boolean(z)});
        } else if (e()) {
        } else {
            try {
                this.b.a(str, j, str2, z);
            } catch (Exception e) {
                jqg.a(TAG, "stageStart exception:" + e.getMessage());
            }
        }
    }

    public void a(String str, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("881e4e63", new Object[]{this, str, new Boolean(z), map});
        } else {
            a(str, System.currentTimeMillis(), z, map);
        }
    }

    @Override // tb.jpm
    public void a(String str, long j, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407e7303", new Object[]{this, str, new Long(j), new Boolean(z), map});
        } else if (e()) {
        } else {
            try {
                this.b.a(str, j, z, map);
            } catch (Exception e) {
                jqg.a(TAG, "stageEnd exception:" + e.getMessage());
            }
        }
    }

    @Override // tb.jpm
    public void a(UltronPerformanceStageModel ultronPerformanceStageModel, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4da46027", new Object[]{this, ultronPerformanceStageModel, str, new Boolean(z)});
        } else if (e()) {
        } else {
            try {
                this.b.a(ultronPerformanceStageModel, str, z);
            } catch (Exception e) {
                jqg.a(TAG, "customStage model exception:" + e.getMessage());
            }
        }
    }

    @Override // tb.jpm
    public boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23c7e201", new Object[]{this, str})).booleanValue();
        }
        if (c()) {
            return this.b.l(str);
        }
        return false;
    }

    @Override // tb.jpm
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (e()) {
            b();
        } else {
            b();
            try {
                this.b.a(str);
            } catch (Exception e) {
                jqg.a(TAG, "start exception:" + e.getMessage());
            }
        }
    }

    @Override // tb.jpm
    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else if (e()) {
            b();
        } else {
            b();
            try {
                this.b.a(str, j);
            } catch (Exception e) {
                jqg.a(TAG, "start exception:" + e.getMessage());
            }
        }
    }

    public void b(String str, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511f45a4", new Object[]{this, str, new Boolean(z), map});
        } else {
            a(str, z, false, map);
        }
    }

    @Override // tb.jpm
    public void a(String str, boolean z, boolean z2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b248f13", new Object[]{this, str, new Boolean(z), new Boolean(z2), map});
        } else if (e()) {
        } else {
            try {
                this.b.a(str, z, z2, map);
            } catch (Exception e) {
                jqg.a(TAG, "finish exception:" + e.getMessage());
            }
        }
    }

    @Override // tb.jpm
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (e()) {
        } else {
            try {
                this.b.a(map);
            } catch (Exception e) {
                jqg.a(TAG, "commonArgs exception:" + e.getMessage());
            }
        }
    }

    @Override // tb.jpm
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (e()) {
        } else {
            try {
                this.b.b(str, str2);
            } catch (Exception e) {
                jqg.a(TAG, "commonArgs exception:" + e.getMessage());
            }
        }
    }

    @Override // tb.jpm
    @Deprecated
    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce5d664", new Object[]{this, fVar});
        } else if (e()) {
        } else {
            try {
                this.b.a(fVar);
            } catch (Exception e) {
                jqg.a(TAG, "jsTracker exception:" + e.getMessage());
            }
        }
    }

    @Deprecated
    public void a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8114572f", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        a(Repeat.D + (i + 1), str, str2);
    }

    @Override // tb.jpm
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            this.b.a(str, str2, str3);
        } catch (Exception e) {
            jqg.a(TAG, "addDimension exception:" + e.getMessage());
        }
    }

    @Override // tb.jpm
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            this.b.b(str, str2, str3);
        } catch (Exception e) {
            jqg.a(TAG, "addDimension exception:" + e.getMessage());
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f--;
        if (this.f >= 0) {
            return;
        }
        this.f = 0;
    }

    @Override // tb.jpm
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            this.b.d();
        } catch (Exception e) {
            jqg.a(TAG, "resetAllFlowData exception:" + e.getMessage());
        }
    }

    @Override // tb.jpm
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (context == null) {
        } else {
            try {
                this.b.a(context);
                c(context);
            } catch (Exception e) {
                jqg.a(TAG, "onDestroy exception:" + e.getMessage());
            }
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.c) && !StringUtils.isEmpty(this.d);
    }

    private boolean dn_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6af47720", new Object[]{this})).booleanValue();
        }
        String str = this.c;
        return str != null && ("iCart".equals(str) || jqi.a(this.c, "enableUltronPerformance", false));
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : !c() || !dn_() || this.f > 0;
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        for (WeakReference<Context> weakReference : f29676a.keySet()) {
            if (weakReference != null) {
                Context context2 = weakReference.get();
                if (context2 == null || context == context2) {
                    f29676a.remove(weakReference);
                } else if ((context2 instanceof Activity) && ((Activity) context2).isFinishing()) {
                    f29676a.remove(weakReference);
                }
            }
        }
    }

    private static jpo d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpo) ipChange.ipc$dispatch("6fbca1e0", new Object[]{context});
        }
        try {
            for (WeakReference<Context> weakReference : f29676a.keySet()) {
                if (weakReference != null && context == weakReference.get()) {
                    return f29676a.get(weakReference);
                }
            }
            return null;
        } catch (Exception e) {
            jqg.a("UltronPerformance#exception", e.getMessage());
            return null;
        }
    }
}
