package com.alipay.zoloz.toyger.workspace;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.constants.ZcodeConstants;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.ScreenUtil;
import com.alipay.zoloz.toyger.extservice.record.TimeRecord;
import com.alipay.zoloz.toyger.extservice.record.ToygerRecordService;
import com.alipay.zoloz.toyger.util.ObjectUtil;
import com.alipay.zoloz.toyger.widget.ToygerCirclePattern;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.speech.util.e;
import com.taobao.taobao.R;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ToygerCaptureFragment extends ToygerFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int REQUEST_CAMERA = 1;
    public View mContentView;
    public boolean mIsFirstResume;
    public ToygerCirclePattern mToygerCirclePattern;
    public ToygerWorkspace mToygerWorkspace;
    public boolean mFirstSurfaceChange = false;
    private int mLight = 200;

    public static /* synthetic */ Object ipc$super(ToygerCaptureFragment toygerCaptureFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1043724602:
                return new Boolean(super.ontActivityEvent(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void onCameraPermission(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6cdc3a", new Object[]{this, new Boolean(z)});
        }
    }

    public void onProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288e5c17", new Object[]{this});
        }
    }

    public void onProcessDone(ToygerCirclePattern.UIProcessEndCallback uIProcessEndCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eaab33", new Object[]{this, uIProcessEndCallback});
        }
    }

    public void onProcessReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2fe4a6", new Object[]{this});
        }
    }

    public static /* synthetic */ int access$000(ToygerCaptureFragment toygerCaptureFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c0a8d20c", new Object[]{toygerCaptureFragment})).intValue() : toygerCaptureFragment.mLight;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        BioLog.i("Fragment onCreate");
        if (this.mToygerCallback == null || this.mToygerCallback.getRemoteConfig() == null || this.mToygerCallback.getRemoteConfig().getColl() == null) {
            return;
        }
        this.mLight = this.mToygerCallback.getRemoteConfig().getColl().getLight();
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        BioLog.i("Fragment onCreateView");
        try {
            if (this.mContentView != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.mContentView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.mContentView);
                }
            } else {
                initView(layoutInflater, viewGroup);
            }
            recordExtDetectionStart(this.mToygerCallback.getRemoteConfig().getAlgorithm(), false);
        } catch (Throwable th) {
            BioLog.e(Log.getStackTraceString(th));
            if (this.mToygerCallback != null) {
                this.mToygerCallback.finishActivity(false);
                this.mToygerCallback.sendResponse(205, ZcodeConstants.ZCODE_SYSTEM_EXC);
            }
        }
        return this.mContentView;
    }

    public static void sendTimeRecordBroadCast(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8fc2f0", new Object[]{context, str});
            return;
        }
        Intent intent = new Intent("com.alipay.mobile.security.bio.action.send.timerecord");
        intent.setPackage(context.getPackageName());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        intent.putExtra(str, elapsedRealtime);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        BioLog.i("timerecord", str + ":" + elapsedRealtime + "," + context.getPackageName());
    }

    private void initView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39352c05", new Object[]{this, layoutInflater, viewGroup});
            return;
        }
        this.mContentView = layoutInflater.inflate(R.layout.toyger_circle_pattern_component, viewGroup, false);
        this.mToygerCirclePattern = (ToygerCirclePattern) this.mContentView.findViewById(R.id.toyger_circle_pattern_component);
        this.mToygerCirclePattern.init(this.mToygerCallback.getRemoteConfig());
        BioLog.i("Test onCreateView");
        this.mToygerWorkspace = new ToygerWorkspace(this.mBioServiceManager, this.mToygerCallback, this.mToygerCirclePattern);
        if (!this.mToygerWorkspace.isIfaaMode()) {
            initCommon();
        } else {
            this.mToygerWorkspace.init();
        }
    }

    public void initCommon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d1bee22", new Object[]{this});
            return;
        }
        if (isSupportPermissionDialog()) {
            if (ActivityCompat.checkSelfPermission(getActivity(), e.CAMERA) != 0) {
                sendTimeRecordBroadCast(getActivity(), "startAuthCamera");
                onCameraPermission(false);
                this.mToygerCallback.setCameraPermission(false);
                this.mToygerWorkspace.setCameraVisible(false);
                requestCameraPermission();
            } else if (this.mToygerCallback.getRemoteConfig().getColl().isAuthorization()) {
                this.mToygerWorkspace.alertFirstLogin();
                onCameraPermission(false);
                this.mToygerCallback.setCameraPermission(false);
                this.mToygerWorkspace.setCameraVisible(false);
            } else {
                onCameraPermission(true);
                this.mToygerCallback.setCameraPermission(true);
                this.mToygerWorkspace.setCameraVisible(true);
                this.mToygerWorkspace.setHasCameraPermissionFlag(true);
            }
        } else if (this.mToygerCallback.getRemoteConfig().getColl().isAuthorization()) {
            this.mToygerWorkspace.alertFirstLogin();
            onCameraPermission(false);
            this.mToygerWorkspace.setCameraVisible(false);
            this.mToygerWorkspace.setHasCameraPermissionFlag(false);
        } else {
            onCameraPermission(true);
            this.mToygerCallback.setCameraPermission(true);
            this.mToygerWorkspace.setCameraVisible(true);
            this.mToygerWorkspace.setHasCameraPermissionFlag(true);
        }
        this.mToygerWorkspace.init();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        BioLog.i("Fragment onDestroy");
        ToygerWorkspace toygerWorkspace = this.mToygerWorkspace;
        if (toygerWorkspace != null) {
            toygerWorkspace.destroy();
        }
        super.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        BioLog.i("Fragment onStop");
        ToygerWorkspace toygerWorkspace = this.mToygerWorkspace;
        if (toygerWorkspace != null) {
            if (getActivity() == null || getActivity().isFinishing()) {
                z = true;
            }
            toygerWorkspace.stop(z);
        }
        super.onStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        BioLog.i("Fragment onPause");
        ToygerWorkspace toygerWorkspace = this.mToygerWorkspace;
        if (toygerWorkspace != null) {
            toygerWorkspace.pause();
        }
        super.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        BioLog.i("Fragment onResume");
        if (!this.mIsFirstResume) {
            this.mIsFirstResume = true;
            recordExtDetectionEnd();
        }
        ToygerWorkspace toygerWorkspace = this.mToygerWorkspace;
        if (toygerWorkspace != null) {
            toygerWorkspace.resume();
        }
        new Handler().post(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerCaptureFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ToygerCaptureFragment.access$000(ToygerCaptureFragment.this) <= ScreenUtil.getScreenBrightness(ToygerCaptureFragment.this.getContext())) {
                } else {
                    ScreenUtil.setScreenBrightness(ToygerCaptureFragment.this.getActivity(), ToygerCaptureFragment.access$000(ToygerCaptureFragment.this));
                }
            }
        });
        super.onResume();
    }

    @Override // com.alipay.zoloz.toyger.workspace.ToygerFragment, com.alipay.zoloz.toyger.interfaces.ToygerEvent
    public boolean ontActivityEvent(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e35f93a", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        ToygerWorkspace toygerWorkspace = this.mToygerWorkspace;
        if (toygerWorkspace != null) {
            return toygerWorkspace.ontActivityEvent(i, keyEvent);
        }
        return super.ontActivityEvent(i, keyEvent);
    }

    public boolean isSupportPermissionDialog() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("74cb2fe7", new Object[]{this})).booleanValue() : Build.VERSION.SDK != null && Integer.parseInt(Build.VERSION.SDK) >= 23;
    }

    public void requestCameraPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f73be8a", new Object[]{this});
            return;
        }
        requestPermissions(new String[]{e.CAMERA}, 1);
        if (this.mToygerCallback == null) {
            return;
        }
        this.mToygerCallback.setIsRequestingCameraPermission(true);
    }

    @Override // com.alipay.zoloz.toyger.workspace.ToygerFragment, com.alipay.zoloz.toyger.interfaces.ToygerEvent
    public boolean onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097306", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!this.mFirstSurfaceChange) {
            sendTimeRecordBroadCast(getActivity(), "viewDidAppear");
            this.mFirstSurfaceChange = true;
        }
        return false;
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        } else if (i != 1) {
        } else {
            this.mToygerCallback.setIsRequestingCameraPermission(false);
            if (iArr.length == 1 && iArr[0] == 0 && this.mToygerCallback.getRemoteConfig() != null) {
                sendTimeRecordBroadCast(getActivity(), "endAuthCamera");
                if (this.mToygerCallback.getRemoteConfig().getColl().isAuthorization()) {
                    this.mToygerWorkspace.alertFirstLogin();
                    this.mToygerWorkspace.setCameraVisible(false);
                    onCameraPermission(false);
                    this.mToygerCallback.setCameraPermission(false);
                    return;
                }
                this.mToygerWorkspace.setCameraVisible(true);
                onCameraPermission(true);
                this.mToygerCallback.setCameraPermission(true);
                this.mToygerWorkspace.startTimerTask();
                return;
            }
            this.mToygerWorkspace.setCameraVisible(false);
            onCameraPermission(false);
            this.mToygerCallback.setCameraPermission(false);
            this.mToygerWorkspace.alertCameraPermission();
            this.mToygerWorkspace.stopTimerTask();
        }
    }

    public void recordExtDetectionStart(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e9883f8", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        ToygerRecordService toygerRecordService = (ToygerRecordService) this.mBioServiceManager.getBioService(ToygerRecordService.class);
        if (toygerRecordService == null) {
            return;
        }
        TimeRecord.getInstance().setEnterDetectionTime(System.currentTimeMillis());
        HashMap<String, String> objectToStringMap = ObjectUtil.objectToStringMap(jSONObject);
        if (z) {
            if (this.mToygerCallback.getRemoteConfig().getColl().isShowFace()) {
                objectToStringMap.put("degreeFaceAlpha", this.mToygerCallback.getRemoteConfig().getColl().getInitShowFaceAlpha() + "");
            } else {
                objectToStringMap.put("degreeFaceAlpha", "1.0");
            }
            objectToStringMap.put("degreeScreenAlpha", this.mToygerCallback.getRemoteConfig().getColl().getBackgroundAlpha() + "");
        }
        toygerRecordService.write(ToygerRecordService.ENTER_DETECTION_START, objectToStringMap);
    }

    private void recordExtDetectionEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa121cd", new Object[]{this});
            return;
        }
        ToygerRecordService toygerRecordService = (ToygerRecordService) this.mBioServiceManager.getBioService(ToygerRecordService.class);
        if (toygerRecordService == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (TimeRecord.getInstance() != null) {
            hashMap.put("timecost", "" + (System.currentTimeMillis() - TimeRecord.getInstance().getEnterDetectionTime()));
            if (TimeRecord.getInstance().getEntrySdkTime() > 0) {
                hashMap.put("elapsedTime", "" + (System.currentTimeMillis() - TimeRecord.getInstance().getEntrySdkTime()));
            }
        }
        hashMap.put("brightness", "" + ScreenUtil.getScreenBrightness(getContext()));
        if (this.mToygerCallback != null) {
            hashMap.put("verifyMode", this.mToygerCallback.getRemoteConfig().getVerifyMode());
        }
        TimeRecord.getInstance().setEnterDetectionEndTime(System.currentTimeMillis());
        toygerRecordService.write(ToygerRecordService.ENTER_DETECTION_END, hashMap);
    }

    @Override // com.alipay.zoloz.toyger.workspace.ToygerFragment, com.alipay.zoloz.toyger.interfaces.ToygerEvent
    public void commandFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d256e4", new Object[]{this});
            return;
        }
        ToygerWorkspace toygerWorkspace = this.mToygerWorkspace;
        if (toygerWorkspace == null) {
            return;
        }
        toygerWorkspace.commandFinished();
    }
}
