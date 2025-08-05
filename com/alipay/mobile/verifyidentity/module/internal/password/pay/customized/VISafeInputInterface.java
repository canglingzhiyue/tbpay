package com.alipay.mobile.verifyidentity.module.internal.password.pay.customized;

import android.view.View;
import android.widget.EditText;
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;

/* loaded from: classes3.dex */
public interface VISafeInputInterface {
    void clearText();

    View getContentView();

    String getEditContent();

    EditText getEditText();

    void setEditTextHint(String str);

    void setEncryptRandomStringAndType(String str, EncryptRandomType encryptRandomType);

    void setNeedConfirmButton(boolean z);

    void setOkButtonText(String str);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnConfirmListener(OnConfirmListener onConfirmListener);

    void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener);

    void setRsaPublicKey(String str);
}
