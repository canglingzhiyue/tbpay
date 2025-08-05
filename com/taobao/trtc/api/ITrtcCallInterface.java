package com.taobao.trtc.api;

import com.taobao.trtc.api.TrtcDefines;

/* loaded from: classes9.dex */
public interface ITrtcCallInterface {

    /* loaded from: classes9.dex */
    public interface a {
        a a(ITrtcInputStream iTrtcInputStream);

        a a(TrtcDefines.TrtcAnswerType trtcAnswerType);

        a a(String str);

        a a(String str, String str2);

        a a(boolean z);

        boolean a();
    }

    /* loaded from: classes9.dex */
    public interface b {
        b a(String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3);

        boolean a();
    }

    /* loaded from: classes9.dex */
    public interface c {
        c a(String str);

        c a(String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3);

        c a(boolean z);

        boolean a();

        c b(String str);

        c c(String str);
    }

    /* loaded from: classes9.dex */
    public interface d {
        d a(int i);

        d a(ITrtcInputStream iTrtcInputStream);

        d a(String str);

        d a(String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3);

        d a(boolean z);

        boolean a();

        d b(String str);
    }
}
