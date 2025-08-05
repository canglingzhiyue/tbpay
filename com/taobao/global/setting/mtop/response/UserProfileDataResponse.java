package com.taobao.global.setting.mtop.response;

import mtopsdk.mtop.domain.BaseOutDo;

/* loaded from: classes7.dex */
public class UserProfileDataResponse extends BaseOutDo {
    private UserProfileDataResult data;

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public UserProfileDataResult mo2429getData() {
        return this.data;
    }

    public void setData(UserProfileDataResult userProfileDataResult) {
        this.data = userProfileDataResult;
    }
}
