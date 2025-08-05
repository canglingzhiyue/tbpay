package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.downloader.b;
import java.util.Collections;

/* loaded from: classes7.dex */
public class szy extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MMGETLOCALURL = -1873358759589180155L;

    static {
        kge.a(-624402382);
    }

    public static /* synthetic */ Object ipc$super(szy szyVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length <= 0) {
            stv.a("DXDataParserMmGetLocalUrl", "evalWithArgs: operationList is null or empty");
            return null;
        }
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        stv.a("DXDataParserMmGetLocalUrl", "evalWithArgs: url: " + str + ", downloadType: " + str2);
        String b = stu.b(str);
        if (!TextUtils.isEmpty(b)) {
            stv.a("DXDataParserMmGetLocalUrl", "evalWithArgs: local path: " + b);
            return b;
        }
        stv.a("DXDataParserMmGetLocalUrl", "evalWithArgs: local file not find");
        if ("default".equals(str2)) {
            a(str);
        }
        return str;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String c = keo.c(str);
        if (TextUtils.isEmpty(c)) {
            stv.a("DXDataParserMmGetLocalUrl", "downloadUrl: can not parse file name, url: " + str);
            return;
        }
        kmo kmoVar = new kmo();
        kmoVar.f30167a = str;
        kmoVar.d = c;
        kmm kmmVar = new kmm();
        kmmVar.f30166a = Collections.singletonList(kmoVar);
        kmmVar.b = new kmq();
        kmmVar.b.f30169a = "TBBootImage";
        kmmVar.b.j = false;
        kmmVar.b.h = stu.a();
        b.a().a(kmmVar, new kmk() { // from class: tb.szy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kmk, tb.kml
            public void onDownloadError(String str2, int i, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str2, new Integer(i), str3});
                    return;
                }
                stv.a("DXDataParserMmGetLocalUrl", "downloadUrl: download error, url: " + str2 + ", errorCode: " + i + ", msg: " + str3);
            }

            @Override // tb.kmk, tb.kml
            public void onDownloadFinish(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str2, str3});
                    return;
                }
                stv.a("DXDataParserMmGetLocalUrl", "downloadUrl: download finish, url: " + str2 + ", filePath: " + str3);
            }
        });
        stv.a("DXDataParserMmGetLocalUrl", "downloadUrl: start download, url: " + str + ", name: " + c);
    }
}
