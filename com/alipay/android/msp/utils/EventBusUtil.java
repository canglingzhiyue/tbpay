package com.alipay.android.msp.utils;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.mobile.beehive.eventbus.EventBusManager;
import com.alipay.mobile.beehive.eventbus.IEventSubscriber;
import com.alipay.mobile.beehive.eventbus.ThreadMode;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class EventBusUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<MspContext, Map<String, IEventSubscriber>> mReceiverMap = new ConcurrentHashMap();

    public static void postNotification(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27d8c74", new Object[]{str, jSONObject});
        } else {
            EventBusManager.getInstance().post(jSONObject, str);
        }
    }

    public static synchronized boolean onNotification(MspContext mspContext, Context context, String str, IEventSubscriber iEventSubscriber) {
        synchronized (EventBusUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("35cba30b", new Object[]{mspContext, context, str, iEventSubscriber})).booleanValue();
            }
            offNotification(mspContext, context, str);
            LogUtil.record(1, "EventBusUtil:onNotification", "name=".concat(String.valueOf(str)));
            if (iEventSubscriber == null) {
                return false;
            }
            EventBusManager.getInstance().register(iEventSubscriber, ThreadMode.CURRENT, str);
            Map<String, IEventSubscriber> map = mReceiverMap.get(mspContext);
            if (map != null) {
                map.put(str, iEventSubscriber);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(str, iEventSubscriber);
                mReceiverMap.put(mspContext, hashMap);
            }
            return true;
        }
    }

    public static synchronized boolean offNotification(MspContext mspContext, Context context, String str) {
        synchronized (EventBusUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bc33883f", new Object[]{mspContext, context, str})).booleanValue();
            }
            LogUtil.record(1, "EventBusUtil:offNotification", "name=".concat(String.valueOf(str)));
            if (mspContext == null || !mReceiverMap.containsKey(mspContext)) {
                return true;
            }
            Map<String, IEventSubscriber> map = mReceiverMap.get(mspContext);
            if (map != null && map.containsKey(str)) {
                EventBusManager.getInstance().unregister(map.get(str));
                map.remove(str);
            }
            return true;
        }
    }

    public static synchronized void resetNotifications(MspContext mspContext, Context context) {
        synchronized (EventBusUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12859f32", new Object[]{mspContext, context});
                return;
            }
            if (context != null && mspContext != null && !mReceiverMap.isEmpty()) {
                Map<String, IEventSubscriber> map = mReceiverMap.get(mspContext);
                if (map != null) {
                    for (IEventSubscriber iEventSubscriber : map.values()) {
                        EventBusManager.getInstance().unregister(iEventSubscriber);
                    }
                    map.clear();
                    mReceiverMap.remove(mspContext);
                }
            }
        }
    }
}
