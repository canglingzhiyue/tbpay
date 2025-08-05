package com.alibaba.aliweex.hc.bundle;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.aliweex.bundle.j;
import com.alibaba.aliweex.d;
import com.alibaba.aliweex.f;
import com.alibaba.aliweex.utils.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.utils.WXLogUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.amu;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class WXHCNavBarAdapter extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String CLICK_CENTER_ITEM = null;
    public static String CLICK_LEFT_ITEM = null;
    public static String CLICK_MORE_ITEM = null;
    public static String CLICK_RIGHT_ITEM = null;
    public static final String CONFIG_GROUP_WEEX_HC = "group_weex_hc";
    public static final String CONFIG_KEY_WEEX_MAIN_HC_DOMAIN = "weex_main_hc_domain";
    private static final String TAG = "WXNavBarAdapter";
    private List<a> menuItemList;
    private a menuItemRight;
    private a menuItemTitle;

    /* renamed from: com.alibaba.aliweex.hc.bundle.WXHCNavBarAdapter$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2024a = new int[NavigatorType.values().length];

        static {
            try {
                f2024a[NavigatorType.RIGHT_ITEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2024a[NavigatorType.CLEAR_RIGHT_ITEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2024a[NavigatorType.TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum NavigatorType {
        TITLE,
        MORE_ITEM,
        CLEAR_MORE_ITEM,
        RIGHT_ITEM,
        CLEAR_RIGHT_ITEM
    }

    public static /* synthetic */ Object ipc$super(WXHCNavBarAdapter wXHCNavBarAdapter, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean clearNavBarLeftItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afd47acc", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.aliweex.bundle.j
    public abstract void push(Activity activity, String str, JSONObject jSONObject);

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean setNavBarLeftItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37e9da61", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(-509190887);
        CLICK_LEFT_ITEM = "clickleftitem";
        CLICK_RIGHT_ITEM = "clickrightitem";
        CLICK_MORE_ITEM = "clickmoreitem";
        CLICK_CENTER_ITEM = "clickcenteritem";
    }

    public WXHCNavBarAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.menuItemRight = null;
        this.menuItemTitle = null;
        this.menuItemList = null;
    }

    public a getMenuItemRight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4159af95", new Object[]{this}) : this.menuItemRight;
    }

    public a getMenuItemTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ee1ba1d1", new Object[]{this}) : this.menuItemTitle;
    }

    public List<a> getMenuItemMore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("3613e5c3", new Object[]{this}) : this.menuItemList;
    }

    @Override // com.alibaba.aliweex.bundle.j
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        a aVar = this.menuItemTitle;
        if (aVar != null && aVar.c != null) {
            this.menuItemTitle.c.recycle();
            this.menuItemTitle = null;
        }
        a aVar2 = this.menuItemRight;
        if (aVar2 != null && aVar2.c != null) {
            this.menuItemRight.c.recycle();
            this.menuItemRight = null;
        }
        List<a> list = this.menuItemList;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (a aVar3 : this.menuItemList) {
            if (aVar3.c != null) {
                aVar3.c.recycle();
            }
        }
        this.menuItemList = null;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean setNavBarRightItem(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("be4ea752", new Object[]{this, str})).booleanValue() : setNavBarRightItem(str, null);
    }

    @Override // tb.amu
    public f setMoreItem(WXSDKInstance wXSDKInstance, com.alibaba.fastjson.JSONObject jSONObject, amu.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("f5e2f519", new Object[]{this, wXSDKInstance, jSONObject, aVar});
        }
        if (setNavBarMoreItem(jSONObject.toJSONString(), aVar)) {
            return null;
        }
        f fVar = new f();
        fVar.f2023a = "WX_ERROR";
        return fVar;
    }

    @Override // tb.amu
    public f setTitle(WXSDKInstance wXSDKInstance, com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("1e832f7b", new Object[]{this, wXSDKInstance, jSONObject});
        }
        if (!shouldSetNavigator(NavigatorType.TITLE)) {
            f fVar = new f();
            fVar.f2023a = "WX_FAILED";
            fVar.b = "can not set Navigator";
            return fVar;
        }
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("icon");
        this.menuItemTitle = new a();
        if (!TextUtils.isEmpty(string2)) {
            if (!checkScheme(string2)) {
                f fVar2 = new f();
                fVar2.f2023a = "WX_FAILED";
                fVar2.b = "schemeerror";
                return fVar2;
            }
            this.menuItemTitle.e = string2;
            getFragmentActivity().supportInvalidateOptionsMenu();
            return null;
        } else if (!TextUtils.isEmpty(string)) {
            this.menuItemTitle.d = string;
            getFragmentActivity().supportInvalidateOptionsMenu();
            return null;
        } else {
            f fVar3 = new f();
            fVar3.f2023a = "WX_FAILED";
            fVar3.b = "paramerror";
            return fVar3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f6, code lost:
        if (r7.menuItemRight.a(getFragmentActivity(), r8) >= 0) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean setNavBarRightItem(java.lang.String r8, tb.amu.a r9) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.aliweex.hc.bundle.WXHCNavBarAdapter.setNavBarRightItem(java.lang.String, tb.amu$a):boolean");
    }

    private boolean setNavBarMoreItem(String str, amu.a aVar) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("831498d9", new Object[]{this, str, aVar})).booleanValue();
        }
        if (shouldSetNavigator(NavigatorType.MORE_ITEM) && !TextUtils.isEmpty(str)) {
            try {
                if (this.menuItemList == null) {
                    this.menuItemList = new ArrayList();
                } else {
                    this.menuItemList.clear();
                }
                if (aVar != null) {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.length() == 0) {
                        clearNavBarMoreItem("");
                        return true;
                    }
                    JSONArray optJSONArray = jSONObject.optJSONArray("items");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                            String string = jSONObject2.getString("title");
                            String string2 = jSONObject2.getString("icon");
                            a aVar2 = new a();
                            aVar2.h = aVar;
                            aVar2.f = new Intent();
                            aVar2.f.putExtra("index", i);
                            if (!TextUtils.isEmpty(string2)) {
                                aVar2.e = string2;
                            }
                            if (!TextUtils.isEmpty(string)) {
                                aVar2.b(string);
                            }
                            if (!checkScheme(aVar2.e)) {
                                return false;
                            }
                            this.menuItemList.add(aVar2);
                        }
                        getFragmentActivity().supportInvalidateOptionsMenu();
                        return true;
                    }
                    a aVar3 = new a();
                    aVar3.h = aVar;
                    String str4 = null;
                    if (!TextUtils.isEmpty(null) || !TextUtils.isEmpty(null)) {
                        str2 = null;
                        str3 = null;
                    } else {
                        str4 = jSONObject.optString("icon");
                        str2 = jSONObject.optString("title");
                        str3 = jSONObject.optString("iconFontName");
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        aVar3.e = str4;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        aVar3.a(getFragmentActivity(), str3);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        aVar3.b(str2);
                    }
                    aVar3.f = new Intent();
                    aVar3.f.putExtra("index", 0);
                    this.menuItemList.add(aVar3);
                    getFragmentActivity().supportInvalidateOptionsMenu();
                    return true;
                }
                JSONObject jSONObject3 = new JSONObject(str);
                if (jSONObject3.length() == 0) {
                    clearNavBarMoreItem("");
                    return true;
                }
                JSONArray jSONArray = jSONObject3.getJSONArray("items");
                if (jSONArray != null && jSONArray.length() > 0) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
                        a aVar4 = new a();
                        String string3 = jSONObject4.getString("text");
                        if (!TextUtils.isEmpty(string3)) {
                            aVar4.d = string3;
                            boolean optBoolean = jSONObject4.optBoolean("fromNative", false);
                            boolean optBoolean2 = jSONObject4.optBoolean("iconFont", false);
                            String optString = jSONObject4.optString("icon");
                            if (!optBoolean) {
                                aVar4.a(optString, g.a(getFragmentActivity()));
                            } else if (optBoolean2) {
                                aVar4.a(getFragmentActivity(), optString);
                            } else {
                                aVar4.a(optString);
                            }
                            aVar4.f = new Intent();
                            aVar4.f.putExtra("index", i2);
                            this.menuItemList.add(aVar4);
                        }
                    }
                }
                getFragmentActivity().supportInvalidateOptionsMenu();
                return true;
            } catch (Exception e) {
                WXLogUtils.e("WebAppInterface", "setNavBarRightItem: param parse to JSON error, param=" + e.getMessage());
            }
        }
        return false;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean clearNavBarRightItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43b81447", new Object[]{this, str})).booleanValue();
        }
        if (!shouldSetNavigator(NavigatorType.CLEAR_RIGHT_ITEM)) {
            return false;
        }
        this.menuItemRight = null;
        getFragmentActivity().supportInvalidateOptionsMenu();
        return true;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean setNavBarMoreItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3c1d02f", new Object[]{this, str})).booleanValue();
        }
        if (shouldSetNavigator(NavigatorType.MORE_ITEM) && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("items");
                if (jSONArray != null && jSONArray.length() > 0) {
                    clearNavBarMoreItem("");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        a aVar = new a();
                        String string = jSONObject.getString("text");
                        if (!TextUtils.isEmpty(string)) {
                            aVar.d = string;
                            boolean optBoolean = jSONObject.optBoolean("fromNative", false);
                            boolean optBoolean2 = jSONObject.optBoolean("iconFont", false);
                            String optString = jSONObject.optString("icon");
                            if (optBoolean) {
                                if (optBoolean2 && getFragmentActivity() != null) {
                                    aVar.a(getFragmentActivity(), optString);
                                } else {
                                    aVar.a(optString);
                                }
                            } else {
                                aVar.a(optString, g.a(getFragmentActivity()));
                            }
                            aVar.f = new Intent();
                            aVar.f.putExtra("index", i);
                            if (this.menuItemList == null) {
                                this.menuItemList = new ArrayList();
                            }
                            this.menuItemList.add(aVar);
                        }
                    }
                }
                getFragmentActivity().supportInvalidateOptionsMenu();
                return true;
            } catch (Exception unused) {
                WXLogUtils.d("WXActivity", "setNavBarMoreItem: param decode error param=" + str);
            }
        }
        return false;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean clearNavBarMoreItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bac709a", new Object[]{this, str})).booleanValue();
        }
        if (!shouldSetNavigator(NavigatorType.CLEAR_MORE_ITEM)) {
            return false;
        }
        List<a> list = this.menuItemList;
        if (list == null) {
            this.menuItemList = new ArrayList();
        } else {
            list.clear();
        }
        getFragmentActivity().supportInvalidateOptionsMenu();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4 A[Catch: Exception -> 0x00df, TRY_LEAVE, TryCatch #0 {Exception -> 0x00df, blocks: (B:11:0x002d, B:13:0x004b, B:14:0x0059, B:16:0x005f, B:18:0x0067, B:20:0x0077, B:23:0x007e, B:25:0x008f, B:27:0x0095, B:43:0x00d4, B:30:0x00a0, B:32:0x00a8, B:35:0x00af, B:37:0x00b7, B:38:0x00c6, B:40:0x00ce), top: B:49:0x002d }] */
    @Override // com.taobao.weex.appfram.navigator.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean setNavBarTitle(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "icon"
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.aliweex.hc.bundle.WXHCNavBarAdapter.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1e
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r6
            r0[r3] = r7
            java.lang.String r7 = "832309b"
            java.lang.Object r7 = r1.ipc$dispatch(r7, r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L1e:
            com.alibaba.aliweex.hc.bundle.WXHCNavBarAdapter$NavigatorType r1 = com.alibaba.aliweex.hc.bundle.WXHCNavBarAdapter.NavigatorType.TITLE
            boolean r1 = r6.shouldSetNavigator(r1)
            if (r1 != 0) goto L27
            return r4
        L27:
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto Le9
            java.lang.String r1 = "utf-8"
            java.lang.String r7 = java.net.URLDecoder.decode(r7, r1)     // Catch: java.lang.Exception -> Ldf
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ldf
            r1.<init>(r7)     // Catch: java.lang.Exception -> Ldf
            com.alibaba.aliweex.hc.bundle.a r7 = new com.alibaba.aliweex.hc.bundle.a     // Catch: java.lang.Exception -> Ldf
            r7.<init>()     // Catch: java.lang.Exception -> Ldf
            java.lang.String r2 = "title"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Exception -> Ldf
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Ldf
            if (r5 != 0) goto L59
            r7.b(r2)     // Catch: java.lang.Exception -> Ldf
            r6.menuItemTitle = r7     // Catch: java.lang.Exception -> Ldf
            android.support.v4.app.FragmentActivity r7 = r6.getFragmentActivity()     // Catch: java.lang.Exception -> Ldf
            r7.supportInvalidateOptionsMenu()     // Catch: java.lang.Exception -> Ldf
            goto Ldd
        L59:
            boolean r2 = r1.has(r0)     // Catch: java.lang.Exception -> Ldf
            if (r2 != 0) goto L67
            java.lang.String r0 = " "
            r7.b(r0)     // Catch: java.lang.Exception -> Ldf
            r6.menuItemTitle = r7     // Catch: java.lang.Exception -> Ldf
            return r4
        L67:
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Exception -> Ldf
            java.lang.String r2 = "iconType"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Exception -> Ldf
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Ldf
            if (r5 != 0) goto Lde
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Ldf
            if (r5 == 0) goto L7e
            goto Lde
        L7e:
            java.lang.String r5 = "stretch"
            boolean r1 = r1.optBoolean(r5)     // Catch: java.lang.Exception -> Ldf
            r7.g = r1     // Catch: java.lang.Exception -> Ldf
            java.lang.String r1 = "IconFont"
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Exception -> Ldf
            if (r1 == 0) goto La0
            android.support.v4.app.FragmentActivity r1 = r6.getFragmentActivity()     // Catch: java.lang.Exception -> Ldf
            if (r1 == 0) goto La0
            android.support.v4.app.FragmentActivity r1 = r6.getFragmentActivity()     // Catch: java.lang.Exception -> Ldf
            int r0 = r7.a(r1, r0)     // Catch: java.lang.Exception -> Ldf
            if (r0 < 0) goto Ld1
            goto Ld2
        La0:
            java.lang.String r1 = "Native"
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Exception -> Ldf
            if (r1 == 0) goto Laf
            int r0 = r7.a(r0)     // Catch: java.lang.Exception -> Ldf
            if (r0 < 0) goto Ld1
            goto Ld2
        Laf:
            java.lang.String r1 = "Base64"
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Exception -> Ldf
            if (r1 == 0) goto Lc6
            android.support.v4.app.FragmentActivity r1 = r6.getFragmentActivity()     // Catch: java.lang.Exception -> Ldf
            int r1 = com.alibaba.aliweex.utils.g.a(r1)     // Catch: java.lang.Exception -> Ldf
            float r1 = (float) r1     // Catch: java.lang.Exception -> Ldf
            boolean r0 = r7.a(r0, r1)     // Catch: java.lang.Exception -> Ldf
            r3 = r0
            goto Ld2
        Lc6:
            java.lang.String r1 = "URL"
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Exception -> Ldf
            if (r1 == 0) goto Ld1
            r7.e = r0     // Catch: java.lang.Exception -> Ldf
            goto Ld2
        Ld1:
            r3 = 0
        Ld2:
            if (r3 == 0) goto Ldd
            r6.menuItemTitle = r7     // Catch: java.lang.Exception -> Ldf
            android.support.v4.app.FragmentActivity r7 = r6.getFragmentActivity()     // Catch: java.lang.Exception -> Ldf
            r7.supportInvalidateOptionsMenu()     // Catch: java.lang.Exception -> Ldf
        Ldd:
            return r3
        Lde:
            return r4
        Ldf:
            r7 = move-exception
            java.lang.String r7 = com.taobao.weex.utils.WXLogUtils.getStackTrace(r7)
            java.lang.String r0 = "WXNavBarAdapter"
            com.taobao.weex.utils.WXLogUtils.e(r0, r7)
        Le9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.aliweex.hc.bundle.WXHCNavBarAdapter.setNavBarTitle(java.lang.String):boolean");
    }

    @Override // tb.amu
    public f setLeftItem(WXSDKInstance wXSDKInstance, com.alibaba.fastjson.JSONObject jSONObject, amu.a aVar) {
        FragmentManager supportFragmentManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("c2ddafcb", new Object[]{this, wXSDKInstance, jSONObject, aVar});
        }
        boolean navBarLeftItem = setNavBarLeftItem(jSONObject.toJSONString());
        WeexPageFragment weexPageFragment = (getFragmentActivity() == null || (supportFragmentManager = getFragmentActivity().getSupportFragmentManager()) == null) ? null : (WeexPageFragment) supportFragmentManager.findFragmentByTag(WeexPageFragment.FRAGMENT_TAG);
        if (!navBarLeftItem && weexPageFragment != null) {
            if (jSONObject != null && jSONObject.size() > 0) {
                weexPageFragment.setBackPressedListener(aVar);
            } else {
                weexPageFragment.setBackPressedListener(null);
            }
            navBarLeftItem = true;
        }
        if (navBarLeftItem) {
            return null;
        }
        f fVar = new f();
        fVar.f2023a = "WX_ERROR";
        return fVar;
    }

    @Override // tb.amu
    public f setRightItem(WXSDKInstance wXSDKInstance, com.alibaba.fastjson.JSONObject jSONObject, amu.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("5717f61c", new Object[]{this, wXSDKInstance, jSONObject, aVar});
        }
        if (setNavBarRightItem(jSONObject.toJSONString(), aVar)) {
            return null;
        }
        f fVar = new f();
        fVar.f2023a = "WX_ERROR";
        return fVar;
    }

    private boolean shouldSetNavigator(NavigatorType navigatorType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dadcab0", new Object[]{this, navigatorType})).booleanValue();
        }
        int i = AnonymousClass1.f2024a[navigatorType.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            return true;
        }
        return shouldSetNavigator();
    }

    public WeexPageFragment getWeexPageFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexPageFragment) ipChange.ipc$dispatch("3b1eded2", new Object[]{this});
        }
        Fragment findFragmentByTag = getFragmentActivity().getSupportFragmentManager().findFragmentByTag(WeexPageFragment.FRAGMENT_TAG);
        if (findFragmentByTag != null && (findFragmentByTag instanceof WeexPageFragment)) {
            return (WeexPageFragment) findFragmentByTag;
        }
        return null;
    }

    public boolean shouldSetNavigator() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("823b61f3", new Object[]{this})).booleanValue();
        }
        try {
            String config = d.a().l().getConfig("group_weex_hc", "weex_main_hc_domain", "");
            if (!TextUtils.isEmpty(config)) {
                for (String str : config.split(",")) {
                    String originalUrl = getWeexPageFragment().getOriginalUrl();
                    if (!TextUtils.isEmpty(originalUrl) && originalUrl.contains(str)) {
                        return false;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    private boolean checkScheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("539713a2", new Object[]{this, str})).booleanValue();
        }
        String scheme = Uri.parse(str).getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String lowerCase = scheme.toLowerCase();
            if (lowerCase.equals("http") || lowerCase.equals("https") || lowerCase.equals("data") || lowerCase.equals("local")) {
                return true;
            }
        }
        return false;
    }
}
