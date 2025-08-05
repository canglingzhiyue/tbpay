package com.taobao.alimama.click.extend;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.click.extend.ExtendClickLink;
import java.util.HashMap;
import java.util.Map;
import tb.dgb;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, ExtendClickLink> f8420a;

    /* renamed from: com.taobao.alimama.click.extend.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0327a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f8421a;

        static {
            kge.a(1815469198);
            f8421a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("88d3d94a", new Object[0]) : f8421a;
        }
    }

    static {
        kge.a(-1310716297);
    }

    private a() {
        this.f8420a = new HashMap();
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a(new ExtendClickLink.a().a("100").b("mtop.ali.ad.settle.tianhe.click").a(ExtendClickLink.CustomClickType.CPM).a());
        a(new dgb(new ExtendClickLink.a().a("101").a(ExtendClickLink.CustomClickType.CPM)));
    }

    public void a(ExtendClickLink extendClickLink) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d472243", new Object[]{this, extendClickLink});
        } else if (!b(extendClickLink)) {
        } else {
            if (this.f8420a.containsKey(extendClickLink.a())) {
                throw new IllegalArgumentException("etype 重复注册，请检查etype类型");
            }
            this.f8420a.put(extendClickLink.a(), extendClickLink);
        }
    }

    private boolean b(ExtendClickLink extendClickLink) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6762a0e6", new Object[]{this, extendClickLink})).booleanValue();
        }
        if (extendClickLink == null) {
            return false;
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (Integer.parseInt(extendClickLink.a()) >= 100) {
            return !TextUtils.isEmpty(extendClickLink.a()) && extendClickLink.c() != ExtendClickLink.CustomClickType.NONE;
        }
        throw new IllegalArgumentException("etype 不合法，自定义链路etype需大于等于100");
    }

    public ExtendClickLink a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExtendClickLink) ipChange.ipc$dispatch("b8a6bacd", new Object[]{this, str}) : this.f8420a.get(str);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("88d3d94a", new Object[0]) : C0327a.a();
    }
}
