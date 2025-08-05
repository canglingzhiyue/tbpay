package com.taobao.live.home.dinamic.model;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.mfn;

/* loaded from: classes7.dex */
public class TemplateObject implements IMTOPDataObject {
    public String name;
    public int span;
    public String url4Android;
    public long version4Android;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return mfn.a(this.url4Android, ((TemplateObject) obj).url4Android);
        }
        return false;
    }

    public int hashCode() {
        String str = this.url4Android;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
