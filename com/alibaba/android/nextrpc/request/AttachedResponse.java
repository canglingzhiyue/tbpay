package com.alibaba.android.nextrpc.request;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class AttachedResponse extends AbsResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    private final String errorCode;
    private final String errorMsg;
    private final int seqCount;
    private final int seqNum;
    private final boolean success;

    public AttachedResponse(String str, String str2, Map<String, List<String>> map, int i, int i2, boolean z, String str3, String str4) {
        super(str, str2, map);
        this.seqNum = i;
        this.seqCount = i2;
        this.success = z;
        this.errorCode = str3;
        this.errorMsg = str4;
    }

    public Integer getSeqNum() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("db4e35cb", new Object[]{this}) : Integer.valueOf(this.seqNum);
    }

    public Integer getSeqCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("aed7c4d4", new Object[]{this}) : Integer.valueOf(this.seqCount);
    }

    public Boolean isSucceed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("49a0dfc", new Object[]{this}) : Boolean.valueOf(this.success);
    }

    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this}) : this.errorCode;
    }

    public String getErrorMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this}) : this.errorMsg;
    }

    public String getBizName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        List<String> list = getHeaders().get("bizName");
        return (list == null || list.isEmpty()) ? "" : list.get(0);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AttachedResponse{bizName=" + getBizName() + "seqNum=" + this.seqNum + '}';
    }
}
