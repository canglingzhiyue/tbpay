package mtopsdk.mtop.upload.domain;

/* loaded from: classes9.dex */
public enum FileUploadTypeEnum {
    RESUMABLE("resumable"),
    NORMAL("normal");
    
    private String uploadType;

    FileUploadTypeEnum(String str) {
        this.uploadType = str;
    }

    public String getUploadType() {
        return this.uploadType;
    }
}
