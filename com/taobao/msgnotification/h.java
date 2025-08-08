package com.taobao.msgnotification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.taobao.util.k;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UTMini;
import com.taobao.agoo.TaobaoConstants;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.message.notification.banner.support.MarketingInnerNotificationAdapter;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.intent.IntentUtil;
import tb.kge;
import tb.mtb;
import tb.mto;
import tb.riy;

/* loaded from: classes7.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final List<a> c;

    /* renamed from: a  reason: collision with root package name */
    private Context f18278a;
    private Map<String, String> b = new HashMap();

    /* loaded from: classes7.dex */
    public interface a {
        PendingIntent process(Context context, Bundle bundle, int i);
    }

    static {
        kge.a(1194374918);
        c = new CopyOnWriteArrayList();
    }

    public h(Context context) {
        this.f18278a = null;
        this.f18278a = context;
        this.b.put("showLoc", "0");
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b82048", new Object[]{aVar});
        } else {
            c.add(aVar);
        }
    }

    public static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("465ff3c9", new Object[]{aVar});
        } else {
            c.remove(aVar);
        }
    }

    public final void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("command");
            k.a("AgooNotifyReporter", "AgooNotifyReporter,onUserCommand,command=" + stringExtra + ",intent=" + intent.toString());
            if (StringUtils.isEmpty(stringExtra)) {
                return;
            }
            intent.getStringExtra(AgooConstants.MESSAGE_SOURCE);
            if (StringUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_DELETED)) {
                b(intent);
                a(this.f18278a, intent.getExtras(), "dismiss");
            } else if (StringUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_READED)) {
                AppMonitor.Counter.commit("accs", BaseMonitor.COUNT_AGOO_CLICK, "click", mto.a.GEO_NOT_SUPPORT);
                String stringExtra2 = intent.getStringExtra("id");
                AppMonitor.Counter.commit("accs", "agoo_click_id", stringExtra2, mto.a.GEO_NOT_SUPPORT);
                TLog.loge("agoo_push", "agoo_click_id, messageId=" + stringExtra2);
                String stringExtra3 = intent.getStringExtra("show_type");
                HashMap hashMap = new HashMap();
                if (!StringUtils.isEmpty(stringExtra3)) {
                    hashMap.put("show_type", stringExtra3);
                }
                if (mtb.a()) {
                    HashMap hashMap2 = new HashMap();
                    JSONObject jSONObject = JSON.parseObject(intent.getStringExtra(AgooConstants.MESSAGE_BODY)).getJSONObject(Constants.KEY_EXTS);
                    if (jSONObject != null) {
                        String string = jSONObject.getString(MarketingInnerNotificationAdapter.KEY_PUSHUTARGS);
                        if (!StringUtils.isEmpty(string)) {
                            try {
                                for (Map.Entry<String, Object> entry : JSON.parseObject(string).entrySet()) {
                                    if (entry.getValue() instanceof String) {
                                        hashMap2.put(entry.getKey(), (String) entry.getValue());
                                    }
                                }
                                if (!hashMap2.isEmpty()) {
                                    hashMap.putAll(hashMap2);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
                EnvUtil.UTClick(EnvUtil.createUTData("agoo^0^" + stringExtra2, stringExtra2, null, "0", null, null, hashMap), 0, intent.getStringExtra(TaobaoConstants.MESSAGE_URL));
                String str = "notification--read[messageId:" + stringExtra2 + riy.ARRAY_END_STR;
                TaobaoRegister.clickMessage(this.f18278a, stringExtra2, JSONObject.toJSONString(this.b));
                a(this.f18278a, intent.getExtras(), "click");
            }
        } catch (Throwable th) {
            AppMonitor.Counter.commit("accs", "handleUserCommand_exception", "", mto.a.GEO_NOT_SUPPORT);
            k.a("AgooNotifyReporter", "onUserCommand" + th.toString());
            TLog.loge("AgooNotifyReporter", Log.getStackTraceString(th));
        }
    }

    public void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{this, intent});
            return;
        }
        AppMonitor.Counter.commit("accs", BaseMonitor.COUNT_AGOO_CLICK, "delete", mto.a.GEO_NOT_SUPPORT);
        String stringExtra = intent.getStringExtra("id");
        AppMonitor.Counter.commit("accs", "agoo_delete_id", stringExtra, mto.a.GEO_NOT_SUPPORT);
        TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_delete_id", null, null, null, "messageId=" + stringExtra);
        TLog.loge("agoo_push", "agoo_delete_id, messageId=" + stringExtra);
        TLog.loge("AgooNotifyReporter", "notification--delete[messageId:" + stringExtra + riy.ARRAY_END_STR);
        TaobaoRegister.dismissMessage(this.f18278a, stringExtra, JSONObject.toJSONString(this.b));
    }

    private void a(Context context, Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c593e", new Object[]{this, context, bundle, str});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(context.getPackageName() + ".intent.action.NOTFIY_MESSAGE");
        intent.putExtra("click_message_type", str);
        intent.putExtras(bundle);
        intent.setPackage("com.taobao.taobao");
        context.sendBroadcast(intent);
    }

    public static NotificationCompat.Builder a(NotificationCompat.Builder builder, Context context, Bundle bundle, int i, Intent intent) {
        Bundle bundle2;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationCompat.Builder) ipChange.ipc$dispatch("804d354c", new Object[]{builder, context, bundle, new Integer(i), intent});
        }
        if (builder != null) {
            if (intent != null) {
                bundle2 = bundle == null ? new Bundle() : bundle;
                String stringExtra = intent.getStringExtra("notifyContentTargetUrl");
                if (!StringUtils.isEmpty(stringExtra)) {
                    bundle2.putString("notifyContentTargetUrl", stringExtra);
                }
                Bundle bundleExtra = intent.getBundleExtra("notifyContentParamBundleKey");
                if (bundleExtra != null) {
                    bundle2.putBundle("notifyContentParamBundleKey", bundleExtra);
                }
            } else {
                bundle2 = bundle;
            }
            if (!c.isEmpty()) {
                try {
                    Iterator<a> it = c.iterator();
                    while (it.hasNext() && it.next().process(context, bundle2, i) == null) {
                    }
                } catch (Exception unused) {
                }
            }
            PendingIntent a2 = a(context, bundle2, i);
            String str = "";
            if (a2 == null) {
                Intent createComandIntent = IntentUtil.createComandIntent(context, AgooConstants.AGOO_COMMAND_MESSAGE_READED);
                if (createComandIntent != null) {
                    createComandIntent.putExtras(bundle2);
                    createComandIntent.setPackage("com.taobao.taobao");
                    builder.setContentIntent(com.android.taobao.aop.a.b(context, i + 1, createComandIntent, 134217728));
                } else {
                    if (bundle2 != null) {
                        try {
                            string = bundle2.getString("id");
                        } catch (Exception e) {
                            TLog.loge("AgooNotifyReporter", Log.getStackTraceString(e));
                        }
                    } else {
                        string = str;
                    }
                    TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "clickIntent_null_id", null, null, null, "messageId=" + string);
                    AppMonitor.Counter.commit("accs", "clickIntent_null_id", string, mto.a.GEO_NOT_SUPPORT);
                    TLog.loge("agoo_push", "clickIntent is null");
                }
            } else {
                builder.setContentIntent(a2);
            }
            Intent createComandIntent2 = IntentUtil.createComandIntent(context, AgooConstants.AGOO_COMMAND_MESSAGE_DELETED);
            if ("true".equals(OrangeConfig.getInstance().getConfig("mpm_business_switch", "isEnableChannelDeleteMessage", "false"))) {
                createComandIntent2.setAction(createComandIntent2.getAction() + ".channel");
            }
            if (createComandIntent2 != null) {
                createComandIntent2.putExtras(bundle2);
                createComandIntent2.setPackage("com.taobao.taobao");
                builder.setDeleteIntent(com.android.taobao.aop.a.b(context, i + 2, createComandIntent2, 134217728));
            } else {
                if (bundle2 != null) {
                    try {
                        str = bundle2.getString("id");
                    } catch (Exception e2) {
                        TLog.loge("AgooNotifyReporter", Log.getStackTraceString(e2));
                    }
                }
                String str2 = str;
                TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "deleteIntent_null_id", null, null, null, "messageId=" + str2);
                AppMonitor.Counter.commit("accs", "deleteIntent_null_id", str2, mto.a.GEO_NOT_SUPPORT);
                TLog.loge("agoo_push", "deleteIntent is null");
            }
        }
        return builder;
    }

    private static PendingIntent a(Context context, Bundle bundle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("e4d351bb", new Object[]{context, bundle, new Integer(i)});
        }
        if (StringUtils.equals("1", OrangeConfig.getInstance().getConfig("mpm_business_switch", "AgooPushClickChangeSwitch", "0"))) {
            TLog.loge("agoo_push", "AgooPushClickChangeSwitch open");
            return null;
        }
        String string = bundle.getString(AgooConstants.MESSAGE_BODY);
        TLog.loge("AgooNotifyReporter", " agooBody :" + string);
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setPackage(context.getApplicationInfo().packageName);
        intent.setData(Uri.parse("http://tb.cn/n/ww/notifyjump"));
        intent.setFlags(335544320);
        intent.putExtras(bundle);
        return com.android.taobao.aop.a.a(context, i + 1, intent, 134217728);
    }
}
