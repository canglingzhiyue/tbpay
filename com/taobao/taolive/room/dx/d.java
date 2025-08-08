package com.taobao.taolive.room.dx;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.n;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import java.util.HashMap;
import tb.kge;
import tb.plg;
import tb.pmd;
import tb.poy;

/* loaded from: classes8.dex */
public class d extends com.taobao.android.dinamicx.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVERECOMMENDCARDGOODSACTION = 5833227874115549025L;

    /* renamed from: a  reason: collision with root package name */
    private DXRuntimeContext f21621a;

    static {
        kge.a(1726764559);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr.length <= 0 || !(objArr[0] instanceof String)) {
        } else {
            String str = (String) objArr[0];
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1997629398) {
                if (hashCode == -6661695 && str.equals("goodsCardClicked")) {
                    c = 1;
                }
            } else if (str.equals("bottomButtonClicked")) {
                c = 0;
            }
            if (c != 0) {
                if (c != 1) {
                    return;
                }
                if (objArr[1] instanceof String) {
                    Nav.from(dXRuntimeContext.m()).toUri((String) objArr[1]);
                }
                if (!(objArr[2] instanceof JSONObject)) {
                    return;
                }
                String string = ((JSONObject) objArr[2]).getString("itemId");
                String string2 = ((JSONObject) objArr[2]).getString("type");
                String string3 = ((JSONObject) objArr[2]).getString("eventId");
                HashMap hashMap = new HashMap();
                hashMap.put("itemid", string);
                hashMap.put("type", string2);
                hashMap.put(UserTrackDO.COLUMN_EVENT_ID, string3);
                hashMap.put("spm-cnt", ai.d(n.a()));
                hashMap.put("spm-url", poy.K(n.a()));
                if (pmd.a().e() == null) {
                    return;
                }
                pmd.a().e().a("Page_TaobaoLiveWatch", "carditem", hashMap);
                return;
            }
            this.f21621a = dXRuntimeContext;
            DXRuntimeContext dXRuntimeContext2 = this.f21621a;
            if (dXRuntimeContext2 != null) {
                JSONObject e2 = dXRuntimeContext2.e();
                if (e2 != null && StringUtils.equals(e2.getString("bottomType"), "2")) {
                    Nav.from(dXRuntimeContext.m()).toUri(e2.getString("bottomUrl"));
                } else {
                    a();
                }
            } else {
                a();
            }
            DXRuntimeContext dXRuntimeContext3 = this.f21621a;
            if (dXRuntimeContext3 == null || (e = dXRuntimeContext3.e()) == null) {
                return;
            }
            String string4 = e.getString("bottomType");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("type", string4);
            hashMap2.put("spm-cnt", ai.d(n.a()));
            hashMap2.put("spm-url", poy.K(n.a()));
            if (pmd.a().e() == null) {
                return;
            }
            pmd.a().e().a("Page_TaobaoLiveWatch", "cardbottombtn", hashMap2);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            plg.a().a("com.taobao.taolive.room.recommend.good.card.update", this.f21621a);
        }
    }
}
