package com.alipay.zoloz.toyger.interfaces;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.workspace.BioFragmentResponse;
import com.alipay.mobile.security.faceauth.UserVerifyInfo;
import com.alipay.zoloz.toyger.util.DialogTypeIndex;
import com.alipay.zoloz.toyger.workspace.FaceRemoteConfig;

/* loaded from: classes3.dex */
public interface ToygerCallback {
    Dialog alert(DialogTypeIndex dialogTypeIndex, String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, String str5, DialogInterface.OnClickListener onClickListener2, boolean z, boolean z2, DialogCallback dialogCallback);

    void finishActivity(boolean z);

    Activity getActivity();

    DialogTypeIndex getAlertTag();

    BioAppDescription getAppDescription();

    FaceRemoteConfig getRemoteConfig();

    int getRetryTime();

    UserVerifyInfo getUserVerifyInfo();

    void gotoSettings();

    boolean haveCameraPermission();

    boolean isRequestingCameraPermission();

    boolean isStale();

    void sendAvatarResponse(BioFragmentResponse bioFragmentResponse);

    void sendProgressResponse(BioFragmentResponse bioFragmentResponse);

    void sendResponse(int i, String str);

    void sendResponse(int i, String str, String str2);

    void sendResponse(BioFragmentResponse bioFragmentResponse);

    void setCameraPermission(boolean z);

    void setIsRequestingCameraPermission(boolean z);

    void setRetryTime(int i);
}
