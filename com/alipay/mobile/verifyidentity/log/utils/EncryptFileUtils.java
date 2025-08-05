package com.alipay.mobile.verifyidentity.log.utils;

import android.content.Context;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.utils.task.ZFileUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes3.dex */
public class EncryptFileUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean write(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b6c0efe", new Object[]{str, str2})).booleanValue();
        }
        Context context = MicroModuleContext.getInstance().getContext();
        String str3 = null;
        if (str2 != null) {
            str3 = TriDesCBC.encrypt(EncryptUtil.generateLocalStorageDesKey(context), str2);
        }
        return ZFileUtil.write(str, str3, str3, true, context);
    }

    public static String read(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed62e14c", new Object[]{file});
        }
        String read = ZFileUtil.read(file);
        Context context = MicroModuleContext.getInstance().getContext();
        if (read == null) {
            return null;
        }
        return TriDesCBC.decrypt(EncryptUtil.generateLocalStorageDesKey(context), read);
    }
}
