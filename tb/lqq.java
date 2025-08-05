package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.homepage.pop.model.section.PopSectionModel;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.c;
import com.taobao.homepage.pop.utils.e;
import com.taobao.homepage.pop.utils.g;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;

/* loaded from: classes7.dex */
public class lqq extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long HSHOWPOP = 3196545303523394880L;

    static {
        kge.a(1842064177);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, final dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (dlhVar == null || lVar == null) {
            c.a("HShowPopAbility", "ability params invalid");
            return null;
        }
        DXRuntimeContext h = lVar.h();
        if (h == null) {
            c.a("HShowPopAbility", "dx runtime is null");
            return null;
        }
        ljs a2 = lfq.a(h);
        if (a2 == null) {
            c.a("HShowPopAbility", "IInfoFlowContext is null");
            return null;
        }
        JSONObject a3 = dlhVar.a("popData");
        if (a3 == null) {
            c.a("HShowPopAbility", "popData is null");
            return null;
        }
        IPopData<PopSectionModel> a4 = e.a(a3);
        if (a4 == null || !a4.valid()) {
            c.a("HShowPopAbility", "popData is inValid");
            return null;
        }
        int trigger = a4.getPopConfig().getTrigger();
        final String businessID = a4.getBusinessID();
        final IPopViewService iPopViewService = (IPopViewService) a2.a(IPopViewService.class);
        if (iPopViewService == null) {
            c.a("HShowPopAbility", "can't found IPopViewService");
            return null;
        }
        iPopViewService.triggerPopShowByPopData(trigger, a3);
        iPopViewService.addPopMessageListener(new IPopViewService.a() { // from class: tb.lqq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService.a
            public void a(String str, Object obj, JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e5ed1122", new Object[]{this, str, obj, jSONObject});
                } else if (dllVar == null) {
                } else {
                    IPopData<PopSectionModel> a5 = e.a(obj);
                    if (a5 == null) {
                        c.a("HShowPopAbility", "pop data invalid");
                    } else if (!TextUtils.equals(a5.getBusinessID(), businessID)) {
                    } else {
                        c.a("HShowPopAbility", "receive message: " + str);
                        if (!TextUtils.equals(str, "sourceCallback") || jSONObject == null) {
                            if (!g.a(str)) {
                                return;
                            }
                            iPopViewService.removePopMessageListener(this);
                            c.a("HShowPopAbility", "remove pop message listener");
                            return;
                        }
                        String string = jSONObject.getString("sourceMethod");
                        if (TextUtils.isEmpty(string)) {
                            return;
                        }
                        dllVar.callback(string, new dla());
                        c.a("HShowPopAbility", "dx callback");
                    }
                }
            }
        });
        c.a("HShowPopAbility", "trigger pop show");
        return new dla();
    }

    /* loaded from: classes7.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1766801144);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public lqq a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (lqq) ipChange.ipc$dispatch("16bdbdb6", new Object[]{this, obj}) : new lqq();
        }
    }
}
