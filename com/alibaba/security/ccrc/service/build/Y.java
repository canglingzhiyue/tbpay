package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.wukong.plugin.BaseWuKongContentRiskPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class Y {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3286a = "NativePluginCreateManager";
    public static final String b = "wukong/plugin";
    public volatile boolean d = false;
    public List<BaseWuKongContentRiskPlugin> c = new ArrayList();

    private Map<String, Class<?>> b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c7c4b7f4", new Object[]{this, context});
        }
        HashMap hashMap = new HashMap();
        try {
            String[] list = context.getAssets().list(b);
            if (list == null || list.length == 0) {
                return null;
            }
            for (String str : list) {
                if (!TextUtils.isEmpty(str) && !hashMap.containsKey(str)) {
                    Class<?> cls = Class.forName(str);
                    if (BaseWuKongContentRiskPlugin.class.isAssignableFrom(cls)) {
                        hashMap.put(str, cls);
                    }
                }
            }
            return hashMap;
        } catch (Throwable th) {
            Logging.e(f3286a, "doLoadPlugin fail", th);
            return null;
        }
    }

    public List<? extends BaseWuKongContentRiskPlugin> a(Context context) {
        if (this.d) {
            return this.c;
        }
        Map<String, Class<?>> b2 = b(context);
        if (b2 != null && !b2.isEmpty()) {
            for (Class<?> cls : b2.values()) {
                try {
                    Object newInstance = cls.getConstructor(Context.class).newInstance(context);
                    if (newInstance instanceof BaseWuKongContentRiskPlugin) {
                        this.c.add((BaseWuKongContentRiskPlugin) newInstance);
                    }
                } catch (Throwable th) {
                    Logging.e(f3286a, "constructInstance fail", th);
                }
            }
            this.d = true;
            return this.c;
        }
        return this.c;
    }
}
