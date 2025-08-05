package com.taobao.android.litecreator.base.data;

import android.net.Uri;
import com.taobao.android.litecreator.base.workflow.IWorkflowData;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes5.dex */
public interface IUGCMedia extends a<IUGCMedia>, com.taobao.android.litecreator.base.data.meta.a, IWorkflowData, Serializable {
    public static final int TYPE_IMAGE = 1;
    public static final int TYPE_NONE = 0;
    public static final int TYPE_VIDEO = 2;

    void appendImage(UGCImage uGCImage);

    void appendVideo(UGCVideo uGCVideo);

    UGCBiz getBiz();

    List<UGCImage> getImages();

    String getPublishSessionId();

    int getType();

    List<UGCVideo> getVideos();

    void initPublishSessionId(Uri uri);

    void removeImage(UGCImage uGCImage);

    void resetMedia();

    void setBiz(UGCBiz uGCBiz);

    void setPublishSessionId(String str);

    void setType(int i);

    void swapImage(int i, int i2);
}
