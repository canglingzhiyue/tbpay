package com.taobao.bootimage.interact.presenter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.h;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.interact.view.BootImageInteractBaseView;
import java.util.HashMap;
import java.util.Map;
import tb.kej;
import tb.ken;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends b implements MSOAServiceListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BootImageInteractBaseView d;
    private boolean e;
    private final String f;

    static {
        kge.a(1915490495);
        kge.a(-2103982869);
    }

    public a(Context context, BootImageInfo bootImageInfo, BootImageInteractBaseView bootImageInteractBaseView) {
        super(context, bootImageInfo);
        this.f = "splashInteract";
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
                kej.a("BootImageInteractAddCartPresenter", "addCart mBootImageInfo == null");
                return;
            }
            kej.a("BootImageInteractAddCartPresenter", "addCart加购请求开始 mBootImageInfo == " + this.b);
            if (this.e) {
                kej.a("BootImageInteractAddCartPresenter", "加购请求中");
                return;
            }
            HashMap hashMap = new HashMap(3);
            hashMap.put("itemId", this.b.cardItemId);
            hashMap.put("showSku", false);
            hashMap.put("skuId", this.b.cardSkuId);
            com.taobao.android.msoa.c.a().a(new h("msoa.taobao.cart.open", "msoa.taobao.cart.open.add", "1.0", "splashInteract", hashMap), this);
            this.e = true;
        } catch (Throwable th) {
            kej.a("BootImageInteractAddCartPresenter", "addCart加购请求errro");
            th.printStackTrace();
        }
    }

    @Override // com.taobao.android.msoa.callback.MSOAServiceListener
    public void onSuccess(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            return;
        }
        try {
            kej.a("BootImageInteractAddCartPresenter", "addCart msoaServiceListener onSuccess");
            this.e = false;
            if (!c() && this.d != null) {
                this.d.stopInteract();
            }
            a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.android.msoa.callback.MSOAServiceListener
    public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
            return;
        }
        try {
            kej.a("BootImageInteractAddCartPresenter", "addCart msoaServiceListener onFail s= " + str + " s1=" + str2 + " b=" + z);
            a(str, str2);
            this.e = false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            kej.a("BootImageInteractAddCartPresenter", "互动加购成功");
            com.taobao.bootimage.linked.h.b("").a(9, this.b.isColdStart);
            ken.b(1, "", "", this.b);
        } catch (Throwable th) {
            kej.a("BootImageInteractAddCartPresenter", "BootImagePopMamaCommercialView. commitSuccess .error", th);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            kej.a("BootImageInteractAddCartPresenter", "互动加购失败：retCode=" + str + ";retMsg=" + str2);
            ken.b(0, str, str2, this.b);
            com.taobao.bootimage.linked.h.b("").a(10, this.b.isColdStart);
        } catch (Throwable th) {
            kej.a("BootImageInteractAddCartPresenter", "BootImagePopMamaCommercialView. commitFail .error", th);
        }
    }
}
