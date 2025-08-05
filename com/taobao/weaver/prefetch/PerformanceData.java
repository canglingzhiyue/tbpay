package com.taobao.weaver.prefetch;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class PerformanceData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f23471a = "";
    public PFResult b = PFResult.SUCCESS;
    public String c = "";
    public long d = 0;
    public long e = 0;

    /* loaded from: classes9.dex */
    public enum PFResult {
        EXCEPT("-1", "exception"),
        SUCCESS("0", "success"),
        INVAILD_URL("101", "Invalid URL"),
        NO_PREFETCH_DATA("102", "No prefetch data"),
        DATA_EXPIRED("201", "Data expired");
        
        String code;
        String msg;

        PFResult(String str, String str2) {
            this.code = str;
            this.msg = str2;
        }

        public String getCode() {
            return this.code;
        }

        public String getMsg() {
            return this.msg;
        }

        public void setCode(String str) {
            this.code = str;
        }

        public void setMsg(String str) {
            this.msg = str;
        }
    }

    public PFResult a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PFResult) ipChange.ipc$dispatch("e7f3ae10", new Object[]{this}) : this.b;
    }
}
