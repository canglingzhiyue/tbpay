package com.alibaba.poplayer.norm;

import android.content.Context;
import com.alibaba.poplayer.layermanager.PopRequest;

/* loaded from: classes.dex */
public interface IFaceAdapter {
    boolean cancelPopCheckRequest(PopRequest popRequest);

    boolean doneConstraintMockRequest();

    String getCurAppVersion(Context context);

    long getCurrentTimeStamp(Context context);

    String getDeviceId();

    String getUTCurPageName();

    String getUserId();

    void navToUrl(Context context, String str);

    void preparePopCheckRequest(PopRequest popRequest);

    void registerNavPreprocessor(Context context);

    void registerTrackViewTypes(Context context);

    boolean startPopCheckRequest(PopRequest popRequest, IUserCheckRequestListener iUserCheckRequestListener);
}
