package tb;

import android.content.Context;
import android.widget.Toast;
import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.lpm_android.LpmImpl;
import com.taobao.taolive.lpm_android.event.LpmEventType;
import com.taobao.taolive.lpm_android.events.EventType;
import com.taobao.taolive.lpm_android.events.b;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class pbt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String h = "pbt";
    private static pbt i;

    /* renamed from: a  reason: collision with root package name */
    public pcw f32558a = new pcw();
    public pcm b = new pcm();
    public pcp c = new pcp();
    public pcl d = new pcl();
    public pcn e = new pcn();
    public pco f = new pco();
    public pdt g = new pdt();
    private pbv j = new pbv();
    private boolean o;
    private Context p;

    public static /* synthetic */ boolean a(pbt pbtVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30801ec2", new Object[]{pbtVar, new Boolean(z)})).booleanValue();
        }
        pbtVar.o = z;
        return z;
    }

    private pbt() {
    }

    public static pbt a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pbt) ipChange.ipc$dispatch("f090c9c", new Object[0]);
        }
        if (i == null) {
            i = new pbt();
        }
        return i;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        TLog.loge(MediaConstant.LBLIVE_SOURCE, h, "initialize");
        if (context != null) {
            this.p = context.getApplicationContext();
        }
        if (d()) {
            f();
        } else {
            c.a("com.taobao.taolive.lpm_android.LpmImpl", new c.a() { // from class: tb.pbt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassNotFound() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                    }
                }

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassLoaded(Class<?> cls) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                    } else {
                        pbt.a(pbt.this, true);
                    }
                }
            });
        }
    }

    public void a(pbq pbqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94d11b9", new Object[]{this, pbqVar});
            return;
        }
        TLog.loge(MediaConstant.LBLIVE_SOURCE, h, "updateAppInfo");
        this.j.a(pbqVar);
        b(pbqVar);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TLog.loge(MediaConstant.LBLIVE_SOURCE, h, "refreshConfig");
        g();
    }

    public void a(LpmEventType lpmEventType, String str, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d7add9", new Object[]{this, lpmEventType, str, jSONObject, str2, str3});
        } else {
            b(lpmEventType, str, jSONObject, str2, str3);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.o;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.o;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            if (!c()) {
                TLog.loge(MediaConstant.LBLIVE_SOURCE, h, "initializeWhenReady isRemoteInstalled false");
                return;
            }
            TLog.loge(MediaConstant.LBLIVE_SOURCE, h, "initializeWhenReady");
            if (b(this.p)) {
                Toast.makeText(this.p, "lpm 安装成功", 1).show();
            }
            LpmImpl.a().a(this.p);
            if (this.j.a() == null) {
                return;
            }
            pbx pbxVar = new pbx();
            pbxVar.a(this.j.a().a());
            pbxVar.b(this.j.a().b());
            LpmImpl.a().a(pbxVar);
        } catch (Exception e) {
            String str = h;
            TLog.loge(MediaConstant.LBLIVE_SOURCE, str, "LpmImpl exception = " + e.getMessage());
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            if (!c()) {
                TLog.loge(MediaConstant.LBLIVE_SOURCE, h, "refreshConfig isRemoteInstalled false");
                return;
            }
            TLog.loge(MediaConstant.LBLIVE_SOURCE, h, "refreshConfigWhenReady");
            LpmImpl.a().b();
        } catch (Exception e) {
            String str = h;
            TLog.loge(MediaConstant.LBLIVE_SOURCE, str, "LpmImpl exception = " + e.getMessage());
        }
    }

    private void b(pbq pbqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d0183a", new Object[]{this, pbqVar});
            return;
        }
        try {
            if (!c()) {
                TLog.loge(MediaConstant.LBLIVE_SOURCE, h, "updateAppInfoWhenReady isRemoteInstalled false");
                return;
            }
            TLog.loge(MediaConstant.LBLIVE_SOURCE, h, "updateAppInfoWhenReady");
            pbx pbxVar = new pbx();
            pbxVar.a(pbqVar.a());
            pbxVar.b(pbqVar.b());
            LpmImpl.a().a(pbxVar);
        } catch (Exception e) {
            String str = h;
            TLog.loge(MediaConstant.LBLIVE_SOURCE, str, "LpmImpl exception = " + e.getMessage());
        }
    }

    private void b(LpmEventType lpmEventType, String str, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79aa19a", new Object[]{this, lpmEventType, str, jSONObject, str2, str3});
            return;
        }
        try {
            if (!c() || lpmEventType == null) {
                return;
            }
            EventType eventType = null;
            switch (lpmEventType) {
                case USERACTION:
                    eventType = EventType.USERACTION;
                    break;
                case MESSAGE:
                    eventType = EventType.MESSAGE;
                    break;
                case MTOP:
                    eventType = EventType.MTOP;
                    break;
                case ORANGE:
                    eventType = EventType.ORANGE;
                    break;
                case AB:
                    eventType = EventType.AB;
                    break;
                case VPM:
                    eventType = EventType.VPM;
                    break;
                case SYSTEM:
                    eventType = EventType.SYSTEM;
                    break;
            }
            LpmImpl.a().a(new b(eventType, str, jSONObject, str2, str3));
        } catch (Exception e) {
            String str4 = h;
            TLog.loge(MediaConstant.LBLIVE_SOURCE, str4, "LpmImpl exception = " + e.getMessage());
        }
    }

    private boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
