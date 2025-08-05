package com.taobao.tao.shop.rule;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.data.TBBundleUrlRuleInfo;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f21093a;
    public static String b;
    private static final ConcurrentHashMap<String, TBBundleUrlRuleInfo> c;

    static {
        kge.a(1677565700);
        f21093a = "shop";
        b = "huichang";
        c = new ConcurrentHashMap<>();
    }

    public static TBBundleUrlRuleInfo a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBBundleUrlRuleInfo) ipChange.ipc$dispatch("ecd16685", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return c.get(str);
        }
        return null;
    }

    public static boolean a(TBBundleUrlRuleInfo tBBundleUrlRuleInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d80309bf", new Object[]{tBBundleUrlRuleInfo})).booleanValue();
        }
        if (tBBundleUrlRuleInfo == null || TextUtils.isEmpty(tBBundleUrlRuleInfo.mBundleName)) {
            return false;
        }
        c.put(tBBundleUrlRuleInfo.mBundleName, tBBundleUrlRuleInfo);
        return true;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        TBBundleUrlRuleInfo tBBundleUrlRuleInfo = new TBBundleUrlRuleInfo();
        tBBundleUrlRuleInfo.mBundleName = f21093a;
        tBBundleUrlRuleInfo.mRuleFileName = "shop-rule-5.3.json";
        Log.e("TBShopInit", tBBundleUrlRuleInfo.mRuleFileName);
        tBBundleUrlRuleInfo.mBaseLineVersion = "5.2";
        tBBundleUrlRuleInfo.mFirstBitVersion = 5;
        tBBundleUrlRuleInfo.mSecBitVersion = 2;
        return a(tBBundleUrlRuleInfo);
    }

    public static Collection<TBBundleUrlRuleInfo> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("846747e", new Object[0]) : c.values();
    }
}
