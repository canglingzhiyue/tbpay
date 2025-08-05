package com.ali.user.mobile.verify.model;

import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes2.dex */
public class OpenBiometricData implements Serializable {
    public String biometricId;
    public ArrayList<String> biometricIdList;
    public String biometricKey;
    public long biometricOpenTime;
    public String h5Url;

    static {
        kge.a(928517220);
        kge.a(1028243835);
    }
}
