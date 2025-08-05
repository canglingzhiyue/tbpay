package tb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.core.address.c;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.MtopResponse;
import tb.iff;

@AURAExtensionImpl(code = "tbbuy.impl.aspect.error.build")
/* loaded from: classes6.dex */
public final class idg extends idc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1944162599);
    }

    public static /* synthetic */ Object ipc$super(idg idgVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.aro
    public void a(b bVar) {
        String str;
        duj d;
        String retMsg;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            return;
        }
        bVar.a();
        if (!"AURANextRPCServiceDomain".equals(bVar.f())) {
            return;
        }
        String str2 = null;
        a aVar = (a) bbc.a(bVar.c(), "NextRPCRemoteResponse", a.class, null);
        if (aVar == null) {
            arc.a().c("TBBuyBuildOrderErrorExtension", "onError", "remoteResponse is null");
        } else if (dss.a(b(), aVar)) {
        } else {
            String a2 = aVar.a();
            String b = aVar.b();
            MtopResponse g = aVar.g();
            int i = 200;
            if (g != null) {
                i = g.getResponseCode();
                str2 = g.getMappingCode();
                if (g.isNetworkError()) {
                    retMsg = com.taobao.android.purchase.core.a.NETWORK_ERROR_MSG;
                } else if (g.isApiLockedResult()) {
                    retMsg = com.taobao.android.purchase.core.b.BUILD_DATA_PARSE_ERROR_MSG_NEW;
                } else {
                    retMsg = g.getRetMsg();
                }
                str = retMsg;
            } else {
                str = b;
            }
            duk dukVar = (duk) b().a("aliBuyRequestHelper", duk.class);
            if (dukVar == null) {
                d = new duj(new HashMap());
            } else {
                d = dukVar.d();
            }
            if (d == null) {
                d = new duj(new HashMap());
                a().a(new b(1, idc.ERROR_DOMAIN, "emptyQueryKey", "queryKey为空"));
            }
            Context e = b().e();
            if ("F-10000-00-15-002".equals(a2)) {
                return;
            }
            if ("FAIL_SYS_SESSION_EXPIRED".equals(a2)) {
                fke.a(e);
            } else if (com.taobao.android.purchase.core.b.NEW_NO_ADDRESS_ERROR_CODE.equals(a2) || com.taobao.android.purchase.core.b.NO_ADDRESS_RET_CODE.equals(a2)) {
                b = c.TO_SET_ADDRESS_ERROR_MSG;
                com.taobao.android.purchase.core.address.a.a(e, str);
            } else if (com.taobao.android.purchase.core.b.MTOP_BIZ_USER_ADDRESS_IS_NOT_FULL.equals(a2)) {
                b = com.taobao.android.purchase.core.b.NORMAL_WARNING_TITLE;
                a(e, str, !TextUtils.isEmpty(str2) ? str2 : a2, d);
            } else if (com.taobao.android.purchase.core.b.MTOP_BIZ_USER_ADDRESS_IS_FULL.equals(a2)) {
                b = com.taobao.android.purchase.core.b.NORMAL_WARNING_TITLE;
                b(e, str, !TextUtils.isEmpty(str2) ? str2 : a2, d);
            } else if (i == 419) {
                b = com.taobao.android.purchase.core.b.BUILD_ORDER_WARNING_TITLE_NEW;
                fke.a(e);
            } else {
                String str3 = TextUtils.isEmpty(str2) ? a2 : str2;
                String str4 = com.taobao.android.purchase.core.b.BUILD_ORDER_WARNING_TITLE_NEW;
                boolean e2 = e();
                if (e2) {
                    d();
                }
                a(e, g, str4, str3, str, e2, true);
                b = str4;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = a2;
            }
            com.taobao.android.purchase.core.utils.c.a(str2, b);
            a().a(new b(1, idc.ERROR_DOMAIN, a2, b));
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.alibaba.android.umf.node.service.parse.state.b bVar = (com.alibaba.android.umf.node.service.parse.state.b) c().get("aura_parse_global_data_parse", com.alibaba.android.umf.node.service.parse.state.b.class);
        if (bVar == null) {
            return;
        }
        com.alibaba.android.umf.node.service.parse.state.a b = bVar.b();
        bVar.b(com.alibaba.android.umf.node.service.parse.state.a.a("generalV2", b.j(), b.i(), b.e(), b.d(), b.f(), b.g(), b.h()));
        c().update("aura_parse_global_data_parse", bVar);
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        AtomicBoolean atomicBoolean = (AtomicBoolean) b().a("aliBuyPreload", AtomicBoolean.class);
        return atomicBoolean != null && atomicBoolean.get();
    }

    private void a(final Context context, String str, String str2, final duj dujVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e652b4b", new Object[]{this, context, str, str2, dujVar});
            return;
        }
        iff iffVar = new iff(context);
        iffVar.a(com.taobao.android.purchase.core.b.NORMAL_WARNING_TITLE);
        iffVar.b(str);
        iffVar.e(str2);
        iffVar.a(new iff.a() { // from class: tb.idg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iff.a
            public void a(iff iffVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ed8e834f", new Object[]{this, iffVar2});
                    return;
                }
                iffVar2.b();
                fke.a(context);
            }
        });
        iffVar.a(new iff.b() { // from class: tb.idg.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iff.b
            public void a(iff iffVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ed8e834f", new Object[]{this, iffVar2});
                    return;
                }
                iffVar2.b();
                if (context == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                try {
                    bundle.putDouble(com.taobao.android.purchase.core.b.ACTIVITY_ADD_ADDRESS_AUTO_FILL_LAT, Double.parseDouble(dujVar.i()));
                    bundle.putDouble(com.taobao.android.purchase.core.b.ACTIVITY_ADD_ADDRESS_AUTO_FILL_LON, Double.parseDouble(dujVar.h()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                bundle.putString(com.taobao.android.purchase.core.b.ACTIVITY_ADD_ADDRESS_AUTO_FILL_POI_ID, dujVar.k());
                bundle.putBoolean(com.taobao.android.purchase.core.b.ACTIVITY_ADD_ADDRESS_AUTO_FILL, true);
                com.taobao.android.purchase.core.address.a.a(context, bundle, 71);
            }
        });
        iffVar.a();
    }

    private void b(final Context context, String str, String str2, final duj dujVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d6246a", new Object[]{this, context, str, str2, dujVar});
            return;
        }
        iff iffVar = new iff(context);
        iffVar.a(com.taobao.android.purchase.core.b.NORMAL_WARNING_TITLE);
        iffVar.b(str);
        iffVar.e(str2);
        iffVar.a(new iff.a() { // from class: tb.idg.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iff.a
            public void a(iff iffVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ed8e834f", new Object[]{this, iffVar2});
                    return;
                }
                iffVar2.b();
                fke.a(context);
            }
        });
        iffVar.a(new iff.b() { // from class: tb.idg.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iff.b
            public void a(iff iffVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ed8e834f", new Object[]{this, iffVar2});
                    return;
                }
                iffVar2.b();
                if (context == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(dujVar.j())) {
                    bundle.putString(com.taobao.android.purchase.core.b.ACTIVITY_DEFAULT_ADDRESS_ID_KEY, dujVar.j());
                }
                if ("BIANLI".equals(dujVar.m())) {
                    bundle.putInt(com.taobao.android.purchase.core.b.ACTIVITY_KEY_BIZ_TYPE, 2);
                }
                if ("D2D".equals(dujVar.m())) {
                    bundle.putInt(com.taobao.android.purchase.core.b.ACTIVITY_KEY_BIZ_TYPE, 0);
                }
                if (dujVar.o()) {
                    bundle.putInt(com.taobao.android.purchase.core.b.ACTIVITY_KEY_BIZ_TYPE, dujVar.n());
                }
                if (!TextUtils.isEmpty(dujVar.l())) {
                    bundle.putString(com.taobao.android.purchase.core.b.ACTIVITY_MANAGER_ADDRESS_STORE_ID, dujVar.l());
                }
                if (!TextUtils.isEmpty(dujVar.j())) {
                    bundle.putString(com.taobao.android.purchase.core.b.ACTIVITY_DEFAULT_ADDRESS_ID_KEY, dujVar.j());
                }
                com.taobao.android.purchase.core.address.a.a(context, bundle, 54);
            }
        });
        iffVar.a();
    }
}
