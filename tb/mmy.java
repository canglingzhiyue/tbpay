package tb;

import com.alibaba.motu.tbrest.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.common.c;
import java.util.List;

/* loaded from: classes.dex */
public class mmy implements mpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Integer f31123a = 61004;
    private final String b = "AliHAMonitor";
    private final String c = null;
    private boolean d = true;
    private mmv e = new mmx();

    public static /* synthetic */ boolean a(mmy mmyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f4cd2d63", new Object[]{mmyVar})).booleanValue() : mmyVar.d;
    }

    public static /* synthetic */ boolean a(mmy mmyVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6e255ef7", new Object[]{mmyVar, str, str2})).booleanValue() : mmyVar.a(str, str2);
    }

    public static /* synthetic */ boolean a(mmy mmyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4d93159", new Object[]{mmyVar, new Boolean(z)})).booleanValue();
        }
        mmyVar.d = z;
        return z;
    }

    public static /* synthetic */ void b(mmy mmyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e35033e0", new Object[]{mmyVar});
        } else {
            mmyVar.a();
        }
    }

    public static /* synthetic */ void b(mmy mmyVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6daef8f4", new Object[]{mmyVar, str, str2});
        } else {
            mmyVar.b(str, str2);
        }
    }

    @Override // tb.mpl
    public void a(final String str, final String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        mpi.c("TBRestSender", str, str2);
        if (!mms.d || z) {
            return;
        }
        c.a(new Runnable() { // from class: tb.mmy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int i = 0;
                boolean z2 = false;
                while (true) {
                    int i2 = i + 1;
                    if (i >= 2) {
                        break;
                    }
                    try {
                        z2 = mmy.a(mmy.this, str, str2);
                        if (z2) {
                            break;
                        }
                        i = i2;
                    } catch (Throwable th) {
                        mpk.a(th);
                        return;
                    }
                }
                if (!z2) {
                    mmy.b(mmy.this, str, str2);
                    mmy.a(mmy.this, true);
                }
                if (!z2 || !mmy.a(mmy.this)) {
                    return;
                }
                mmy.b(mmy.this);
                mmy.a(mmy.this, false);
            }
        });
    }

    private boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : d.a().a(this.c, System.currentTimeMillis(), null, this.f31123a.intValue(), "AliHAMonitor", str2, str, null).booleanValue();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<String> a2 = this.e.a();
        if (a2 != null) {
            for (String str : a2) {
                if (str != null) {
                    String[] split = str.split("HA_APM_______HA_APM");
                    if (split.length >= 2) {
                        a(split[0], split[1]);
                    }
                }
            }
        }
        this.e.b();
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        mmv mmvVar = this.e;
        mmvVar.a(str + "HA_APM_______HA_APM" + str2);
    }
}
