package com.taobao.flowcustoms.afc;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.flowcustoms.afc.utils.f;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.kog;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static b b;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f17180a = new HashMap();

    static {
        kge.a(-2139933395);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e3efefa", new Object[0]);
        }
        if (b == null) {
            b = new b();
        }
        return b;
    }

    public b() {
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c.a("linkx", "AfcOrange === initOrange === groupName: flow_customs_in");
        OrangeConfig.getInstance().registerListener(new String[]{!StringUtils.isEmpty(kog.a().l) ? kog.a().l : "flow_customs_in"}, new d() { // from class: com.taobao.flowcustoms.afc.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    return;
                }
                Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
                c.a("linkx", "AfcOrange === registerListener === nameSpace为：" + str + " === 获取到的configs: " + configs);
                b.this.f17180a = configs;
                f.a(AfcCustomSdk.a().f17167a).a("flow_customs_in_local", configs);
            }
        }, false);
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"applink_xbs_config"}, new d() { // from class: com.taobao.flowcustoms.afc.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    } else {
                        f.a(AfcCustomSdk.a().f17167a).a("applink_xbs_config", OrangeConfig.getInstance().getCustomConfig(str, ""));
                    }
                }
            }, false);
        }
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        Map<String, String> map = this.f17180a;
        if (map == null || map.size() == 0) {
            this.f17180a = f.a(AfcCustomSdk.a().f17167a).a("flow_customs_in_local");
        }
        Map<String, String> map2 = this.f17180a;
        if (map2 == null || map2.size() == 0) {
            return str2;
        }
        String str3 = this.f17180a.get(str);
        return StringUtils.isEmpty(str3) ? str2 : str3;
    }

    public <T> T a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21de4147", new Object[]{this, str, cls});
        }
        T t = null;
        Map<String, String> map = this.f17180a;
        if (map == null || map.size() == 0) {
            this.f17180a = f.a(AfcCustomSdk.a().f17167a).a("flow_customs_in_local");
        }
        Map<String, String> map2 = this.f17180a;
        if (map2 != null) {
            t = (T) JSON.parseObject(map2.get(str), cls);
        }
        c.a("linkx", "AfcOrange === configs2Bean === mFlowInConfig: " + this.f17180a + "  mT == " + t);
        return t;
    }
}
