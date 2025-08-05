package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.analytics.AnalyticsMgr;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.linkmanager.afc.utils.d;
import com.taobao.linkmanager.afc.utils.h;
import com.ut.mini.internal.f;

/* loaded from: classes7.dex */
public class lyq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f30996a;
    private volatile boolean b;

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static lyq f30999a;

        static {
            kge.a(-1611877426);
            f30999a = new lyq();
        }

        public static /* synthetic */ lyq a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (lyq) ipChange.ipc$dispatch("f07911a", new Object[0]) : f30999a;
        }
    }

    static {
        kge.a(730358011);
    }

    public static /* synthetic */ boolean a(lyq lyqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3bdcbd8", new Object[]{lyqVar})).booleanValue() : lyqVar.f30996a;
    }

    public static /* synthetic */ boolean a(lyq lyqVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ddf28a2", new Object[]{lyqVar, str})).booleanValue() : lyqVar.c(str);
    }

    public static /* synthetic */ boolean a(lyq lyqVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83fc6184", new Object[]{lyqVar, new Boolean(z)})).booleanValue();
        }
        lyqVar.f30996a = z;
        return z;
    }

    public static /* synthetic */ boolean b(lyq lyqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e240d259", new Object[]{lyqVar})).booleanValue() : lyqVar.b;
    }

    public static /* synthetic */ boolean b(lyq lyqVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65da2b23", new Object[]{lyqVar, new Boolean(z)})).booleanValue();
        }
        lyqVar.b = z;
        return z;
    }

    public static lyq a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lyq) ipChange.ipc$dispatch("f07911a", new Object[0]) : a.a();
    }

    private lyq() {
        this.f30996a = false;
        this.b = false;
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            h.a(new Runnable() { // from class: tb.lyq.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!d.f() || !lyq.a(lyq.this, str) || lyq.a(lyq.this)) {
                    } else {
                        AnalyticsMgr.b();
                        c.b("linkx", "UtSyncManager === syncPrepose === " + str);
                        lyq.a(lyq.this, true);
                    }
                }
            });
        }
    }

    public void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            h.a(new Runnable() { // from class: tb.lyq.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!d.f() || !lyq.a(lyq.this, str) || lyq.b(lyq.this)) {
                    } else {
                        try {
                            f.getInstance().saveCacheDataToLocal();
                            Thread.sleep(500L);
                            f.getInstance().dispatchLocalHits();
                        } catch (Throwable unused) {
                        }
                        c.b("linkx", "UtSyncManager === syncPostpose === " + str);
                        lyq.b(lyq.this, true);
                    }
                }
            });
        }
    }

    private boolean c(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return false;
        }
        return "1".equals(parse.getQueryParameter("afc_link_ut"));
    }
}
