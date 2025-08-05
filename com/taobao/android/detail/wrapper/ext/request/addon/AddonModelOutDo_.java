package com.taobao.android.detail.wrapper.ext.request.addon;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class AddonModelOutDo_ extends BaseOutDo {
    private AddonModel data;

    static {
        kge.a(1490788211);
    }

    public AddonModelOutDo_() {
        emu.a("com.taobao.android.detail.wrapper.ext.request.addon.AddonModelOutDo_");
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public AddonModel mo2429getData() {
        return this.data;
    }

    public void setData(AddonModel addonModel) {
        this.data = addonModel;
    }
}
