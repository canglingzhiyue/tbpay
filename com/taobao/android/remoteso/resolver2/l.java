package com.taobao.android.remoteso.resolver2;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.RemoteResolver;
import com.taobao.android.remoteso.resolver2.c;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import tb.iim;
import tb.ijd;
import tb.ijv;
import tb.ikq;
import tb.ikw;

/* loaded from: classes6.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(ijd ijdVar, j jVar, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7731a63", new Object[]{ijdVar, jVar, aVar})).booleanValue();
        }
        if (!ijdVar.b(jVar.a())) {
            return false;
        }
        RSoLog.d("fetchAsync -> failure , lib on demand download in config not allowed , libName=" + jVar.a());
        aVar.a(a(jVar, RSoException.error(5003), "download-disabled"));
        return true;
    }

    public static j a(com.taobao.android.remoteso.index.c cVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("6c6e107b", new Object[]{cVar, str}) : j.a(str, cVar.a(str), cVar.b(str));
    }

    public static j a(com.taobao.android.remoteso.index.c cVar, String str, SoIndexData soIndexData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("5ad6a9a5", new Object[]{cVar, str, soIndexData}) : j.a(str, cVar.b(str, soIndexData), cVar.b(str));
    }

    public static j b(com.taobao.android.remoteso.index.c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("24fad0da", new Object[]{cVar, str});
        }
        SoIndexData.SoFileInfo c = cVar.c(str);
        if (c != null) {
            return j.a(str, c, cVar.b(str));
        }
        return null;
    }

    public static j a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("976bdc16", new Object[]{str});
        }
        SoIndexData.SoFileInfo soFileInfo = new SoIndexData.SoFileInfo();
        soFileInfo.setFrom("defaultApk");
        soFileInfo.setUri("");
        soFileInfo.setMd5("");
        soFileInfo.setLength(-1L);
        return j.a(str, soFileInfo, null);
    }

    public static k a(j jVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("8eb0d763", new Object[]{jVar, str, str2}) : k.a(jVar, str, str2);
    }

    public static k a(j jVar, RSoException rSoException, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("9e73278", new Object[]{jVar, rSoException, str}) : k.a(jVar, str, rSoException);
    }

    public static File a(String str, SoInfo2 soInfo2, SoIndexData.SoFileInfo soFileInfo, ijv ijvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("bd02ade6", new Object[]{str, soInfo2, soFileInfo, ijvVar});
        }
        String i = j.a(str, soFileInfo, soInfo2).i();
        String provideStorageKey = soFileInfo.provideStorageKey();
        File a2 = a(ijvVar.b(i, provideStorageKey), soFileInfo.getLength());
        if (a2 != null) {
            RSoLog.c("findDiffBaseFile, succ from rso, " + str);
            return a2;
        }
        File a3 = a(b(str), soFileInfo.getLength());
        if (a3 != null) {
            RSoLog.c("findDiffBaseFile, succ from apk, " + str);
            return a3;
        }
        RSoLog.c("findDiffBaseFile, not found, lib=" + str + ", localFileName=" + i + ", baseFileStorageKey=" + provideStorageKey);
        return null;
    }

    public static File a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("956d797b", new Object[]{str, new Long(j)});
        }
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (j != -1 && j != file.length()) {
            return null;
        }
        return file;
    }

    public static iim a(String str, SoIndexData.SoFileInfo soFileInfo, String str2, ijv ijvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iim) ipChange.ipc$dispatch("81b17ed4", new Object[]{str, soFileInfo, str2, ijvVar});
        }
        j a2 = j.a(str, soFileInfo, null);
        String a3 = a2.a();
        String d = a2.d();
        String a4 = ijvVar.a(a2.e().provideStorageKey());
        String i = a2.i();
        iim iimVar = new iim(a3, d, a4, i, a4 + File.separator + i, a2.c(), a2.e().getLength());
        iimVar.a(ikw.a((CharSequence) "presettle", (CharSequence) str2));
        return iimVar;
    }

    public static RemoteResolver.RemoteAdvancedInfo a(SoInfo2 soInfo2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteResolver.RemoteAdvancedInfo) ipChange.ipc$dispatch("90563b68", new Object[]{soInfo2});
        }
        if (soInfo2.advancedInfo == null) {
            RSoLog.c("RemoteResolver -> findAdvancedInfo end: soInfo2.advancedInfo == null");
            return null;
        }
        try {
            return (RemoteResolver.RemoteAdvancedInfo) JSON.parseObject(soInfo2.advancedInfo, RemoteResolver.RemoteAdvancedInfo.class);
        } catch (Throwable th) {
            ikq.a("RemoteResolver -> findAdvancedInfo parse err:", th);
            return null;
        }
    }

    public static Collection<SoIndexData.SoFileInfo> b(SoInfo2 soInfo2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("159f6820", new Object[]{soInfo2});
        }
        if (soInfo2 == null) {
            return Collections.emptyList();
        }
        RemoteResolver.RemoteAdvancedInfo a2 = a(soInfo2);
        if (a2 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(4);
        a(arrayList, a2.diffBase);
        a(arrayList, a2.diffPatch);
        a(arrayList, a2.compressedRemote);
        a(arrayList, a2.compressedLocal);
        return arrayList;
    }

    private static <T> void a(Collection<T> collection, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc4f7b5", new Object[]{collection, t});
        } else if (t == null) {
        } else {
            collection.add(t);
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        try {
            ClassLoader classLoader = l.class.getClassLoader();
            if (!(classLoader instanceof BaseDexClassLoader)) {
                return null;
            }
            String findLibrary = ((BaseDexClassLoader) classLoader).findLibrary(str);
            if (!ikw.b((CharSequence) findLibrary)) {
                return null;
            }
            RSoLog.c("findLibInClassLoader, found lib in classloader, file=" + findLibrary);
            return findLibrary;
        } catch (Throwable th) {
            RSoLog.b("findLibInClassLoader, failed found from classloader", th);
            return null;
        }
    }
}
