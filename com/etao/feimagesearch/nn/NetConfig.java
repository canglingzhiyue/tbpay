package com.etao.feimagesearch.nn;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class NetConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALINN_BIZ_NAME = "pltImageSearch";
    public static String AUTH_CODE = null;
    public static final String CONFIG_ALINN_MD5 = "md5";
    public static final String CONFIG_ALINN_URL = "alinn";
    public static final String FACEDETECT_NET_NAME = "detect_face";
    public static final String FACEPOINT_NET_NAME = "face_net";
    public static final String HAND_NET_NAME = "detect_hand";
    public static final String ORANGE_HAND_CONFIG = "v2_hand";
    public static final String ORANGE_POSE_CONFIG = "v2_pose";
    public static final String ORANGE_SEG_CONFIG = "v2_segmentation";
    public static final String OUPUT_KEY = "output";
    public static final String POSE_NET_NAME = "detect_openpose";
    public static final String SEG_NET_NAME = "detect_segmentation";
    public String alinnMd5;
    public String alinnModelId;
    public String alinnUrl;
    public String name;
    public String outputLayerName;
    public String type;

    static {
        kge.a(1120841919);
    }

    public NetConfig() {
    }

    public NetConfig(String str, String str2, String str3, String str4) {
        this.name = str;
        this.type = str2;
        this.alinnUrl = str3;
        this.alinnModelId = str4;
    }

    public String getFullName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf3c1dc9", new Object[]{this});
        }
        return this.name + "." + this.type;
    }
}
