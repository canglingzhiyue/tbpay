package com.taobao.taobao.scancode.v2.result;

import android.text.TextUtils;
import tb.kge;

/* loaded from: classes8.dex */
public class MaTBAntiFakeResult extends MaResult {
    private String hiddenData;

    static {
        kge.a(187944332);
    }

    public MaTBAntiFakeResult(a aVar) {
        super(aVar);
        this.hiddenData = aVar.e;
    }

    public String getHiddenData() {
        return this.hiddenData;
    }

    public boolean exist() {
        return !TextUtils.isEmpty(this.hiddenData);
    }
}
