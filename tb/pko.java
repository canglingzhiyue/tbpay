package tb;

import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes8.dex */
public class pko {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile pko f32721a;
    private static final String b;
    private HashMap<String, pkn> c = new HashMap<>();
    private HashSet<String> d = new HashSet<>();

    private pko() {
    }

    public static pko a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pko) ipChange.ipc$dispatch("f092dca", new Object[0]);
        }
        if (f32721a == null) {
            synchronized (pko.class) {
                if (f32721a == null) {
                    f32721a = new pko();
                }
            }
        }
        return f32721a;
    }

    static {
        kge.a(-196161582);
        b = pko.class.getSimpleName();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c.put(str, new pkn());
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (str == null) {
            pnj m = pmd.a().m();
            String str2 = b;
            m.a(str2, "liveStart test liveContextKey null error liveContextKey = " + str);
        } else {
            pkn pknVar = this.c.get(str);
            if (pknVar == null) {
                pnj m2 = pmd.a().m();
                String str3 = b;
                m2.a(str3, "liveStart PlayReportParams null error liveContextKey = " + str);
            } else if (this.d.contains(str)) {
                pnj m3 = pmd.a().m();
                String str4 = b;
                m3.a(str4, "liveStart duplicate error liveContextKey = " + str);
            } else {
                this.d.add(str);
                b();
                Map<String, String> a2 = pknVar.a();
                a2.put("action", "start");
                a2.put("networkstatus", c());
                if (pmd.a().e() != null) {
                    pmd.a().e().a(aw.STAIN_TRACK_PAGE, 2101, "lpm_liveStability", null, null, a2);
                }
                pnj m4 = pmd.a().m();
                String str5 = b;
                m4.b(str5, "liveStart liveContextKey = " + str + " args = " + a2);
            }
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (str == null) {
            pnj m = pmd.a().m();
            String str2 = b;
            m.a(str2, "liveStartSucc liveContextKey null error liveContextKey = " + ((Object) null));
        } else {
            pkn pknVar = this.c.get(str);
            if (pknVar == null) {
                pnj m2 = pmd.a().m();
                String str3 = b;
                m2.a(str3, "liveStartSucc PlayReportParams null error liveContextKey = " + str);
            } else if (!this.d.contains(str)) {
                pnj m3 = pmd.a().m();
                String str4 = b;
                m3.a(str4, "liveStartSucc no start liveContextKey = " + str);
            } else {
                Map<String, String> a2 = pknVar.a();
                a2.put("action", "success");
                a2.put("networkstatus", c());
                if (pmd.a().e() != null) {
                    pmd.a().e().a(aw.STAIN_TRACK_PAGE, 2101, "lpm_liveStability", null, null, a2);
                }
                this.c.remove(str);
                this.d.remove(str);
                pnj m4 = pmd.a().m();
                String str5 = b;
                m4.b(str5, "liveStartSucc liveContextKey = " + str + " args = " + a2);
            }
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (str == null) {
            pnj m = pmd.a().m();
            String str3 = b;
            m.a(str3, "liveFailed null error liveContextKey = " + ((Object) null));
        } else {
            pkn pknVar = this.c.get(str);
            if (pknVar == null) {
                pnj m2 = pmd.a().m();
                String str4 = b;
                m2.a(str4, "liveFailed PlayReportParams null error liveContextKey = " + str);
            } else if (!this.d.contains(str)) {
                pnj m3 = pmd.a().m();
                String str5 = b;
                m3.a(str5, "liveFailed no start liveContextKey = " + str);
            } else {
                pknVar.c = str2;
                Map<String, String> a2 = pknVar.a();
                a2.put("action", "failed");
                a2.put("networkstatus", c());
                if (pmd.a().e() != null) {
                    pmd.a().e().a(aw.STAIN_TRACK_PAGE, 2101, "lpm_liveStability", null, null, a2);
                }
                this.c.remove(str);
                this.d.remove(str);
                pnj m4 = pmd.a().m();
                String str6 = b;
                m4.b(str6, "liveFailed liveContextKey = " + str + " args = " + a2);
            }
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (str == null) {
            pnj m = pmd.a().m();
            String str2 = b;
            m.a(str2, "liveEnd null error liveContextKey = " + ((Object) null));
        } else {
            pkn pknVar = this.c.get(str);
            if (pknVar == null) {
                pnj m2 = pmd.a().m();
                String str3 = b;
                m2.a(str3, "liveEnd PlayReportParams null error liveContextKey = " + str);
            } else if (!this.d.contains(str)) {
                pnj m3 = pmd.a().m();
                String str4 = b;
                m3.a(str4, "liveEnd no start liveContextKey = " + str);
            } else {
                Map<String, String> a2 = pknVar.a();
                a2.put("action", "exit");
                a2.put("networkstatus", c());
                if (pmd.a().e() != null) {
                    pmd.a().e().a(aw.STAIN_TRACK_PAGE, 2101, "lpm_liveStability", null, null, a2);
                }
                this.c.remove(str);
                this.d.remove(str);
                pnj m4 = pmd.a().m();
                String str5 = b;
                m4.b(str5, "liveEnd liveContextKey = " + str + " args = " + a2);
            }
        }
    }

    public pkn e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pkn) ipChange.ipc$dispatch("7f26851d", new Object[]{this, str}) : this.c.get(str);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("feed_type", "live");
        hashMap.put("live_status", "6");
        if (phg.a() == null) {
            return;
        }
        phg.a().a("live_status_expo", hashMap);
    }

    private String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : NetworkStatusHelper.isConnected() ? "1" : "0";
    }
}
