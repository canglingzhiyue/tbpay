package com.taobao.message.translate;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopOvsTranslateBatchSyncTranslateRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.ovs.translate.batchSyncTranslate";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String sourceTextFormatType = null;
    private String sourceTextList = null;
    private String targetLanguage = null;
    private String extraMap = null;
    private String appName = null;
    private String bizScene = null;
    private String bizEchoMap = null;
    private String glossaryIdList = null;
    private boolean mock = false;
    private String bizCustomId = null;
    private String sourceTextContentType = null;
    private String sourceLanguage = null;
    private String translateAbility = null;

    static {
        kge.a(499154608);
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

    public String getSourceTextFormatType() {
        return this.sourceTextFormatType;
    }

    public void setSourceTextFormatType(String str) {
        this.sourceTextFormatType = str;
    }

    public String getSourceTextList() {
        return this.sourceTextList;
    }

    public void setSourceTextList(String str) {
        this.sourceTextList = str;
    }

    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public void setTargetLanguage(String str) {
        this.targetLanguage = str;
    }

    public String getExtraMap() {
        return this.extraMap;
    }

    public void setExtraMap(String str) {
        this.extraMap = str;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public String getBizScene() {
        return this.bizScene;
    }

    public void setBizScene(String str) {
        this.bizScene = str;
    }

    public String getBizEchoMap() {
        return this.bizEchoMap;
    }

    public void setBizEchoMap(String str) {
        this.bizEchoMap = str;
    }

    public String getGlossaryIdList() {
        return this.glossaryIdList;
    }

    public void setGlossaryIdList(String str) {
        this.glossaryIdList = str;
    }

    public boolean isMock() {
        return this.mock;
    }

    public void setMock(boolean z) {
        this.mock = z;
    }

    public String getBizCustomId() {
        return this.bizCustomId;
    }

    public void setBizCustomId(String str) {
        this.bizCustomId = str;
    }

    public String getSourceTextContentType() {
        return this.sourceTextContentType;
    }

    public void setSourceTextContentType(String str) {
        this.sourceTextContentType = str;
    }

    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public void setSourceLanguage(String str) {
        this.sourceLanguage = str;
    }

    public String getTranslateAbility() {
        return this.translateAbility;
    }

    public void setTranslateAbility(String str) {
        this.translateAbility = str;
    }
}
