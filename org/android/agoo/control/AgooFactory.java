package org.android.agoo.control;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.alibaba.analytics.core.sync.q;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.NoTraceTriggerHelper;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.c;
import com.taobao.accs.utl.d;
import com.taobao.accs.utl.l;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.spec.SecretKeySpec;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.common.EncryptUtil;
import org.android.agoo.common.MsgDO;
import org.android.agoo.message.MessageService;
import org.android.agoo.service.SendMessage;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.dcd;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class AgooFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEAL_MESSAGE = "accs.msgRecevie";
    private static final String TAG = "AgooFactory";
    private static Context mContext;
    public NotifManager notifyManager = null;
    private MessageService messageService = null;

    public static /* synthetic */ Context access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("bf71316f", new Object[0]) : mContext;
    }

    public static /* synthetic */ MessageService access$100(AgooFactory agooFactory) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MessageService) ipChange.ipc$dispatch("72fc5ef0", new Object[]{agooFactory}) : agooFactory.messageService;
    }

    static {
        kge.a(-454335948);
        mContext = null;
    }

    public void init(Context context, NotifManager notifManager, MessageService messageService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8330c08a", new Object[]{this, context, notifManager, messageService});
            return;
        }
        mContext = context.getApplicationContext();
        this.notifyManager = notifManager;
        if (this.notifyManager == null) {
            this.notifyManager = new NotifManager();
        }
        this.notifyManager.init(mContext);
        this.messageService = messageService;
        if (this.messageService == null) {
            this.messageService = new MessageService();
        }
        this.messageService.init(mContext);
    }

    public void saveMsg(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcaf152", new Object[]{this, bArr});
        } else {
            saveMsg(bArr, null);
        }
    }

    public void saveMsg(final byte[] bArr, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98a92a9c", new Object[]{this, bArr, str});
        } else if (bArr == null || bArr.length <= 0) {
        } else {
            a.a(new Runnable() { // from class: org.android.agoo.control.AgooFactory.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String str2 = new String(bArr, "utf-8");
                        JSONArray jSONArray = new JSONArray(str2);
                        int length = jSONArray.length();
                        if (length != 1) {
                            return;
                        }
                        String str3 = null;
                        String str4 = null;
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            if (jSONObject != null) {
                                str3 = jSONObject.getString(q.MSGTYPE_INTERVAL);
                                str4 = jSONObject.getString("p");
                            }
                        }
                        if (ALog.isPrintLog(ALog.Level.I)) {
                            ALog.i(AgooFactory.TAG, "saveMsg msgId:" + str3 + ",message=" + str2 + ",currentPack=" + str4 + ",reportTimes=" + Config.getReportCacheMsg(AgooFactory.access$000()), new Object[0]);
                        }
                        if (StringUtils.isEmpty(str4) || !StringUtils.equals(str4, AgooFactory.access$000().getPackageName())) {
                            return;
                        }
                        if (StringUtils.isEmpty(str)) {
                            AgooFactory.access$100(AgooFactory.this).addAccsMessage(str3, str2, "0");
                        } else {
                            AgooFactory.access$100(AgooFactory.this).addAccsMessage(str3, str2, str);
                        }
                    } catch (Throwable th) {
                        ALog.e(AgooFactory.TAG, "saveMsg fail:" + th.toString(), new Object[0]);
                    }
                }
            });
        }
    }

    public void msgRecevie(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45639134", new Object[]{this, bArr, str});
        } else {
            msgRecevie(bArr, str, null);
        }
    }

    public void msgRecevie(final byte[] bArr, final String str, final TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e1803d", new Object[]{this, bArr, str, extraInfo});
            return;
        }
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.i(TAG, "into--[AgooFactory,msgRecevie]:messageSource=" + str, new Object[0]);
            }
            a.a(new Runnable() { // from class: org.android.agoo.control.AgooFactory.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AgooFactory.this.msgReceiverPreHandler(bArr, str, extraInfo, true);
                    }
                }
            });
        } catch (Throwable th) {
            ALog.e(TAG, "serviceImpl init task fail:" + th.toString(), new Object[0]);
        }
    }

    public Bundle msgReceiverPreHandler(byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("171f57f6", new Object[]{this, bArr, str, extraInfo, new Boolean(z)}) : msgReceiverPreHandler(bArr, str, extraInfo, z, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e3 A[Catch: Throwable -> 0x02fa, TryCatch #3 {Throwable -> 0x02fa, blocks: (B:8:0x003e, B:11:0x0043, B:13:0x0053, B:14:0x007d, B:16:0x0083, B:18:0x00a1, B:20:0x00c0, B:22:0x00cb, B:24:0x00fb, B:25:0x00ff, B:28:0x0110, B:29:0x0113, B:31:0x0121, B:33:0x0127, B:34:0x012d, B:36:0x013e, B:38:0x0144, B:40:0x014a, B:41:0x0150, B:44:0x015a, B:46:0x0160, B:47:0x0166, B:48:0x016a, B:50:0x0174, B:52:0x0198, B:55:0x01ac, B:57:0x01c7, B:59:0x01cf, B:61:0x01d5, B:67:0x01e3, B:69:0x01f2, B:70:0x01f8, B:75:0x0204, B:86:0x0237, B:88:0x026e, B:78:0x020c, B:80:0x021b), top: B:112:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ff  */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle msgReceiverPreHandler(byte[] r28, java.lang.String r29, com.taobao.accs.base.TaoBaseService.ExtraInfo r30, boolean r31, java.util.List<org.android.agoo.common.MsgDO> r32) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.control.AgooFactory.msgReceiverPreHandler(byte[], java.lang.String, com.taobao.accs.base.TaoBaseService$ExtraInfo, boolean, java.util.List):android.os.Bundle");
    }

    public static String parseEncryptedMsg(String str) {
        String agooAppKey;
        byte[] hexStringToByteArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d62e6bf", new Object[]{str});
        }
        try {
            agooAppKey = Config.getAgooAppKey(mContext);
            String utdid = UtilityImpl.utdidChanged(Constants.SP_FILE_NAME, mContext) ? UtilityImpl.getUtdid(Constants.SP_FILE_NAME, mContext) : c.d(mContext);
            if (StringUtils.isEmpty(utdid)) {
                utdid = c.d(mContext);
            }
            if (com.taobao.accs.client.a.f8207a == 2) {
                if (!StringUtils.isEmpty(c.b)) {
                    hexStringToByteArray = EncryptUtil.hmacSha1(c.b.getBytes("utf-8"), (agooAppKey + utdid).getBytes("utf-8"));
                } else {
                    ALog.e(TAG, "getAppsign secret null", new Object[0]);
                    hexStringToByteArray = null;
                }
            } else {
                SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(mContext);
                if (securityGuardManager != null) {
                    ALog.d(TAG, "SecurityGuardManager not null!", new Object[0]);
                    ISecureSignatureComponent secureSignatureComp = securityGuardManager.getSecureSignatureComp();
                    SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
                    securityGuardParamContext.appKey = agooAppKey;
                    securityGuardParamContext.paramMap.put("INPUT", agooAppKey + utdid);
                    securityGuardParamContext.requestType = 3;
                    hexStringToByteArray = EncryptUtil.hexStringToByteArray(secureSignatureComp.signRequest(securityGuardParamContext, com.taobao.accs.client.a.c));
                } else {
                    ALog.e(TAG, "SecurityGuardManager is null", new Object[0]);
                    hexStringToByteArray = null;
                }
            }
        } catch (Throwable th) {
            ALog.e(TAG, "parseEncryptedMsg failure: ", th, new Object[0]);
        }
        if (hexStringToByteArray != null && hexStringToByteArray.length > 0) {
            return new String(EncryptUtil.aesDecrypt(Base64.decode(str, 8), new SecretKeySpec(EncryptUtil.md5(hexStringToByteArray), "AES"), EncryptUtil.md5(agooAppKey.getBytes("utf-8"))), "utf-8");
        }
        ALog.e(TAG, "aesDecrypt key is null!", new Object[0]);
        return null;
    }

    public void reportCacheMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b80d0fa", new Object[]{this});
            return;
        }
        try {
            a.a(new Runnable() { // from class: org.android.agoo.control.AgooFactory.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArrayList<MsgDO> unReportMsg = AgooFactory.access$100(AgooFactory.this).getUnReportMsg();
                    if (unReportMsg == null || unReportMsg.size() <= 0) {
                        return;
                    }
                    ALog.e(AgooFactory.TAG, "reportCacheMsg", "size", Integer.valueOf(unReportMsg.size()));
                    Iterator<MsgDO> it = unReportMsg.iterator();
                    while (it.hasNext()) {
                        MsgDO next = it.next();
                        if (next != null) {
                            next.isFromCache = true;
                            next.triggerType = l.d(AgooFactory.access$000());
                            AgooFactory.this.notifyManager.report(next, null);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            ALog.e(TAG, "reportCacheMsg fail:" + th.toString(), new Object[0]);
        }
    }

    public void updateMsg(final byte[] bArr, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7dab40e", new Object[]{this, bArr, new Boolean(z)});
        } else {
            a.a(new Runnable() { // from class: org.android.agoo.control.AgooFactory.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    MessageService access$100;
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String str2 = new String(bArr, "utf-8");
                        if (StringUtils.isEmpty(str2)) {
                            d.a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "msg==null", mto.a.GEO_NOT_SUPPORT);
                            return;
                        }
                        ALog.i(AgooFactory.TAG, "message = " + str2, new Object[0]);
                        JSONObject jSONObject = new JSONObject(str2);
                        String str3 = null;
                        String string = jSONObject.getString("api");
                        String string2 = jSONObject.getString("id");
                        if (StringUtils.equals(string, "agooReport")) {
                            str3 = jSONObject.getString("status");
                        }
                        if (StringUtils.equals(string, AgooConstants.AGOO_SERVICE_AGOOACK)) {
                            d.a("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, "handlerACKMessage", mto.a.GEO_NOT_SUPPORT);
                        }
                        if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(string2) && !StringUtils.isEmpty(str3)) {
                            if (ALog.isPrintLog(ALog.Level.I)) {
                                ALog.i(AgooFactory.TAG, "updateMsg data begin,api=" + string + ",id=" + string2 + ",status=" + str3 + ",reportTimes=" + Config.getReportCacheMsg(AgooFactory.access$000()), new Object[0]);
                            }
                            if (!StringUtils.equals(string, "agooReport")) {
                                return;
                            }
                            if (!StringUtils.equals(str3, "4") || !z) {
                                if ((StringUtils.equals(str3, "8") || StringUtils.equals(str3, "9")) && z) {
                                    access$100 = AgooFactory.access$100(AgooFactory.this);
                                    str = "100";
                                }
                                d.a("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, str3, mto.a.GEO_NOT_SUPPORT);
                                return;
                            }
                            access$100 = AgooFactory.access$100(AgooFactory.this);
                            str = "1";
                            access$100.updateAccsMessage(string2, str);
                            d.a("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, str3, mto.a.GEO_NOT_SUPPORT);
                            return;
                        }
                        d.a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "json key null", mto.a.GEO_NOT_SUPPORT);
                    } catch (Throwable th) {
                        ALog.e(AgooFactory.TAG, "updateMsg get data error,e=" + th, new Object[0]);
                        d.a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "json exception", mto.a.GEO_NOT_SUPPORT);
                    }
                }
            });
        }
    }

    public void updateNotifyMsg(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9ec7ca", new Object[]{this, str, str2});
        } else {
            a.a(new Runnable() { // from class: org.android.agoo.control.AgooFactory.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AgooFactory.this.updateMsgStatus(str, str2);
                    }
                }
            });
        }
    }

    public void updateMsgStatus(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0aaa825", new Object[]{this, str, str2});
            return;
        }
        try {
            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.i(TAG, "updateNotifyMsg begin,messageId=" + str + ",status=" + str2 + ",reportTimes=" + Config.getReportCacheMsg(mContext), new Object[0]);
                }
                if (StringUtils.equals(str2, "8")) {
                    this.messageService.updateAccsMessage(str, "2");
                } else if (!StringUtils.equals(str2, "9")) {
                } else {
                    this.messageService.updateAccsMessage(str, "3");
                }
            }
        } catch (Throwable th) {
            ALog.e(TAG, "updateNotifyMsg e=" + th.toString(), new Object[0]);
        }
    }

    private static final boolean checkPackage(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("948c6ad1", new Object[]{context, str})).booleanValue() : context.getPackageManager().getApplicationInfo(str, 0) != null;
    }

    private static Bundle getFlag(long j, MsgDO msgDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("82cc92c4", new Object[]{new Long(j), msgDO});
        }
        Bundle bundle = new Bundle();
        try {
            char[] charArray = Long.toBinaryString(j).toCharArray();
            int length = charArray.length;
            if (8 <= length) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(Integer.parseInt("" + charArray[1] + charArray[2] + charArray[3] + charArray[4], 2));
                String sb2 = sb.toString();
                bundle.putString(AgooConstants.MESSAGE_ENCRYPTED, sb2);
                ALog.i(TAG, "getFlag", "msgEncryptFlag", sb2);
                if (charArray[6] == '1') {
                    bundle.putString("report", "1");
                    msgDO.reportStr = "1";
                }
                if (charArray[7] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_NOTIFICATION, "1");
                }
                if (9 <= length && charArray[8] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_HAS_TEST, "1");
                }
                if (10 <= length && charArray[9] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_DUPLICATE, "1");
                }
                if (11 <= length && charArray[10] == '1') {
                    bundle.putInt(AgooConstants.MESSAGE_POPUP, 1);
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }

    private void sendMsgToBussiness(Context context, String str, Bundle bundle, boolean z, String str2, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef6af75", new Object[]{this, context, str, bundle, new Boolean(z), str2, extraInfo});
            return;
        }
        AccsClientConfig accsClientConfig = null;
        Intent intent = new Intent();
        intent.setAction(AgooConstants.INTENT_FROM_AGOO_MESSAGE);
        intent.setPackage(str);
        intent.putExtras(bundle);
        intent.putExtra("type", "common-push");
        intent.putExtra(AgooConstants.MESSAGE_SOURCE, str2);
        intent.addFlags(32);
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable(AgooConstants.MESSAGE_ACCS_EXTRA, extraInfo);
            intent.putExtra(AgooConstants.MESSAGE_AGOO_BUNDLE, bundle2);
            accsClientConfig = AccsClientConfig.getConfigByTag("default");
        } catch (Throwable th) {
            ALog.e(TAG, "sendMsgToBussiness", th, new Object[0]);
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(TAG, "sendMsgToBussiness intent:" + bundle.toString() + ",utdid=" + c.d(context) + ",pack=" + str + ",agooFlag=" + z, new Object[0]);
        }
        if (z) {
            NoTraceTriggerHelper.a(context, str, 3);
            if (accsClientConfig == null || !accsClientConfig.isPullUpEnable()) {
                return;
            }
            sendMsgByBindService(str, intent);
            return;
        }
        intent.setClassName(str, com.taobao.accs.client.a.a(str));
        dcd.a(context, intent);
    }

    private void sendMsgByBindService(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49e8f1d6", new Object[]{this, str, intent});
            return;
        }
        try {
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d(TAG, "onHandleMessage current tid:" + Thread.currentThread().getId(), new Object[0]);
            }
            a.a(new SendMessageRunnable(str, intent));
        } catch (Throwable th) {
            ALog.e(TAG, "sendMsgByBindService error >>", th, new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public class SendMessageRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Intent intent;
        private String pack;

        static {
            kge.a(413488396);
            kge.a(-1390502639);
        }

        public SendMessageRunnable(String str, Intent intent) {
            this.pack = str;
            this.intent = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ALog.d(AgooFactory.TAG, "running tid:" + Thread.currentThread().getId() + ",pack=" + this.pack, new Object[0]);
                AgooFactory.access$000().sendBroadcast(this.intent);
                StringBuilder sb = new StringBuilder();
                sb.append("SendMessageRunnable for accs,pack=");
                sb.append(this.pack);
                ALog.d(AgooFactory.TAG, sb.toString(), new Object[0]);
                try {
                    this.intent.setPackage(this.pack);
                    this.intent.setAction(AgooConstants.INTENT_FROM_AGOO_MESSAGE);
                    dcd.a(AgooFactory.access$000(), this.intent);
                } catch (Throwable unused) {
                }
                Intent intent = new Intent(AgooConstants.BINDER_MSGRECEIVER_ACTION);
                intent.setPackage(this.pack);
                ALog.d(AgooFactory.TAG, "this message pack:" + this.pack, new Object[0]);
                ALog.d(AgooFactory.TAG, "start to service...", new Object[0]);
                boolean bindService = AgooFactory.access$000().bindService(intent, new MessageConnection(this.intent.getStringExtra("id"), this.intent), 17);
                ALog.d(AgooFactory.TAG, "start service ret:" + bindService, new Object[0]);
                if (bindService) {
                    return;
                }
                ALog.d(AgooFactory.TAG, "SendMessageRunnable is error", new Object[0]);
            } catch (Throwable th) {
                ALog.e(AgooFactory.TAG, "SendMessageRunnable is error,e=" + th.toString(), new Object[0]);
            }
        }
    }

    /* loaded from: classes.dex */
    public class MessageConnection implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Intent intent;
        private String messageId;
        private ServiceConnection sc = this;
        private SendMessage sendMessage;

        static {
            kge.a(-646117451);
            kge.a(808545181);
        }

        public static /* synthetic */ Intent access$200(MessageConnection messageConnection) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("8684dae0", new Object[]{messageConnection}) : messageConnection.intent;
        }

        public static /* synthetic */ SendMessage access$300(MessageConnection messageConnection) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SendMessage) ipChange.ipc$dispatch("cf639d0a", new Object[]{messageConnection}) : messageConnection.sendMessage;
        }

        public static /* synthetic */ SendMessage access$302(MessageConnection messageConnection, SendMessage sendMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SendMessage) ipChange.ipc$dispatch("ccb67c00", new Object[]{messageConnection, sendMessage});
            }
            messageConnection.sendMessage = sendMessage;
            return sendMessage;
        }

        public static /* synthetic */ ServiceConnection access$400(MessageConnection messageConnection) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ServiceConnection) ipChange.ipc$dispatch("3a2822c9", new Object[]{messageConnection}) : messageConnection.sc;
        }

        public MessageConnection(String str, Intent intent) {
            this.messageId = str;
            this.intent = intent;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            } else {
                ALog.d(AgooFactory.TAG, "MessageConnection disConnected", new Object[0]);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            ALog.d(AgooFactory.TAG, "MessageConnection conneted:" + componentName, new Object[0]);
            this.sendMessage = SendMessage.Stub.asInterface(iBinder);
            ALog.d(AgooFactory.TAG, "onConnected current tid:" + Thread.currentThread().getId(), new Object[0]);
            ALog.d(AgooFactory.TAG, "MessageConnection sent:" + this.intent, new Object[0]);
            if (this.sendMessage == null) {
                return;
            }
            a.a(new Runnable() { // from class: org.android.agoo.control.AgooFactory.MessageConnection.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        try {
                            ALog.d(AgooFactory.TAG, "onConnected running tid:" + Thread.currentThread().getId(), new Object[0]);
                            MessageConnection.access$300(MessageConnection.this).doSend(MessageConnection.access$200(MessageConnection.this));
                            ALog.d(AgooFactory.TAG, "send finish. close this connection", new Object[0]);
                            MessageConnection.access$302(MessageConnection.this, null);
                            AgooFactory.access$000().unbindService(MessageConnection.access$400(MessageConnection.this));
                        } catch (RemoteException e) {
                            ALog.e(AgooFactory.TAG, "send error", e, new Object[0]);
                            ALog.d(AgooFactory.TAG, "send finish. close this connection", new Object[0]);
                            MessageConnection.access$302(MessageConnection.this, null);
                            AgooFactory.access$000().unbindService(MessageConnection.access$400(MessageConnection.this));
                        }
                    } catch (Throwable th) {
                        ALog.d(AgooFactory.TAG, "send finish. close this connection", new Object[0]);
                        MessageConnection.access$302(MessageConnection.this, null);
                        AgooFactory.access$000().unbindService(MessageConnection.access$400(MessageConnection.this));
                        throw th;
                    }
                }
            });
        }
    }
}
