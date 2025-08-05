package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.c;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class olt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACCS_TARGET_WITH_TOPIC_SWITCH = "accs_target_with_topic";
    public static final String MTOP_API_SWITCH = "mtop_api_namespace";
    public static final String NORMAL_SWITCH = "pm_normal_switch";
    public static final String STREAM_MESSAGE_CACHE_SIZE = "stm_msg_cache_size";

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f32160a;
    private static final Map<String, List<Integer>> b;
    private static Boolean c;

    static {
        kge.a(1480769731);
        f32160a = null;
        b = new ConcurrentHashMap();
        c = null;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        boolean parseBoolean = Boolean.parseBoolean(c.a(ACCS_TARGET_WITH_TOPIC_SWITCH, "false"));
        MsgLog.a("OrangeAdapter", "isRmTargetTopicEnabled: " + parseBoolean);
        return parseBoolean;
    }

    public static boolean a(int i, String str, String str2) {
        boolean contains;
        Map<String, List<Integer>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81145733", new Object[]{new Integer(i), str, str2})).booleanValue();
        }
        synchronized (b) {
            List<Integer> list = b.get(str);
            if (list == null) {
                list = new ArrayList<>();
                try {
                    String a2 = c.a(str, str2);
                    MsgLog.a("OrangeAdapter", "getAvailableByNamespace: " + a2);
                    if (!TextUtils.isEmpty(a2)) {
                        for (String str3 : a2.split(",")) {
                            list.add(Integer.valueOf(Integer.parseInt(str3)));
                        }
                    }
                    map = b;
                } catch (Exception e) {
                    MsgLog.c("OrangeAdapter", e, "getAvailableByNamespace err");
                    map = b;
                }
                map.put(str, list);
            }
            contains = list.contains(Integer.valueOf(i));
        }
        return contains;
    }

    public static boolean a(Context context) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            bool = (Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context});
        } else {
            if (f32160a == null) {
                try {
                    f32160a = Boolean.valueOf("com.taobao.taobao".equals(context.getPackageName()));
                } catch (Exception e) {
                    MsgLog.c("OrangeAdapter", e, "isTaobao err");
                    return true;
                }
            }
            bool = f32160a;
        }
        return bool.booleanValue();
    }

    public static boolean b() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            bool = (Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0]);
        } else {
            if (c == null) {
                c = Boolean.valueOf(Boolean.parseBoolean(c.a(NORMAL_SWITCH, "true")));
                MsgLog.a("OrangeAdapter", "normalChangesEnabled: " + c);
            }
            bool = c;
        }
        return bool.booleanValue();
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue();
        }
        int i = 1000;
        try {
            i = Integer.parseInt(c.a(STREAM_MESSAGE_CACHE_SIZE, String.valueOf(1000)));
            MsgLog.a("OrangeAdapter", "getStreamMsgCacheSize: " + i);
            return i;
        } catch (Throwable th) {
            th.printStackTrace();
            return i;
        }
    }
}
