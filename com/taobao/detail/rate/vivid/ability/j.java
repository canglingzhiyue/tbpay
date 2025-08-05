package com.taobao.detail.rate.vivid.ability;

import android.support.v4.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.detail.rate.vivid.presenter.b;
import tb.dkx;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.kqa;

/* loaded from: classes7.dex */
public class j extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALLBACK_FAILURE = "failure";
    public static final String CALLBACK_SUCCESS = "success";
    public static final long SRKPREREQUEST = 8528389213370060301L;

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ JSONObject a(j jVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("f6fd9709", new Object[]{jVar, jSONObject}) : jVar.a(jSONObject);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, final dll dllVar) {
        RateFeedsFragment a2;
        com.taobao.detail.rate.vivid.presenter.b preRequestPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if ((dleVar.a() instanceof FragmentActivity) && (a2 = kqa.INSTANCE.a((FragmentActivity) dleVar.a(), dleVar.e())) != null && (preRequestPresenter = a2.getPreRequestPresenter()) != null) {
            if (preRequestPresenter.b()) {
                if (preRequestPresenter.a() != null) {
                    dllVar.callback("success", new dla(a(preRequestPresenter.a())));
                } else {
                    dllVar.callback("failure", new dla(new JSONObject()));
                }
            } else {
                preRequestPresenter.a(new b.a() { // from class: com.taobao.detail.rate.vivid.ability.j.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.detail.rate.vivid.presenter.b.a
                    public void a(JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        } else {
                            dllVar.callback("success", new dla(j.a(j.this, jSONObject)));
                        }
                    }

                    @Override // com.taobao.detail.rate.vivid.presenter.b.a
                    public void a(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        } else {
                            dllVar.callback("failure", new dla(new JSONObject()));
                        }
                    }
                });
            }
            return new dla();
        }
        dllVar.callback("failure", new dla(new JSONObject()));
        return new dla();
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", (Object) jSONObject);
        return jSONObject2;
    }

    /* loaded from: classes7.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public j a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("22fd2091", new Object[]{this, obj}) : new j();
        }
    }
}
