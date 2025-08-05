package com.taobao.android;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class AliConfigImp implements AliConfigInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AliConfigImp f8598a;
    private final OrangeConfig b;
    private final HashMap<c, d> c = new HashMap<>();

    static {
        kge.a(688884639);
        kge.a(-1388054836);
        f8598a = new AliConfigImp(OrangeConfig.getInstance());
    }

    public static AliConfigImp getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliConfigImp) ipChange.ipc$dispatch("7ce42184", new Object[0]) : f8598a;
    }

    public AliConfigImp(OrangeConfig orangeConfig) {
        this.b = orangeConfig;
    }

    @Override // com.taobao.android.AliConfigInterface
    public String a(String str, String str2, String str3) {
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        if (TextUtils.isEmpty(str2)) {
            config = this.b.getCustomConfig(str, str3);
        } else {
            config = this.b.getConfig(str, str2, str3);
        }
        String str4 = "getConfig(" + str + ", " + str2 + ", " + str3 + ")=" + config;
        return config;
    }

    @Override // com.taobao.android.AliConfigInterface
    public Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        Map<String, String> configs = this.b.getConfigs(str);
        String str2 = "getConfigs(" + str + ")=" + configs;
        return configs;
    }

    @Override // com.taobao.android.AliConfigInterface
    public void a(String[] strArr, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d53491f6", new Object[]{this, strArr, cVar});
            return;
        }
        synchronized (this.c) {
            d dVar = this.c.get(cVar);
            if (dVar == null) {
                dVar = new d(cVar);
                this.c.put(cVar, dVar);
            }
            this.b.registerListener(strArr, dVar, false);
            String str = "registerListener(" + Arrays.toString(strArr) + ", " + cVar + riy.BRACKET_END_STR;
        }
    }
}
