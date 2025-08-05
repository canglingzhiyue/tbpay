package com.taobao.android.fluid.framework.preload.cache;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.timestamp.TimeStampManager;
import tb.kge;
import tb.sox;
import tb.spz;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static IDetailCache f12627a;
    private static IDetailCache b;

    static {
        kge.a(-275998216);
    }

    public static IDetailCache a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDetailCache) ipChange.ipc$dispatch("cc46cd5", new Object[0]);
        }
        if (f12627a == null) {
            f12627a = new a(IDetailCache.SCENE_NAME_SHORT_VIDEO_INTERNAL_EXPOSED);
        }
        return f12627a;
    }

    public static IDetailCache b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDetailCache) ipChange.ipc$dispatch("e885e896", new Object[0]);
        }
        if (b == null) {
            b = new a(IDetailCache.SCENE_NAME_SHORT_VIDEO_INTERNAL_UNEXPOSED);
        }
        return b;
    }

    public static boolean a(DetailCacheData detailCacheData) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("850e05bc", new Object[]{detailCacheData})).booleanValue();
        }
        if (detailCacheData != null) {
            if (detailCacheData.dataState() == -1) {
                z = true;
            }
            detailCacheData.isValid = z;
        }
        return z;
    }

    public static boolean c(DetailCacheData detailCacheData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b656c3e", new Object[]{detailCacheData})).booleanValue();
        }
        if (detailCacheData == null) {
            return false;
        }
        long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp();
        if (currentTimeStamp - detailCacheData.lastCheckVideoCacheTime < 10000) {
            return detailCacheData.hasVideoCached;
        }
        boolean a2 = sox.a(detailCacheData.getVideoResourceStr());
        detailCacheData.hasVideoCached = a2;
        detailCacheData.lastCheckVideoCacheTime = currentTimeStamp;
        return a2;
    }

    public static int b(DetailCacheData detailCacheData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6839b8ec", new Object[]{detailCacheData})).intValue();
        }
        if (detailCacheData == null) {
            return 0;
        }
        int i = (!a(detailCacheData) || !c(detailCacheData)) ? 10 : 100;
        long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp();
        long j = currentTimeStamp - 864000000;
        long timeStamp = detailCacheData.getTimeStamp();
        if (detailCacheData.hasVideoDownloadTime > 0) {
            j = detailCacheData.hasVideoDownloadTime;
        }
        long j2 = currentTimeStamp - timeStamp;
        long j3 = currentTimeStamp - j;
        long j4 = (long) IDetailCache.KEEP_MIN_HAS_CACHE_TIME;
        int i2 = (int) (j2 / j4);
        int i3 = (int) (j3 / j4);
        int i4 = (i - i2) - i3;
        spz.c("DetailCacheManager", "[cachevideo]cacheDataHealthyScore, contentid=" + detailCacheData.contentId + ", now=" + currentTimeStamp + " spendTimeDetail=" + j2 + " spendTimeVideo=" + j3 + ", spendSorceDetailCache=" + i2 + " spendSorceVideoCache=" + i3 + " remainScore=" + i4);
        return i4;
    }
}
