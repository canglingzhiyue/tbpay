package com.taobao.wireless.link.common;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.wireless.link.model.ActivityIdTime;
import com.taobao.wireless.link.model.SupportBrandVersion;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.rju;
import tb.rkg;
import tb.rkk;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, String> h;

    /* renamed from: a  reason: collision with root package name */
    public String f23584a;
    public String b;
    public SupportBrandVersion c;
    public ActivityIdTime d;
    public SupportBrandVersion e;
    public SupportBrandVersion f;
    private rkk g;

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : h;
    }

    public static /* synthetic */ Map a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        h = map;
        return map;
    }

    public static /* synthetic */ rkk a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rkk) ipChange.ipc$dispatch("6eff87f0", new Object[]{bVar}) : bVar.g;
    }

    public static /* synthetic */ rkk a(b bVar, rkk rkkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rkk) ipChange.ipc$dispatch("8124fe52", new Object[]{bVar, rkkVar});
        }
        bVar.g = rkkVar;
        return rkkVar;
    }

    public static /* synthetic */ void a(b bVar, String str, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd956d1", new Object[]{bVar, str, application});
        } else {
            bVar.a(str, application);
        }
    }

    static {
        kge.a(748790463);
        h = new HashMap();
    }

    public b(Application application) {
        a(application);
    }

    private void a(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"bc_server_port"}, new d() { // from class: com.taobao.wireless.link.common.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    b.a(b.this, str, application);
                    b.a(OrangeConfig.getInstance().getConfigs(str));
                    rkg.a("link_tag", "LinkConfigGetImp === registerListener === nameSpace为：" + str + " === 获取到的configs: " + b.a());
                    rkk.a(application).a("link_in_common_local", b.a());
                }
            }, false);
        }
    }

    private void a(final String str, final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e9006ed", new Object[]{this, str, application});
        } else {
            com.taobao.wireless.link.controller.a.a().b().post(new Runnable() { // from class: com.taobao.wireless.link.common.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b.this.f23584a = OrangeConfig.getInstance().getConfig(str, "textTitle", "恭喜你，小助手已成功开启，奖励已到账");
                    b.this.b = OrangeConfig.getInstance().getConfig(str, "tbVersion", "");
                    b.a(b.this, rkk.a(application));
                    try {
                        b.this.c = (SupportBrandVersion) JSON.parseObject(OrangeConfig.getInstance().getConfig(str, "popWhiteList", ""), SupportBrandVersion.class);
                        if (b.this.c != null) {
                            b.a(b.this).a("popSupportBrandVersion", b.this.c);
                        }
                    } catch (Exception e) {
                        rkg.a("link_tag", "LinkConfigGetImp === assistantConfig === config解析异常:" + e);
                    }
                    try {
                        b.this.f = (SupportBrandVersion) JSON.parseObject(OrangeConfig.getInstance().getConfig(str, "notificationSupportBrandVersion", ""), SupportBrandVersion.class);
                        if (b.this.f != null) {
                            b.a(b.this).a("notificationSupportBrandVersion", b.this.f);
                        }
                        b.this.e = (SupportBrandVersion) JSON.parseObject(OrangeConfig.getInstance().getConfig(str, "supportBrandVersion", ""), SupportBrandVersion.class);
                        if (b.this.e != null) {
                            b.a(b.this).a("supportBrandVersion", b.this.e);
                        }
                        b.this.d = (ActivityIdTime) JSON.parseObject(OrangeConfig.getInstance().getConfig(str, "activityOutTime", ""), ActivityIdTime.class);
                        if (b.this.d != null) {
                            b.a(b.this).a("activityOutTime", b.this.d);
                        }
                    } catch (Exception e2) {
                        rkg.a("link_tag", "LinkConfigGetImp === assistantConfig === config数据解析异常:" + e2);
                    }
                    String config = OrangeConfig.getInstance().getConfig(str, "isShowNotification", "false");
                    String config2 = OrangeConfig.getInstance().getConfig(str, "isShowAssistant", "false");
                    if (TextUtils.equals("false", config)) {
                        b.a(b.this).a("isShowNotifi", "false");
                        com.taobao.wireless.link.controller.a.a().j = config;
                    }
                    if (TextUtils.equals("false", config2)) {
                        rju.a().a((Context) application, false);
                    }
                    com.taobao.wireless.link.notification.b.b(application, true);
                }
            });
        }
    }

    public static String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
        }
        Map<String, String> map = h;
        if (map == null || map.size() == 0) {
            h = rkk.a(context).a("link_in_common_local");
        }
        Map<String, String> map2 = h;
        if (map2 == null || map2.size() == 0) {
            return str2;
        }
        String str3 = h.get(str);
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }
}
