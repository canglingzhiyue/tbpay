package com.taobao.android.festival.skin;

import android.text.TextUtils;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public class SkinConfig implements IMTOPDataObject {
    public String skinCode;
    public String skinUrl;
    public String skinZipUrl;
    public long updateTime;
    public int version = 1;

    static {
        kge.a(955412045);
        kge.a(-350052935);
    }

    public SkinConfig() {
    }

    public SkinConfig(String str, String str2) {
        this.skinCode = str;
        this.skinUrl = str2;
    }

    public boolean isValidConfig() {
        return !TextUtils.isEmpty(this.skinCode) && !TextUtils.isEmpty(this.skinUrl);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SkinConfig)) {
            return false;
        }
        SkinConfig skinConfig = (SkinConfig) obj;
        return TextUtils.equals(this.skinCode, skinConfig.skinCode) && TextUtils.equals(this.skinUrl, skinConfig.skinUrl) && TextUtils.equals(this.skinZipUrl, skinConfig.skinZipUrl) && this.version == skinConfig.version;
    }
}
