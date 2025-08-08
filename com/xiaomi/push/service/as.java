package com.xiaomi.push.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.provider.Settings;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.push.ip;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes9.dex */
public class as {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f24646a = Log.isLoggable("NCHelper", 3);

    private static int a(NotificationChannel notificationChannel) {
        int i = 0;
        try {
            i = ((Integer) com.xiaomi.push.bh.b((Object) notificationChannel, "getUserLockedFields", new Object[0])).intValue();
            if (f24646a) {
                a("isUserLockedChannel:" + i + " " + notificationChannel);
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1617a("NCHelper", "is user locked error" + e);
        }
        return i;
    }

    private static NotificationChannel a(String str, NotificationChannel notificationChannel) {
        NotificationChannel notificationChannel2 = new NotificationChannel(str, notificationChannel.getName(), notificationChannel.getImportance());
        notificationChannel2.setDescription(notificationChannel.getDescription());
        notificationChannel2.enableVibration(notificationChannel.shouldVibrate());
        notificationChannel2.enableLights(notificationChannel.shouldShowLights());
        notificationChannel2.setSound(notificationChannel.getSound(), notificationChannel.getAudioAttributes());
        notificationChannel2.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
        return notificationChannel2;
    }

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("mipush_channel_copy_sp", 0);
    }

