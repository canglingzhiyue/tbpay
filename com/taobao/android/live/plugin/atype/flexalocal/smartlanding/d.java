package com.taobao.android.live.plugin.atype.flexalocal.smartlanding;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.trigger.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.taolive.sdk.utils.q;
import tb.kge;

/* loaded from: classes6.dex */
public class d implements ISmartLandingProxy.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ISmartLandingProxy.c f14017a;
    private ImageDialogAction b;

    static {
        kge.a(-1685614666);
        kge.a(-449658670);
    }

    public d(ISmartLandingProxy.c cVar) {
        this.f14017a = cVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.c
    public boolean a(Context context, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ea65000", new Object[]{this, context, str, str2, jSONObject})).booleanValue();
        }
        String str3 = b.f14013a;
        q.b(str3, "SmartLandingActionAdapter: " + str2 + " " + jSONObject.toString());
        if (TextUtils.equals(str2, PopStrategy.IDENTIFIER_POPLAYER)) {
            String string = jSONObject.getString("url");
            if (!TextUtils.isEmpty(string)) {
                g.a(string, jSONObject.toJSONString()).a(new g.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.smartlanding.d.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.poplayer.trigger.g.a
                    public void a(String str4, String str5, String str6) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("929ad046", new Object[]{this, str4, str5, str6});
                        } else {
                            q.b(b.f14013a, "SmartLandingHomeAdapter PopLayerTrigger onDisplayed ");
                        }
                    }

                    @Override // com.alibaba.poplayer.trigger.g.a
                    public void a(String str4, boolean z, boolean z2, String str5, String str6) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e47be646", new Object[]{this, str4, new Boolean(z), new Boolean(z2), str5, str6});
                        } else {
                            q.b(b.f14013a, "SmartLandingHomeAdapter PopLayerTrigger onClosed ");
                        }
                    }

                    @Override // com.alibaba.poplayer.trigger.g.a
                    public void a(String str4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str4});
                        } else {
                            q.b(b.f14013a, "SmartLandingHomeAdapter PopLayerTrigger onTriggerFailed ");
                        }
                    }
                }).a();
            }
            return true;
        } else if (TextUtils.equals(str2, "imagePop")) {
            this.b = new ImageDialogAction(context, jSONObject);
            this.b.a();
            return true;
        } else {
            ISmartLandingProxy.c cVar = this.f14017a;
            if (cVar == null) {
                return false;
            }
            return cVar.a(context, str, str2, jSONObject);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ISmartLandingProxy.c cVar = this.f14017a;
        if (cVar != null) {
            cVar.a();
        }
        ImageDialogAction imageDialogAction = this.b;
        if (imageDialogAction == null) {
            return;
        }
        imageDialogAction.b();
    }
}
