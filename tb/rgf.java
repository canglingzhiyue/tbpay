package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class rgf implements rge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ROOT_TAG = "update_";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, rge> f33143a;
    public static boolean logEnable;
    public static int logLevel;
    private String b;
    private rge c;

    static {
        kge.a(1262224571);
        kge.a(-893038308);
        logEnable = true;
        f33143a = new HashMap();
        logLevel = 6;
    }

    private rgf(String str, rge rgeVar) {
        this.c = rgeVar;
        this.b = str;
    }

    public static rge getLog(Class cls, rge rgeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rge) ipChange.ipc$dispatch("d85bd8ce", new Object[]{cls, rgeVar}) : getLog(cls.getSimpleName(), rgeVar);
    }

    public static rge getLog(String str, rge rgeVar) {
        rge rgeVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rge) ipChange.ipc$dispatch("fb339217", new Object[]{str, rgeVar});
        }
        synchronized (rgf.class) {
            rgeVar2 = f33143a.get(str);
            if (rgeVar2 == null) {
                rgeVar2 = new rgf(str, rgeVar);
                f33143a.put(str, rgeVar2);
            }
        }
        return rgeVar2;
    }

    @Override // tb.rge
    public int v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b7de7a", new Object[]{this, str})).intValue();
        }
        if (logLevel < 2 || !logEnable) {
            return 0;
        }
        rge rgeVar = this.c;
        if (rgeVar == null) {
            return Log.v(ROOT_TAG.concat(this.b), str);
        }
        return rgeVar.v(str);
    }

    @Override // tb.rge
    public int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e8", new Object[]{this, str})).intValue();
        }
        if (logLevel < 3 || !logEnable) {
            return 0;
        }
        rge rgeVar = this.c;
        if (rgeVar == null) {
            return Log.d(ROOT_TAG.concat(this.b), str);
        }
        return rgeVar.d(str);
    }

    @Override // tb.rge
    public int i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4533162d", new Object[]{this, str})).intValue();
        }
        if (logLevel < 4 || !logEnable) {
            return 0;
        }
        rge rgeVar = this.c;
        if (rgeVar == null) {
            return Log.i(ROOT_TAG.concat(this.b), str);
        }
        return rgeVar.i(str);
    }

    @Override // tb.rge
    public int w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53e977bb", new Object[]{this, str})).intValue();
        }
        if (logLevel < 5 || !logEnable) {
            return 0;
        }
        rge rgeVar = this.c;
        if (rgeVar == null) {
            return Log.i(ROOT_TAG.concat(this.b), str);
        }
        return rgeVar.w(str);
    }

    @Override // tb.rge
    public int w(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be68a920", new Object[]{this, str, th})).intValue();
        }
        if (logLevel < 5 || !logEnable) {
            return 0;
        }
        rge rgeVar = this.c;
        if (rgeVar == null) {
            return Log.w(ROOT_TAG.concat(this.b), str, th);
        }
        return rgeVar.w(str, th);
    }

    @Override // tb.rge
    public int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c6cb129", new Object[]{this, str})).intValue();
        }
        if (logLevel < 6 || !logEnable) {
            return 0;
        }
        rge rgeVar = this.c;
        if (rgeVar == null) {
            return Log.e(ROOT_TAG.concat(this.b), str);
        }
        return rgeVar.e(str);
    }

    @Override // tb.rge
    public int e(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c94072", new Object[]{this, str, th})).intValue();
        }
        if (logLevel < 6 || !logEnable) {
            return 0;
        }
        rge rgeVar = this.c;
        if (rgeVar == null) {
            return Log.e(ROOT_TAG.concat(this.b), str, th);
        }
        return rgeVar.e(str, th);
    }
}
