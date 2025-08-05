package com.taobao.message.lab.comfrm.support.verifier;

import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.support.model.Action1;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class ObjectVerifier {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<Object, Pair<String, String>> objectPool;
    private static int sCheckLevel;

    public static /* synthetic */ String access$000(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a928056d", new Object[]{obj}) : toJSON(obj);
    }

    public static /* synthetic */ Map access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d58732ed", new Object[0]) : objectPool;
    }

    static {
        kge.a(1106308252);
        objectPool = new ConcurrentHashMap();
        sCheckLevel = Integer.parseInt(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "ObjectVerifier", "1"));
    }

    public static void addCheckObject(final Object obj, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef328b3", new Object[]{obj, str});
        } else if (!ApplicationUtil.isDebug() || sCheckLevel <= 0 || obj == null) {
        } else {
            Schedules.lowBackground(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.verifier.ObjectVerifier.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Map access$100 = ObjectVerifier.access$100();
                    Object obj2 = obj;
                    access$100.put(obj2, new Pair(str, ObjectVerifier.access$000(obj2)));
                }
            });
        }
    }

    private static String toJSON(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8a3a71a", new Object[]{obj});
        }
        if (obj instanceof Action) {
            return ((Action) obj).toJSON().toJSONString();
        }
        return obj instanceof Event ? ((Event) obj).toJSON().toJSONString() : JSONObject.toJSONString(obj, SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteNonStringKeyAsString);
    }

    public static void check() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17afa58f", new Object[0]);
        } else {
            check(null);
        }
    }

    public static void check(final Action1 action1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d6420f", new Object[]{action1});
        } else if (!ApplicationUtil.isDebug() || sCheckLevel <= 0) {
        } else {
            Schedules.lowBackground(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.verifier.ObjectVerifier.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (Map.Entry entry : new HashMap(ObjectVerifier.access$100()).entrySet()) {
                        Object key = entry.getKey();
                        ObjectVerifier.access$100().remove(key);
                        String access$000 = ObjectVerifier.access$000(key);
                        if (!access$000.equals(((Pair) entry.getValue()).second)) {
                            String str = "tag|" + ((String) ((Pair) entry.getValue()).first) + "|new|" + access$000 + "|old|" + ((String) ((Pair) entry.getValue()).second);
                            Logger.e("ObjectVerifier", str);
                            Action1 action12 = Action1.this;
                            if (action12 != null) {
                                action12.call(str);
                            }
                            throw new IllegalStateException(str);
                        }
                    }
                }
            });
        }
    }
}
