package com.taobao.tao.shop;

import android.app.Application;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.shop.fetcher.adapter.b;
import com.taobao.tao.shop.rule.data.TBBundleUrlRuleInfo;
import java.util.Collection;
import tb.kge;
import tb.ouu;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f21073a;
    public static Application b;
    public static int c;
    public static String d;

    static {
        kge.a(638327740);
        f21073a = false;
    }

    public static void a(Application application, String str, int i, Collection<TBBundleUrlRuleInfo> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25e61d3", new Object[]{application, str, new Integer(i), collection});
        } else if (f21073a || application == null || StringUtils.isEmpty(str) || i < 0) {
            ouu.c("ShopRule init error");
        } else {
            b = application;
            c = i;
            a(collection);
            b.a().a(application);
            a(application);
            f21073a = true;
            ouu.c("ShopRule init success");
        }
    }

    private static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            new com.taobao.tao.shop.fetcher.c(context).a();
        }
    }

    private static void a(Collection<TBBundleUrlRuleInfo> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2847c19", new Object[]{collection});
        } else if (collection.size() <= 0) {
            ouu.c("ruleInfos is empty");
        } else {
            for (TBBundleUrlRuleInfo tBBundleUrlRuleInfo : collection) {
                com.taobao.tao.shop.rule.f.a().a(tBBundleUrlRuleInfo);
            }
            String[] strArr = new String[collection.size()];
            for (TBBundleUrlRuleInfo tBBundleUrlRuleInfo2 : collection) {
                strArr[0] = tBBundleUrlRuleInfo2.mBundleName;
                OrangeConfig.getInstance().getConfigs(tBBundleUrlRuleInfo2.mBundleName);
            }
            OrangeConfig.getInstance().registerListener(strArr, new com.taobao.tao.shop.rule.h(strArr));
        }
    }
}
