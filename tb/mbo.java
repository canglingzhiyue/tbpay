package tb;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.flowout.d;
import com.taobao.linkmanager.flowout.data.FloutNewBrowserHostBean;
import com.taobao.linkmanager.flowout.data.FloutNewConfigData;
import com.taobao.linkmanager.flowout.data.FloutNewConfigItemData;
import com.taobao.linkmanager.flowout.data.FloutWhiteListBean;
import com.taobao.linkmanager.flowout.data.FlowOutConfigData;
import com.taobao.linkmanager.flowout.e;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.mbf;

/* loaded from: classes7.dex */
public class mbo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STRATEGY_1 = 1;
    public static final int STRATEGY_2 = 2;
    public static final int STRATEGY_3 = 3;
    public static final int STRATEGY_4 = 4;
    public static final int STRATEGY_5 = 5;

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f31024a;
        public String b;
        public String c;

        static {
            kge.a(-458471263);
        }

        public a(int i) {
            this.f31024a = i;
        }
    }

    /* loaded from: classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final mbo f31025a;

        static {
            kge.a(-606041669);
            f31025a = new mbo();
        }

        public static /* synthetic */ mbo a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (mbo) ipChange.ipc$dispatch("f07aee4", new Object[0]) : f31025a;
        }
    }

    static {
        kge.a(-1934118680);
    }

    public static mbo a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mbo) ipChange.ipc$dispatch("f07aee4", new Object[0]) : b.a();
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : mbi.a().b();
    }

    public boolean a(Intent intent, FloutNewConfigData floutNewConfigData, String str, mbf.a aVar) {
        String str2;
        Uri uri;
        String str3;
        int i;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18cebb59", new Object[]{this, intent, floutNewConfigData, str, aVar})).booleanValue();
        }
        Uri data = intent.getData();
        c.a("linkx", "AppController === jumpProcessNew === uri=" + data);
        String str5 = "";
        String scheme = data != null ? data.getScheme() : str5;
        String host = data != null ? data.getHost() : str5;
        if (!StringUtils.isEmpty(str)) {
            str2 = "linkx";
            uri = data;
            int a2 = a(floutNewConfigData, str, intent, data, scheme, host);
            if (floutNewConfigData == null || floutNewConfigData.floutControl == null || StringUtils.isEmpty(str)) {
                i = a2;
                str4 = str;
                str3 = null;
            } else {
                FloutNewConfigItemData floutNewConfigItemData = floutNewConfigData.floutControl.get(str);
                i = a2;
                str3 = floutNewConfigItemData != null ? floutNewConfigItemData.name : null;
                str4 = str;
            }
        } else {
            str2 = "linkx";
            uri = data;
            c.a(str2, "AppController === packageName is empty.");
            a a3 = a(floutNewConfigData, intent, uri, scheme, host);
            int i2 = a3.f31024a;
            String str6 = a3.b;
            if (!StringUtils.isEmpty(str6)) {
                c.a(str2, "AppController === rewrite packageName = " + str6);
            }
            str3 = a3.c;
            i = i2;
            str4 = str6;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scheme", String.valueOf(scheme));
        hashMap.put("host", String.valueOf(host));
        hashMap.put("url", String.valueOf(intent.getDataString()));
        if (intent.getComponent() != null) {
            str5 = intent.getComponent().toShortString();
        }
        hashMap.put("component", str5);
        hashMap.put("curPage", AfcLifeCycleCenter.instance().getCurrentActivityName());
        hashMap.put("curPageUrl", AfcLifeCycleCenter.instance().getCurrentActivityUrl());
        hashMap.put("prePage", AfcLifeCycleCenter.instance().getPreActivityName());
        hashMap.put("prePageUrl", AfcLifeCycleCenter.instance().getPreActivityUrl());
        boolean b2 = b();
        hashMap.put("isAutoJumpOut", String.valueOf(b2));
        boolean a4 = a().a(intent, str4, com.taobao.linkmanager.flowout.b.a());
        hashMap.put("canPassControl", String.valueOf(a4));
        com.taobao.flowcustoms.afc.utils.b.a("flow_out_exposure", str4, String.valueOf(i), hashMap);
        c.a(str2, String.format("AppController.jumpProcessNew === strategy=%s === isAutoBrowserFlout=%s === canPassControl =%s", Integer.valueOf(i), Boolean.valueOf(b2), Boolean.valueOf(a4)));
        if (a4) {
            com.taobao.flowcustoms.afc.utils.b.a("flow_out_success", str4, String.valueOf(i), hashMap);
            return true;
        }
        if (b2) {
            if (i == 1 || i == 2) {
                if (i == 2) {
                    return a(uri, str4, str3, i, aVar);
                }
                com.taobao.flowcustoms.afc.utils.b.a("flow_out_success", str4, String.valueOf(i), hashMap);
                return true;
            } else if (i == 3 || i == 4 || i == 5) {
                hashMap.put("type", "ban");
                com.taobao.flowcustoms.afc.utils.b.a("flow_out_fail", str4, String.valueOf(i), hashMap);
                return false;
            }
        }
        if (i == 2 || i == 3) {
            return a(uri, str4, str3, i, aVar);
        }
        if (i == 1 || i == 4) {
            com.taobao.flowcustoms.afc.utils.b.a("flow_out_success", str4, String.valueOf(i), hashMap);
            return true;
        } else if (i == 5) {
            hashMap.put("type", "ban");
            com.taobao.flowcustoms.afc.utils.b.a("flow_out_fail", str4, String.valueOf(i), hashMap);
            return false;
        } else {
            com.taobao.flowcustoms.afc.utils.b.a("flow_out_success", str4, String.valueOf(i), hashMap);
            return true;
        }
    }

    private boolean a(Uri uri, final String str, String str2, final int i, final mbf.a aVar) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("238cddb6", new Object[]{this, uri, str, str2, new Integer(i), aVar})).booleanValue();
        }
        try {
            if (Boolean.parseBoolean(kog.a().a("useDialogController", "false"))) {
                return mbp.a().a(uri, str, str2, i, aVar);
            }
            c.a("linkx", "AppController.showConfirmDialog.");
            final HashMap hashMap = new HashMap();
            String str4 = "";
            hashMap.put("scheme", uri != null ? String.valueOf(uri.getScheme()) : str4);
            hashMap.put("host", uri != null ? String.valueOf(uri.getHost()) : str4);
            if (uri != null) {
                str4 = uri.toString();
            }
            hashMap.put("url", str4);
            Activity currentActivity = AfcLifeCycleCenter.instance().getCurrentActivity();
            if (currentActivity == null) {
                c.a("linkx", "AppController.showConfirmDialog.topActivity=null.pass.");
                com.taobao.flowcustoms.afc.utils.b.a("flow_out_success", str, String.valueOf(i), hashMap);
                return true;
            }
            c.a("linkx", "AppController.showConfirmDialog.topActivity=" + currentActivity.getComponentName());
            final Dialog dialog = new Dialog(currentActivity);
            dialog.requestWindowFeature(1);
            Window window = dialog.getWindow();
            if (window == null) {
                c.a("linkx", "AppController.showConfirmDialog.window=null.pass.");
                com.taobao.flowcustoms.afc.utils.b.a("flow_out_success", str, String.valueOf(i), hashMap);
                return true;
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            View inflate = View.inflate(currentActivity, R.layout.flout_confirm_dialog, null);
            dialog.setContentView(inflate);
            dialog.setCanceledOnTouchOutside(false);
            str3 = "flow_out_success";
            try {
                inflate.findViewById(R.id.confirm_yes).setOnClickListener(new View.OnClickListener() { // from class: tb.mbo.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        c.a("linkx", "AppController.showConfirmDialog.onClick.允许跳出");
                        com.taobao.flowcustoms.afc.utils.b.a("flow_out_success", str, String.valueOf(i), hashMap);
                        com.taobao.flowcustoms.afc.utils.b.a("flow_out_alert_ok", str, String.valueOf(i), hashMap);
                        aVar.a(true);
                        dialog.dismiss();
                    }
                });
                inflate.findViewById(R.id.confirm_no).setOnClickListener(new View.OnClickListener() { // from class: tb.mbo.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            dialog.cancel();
                        }
                    }
                });
                if (!StringUtils.isEmpty(str2)) {
                    String string = Globals.getApplication().getResources().getString(R.string.afc_flout_toast);
                    if (!StringUtils.isEmpty(string)) {
                        ((TextView) inflate.findViewById(R.id.confirm_title)).setText(string + str2);
                    }
                }
                dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: tb.mbo.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                            return;
                        }
                        com.taobao.flowcustoms.afc.utils.b.a("flow_out_alert_cancel", str, String.valueOf(i), hashMap);
                        hashMap.put("type", "cancel");
                        com.taobao.flowcustoms.afc.utils.b.a("flow_out_fail", str, String.valueOf(i), hashMap);
                        c.a("linkx", "AppController.showConfirmDialog.onClick.拒绝跳出");
                        aVar.a(false);
                    }
                });
                dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: tb.mbo.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public void onDismiss(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                        } else {
                            c.a("linkx", "AppController.showConfirmDialog.onDismiss");
                        }
                    }
                });
                dialog.show();
                window.setLayout((int) TFCCommonUtils.a(290.0f), -2);
                com.taobao.flowcustoms.afc.utils.b.a("flow_out_show_alert", str, String.valueOf(i), hashMap);
                return false;
            } catch (Throwable th) {
                th = th;
                c.b("linkx", "AppController.showConfirmDialog.error." + th);
                com.taobao.flowcustoms.afc.utils.b.a(str3, str, String.valueOf(i), new HashMap());
                return true;
            }
        } catch (Throwable th2) {
            th = th2;
            str3 = "flow_out_success";
        }
    }

    private int a(FloutNewConfigData floutNewConfigData, String str, Intent intent, Uri uri, String str2, String str3) {
        Integer num;
        FloutNewBrowserHostBean floutNewBrowserHostBean;
        FloutNewConfigItemData floutNewConfigItemData;
        Map<String, Integer> map;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50009b1b", new Object[]{this, floutNewConfigData, str, intent, uri, str2, str3})).intValue();
        }
        if (floutNewConfigData == null) {
            return 1;
        }
        try {
            if (!"https".equals(str2) && !"http".equals(str2)) {
                if (floutNewConfigData.floutControl == null || (floutNewConfigItemData = floutNewConfigData.floutControl.get(str)) == null) {
                    return com.taobao.linkmanager.flowout.b.d() ? 5 : 1;
                }
                if (floutNewConfigItemData.addNewTask) {
                    intent.addFlags(268435456);
                } else if (floutNewConfigItemData.needNewTask) {
                    intent.setFlags(268435456);
                }
                if (uri != null && !StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str3)) {
                    Map<String, List<String>> map2 = floutNewConfigItemData.urlBlack;
                    if (map2 != null && uri != null && (list = map2.get(str2)) != null && !list.isEmpty()) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            String lowerCase = uri.toString().toLowerCase();
                            if (lowerCase.startsWith((str2 + HttpConstant.SCHEME_SPLIT + it.next()).toLowerCase())) {
                                c.a("linkx", "AppController === Hit url black list, url=" + lowerCase);
                                return 5;
                            }
                        }
                    }
                    Map<String, Map<String, Integer>> map3 = floutNewConfigItemData.schemeStrategy;
                    if (map3 != null && (map = map3.get(str2)) != null) {
                        Integer num2 = map.get(str3);
                        if (num2 != null) {
                            return num2.intValue();
                        }
                        Integer num3 = map.get("defaultStrategy");
                        if (num3 != null) {
                            return num3.intValue();
                        }
                    }
                    return floutNewConfigItemData.defaultStrategy;
                }
                return floutNewConfigItemData.defaultStrategy;
            }
            if (floutNewConfigData.browserFloutControl != null) {
                Map<String, FloutNewBrowserHostBean> map4 = floutNewConfigData.browserFloutControl.hostStrategyPlus;
                if (map4 != null && !map4.isEmpty() && (floutNewBrowserHostBean = map4.get(str3)) != null) {
                    Map<String, Integer> map5 = floutNewBrowserHostBean.pathStrategy;
                    String path = uri != null ? uri.getPath() : "";
                    if (map5 != null && !StringUtils.isEmpty(path)) {
                        for (Map.Entry<String, Integer> entry : map5.entrySet()) {
                            if (path.toLowerCase().startsWith(entry.getKey())) {
                                Integer value = entry.getValue();
                                c.a("linkx", "AppController.getStrategyAndProcessFlag. url=" + uri + ", strategy=" + value);
                                return value.intValue();
                            }
                        }
                    }
                    if (floutNewBrowserHostBean.defaultStrategy != null) {
                        return floutNewBrowserHostBean.defaultStrategy.intValue();
                    }
                }
                Map<String, Integer> map6 = floutNewConfigData.browserFloutControl.hostStrategy;
                if ((map4 == null || map4.isEmpty()) && map6 != null && (num = map6.get(str3)) != null) {
                    return num.intValue();
                }
                if (floutNewConfigData.browserFloutControl.defaultStrategy != null) {
                    return floutNewConfigData.browserFloutControl.defaultStrategy.intValue();
                }
            }
        } catch (Throwable unused) {
        }
        return 1;
    }

    private a a(FloutNewConfigData floutNewConfigData, Intent intent, Uri uri, String str, String str2) {
        Integer num;
        FloutNewBrowserHostBean floutNewBrowserHostBean;
        boolean z;
        Map<String, Integer> map;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b959097d", new Object[]{this, floutNewConfigData, intent, uri, str, str2});
        }
        if (floutNewConfigData == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return new a(1);
        }
        if ("https".equals(str) || "http".equals(str)) {
            if (floutNewConfigData.browserFloutControl != null) {
                Map<String, FloutNewBrowserHostBean> map2 = floutNewConfigData.browserFloutControl.hostStrategyPlus;
                if (map2 != null && !map2.isEmpty() && (floutNewBrowserHostBean = map2.get(str2)) != null) {
                    Map<String, Integer> map3 = floutNewBrowserHostBean.pathStrategy;
                    String path = uri != null ? uri.getPath() : "";
                    if (map3 != null && !StringUtils.isEmpty(path)) {
                        for (Map.Entry<String, Integer> entry : map3.entrySet()) {
                            if (path.toLowerCase().startsWith(entry.getKey())) {
                                Integer value = entry.getValue();
                                c.a("linkx", "AppController.getStrategyAndProcessFlag. url=" + uri + ", strategy=" + value);
                                return new a(value.intValue());
                            }
                        }
                    }
                    if (floutNewBrowserHostBean.defaultStrategy != null) {
                        return new a(floutNewBrowserHostBean.defaultStrategy.intValue());
                    }
                }
                Map<String, Integer> map4 = floutNewConfigData.browserFloutControl.hostStrategy;
                if ((map2 == null || map2.isEmpty()) && map4 != null && (num = map4.get(str2)) != null) {
                    return new a(num.intValue());
                }
                if (floutNewConfigData.browserFloutControl.defaultStrategy != null) {
                    return new a(floutNewConfigData.browserFloutControl.defaultStrategy.intValue());
                }
            }
            return new a(1);
        } else if (floutNewConfigData.floutControl != null) {
            FloutNewConfigItemData floutNewConfigItemData = null;
            String str3 = null;
            int i = 1;
            boolean z2 = false;
            for (Map.Entry<String, FloutNewConfigItemData> entry2 : floutNewConfigData.floutControl.entrySet()) {
                str3 = entry2.getKey();
                floutNewConfigItemData = entry2.getValue();
                if (floutNewConfigItemData != null) {
                    Map<String, List<String>> map5 = floutNewConfigItemData.urlBlack;
                    if (map5 != null && uri != null && (list = map5.get(str)) != null && !list.isEmpty()) {
                        Iterator<String> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String lowerCase = uri.toString().toLowerCase();
                            if (lowerCase.startsWith((str + HttpConstant.SCHEME_SPLIT + it.next()).toLowerCase())) {
                                c.a("linkx", "AppController === Hit url black list, url=" + lowerCase);
                                i = 5;
                                z2 = true;
                                break;
                            }
                        }
                    }
                    Map<String, Map<String, Integer>> map6 = floutNewConfigItemData.schemeStrategy;
                    if (map6 != null && (map = map6.get(str)) != null) {
                        Integer num2 = map.get(str2);
                        if (num2 != null) {
                            i = num2.intValue();
                        } else {
                            Integer num3 = map.get("defaultStrategy");
                            if (num3 != null) {
                                i = num3.intValue();
                            }
                        }
                        z = true;
                        break;
                    }
                }
            }
            z = z2;
            a aVar = new a(i);
            if (z && floutNewConfigItemData != null) {
                if (floutNewConfigItemData.addNewTask) {
                    intent.addFlags(268435456);
                } else if (floutNewConfigItemData.needNewTask) {
                    intent.setFlags(268435456);
                }
                aVar.b = str3;
                aVar.c = floutNewConfigItemData.name;
            }
            return aVar;
        } else if (com.taobao.linkmanager.flowout.b.d()) {
            return new a(5);
        } else {
            return new a(1);
        }
    }

    public boolean a(Intent intent, FlowOutConfigData flowOutConfigData, String str) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e890c1e5", new Object[]{this, intent, flowOutConfigData, str})).booleanValue();
        }
        Uri data = intent.getData();
        if (a(intent, str, flowOutConfigData)) {
            return true;
        }
        c.a("linkx", "AppController === jumpProcess === data=" + data);
        if (data == null) {
            if (flowOutConfigData.floutWhiteList != null) {
                for (FloutWhiteListBean floutWhiteListBean : flowOutConfigData.floutWhiteList) {
                    String str2 = floutWhiteListBean.packageName;
                    if (!StringUtils.isEmpty(str2) && StringUtils.equals(str, str2)) {
                        c.a("linkx", "AppController === jumpProcess === 在包名白名单内，放过不拦截 === packageName：" + str);
                        e.a(d.ARG1_OUTGOING_AUTHORIZED, intent, str, 8);
                        return true;
                    }
                }
            }
        } else {
            String queryParameter = data.getQueryParameter(com.taobao.linkmanager.flowout.c.FL_OUT_ID);
            if (StringUtils.isEmpty(queryParameter)) {
                queryParameter = data.getQueryParameter(com.taobao.linkmanager.flowout.c.VISA);
            }
            String a2 = e.a(flowOutConfigData, data.getScheme());
            if (flowOutConfigData.floutIdEnable) {
                if (StringUtils.isEmpty(queryParameter)) {
                    c.a("linkx", "AppController === jumpProcess === flowOutId为空，进行拦截");
                    e.a(intent, a2, 3);
                    return false;
                } else if (e.a(a2, queryParameter, flowOutConfigData) && e.b(flowOutConfigData, data.getScheme())) {
                    c.a("linkx", "AppController === jumpProcess === 在flowOutId合法列表内，放过不拦截 === floutId=" + queryParameter);
                    e.a(d.ARG1_OUTGOING_AUTHORIZED, intent, a2, 5);
                    return true;
                } else {
                    i = 4;
                }
            } else if (e.b(flowOutConfigData, data.getScheme())) {
                c.a("linkx", "AppController === jumpProcess === 在APP白名单内，放过不拦截 === data=" + data);
                e.a(d.ARG1_OUTGOING_AUTHORIZED, intent, a2, 4);
                return true;
            }
            e.a(intent, a2, i);
        }
        return false;
    }

    public boolean a(Intent intent, String str, FlowOutConfigData flowOutConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fd46211", new Object[]{this, intent, str, flowOutConfigData})).booleanValue();
        }
        if (flowOutConfigData == null) {
            c.a("linkx", "AppController === jumpProcess === flowOutConfig配置为空,放过不拦截");
            e.a(d.ARG1_OUTGOING_AUTHORIZED, intent, str, 0);
            return true;
        } else if (e.a(intent, flowOutConfigData)) {
            c.a("linkx", "AppController === jumpProcess === 系统跳转行为，放过不拦截 === intent:" + intent);
            e.a(d.ARG1_OUTGOING_AUTHORIZED, intent, str, 1);
            return true;
        } else {
            String stringExtra = intent.getStringExtra("source");
            if (!StringUtils.isEmpty(stringExtra) && stringExtra.equals("sso_auth")) {
                c.a("linkx", "AppController === jumpProcess === 授权登录，放过不拦截 === source=" + stringExtra);
                e.a(d.ARG1_OUTGOING_AUTHORIZED, intent, str, 3);
                return true;
            }
            String stringExtra2 = intent.getStringExtra("jump_source");
            if (!StringUtils.isEmpty(stringExtra2) && StringUtils.equals("assistant", stringExtra2)) {
                c.a("linkx", "AppController === jumpProcess === 小助手，放过不拦截 === source=" + stringExtra2);
                e.a(d.ARG1_OUTGOING_AUTHORIZED, intent, str, 7);
                return true;
            }
            if (com.taobao.linkmanager.flowout.b.c()) {
                String stringExtra3 = intent.getStringExtra(com.taobao.linkmanager.flowout.c.FLOW_OUT_SOURCE);
                if (!StringUtils.isEmpty(stringExtra3) && StringUtils.equals("share", stringExtra3)) {
                    c.a("linkx", "AppController === jumpProcess === 分享，放过不拦截 === source=" + stringExtra3);
                    e.a(d.ARG1_OUTGOING_AUTHORIZED, intent, str, 9);
                    intent.removeExtra(com.taobao.linkmanager.flowout.c.FLOW_OUT_SOURCE);
                    return true;
                }
            }
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter(com.taobao.linkmanager.flowout.c.FL_OUT_ID);
                if (StringUtils.isEmpty(queryParameter)) {
                    queryParameter = data.getQueryParameter(com.taobao.linkmanager.flowout.c.VISA);
                }
                if (queryParameter != null && StringUtils.equals(com.taobao.linkmanager.flowout.c.LOGIN_VISA, queryParameter)) {
                    return true;
                }
                if (e.b(queryParameter, flowOutConfigData)) {
                    c.a("linkx", "AppController === jumpProcess === flowOutIdWhiteList白名单内，放过不拦截 === intent:" + intent);
                    e.a(d.ARG1_OUTGOING_AUTHORIZED, intent, str, 2);
                    return true;
                }
            }
            return false;
        }
    }
}
