package com.taobao.mytaobao.pagev2.dataservice;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.tao.log.TLog;
import com.taobao.themis.kernel.i;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.rul;
import tb.ruw;
import tb.xnq;
import tb.xns;
import tb.xnu;
import tb.xol;
import tb.xon;
import tb.xoo;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007J\n\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0007J\n\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0007J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0007J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0007J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0007J@\u0010\u0019\u001a\u00020\t26\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\t0\u001bH\u0007JF\u0010\u001e\u001a\u00020\t2<\u0010\u001f\u001a8\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00100 ¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\t0\u001bH\u0007JL\u0010\"\u001a\u00020\t2B\u0010#\u001a>\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020%0$¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\t0\u001bH\u0007J-\u0010'\u001a\u00020\t2#\u0010(\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\t0\u0004H\u0007JF\u0010*\u001a\u00020\t2<\u0010+\u001a8\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020%0 ¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\t0\u001bH\u0007J+\u0010-\u001a\u00020\t2!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0007J\u0010\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u0010H\u0007J\b\u00100\u001a\u00020\tH\u0007J\b\u00101\u001a\u00020\tH\u0007J\b\u00102\u001a\u00020\tH\u0007J\b\u00103\u001a\u00020\tH\u0007J\u0010\u00104\u001a\u00020\t2\u0006\u00105\u001a\u000206H\u0007J\b\u00107\u001a\u00020\tH\u0002R+\u0010\u0003\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/taobao/mytaobao/pagev2/dataservice/MtbDataServiceFacade;", "", "()V", "fullDataChangeListener", "Lkotlin/Function1;", "Lcom/taobao/mytaobao/dataservice/model/Reason;", "Lkotlin/ParameterName;", "name", "reason", "", "localHomePageVO", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbHomePageVO;", "mtbHomePageVO", "voConvert", "Lcom/taobao/mytaobao/pagev2/dataservice/utils/HomePageDataConvert;", "getCustomerServiceTxt", "", "getCustomerServiceUrl", "getLocalData", "getPageData", "getSettingButtonTxt", "getSettingButtonUrl", "getUserNick", "is88Vip", "", "listenGlobalDataChange", "globalChangeListener", "Lkotlin/Function2;", "Lcom/alibaba/fastjson/JSONObject;", "global", "listenLayoutChange", "layoutChangeListener", "", "moduleNameList", "listenPageDataChange", "dataChangeListener", "", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", "changeMap", "listenRefreshFailed", "refreshFailedListener", "errorMsg", "listenTemplateChange", "templateChangeListener", g.KEY_TEMPLATE_LIST, "listenerFullDataChange", "login", "userId", Baggage.Amnet.USER_O, "markNeedRefresh", Constant.KEY_PAGEBACK, "pageOut", "refreshPageData", i.CDN_REQUEST_TYPE, "", DMComponent.RESET, "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final xoo f18460a;
    private static xon b;
    private static xon c;
    private static rul<? super xnq, t> d;

    static {
        kge.a(1383109360);
        INSTANCE = new a();
        f18460a = new xoo();
    }

    private a() {
    }

    public static final /* synthetic */ void a(a aVar, xon xonVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd22015", new Object[]{aVar, xonVar});
        } else {
            b = xonVar;
        }
    }

    public static final /* synthetic */ void b(a aVar, xon xonVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67267556", new Object[]{aVar, xonVar});
        } else {
            c = xonVar;
        }
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        xns a2 = xnu.Companion.a();
        if (a2 == null) {
            return;
        }
        a2.i();
    }

    @JvmStatic
    public static final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        xns a2 = xnu.Companion.a();
        if (a2 == null) {
            q.a();
        }
        return a2.a();
    }

    @JvmStatic
    public static final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        xns a2 = xnu.Companion.a();
        if (a2 == null) {
            q.a();
        }
        return a2.b();
    }

    @JvmStatic
    public static final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        xns a2 = xnu.Companion.a();
        if (a2 == null) {
            q.a();
        }
        return a2.c();
    }

    @JvmStatic
    public static final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        xns a2 = xnu.Companion.a();
        if (a2 == null) {
            q.a();
        }
        return a2.d();
    }

    @JvmStatic
    public static final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        xns a2 = xnu.Companion.a();
        if (a2 == null) {
            q.a();
        }
        return a2.e();
    }

    @JvmStatic
    public static final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        xns a2 = xnu.Companion.a();
        if (a2 == null) {
            q.a();
        }
        return a2.f();
    }

    @JvmStatic
    public static final xon h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xon) ipChange.ipc$dispatch("44e86540", new Object[0]) : b;
    }

    @JvmStatic
    public static final xon i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xon) ipChange.ipc$dispatch("4c9a0a9f", new Object[0]);
        }
        xns a2 = xnu.Companion.a();
        if (a2 != null) {
            a2.g();
        }
        return c;
    }

    @JvmStatic
    public static final void a(ruw<? super xnq, ? super Map<String, xol>, t> dataChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc53bc4", new Object[]{dataChangeListener});
            return;
        }
        q.c(dataChangeListener, "dataChangeListener");
        xns a2 = xnu.Companion.a();
        if (a2 == null) {
            q.a();
        }
        a2.a(new MtbDataServiceFacade$listenPageDataChange$1(dataChangeListener));
    }

    @JvmStatic
    public static final void b(ruw<? super xnq, ? super List<xol>, t> templateChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec484245", new Object[]{templateChangeListener});
            return;
        }
        q.c(templateChangeListener, "templateChangeListener");
        xns a2 = xnu.Companion.a();
        if (a2 == null) {
            q.a();
        }
        a2.b(new MtbDataServiceFacade$listenTemplateChange$1(templateChangeListener));
    }

    @JvmStatic
    public static final void c(ruw<? super xnq, ? super List<String>, t> layoutChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dacb48c6", new Object[]{layoutChangeListener});
            return;
        }
        q.c(layoutChangeListener, "layoutChangeListener");
        xns a2 = xnu.Companion.a();
        if (a2 == null) {
            q.a();
        }
        a2.c(new MtbDataServiceFacade$listenLayoutChange$1(layoutChangeListener));
    }

    @JvmStatic
    public static final void d(ruw<? super xnq, ? super JSONObject, t> globalChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c94e4f47", new Object[]{globalChangeListener});
            return;
        }
        q.c(globalChangeListener, "globalChangeListener");
        xns a2 = xnu.Companion.a();
        if (a2 == null) {
            q.a();
        }
        a2.a(new MtbDataServiceFacade$listenGlobalDataChange$1(globalChangeListener));
    }

    @JvmStatic
    public static final void a(rul<? super String, t> refreshFailedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc03baf", new Object[]{refreshFailedListener});
            return;
        }
        q.c(refreshFailedListener, "refreshFailedListener");
        xns a2 = xnu.Companion.a();
        if (a2 == null) {
            q.a();
        }
        a2.a(new MtbDataServiceFacade$listenRefreshFailed$1(refreshFailedListener));
    }

    @JvmStatic
    public static final void b(rul<? super xnq, t> fullDataChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec434230", new Object[]{fullDataChangeListener});
            return;
        }
        q.c(fullDataChangeListener, "fullDataChangeListener");
        d = fullDataChangeListener;
    }

    @JvmStatic
    public static final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
            return;
        }
        xns a2 = xnu.Companion.a();
        if (a2 == null) {
            return;
        }
        a2.a(i);
    }

    @JvmStatic
    public static final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[0]);
            return;
        }
        xns a2 = xnu.Companion.a();
        if (a2 == null) {
            return;
        }
        a2.h();
    }

    @JvmStatic
    public static final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[0]);
        } else {
            xnu.Companion.a();
        }
    }

    @JvmStatic
    public static final void a(String userId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{userId});
            return;
        }
        q.c(userId, "userId");
        TLog.loge("mtbMainLink", "login,数据层创建");
        if (!xnu.Companion.a(userId)) {
            return;
        }
        xns a2 = xnu.Companion.a();
        if (a2 == null) {
            q.a();
        }
        a2.d(MtbDataServiceFacade$login$1.INSTANCE);
    }

    @JvmStatic
    public static final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[0]);
            return;
        }
        xnu.Companion.b();
        INSTANCE.m();
    }

    private final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        b = null;
        d = null;
    }
}
