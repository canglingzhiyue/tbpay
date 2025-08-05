package com.taobao.android.remoteso.tbadapter.ext;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.zip.MultiThreadSevenZip;
import com.uc.webview.export.extension.U4Engine;
import java.io.File;
import java.io.IOException;
import tb.iiq;
import tb.iku;

/* loaded from: classes6.dex */
public class e implements iiq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.iiq
    public boolean a(Context context, String str, String str2, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("602ff7e4", new Object[]{this, context, str, str2, new Boolean(z)})).booleanValue();
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.isFile()) {
            throw RSoException.error(7100, "path=" + file.getPath() + ", length=" + file.length());
        }
        String name = file.getName();
        iku.f(file2);
        iku.b(file2);
        RSoLog.c("IRSoExtractCore,extract, " + name + ", force recreate extractedDir success, dir=" + file2.getPath());
        U4Engine.extractFile(context, file, file2, z);
        RSoLog.c("IRSoExtractCore,extract, " + name + ", extract success, children=" + iku.a(file2, false));
        return true;
    }

    @Override // tb.iiq
    public synchronized boolean b(Context context, String str, String str2, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bf173a5", new Object[]{this, context, str, str2, new Boolean(z)})).booleanValue();
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.isFile()) {
            throw RSoException.error(7100, "path=" + file.getPath() + ", length=" + file.length());
        }
        iku.f(file2);
        iku.b(file2);
        int deccompress = new MultiThreadSevenZip().deccompress(context, file.getAbsolutePath(), file2.getAbsolutePath());
        if (deccompress != 0) {
            RSoLog.c("IRSoExtractCore, 7z decode failed:" + deccompress + ", length:" + (file.length() / 1024) + "KB, freeSize:" + file2.getFreeSpace() + ", zipFile:" + file.getAbsolutePath() + ", outDir:" + file2.getAbsolutePath());
            if (28 == deccompress) {
                ErrorCode.DECOMPRESS_SEVENZIP_ERROR_NOSPC.report();
            }
            ErrorCode.DECOMPRESS_SEVENZIP_ERROR.report("7zError=" + deccompress);
        }
        return true;
    }
}
