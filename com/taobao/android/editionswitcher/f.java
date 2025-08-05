package com.taobao.android.editionswitcher;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f12293a;
    private Map<String, String> b;
    private String c;

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static f f12294a;

        static {
            kge.a(2104885712);
            f12294a = new f();
        }

        public static /* synthetic */ f a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("334f547a", new Object[0]) : f12294a;
        }
    }

    static {
        kge.a(1425858952);
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("334f547a", new Object[0]) : a.a();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f12293a;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f12293a = z;
        }
    }

    public f() {
        this.f12293a = b.f(Globals.getApplication()) && c();
        this.c = TBRevisionSwitchManager.i().a(LocationCallBack.ORIGIN_ELDER_HOME, true);
        TLog.loge("Page_Home", "EditionPositionSwitcher", "stdElderHome=" + this.f12293a + "originElderHome=" + this.c);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : "1".equals(TBRevisionSwitchManager.i().c("elderHome"));
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : a().b(context);
    }

    private boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        if (this.f12293a) {
            e.c(context);
            return true;
        } else if (!b.f(Globals.getApplication()) || !"1".equals(this.c)) {
            return false;
        } else {
            e.d(context);
            return true;
        }
    }

    public static void a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb6e290", new Object[]{context, jSONObject});
        } else {
            a().b(context, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104666d1", new Object[]{this, context, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("elderHome");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            TLog.loge("Page_Home", "EditionPositionSwitcher", "innerUpdateSTDElderHomeInfo 首页请求下发elderHome" + string);
            String string2 = jSONObject.getString("allowSwitchVersion");
            String string3 = jSONObject.getString("addSwitchVersionTagSuccess");
            String str = "0";
            if (str.equals(string2) || str.equals(string3)) {
                return;
            }
            if ("1".equals(string)) {
                str = "1";
            }
            boolean equals = "1".equals(str);
            if (this.f12293a == equals) {
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("elderTagMaps");
            Map hashMap = new HashMap();
            if (jSONObject2 != null) {
                if (this.b != null) {
                    TLog.loge("Page_Home", "EditionPositionSwitcher", "innerUpdateSTDElderHomeInfo使用location内存返回数据");
                    hashMap.putAll(this.b);
                    for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                        if (this.b.get(entry.getKey()) == null) {
                            Object value = entry.getValue();
                            hashMap.put(entry.getKey(), value != null ? value.toString() : null);
                        }
                    }
                } else {
                    TLog.loge("Page_Home", "EditionPositionSwitcher", "innerUpdateSTDElderHomeInfo location异常或者未返回");
                    for (Map.Entry<String, Object> entry2 : jSONObject2.entrySet()) {
                        String a2 = TBRevisionSwitchManager.i().a(entry2.getKey(), true);
                        if (a2 != null) {
                            hashMap.put(entry2.getKey(), a2);
                        } else {
                            Object value2 = entry2.getValue();
                            hashMap.put(entry2.getKey(), value2 != null ? value2.toString() : null);
                        }
                    }
                }
            } else {
                Map map = this.b;
                if (map != null) {
                    hashMap = map;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("innerUpdateSTDElderHomeInfo 首页请求返回为空location内存情况=");
                if (this.b != null) {
                    z = true;
                }
                sb.append(z);
                TLog.loge("Page_Home", "EditionPositionSwitcher", sb.toString());
            }
            this.f12293a = equals;
            TLog.loge("Page_Home", "EditionPositionSwitcher", "innerUpdateSTDElderHomeInfo stdElderHome" + this.f12293a + "elderTagMaps=" + hashMap.toString() + "selectEdtionCode=" + b.m(context) + "realEditionCode=" + b.c(context).editionCode);
            if (!b.f(context) && !b.e(context)) {
                return;
            }
            String m = b.m(context);
            if (b.e(context)) {
                m = "CN";
            }
            b.a(context, m, str, hashMap);
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }
}
