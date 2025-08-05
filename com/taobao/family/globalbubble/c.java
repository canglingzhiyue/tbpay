package com.taobao.family.globalbubble;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.taobao.util.k;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.l;
import com.taobao.android.nav.Nav;
import com.taobao.family.globalbubble.affection.DetailAffectionBean;
import com.taobao.family.i;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tb.nyo;
import tb.riy;
import tb.sya;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FAMILY_TAG = "FamilyBubble";
    public static final String ORANGE_GROUP_BUBBLE = "im_global_bubble";
    public static final String ORANGE_KEY_BUBBLE_GUIDE = "guideText";
    public JSONObject d;
    private GlobalBlackOrWhiteList f;
    private String g;
    private WeakReference<Activity> h;
    private b j;
    private ConcurrentHashMap<String, e> e = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public String f17136a = "com.taobao.tao.homepage.MainActivity3";
    public List<RectBean> b = null;
    private boolean i = true;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    public String c = "https://market.m.taobao.com/apps/market/msgrax/global_bubble.html?wh_ttid=native";

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static c f17141a = new c();

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b2065102", new Object[0]) : f17141a;
        }
    }

    public static /* synthetic */ GlobalBlackOrWhiteList a(c cVar, GlobalBlackOrWhiteList globalBlackOrWhiteList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalBlackOrWhiteList) ipChange.ipc$dispatch("ee5282d6", new Object[]{cVar, globalBlackOrWhiteList});
        }
        cVar.f = globalBlackOrWhiteList;
        return globalBlackOrWhiteList;
    }

    public static /* synthetic */ String a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3970e8a4", new Object[]{cVar}) : cVar.g;
    }

    public static /* synthetic */ boolean a(c cVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77471a94", new Object[]{cVar, str, str2})).booleanValue() : cVar.a(str, str2);
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54082edc", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.l = z;
        return z;
    }

    public static /* synthetic */ void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fd7eabd", new Object[]{cVar});
        } else {
            cVar.g();
        }
    }

    public static /* synthetic */ void b(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab261fb7", new Object[]{cVar, new Boolean(z)});
        } else {
            cVar.a(z);
        }
    }

    public static /* synthetic */ ConcurrentHashMap c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("dd2eec28", new Object[]{cVar}) : cVar.e;
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        if (activity != null) {
            this.h = new WeakReference<>(activity);
            this.f17136a = activity.getComponentName().getShortClassName();
            if (activity.getIntent() != null && activity.getIntent().getData() != null) {
                this.g = activity.getIntent().getData().toString();
            }
            b bVar = this.j;
            if (bVar != null) {
                bVar.a();
                if (a(this.f17136a, this.g)) {
                    this.j.a(this.h.get());
                }
            }
        }
        for (e eVar : this.e.values()) {
            if (eVar.d() == 1) {
                a(eVar, true);
            }
            eVar.a(activity);
        }
        if (a(this.f17136a, this.g)) {
            b(this.f17136a, this.g);
            g();
            return;
        }
        a(true);
    }

    public void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
            return;
        }
        String str = this.g;
        if (str == null || !str.startsWith(sya.QUICK_CHAT_URL)) {
            return;
        }
        e eVar = this.e.get(GlobalWindowFactory.WINDOW_SHAREBACK);
        if (!(eVar instanceof h)) {
            return;
        }
        ((h) eVar).a(sya.GB_IMQUICK_CHAT_DISMISSED, new HashMap<>());
    }

    public void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{this, activity});
            return;
        }
        e eVar = this.e.get(GlobalWindowFactory.WINDOW_SHAREBACK);
        if (eVar != null) {
            eVar.a("foreground");
        }
        if (activity != null) {
            this.h = new WeakReference<>(activity);
            for (e eVar2 : this.e.values()) {
                eVar2.a(activity);
            }
        }
        if (!a(this.f17136a, this.g)) {
            return;
        }
        g();
    }

    public void d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27d57fd", new Object[]{this, activity});
            return;
        }
        e eVar = this.e.get(GlobalWindowFactory.WINDOW_SHAREBACK);
        if (eVar != null) {
            eVar.a("background");
        }
        a(true);
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        e eVar = this.e.get(str);
        if (eVar == null) {
            return false;
        }
        return eVar.e();
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            a(this.e.get(str), true);
        }
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b2065102", new Object[0]) : a.a();
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else if (this.i || intent == null || intent.getData() == null || !com.alibaba.ability.localization.b.b()) {
        } else {
            this.g = intent.getData().toString();
            if (e(this.g)) {
                g();
            } else {
                a(true);
            }
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Nav.registerPreprocessor(new Nav.h() { // from class: com.taobao.family.globalbubble.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.nav.Nav.h
            public boolean beforeNavTo(Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("66a5c187", new Object[]{this, intent})).booleanValue();
                }
                if (!intent.getData().toString().contains("//m.tb.cn")) {
                    c.this.a(intent);
                }
                return true;
            }
        });
        this.l = OrangeConfig.getInstance().getConfig(ORANGE_GROUP_BUBBLE, "showGlobalBubble", "0").equals("1");
        this.c = OrangeConfig.getInstance().getConfig(ORANGE_GROUP_BUBBLE, "globalBubbleWeexUrl", "https://market.m.taobao.com/apps/market/msgrax/global_bubble.html?wh_ttid=native");
        this.f = (GlobalBlackOrWhiteList) JSON.parseObject(OrangeConfig.getInstance().getConfig(ORANGE_GROUP_BUBBLE, "globalBubbleBlackJson", ""), GlobalBlackOrWhiteList.class);
        l.a(new String[]{ORANGE_GROUP_BUBBLE}, new com.taobao.orange.g() { // from class: com.taobao.family.globalbubble.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.g
            public void onConfigUpdate(String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                } else if (!str.equals(c.ORANGE_GROUP_BUBBLE)) {
                } else {
                    c.a(c.this, OrangeConfig.getInstance().getConfig(c.ORANGE_GROUP_BUBBLE, "showGlobalBubble", "").equals("1"));
                    c.this.c = OrangeConfig.getInstance().getConfig(c.ORANGE_GROUP_BUBBLE, "globalBubbleWeexUrl", "https://market.m.taobao.com/apps/market/msgrax/global_bubble.html?wh_ttid=native");
                    c.a(c.this, (GlobalBlackOrWhiteList) JSON.parseObject(OrangeConfig.getInstance().getConfig(c.ORANGE_GROUP_BUBBLE, "globalBubbleBlackJson", ""), GlobalBlackOrWhiteList.class));
                }
            }
        });
        try {
            WXSDKEngine.registerModule("global-bubble", GlobalBubbleModule.class, false);
        } catch (WXException e) {
            e.printStackTrace();
        }
        this.j = new b() { // from class: com.taobao.family.globalbubble.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.family.globalbubble.b
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                c cVar = c.this;
                if (!c.a(cVar, cVar.f17136a, c.a(c.this))) {
                    return;
                }
                c.b(c.this, false);
            }

            @Override // com.taobao.family.globalbubble.b
            public void b(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                    return;
                }
                c cVar = c.this;
                if (!c.a(cVar, cVar.f17136a, c.a(c.this))) {
                    return;
                }
                c.b(c.this);
            }
        };
    }

    public void a(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11c727", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        for (e eVar : this.e.values()) {
            HashMap hashMap = new HashMap();
            hashMap.put("userId", Long.valueOf(j));
            hashMap.put("msgCount", Integer.valueOf(i));
            eVar.a(GlobalWindowFactory.EVENT_AMP_CONVERSATION, hashMap);
        }
    }

    public WeakReference<Activity> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("16766937", new Object[]{this}) : this.h;
    }

    public synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        if (!this.k) {
            this.k = true;
            f();
        }
        if (this.e.get(str) == null) {
            e a2 = GlobalWindowFactory.a(str, a(this.f17136a, this.g), 1);
            if (a2 != null) {
                this.e.put(str, a2);
            }
            Log.e("FamilyBubble", "bubbleCreated:" + str);
        }
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        a(true);
        this.m = true;
    }

    public synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.m = false;
        }
    }

    private boolean d(String str) {
        GlobalBlackOrWhiteList globalBlackOrWhiteList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        if (str != null && (globalBlackOrWhiteList = this.f) != null && globalBlackOrWhiteList.activity != null && this.f.activity.size() > 0) {
            String str2 = "checkValidPageName:" + str;
            for (String str3 : this.f.activity) {
                if (str.contains(str3)) {
                    for (e eVar : this.e.values()) {
                        eVar.a(false);
                    }
                    return false;
                }
            }
        }
        return this.l;
    }

    private boolean e(String str) {
        GlobalBlackOrWhiteList globalBlackOrWhiteList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue();
        }
        try {
            if (str != null) {
                try {
                    try {
                        str = URLDecoder.decode(str, "UTF-8");
                    } catch (IllegalArgumentException unused) {
                        str = URLDecoder.decode(str.replaceAll(riy.MOD, "%25"), "UTF-8");
                    }
                } catch (IllegalArgumentException e) {
                    k.a("FamilyBubble", e.toString());
                }
            }
        } catch (UnsupportedEncodingException e2) {
            k.a("FamilyBubble", e2.toString());
        }
        if (str != null && (globalBlackOrWhiteList = this.f) != null && globalBlackOrWhiteList.url != null && this.f.url.size() > 0) {
            String str2 = "checkValidUri:" + this.g;
            for (String str3 : this.f.url) {
                if (str.contains(str3)) {
                    for (e eVar : this.e.values()) {
                        eVar.a(false);
                    }
                    return false;
                }
            }
        }
        return this.l;
    }

    private boolean a(String str, String str2) {
        boolean e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (str == null) {
            return this.l;
        }
        if (str.equals("com.taobao.weex.WXActivity") || str.equals("com.taobao.browser.BrowserActivity")) {
            this.i = false;
            e = e(str2);
        } else {
            this.i = true;
            e = d(str);
        }
        if (com.alibaba.ability.localization.b.b()) {
            return e;
        }
        return false;
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        if (str == null || (!str.equals("com.taobao.tao.detail.activity.DetailActivity") && !str.equals("com.taobao.android.detail.wrapper.activity.DetailActivity"))) {
            z = false;
        }
        if (!z) {
            return;
        }
        if (str2 != null && !str2.contains("tbSocialPopKey")) {
            return;
        }
        String str3 = null;
        try {
            str3 = Uri.parse(str2).getQueryParameter("tbSocialPopKey");
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(str3) || !Login.checkSessionValid()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tbSocialPopKey", str3);
        hashMap.put("tbSocialPopParam", str2);
        com.taobao.family.e.f17131a.a(com.taobao.family.e.API_NAME_SHARE_POP_CHECK, hashMap, new i() { // from class: com.taobao.family.globalbubble.c.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.family.i
            public void b(org.json.JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("345f6975", new Object[]{this, jSONObject});
                }
            }

            @Override // com.taobao.family.i
            public void a(org.json.JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject});
                } else if (jSONObject == null) {
                } else {
                    c.this.d = JSON.parseObject(jSONObject.toString());
                    e eVar = (e) c.c(c.this).get(GlobalWindowFactory.WINDOW_SHAREBACK);
                    if (eVar == null) {
                        return;
                    }
                    eVar.a(GlobalWindowFactory.EVENT_SHARE_BACK_POP, c.this.d);
                }
            }
        });
    }

    private synchronized void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.m) {
            for (e eVar : this.e.values()) {
                eVar.j();
                eVar.c(true);
            }
        }
    }

    private synchronized void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!this.m) {
            for (e eVar : this.e.values()) {
                a(eVar, z);
                eVar.c(false);
            }
        }
    }

    private void a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54245dda", new Object[]{this, eVar, new Boolean(z)});
        } else if (eVar instanceof com.taobao.family.globalbubble.affection.a) {
            eVar.b(false);
        } else if (!(eVar instanceof sya)) {
        } else {
            eVar.b(z);
        }
    }

    public HashMap<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e742bccf", new Object[]{this});
        }
        String str = this.f17136a;
        if (str == null) {
            return null;
        }
        if (!str.equals("com.taobao.tao.detail.activity.DetailActivity") && !this.f17136a.equals("com.taobao.android.detail.wrapper.activity.DetailActivity")) {
            return null;
        }
        String string = this.h.get().getSharedPreferences("TB_Detail", 0).getString(nyo.SP_KEY_AFFECTION_DETAIL, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        DetailAffectionBean detailAffectionBean = (DetailAffectionBean) JSON.parseObject(string, DetailAffectionBean.class);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("title", detailAffectionBean.title);
        hashMap.put("shop", detailAffectionBean.shop);
        hashMap.put("price", detailAffectionBean.price);
        hashMap.put("pic", detailAffectionBean.pic);
        hashMap.put("itemid", detailAffectionBean.itemid);
        hashMap.put("url", detailAffectionBean.url);
        return hashMap;
    }
}
