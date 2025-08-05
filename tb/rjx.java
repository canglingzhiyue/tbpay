package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.wireless.link.controller.a;
import com.taobao.wireless.link.model.MessageData;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class rjx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f33194a;
    public static boolean b;

    static {
        kge.a(1722847189);
        f33194a = 0;
        b = false;
    }

    public static void a(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (rkj.a(3000L)) {
            rkg.a("link_tag", "NotificationBroadcastReceiver === onReceive 时间间隔小于5s，不处理");
        } else {
            MessageData b2 = rjw.b(rkk.a(context));
            boolean b3 = rjw.b(context, b2);
            if (TextUtils.isEmpty(b2.activity_id)) {
                b2.activity_id = rju.a().a(context);
            }
            if (b3) {
                str = a(context, "https%3A%2F%2Fm.taobao.com%2Findex.htm", b2.activity_id);
            } else if (!rkj.a(b2.msg_arrive_time, b2.validTime)) {
                str = a(context, "https%3A%2F%2Fm.taobao.com%2Findex.htm", "https%3A%2F%2Fm.taobao.com%2Findex.htm");
            } else {
                str = b2.assistant_click_url;
            }
            rkg.a("link_tag", "ClickCenter === performClick === 点击小助手，url=" + str);
            HashMap hashMap = new HashMap();
            hashMap.put("click_url", str);
            rki.a(rki.ARG1_ASSISTANT_CLICK, b2.activity_id, b2.message_id, hashMap);
            f33194a = ((Integer) rkk.a(context).b("growth_assistant_first_click_" + rjw.a(context), 0)).intValue();
            rkg.a("link_tag", "ClickCenter === performClick === 当前点击次数=" + f33194a);
            b = true;
            rkj.a(context, "tbopen://m.taobao.com/tbopen/index.html?source=auto&action=ali.open.nav&module=h5&bc_fl_src=growth_dhh_2200803434487_android-assistant-1069565676&h5Url=" + str, str, "assistant_" + b2.activity_id, b2.message_id);
            a(context, b2.activity_id);
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        boolean uri = Nav.from(context).toUri("http://m.taobao.com/go/mytaobaocommonsettings");
        rkg.a("link_tag", "ClickCenter === longClick === 跳设置页面结果=" + uri);
        String a2 = rju.a().a(context);
        rki.a(rki.ARG1_ASSISTANT_LONG_CLICK, a2, uri + "", new HashMap());
    }

    private static String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
        }
        rjv a2 = rjw.a(context, rkk.a(context), rjw.a(context), str2);
        return (a2 == null || TextUtils.isEmpty(a2.f33193a)) ? str : a2.f33193a;
    }

    private static void a(final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        String a2 = rjw.a(context);
        rkk a3 = rkk.a(context);
        final int intValue = ((Integer) a3.b("growth_assistant_toast_" + a2, 0)).intValue();
        rkg.a("link_tag", "ClickCenter === showToast === toast显示次数=" + intValue);
        if (intValue >= 3) {
            return;
        }
        rkk a4 = rkk.a(context);
        a4.a("growth_assistant_toast_" + a2, Integer.valueOf(intValue + 1));
        a.a().b().postDelayed(new Runnable() { // from class: tb.rjx.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Toast.makeText(context, "长按2秒前往关闭小助手", 1).show();
                String str2 = str;
                rki.a(rki.ARG1_ASSISTANT_TOAST, str2, intValue + "", new HashMap());
            }
        }, Constants.STARTUP_TIME_LEVEL_1);
    }
}
