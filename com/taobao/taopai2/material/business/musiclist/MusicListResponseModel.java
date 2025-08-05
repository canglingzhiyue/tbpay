package com.taobao.taopai2.material.business.musiclist;

import com.taobao.taopai2.material.business.musicdetail.MusicItemBean;
import com.taobao.taopai2.material.request.Response;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class MusicListResponseModel implements Serializable {
    public Paging paging;
    public List<MusicItemBean> result;

    /* loaded from: classes8.dex */
    public static class MusicListResponse extends Response<MusicListResponseModel> {
        static {
            kge.a(-1835882658);
        }
    }

    /* loaded from: classes8.dex */
    public static class Paging implements Serializable {
        public int page;
        public int pageSize;
        public int totalCnt;
        public int totalPage;

        static {
            kge.a(1010780722);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1992947934);
        kge.a(1028243835);
    }
}
