package com.taobao.search.jarvis.rcmd;

import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.n;
import com.taobao.search.jarvis.rcmd.cell.XslDegradeCellBean;
import com.taobao.search.musie.j;
import com.taobao.search.musie.o;
import com.taobao.search.musie.p;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.SystemBarDecorator;
import tb.imn;
import tb.imo;
import tb.ise;
import tb.jbg;
import tb.jxp;
import tb.jyd;
import tb.jza;
import tb.kge;
import tb.nsw;
import tb.nts;
import tb.nue;
import tb.nuf;
import tb.nux;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static imn f19066a;

    static {
        kge.a(1748082072);
        f19066a = null;
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        j.a(application);
        imn a2 = imo.d().a(application).a(Constants.screen_density, Constants.screen_height, Constants.screen_width, SystemBarDecorator.getStatusBarHeight(application), TaoApplication.getVersion()).a("tbsearch_preference").a(new n.a() { // from class: com.taobao.search.jarvis.rcmd.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.util.n.a
            public void a(Context context, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("61b6362a", new Object[]{this, context, str});
                } else {
                    Nav.from(context).toUri(str);
                }
            }
        }).a(new nsw()).a();
        a2.c().l().b("XSearchList");
        a2.c().j().a("Xsl.");
        a2.c().j().a(nuf.class);
        a2.c().l().a("https://market.wapa.taobao.com/app/etaowireless/m-search-chitu/chitupanel/index.html");
        a2.c().l().c("http://admin.search.taobao.com/chitu/ChituApiLog/requestUpload");
        a2.c().j().a(com.taobao.search.common.util.n.INSTANCE.i());
        a2.c().j().b(true);
        a2.c().h().b(p.CREATOR);
        a2.c().i().b(o.CREATOR);
        jxp jxpVar = new jxp();
        jxpVar.a(true);
        jxpVar.b(true);
        jxpVar.c(true);
        jxpVar.a(new jyd());
        jxpVar.a(new b());
        a2.c().f(jxpVar);
        jza.a(a2, com.taobao.search.sf.o.a(a2));
        jza.a(a2, new nts());
        f19066a = a2;
        a2.f().a(new com.taobao.search.jarvis.rcmd.cell.a());
        a2.h().a(ListStyle.WATERFALL, XslDegradeCellBean.class, nux.XSL_AUCTION_CREATOR);
        a2.c().h().a(new com.taobao.search.sf.widgets.list.listcell.defaultauction.a(), nux.DEFAULT_AUCTION_CELL_LIST_CREATOR, nux.DEFAULT_AUCTION_CELL_WF_CREATOR);
        a2.c().a(new ise<Void, HandlerThread>() { // from class: com.taobao.search.jarvis.rcmd.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public HandlerThread a(Void r4) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (HandlerThread) ipChange2.ipc$dispatch("16d01ed", new Object[]{this, r4}) : jbg.a("tb-search-thread");
            }
        });
        a2.c().j().a(nue.a());
    }
}
