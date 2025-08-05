package com.taobao.search.musie;

import android.net.Uri;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.ai;
import tb.iml;
import tb.imo;
import tb.jjj;
import tb.jys;
import tb.kge;

/* loaded from: classes7.dex */
public final class a extends jys {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1297852059);
    }

    @Override // tb.jys
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "mtop.relationrecommend.WirelessRecommend.recommend";
    }

    @Override // tb.jys
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "2.0";
    }

    @Override // tb.jys
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : "category";
    }

    @Override // tb.jys
    public boolean a(Uri data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{this, data})).booleanValue();
        }
        kotlin.jvm.internal.q.c(data, "data");
        String path = data.getPath();
        kotlin.jvm.internal.q.a((Object) path, "data.path");
        return kotlin.text.n.b((CharSequence) path, (CharSequence) "weex-category-page", false, 2, (Object) null);
    }

    @Override // tb.jys
    public Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this});
        }
        iml a2 = imo.b().a();
        kotlin.jvm.internal.q.a((Object) a2, "SearchFrameSDK.getGlobalCore().constant()");
        return ai.b(kotlin.j.a("biz", "cateHome"), kotlin.j.a("type", "industry"), kotlin.j.a("p2app", "taobao"), kotlin.j.a("n", "10"), kotlin.j.a(jjj.SPM_A, "a2141"), kotlin.j.a(jjj.SPM_B, "categorytab"), kotlin.j.a(RequestConfig.IS_ICART_IS_FIRST_REQUEST, "true"), kotlin.j.a("sversion", a2.e()), kotlin.j.a("tabIndex", "1"), kotlin.j.a("page", "1"), kotlin.j.a("preload", "true"));
    }

    @Override // tb.jys
    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : ai.b(kotlin.j.a("appId", "31198"));
    }
}
