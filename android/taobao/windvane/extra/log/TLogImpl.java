package android.taobao.windvane.extra.log;

import android.taobao.windvane.util.log.ILog;
import android.util.AndroidRuntimeException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes.dex */
public class TLogImpl implements ILog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DELIMITER = "\n";
    private static final String LOG_MODULE_NAME = "WindVane";

    public boolean isLogLevelEnabled(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b353b3c9", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return true;
    }

    static {
        kge.a(1415588190);
        kge.a(-470426545);
        try {
            Class.forName("com.taobao.tao.log.TLog");
        } catch (Throwable unused) {
            new AndroidRuntimeException("TLogNotSupportWarning").printStackTrace();
        }
    }

    public void log(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508f0fac", new Object[]{this, new Integer(i), str, str2});
        } else if (i == 3) {
            d(str, str2);
        } else if (i == 4) {
            i(str, str2);
        } else if (i == 5) {
            w(str, str2);
        } else if (i == 6) {
            e(str, str2);
        } else {
            v(str, str2);
        }
    }

    @Override // android.taobao.windvane.util.log.ILog
    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
        } else {
            TLog.logd("WindVane", str, str2);
        }
    }

    @Override // android.taobao.windvane.util.log.ILog
    public void d(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ec3ad6", new Object[]{this, str, str2, th});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(DELIMITER);
        sb.append(th != null ? th.getMessage() : "throwable is null");
        TLog.logd("WindVane", str, sb.toString());
    }

    @Override // android.taobao.windvane.util.log.ILog
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
        } else {
            TLog.loge("WindVane", str, str2);
        }
    }

    @Override // android.taobao.windvane.util.log.ILog
    public void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{this, str, str2, th});
        } else {
            TLog.loge("WindVane", str, str2, th);
        }
    }

    @Override // android.taobao.windvane.util.log.ILog
    public void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{this, str, str2});
        } else {
            TLog.logi("WindVane", str, str2);
        }
    }

    @Override // android.taobao.windvane.util.log.ILog
    public void i(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("662468f1", new Object[]{this, str, str2, th});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(DELIMITER);
        sb.append(th != null ? th.getMessage() : "throwable is null");
        TLog.logi("WindVane", str, sb.toString());
    }

    @Override // android.taobao.windvane.util.log.ILog
    public void v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625b1491", new Object[]{this, str, str2});
        } else {
            TLog.logv("WindVane", str, str2);
        }
    }

    @Override // android.taobao.windvane.util.log.ILog
    public void v(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed501404", new Object[]{this, str, str2, th});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(DELIMITER);
        sb.append(th != null ? th.getMessage() : "throwable is null");
        TLog.logv("WindVane", str, sb.toString());
    }

    @Override // android.taobao.windvane.util.log.ILog
    public void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{this, str, str2});
        } else {
            TLog.logw("WindVane", str, str2);
        }
    }

    @Override // android.taobao.windvane.util.log.ILog
    public void w(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{this, str, str2, th});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(DELIMITER);
        sb.append(th != null ? th.getMessage() : "throwable is null");
        TLog.logw("WindVane", str, sb.toString());
    }
}
