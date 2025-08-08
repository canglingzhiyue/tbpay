package com.taobao.accs.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import android.util.Pair;
import anet.channel.SessionCenter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.AccsIPCProvider;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.IHeartBeat;
import com.taobao.accs.ILoginInfo;
import com.taobao.accs.a;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.connection.IConnection;
import com.taobao.accs.data.AccsStreamConfig;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.c;
import com.taobao.accs.utl.d;
import com.taobao.accs.utl.f;
import com.taobao.accs.utl.l;
import com.taobao.accs.utl.m;
import com.taobao.accs.utl.o;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.aranger.exception.IPCException;
import com.taobao.mass.MassClient;
import com.taobao.message.init.accs.AccsMessageService;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import tb.dcd;
import tb.dce;
import tb.dcf;
import tb.dch;
import tb.jzv;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class ACCSManagerImpl implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PREFIX_ACCS = "accs:";
    private static final String PREFIX_DATA_SEPARATOR = "<dt>";
    private static final String PREFIX_EXT_SEPARATOR = "<kv>";
    private static final List<String> allowServiceList;
    private String mConfigTag;
    private String TAG = "ACCSMgrImpl_";
    private Random random = new Random();
    private f.b forebackStateReceiver = new f.b() { // from class: com.taobao.accs.internal.ACCSManagerImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.accs.utl.f.b
        public void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
                return;
            }
            try {
                ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "onForeState", new Object[0]);
                ACCSManagerImpl.access$200(ACCSManagerImpl.this, ACCSManagerImpl.access$100(ACCSManagerImpl.this));
                ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "send foreground state frame", new Object[0]);
                ACCSManagerImpl.access$100(ACCSManagerImpl.this).sendMessage(Message.buildForeground(ACCSManagerImpl.access$100(ACCSManagerImpl.this).getHost(null)));
                ACCSManagerImpl.access$100(ACCSManagerImpl.this).setForeBackState(1);
                if (MassClient.getInstance().isNotEmpty()) {
                    ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "send mass foreground state frame", new Object[0]);
                    ACCSManagerImpl.access$100(ACCSManagerImpl.this).sendMessage(Message.buildMassMessage(ACCSManagerImpl.access$100(ACCSManagerImpl.this).getAppkey(), "front", "powermsg", ACCSManagerImpl.access$100(ACCSManagerImpl.this).getHost(null), ACCSManagerImpl.access$300(ACCSManagerImpl.this), context));
                }
                ConnectionServiceManager.getInstance().onForeground();
            } catch (Exception e) {
                ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "onForeState error, Error:", e, new Object[0]);
            }
        }

        @Override // com.taobao.accs.utl.f.b
        public void b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
                return;
            }
            ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "onBackState", new Object[0]);
            try {
                ConnectionServiceManager.getInstance().onBackground(ACCSManagerImpl.access$300(ACCSManagerImpl.this));
            } catch (Exception e) {
                ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "onBackState error, Error:", e, new Object[0]);
                d.a("accs", BaseMonitor.COUNT_VERIFY, "onBackState", mto.a.GEO_NOT_SUPPORT);
            }
        }
    };

    public String getUserUnit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f59ed6b4", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ String access$000(ACCSManagerImpl aCCSManagerImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2bb9cfed", new Object[]{aCCSManagerImpl}) : aCCSManagerImpl.TAG;
    }

    public static /* synthetic */ IConnection access$100(ACCSManagerImpl aCCSManagerImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IConnection) ipChange.ipc$dispatch("cb836f11", new Object[]{aCCSManagerImpl}) : aCCSManagerImpl.getConnection();
    }

    public static /* synthetic */ void access$200(ACCSManagerImpl aCCSManagerImpl, IConnection iConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ea40e4", new Object[]{aCCSManagerImpl, iConnection});
        } else {
            aCCSManagerImpl.schedulePing(iConnection);
        }
    }

    public static /* synthetic */ String access$300(ACCSManagerImpl aCCSManagerImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a48684a", new Object[]{aCCSManagerImpl}) : aCCSManagerImpl.mConfigTag;
    }

    static {
        kge.a(-398366029);
        kge.a(1368762460);
        ArrayList arrayList = new ArrayList();
        allowServiceList = arrayList;
        arrayList.add(AccsMessageService.UPLOAD_SERVICE_ID);
    }

    public ACCSManagerImpl(Context context, String str) {
        GlobalClientInfo.mContext = context.getApplicationContext();
        this.mConfigTag = str;
        this.TAG += str;
        if (AccsClientConfig.getConfigByTag(this.mConfigTag) == null) {
            try {
                new AccsClientConfig.Builder().setAppKey(ACCSManager.getDefaultAppkey(context)).setTag(str).build();
            } catch (AccsException e) {
                ALog.e(this.TAG, "ACCSManagerImpl build config", e, new Object[0]);
            }
        }
        ConnectionServiceManager.getInstance().init();
        if (o.e(context)) {
            f.a().a(this.forebackStateReceiver);
        }
        this.TAG += this.mConfigTag;
    }

    private IConnection getConnection() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IConnection) ipChange.ipc$dispatch("fd07f2ea", new Object[]{this}) : ConnectionServiceManager.getInstance().getConnectionWrapper(this.mConfigTag);
    }

    public void bindApp(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6115946f", new Object[]{this, context, str, str2, iAppReceiver});
        } else {
            bindApp(context, str, "accs", str2, iAppReceiver);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3 A[Catch: Throwable -> 0x0160, TryCatch #1 {Throwable -> 0x0160, blocks: (B:28:0x009b, B:30:0x00ab, B:32:0x00b1, B:34:0x00b7, B:40:0x00c3, B:41:0x00d5, B:43:0x00eb, B:44:0x00f3, B:46:0x00fc, B:48:0x010d, B:50:0x0113, B:51:0x0129, B:53:0x0136, B:52:0x012d, B:54:0x013d, B:56:0x0141), top: B:63:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb A[Catch: Throwable -> 0x0160, TryCatch #1 {Throwable -> 0x0160, blocks: (B:28:0x009b, B:30:0x00ab, B:32:0x00b1, B:34:0x00b7, B:40:0x00c3, B:41:0x00d5, B:43:0x00eb, B:44:0x00f3, B:46:0x00fc, B:48:0x010d, B:50:0x0113, B:51:0x0129, B:53:0x0136, B:52:0x012d, B:54:0x013d, B:56:0x0141), top: B:63:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc A[Catch: Throwable -> 0x0160, TryCatch #1 {Throwable -> 0x0160, blocks: (B:28:0x009b, B:30:0x00ab, B:32:0x00b1, B:34:0x00b7, B:40:0x00c3, B:41:0x00d5, B:43:0x00eb, B:44:0x00f3, B:46:0x00fc, B:48:0x010d, B:50:0x0113, B:51:0x0129, B:53:0x0136, B:52:0x012d, B:54:0x013d, B:56:0x0141), top: B:63:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012d A[Catch: Throwable -> 0x0160, TryCatch #1 {Throwable -> 0x0160, blocks: (B:28:0x009b, B:30:0x00ab, B:32:0x00b1, B:34:0x00b7, B:40:0x00c3, B:41:0x00d5, B:43:0x00eb, B:44:0x00f3, B:46:0x00fc, B:48:0x010d, B:50:0x0113, B:51:0x0129, B:53:0x0136, B:52:0x012d, B:54:0x013d, B:56:0x0141), top: B:63:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141 A[Catch: Throwable -> 0x0155, TRY_LEAVE, TryCatch #1 {Throwable -> 0x0160, blocks: (B:28:0x009b, B:30:0x00ab, B:32:0x00b1, B:34:0x00b7, B:40:0x00c3, B:41:0x00d5, B:43:0x00eb, B:44:0x00f3, B:46:0x00fc, B:48:0x010d, B:50:0x0113, B:51:0x0129, B:53:0x0136, B:52:0x012d, B:54:0x013d, B:56:0x0141), top: B:63:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.accs.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void bindApp(android.content.Context r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.taobao.accs.IAppReceiver r14) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.internal.ACCSManagerImpl.bindApp(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.taobao.accs.IAppReceiver):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void sendControlMessage(android.content.Context r9, com.taobao.accs.data.Message r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.internal.ACCSManagerImpl.sendControlMessage(android.content.Context, com.taobao.accs.data.Message, int, boolean):void");
    }

    public void unbindApp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a37ad16", new Object[]{this, context});
            return;
        }
        ALog.e(this.TAG, "unbindApp", new Object[0]);
        if (UtilityImpl.getFocusDisableStatus(context)) {
            return;
        }
        Intent intent = getIntent(context, 2);
        if (intent == null) {
            sendAppNotBind(context, 2, null, null);
        } else if (!UtilityImpl.isMainProcess(context)) {
        } else {
            try {
                sendControlMessage(context, Message.buildUnbindApp(getConnection().getHost(null), intent), 2, false);
            } catch (Exception e) {
                ALog.e(this.TAG, "unbindApp getHost exception", e, new Object[0]);
            }
        }
    }

    @Override // com.taobao.accs.a
    public void bindUser(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("253f5e03", new Object[]{this, context, str});
        } else {
            bindUser(context, str, false);
        }
    }

    @Override // com.taobao.accs.a
    public void bindUser(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ad1531", new Object[]{this, context, str, new Boolean(z)});
            return;
        }
        try {
            ALog.e(this.TAG, "bindUser", "userId", str);
            if (UtilityImpl.getFocusDisableStatus(context)) {
                ALog.e(this.TAG, "accs disabled", new Object[0]);
                return;
            }
            Intent intent = getIntent(context, 3);
            if (intent == null) {
                ALog.e(this.TAG, "intent null", new Object[0]);
                sendAppNotBind(context, 3, null, null);
                return;
            }
            String appkey = getConnection().getAppkey();
            if (StringUtils.isEmpty(appkey)) {
                ALog.e(this.TAG, "appKey null", new Object[0]);
                return;
            }
            if (UtilityImpl.appVersionChanged(context) || z) {
                ALog.i(this.TAG, "force bind User", new Object[0]);
                intent.putExtra(Constants.KEY_FOUCE_BIND, true);
                z = true;
            }
            intent.putExtra("appKey", appkey);
            intent.putExtra("userInfo", str);
            if (UtilityImpl.isMainProcess(context)) {
                Message buildBindUser = Message.buildBindUser(getConnection().getHost(null), this.mConfigTag, intent);
                if (buildBindUser != null && buildBindUser.getNetPermanceMonitor() != null) {
                    buildBindUser.getNetPermanceMonitor().setDataId(buildBindUser.dataId);
                    buildBindUser.getNetPermanceMonitor().setHost(buildBindUser.host.toString());
                }
                sendControlMessage(context, buildBindUser, 3, z);
            }
            getConnection().startChannelService();
        } catch (Throwable th) {
            ALog.e(this.TAG, "bindUser", th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.a
    public void unbindUser(Context context) {
        String appkey;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4624d80", new Object[]{this, context});
        } else if (UtilityImpl.getFocusDisableStatus(context) || UtilityImpl.getFocusDisableStatus(context)) {
        } else {
            Intent intent = getIntent(context, 4);
            if (intent == null) {
                sendAppNotBind(context, 4, null, null);
                return;
            }
            try {
                appkey = getConnection().getAppkey();
            } catch (Exception e) {
                ALog.e(this.TAG, "unbindUser getAppkey exception", e, new Object[0]);
            }
            if (StringUtils.isEmpty(appkey)) {
                return;
            }
            intent.putExtra("appKey", appkey);
            if (!UtilityImpl.isMainProcess(context)) {
                return;
            }
            try {
                sendControlMessage(context, Message.buildUnbindUser(getConnection().getHost(null), this.mConfigTag, intent), 4, false);
            } catch (Exception e2) {
                ALog.e(this.TAG, "unbindUser getHost exception", e2, new Object[0]);
            }
        }
    }

    @Override // com.taobao.accs.a
    public void bindService(Context context, String str) {
        String appkey;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc166df3", new Object[]{this, context, str});
        } else if (UtilityImpl.getFocusDisableStatus(context) || UtilityImpl.getFocusDisableStatus(context)) {
        } else {
            Intent intent = getIntent(context, 5);
            if (intent == null) {
                sendAppNotBind(context, 5, str, null);
                return;
            }
            try {
                appkey = getConnection().getAppkey();
            } catch (Exception e) {
                ALog.e(this.TAG, "bindService getAppkey exception", e, new Object[0]);
            }
            if (StringUtils.isEmpty(appkey)) {
                return;
            }
            intent.putExtra("appKey", appkey);
            intent.putExtra("serviceId", str);
            if (UtilityImpl.isMainProcess(context)) {
                try {
                    Message buildBindService = Message.buildBindService(getConnection().getHost(null), this.mConfigTag, intent);
                    if (buildBindService != null && buildBindService.getNetPermanceMonitor() != null) {
                        buildBindService.getNetPermanceMonitor().setDataId(buildBindService.dataId);
                        buildBindService.getNetPermanceMonitor().setHost(buildBindService.host.toString());
                    }
                    sendControlMessage(context, buildBindService, 5, false);
                } catch (Exception e2) {
                    ALog.e(this.TAG, "bindService getHost exception", e2, new Object[0]);
                }
            }
            try {
                getConnection().startChannelService();
            } catch (Exception e3) {
                ALog.e(this.TAG, "bindService startChannelService exception", e3, new Object[0]);
            }
        }
    }

    @Override // com.taobao.accs.a
    public void unbindService(Context context, String str) {
        String appkey;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f05b4c", new Object[]{this, context, str});
        } else if (UtilityImpl.getFocusDisableStatus(context)) {
        } else {
            Intent intent = getIntent(context, 6);
            if (intent == null) {
                sendAppNotBind(context, 6, str, null);
                return;
            }
            try {
                appkey = getConnection().getAppkey();
            } catch (Exception e) {
                ALog.e(this.TAG, "unbindService getAppkey exception", e, new Object[0]);
            }
            if (StringUtils.isEmpty(appkey)) {
                return;
            }
            intent.putExtra("appKey", appkey);
            intent.putExtra("serviceId", str);
            if (!UtilityImpl.isMainProcess(context)) {
                return;
            }
            try {
                sendControlMessage(context, Message.buildUnbindService(getConnection().getHost(null), this.mConfigTag, intent), 6, false);
            } catch (Exception e2) {
                ALog.e(this.TAG, "unbindService getHost exception", e2, new Object[0]);
            }
        }
    }

    @Override // com.taobao.accs.a
    public String sendData(Context context, String str, String str2, byte[] bArr, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("70504f2c", new Object[]{this, context, str, str2, bArr, str3}) : sendData(context, str, str2, bArr, str3, null);
    }

    @Override // com.taobao.accs.a
    public String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae89a7a2", new Object[]{this, context, str, str2, bArr, str3, str4}) : sendData(context, str, str2, bArr, str3, str4, null);
    }

    @Override // com.taobao.accs.a
    public String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("210d8883", new Object[]{this, context, str, str2, bArr, str3, str4, url}) : sendData(context, new ACCSManager.AccsRequest(str, str2, bArr, str3, str4, url, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
        com.taobao.accs.utl.d.a("accs", com.taobao.accs.utl.BaseMonitor.ALARM_POINT_REQ_ERROR, r18.serviceId, "1", "accs disable");
     */
    @Override // com.taobao.accs.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String sendData(android.content.Context r17, com.taobao.accs.ACCSManager.AccsRequest r18) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.internal.ACCSManagerImpl.sendData(android.content.Context, com.taobao.accs.ACCSManager$AccsRequest):java.lang.String");
    }

    @Override // com.taobao.accs.a
    public String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2b853f37", new Object[]{this, context, str, str2, bArr, str3, str4}) : sendRequest(context, str, str2, bArr, str3, str4, null);
    }

    @Override // com.taobao.accs.a
    public String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8329b758", new Object[]{this, context, str, str2, bArr, str3, str4, url}) : sendRequest(context, new ACCSManager.AccsRequest(str, str2, bArr, str3, str4, url, null));
    }

    @Override // com.taobao.accs.a
    public String sendRequest(Context context, ACCSManager.AccsRequest accsRequest, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c2dd73", new Object[]{this, context, accsRequest, str, new Boolean(z)});
        }
        try {
        } catch (Throwable th) {
            th = th;
            str2 = "accs";
            str3 = BaseMonitor.ALARM_POINT_REQ_ERROR;
            str4 = "1";
            c = 0;
        }
        if (accsRequest == null) {
            ALog.e(this.TAG, "sendRequest request null", new Object[0]);
            d.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, null, "1", "request null");
            return null;
        } else if (!UtilityImpl.isMainProcess(context)) {
            ALog.e(this.TAG, "sendRequest not in mainprocess", new Object[0]);
            return null;
        } else if (UtilityImpl.getFocusDisableStatus(context)) {
            ALog.e(this.TAG, "sendRequest disable", new Object[0]);
            d.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "accs disable");
            return null;
        } else if (StringUtils.isEmpty(getConnection().getAppkey())) {
            d.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "request appkey null");
            ALog.e(this.TAG, "sendRequest appkey null", new Object[0]);
            return null;
        } else {
            getConnection().start();
            String packageName = str == null ? context.getPackageName() : str;
            String host = getConnection().getHost(null);
            String str5 = this.mConfigTag;
            str2 = "accs";
            str3 = BaseMonitor.ALARM_POINT_REQ_ERROR;
            String str6 = packageName;
            str4 = "1";
            c = 0;
            try {
                Message buildRequest = Message.buildRequest(context, host, str5, "", str6, Constants.TARGET_SERVICE_PRE, accsRequest, z);
                if (buildRequest != null && buildRequest.getNetPermanceMonitor() != null) {
                    buildRequest.getNetPermanceMonitor().onSend();
                }
                getConnection().send(buildRequest, true);
                if (UtilityImpl.isServiceIdPrintLog(buildRequest.serviceId)) {
                    ALog.e(this.TAG, "sendRequest.info", "dataId", buildRequest.dataId, "serviceId", buildRequest.serviceId, e.REQUEST_ID, accsRequest.dataId);
                }
            } catch (Throwable th2) {
                th = th2;
                if (accsRequest != null) {
                    String str7 = accsRequest.serviceId;
                    d.a(str2, str3, str7, str4, "request " + th.toString());
                    String str8 = this.TAG;
                    Object[] objArr = new Object[2];
                    objArr[c] = "dataId";
                    objArr[1] = accsRequest.dataId;
                    ALog.e(str8, "sendRequest", th, objArr);
                }
                return accsRequest.dataId;
            }
            return accsRequest.dataId;
        }
    }

    @Override // com.taobao.accs.a
    public String sendRequest(Context context, ACCSManager.AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97c9e1e3", new Object[]{this, context, accsRequest}) : sendRequest(context, accsRequest, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // com.taobao.accs.a
    public String sendPushResponse(Context context, ACCSManager.AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        String str = 1;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e49eb68", new Object[]{this, context, accsRequest, extraInfo});
        }
        try {
            if (context == null || accsRequest == null) {
                ALog.e(this.TAG, "sendPushResponse input null", "context", context, InputFrame3.TYPE_RESPONSE, accsRequest, "extraInfo", extraInfo);
                d.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", "sendPushResponse null");
                return null;
            }
            try {
                if (UtilityImpl.getFocusDisableStatus(context)) {
                    d.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "sendPushResponse accs disable");
                    return null;
                }
                String appkey = getConnection().getAppkey();
                if (StringUtils.isEmpty(appkey)) {
                    d.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "sendPushResponse appkey null");
                    ALog.e(this.TAG, "sendPushResponse appkey null", new Object[0]);
                    return null;
                }
                TaoBaseService.ExtraInfo extraInfo2 = extraInfo == null ? new TaoBaseService.ExtraInfo() : extraInfo;
                accsRequest.host = null;
                try {
                    extraInfo2.fromPackage = context.getPackageName();
                    if (extraInfo2.connType == 0 || extraInfo2.fromHost == null) {
                        extraInfo2.connType = 0;
                        ALog.w(this.TAG, "pushresponse use channel", "host", extraInfo2.fromHost);
                        z = false;
                    }
                    ALog.i(this.TAG, "sendPushResponse", "sendbyInapp", Boolean.valueOf(z), "host", extraInfo2.fromHost, "pkg", extraInfo2.fromPackage);
                    if (z) {
                        ALog.i(this.TAG, "sendPushResponse inapp by", "app", extraInfo2.fromPackage);
                        accsRequest.host = new URL(extraInfo2.fromHost);
                        if (context.getPackageName().equals(extraInfo2.fromPackage) && UtilityImpl.isMainProcess(context)) {
                            sendRequest(context, accsRequest, context.getPackageName(), false);
                            return null;
                        } else if (l.b() && ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(this.mConfigTag)) {
                            ALog.i(this.TAG, "sendPushResponse inapp in channel", "app", extraInfo2.fromPackage);
                            Message buildRequest = Message.buildRequest(context, getConnection().getHost(null), this.mConfigTag, "", context.getPackageName(), Constants.TARGET_SERVICE_PRE, accsRequest, false);
                            if (buildRequest != null && buildRequest.getNetPermanceMonitor() != null) {
                                buildRequest.getNetPermanceMonitor().onSend();
                            }
                            getConnection().send(buildRequest, true);
                            return null;
                        } else {
                            Intent intent = new Intent(Constants.ACTION_SEND);
                            intent.setClassName(extraInfo2.fromPackage, c.msgService);
                            intent.putExtra("packageName", context.getPackageName());
                            intent.putExtra(Constants.KEY_SEND_REQDATA, accsRequest);
                            intent.putExtra("appKey", appkey);
                            intent.putExtra(Constants.KEY_CONFIG_TAG, this.mConfigTag);
                            dcd.a(context, intent);
                            return null;
                        }
                    }
                    Intent intent2 = getIntent(context, 100);
                    if (intent2 == null) {
                        d.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "push response intent null");
                        sendAppNotBind(context, 100, accsRequest.serviceId, accsRequest.dataId);
                        ALog.e(this.TAG, "sendPushResponse input null", "context", context, InputFrame3.TYPE_RESPONSE, accsRequest, "extraInfo", extraInfo2);
                        return null;
                    }
                    ALog.i(this.TAG, "sendPushResponse channel by", "app", extraInfo2.fromPackage);
                    intent2.setClassName(extraInfo2.fromPackage, c.channelService);
                    intent2.putExtra(Constants.KEY_SEND_TYPE, Message.ReqType.REQ);
                    intent2.putExtra("appKey", appkey);
                    intent2.putExtra("userInfo", accsRequest.userId);
                    intent2.putExtra("serviceId", accsRequest.serviceId);
                    intent2.putExtra("data", accsRequest.data);
                    intent2.putExtra("dataId", accsRequest.dataId);
                    intent2.putExtra(Constants.KEY_CONFIG_TAG, this.mConfigTag);
                    if (!StringUtils.isEmpty(accsRequest.businessId)) {
                        intent2.putExtra("businessId", accsRequest.businessId);
                    }
                    if (!StringUtils.isEmpty(accsRequest.tag)) {
                        intent2.putExtra(Constants.KEY_EXT_TAG, accsRequest.tag);
                    }
                    if (accsRequest.target != null) {
                        intent2.putExtra("target", accsRequest.target);
                    }
                    dcd.a(context, intent2);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    str = 0;
                    d.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "push response " + th.toString());
                    ALog.e(this.TAG, "sendPushResponse dataid:" + accsRequest.dataId, th, new Object[0]);
                    return str;
                }
            } catch (Throwable th2) {
                th = th2;
                str = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.taobao.accs.a
    public boolean isNetworkReachable(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("768651bc", new Object[]{this, context})).booleanValue() : UtilityImpl.isNetworkConnected(context);
    }

    private Intent getIntent(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("36fe5e7f", new Object[]{this, context, new Integer(i)});
        }
        if (i != 1 && UtilityImpl.getFocusDisableStatus(context)) {
            ALog.e(this.TAG, "getIntent null command:" + i + " accs enabled:" + UtilityImpl.getFocusDisableStatus(context), new Object[0]);
            return null;
        }
        Intent intent = new Intent();
        intent.setAction(Constants.ACTION_COMMAND);
        intent.setClassName(context.getPackageName(), c.channelService);
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("command", i);
        try {
            intent.putExtra("appKey", getConnection().getAppkey());
        } catch (Exception e) {
            ALog.e(this.TAG, "getIntent getAppkey exception", e, new Object[0]);
        }
        intent.putExtra(Constants.KEY_CONFIG_TAG, this.mConfigTag);
        return intent;
    }

    @Override // com.taobao.accs.a
    public void forceDisableService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("303889a9", new Object[]{this, context});
        } else {
            UtilityImpl.focusDisableService(context);
        }
    }

    @Override // com.taobao.accs.a
    public boolean isAccsConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eec7c18", new Object[]{this})).booleanValue();
        }
        try {
            if (getConnection() != null) {
                if (getConnection().isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            if (e instanceof IPCException) {
                ALog.e(this.TAG, "isAccsConnected isConnected exception", e, new Object[0]);
                if (((IPCException) e).getErrorCode() == 22) {
                    d.a("accs", BaseMonitor.COUNT_VERIFY, "is_connect_ipc_err", mto.a.GEO_NOT_SUPPORT);
                    try {
                        ((IConnection) jzv.a(new ComponentName(jzv.a(), AccsIPCProvider.class), IConnection.class, new Pair(AccsClientConfig.class, AccsClientConfig.getConfigByTag(this.mConfigTag)), new Pair(Integer.class, Integer.valueOf(f.a().c())))).start();
                    } catch (IPCException unused) {
                        ALog.e(this.TAG, "create connectionService exception", e, new Object[0]);
                    }
                }
            }
            return true;
        }
    }

    @Override // com.taobao.accs.a
    public void forceEnableService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296f93fa", new Object[]{this, context});
        } else {
            UtilityImpl.focusEnableService(context);
        }
    }

    @Override // com.taobao.accs.a
    @Deprecated
    public void setMode(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab05467", new Object[]{this, context, new Integer(i)});
        } else {
            ACCSClient.setEnvironment(context, i);
        }
    }

    private void sendAppNotBind(Context context, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a263e64d", new Object[]{this, context, new Integer(i), str, str2});
            return;
        }
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(context.getPackageName());
        intent.putExtra("command", i);
        intent.putExtra("serviceId", str);
        intent.putExtra("dataId", str2);
        try {
            intent.putExtra("appKey", getConnection().getAppkey());
        } catch (Exception e) {
            ALog.e(this.TAG, "sendAppNotBind getAppkey exception", e, new Object[0]);
        }
        intent.putExtra(Constants.KEY_CONFIG_TAG, this.mConfigTag);
        intent.putExtra("errorCode", i == 2 ? 200 : 300);
        com.taobao.accs.data.c.a(context, intent);
    }

    @Override // com.taobao.accs.a
    public void setProxy(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95bdaae4", new Object[]{this, context, str, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
        if (!StringUtils.isEmpty(str)) {
            edit.putString(Constants.KEY_PROXY_HOST, str);
        }
        edit.putInt(Constants.KEY_PROXY_PORT, i);
        edit.apply();
    }

    public void startInAppConnection(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd31f89b", new Object[]{this, context, str, str2, iAppReceiver});
        } else {
            startInAppConnection(context, str, null, str2, iAppReceiver);
        }
    }

    @Override // com.taobao.accs.a
    public void startInAppConnection(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87dbbfa5", new Object[]{this, context, str, str2, str3, iAppReceiver});
            return;
        }
        GlobalClientInfo.getInstance(context).setAppReceiver(this.mConfigTag, iAppReceiver);
        if (!UtilityImpl.isMainProcess(context)) {
            ALog.d(this.TAG, "inapp only init in main process!", new Object[0]);
            return;
        }
        String str4 = this.TAG;
        ALog.d(str4, "startInAppConnection APPKEY:" + str, new Object[0]);
        try {
            if (StringUtils.isEmpty(str)) {
                return;
            }
            if (!StringUtils.equals(getConnection().getAppkey(), str)) {
                getConnection().setTTid(str3);
                getConnection().setAppkey(str);
                UtilityImpl.saveAppKey(context, str);
            }
            getConnection().start();
        } catch (Exception e) {
            ALog.e(this.TAG, "startInAppConnection exception", e, new Object[0]);
        }
    }

    @Override // com.taobao.accs.a
    public void setLoginInfo(Context context, ILoginInfo iLoginInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbc7003", new Object[]{this, context, iLoginInfo});
        } else {
            GlobalClientInfo.getInstance(context).setLoginInfoImpl(this.mConfigTag, iLoginInfo);
        }
    }

    @Override // com.taobao.accs.a
    public void clearLoginInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccce0177", new Object[]{this, context});
        } else {
            GlobalClientInfo.getInstance(context).clearLoginInfoImpl();
        }
    }

    @Override // com.taobao.accs.a
    public boolean cancel(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25dc16f5", new Object[]{this, context, str})).booleanValue();
        }
        try {
            return getConnection().cancel(str);
        } catch (IPCException e) {
            ALog.e(this.TAG, "cancel exception", e, new Object[0]);
            return true;
        }
    }

    @Override // com.taobao.accs.a
    public Map<String, Boolean> getChannelState() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83cd4940", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
            String host = getConnection().getHost(null);
            hashMap.put(host, false);
            if (com.taobao.accs.net.a.a(SessionCenter.getInstance(getConnection().getAppkey()), host, 60000L, this.mConfigTag) != null) {
                hashMap.put(host, true);
            }
            String str = this.TAG;
            ALog.d(str, "getChannelState " + hashMap.toString(), new Object[0]);
        } catch (Exception e) {
            ALog.e(this.TAG, "getChannelState err", e, new Object[0]);
        }
        return hashMap;
    }

    @Override // com.taobao.accs.a
    public Map<String, Boolean> forceReConnectChannel() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b612f593", new Object[]{this});
        }
        try {
            SessionCenter.getInstance(getConnection().getAppkey()).forceRecreateAccsSession();
        } catch (Exception e) {
            ALog.e(this.TAG, "forceReConnectChannel err", e, new Object[0]);
        }
        return getChannelState();
    }

    @Override // com.taobao.accs.a
    public boolean isChannelError(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acf2cfb1", new Object[]{this, new Integer(i)})).booleanValue() : ErrorCode.isChannelError(i);
    }

    @Override // com.taobao.accs.a
    public void registerSerivce(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f898bca9", new Object[]{this, context, str, str2});
        } else {
            GlobalClientInfo.getInstance(context).registerService(str, str2);
        }
    }

    @Override // com.taobao.accs.a
    public void unRegisterSerivce(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f38198", new Object[]{this, context, str});
        } else {
            GlobalClientInfo.getInstance(context).unRegisterService(str);
        }
    }

    @Override // com.taobao.accs.a
    public void registerDataListener(Context context, String str, AccsAbstractDataListener accsAbstractDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13412671", new Object[]{this, context, str, accsAbstractDataListener});
        } else {
            GlobalClientInfo.getInstance(context).registerListener(str, accsAbstractDataListener);
        }
    }

    @Override // com.taobao.accs.a
    public void unRegisterDataListener(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6cd8471", new Object[]{this, context, str});
        } else {
            GlobalClientInfo.getInstance(context).unregisterListener(str);
        }
    }

    @Override // com.taobao.accs.a
    public void registerConnectStateListener(AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb59c4bb", new Object[]{this, accsConnectStateListener});
        } else if (m.u()) {
            GlobalClientInfo.getInstance(GlobalClientInfo.getContext()).registerConnectionListener(this.mConfigTag, accsConnectStateListener);
        } else if (accsConnectStateListener == null) {
        } else {
            try {
                getConnection().registerConnectStateListener(accsConnectStateListener);
            } catch (Exception e) {
                ALog.e(this.TAG, "registerConnectStateListener exception", e, new Object[0]);
            }
        }
    }

    @Override // com.taobao.accs.a
    public void unRegisterConnectStateListener(AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4790e2", new Object[]{this, accsConnectStateListener});
        } else if (m.u()) {
            GlobalClientInfo.getInstance(GlobalClientInfo.getContext()).unRegisterConnectStateListener(this.mConfigTag, accsConnectStateListener);
        } else if (accsConnectStateListener == null) {
        } else {
            try {
                getConnection().unRegisterConnectStateListener(accsConnectStateListener);
            } catch (Exception e) {
                ALog.e(this.TAG, "registerConnectStateListener exception", e, new Object[0]);
            }
        }
    }

    @Override // com.taobao.accs.a
    public void sendBusinessAck(String str, String str2, String str3, short s, String str4, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acea1bf4", new Object[]{this, str, str2, str3, new Short(s), str4, map});
            return;
        }
        try {
            getConnection().send(Message.buildPushAck(getConnection().getHost(null), this.mConfigTag, str, str2, str3, true, s, str4, map), true);
        } catch (IPCException e) {
            ALog.e(this.TAG, "sendBusinessAck exception", e, new Object[0]);
        }
    }

    @Override // com.taobao.accs.a
    public void updateConfig(AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2d53f8", new Object[]{this, accsClientConfig});
            return;
        }
        try {
            getConnection().updateConfig(accsClientConfig);
        } catch (Exception e) {
            ALog.e(this.TAG, "updateConfig exception", e, new Object[0]);
        }
    }

    @Override // com.taobao.accs.a
    public void subscribeStream(AccsStreamConfig accsStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c35c9661", new Object[]{this, accsStreamConfig});
        } else if (accsStreamConfig == null) {
            ALog.e(this.TAG, "subscribeStream config = NULL", new Object[0]);
        } else {
            subscribeSync(accsStreamConfig);
        }
    }

    @Override // com.taobao.accs.a
    public void unSubscribeStream(AccsStreamConfig accsStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13939fda", new Object[]{this, accsStreamConfig});
        } else if (accsStreamConfig == null) {
            ALog.e(this.TAG, "unSubscribeStream config = NULL", new Object[0]);
        } else {
            dcf.a().b(accsStreamConfig.getServiceId(), accsStreamConfig.getStreamId());
        }
    }

    @Override // com.taobao.accs.a
    public void queryStream(AccsStreamConfig accsStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8467ea3", new Object[]{this, accsStreamConfig});
        } else if (accsStreamConfig == null) {
            ALog.d(this.TAG, "queryStream config = NULL", new Object[0]);
        } else {
            dcf.a().a(accsStreamConfig.getServiceId(), accsStreamConfig.getStreamId(), accsStreamConfig.getStartSeq(), accsStreamConfig.getEndSeq());
        }
    }

    @Override // com.taobao.accs.a
    public long getServerTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cda1621", new Object[]{this})).longValue();
        }
        try {
            return getConnection().getServerTime();
        } catch (IPCException unused) {
            return 0L;
        }
    }

    @Override // com.taobao.accs.a
    public String getConnectionUnitInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4d9bf73", new Object[]{this});
        }
        try {
            return getConnection().getConnectionUnitInfo();
        } catch (IPCException unused) {
            return null;
        }
    }

    @Override // com.taobao.accs.a
    public void registerHeartBeatListener(IHeartBeat iHeartBeat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf7e846", new Object[]{this, iHeartBeat});
            return;
        }
        try {
            getConnection().registerHeartBeatListener(iHeartBeat);
        } catch (IPCException e) {
            ALog.e(this.TAG, "setHeartBeatListener err", e, new Object[0]);
        }
    }

    @Override // com.taobao.accs.a
    public void unregisterHeartBeatListener(IHeartBeat iHeartBeat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bee6bcd", new Object[]{this, iHeartBeat});
            return;
        }
        try {
            getConnection().unregisterHeartBeatListener(iHeartBeat);
        } catch (IPCException e) {
            ALog.e(this.TAG, "unregisterHeartBeatListener err", e, new Object[0]);
        }
    }

    private void schedulePing(final IConnection iConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781ef57f", new Object[]{this, iConnection});
        } else {
            com.taobao.accs.common.a.a(new Runnable() { // from class: com.taobao.accs.internal.ACCSManagerImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (iConnection == null) {
                            return;
                        }
                        iConnection.ping(true, false);
                    } catch (IPCException e) {
                        ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "schedulePing exception", e, new Object[0]);
                    }
                }
            }, this.random.nextInt(6), TimeUnit.SECONDS);
        }
    }

    private void subscribeSync(final AccsStreamConfig accsStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258605e6", new Object[]{this, accsStreamConfig});
        } else if (dcf.a().a(accsStreamConfig.getServiceId())) {
        } else {
            dcf.a().a(accsStreamConfig.getServiceId(), accsStreamConfig.getStreamId(), accsStreamConfig.getStartSeq(), accsStreamConfig.getSeqSnapshotInterval(), accsStreamConfig.getSyncTimeoutInMill(), accsStreamConfig.isSaveDB(), new dce() { // from class: com.taobao.accs.internal.ACCSManagerImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dce
                public void a(dch dchVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e4dcea6f", new Object[]{this, dchVar});
                        return;
                    }
                    Intent intent = (Intent) dchVar.b();
                    if (intent == null) {
                        return;
                    }
                    intent.putExtra(Constants.KEY_SKIP_SYNC, true);
                    com.taobao.accs.data.c.a(GlobalClientInfo.getContext(), intent);
                }

                @Override // tb.dce
                public void a(String str, String str2, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("69987edc", new Object[]{this, str, str2, new Integer(i), new Integer(i2)});
                        return;
                    }
                    try {
                        IConnection connectionWrapper = ConnectionServiceManager.getInstance().getConnectionWrapper(ACCSManagerImpl.access$300(ACCSManagerImpl.this));
                        connectionWrapper.sendMessage(Message.buildSync(connectionWrapper.getHost(null), str, GlobalClientInfo.getContext().getPackageName(), str2, accsStreamConfig.getUserId(), i, i2));
                    } catch (IPCException e) {
                        ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "onPullMessage err", e, new Object[0]);
                    }
                }

                @Override // tb.dce
                public String a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj});
                    }
                    if (!(obj instanceof Intent)) {
                        return null;
                    }
                    Intent intent = (Intent) obj;
                    try {
                        StringBuilder sb = new StringBuilder(intent.toUri(0));
                        StringBuilder sb2 = new StringBuilder();
                        Serializable serializableExtra = intent.getSerializableExtra(TaoBaseService.ExtraInfo.EXT_HEADER);
                        if (serializableExtra != null) {
                            for (Map.Entry entry : ((HashMap) serializableExtra).entrySet()) {
                                sb2.append(entry.getKey());
                                sb2.append("=");
                                sb2.append((String) entry.getValue());
                                sb2.append(ACCSManagerImpl.PREFIX_EXT_SEPARATOR);
                            }
                        }
                        sb2.append(ACCSManagerImpl.PREFIX_DATA_SEPARATOR);
                        byte[] byteArrayExtra = intent.getByteArrayExtra("data");
                        if (byteArrayExtra != null) {
                            sb2.append(Base64.encodeToString(byteArrayExtra, 2));
                        }
                        if (sb2.length() > 0) {
                            sb.append(ACCSManagerImpl.PREFIX_ACCS);
                            sb.append((CharSequence) sb2);
                            sb.append(";");
                        }
                        return sb.toString();
                    } catch (Throwable th) {
                        ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "serializeToString err", th, new Object[0]);
                        return null;
                    }
                }

                @Override // tb.dce
                public Object a(String str) {
                    String[] split;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ipChange2.ipc$dispatch("17307540", new Object[]{this, str});
                    }
                    if (StringUtils.isEmpty(str)) {
                        return null;
                    }
                    try {
                        int indexOf = str.indexOf(ACCSManagerImpl.PREFIX_ACCS);
                        if (indexOf > 0) {
                            Intent parseUri = Intent.parseUri(str.substring(0, indexOf), 0);
                            String substring = str.substring(indexOf + 5, str.length() - 1);
                            if (StringUtils.isEmpty(substring)) {
                                return parseUri;
                            }
                            String[] split2 = substring.split(ACCSManagerImpl.PREFIX_DATA_SEPARATOR);
                            if (split2.length != 2) {
                                return parseUri;
                            }
                            if (!StringUtils.isEmpty(split2[0])) {
                                HashMap hashMap = new HashMap();
                                for (String str2 : split2[0].split(ACCSManagerImpl.PREFIX_EXT_SEPARATOR)) {
                                    if (!StringUtils.isEmpty(str2)) {
                                        String[] split3 = str2.split("=");
                                        hashMap.put(Integer.valueOf(Integer.parseInt(split3[0])), split3[1]);
                                    }
                                }
                                parseUri.putExtra(TaoBaseService.ExtraInfo.EXT_HEADER, hashMap);
                            }
                            if (StringUtils.isEmpty(split2[1])) {
                                return parseUri;
                            }
                            parseUri.putExtra("data", Base64.decode(split2[1], 2));
                            return parseUri;
                        }
                        return Intent.parseUri(str, 0);
                    } catch (Throwable th) {
                        ALog.e(ACCSManagerImpl.access$000(ACCSManagerImpl.this), "deserializeFromString err", th, new Object[0]);
                        return null;
                    }
                }
            });
        }
    }
}
