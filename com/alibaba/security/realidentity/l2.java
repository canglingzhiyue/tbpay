package com.alibaba.security.realidentity;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* loaded from: classes3.dex */
public class l2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3458a = "l2";
    public static final String b = "cro_rpsdk_config";
    public static final String c = "rpsdk_init_wukong_switch";
    public static final String d = "1";
    public static final String e = "0";

    /* loaded from: classes3.dex */
    public class a implements com.taobao.orange.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k2 f3459a;

        public a(k2 k2Var) {
            this.f3459a = k2Var;
        }

        @Override // com.taobao.orange.d
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (!l2.b.equals(str)) {
            } else {
                String a2 = l2.a(l2.this, str, l2.c, "0");
                k2 k2Var = this.f3459a;
                if (k2Var == null) {
                    return;
                }
                k2Var.a("1".equals(a2));
            }
        }
    }

    public static /* synthetic */ String a(l2 l2Var, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b6899236", new Object[]{l2Var, str, str2, str3}) : l2Var.a(str, str2, str3);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (a()) {
            return "1".equals(a(b, c, "0"));
        }
        return false;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!a()) {
        } else {
            OrangeConfig.getInstance().unregisterListener(new String[]{b});
        }
    }

    public void a(k2 k2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2dca34b", new Object[]{this, k2Var});
        } else if (a()) {
            OrangeConfig.getInstance().registerListener(new String[]{b}, new a(k2Var), true);
        } else if (k2Var == null) {
        } else {
            k2Var.a(false);
        }
    }

    private String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3}) : OrangeConfig.getInstance().getConfig(str, str2, str3);
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        try {
            Class.forName("com.taobao.orange.d");
            Class.forName("com.taobao.orange.OrangeConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
