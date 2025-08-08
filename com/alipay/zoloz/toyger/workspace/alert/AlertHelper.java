package com.alipay.zoloz.toyger.workspace.alert;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alipay.mobile.security.bio.constants.ZcodeConstants;
import com.alipay.zoloz.toyger.interfaces.DialogCallback;
import com.alipay.zoloz.toyger.interfaces.ToygerCallback;
import com.alipay.zoloz.toyger.util.DialogTypeIndex;
import com.alipay.zoloz.toyger.workspace.ToygerWorkspace;
import com.alipay.zoloz.toyger.workspace.alert.AlertTypeHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AlertHelper implements DialogInterface.OnClickListener, View.OnClickListener, DialogCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String localFaceTipsKey = "facetipsLocalConfig";

    /* renamed from: a  reason: collision with root package name */
    private AlertTypeHelper f6363a;
    private ToygerWorkspace b;
    private ToygerCallback c;
    private String d;
    private String e;
    private String f;
    private int g;
    private int h;
    private boolean i;
    private boolean j = false;
    private Dialog k;
    private String l;
    private String m;

    public AlertHelper(Context context, ToygerWorkspace toygerWorkspace, ToygerCallback toygerCallback) {
        this.b = toygerWorkspace;
        this.c = toygerCallback;
        this.f6363a = new AlertTypeHelper(toygerCallback, context);
        this.f6363a.updateConfig(this.c.getAppDescription().getExtProperty().get(localFaceTipsKey));
    }

    public int getAlertReturnCode(AlertType alertType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("214b8bd6", new Object[]{this, alertType})).intValue() : this.f6363a.getAlertContext(alertType, this.h, "", "").returnCode;
    }

    public void setAuthInBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88427ed0", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void alert(AlertType alertType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283b6134", new Object[]{this, alertType, str});
        } else {
            alert(alertType, str, "");
        }
    }

    public void alert(AlertType alertType, String str, String str2) {
        AlertType alertType2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e625fe", new Object[]{this, alertType, str, str2});
        } else if (this.j || this.i) {
        } else {
            this.l = str;
            this.m = str2;
            this.b.stopTimerTask();
            this.b.pauseToygerFaceService();
            this.i = true;
            if (this.h >= this.c.getRemoteConfig().getColl().getRetry()) {
                AlertType alertType3 = AlertType.ALERT_FACE_FAIL_OVER_MAX_TIME;
                this.l = ZcodeConstants.ZCODE_OUT_TIME;
                this.m = ZcodeConstants.getMessage(this.l);
                alertType2 = alertType3;
            } else {
                alertType2 = alertType;
            }
            AlertTypeHelper.AlertContext alertContext = this.f6363a.getAlertContext(alertType2, this.h, this.l, this.m);
            this.d = alertContext.positive;
            this.e = alertContext.negative;
            this.f = alertContext.scene;
            this.g = alertContext.returnCode;
            this.b.alertRecord(this.f);
            if (alertContext.tag == DialogTypeIndex.DIALOG_TYPE_INDEX_INVALID) {
                return;
            }
            this.k = this.c.alert(alertContext.tag, alertContext.title, alertContext.msg1, alertContext.msg2, alertContext.positive, this, alertContext.negative, this, true, alertContext.showIcon, this);
            if (alertType2 == AlertType.ALERT_REMOTE_NETWORK_ERROR) {
                return;
            }
            this.h++;
            this.c.setRetryTime(this.h);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else {
            alert(AlertType.ALERT_BACK, ZcodeConstants.ZCODE_USER_BACK);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            return;
        }
        DialogTypeIndex alertTag = this.c.getAlertTag();
        if (i == -2) {
            a(alertTag, false);
        } else if (i != -1) {
        } else {
            a(alertTag, true);
        }
    }

    @Override // com.alipay.zoloz.toyger.interfaces.DialogCallback
    public void onTimeOut() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47459e9", new Object[]{this});
        } else {
            a(DialogTypeIndex.DIALOG_TYPE_COUNT_TIMEOUT, false);
        }
    }

    public boolean isAlertRunning() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fcf64d18", new Object[]{this})).booleanValue() : this.i;
    }

    public void a(DialogTypeIndex dialogTypeIndex, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3ebeaf5", new Object[]{this, dialogTypeIndex, new Boolean(z)});
            return;
        }
        dismissAlert();
        int i = 300;
        switch (dialogTypeIndex) {
            case DIALOG_TYPE_INDEX_SYSTEM_ERROR:
                this.b.responseWithCode(this.g, this.l);
                break;
            case DIALOG_TYPE_INDEX_EXIT_FACE:
                if (z) {
                    this.b.alertClickRecord(this.d, this.f);
                    this.b.responseWithCode(this.g, this.l);
                    break;
                } else {
                    this.b.alertClickRecord(this.e, this.f);
                    this.b.retry();
                    break;
                }
            case DIALOG_TYPE_INDEX_UNSUPPORTED_CPU:
                this.b.responseWithCode(this.g, this.l);
                break;
            case DIALOG_TYPE_INDEX_INTERRUPT_RESUME:
                if (z) {
                    this.b.alertClickRecord(this.d, this.f);
                    this.b.retry();
                    break;
                } else {
                    this.b.responseWithCode(this.g, this.l);
                    break;
                }
            case DIALOG_TYPE_INDEX_NO_PERMISSION_OF_CAMERA:
                this.b.responseWithCode(this.g, this.l);
                break;
            case DIALOG_TYPE_INDEX_NO_FRONT_CAMERA:
                this.b.responseWithCode(this.g, this.l);
                break;
            case DIALOG_TYPE_INDEX_REMOTE_NETWORK_ERROR_LOGIN:
                if (z) {
                    this.b.alertClickRecord(this.d, this.f);
                    this.b.retry();
                    break;
                } else {
                    this.b.alertClickRecord(this.e, this.f);
                    this.b.responseWithCode(300, this.l);
                    break;
                }
            case DIALOG_TYPE_INDEX_REMOTE_NETWORK_ERROR_LOGIN_MAX_RETRY:
                this.b.alertClickRecord(this.d, this.f);
                this.b.responseWithCode(300, this.l);
                break;
            case DIALOG_TYPE_INDEX_REMOTE_NETWORK_ERROR_MAX_RETRY:
                this.b.alertClickRecord(this.d, this.f);
                this.b.responseWithCode(209, this.l);
                break;
            case DIALOG_TYPE_INDEX_REMOTE_NETWORK_ERROR:
                if (z) {
                    this.b.alertClickRecord(this.d, this.f);
                    this.b.uploadFaceInfo();
                    break;
                } else {
                    this.b.alertClickRecord(this.e, this.f);
                    this.b.responseWithCode(this.g, this.l);
                    break;
                }
            case DIALOG_TYPE_INDEX_REMOTE_COMMAND_FAIL_LOGIN_MAX_RETRY:
                this.b.alertClickRecord(this.d, this.f);
                this.b.responseWithCode(300, this.l);
                break;
            case DIALOG_TYPE_INDEX_REMOTE_COMMAND_FAIL_LOGIN:
                if (!z) {
                    this.b.alertClickRecord(this.e, this.f);
                    this.b.responseWithCode(300, this.l);
                    break;
                } else {
                    this.b.alertClickRecord(this.d, this.f);
                    this.b.retry();
                    break;
                }
            case DIALOG_TYPE_INDEX_REMOTE_COMMAND_FAIL_MAX_RETRY:
            case DIALOG_TYPE_INDEX_FACE_FAIL_NO_RETRY:
                if (!StringUtils.isEmpty(this.e)) {
                    this.b.alertClickRecord(z ? this.d : this.e, this.f);
                    ToygerWorkspace toygerWorkspace = this.b;
                    if (!z) {
                        i = this.g;
                    }
                    toygerWorkspace.responseWithCode(i, this.l);
                    break;
                } else {
                    this.b.alertClickRecord(this.d, this.f);
                    this.b.responseWithCode(this.g, this.l);
                    break;
                }
            case DIALOG_TYPE_INDEX_REMOTE_COMMAND_FAIL:
                if (z) {
                    this.b.retry();
                    this.b.alertClickRecord(this.d, this.f);
                    break;
                } else {
                    this.b.alertClickRecord(this.e, this.f);
                    this.b.responseWithCode(this.g, this.l);
                    break;
                }
            case DIALOG_TYPE_INDEX_FACE_FAIL_LOGIN:
                if (z) {
                    this.b.alertClickRecord(this.d, this.f);
                    this.b.retry();
                    break;
                } else {
                    this.b.alertClickRecord(this.e, this.f);
                    this.b.responseWithCode(300, this.l);
                    break;
                }
            case DIALOG_TYPE_INDEX_FACE_FAIL_LOGIN_MAX_RETRY:
                this.b.alertClickRecord(this.d, this.f);
                this.b.responseWithCode(300, this.l);
                break;
            case DIALOG_TYPE_INDEX_FACE_FAIL:
                if (z) {
                    this.b.alertClickRecord(this.d, this.f);
                    this.b.retry();
                    break;
                } else {
                    this.b.alertClickRecord(this.e, this.f);
                    this.b.responseWithCode(this.g, this.l);
                    break;
                }
            case DIALOG_TYPE_INDEX_FACE_FAIL_MAX_RETRY:
                this.b.alertClickRecord(this.d, this.f);
                this.b.responseWithCode(this.g, this.l);
                break;
            case DIALOG_TYPE_INDEX_TIMEOUT_LOGIN:
                if (z) {
                    this.b.alertClickRecord(this.d, this.f);
                    this.b.retry();
                    break;
                } else {
                    this.b.alertClickRecord(this.e, this.f);
                    this.b.responseWithCode(300, this.l);
                    break;
                }
            case DIALOG_TYPE_INDEX_TIMEOUT_LOGIN_MAX_RETRY:
                this.b.alertClickRecord(this.d, this.f);
                this.b.responseWithCode(300, this.l);
                break;
            case DIALOG_TYPE_INDEX_TIMEOUT:
                if (z) {
                    this.b.alertClickRecord(this.d, this.f);
                    this.b.retry();
                    break;
                } else {
                    this.b.alertClickRecord(this.e, this.f);
                    this.b.responseWithCode(this.g, this.l);
                    break;
                }
            case DIALOG_TYPE_INDEX_TIMEOUT_MAX_RETRY:
                this.b.alertClickRecord(this.d, this.f);
                this.b.responseWithCode(209, this.l);
                break;
            case DIALOG_TYPE_INDEX_ANDROID_VERSION_LOW:
                this.b.responseWithCode(105, this.l);
                break;
            case DIALOG_TYPE_INDEX_FIRST_LOGIN:
                if (z) {
                    this.b.alertClickRecord(this.d, this.f);
                    this.b.setCameraVisible(true);
                    this.b.retry();
                    break;
                } else {
                    this.b.alertClickRecord(this.e, this.f);
                    this.b.responseWithCode(this.g, this.l);
                    break;
                }
            case DIALOG_TYPE_COUNT_TIMEOUT:
                if (ZcodeConstants.ZCODE_ERROR_CAMERA_STREAM_ERROR != this.l && ZcodeConstants.ZCODE_ERROR_CAMERA_NO_DEVICE != this.l) {
                    String str = ZcodeConstants.ZCODE_ERROR_CAMERA_OPEN_FAILED;
                    String str2 = this.l;
                }
                this.b.alertClickRecord("timeout", this.f);
                this.b.responseWithCode(this.g, this.l);
                break;
            case DIALOG_TYPE_INDEX_CAMERA_INIT_ERROR:
                if (ZcodeConstants.ZCODE_ERROR_CAMERA_STREAM_ERROR != this.l && ZcodeConstants.ZCODE_ERROR_CAMERA_NO_DEVICE != this.l) {
                    String str3 = ZcodeConstants.ZCODE_ERROR_CAMERA_OPEN_FAILED;
                    String str4 = this.l;
                }
                this.b.responseWithCode(200, this.l);
                break;
        }
        this.i = false;
    }

    public void dismissAlert() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e430a879", new Object[]{this});
            return;
        }
        Dialog dialog = this.k;
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
        this.k = null;
    }
}
