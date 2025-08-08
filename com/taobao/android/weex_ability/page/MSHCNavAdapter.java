package com.taobao.android.weex_ability.page;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.j;
import com.taobao.android.weex_ability.page.b;
import com.taobao.android.weex_framework.p;
import java.util.ArrayList;
import java.util.List;
import tb.jvj;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class MSHCNavAdapter extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_GROUP_WEEX_HC = "group_weex_hc";
    public static final String CONFIG_KEY_WEEX_MAIN_HC_DOMAIN = "weex_main_hc_domain";

    /* renamed from: a  reason: collision with root package name */
    public static String f15954a;
    public static String b;
    public static String c;
    public static String d;
    private c e;
    private c f;
    private List<c> g;

    /* renamed from: com.taobao.android.weex_ability.page.MSHCNavAdapter$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15955a = new int[NavigatorType.values().length];

        static {
            try {
                f15955a[NavigatorType.RIGHT_ITEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15955a[NavigatorType.CLEAR_RIGHT_ITEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15955a[NavigatorType.TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public enum NavigatorType {
        TITLE,
        MORE_ITEM,
        CLEAR_MORE_ITEM,
        RIGHT_ITEM,
        CLEAR_RIGHT_ITEM
    }

    public static /* synthetic */ Object ipc$super(MSHCNavAdapter mSHCNavAdapter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(-475406499);
        kge.a(-1434287497);
        f15954a = "clickleftitem";
        b = "clickrightitem";
        c = "clickmoreitem";
        d = "clickcenteritem";
    }

    public MSHCNavAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b7147cca", new Object[]{this}) : this.e;
    }

    public c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("7a00e629", new Object[]{this}) : this.f;
    }

    public List<c> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.g;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public a c(p pVar, JSONObject jSONObject, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("53750a07", new Object[]{this, pVar, jSONObject, aVar});
        }
        if (b(jSONObject.toJSONString(), aVar)) {
            return null;
        }
        return new a("WX_ERROR", "");
    }

    @Override // com.taobao.android.weex_ability.page.b
    public a g(p pVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b55a11e3", new Object[]{this, pVar, jSONObject});
        }
        if (!a(NavigatorType.TITLE)) {
            return new a("WX_FAILED", "can not set Navigator");
        }
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("icon");
        this.f = new c();
        if (!StringUtils.isEmpty(string2)) {
            if (!c(string2)) {
                return new a(a.RESULT_ERROR, "schemeerror");
            }
            this.f.e = string2;
            f().invalidateOptionsMenu();
            return null;
        } else if (!StringUtils.isEmpty(string)) {
            this.f.d = string;
            f().invalidateOptionsMenu();
            return null;
        } else {
            return new a(a.RESULT_ERROR, "paramerror");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f2, code lost:
        if (r7.e.a(f(), r9) >= 0) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.lang.String r8, com.taobao.android.weex_ability.page.b.a r9) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_ability.page.MSHCNavAdapter.a(java.lang.String, com.taobao.android.weex_ability.page.b$a):boolean");
    }

    private boolean b(String str, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7257e157", new Object[]{this, str, aVar})).booleanValue();
        }
        if (a(NavigatorType.MORE_ITEM) && !StringUtils.isEmpty(str)) {
            try {
                if (this.g == null) {
                    this.g = new ArrayList();
                } else {
                    this.g.clear();
                }
                if (aVar != null) {
                    JSONObject parseObject = JSON.parseObject(str);
                    if (parseObject.size() == 0) {
                        b("");
                        return true;
                    }
                    JSONArray jSONArray = parseObject.getJSONArray("items");
                    if (jSONArray != null && jSONArray.size() > 0) {
                        for (int i = 0; i < jSONArray.size(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string = jSONObject.getString("title");
                            String string2 = jSONObject.getString("icon");
                            c cVar = new c();
                            cVar.h = aVar;
                            cVar.f = new Intent();
                            cVar.f.putExtra("index", i);
                            if (!StringUtils.isEmpty(string2)) {
                                cVar.e = string2;
                            }
                            if (!StringUtils.isEmpty(string)) {
                                cVar.b(string);
                            }
                            if (!c(cVar.e)) {
                                return false;
                            }
                            this.g.add(cVar);
                        }
                        f().supportInvalidateOptionsMenu();
                        return true;
                    }
                    c cVar2 = new c();
                    cVar2.h = aVar;
                    String string3 = parseObject.getString("icon");
                    String string4 = parseObject.getString("title");
                    String string5 = parseObject.getString("iconFontName");
                    if (!StringUtils.isEmpty(string3)) {
                        cVar2.e = string3;
                    }
                    if (!StringUtils.isEmpty(string5)) {
                        cVar2.a(f(), string5);
                    }
                    if (!StringUtils.isEmpty(string4)) {
                        cVar2.b(string4);
                    }
                    cVar2.f = new Intent();
                    cVar2.f.putExtra("index", 0);
                    this.g.add(cVar2);
                    f().invalidateOptionsMenu();
                    return true;
                }
                JSONObject parseObject2 = JSON.parseObject(str);
                if (parseObject2.size() == 0) {
                    b("");
                    return true;
                }
                JSONArray jSONArray2 = parseObject2.getJSONArray("items");
                if (jSONArray2 != null && jSONArray2.size() > 0) {
                    for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                        c cVar3 = new c();
                        String string6 = jSONObject2.getString("text");
                        if (!StringUtils.isEmpty(string6)) {
                            cVar3.d = string6;
                            boolean booleanValue = jSONObject2.getBooleanValue("fromNative");
                            boolean booleanValue2 = jSONObject2.getBooleanValue("iconFont");
                            String string7 = jSONObject2.getString("icon");
                            if (!booleanValue) {
                                cVar3.a(string7, jvj.a(f()));
                            } else if (booleanValue2) {
                                cVar3.a(f(), string7);
                            } else {
                                cVar3.a(string7);
                            }
                            cVar3.f = new Intent();
                            cVar3.f.putExtra("index", i2);
                            this.g.add(cVar3);
                        }
                    }
                }
                f().invalidateOptionsMenu();
                return true;
            } catch (Exception e) {
                com.taobao.android.weex_framework.util.g.f("WebAppInterface", "setNavBarRightItem: param parse to JSON error, param=" + e.getMessage());
            }
        }
        return false;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (!a(NavigatorType.CLEAR_MORE_ITEM)) {
            return false;
        }
        List<c> list = this.g;
        if (list == null) {
            this.g = new ArrayList();
        } else {
            list.clear();
        }
        f().invalidateOptionsMenu();
        return false;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public a a(p pVar, JSONObject jSONObject, b.a aVar) {
        FragmentManager supportFragmentManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("18fcdb49", new Object[]{this, pVar, jSONObject, aVar});
        }
        boolean a2 = a(jSONObject.toJSONString());
        MUSPageFragment mUSPageFragment = (f() == null || (supportFragmentManager = f().getSupportFragmentManager()) == null) ? null : (MUSPageFragment) supportFragmentManager.findFragmentByTag("ali_mus_fragment_tag");
        if (!a2 && mUSPageFragment != null) {
            if (jSONObject != null && jSONObject.size() > 0) {
                mUSPageFragment.setBackPressedListener(aVar);
            } else {
                mUSPageFragment.setBackPressedListener(null);
            }
            a2 = true;
        }
        if (a2) {
            return null;
        }
        return new a(a.RESULT_ERROR, "");
    }

    @Override // com.taobao.android.weex_ability.page.b
    public a b(p pVar, JSONObject jSONObject, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b638f2a8", new Object[]{this, pVar, jSONObject, aVar});
        }
        if (a(jSONObject.toJSONString(), aVar)) {
            return null;
        }
        return new a();
    }

    private boolean a(NavigatorType navigatorType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f707d2d3", new Object[]{this, navigatorType})).booleanValue();
        }
        int i = AnonymousClass1.f15955a[navigatorType.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            return true;
        }
        return e();
    }

    public MUSPageFragment d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSPageFragment) ipChange.ipc$dispatch("dc8776a0", new Object[]{this});
        }
        Fragment findFragmentByTag = f().getSupportFragmentManager().findFragmentByTag("ali_mus_fragment_tag");
        if (!(findFragmentByTag instanceof MUSPageFragment)) {
            return null;
        }
        return (MUSPageFragment) findFragmentByTag;
    }

    public boolean e() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        try {
            String a2 = j.a().c().a("group_weex_hc", "weex_main_hc_domain", "");
            if (!StringUtils.isEmpty(a2)) {
                for (String str : a2.split(",")) {
                    String originalUrl = d().getOriginalUrl();
                    if (!StringUtils.isEmpty(originalUrl) && originalUrl.contains(str)) {
                        return false;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        String scheme = Uri.parse(str).getScheme();
        if (!StringUtils.isEmpty(scheme)) {
            String lowerCase = scheme.toLowerCase();
            if (lowerCase.equals("http") || lowerCase.equals("https") || lowerCase.equals("data") || lowerCase.equals("local")) {
                return true;
            }
        }
        return false;
    }
}
