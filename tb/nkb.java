package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.wireless.security.aopsdk.Invocation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.application.common.c;
import com.taobao.privacyguard.a;
import com.taobao.privacyguard.config.RuleConfig;
import com.taobao.privacyguard.config.b;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* loaded from: classes7.dex */
public class nkb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f31526a;
    public static volatile nkb d;
    public nka b;
    private long h = -1;
    public int c = -1;
    private final String e = UUID.randomUUID().toString().replaceAll("-", "");
    private volatile String f = this.e;
    private final long g = System.currentTimeMillis();

    public static /* synthetic */ long a(nkb nkbVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d51162a5", new Object[]{nkbVar, new Long(j)})).longValue();
        }
        nkbVar.h = j;
        return j;
    }

    public static /* synthetic */ String a(nkb nkbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("412808c3", new Object[]{nkbVar, str});
        }
        nkbVar.f = str;
        return str;
    }

    static {
        kge.a(1800069531);
        f31526a = new String[]{"com.taobao.runtimepermission.PermissionActivity"};
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.e;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.g;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
        }
        long j = this.h;
        return j == -1 ? this.g : j;
    }

    public static nkb e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nkb) ipChange.ipc$dispatch("2dced8f5", new Object[0]);
        }
        if (d == null) {
            synchronized (nkb.class) {
                d = new nkb();
            }
        }
        return d;
    }

    public void f() {
        List<String> asList;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (!a(a.a().c())) {
            i = -1;
        }
        this.c = i;
        c.a(new a.b() { // from class: tb.nkb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.application.common.IApmEventListener
            public void onEvent(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i2)});
                    return;
                }
                if (i2 == 2) {
                    nkb.a(nkb.this, System.currentTimeMillis());
                    nkb.a(nkb.this, UUID.randomUUID().toString().replaceAll("-", ""));
                    if (nkb.this.c == -1) {
                        nkb.this.c = 2;
                    } else if (nkb.this.c % 2 == 0) {
                        Log.e("BizContextManager", "onEvent: occur error! mStageCount is even when in app background!");
                    } else {
                        nkb.this.c++;
                    }
                }
                if (i2 != 1) {
                    return;
                }
                nkb.a(nkb.this, System.currentTimeMillis());
                nkb.a(nkb.this, UUID.randomUUID().toString().replaceAll("-", ""));
                if (nkb.this.c % 2 == 1) {
                    Log.e("BizContextManager", "onEvent: occur error! mStageCount is odd when in app forward!");
                    return;
                }
                nkb.this.c++;
            }
        });
        RuleConfig b = b.a().b();
        if (b != null && b.reportActivityBlackList != null) {
            asList = b.reportActivityBlackList;
        } else {
            asList = Arrays.asList(f31526a);
        }
        this.b = new nkc(asList);
    }

    public String a(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cece22cf", new Object[]{this, invocation});
        }
        RuleConfig b = b.a().b();
        if (b == null || !b.isReportParams()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(riy.ARRAY_START_STR);
        if (invocation.args != null) {
            Object[] objArr = invocation.args;
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                if (obj != null && obj.getClass().isArray()) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj != null ? obj.toString() : "null");
                }
                sb.append("^^");
            }
            if (invocation.args.length > 0 && sb.length() >= 2) {
                sb.delete(sb.length() - 2, sb.length());
            }
        }
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.c;
    }

    public static String b(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1f9d610", new Object[]{invocation});
        }
        RuleConfig b = b.a().b();
        if (b == null || !b.isReportStack()) {
            return "";
        }
        int i = 15;
        if (b.stackLevel > 0) {
            i = b.stackLevel;
        }
        long nanoTime = System.nanoTime();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String arrays = Arrays.toString(Arrays.copyOfRange(stackTrace, 2, Math.min(i + 2, stackTrace.length)));
        invocation.stackTimeCost = (System.nanoTime() - nanoTime) / 1000;
        String str = "getStackTrace: stack Info : [ " + arrays + riy.ARRAY_END_STR;
        return arrays;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        nka nkaVar = this.b;
        return nkaVar == null ? "UNKNOWN" : nkaVar.a();
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        nka nkaVar = this.b;
        return nkaVar == null ? "UNKNOWN" : nkaVar.b();
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        Application b = com.taobao.privacyguard.a.a().b();
        if (!TextUtils.isEmpty(str) && b != null) {
            try {
                List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) b.getSystemService("activity")).getRunningTasks(1);
                if (runningTasks != null && runningTasks.size() > 0) {
                    String packageName = runningTasks.get(0).topActivity.getPackageName();
                    if (!TextUtils.isEmpty(packageName)) {
                        if (packageName.equals(str)) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }
}
