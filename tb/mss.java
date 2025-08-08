package tb;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.util.k;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.c;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.message.notification.banner.support.MarketingInnerNotificationAdapter;
import com.taobao.message.notification.system.base.BasicLocalPush;
import com.taobao.message.notification.system.base.IOldAgooNotification;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.msgnotification.g;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.intent.IntentUtil;
import tb.mto;

/* loaded from: classes7.dex */
public abstract class mss extends msr implements IOldAgooNotification {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f31226a;
    public final MsgNotficationDTO b;
    public final Bundle c;
    public final Intent d;

    static {
        kge.a(1356525228);
        kge.a(2124595894);
    }

    public static /* synthetic */ Object ipc$super(mss mssVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1865040893:
                super.onShow();
                return null;
            case -1432119014:
                return new Integer(super.genPushRequestId());
            case -1304581520:
                return super.getNotificationChannel();
            case -893005340:
                return new Integer(super.getImportance());
            case -423164667:
                return super.getCategory();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public void setContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
        }
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        }
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        }
    }

    public mss(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        this.f31226a = context;
        this.b = msgNotficationDTO;
        this.c = bundle == null ? new Bundle() : bundle;
        this.d = intent;
        Intent intent2 = this.d;
        if (intent2 != null) {
            String stringExtra = intent2.getStringExtra("notifyContentTargetUrl");
            if (!StringUtils.isEmpty(stringExtra)) {
                this.c.putString("notifyContentTargetUrl", stringExtra);
            }
            Bundle bundleExtra = this.d.getBundleExtra("notifyContentParamBundleKey");
            if (bundleExtra == null) {
                return;
            }
            this.c.putBundle("notifyContentParamBundleKey", bundleExtra);
        }
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public String getCategory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6c70505", new Object[]{this});
        }
        Bundle bundle = this.c;
        return (bundle == null || !bundle.containsKey("category")) ? super.getCategory() : this.c.getString("category");
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public int getImportance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cac5d1e4", new Object[]{this})).intValue();
        }
        Bundle bundle = this.c;
        return (bundle == null || !bundle.containsKey("importance")) ? super.getImportance() : this.c.getInt("importance");
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public Intent genClickIntent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("d78a2358", new Object[]{this}) : a(this.f31226a, this.c);
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public Intent genDeleteIntent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("4f8922b5", new Object[]{this}) : b(this.f31226a, this.c);
    }

    private static Intent a(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("bafd161f", new Object[]{context, bundle});
        }
        String string = bundle.getString(AgooConstants.MESSAGE_BODY);
        TLog.loge(BasicLocalPush.TAG, " agooBody :" + string);
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setPackage(context.getApplicationInfo().packageName);
        intent.setData(Uri.parse("http://tb.cn/n/ww/notifyjump"));
        intent.setFlags(335544320);
        intent.putExtras(bundle);
        return intent;
    }

    private static Intent b(Context context, Bundle bundle) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("3d47cafe", new Object[]{context, bundle});
        }
        Intent createComandIntent = IntentUtil.createComandIntent(context, AgooConstants.AGOO_COMMAND_MESSAGE_DELETED);
        if ("true".equals(OrangeConfig.getInstance().getConfig("mpm_business_switch", "isEnableChannelDeleteMessage", "false"))) {
            createComandIntent.setAction(createComandIntent.getAction() + ".channel");
        }
        if (createComandIntent != null) {
            createComandIntent.putExtras(bundle);
            createComandIntent.setPackage("com.taobao.taobao");
        } else {
            if (bundle != null) {
                try {
                    string = bundle.getString("id");
                } catch (Exception e) {
                    TLog.loge(BasicLocalPush.TAG, Log.getStackTraceString(e));
                }
            } else {
                string = "";
            }
            TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "deleteIntent_null_id", null, null, null, "messageId=" + string);
            AppMonitor.Counter.commit("accs", "deleteIntent_null_id", string, mto.a.GEO_NOT_SUPPORT);
            TLog.loge("agoo_push", "deleteIntent is null");
        }
        return createComandIntent;
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public int getMergeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("461bf356", new Object[]{this})).intValue();
        }
        MsgNotficationDTO msgNotficationDTO = this.b;
        if (msgNotficationDTO == null) {
            return 0;
        }
        return msgNotficationDTO.mergeType;
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        super.onShow();
        g.a().a(getMessageId(), getRequestId());
        try {
            String string = this.c != null ? this.c.getString("id") : "";
            AppMonitor.Counter.commit("accs", "agoo_notify", "", mto.a.GEO_NOT_SUPPORT);
            AppMonitor.Counter.commit("accs", "agoo_notify_id", string, mto.a.GEO_NOT_SUPPORT);
            TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_notify_id", null, null, null, "messageId=" + string);
            TLog.loge("agoo_push", "agoo_notify_id, messageId=" + string);
            TaobaoRegister.exposureMessage(this.f31226a, string, "");
            String string2 = this.c.getString("show_type");
            HashMap hashMap = new HashMap();
            hashMap.put("show_type", string2);
            hashMap.put("pushType", getClass().getSimpleName());
            hashMap.put("isBackground", String.valueOf(EnvUtil.isAppBackGround()));
            try {
                hashMap.put("isMainProcess", String.valueOf(c.b(EnvUtil.getApplication())));
            } catch (Throwable unused) {
            }
            HashMap hashMap2 = new HashMap();
            JSONObject jSONObject = JSON.parseObject(this.c.getString(AgooConstants.MESSAGE_BODY)).getJSONObject(Constants.KEY_EXTS);
            if (jSONObject != null) {
                String string3 = jSONObject.getString(MarketingInnerNotificationAdapter.KEY_PUSHUTARGS);
                if (!StringUtils.isEmpty(string3)) {
                    try {
                        for (Map.Entry<String, Object> entry : JSON.parseObject(string3).entrySet()) {
                            if (entry.getValue() instanceof String) {
                                hashMap2.put(entry.getKey(), (String) entry.getValue());
                            }
                        }
                        if (!hashMap2.isEmpty()) {
                            hashMap.putAll(hashMap2);
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            EnvUtil.UTShow(EnvUtil.createUTData("agoo^0^" + string, string, null, "0", null, null, hashMap), 0, null);
        } catch (Exception e) {
            k.a("AgooNotification", "reportNotify,error=" + e);
        }
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue() : BrandUtil.getInstance().shouldNotify();
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public int genPushRequestId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aaa3991a", new Object[]{this})).intValue();
        }
        int genPushRequestId = super.genPushRequestId();
        Intent intent = this.d;
        return intent != null ? intent.getIntExtra("notifyContentIntentRequestCode", genPushRequestId) : genPushRequestId;
    }

    @Override // tb.msr, com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public NotificationChannel getNotificationChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationChannel) ipChange.ipc$dispatch("b23daa70", new Object[]{this});
        }
        NotificationChannel searchNotificationChannel = msq.searchNotificationChannel(this.b.channelId);
        return searchNotificationChannel == null ? super.getNotificationChannel() : searchNotificationChannel;
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public String getMessageId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff27d1ad", new Object[]{this});
        }
        Bundle bundle = this.c;
        return bundle != null ? bundle.getString("id") : "";
    }
}
