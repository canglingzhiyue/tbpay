package com.alipay.mobile.verifyidentity.module.internal.password.pay.customized;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;
import com.alipay.mobile.verifyidentity.safepaybase.SafeInputContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class VISafeInput implements VISafeInputInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SafeInputContext f5905a;

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setEditTextHint(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d79e991", new Object[]{this, str});
        }
    }

    public VISafeInput(Activity activity, boolean z) {
        VerifyLogCat.i("INVISafeInput", "VISafeInput always new");
        this.f5905a = new SafeInputContext(activity, z);
        HashMap hashMap = new HashMap();
        hashMap.put("pwdType", "1");
        hashMap.put("pwdSwitch", "1");
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-220722-01", Constants.VI_ENGINE_APPID, "aavca", "", "", null, hashMap);
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setOnConfirmListener(OnConfirmListener onConfirmListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a628919", new Object[]{this, onConfirmListener});
            return;
        }
        SafeInputContext safeInputContext = this.f5905a;
        if (safeInputContext == null) {
            return;
        }
        safeInputContext.setOnConfirmListener(onConfirmListener);
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setNeedConfirmButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e1ee93", new Object[]{this, new Boolean(z)});
            return;
        }
        SafeInputContext safeInputContext = this.f5905a;
        if (safeInputContext == null) {
            return;
        }
        safeInputContext.setNeedConfirmButton(z);
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66528b7", new Object[]{this, onFocusChangeListener});
            return;
        }
        SafeInputContext safeInputContext = this.f5905a;
        if (safeInputContext == null) {
            return;
        }
        safeInputContext.setOnFocusChangeListener(onFocusChangeListener);
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
            return;
        }
        SafeInputContext safeInputContext = this.f5905a;
        if (safeInputContext == null) {
            return;
        }
        safeInputContext.setOnClickListener(onClickListener);
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setRsaPublicKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab3d2e9", new Object[]{this, str});
            return;
        }
        SafeInputContext safeInputContext = this.f5905a;
        if (safeInputContext == null) {
            return;
        }
        safeInputContext.setRsaPublicKey(str);
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setEncryptRandomStringAndType(String str, EncryptRandomType encryptRandomType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950c571d", new Object[]{this, str, encryptRandomType});
            return;
        }
        SafeInputContext safeInputContext = this.f5905a;
        if (safeInputContext == null) {
            return;
        }
        safeInputContext.setEncryptRandomStringAndType(str, encryptRandomType);
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public String getEditContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef64dac0", new Object[]{this});
        }
        SafeInputContext safeInputContext = this.f5905a;
        return safeInputContext != null ? safeInputContext.getEditContent() : "";
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public EditText getEditText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("b520b203", new Object[]{this});
        }
        SafeInputContext safeInputContext = this.f5905a;
        if (safeInputContext == null) {
            return null;
        }
        return safeInputContext.getEditText();
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        SafeInputContext safeInputContext = this.f5905a;
        if (safeInputContext == null) {
            return null;
        }
        return safeInputContext.getContentView();
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void clearText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981ae8a1", new Object[]{this});
            return;
        }
        SafeInputContext safeInputContext = this.f5905a;
        if (safeInputContext == null) {
            return;
        }
        safeInputContext.clearText();
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setOkButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6af3ace", new Object[]{this, str});
            return;
        }
        SafeInputContext safeInputContext = this.f5905a;
        if (safeInputContext == null) {
            return;
        }
        safeInputContext.setOkButtonText(str);
    }
}
