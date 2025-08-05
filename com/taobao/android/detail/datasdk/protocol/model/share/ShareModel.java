package com.taobao.android.detail.datasdk.protocol.model.share;

import java.io.Serializable;
import java.util.List;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class ShareModel implements Serializable {
    public String businessId;
    public String isActivity;
    public String link;
    public String msg;
    public List<String> picUrlList;
    public String price;
    public String title;

    static {
        kge.a(-573666707);
        kge.a(1028243835);
    }

    public ShareModel() {
        emu.a("com.taobao.android.detail.datasdk.protocol.model.share.ShareModel");
    }
}
