package tb;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.task.c;
import com.taobao.android.launcher.biz.task.j;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.bootstrap.tao.h;
import com.taobao.android.tcrash.AnrUncaughtListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class xjp extends j implements AnrUncaughtListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private jzi f34340a;
    private int b;
    private int c;
    private final long d;
    private final long e;

    public static /* synthetic */ Object ipc$super(xjp xjpVar, String str, Object... objArr) {
        if (str.hashCode() == -222138312) {
            return new Boolean(super.intercept((c) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.launcher.biz.task.j
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public xjp(String str) {
        super(str);
        this.f34340a = null;
        this.b = 0;
        this.c = 0;
        shouldRunImmediately(true);
        this.d = SystemClock.uptimeMillis();
        this.e = System.currentTimeMillis();
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
        crashCaughtHeader.addHeaderInfo(getId() + "Uptime", String.valueOf(this.d));
        UncaughtCrashHeader crashCaughtHeader2 = TCrashSDK.instance().getCrashCaughtHeader();
        crashCaughtHeader2.addHeaderInfo(getId() + "UptimeStamp", String.valueOf(this.e));
        TCrashSDK.instance().addAnrUncaughtListener(this);
    }

    @Override // com.taobao.android.tcrash.AnrUncaughtListener
    public Map<String, Object> onAnrUncaught() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5dc54bb7", new Object[]{this});
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Looper.getMainLooper().dump(new tpk(getId()), "ANR-CURRENT(MainLooper): ");
        HashMap hashMap = new HashMap();
        hashMap.put(getId() + "TotalSensitiveCount", Integer.valueOf(this.b));
        hashMap.put(getId() + "TotalArrangeCount", Integer.valueOf(this.c));
        hashMap.put(getId() + "Duration", String.valueOf(uptimeMillis - this.d));
        return hashMap;
    }

    public static j a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("7a53871b", new Object[]{str}) : new xjp(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        if (this.f34340a == null) {
            this.f34340a = a(application);
            h.b(getId(), "option: " + this.f34340a);
            if (this.f34340a.f) {
                BootstrapMode.a(8192);
            }
            TCrashSDK.instance().getCrashCaughtHeader().addHeaderInfo(getId() + "Option", this.f34340a.toString());
        }
        jzh a2 = xjq.a(this.f34340a);
        if (a2 == null) {
            return;
        }
        this.c++;
        this.b += a2.b;
    }

    private jzi a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jzi) ipChange.ipc$dispatch("34c54c2d", new Object[]{this, context}) : new jzi(guc.a(context, "arrangerMsgDumpEnable"), guc.a(context, "arrangerMsgArrangeEnableV5"), guc.a(context, "arrangerMsgReplyOnlyEnableV2"), guc.a(context, "ngFinishReceiverV3"), guc.a(context, "ngQoScheduleEnabled"));
    }

    @Override // com.taobao.android.job.core.task.e
    public boolean intercept(c<String, Void> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue();
        }
        boolean intercept = super.intercept(cVar);
        return intercept ? Thread.currentThread() == Looper.getMainLooper().getThread() : intercept;
    }
}
