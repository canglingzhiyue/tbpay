package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.a;
import com.taobao.flowcustoms.afc.utils.b;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.flowcustoms.afc.utils.d;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import java.util.HashMap;

/* loaded from: classes.dex */
public class mbd implements kob {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(280548725);
        kge.a(-269909542);
    }

    @Override // tb.kob
    public void a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            d.b.a(new Runnable() { // from class: tb.mbd.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    } else {
                        alj.a().a(str, str2);
                        c.a("linkx", "TfcStageDataImp === onDataHub === key:" + str + " value:" + str2);
                    }
                }
            });
        }
    }

    @Override // tb.kob
    public void a(final a aVar, final String str, final HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea55cb34", new Object[]{this, aVar, str, hashMap});
            return;
        }
        hashMap.put("afc_apm_time_new", String.valueOf(SystemClock.uptimeMillis()));
        d.b.a(new Runnable() { // from class: tb.mbd.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                HashMap hashMap2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TextUtils.isEmpty(str) || (hashMap2 = hashMap) == null) {
                } else {
                    hashMap2.put("afc_apm_time", SystemClock.uptimeMillis() + "");
                    HashMap hashMap3 = hashMap;
                    hashMap3.put("afc_push_alive", rjt.a().e + "");
                    HashMap hashMap4 = hashMap;
                    hashMap4.put("afc_launch_type", TbFcLinkInit.launchType + "");
                    if (aVar != null) {
                        if (str.equals(b.AFC_LINK_NAV_START)) {
                            hashMap.put("autoLoginParam", aVar.J.getString("autoLoginParam"));
                            hashMap.put("autoLoginExecuteStatus", aVar.J.getString("autoLoginExecuteStatus"));
                            hashMap.put("startLoginStatus", aVar.J.getString("startLoginStatus"));
                            hashMap.put("autoLoginAbBucketId", aVar.J.getString("autoLoginAbBucketId"));
                            hashMap.put("beforeNavlLoginStatus", TFCCommonUtils.a());
                        }
                        int intValue = aVar.J.getIntValue("asyncReqBucketId");
                        if (intValue > 0) {
                            hashMap.put("asyncReqBucketId", String.valueOf(intValue));
                        }
                        hashMap.put("routerStrategy", aVar.J.getString("routerStrategy"));
                        if (aVar.J.containsKey("useLoginTokenOptimize")) {
                            hashMap.put("useLoginTokenOptimize", aVar.J.getString("useLoginTokenOptimize"));
                        }
                        if (aVar.J.containsKey("loginTokenOptimizeBucketId")) {
                            hashMap.put("loginTokenOptimizeBucketId", aVar.J.getString("loginTokenOptimizeBucketId"));
                        }
                    }
                    alj.a().a(str, hashMap);
                    c.a("linkx", "TfcStageDataImp === onStage === stage:" + str + " params:" + hashMap);
                }
            }
        });
    }
}
