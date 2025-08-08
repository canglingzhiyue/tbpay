package com.taobao.taobao;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UTMini;
import com.taobao.agoo.TaobaoBaseIntentService;
import com.taobao.android.base.Versions;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.annotation.aspectjx.MethodSpy;
import com.taobao.message.notification.banner.InnerPushNotification;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.msgnotification.e;
import com.taobao.msgnotification.g;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.intent.IntentUtil;
import tb.kge;
import tb.msy;
import tb.mto;

/* loaded from: classes.dex */
public class TaobaoIntentService extends TaobaoBaseIntentService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(782447581);
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    public void onError(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12d9be22", new Object[]{this, context, str});
        }
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    public void onRegistered(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("214ccca", new Object[]{this, context, str});
        }
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService
    public void onUnregistered(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c11c11", new Object[]{this, context, str});
        }
    }

    @MethodSpy(name = "agooArrive")
    private static void a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9cc1d", new Object[]{context, intent});
            return;
        }
        String str = "";
        AppMonitor.Counter.commit("accs", "agoo_arrive_onmessage", str, mto.a.GEO_NOT_SUPPORT);
        TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_arrive_onmessage");
        TLog.loge("agoo_push", "agoo_arrive_onmessage" + VExecutors.currentThread().getName());
        try {
            str = intent.getStringExtra("id");
        } catch (Exception e) {
            TLog.loge("agoo_push", Log.getStackTraceString(e));
        }
        AppMonitor.Counter.commit("accs", "agoo_arrive_onmessage_id", str, mto.a.GEO_NOT_SUPPORT);
        TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_arrive_onmessage_id", null, null, null, "messageId=" + str);
        new a().execute(context, intent);
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    public void onMessage(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853839b6", new Object[]{this, context, intent});
        } else {
            a(context, intent);
        }
    }

    public static void a(Intent intent, Context context, boolean z) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260b47f1", new Object[]{intent, context, new Boolean(z)});
        } else if (context == null || intent == null) {
        } else {
            if (Versions.isDebug()) {
                TLog.loge("TaobaoIntentService", "agooExt:" + intent.getStringExtra(AgooConstants.MESSAGE_EXT));
            }
            try {
                JSONObject parseObject = JSONObject.parseObject(intent.getStringExtra(AgooConstants.MESSAGE_EXT));
                String string = parseObject.getString(Constants.KEY_CMD_TYPE);
                String string2 = parseObject.getString("cmdValue");
                if (StringUtils.equals(string, "1") && !StringUtils.isEmpty(string)) {
                    TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_recall_onmessage_id", Boolean.valueOf(g.a().a(string2)), null, null, "messageId=" + string2);
                    return;
                }
            } catch (Throwable th) {
                TLog.loge("TaobaoIntentService", Log.getStackTraceString(th));
                Log.e("TaobaoIntentService", "cmd handle error,e=" + th);
            }
            String str = "";
            try {
                str = intent.getStringExtra(AgooConstants.MESSAGE_BODY);
                TLog.loge("TaobaoIntentService", "TaobaoIntentService,onUserMessag=" + str);
            } catch (Throwable th2) {
                TLog.loge("TaobaoIntentService", Log.getStackTraceString(th2));
                Log.e("TaobaoIntentService", "onMessage get body error,e=" + th2);
            }
            try {
                jSONObject = JSONObject.parseObject(str);
            } catch (Throwable unused) {
                jSONObject = null;
            }
            if (c(jSONObject) && z) {
                TLog.loge("TaobaoIntentService", " isMessageBoxCanHandle and isProcessRight");
                new Intent().putExtra("taobao_msg_intent", intent);
                InnerPushNotification a2 = e.a(intent, Globals.getApplication());
                if (a2 != null) {
                    a2.show();
                }
            }
            if (d(jSONObject)) {
                TLog.loge("TaobaoIntentService", " isNotifyMessage");
            } else if (!msy.c(intent)) {
                TLog.loge("TaobaoIntentService", "agoo server notifPop enable false");
            } else {
                boolean a3 = g.a().a(intent, (Intent) null);
                TLog.loge("TaobaoIntentService", "TaobaoIntentService,notificationFlag=" + a3);
                if (a3) {
                    return;
                }
                Intent intent2 = new Intent("com.taobao.taobao.TAOBAO_AGOO_MSG_ACTION");
                intent2.putExtra("taobao_agoo_msg", str);
                Globals.getApplication().sendBroadcast(intent2);
            }
        }
    }

    private static boolean c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        if (d(jSONObject)) {
            return true;
        }
        if (StringUtils.isEmpty(jSONObject.getString("title"))) {
            return false;
        }
        if (a(jSONObject) > 0) {
            return true;
        }
        return b(jSONObject) > 0;
    }

    private static boolean d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("265ed169", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            Long l = jSONObject.getLong("notification_type");
            if (l != null) {
                if (l.longValue() > 1) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static long a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("266fb7c", new Object[]{jSONObject})).longValue();
        }
        if (jSONObject == null) {
            return -1L;
        }
        try {
            return e(jSONObject.getJSONObject(Constants.KEY_EXTS));
        } catch (Throwable th) {
            th.printStackTrace();
            return -1L;
        }
    }

    public static long b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63b9981b", new Object[]{jSONObject})).longValue();
        }
        if (jSONObject == null) {
            return -1L;
        }
        try {
            return f(jSONObject.getJSONObject(Constants.KEY_EXTS));
        } catch (Throwable th) {
            th.printStackTrace();
            return -1L;
        }
    }

    private static long e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87b16df8", new Object[]{jSONObject})).longValue();
        }
        if (jSONObject == null || !jSONObject.containsKey("msg_type_id")) {
            return -1L;
        }
        long parseLong = Long.parseLong(jSONObject.getString("msg_type_id"));
        if (parseLong <= 0) {
            return -1L;
        }
        return parseLong;
    }

    private static long f(JSONObject jSONObject) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9040a97", new Object[]{jSONObject})).longValue();
        }
        if (jSONObject != null && jSONObject.containsKey("bizType") && (l = jSONObject.getLong("bizType")) != null) {
            return l.longValue();
        }
        return -1L;
    }

    /* loaded from: classes8.dex */
    public static class a extends AsyncTask<Object, Void, Object[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-436030364);
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.Object[]] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Object[] doInBackground(Object[] objArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, objArr});
            } else {
                b(objArr);
            }
        }

        public Object[] a(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Object[]) ipChange.ipc$dispatch("10c1abea", new Object[]{this, objArr});
            }
            Context context = (Context) objArr[0];
            Intent intent = (Intent) objArr[1];
            try {
                JSONObject parseObject = JSONObject.parseObject(intent.getStringExtra(AgooConstants.MESSAGE_EXT));
                String string = parseObject.getString(Constants.KEY_CMD_TYPE);
                String string2 = parseObject.getString("cmdValue");
                if (StringUtils.equals(string, "1") && !StringUtils.isEmpty(string)) {
                    boolean a2 = g.a().a(string2);
                    Boolean valueOf = Boolean.valueOf(a2);
                    TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_recall_onmessage_id", valueOf, null, null, "messageId=" + string2);
                    if (a2) {
                        return null;
                    }
                }
            } catch (Throwable th) {
                TLog.loge("TaobaoIntentService", Log.getStackTraceString(th));
                Log.e("TaobaoIntentService", "cmd handle error,e=" + th);
            }
            if (EnvUtil.isProcessRight(context)) {
                Intent createComandIntent = IntentUtil.createComandIntent(context, "commandSoundProcess");
                createComandIntent.putExtra("intentKey", intent);
                Globals.getApplication().sendBroadcast(createComandIntent);
                TLog.loge("TaobaoIntentService", " processed in mainprocess");
                return null;
            }
            TLog.loge("TaobaoIntentService", " not processed in mainprocess");
            return objArr;
        }

        public void b(Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b232c4a8", new Object[]{this, objArr});
            } else if (objArr == null) {
            } else {
                TaobaoIntentService.a((Intent) objArr[1], (Context) objArr[0], false);
            }
        }
    }
}
