package tb;

import android.content.Context;
import android.taobao.windvane.config.a;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.interact.view.BootImageInteractBaseView;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.view.c;
import com.taobao.bootimage.view.e;
import com.taobao.bootimage.view.f;
import com.taobao.bootimage.view.g;
import com.taobao.bootimage.view.h;
import com.taobao.tao.util.NetWorkUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public class kek {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_SLIDE_URL = "https://gw.alicdn.com/imgextra/i4/O1CN01BG1sT622N3lszrSMs_!!6000000007107-54-tps-270-150.apng";

    static {
        kge.a(715668594);
    }

    public static boolean a(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75806d92", new Object[]{bootImageInfo})).booleanValue();
        }
        if (bootImageInfo == null) {
            kej.a(kem.TAG, "support show type no info");
            return false;
        } else if (StringUtils.isEmpty(bootImageInfo.bizType)) {
            kej.a(kem.TAG, "support show type bizType is empty");
            return false;
        } else if (BootImageInfo.BIZ_TYPE_VIDEO_ICON.equals(bootImageInfo.bizType) || BootImageInfo.BIZ_TYPE_VIDEO.equals(bootImageInfo.bizType) || "image".equals(bootImageInfo.bizType) || "poplayer".equals(bootImageInfo.bizType) || BootImageInfo.BIZ_TYPE_COLD_START_AD.equals(bootImageInfo.bizType) || "commercialAdNormal".equals(bootImageInfo.bizType) || "commercialAdVideo".equals(bootImageInfo.bizType)) {
            return true;
        } else {
            kej.a(kem.TAG, "support show type bizType is unsupport. bizType:" + bootImageInfo.bizType);
            return false;
        }
    }

    public static c a(BootImageInfo bootImageInfo, Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("ad56358", new Object[]{bootImageInfo, context, viewGroup});
        }
        if (bootImageInfo == null || context == null || viewGroup == null) {
            kej.a(kem.TAG, "get boot content fail, check info、context、bootImageContainerView参数");
            return null;
        }
        kej.a("BootImageBizTypeExtend", "BootImageInfo bizType " + bootImageInfo.bizType);
        if (StringUtils.equals("commercialAdVideo", bootImageInfo.bizType)) {
            return new f(context, bootImageInfo, viewGroup);
        }
        if (StringUtils.equals("commercialAdNormal", bootImageInfo.bizType)) {
            return new e(context, bootImageInfo, viewGroup);
        }
        if (StringUtils.equals("image", bootImageInfo.bizType)) {
            return new g(context, bootImageInfo, viewGroup);
        }
        if (StringUtils.equals(BootImageInfo.BIZ_TYPE_VIDEO, bootImageInfo.bizType)) {
            return new h(context, bootImageInfo, viewGroup, false);
        }
        if (!StringUtils.equals(BootImageInfo.BIZ_TYPE_VIDEO_ICON, bootImageInfo.bizType)) {
            return null;
        }
        return new h(context, bootImageInfo, viewGroup, true);
    }

    public static List<kmo> b(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fdc777a", new Object[]{bootImageInfo});
        }
        long b = keo.b();
        if (bootImageInfo == null || !a(bootImageInfo) || bootImageInfo.gmtEndMs < b) {
            kej.a(kem.TAG, "no download resource.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!StringUtils.isEmpty(bootImageInfo.videoUrl)) {
            if (StringUtils.isEmpty(keo.c(bootImageInfo.videoUrl))) {
                kej.a(kem.TAG, "no download resource, name isEmpty. itemId:" + bootImageInfo.itemId);
            } else {
                kmo kmoVar = new kmo();
                if (!StringUtils.isEmpty(bootImageInfo.videoMd5)) {
                    kmoVar.c = bootImageInfo.videoMd5;
                }
                kmoVar.f30167a = bootImageInfo.videoUrl;
                kmoVar.d = keo.c(bootImageInfo.videoUrl);
                arrayList.add(kmoVar);
            }
        } else {
            kej.a(kem.TAG, "no download resource, videoUrl isEmpty. itemId:" + bootImageInfo.itemId);
        }
        if (!StringUtils.isEmpty(bootImageInfo.actionResponse)) {
            a(arrayList, DEFAULT_SLIDE_URL);
        }
        if (!StringUtils.isEmpty(bootImageInfo.animationType) && "1".equals(bootImageInfo.animationType) && !StringUtils.isEmpty(bootImageInfo.animationLottie)) {
            a(arrayList, bootImageInfo.animationLottie);
        }
        if (!bootImageInfo.isGestureViewHide() && !StringUtils.isEmpty(bootImageInfo.gestureImage)) {
            a(arrayList, bootImageInfo.gestureImage);
        }
        if (!StringUtils.isEmpty(bootImageInfo.interactImage)) {
            a(arrayList, bootImageInfo.interactImage);
        }
        if (kel.c) {
            if (bootImageInfo.coldStart && bootImageInfo.imgUrl != null && BootImageInfo.BIZ_TYPE_COLD_START_AD.equals(bootImageInfo.bizType)) {
                kmo kmoVar2 = new kmo();
                kmoVar2.f30167a = bootImageInfo.imgUrl;
                kmoVar2.d = keo.c(bootImageInfo.imgUrl);
                arrayList.add(kmoVar2);
            }
            if (bootImageInfo.coldStart && bootImageInfo.firstFrameImageUrl != null && BootImageInfo.BIZ_TYPE_COLD_START_AD.equals(bootImageInfo.bizType)) {
                kmo kmoVar3 = new kmo();
                kmoVar3.f30167a = bootImageInfo.firstFrameImageUrl;
                kmoVar3.d = keo.c(bootImageInfo.firstFrameImageUrl);
                arrayList.add(kmoVar3);
            }
        }
        return arrayList;
    }

    private static void a(List<kmo> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{list, str});
        } else if (list == null) {
        } else {
            try {
                if (StringUtils.isEmpty(str)) {
                    return;
                }
                String c = keo.c(str);
                if (StringUtils.isEmpty(c)) {
                    kej.a(kem.TAG, "addDownloadItem no download resource, name isEmpty. url:" + str);
                    return;
                }
                kej.a(kem.TAG, "addDownloadItem , success. url:" + str);
                kmo kmoVar = new kmo();
                kmoVar.f30167a = str;
                kmoVar.d = c;
                list.add(kmoVar);
            } catch (Throwable th) {
                kej.a("BootImageBizTypeExtend", "addDownloadItem error = ", th);
            }
        }
    }

    public static List<String> c(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ca5217fb", new Object[]{bootImageInfo});
        }
        long b = keo.b();
        if (bootImageInfo == null || !a(bootImageInfo) || StringUtils.isEmpty(bootImageInfo.imgUrl) || bootImageInfo.gmtEndMs < b) {
            kej.a(kem.TAG, "no download image");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(bootImageInfo.imgUrl);
        if (!StringUtils.isEmpty(bootImageInfo.firstFrameImageUrl)) {
            arrayList.add(bootImageInfo.firstFrameImageUrl);
        }
        if ("1".equals(bootImageInfo.actionResponse)) {
            if (!StringUtils.isEmpty(bootImageInfo.cardImageUrl)) {
                arrayList.add(bootImageInfo.cardImageUrl);
            }
            arrayList.add(BootImageInteractBaseView.BOOTIMAGE_INTERACT_ITEM_DEFAULT_IMAGE);
        }
        if ("2".equals(bootImageInfo.actionResponse)) {
            if (!StringUtils.isEmpty(bootImageInfo.benefitImageUrl)) {
                arrayList.add(bootImageInfo.benefitImageUrl);
            }
            arrayList.add(BootImageInteractBaseView.BOOTIAMGE_INTERACT_COUPON_RECEIVED_IMAGE);
            arrayList.add(BootImageInteractBaseView.BOOTIMAGE_INTERACT_COUPON_DEFAULT_IMAGE);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(com.taobao.bootimage.data.BootImageInfo r4, boolean r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.kek.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L21
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            java.lang.Boolean r4 = new java.lang.Boolean
            r4.<init>(r5)
            r1[r3] = r4
            java.lang.String r4 = "3a8df70a"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L21:
            if (r4 != 0) goto L24
            return r2
        L24:
            java.lang.String r0 = r4.bizType
            java.lang.String r1 = "poplayer"
            boolean r0 = android.text.StringUtils.equals(r1, r0)
            if (r0 == 0) goto L36
            java.lang.String r4 = r4.imgUrl
            boolean r4 = android.text.StringUtils.isEmpty(r4)
        L34:
            r4 = r4 ^ r3
            goto L83
        L36:
            java.lang.String r0 = r4.bizType
            java.lang.String r1 = "image"
            boolean r0 = android.text.StringUtils.equals(r1, r0)
            if (r0 == 0) goto L42
        L40:
            r4 = 1
            goto L83
        L42:
            java.lang.String r0 = r4.bizType
            java.lang.String r1 = "videoNoIcon"
            boolean r0 = android.text.StringUtils.equals(r1, r0)
            if (r0 == 0) goto L54
            java.lang.String r4 = r4.imgUrl
            boolean r4 = android.text.StringUtils.isEmpty(r4)
            goto L34
        L54:
            java.lang.String r0 = r4.bizType
            java.lang.String r1 = "videoHaveIcon"
            boolean r0 = android.text.StringUtils.equals(r1, r0)
            if (r0 == 0) goto L66
            java.lang.String r4 = r4.imgUrl
            boolean r4 = android.text.StringUtils.isEmpty(r4)
            goto L34
        L66:
            java.lang.String r0 = r4.bizType
            java.lang.String r1 = "commercialAdNormal"
            boolean r0 = android.text.StringUtils.equals(r1, r0)
            if (r0 == 0) goto L71
            goto L40
        L71:
            java.lang.String r0 = r4.bizType
            java.lang.String r1 = "commercialAdVideo"
            boolean r0 = android.text.StringUtils.equals(r1, r0)
            if (r0 == 0) goto L82
            java.lang.String r4 = r4.imgUrl
            boolean r4 = android.text.StringUtils.isEmpty(r4)
            goto L34
        L82:
            r4 = 0
        L83:
            if (r5 != 0) goto L88
            if (r4 == 0) goto L88
            goto L89
        L88:
            r2 = 1
        L89:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kek.a(com.taobao.bootimage.data.BootImageInfo, boolean):boolean");
    }

    public static boolean a(BootImageInfo bootImageInfo, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d46c1e00", new Object[]{bootImageInfo, str, new Boolean(z)})).booleanValue() : a(bootImageInfo, str, z, null);
    }

    public static boolean a(BootImageInfo bootImageInfo, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54fc40ca", new Object[]{bootImageInfo, str, new Boolean(z), str2})).booleanValue();
        }
        if (!d(bootImageInfo)) {
            kej.a(kem.TAG, "checkBootInfoEnabled in invalidDate");
            return false;
        } else if (z && !bootImageInfo.coldStart) {
            kej.a(kem.TAG, "ImageInfo un enalbed , info unsupport coldstart");
            return false;
        } else if (!z && !bootImageInfo.hotStart) {
            kej.a(kem.TAG, "ImageInfo un enalbed , info unsupport hotstart");
            return false;
        } else {
            if (!z && !StringUtils.isEmpty(str)) {
                Set<String> a2 = keo.a(bootImageInfo.whiteList);
                if (a2 == null || a2.size() == 0) {
                    Set<String> a3 = keo.a(bootImageInfo.blackList);
                    if (a3 != null && a3.size() > 0 && a3.contains(str)) {
                        kej.a(kem.TAG, "ImageInfo un enalbed , activityName is in black list");
                        return false;
                    }
                } else if (!a2.contains(str)) {
                    kej.a(kem.TAG, "ImageInfo un enalbed , activityName is not in white list");
                    return false;
                }
            }
            if (BootImageDataMgr.a().a(bootImageInfo)) {
                return true;
            }
            kej.a("BootImageBizTypeExtend", "BootImageDataMgr bootImageInfoFatigueEnabled. Info itemId: " + bootImageInfo.itemId);
            return false;
        }
    }

    private static boolean d(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1e7166f", new Object[]{bootImageInfo})).booleanValue();
        }
        if (bootImageInfo == null) {
            return false;
        }
        long b = keo.b();
        if (b < bootImageInfo.gmtStartMs || b > bootImageInfo.gmtEndMs || !a(bootImageInfo) || StringUtils.isEmpty(bootImageInfo.itemId)) {
            kej.a(kem.TAG, "ImageInfo unenalbed 111");
            return false;
        } else if ("poplayer".equals(bootImageInfo.bizType)) {
            if (StringUtils.isEmpty(bootImageInfo.targetUrl)) {
                kej.a(kem.TAG, "poplayer ImageInfo must have info.targetUrl");
                return false;
            }
            if (a.f == null) {
                a.f = com.taobao.bootimage.f.b();
            }
            if (bootImageInfo.needPackageApp) {
                if (StringUtils.isEmpty(android.taobao.windvane.packageapp.zipapp.utils.c.getLocPathByUrl(bootImageInfo.targetUrl, true))) {
                    kej.a(kem.TAG, "poplayer ImageInfo loc must cache");
                    return false;
                }
            } else if (NetWorkUtils.isLowNetworkMode(com.taobao.bootimage.f.b())) {
                return false;
            }
            return true;
        } else if (BootImageInfo.BIZ_TYPE_VIDEO.equals(bootImageInfo.bizType) || BootImageInfo.BIZ_TYPE_VIDEO_ICON.equals(bootImageInfo.bizType) || "commercialAdVideo".equals(bootImageInfo.bizType)) {
            if (StringUtils.isEmpty(bootImageInfo.imgUrl)) {
                kej.a(kem.TAG, "video ImageInfo must have imageURl and videoUrl");
                return false;
            } else if ("1".equals(bootImageInfo.animationType) && "commercialAdVideo".equals(bootImageInfo.bizType)) {
                return e(bootImageInfo);
            } else {
                String c = keo.c(bootImageInfo.videoUrl);
                if (!StringUtils.isEmpty(c)) {
                    File file = new File(keo.d(bootImageInfo.sceneType), c);
                    if (file.exists()) {
                        bootImageInfo.videoLocalPath = file.getAbsolutePath();
                        return true;
                    }
                    kej.a(kem.TAG, "check boot info,localPath no exist. path: " + file.getAbsolutePath());
                } else {
                    kej.a(kem.TAG, "check boot info,fileName no exist.");
                }
                if (!StringUtils.isEmpty(bootImageInfo.imgUrl)) {
                    kej.a(kem.TAG, "check boot info,fileName no exist, but has imageURL.");
                    return true;
                }
                kej.a(kem.TAG, "video ImageInfo unkwon");
                return false;
            }
        } else if ("1".equals(bootImageInfo.animationType) && "commercialAdNormal".equals(bootImageInfo.bizType)) {
            return e(bootImageInfo);
        } else {
            return true;
        }
    }

    private static boolean e(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b5ea40e", new Object[]{bootImageInfo})).booleanValue();
        }
        if (bootImageInfo == null) {
            return false;
        }
        if (StringUtils.isEmpty(bootImageInfo.animationLottie)) {
            kej.a("BootImageBizTypeExtend", "check boot info,lottieUrl is empty.");
            return false;
        }
        LinkedSplashData b = com.taobao.bootimage.linked.h.b("").b();
        if (keo.a(tiq.BIZ_CODE, bootImageInfo.animationLottie) == null) {
            kej.a("BootImageBizTypeExtend", "check boot info,lottieFile not exist.");
            ken.a(b, bootImageInfo);
            return false;
        }
        if ("commercialAdVideo".equals(bootImageInfo.bizType)) {
            File a2 = keo.a(tiq.BIZ_CODE, bootImageInfo.videoUrl);
            if (a2 == null) {
                kej.a("BootImageBizTypeExtend", "check boot info,videoFile not exist.");
                ken.b(b, bootImageInfo);
                return false;
            }
            bootImageInfo.videoLocalPath = a2.getAbsolutePath();
        }
        return true;
    }
}
