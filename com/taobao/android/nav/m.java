package com.taobao.android.nav;

import android.app.Application;
import anet.channel.session.dns.DnsNavProcessor;
import anet.channel.session.dns.DnsNavProcessorNode;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.UltronTradeHybridNavProcessor;
import com.alibaba.triver.bundle.nav.TriverNavProcessor;
import com.alibaba.triver.triver_shop.adapter.ShopNavAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.allspark.GuangGuangNavProcessor;
import com.taobao.android.dinamicx.af;
import com.taobao.android.dinamicx.ag;
import com.taobao.android.goodprice.processor.GoodPriceMiniDetailFragmentProcessor;
import com.taobao.android.litecreator.sdk.LiteCreatorNavProcessor;
import com.taobao.android.purchase.TBBuyNavProcessor;
import com.taobao.android.tb3dspaceprocessor.XRNativeProcessor;
import com.taobao.browser.nav.BrowserActivityProcessor;
import com.taobao.fscrmid.nav.FullPageNavProcessor;
import com.taobao.message.util.MessageNavProcessorV2;
import com.taobao.message.util.MessageNavProcessorV2Node;
import com.taobao.mytaobao.newsetting.MTbSettingsNavProcessor;
import com.taobao.pha.tb.H5NavProcess;
import com.taobao.pha.tb.PrefetchProcessor;
import com.taobao.weex.adapter.TBWXNavProcessor;
import com.taobao.weex.adapter.TBWXNavProcessorNode;
import java.util.HashMap;
import tb.kge;
import tb.krw;
import tb.krx;
import tb.tkd;
import tb.tke;

