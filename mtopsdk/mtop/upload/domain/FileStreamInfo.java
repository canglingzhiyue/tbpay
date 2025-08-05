package mtopsdk.mtop.upload.domain;

import java.io.InputStream;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;
import tb.riy;

@Deprecated
/* loaded from: classes9.dex */
public class FileStreamInfo implements IMTOPDataObject {
    public long fileLength;
    private String fileName;
    private InputStream fileStream;

    static {
        kge.a(-681768015);
        kge.a(-350052935);
    }

    public FileStreamInfo(InputStream inputStream, String str) {
        this.fileStream = inputStream;
        this.fileName = str;
    }

    public InputStream getFileStream() {
        return this.fileStream;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int hashCode() {
        String str = this.fileName;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        InputStream inputStream = this.fileStream;
        if (inputStream != null) {
            i = inputStream.hashCode();
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileStreamInfo fileStreamInfo = (FileStreamInfo) obj;
        String str = this.fileName;
        if (str == null) {
            if (fileStreamInfo.fileName != null) {
                return false;
            }
        } else if (!str.equals(fileStreamInfo.fileName)) {
            return false;
        }
        InputStream inputStream = this.fileStream;
        if (inputStream == null) {
            if (fileStreamInfo.fileStream != null) {
                return false;
            }
        } else if (!inputStream.equals(fileStreamInfo.fileStream)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("FileStreamInfo [fileStream=");
        sb.append(this.fileStream);
        sb.append(", fileName=");
        sb.append(this.fileName);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }

    public boolean isValid() {
        return !StringUtils.isBlank(this.fileName) && this.fileStream != null;
    }
}
