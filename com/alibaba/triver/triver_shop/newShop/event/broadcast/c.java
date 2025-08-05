package com.alibaba.triver.triver_shop.newShop.event.broadcast;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String A_PLUS = "aplus.";
    public static final String BX_TO_SHOP = "shop.bx.sequence";
    public static final String FRAMEWORK_UI_STATUS = "framework.ui.status";
    public static final String HIDE_STATUS = "HIDE";
    public static final String LIVE_FINISH_STATUS = "FINISH";
    public static final String MSG_FOLLOWED = "followed";
    public static final String MSG_FOLLOW_ACTION = "followAction";
    public static final String MSG_FOLLOW_ACTION_CLICK = "followClick";
    public static final String MSG_FOLLOW_ACTION_REFRESH = "followRefresh";
    public static final String MSG_FOLLOW_STATUS = "status";
    public static final String MSG_HOME_LIVE_ROOM_STATUS = "homelive.liveroom.stream.status.update";
    public static final String MSG_ON_SHOW = "onShow";
    public static final String MSG_SHOP_FOLLOW_SETSTATUS = "shophead.follow.setStatus";
    public static final String MSG_SHOP_HEADER_COLLAPSED = "shophead.collapsed";
    public static final String MSG_SHOP_HEADER_UNCOLLAPSED = "shophead.uncollapsed";
    public static final String MSG_SHOP_PAGE_APPEAR = "page.appear";
    public static final String MSG_SHOP_PAGE_DISAPPEAR = "page.disappear";
    public static final String MSG_SOURCE_PARENT = "parent";
    public static final String MSG_UNFOLLOWED = "unfollow";
    public static final String SHOP_TAB_SWITCH = "shoptab.switch";
    public static final String SHOP_TO_UCP = "shop.shop2ucp";
    public static final String SHOW_STATUS = "SHOW";
    public static final String TYPE_FULLSCREEN = "FULLSCREEN";
    public static final String TYPE_NORMAL = "NORMAL";
    public static final String UCP_TO_SHOP = "shop.behavior.sequence";
    public static final String WIDGET_NAME = "widgetName";

    /* renamed from: a  reason: collision with root package name */
    private String f3837a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private JSONObject i;

    static {
        kge.a(2134022598);
    }

    private c(String str, String str2, String str3, String str4, String str5) {
        this.f3837a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = "1";
    }

    public c(Object obj) {
        JSONObject a2 = obj instanceof JSONObject ? (JSONObject) obj : obj instanceof String ? com.alibaba.triver.triver_shop.newShop.ext.d.a((String) obj) : null;
        if (a2 == null) {
            return;
        }
        this.i = a2;
        this.c = a2.getString("_msg_name");
        this.d = a2.getString("_msg_source");
        this.e = a2.getString("_msg_target");
        this.f3837a = a2.getString("_msg_token");
        this.b = a2.getString("_msg_type");
        this.f = a2.getString("_msg_fromNative");
        this.g = a2.getString("type");
        this.h = a2.getString("status");
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.i;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : MSG_SHOP_PAGE_APPEAR.equals(this.b);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : MSG_SHOP_PAGE_DISAPPEAR.equals(this.b);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : "2.0.0".equals(this.d);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        String str = this.b;
        if (str != null) {
            return str.contains(A_PLUS);
        }
        return false;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        String str = this.b;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if (split.length >= 2) {
            return split[1];
        }
        return null;
    }

    public Map<String, Object> g() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this});
        }
        JSONObject jSONObject2 = this.i;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("params")) != null) {
            return jSONObject.getInnerMap();
        }
        return null;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.b;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.c;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.d;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.e;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : "SHOW".equals(this.h) && TYPE_FULLSCREEN.equals(this.g);
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : "HIDE".equals(this.h) && TYPE_FULLSCREEN.equals(this.g);
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : LIVE_FINISH_STATUS.equals(this.c) && LIVE_FINISH_STATUS.equals(this.h);
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : MSG_SHOP_FOLLOW_SETSTATUS.equals(this.c);
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.i;
        if (jSONObject == null) {
            return false;
        }
        return "followed".equals(jSONObject.getString("status"));
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : SHOP_TO_UCP.equals(this.c);
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this});
        }
        if (FRAMEWORK_UI_STATUS.equals(this.b) && this.i != null) {
            if ("shopTabSwitch".equals(this.h)) {
                return this.i.getString("targetTab");
            }
            JSONObject jSONObject = this.i.getJSONObject("params");
            if (jSONObject != null && "shopTabSwitch".equals(jSONObject.getString("status"))) {
                return jSONObject.getString("targetTab");
            }
        }
        if (!SHOP_TAB_SWITCH.equals(this.b)) {
            return null;
        }
        return this.i.getString("tabkey");
    }

    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("255e0466", new Object[]{this});
        }
        if (FRAMEWORK_UI_STATUS.equals(this.b) && this.i != null && "shopTabSwitch".equals(this.h)) {
            return this.i.getString("params");
        }
        return null;
    }

    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abe3bf05", new Object[]{this});
        }
        JSONObject jSONObject = this.i.getJSONObject("data");
        return jSONObject == null ? "" : jSONObject.getString(WIDGET_NAME);
    }

    public JSONObject u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f9bbfd9c", new Object[]{this});
        }
        JSONObject jSONObject = this.i.getJSONObject("data");
        if (jSONObject != null) {
            return jSONObject.getJSONObject("data");
        }
        return null;
    }

    public JSONObject v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d63d11d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_msg_name", (Object) this.c);
        jSONObject.put("_msg_source", (Object) this.d);
        jSONObject.put("_msg_target", (Object) this.e);
        jSONObject.put("_msg_token", (Object) this.f3837a);
        jSONObject.put("_msg_type", (Object) this.b);
        jSONObject.put("_msg_fromNative", (Object) this.f);
        jSONObject.put("type", (Object) this.g);
        jSONObject.put("status", (Object) this.h);
        return jSONObject;
    }

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f3838a;
        private String b;
        private String c;
        private String d;
        private String e;

        static {
            kge.a(-853652835);
        }

        public c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("9e9dadde", new Object[]{this}) : new c(this.f3838a, this.b, this.c, this.d, this.e);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("15369df7", new Object[]{this, str});
            }
            this.f3838a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("43e80816", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("72997235", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a14adc54", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cffc4673", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }
    }
}
