package com.taobao.update.dynamicfeature.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class Constants {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<Integer, String> f23409a;

    /* loaded from: classes9.dex */
    public @interface ErrorCode {
        public static final int DOWNLOAD_ERROR = -3;
        public static final int ENV_ERROR = -1;
        public static final int EXTRAT_ERROR = -5;
        public static final int INSTALL_ERROR = -6;
        public static final int NOT_ENOUGH_SPACE_ERROR = -2;
        public static final int VERIFY_ERROR = -4;
    }

    /* loaded from: classes9.dex */
    public @interface ErrorDesc {
        public static final String downloadError = "download error";
        public static final String envError = "network mismatch or no network";
        public static final String extractError = "feature extract error";
        public static final String installError = "install error";
        public static final String spaceError = "no enough space";
        public static final String verifyError = "feature signature verify error";
    }

    static {
        kge.a(-679951156);
        HashMap hashMap = new HashMap();
        f23409a = hashMap;
        hashMap.put(-1, ErrorDesc.envError);
        f23409a.put(-2, ErrorDesc.spaceError);
        f23409a.put(-3, ErrorDesc.downloadError);
        f23409a.put(-4, ErrorDesc.verifyError);
        f23409a.put(-6, ErrorDesc.installError);
        f23409a.put(-5, ErrorDesc.extractError);
    }

    public static String getMsg(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c57d6cf", new Object[]{new Integer(i)}) : f23409a.get(Integer.valueOf(i));
    }
}
