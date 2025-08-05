package com.alibaba.android.icart.core.data;

import android.content.SharedPreferences;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.Globals;
import com.taobao.taolive.room.utils.ag;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.abj;
import tb.bea;
import tb.bef;
import tb.bfj;
import tb.bfk;
import tb.bnv;
import tb.ieu;
import tb.jqg;
import tb.kge;

/* loaded from: classes2.dex */
public class DataBizContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean A;
    private boolean C;
    private Object D;
    private bnv E;
    private boolean F;

    /* renamed from: a  reason: collision with root package name */
    private CartGroupContext f2297a;
    private boolean b;
    private String d;
    private String e;
    private boolean g;
    private boolean h;
    private int l;
    private boolean q;
    private String r;
    private String s;
    private boolean t;
    private RequestConfig.RequestType u;
    private boolean v;
    private int y;
    private Map<String, bfj> c = new HashMap();
    private String f = "";
    private String i = "";
    private String j = "";
    private AtomicInteger k = new AtomicInteger();
    private ShareContext B = new ShareContext();
    private final JSONObject o = new JSONObject();

    static {
        kge.a(-1909884062);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.h;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        if (this.r == null) {
            this.r = ieu.a();
            jqg.a("iCart", "uuid为空，实时创建:", this.r);
        }
        return this.r;
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
            return;
        }
        this.r = str;
        jqg.a("iCart", "setUUID:", str);
    }

    public CartGroupContext d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CartGroupContext) ipChange.ipc$dispatch("d4c0ba4a", new Object[]{this}) : this.f2297a;
    }

    public void a(CartGroupContext cartGroupContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f0f807", new Object[]{this, cartGroupContext});
        } else {
            this.f2297a = cartGroupContext;
        }
    }

    public bfj a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bfj) ipChange.ipc$dispatch("7c6d662e", new Object[]{this, str});
        }
        if (this.c.get(str) == null) {
            this.c.put(str, new bfk());
        }
        return this.c.get(str);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.c.clear();
        }
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.d;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.e;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.f;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.g;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.i;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.j;
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : this.k.incrementAndGet();
    }

    public int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.k.get();
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.q;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d7103", new Object[]{this, new Boolean(z)});
        } else if (!z) {
        } else {
            this.y = 200;
        }
    }

    public JSONObject r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bec48319", new Object[]{this}) : this.o;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.t;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public String u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("326979a4", new Object[]{this}) : this.s;
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            this.s = str;
        }
    }

    public int v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69459f0", new Object[]{this})).intValue() : this.l;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    public RequestConfig.RequestType w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RequestConfig.RequestType) ipChange.ipc$dispatch("1e21dbe2", new Object[]{this}) : this.u;
    }

    public void a(RequestConfig.RequestType requestType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a0cdb2", new Object[]{this, requestType});
        } else {
            this.u = requestType;
        }
    }

    public int z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ccb7f4", new Object[]{this})).intValue() : this.y;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue() : this.A;
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.A = z;
        }
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue() : this.C;
    }

    public ShareContext D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShareContext) ipChange.ipc$dispatch("52ce924a", new Object[]{this}) : this.B;
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else {
            this.C = z;
        }
    }

    public Object E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6939e66", new Object[]{this}) : this.D;
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.D = obj;
        }
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.v;
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public bnv F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bnv) ipChange.ipc$dispatch("3f466baf", new Object[]{this}) : this.E;
    }

    public void a(bnv bnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21498ee", new Object[]{this, bnvVar});
        } else {
            this.E = bnvVar;
        }
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue() : this.F;
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
        } else {
            this.F = z;
        }
    }

    /* loaded from: classes2.dex */
    public static class CartGroupContext implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int GROUP_TYPE_BUNDLE_HEADER = 1;
        public static final int GROUP_TYPE_EMPTY = 2;
        public static final int GROUP_TYPE_ITEM = 0;
        private boolean isExpanded;
        private boolean isHandleExpanded;
        private boolean isRecommendTitleShow;
        private List<String> items;
        private String mDefaultFilterItem;
        private String name;
        private String triggerComponentKey;
        private int type;

        /* loaded from: classes2.dex */
        public @interface CartGroupType {
        }

        static {
            kge.a(58288786);
            kge.a(1028243835);
        }

        public List<String> getItems() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("46e3e096", new Object[]{this}) : this.items;
        }

        public void setItems(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba1ea0f6", new Object[]{this, list});
            } else {
                this.items = list;
            }
        }

        public boolean getIsExpanded() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a230ec04", new Object[]{this})).booleanValue() : this.isExpanded;
        }

        public void setIsExpanded(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dac3e048", new Object[]{this, new Boolean(z)});
            } else {
                this.isExpanded = z;
            }
        }

        public boolean isHandleExpanded() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("92ba85d6", new Object[]{this})).booleanValue() : this.isHandleExpanded;
        }

        public void setHandleExpanded(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7e7bd0a", new Object[]{this, new Boolean(z)});
            } else {
                this.isHandleExpanded = z;
            }
        }

        public String getTriggerComponentKey() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a4dd92b5", new Object[]{this}) : this.triggerComponentKey;
        }

        public void setTriggerComponentKey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("beaa3ec9", new Object[]{this, str});
            } else {
                this.triggerComponentKey = str;
            }
        }

        public boolean getIsRecommendTitleShow() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0922764", new Object[]{this})).booleanValue() : this.isRecommendTitleShow;
        }

        public void setIsRecommendTitleShow(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b7fcfe8", new Object[]{this, new Boolean(z)});
            } else {
                this.isRecommendTitleShow = z;
            }
        }

        public String getDefaultFilterItem() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c97ebda3", new Object[]{this}) : this.mDefaultFilterItem;
        }

        public void setDefaultFilterItem(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63d7fe9b", new Object[]{this, str});
            } else {
                this.mDefaultFilterItem = str;
            }
        }

        public String getName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
        }

        public void setName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
            } else {
                this.name = str;
            }
        }

        public int getType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue() : this.type;
        }

        public void setType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
            } else {
                this.type = i;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class ShareContext implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String ENABLE_PREFETCH_VIEW = "enablePrefetchView";
        private static final String USE_BROADCAST = "useBroadcast";
        private static boolean enablePrefetchView;
        private static boolean isHideAddress;

        static {
            kge.a(926910194);
            kge.a(1028243835);
            initSpValue();
        }

        public boolean getIsHideAddress() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ec994c9d", new Object[]{this})).booleanValue() : isHideAddress;
        }

        public static void updateOnlySPForOrangeChange() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("409d6d5c", new Object[0]);
            } else {
                putBooleanValue(ENABLE_PREFETCH_VIEW, bea.b());
            }
        }

        public static boolean enablePrefetchView() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e291e76a", new Object[0])).booleanValue() : enablePrefetchView;
        }

        public void setHideAddress(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3520d69d", new Object[]{this, new Boolean(z)});
                return;
            }
            isHideAddress = z;
            putBooleanValue("isHideAddress", z);
        }

        private static void initSpValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88b586b", new Object[0]);
                return;
            }
            try {
                SharedPreferences d = bef.d(Globals.getApplication());
                isHideAddress = d.getBoolean("isHideAddress", false);
                if (bea.a()) {
                    boolean b = bea.b();
                    putBooleanValue(ENABLE_PREFETCH_VIEW, b);
                    enablePrefetchView = b;
                    return;
                }
                enablePrefetchView = d.getBoolean(ENABLE_PREFETCH_VIEW, true);
            } catch (Exception e) {
                abj.a("initSpValueError", e);
            }
        }

        private static void putBooleanValue(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c87f208b", new Object[]{str, new Boolean(z)});
                return;
            }
            try {
                bef.d(Globals.getApplication()).edit().putBoolean(str, z).apply();
            } catch (Exception e) {
                UnifyLog.d("CartShareContext", ag.ARG_TAOKE_ERROR + e.getMessage());
            }
        }
    }
}
