package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.util.c;
import com.taobao.taopai.material.bean.StickerMaiMaterialBean;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes8.dex */
public class qbr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-546029028);
    }

    public static boolean a(String str, String str2, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("699882a1", new Object[]{str, str2, new Integer(i), new Long(j)})).booleanValue();
        }
        String a2 = a(str2, i, str);
        if (qcg.a(a2)) {
            File file = new File(a2);
            if (j > 0 && file.lastModified() < j) {
                Log.e("TPMaterial", "tid = " + str2 + " data expired");
                return false;
            }
            int d = izg.d();
            if (d > 0 && qcg.a(file, d) < d) {
                Log.e("TPMaterial", "tid = " + str2 + " , folder is empty");
                return false;
            }
            File[] listFiles = new File(a2).listFiles();
            return listFiles != null && listFiles.length > 0;
        }
        return a(str2, i, j);
    }

    @Deprecated
    public static boolean a(String str, int i, long j) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3526bd7", new Object[]{str, new Integer(i), new Long(j)})).booleanValue();
        }
        String a2 = qbs.a(str, i, false);
        if (qcg.a(a2)) {
            return (j <= 0 || new File(a2).lastModified() >= j) && (listFiles = new File(a2).listFiles()) != null && listFiles.length > 0;
        }
        String a3 = qbs.a(str, false);
        return qcg.a(a3) && b(new File(a3)) != null;
    }

    public static String a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("86b04965", new Object[]{str, new Integer(i), str2}) : a(str, i, str2, false);
    }

    public static String a(String str, int i, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2970827", new Object[]{str, new Integer(i), str2, new Boolean(z)});
        }
        String a2 = qbs.a(str, z);
        return a2 + File.separator + b(str, i, str2);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str, "material.json");
        return file.exists() ? file.getAbsolutePath() : "";
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str, "material.json");
        if (file.exists()) {
            try {
                StickerMaiMaterialBean stickerMaiMaterialBean = (StickerMaiMaterialBean) JSON.parseObject(pyv.a(file), StickerMaiMaterialBean.class);
                if (stickerMaiMaterialBean != null) {
                    if (stickerMaiMaterialBean.modules != null && !stickerMaiMaterialBean.modules.isEmpty()) {
                        return a(str, stickerMaiMaterialBean);
                    }
                    if (stickerMaiMaterialBean.info != null) {
                        if (TextUtils.equals(stickerMaiMaterialBean.info.type, "Animation")) {
                            return c(str, stickerMaiMaterialBean);
                        }
                        return b(str, stickerMaiMaterialBean);
                    }
                }
            } catch (Exception e) {
                Log.e("MaterialFile", e.getMessage());
            }
        }
        return "";
    }

    private static String a(String str, StickerMaiMaterialBean stickerMaiMaterialBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb0d7a6b", new Object[]{str, stickerMaiMaterialBean});
        }
        StickerMaiMaterialBean.ModuleTree moduleTree = stickerMaiMaterialBean.modules.get(0);
        if (moduleTree == null || moduleTree.images == null || moduleTree.images.isEmpty()) {
            return null;
        }
        return str + File.separator + moduleTree.images.get(0);
    }

    private static String b(String str, StickerMaiMaterialBean stickerMaiMaterialBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ab8f424a", new Object[]{str, stickerMaiMaterialBean}) : TextUtils.isEmpty(stickerMaiMaterialBean.info.path) ? "" : new File(str, stickerMaiMaterialBean.info.path).getAbsolutePath();
    }

    private static String c(String str, StickerMaiMaterialBean stickerMaiMaterialBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c110a29", new Object[]{str, stickerMaiMaterialBean});
        }
        File[] listFiles = new File(new File(str, stickerMaiMaterialBean.info.path).getParent()).listFiles();
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            String lowerCase = file.getName().toLowerCase();
            if (lowerCase.endsWith(".png") || lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg")) {
                arrayList.add(lowerCase);
            }
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        Arrays.sort(strArr);
        return strArr[strArr.length - 1];
    }

    private static String b(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97661626", new Object[]{str, new Integer(i), str2});
        }
        if (!TextUtils.isEmpty(str2)) {
            String a2 = c.a(str2);
            return a2 == null ? String.valueOf(str2.hashCode()) : a2;
        } else if (i < 0) {
            return str;
        } else {
            return str + "_" + i;
        }
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            return false;
        }
        return listFiles.length != 1 || !listFiles[0].getName().endsWith(qbs.c());
    }

    public static String b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa476700", new Object[]{file});
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            return null;
        }
        if (listFiles.length == 1) {
            File file2 = listFiles[0];
            if (!a(file2)) {
                return null;
            }
            return file2.getAbsolutePath();
        }
        List asList = Arrays.asList(listFiles);
        Collections.sort(asList, new Comparator<File>() { // from class: tb.qbr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(File file3, File file4) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, file3, file4})).intValue() : a(file3, file4);
            }

            public int a(File file3, File file4) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("a3abf709", new Object[]{this, file3, file4})).intValue() : Long.compare(file4.lastModified(), file3.lastModified());
            }
        });
        File file3 = (File) asList.get(0);
        if (!a(file3)) {
            return null;
        }
        return file3.getAbsolutePath();
    }
}
