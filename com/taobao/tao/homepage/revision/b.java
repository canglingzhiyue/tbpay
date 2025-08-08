package com.taobao.tao.homepage.revision;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.TBEditionSwitcherElderHomePopBridge;
import com.taobao.android.editionswitcher.TBEditionSwitcherPopBridge;
import com.taobao.android.editionswitcher.core.d;
import com.taobao.android.editionswitcher.l;
import com.taobao.android.task.Coordinator;
import com.taobao.homepage.utils.n;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.revision.ChangeContainerProcess;
import com.taobao.themis.kernel.i;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import tb.alj;
import tb.ghi;
import tb.ghj;
import tb.ghk;
import tb.ghm;
import tb.gho;
import tb.kge;
import tb.ksp;
import tb.kxf;
import tb.laq;
import tb.las;
import tb.lau;
import tb.lbq;
import tb.oiy;
import tb.oqc;
import tb.oqk;
import tb.oql;

/* loaded from: classes8.dex */
public class b implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<lbq> f20612a;
    private final d b = new d() { // from class: com.taobao.tao.homepage.revision.b.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.editionswitcher.core.d
        public void a(ghj ghjVar, gho ghoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73c26791", new Object[]{this, ghjVar, ghoVar});
            } else if (!n.n().j() || ghoVar == null || StringUtils.isEmpty(ghoVar.f28333a)) {
            } else {
                String str = ghoVar.f28333a;
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != 47089513) {
                    if (hashCode != 606614847) {
                        if (hashCode == 1309857207 && str.equals(com.taobao.android.editionswitcher.core.b.TRIGGER_REQUEST)) {
                            c = 0;
                        }
                    } else if (str.equals(com.taobao.android.editionswitcher.core.b.LOCATION_CHANGED)) {
                        c = 2;
                    }
                } else if (str.equals(com.taobao.android.editionswitcher.core.b.EDITION_CODE_CHANGED)) {
                    c = 1;
                }
                if (c == 0) {
                    b.a(b.this, ghjVar);
                } else if (c == 1) {
                    b.b(b.this);
                } else if (c != 2) {
                } else {
                    kxf.a().c(50018);
                }
            }
        }
    };
    private final BroadcastReceiver c = new BroadcastReceiver() { // from class: com.taobao.tao.homepage.revision.HomeEditionSwitchService$4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            ksp.c("RevisionService", "收到广播:" + intent.getAction());
            if (!"taobao.action.ACTION_REVISION_SWITCH_CHANGE".equals(intent.getAction())) {
                return;
            }
            ChangeContainerProcess.a().a(ChangeContainerProcess.ChangeContainerType.revision);
            oql.a().j();
        }
    };

    static {
        kge.a(121085621);
        kge.a(-1204365384);
    }

    public static /* synthetic */ BroadcastReceiver a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("237ba0bf", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ WeakReference a(b bVar, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("7eb8e8a4", new Object[]{bVar, weakReference});
        }
        bVar.f20612a = weakReference;
        return weakReference;
    }

    public static /* synthetic */ void a(b bVar, ghj ghjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c75564ef", new Object[]{bVar, ghjVar});
        } else {
            bVar.a(ghjVar);
        }
    }

    public static /* synthetic */ void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8789c9", new Object[]{bVar});
        } else {
            bVar.c();
        }
    }

    @Override // com.taobao.tao.homepage.revision.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!n.n().j()) {
        } else {
            q.a("TBEditionSwitcherElderHomePopBridge", (Class<? extends e>) TBEditionSwitcherElderHomePopBridge.class, true);
            q.a("TBEditionSwitcherPopBridge", (Class<? extends e>) TBEditionSwitcherPopBridge.class, true);
            com.taobao.android.editionswitcher.core.a.a(this.b);
            oql.a().a(b());
        }
    }

    @Override // com.taobao.tao.homepage.revision.c
    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            com.taobao.android.editionswitcher.b.b(context, str);
        }
    }

    @Override // com.taobao.tao.homepage.revision.c
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            ((ghm) ghi.a(ghm.class)).onVersionResponse(ghk.a(jSONObject));
        }
    }

    private oqk b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oqk) ipChange.ipc$dispatch("16ba74d4", new Object[]{this}) : new oqk() { // from class: com.taobao.tao.homepage.revision.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -839475720) {
                    super.bP_();
                    return null;
                } else if (hashCode != 906902491) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.dO_();
                    return null;
                }
            }

            @Override // tb.oqk
            public void bP_() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cdf69df8", new Object[]{this});
                    return;
                }
                super.bP_();
                b.a(b.this, new WeakReference(oiy.a().b()));
                LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(b.a(b.this), new IntentFilter("taobao.action.ACTION_REVISION_SWITCH_CHANGE"));
            }

            @Override // tb.oqk
            public void dO_() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("360e3bdb", new Object[]{this});
                    return;
                }
                super.dO_();
                b.a(b.this, (WeakReference) null);
                LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(b.a(b.this));
            }
        };
    }

    private void a(ghj ghjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea42d28f", new Object[]{this, ghjVar});
        } else if (ghjVar == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("switchVersionRequest", (Object) ghjVar.b());
            if (ghjVar.c != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("switcherVersion", (Object) ghjVar.c.c);
                jSONObject.put("bizParam", (Object) jSONObject2);
            }
            laq.a().a("MTopRequest").b("RevisionServicedoEditionSwitch").a(i.CDN_REQUEST_TYPE, "editionSwitch").a("switchVersionRequest", jSONObject.toString()).b();
            oqc.a().f(jSONObject);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        WeakReference<lbq> weakReference = this.f20612a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        com.taobao.android.home.component.utils.i.b((String) null);
        alj.a().b("homepage", com.taobao.android.home.component.utils.i.a());
        ksp.a("RevisionService", "AreaChangeReceiver homepage " + com.taobao.android.home.component.utils.i.a());
        lbq lbqVar = this.f20612a.get();
        if (lbqVar == null || lbqVar.getCurActivity() == null) {
            return;
        }
        a(lbqVar.getCurActivity());
        las.g();
        lau.a().c();
        kxf.a().c(50017);
        kxf.a().c(50020);
        ChangeContainerProcess.a().a(ChangeContainerProcess.ChangeContainerType.edition);
        oql.a().g();
        com.taobao.android.editionswitcher.e.a(lbqVar.getCurActivity());
    }

    private void a(Context context) {
        SimpleDateFormat simpleDateFormat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        String str = l.b(context).hngCookie;
        if (StringUtils.isEmpty(str)) {
            return;
        }
        String replace = str.replace("|", "%7C");
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, 1);
        Date time = calendar.getTime();
        new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US).setTimeZone(TimeZone.getTimeZone("GMT"));
        String str2 = replace + ";" + ("expires=" + simpleDateFormat.format(time));
        try {
            CookieManager.getInstance().setCookie(".taobao.com", "hng=" + str2);
            CookieManager.getInstance().setCookie(".tmall.com", "hng=" + str2);
            d();
        } catch (Exception e) {
            com.taobao.android.home.component.utils.e.a("RevisionService", "writeCookie exception:", e);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.tao.homepage.revision.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (Build.VERSION.SDK_INT < 21) {
                            CookieSyncManager.getInstance().sync();
                        } else {
                            CookieManager.getInstance().flush();
                        }
                    } catch (Exception e) {
                        com.taobao.android.home.component.utils.e.a("RevisionService", "writeCookie exception:", e);
                    }
                }
            });
        }
    }
}
