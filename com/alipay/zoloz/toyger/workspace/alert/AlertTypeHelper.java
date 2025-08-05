package com.alipay.zoloz.toyger.workspace.alert;

import android.content.Context;
import android.content.res.Resources;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.security.bio.config.bean.FaceTips;
import com.alipay.mobile.security.bio.constants.CodeConstants;
import com.alipay.mobile.security.bio.constants.ZcodeConstants;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.zoloz.toyger.interfaces.ToygerCallback;
import com.alipay.zoloz.toyger.util.DialogTypeIndex;
import com.alipay.zoloz.toyger.workspace.FaceRemoteConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class AlertTypeHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ToygerCallback f6365a;
    public Context b;
    public Resources c;
    public FaceRemoteConfig d;
    public boolean f = false;
    public FaceTips e = new FaceTips();

    /* loaded from: classes3.dex */
    public class AlertContext {
        public String msg1;
        public String msg2;
        public String negative;
        public String positive;
        public int returnCode;
        public String scene;
        public boolean showIcon;
        public DialogTypeIndex tag;
        public String title;

        public AlertContext() {
        }
    }

    private int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue() : i != -1 ? i : i2;
    }

    public AlertTypeHelper(ToygerCallback toygerCallback, Context context) {
        this.f6365a = toygerCallback;
        this.b = context;
        this.c = this.b.getResources();
        this.d = toygerCallback.getRemoteConfig();
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : StringUtil.isNullorEmpty(str) ? str2 : str;
    }

    public AlertContext getAlertContext(AlertType alertType, int i, String str, String str2) {
        String a2;
        String a3;
        String a4;
        int a5;
        String a6;
        int i2;
        String str3;
        String a7;
        String a8;
        int a9;
        String string;
        String string2;
        String string3;
        int i3;
        String str4;
        String string4;
        String string5;
        String string6;
        String string7;
        String str5;
        String string8;
        int i4;
        String string9;
        String str6;
        String str7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertContext) ipChange.ipc$dispatch("95845496", new Object[]{this, alertType, new Integer(i), str, str2});
        }
        AlertContext alertContext = new AlertContext();
        DialogTypeIndex dialogTypeIndex = DialogTypeIndex.DIALOG_TYPE_INDEX_INVALID;
        Resources resources = this.c;
        boolean equals = this.d.getFaceTips().getVersion().equals("facePay");
        int i5 = 208;
        String str8 = "serverFail";
        int i6 = 300;
        switch (alertType) {
            case ALERT_SYSTEM_ERROR:
                dialogTypeIndex = DialogTypeIndex.DIALOG_TYPE_INDEX_SYSTEM_ERROR;
                a2 = a(this.d.getFaceTips().getSystemErrorAlert().getTitle(), CodeConstants.getMessage(ZcodeConstants.ZCODE_SYSTEM_EXC));
                a3 = a(this.d.getFaceTips().getSystemErrorAlert().getMessage(), "");
                a4 = a(this.d.getFaceTips().getSystemErrorAlert().getRightButtonText(), resources.getString(R.string.zface_detect_dialog_btn_ok));
                a5 = a(this.d.getFaceTips().getSystemErrorAlert().getReturnCode(), 205);
                str8 = "loadAlgorithmErr";
                str3 = "";
                break;
            case ALERT_BACK:
                dialogTypeIndex = DialogTypeIndex.DIALOG_TYPE_INDEX_EXIT_FACE;
                if (equals) {
                    a6 = resources.getString(R.string.zface_detect_dialog_btn_inputpass_payscene);
                } else {
                    a6 = a(this.d.getFaceTips().getExitAlert().getLeftButtonText(), resources.getString(R.string.zface_detect_dialog_btn_sure));
                    i6 = a(this.d.getFaceTips().getExitAlert().getReturnCode(), 202);
                }
                if (this.f) {
                    a6 = a(this.d.getFaceTips().getExitAlert().getLeftButtonText(), resources.getString(R.string.zface_detect_dialog_btn_sure));
                    i2 = a(this.d.getFaceTips().getExitAlert().getReturnCode(), 202);
                } else {
                    i2 = i6;
                }
                String a10 = a(this.d.getFaceTips().getExitAlert().getTitle(), resources.getString(R.string.zface_detect_dialog_close_title));
                String a11 = a(this.d.getFaceTips().getExitAlert().getMessage(), resources.getString(R.string.zface_detect_dialog_close_msg));
                String a12 = a(this.d.getFaceTips().getExitAlert().getRightButtonText(), resources.getString(R.string.zface_detect_dialog_btn_cancel));
                str8 = "clickXback";
                a4 = a6;
                a2 = a10;
                a5 = i2;
                a3 = a11;
                str3 = a12;
                break;
            case ALERT_INTERRUPT_RESUME:
                dialogTypeIndex = DialogTypeIndex.DIALOG_TYPE_INDEX_INTERRUPT_RESUME;
                a2 = a(this.d.getFaceTips().getInterruptAlert().getTitle(), resources.getString(R.string.zface_detect_dialog_interrupt_error));
                a3 = a(this.d.getFaceTips().getInterruptAlert().getMessage(), "");
                a7 = a(this.d.getFaceTips().getInterruptAlert().getRightButtonText(), resources.getString(R.string.zface_loginment_dialog_btn_retry));
                a8 = a(this.d.getFaceTips().getInterruptAlert().getLeftButtonText(), resources.getString(R.string.zface_detect_dialog_btn_exit));
                a9 = a(this.d.getFaceTips().getInterruptAlert().getReturnCode(), 301);
                str8 = "systemInterrupt";
                i4 = a9;
                str3 = a8;
                a4 = a7;
                a5 = i4;
                break;
            case ALERT_TIMEOUT:
                if (equals) {
                    string = resources.getString(R.string.zface_detect_dialog_timeout_error_title_payscene);
                    string2 = resources.getString(R.string.zface_detect_dialog_btn_inputpass_payscene);
                    string3 = resources.getString(R.string.zface_detect_dialog_timeout_error_message_payscene);
                } else {
                    string = resources.getString(R.string.zface_detect_dialog_timeout_error);
                    string2 = resources.getString(R.string.zface_detect_dialog_btn_exit);
                    string3 = resources.getString(R.string.zface_detect_dialog_pose_msg);
                    i6 = a(this.d.getFaceTips().getTimeoutAlert().getReturnCode(), 203);
                }
                if (this.f) {
                    string = resources.getString(R.string.zface_detect_dialog_timeout_error);
                    string2 = resources.getString(R.string.zface_detect_dialog_btn_exit);
                    string3 = resources.getString(R.string.zface_detect_dialog_pose_msg);
                    i3 = a(this.d.getFaceTips().getTimeoutAlert().getReturnCode(), 203);
                } else {
                    i3 = i6;
                }
                DialogTypeIndex dialogTypeIndex2 = DialogTypeIndex.DIALOG_TYPE_INDEX_TIMEOUT;
                String a13 = a(this.d.getFaceTips().getTimeoutAlert().getTitle(), string);
                String a14 = a(this.d.getFaceTips().getTimeoutAlert().getMessage(), string3);
                a4 = a(this.d.getFaceTips().getTimeoutAlert().getRightButtonText(), resources.getString(R.string.zface_loginment_dialog_btn_retry));
                str8 = "timeout";
                str4 = a14;
                a5 = i3;
                a2 = a13;
                dialogTypeIndex = dialogTypeIndex2;
                str3 = a(this.d.getFaceTips().getTimeoutAlert().getLeftButtonText(), string2);
                a3 = str4;
                break;
            case ALERT_UNSUPPORTED_CPU:
                dialogTypeIndex = DialogTypeIndex.DIALOG_TYPE_INDEX_UNSUPPORTED_CPU;
                a2 = a(this.d.getFaceTips().getUnsurpportAlert().getTitle(), resources.getString(R.string.zface_detect_dialog_unsurpport_msg));
                a3 = a(this.d.getFaceTips().getUnsurpportAlert().getMessage(), "");
                a4 = a(this.d.getFaceTips().getUnsurpportAlert().getRightButtonText(), resources.getString(R.string.zface_detect_dialog_btn_ok));
                a5 = a(this.d.getFaceTips().getUnsurpportAlert().getReturnCode(), 102);
                str8 = "errorDeviceModel";
                str3 = "";
                break;
            case ALERT_NO_PERMISSION_OF_CAMERA:
                if (equals) {
                    string4 = resources.getString(R.string.zface_detect_dialog_btn_inputpass_payscene);
                    string5 = resources.getString(R.string.zface_detect_camera_unconnect_text_default_payscene);
                } else {
                    string4 = resources.getString(R.string.zface_detect_camera_unconnect_ok_text);
                    string5 = resources.getString(R.string.zface_detect_camera_unconnect_text_default);
                }
                if (this.f) {
                    string4 = this.d.getFaceTips().getCameraNoPermissionAlert().getRightButtonText();
                }
                DialogTypeIndex dialogTypeIndex3 = DialogTypeIndex.DIALOG_TYPE_INDEX_NO_PERMISSION_OF_CAMERA;
                String a15 = a(this.d.getFaceTips().getCameraNoPermissionAlert().getTitle(), resources.getString(R.string.zface_detect_camera_unconnect_title));
                String a16 = a(this.d.getFaceTips().getCameraNoPermissionAlert().getMessage(), string5);
                String a17 = a(this.d.getFaceTips().getCameraNoPermissionAlert().getRightButtonText(), string4);
                a5 = a(this.d.getFaceTips().getCameraNoPermissionAlert().getReturnCode(), 100);
                str8 = "cameraPermission";
                str3 = "";
                a4 = a17;
                a2 = a15;
                a3 = a16;
                dialogTypeIndex = dialogTypeIndex3;
                break;
            case ALERT_NO_FRONT_CAMERA:
                dialogTypeIndex = DialogTypeIndex.DIALOG_TYPE_INDEX_NO_FRONT_CAMERA;
                a2 = a(this.d.getFaceTips().getUnsurpportAlert().getTitle(), resources.getString(R.string.zface_detect_dialog_unsurpport_msg));
                a3 = a(this.d.getFaceTips().getUnsurpportAlert().getMessage(), "");
                a4 = a(this.d.getFaceTips().getUnsurpportAlert().getRightButtonText(), resources.getString(R.string.zface_detect_dialog_btn_ok));
                a5 = a(this.d.getFaceTips().getUnsurpportAlert().getReturnCode(), 101);
                str8 = "errorCameraFront";
                str3 = "";
                break;
            case ALERT_INIT_CAMERA_ERROR:
                dialogTypeIndex = DialogTypeIndex.DIALOG_TYPE_INDEX_CAMERA_INIT_ERROR;
                a2 = a(this.d.getFaceTips().getUnsurpportAlert().getTitle(), resources.getString(R.string.zface_detect_dialog_camera_init_error_msg));
                a3 = a(this.d.getFaceTips().getUnsurpportAlert().getMessage(), "");
                a4 = a(this.d.getFaceTips().getUnsurpportAlert().getRightButtonText(), resources.getString(R.string.zface_detect_dialog_btn_ok));
                a5 = a(this.d.getFaceTips().getUnsurpportAlert().getReturnCode(), 200);
                str8 = "cameraInitError";
                str3 = "";
                break;
            case ALERT_ANDROID_VERSION_LOW:
                dialogTypeIndex = DialogTypeIndex.DIALOG_TYPE_INDEX_ANDROID_VERSION_LOW;
                a2 = a(this.d.getFaceTips().getSystemVersionErrorAlert().getTitle(), resources.getString(R.string.zface_loginment_dialog_error_version_msg));
                a3 = a(this.d.getFaceTips().getSystemVersionErrorAlert().getMessage(), resources.getString(R.string.zface_loginment_dialog_error_version_msg2));
                a4 = a(this.d.getFaceTips().getSystemVersionErrorAlert().getRightButtonText(), resources.getString(R.string.zface_detect_dialog_btn_ok));
                a5 = a(this.d.getFaceTips().getSystemVersionErrorAlert().getReturnCode(), 105);
                str8 = "errorSystemVersion";
                str3 = "";
                break;
            case ALERT_FACE_FAIL:
                dialogTypeIndex = DialogTypeIndex.DIALOG_TYPE_INDEX_REMOTE_COMMAND_FAIL;
                a2 = a(this.d.getFaceTips().getFailAlert().getTitle(), resources.getString(R.string.zface_detect_dialog_face_operation_error_text));
                a3 = a(this.d.getFaceTips().getFailAlert().getMessage(), resources.getString(R.string.zface_detect_dialog_pose_msg));
                String a18 = a(this.d.getFaceTips().getFailAlert().getRightButtonText(), resources.getString(R.string.zface_loginment_dialog_btn_retry));
                str8 = "livnessFail";
                str3 = a(this.d.getFaceTips().getFailAlert().getLeftButtonText(), resources.getString(R.string.zface_detect_dialog_btn_exit));
                a4 = a18;
                a5 = 301;
                break;
            case ALERT_REMOTE_COMMAND_FAIL_RETRY:
                dialogTypeIndex = DialogTypeIndex.DIALOG_TYPE_INDEX_REMOTE_COMMAND_FAIL;
                a2 = a(this.d.getFaceTips().getFailAlert().getTitle(), resources.getString(R.string.zface_detect_dialog_face_operation_error_text));
                a3 = a(this.d.getFaceTips().getFailAlert().getMessage(), resources.getString(R.string.zface_detect_dialog_pose_msg));
                a7 = a(this.d.getFaceTips().getFailAlert().getRightButtonText(), resources.getString(R.string.zface_loginment_dialog_btn_retry));
                a8 = a(this.d.getFaceTips().getFailAlert().getLeftButtonText(), resources.getString(R.string.zface_detect_dialog_btn_exit));
                a9 = a(this.d.getFaceTips().getFailAlert().getReturnCode(), 208);
                i4 = a9;
                str3 = a8;
                a4 = a7;
                a5 = i4;
                break;
            case ALERT_FACE_FAIL_OVER_MAX_TIME:
                dialogTypeIndex = DialogTypeIndex.DIALOG_TYPE_INDEX_REMOTE_COMMAND_FAIL_MAX_RETRY;
                if (equals) {
                    string6 = resources.getString(R.string.zface_detect_dialog_over_max_time_msg_payscene);
                    string7 = resources.getString(R.string.zface_detect_dialog_btn_inputpass_payscene);
                    str5 = resources.getString(R.string.zface_detect_dialog_btn_cancel);
                } else {
                    string6 = resources.getString(R.string.zface_detect_dialog_over_max_time_msg);
                    string7 = resources.getString(R.string.zface_detect_dialog_btn_ok);
                    str5 = "";
                }
                if (this.f) {
                    string6 = this.d.getFaceTips().getLimitAlert().getMessage();
                    string7 = this.d.getFaceTips().getLimitAlert().getRightButtonText();
                    str5 = "";
                }
                String a19 = a(this.d.getFaceTips().getLimitAlert().getTitle(), resources.getString(R.string.zface_detect_dialog_over_max_time));
                String a20 = a(this.d.getFaceTips().getLimitAlert().getMessage(), string6);
                String a21 = a(this.d.getFaceTips().getLimitAlert().getRightButtonText(), string7);
                str8 = "retryOverMax";
                a3 = a20;
                a2 = a19;
                a4 = a21;
                str3 = a(this.d.getFaceTips().getLimitAlert().getLeftButtonText(), str5);
                a5 = a(this.d.getFaceTips().getLimitAlert().getReturnCode(), 209);
                break;
            case ALERT_REMOTE_COMMAND_FAIL:
                if (equals) {
                    string8 = resources.getString(R.string.zface_detect_dialog_btn_inputpass_payscene);
                    i5 = 300;
                } else {
                    string8 = resources.getString(R.string.zface_detect_dialog_btn_ok);
                }
                dialogTypeIndex = DialogTypeIndex.DIALOG_TYPE_INDEX_REMOTE_COMMAND_FAIL;
                String a22 = a(this.d.getFaceTips().getFailAlert().getTitle(), resources.getString(R.string.zface_detect_dialog_face_operation_error_text));
                String a23 = a(this.d.getFaceTips().getFailAlert().getMessage(), "");
                String a24 = a(this.d.getFaceTips().getFailAlert().getRightButtonText(), string8);
                a5 = a(this.d.getFaceTips().getFailAlert().getReturnCode(), i5);
                str3 = "";
                str4 = a23;
                a4 = a24;
                a2 = a22;
                a3 = str4;
                break;
            case ALERT_REMOTE_NETWORK_ERROR:
                dialogTypeIndex = DialogTypeIndex.DIALOG_TYPE_INDEX_REMOTE_NETWORK_ERROR;
                a2 = a(this.d.getFaceTips().getNetworkErrorAlert().getTitle(), resources.getString(R.string.zface_detect_dialog_network_error_default));
                a3 = a(this.d.getFaceTips().getNetworkErrorAlert().getMessage(), "");
                a7 = a(this.d.getFaceTips().getNetworkErrorAlert().getRightButtonText(), resources.getString(R.string.zface_loginment_dialog_btn_retry));
                a8 = a(this.d.getFaceTips().getNetworkErrorAlert().getLeftButtonText(), resources.getString(R.string.zface_detect_dialog_btn_exit));
                a9 = a(this.d.getFaceTips().getNetworkErrorAlert().getReturnCode(), 207);
                str8 = "networkFail";
                i4 = a9;
                str3 = a8;
                a4 = a7;
                a5 = i4;
                break;
            case ALERT_FIRST_LOGIN:
                dialogTypeIndex = DialogTypeIndex.DIALOG_TYPE_INDEX_FIRST_LOGIN;
                a2 = a(this.d.getFaceTips().getAuthorizationAlert().getTitle(), resources.getString(R.string.zface_detect_dialog_first_login));
                a3 = a(this.d.getFaceTips().getAuthorizationAlert().getMessage(), "");
                a4 = a(this.d.getFaceTips().getAuthorizationAlert().getRightButtonText(), resources.getString(R.string.zface_detect_dialog_first_login_confirm));
                String a25 = a(this.d.getFaceTips().getAuthorizationAlert().getLeftButtonText(), "");
                str8 = "authorization";
                i4 = a(this.d.getFaceTips().getAuthorizationAlert().getReturnCode(), 210);
                str3 = a25;
                a5 = i4;
                break;
            case ALERT_FACE_FAIL_NO_RETRY:
                if (equals) {
                    str6 = resources.getString(R.string.zface_detect_dialog_btn_cancel);
                    string9 = resources.getString(R.string.zface_detect_dialog_btn_inputpass_payscene);
                    str7 = resources.getString(R.string.zface_detect_dialog_gotopassword_payscene);
                } else {
                    string9 = resources.getString(R.string.zface_detect_dialog_btn_ok);
                    str6 = "";
                    str7 = str6;
                }
                if (this.f) {
                    str6 = this.d.getFaceTips().getFailNoRetryAlert().getLeftButtonText();
                    string9 = this.d.getFaceTips().getFailNoRetryAlert().getRightButtonText();
                    str7 = this.d.getFaceTips().getFailNoRetryAlert().getMessage();
                }
                DialogTypeIndex dialogTypeIndex4 = DialogTypeIndex.DIALOG_TYPE_INDEX_FACE_FAIL_NO_RETRY;
                String a26 = a(this.d.getFaceTips().getFailNoRetryAlert().getTitle(), resources.getString(R.string.zface_detect_dialog_face_operation_error_text));
                a3 = a(this.d.getFaceTips().getFailNoRetryAlert().getMessage(), str7);
                String a27 = a(this.d.getFaceTips().getFailNoRetryAlert().getRightButtonText(), string9);
                String a28 = a(this.d.getFaceTips().getFailNoRetryAlert().getLeftButtonText(), str6);
                str8 = "failNoRetry";
                i4 = a(this.d.getFaceTips().getFailNoRetryAlert().getReturnCode(), 202);
                str3 = a28;
                a2 = a26;
                a4 = a27;
                dialogTypeIndex = dialogTypeIndex4;
                a5 = i4;
                break;
            default:
                a2 = "";
                a3 = a2;
                a4 = a3;
                str3 = a4;
                str8 = str3;
                a5 = -1;
                break;
        }
        alertContext.tag = dialogTypeIndex;
        alertContext.msg1 = a2;
        alertContext.msg2 = a3;
        alertContext.negative = str3;
        alertContext.positive = a4;
        alertContext.title = "";
        alertContext.showIcon = false;
        alertContext.scene = str8;
        alertContext.returnCode = a5;
        return alertContext;
    }

    public void updateConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca5b5bc", new Object[]{this, str});
        } else if (!StringUtil.isNullorEmpty(str)) {
            try {
                BioLog.i("Toyger_ZFace", "AlertTypeHelper_updateConfig parseObject");
                this.e = (FaceTips) JSON.parseObject(str, FaceTips.class);
                BioLog.i("Toyger_ZFace", "AlertTypeHelper_updateConfig parseObject end:" + this.e.toString());
                if (!StringUtil.isNullorEmpty(this.e.getExitAlert().getTitle())) {
                    this.d.getFaceTips().setExitAlert(this.e.getExitAlert());
                }
                if (!StringUtil.isNullorEmpty(this.e.getLimitAlert().getTitle())) {
                    this.d.getFaceTips().setLimitAlert(this.e.getLimitAlert());
                }
                if (!StringUtil.isNullorEmpty(this.e.getFailAlert().getTitle())) {
                    this.d.getFaceTips().setFailAlert(this.e.getFailAlert());
                }
                if (!StringUtil.isNullorEmpty(this.e.getCameraNoPermissionAlert().getTitle())) {
                    this.d.getFaceTips().setCameraNoPermissionAlert(this.e.getCameraNoPermissionAlert());
                }
                if (!StringUtil.isNullorEmpty(this.e.getFailNoRetryAlert().getTitle())) {
                    this.d.getFaceTips().setFailNoRetryAlert(this.e.getFailNoRetryAlert());
                }
                if (!StringUtil.isNullorEmpty(this.e.getTimeoutAlert().getTitle())) {
                    this.d.getFaceTips().setTimeoutAlert(this.e.getTimeoutAlert());
                }
                this.f = true;
            } catch (Exception e) {
                BioLog.w(e);
            }
        } else {
            BioLog.i("Toyger_ZFace", "AlertTypeHelper_updateConfig faceTipStr is null or empty");
        }
    }
}
