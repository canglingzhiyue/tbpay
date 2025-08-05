package com.taobao.android.detail.protocol.model.share;

import java.io.Serializable;
import java.util.List;
import tb.tpc;

/* loaded from: classes4.dex */
public class ShareModel implements Serializable {
    public String businessId;
    public String isActivity;
    public String link;
    public String msg;
    public List<String> picUrlList;
    public String price;
    public String title;

    public ShareModel() {
        tpc.a("com.taobao.android.detail.protocol.model.share.ShareModel");
    }
}
