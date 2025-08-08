package com.taobao.umipublish.draft;

import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.k;
import com.taobao.android.litecreator.util.u;
import com.taobao.umipublish.draft.DraftModel;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes9.dex */
public class DraftMediaHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f23235a;

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes9.dex */
    public @interface DraftType {
        public static final String MATERIALS = "materials";
        public static final String PRODUCT = "product";
        public static final String RESOURCE = "resource";
        public static final String SERIALIZE = "serialize";
    }

    /* loaded from: classes9.dex */
    public interface a {
        void a();

        void a(String str);
    }

    static {
        kge.a(-1085839011);
    }

    public DraftMediaHelper(Context context) {
        this.f23235a = context;
    }

    public void a(DraftModel draftModel, String str, @DraftType String str2, a aVar, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31bc459d", new Object[]{this, draftModel, str, str2, aVar, list});
            return;
        }
        File a2 = a(str, draftModel);
        if (a2 == null || list == null) {
            if (aVar == null) {
                return;
            }
            aVar.a("cacheDir null");
        } else if (list.size() == 0) {
            if (aVar == null) {
                return;
            }
            aVar.a();
        } else {
            File file = new File(a2, str2);
            if (!file.exists() && !file.mkdir()) {
                if (aVar == null) {
                    return;
                }
                aVar.a("typeDir null");
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(list.size());
            for (String str3 : list) {
                if (str3.startsWith(file.getAbsolutePath())) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        aVar.a();
                        return;
                    }
                } else {
                    File file2 = new File(str3);
                    File file3 = new File(file, file2.getName());
                    if (file2.isDirectory()) {
                        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                        if (k.c(str3, file3.getAbsolutePath())) {
                            UmiPublishMonitor.a(b.TAG, "copyAssetsMediasOfDraft dir cost" + (SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
                            if (atomicInteger.decrementAndGet() == 0) {
                                aVar.a();
                                return;
                            }
                        } else {
                            aVar.a("copyFile err");
                            return;
                        }
                    } else if (k.e(str3)) {
                        long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
                        if (k.a(file2, file3.getAbsolutePath())) {
                            UmiPublishMonitor.a(b.TAG, "copyAssetsMediasOfDraft cost" + (SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis2));
                            if (atomicInteger.decrementAndGet() == 0) {
                                aVar.a();
                                return;
                            }
                        } else {
                            aVar.a("copyFile err");
                            return;
                        }
                    } else if (atomicInteger.decrementAndGet() == 0) {
                        aVar.a();
                        return;
                    }
                }
            }
        }
    }

    public void a(DraftModel draftModel, DraftModel draftModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a105b9e", new Object[]{this, draftModel, draftModel2});
        } else if (draftModel.meta != null) {
            if (draftModel.meta.videos != null) {
                for (DraftModel.Video video : draftModel.meta.videos) {
                    if (video != null) {
                        String str = video.coverLocalUrl;
                        String str2 = draftModel.localPathToCdnUrl.get(str);
                        if (StringUtils.isEmpty(video.coverOriginFile)) {
                            video.coverOriginFile = video.coverLocalUrl;
                        }
                        video.coverLocalUrl = a(DraftType.PRODUCT, video.coverLocalUrl, draftModel);
                        if (str2 != null && !StringUtils.equals(video.coverLocalUrl, str)) {
                            draftModel.localPathToCdnUrl.put(video.coverLocalUrl, str2);
                            draftModel.localPathToCdnUrl.remove(str);
                        }
                        String str3 = video.videoLocalUrl;
                        if (StringUtils.isEmpty(video.videoOriginFile)) {
                            video.videoOriginFile = video.videoLocalUrl;
                        }
                        String str4 = draftModel.localPathToCdnUrl.get(str3);
                        video.videoLocalUrl = a(DraftType.PRODUCT, video.videoLocalUrl, draftModel);
                        if (str4 != null && !StringUtils.equals(video.videoLocalUrl, str3)) {
                            draftModel.localPathToCdnUrl.put(video.videoLocalUrl, str4);
                            draftModel.localPathToCdnUrl.remove(str3);
                        }
                        if (str2 != null && str4 != null) {
                            Map<String, String> map = draftModel.localPathToCdnUrl;
                            map.put(video.videoLocalUrl + "-cover.jpg", video.coverLocalUrl);
                        }
                    }
                }
            }
            if (draftModel.meta.photos == null) {
                return;
            }
            for (DraftModel.Photo photo : draftModel.meta.photos) {
                if (photo != null) {
                    String str5 = photo.localUrl;
                    String str6 = draftModel.localPathToCdnUrl.get(photo.localUrl);
                    if (StringUtils.isEmpty(photo.originFilePath)) {
                        photo.originFilePath = photo.localUrl;
                    }
                    photo.localUrl = a(DraftType.PRODUCT, photo.localUrl, draftModel);
                    if (str6 != null && !StringUtils.equals(photo.localUrl, str5)) {
                        draftModel.localPathToCdnUrl.put(photo.localUrl, str6);
                        draftModel.localPathToCdnUrl.remove(str5);
                    }
                }
            }
        }
    }

    public boolean a(DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da839f87", new Object[]{this, draftModel})).booleanValue();
        }
        if (draftModel != null) {
            File a2 = a(draftModel.urlParams.get("umi_pub_session"), draftModel);
            if (a2 != null) {
                k.a(a2);
            }
            File d = d(draftModel);
            if (d != null) {
                k.a(d);
                return true;
            }
            UmiPublishMonitor.a(b.TAG, "deleteMediasOfDraft failed! mediaCacheOfDraftModel is null");
        } else {
            UmiPublishMonitor.a(b.TAG, "deleteMediasOfDraft failed! draftModel is null");
        }
        return false;
    }

    public boolean a(Collection<DraftModel> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2847c1d", new Object[]{this, collection})).booleanValue();
        }
        if (collection != null) {
            for (DraftModel draftModel : collection) {
                if (!a(draftModel)) {
                    return false;
                }
            }
        }
        return true;
    }

    private File d(DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("b0fff7c7", new Object[]{this, draftModel});
        }
        File b = c(draftModel) ? d.b(d.CACHE_DRAFT_PATH) : d.a(d.CACHE_DRAFT_PATH);
        if (b == null) {
            return null;
        }
        File file = new File(b, draftModel.draftId);
        if (file.exists() || file.mkdir()) {
            return file;
        }
        UmiPublishMonitor.a(b.TAG, "getPublishDraftDir. mkdir error: path=" + b.getAbsolutePath() + "/" + draftModel.draftId);
        return null;
    }

    public File a(String str, DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("9a9e1ce0", new Object[]{this, str, draftModel});
        }
        File b = c(draftModel) ? d.b(d.CACHE_DRAFT_PATH) : d.a(d.CACHE_DRAFT_PATH);
        if (b == null) {
            return null;
        }
        File file = new File(b, "videoEditDraft-" + str);
        if (!file.exists() && !file.mkdir()) {
            return null;
        }
        return file;
    }

    private String a(@DraftType String str, String str2, DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c44b8e9", new Object[]{this, str, str2, draftModel});
        }
        if (StringUtils.isEmpty(str2)) {
            return str2;
        }
        File d = d(draftModel);
        if (d == null) {
            return null;
        }
        File file = new File(d, str);
        if (!file.exists() && !file.mkdir()) {
            return null;
        }
        if (str2.startsWith(file.getAbsolutePath())) {
            return str2;
        }
        File file2 = new File(str2);
        File file3 = new File(file, file2.getName());
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        if (k.a(file2, file3.getAbsolutePath())) {
            u.d(b.TAG, "copied " + str2 + " to " + file3.getAbsolutePath());
            StringBuilder sb = new StringBuilder();
            sb.append("copyAssetsMediasOfDraft cost");
            sb.append(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis);
            UmiPublishMonitor.a(b.TAG, sb.toString());
        }
        return file3.getAbsolutePath();
    }

    @Deprecated
    public File a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("72147cad", new Object[]{this, context});
        }
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        if (externalCacheDir == null) {
            return null;
        }
        File file = new File(externalCacheDir, "umi_draft");
        if (!file.exists() && !file.mkdir()) {
            return null;
        }
        return file;
    }

    public DraftModel b(DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DraftModel) ipChange.ipc$dispatch("41e9ab6d", new Object[]{this, draftModel});
        }
        if (draftModel != null && draftModel.meta != null) {
            if (draftModel.meta.videos != null) {
                ArrayList arrayList = new ArrayList();
                for (DraftModel.Video video : draftModel.meta.videos) {
                    if (video != null && (!k.e(video.coverLocalUrl) || !k.e(video.videoLocalUrl))) {
                        arrayList.add(video);
                        if (!StringUtils.isEmpty(video.coverLocalUrl)) {
                            k.a(new File(video.coverLocalUrl));
                        }
                        if (!StringUtils.isEmpty(video.videoLocalUrl)) {
                            k.a(new File(video.videoLocalUrl));
                        }
                    }
                }
                draftModel.meta.videos.removeAll(arrayList);
            }
            if (draftModel.meta.photos != null) {
                ArrayList arrayList2 = new ArrayList();
                for (DraftModel.Photo photo : draftModel.meta.photos) {
                    if (photo != null && !k.e(photo.localUrl)) {
                        arrayList2.add(photo);
                    }
                }
                draftModel.meta.photos.removeAll(arrayList2);
            }
        }
        return draftModel;
    }

    public static boolean c(DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fc52489", new Object[]{draftModel})).booleanValue() : draftModel != null && StringUtils.equals(draftModel.version, "3");
    }
}
