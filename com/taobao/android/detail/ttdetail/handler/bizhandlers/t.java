package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.request.callback.RedPacketRequestCallback;
import com.taobao.android.detail.ttdetail.request.params.RedPacketRequestParams;
import tb.eyx;
import tb.ezm;
import tb.kge;
import tb.snx;

/* loaded from: classes5.dex */
public class t implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openRedPacket";

    /* renamed from: a  reason: collision with root package name */
    private FragmentActivity f10724a;
    private eyx b;

    static {
        kge.a(855380738);
        kge.a(1967244270);
    }

    public t(Context context, eyx eyxVar) {
        if (context instanceof FragmentActivity) {
            this.f10724a = (FragmentActivity) context;
        }
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        if (!com.taobao.android.detail.ttdetail.utils.ao.c()) {
            com.taobao.android.detail.ttdetail.utils.ao.a(true);
            return true;
        }
        RedPacketRequestParams redPacketRequestParams = new RedPacketRequestParams(aVar.b());
        snx snxVar = new snx(redPacketRequestParams);
        snxVar.a(new RedPacketRequestCallback(this.f10724a, redPacketRequestParams));
        snxVar.k();
        return true;
    }
}