/* loaded from: classes6.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MODIFY_AFTER = 4;
    public static final int MODIFY_BEFORE = 2;
    public static final int READ_ONLY_AFTER = 5;
    public static final int READ_ONLY_BEFORE = 0;
    public static final int ROOT_MODIFY_BEFORE = 1;
    public static final int WINDVANE = 3;

    /* renamed from: a  reason: collision with root package name */
    private static l f14457a;
    private static l b;
    private static l c;
    private static l d;
    private static l e;
    private static l f;

    static {
        kge.a(726132293);
        f14457a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        a(0);
        a(5);
        a(3);
        a(2);
        a(4);
        a(1);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
        } else {
            g();
        }
    }

    public static l a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("7f101bdd", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            if (f14457a == null) {
                f14457a = b();
            }
            return f14457a;
        } else if (i == 1) {
            if (f == null) {
                f = a();
            }
            return f;
        } else if (i == 2) {
            if (d == null) {
                d = e();
            }
            return d;
        } else if (i == 3) {
            if (c == null) {
                c = d();
            }
            return c;
        } else if (i == 4) {
            if (e == null) {
                e = f();
            }
            return e;
        } else if (i != 5) {
            return null;
        } else {
            if (b == null) {
                b = c();
            }
            return b;
        }
    }

    public static l a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("a22fd3b0", new Object[0]) : l.b(new com.taobao.tao.newprocessor.d(new com.taobao.tao.newprocessor.c())).a(new com.alibaba.analytics.d(new com.alibaba.analytics.c())).a(new com.taobao.android.processors.h(new com.taobao.android.processors.g()));
    }

    public static l b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("a2dc7f4f", new Object[0]) : l.b(new com.taobao.android.launcher.bootstrap.tao.biz.nav.b(new com.taobao.android.launcher.bootstrap.tao.biz.nav.a())).a(new com.taobao.tbpoplayer.adapter.e(new com.taobao.tbpoplayer.adapter.d())).a(new com.taobao.android.tschedule.trigger.nav.e(new com.taobao.android.tschedule.trigger.nav.d())).a(new com.taobao.family.globalbubble.g(new com.taobao.family.globalbubble.f())).a(new com.taobao.share.copy.e(new com.taobao.share.copy.d())).a(new ag(new af())).a(new com.taobao.search.musie.i(new com.taobao.search.musie.h())).a(new com.taobao.android.tb3dspaceprocessor.e(new XRNativeProcessor())).a(new com.taobao.pha.tb.j(new PrefetchProcessor())).a(new DnsNavProcessorNode(new DnsNavProcessor()));
    }

    public static l c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("a3892aee", new Object[0]) : l.b(new com.taobao.android.processors.b(new com.taobao.android.processors.a())).a(new com.taobao.android.processors.f(new com.taobao.android.processors.e())).a(new mtopsdk.ssrcore.f(new mtopsdk.ssrcore.e()));
    }

    public static l d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("a435d68d", new Object[0]) : l.b(new com.taobao.search.searchdoor.d(new com.taobao.search.searchdoor.c()));
    }

    public static l e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("a4e2822c", new Object[0]) : l.b(new com.taobao.android.processors.d(new com.taobao.android.processors.c())).a(new com.taobao.tao.newprocessor.h(new com.taobao.tao.newprocessor.g())).a(new com.taobao.themis.taobao.impl.c(new com.taobao.themis.taobao.impl.b())).a(new com.taobao.android.goodprice.processor.a(new GoodPriceMiniDetailFragmentProcessor())).a(new com.alibaba.triver.triver_shop.adapter.b(new ShopNavAdapter())).a(new com.alibaba.triver.bundle.nav.e(new TriverNavProcessor())).a(new com.taobao.search.searchdoor.d(new com.taobao.search.searchdoor.c())).a(new com.taobao.tao.newprocessor.b(new com.taobao.tao.newprocessor.a())).a(new MessageNavProcessorV2Node(new MessageNavProcessorV2())).a(new com.tmall.wireless.membershop.core.b(new com.tmall.wireless.membershop.core.a())).a(new com.taobao.tao.relation.i(new com.taobao.tao.relation.h())).a(new com.taobao.android.detail2.core.framework.i(new com.taobao.android.detail2.core.framework.h())).a(new com.taobao.android.interactive.d(new com.taobao.android.interactive.c())).a(new com.alibaba.android.ultron.vfw.weex2.highPerformance.management.b(new UltronTradeHybridNavProcessor())).a(new TBWXNavProcessorNode(new TBWXNavProcessor())).a(new com.taobao.pha.tb.f(new com.taobao.pha.tb.e())).a(new com.taobao.order.downgrade.detail.c(new com.taobao.order.downgrade.detail.b())).a(new com.taobao.order.downgrade.list.b(new com.taobao.order.downgrade.list.a())).a(new com.taobao.tao.newprocessor.f(new com.taobao.tao.newprocessor.e())).a(new com.tmall.wireless.membershop.core.f(new com.tmall.wireless.membershop.core.e())).a(new com.taobao.fscrmid.nav.a(new FullPageNavProcessor())).a(new com.taobao.allspark.c(new GuangGuangNavProcessor())).a(new com.taobao.vividsocial.upgrade.b(new com.taobao.vividsocial.upgrade.a())).a(new com.taobao.vividsocial.upgrade.d(new com.taobao.vividsocial.upgrade.c())).a(new com.taobao.vividsocial.upgrade.f(new com.taobao.vividsocial.upgrade.e())).a(new tke(new tkd())).a(new com.taobao.android.tschedule.trigger.nav.c(new com.taobao.android.tschedule.trigger.nav.b())).a(new com.taobao.browser.nav.c(new com.taobao.browser.nav.b())).a(new com.taobao.android.detail2.core.framework.d(new com.taobao.android.detail2.core.framework.c())).a(new com.taobao.search.searchdoor.b(new com.taobao.search.searchdoor.a())).a(new com.taobao.ask.nav.c(new com.taobao.ask.nav.b())).a(new com.taobao.android.order.bundle.nav.e(new com.taobao.android.order.bundle.nav.d())).a(new com.taobao.performance.e(new com.taobao.performance.d())).a(new com.taobao.android.tb3dspaceprocessor.d(new com.taobao.android.tb3dspaceprocessor.c())).a(new com.taobao.android.detail.wrapper.nav.d(new com.taobao.android.detail.wrapper.nav.c())).a(new com.taobao.android.dinamicx.subscribe.utils.m(new com.taobao.android.dinamicx.subscribe.utils.l())).a(new com.taobao.android.litecreator.sdk.c(new LiteCreatorNavProcessor())).a(new com.taobao.ugc.imagecontent.detailpage.nav.b(new com.taobao.ugc.imagecontent.detailpage.nav.a())).a(new com.taobao.tao.tbmainfragment.k(new com.taobao.tao.tbmainfragment.j())).a(new com.taobao.android.processors.l(new com.taobao.android.processors.k())).a(new com.taobao.android.tmgcontainer.router.b(new com.taobao.android.tmgcontainer.router.a()));
    }

    public static l f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("a58f2dcb", new Object[0]) : l.b(new com.taobao.appbundle.processor.b(new com.taobao.appbundle.processor.a())).a(new com.taobao.android.trade.cart.processor.b(new com.taobao.android.trade.cart.processor.a())).a(new com.taobao.android.pissarro.pad.b(new com.taobao.android.pissarro.pad.a())).a(new com.taobao.taolivehome.nav.b(new com.taobao.taolivehome.nav.a())).a(new com.taobao.search.common.c(new com.taobao.search.common.b())).a(new com.taobao.android.waitpay.j(new com.taobao.android.waitpay.i())).a(new com.taobao.mytaobao.newsetting.h(new MTbSettingsNavProcessor())).a(new com.taobao.android.detail.wrapper.nav.f(new com.taobao.android.detail.wrapper.nav.e())).a(new com.taobao.android.interactive.f(new com.taobao.android.interactive.e())).a(new com.taobao.android.processors.j(new com.taobao.android.processors.i())).a(new com.taobao.taolive.nav.b(new com.taobao.taolive.nav.a())).a(new krx(new krw())).a(new com.taobao.android.purchase.d(new TBBuyNavProcessor())).a(new com.taobao.pha.tb.d(new H5NavProcess())).a(new com.taobao.browser.nav.a(new BrowserActivityProcessor())).a(new com.taobao.android.autosize.g(new com.taobao.android.autosize.e()));
    }
}
