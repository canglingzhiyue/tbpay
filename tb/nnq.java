package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.ability.localization.b;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.task.Coordinator;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.runtimepermission.d;
import com.taobao.runtimepermission.f;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.w;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;

/* loaded from: classes7.dex */
public class nnq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCATION_PERMISSION_BIZ_NAME = "TB_SHOPPING_PROCESS";

    /* renamed from: a  reason: collision with root package name */
    private static volatile TBLocationDTO f31594a;
    private static long b;
    private static String[] c;

    /* loaded from: classes7.dex */
    public interface a {
        void a(TBLocationDTO tBLocationDTO);
    }

    public static /* synthetic */ TBLocationDTO a(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("f9c29fee", new Object[]{tBLocationDTO});
        }
        f31594a = tBLocationDTO;
        return tBLocationDTO;
    }

    public static /* synthetic */ void b(a aVar, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e47b0777", new Object[]{aVar, context, new Boolean(z)});
        } else {
            c(aVar, context, z);
        }
    }

    static {
        kge.a(1903566158);
        c = new String[]{"android.permission.ACCESS_COARSE_LOCATION", com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION};
    }

    public static TBLocationDTO a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("17ffc33e", new Object[0]);
        }
        if (!b(Globals.getApplication())) {
            return null;
        }
        Coordinator.execute(new Runnable() { // from class: tb.nnq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    nnq.a(TBLocationClient.b());
                }
            }
        });
        return f31594a;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        int a2 = r.a(30) * 60 * 1000;
        k.e("SearchLocationService", "initiativeLocationIfOvertime: current interval is " + a2);
        if (System.currentTimeMillis() - b < a2) {
            return;
        }
        a(null, context, false);
    }

    public static void a(final a aVar, final Context context, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57dadc76", new Object[]{aVar, context, new Boolean(z)});
        } else if (context == null) {
            Log.e("SearchLocationService", "context is null");
        } else if (b(context)) {
            c(aVar, context, z);
        } else if (!z) {
            if (aVar == null) {
                return;
            }
            aVar.a(null);
        } else if (r.bY()) {
            f.a(context, c).a(true).a(new nml() { // from class: tb.nnq.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.nml
                public void a(d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c1d4ff8e", new Object[]{this, dVar});
                        return;
                    }
                    int i = dVar.b[0];
                    String str = dVar.c[0];
                    if (i == 0) {
                        AppMonitor.Alarm.commitSuccess("tbsearch", "requireLocationPermission");
                        Coordinator.execute(new i() { // from class: tb.nnq.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.searchbaseframe.util.i
                            public void a() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                } else {
                                    nnq.b(a.this, context, z);
                                }
                            }
                        });
                    } else if (i != -1) {
                        AppMonitor.Alarm.commitFail("tbsearch", "requireLocationPermission", String.valueOf(i), str);
                        Toast.makeText(Globals.getApplication(), b.a(R.string.taobao_app_1005_1_16657), 0).show();
                    } else {
                        AppMonitor.Alarm.commitFail("tbsearch", "requireLocationPermission", String.valueOf(i), str);
                        k.e("SearchLocationService", "checkBizPermission: denied with msg " + str);
                        Context context2 = context;
                        if (!(context2 instanceof Activity)) {
                            w.a("", b.a(R.string.taobao_app_1005_1_16657), 0);
                            return;
                        }
                        com.taobao.search.common.util.d.a((Activity) context2, b.a(R.string.taobao_app_1005_1_16699) + b.a(R.string.taobao_app_1005_1_16668));
                    }
                }
            }).b("TB_SHOPPING_PROCESS").b(true).a(0L).a(b.a(R.string.taobao_app_1005_1_16678)).a();
        } else if (aVar == null) {
        } else {
            aVar.a(null);
        }
    }

    private static void c(final a aVar, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711b3278", new Object[]{aVar, context, new Boolean(z)});
        } else if (!b(context)) {
        } else {
            b = System.currentTimeMillis();
            TBLocationOption tBLocationOption = new TBLocationOption();
            if (r.aH() && !z) {
                tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.TWO_HOUR);
            } else {
                tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.NO_CACHE);
            }
            TBLocationClient.a(context).a(tBLocationOption, new com.taobao.location.client.a() { // from class: tb.nnq.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.location.client.a
                public void onLocationChanged(TBLocationDTO tBLocationDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                        return;
                    }
                    if (tBLocationDTO != null && tBLocationDTO.isNavSuccess()) {
                        nnq.a(tBLocationDTO);
                    }
                    a aVar2 = a.this;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(tBLocationDTO);
                }
            }, Looper.getMainLooper());
        }
    }

    public static boolean b(Context context) {
        d a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (!r.bX() || (a2 = f.a(context, "TB_SHOPPING_PROCESS", c)) == null) {
            return false;
        }
        int i = a2.b[0];
        if (i == 0) {
            AppMonitor.Alarm.commitSuccess("tbsearch", "locationPermission");
            return true;
        }
        String str = a2.c[0];
        k.e("SearchLocationService", "checkBizPermission: denied with msg " + str);
        AppMonitor.Alarm.commitFail("tbsearch", "locationPermission", String.valueOf(i), str);
        return false;
    }
}
