package com.taobao.mmad.render.dx.event;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.mmad.data.BaseMmAdModel;
import tb.kge;
import tb.stv;
import tb.tiq;
import tb.tiu;
import tb.tiv;
import tb.tja;
import tb.tjl;
import tb.tjo;

/* loaded from: classes7.dex */
public class a extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_MMTAP = 18615516725124L;

    /* renamed from: a  reason: collision with root package name */
    private tiq f18120a;
    private tiu b = new tiu() { // from class: com.taobao.mmad.render.dx.event.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.tiu
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            tjl.a(a.a(a.this).d().b(), true, a.a(a.this).c());
            a.a(a.this).g().b().a(true);
        }

        @Override // tb.tiu
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            tjl.a(a.a(a.this).d().b(), false, a.a(a.this).c());
            a.a(a.this).g().b().a(true);
        }
    };

    static {
        kge.a(-2142928721);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ tiq a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tiq) ipChange.ipc$dispatch("55f4e462", new Object[]{aVar}) : aVar.f18120a;
    }

    public a(tiq tiqVar) {
        this.f18120a = tiqVar;
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        String obj = (objArr == null || objArr.length <= 0) ? "" : objArr[0].toString();
        String obj2 = (objArr == null || objArr.length <= 1) ? "" : objArr[1].toString();
        stv.a("DXMmTapEventHandler", "handleEvent eventName: " + obj);
        BaseMmAdModel b = this.f18120a.d().b();
        if (dXEvent instanceof DXSwipeInteractEvent) {
            DXSwipeInteractEvent dXSwipeInteractEvent = (DXSwipeInteractEvent) dXEvent;
            stv.a("DXMmTapEventHandler", "handleEvent DXSwipeInteractEvent=" + dXSwipeInteractEvent);
            com.taobao.bootimage.linked.h.b("").a(dXSwipeInteractEvent.isTriggerInteractSuccess() ? 8 : 11, this.f18120a.c());
            tjo.a(dXSwipeInteractEvent.getDistance(), dXSwipeInteractEvent.getAngle(), dXSwipeInteractEvent.getValidSlideDistance(), b);
            if (!dXSwipeInteractEvent.isTriggerInteractSuccess()) {
                return;
            }
        } else {
            stv.a("DXMmTapEventHandler", "handleEvent default click event.");
            com.taobao.bootimage.linked.h.b("").a(7, this.f18120a.c());
            tjo.a(b);
        }
        char c = 65535;
        switch (obj.hashCode()) {
            case -414047463:
                if (obj.equals("commonActionEvent")) {
                    c = 3;
                    break;
                }
                break;
            case 23457852:
                if (obj.equals("addToCart")) {
                    c = 1;
                    break;
                }
                break;
            case 1475693025:
                if (obj.equals("claimedCoupon")) {
                    c = 2;
                    break;
                }
                break;
            case 1980299888:
                if (obj.equals("jumpNextPage")) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            tiv e = this.f18120a.e();
            if (TextUtils.isEmpty(obj2)) {
                obj2 = b.getTargetUrl();
            }
            e.a(obj, tiv.a(obj2, this.b));
        } else if (c == 1) {
            this.f18120a.e().a(obj, tiv.a(new tja(b), this.b));
        } else if (c == 2) {
            this.f18120a.e().a(obj, tiv.a(new com.taobao.mmad.ability.biz.coupon.b(b), this.b));
        } else if (c == 3) {
            this.f18120a.e().a(obj, tiv.a(b.actionResponse, this.b));
        } else {
            stv.a("DXMmTapEventHandler", "handleEvent not support event: " + obj);
        }
        if (this.f18120a.g() == null || this.f18120a.g().b() == null) {
            return;
        }
        this.f18120a.g().b().b(true);
    }
}
