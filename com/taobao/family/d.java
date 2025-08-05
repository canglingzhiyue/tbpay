package com.taobao.family;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_MEMBERS = "familyMembers_";

    /* renamed from: a  reason: collision with root package name */
    private IDynamicDataEncryptComponent f17130a;

    public d(Context context) {
        try {
            SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
            if (securityGuardManager == null) {
                return;
            }
            this.f17130a = securityGuardManager.getDynamicDataEncryptComp();
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (this.f17130a != null && !TextUtils.isEmpty(str2)) {
            try {
                String dynamicEncryptDDp = this.f17130a.dynamicEncryptDDp(str2);
                if (TextUtils.isEmpty(dynamicEncryptDDp)) {
                    return false;
                }
                j.a(str, dynamicEncryptDDp);
                return true;
            } catch (SecException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return a(KEY_MEMBERS + str2, str);
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return b(KEY_MEMBERS + str);
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (this.f17130a == null) {
            return "";
        }
        String a2 = j.a(str);
        if (TextUtils.isEmpty(a2)) {
            return "";
        }
        try {
            return this.f17130a.dynamicDecryptDDp(a2);
        } catch (SecException e) {
            e.printStackTrace();
            return "";
        }
    }
}
