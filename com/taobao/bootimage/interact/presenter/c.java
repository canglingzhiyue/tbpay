package com.taobao.bootimage.interact.presenter;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageCouponApplyRequest;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.interact.view.BootImageInteractBaseView;
import com.taobao.bootimage.linked.h;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.kej;
import tb.ken;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BootImageInteractBaseView d;
    private boolean e;

    static {
        kge.a(-144947798);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(c cVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe014222", new Object[]{cVar, mtopResponse});
        } else {
            cVar.a(mtopResponse);
        }
    }

    public c(Context context, BootImageInfo bootImageInfo, BootImageInteractBaseView bootImageInteractBaseView) {
        super(context, bootImageInfo);
        this.d = bootImageInteractBaseView;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (this.b == null) {
                kej.a("BootImageInteractCouponPresenter", "receiveCoupon mBootImageInfo == null");
                return;
            }
            kej.a("BootImageInteractCouponPresenter", "receiveCoupon领券接口请求 mBootImageInfo == " + this.b);
            if (this.e) {
                kej.a("BootImageInteractCouponPresenter", "领取优惠券请求中");
                return;
            }
            BootImageCouponApplyRequest bootImageCouponApplyRequest = new BootImageCouponApplyRequest();
            bootImageCouponApplyRequest.benefitSupplier = this.b.benefitSupplier;
            bootImageCouponApplyRequest.benefitId = this.b.benefitId;
            bootImageCouponApplyRequest.benefitQuerySource = this.b.benefitQuerySource;
            bootImageCouponApplyRequest.benefitSource = this.b.benefitSource;
            bootImageCouponApplyRequest.asac = this.b.benefitSafeCode;
            bootImageCouponApplyRequest.benefitStrategyCode = this.b.benefitStrategyCode;
            bootImageCouponApplyRequest.benefitType = this.b.benefitType;
            RemoteBusiness.build((IMTOPDataObject) bootImageCouponApplyRequest).registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.bootimage.interact.presenter.BootImageInteractCouponPresenter$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        c.a(c.this, mtopResponse);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else {
                        c.a(c.this, mtopResponse);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        c.a(c.this, mtopResponse);
                    }
                }
            }).startRequest();
            this.e = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            return;
        }
        try {
            this.e = false;
            if (this.f16703a == null) {
                return;
            }
            if (mtopResponse == null) {
                a("UNKNOWN_ERROR", "领券失败: response_null");
                Toast.makeText(this.f16703a, com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_17003), 0).show();
            } else if ("ANDROID_SYS_LOGIN_CANCEL".equals(mtopResponse.getRetCode())) {
                kej.a("BootImageInteractCouponPresenter", "ANDROID_SYS_LOGIN_CANCEL");
                a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
            } else {
                JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                if (dataJsonObject == null) {
                    a("UNKNOWN_ERROR", "领券失败: data_null");
                    Toast.makeText(this.f16703a, com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_17003), 0).show();
                    return;
                }
                String optString = dataJsonObject.optString("failure");
                if (mtopResponse.isApiSuccess() && !TextUtils.isEmpty(optString) && "false".equals(optString)) {
                    a();
                    Toast.makeText(this.f16703a, com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_17006), 0).show();
                    if (c() || this.d == null) {
                        return;
                    }
                    this.d.stopInteract();
                    this.d.switchToReceived();
                } else if ("FAIL_BIZ_ACTIVITY_APPLY_PERSON_COUNT_EXCEED".equals(mtopResponse.getRetCode())) {
                    a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                    Toast.makeText(this.f16703a, com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_17004), 0).show();
                    if (c() || this.d == null) {
                        return;
                    }
                    this.d.stopInteract();
                    this.d.switchToReceived();
                } else {
                    a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                    Toast.makeText(this.f16703a, com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_17003), 0).show();
                }
            }
        } catch (Exception e) {
            kej.a("BootImageInteractCouponPresenter", "handleReceiveError:" + e.getMessage());
            Toast.makeText(this.f16703a, com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_17003), 0).show();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            kej.a("BootImageInteractCouponPresenter", "领券成功");
            ken.a(1, "", "", this.b);
            h.b("").a(9, this.b.isColdStart);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            kej.a("BootImageInteractCouponPresenter", "领券失败：retCode=" + str + ";retMsg=" + str2);
            ken.a(0, str, str2, this.b);
            h.b("").a(10, this.b.isColdStart);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
