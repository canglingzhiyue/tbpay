package com.taobao.homepage.request;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes.dex */
public class SettingGetResultOutDo_ extends BaseOutDo {
    private SettingGetResult data;

    static {
        kge.a(-2104001577);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public SettingGetResult mo2429getData() {
        return this.data;
    }

    public void setData(SettingGetResult settingGetResult) {
        this.data = settingGetResult;
    }
}
