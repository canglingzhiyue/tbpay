package com.taobao.android.detail.wrapper.aura.event;

import android.content.Context;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.android.detail.wrapper.ext.component.actionbar.TaoDetailActionBarV3;
import java.util.ArrayList;
import tb.arc;
import tb.arv;
import tb.emu;
import tb.enz;
import tb.epw;
import tb.epy;
import tb.fdf;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.event.openRate")
/* loaded from: classes5.dex */
public final class b extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openRate";

    static {
        kge.a(1620913563);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "openRate";
    }

    public b() {
        emu.a("com.taobao.android.detail.wrapper.aura.event.AliDetailOpenRateEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        JSONArray jSONArray;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        Object[] e = aURAEventIO.getEventModel().e();
        enz enzVar = null;
        if (e == null || e.length < 2) {
            jSONArray = null;
            obj = null;
        } else {
            obj = e[1];
            jSONArray = (e.length < 3 || !(e[2] instanceof JSONArray)) ? null : (JSONArray) e[2];
        }
        if (obj != null) {
            try {
                JSONObject parseObject = JSON.parseObject(JSON.toJSONString(obj));
                if (parseObject != null) {
                    enzVar = new enz(new RateNode.RateKeyword(parseObject), a(jSONArray));
                }
            } catch (Exception e2) {
                arc.a().c("AliDetailOpenRateEvent", "innerHandleEvent", e2.toString());
            }
        }
        JSONObject c = aURAEventIO.getEventModel().c();
        if (enzVar == null) {
            enzVar = new enz(c);
        } else {
            enz.a(enzVar, c);
        }
        Context e3 = b().e();
        if (!(e3 instanceof DetailCoreActivity)) {
            return;
        }
        a(e3, aURAEventIO);
        new fdf((DetailCoreActivity) e3).a(enzVar);
    }

    private void a(Context context, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a396cc", new Object[]{this, context, aURAEventIO});
            return;
        }
        AURARenderComponent d = aURAEventIO.getEventModel().d();
        if (d == null || d.data == null || d.data.fields == null || !(context instanceof DetailCoreActivity)) {
            return;
        }
        String str = (String) d.data.fields.get("pageTitle");
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) context;
        if (!(detailCoreActivity.r() instanceof TaoDetailActionBarV3)) {
            return;
        }
        ((TaoDetailActionBarV3) detailCoreActivity.r()).setActionBarTitle(str);
    }

    private ArrayList<RateNode.RateKeyword> a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("4ccf216a", new Object[]{this, jSONArray}) : epw.a(jSONArray, new epy<RateNode.RateKeyword>() { // from class: com.taobao.android.detail.wrapper.aura.event.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.RateNode$RateKeyword, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ RateNode.RateKeyword b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public RateNode.RateKeyword a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (RateNode.RateKeyword) ipChange2.ipc$dispatch("e99edd61", new Object[]{this, obj}) : new RateNode.RateKeyword((JSONObject) obj);
            }
        });
    }
}
