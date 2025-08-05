package tb;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.constant.MessageConstant;
import com.heytap.msp.push.mode.MessageStat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public class cwa {
    static {
        kge.a(-259213364);
    }

    public static void a(Context context, MessageStat messageStat) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(messageStat);
        a(context, linkedList);
    }

    private static boolean a(Context context) {
        String b = cvf.a().b(context);
        return cwc.a(context, b) && cwc.b(context, b) >= 1017;
    }

    public static boolean a(Context context, List<MessageStat> list) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(list);
        cvy.a("isSupportStatisticByMcs:" + a(context) + ",list size:" + linkedList.size());
        if (linkedList.size() <= 0 || !a(context)) {
            return false;
        }
        return b(context, linkedList);
    }

    private static boolean b(Context context, List<MessageStat> list) {
        try {
            Intent intent = new Intent();
            intent.setAction(cvf.a().c(context));
            intent.setPackage(cvf.a().b(context));
            intent.putExtra("appPackage", context.getPackageName());
            intent.putExtra("type", MessageConstant.CommandId.COMMAND_STATISTIC);
            intent.putExtra("count", list.size());
            ArrayList<String> arrayList = new ArrayList<>();
            for (MessageStat messageStat : list) {
                arrayList.add(messageStat.toJsonObject());
            }
            intent.putStringArrayListExtra("list", arrayList);
            context.startService(intent);
            return true;
        } catch (Exception e) {
            cvy.b("statisticMessage--Exception" + e.getMessage());
            return false;
        }
    }
}