    public static String a(aw awVar, String str, CharSequence charSequence, String str2, int i, int i2, String str3, String str4) {
        String m2294a = awVar.m2294a(str);
        if (f24646a) {
            a("createChannel: appChannelId:" + m2294a + " serverChannelId:" + str + " serverChannelName:" + ((Object) charSequence) + " serverChannelDesc:" + str2 + " serverChannelNotifyType:" + i + " serverChannelName:" + ((Object) charSequence) + " serverChannelImportance:" + i2 + " channelSoundStr:" + str3 + " channelPermissions:" + str4);
        }
        NotificationChannel notificationChannel = new NotificationChannel(m2294a, charSequence, i2);
        notificationChannel.setDescription(str2);
        boolean z = false;
        notificationChannel.enableVibration((i & 2) != 0);
        if ((i & 4) != 0) {
            z = true;
        }
        notificationChannel.enableLights(z);
        if ((i & 1) == 0) {
            notificationChannel.setSound(null, null);
        } else if (!StringUtils.isEmpty(str3)) {
            if (str3.startsWith("android.resource://" + awVar.m2293a())) {
                notificationChannel.setSound(Uri.parse(str3), Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        if (f24646a) {
            a("create channel:" + notificationChannel);
        }
        a(awVar, notificationChannel, str4);
        return m2294a;
    }

    static void a(Context context, aw awVar, NotificationChannel notificationChannel, int i, String str) {
        if (i <= 0) {
            awVar.a(notificationChannel);
            return;
        }
        int a2 = com.xiaomi.push.g.a(context) >= 2 ? f.a(context.getPackageName(), str) : 0;
        NotificationChannel a3 = a(notificationChannel.getId(), notificationChannel);
        if ((i & 32) != 0) {
            if (notificationChannel.getSound() != null) {
                a3.setSound(null, null);
            } else {
                a3.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        if ((i & 16) != 0) {
            if (notificationChannel.shouldVibrate()) {
                a3.enableVibration(false);
            } else {
                a3.enableVibration(true);
            }
        }
        if ((i & 8) != 0) {
            if (notificationChannel.shouldShowLights()) {
                a3.enableLights(false);
            } else {
                a3.enableLights(true);
            }
        }
        if ((i & 4) != 0) {
            int importance = notificationChannel.getImportance() - 1;
            if (importance <= 0) {
                importance = 2;
            }
            a3.setImportance(importance);
        }
        if ((i & 2) != 0) {
            a3.setLockscreenVisibility(notificationChannel.getLockscreenVisibility() - 1);
        }
        awVar.a(a3);
        awVar.a(notificationChannel, true);
        f.a(awVar.m2293a(), notificationChannel.getId(), a2, 0);
    }

    public static void a(Context context, String str) {
        if (!com.xiaomi.push.j.m2118a(context) || StringUtils.isEmpty(str)) {
            return;
        }
        c(context, str);
        f.a(context, str);
    }

    private static void a(Context context, List<String> list) {
        if (f24646a) {
            a("deleteCopiedChannelRecord:" + list);
        }
        if (!list.isEmpty()) {
            SharedPreferences.Editor edit = a(context).edit();
            for (String str : list) {
                edit.remove(str);
            }
            edit.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ip ipVar) {
        if (ipVar == null || ipVar.f573a == null || !ipVar.f573a.containsKey("REMOVE_CHANNEL_MARK")) {
            return;
        }
        ipVar.f569a = 0;
        ipVar.f573a.remove(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_ID);
        ipVar.f573a.remove("channel_importance");
        ipVar.f573a.remove("channel_name");
        ipVar.f573a.remove("channel_description");
        ipVar.f573a.remove("channel_perm");
        com.xiaomi.channel.commonutils.logger.b.m1616a("delete channel info by:" + ipVar.f573a.get("REMOVE_CHANNEL_MARK"));
        ipVar.f573a.remove("REMOVE_CHANNEL_MARK");
    }

    private static void a(aw awVar, NotificationChannel notificationChannel, String str) {
        char c;
        int i;
        char c2;
        Context m2292a = awVar.m2292a();
        String id = notificationChannel.getId();
        String a2 = aw.a(id, awVar.m2293a());
        if (f24646a) {
            a("appChannelId:" + id + " oldChannelId:" + a2);
        }
        boolean z = true;
        if (com.xiaomi.push.j.m2118a(m2292a) && !StringUtils.equals(id, a2)) {
            NotificationManager notificationManager = (NotificationManager) m2292a.getSystemService(RemoteMessageConst.NOTIFICATION);
            NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(a2);
            NotificationChannel m2291a = awVar.m2291a(id);
            if (f24646a) {
                a("xmsfChannel:" + notificationChannel2);
                a("appChannel:" + m2291a);
            }
            if (notificationChannel2 != null) {
                NotificationChannel a3 = a(id, notificationChannel2);
                if (f24646a) {
                    a("copyXmsf copyXmsfChannel:" + a3);
                }
                if (m2291a != null) {
                    i = a(m2291a);
                    awVar.a(a3, i == 0);
                    c2 = 3;
                } else {
                    int a4 = a(notificationChannel2);
                    a(m2292a, awVar, a3, a4, notificationChannel2.getId());
                    i = a4;
                    c2 = 4;
                }
                b(m2292a, id);
                notificationManager.deleteNotificationChannel(a2);
                c = c2;
            } else if (m2291a == null) {
                if (f24646a) {
                    a("appHack createNotificationChannel:" + notificationChannel);
                }
                awVar.a(notificationChannel);
                c = 1;
                i = 0;
            } else if (!m2283a(m2292a, id) && a(notificationChannel, m2291a)) {
                if (f24646a) {
                    a("appHack updateNotificationChannel:" + notificationChannel);
                }
                int a5 = a(m2291a);
                awVar.a(notificationChannel, a5 == 0);
                i = a5;
                c = 2;
            }
            if (c != 1 && c != 4 && c != 3) {
                z = false;
            }
            f.a(awVar.m2292a(), awVar.m2293a(), id, notificationChannel.getImportance(), str, z, i);
        }
        NotificationChannel m2291a2 = awVar.m2291a(id);
        if (f24646a) {
            a("elseLogic getNotificationChannel:" + m2291a2);
        }
        if (m2291a2 == null) {
            awVar.a(notificationChannel);
        }
        c = 0;
        i = 0;
        if (c != 1) {
            z = false;
        }
        f.a(awVar.m2292a(), awVar.m2293a(), id, notificationChannel.getImportance(), str, z, i);
    }

    private static void a(String str) {
        com.xiaomi.channel.commonutils.logger.b.m1617a("NCHelper", str);
    }

    private static boolean a(NotificationChannel notificationChannel, NotificationChannel notificationChannel2) {
        boolean z;
        boolean z2 = false;
        if (notificationChannel == null || notificationChannel2 == null) {
            return false;
        }
        if (!StringUtils.equals(notificationChannel.getName(), notificationChannel2.getName())) {
            if (f24646a) {
                a("appHack channelConfigLowerCompare:getName");
            }
            z = true;
        } else {
            z = false;
        }
        if (!StringUtils.equals(notificationChannel.getDescription(), notificationChannel2.getDescription())) {
            if (f24646a) {
                a("appHack channelConfigLowerCompare:getDescription");
            }
            z = true;
        }
        if (notificationChannel.getImportance() != notificationChannel2.getImportance()) {
            notificationChannel.setImportance(Math.min(notificationChannel.getImportance(), notificationChannel2.getImportance()));
            if (f24646a) {
                a("appHack channelConfigLowerCompare:getImportance  " + notificationChannel.getImportance() + " " + notificationChannel2.getImportance());
            }
            z = true;
        }
        if (notificationChannel.shouldVibrate() != notificationChannel2.shouldVibrate()) {
            notificationChannel.enableVibration(false);
            if (f24646a) {
                a("appHack channelConfigLowerCompare:enableVibration");
            }
            z = true;
        }
        if (notificationChannel.shouldShowLights() != notificationChannel2.shouldShowLights()) {
            notificationChannel.enableLights(false);
            if (f24646a) {
                a("appHack channelConfigLowerCompare:enableLights");
            }
            z = true;
        }
        boolean z3 = notificationChannel.getSound() != null;
        if (notificationChannel2.getSound() != null) {
            z2 = true;
        }
        if (z3 != z2) {
            notificationChannel.setSound(null, null);
            if (f24646a) {
                a("appHack channelConfigLowerCompare:setSound");
            }
            z = true;
        }
        if (f24646a) {
            a("appHack channelConfigLowerCompare:isDifferent:" + z);
        }
        return z;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m2283a(Context context, String str) {
        if (f24646a) {
            a("checkCopeidChannel:newFullChannelId:" + str + "  " + a(context).getBoolean(str, false));
        }
        return a(context).getBoolean(str, false);
    }

    private static void b(Context context, String str) {
        if (f24646a) {
            a("recordCopiedChannel:" + str);
        }
        a(context).edit().putBoolean(str, true).apply();
    }

    private static void c(Context context, String str) {
        try {
            aw a2 = aw.a(context, str);
            Set<String> keySet = a(context).getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (String str2 : keySet) {
                if (a2.m2296a(str2)) {
                    arrayList.add(str2);
                    if (f24646a) {
                        a("delete channel copy record:" + str2);
                    }
                }
            }
            a(context, arrayList);
        } catch (Exception unused) {
        }
    }
}
