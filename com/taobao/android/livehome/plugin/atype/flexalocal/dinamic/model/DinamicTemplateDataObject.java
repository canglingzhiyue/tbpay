package com.taobao.android.livehome.plugin.atype.flexalocal.dinamic.model;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class DinamicTemplateDataObject implements IMTOPDataObject {
    public String cardType;
    public String name;
    public String span;
    public String templateHeight;
    public String url4Android;
    public String version4Android;

    static {
        kge.a(-685297601);
        kge.a(-350052935);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DinamicTemplateDataObject dinamicTemplateDataObject = (DinamicTemplateDataObject) obj;
            String str = this.name;
            if (str == null ? dinamicTemplateDataObject.name != null : !str.equals(dinamicTemplateDataObject.name)) {
                return false;
            }
            String str2 = this.version4Android;
            if (str2 == null ? dinamicTemplateDataObject.version4Android == null : str2.equals(dinamicTemplateDataObject.version4Android)) {
                return true;
            }
        }
        return false;
    }
}
