package mtopsdk.mtop.upload;

import mtopsdk.mtop.upload.domain.UploadFileInfo;

@Deprecated
/* loaded from: classes9.dex */
public interface FileUploadListener {
    @Deprecated
    void onError(String str, String str2);

    @Deprecated
    void onFinish(String str);

    void onFinish(UploadFileInfo uploadFileInfo, String str);

    void onProgress(int i);

    void onStart();
}
