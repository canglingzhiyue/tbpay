package com.taobao.linkmanager.flowout;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.security.ccrc.service.CcrcContext;
import com.alibaba.security.ccrc.service.CcrcOffClientService;
import com.alibaba.security.ccrc.service.RiskShowCustomizedResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.flowout.data.FloutNewConfigData;
import com.taobao.linkmanager.flowout.data.FlowOutConfigData;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import java.util.HashMap;
import tb.kge;
import tb.mbf;
import tb.mbg;
import tb.mbo;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private com.taobao.linkmanager.flowout.data.a f17703a;
    private final BroadcastReceiver b;

    /* renamed from: com.taobao.linkmanager.flowout.a$a */
    /* loaded from: classes7.dex */
    public static class C0681a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final a f17705a;

        static {
            kge.a(-2112007286);
            f17705a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("188d837a", new Object[0]) : f17705a;
        }
    }

    static {
        kge.a(2097674423);
    }

    public static /* synthetic */ com.taobao.linkmanager.flowout.data.a a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.linkmanager.flowout.data.a) ipChange.ipc$dispatch("1817df8b", new Object[]{aVar}) : aVar.f17703a;
    }

    public static /* synthetic */ com.taobao.linkmanager.flowout.data.a a(a aVar, com.taobao.linkmanager.flowout.data.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.linkmanager.flowout.data.a) ipChange.ipc$dispatch("dc7a3c4a", new Object[]{aVar, aVar2});
        }
        aVar.f17703a = aVar2;
        return aVar2;
    }

    public static /* synthetic */ boolean a(a aVar, Intent intent, Context context, String str, mbf.a aVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("21d83dc7", new Object[]{aVar, intent, context, str, aVar2})).booleanValue() : aVar.a(intent, context, str, aVar2);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("188d837a", new Object[0]) : C0681a.a();
    }

    private a() {
        this.b = new BroadcastReceiver() { // from class: com.taobao.linkmanager.flowout.FlowOutCenter$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (!"afc_page_open_broadcast".equals(intent.getAction())) {
                } else {
                    String stringExtra = intent.getStringExtra("pageName");
                    if (!"scan".equals(stringExtra) && !"share".equals(stringExtra)) {
                        return;
                    }
                    com.taobao.flowcustoms.afc.utils.c.b("linkx", "FlowOutCenter === afc_page_open_broadcast === " + stringExtra);
                    String stringExtra2 = intent.getStringExtra("pageUrl");
                    long longExtra = intent.getLongExtra("openTimestamp", 0L);
                    if (longExtra <= 0) {
                        try {
                            longExtra = Long.parseLong(intent.getStringExtra("openTimestamp"));
                        } catch (Exception unused) {
                        }
                    }
                    a.a(a.this, new com.taobao.linkmanager.flowout.data.a());
                    a.a(a.this).f17708a = stringExtra;
                    a.a(a.this).b = stringExtra2;
                    a.a(a.this).c = longExtra;
                }
            }
        };
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutCenter === registerFlowOut === 注册跳出模块");
        b.a(application);
        b(application);
        LocalBroadcastManager.getInstance(application).registerReceiver(this.b, new IntentFilter("afc_page_open_broadcast"));
    }

    private void b(Application application) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{this, application});
            return;
        }
        try {
            FloutNewConfigData b = b.b();
            FlowOutConfigData a2 = b.a();
            if ((b == null || !b.newFloutEnable) && (a2 == null || !a2.floutEnable)) {
                z = false;
            }
            if (!z) {
                com.taobao.flowcustoms.afc.utils.c.b("linkx", "FlowOutCenter === registerOutHook === 未开启外跳管控，放过");
                return;
            }
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutCenter === registerOutHook === 注册跳出拦截监听");
            mbg.a(application, b);
            mbf.f31008a = new mbf.b() { // from class: com.taobao.linkmanager.flowout.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // tb.mbf.b
                public boolean a(Intent intent, String str, String str2, Context context, mbf.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("af0c8c35", new Object[]{this, intent, str, str2, context, aVar})).booleanValue();
                    }
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutCenter === onExternalRedirect === 进行跳出拦截");
                    return a.a(a.this, intent, context, str, aVar);
                }
            };
        } catch (Exception e) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "FlowOutCenter === registerOutHook === error： " + e.toString());
        }
    }

    private boolean a(Intent intent, Context context, String str, mbf.a aVar) {
        boolean z;
        String str2;
        boolean z2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a46b5d3", new Object[]{this, intent, context, str, aVar})).booleanValue();
        }
        Uri data = intent.getData();
        com.taobao.linkmanager.flowout.data.a aVar2 = this.f17703a;
        if (aVar2 != null && !TextUtils.isEmpty(aVar2.f17708a) && this.f17703a.c > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.f17703a.c;
            String dataString = intent.getDataString();
            long j2 = -1;
            if (!b.i() || j > b.j() || b.k() != 1) {
                z = false;
                str2 = null;
            } else {
                if (CcrcContext.init(context, TbFcLinkInit.instance().ttid)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("pageName", this.f17703a.f17708a);
                    hashMap.put("pageUrl", this.f17703a.b);
                    hashMap.put("jumpUrl", dataString);
                    hashMap.put("timeDiff", Long.valueOf(j));
                    RiskShowCustomizedResult detectWithActivate = CcrcOffClientService.getService().detectWithActivate(hashMap);
                    if (detectWithActivate.isSuccess()) {
                        z2 = detectWithActivate.isRisk();
                        str3 = detectWithActivate.getSampleID();
                        j2 = System.currentTimeMillis() - currentTimeMillis;
                        z = z2;
                        str2 = str3;
                    }
                }
                z2 = false;
                str3 = null;
                j2 = System.currentTimeMillis() - currentTimeMillis;
                z = z2;
                str2 = str3;
            }
            d.a(this.f17703a, dataString, currentTimeMillis, z, j2, str2);
            if (z) {
                com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutCenter === FlowDistribute === 命中安全策略，外跳拦截");
                return false;
            }
        }
        if (data != null && data.toString().contains("fl_out_green=true")) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutCenter === FlowDistribute === 参数包含fl_out_green放过");
            return true;
        }
        FloutNewConfigData b = b.b();
        if (b != null && b.newFloutEnable) {
            return mbo.a().a(intent, b, str, aVar);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", intent.getDataString());
        com.taobao.flowcustoms.afc.utils.b.a("flow_out_history_unexpect", "", "", hashMap2);
        FlowOutConfigData a2 = b.a();
        if (data == null || data.getScheme() == null) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutCenter === FlowDistribute === app拦截流程，data为空");
            return mbo.a().a(intent, a2, str);
        }
        String scheme = data.getScheme();
        if (TextUtils.equals("http", scheme) || TextUtils.equals("https", scheme)) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutCenter === FlowDistribute === 浏览器拦截流程");
            return true;
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutCenter === FlowDistribute === app拦截流程，data不为空");
        boolean a3 = mbo.a().a(intent, a2, str);
        if (a3) {
            a(a2, data, intent);
        } else {
            a(context, a2);
        }
        return a3;
    }

    private void a(FlowOutConfigData flowOutConfigData, Uri uri, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63808250", new Object[]{this, flowOutConfigData, uri, intent});
        } else if (!e.b(uri.toString(), e.a(flowOutConfigData, uri.getScheme()), flowOutConfigData)) {
        } else {
            String uri2 = uri.toString();
            String queryParameter = uri.getQueryParameter("bc_fl_src");
            String queryParameter2 = uri.getQueryParameter(c.FL_OUT_ID);
            if (TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                uri2 = TFCCommonUtils.a(uri2, "bc_fl_src", queryParameter2);
            }
            intent.setData(Uri.parse(uri2 + c.LINK_PREFIX));
        }
    }

    public void a(Context context, FlowOutConfigData flowOutConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f603313c", new Object[]{this, context, flowOutConfigData});
            return;
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "AppController === showTips === 显示拦截tips");
        if (context == null) {
            return;
        }
        String str = flowOutConfigData.blockTip;
        if (TextUtils.isEmpty(str)) {
            str = "正在努力尝试跳转，请先逛逛其他内容~";
        }
        Toast.makeText(context, str, 0).show();
    }
}
