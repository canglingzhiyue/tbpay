package com.taobao.linkmanager.afc.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import tb.kge;
import tb.mbm;
import tb.mpa;
import tb.rkj;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String[] f17685a;
    private static List<String> b;
    private static String[] c;
    private static String[] d;
    private static String[] e;

    static {
        kge.a(-770423759);
        String[] strArr = {"tbopen", "taobao", "alitaobao", "aliflowcustoms", "alitaobao4android", "alitaobaoclient", "alitaobaolink"};
        f17685a = strArr;
        b = Arrays.asList(strArr);
        c = new String[]{"http", "https"};
        d = new String[]{"h5.m.taobao.com", "m.taobao.com", "copyhomecache.m.taobao.com", "my.m.taobao.com", "i.taobao.com"};
        e = new String[]{"/index.htm", "/myTaobao.htm", "/my_taobao.htm", "/awp/mtb/mtb.htm"};
    }

    public static boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        return b.contains(uri.getScheme()) && TextUtils.equals(uri.getHost(), "m.taobao.com") && TextUtils.equals(uri.getPath(), "/tbopen/index.html");
    }

    public static void a(final Activity activity, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13e9f77", new Object[]{activity, intent});
            return;
        }
        TLog.loge("linkManager", "afc_link", new Throwable());
        try {
            com.taobao.flowcustoms.afc.utils.d.b.a(new Runnable() { // from class: com.taobao.linkmanager.afc.utils.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.flowcustoms.afc.utils.b.a(19999, "screen_state_point", rkj.b(activity) + "", intent.getData() + "", null);
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (com.taobao.flowcustoms.afc.a.b(intent) && mpa.HOT.equals(TbFcLinkInit.launchType)) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "LinkHandleUtils === linkIn = 热启 补偿afc_id");
            AfcLifeCycleCenter.instance().dealWithData(activity, intent);
        }
        TbFcLinkInit.instance().isAfcLink = true;
        mbm.f31019a = new WeakReference<>(activity);
        if (intent != null) {
            AfcLifeCycleCenter.jumpUrl = intent.getDataString();
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "LinkHandleUtils === linkIn = jumpUrl为：" + AfcLifeCycleCenter.jumpUrl);
        }
        com.taobao.flowcustoms.afc.a.a(AfcUtils.a(activity));
        if (TbFcLinkInit.instance().linkAhead) {
            com.taobao.flowcustoms.afc.utils.d.b.a(new Runnable() { // from class: com.taobao.linkmanager.afc.utils.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    Boolean bool;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (TbFcLinkInit.instance().doLinkMap.size() <= 0 || (bool = TbFcLinkInit.instance().doLinkMap.get(intent.getData())) == null || !bool.booleanValue()) {
                        com.taobao.flowcustoms.afc.utils.c.a("linkx", "LinkHandleUtils === linkIn = 正常页面回调执行海关逻辑,子线程执行");
                        AfcCustomSdk.a().a(activity, intent);
                    } else {
                        com.taobao.flowcustoms.afc.utils.c.a("linkx", "LinkHandleUtils === linkIn = 冷启/极速版,海关的逻辑放在了初始化执行，此处不再执行");
                        TbFcLinkInit.instance().doLinkMap.remove(intent.getData());
                    }
                }
            });
        } else {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "LinkHandleUtils === linkIn = 正常执行海关逻辑,主线程执行");
            AfcCustomSdk.a().a(activity, intent);
        }
        TLog.loge("linkManager", "afc_link", "intent = " + intent + " ==== " + AfcUtils.a(activity));
    }

    public static Intent a(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("2de52184", new Object[]{intent, str});
        }
        if (LauncherRuntime.a(intent)) {
            return intent;
        }
        Uri parse = Uri.parse(intent.getData().getQueryParameter("h5Url"));
        Bundle bundle = new Bundle();
        bundle.putString("out_link", str);
        if (!b(parse)) {
            bundle.putString("black_page", str);
        }
        intent.putExtra("afc_bundle", bundle);
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "LinkHandleUtils === putIntentData2Apm " + intent);
        return intent;
    }

    public static boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38284082", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        return Arrays.asList(c).contains(uri.getScheme()) && Arrays.asList(d).contains(uri.getHost()) && Arrays.asList(e).contains(uri.getPath());
    }
}
