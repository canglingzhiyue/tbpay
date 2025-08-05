package com.taobao.android.detail.core.event.popup;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.i;
import java.io.Serializable;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class OpenCommonDialogEvent extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DataModel f9724a;

    /* loaded from: classes4.dex */
    public static class DataModel implements Serializable {
        public JSONObject exParams;
        public String needLogin;
        public String popConfig;
        public String popId;
        public String renderType;
        public String url;

        static {
            kge.a(-53440037);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(2053387264);
    }

    public OpenCommonDialogEvent(JSONObject jSONObject) {
        String a2 = i.a("OpenCommonDialogEvent", BTags.CommonDlg);
        StringBuilder sb = new StringBuilder();
        sb.append("OpenCommonDialogEvent:");
        sb.append(jSONObject == null ? "null" : jSONObject.toString());
        com.taobao.android.detail.core.utils.i.d(a2, sb.toString());
        this.f9724a = (DataModel) JSONObject.toJavaObject(jSONObject, DataModel.class);
        emu.a("com.taobao.android.detail.core.event.popup.OpenCommonDialogEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f9724a;
    }
}
