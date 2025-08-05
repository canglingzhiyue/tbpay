package com.taobao.share.taopassword.busniess.mtop.request;

import com.taobao.share.globalmodel.e;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopGenPasswordRequest implements IMTOPDataObject {
    private String target;
    private String API_NAME = e.GENPASSWORD;
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String sourceType = null;
    private String picUrl = null;
    private String targetUrl = null;
    private String bizId = null;
    private String passwordType = null;
    private String password = null;
    private String title = null;
    private String templateId = null;
    private long expireTime = 0;
    private String extendInfo = null;
    private String popType = null;
    private String popUrl = null;

    static {
        kge.a(1528351299);
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

    public String getPasswordType() {
        return this.passwordType;
    }

    public void setPasswordType(String str) {
        this.passwordType = str;
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public void setSourceType(String str) {
        this.sourceType = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String str) {
        this.picUrl = str;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public String getTargetUrl() {
        return this.targetUrl;
    }

    public void setTargetUrl(String str) {
        this.targetUrl = str;
    }

    public String getBizId() {
        return this.bizId;
    }

    public void setBizId(String str) {
        this.bizId = str;
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(long j) {
        this.expireTime = j;
    }

    public String getExtendInfo() {
        return this.extendInfo;
    }

    public void setExtendInfo(String str) {
        this.extendInfo = str;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public String getPopType() {
        return this.popType;
    }

    public void setPopType(String str) {
        this.popType = str;
    }

    public String getPopUrl() {
        return this.popUrl;
    }

    public void setPopUrl(String str) {
        this.popUrl = str;
    }

    public String getTarget() {
        return this.target;
    }

    public void setTarget(String str) {
        this.target = str;
    }
}
