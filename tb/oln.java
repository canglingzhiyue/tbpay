package tb;

import android.content.Context;
import android.os.Environment;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.g;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.utils.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class oln implements olo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_CODE = "common_file_upload";

    static {
        kge.a(-395328726);
        kge.a(995465610);
    }

    /* renamed from: lambda$qWuae2rZGq-M3e8Sx8ZwludIG7c */
    public static /* synthetic */ void m2472lambda$qWuae2rZGqM3e8Sx8ZwludIG7c(Context context, olr olrVar, olp olpVar) {
        b(context, olrVar, olpVar);
    }

    @Override // tb.olo
    public String getBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this}) : BIZ_CODE;
    }

    @Override // tb.olo
    public void onUploadDone(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca026d15", new Object[]{this, new Boolean(z), str});
        }
    }

    @Override // tb.olo
    public void executeUploadTask(final Context context, final olr olrVar, final olp olpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca35e6fe", new Object[]{this, context, olrVar, olpVar});
        } else {
            d.a().a(new Runnable() { // from class: tb.-$$Lambda$oln$qWuae2rZGq-M3e8Sx8ZwludIG7c
                @Override // java.lang.Runnable
                public final void run() {
                    oln.m2472lambda$qWuae2rZGqM3e8Sx8ZwludIG7c(context, olrVar, olpVar);
                }
            });
        }
    }

    public static /* synthetic */ void b(Context context, olr olrVar, olp olpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84132677", new Object[]{context, olrVar, olpVar});
            return;
        }
        try {
            a(context, olrVar, olpVar);
        } catch (Exception unused) {
            olpVar.a(null);
        }
    }

    private static void a(Context context, olr olrVar, olp olpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca9b98d8", new Object[]{context, olrVar, olpVar});
            return;
        }
        olq olqVar = new olq();
        olqVar.b = BIZ_CODE;
        if (olrVar == null || olrVar.f32159a == null) {
            a(olqVar, olpVar, ErrorCode.DATA_EMPTY, "uploadMsg is null");
            return;
        }
        olqVar.c = olrVar.f32159a;
        try {
            List<File> a2 = a(context, olrVar.f32159a.get("path"));
            if (a2 == null || a2.isEmpty()) {
                a(olqVar, olpVar, ErrorCode.UPLOAD_NO_FILE, "can't find files!");
                return;
            }
            olqVar.f32158a = new ArrayList();
            File file = new File(context.getCacheDir(), "udf");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, System.currentTimeMillis() + "_udf.zip");
            if (g.a(a2, file2) && file2.exists()) {
                if (file2.length() > 99614720) {
                    file2.delete();
                    a(olqVar, olpVar, ErrorCode.UDF_FILE_LARGE, "file is large than 95M");
                    return;
                }
                olqVar.f32158a.add(file2.getAbsolutePath());
                olqVar.f = true;
                olpVar.a(olqVar);
                return;
            }
            a(olqVar, olpVar, ErrorCode.FILE_ZIP_ERROR, "failed to zip files");
        } catch (Exception e) {
            a(olqVar, olpVar, ErrorCode.CODE_EXC, e.getMessage());
        }
    }

    private static void a(olq olqVar, olp olpVar, ErrorCode errorCode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3285d36", new Object[]{olqVar, olpVar, errorCode, str});
            return;
        }
        olqVar.d = errorCode.getValue();
        olqVar.e = str;
        olpVar.a(olqVar);
    }

    private static List<File> a(Context context, String str) {
        String[] split;
        File rootDirectory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("42cb42dd", new Object[]{context, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        File parentFile = context.getFilesDir().getParentFile();
        File parentFile2 = "mounted".equals(Environment.getExternalStorageState()) ? context.getExternalCacheDir().getParentFile() : null;
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",")) {
            int i = 10;
            if (str2.toLowerCase().startsWith("$internal/")) {
                rootDirectory = parentFile;
            } else if (str2.startsWith("$external/") && parentFile2 != null) {
                rootDirectory = parentFile2;
            } else if (str2.startsWith("$data_app/")) {
                rootDirectory = new File(context.getPackageCodePath()).getParentFile();
            } else if (str2.startsWith("$system/")) {
                rootDirectory = Environment.getRootDirectory();
                i = 8;
            } else {
                continue;
            }
            if (rootDirectory == null) {
                return null;
            }
            File file = new File(rootDirectory, str2.substring(i));
            String name = file.getName();
            if (name.endsWith("$")) {
                List<File> a2 = g.a(file.getParentFile(), name.substring(0, name.length() - 1));
                if (a2 != null) {
                    arrayList.addAll(a2);
                }
            } else if (file.exists() && file.length() > 0) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }
}
