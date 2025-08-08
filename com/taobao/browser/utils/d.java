package com.taobao.browser.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WINDVANE_CONFIG = "WindVane";

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f16844a;
    private boolean b = true;
    private String c = "";
    private String d = "";

    static {
        kge.a(813294241);
        f16844a = null;
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("54463a91", new Object[0]);
        }
        if (f16844a == null) {
            synchronized (d.class) {
                if (f16844a == null) {
                    f16844a = new d();
                }
            }
        }
        return f16844a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig("WindVane", i.TB_ALLOW_OPEN_CLIENT, "1");
        this.c = OrangeConfig.getInstance().getConfig("WindVane", "openClientBlackList", "");
        this.d = OrangeConfig.getInstance().getConfig("WindVane", "openClientWriteList", "");
        if ("0".equals(config)) {
            this.b = false;
        } else {
            this.b = true;
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(this.c)) {
            return false;
        }
        try {
            Pattern compile = Pattern.compile(this.c, 2);
            if (!StringUtils.isEmpty(str)) {
                return compile.matcher(str).matches();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(this.d)) {
            return false;
        }
        try {
            Pattern compile = Pattern.compile(this.d, 2);
            if (!StringUtils.isEmpty(str)) {
                return compile.matcher(str).matches();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b;
    }
}
