package com.huawei.hms.push.ups.entity;

/* loaded from: classes4.dex */
public class CodeResult {

    /* renamed from: a  reason: collision with root package name */
    private int f7538a;
    private String b;

    public CodeResult() {
    }

    public CodeResult(int i) {
        this.f7538a = i;
    }

    public CodeResult(int i, String str) {
        this.f7538a = i;
        this.b = str;
    }

    public String getReason() {
        return this.b;
    }

    public int getReturnCode() {
        return this.f7538a;
    }

    public void setReason(String str) {
        this.b = str;
    }

    public void setReturnCode(int i) {
        this.f7538a = i;
    }
}
