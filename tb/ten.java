package tb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.j;
import com.taobao.android.litecreator.util.u;
import com.taobao.android.pissarro.remote.TaopaiLoadConfig;
import com.taobao.android.pissarro.remote.b;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.taobao.R;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import tb.ten;

/* loaded from: classes9.dex */
public class ten {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public interface a {
        void a();

        void a(String str, String str2);
    }

    static {
        kge.a(-698654406);
    }

    public static void a(Context context, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccef5a40", new Object[]{context, str, aVar});
        } else if (!a(context)) {
            aVar.a("-2", "base env not support");
        } else if (a(str, false)) {
            aVar.a();
            ref.a(str, false);
        } else {
            a(context, str, false, null, aVar);
            ref.a(str, true);
        }
    }

    public static boolean a(Context context, String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("425c5feb", new Object[]{context, str, intent})).booleanValue();
        }
        if (!a(context)) {
            return false;
        }
        if (!a(str, false)) {
            ref.a(str, true);
            a(context, str, false, intent, null);
            return false;
        }
        ref.a(str, false);
        return true;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        u.d("RemoteEnvUtil", "当前机型为：" + Build.MODEL);
        if (Build.VERSION.SDK_INT < 21) {
            hfj.a(context, "安卓系统版本太低，请升级到5.0及以上");
            u.d("RemoteEnvUtil", "淘拍暂不支持当前系统版本：" + Build.VERSION.SDK_INT);
            return false;
        } else if (tek.j()) {
            hfj.a(context, "该设备暂不支持发布，请更换设备");
            u.d("RemoteEnvUtil", "在 orange 黑名单中");
            return false;
        } else if (!j.g(context)) {
            return true;
        } else {
            hfj.a(context, "您的设备架构过低，建议您更换设备后再发布噢");
            u.d("RemoteEnvUtil", "32位包/设备暂不支持发布，请更换");
            UmiPublishMonitor.a().b("start", "7003", "open_page_cpu_not_suport", "cpu<=v7");
            return false;
        }
    }

    public static boolean a(String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            z2 = b.c();
            str2 = "";
        } catch (Throwable th) {
            String message = th.getMessage();
            th.printStackTrace();
            str2 = message;
        }
        if (!z2) {
            UmiPublishMonitor a2 = UmiPublishMonitor.a();
            String str3 = z ? "open_page_remote_module_not_ready_check" : "open_page_remote_module_not_ready";
            a2.b("start", "7002", str3, str + "|" + str2);
        }
        return z2;
    }

    private static void a(Context context, String str, boolean z, Intent intent, a aVar) {
        TaopaiLoadConfig b;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f6577d", new Object[]{context, str, new Boolean(z), intent, aVar});
            return;
        }
        try {
            if (z) {
                b = a(context, str);
            } else if (intent != null) {
                b = b(context, str, intent);
            } else {
                b = b(context, str, aVar);
            }
            if (z) {
                z2 = false;
            }
            b.a(context, b, z2, "litecreator");
        } catch (Throwable th) {
            String str2 = str + th.getMessage();
            th.printStackTrace();
            if (aVar != null) {
                aVar.a("-1", str2);
            }
            if (!z) {
                hfj.a(context, context.getResources().getString(R.string.gg_pub_shooting_module_load_failed_retry));
            }
            UmiPublishMonitor.a().a("start", "7001", "open_page_remote_module_init_fail", str2);
        }
    }

    private static TaopaiLoadConfig b(Context context, String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaopaiLoadConfig) ipChange.ipc$dispatch("5f27a5de", new Object[]{context, str, aVar});
        }
        TaopaiLoadConfig a2 = new TaopaiLoadConfig.a().c(context.getResources().getString(R.string.gg_pub_shooting_module_load_failed_retry)).b(StringUtils.equals(str, "guangguang")).c(true).a(false).a("guangguang").b(str).a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action.taopai.load.success");
        intentFilter.addAction("action.taopai.load.fail");
        LocalBroadcastManager.getInstance(context).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.umipublish.util.RemoteEnvUtil$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (intent == null || intent.getAction() == null) {
                } else {
                    String action = intent.getAction();
                    char c = 65535;
                    int hashCode = action.hashCode();
                    if (hashCode != -1217748570) {
                        if (hashCode == 860620923 && action.equals("action.taopai.load.success")) {
                            c = 0;
                        }
                    } else if (action.equals("action.taopai.load.fail")) {
                        c = 1;
                    }
                    if (c == 0) {
                        ten.a aVar2 = ten.a.this;
                        if (aVar2 != null) {
                            aVar2.a();
                        }
                        UmiPublishMonitor.a("taopai_remote", "BROADCAST_SUCCESS_ACTION");
                    } else if (c == 1) {
                        String str3 = null;
                        if (intent.getExtras() != null) {
                            str3 = intent.getStringExtra("error_code");
                            str2 = intent.getStringExtra(MUSAppMonitor.ERROR_MSG);
                        } else {
                            str2 = null;
                        }
                        ten.a aVar3 = ten.a.this;
                        if (aVar3 != null) {
                            aVar3.a(str3, str2);
                        }
                        UmiPublishMonitor.a("taopai_remote", "init fail=" + str3 + " " + str2);
                        UmiPublishMonitor.a().a("start", "7001", "open_page_remote_module_init_fail", str2);
                    }
                    LocalBroadcastManager.getInstance(context2).unregisterReceiver(this);
                }
            }
        }, intentFilter);
        return a2;
    }

    private static TaopaiLoadConfig b(Context context, String str, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaopaiLoadConfig) ipChange.ipc$dispatch("a9433c5", new Object[]{context, str, intent}) : new TaopaiLoadConfig.a().c(context.getResources().getString(R.string.gg_pub_shooting_module_load_failed_retry)).b(StringUtils.equals(str, "guangguang")).a(false).c(true).a(intent).a("guangguang").b(str).a();
    }

    private static TaopaiLoadConfig a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaopaiLoadConfig) ipChange.ipc$dispatch("49f22b29", new Object[]{context, str}) : new TaopaiLoadConfig.a().a(false).b(false).c(true).a("guangguang").b(str).a();
    }
}
