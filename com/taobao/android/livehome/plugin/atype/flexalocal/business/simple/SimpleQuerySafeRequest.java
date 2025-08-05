package com.taobao.android.livehome.plugin.atype.flexalocal.business.simple;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class SimpleQuerySafeRequest implements IMTOPDataObject {
    public String API_NAME = "mtop.tblive.recommend.video.simple.query.safe";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private boolean needRecommend = false;
    private String liveSource = null;
    private String holdItemIds = null;
    private long creatorId = 0;
    private String itemHoldType = null;
    private String entryLiveSource = null;
    private long liveId = 0;
    private String transParams = null;

    static {
        kge.a(434448295);
        kge.a(-350052935);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public void setAPI_NAME(String str) {
        this.API_NAME = str;
    }

    public String getVERSION() {
        return this.VERSION;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }

    public boolean isNEED_ECODE() {
        return this.NEED_ECODE;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public boolean isNEED_SESSION() {
        return this.NEED_SESSION;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public boolean isNeedRecommend() {
        return this.needRecommend;
    }

    public void setNeedRecommend(boolean z) {
        this.needRecommend = z;
    }

    public String getLiveSource() {
        return this.liveSource;
    }

    public void setLiveSource(String str) {
        this.liveSource = str;
    }

    public String getHoldItemIds() {
        return this.holdItemIds;
    }

    public void setHoldItemIds(String str) {
        this.holdItemIds = str;
    }

    public long getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(long j) {
        this.creatorId = j;
    }

    public String getItemHoldType() {
        return this.itemHoldType;
    }

    public void setItemHoldType(String str) {
        this.itemHoldType = str;
    }

    public String getEntryLiveSource() {
        return this.entryLiveSource;
    }

    public void setEntryLiveSource(String str) {
        this.entryLiveSource = str;
    }

    public long getLiveId() {
        return this.liveId;
    }

    public void setLiveId(long j) {
        this.liveId = j;
    }

    public String getTransParams() {
        return this.transParams;
    }

    public void setTransParams(String str) {
        this.transParams = str;
    }
}
