package com.taobao.taopai.material.request.musicetype;

import com.taobao.taopai.material.bean.MusicCategoryBean;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MusicTypeListResponseData implements IMTOPDataObject {
    private List<MusicCategoryBean> result;

    static {
        kge.a(1944764437);
        kge.a(-350052935);
    }

    public List<MusicCategoryBean> getResult() {
        return this.result;
    }

    public void setResult(List<MusicCategoryBean> list) {
        this.result = list;
    }
}
