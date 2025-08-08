package com.alipay.zoloz.toyger.workspace;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.config.bean.FaceTips;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.NetworkUtil;
import com.alipay.mobile.security.bio.workspace.BioFragmentContainer;
import com.alipay.mobile.security.bio.workspace.BioFragmentResponse;
import com.alipay.mobile.security.bio.workspace.BioTransferLifecycleRegistry;
import com.alipay.mobile.security.faceauth.UserVerifyInfo;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.zoloz.toyger.extservice.record.TimeRecord;
import com.alipay.zoloz.toyger.extservice.record.ToygerRecordService;
import com.alipay.zoloz.toyger.interfaces.DialogCallback;
import com.alipay.zoloz.toyger.interfaces.ToygerCallback;
import com.alipay.zoloz.toyger.interfaces.ToygerEvent;
import com.alipay.zoloz.toyger.util.DialogTypeIndex;
import com.alipay.zoloz.toyger.widget.GenenalDialog;
import com.alipay.zoloz.toyger.workspace.alert.AlertHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class GarfieldActivity extends BioFragmentContainer implements ToygerCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ToygerRecordService f;
    public DialogTypeIndex mDialogTypeIndex;
    public int mRetryTime;
    public FaceRemoteConfig mFaceRemoteConfig = null;
    public boolean mCameraPermission = true;
    private boolean g = false;
    private AtomicBoolean h = new AtomicBoolean(false);
    private int i = 0;

    public static /* synthetic */ Object ipc$super(GarfieldActivity garfieldActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -383888558:
                super.sendResponseWithSubcode(((Number) objArr[0]).intValue(), (String) objArr[1], (String) objArr[2]);
                return null;
            case -60250432:
                super.sendResponse((BioFragmentResponse) objArr[0]);
                return null;
            case 90991720:
                super.a();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 323739864:
                super.setRequestedOrientation(((Number) objArr[0]).intValue());
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1507585555:
                super.sendResponse((String) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alipay.mobile.security.bio.workspace.BioFragmentContainer, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // com.alipay.zoloz.toyger.interfaces.ToygerCallback
    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this}) : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ca, code lost:
        if ("sys".equals(r7.mFaceRemoteConfig.getColl().getPreviewStyle()) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ec, code lost:
        if ("sys".equals(r7.mFaceRemoteConfig.getColl().getPreviewStyle()) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ee, code lost:
        r7.mFaceRemoteConfig.getColl().setShowFace(false);
     */
    @Override // com.alipay.mobile.security.bio.workspace.BioFragmentContainer, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.toyger.workspace.GarfieldActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134be0d8", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            super.setRequestedOrientation(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) {
            getWindow().getDecorView().setSystemUiVisibility(8);
        } else if (Build.VERSION.SDK_INT < 19) {
        } else {
            getWindow().getDecorView().setSystemUiVisibility(4102);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            new Thread(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.GarfieldActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ZimRecordService zimRecordService = (ZimRecordService) BioServiceManager.getCurrentInstance().getBioService(ZimRecordService.class);
                    String str = null;
                    if (GarfieldActivity.this.mFaceRemoteConfig != null && GarfieldActivity.this.mFaceRemoteConfig.getUpload() != null) {
                        str = GarfieldActivity.this.mFaceRemoteConfig.getUpload().getString("log_classifier");
                    }
                    if (StringUtils.isEmpty(str)) {
                        str = MetaRecord.DEFAULT_LOG_CLASSIFIERS;
                    }
                    zimRecordService.setLogClassifier(new HashSet(Arrays.asList(str.split("#"))));
                }
            }, "preload_toyger").start();
        }
    }

    @Override // com.alipay.mobile.security.bio.workspace.BioFragmentContainer
    public void sendResponse(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59dbee13", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        BioFragmentResponse bioFragmentResponse = new BioFragmentResponse();
        bioFragmentResponse.errorCode = i;
        a(bioFragmentResponse);
        super.sendResponse(str, i, str2);
    }

    @Override // com.alipay.zoloz.toyger.interfaces.ToygerCallback
    public void sendResponse(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8faaf41d", new Object[]{this, new Integer(i), str});
        } else {
            sendResponse(i, str, "");
        }
    }

    @Override // com.alipay.zoloz.toyger.interfaces.ToygerCallback
    public void sendResponse(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6830a7", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        BioFragmentResponse bioFragmentResponse = new BioFragmentResponse();
        bioFragmentResponse.errorCode = i;
        a(bioFragmentResponse);
        super.sendResponseWithSubcode(i, str, str2);
    }

    @Override // com.alipay.mobile.security.bio.workspace.BioFragmentContainer, com.alipay.zoloz.toyger.interfaces.ToygerCallback
    public void sendResponse(BioFragmentResponse bioFragmentResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc68a6c0", new Object[]{this, bioFragmentResponse});
            return;
        }
        a(bioFragmentResponse);
        super.sendResponse(bioFragmentResponse);
    }

    @Override // com.alipay.zoloz.toyger.interfaces.ToygerCallback
    public FaceRemoteConfig getRemoteConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FaceRemoteConfig) ipChange.ipc$dispatch("1b81260c", new Object[]{this}) : this.mFaceRemoteConfig;
    }

    @Override // com.alipay.zoloz.toyger.interfaces.ToygerCallback
    public Dialog alert(DialogTypeIndex dialogTypeIndex, String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, String str5, DialogInterface.OnClickListener onClickListener2, boolean z, boolean z2, DialogCallback dialogCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("a3132bf3", new Object[]{this, dialogTypeIndex, str, str2, str3, str4, onClickListener, str5, onClickListener2, new Boolean(z), new Boolean(z2), dialogCallback});
        }
        GenenalDialog genenalDialog = null;
        if (!isFinishing()) {
            GenenalDialog.Builder builder = new GenenalDialog.Builder(this);
            if (str2 != null) {
                builder.setTitle(str2);
            }
            if (str3 != null) {
                builder.setMessage2(str3);
            }
            if (str4 != null) {
                builder.setPositiveButton(str4, onClickListener);
            }
            if (str5 != null) {
                builder.setNegativeButton(str5, onClickListener2);
            }
            if (!DialogTypeIndex.DIALOG_TYPE_INDEX_NO_PERMISSION_OF_CAMERA.equals(dialogTypeIndex)) {
                builder.setToGarfieldFaceless(this.g);
            }
            builder.showCloseButton(false);
            builder.showProtocol(false);
            this.mDialogTypeIndex = dialogTypeIndex;
            genenalDialog = builder.show();
            genenalDialog.setCanceledOnTouchOutside(z);
            genenalDialog.setCancelable(false);
            genenalDialog.setTag(dialogTypeIndex);
            genenalDialog.setCallback(dialogCallback);
            try {
                genenalDialog.getWindow().setGravity(17);
            } catch (Exception unused) {
                BioLog.e("setGravity failed, decorView not attached");
            }
        }
        return genenalDialog;
    }

    @Override // com.alipay.zoloz.toyger.interfaces.ToygerCallback
    public DialogTypeIndex getAlertTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogTypeIndex) ipChange.ipc$dispatch("8fc4e832", new Object[]{this}) : this.mDialogTypeIndex;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (this.d != null) {
            z = ((ToygerEvent) this.d).ontActivityEvent(i, keyEvent);
        }
        if (!z) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // com.alipay.zoloz.toyger.interfaces.ToygerCallback
    public void gotoSettings() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4b5502d", new Object[]{this});
            return;
        }
        Intent intent = new Intent("android.settings.SETTINGS");
        intent.setFlags(268435456);
        startActivity(intent);
    }

    @Override // com.alipay.zoloz.toyger.interfaces.ToygerCallback
    public int getRetryTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d972c3d9", new Object[]{this})).intValue() : this.mRetryTime;
    }

    @Override // com.alipay.zoloz.toyger.interfaces.ToygerCallback
    public void setRetryTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdc93e9", new Object[]{this, new Integer(i)});
        } else if (this.mRetryTime == i) {
        } else {
            this.mRetryTime = i;
        }
    }

    @Override // com.alipay.zoloz.toyger.interfaces.ToygerCallback
    public boolean haveCameraPermission() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("770aa6e7", new Object[]{this})).booleanValue() : this.mCameraPermission;
    }

    @Override // com.alipay.zoloz.toyger.interfaces.ToygerCallback
    public void setCameraPermission(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63526d97", new Object[]{this, new Boolean(z)});
        } else {
            this.mCameraPermission = z;
        }
    }

    @Override // com.alipay.zoloz.toyger.interfaces.ToygerCallback
    public void setIsRequestingCameraPermission(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab1d4da", new Object[]{this, new Boolean(z)});
        } else {
            this.h.set(z);
        }
    }

    @Override // com.alipay.zoloz.toyger.interfaces.ToygerCallback
    public boolean isRequestingCameraPermission() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dc9fccbc", new Object[]{this})).booleanValue() : this.h.get();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SharedPreferences getSharedPreferences(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("fd9d24e9", new Object[]{this, str, new Integer(i)}) : getApplicationContext().getSharedPreferences(str, i);
    }

    @Override // com.alipay.zoloz.toyger.interfaces.ToygerCallback
    public UserVerifyInfo getUserVerifyInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserVerifyInfo) ipChange.ipc$dispatch("b77bd1b3", new Object[]{this});
        }
        UserVerifyInfo userVerifyInfo = new UserVerifyInfo();
        userVerifyInfo.actid = "circle";
        String str = "";
        userVerifyInfo.apdid = this.e.getExtProperty().get("APDID") != null ? this.e.getExtProperty().get("APDID") : str;
        userVerifyInfo.appid = this.e.getExtProperty().get("appid") != null ? this.e.getExtProperty().get("appid") : str;
        userVerifyInfo.behid = this.e.getTag();
        userVerifyInfo.sceid = this.e.getExtProperty().get("SCENE_ID") != null ? this.e.getExtProperty().get("SCENE_ID") : str;
        userVerifyInfo.bistoken = this.e.getBistoken();
        userVerifyInfo.userid = this.e.getExtProperty().get("userid") != null ? this.e.getExtProperty().get("userid") : str;
        userVerifyInfo.vtoken = this.e.getExtProperty().get("TOKEN_ID") != null ? this.e.getExtProperty().get("TOKEN_ID") : str;
        if (this.e.getExtProperty().get("verifyid") != null) {
            str = this.e.getExtProperty().get("verifyid");
        }
        userVerifyInfo.verifyid = str;
        return userVerifyInfo;
    }

    @Override // com.alipay.zoloz.toyger.interfaces.ToygerCallback
    public boolean isStale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc30159a", new Object[]{this})).booleanValue();
        }
        int i = this.i;
        return (i == 0 || i == BioTransferLifecycleRegistry.getInstance().getLastServiceManagerOwnerDetectorId()) ? false : true;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        e();
        super.onPause();
        BioTransferLifecycleRegistry.getInstance().markActivityState(this.i, BioTransferLifecycleRegistry.BioActivityState.CREATED);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }

    @Override // com.alipay.mobile.security.bio.workspace.BioFragmentContainer, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        BioLog.i("ToygerActivity destroy!");
        super.onDestroy();
        BioTransferLifecycleRegistry.getInstance().markActivityState(this.i, BioTransferLifecycleRegistry.BioActivityState.DESTROYED);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        BioTransferLifecycleRegistry.getInstance().markActivityState(this.i, BioTransferLifecycleRegistry.BioActivityState.RESUMED);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.d != null) {
            ((ToygerEvent) this.d).onWindowFocusChanged(z);
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.alipay.mobile.security.bio.workspace.BioFragmentContainer
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f.write(ToygerRecordService.NOTICE_EXIT_SDK);
        super.a();
    }

    private void d() {
        ApSecurityService apSecurityService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.e == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("sceneId", this.mFaceRemoteConfig.getSceneEnv().getSceneCode() + "");
            hashMap.put("uiVersion", this.mFaceRemoteConfig.getUi() + "");
            hashMap.put(Constants.VI_ENGINE_VERIFYID, this.e.getExtProperty().get("verifyid"));
            String staticApDidToken = ApSecurityService.getStaticApDidToken();
            if (StringUtils.isEmpty(staticApDidToken) && (apSecurityService = (ApSecurityService) BioServiceManager.getCurrentInstance().getBioService(ApSecurityService.class)) != null) {
                staticApDidToken = apSecurityService.getApDidToken();
            }
            hashMap.put("APDIDTOKEN", staticApDidToken);
            hashMap.put("TOKEN_ID", this.e.getExtProperty().get("TOKEN_ID"));
            hashMap.put(DraftMediaHelper.DraftType.PRODUCT, "toyger");
            hashMap.put("bioType", "facedetect");
            hashMap.put("networkType", NetworkUtil.getNetworkType(this));
            hashMap.put("configVersion", this.mFaceRemoteConfig.getConfigVersion());
            String str = this.e.getExtProperty().get(AlertHelper.localFaceTipsKey);
            if (str != null && str.length() > 0) {
                hashMap.put(AlertHelper.localFaceTipsKey, str);
            }
            this.f.addExtProperties(hashMap);
            this.f.write(ToygerRecordService.ENTRY_SDK, hashMap);
            TimeRecord.getInstance().setEntrySdkTime(System.currentTimeMillis());
        }
    }

    private void a(BioFragmentResponse bioFragmentResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0076938", new Object[]{this, bioFragmentResponse});
            return;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        Object obj = str;
        if (bioFragmentResponse != null) {
            obj = Integer.valueOf(bioFragmentResponse.errorCode);
        }
        sb.append(obj);
        hashMap.put("returncode", sb.toString());
        this.f.write(ToygerRecordService.CALLBACK_VERIFY_SYSTEM, hashMap);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("timecost", (System.currentTimeMillis() - TimeRecord.getInstance().getEntrySdkTime()) + "");
        ToygerRecordService toygerRecordService = this.f;
        if (toygerRecordService == null) {
            return;
        }
        toygerRecordService.write(ToygerRecordService.EXIT_SDK, hashMap);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        FaceRemoteConfig faceRemoteConfig = this.mFaceRemoteConfig;
        if (faceRemoteConfig == null) {
            this.mFaceRemoteConfig = new FaceRemoteConfig();
            this.mFaceRemoteConfig.setFaceTips(new FaceTips());
        } else if (faceRemoteConfig.getFaceTips() != null) {
        } else {
            this.mFaceRemoteConfig.setFaceTips(new FaceTips());
        }
    }
}
