package com.taobao.android.detail.wrapper.ultronengine.event;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.model.viewmodel.main.TitleViewModel;
import tb.emu;
import tb.eoi;
import tb.fdt;
import tb.kge;

/* loaded from: classes5.dex */
public class n extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "openShare";

    static {
        kge.a(-412023958);
    }

    public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public n() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.OpenShareUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.detail.core.utils.i.c("OpenShareUltronSubscriber", "onHandleEvent");
        new fdt((DetailCoreActivity) com.taobao.prefork.a.a(eVar.a())).a(a(c()));
    }

    private eoi a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eoi) ipChange.ipc$dispatch("290068df", new Object[]{this, jSONObject});
        }
        if (jSONObject.containsKey("iconType") && !StringUtils.isEmpty(jSONObject.getString("iconType"))) {
            int parseInt = Integer.parseInt(jSONObject.getString("iconType"));
            if (parseInt == 2) {
                return new eoi(TitleViewModel.ShareType.SHARE_TYPE_PRESENT);
            }
            if (parseInt == 3) {
                return new eoi(TitleViewModel.ShareType.SHARE_TYPE_GIFT);
            }
            if (parseInt == 4) {
                return new eoi(TitleViewModel.ShareType.SHARE_TYPE_AWARD);
            }
            return new eoi(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT, jSONObject);
        }
        return new eoi(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT, jSONObject);
    }
}
