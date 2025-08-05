package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IApmEventListener;
import com.taobao.application.common.d;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.context.c;
import com.taobao.metrickit.event.b;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* loaded from: classes.dex */
public class mld extends b implements IApmEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_TIME = "time";

    /* renamed from: a  reason: collision with root package name */
    private MetricContext f31085a;

    public static /* synthetic */ Object ipc$super(mld mldVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.metrickit.event.b
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : c.SWITCH_BG_FG_EVENT;
    }

    public mld(Handler handler) {
        super(handler);
    }

    @Override // com.taobao.metrickit.event.b
    public int[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a9d5fa1b", new Object[]{this}) : new int[]{1, 0, 2};
    }

    @Override // com.taobao.metrickit.event.b
    public void a(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee74df14", new Object[]{this, metricContext});
            return;
        }
        this.f31085a = metricContext;
        com.taobao.application.common.c.a(this);
        Looper d = com.taobao.application.common.c.d();
        if (d == null) {
            return;
        }
        new Handler(d).post(new Runnable() { // from class: tb.mld.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                d a2 = com.taobao.application.common.c.a();
                if (!a2.c("isInBackground") || a2.a("isInBackground", false)) {
                    return;
                }
                mld.this.onEvent(2);
                TLog.loge("MetricKit.BgFgEventSource", "lifecycle miss.");
            }
        });
    }

    @Override // com.taobao.metrickit.event.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.taobao.application.common.c.b(this);
        }
    }

    @Override // com.taobao.application.common.IApmEventListener
    public void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == 1) {
            a(1);
            MetricContext metricContext = this.f31085a;
            if (metricContext != null) {
                metricContext.updateCurrPage(null);
            }
        }
        if (i == 2) {
            a(0);
        }
        if (i != 50) {
            return;
        }
        a(2);
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("time", Long.valueOf(SystemClock.uptimeMillis()));
        a(i, hashMap);
    }
}
