package com.alipay.android.msp.utils;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.dynfun.NativeDynFunTest;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class BroadcastUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<MspContext, Map<String, BroadcastReceiver>> mReceiverMap = new ConcurrentHashMap();

    public static void sendFrameChangeBroadcast(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3395f335", new Object[]{context});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(MspGlobalDefine.FRAME_CHANGE_ACTION);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void sendExitVidBroadcast(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc72354b", new Object[]{context});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(MspGlobalDefine.EXIT_VID_ACTION);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void sendMspActivityCreateBroadcast(Activity activity, MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129415e3", new Object[]{activity, mspContext});
        } else if (activity == null) {
        } else {
            Intent intent = new Intent();
            intent.setAction("MQP_MspActivityOnCreate");
            intent.putExtra("activityClass", activity.toString());
            if (mspContext != null) {
                intent.putExtra("mspBizId", mspContext.getBizId());
            }
            LocalBroadcastManager.getInstance(activity.getApplicationContext()).sendBroadcast(intent);
        }
    }

    public static void sendEnterBroadcast(Context context, MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f178b050", new Object[]{context, mspTradeContext});
            return;
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(context);
        Intent intent = new Intent("KEnterMiniPayViewNotification");
        if (mspTradeContext != null) {
            intent.putExtra("ap_link_token", mspTradeContext.getApLinkToken());
            intent.putExtra("order_str", mspTradeContext.getOrderInfo());
            if (mspTradeContext.isFromWallet() && !mspTradeContext.isFromOutScheme()) {
                z = true;
            }
            intent.putExtra(SubstituteConstants.IS_FROM_WALLET, z);
            intent.putExtra("mspBizId", mspTradeContext.getBizId());
            intent.putExtra("trade_no", mspTradeContext.getTradeNo());
            StringBuilder sb = new StringBuilder();
            sb.append(mspTradeContext.getBizId());
            intent.putExtra("serviceId", sb.toString());
        }
        try {
            LogUtil.record(1, "BroadcastUtil:sendEnterBroadcast", "extra: " + intent.toUri(1));
        } catch (Throwable unused) {
        }
        localBroadcastManager.sendBroadcast(intent);
    }

    public static void sendServerInvokeBroadcast(MspTradeContext mspTradeContext, String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ea7c85", new Object[]{mspTradeContext, str});
        } else if (mspTradeContext == null || mspTradeContext.getContext() == null) {
            LogUtil.record(4, "BroadcastUtil:sendServerInvokeBroadcast", "missing ctx ".concat(String.valueOf(mspTradeContext)));
        } else {
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(mspTradeContext.getContext());
            Intent intent = new Intent("KRecvMiniPayViewNotification");
            intent.putExtra("ap_link_token", mspTradeContext.getApLinkToken());
            intent.putExtra("order_str", mspTradeContext.getOrderInfo());
            intent.putExtra("trade_no", mspTradeContext.getTradeNo());
            if (mspTradeContext.isFromWallet() && !mspTradeContext.isFromOutScheme()) {
                z = true;
            }
            intent.putExtra(SubstituteConstants.IS_FROM_WALLET, z);
            intent.putExtra("mspBizId", mspTradeContext.getBizId());
            intent.putExtra("session_id", str);
            StringBuilder sb = new StringBuilder();
            sb.append(mspTradeContext.getBizId());
            intent.putExtra("serviceId", sb.toString());
            try {
                LogUtil.record(1, "BroadcastUtil:sendServerInvokeBroadcast", "extra: " + intent.toUri(1));
            } catch (Throwable unused) {
            }
            localBroadcastManager.sendBroadcast(intent);
            NativeDynFunTest.doDynFunTestOnNewThread(mspTradeContext);
        }
    }

    public static void sendChannelOrderChangedBroadcast(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f72bae1", new Object[]{context});
        } else {
            LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("MQPChannelDataSync"));
        }
    }

    public static void sendEndBroadcast(Context context, String str, MspTradeContext mspTradeContext, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e1d74ad", new Object[]{context, str, mspTradeContext, str2});
            return;
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(context);
        Intent intent = new Intent("KExitMiniPayViewNotification");
        intent.putExtra("hasMultiCashier", true);
        intent.putExtra("ts", System.currentTimeMillis());
        intent.putExtra("sessionId", str);
        if (mspTradeContext != null) {
            intent.putExtra("ap_link_token", mspTradeContext.getApLinkToken());
            intent.putExtra("order_str", mspTradeContext.getOrderInfo());
            intent.putExtra(MspGlobalDefine.SCHEME_PAY_RESULT, str2);
            intent.putExtra("trade_no", mspTradeContext.getTradeNo());
            StringBuilder sb = new StringBuilder();
            sb.append(mspTradeContext.getBizId());
            intent.putExtra("serviceId", sb.toString());
        }
        try {
            LogUtil.record(1, "BroadcastUtil:sendEndBroadcast", "extra: " + intent.toUri(1));
        } catch (Throwable unused) {
        }
        inspectLocalBroadcastReceivers(context);
        localBroadcastManager.sendBroadcast(intent);
    }

    public static void inspectLocalBroadcastReceivers(Context context) {
        LogUtil.record(8, "BroadcastUtil:inspectLocalBroadcastReceivers", "inspecting");
        try {
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(context);
            Field declaredField = localBroadcastManager.getClass().getDeclaredField("mReceivers");
            declaredField.setAccessible(true);
            LogUtil.record(8, "BroadcastUtil:inspectLocalBroadcastReceivers", "recv ".concat(String.valueOf(declaredField.get(localBroadcastManager))));
        } catch (Throwable th) {
            LogUtil.record(8, "BroadcastUtil:inspectLocalBroadcastReceivers", "failed1");
            LogUtil.printExceptionStackTrace(th);
        }
        try {
            LocalBroadcastManager localBroadcastManager2 = LocalBroadcastManager.getInstance(context);
            Field declaredField2 = localBroadcastManager2.getClass().getDeclaredField("mActions");
            declaredField2.setAccessible(true);
            LogUtil.record(8, "BroadcastUtil:inspectLocalBroadcastReceivers", "act ".concat(String.valueOf(declaredField2.get(localBroadcastManager2))));
        } catch (Throwable th2) {
            LogUtil.record(8, "BroadcastUtil:inspectLocalBroadcastReceivers", "failed2");
            LogUtil.printExceptionStackTrace(th2);
        }
    }

    public static void sendRendPageResultToSource(String str, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6694c5f", new Object[]{str, context, new Integer(i)});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("notifyName", (Object) str);
            sendPostNotificationBroadcast(jSONObject.toJSONString(), context, i);
        }
    }

    public static void notifyFpAuthTimeout(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2530fc3b", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction(MspGlobalDefine.FP_AUTHENTICATE_ACTION);
            intent.putExtra("result", 113);
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static void notifyFpRegisterTimeout(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e3ea36", new Object[]{context});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(MspGlobalDefine.FP_REGISTER_ACTION);
        intent.putExtra("result", 113);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static JSONObject sendPostNotificationBroadcast(String str, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bfebd35a", new Object[]{str, context, new Integer(i)});
        }
        LogUtil.record(1, "BroadcastUtil:sendPostNotificationBroadcast", "sendPostNotificationBroadcast");
        JSONObject parseObject = JSON.parseObject(str);
        String string = parseObject.getString("notifyName");
        JSONObject jSONObject = parseObject.getJSONObject("data");
        String str2 = null;
        if (parseObject.containsKey(MspGlobalDefine.NOTIFY_HASH_ID)) {
            str2 = parseObject.getString(MspGlobalDefine.NOTIFY_HASH_ID);
        }
        return postNotification(string, jSONObject, str2, context, i);
    }

    public static JSONObject postNotification(String str, JSONObject jSONObject, String str2, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("181ab719", new Object[]{str, jSONObject, str2, context, new Integer(i)});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (context == null) {
            context = GlobalHelper.getInstance().getContext();
        }
        Intent intent = new Intent();
        intent.setAction(str);
        if (jSONObject != null) {
            Bundle bundle = new Bundle();
            for (String str3 : jSONObject.keySet()) {
                String obj = str3.toString();
                bundle.putString(obj, jSONObject.getString(obj));
                jSONObject2.put(obj, (Object) jSONObject.getString(obj));
            }
            intent.putExtras(bundle);
        }
        intent.putExtra("mspBizId", i);
        jSONObject2.put("mspBizId", (Object) Integer.valueOf(i));
        if (!StringUtils.isEmpty(str2)) {
            intent.putExtra(MspGlobalDefine.NOTIFY_HASH_ID, str2);
            jSONObject2.put(MspGlobalDefine.NOTIFY_HASH_ID, (Object) str2);
        }
        if (context != null) {
            LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent);
        }
        return jSONObject2;
    }

    public static synchronized boolean onNotification(MspContext mspContext, Context context, String str, BroadcastReceiver broadcastReceiver) {
        synchronized (BroadcastUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("31bb67a0", new Object[]{mspContext, context, str, broadcastReceiver})).booleanValue();
            }
            offNotification(mspContext, context, str);
            LogUtil.record(1, "BroadcastUtil:onNotification", "name=".concat(String.valueOf(str)));
            if (broadcastReceiver == null) {
                return false;
            }
            LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver, new IntentFilter(str));
            Map<String, BroadcastReceiver> map = mReceiverMap.get(mspContext);
            if (map != null) {
                map.put(str, broadcastReceiver);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(str, broadcastReceiver);
                mReceiverMap.put(mspContext, hashMap);
            }
            return true;
        }
    }

    public static synchronized boolean offNotification(MspContext mspContext, Context context, String str) {
        synchronized (BroadcastUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bc33883f", new Object[]{mspContext, context, str})).booleanValue();
            }
            LogUtil.record(1, "BroadcastUtil:offNotification", "name=".concat(String.valueOf(str)));
            if (mspContext == null || !mReceiverMap.containsKey(mspContext)) {
                return true;
            }
            Map<String, BroadcastReceiver> map = mReceiverMap.get(mspContext);
            if (map != null && map.containsKey(str)) {
                LocalBroadcastManager.getInstance(context).unregisterReceiver(map.get(str));
                map.remove(str);
            }
            return true;
        }
    }

    public static synchronized void resetNotifications(MspContext mspContext, Context context) {
        synchronized (BroadcastUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12859f32", new Object[]{mspContext, context});
                return;
            }
            if (context != null && mReceiverMap != null && mspContext != null) {
                Map<String, BroadcastReceiver> map = mReceiverMap.get(mspContext);
                if (map != null) {
                    for (BroadcastReceiver broadcastReceiver : map.values()) {
                        LocalBroadcastManager.getInstance(context).unregisterReceiver(broadcastReceiver);
                    }
                    map.clear();
                    mReceiverMap.remove(mspContext);
                }
            }
        }
    }
}
