package com.taobao.android.ugc.uploader;

import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.i;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class UploaderTask implements i, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bizType;
    public String filePath;
    public String fileType;
    public Map<String, String> metaInfo = new HashMap();

    static {
        kge.a(-1677091773);
        kge.a(671985108);
        kge.a(1028243835);
    }

    @Override // com.uploader.export.i
    public String getBizType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this}) : this.bizType;
    }

    @Override // com.uploader.export.i
    public String getFilePath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this}) : this.filePath;
    }

    @Override // com.uploader.export.i
    public String getFileType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this}) : this.fileType;
    }

    @Override // com.uploader.export.i
    public Map<String, String> getMetaInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this}) : this.metaInfo;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UploaderTask{bizType='" + this.bizType + "', filePath='" + this.filePath + "', fileType='" + this.fileType + "', metaInfo=" + this.metaInfo + '}';
    }
}
