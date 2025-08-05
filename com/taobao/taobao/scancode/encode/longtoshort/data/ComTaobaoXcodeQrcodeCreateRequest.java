package com.taobao.taobao.scancode.encode.longtoshort.data;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class ComTaobaoXcodeQrcodeCreateRequest implements IMTOPDataObject {
    private String API_NAME = "com.taobao.xcode.default.create";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private long bgColor = 0;
    private String content = null;
    private String logo = null;
    private long level = 0;
    private long color = 0;
    private String bizCode = null;
    private long margin = 0;
    private long size = 0;

    static {
        kge.a(1683588886);
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

    public long getBgColor() {
        return this.bgColor;
    }

    public void setBgColor(long j) {
        this.bgColor = j;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    public long getLevel() {
        return this.level;
    }

    public void setLevel(long j) {
        this.level = j;
    }

    public long getColor() {
        return this.color;
    }

    public void setColor(long j) {
        this.color = j;
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public void setBizCode(String str) {
        this.bizCode = str;
    }

    public long getMargin() {
        return this.margin;
    }

    public void setMargin(long j) {
        this.margin = j;
    }

    public long getSize() {
        return this.size;
    }

    public void setSize(long j) {
        this.size = j;
    }
}
