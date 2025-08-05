package com.taobao.share.core.contacts.mtop.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class NewShareCheckApi implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.aris.share.checkCommonShare";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String sharePicUrl = null;
    private String sharePrice = null;
    private String shareItemId = null;
    private String friendName = null;
    private String taoFriends = null;
    private String groupIds = null;
    private String shareRemark = null;
    private String shareUrl = null;
    private String shareDesc = null;
    private String msgType = null;
    private String extendInfo = null;
    private String shareSendName = null;
    private String shareType = null;
    private String contacts = null;
    private String activityId = null;
    private String shareRequestId = null;

    static {
        kge.a(1742771433);
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

    public String getSharePicUrl() {
        return this.sharePicUrl;
    }

    public void setSharePicUrl(String str) {
        this.sharePicUrl = str;
    }

    public String getSharePrice() {
        return this.sharePrice;
    }

    public void setSharePrice(String str) {
        this.sharePrice = str;
    }

    public String getShareItemId() {
        return this.shareItemId;
    }

    public void setShareItemId(String str) {
        this.shareItemId = str;
    }

    public String getTaoFriends() {
        return this.taoFriends;
    }

    public void setTaoFriends(String str) {
        this.taoFriends = str;
    }

    public String getGroupIds() {
        return this.groupIds;
    }

    public void setGroupIds(String str) {
        this.groupIds = str;
    }

    public String getShareRemark() {
        return this.shareRemark;
    }

    public void setShareRemark(String str) {
        this.shareRemark = str;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public String getShareDesc() {
        return this.shareDesc;
    }

    public void setShareDesc(String str) {
        this.shareDesc = str;
    }

    public String getMsgType() {
        return this.msgType;
    }

    public void setMsgType(String str) {
        this.msgType = str;
    }

    public String getExtendInfo() {
        return this.extendInfo;
    }

    public void setExtendInfo(String str) {
        this.extendInfo = str;
    }

    public String getShareSendName() {
        return this.shareSendName;
    }

    public void setShareSendName(String str) {
        this.shareSendName = str;
    }

    public String getShareType() {
        return this.shareType;
    }

    public void setShareType(String str) {
        this.shareType = str;
    }

    public String getContacts() {
        return this.contacts;
    }

    public void setContacts(String str) {
        this.contacts = str;
    }

    public String getActivityId() {
        return this.activityId;
    }

    public void setActivityId(String str) {
        this.activityId = str;
    }

    public String getShareRequestId() {
        return this.shareRequestId;
    }

    public void setShareRequestId(String str) {
        this.shareRequestId = str;
    }

    public String getFriendName() {
        return this.friendName;
    }

    public void setFriendName(String str) {
        this.friendName = str;
    }
}
