package com.ali.user.mobile.rpc.login.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import tb.kge;

/* loaded from: classes2.dex */
public class SessionModel extends AliUserResponseData implements Comparator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mobile;
    public String showLoginId;
    public int site;

    static {
        kge.a(941875697);
        kge.a(-2099169482);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
        }
        SessionModel sessionModel = (SessionModel) obj;
        SessionModel sessionModel2 = (SessionModel) obj2;
        if (sessionModel.loginTime > sessionModel2.loginTime) {
            return -1;
        }
        return sessionModel.loginTime == sessionModel2.loginTime ? 0 : 1;
    }
}
