package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.controller.a;
import com.taobao.wireless.link.model.ActivityIdTime;
import com.taobao.wireless.link.model.ActivityOutTime;
import com.taobao.wireless.link.model.BrandVersion;
import com.taobao.wireless.link.model.MessageData;
import com.taobao.wireless.link.model.SupportBrandVersion;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class rjw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(198787483);
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        String b = rkj.b();
        String a2 = rkj.a(context);
        if (!TextUtils.isEmpty(b)) {
            a2 = b;
        }
        rkg.a("link_tag", "AssistantUtils === getTag === tag=" + a2);
        return a2;
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            rkg.a("link_tag", "AssistantUtils === RequestOverlayPermission === 系统版本大于6.0，没有悬浮窗权限，申请权限");
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        if (TextUtils.isEmpty(rjt.a().c.b)) {
            rjt.a().c.b = rkk.a(context).a("link_in_common_local").get("tbVersion");
        }
        String str = rjt.a().b;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(rjt.a().c.b)) {
            rkg.a("link_tag", "AssistantUtils === isSupportAssistant === 不支持小助手能力,versionName=" + str + " double11Version=" + rjt.a().c.b);
            return false;
        } else if (rkj.a(str, rjt.a().c.b) == 1 && i(context)) {
            rkg.a("link_tag", "AssistantUtils === isSupportAssistant === 系统版本、手机厂商、手淘版本为:" + str + "，均支持小助手");
            return true;
        } else {
            rkg.a("link_tag", "AssistantUtils === isSupportAssistant === 不支持小助手能力");
            return false;
        }
    }

    private static boolean i(Context context) {
        List<BrandVersion> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a382c15c", new Object[]{context})).booleanValue();
        }
        SupportBrandVersion supportBrandVersion = rjt.a().c.e;
        if (supportBrandVersion == null) {
            try {
                supportBrandVersion = (SupportBrandVersion) rkk.a(context).b("supportBrandVersion", new SupportBrandVersion());
            } catch (Exception e) {
                rkg.a("link_tag", "AssistantUtils === isInAdapterPhone === 获取小助手支持的品牌和系统版本异常=" + e.getMessage());
            }
        }
        if (supportBrandVersion != null && (list = supportBrandVersion.supportBrandVersion) != null) {
            for (BrandVersion brandVersion : list) {
                if (brandVersion.brand.contains(Build.MANUFACTURER.toLowerCase()) && brandVersion.version.contains(Build.VERSION.RELEASE)) {
                    rkg.a("link_tag", "AssistantUtils === isInAdapterPhone === 系统版本为：" + Build.VERSION.RELEASE + " 手机厂商为：" + Build.MANUFACTURER.toLowerCase() + "，支持小助手功能");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(Context context, Map<String, String> map) {
        List<ActivityOutTime> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8df32b29", new Object[]{context, map})).booleanValue();
        }
        ActivityIdTime d = d(context);
        rkg.a("link_tag", "AssistantUtils === isOutDate === activityTimeLIst=" + d);
        if (d.activities != null && (list = d.activities) != null) {
            Set<String> keySet = map.keySet();
            for (ActivityOutTime activityOutTime : list) {
                for (String str : keySet) {
                    if (TextUtils.equals(str, activityOutTime.id) && a(activityOutTime.outTime)) {
                        rkg.a("link_tag", "AssistantUtils === isOutDate === activity.id=" + activityOutTime.id + " activity.outTime=" + activityOutTime.outTime);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static ActivityIdTime d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityIdTime) ipChange.ipc$dispatch("becae93a", new Object[]{context});
        }
        try {
            if (rjt.a().c.d == null) {
                rjt.a().c.d = (ActivityIdTime) rkk.a(context).b("activityOutTime", new ActivityIdTime());
            }
        } catch (Exception e) {
            rkg.a("link_tag", "AssistantUtils === getActivityTimeLIst === 获取活动过期时间异常=" + e.getMessage());
        }
        return rjt.a().c.d;
    }

    public static boolean a(Long l) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5ed6d4ab", new Object[]{l})).booleanValue() : rkj.a() < l.longValue();
    }

    public static String a(Context context, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9be5d265", new Object[]{context, messageData});
        }
        String str = (messageData == null || TextUtils.isEmpty(messageData.assistant_logo_url)) ? "https://gw.alicdn.com/tfs/TB1L9v4qlv0gK0jSZKbXXbK2FXa-160-160.png" : messageData.assistant_logo_url;
        rjv a2 = a(context, rkk.a(context), a(context), messageData.activity_id);
        if (a2 != null && !TextUtils.isEmpty(a2.c)) {
            str = a2.c;
        }
        rkg.a("link_tag", "DisplayCenter === getDefaultUrl === 获取到的默认URL=" + str);
        return str;
    }

    public static long a(MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a748797", new Object[]{messageData})).longValue();
        }
        if (messageData != null && messageData.assistant_animation_time > 0) {
            return messageData.assistant_animation_time;
        }
        return 8000L;
    }

    public static boolean b(Context context, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccfc64be", new Object[]{context, messageData})).booleanValue();
        }
        try {
            List<ActivityOutTime> list = d(context).activities;
            if (list != null) {
                for (ActivityOutTime activityOutTime : list) {
                    if (TextUtils.equals(activityOutTime.id, messageData.activity_id) && rkj.a() < activityOutTime.outTime.longValue()) {
                        return false;
                    }
                }
            }
        } catch (Exception e) {
            rkg.a("link_tag", "AssistantUtils === isActivityExpired === 消息对应活动是否过期比对异常" + e.getMessage());
        }
        return true;
    }

    public static Map<String, String> e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1089f411", new Object[]{context});
        }
        Map<String, String> map = rju.a().f33188a;
        if (map != null) {
            return map;
        }
        rkk a2 = rkk.a(context);
        return a2.a("growth_assistant_activityList_" + a(context));
    }

    public static void a(rkk rkkVar, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38435289", new Object[]{rkkVar, map, str});
        } else if (map == null) {
        } else {
            rju.a().f33188a = map;
            if (rkkVar == null) {
                return;
            }
            rkkVar.a("growth_assistant_activityList_" + str, map);
        }
    }

    public static void a(rkk rkkVar, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cf92281", new Object[]{rkkVar, messageData});
            return;
        }
        a.a().c = messageData;
        rkkVar.a("growth_assistant_message_needshow", messageData);
    }

    public static MessageData a(rkk rkkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageData) ipChange.ipc$dispatch("48afd88b", new Object[]{rkkVar});
        }
        MessageData messageData = a.a().c;
        return messageData == null ? (MessageData) rkkVar.b("growth_assistant_message_needshow", new MessageData()) : messageData;
    }

    public static void b(rkk rkkVar, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528d2b82", new Object[]{rkkVar, messageData});
            return;
        }
        a.a().d = messageData;
        rkkVar.a("growth_assistant_message_last", messageData);
    }

    public static MessageData b(rkk rkkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageData) ipChange.ipc$dispatch("49e62b6a", new Object[]{rkkVar});
        }
        MessageData messageData = a.a().d;
        return messageData == null ? (MessageData) rkkVar.b("growth_assistant_message_last", new MessageData()) : messageData;
    }

    public static void c(rkk rkkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da38e948", new Object[]{rkkVar});
            return;
        }
        d(rkkVar);
        e(rkkVar);
    }

    public static void d(rkk rkkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bbefc9", new Object[]{rkkVar});
            return;
        }
        a.a().c = null;
        rkkVar.b("growth_assistant_message_needshow");
    }

    public static void e(rkk rkkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73ef64a", new Object[]{rkkVar});
            return;
        }
        a.a().d = null;
        rkkVar.b("growth_assistant_message_last");
    }

    public static void a(rkk rkkVar, String str, String str2, rjv rjvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0212ccc", new Object[]{rkkVar, str, str2, rjvVar});
        } else if (rju.a().b == null || rjvVar == null) {
        } else {
            rju.a().b.put(str, rjvVar);
            if (rkkVar == null) {
                return;
            }
            rkkVar.a(str + "_" + str2, rjvVar);
        }
    }

    public static rjv a(Context context, rkk rkkVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rjv) ipChange.ipc$dispatch("38841a76", new Object[]{context, rkkVar, str, str2});
        }
        rjv rjvVar = new rjv();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            rkg.a("link_tag", "AssistantUtils === getAssistantData === tag或者id为空,返回默认对象");
            return rjvVar;
        }
        if (rju.a().b != null || rju.a().b.size() > 0) {
            rjvVar = rju.a().b.get(str2);
        }
        if (rjvVar != null && !TextUtils.isEmpty(rjvVar.b)) {
            return rjvVar;
        }
        return (rjv) rkkVar.b(str2 + "_" + str, new rjv());
    }

    public static void a(Context context, rkk rkkVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da723288", new Object[]{context, rkkVar, str});
            return;
        }
        String a2 = a(context);
        if (rju.a().b == null || rju.a().b.size() == 0) {
            rju a3 = rju.a();
            rkk a4 = rkk.a(context);
            a3.b = (Map) a4.b(str + "_" + a2, new HashMap());
        }
        rju.a().b.remove(str);
        rkkVar.b(str + "_" + a2);
    }

    public static void a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
            return;
        }
        rju.a().c.put(str, str3);
        rkk a2 = rkk.a(context);
        a2.a("growth_assistant_updateTime_" + str2, rju.a().c);
    }

    public static Map<String, String> a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a75136df", new Object[]{context, str});
        }
        if (rju.a().c != null && rju.a().c.size() == 0) {
            rju a2 = rju.a();
            rkk a3 = rkk.a(context);
            a2.c = a3.a("growth_assistant_updateTime_" + str);
        }
        return rju.a().c;
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        String a2 = a(context);
        if (rju.a().c == null || rju.a().c.size() == 0) {
            rju a3 = rju.a();
            rkk a4 = rkk.a(context);
            a3.c = a4.a("growth_assistant_updateTime_" + a2);
        }
        rju.a().c.remove(str);
        rkk a5 = rkk.a(context);
        a5.b("growth_assistant_updateTime_" + a2);
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a17cbe7f", new Object[]{context})).booleanValue();
        }
        boolean g = g(context);
        boolean h = h(context);
        if (!g || !h) {
            rkg.a("link_tag", "AssistantUtils === startAndShowAssistant === assistantSwitchShow=" + g + "  assistantSwitchOpen=" + h);
            return false;
        }
        Map<String, String> e = e(context);
        if (e == null || e.size() == 0) {
            rkg.a("link_tag", "AssistantUtils === startAndShowAssistant === 本地存储的活动信息为空");
            return false;
        } else if (!a(context, e)) {
            rkg.a("link_tag", "AssistantUtils === startAndShowAssistant === 本地存储的活动，全部过期");
            return false;
        } else if (rkj.c(context)) {
            return c(context);
        } else {
            rkg.a("link_tag", "AssistantUtils === startAndShowAssistant === 没有权限，不显示小助手");
            return false;
        }
    }

    public static void a(Context context, rkk rkkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f485c3e", new Object[]{context, rkkVar});
            return;
        }
        String a2 = a(context);
        a.a().l = "true";
        a.a().m = "true";
        rkkVar.a("growth_assistant_switch_show_" + a2, "true");
        rkkVar.a("growth_assistant_switch_open_" + a2, "true");
        rkg.a("link_tag", "AssistantUtils === writeSwitch === isAssistantSwitchShow=" + a.a().l + "  isAssistantSwitchOpen=" + a.a().m);
    }

    public static boolean g(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{context})).booleanValue();
        }
        try {
            str = a.a().l;
            if (TextUtils.isEmpty(str)) {
                String a2 = a(context);
                rkk a3 = rkk.a(context);
                str = (String) a3.b("growth_assistant_switch_show_" + a2, "false");
            }
            rkg.a("link_tag", "AssistantUtils === isShowSwitch === isShowSwitch=" + str);
        } catch (Exception e) {
            rkg.a("link_tag", "AssistantUtils === isShowSwitch === isShowSwitch解析异常=" + e);
        }
        return TextUtils.equals("true", str);
    }

    public static boolean h(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2d615bd", new Object[]{context})).booleanValue();
        }
        try {
            str = a.a().m;
            if (TextUtils.isEmpty(str)) {
                String a2 = a(context);
                rkk a3 = rkk.a(context);
                str = (String) a3.b("growth_assistant_switch_open_" + a2, "false");
            }
            rkg.a("link_tag", "AssistantUtils === isShowSwitch === isSwitchOpen=" + str);
        } catch (Exception e) {
            rkg.a("link_tag", "AssistantUtils === isShowSwitch === isSwitchOpen解析异常=" + e);
        }
        return TextUtils.equals("true", str);
    }
}
