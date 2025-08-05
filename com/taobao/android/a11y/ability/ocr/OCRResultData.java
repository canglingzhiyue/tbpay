package com.taobao.android.a11y.ability.ocr;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class OCRResultData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f8608a;
    private ResultType b;
    private String c;

    /* loaded from: classes4.dex */
    enum ResultType {
        SUCCESS,
        HOLD,
        FAIL
    }

    static {
        kge.a(-280948021);
    }

    public OCRResultData(String str, ResultType resultType) {
        this.f8608a = str;
        this.b = resultType;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.c;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f8608a;
    }

    public ResultType c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ResultType) ipChange.ipc$dispatch("925c6e4b", new Object[]{this}) : this.b;
    }
}
