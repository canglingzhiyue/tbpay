package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.List;

/* loaded from: classes6.dex */
public class ike implements ihx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29113a = false;
    public static boolean b = false;
    private final ihx c;
    private final ijd d;
    private final iju e;

    public static /* synthetic */ ihx a(ike ikeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihx) ipChange.ipc$dispatch("c4422458", new Object[]{ikeVar}) : ikeVar.c;
    }

    public static /* synthetic */ ijd b(ike ikeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ijd) ipChange.ipc$dispatch("abe3ffcd", new Object[]{ikeVar}) : ikeVar.d;
    }

    public ike(ihx ihxVar, ijd ijdVar, iju ijuVar) {
        this.c = ihxVar;
        this.d = ijdVar;
        this.e = ijuVar;
    }

    @Override // tb.ihx
    public ihw a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihw) ipChange.ipc$dispatch("7c709ddc", new Object[]{this, str}) : this.c.a(str);
    }

    @Override // tb.ihx
    public iht a(List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iht) ipChange.ipc$dispatch("fa5cf678", new Object[]{this, list}) : this.c.a(list);
    }

    @Override // tb.ihx
    public ihw b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihw) ipChange.ipc$dispatch("7d1d497b", new Object[]{this, str}) : this.c.b(str);
    }

    @Override // tb.ihx
    public void a(final String str, final ihu ihuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9bf9ac", new Object[]{this, str, ihuVar});
        } else if (!ikk.a("SwallowsRemoteSoHighSwitch", "key_link_delay_fetch_o_enabled", true)) {
            RSoLog.c("link-delay-fetch, high switch set to false, disable link delay, " + str);
            this.c.a(str, ihuVar);
        } else if (ABGlobal.isFeatureOpened(LauncherRuntime.h, "rso_link_delay_fetch_disabled")) {
            RSoLog.c("link-delay-fetch, ABGlobal linkDelayDisabled = true, " + str);
            this.c.a(str, ihuVar);
        } else if (!f29113a) {
            RSoLog.c("link-delay-fetch, isLinkOpen = false, " + str);
            this.c.a(str, ihuVar);
        } else if (!this.d.a("key_link_delay_fetch_list", "kernelu4_7z_uc").contains(str)) {
            RSoLog.c("link-delay-fetch, whiteList not contains " + str);
            this.c.a(str, ihuVar);
        } else if (!b) {
            RSoLog.c("link-delay-fetch, isLinkBootFinish = false, intercept fetchAsync " + str);
            ihuVar.onFetchFinished(ihw.a(str, RSoException.error(6312)));
        } else {
            long a2 = a();
            RSoLog.c("link-delay-fetch, isLinkBootFinish = true, schedule fetchAsync " + str + ", interval=" + a2);
            ika.a(new Runnable() { // from class: tb.ike.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    RSoLog.c("link-delay-fetch, isLinkBootFinish = true, real do fetchAsync " + str);
                    ike.a(ike.this).a(str, ihuVar);
                }
            }, a2);
        }
    }

    private long a() {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue();
        }
        for (int i : new int[]{9, 7, 5, 3, 1}) {
            if (ABGlobal.isFeatureOpened(LauncherRuntime.h, "rso_link_delay_" + i)) {
                return i * 1000;
            }
        }
        return 3000L;
    }

    @Override // tb.ihx
    public void a(List<String> list, final ihs ihsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d39d715", new Object[]{this, list, ihsVar});
        } else {
            this.c.a(list, new ihs() { // from class: tb.ike.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ihs
                public void a(final iht ihtVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("edb10f83", new Object[]{this, ihtVar});
                        return;
                    }
                    final long a2 = ike.b(ike.this).a("key_delay_callback_interval", 0L);
                    if (a2 > 0) {
                        ika.a(new Runnable() { // from class: tb.ike.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                RSoLog.c("delegate-> call onFetchFinished after " + a2);
                                ihsVar.a(ihtVar);
                            }
                        }, a2);
                        return;
                    }
                    RSoLog.c("delegate-> call onFetchFinished immediately");
                    ihsVar.a(ihtVar);
                }
            });
        }
    }
}
