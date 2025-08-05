package com.taobao.android.detail2.core.optimize.preload;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.data.net.recommend.RecRequestParamsV2;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public JSONObject g;
    public String i;
    public RecRequestParamsV2 j;

    /* renamed from: a  reason: collision with root package name */
    public DetailDataManager.b f11673a = new DetailDataManager.b();
    public DetailDataManager.b b = new DetailDataManager.b();
    public DetailDataManager.LimitedQueue<String> c = new DetailDataManager.LimitedQueue<>(100);
    public DetailDataManager.LimitedQueue<String> d = new DetailDataManager.LimitedQueue<>(50);
    public DetailDataManager.LimitedQueue<String> e = new DetailDataManager.LimitedQueue<>(100);
    public int f = 1;
    public JSONObject h = new JSONObject();

    static {
        kge.a(1749816016);
    }

    public b() {
        this.f11673a.f11517a = -1;
        this.b.f11517a = -1;
    }
}
