package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONObject;
import tb.ado;
import tb.kge;

/* loaded from: classes2.dex */
public class WVFile extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long FILE_MAX_SIZE = 5242880;

    static {
        kge.a(562862185);
    }

    public static /* synthetic */ Object ipc$super(WVFile wVFile, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("read".equals(str)) {
            read(str2, wVCallBackContext);
        } else if (!"write".equals(str)) {
            return false;
        } else {
            write(str2, wVCallBackContext);
        }
        return true;
    }

    public final void read(String str, WVCallBackContext wVCallBackContext) {
        String optString;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89f5164", new Object[]{this, str, wVCallBackContext});
            return;
        }
        String str3 = "";
        if (!StringUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                str3 = jSONObject.optString("fileName");
                optString = jSONObject.optString("share", "false");
                if (str3 == null || str3.contains(File.separator)) {
                    throw new Exception();
                }
            } catch (Exception unused) {
                wVCallBackContext.error(new r("HY_PARAM_ERR"));
                return;
            }
        } else {
            optString = str3;
        }
        String a2 = android.taobao.windvane.cache.a.a().a(false);
        if (a2 == null) {
            r rVar = new r();
            rVar.a("error", "GET_DIR_FAILED");
            wVCallBackContext.error(rVar);
            return;
        }
        if (!"true".equalsIgnoreCase(optString)) {
            String str4 = a2 + File.separator;
            str2 = str4 + ado.a(this.mWebView.getUrl());
        } else {
            str2 = (a2 + File.separator) + "wvShareFiles";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str2 + File.separator + str3));
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            String str5 = new String(bArr, "UTF-8");
            fileInputStream.close();
            r rVar2 = new r();
            rVar2.a("data", str5);
            wVCallBackContext.success(rVar2);
        } catch (FileNotFoundException unused2) {
            r rVar3 = new r();
            rVar3.a("error", "FILE_NOT_FOUND");
            wVCallBackContext.error(rVar3);
        } catch (Exception e) {
            r rVar4 = new r();
            rVar4.a("error", "READ_FILE_FAILED");
            wVCallBackContext.error(rVar4);
            e.printStackTrace();
        }
    }

    public final void write(String str, WVCallBackContext wVCallBackContext) {
        String optString;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b41006d", new Object[]{this, str, wVCallBackContext});
            return;
        }
        String str5 = "";
        if (!StringUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString2 = jSONObject.optString("mode", "write");
                String optString3 = jSONObject.optString("data");
                String optString4 = jSONObject.optString("fileName");
                optString = jSONObject.optString("share", "false");
                if (optString2 == null || optString4 == null || optString4.contains(File.separator)) {
                    throw new Exception();
                }
                str2 = optString3;
                str3 = optString2;
                str5 = optString4;
            } catch (Exception unused) {
                r rVar = new r();
                rVar.a("error", "PARAMS_ERROR");
                wVCallBackContext.error(rVar);
                return;
            }
        } else {
            str3 = str5;
            optString = str3;
            str2 = optString;
        }
        String a2 = android.taobao.windvane.cache.a.a().a(false);
        if (a2 == null) {
            r rVar2 = new r();
            rVar2.a("error", "GET_DIR_FAILED");
            wVCallBackContext.error(rVar2);
            return;
        }
        if (!"true".equalsIgnoreCase(optString)) {
            String str6 = a2 + File.separator;
            str4 = str6 + ado.a(this.mWebView.getUrl());
        } else {
            str4 = (a2 + File.separator) + "wvShareFiles";
        }
        File file = new File(str4);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str4 + File.separator + str5);
        if (file2.exists()) {
            if ("write".equalsIgnoreCase(str3)) {
                r rVar3 = new r();
                rVar3.a("error", "FILE_EXIST");
                wVCallBackContext.error(rVar3);
                return;
            }
        } else {
            try {
                file2.createNewFile();
            } catch (IOException unused2) {
                r rVar4 = new r();
                rVar4.a("error", "MAKE_FILE_FAILED");
                wVCallBackContext.error(rVar4);
                return;
            }
        }
        try {
            boolean equalsIgnoreCase = "append".equalsIgnoreCase(str3);
            if (!canWriteFile(file2.length(), str2, equalsIgnoreCase)) {
                r rVar5 = new r();
                rVar5.a("error", "FILE_TOO_LARGE");
                wVCallBackContext.error(rVar5);
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2, equalsIgnoreCase);
            fileOutputStream.write(str2.getBytes());
            fileOutputStream.close();
            wVCallBackContext.success();
        } catch (Exception e) {
            r rVar6 = new r();
            rVar6.a("error", "WRITE_FILE_FAILED");
            wVCallBackContext.error(rVar6);
            e.printStackTrace();
        }
    }

    private boolean canWriteFile(long j, String str, boolean z) {
        long length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fd71b1c", new Object[]{this, new Long(j), str, new Boolean(z)})).booleanValue();
        }
        if (z) {
            length = j + str.length();
        } else {
            length = str.length();
        }
        return length <= FILE_MAX_SIZE;
    }
}
