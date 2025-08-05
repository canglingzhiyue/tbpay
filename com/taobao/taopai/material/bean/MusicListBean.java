package com.taobao.taopai.material.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.taopai2.material.business.musicdetail.MusicItemBean;
import java.util.ArrayList;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MusicListBean implements IMTOPDataObject {
    @JSONField(name = "paging")
    public PageInfo mPageInfo;
    @JSONField(name = "result")
    public ArrayList<MusicItemBean> module;

    /* loaded from: classes8.dex */
    public static class PageInfo implements IMTOPDataObject {
        @JSONField(name = "page")
        public int currentPage;
        public int pageSize;
        public int totalCnt;
        public int totalPage;

        static {
            kge.a(-1852520469);
            kge.a(-350052935);
        }
    }

    static {
        kge.a(-1421981450);
        kge.a(-350052935);
    }
}
