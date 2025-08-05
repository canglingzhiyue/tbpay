package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.monitor.SceneStage;
import com.taobao.taolive.sdk.monitor.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class hib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f28679a;
    private static int b;

    public static /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            c();
        }
    }

    static {
        kge.a(-2018106902);
        f28679a = -1;
        b = -1;
    }

    public static void a(boolean z, c cVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4cdeba1", new Object[]{new Boolean(z), cVar, new Boolean(z2)});
            return;
        }
        his.b("GoodPerformanceMonitor", "onShowStart | start.");
        f28679a = 0;
        HashMap hashMap = new HashMap();
        String str = "1";
        hashMap.put("isFirst", z ? str : "0");
        if (!z2) {
            str = "0";
        }
        hashMap.put("isUnderTak", str);
        hashMap.put("from", qna.d(cVar));
        if (cVar != null) {
            hashMap.put("session_id", cVar.b());
            hashMap.put("live_source", cVar.v());
            hashMap.put("entry_live_source", cVar.u());
            hashMap.put("room_status", cVar.t() == null ? "" : cVar.t().roomStatus);
            hashMap.put("is_login", String.valueOf(cgl.i().c()));
            hashMap.put("timestampSystemClock", String.valueOf(SystemClock.uptimeMillis()));
        }
        hashMap.put("deviceLevel", "" + com.taobao.taolive.room.service.c.M());
        hashMap.put("gl_opt", "" + a.i());
        b.b().a("tbl_good_open3_p", hashMap);
    }

    public static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("configInitTime", "" + j);
        b.b().a("tbl_good_open3_p", SceneStage.SCENE_STAGE_T0, hashMap);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b.b().a("tbl_good_open3_p", SceneStage.SCENE_STAGE_T1, (Map<String, String>) null);
        }
    }

    public static void a(c cVar, String str, long j, long j2, long j3, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9b3d7c", new Object[]{cVar, str, new Long(j), new Long(j2), new Long(j3), new Integer(i), new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("process", Long.toString(j3));
        hashMap.put("request", Long.toString(j2));
        String str2 = "1";
        hashMap.put("isCdn", z ? str2 : "0");
        hashMap.put("listC", String.valueOf(i));
        hashMap.put("categoryId", str);
        hashMap.put("dataParseTime", "" + j);
        if (!a.a(cVar)) {
            str2 = "0";
        }
        hashMap.put("glNewPage", str2);
        b = 4;
        f28679a = 0;
        if (i < 4) {
            b = i;
        }
        b.b().a("tbl_good_open3_p", SceneStage.SCENE_STAGE_T2, hashMap);
        if (b != 0) {
            return;
        }
        his.b("GoodPerformanceMonitor", "itemListRequest | report.");
        b.b().a("tbl_good_open3_p", SceneStage.SCENE_STAGE_T3);
        e();
    }

    public static void b() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        int i2 = f28679a;
        if (i2 < 0 || (i = b) < 0) {
            return;
        }
        int i3 = i2 + 1;
        f28679a = i3;
        if (i3 != i) {
            return;
        }
        b.b().a("tbl_good_open3_p", SceneStage.SCENE_STAGE_T3);
        e();
    }

    private static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.hib.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    his.b("GoodPerformanceMonitor", "endMonitor | end.");
                    b.b().a("tbl_good_open3_p");
                    hib.d();
                }
            }, 500L);
        }
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        f28679a = -1;
        b = -1;
    }
}
