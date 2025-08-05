package com.alipay.bis.core.protocol;

import com.alipay.mobile.security.bio.runtime.download.BioDownloadItem;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BioModelFile implements BioDownloadItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String fileName;
    private String md5;
    private String savePath;
    private String url;
    private String version;

    @Override // com.alipay.mobile.security.bio.runtime.download.BioDownloadItem
    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.url;
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }

    @Override // com.alipay.mobile.security.bio.runtime.download.BioDownloadItem
    public String getFileName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("787e7f7c", new Object[]{this}) : this.fileName;
    }

    public void setFileName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("222eca7a", new Object[]{this, str});
        } else {
            this.fileName = str;
        }
    }

    @Override // com.alipay.mobile.security.bio.runtime.download.BioDownloadItem
    public String getMd5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91115b1", new Object[]{this}) : this.md5;
    }

    public void setMd5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e834d", new Object[]{this, str});
        } else {
            this.md5 = str;
        }
    }

    @Override // com.alipay.mobile.security.bio.runtime.download.BioDownloadItem
    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.version;
    }

    public void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.version = str;
        }
    }

    @Override // com.alipay.mobile.security.bio.runtime.download.BioDownloadItem
    public String getSavePath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eb7c8141", new Object[]{this}) : this.savePath;
    }

    @Override // com.alipay.mobile.security.bio.runtime.download.BioDownloadItem
    public void setSavePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef10155", new Object[]{this, str});
        } else {
            this.savePath = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BioModelFile{url='" + this.url + "', fileName='" + this.fileName + "', md5='" + this.md5 + "', version='" + this.version + "', savePath='" + this.savePath + "'}";
    }
}
