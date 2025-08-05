package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.uploader.export.IUploaderLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class rpe implements IUploaderLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, Integer> c;

    /* renamed from: a  reason: collision with root package name */
    private volatile int f33297a = 31;
    private volatile boolean b = true;

    static {
        HashMap hashMap = new HashMap(6);
        c = hashMap;
        hashMap.put("V", 31);
        c.put(TLogTracker.LEVEL_DEBUG, 30);
        c.put(TLogTracker.LEVEL_INFO, 28);
        c.put("W", 24);
        c.put("E", 16);
        c.put("L", 0);
    }

    @Override // com.uploader.export.IUploaderLog
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.b) {
            return b(i);
        }
        return (i & this.f33297a) != 0;
    }

    @Override // com.uploader.export.IUploaderLog
    public int a(int i, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecdd4019", new Object[]{this, new Integer(i), str, str2, th})).intValue();
        }
        if (i == 1) {
            if (this.b) {
                AdapterForTLog.logv(str, str2);
                return 0;
            }
            return Log.v(str, str2);
        } else if (i == 2) {
            if (this.b) {
                AdapterForTLog.logd(str, str2);
                return 0;
            }
            return Log.d(str, str2);
        } else if (i == 4) {
            if (this.b) {
                AdapterForTLog.logi(str, str2);
                return 0;
            }
            return Log.i(str, str2);
        } else if (i == 8) {
            if (this.b) {
                AdapterForTLog.logw(str, str2, th);
                return 0;
            }
            return Log.w(str, str2, th);
        } else if (i != 16) {
            return 0;
        } else {
            if (!this.b) {
                return Log.e(str, str2, th);
            }
            if (th == null) {
                AdapterForTLog.loge(str, str2);
            } else {
                AdapterForTLog.loge(str, str2, th);
            }
            return 0;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    private boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int intValue = c.get(AdapterForTLog.getLogLevel()).intValue();
        if (intValue != this.f33297a) {
            this.f33297a = intValue;
        }
        return (i & this.f33297a) != 0;
    }
}
