package com.taobao.linkmanager.launcher;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.safemode.k;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.task.Coordinator;
import com.taobao.application.common.a;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.linkmanager.afc.plugin.d;
import com.taobao.linkmanager.afc.remote.HomePageReceiver;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.afc.utils.e;
import com.taobao.linkmanager.afc.windvane.AfcIdJsBridge;
import com.taobao.linkmanager.afc.windvane.DeviceInfoJsBridge;
import com.taobao.linkmanager.afc.windvane.LoginFreeJsBridge;
import com.taobao.linkmanager.afc.windvane.XbsJsBridge;
import com.taobao.linkmanager.flowout.windvane.FlowCustomsWvPlugin;
import com.taobao.orange.OConstant;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.kaw;
import tb.kfb;
import tb.kge;
import tb.kib;
import tb.kog;
import tb.kok;
import tb.kop;
import tb.may;
import tb.maz;
import tb.mba;
import tb.mbb;
import tb.mbc;
import tb.mbd;
import tb.mbe;
import tb.mbi;
import tb.mpa;
import tb.rjt;

/* loaded from: classes.dex */
public class TbFcLinkInit {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_HOMEPAGE_FINISH = "action_welcome_need_finish";
    public static final String LOG_TAG = "linkx";
    public static String launchType;
    public Map<Uri, Boolean> doLinkMap;
    public boolean isAfcLink;
    public HashMap<String, Object> launchParams;
    public boolean linkAhead;
    public String mAppKey;
    public Application mApplication;
    public String ttid;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static TbFcLinkInit f17716a;

        static {
            kge.a(-462078040);
            f17716a = new TbFcLinkInit();
        }

