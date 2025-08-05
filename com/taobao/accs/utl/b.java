package com.taobao.accs.utl;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.detect.NetworkDetector;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.aranger.exception.IPCException;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AccsHandler";

    /* renamed from: a  reason: collision with root package name */
    private static Handler f8297a;

    public static /* synthetic */ TaoBaseService.ExtraInfo a(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoBaseService.ExtraInfo) ipChange.ipc$dispatch("2ef94106", new Object[]{intent}) : b(intent);
    }

    public static /* synthetic */ boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : b(str);
    }

    static {
        kge.a(-1564551156);
        f8297a = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v17, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [long] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static int a(Context context, final Intent intent, final AccsDataListener accsDataListener) {
        final String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cc3e233", new Object[]{context, intent, accsDataListener})).intValue();
        }
        final String str4 = TAG;
        if (accsDataListener == null || context == null) {
            ALog.e(str4, "onReceiveData listener or context null", new Object[0]);
            return 2;
        } else if (intent == null) {
            return 2;
        } else {
            ?? currentTimeMillis = System.currentTimeMillis();
            try {
                final int intExtra = intent.getIntExtra("command", -1);
                final int intExtra2 = intent.getIntExtra("errorCode", 0);
                str = intent.getStringExtra("userInfo");
                final String stringExtra = intent.getStringExtra("dataId");
                try {
                    final String stringExtra2 = intent.getStringExtra("serviceId");
                    try {
                        String name = accsDataListener.getClass().getName();
                        str2 = new Object[]{"dataId", stringExtra, "serviceId", stringExtra2, "command", Integer.valueOf(intExtra), "className", name};
                        try {
                            ALog.e(str4, "onReceiveData", str2);
                            try {
                                if (intExtra > 0) {
                                    str3 = BaseMonitor.COUNT_POINT_TO_BUSS;
                                    StringBuilder sb = new StringBuilder();
                                    name = "onReceiveData";
                                    try {
                                        sb.append("3commandId=");
                                        sb.append(intExtra);
                                        sb.append("serviceId=");
                                        sb.append(stringExtra2);
                                        d.a("accs", str3, sb.toString(), mto.a.GEO_NOT_SUPPORT);
                                        if (intExtra == 5) {
                                            str = str4;
                                            currentTimeMillis = "1";
                                            str4 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                                            str2 = name;
                                            a(stringExtra2, new Runnable() { // from class: com.taobao.accs.utl.b.1
                                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    IpChange ipChange2 = $ipChange;
                                                    if (ipChange2 instanceof IpChange) {
                                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                                        return;
                                                    }
                                                    try {
                                                        AccsDataListener.this.onBind(stringExtra2, intExtra2, b.a(intent));
                                                    } catch (IPCException e) {
                                                        ALog.e(b.TAG, "onReceiveData onBind", e, new Object[0]);
                                                    }
                                                }
                                            });
                                        } else if (intExtra == 6) {
                                            str = str4;
                                            currentTimeMillis = "1";
                                            str4 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                                            str2 = name;
                                            a(stringExtra2, new Runnable() { // from class: com.taobao.accs.utl.b.2
                                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    IpChange ipChange2 = $ipChange;
                                                    if (ipChange2 instanceof IpChange) {
                                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                                        return;
                                                    }
                                                    try {
                                                        AccsDataListener.this.onUnbind(stringExtra2, intExtra2, b.a(intent));
                                                    } catch (IPCException e) {
                                                        ALog.e(b.TAG, "onReceiveData onUnbind", e, new Object[0]);
                                                    }
                                                }
                                            });
                                        } else if (intExtra != 100) {
                                            try {
                                                if (intExtra != 101) {
                                                    if (intExtra == 103) {
                                                        try {
                                                            boolean booleanExtra = intent.getBooleanExtra(Constants.KEY_CONNECT_AVAILABLE, false);
                                                            final String stringExtra3 = intent.getStringExtra("host");
                                                            final String stringExtra4 = intent.getStringExtra(Constants.KEY_ERROR_DETAIL);
                                                            final boolean booleanExtra2 = intent.getBooleanExtra(Constants.KEY_TYPE_INAPP, false);
                                                            final boolean booleanExtra3 = intent.getBooleanExtra(Constants.KEY_CENTER_HOST, false);
                                                            if (!TextUtils.isEmpty(stringExtra3)) {
                                                                if (booleanExtra) {
                                                                    a(stringExtra2, new Runnable() { // from class: com.taobao.accs.utl.b.7
                                                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                                                        @Override // java.lang.Runnable
                                                                        public void run() {
                                                                            IpChange ipChange2 = $ipChange;
                                                                            if (ipChange2 instanceof IpChange) {
                                                                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                                                                return;
                                                                            }
                                                                            try {
                                                                                AccsDataListener.this.onConnected(new TaoBaseService.ConnectInfo(stringExtra3, booleanExtra2, booleanExtra3));
                                                                            } catch (IPCException e) {
                                                                                ALog.e(b.TAG, "onReceiveData onConnected", e, new Object[0]);
                                                                            }
                                                                        }
                                                                    });
                                                                } else {
                                                                    a(stringExtra2, new Runnable() { // from class: com.taobao.accs.utl.b.8
                                                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                                                        @Override // java.lang.Runnable
                                                                        public void run() {
                                                                            IpChange ipChange2 = $ipChange;
                                                                            if (ipChange2 instanceof IpChange) {
                                                                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                                                                return;
                                                                            }
                                                                            try {
                                                                                AccsDataListener.this.onDisconnected(new TaoBaseService.ConnectInfo(stringExtra3, booleanExtra2, booleanExtra3, intExtra2, stringExtra4));
                                                                            } catch (IPCException e) {
                                                                                ALog.e(b.TAG, "onReceiveData onDisconnected", e, new Object[0]);
                                                                            }
                                                                        }
                                                                    });
                                                                }
                                                            }
                                                        } catch (Exception e) {
                                                            e = e;
                                                            str3 = name;
                                                            str = str4;
                                                            str2 = str3;
                                                            currentTimeMillis = "1";
                                                            str4 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                                                            d.a("accs", str4, "", currentTimeMillis, "callback error" + e.toString());
                                                            ALog.e(str, str2, e, new Object[0]);
                                                            return 2;
                                                        }
                                                    } else if (intExtra == 104) {
                                                        final boolean booleanExtra4 = intent.getBooleanExtra(Constants.KEY_ANTI_BRUSH_RET, false);
                                                        ALog.e(str4, "onReceiveData anti brush result:" + booleanExtra4, new Object[0]);
                                                        a(stringExtra2, new Runnable() { // from class: com.taobao.accs.utl.b.6
                                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                                            @Override // java.lang.Runnable
                                                            public void run() {
                                                                IpChange ipChange2 = $ipChange;
                                                                if (ipChange2 instanceof IpChange) {
                                                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                                                    return;
                                                                }
                                                                try {
                                                                    AccsDataListener.this.onAntiBrush(booleanExtra4, null);
                                                                } catch (IPCException e2) {
                                                                    ALog.e(b.TAG, "onReceiveData onAntiBrush", e2, new Object[0]);
                                                                }
                                                            }
                                                        });
                                                    } else {
                                                        ALog.w(str4, "onReceiveData command not handled", new Object[0]);
                                                    }
                                                    return 2;
                                                }
                                                str2 = name;
                                                byte[] byteArrayExtra = intent.getByteArrayExtra("data");
                                                boolean booleanExtra5 = intent.getBooleanExtra(Constants.KEY_NEED_BUSINESS_ACK, false);
                                                try {
                                                    if (byteArrayExtra != null) {
                                                        if (intent.getBooleanExtra(Constants.KEY_INVOKE_MAIN, false) && UtilityImpl.isMainProcess(context)) {
                                                            ALog.d(str4, "KEY_INVOKE_MAIN: ", "serviceId", stringExtra2);
                                                            d.a("accs", BaseMonitor.COUNT_INVOKE_MAIN, stringExtra2, mto.a.GEO_NOT_SUPPORT);
                                                        }
                                                        if (b(stringExtra2)) {
                                                            ALog.e(str4, "onReceiveData COMMAND_RECEIVE_DATA onData dataId:" + stringExtra + " serviceId:" + stringExtra2, new Object[0]);
                                                        }
                                                        final TaoBaseService.ExtraInfo b = b(intent);
                                                        if (booleanExtra5) {
                                                            ALog.i(str4, "onReceiveData try to send biz ack dataId " + stringExtra, new Object[0]);
                                                            a(context, intent, stringExtra, b.oriExtHeader);
                                                        }
                                                        try {
                                                            intent.getExtras().setClassLoader(NetPerformanceMonitor.class.getClassLoader());
                                                        } catch (Exception e2) {
                                                            ALog.e(str4, "get NetPerformanceMonitor Error:", e2, new Object[0]);
                                                        }
                                                        d.a("accs", BaseMonitor.COUNT_POINT_TO_BUSS_SUCCESS, "1commandId=101serviceId=" + stringExtra2, mto.a.GEO_NOT_SUPPORT);
                                                        final DataReceiveMonitor dataReceiveMonitor = DataReceiveMonitor.get(intent);
                                                        if (dataReceiveMonitor != null) {
                                                            dataReceiveMonitor.accsHandlerTime = currentTimeMillis;
                                                            dataReceiveMonitor.accsExecTime = System.currentTimeMillis();
                                                        }
                                                        str = str4;
                                                        str4 = byteArrayExtra;
                                                        a(stringExtra2, new Runnable() { // from class: com.taobao.accs.utl.b.3
                                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                                            @Override // java.lang.Runnable
                                                            public void run() {
                                                                IpChange ipChange2 = $ipChange;
                                                                if (ipChange2 instanceof IpChange) {
                                                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                                                    return;
                                                                }
                                                                try {
                                                                    if (DataReceiveMonitor.this != null) {
                                                                        DataReceiveMonitor.this.endTime = System.currentTimeMillis();
                                                                        AppMonitor.getInstance().commitStat(DataReceiveMonitor.this);
                                                                    }
                                                                    if (b.a(stringExtra2)) {
                                                                        ALog.e(b.TAG, "onData start", "dataId", stringExtra, "serviceId", stringExtra2, "command", Integer.valueOf(intExtra), "className", accsDataListener.getClass().getName());
                                                                    }
                                                                    accsDataListener.onData(stringExtra2, str, stringExtra, str4, b);
                                                                    if (!b.a(stringExtra2)) {
                                                                        return;
                                                                    }
                                                                    ALog.e(b.TAG, "onData end", "dataId", stringExtra);
                                                                } catch (IPCException e3) {
                                                                    ALog.e(b.TAG, "onReceiveData onData", e3, new Object[0]);
                                                                }
                                                            }
                                                        });
                                                        return 2;
                                                    }
                                                    str = str4;
                                                    ALog.e(str, "onReceiveData COMMAND_RECEIVE_DATA msg null", new Object[0]);
                                                    String str5 = "1";
                                                    String str6 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                                                    d.a("accs", str6, stringExtra2, str5, "COMMAND_RECEIVE_DATA msg null");
                                                    str4 = str6;
                                                    currentTimeMillis = str5;
                                                    str2 = str2;
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    str2 = str2;
                                                    currentTimeMillis = "1";
                                                    str4 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                                                    d.a("accs", str4, "", currentTimeMillis, "callback error" + e.toString());
                                                    ALog.e(str, str2, e, new Object[0]);
                                                    return 2;
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                            }
                                        } else {
                                            str = str4;
                                            Object obj = "1";
                                            Object obj2 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                                            String str7 = name;
                                            if (TextUtils.equals(Constants.SEND_TYPE_RES, intent.getStringExtra(Constants.KEY_SEND_TYPE))) {
                                                final byte[] byteArrayExtra2 = intent.getByteArrayExtra("data");
                                                a(stringExtra2, new Runnable() { // from class: com.taobao.accs.utl.b.4
                                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        IpChange ipChange2 = $ipChange;
                                                        if (ipChange2 instanceof IpChange) {
                                                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                                            return;
                                                        }
                                                        try {
                                                            if (b.a(stringExtra2)) {
                                                                ALog.e(b.TAG, "onResponse start dataId:" + stringExtra + " serviceId:" + stringExtra2, new Object[0]);
                                                            }
                                                            accsDataListener.onResponse(stringExtra2, stringExtra, intExtra2, byteArrayExtra2, b.a(intent));
                                                            if (!b.a(stringExtra2)) {
                                                                return;
                                                            }
                                                            ALog.e(b.TAG, "onResponse end dataId:" + stringExtra, new Object[0]);
                                                        } catch (IPCException e5) {
                                                            ALog.e(b.TAG, "onReceiveData onResponse", e5, new Object[0]);
                                                        }
                                                    }
                                                });
                                                str4 = obj2;
                                                currentTimeMillis = obj;
                                                str2 = str7;
                                            } else {
                                                a(stringExtra2, new Runnable() { // from class: com.taobao.accs.utl.b.5
                                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        IpChange ipChange2 = $ipChange;
                                                        if (ipChange2 instanceof IpChange) {
                                                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                                            return;
                                                        }
                                                        try {
                                                            if (b.a(stringExtra2)) {
                                                                ALog.e(b.TAG, "onSendData start dataId:" + stringExtra + " serviceId:" + stringExtra2, new Object[0]);
                                                            }
                                                            accsDataListener.onSendData(stringExtra2, stringExtra, intExtra2, b.a(intent));
                                                            if (b.a(stringExtra2)) {
                                                                ALog.e(b.TAG, "onSendData end dataId:" + stringExtra, new Object[0]);
                                                            }
                                                        } catch (IPCException e5) {
                                                            ALog.e(b.TAG, "onReceiveData onSendData", e5, new Object[0]);
                                                        }
                                                        try {
                                                            if (!intent.hasExtra(Constants.KEY_UP_RTT) || !intent.hasExtra("host")) {
                                                                return;
                                                            }
                                                            String stringExtra5 = intent.getStringExtra("host");
                                                            long longExtra = intent.getLongExtra(Constants.KEY_UP_RTT, 0L);
                                                            NetworkDetector.getRTTDetector().recordRTT(stringExtra5, 2, longExtra);
                                                            ALog.e(b.TAG, "recordRTT", "host", stringExtra5, "rtt", Long.valueOf(longExtra));
                                                        } catch (Throwable th) {
                                                            ALog.e(b.TAG, "NetworkDetector err", th, new Object[0]);
                                                        }
                                                    }
                                                });
                                                str4 = obj2;
                                                currentTimeMillis = obj;
                                                str2 = str7;
                                            }
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        str = str4;
                                        currentTimeMillis = "1";
                                        str4 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                                        str2 = name;
                                        d.a("accs", str4, "", currentTimeMillis, "callback error" + e.toString());
                                        ALog.e(str, str2, e, new Object[0]);
                                        return 2;
                                    }
                                } else {
                                    str2 = "onReceiveData";
                                    str = str4;
                                    currentTimeMillis = "1";
                                    str4 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                                    ALog.w(str, "onReceiveData command not handled", new Object[0]);
                                }
                                return 2;
                            } catch (Exception e6) {
                                e = e6;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            str3 = "onReceiveData";
                        }
                    } catch (Exception e8) {
                        e = e8;
                        str = str4;
                        str2 = "onReceiveData";
                    }
                } catch (Exception e9) {
                    e = e9;
                    str = str4;
                    str4 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                    str2 = "onReceiveData";
                    currentTimeMillis = "1";
                }
            } catch (Exception e10) {
                e = e10;
                str = str4;
                currentTimeMillis = "1";
                str4 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                str2 = "onReceiveData";
            }
        }
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : UtilityImpl.isServiceIdPrintLog(str);
    }

    private static void a(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d729b0", new Object[]{str, runnable});
        } else if (Constants.IMPAAS.equals(str) || GlobalClientInfo.AGOO_SERVICE_ID.equals(str) || l.a(GlobalClientInfo.getContext(), 3, str)) {
            com.taobao.accs.common.a.b(runnable);
        } else if ("powermsg3".equals(str)) {
            com.taobao.accs.common.a.h().execute(runnable);
        } else {
            f8297a.post(runnable);
        }
    }

    private static Map<TaoBaseService.ExtHeaderType, String> a(Map<Integer, String> map) {
        HashMap hashMap;
        TaoBaseService.ExtHeaderType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        try {
            hashMap = new HashMap();
            try {
                for (TaoBaseService.ExtHeaderType extHeaderType : TaoBaseService.ExtHeaderType.values()) {
                    String str = map.get(Integer.valueOf(extHeaderType.ordinal()));
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put(extHeaderType, str);
                    }
                }
            } catch (Exception e) {
                e = e;
                ALog.e(TAG, "getExtHeader", e, new Object[0]);
                return hashMap;
            }
        } catch (Exception e2) {
            e = e2;
            hashMap = null;
        }
        return hashMap;
    }

    private static TaoBaseService.ExtraInfo b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoBaseService.ExtraInfo) ipChange.ipc$dispatch("62a76bc7", new Object[]{intent});
        }
        TaoBaseService.ExtraInfo extraInfo = new TaoBaseService.ExtraInfo();
        try {
            HashMap hashMap = (HashMap) intent.getSerializableExtra(TaoBaseService.ExtraInfo.EXT_HEADER);
            Map<TaoBaseService.ExtHeaderType, String> a2 = a(hashMap);
            String stringExtra = intent.getStringExtra("packageName");
            String stringExtra2 = intent.getStringExtra("host");
            extraInfo.connType = intent.getIntExtra(Constants.KEY_CONN_TYPE, 0);
            extraInfo.extHeader = a2;
            extraInfo.oriExtHeader = hashMap;
            extraInfo.fromPackage = stringExtra;
            extraInfo.fromHost = stringExtra2;
            if (intent.hasExtra(Constants.KEY_FULL_LINK)) {
                extraInfo.fullLink = (TaoBaseService.AccsFullLink) intent.getSerializableExtra(Constants.KEY_FULL_LINK);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "getExtraInfo err", th, new Object[0]);
        }
        return extraInfo;
    }

    private static void a(Context context, Intent intent, String str, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcc78ffe", new Object[]{context, intent, str, map});
            return;
        }
        try {
            ALog.i(TAG, "sendBusinessAck", "dataId", str);
            if (intent == null) {
                return;
            }
            String stringExtra = intent.getStringExtra("host");
            String stringExtra2 = intent.getStringExtra("source");
            String stringExtra3 = intent.getStringExtra("target");
            String stringExtra4 = intent.getStringExtra("appKey");
            String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
            short shortExtra = intent.getShortExtra("flags", (short) 0);
            com.taobao.accs.a accsInstance = ACCSManager.getAccsInstance(context, stringExtra4, stringExtra5);
            if (accsInstance != null) {
                accsInstance.sendBusinessAck(stringExtra3, stringExtra2, str, shortExtra, stringExtra, map);
                d.a("accs", BaseMonitor.COUNT_BUSINESS_ACK_SUCC, "", mto.a.GEO_NOT_SUPPORT);
                return;
            }
            d.a("accs", BaseMonitor.COUNT_BUSINESS_ACK_FAIL, "no acsmgr", mto.a.GEO_NOT_SUPPORT);
        } catch (Throwable th) {
            ALog.e(TAG, "sendBusinessAck", th, new Object[0]);
            d.a("accs", BaseMonitor.COUNT_BUSINESS_ACK_FAIL, th.toString(), mto.a.GEO_NOT_SUPPORT);
        }
    }
}
