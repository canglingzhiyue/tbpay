package com.taobao.analysis.v3;

import com.taobao.android.layoutmanager.module.MtopModule;
import tb.mze;
import tb.mzg;
import tb.mzh;

/* loaded from: classes.dex */
public interface k extends f {
    public static final mzh URL = new mzh("url");
    public static final mzh HOST = new mzh("host");
    public static final mzh IP = new mzh(com.network.diagnosis.c.IP);
    public static final mze RETRY_TIMES = new mze("retryTimes");
    public static final mzh NET_TYPE = new mzh("netType");
    public static final mzh PROTOCOL_TYPE = new mzh("protocolType");
    public static final mze RET = new mze(com.taobao.mtop.wvplugin.a.RESULT_KEY);
    public static final mzh BIZ_ID = new mzh("bizID");
    public static final mzg REQ_INFLATE_SIZE = new mzg("reqInflateSize");
    public static final mzg REQ_DEFLATE_SIZE = new mzg("reqDeflateSize");
    public static final mzg RSP_INFLATE_SIZE = new mzg("rspInflateSize");
    public static final mzg RSP_DEFLATE_SIZE = new mzg("rspDeflateSize");
    public static final mzg SEND_DATA_TIME = new mzg("sendDataTime");
    public static final mzg FIRST_DATA_TIME = new mzg("firstDataTime");
    public static final mzg DESERIALIZE_TIME = new mzg("deserializeTime");
    public static final mzg DISK_CACHE_LOOKUP_TIME = new mzg("diskCacheLookupTime");
    public static final mze IS_REQ_SYNC = new mze("isReqSync");
    public static final mze IS_REQ_MAIN = new mze("isReqMain");
    public static final mze IS_CB_MAIN = new mze("isCbMain");
    public static final mzh API_NAME = new mzh("apiName");
    public static final mzh SERVER_TRACE_ID = new mzh("serverTraceID");
    public static final mzg MTOP_SIGN_TIME = new mzg("signTime");
    public static final mzg MTOP_BIZ_FIRST_CHUNK_INFLATE_SIZE = new mzg("bizFirstChunkInflateSize");
    public static final mzg MTOP_BIZ_FIRST_CHUNK_TIME = new mzg("bizFirstChunkTime");
    public static final mze PIC_DATA_FROM = new mze("dataFrom");
    public static final mze PAGE_INDEX = new mze(MtopModule.KEY_PAGE_INDEX);
    public static final mzh TOPIC = new mzh("topic");
    public static final mze LAUNCH_TYPE = new mze("launchType");
    public static final mzg SERVER_BIZ_RT = new mzg("serverBizRT");
    public static final mze SERVER_CROSS_UNIT = new mze("serverCrossUnit");
    public static final mzh IMAGE_FORMAT = new mzh("format");

    void a(long j);

    void a(Long l);

    void b(Long l);

    void c(Long l);

    void d(Long l);

    void e(Long l);

    void f(Long l);

    void g(Long l);

    void h(Long l);

    void i(Long l);
}
