package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.a;
import java.io.File;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes7.dex */
public class kmy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMMA = ",";

    public static long a(File[] fileArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c025e193", new Object[]{fileArr, new Integer(i)})).longValue();
        }
        if (fileArr == null || fileArr.length == 0) {
            return 0L;
        }
        long j = 0;
        for (File file : fileArr) {
            long a2 = kmx.a(file);
            kmv.d("Downloader.FragmentBoostUtils", ResponseProtocolType.ID + i + ", getFragmentFilesSize " + file.getName() + ", " + a2, new Object[0]);
            j += a2;
        }
        return j;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static void a(java.io.File r16, java.io.File[] r17, int r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kmy.a(java.io.File, java.io.File[], int, boolean):void");
    }

    public static String a(klv klvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a678c9b3", new Object[]{klvVar, str});
        }
        String str2 = (String) kmw.b(a.c, str, "");
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String[] split = str2.split(",");
        if (klvVar.f == null) {
            klvVar.f = new File[split.length];
            for (int i = 0; i < split.length; i++) {
                File[] fileArr = klvVar.f;
                fileArr[i] = klvVar.a(i + "");
                String[] split2 = split[i].split("-");
                if (split2 != null && split2.length == 3) {
                    long parseLong = Long.parseLong(split2[0]);
                    long parseLong2 = Long.parseLong(split2[1]);
                    long j = (parseLong2 - parseLong) + 1;
                    long a2 = klvVar.a(klvVar.f[i], j);
                    if (a2 != j) {
                        if (sb.toString().length() > 0) {
                            sb.append(",");
                        }
                        sb.append(parseLong + a2);
                        sb.append("-");
                        sb.append(parseLong2);
                        sb.append("-");
                        sb.append(i);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static boolean a(String str, String str2, int i) {
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dba950b", new Object[]{str, str2, new Integer(i)})).booleanValue();
        }
        if (TextUtils.isEmpty(str2) || str2.split(",") == null || (length = str2.split(",").length) == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(ResponseProtocolType.ID);
            sb.append(i);
            sb.append(", ");
            sb.append("saveFileFragmentContext url=");
            sb.append(str);
            sb.append(", fragmentListSize = ");
            sb.append(str2 == null ? "null" : 0);
            kmv.d("Downloader.FragmentBoostUtils", sb.toString(), new Object[0]);
            return false;
        }
        String str3 = (String) kmw.b(a.c, str, "");
        if (!TextUtils.isEmpty(str3)) {
            kmv.d("Downloader.FragmentBoostUtils", ResponseProtocolType.ID + i + ", saveFileFragmentContext url=" + str + ", defaultValue = " + str3, new Object[0]);
            return false;
        }
        kmw.a(a.c, str, str2);
        kmv.d("Downloader.FragmentBoostUtils", ResponseProtocolType.ID + i + ", saveFileFragmentContext url = " + str + ", " + str2 + ", fragmentListSize = " + length, new Object[0]);
        return true;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            kmw.a(a.c, str);
        }
    }
}
