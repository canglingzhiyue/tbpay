package com.taobao.bootimage.interact.pop;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import java.util.HashMap;
import tb.kej;
import tb.ken;
import tb.ket;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends com.taobao.bootimage.interact.presenter.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject d;

    static {
        kge.a(-1383952570);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public c(Context context, BootImageInfo bootImageInfo, JSONObject jSONObject) {
        super(context, bootImageInfo, null);
        this.d = jSONObject;
    }

    @Override // com.taobao.bootimage.interact.presenter.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            kej.a("BootImagePopInteractCouponPresenter", "互动领券成功");
            ken.c(1, "", "", this.b);
            a(14, this.d);
        } catch (Throwable th) {
            kej.a("BootImagePopInteractCouponPresenter", "BootImagePopMamaCommercialView. commitSuccess .error", th);
        }
    }

    @Override // com.taobao.bootimage.interact.presenter.c
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            kej.a("BootImagePopInteractCouponPresenter", "互动失败：retCode=" + str + ";retMsg=" + str2);
            ken.c(0, str, str2, this.b);
            a(15, this.d);
        } catch (Throwable th) {
            kej.a("BootImagePopInteractCouponPresenter", "BootImagePopMamaCommercialView. commitFail .error", th);
        }
    }

    private void a(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e86c6b5", new Object[]{this, new Integer(i), jSONObject});
        } else if (jSONObject == null) {
        } else {
            try {
                kej.a("BootImagePopInteractCouponPresenter", "interactEnd 上报监听埋点");
                ket.a(jSONObject);
                HashMap hashMap = new HashMap();
                hashMap.put("__INTERACT_TYPE__", String.valueOf(i));
                com.taobao.bootimage.linked.ext.b.a(jSONObject, this.b.isColdStart, hashMap);
            } catch (Throwable th) {
                kej.a("BootImagePopInteractCouponPresenter", "BootImagePopMamaCommercialView. interactEndFail .error", th);
            }
        }
    }
}
