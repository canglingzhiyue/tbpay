package tb;

import android.app.Application;
import android.os.BatteryManager;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.utils.a;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* loaded from: classes.dex */
public class mkl extends mky<mkk> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Boolean f31066a;
    public boolean b = false;
    private final BatteryManager n;

    public static /* synthetic */ Object ipc$super(mkl mklVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1939721205) {
            super.b(((Number) objArr[0]).intValue(), (Map) objArr[1]);
            return null;
        } else if (hashCode != -1416965446) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return super.c();
        }
    }

    @Override // tb.mkh
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [tb.mkk, java.lang.Object] */
    @Override // tb.mky
    public /* synthetic */ mkk b(mkx mkxVar, int i, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("b9bd78b1", new Object[]{this, mkxVar, new Integer(i), map}) : a(mkxVar, i, map);
    }

    public mkl(Application application) {
        this.n = (BatteryManager) application.getSystemService("batterymanager");
    }

    @Override // tb.mky, tb.mkh
    public int[] c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("ab8ad2ba", new Object[]{this}) : a.a(super.c(), new int[]{90, 91});
    }

    @Override // tb.mky, tb.mkh
    public void b(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c62340b", new Object[]{this, new Integer(i), map});
            return;
        }
        super.b(i, map);
        if (i == 90) {
            this.f31066a = true;
        } else if (i != 91) {
        } else {
            if (this.f31066a == null) {
                this.f31066a = false;
            } else {
                this.b = true;
            }
        }
    }

    public mkk a(mkx mkxVar, int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkk) ipChange.ipc$dispatch("f237ad79", new Object[]{this, mkxVar, new Integer(i), map});
        }
        mkk mkkVar = null;
        BatteryManager batteryManager = this.n;
        if (batteryManager != null) {
            try {
                mkkVar = new mkk(i, map, mkxVar, batteryManager.getLongProperty(1), this.f31066a.booleanValue(), SystemClock.uptimeMillis());
            } catch (Throwable th) {
                TLog.loge("MetricKit.BatteryCollector", th.getMessage(), th);
            }
            if (this.b) {
                this.b = false;
                this.f31066a = false;
            }
        }
        return mkkVar != null ? mkkVar : new mkk(i, map, mkxVar, 0L, true, SystemClock.uptimeMillis());
    }
}
