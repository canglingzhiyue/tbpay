package com.taobao.taolive.sdk.goodlist;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBLIVE_ORANGE_GL = "goodlist";
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f21831a;
    private static String b;

    static {
        kge.a(-845940694);
    }

    public static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue();
        }
        return (jSONObject != null && jSONObject.getBooleanValue("hasPcg")) && com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("goodlist", "enableGLPcg", "true"));
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (f21831a == null) {
            f21831a = Boolean.valueOf(b());
        }
        return f21831a.booleanValue();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableGoodsListSecKillItem", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableCacheForKanDianRecover", "true"));
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : b;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(a("openSubscribePopLayer", "true"));
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : pmd.a().d() != null ? pmd.a().d().a("tblive", str, str2) : str2;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableFollowSeckillOpt", "true"));
    }
}
