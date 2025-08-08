package com.taobao.adaemon;

import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.state.TimeMeter;
import com.taobao.accs.connection.state.a;
import com.taobao.accs.utl.UtilityImpl;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import mtopsdk.common.util.SymbolExpUtil;
import tb.dcd;
import tb.jzv;
import tb.kav;
import tb.kge;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_NAME = "adaemon_strategy";

    /* renamed from: a */
    private int f8359a;
    private String b;
    private int c;
    private int d;
    private int e = 0;
    private int f = -1;
    private int g = 0;
    private String h;
    private boolean i;
    private String j;
    private final Context k;

    static {
        kge.a(1825267170);
    }

    public static /* synthetic */ void lambda$jMtZKN_oxN6DNw6r4gEBkXF1Bwg(h hVar, int i, Boolean bool) {
        hVar.a(i, bool);
    }

    /* renamed from: lambda$zS7EesR-7Y5ZUJPHHBLyfMCLCEY */
    public static /* synthetic */ void m818lambda$zS7EesR7Y5ZUJPHHBLyfMCLCEY(h hVar) {
        hVar.d();
    }

    public h(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.k = applicationContext == null ? jzv.a() : applicationContext;
    }

    public void a(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1206f8", new Object[]{this, new Long(j), new Boolean(z)});
        } else if (!TimeMeter.a("adaemon_start_proc", 5000L) && !z) {
            e.b("ProcStartStrategy", "tryStartProc freq", new Object[0]);
        } else {
            c.a($$Lambda$h$OuQARQ9K97J2A6S9Ws7rPTn1qPE.INSTANCE);
            c.a(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$h$zS7EesR-7Y5ZUJPHHBLyfMCLCEY
                {
                    h.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    h.m818lambda$zS7EesR7Y5ZUJPHHBLyfMCLCEY(h.this);
                }
            }, j, TimeUnit.MILLISECONDS);
        }
    }

    public static /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else if (o.a(o.KEY_DONT_STARTSERVICE) || !j.a().l()) {
        } else {
            ProcessController.getInstance().triggerSchedule(ITrigger.TYPE_SYS_SCHEDULE);
        }
    }

    public /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (a.a().a(this.k)) {
                e.b("ProcStartStrategy", "main process is alive, quit", new Object[0]);
            } else if (!a()) {
                e.b("ProcStartStrategy", "parseStrategy error", "strategy", this.j);
            } else {
                int i = Calendar.getInstance().get(11);
                if ((i < this.c || i > this.d) && i != this.f) {
                    e.b("ProcStartStrategy", "not match, cur hour", TplMsg.VALUE_T_NATIVE_RETURN, Integer.valueOf(this.c), "e", Integer.valueOf(this.d), "cur", Integer.valueOf(i));
                } else if (!l.c()) {
                    e.b("ProcStartStrategy", "not keep alive", new Object[0]);
                } else if (this.i && ((KeyguardManager) this.k.getSystemService("keyguard")).isKeyguardLocked()) {
                    e.b("ProcStartStrategy", "require user present", new Object[0]);
                } else {
                    if (!StringUtils.isEmpty(this.h)) {
                        String[] split = this.h.split("-");
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int appKeepAliveBucketId = UtilityImpl.getAppKeepAliveBucketId(this.k);
                        if (appKeepAliveBucketId < parseInt || appKeepAliveBucketId > parseInt2) {
                            e.b("ProcStartStrategy", "tryStartProc() bucket range", "start", Integer.valueOf(parseInt), "end", Integer.valueOf(parseInt2), "curBucketId", Integer.valueOf(appKeepAliveBucketId));
                            return;
                        }
                    }
                    final int a2 = l.a(this.k, "schedule", "today", "start_times", "minute");
                    if (a2 >= this.e) {
                        e.b("ProcStartStrategy", "start limit", "startTimes", Integer.valueOf(a2), "maxTimes", Integer.valueOf(this.e));
                    } else {
                        m.a().a(this.k, new kav() { // from class: com.taobao.adaemon.-$$Lambda$h$jMtZKN_oxN6DNw6r4gEBkXF1Bwg
                            @Override // tb.kav
                            public final void accept(Object obj) {
                                h.lambda$jMtZKN_oxN6DNw6r4gEBkXF1Bwg(h.this, a2, (Boolean) obj);
                            }
                        });
                    }
                }
            }
        } catch (Throwable th) {
            e.a("ProcStartStrategy", "tryStartProc err", th, new Object[0]);
        }
    }

    public /* synthetic */ void a(int i, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("367427d2", new Object[]{this, new Integer(i), bool});
            return;
        }
        e.b("ProcStartStrategy", "predict result", "flag", bool);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        c();
        e.b("ProcStartStrategy", "startTimes today " + (i + 1), new Object[0]);
        l.a(this.k, "today", "start_times", "minute");
    }

    private boolean a() throws NumberFormatException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        this.j = j.a().i();
        String[] split = StringUtils.isEmpty(this.j) ? null : this.j.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
        if (split == null || split.length < 9) {
            e.b("ProcStartStrategy", "parseStrategy error", "strategy", this.j);
            return false;
        }
        this.f8359a = Integer.parseInt(split[0]);
        this.b = split[1];
        this.c = Integer.parseInt(split[2]);
        this.d = Integer.parseInt(split[3]);
        if (j.a().C()) {
            this.e = Math.min(10, Integer.parseInt(split[4]));
        } else {
            this.e = Integer.parseInt(split[4]);
        }
        this.f = Integer.parseInt(split[5]);
        this.g = Integer.parseInt(split[6]);
        this.h = split[7];
        this.i = Boolean.parseBoolean(split[8]);
        e.a("ProcStartStrategy", "proc strategy:", "type", Integer.valueOf(this.f8359a), "clsName", this.b, "beginHour", Integer.valueOf(this.c), "endHour", Integer.valueOf(this.d), "maxTimes", Integer.valueOf(this.e), "allowHour", Integer.valueOf(this.f), "taskid", Integer.valueOf(this.g), "bucketId", this.h);
        return b();
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.f8359a == 0 || StringUtils.isEmpty(this.b) || this.c > this.d || this.e <= 0 || this.g < 0) {
            return false;
        }
        e.b("ProcStartStrategy", "checkValid true", new Object[0]);
        return true;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        e.b("ProcStartStrategy", "startTargetProcess", "clsName", this.b);
        Intent intent = new Intent();
        intent.setPackage(this.k.getPackageName());
        intent.setClassName(this.k.getPackageName(), this.b);
        if (TriggerService.class.getName().equals(this.b)) {
            intent.putExtra("type", 1);
        }
        if (j.a().r()) {
            intent.putExtra(TriggerService.FLAG_AUTO_START, false);
            intent.putExtra(TriggerService.FLAG_PROVIDER_START, true);
            jzv.a(intent, new ServiceConnection() { // from class: com.taobao.adaemon.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                    }
                }

                {
                    h.this = this;
                }
            }, 0);
            return;
        }
        dcd.a(this.k, intent);
    }
}
