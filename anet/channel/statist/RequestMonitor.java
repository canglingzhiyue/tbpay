package anet.channel.statist;

import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "request_monitor")
/* loaded from: classes2.dex */
public class RequestMonitor extends RequestStatistic {
    static {
        kge.a(-2051498301);
    }

    public RequestMonitor(RequestStatistic requestStatistic) {
        super(null, null);
        if (requestStatistic == null) {
            return;
        }
        this.host = requestStatistic.host;
        this.ip = requestStatistic.ip;
        this.port = requestStatistic.port;
        this.isSSL = requestStatistic.isSSL;
        this.ipRefer = requestStatistic.ipRefer;
        this.ipType = requestStatistic.ipType;
        this.isProxy = requestStatistic.isProxy;
        this.proxyType = requestStatistic.proxyType;
        this.netType = requestStatistic.netType;
        this.bssid = requestStatistic.bssid;
        this.protocolType = requestStatistic.protocolType;
        this.isDNS = requestStatistic.isDNS;
        this.retryTimes = requestStatistic.retryTimes;
        this.bizId = requestStatistic.bizId;
        this.bizReqId = requestStatistic.bizReqId;
        this.f_refer = requestStatistic.f_refer;
        this.ret = requestStatistic.ret;
        this.statusCode = requestStatistic.statusCode;
        this.msg = requestStatistic.msg;
        this.contentEncoding = requestStatistic.contentEncoding;
        this.contentType = requestStatistic.contentType;
        this.server_cc = requestStatistic.server_cc;
        this.degraded = requestStatistic.degraded;
        this.isBg = requestStatistic.isBg;
        this.errorTrace = requestStatistic.errorTrace;
        this.url = requestStatistic.url;
        this.lng = requestStatistic.lng;
        this.lat = requestStatistic.lat;
        this.accuracy = requestStatistic.accuracy;
        this.roaming = requestStatistic.roaming;
        this.mnc = requestStatistic.mnc;
        this.unit = requestStatistic.unit;
        this.extra = requestStatistic.extra;
        this.falcoId = requestStatistic.falcoId;
        this.reqHeadInflateSize = requestStatistic.reqHeadInflateSize;
        this.reqBodyInflateSize = requestStatistic.reqBodyInflateSize;
        this.reqHeadDeflateSize = requestStatistic.reqHeadDeflateSize;
        this.reqBodyDeflateSize = requestStatistic.reqBodyDeflateSize;
        this.rspHeadInflateSize = requestStatistic.rspHeadInflateSize;
        this.rspBodyInflateSize = requestStatistic.rspBodyInflateSize;
        this.rspHeadDeflateSize = requestStatistic.rspHeadDeflateSize;
        this.rspBodyDeflateSize = requestStatistic.rspBodyDeflateSize;
        this.retryCostTime = requestStatistic.retryCostTime;
        this.connWaitTime = requestStatistic.connWaitTime;
        this.sessionSyncTime = requestStatistic.sessionSyncTime;
        this.sessionThreadWaitTime = requestStatistic.sessionThreadWaitTime;
        this.httpSessionTime = requestStatistic.httpSessionTime;
        this.sendBeforeTime = requestStatistic.sendBeforeTime;
        this.processTime = requestStatistic.processTime;
        this.reqPreProcessTime = requestStatistic.reqPreProcessTime;
        this.cookieTime = requestStatistic.cookieTime;
        this.otherProcessTime = requestStatistic.otherProcessTime;
        this.acceptEncodeTime = requestStatistic.acceptEncodeTime;
        this.requestBodyCompressCostTime = requestStatistic.requestBodyCompressCostTime;
        this.reqPriorityTime = requestStatistic.reqPriorityTime;
        this.requestTime = requestStatistic.requestTime;
        this.sendDataTime = requestStatistic.sendDataTime;
        this.firstDataTime = requestStatistic.firstDataTime;
        this.recDataTime = requestStatistic.recDataTime;
        this.serverRT = requestStatistic.serverRT;
        this.serverBRT = requestStatistic.serverBRT;
        this.cacheTime = requestStatistic.cacheTime;
        this.lastProcessTime = requestStatistic.lastProcessTime;
        this.callbackTime = requestStatistic.callbackTime;
        this.oneWayTime = requestStatistic.oneWayTime;
        this.sendDataSize = requestStatistic.sendDataSize;
        this.recDataSize = requestStatistic.recDataSize;
        this.firstProtocol = requestStatistic.firstProtocol;
        this.firstErrorCode = requestStatistic.firstErrorCode;
        this.isHttpDetectEnable = requestStatistic.isHttpDetectEnable;
        this.cid = requestStatistic.cid;
        this.xqcConnEnv = requestStatistic.xqcConnEnv;
        this.isOkhttpAvailable = requestStatistic.isOkhttpAvailable;
        this.useOkHttp = requestStatistic.useOkHttp;
        this.useMultiPath = requestStatistic.useMultiPath;
        this.useVpnFastDegrade = requestStatistic.useVpnFastDegrade;
        this.isVpn = requestStatistic.isVpn;
        this.isWifi = requestStatistic.isWifi;
        this.forceCellular = requestStatistic.forceCellular;
        this.isSetForceCell = requestStatistic.isSetForceCell;
        this.timeTrace = requestStatistic.timeTrace;
        this.useWifiFgForceCell = requestStatistic.useWifiFgForceCell;
        this.userId = requestStatistic.userId;
        this.sinceInitTime = requestStatistic.sinceInitTime;
        this.isPreSession = requestStatistic.isPreSession;
        this.waitConnectStat = requestStatistic.waitConnectStat;
        this.isInternalAddr = requestStatistic.isInternalAddr;
        this.startType = requestStatistic.startType;
        this.isZstdDictFlag = requestStatistic.isZstdDictFlag;
        this.useZstdDict = requestStatistic.useZstdDict;
        this.zstddFlag = requestStatistic.zstddFlag;
        this.eagleEyeId = requestStatistic.eagleEyeId;
        this.firstProtocol = requestStatistic.firstProtocol;
        this.isDetectReq = requestStatistic.isDetectReq;
        this.srtt = requestStatistic.srtt;
    }
}
