package com.alipay.mobile.verifyidentity.safepaybase;

import android.app.Activity;
import com.alipay.mobile.verifyidentity.safepaybase.util.EditTextManager;
import com.alipay.mobile.verifyidentity.safepaybase.util.EditTextUtil;

/* loaded from: classes3.dex */
public class PwdEncryptHandler {
    public String c;
    private Activity f;
    private boolean g;

    /* renamed from: a  reason: collision with root package name */
    public EditTextUtil f6051a = EditTextManager.a();
    public String b = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDENksAVqDoz5SMCZq0bsZwE+I3NjrANyTTwUVSf1+ec1PfPB4tiocEpYJFCYju9MIbawR8ivECbUWjpffZq5QllJg+19CB7V5rYGcEnb/M7CS3lFF2sNcRFJUtXUUAqyR3/l7PmpxTwObZ4DLG258dhE2vFlVGXjnuLs+FI2hg4QIDAQAB";
    public String d = "";
    public EncryptRandomType e = EncryptRandomType.randomafter;

    public PwdEncryptHandler(Activity activity, boolean z) {
        this.g = false;
        this.f = activity;
        this.g = z;
    }
}
