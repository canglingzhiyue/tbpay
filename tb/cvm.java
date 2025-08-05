package tb;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.McsEventConstant;
import com.heytap.msp.push.HeytapPushManager;
import com.heytap.msp.push.constant.ConfigConstant;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.NotificationSortMessage;
import com.heytap.msp.push.notification.ISortListener;
import com.heytap.msp.push.notification.PushNotification;
import com.heytap.msp.push.statis.StatisticUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class cvm {
    private int c;
    private int d;
    private int f;
    private int g;

    /* renamed from: a  reason: collision with root package name */
    private int f26553a = 3;
    private List<NotificationSortMessage> b = new ArrayList();
    private List<String> e = new ArrayList();

    /* loaded from: classes4.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final cvm f26554a;

        static {
            kge.a(899323121);
            f26554a = new cvm();
        }
    }

    static {
        kge.a(703260702);
    }

    private int a(List<NotificationSortMessage> list, int i) {
        int size = list == null ? 0 : list.size();
        if (i <= 0 || size == 0) {
            return i;
        }
        if (size < i) {
            int i2 = i - size;
            list.clear();
            return i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            list.remove((size - 1) - i3);
        }
        return 0;
    }

    private DataMessage a(Context context, NotificationSortMessage notificationSortMessage) {
        DataMessage dataMessage = new DataMessage(context.getPackageName(), notificationSortMessage.getMessageId());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isMcs", "false");
            String statisticData = notificationSortMessage.getStatisticData();
            if (!TextUtils.isEmpty(statisticData)) {
                jSONObject.put("clientStatisticData", statisticData);
            }
            dataMessage.setStatisticsExtra(jSONObject.toString());
        } catch (JSONException unused) {
        }
        return dataMessage;
    }

    public static cvm a() {
        return a.f26554a;
    }

    private void a(int i) {
        if (i == 7) {
            this.c++;
        } else if (i != 5) {
        } else {
            this.d++;
        }
    }

    private void a(NotificationManager notificationManager, Context context) {
        a(cvl.a(notificationManager, context.getPackageName()));
    }

    private void a(Context context, NotificationManager notificationManager, int i) {
        a(this.b, i);
        a(context, notificationManager, this.b);
    }

    private void a(Context context, NotificationManager notificationManager, List<NotificationSortMessage> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList();
        a(context, notificationManager, jSONArray, list, arrayList);
        if (jSONArray.length() != 0) {
            try {
                jSONObject.put("SORT_ARRAY", jSONArray);
                HeytapPushManager.cancelNotification(jSONObject);
            } catch (JSONException unused) {
            }
        }
        if (arrayList.size() == 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(McsEventConstant.EventId.EVENT_ID_PUSH_DELETE_BY_FOLD, arrayList);
        StatisticUtils.statisticEvent(context, hashMap);
    }

    private void a(Context context, NotificationManager notificationManager, JSONArray jSONArray, List<NotificationSortMessage> list, List<DataMessage> list2) {
        for (NotificationSortMessage notificationSortMessage : list) {
            if (notificationSortMessage.isMcs()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ConfigConstant.NotificationSort.EXTRA_MESSAGE_ID, notificationSortMessage.getMessageId());
                    jSONObject.put(ConfigConstant.NotificationSort.EXTRA_NOTIFY_ID, notificationSortMessage.getNotifyId());
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                }
            } else {
                list2.add(a(context, notificationSortMessage));
                this.e.add(notificationSortMessage.getMessageId());
            }
            notificationManager.cancel(notificationSortMessage.getNotifyId());
        }
    }

    private void a(NotificationSortMessage notificationSortMessage) {
        if (notificationSortMessage.getAutoDelete() != 1) {
            return;
        }
        if (this.b.size() != 0) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                NotificationSortMessage notificationSortMessage2 = this.b.get(size);
                if (notificationSortMessage.getImportantLevel() >= notificationSortMessage2.getImportantLevel() && notificationSortMessage.getPostTime() >= notificationSortMessage2.getPostTime()) {
                    this.b.add(size + 1, notificationSortMessage2);
                    return;
                }
            }
        }
        this.b.add(0, notificationSortMessage);
    }

    private void a(ISortListener iSortListener, boolean z, PushNotification.Builder builder) {
        if (iSortListener != null) {
            iSortListener.buildCompleted(z, builder, this.e);
        }
    }

    private void a(PushNotification.Builder builder, NotificationSortMessage notificationSortMessage) {
        Bundle bundle = new Bundle();
        bundle.putInt(ConfigConstant.NotificationSort.EXTRA_AUTO_DELETE, notificationSortMessage.getAutoDelete());
        bundle.putInt(ConfigConstant.NotificationSort.EXTRA_IMPORTANT_LEVEL, notificationSortMessage.getImportantLevel());
        bundle.putString(ConfigConstant.NotificationSort.EXTRA_MESSAGE_ID, notificationSortMessage.getMessageId());
        bundle.putLong(ConfigConstant.NotificationSort.EXTRA_POST_TIME, System.currentTimeMillis());
        bundle.putBoolean(ConfigConstant.NotificationSort.EXTRA_IS_MCS, false);
        bundle.putString(ConfigConstant.NotificationSort.EXTRA_STATISTIC_DATA, notificationSortMessage.getStatisticData());
        if (Build.VERSION.SDK_INT >= 20) {
            builder.addExtras(bundle);
            builder.setGroup(notificationSortMessage.getGroup());
        }
    }

    private void a(StatusBarNotification[] statusBarNotificationArr) {
        b();
        if (statusBarNotificationArr == null || statusBarNotificationArr.length == 0) {
            return;
        }
        for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
            Bundle bundle = statusBarNotification.getNotification().extras;
            boolean z = bundle.getBoolean(ConfigConstant.NotificationSort.EXTRA_IS_MCS, true);
            long j = bundle.getLong(ConfigConstant.NotificationSort.EXTRA_POST_TIME, statusBarNotification.getPostTime());
            String string = bundle.getString(ConfigConstant.NotificationSort.EXTRA_MESSAGE_ID, "");
            int i = bundle.getInt(ConfigConstant.NotificationSort.EXTRA_AUTO_DELETE, 1);
            int i2 = bundle.getInt(ConfigConstant.NotificationSort.EXTRA_IMPORTANT_LEVEL, 7);
            NotificationSortMessage notificationSortMessage = new NotificationSortMessage(string, i2, i, z, j, statusBarNotification.getId(), bundle.getString(ConfigConstant.NotificationSort.EXTRA_STATISTIC_DATA));
            b(i);
            a(i2);
            a(notificationSortMessage);
        }
    }

    private boolean a(NotificationManager notificationManager, Context context, PushNotification.Builder builder, NotificationSortMessage notificationSortMessage) {
        StringBuilder sb;
        boolean z = true;
        if (this.f + this.g < this.f26553a) {
            if (notificationSortMessage.getAutoDelete() == -1) {
                sb = new StringBuilder();
                sb.append("mcs.");
            } else {
                sb = new StringBuilder();
                sb.append("mcs.enable.");
            }
            sb.append(context.getPackageName());
            notificationSortMessage.setGroup(sb.toString());
        } else if (notificationSortMessage.getAutoDelete() == -1) {
            notificationSortMessage.setGroup("mcs." + context.getPackageName());
            int i = this.f26553a - this.g;
            if (i > 0) {
                a(context, notificationManager, i - 1);
            } else {
                Notification a2 = cvl.a(context, notificationSortMessage.getGroup(), builder);
                if (a2 != null) {
                    notificationManager.notify(4096, a2);
                }
            }
        } else {
            z = a(context, notificationManager, notificationSortMessage);
        }
        if (z) {
            a(builder, notificationSortMessage);
        } else {
            cvu.a(context, McsEventConstant.EventId.EVENT_ID_PUSH_NO_SHOW_BY_FOLD, a(context, notificationSortMessage));
        }
        return z;
    }

    private boolean a(Context context, NotificationManager notificationManager, NotificationSortMessage notificationSortMessage) {
        int i = this.g;
        int i2 = this.f26553a;
        boolean z = false;
        if (i >= i2) {
            return false;
        }
        int i3 = i2 - i;
        if (notificationSortMessage.getImportantLevel() == 7 || (notificationSortMessage.getImportantLevel() != 5 ? this.c + this.d < i3 : this.c < i3)) {
            z = true;
        }
        if (z) {
            a(context, notificationManager, i3 - 1);
        }
        return z;
    }

    private boolean a(PushNotification.Builder builder, int i, int i2, String str, String str2) {
        Context n = cvf.a().n();
        if (builder == null || n == null) {
            return false;
        }
        NotificationManager a2 = cvl.a(n);
        NotificationSortMessage notificationSortMessage = new NotificationSortMessage(str, i2, i, false, System.currentTimeMillis(), str2);
        if (!a(n, a2, notificationSortMessage, builder)) {
            return true;
        }
        a(a2, n);
        return a(a2, n, builder, notificationSortMessage);
    }

    private void b() {
        this.f = 0;
        this.g = 0;
        this.c = 0;
        this.d = 0;
        this.b.clear();
        this.e.clear();
    }

    private void b(int i) {
        if (i == -1) {
            this.g++;
        } else if (i != 1) {
        } else {
            this.f++;
        }
    }

    public void a(PushNotification.Builder builder, ISortListener iSortListener) {
        if (builder == null) {
            return;
        }
        a(iSortListener, a(builder, builder.getAutoDelete(), builder.getImportantLevel(), builder.getMessageId(), builder.getStatisticData()), builder);
    }

    public boolean a(Context context, NotificationManager notificationManager, NotificationSortMessage notificationSortMessage, PushNotification.Builder builder) {
        if (notificationSortMessage.getAutoDelete() != 0 && Build.VERSION.SDK_INT >= 24 && Build.VERSION.SDK_INT < 30) {
            if (!cvl.a(notificationManager, context.getPackageName(), 4096)) {
                return true;
            }
            notificationSortMessage.setGroup("mcs." + context.getPackageName());
            a(builder, notificationSortMessage);
            return false;
        }
        return false;
    }
}
