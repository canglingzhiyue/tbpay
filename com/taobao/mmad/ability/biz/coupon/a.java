package com.taobao.mmad.ability.biz.coupon;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.utils.Global;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.kge;
import tb.stv;
import tb.tit;
import tb.tjn;
import tb.tjo;

/* loaded from: classes7.dex */
public class a extends tit<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<RemoteBusiness> c = new ArrayList();

    static {
        kge.a(542969568);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.tit
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "claimedCoupon";
    }

    public static /* synthetic */ List a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("adb3be02", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ void a(a aVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac90482a", new Object[]{aVar, mtopResponse});
        } else {
            aVar.a(mtopResponse);
        }
    }

    @Override // tb.tit
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("729dea04", new Object[]{this, bVar});
        } else if (bVar == null) {
            stv.a("ReceiveCouponEvent", "data null");
        } else {
            CouponApplyRequest couponApplyRequest = new CouponApplyRequest();
            couponApplyRequest.benefitSupplier = bVar.e;
            couponApplyRequest.benefitId = bVar.b;
            couponApplyRequest.benefitQuerySource = bVar.c;
            couponApplyRequest.benefitSource = bVar.d;
            couponApplyRequest.asac = bVar.g;
            couponApplyRequest.benefitStrategyCode = bVar.f;
            couponApplyRequest.benefitType = bVar.f18101a;
            final RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) couponApplyRequest);
            build.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.mmad.ability.biz.coupon.ReceiveCouponEvent$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    a.a(a.this).remove(build);
                    a.a(a.this, mtopResponse);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    a.a(a.this).remove(build);
                    a.a(a.this, mtopResponse);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    a.a(a.this).remove(build);
                    a.a(a.this, mtopResponse);
                }
            });
            build.startRequest();
            this.c.add(build);
        }
    }

    private void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            return;
        }
        try {
            if (Global.getApplication() == null) {
                return;
            }
            if (mtopResponse == null) {
                b("UNKNOWN_ERROR", "领券失败: response_null");
                tjn.a("抱歉，优惠券已领光");
            } else if ("ANDROID_SYS_LOGIN_CANCEL".equals(mtopResponse.getRetCode())) {
                stv.a("ReceiveCouponEvent", "ANDROID_SYS_LOGIN_CANCEL");
                b(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
            } else {
                JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                if (dataJsonObject == null) {
                    b("UNKNOWN_ERROR", "领券失败: data_null");
                    tjn.a("抱歉，优惠券已领光");
                    return;
                }
                String optString = dataJsonObject.optString("failure");
                if (mtopResponse.isApiSuccess() && !StringUtils.isEmpty(optString) && "false".equals(optString)) {
                    b();
                    tjn.a("已领取优惠券 可在我的卡券包查看");
                } else if ("FAIL_BIZ_ACTIVITY_APPLY_PERSON_COUNT_EXCEED".equals(mtopResponse.getRetCode())) {
                    b(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                    tjn.a("抱歉，已领券");
                } else {
                    b(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                    tjn.a("抱歉，优惠券已领光");
                }
            }
        } catch (Exception e) {
            stv.a("ReceiveCouponEvent", "handleReceiveError", e);
            tjn.a("抱歉，优惠券已领光");
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            stv.a("ReceiveCouponEvent", "领券成功");
            tjo.a(1, "", "", this.b.d().b());
            a((com.alibaba.fastjson.JSONObject) null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        try {
            stv.a("ReceiveCouponEvent", "领券失败：retCode=" + str + ";retMsg=" + str2);
            tjo.a(0, str, str2, this.b.d().b());
            a(str, str2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
