package com.taobao.tao.detail.uimodel;

import com.taobao.detail.domain.rate.RateTag;
import java.io.Serializable;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class CommentVO implements Serializable {
    public String commentNum;
    public List<YellowDiamondCommentVO> rateList;
    public List<RateTag> tagList;

    static {
        kge.a(-1389440000);
        kge.a(1028243835);
    }

    public CommentVO() {
        tpc.a("com.taobao.tao.detail.uimodel.CommentVO");
    }
}
