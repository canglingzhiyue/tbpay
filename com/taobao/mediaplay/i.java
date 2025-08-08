package com.taobao.mediaplay;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.PlayerQualityItem;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1803031486);
    }

    public static void a(MediaLiveInfo mediaLiveInfo, List<QualityLiveItem> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27411829", new Object[]{mediaLiveInfo, list, new Integer(i)});
        } else if (mediaLiveInfo != null) {
            if (i == 1) {
                for (int i2 = 0; i2 < mediaLiveInfo.liveUrlList.size(); i2++) {
                    QualityLiveItem qualityLiveItem = mediaLiveInfo.liveUrlList.get(i2);
                    if (!StringUtils.isEmpty(qualityLiveItem.newDefinition)) {
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            QualityLiveItem qualityLiveItem2 = list.get(i3);
                            if (!StringUtils.isEmpty(qualityLiveItem2.newDefinition) && a(qualityLiveItem2, qualityLiveItem)) {
                                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "updateMediaLiveInfo REPLACE_BY_URL_ID_OF_NEW_DEFINITION updateIndex=" + i3 + ", baseIndex=" + i2);
                                qualityLiveItem.copy(qualityLiveItem2);
                            }
                        }
                    }
                }
            } else if (i == 2) {
                LinkedList linkedList = new LinkedList();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    QualityLiveItem qualityLiveItem3 = list.get(i4);
                    if (!StringUtils.isEmpty(qualityLiveItem3.newDefinition)) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= mediaLiveInfo.liveUrlList.size()) {
                                i5 = -1;
                                break;
                            } else if (qualityLiveItem3.newDefinition.equals(mediaLiveInfo.liveUrlList.get(i5).newDefinition)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (i5 != -1) {
                            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "updateMediaLiveInfo REPLACE_FORCE_OF_NEW_DEFINITION updateIndex=" + i4 + ", baseIndex=" + i5);
                            mediaLiveInfo.liveUrlList.get(i5).copy(qualityLiveItem3);
                        } else {
                            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "updateMediaLiveInfo REPLACE_FORCE_OF_NEW_DEFINITION add updateIndex=" + i4);
                            linkedList.add(Integer.valueOf(i4));
                        }
                    }
                }
                for (int i6 = 0; i6 < linkedList.size(); i6++) {
                    mediaLiveInfo.liveUrlList.add(list.get(((Integer) linkedList.get(i6)).intValue()));
                }
            }
        }
    }

    public static String a(String str) {
        URI uri;
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        String path = uri.getPath();
        if (StringUtils.isEmpty(path) || (lastIndexOf = path.lastIndexOf(47)) < 0) {
            return null;
        }
        return path.substring(lastIndexOf + 1);
    }

    private static boolean a(QualityLiveItem qualityLiveItem, QualityLiveItem qualityLiveItem2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0d24bee", new Object[]{qualityLiveItem, qualityLiveItem2})).booleanValue();
        }
        if (!StringUtils.isEmpty(qualityLiveItem.rtcLiveUrl) && !StringUtils.isEmpty(qualityLiveItem2.rtcLiveUrl)) {
            return a(qualityLiveItem.rtcLiveUrl, qualityLiveItem2.rtcLiveUrl);
        }
        if (!StringUtils.isEmpty(qualityLiveItem.bfrtcUrl) && !StringUtils.isEmpty(qualityLiveItem2.bfrtcUrl)) {
            return a(qualityLiveItem.bfrtcUrl, qualityLiveItem2.bfrtcUrl);
        }
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "testEnFlv", "false"))) {
            return false;
        }
        if (!StringUtils.isEmpty(qualityLiveItem.flvUrl) && !StringUtils.isEmpty(qualityLiveItem2.flvUrl)) {
            return a(qualityLiveItem.flvUrl, qualityLiveItem2.flvUrl);
        }
        if (!StringUtils.isEmpty(qualityLiveItem.hlsUrl) && !StringUtils.isEmpty(qualityLiveItem2.hlsUrl)) {
            return a(qualityLiveItem.hlsUrl, qualityLiveItem2.hlsUrl);
        }
        return false;
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            String a2 = a(str);
            String a3 = a(str2);
            if (!StringUtils.isEmpty(a2) && !StringUtils.isEmpty(a3)) {
                return a2.equals(a3);
            }
        }
        return false;
    }

    public static void a(PlayerQualityItem playerQualityItem, MediaLiveInfo mediaLiveInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808be0b7", new Object[]{playerQualityItem, mediaLiveInfo});
        } else if (playerQualityItem == null || mediaLiveInfo == null || mediaLiveInfo.liveUrlList == null || mediaLiveInfo.liveUrlList.size() <= playerQualityItem.index) {
        } else {
            playerQualityItem.name = mediaLiveInfo.liveUrlList.get(playerQualityItem.index).name;
            playerQualityItem.newName = mediaLiveInfo.liveUrlList.get(playerQualityItem.index).newName;
            playerQualityItem.definition = mediaLiveInfo.liveUrlList.get(playerQualityItem.index).definition;
            playerQualityItem.newDefinition = mediaLiveInfo.liveUrlList.get(playerQualityItem.index).newDefinition;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, " updatePlayerQualityItem name=" + playerQualityItem.name + ",  newName=" + playerQualityItem.newName + " ,definition=" + playerQualityItem.definition + " ,newDefinition=" + playerQualityItem.newDefinition);
        }
    }
}
