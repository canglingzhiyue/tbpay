package com.alibaba.android.umbrella.trace;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.android.umbrella.trace.UmbrellaInfo;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class UmbrellaTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_BUSINESS_TYPE = "UMBRELLA_ERROR";
    public static final String PURCHASE_MODULE = "Page_Trade_Govern";
    public static final String PURCHASE_POINT_POST = "_Service";
    public static final String PURCHASE_POINT_PRE = "Monitor_";
    private static HashMap<String, Integer> identifyMap = new HashMap<>();
    private static int currIndex = 1;
    private static Handler sHandler = new Handler(Looper.getMainLooper()) { // from class: com.alibaba.android.umbrella.trace.UmbrellaTracker.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (!(message.obj instanceof UmbrellaInfo)) {
                return;
            }
            UmbrellaInfo umbrellaInfo = (UmbrellaInfo) message.obj;
            String str2 = "";
            if (umbrellaInfo.args != null) {
                str2 = umbrellaInfo.args.get("errorCode");
                str = umbrellaInfo.args.get("errorMsg");
            } else {
                str = str2;
            }
            UmbrellaTracker.commitFailureStability(umbrellaInfo, str2, str);
        }
    };

    public static void commitSuccessStability(UmbrellaInfo umbrellaInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("befc8537", new Object[]{umbrellaInfo});
        } else if (b.a() || umbrellaInfo == null || TextUtils.isEmpty(umbrellaInfo.mainBizName) || !b.a(umbrellaInfo)) {
        } else {
            AppMonitor.Alarm.commitSuccess("Page_Trade_Govern", PURCHASE_POINT_PRE + umbrellaInfo.mainBizName + PURCHASE_POINT_POST, umbrellaInfo.toJsonString());
        }
    }

    public static void commitSuccessStability(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1ebd8f", new Object[]{str, str2, str3, str4, str5, map});
        } else if (b.a()) {
        } else {
            UmbrellaInfo.a aVar = new UmbrellaInfo.a(str2, str3, str, str4, str5);
            aVar.a(str3).a(map);
            commitSuccessStability(aVar.a());
        }
    }

    public static void commitFailureStability(UmbrellaInfo umbrellaInfo, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b05c292", new Object[]{umbrellaInfo, str, str2});
        } else if (b.b() || c.a(str) || TextUtils.isEmpty(str) || umbrellaInfo == null || !b.a(umbrellaInfo, str)) {
        } else {
            AppMonitor.Alarm.commitFail("Page_Trade_Govern", PURCHASE_POINT_PRE + umbrellaInfo.mainBizName + PURCHASE_POINT_POST, umbrellaInfo.toJsonString(), str, str2);
        }
    }

    public static void commitFailureStability(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80feadea", new Object[]{str, str2, str3, str4, str5, map, str6, str7});
        } else if (b.b()) {
        } else {
            UmbrellaInfo.a aVar = new UmbrellaInfo.a(str2, str3, str, str4, str5);
            aVar.a(str3).a(map);
            commitFailureStability(aVar.a(), str6, str7);
        }
    }

    private static int getMessageIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeb7eb45", new Object[]{str})).intValue();
        }
        Integer num = identifyMap.get(str);
        if (num == null) {
            num = Integer.valueOf(currIndex);
            identifyMap.put(str, Integer.valueOf(currIndex));
            currIndex++;
        }
        return num.intValue();
    }

    private static String getIdentify(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bf3a659", new Object[]{str, str2, str3});
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        return str + "_" + str2 + "_" + str3;
    }

    public static void traceProcessBegin(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a0942a3", new Object[]{str, str2, str3, str4, str5, map, str6, str7, new Long(j)});
        } else if (b.b()) {
        } else {
            int messageIndex = getMessageIndex(getIdentify(str, str2, str3));
            UmbrellaInfo.a aVar = new UmbrellaInfo.a(str2, str3, str, str4, str5);
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", str6);
            hashMap.put("errorMsg", str7);
            aVar.a(hashMap);
            aVar.a(str3).a(map);
            Message obtainMessage = sHandler.obtainMessage(messageIndex);
            obtainMessage.obj = aVar.a();
            sHandler.removeMessages(messageIndex);
            sHandler.sendMessageDelayed(obtainMessage, j);
        }
    }

    public static void traceProcessEnd(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23776f6", new Object[]{str, str2, str3});
        } else if (b.b()) {
        } else {
            sHandler.removeMessages(getMessageIndex(getIdentify(str, str2, str3)));
        }
    }
}
