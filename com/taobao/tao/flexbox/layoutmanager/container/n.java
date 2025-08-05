package com.taobao.tao.flexbox.layoutmanager.container;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.ChangeClipBounds;
import android.transition.ChangeTransform;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.animation.shareelement.AbsContainerTransition;
import com.taobao.tao.flexbox.layoutmanager.animation.shareelement.CornerRadiusTransition;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.oel;
import tb.ohd;

/* loaded from: classes8.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MATCH_TAG = "element_matched";
    public static final String TRANSITION = "transition";
    public static final String TRANSITION_ARG_CARD = "card";
    public static final String TRANSITION_ARG_DIRECTION = "direction";
    public static final String TRANSITION_TYPE_CORNER_RADIUS = "cornerradius";
    public static final String TRANSITION_TYPE_FADE = "fade";
    public static final String TRANSITION_TYPE_INTERACT = "interact";
    public static final String TRANSITION_TYPE_PUSH = "push";
    public static final String TRANSITION_TYPE_SCALE = "scale";
    public static final String TRANSITION_TYPE_SECONDPAGE = "secondpage";
    public static final String TRANSITION_TYPE_SHARE = "share";

    /* renamed from: a  reason: collision with root package name */
    public String[] f20267a;
    public String[] b;
    public TimeInterpolator c;
    public int d = 0;
    public long e = 200;
    public List f;
    public Map g;
    private boolean h;

    static {
        kge.a(587083098);
    }

    public static Pair<Map, List> a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("bb36b1f4", new Object[]{context, str});
        }
        String queryParameter = Uri.parse(str).getQueryParameter("transition");
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                JSONObject parseObject = JSON.parseObject(queryParameter);
                JSONArray jSONArray = parseObject.getJSONArray("share");
                if (!b(context)) {
                    return new Pair<>(null, jSONArray);
                }
                return new Pair<>(parseObject.getJSONObject("card"), jSONArray);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static n a(Context context, Uri uri, Uri uri2, Bundle bundle, boolean z) {
        String str;
        String[] split;
        int i;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("962d54ae", new Object[]{context, uri, uri2, bundle, new Boolean(z)});
        }
        n nVar = new n();
        if (oeb.ae()) {
            String[] strArr = {"push"};
            nVar.b = strArr;
            nVar.f20267a = strArr;
        } else {
            String queryParameter = uri.getQueryParameter("transition");
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            if (bundle != null ? oec.a(bundle.get("animated"), true) : true) {
                if (TextUtils.equals(a.GESTURE_PULLRIGHTEXIT, uri2.getQueryParameter(a.CONFIG_PAN_GESTURE))) {
                    hashSet2.add("push");
                    hashSet2.add("interact");
                }
                if (oec.a((Object) uri2.getQueryParameter(a.CONFIG_SEC_PAGE_ENABLE), false)) {
                    hashSet.add(TRANSITION_TYPE_SECONDPAGE);
                }
                if (!TextUtils.isEmpty(queryParameter)) {
                    try {
                        JSONObject parseObject = JSON.parseObject(queryParameter);
                        str = parseObject.getString("transitionType");
                        if (parseObject.containsKey("type")) {
                            nVar.c = oel.a(oec.a(parseObject.get("type"), "ease"));
                        }
                        nVar.e = oec.a(parseObject.get("duration"), 200);
                        nVar.d = oec.a(parseObject.get("delay"), 0);
                        nVar.f = parseObject.getJSONArray("share");
                        a(nVar, parseObject);
                    } catch (Exception unused) {
                        str = queryParameter;
                    }
                    if (!TextUtils.isEmpty(str) && (split = str.split(",")) != null && split.length > 0) {
                        String[] split2 = split[0].split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                        int i2 = 0;
                        for (int length = split2.length; i2 < length; length = i) {
                            String str2 = split2[i2];
                            if (TextUtils.equals(str2, "share")) {
                                Map map = nVar.g;
                                if (map != null) {
                                    i = length;
                                    if (map.get("card") != null && b(context)) {
                                        z2 = true;
                                        if (oeb.bi() && z2) {
                                            nVar.h = true;
                                            hashSet.add(TRANSITION_TYPE_FADE);
                                            hashSet.add(str2);
                                            i2++;
                                        }
                                    }
                                } else {
                                    i = length;
                                }
                                z2 = false;
                                if (oeb.bi()) {
                                    nVar.h = true;
                                    hashSet.add(TRANSITION_TYPE_FADE);
                                    hashSet.add(str2);
                                    i2++;
                                }
                            } else {
                                i = length;
                            }
                            hashSet.add(str2);
                            i2++;
                        }
                        if (split.length > 1) {
                            for (String str3 : split[1].split(SymbolExpUtil.SYMBOL_VERTICALBAR)) {
                                hashSet2.add(str3);
                            }
                        } else {
                            for (String str4 : split2) {
                                hashSet2.add(str4);
                            }
                        }
                    }
                } else if (z) {
                    hashSet.add(TRANSITION_TYPE_FADE);
                    hashSet.add("share");
                } else {
                    hashSet.add("push");
                    hashSet2.add("push");
                }
            } else if (z) {
                hashSet.add(TRANSITION_TYPE_FADE);
                hashSet.add("share");
            }
            if (bundle != null) {
                float a2 = ohd.a(ab.a(), oec.b(bundle.get(a.CONFIG_START_CORNER_RADIUS), 0));
                float a3 = ohd.a(ab.a(), oec.b(bundle.get(a.CONFIG_END_CORNER_RADIUS), 0));
                if (a2 > 0.0f || a3 > 0.0f) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(a.CONFIG_START_CORNER_RADIUS, Float.valueOf(a2));
                    hashMap.put(a.CONFIG_END_CORNER_RADIUS, Float.valueOf(a3));
                    a(nVar, hashMap);
                    hashSet.add(TRANSITION_TYPE_CORNER_RADIUS);
                    hashSet2.add(TRANSITION_TYPE_CORNER_RADIUS);
                    hashSet2.add("share");
                }
            }
            if (oec.a((Object) uri2.getQueryParameter(a.CONFIG_PULL_DOWN), false)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("direction", "bottom");
                a(nVar, hashMap2);
                hashSet2.add("push");
                hashSet2.add("interact");
            }
            nVar.f20267a = (String[]) hashSet.toArray(new String[hashSet.size()]);
            nVar.b = (String[]) hashSet2.toArray(new String[hashSet2.size()]);
        }
        if (nVar.c == null) {
            nVar.c = new AccelerateDecelerateInterpolator();
        }
        return nVar;
    }

    private static void a(n nVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e42bb05", new Object[]{nVar, map});
            return;
        }
        Map map2 = nVar.g;
        if (map2 != null) {
            map2.putAll(map);
        } else if (map == null) {
        } else {
            nVar.g = map;
        }
    }

    public static Transition a(Context context, String str, n nVar, boolean z) {
        char c;
        com.alibaba.android.split.core.splitinstall.g c2;
        long j = nVar.e;
        TimeInterpolator timeInterpolator = nVar.c;
        Map map = nVar.g;
        int hashCode = str.hashCode();
        int i = 2;
        boolean z2 = true;
        if (hashCode == 3135100) {
            if (str.equals(TRANSITION_TYPE_FADE)) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 109400031) {
            if (hashCode == 1499728679 && str.equals(TRANSITION_TYPE_CORNER_RADIUS)) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("share")) {
                c = 0;
            }
            c = 65535;
        }
        AbsContainerTransition absContainerTransition = null;
        TransitionSet transitionSet = null;
        if (c == 0) {
            boolean z3 = (map == null || map.get("card") == null || !b(context)) ? false : true;
            if (!z3 || z || !nVar.h) {
                z2 = false;
            }
            if (z3 && !z2 && (((c2 = com.taobao.appbundle.c.Companion.a().c()) != null && c2.a().contains("layoutmanager_feature")) || com.android.tools.bundleInfo.b.a().c("layoutmanager_feature") == null)) {
                try {
                    absContainerTransition = (AbsContainerTransition) Class.forName("com.google.android.material.transition.platform.MaterialContainerTransform").newInstance();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (absContainerTransition != null) {
                    absContainerTransition.setFadeMode(0);
                    transitionSet = absContainerTransition;
                }
            }
            TransitionSet transitionSet2 = new TransitionSet();
            transitionSet2.addTransition(new ChangeTransform());
            transitionSet2.addTransition(new ChangeClipBounds());
            transitionSet2.addTransition(new ChangeBounds());
            transitionSet = transitionSet2;
        } else if (c == 1) {
            if (!z) {
                i = 1;
            }
            transitionSet = new Fade(i);
        } else if (c == 2) {
            float b = oec.b(map.get(a.CONFIG_START_CORNER_RADIUS), 0);
            float b2 = oec.b(map.get(a.CONFIG_END_CORNER_RADIUS), 0);
            if (z) {
                transitionSet = new CornerRadiusTransition(b2, b);
            } else {
                transitionSet = new CornerRadiusTransition(b, b2);
            }
        }
        if (transitionSet != null) {
            transitionSet.setDuration(j);
            transitionSet.setInterpolator(timeInterpolator);
        }
        return transitionSet;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator a(android.view.View r16, java.lang.String r17, long r18, android.animation.TimeInterpolator r20, java.util.Map r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.container.n.a(android.view.View, java.lang.String, long, android.animation.TimeInterpolator, java.util.Map, boolean):android.animation.Animator");
    }

    public static void a(Activity activity, n nVar, boolean z) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d9cbc2", new Object[]{activity, nVar, new Boolean(z)});
            return;
        }
        String[] strArr = nVar.f20267a;
        if (z) {
            strArr = nVar.b;
        }
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            int hashCode = str.hashCode();
            char c2 = 65535;
            if (hashCode != 3135100) {
                if (hashCode == 3452698 && str.equals("push")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals(TRANSITION_TYPE_FADE)) {
                    c = 0;
                }
                c = 65535;
            }
            if (c != 0) {
                if (c == 1) {
                    Map map = nVar.g;
                    String str2 = "direction";
                    if (map == null) {
                        str2 = "right";
                    } else if (oeb.aF()) {
                        str2 = oec.a(map.get(str2), "right");
                    }
                    if (z) {
                        switch (str2.hashCode()) {
                            case -1383228885:
                                if (str2.equals("bottom")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (str2.equals("top")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (str2.equals("left")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (str2.equals("right")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0) {
                            activity.overridePendingTransition(0, R.anim.tnode_push_right_out);
                        } else if (c2 == 1) {
                            activity.overridePendingTransition(0, R.anim.tnode_push_left_out);
                        } else if (c2 == 2) {
                            activity.overridePendingTransition(0, R.anim.tnode_push_top_out);
                        } else if (c2 == 3) {
                            activity.overridePendingTransition(0, R.anim.tnode_push_bottom_out);
                        }
                    } else {
                        switch (str2.hashCode()) {
                            case -1383228885:
                                if (str2.equals("bottom")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (str2.equals("top")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (str2.equals("left")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (str2.equals("right")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0) {
                            activity.overridePendingTransition(R.anim.tnode_push_right_in, R.anim.tnode_fake_out);
                        } else if (c2 == 1) {
                            activity.overridePendingTransition(R.anim.tnode_push_left_in, R.anim.tnode_fake_out);
                        } else if (c2 == 2) {
                            activity.overridePendingTransition(R.anim.tnode_push_top_in, R.anim.tnode_fake_out);
                        } else if (c2 == 3) {
                            activity.overridePendingTransition(R.anim.tnode_push_bottom_in, R.anim.tnode_fake_out);
                        }
                    }
                }
            } else if (z) {
                activity.overridePendingTransition(0, 17432577);
            } else {
                activity.overridePendingTransition(17432576, R.anim.tnode_fake_out);
            }
        }
    }

    public boolean a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b26fbb", new Object[]{this, strArr})).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        for (String str : strArr) {
            if (!a(this.b, str)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffb3fe9a", new Object[]{this, strArr})).booleanValue();
        }
        if (this.f20267a == null) {
            return false;
        }
        for (String str : strArr) {
            if (!a(this.f20267a, str)) {
                return false;
            }
        }
        return true;
    }

    private boolean a(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a325b9c5", new Object[]{this, strArr, str})).booleanValue();
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        Map map = this.g;
        return oeb.E() && a("push", "interact") && (map != null ? TextUtils.equals("right", oec.a(map.get("direction"), "right")) : true);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Map map = this.g;
        return a("push", "interact") && (map != null ? TextUtils.equals("bottom", oec.a(map.get("direction"), "right")) : false);
    }

    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        Map map = this.g;
        return a("share", "interact") && (map != null && map.get("card") != null && b(context));
    }

    public String c() {
        Map a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        List list = this.f;
        if (list != null && !list.isEmpty() && (a2 = oec.a(this.f.get(0), (Map) null)) != null) {
            for (Map.Entry entry : a2.entrySet()) {
                if (!((String) entry.getKey()).equals(MATCH_TAG)) {
                    return (String) entry.getValue();
                }
            }
        }
        return null;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.h;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        IDeviceInfo w = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().w();
        if (w != null && w.f()) {
            return false;
        }
        if ((context instanceof d) && com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b() != null && com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a() == null) {
            return true;
        }
        com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
        return b != null && b.d();
    }
}
