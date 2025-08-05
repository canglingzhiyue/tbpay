package com.taobao.tao.detail.biz.adapter;

import android.app.Activity;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class DetailCacheAdapter {

    /* loaded from: classes8.dex */
    public interface ICache extends Serializable {
        Activity getCurrentAct();
    }

    static {
        kge.a(531292600);
        tpc.a("com.taobao.tao.detail.biz.adapter.DetailCacheAdapter");
    }
}
