package com.taobao.accs.utl;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.Message;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Random;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.jzv;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class NoTraceTriggerHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Random f8289a;
    public static int b;
    public static String c;
    public static String d;
    public static String e;
    public static BroadcastReceiver f;
    private static ScheduledFuture<?> g;
    private static a h;

    /* loaded from: classes.dex */
    public interface ChannelType {
        public static final int AGOO = 0;
        public static final int BAI_CHUAN = 1;
        public static final int UMENG = 2;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface Definition {
        }
    }

    public static /* synthetic */ ScheduledFuture a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("bd8a8b05", new Object[0]) : g;
    }

    static {
        kge.a(653679406);
        f8289a = new Random();
        b = 0;
        f = new BroadcastReceiver() { // from class: com.taobao.accs.utl.NoTraceTriggerHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private volatile long f8290a;

            public static /* synthetic */ long a(AnonymousClass1 anonymousClass1) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc7c5e70", new Object[]{anonymousClass1})).longValue() : anonymousClass1.f8290a;
            }

            public static /* synthetic */ long a(AnonymousClass1 anonymousClass1, long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("930fe7bc", new Object[]{anonymousClass1, new Long(j)})).longValue();
                }
                anonymousClass1.f8290a = j;
                return j;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(final Context context, final Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else {
                    com.taobao.accs.common.a.a().execute(new Runnable() { // from class: com.taobao.accs.utl.NoTraceTriggerHelper.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            int i;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            String action = intent.getAction();
                            ALog.i("trace", "onReceive action:" + action, new Object[0]);
                            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action)) {
                                i = 10;
                            } else if ("android.media.VOLUME_CHANGED_ACTION".equals(action)) {
                                i = 13;
                            } else if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action) || "android.bluetooth.device.action.ACL_DISCONNECTED".equals(action)) {
                                i = 15;
                            } else if ("android.intent.action.HEADSET_PLUG".equals(action)) {
                                i = 11;
                            } else if ("android.intent.action.MEDIA_MOUNTED".equals(action)) {
                                i = 12;
                            } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                                i = 5;
                            } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                                ALog.e("trace", "Trigger SCREEN_ON", new Object[0]);
                                i = 1;
                            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                                ALog.e("trace", "Trigger SCREEN_OFF", new Object[0]);
                                i = 3;
                            } else {
                                i = "android.intent.action.USER_PRESENT".equals(action) ? 2 : NoTraceTriggerHelper.c.equals(action) ? 0 : NoTraceTriggerHelper.d.equals(action) ? 7 : NoTraceTriggerHelper.e.equals(action) ? 14 : -1;
                            }
                            if (!"com.taobao.taobao".equals(context.getPackageName()) && l.b(context)) {
                                NoTraceTriggerHelper.a(context, null, 8, i);
                            }
                            if (!l.a(context)) {
                                return;
                            }
                            try {
                                if (StringUtils.isEmpty(l.n(context))) {
                                    return;
                                }
                                JSONObject jSONObject = new JSONObject(l.n(context));
                                int i2 = jSONObject.getInt(Constants.KEY_EVENT_COLLECT_RANDOM_TIME_LIMIT);
                                int i3 = jSONObject.getInt(Constants.KEY_EVENT_COLLECT_REPORT_INTERVAL);
                                JSONArray jSONArray = jSONObject.getJSONArray(Constants.KEY_EVENT_COLLECT_EVENT_ID_LIST);
                                int[] iArr = new int[jSONArray.length()];
                                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                                    iArr[i4] = ((Integer) jSONArray.get(i4)).intValue();
                                }
                                for (int i5 : iArr) {
                                    if (i5 == i) {
                                        final com.taobao.accs.net.c connection = com.taobao.accs.connection.d.getConnection(context, "default", true, 0);
                                        if (connection == null) {
                                            ALog.e("trace", "connection is null in channel", new Object[0]);
                                            return;
                                        } else if (System.currentTimeMillis() - AnonymousClass1.a(AnonymousClass1.this) < i3) {
                                            ALog.i("trace", "min interval", new Object[0]);
                                            return;
                                        } else {
                                            AnonymousClass1.a(AnonymousClass1.this, System.currentTimeMillis());
                                            final Message buildEventMessage = Message.buildEventMessage(i, System.currentTimeMillis(), connection.c(null), "default", context);
                                            com.taobao.accs.common.a.a().schedule(new Runnable() { // from class: com.taobao.accs.utl.NoTraceTriggerHelper.1.1.1
                                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    IpChange ipChange3 = $ipChange;
                                                    if (ipChange3 instanceof IpChange) {
                                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                        return;
                                                    }
                                                    ALog.i("trace", "send event request", "in channel process");
                                                    connection.a(buildEventMessage, true);
                                                }
                                            }, NoTraceTriggerHelper.f8289a.nextInt(i2), TimeUnit.MILLISECONDS);
                                            return;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                                ALog.e("trace", "send event request error", new Object[0]);
                            }
                        }
                    });
                }
            }
        };
        g = null;
        h = null;
    }

    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Bundle f8295a;
        private final long b;

        static {
            kge.a(-890662139);
            kge.a(-1390502639);
        }

        public a(long j, Bundle bundle) {
            this.b = j;
            this.f8295a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (System.currentTimeMillis() < this.b) {
                NoTraceTriggerHelper.a(jzv.a(), this.f8295a, false);
            } else if (NoTraceTriggerHelper.a() == null) {
            } else {
                NoTraceTriggerHelper.a().cancel(false);
            }
        }
    }

    public static void a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5110219", new Object[]{context, str, new Integer(i)});
        } else if ("com.taobao.taobao".equals(context.getPackageName()) || !l.b(context)) {
        } else {
            a(l.o(context), context, str, i, -1);
        }
    }

    public static void a(Context context, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd0fb40a", new Object[]{context, str, new Integer(i), new Integer(i2)});
        } else if ("com.taobao.taobao".equals(context.getPackageName()) || !l.b(context)) {
        } else {
            a(l.o(context), context, str, i, i2);
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        String packageName = context.getPackageName();
        if (StringUtils.isEmpty(c)) {
            c = packageName + "_" + f.ACTION_STATE_FORE;
        }
        if (StringUtils.isEmpty(d)) {
            d = packageName + "_" + f.ACTION_STATE_BACK;
        }
        if (StringUtils.isEmpty(e)) {
            e = packageName + "_ACTION_TP_TRIGGER";
        }
        intentFilter.addAction(c);
        intentFilter.addAction(d);
        intentFilter.addAction(e);
        intentFilter.setPriority(Integer.MAX_VALUE);
        context.registerReceiver(f, intentFilter);
        ALog.e("trace", "registerEventReceiver", new Object[0]);
    }

    public static void a(String str, Context context, String str2, int i, int i2) {
        int i3;
        String str3;
        JSONArray jSONArray;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i4;
        Context context2;
        int i5;
        String str9;
        final Context context3 = context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a429f480", new Object[]{str, context3, str2, new Integer(i), new Integer(i2)});
            return;
        }
        String str10 = "packageName";
        String str11 = "main";
        String str12 = "channel";
        String str13 = "type";
        String str14 = "trace";
        try {
            if (i == 4 || i == 3 || i == 6) {
                if (StringUtils.isEmpty(str2)) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("origin", context.getPackageName());
                bundle.putInt(str13, i);
                bundle.putInt(str12, b);
                bundle.putBoolean(str11, true);
                bundle.putString(str10, str2);
                a(context3, bundle, true);
                return;
            }
            try {
                JSONArray jSONArray2 = new JSONArray(str);
                if (jSONArray2.length() == 0) {
                    return;
                }
                int i6 = 0;
                while (i6 < jSONArray2.length()) {
                    JSONObject jSONObject = jSONArray2.getJSONObject(i6);
                    if (jSONObject != null) {
                        String string = jSONObject.getString("package");
                        final Bundle bundle2 = new Bundle();
                        jSONArray = jSONArray2;
                        bundle2.putString("origin", context.getPackageName());
                        bundle2.putInt(str13, i);
                        bundle2.putInt(str12, b);
                        bundle2.putBoolean(str11, true);
                        bundle2.putString(str10, string);
                        JSONArray jSONArray3 = jSONObject.getJSONArray(Constants.KEY_PULL_SCENE);
                        int[] iArr = new int[jSONArray3.length()];
                        str4 = str10;
                        str5 = str11;
                        for (int i7 = 0; i7 < jSONArray3.length(); i7++) {
                            iArr[i7] = ((Integer) jSONArray3.get(i7)).intValue();
                        }
                        int length = iArr.length;
                        int i8 = 0;
                        while (i8 < length) {
                            int i9 = iArr[i8];
                            int i10 = length;
                            if (i9 == 1 && i == 1) {
                                long currentTimeMillis = System.currentTimeMillis();
                                if (jSONObject.has(Constants.SP_KEY_LAST_TRIGGER_TIME)) {
                                    currentTimeMillis = jSONObject.getLong(Constants.SP_KEY_LAST_TRIGGER_TIME);
                                }
                                str7 = str12;
                                str8 = str13;
                                if (UtilityImpl.isSameDay(currentTimeMillis, System.currentTimeMillis())) {
                                    int i11 = jSONObject.getInt(Constants.KEY_TIMES);
                                    int i12 = jSONObject.has(Constants.SP_KEY_TRIGGER_TIMES) ? jSONObject.getInt(Constants.SP_KEY_TRIGGER_TIMES) : 0;
                                    if (i12 < i11) {
                                        i4 = i6;
                                        com.taobao.accs.common.a.a().schedule(new Runnable() { // from class: com.taobao.accs.utl.NoTraceTriggerHelper.2
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                IpChange ipChange2 = $ipChange;
                                                if (ipChange2 instanceof IpChange) {
                                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                                } else {
                                                    NoTraceTriggerHelper.a(context3, bundle2, false);
                                                }
                                            }
                                        }, f8289a.nextInt(jSONObject.getInt(Constants.KEY_DELAY_CEILING)), TimeUnit.SECONDS);
                                        jSONObject.put(Constants.SP_KEY_TRIGGER_TIMES, i12 + 1);
                                        jSONObject.put(Constants.SP_KEY_LAST_TRIGGER_TIME, System.currentTimeMillis());
                                    } else {
                                        i4 = i6;
                                    }
                                } else {
                                    i4 = i6;
                                    i3 = 0;
                                    try {
                                        jSONObject.put(Constants.SP_KEY_TRIGGER_TIMES, 0);
                                    } catch (Exception e2) {
                                        e = e2;
                                        str3 = str14;
                                        ALog.e(str3, "trigger error:", e, new Object[i3]);
                                    }
                                }
                            } else {
                                str7 = str12;
                                str8 = str13;
                                i4 = i6;
                                if (i9 != 2 || i != 8) {
                                    context2 = context;
                                    str6 = str14;
                                    if (i9 == 3 && i == 7) {
                                        long j = jSONObject.getLong(Constants.KEY_CYCLE_CUT_OFF_TIME);
                                        int i13 = jSONObject.getInt(Constants.KEY_CYCLE_INTERVAL);
                                        if (System.currentTimeMillis() < j) {
                                            if (h == null) {
                                                h = new a(j, bundle2);
                                            }
                                            if (g != null) {
                                                g.cancel(false);
                                            }
                                            g = com.taobao.accs.common.a.a().scheduleAtFixedRate(h, 0L, i13, TimeUnit.MINUTES);
                                        }
                                        context3 = context2;
                                        i6 = i4 + 1;
                                        str10 = str4;
                                        str11 = str5;
                                        str12 = str7;
                                        str13 = str8;
                                        str14 = str6;
                                        jSONArray2 = jSONArray;
                                    } else {
                                        i8++;
                                        length = i10;
                                        context3 = context2;
                                        i6 = i4;
                                        str12 = str7;
                                        str13 = str8;
                                        str14 = str6;
                                    }
                                } else if (i2 == 14) {
                                    ALog.e(str14, "do nothing", new Object[0]);
                                } else {
                                    JSONArray jSONArray4 = jSONObject.getJSONArray(Constants.KEY_EVENT_LIST);
                                    int[] iArr2 = new int[jSONArray4.length()];
                                    for (int i14 = 0; i14 < jSONArray4.length(); i14++) {
                                        iArr2[i14] = ((Integer) jSONArray4.get(i14)).intValue();
                                    }
                                    int length2 = iArr2.length;
                                    int i15 = 0;
                                    while (i15 < length2) {
                                        if (i2 == iArr2[i15]) {
                                            long currentTimeMillis2 = System.currentTimeMillis();
                                            if (jSONObject.has(Constants.SP_KEY_LAST_EVENT_TRIGGER_TIME)) {
                                                currentTimeMillis2 = jSONObject.getLong(Constants.SP_KEY_LAST_EVENT_TRIGGER_TIME);
                                            }
                                            i5 = length2;
                                            long j2 = currentTimeMillis2;
                                            str9 = str14;
                                            if (UtilityImpl.isSameDay(j2, System.currentTimeMillis())) {
                                                int i16 = jSONObject.getInt(Constants.KEY_EVENT_TIMES);
                                                int i17 = jSONObject.has(Constants.SP_KEY_EVENT_TRIGGER_TIMES) ? jSONObject.getInt(Constants.SP_KEY_EVENT_TRIGGER_TIMES) : 0;
                                                if (i17 < i16) {
                                                    a(context, bundle2, false);
                                                    jSONObject.put(Constants.SP_KEY_EVENT_TRIGGER_TIMES, i17 + 1);
                                                    jSONObject.put(Constants.SP_KEY_LAST_EVENT_TRIGGER_TIME, System.currentTimeMillis());
                                                }
                                            } else {
                                                jSONObject.put(Constants.SP_KEY_EVENT_TRIGGER_TIMES, 0);
                                            }
                                        } else {
                                            i5 = length2;
                                            str9 = str14;
                                        }
                                        i15++;
                                        length2 = i5;
                                        str14 = str9;
                                    }
                                }
                            }
                            context2 = context;
                            str6 = str14;
                            context3 = context2;
                            i6 = i4 + 1;
                            str10 = str4;
                            str11 = str5;
                            str12 = str7;
                            str13 = str8;
                            str14 = str6;
                            jSONArray2 = jSONArray;
                        }
                    } else {
                        jSONArray = jSONArray2;
                        str4 = str10;
                        str5 = str11;
                    }
                    str6 = str14;
                    str7 = str12;
                    str8 = str13;
                    i4 = i6;
                    context2 = context3;
                    context3 = context2;
                    i6 = i4 + 1;
                    str10 = str4;
                    str11 = str5;
                    str12 = str7;
                    str13 = str8;
                    str14 = str6;
                    jSONArray2 = jSONArray;
                }
                l.b(context3, jSONArray2.toString());
            } catch (Exception e3) {
                e = e3;
                str3 = str14;
                i3 = 0;
                ALog.e(str3, "trigger error:", e, new Object[i3]);
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public static void a(final Context context, final Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b295ce0", new Object[]{context, bundle, new Boolean(z)});
        } else if (z) {
            com.taobao.accs.common.a.a().execute(new Runnable() { // from class: com.taobao.accs.utl.NoTraceTriggerHelper.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NoTraceTriggerHelper.a(context, bundle);
                    }
                }
            });
        } else {
            a(context, bundle);
        }
    }

    public static void a(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f53e474", new Object[]{context, bundle});
            return;
        }
        String string = bundle.getString("packageName");
        d.a("accs", BaseMonitor.COUNT_VERIFY, "TriggerInstrumentation", mto.a.GEO_NOT_SUPPORT);
        if (a(context, string)) {
            return;
        }
        try {
            context.startInstrumentation(new ComponentName(string, "com.taobao.adaemon.TriggerInstrumentation"), null, bundle);
        } catch (Throwable th) {
            ALog.e("trace", "start trigger process error:", th, new Object[0]);
        }
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(str, c.channelService));
            return context.stopService(intent);
        } catch (Throwable th) {
            ALog.e("trace", "isTargetAlive err", th, new Object[0]);
            return true;
        }
    }
}
