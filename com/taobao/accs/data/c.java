package com.taobao.accs.data;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.taobao.windvane.jsbridge.api.WVFile;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsMainService;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.MessageFilter;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.init.Launcher_InitPush;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.NoTraceTriggerHelper;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.d;
import com.taobao.accs.utl.l;
import com.taobao.accs.utl.m;
import com.taobao.aranger.exception.IPCException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.dca;
import tb.dcd;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static Set<String> f8237a;
    private static volatile c b;
    private String c;
    private int d;

    /* renamed from: lambda$jowIGdHlVX-H5HU2aIGp2-uNSCQ */
    public static /* synthetic */ void m807lambda$jowIGdHlVXH5HU2aIGp2uNSCQ(Context context, Intent intent) {
        d(context, intent);
    }

    public String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context}) : com.taobao.accs.utl.c.msgService;
    }

    public static /* synthetic */ Set b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6dc1d418", new Object[0]) : f8237a;
    }

    static {
        kge.a(-1097580537);
        b = null;
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("7a83ff55", new Object[0]);
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    public static void a(final Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9cc1d", new Object[]{context, intent});
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("dataId");
            if (UtilityImpl.isServiceIdPrintLog(intent.getStringExtra("serviceId"))) {
                ALog.e("MsgDistribute", "distribMessage", "dataId", stringExtra);
            }
            com.taobao.accs.common.a.a().execute(new Runnable() { // from class: com.taobao.accs.data.-$$Lambda$c$jowIGdHlVX-H5HU2aIGp2-uNSCQ
                @Override // java.lang.Runnable
                public final void run() {
                    c.m807lambda$jowIGdHlVXH5HU2aIGp2uNSCQ(context, intent);
                }
            });
        } catch (Throwable th) {
            ALog.e("MsgDistribute", "distribMessage", th, new Object[0]);
        }
    }

    public static /* synthetic */ void d(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("581c47fa", new Object[]{context, intent});
        } else {
            a().b(context, intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v26 */
    /* JADX WARN: Type inference failed for: r21v8 */
    public void b(Context context, Intent intent) {
        String str;
        String str2;
        Object obj;
        String str3;
        Object obj2;
        String str4;
        char c;
        char c2;
        char c3;
        int i;
        int i2;
        char c4;
        char c5;
        char c6;
        char c7;
        Object[] objArr;
        char c8;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e54abc", new Object[]{this, context, intent});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String stringExtra = intent.getStringExtra("dataId");
        String stringExtra2 = intent.getStringExtra("serviceId");
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            ALog.e("MsgDistribute", "action null", new Object[0]);
            return;
        }
        try {
            if (TextUtils.equals(action, Constants.ACTION_RECEIVE)) {
                try {
                    i = intent.getIntExtra("command", -1);
                    try {
                        String stringExtra3 = intent.getStringExtra("userInfo");
                        int intExtra = intent.getIntExtra("errorCode", 0);
                        String stringExtra4 = intent.getStringExtra("appKey");
                        String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
                        String str6 = intent.getPackage();
                        if (str6 == null) {
                            try {
                                intent.setPackage(context.getPackageName());
                            } catch (Throwable th) {
                                th = th;
                                str = "MsgDistribute";
                                str2 = stringExtra2;
                                obj = "serviceId";
                                str3 = stringExtra;
                                obj2 = "dataId";
                                str4 = "accs";
                                i2 = 4;
                                c = 0;
                                c3 = 2;
                            }
                        }
                        ?? r21 = str6;
                        if (UtilityImpl.isServiceIdPrintLog(stringExtra2)) {
                            r21 = 2;
                            ALog.e("MsgDistribute", "distribute start", "appkey", stringExtra4, "config", stringExtra5);
                        }
                        if (a(context, intent, stringExtra, stringExtra2)) {
                            return;
                        }
                        if (i < 0) {
                            ALog.e("MsgDistribute", "command error:" + i, "serviceId", stringExtra2);
                            return;
                        } else if (a(i, stringExtra2, stringExtra)) {
                            d.a("accs", BaseMonitor.COUNT_MSG_LOST, "checkSpace", mto.a.GEO_NOT_SUPPORT);
                            return;
                        } else {
                            obj = "serviceId";
                            str3 = stringExtra;
                            try {
                                if (a(context, intent, stringExtra, stringExtra2, stringExtra5)) {
                                    return;
                                }
                                try {
                                    if (c(context, intent)) {
                                        try {
                                            objArr = new Object[4];
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c6 = 2;
                                        }
                                        try {
                                            objArr[0] = obj;
                                            try {
                                                objArr[1] = stringExtra2;
                                                c8 = 2;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                c8 = 2;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            c6 = 2;
                                            obj2 = "dataId";
                                            str4 = "accs";
                                            str2 = stringExtra2;
                                            c7 = c6;
                                            str = "MsgDistribute";
                                            c5 = c7;
                                            i2 = 4;
                                            c = 0;
                                            c3 = c5;
                                            Object[] objArr2 = new Object[i2];
                                            objArr2[c] = obj2;
                                            objArr2[1] = str3;
                                            objArr2[c3] = obj;
                                            String str7 = str2;
                                            objArr2[3] = str7;
                                            ALog.e(str, "distribMessage", th, objArr2);
                                            d.a(str4, BaseMonitor.ALARM_POINT_REQ_ERROR, str7, "1", "distribute error " + i);
                                        }
                                        try {
                                            objArr[2] = "dataId";
                                            objArr[3] = str3;
                                            ALog.e("MsgDistribute", "handleSyncMessage", objArr);
                                            return;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            str2 = stringExtra2;
                                            obj2 = "dataId";
                                            str4 = "accs";
                                            c7 = c8;
                                            str = "MsgDistribute";
                                            c5 = c7;
                                            i2 = 4;
                                            c = 0;
                                            c3 = c5;
                                            Object[] objArr22 = new Object[i2];
                                            objArr22[c] = obj2;
                                            objArr22[1] = str3;
                                            objArr22[c3] = obj;
                                            String str72 = str2;
                                            objArr22[3] = str72;
                                            ALog.e(str, "distribMessage", th, objArr22);
                                            d.a(str4, BaseMonitor.ALARM_POINT_REQ_ERROR, str72, "1", "distribute error " + i);
                                        }
                                    }
                                    c4 = 2;
                                    c4 = 2;
                                    try {
                                        Map<String, IAppReceiver> appReceiver = GlobalClientInfo.getInstance(context).getAppReceiver();
                                        IAppReceiver iAppReceiver = null;
                                        if (!TextUtils.isEmpty(stringExtra5) && appReceiver != null) {
                                            iAppReceiver = appReceiver.get(stringExtra5);
                                        }
                                        IAppReceiver iAppReceiver2 = iAppReceiver;
                                        str2 = stringExtra2;
                                        try {
                                            if (a(context, stringExtra2, str3, intent, iAppReceiver2)) {
                                                return;
                                            }
                                            obj2 = "dataId";
                                            str4 = "accs";
                                            str5 = "MsgDistribute";
                                            c = 0;
                                            try {
                                                a(context, intent, stringExtra5, stringExtra4, i, stringExtra3, str2, str3, iAppReceiver2, intExtra);
                                                if (!TextUtils.isEmpty(str2)) {
                                                    DataReceiveMonitor dataReceiveMonitor = DataReceiveMonitor.get(intent);
                                                    if (dataReceiveMonitor != null) {
                                                        dataReceiveMonitor.distributeTime = currentTimeMillis;
                                                        dataReceiveMonitor.distributeEndTime = System.currentTimeMillis();
                                                    }
                                                    a(context, iAppReceiver2, intent, str2, str3, i, intExtra);
                                                    return;
                                                }
                                                a(context, appReceiver, intent, i, intExtra);
                                                return;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                str = str5;
                                                i2 = 4;
                                                c3 = c4;
                                                Object[] objArr222 = new Object[i2];
                                                objArr222[c] = obj2;
                                                objArr222[1] = str3;
                                                objArr222[c3] = obj;
                                                String str722 = str2;
                                                objArr222[3] = str722;
                                                ALog.e(str, "distribMessage", th, objArr222);
                                                d.a(str4, BaseMonitor.ALARM_POINT_REQ_ERROR, str722, "1", "distribute error " + i);
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            obj2 = "dataId";
                                            str5 = "MsgDistribute";
                                            str4 = "accs";
                                            c = 0;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        str2 = stringExtra2;
                                        obj2 = "dataId";
                                        str4 = "accs";
                                        c = 0;
                                        str = "MsgDistribute";
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    str = stringExtra2;
                                    str2 = stringExtra5;
                                    obj2 = "dataId";
                                    str4 = "accs";
                                    c5 = r21;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                obj2 = "dataId";
                                str4 = "accs";
                                str2 = stringExtra2;
                                c = 0;
                                c4 = 2;
                                str = "MsgDistribute";
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        str2 = stringExtra2;
                        obj = "serviceId";
                        str3 = stringExtra;
                        obj2 = "dataId";
                        str4 = "accs";
                        c = 0;
                        c4 = 2;
                        str = "MsgDistribute";
                    }
                } catch (Throwable th12) {
                    th = th12;
                    str2 = stringExtra2;
                    obj = "serviceId";
                    str3 = stringExtra;
                    obj2 = "dataId";
                    str4 = "accs";
                    c = 0;
                    c2 = 2;
                    str = "MsgDistribute";
                }
            } else {
                str2 = stringExtra2;
                obj = "serviceId";
                str3 = stringExtra;
                obj2 = "dataId";
                str4 = "accs";
                c = 0;
                c2 = 2;
                c2 = 2;
                try {
                    str = "MsgDistribute";
                    try {
                        ALog.e(str, "distribMessage action error", new Object[0]);
                        return;
                    } catch (Throwable th13) {
                        th = th13;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    str = "MsgDistribute";
                }
            }
        } catch (Throwable th15) {
            th = th15;
            str = "MsgDistribute";
            str2 = stringExtra2;
            obj = "serviceId";
            str3 = stringExtra;
            obj2 = "dataId";
            str4 = "accs";
            c = 0;
            c2 = 2;
        }
        i2 = 4;
        i = 0;
        c3 = c2;
        Object[] objArr2222 = new Object[i2];
        objArr2222[c] = obj2;
        objArr2222[1] = str3;
        objArr2222[c3] = obj;
        String str7222 = str2;
        objArr2222[3] = str7222;
        ALog.e(str, "distribMessage", th, objArr2222);
        d.a(str4, BaseMonitor.ALARM_POINT_REQ_ERROR, str7222, "1", "distribute error " + i);
    }

    public boolean a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81145733", new Object[]{this, new Integer(i), str, str2})).booleanValue();
        }
        if (i != 100 && !GlobalClientInfo.AGOO_SERVICE_ID.equals(str)) {
            long usableSpace = UtilityImpl.getUsableSpace();
            if (usableSpace != -1 && usableSpace <= WVFile.FILE_MAX_SIZE) {
                d.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str, "1", "space low");
                ALog.e("MsgDistribute", "user space low, don't distribute", "size", Long.valueOf(usableSpace), "serviceId", str);
                return true;
            }
        }
        return false;
    }

    public boolean a(Context context, String str, String str2, Intent intent, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("372f6013", new Object[]{this, context, str, str2, intent, iAppReceiver})).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String service = GlobalClientInfo.getInstance(context).getService(intent.getStringExtra(Constants.KEY_CONFIG_TAG), str);
            if (TextUtils.isEmpty(service) && iAppReceiver != null) {
                try {
                    service = iAppReceiver.getService(str);
                } catch (IPCException unused) {
                }
            }
            if (TextUtils.isEmpty(service)) {
                service = GlobalClientInfo.getInstance(context).getService(str);
            }
            if (UtilityImpl.isChannelProcess(context) && !com.taobao.accs.connection.state.a.a().a(context) && a(str, str2, intent)) {
                ALog.e("MsgDistribute", "message filtered", "serviceId", str, "dataId", str2);
                d.a("accs", BaseMonitor.COUNT_VERIFY, "message_filter_" + str, mto.a.GEO_NOT_SUPPORT);
                return true;
            } else if (l.a(context, 5, str) && !com.taobao.accs.connection.state.a.a().a(context)) {
                ALog.e("MsgDistribute", "main process not alive, forbidden msg", "serviceId", str);
                return true;
            } else if (!TextUtils.isEmpty(service) || UtilityImpl.isMainProcess(context)) {
                return false;
            } else {
                ALog.e("MsgDistribute", "start MsgDistributeService", "dataId", str2);
                intent.setClassName(intent.getPackage(), a(context));
                dcd.a(context, intent);
                return true;
            }
        } catch (Throwable th) {
            ALog.e("MsgDistribute", "handleMsgInChannelProcess", th, new Object[0]);
            return false;
        }
    }

    private boolean a(String str, String str2, Intent intent) {
        byte[] byteArrayExtra;
        MessageFilter messageFilter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4881613d", new Object[]{this, str, str2, intent})).booleanValue();
        }
        try {
            byteArrayExtra = intent.getByteArrayExtra("data");
            messageFilter = GlobalClientInfo.FILTERS.get(str);
        } catch (Throwable th) {
            ALog.e("MsgDistribute", "msgFilter err", th, new Object[0]);
        }
        if (byteArrayExtra != null && messageFilter != null && messageFilter.onReceiveBackgroundMessage(str2, byteArrayExtra)) {
            return true;
        }
        if ("amp-sync".equals(str) && "imba".equals(((HashMap) intent.getSerializableExtra(TaoBaseService.ExtraInfo.EXT_HEADER)).get(4))) {
            ALog.e("MsgDistribute", "imba filtered", new Object[0]);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x0193 A[Catch: IPCException -> 0x019b, TryCatch #4 {IPCException -> 0x019b, blocks: (B:187:0x0163, B:200:0x018b, B:202:0x0193, B:203:0x0197, B:197:0x0183), top: B:226:0x0163 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.content.Context r23, android.content.Intent r24, java.lang.String r25, java.lang.String r26, int r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, com.taobao.accs.IAppReceiver r31, int r32) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.c.a(android.content.Context, android.content.Intent, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, com.taobao.accs.IAppReceiver, int):void");
    }

    public void a(Context context, IAppReceiver iAppReceiver, Intent intent, String str, String str2, int i, int i2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8bb1cef", new Object[]{this, context, iAppReceiver, intent, str, str2, new Integer(i), new Integer(i2)});
            return;
        }
        if (UtilityImpl.isServiceIdPrintLog(str)) {
            ALog.e("MsgDistribute", "handleBusinessMsg start", "dataId", str2, "serviceId", str, "command", Integer.valueOf(i));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (a(context, str, intent)) {
            return;
        }
        if (m.e() && ((!"OPPO".equals(Build.BRAND) || UtilityImpl.isAppKeepAlive()) && b(context, str, intent))) {
            return;
        }
        String service = GlobalClientInfo.getInstance(context).getService(intent.getStringExtra(Constants.KEY_CONFIG_TAG), str);
        if (TextUtils.isEmpty(service) && iAppReceiver != null) {
            try {
                service = iAppReceiver.getService(str);
            } catch (IPCException unused) {
            }
        }
        if (TextUtils.isEmpty(service)) {
            service = GlobalClientInfo.getInstance(context).getService(str);
        }
        boolean z = !TextUtils.isEmpty(service);
        AccsDataListener accsDataListener = null;
        if (z && UtilityImpl.isMainProcess(context) && l.a(context, 4, str)) {
            accsDataListener = GlobalClientInfo.getInstance(context).getListener(str);
            z = accsDataListener == null;
        }
        AccsDataListener accsDataListener2 = accsDataListener;
        DataReceiveMonitor dataReceiveMonitor = DataReceiveMonitor.get(intent);
        if (dataReceiveMonitor != null) {
            dataReceiveMonitor.startBusinessTime = currentTimeMillis;
            dataReceiveMonitor.callback = z ? "service" : DataReceiveMonitor.CB_LISTENER;
            dataReceiveMonitor.dispatchTime = System.currentTimeMillis();
        }
        if (z) {
            if (UtilityImpl.isServiceIdPrintLog(str)) {
                ALog.e("MsgDistribute", "handleBusinessMsg to start service", "className", service);
            }
            intent.setClassName(context, service);
            dcd.a(context, intent);
            str3 = "accs";
        } else {
            str3 = "accs";
            if (accsDataListener2 == null) {
                accsDataListener2 = GlobalClientInfo.getInstance(context).getListener(str);
            }
            AccsDataListener accsDataListener3 = accsDataListener2;
            if (accsDataListener3 != null) {
                com.taobao.accs.utl.b.a(context, intent, accsDataListener3);
            } else if (!TextUtils.isEmpty(str) && !m.s().contains(str)) {
                ALog.e("MsgDistribute", "handleBusinessMsg getListener also null", "serviceId", str, "dataId", str2);
                d.a(str3, BaseMonitor.COUNT_MSG_LOST, "no listener", mto.a.GEO_NOT_SUPPORT);
                d.a(str3, BaseMonitor.ALARM_POINT_REQ_ERROR, str, "1", "service is null");
            }
        }
        d.a(str3, BaseMonitor.COUNT_POINT_TO_BUSS, "2commandId=" + i + "serviceId=" + str, mto.a.GEO_NOT_SUPPORT);
    }

    private boolean a(Context context, String str, Intent intent) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("425c5feb", new Object[]{this, context, str, intent})).booleanValue();
        }
        if (!str.equals("agooControl")) {
            return false;
        }
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("data");
            if (byteArrayExtra != null && byteArrayExtra.length != 0) {
                String str2 = new String(byteArrayExtra, "utf-8");
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.i("MsgDistribute", "handle agooControl message", "message", str2);
                }
                if (!TextUtils.isEmpty(str2)) {
                    JSONObject jSONObject = new JSONObject(str2);
                    boolean z = jSONObject.getBoolean(Constants.KEY_CONTROL);
                    l.a(context, Constants.KEY_CONTROL, z);
                    if (z && (jSONArray = jSONObject.getJSONArray(Constants.KEY_PACKAGES)) != null && jSONArray.length() != 0) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            NoTraceTriggerHelper.a(context, jSONArray.getString(i), 4);
                        }
                    }
                }
            }
        } catch (Exception e) {
            ALog.e("MsgDistribute", "handleBusinessMsg process agooControl message error", e, new Object[0]);
        }
        return true;
    }

    private boolean b(final Context context, String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4a714ca", new Object[]{this, context, str, intent})).booleanValue();
        }
        if (!str.equals(Constants.TARGET_SERVICE_AGOO_CONTROL_CMD)) {
            return false;
        }
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("data");
            if (byteArrayExtra != null && byteArrayExtra.length != 0) {
                String str2 = new String(byteArrayExtra, "utf-8");
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.i("MsgDistribute", "handle AgooReportToken,", "message", str2);
                }
                if (!TextUtils.isEmpty(str2) && "uploadVendorToken".equals(new JSONObject(str2).getString(Constants.KEY_CMD_TYPE))) {
                    com.taobao.accs.common.a.a().schedule(new Runnable() { // from class: com.taobao.accs.data.c.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            c.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                ALog.e("MsgDistribute", "reportToken by uploadVendorToken", new Object[0]);
                                Launcher_InitPush.manuMonitor.isAgooControlCmd = true;
                                Launcher_InitPush.initPushChannel((Application) context);
                                dca.a((Application) context);
                            } catch (Throwable th) {
                                ALog.e("MsgDistribute", "reportToken by uploadVendorToken err", th, new Object[0]);
                            }
                        }
                    }, 3L, TimeUnit.SECONDS);
                }
            }
        } catch (Throwable th) {
            ALog.e("MsgDistribute", "handleAgooReportToken err", th, new Object[0]);
        }
        return true;
    }

    public void a(Context context, Map<String, IAppReceiver> map, Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac81c3c2", new Object[]{this, context, map, intent, new Integer(i), new Integer(i2)});
            return;
        }
        ALog.e("MsgDistribute", "handBroadCastMsg", "command", Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry<String, IAppReceiver> entry : map.entrySet()) {
                Map<String, String> allService = GlobalClientInfo.getInstance(context).getAllService(entry.getKey());
                if (allService == null) {
                    try {
                        allService = entry.getValue().getAllServices();
                    } catch (IPCException e) {
                        ALog.e("MsgDistribute", "handBroadCastMsg getAllServices", e, new Object[0]);
                    }
                }
                if (allService != null) {
                    hashMap.putAll(allService);
                }
            }
        }
        if (i != 103) {
            if (i == 104) {
                for (String str : hashMap.keySet()) {
                    String str2 = (String) hashMap.get(str);
                    if (TextUtils.isEmpty(str2)) {
                        str2 = GlobalClientInfo.getInstance(context).getService(str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setClassName(context, str2);
                        dcd.a(context, intent);
                    }
                }
                return;
            }
            ALog.w("MsgDistribute", "handBroadCastMsg not handled command", new Object[0]);
            return;
        }
        ALog.e("MsgDistribute", "handBroadCastMsg ACTION_CONNECT_INFO in MsgDistributeService", new Object[0]);
        for (String str3 : hashMap.keySet()) {
            if ("accs".equals(str3) || "windvane".equals(str3) || "motu-remote".equals(str3)) {
                String str4 = (String) hashMap.get(str3);
                if (TextUtils.isEmpty(str4)) {
                    str4 = GlobalClientInfo.getInstance(context).getService(str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    intent.setClassName(context, str4);
                    dcd.a(context, intent);
                }
            }
        }
        boolean booleanExtra = intent.getBooleanExtra(Constants.KEY_CONNECT_AVAILABLE, false);
        String stringExtra = intent.getStringExtra("host");
        String stringExtra2 = intent.getStringExtra(Constants.KEY_ERROR_DETAIL);
        boolean booleanExtra2 = intent.getBooleanExtra(Constants.KEY_TYPE_INAPP, false);
        boolean booleanExtra3 = intent.getBooleanExtra(Constants.KEY_CENTER_HOST, false);
        TaoBaseService.ConnectInfo connectInfo = null;
        if (!TextUtils.isEmpty(stringExtra)) {
            if (booleanExtra) {
                connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3);
            } else {
                connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3, i2, stringExtra2);
            }
            connectInfo.connected = booleanExtra;
        }
        if (connectInfo != null) {
            ALog.d("MsgDistribute", "handBroadCastMsg ACTION_CONNECT_INFO", connectInfo);
            Intent intent2 = new Intent(Constants.ACTION_CONNECT_INFO);
            intent2.setPackage(context.getPackageName());
            intent2.putExtra(Constants.KEY_CONNECT_INFO, connectInfo);
            context.sendBroadcast(intent2);
        } else {
            ALog.e("MsgDistribute", "handBroadCastMsg connect info null, host empty", new Object[0]);
        }
        if (!intent.getBooleanExtra(Constants.KEY_INVOKE_MAIN, false) || !UtilityImpl.isMainProcess(context)) {
            return;
        }
        ALog.d("MsgDistribute", "KEY_INVOKE_MAIN: 103", new Object[0]);
        d.a("accs", BaseMonitor.COUNT_INVOKE_MAIN, "103", mto.a.GEO_NOT_SUPPORT);
    }

    private boolean a(Context context, Intent intent, String str, String str2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e039f6b5", new Object[]{this, context, intent, str, str2})).booleanValue();
        }
        boolean booleanExtra = intent.getBooleanExtra("routingAck", false);
        boolean booleanExtra2 = intent.getBooleanExtra("routingMsg", false);
        if (booleanExtra) {
            ALog.e("MsgDistribute", "recieve routiong ack", "dataId", str, "serviceId", str2);
            Set<String> set = f8237a;
            if (set != null) {
                set.remove(str);
            }
            d.a("accs", BaseMonitor.ALARM_MSG_ROUTING_RATE, "");
            z = true;
        } else {
            z = false;
        }
        if (booleanExtra2) {
            try {
                String stringExtra = intent.getStringExtra("packageName");
                ALog.e("MsgDistribute", "send routiong ack", "dataId", str, "to pkg", stringExtra, "serviceId", str2);
                Intent intent2 = new Intent(Constants.ACTION_COMMAND);
                intent2.putExtra("command", 106);
                intent2.setClassName(stringExtra, com.taobao.accs.utl.c.channelService);
                intent2.putExtra("routingAck", true);
                intent2.putExtra("packageName", stringExtra);
                intent2.putExtra("dataId", str);
                dcd.a(context, intent2);
            } catch (Throwable th) {
                ALog.e("MsgDistribute", "send routing ack", th, "serviceId", str2);
            }
        }
        return z;
    }

    private boolean c(Context context, Intent intent) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e00c95f", new Object[]{this, context, intent})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            ALog.e("MsgDistribute", "handleSyncMessage err", th, new Object[0]);
        }
        if (!intent.getBooleanExtra(Constants.KEY_SKIP_SYNC, false) && (map = (Map) intent.getSerializableExtra(TaoBaseService.ExtraInfo.EXT_HEADER)) != null && map.size() != 0) {
            String str = (String) map.get(34);
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("streamId");
                int optInt = jSONObject.optInt("streamSeqNum");
                String stringExtra = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
                if (!TextUtils.isEmpty(optString) && optInt > 0 && !TextUtils.isEmpty(stringExtra)) {
                    if (!com.taobao.accs.connection.state.a.a().a(context)) {
                        ALog.e("MsgDistribute", "handleSyncMessage drop", new Object[0]);
                        return true;
                    }
                    intent.putExtra(Constants.KEY_STREAM_ID, optString);
                    intent.putExtra(Constants.KEY_STREAM_SEQ, optInt);
                    if (UtilityImpl.isMainProcess(context)) {
                        AccsMainService.a(intent);
                    } else {
                        intent.putExtra(Constants.KEY_REUSE_BINDER, false);
                        intent.setClassName(context, AccsMainService.className);
                        dcd.a(context, intent);
                    }
                    synchronized (this) {
                        if (!TextUtils.isEmpty(this.c) && optString.equals(this.c)) {
                            if (optInt >= this.d && optInt - this.d <= 1) {
                                d.a("accs", BaseMonitor.ALARM_MSG_ORDER, "");
                                this.d = Math.max(optInt, this.d);
                            }
                            ALog.e("MsgDistribute", "out of order", "dataId", intent.getStringExtra("dataId"), "streamSeq", Integer.valueOf(optInt), "streamCacheSeq", Integer.valueOf(this.d));
                            d.a("accs", BaseMonitor.ALARM_MSG_ORDER, "", "", "");
                            this.d = Math.max(optInt, this.d);
                        }
                        this.c = optString;
                        this.d = optInt;
                        this.d = Math.max(optInt, this.d);
                    }
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    private boolean a(Context context, final Intent intent, final String str, final String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("137b363f", new Object[]{this, context, intent, str, str2, str3})).booleanValue();
        }
        AccsClientConfig accsClientConfig = null;
        if (!TextUtils.isEmpty(str3)) {
            accsClientConfig = AccsClientConfig.getConfigByTag(str3);
        }
        if (context.getPackageName().equals(intent.getPackage())) {
            return false;
        }
        try {
            NoTraceTriggerHelper.a(context, intent.getPackage(), 6);
            boolean z = accsClientConfig != null && accsClientConfig.isPullUpEnable();
            d.a("accs", BaseMonitor.COUNT_FULL_VERIFY, "handleRoutingMsg-" + z, mto.a.GEO_NOT_SUPPORT);
            ALog.e("MsgDistribute", "start MsgDistributeService", "receive pkg", context.getPackageName(), "target pkg", intent.getPackage(), "serviceId", str2);
            if (!z) {
                return true;
            }
            intent.setClassName(intent.getPackage(), com.taobao.accs.utl.c.msgService);
            intent.putExtra("routingMsg", true);
            intent.putExtra("packageName", context.getPackageName());
            dcd.a(context, intent);
            if (f8237a == null) {
                f8237a = new HashSet();
            }
            f8237a.add(str);
            com.taobao.accs.common.a.a(new Runnable() { // from class: com.taobao.accs.data.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    c.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (c.b() == null || !c.b().contains(str)) {
                    } else {
                        ALog.e("MsgDistribute", "routing msg time out, try election", "dataId", str, "serviceId", str2);
                        c.b().remove(str);
                        d.a("accs", BaseMonitor.ALARM_MSG_ROUTING_RATE, "", "timeout", "pkg:" + intent.getPackage());
                    }
                }
            }, 10L, TimeUnit.SECONDS);
            return true;
        } catch (Throwable th) {
            d.a("accs", BaseMonitor.ALARM_MSG_ROUTING_RATE, "", "exception", th.toString());
            ALog.e("MsgDistribute", "routing msg error, try election", th, "serviceId", str2, "dataId", str);
            return true;
        }
    }
}
