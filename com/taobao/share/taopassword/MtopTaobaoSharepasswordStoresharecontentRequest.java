package com.taobao.share.taopassword;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopTaobaoSharepasswordStoresharecontentRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.sharepassword.storesharecontent";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String shareRequestId = null;
    private String shareUniqueId = null;
    private String bizId = null;
    private String shareChannelType = null;
    private String msgType = "1";
    private String shareRemark = null;
    private String shareType = null;
    private String shareDesc = null;
    private String sharePicUrl = null;
    private String shareUrl = null;
    private String shareSendName = null;
    private String extendInfo = null;

    static {
        kge.a(-1538266845);
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

    public String getShareRequestId() {
        return this.shareRequestId;
    }

    public void setShareRequestId(String str) {
        this.shareRequestId = str;
    }

    public String getBizId() {
        return this.bizId;
    }

    public void setBizId(String str) {
        this.bizId = str;
    }

    public String getShareChannelType() {
        return this.shareChannelType;
    }

    public void setShareChannelType(String str) {
        this.shareChannelType = str;
    }

    public String getMsgType() {
        return this.msgType;
    }

    public void setMsgType(String str) {
        this.msgType = str;
    }

    public String getShareRemark() {
        return this.shareRemark;
    }

    public void setShareRemark(String str) {
        this.shareRemark = str;
    }

    public String getShareType() {
        return this.shareType;
    }

    public void setShareType(String str) {
        this.shareType = str;
    }

    public String getShareDesc() {
        return this.shareDesc;
    }

    public void setShareDesc(String str) {
        this.shareDesc = str;
    }

    public String getSharePicUrl() {
        return this.sharePicUrl;
    }

    public void setSharePicUrl(String str) {
        this.sharePicUrl = str;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public String getShareSendName() {
        return this.shareSendName;
    }

    public void setShareSendName(String str) {
        this.shareSendName = str;
    }

    public String getExtendInfo() {
        return this.extendInfo;
    }

    public void setExtendInfo(String str) {
        this.extendInfo = str;
    }

    public String getShareUniqueId() {
        return this.shareUniqueId;
    }

    public void setShareUniqueId(String str) {
        this.shareUniqueId = str;
    }
}
