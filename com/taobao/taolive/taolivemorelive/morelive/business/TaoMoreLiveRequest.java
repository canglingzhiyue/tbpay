package com.taobao.taolive.taolivemorelive.morelive.business;

import com.taobao.live.home.business.BaseListRequest;
import com.taobao.live.home.c;

/* loaded from: classes8.dex */
public class TaoMoreLiveRequest extends BaseListRequest {
    public String channelType;
    private String API_NAME = "mtop.mediaplatform.live.slide.right";
    private String VERSION = "2.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String channelId = "0";
    public String appVersion = c.a();
    private long itemId = 0;
    private long liveId = 0;
    private String tppParam = null;
    private String extParam = null;

    @Override // com.taobao.live.home.business.BaseListRequest
    public String getAPI_NAME() {
        return this.API_NAME;
    }

    @Override // com.taobao.live.home.business.BaseListRequest
    public void setAPI_NAME(String str) {
        this.API_NAME = str;
    }

    @Override // com.taobao.live.home.business.BaseListRequest
    public String getVERSION() {
        return this.VERSION;
    }

    @Override // com.taobao.live.home.business.BaseListRequest
    public void setVERSION(String str) {
        this.VERSION = str;
    }

    @Override // com.taobao.live.home.business.BaseListRequest
    public boolean isNEED_ECODE() {
        return this.NEED_ECODE;
    }

    @Override // com.taobao.live.home.business.BaseListRequest
    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    @Override // com.taobao.live.home.business.BaseListRequest
    public boolean isNEED_SESSION() {
        return this.NEED_SESSION;
    }

    @Override // com.taobao.live.home.business.BaseListRequest
    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public long getItemId() {
        return this.itemId;
    }

    public void setItemId(long j) {
        this.itemId = j;
    }

    public long getS() {
        return this.s;
    }

    public void setS(long j) {
        this.s = j;
    }

    public long getLiveId() {
        return this.liveId;
    }

    public void setLiveId(long j) {
        this.liveId = j;
    }

    public long getN() {
        return this.n;
    }

    public void setN(long j) {
        this.n = j;
    }

    public String getTppParam() {
        return this.tppParam;
    }

    public void setTppParam(String str) {
        this.tppParam = str;
    }

    public String getChannelType() {
        return this.channelType;
    }

    public void setChannelType(String str) {
        this.channelType = str;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public void setChannelId(String str) {
        this.channelId = str;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public String getExtParam() {
        return this.extParam;
    }

    public void setExtParam(String str) {
        this.extParam = str;
    }
}
