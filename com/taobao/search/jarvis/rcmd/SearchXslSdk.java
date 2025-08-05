package com.taobao.search.jarvis.rcmd;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslComponent;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.android.searchbaseframe.xsl.refact.XslDataSource;
import com.taobao.android.searchbaseframe.xsl.refact.i;
import com.taobao.android.searchbaseframe.xsl.refact.o;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.xsearchplugin.weex.weex.XSearchUtilModule;
import com.taobao.search.infoflow.SearchChildRecyclerView;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import tb.acg;
import tb.imn;
import tb.ise;
import tb.iuo;
import tb.kge;
import tb.nnd;
import tb.nsw;

/* loaded from: classes7.dex */
public class SearchXslSdk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean INITED = false;
    private static final String LOG_TAG = "SearchXslSdk";

    static {
        kge.a(-860585150);
        INITED = false;
    }

    public static synchronized void install() {
        synchronized (SearchXslSdk.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb164a2", new Object[0]);
            } else if (INITED) {
            } else {
                try {
                    WXSDKEngine.registerComponent("xsearchlist", XslComponent.class);
                    MUSEngine.registerUINode("xsearchlist", XslMUSComponent.class);
                    MUSEngine.registerUINode("mus-xsearchlist", XslMUSComponent.class);
                    XSearchUtilModule.install(new nsw());
                    com.taobao.android.weex_ability.mtop.a.a().a(new d());
                    XslComponent.registerSCore(new XslModule.d() { // from class: com.taobao.search.jarvis.rcmd.SearchXslSdk.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.d
                        public imn a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (imn) ipChange2.ipc$dispatch("f060694", new Object[]{this});
                            }
                            if (a.f19066a == null) {
                                a.a(acg.a());
                            }
                            return a.f19066a;
                        }
                    });
                    XslModule.a(new XslModule.a() { // from class: com.taobao.search.jarvis.rcmd.SearchXslSdk.2
                    });
                    XslModule.a(new XslModule.b() { // from class: com.taobao.search.jarvis.rcmd.SearchXslSdk.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.b
                        public XslDatasource a(XslModule xslModule, imn imnVar, boolean z) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (XslDatasource) ipChange2.ipc$dispatch("64af06ad", new Object[]{this, xslModule, imnVar, new Boolean(z)});
                            }
                            nnd.b();
                            SearchXslDatasource searchXslDatasource = new SearchXslDatasource(imnVar);
                            if (z && xslModule != null) {
                                i iVar = new i();
                                searchXslDatasource.setMetaMode();
                                searchXslDatasource.setController(iVar);
                                iVar.b = searchXslDatasource;
                            }
                            return searchXslDatasource;
                        }

                        @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.b
                        public com.taobao.android.searchbaseframe.xsl.refact.b a(XslModule xslModule, Activity activity, XslDatasource xslDatasource) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (com.taobao.android.searchbaseframe.xsl.refact.b) ipChange2.ipc$dispatch("71ddfd90", new Object[]{this, xslModule, activity, xslDatasource});
                            }
                            if (xslDatasource == null) {
                                throw new IllegalStateException("Datasource is null in onCreatePageWidget");
                            }
                            XslDataSource xslDataSource = (XslDataSource) xslDatasource;
                            i controller = xslDataSource.getController();
                            controller.b = xslDataSource;
                            controller.a(xslModule);
                            c cVar = new c(xslModule.getCore());
                            cVar.a(xslModule.q());
                            if (xslModule.r()) {
                                cVar.j(new ise<Context, PartnerRecyclerView>() { // from class: com.taobao.search.jarvis.rcmd.SearchXslSdk.3.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // tb.ise
                                    public PartnerRecyclerView a(Context context) {
                                        IpChange ipChange3 = $ipChange;
                                        return ipChange3 instanceof IpChange ? (PartnerRecyclerView) ipChange3.ipc$dispatch("bb071198", new Object[]{this, context}) : new SearchChildRecyclerView(context);
                                    }
                                });
                            }
                            o oVar = new o(cVar, activity, xslModule, controller.e(), null, new iuo());
                            oVar.attachToContainer();
                            oVar.a(controller);
                            return oVar;
                        }
                    });
                } catch (WXException e) {
                    k.a(LOG_TAG, "register err", e);
                }
                INITED = true;
            }
        }
    }
}
