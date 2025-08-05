package tb;

import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class arb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static arb f25523a;
    private static UTTracker b;

    static {
        kge.a(-1422552562);
        b = UTAnalytics.getInstance().getDefaultTracker();
    }

    public static arb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (arb) ipChange.ipc$dispatch("f0274ed", new Object[0]);
        }
        if (f25523a == null) {
            synchronized (arb.class) {
                if (f25523a == null) {
                    f25523a = new arb();
                }
            }
        }
        return f25523a;
    }

    public void a(abe abeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaeebf4", new Object[]{this, abeVar});
        } else if (abeVar == null || !abeVar.a()) {
            arc.a().b("TrackerReporter.reportPerformance:model invalid");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("type", abeVar.i);
            hashMap.put("message", abeVar.l);
            String str = abeVar.c;
            abeVar.getClass();
            abeVar.getClass();
            b.send(new UTOriginalCustomHitBuilder(str, 19999, "/jstracker.3", abeVar.g, abeVar.h, hashMap).build());
        }
    }

    public void a(abd abdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfae7795", new Object[]{this, abdVar});
        } else if (abdVar == null || !abdVar.a()) {
            arc.a().b("TrackerReporter.reportError:model invalid");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf(abdVar.j));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, abdVar.k);
            hashMap.put("type", abdVar.i);
            hashMap.put("message", abdVar.l);
            String str = "";
            hashMap.put("fileName", abdVar.p == null ? str : abdVar.p);
            hashMap.put(a.ATOM_stack, abdVar.q == null ? str : abdVar.q);
            hashMap.put(a.ATOM_lineNumber, abdVar.r == null ? str : abdVar.r);
            hashMap.put("columnNumber", abdVar.s == null ? str : abdVar.s);
            hashMap.put("collection_url", abdVar.n == null ? str : abdVar.n);
            if (abdVar.o != null) {
                str = abdVar.o;
            }
            hashMap.put(MspGlobalDefine.UA, str);
            String str2 = abdVar.c;
            abdVar.getClass();
            abdVar.getClass();
            b.send(new UTOriginalCustomHitBuilder(str2, 19999, "/jstracker.3", abdVar.g, abdVar.h, hashMap).build());
        }
    }

    public void a(ara araVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08e9288", new Object[]{this, araVar});
        } else if (araVar == null || !araVar.a()) {
            arc.a().b("TrackerReporter.reportCustom:model invalid");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf(araVar.j));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, araVar.k);
            hashMap.put("type", araVar.i);
            hashMap.put("code", araVar.p);
            hashMap.put("message", araVar.l);
            if (araVar.q != null) {
                hashMap.put("success", String.valueOf(araVar.q));
            }
            if (araVar.r != null) {
                hashMap.put("branch", String.valueOf(araVar.r));
            }
            String str = "";
            hashMap.put("total", araVar.s == null ? str : araVar.s);
            hashMap.put("timing", String.valueOf(araVar.m));
            hashMap.put("d1", araVar.t == null ? str : araVar.t);
            hashMap.put("d2", araVar.u == null ? str : araVar.u);
            hashMap.put("c1", araVar.v == null ? str : araVar.v);
            hashMap.put("c2", araVar.w == null ? str : araVar.w);
            hashMap.put("c3", araVar.x == null ? str : araVar.x);
            hashMap.put("c4", araVar.y == null ? str : araVar.y);
            hashMap.put("c5", araVar.z == null ? str : araVar.z);
            hashMap.put("collection_url", araVar.n == null ? str : araVar.n);
            if (araVar.o != null) {
                str = araVar.o;
            }
            hashMap.put(MspGlobalDefine.UA, str);
            String str2 = araVar.c;
            araVar.getClass();
            araVar.getClass();
            b.send(new UTOriginalCustomHitBuilder(str2, 19999, "/jstracker.3", araVar.g, araVar.h, hashMap).build());
        }
    }
}
