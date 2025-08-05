package com.taobao.taopai2.material.business.musictype;

import com.taobao.taopai2.material.request.Response;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class MusicTypeListResponseModel implements Serializable {
    public List<MusicTypeInfo> result;

    /* loaded from: classes8.dex */
    public static class MusicTypeListResponse extends Response<MusicTypeListResponseModel> {
        static {
            kge.a(172046978);
        }
    }

    static {
        kge.a(1753795240);
        kge.a(1028243835);
    }
}
