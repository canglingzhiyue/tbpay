package com.taobao.taobao.scancode.history.object;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class Product implements Serializable, IMTOPDataObject {
    private String pic;
    private String price;
    private String title;
    private int type = 1;

    static {
        kge.a(379076017);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public String getPic() {
        return this.pic;
    }

    public void setPic(String str) {
        this.pic = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }
}
