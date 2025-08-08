package com.ut.mini;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.config.UTClientConfigMgr;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.any;
import tb.apr;
import tb.aqe;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f24099a;
    private List<String> b;
    private List<String> c;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;

    public static /* synthetic */ void a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f154df36", new Object[]{cVar, str});
        } else {
            cVar.b(str);
        }
    }

    public static /* synthetic */ boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8bdc7870", new Object[]{cVar})).booleanValue() : cVar.f;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efb347ec", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.f = z;
        return z;
    }

    public static /* synthetic */ String b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d40fb535", new Object[]{cVar}) : cVar.d();
    }

    public static /* synthetic */ void b(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a77bd5", new Object[]{cVar, str});
        } else {
            cVar.c(str);
        }
    }

    static {
        kge.a(-285584271);
        f24099a = new c();
    }

    private c() {
    }

    public static c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("fc0cb86d", new Object[0]) : f24099a;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.e) {
        } else {
            this.e = true;
            aqe.a().a(new Runnable() { // from class: com.ut.mini.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (c.this) {
                        if (c.a(c.this)) {
                            return;
                        }
                        String b = c.b(c.this);
                        apr.b("RepeatExposurePageMgr", "getConfigFromSp", b);
                        c.a(c.this, b);
                    }
                }
            });
            UTClientConfigMgr.a().a(new UTClientConfigMgr.a() { // from class: com.ut.mini.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
                public String getKey() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("16c52370", new Object[]{this}) : "repeatExposure";
                }

                @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
                public void onChange(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5bfd17c0", new Object[]{this, str});
                        return;
                    }
                    synchronized (c.this) {
                        c.a(c.this, true);
                        apr.b("RepeatExposurePageMgr", "getConfigFromServer", str);
                        c.a(c.this, str);
                        c.b(c.this, str);
                    }
                }
            });
        }
    }

    private void b(String str) {
        int i;
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            c();
            hashMap = (HashMap) JSONObject.parseObject(str, Map.class);
            this.b = (List) hashMap.get(TplMsg.VALUE_T_NATIVE_RETURN);
            i = this.b != null ? this.b.size() : 0;
        } catch (Exception unused) {
            i = 0;
        }
        try {
            this.c = (List) hashMap.get("w");
            List list = (List) hashMap.get("a");
            if (list != null && list.size() == 1 && TplMsg.VALUE_T_NATIVE_RETURN.equalsIgnoreCase((String) list.get(0))) {
                this.d = true;
            } else {
                this.d = false;
            }
        } catch (Exception unused2) {
            c();
            if (i > 0) {
            }
            d.a().b();
        }
        if (i > 0 && !this.d) {
            d.a().c();
        } else {
            d.a().b();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            if (this.b != null) {
                this.b.clear();
            }
            if (this.c != null) {
                this.c.clear();
            }
        } catch (Exception unused) {
        }
        this.d = false;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && !str.startsWith("http")) {
            try {
                if (this.b != null && this.b.contains(str)) {
                    return true;
                }
                if (this.c != null) {
                    if (this.c.contains(str)) {
                        return false;
                    }
                }
                return this.d;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        Context e = any.d().e();
        if (e == null) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = e.getSharedPreferences("ut_repeatExposure", 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString("repeatExposure", null);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private void c(String str) {
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        Context e = any.d().e();
        if (e == null) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = e.getSharedPreferences("ut_repeatExposure", 0);
            if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
                return;
            }
            edit.putString("repeatExposure", str);
            edit.apply();
        } catch (Exception unused) {
        }
    }
}
