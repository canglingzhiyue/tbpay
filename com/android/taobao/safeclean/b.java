package com.android.taobao.safeclean;

import android.app.Application;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.CleanList;
import com.taobao.trtc.api.TrtcConstants;
import java.io.File;
import java.io.FileFilter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.cit;
import tb.ciu;
import tb.civ;
import tb.ciw;
import tb.ciy;
import tb.ciz;
import tb.dvq;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007\b\u0016¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001c\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/android/taobao/safeclean/CleanBusiness;", "", "()V", "handlerChain", "Lcom/android/taobao/safeclean/handler/HandlerChain;", "deleteDirectory", "", "folder", "Ljava/io/File;", TrtcConstants.TRTC_PARAMS_EXTENSION, "", "exclude", "deleteFile", "", "file", "doClean", "cleanDataList", "", "Lcom/android/taobao/safeclean/CleanList$CleanModel;", "cleanCallback", "Lcom/android/taobao/safeclean/CleanBusiness$CleanCallback;", "translate", "location", "CleanCallback", "CustomFileFilter", "safe-clean_debug"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ciu f6395a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/android/taobao/safeclean/CleanBusiness$CleanCallback;", "", "onAllFinish", "", "onFailure", "dataId", "", "onFileMiss", "onSucess", "safe-clean_debug"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void a(int i);

        void b(int i);

        void c(int i);
    }

    static {
        kge.a(375841059);
    }

    public b() {
        civ civVar = new civ();
        this.f6395a = new ciu(p.b(new ciy(), new cit(), civVar, new ciz(), new ciw()));
    }

    public final synchronized void a(List<CleanList.CleanModel> cleanDataList, a cleanCallback) {
        File file;
        File filesDir;
        File externalCacheDir;
        File externalFilesDir;
        SharedPreferences.Editor remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11be6c2f", new Object[]{this, cleanDataList, cleanCallback});
            return;
        }
        q.d(cleanDataList, "cleanDataList");
        q.d(cleanCallback, "cleanCallback");
        for (CleanList.CleanModel cleanModel : cleanDataList) {
            String str = cleanModel.type;
            q.b(str, "cleanData.type");
            String str2 = cleanModel.fileRoot;
            String str3 = cleanModel.exclude;
            q.b(str3, "cleanData.exclude");
            String str4 = cleanModel.extension;
            q.b(str4, "cleanData.extension");
            String a2 = a(cleanModel.fileLocation);
            String str5 = null;
            SharedPreferences sharedPreferences = null;
            r10 = null;
            File file2 = null;
            File file3 = null;
            File file4 = null;
            r10 = null;
            String str6 = null;
            File file5 = null;
            File file6 = null;
            File file7 = null;
            str5 = null;
            if (q.a((Object) str, (Object) "internal")) {
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode != 0) {
                        if (hashCode != 94416770) {
                            if (hashCode == 97434231 && str2.equals(dvq.FILES_DIR_NAME)) {
                                Application application = m.f6406a;
                                if (application != null) {
                                    file6 = application.getFilesDir();
                                }
                                file = new File(file6, a2);
                            }
                        } else if (str2.equals("cache")) {
                            Application application2 = m.f6406a;
                            if (application2 != null) {
                                file7 = application2.getCacheDir();
                            }
                            file = new File(file7, a2);
                        }
                    } else if (str2.equals("")) {
                        Application application3 = m.f6406a;
                        if (application3 != null && (filesDir = application3.getFilesDir()) != null) {
                            str5 = filesDir.getParent();
                        }
                        file = new File(str5, a2);
                    }
                }
                Application application4 = m.f6406a;
                if (application4 != null) {
                    file5 = application4.getDir(str2, 0);
                }
                file = new File(file5, a2);
            } else if (q.a((Object) str, (Object) UiUtil.INPUT_TYPE_VALUE_EXTERNAL)) {
                if (str2 != null) {
                    int hashCode2 = str2.hashCode();
                    if (hashCode2 != 0) {
                        if (hashCode2 != 94416770) {
                            if (hashCode2 == 97434231 && str2.equals(dvq.FILES_DIR_NAME)) {
                                Application application5 = m.f6406a;
                                if (application5 != null) {
                                    file3 = application5.getExternalFilesDir(null);
                                }
                                file = new File(file3, a2);
                            }
                        } else if (str2.equals("cache")) {
                            Application application6 = m.f6406a;
                            if (application6 != null) {
                                file4 = application6.getExternalCacheDir();
                            }
                            file = new File(file4, a2);
                        }
                    } else if (str2.equals("")) {
                        Application application7 = m.f6406a;
                        if (application7 != null && (externalCacheDir = application7.getExternalCacheDir()) != null) {
                            str6 = externalCacheDir.getParent();
                        }
                        file = new File(str6, a2);
                    }
                }
                Application application8 = m.f6406a;
                if (application8 != null && (externalFilesDir = application8.getExternalFilesDir(null)) != null) {
                    file2 = externalFilesDir.getParentFile();
                }
                file = new File(file2, a2);
            } else {
                Application application9 = m.f6406a;
                if (application9 != null) {
                    sharedPreferences = application9.getSharedPreferences(str2, 0);
                }
                if (sharedPreferences != null && sharedPreferences.contains(a2)) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (edit != null && (remove = edit.remove(a2)) != null) {
                        remove.apply();
                    }
                    if (cleanCallback != null) {
                        cleanCallback.a(cleanModel.dataId);
                    }
                } else if (cleanCallback != null) {
                    cleanCallback.c(cleanModel.dataId);
                }
            }
            if (file.exists()) {
                Log.e("CleanBusiness", "clean file:" + file.getAbsolutePath());
                boolean a3 = a(file, str4, str3);
                if (!a3) {
                    if (cleanCallback != null) {
                        cleanCallback.b(cleanModel.dataId);
                    }
                } else if (a3 && cleanCallback != null) {
                    cleanCallback.a(cleanModel.dataId);
                }
            } else {
                if (cleanCallback != null) {
                    cleanCallback.c(cleanModel.dataId);
                }
                Log.e("CleanBusiness", "clean file not exit:" + file.getAbsolutePath());
            }
        }
        if (cleanCallback == null) {
            return;
        }
        cleanCallback.a();
    }

    private final String a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        return z ? "" : this.f6395a.a(str);
    }

    private final boolean a(File file, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7089177", new Object[]{this, file, str, str2})).booleanValue();
        }
        if (file.isDirectory()) {
            b(file, str, str2);
        } else {
            file.delete();
        }
        return !file.exists();
    }

    private final void b(File file, String str, String str2) {
        File[] files;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205ce6b4", new Object[]{this, file, str, str2});
        } else if (file.exists()) {
            String str3 = str;
            if (!StringUtils.isEmpty(str3)) {
                files = file.listFiles(new C0205b(str));
                if (files == null) {
                    return;
                }
            } else {
                files = file.listFiles();
                if (files == null) {
                    file.delete();
                    return;
                }
            }
            q.b(files, "files");
            int length = files.length;
            for (int i = 0; i < length; i++) {
                if (files[i].isDirectory() && (!q.a((Object) files[i].getName(), (Object) str2))) {
                    b(files[i], str, str2);
                } else if (files[i].isFile() && (!q.a((Object) files[i].getName(), (Object) str2))) {
                    files[i].delete();
                }
            }
            if (!StringUtils.isEmpty(str3)) {
                return;
            }
            file.delete();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/android/taobao/safeclean/CleanBusiness$CustomFileFilter;", "Ljava/io/FileFilter;", TrtcConstants.TRTC_PARAMS_EXTENSION, "", "(Ljava/lang/String;)V", "accept", "", "pathname", "Ljava/io/File;", "safe-clean_debug"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.android.taobao.safeclean.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0205b implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f6396a;

        static {
            kge.a(1563481062);
            kge.a(-1123682416);
        }

        public C0205b(String str) {
            this.f6396a = str;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            String str = this.f6396a;
            if (!(str == null || str.length() == 0)) {
                if (!q.a((Object) (file != null ? kotlin.io.f.b(file) : null), (Object) this.f6396a)) {
                    return false;
                }
            }
            return true;
        }
    }
}
