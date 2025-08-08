package com.taobao.mytaobao.basement;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import tb.kge;
import tb.mtu;
import tb.mtx;
import tb.mxj;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_BASEMENT_WEEX2 = 3;
    public static final int STATE_SECOND_SCREEN = 0;
    public static final int STATE_TAO_YOU_DEGRADE = 1;

    /* renamed from: a  reason: collision with root package name */
    private static int f18313a;
    private static String b;
    private static int c;
    private static boolean d;
    public static String f;
    private static boolean g;
    private mtu e;
    private boolean h = false;

    private static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : i == 3;
    }

    static {
        kge.a(486029799);
        c = -1;
        d = false;
        g = false;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f18313a == 3;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : b;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : f18313a == 0;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        if (g) {
            return false;
        }
        return d || "1".equals(OrangeConfig.getInstance().getConfig("mpm_data_switch", "isDowngradePrestrainTaoFriend", null));
    }

    public void a(com.taobao.mytaobao.ultron.e eVar, JSONObject jSONObject, String str) {
        i iVar;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c206eb4f", new Object[]{this, eVar, jSONObject, str});
            return;
        }
        b(eVar, a(jSONObject));
        mtx.b("解析我淘主接口mTop数据：type=" + f18313a + ",weexUrl=" + b);
        if (!com.taobao.mytaobao.base.c.e || !StringUtils.equals(str, "action_cache_expired")) {
            z = false;
        }
        if (b() && ((StringUtils.equals(str, "action_pull_refresh") || z) && (iVar = eVar.f18498a) != null)) {
            iVar.a().a(com.taobao.mytaobao.basement.Bridge.a.b, (JSONObject) null);
        }
        i();
    }

    private void i() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.e == null) {
        } else {
            int i2 = c;
            if (i2 == -1 || (i = f18313a) == 1) {
                int i3 = f18313a;
                c = i3;
                this.e.a(i3);
            } else if (i2 == i && !this.h) {
            } else {
                if (this.h) {
                    this.h = false;
                }
                if (f18313a == 3) {
                    if (StringUtils.isEmpty(b)) {
                        mtx.b("【错误】mTop加载weex，weexUrl=null");
                    }
                    this.e.b(b);
                } else if (k()) {
                    this.e.h();
                } else if (l()) {
                    this.e.i();
                }
                c = f18313a;
            }
        }
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : a(c) && f18313a == 1;
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : (a(c) || c == 1) && f18313a == 0;
    }

    public void a(com.taobao.mytaobao.ultron.e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b688c5", new Object[]{this, eVar, jSONObject});
            return;
        }
        b(eVar, a(jSONObject));
        mtx.b("解析我淘主接口缓存数据：type=" + f18313a + ",weexUrl=" + b);
    }

    private void b(JSONObject jSONObject) {
        boolean booleanValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject == null) {
            booleanValue = false;
        } else {
            try {
                booleanValue = jSONObject.getBoolean("disableDowngradePrestrain").booleanValue();
            } catch (Throwable unused) {
                g = false;
            }
        }
        g = booleanValue;
        JSONObject jSONObject2 = jSONObject == null ? null : jSONObject.getJSONObject("bizParams");
        if (jSONObject2 == null) {
            d = false;
            f = null;
        }
        try {
            f = jSONObject2.getString("version");
        } catch (Throwable unused2) {
            f = null;
        }
        try {
            d = jSONObject2.getBooleanValue("isDowngradePrestrain");
        } catch (Throwable unused3) {
            d = false;
        }
    }

    private void b(com.taobao.mytaobao.ultron.e eVar, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95248524", new Object[]{this, eVar, jSONObject});
        } else if (eVar == null || jSONObject == null) {
            f18313a = 0;
        } else {
            b(jSONObject);
            IDMComponent e = eVar.e("basementTip");
            if (e == null) {
                f18313a = 0;
                return;
            }
            JSONObject fields = e.getFields();
            if (fields == null || fields.size() == 0) {
                f18313a = 1;
                return;
            }
            JSONObject jSONObject2 = fields.getJSONObject("basementTip");
            if (jSONObject2 == null || jSONObject2.size() == 0) {
                f18313a = 1;
            } else if ("true".equals(jSONObject2.getString("newBasementContainer"))) {
                String string = jSONObject2.getString("pageType");
                boolean a2 = mxj.a("disableWeexBasement", false);
                TLog.loge(BasementConstants.WEEX_TAG, "disableWeexBasement=" + a2);
                if (!StringUtils.equals(string, "weex") || a2) {
                    return;
                }
                String str2 = b;
                int i2 = f18313a;
                String string2 = jSONObject2.getString("fragmentWeexUrl");
                b = string2;
                if (!StringUtils.isEmpty(string2)) {
                    i = 3;
                }
                f18313a = i;
                if (i != 3 || i2 != 3 || (str = b) == null || str2 == null || StringUtils.equals(str, str2)) {
                    return;
                }
                this.h = true;
            } else {
                f18313a = 1;
            }
        }
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("global")) != null) {
            return jSONObject2.getJSONObject("secScreenFragment");
        }
        return null;
    }

    public void a(mtu mtuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f52e006a", new Object[]{this, mtuVar});
        } else {
            this.e = mtuVar;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            c = -1;
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
        } else {
            c = 3;
        }
    }
}
