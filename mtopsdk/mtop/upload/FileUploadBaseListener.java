package mtopsdk.mtop.upload;

import mtopsdk.mtop.upload.domain.UploadFileInfo;

/* loaded from: classes9.dex */
public interface FileUploadBaseListener extends FileUploadListener {
    void onError(String str, String str2, String str3);

    @Override // mtopsdk.mtop.upload.FileUploadListener
    void onFinish(UploadFileInfo uploadFileInfo, String str);

    @Override // mtopsdk.mtop.upload.FileUploadListener
    void onProgress(int i);

    @Override // mtopsdk.mtop.upload.FileUploadListener
    void onStart();
}
