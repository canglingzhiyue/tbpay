package com.taobao.themis.ability_taobao;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSEBizBridge$favorShop$2 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ApiContext $apiContext;
    public final /* synthetic */ BridgeCallback $bridgeCallback;
    public final /* synthetic */ f $instance;
    public final /* synthetic */ String $sellerId;
    public final /* synthetic */ TMSEBizBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSEBizBridge$favorShop$2(TMSEBizBridge tMSEBizBridge, ApiContext apiContext, String str, f fVar, BridgeCallback bridgeCallback) {
        super(0);
        this.this$0 = tMSEBizBridge;
        this.$apiContext = apiContext;
        this.$sellerId = str;
        this.$instance = fVar;
        this.$bridgeCallback = bridgeCallback;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            new AlertDialog.Builder(this.$apiContext.a()).setMessage("是否订阅该店铺？").setPositiveButton("同意", new DialogInterface.OnClickListener() { // from class: com.taobao.themis.ability_taobao.TMSEBizBridge$favorShop$2.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        TMSEBizBridge.access$favorOrUnFavorShop(TMSEBizBridge$favorShop$2.this.this$0, true, TMSEBizBridge$favorShop$2.this.$sellerId, TMSEBizBridge$favorShop$2.this.$instance, TMSEBizBridge$favorShop$2.this.$bridgeCallback);
                    }
                }
            }).setNegativeButton("拒绝", new DialogInterface.OnClickListener() { // from class: com.taobao.themis.ability_taobao.TMSEBizBridge$favorShop$2.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        TMSEBizBridge$favorShop$2.this.$bridgeCallback.sendBridgeResponse(BridgeResponse.newError(11, "用户拒绝"));
                    }
                }
            }).create().show();
        }
    }
}
