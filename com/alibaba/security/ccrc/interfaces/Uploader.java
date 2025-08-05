package com.alibaba.security.ccrc.interfaces;

import com.alibaba.security.wukong.model.meta.Data;

/* loaded from: classes3.dex */
public interface Uploader {

    /* loaded from: classes3.dex */
    public interface UploadFinishListener {
        void onFail(String str);

        void onSuccess(String str);
    }

    void upload(Data data, UploadFinishListener uploadFinishListener);
}
