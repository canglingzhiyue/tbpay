package com.taobao.privacyguard.config;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile b f18947a;
    public RuleConfig b = new RuleConfig();

    static {
        kge.a(-1722385044);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("303fe9", new Object[0]);
        }
        if (f18947a == null) {
            synchronized (b.class) {
                if (f18947a == null) {
                    f18947a = new b();
                }
            }
        }
        return f18947a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            Log.e("PGRuleManager", "updateRules: jsonRules is null!");
        } else {
            try {
                this.b = (RuleConfig) JSON.toJavaObject(JSONObject.parseObject(str), RuleConfig.class);
            } catch (Throwable th) {
                Log.e("PGRuleManager", "updateRules: update config rules failed!");
                th.printStackTrace();
            }
            String str2 = "updateRules: update rules success, rules : [" + str + "] ";
        }
    }

    public RuleConfig b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RuleConfig) ipChange.ipc$dispatch("43f036ee", new Object[]{this}) : this.b;
    }
}
