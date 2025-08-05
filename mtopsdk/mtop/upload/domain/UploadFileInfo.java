package mtopsdk.mtop.upload.domain;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.upload.DefaultFileUploadListener;
import mtopsdk.mtop.upload.FileUploadBaseListener;
import mtopsdk.mtop.upload.FileUploadListener;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class UploadFileInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bizCode;
    public String filePath;
    @Deprecated
    public FileStreamInfo fileStreamInfo;
    public FileUploadBaseListener listener;
    @Deprecated
    public String ownerNick;
    @Deprecated
    public String privateData;
    @Deprecated
    public FileUploadTypeEnum type = FileUploadTypeEnum.RESUMABLE;
    public boolean useHttps = false;

    static {
        kge.a(-1932063182);
    }

    @Deprecated
    public String getFilePath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this}) : this.filePath;
    }

    @Deprecated
    public void setFilePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8812494", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.filePath = str;
        }
    }

    @Deprecated
    public String getBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this}) : this.bizCode;
    }

    @Deprecated
    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.bizCode = str;
        }
    }

    @Deprecated
    public FileStreamInfo getFileStreamInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FileStreamInfo) ipChange.ipc$dispatch("dd9896c7", new Object[]{this}) : this.fileStreamInfo;
    }

    @Deprecated
    public void setFileStreamInfo(FileStreamInfo fileStreamInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85d42dd", new Object[]{this, fileStreamInfo});
        } else {
            this.fileStreamInfo = fileStreamInfo;
        }
    }

    @Deprecated
    public String getOwnerNick() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6f0a10f9", new Object[]{this}) : this.ownerNick;
    }

    @Deprecated
    public void setOwnerNick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f475ca05", new Object[]{this, str});
        } else {
            this.ownerNick = str;
        }
    }

    @Deprecated
    public String getPrivateData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f6aacc2", new Object[]{this}) : this.privateData;
    }

    @Deprecated
    public void setPrivateData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75a21a5c", new Object[]{this, str});
        } else {
            this.privateData = str;
        }
    }

    @Deprecated
    public FileUploadTypeEnum getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FileUploadTypeEnum) ipChange.ipc$dispatch("28822329", new Object[]{this}) : this.type;
    }

    @Deprecated
    public void setType(FileUploadTypeEnum fileUploadTypeEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fe4b19f", new Object[]{this, fileUploadTypeEnum});
        } else if (fileUploadTypeEnum == null) {
        } else {
            this.type = fileUploadTypeEnum;
        }
    }

    @Deprecated
    public FileUploadBaseListener getListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FileUploadBaseListener) ipChange.ipc$dispatch("4613636e", new Object[]{this}) : this.listener;
    }

    @Deprecated
    public void setListener(FileUploadListener fileUploadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c14337", new Object[]{this, fileUploadListener});
        } else if (fileUploadListener == null) {
        } else {
            if (fileUploadListener instanceof FileUploadBaseListener) {
                this.listener = (FileUploadBaseListener) fileUploadListener;
            } else {
                this.listener = new DefaultFileUploadListener(fileUploadListener);
            }
        }
    }

    @Deprecated
    public void setListener(FileUploadBaseListener fileUploadBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9cd9e26", new Object[]{this, fileUploadBaseListener});
        } else {
            this.listener = fileUploadBaseListener;
        }
    }

    @Deprecated
    public boolean isUseHttps() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1da8b479", new Object[]{this})).booleanValue() : this.useHttps;
    }

    @Deprecated
    public void setUseHttps(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666558c7", new Object[]{this, new Boolean(z)});
        } else {
            this.useHttps = z;
        }
    }

    public boolean isValid() {
        FileStreamInfo fileStreamInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (StringUtils.isBlank(this.bizCode)) {
            return false;
        }
        return !StringUtils.isBlank(this.filePath) || ((fileStreamInfo = this.fileStreamInfo) != null && fileStreamInfo.isValid());
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("UploadFileInfo [filePath=");
        sb.append(this.filePath);
        sb.append(", fileStreamInfo=");
        sb.append(this.fileStreamInfo);
        sb.append(", bizCode=");
        sb.append(this.bizCode);
        sb.append(", ownerNick=");
        sb.append(this.ownerNick);
        sb.append(", privateData=");
        sb.append(this.type);
        sb.append(", listener=");
        sb.append(this.listener);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.bizCode;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.filePath;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        FileStreamInfo fileStreamInfo = this.fileStreamInfo;
        int hashCode3 = (hashCode2 + (fileStreamInfo == null ? 0 : fileStreamInfo.hashCode())) * 31;
        FileUploadBaseListener fileUploadBaseListener = this.listener;
        int hashCode4 = (hashCode3 + (fileUploadBaseListener == null ? 0 : fileUploadBaseListener.hashCode())) * 31;
        String str3 = this.ownerNick;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.privateData;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FileUploadTypeEnum fileUploadTypeEnum = this.type;
        if (fileUploadTypeEnum != null) {
            i = fileUploadTypeEnum.hashCode();
        }
        return hashCode6 + i;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadFileInfo uploadFileInfo = (UploadFileInfo) obj;
        String str = this.bizCode;
        if (str == null) {
            if (uploadFileInfo.bizCode != null) {
                return false;
            }
        } else if (!str.equals(uploadFileInfo.bizCode)) {
            return false;
        }
        String str2 = this.filePath;
        if (str2 == null) {
            if (uploadFileInfo.filePath != null) {
                return false;
            }
        } else if (!str2.equals(uploadFileInfo.filePath)) {
            return false;
        }
        FileStreamInfo fileStreamInfo = this.fileStreamInfo;
        if (fileStreamInfo == null) {
            if (uploadFileInfo.fileStreamInfo != null) {
                return false;
            }
        } else if (!fileStreamInfo.equals(uploadFileInfo.fileStreamInfo)) {
            return false;
        }
        FileUploadBaseListener fileUploadBaseListener = this.listener;
        if (fileUploadBaseListener == null) {
            if (uploadFileInfo.listener != null) {
                return false;
            }
        } else if (!fileUploadBaseListener.equals(uploadFileInfo.listener)) {
            return false;
        }
        String str3 = this.ownerNick;
        if (str3 == null) {
            if (uploadFileInfo.ownerNick != null) {
                return false;
            }
        } else if (!str3.equals(uploadFileInfo.ownerNick)) {
            return false;
        }
        String str4 = this.privateData;
        if (str4 == null) {
            if (uploadFileInfo.privateData != null) {
                return false;
            }
        } else if (!str4.equals(uploadFileInfo.privateData)) {
            return false;
        }
        return this.type == uploadFileInfo.type;
    }
}
