package com.taobao.fence.common;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class ContentData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String content;
    public int errorCode;
    public String errorMsg;
    public String extraContent;
    public boolean success;

    static {
        kge.a(1736281424);
    }

    public ContentData() {
    }

    public ContentData(boolean z, ResultEnums resultEnums) {
        this.success = z;
        if (resultEnums != null) {
            this.errorCode = resultEnums.code;
            this.errorMsg = resultEnums.message;
        }
    }

    public String getContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this}) : this.content;
    }
}
