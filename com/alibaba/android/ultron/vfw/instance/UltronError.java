package com.alibaba.android.ultron.vfw.instance;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UltronError extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String code;
    public String domain;
    public Map<String, Object> extParams;
    public String extraMsg;
    public String type;

    static {
        kge.a(1775815420);
    }

    public UltronError() {
        this.type = "other";
    }

    public UltronError(String str) {
        super(str);
        this.type = "other";
    }

    public UltronError(String str, String str2, String str3, String str4, Map<String, Object> map) {
        this.type = "other";
        this.domain = str;
        this.code = str2;
        this.extraMsg = str3;
        this.type = str4;
        this.extParams = map;
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AURAError{, code='" + this.code + "', type='" + this.type + "', extraMsg='" + this.extraMsg + "', domain='" + this.domain + "'}";
    }
}
