package com.taobao.alimama.tanx;

import android.app.Application;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.tanx.exposer.achieve.AdMonitorType;
import com.tanx.exposer.b;
import com.tanx.exposer.d;
import com.taobao.alimama.utils.c;
import com.taobao.alimama.utils.e;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.statistic.TBS;
import com.taobao.utils.Global;
import java.util.Arrays;
import java.util.Map;
import tb.dgi;
import tb.dgm;
import tb.dgq;
import tb.dgr;
import tb.dgt;
import tb.dgw;
import tb.dhb;
import tb.dhg;
import tb.dhk;
import tb.dhl;
import tb.dhm;
import tb.dhp;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f8443a;

    /* renamed from: com.taobao.alimama.tanx.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0333a {

        /* renamed from: a  reason: collision with root package name */
        public static volatile a f8449a;

        static {
            kge.a(-377712429);
            f8449a = new a();
        }
    }

    static {
        kge.a(-1910376238);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8f119c14", new Object[0]) : C0333a.f8449a;
    }

    private a() {
        this.f8443a = false;
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        try {
            d.a().a(application, new b.a(new dgq() { // from class: com.taobao.alimama.tanx.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dgq
                public void a(dgt dgtVar, final dgr dgrVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("276b35a8", new Object[]{this, dgtVar, dgrVar});
                    } else if (dgtVar == null || dgrVar == null) {
                    } else {
                        dhp.a aVar = new dhp.a(dgtVar.a(), dhm.RETRY_FIVE_TIMES);
                        aVar.a(true);
                        aVar.a(3);
                        aVar.c(20000);
                        aVar.b(30000);
                        aVar.a(HttpRequest.HEADER_ACCEPT, MunionDeviceUtil.getAccept(Global.getApplication(), null));
                        com.taobao.alimama.net.core.request.b bVar = new com.taobao.alimama.net.core.request.b();
                        final dhp dhpVar = new dhp(aVar);
                        dhg.a().a(dhpVar);
                        bVar.a(new dhp(aVar), new dhl() { // from class: com.taobao.alimama.tanx.a.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.dhl
                            public void a(dhk dhkVar) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("e524bd11", new Object[]{this, dhkVar});
                                } else if (dhkVar == null) {
                                } else {
                                    if (dhpVar.a(dhkVar.f26759a)) {
                                        dgr dgrVar2 = dgrVar;
                                        if (dgrVar2 == null) {
                                            return;
                                        }
                                        dgrVar2.a("");
                                        return;
                                    }
                                    dgr dgrVar3 = dgrVar;
                                    if (dgrVar3 == null) {
                                        return;
                                    }
                                    dgrVar3.a(-1, dhkVar.f26759a + ":" + dhkVar.b);
                                }
                            }
                        });
                    }
                }
            }, new dgw() { // from class: com.taobao.alimama.tanx.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dgw
                public void a(String str, int i, Object obj, Object obj2, Object obj3, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d7be6c00", new Object[]{this, str, new Integer(i), obj, obj2, obj3, map});
                    } else {
                        TBS.Ext.commitEvent("TanxMonitor", i, obj, obj2, obj3, String.format("sdkversion=%s,bucket=%s", "5.15.6", StringUtils.join(";", c.l())), com.taobao.muniontaobaosdk.util.b.c(map));
                    }
                }
            }).a(ConnectionResult.SERVICE_UPDATING).b(3).b(true).a(true).a(Arrays.asList(AdMonitorType.CLICK, AdMonitorType.EXPOSE)).a(new dgm() { // from class: com.taobao.alimama.tanx.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dgm
                public void a(String str, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                    } else {
                        AppMonitor.Alarm.commitSuccess(str, str2, str3);
                    }
                }

                @Override // tb.dgm
                public void a(String str, String str2, String str3, String str4, String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
                    } else {
                        AppMonitor.Alarm.commitFail(str, str2, str3, str4, str5);
                    }
                }
            }).a(Global.getPackageName(), dhb.a(application)).d(false).c(false).a());
            d.a().a(new dgi() { // from class: com.taobao.alimama.tanx.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dgi
                public void a(int i, String str, String str2, AdMonitorType adMonitorType, com.tanx.exposer.c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("181c4cd", new Object[]{this, new Integer(i), str, str2, adMonitorType, cVar});
                    }
                }

                @Override // tb.dgi
                public void a(String str, AdMonitorType adMonitorType, com.tanx.exposer.c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1e8f1b50", new Object[]{this, str, adMonitorType, cVar});
                    }
                }

                @Override // tb.dgi
                public void b(int i, String str, String str2, AdMonitorType adMonitorType, com.tanx.exposer.c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c9dfe96c", new Object[]{this, new Integer(i), str, str2, adMonitorType, cVar});
                    }
                }

                @Override // tb.dgi
                public Looper a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Looper) ipChange2.ipc$dispatch("d8782f3d", new Object[]{this}) : Looper.getMainLooper();
                }
            });
            this.f8443a = true;
        } catch (Exception e) {
            e.a("TanxExposerManagerError", e.getMessage());
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f8443a;
    }
}
