package com.taobao.android.fluid.framework.adapter;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.fluid.framework.adapter.mtop.CommonResponseOutDo;
import com.taobao.android.fluid.framework.adapter.mtop.c;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes5.dex */
public interface IMTopAdapter extends IAdapter {
    public static final String ADAPTER_NAME = "IMTopAdapter";

    /* loaded from: classes5.dex */
    public interface a<T extends BaseOutDo> {
        T a(byte[] bArr, Class<T> cls);
    }

    /* loaded from: classes5.dex */
    public interface b<T extends BaseOutDo> {
        void a(MtopResponse mtopResponse);

        void a(MtopResponse mtopResponse, T t);
    }

    long getServerTimeMillis();

    <T extends CommonResponseOutDo> void send(c<T> cVar);

    <T extends CommonResponseOutDo> void send(IMTOPDataObject iMTOPDataObject, b<T> bVar);

    <T extends CommonResponseOutDo> void send(IMTOPDataObject iMTOPDataObject, b<T> bVar, a<T> aVar, Class<T> cls);

    <T extends CommonResponseOutDo> void send(IMTOPDataObject iMTOPDataObject, b<T> bVar, Class<T> cls);

    <T extends CommonResponseOutDo> void send(IMTOPDataObject iMTOPDataObject, com.taobao.android.fluid.framework.adapter.mtop.b<T> bVar);

    <T extends CommonResponseOutDo> void sendWithPrefetch(JSONObject jSONObject, b<T> bVar, a<T> aVar, Class<T> cls);

    <T extends CommonResponseOutDo> void sendWithPrefetch(c<T> cVar);

    <T extends CommonResponseOutDo> void sendWithPrefetchFromLauncher(JSONObject jSONObject, b<T> bVar, a<T> aVar, Class<T> cls, boolean z);
}