        public static /* synthetic */ TbFcLinkInit a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TbFcLinkInit) ipChange.ipc$dispatch("946d4e68", new Object[0]) : f17716a;
        }
    }

    public static /* synthetic */ void access$200(TbFcLinkInit tbFcLinkInit, Application application, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb4d87a7", new Object[]{tbFcLinkInit, application, hashMap});
        } else {
            tbFcLinkInit.initBackgroundTask(application, hashMap);
        }
    }

    static {
        kge.a(-666378027);
        launchType = mpa.COLD;
    }

    public static TbFcLinkInit instance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TbFcLinkInit) ipChange.ipc$dispatch("496f8b4", new Object[0]) : a.a();
    }

    private TbFcLinkInit() {
        this.doLinkMap = new HashMap();
        this.mAppKey = "21646297";
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        long a2 = AfcUtils.a();
        com.taobao.flowcustoms.afc.utils.c.b("linkx", "TbFcLinkInit === init.");
        this.mApplication = application;
        this.ttid = (String) hashMap.get("ttid");
        this.launchParams = hashMap;
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.mAppKey = (String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
        kog.a().k = true;
        kog.a().j = true;
        kog.a().n = false;
        kog.a().o = true;
        kog.a().l = "flow_customs_in";
        kog.a().b = new b();
        kog.a().h = new mbd();
        kog.a().c = new mbc();
        kog.a().d = new mbb();
        kog.a().e = new mba();
        kog.a().f = new may();
        kog.a().i = new maz();
        AfcCustomSdk.a().a(application, this.mAppKey, (String) hashMap.get("appVersion"), TFCCommonUtils.a(hashMap));
        kok.a().a(new com.taobao.linkmanager.afc.plugin.c());
        kok.a().a(new com.taobao.linkmanager.afc.plugin.a());
        kok.a().a(new d());
        kok.a().a(new com.taobao.linkmanager.afc.plugin.b());
        kog.a().g = new mbe();
        registerForgroundListener();
        try {
            kfb.a().a(mbi.a());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        long a3 = AfcUtils.a();
        StringBuilder sb = new StringBuilder();
        sb.append("海关初始化节点耗时：");
        long j = a3 - a2;
        sb.append(j);
        sb.append("");
        com.taobao.flowcustoms.afc.utils.c.b(AfcCustomSdk.LOG_TIME, sb.toString());
        com.taobao.flowcustoms.afc.utils.b.a(com.taobao.flowcustoms.afc.utils.b.AFC_SDK_INIT_TIME, j + "", "", null);
        linkAheadProcess(application, hashMap);
        com.taobao.flowcustoms.afc.utils.c.b("linkx", "TbFcLinkInit === init done.");
    }

    private void linkAheadProcess(final Application application, final HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7af103", new Object[]{this, application, hashMap});
            return;
        }
        if (this.linkAhead) {
            try {
                Coordinator.execute(new Runnable() { // from class: com.taobao.linkmanager.launcher.TbFcLinkInit.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        com.taobao.flowcustoms.afc.utils.c.a("linkx", "TbFcLinkInit === initBackgroundTask：冷启，极速版");
                        TbFcLinkInit.access$200(TbFcLinkInit.this, application, hashMap);
                    }
                });
            } catch (Exception e) {
                initBackgroundTask(application, hashMap);
                com.taobao.flowcustoms.afc.utils.c.b("linkx", "TbFcLinkInit === 异常：" + e.toString());
            }
        } else {
            com.taobao.flowcustoms.afc.utils.d.b.a(new Runnable() { // from class: com.taobao.linkmanager.launcher.TbFcLinkInit.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", "TbFcLinkInit === initBackgroundTask：冷启,正常子线程初始化");
                    TbFcLinkInit.access$200(TbFcLinkInit.this, application, hashMap);
                }
            });
        }
        if (!this.linkAhead) {
            return;
        }
        k d = LauncherRuntime.d();
        kog.a().m = d.d;
        Intent intent = d.e;
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", data.toString());
        hashMap2.put("packageName", d.d);
        if (e.a(data)) {
            this.isAfcLink = true;
            this.doLinkMap.put(data, true);
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "TbFcLinkInit === init：冷启，极速版开启，海关逻辑提前执行, 来源包名: " + d.d);
            AfcCustomSdk.a().a(application, intent);
            com.taobao.flowcustoms.afc.utils.b.a("tb_speed_link", "", "", hashMap2);
            return;
        }
        com.taobao.flowcustoms.afc.utils.b.a("tb_illegalLink", "", "", hashMap2);
    }

    private void initBackgroundTask(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4aca97e", new Object[]{this, application, hashMap});
            return;
        }
        rjt.a().a(application, hashMap);
        kib.a().b(application, hashMap);
        q.a(XbsJsBridge.CLASSNAME_BC_TIPS, (Class<? extends android.taobao.windvane.jsbridge.e>) XbsJsBridge.class);
        q.a(DeviceInfoJsBridge.NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) DeviceInfoJsBridge.class);
        q.a(FlowCustomsWvPlugin.PLUGIN_NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) FlowCustomsWvPlugin.class);
        q.a(AfcIdJsBridge.NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) AfcIdJsBridge.class);
        q.a(LoginFreeJsBridge.NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) LoginFreeJsBridge.class);
        LocalBroadcastManager.getInstance(application).registerReceiver(HomePageReceiver.a.f17677a, new IntentFilter(ACTION_HOMEPAGE_FINISH));
        if (hashMap.containsKey("currentLocale") && !Locale.CHINESE.getLanguage().equals((String) hashMap.get("currentLocale"))) {
            HomePageReceiver.a.f17677a.a(false);
        }
        com.taobao.linkmanager.afc.utils.b.a(application);
        kaw.c();
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("isNetWorkInThread", Boolean.valueOf(TFCCommonUtils.a(application, TFCCommonUtils.b)));
        kaw.a().a(application, hashMap2);
        kop.a(application);
    }

    private void registerForgroundListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8dec08", new Object[]{this});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.linkmanager.launcher.TbFcLinkInit.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        com.taobao.application.common.c.a(new a.b() { // from class: com.taobao.linkmanager.launcher.TbFcLinkInit.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.application.common.IApmEventListener
                            public void onEvent(int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                                    return;
                                }
                                if (i == 1) {
                                    TbFcLinkInit.launchType = mpa.HOT;
                                }
                                com.taobao.flowcustoms.afc.utils.c.a("linkx", "TbFcLinkInit === registerForgroundListener: 是否冷启动：" + TbFcLinkInit.launchType);
                            }
                        });
                    }
                }
            });
        }
    }
}
