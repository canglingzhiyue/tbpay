package com.taobao.trtc.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.realidentity.j3;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.impl.h;
import com.taobao.trtc.utils.TrtcLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.qvc;

/* loaded from: classes9.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<a> f23217a;
    public List<a> b;
    public List<a> c;
    public List<a> d;
    private List<String> e;
    private List<String> f;
    private List<String> g;
    private List<String> h;
    private List<String> i;
    private List<String> j;
    private List<String> k;

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f23218a;
        public Map<String, String> b;

        static {
            kge.a(1907867567);
        }
    }

    static {
        kge.a(1387473648);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<String> a2 = a(qvc.a(h.TRTC_ORANGE_DEF_STR_HW_DEC_DECODER_PREFIX_BLACKLIST, ""));
        this.f = a(qvc.a(h.TRTC_ORANGE_DEF_STR_HW_DEC_CPU_WHITELIST_KEY, ""));
        this.e = a(qvc.a(h.TRTC_ORANGE_DEF_STR_HW_DEC_CPU_BLACKLIST_KEY, ""));
        this.i = new ArrayList();
        this.i.add("omx.qcom");
        this.i.add("c2.qti");
        this.h = new ArrayList();
        this.h.add("omx.hisi");
        this.k = new ArrayList();
        this.k.add("omx.exynos");
        this.j = new ArrayList();
        this.j.add("omx.mtk");
        this.g = new ArrayList();
        this.g.add("omx.google");
        this.g.add("c2.android");
        this.g.add("AVCDecoder");
        this.g.add("OMX.ffmpeg");
        this.g.add("OMX.qcom.video.decoder.hevcswvdec");
        this.g.add("OMX.SEC.hevc.sw.dec");
        if (a2 != null && !a2.isEmpty()) {
            this.g.addAll(a2);
        }
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (qvc.a(h.TRTC_ORANGE_DEF_BOOL_HW_DEC_ENABLE_H264, false)) {
            this.f23217a = new ArrayList();
            this.b = new ArrayList();
            a(j3.m, this.f23217a, this.b);
        } else {
            TrtcLog.d("MediaCodecHelper", "hw dec h264 disabled");
        }
        if (qvc.a(h.TRTC_ORANGE_DEF_BOOL_HW_DEC_ENABLE_H265, false)) {
            this.c = new ArrayList();
            this.d = new ArrayList();
            a("video/hevc", this.c, this.d);
            return;
        }
        TrtcLog.d("MediaCodecHelper", "hw dec h265 disabled");
    }

    public List<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return Arrays.asList(str.split(";"));
        }
        return new ArrayList();
    }

    public a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("18e19925", new Object[]{this, str});
        }
        if (j3.m.equalsIgnoreCase(str)) {
            List<a> list = this.b;
            if (list != null && !list.isEmpty()) {
                return a(this.b);
            }
            List<a> list2 = this.f23217a;
            if (list2 != null && !list2.isEmpty()) {
                return a(this.f23217a);
            }
        }
        if (!"video/hevc".equalsIgnoreCase(str)) {
            return null;
        }
        List<a> list3 = this.d;
        if (list3 != null && !list3.isEmpty()) {
            return a(this.d);
        }
        List<a> list4 = this.c;
        if (list4 != null && !list4.isEmpty()) {
            return a(this.c);
        }
        return null;
    }

    private a a(List<a> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("771dd695", new Object[]{this, list, str});
        }
        for (a aVar : list) {
            if (b(this.i, aVar.f23218a) && aVar.f23218a.contains(str)) {
                return aVar;
            }
        }
        return null;
    }

    private a a(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a06298b", new Object[]{this, list});
        }
        a a2 = a(list, "low_latency");
        if (a2 != null) {
            return a2;
        }
        a a3 = a(list, "c2");
        return a3 != null ? a3 : list.get(0);
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        try {
            return com.taobao.common.inspector.b.a(com.taobao.common.inspector.g.d("/proc/cpuinfo"));
        } catch (Exception unused) {
            return "";
        }
    }

    private void a(String str, List<a> list, List<a> list2) {
        MediaCodecInfo[] codecInfos;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac81c14", new Object[]{this, str, list, list2});
            return;
        }
        try {
            String b = b();
            if (this.f != null && !this.f.isEmpty()) {
                TrtcLog.d("MediaCodecHelper", "CPU-whiteList: " + this.f.toString());
                Iterator<String> it = this.f.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (b.contains(it.next())) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    TrtcLog.a("MediaCodecHelper", "CPU: " + b + " not in cpu whiteList");
                    return;
                }
            } else if (this.e != null && !this.e.isEmpty()) {
                TrtcLog.d("MediaCodecHelper", "CPU-blackList: " + this.e.toString());
                for (String str2 : this.e) {
                    if (b.contains(str2)) {
                        TrtcLog.a("MediaCodecHelper", "CPU: " + b + " in cpu blackList");
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            if (!mediaCodecInfo.isEncoder() && str.equalsIgnoreCase(mediaCodecInfo.getSupportedTypes()[0]) && !b(this.g, mediaCodecInfo.getName()) && !mediaCodecInfo.getName().contains("sw")) {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str);
                mediaFormat.setInteger("color-format", 2130708361);
                if (!capabilitiesForType.isFormatSupported(mediaFormat)) {
                    TrtcLog.a("MediaCodecHelper", "Decoder check, name: " + mediaCodecInfo.getName() + ", basic format: " + mediaFormat.toString() + " not supported for " + str);
                } else {
                    a aVar = new a();
                    aVar.f23218a = mediaCodecInfo.getName();
                    aVar.b = new HashMap();
                    list.add(aVar);
                    MediaFormat mediaFormat2 = new MediaFormat();
                    mediaFormat2.setString("mime", str);
                    mediaFormat2.setInteger("color-format", 2130708361);
                    HashMap hashMap = new HashMap();
                    a(mediaCodecInfo, str, mediaFormat2, hashMap);
                    if (capabilitiesForType.isFormatSupported(mediaFormat2)) {
                        aVar.b.putAll(hashMap);
                        list2.add(aVar);
                    }
                }
            }
        }
    }

    public void a(MediaCodecInfo mediaCodecInfo, String str, MediaFormat mediaFormat, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4d410a", new Object[]{this, mediaCodecInfo, str, mediaFormat, map});
            return;
        }
        if (a(mediaCodecInfo, str)) {
            mediaFormat.setInteger("low-latency", 1);
            map.put("low-latency", "1");
        }
        if (b(this.j, mediaCodecInfo.getName())) {
            mediaFormat.setInteger("vdec-lowlatency", 1);
            map.put("vdec-lowlatency", "1");
        }
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (b(this.i, mediaCodecInfo.getName())) {
            mediaFormat.setInteger("vendor.qti-ext-dec-picture-order.enable", 1);
            mediaFormat.setInteger("vendor.qti-ext-dec-low-latency.enable", 1);
            map.put("vendor.qti-ext-dec-picture-order.enable", "1");
            map.put("vendor.qti-ext-dec-low-latency.enable", "1");
        }
        if (b(this.h, mediaCodecInfo.getName())) {
            mediaFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req", 1);
            mediaFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy", -1);
            map.put("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req", "1");
            map.put("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy", "-1");
        }
        if (!b(this.k, mediaCodecInfo.getName())) {
            return;
        }
        mediaFormat.setInteger("vendor.rtc-ext-dec-low-latency.enable", 1);
        map.put("vendor.rtc-ext-dec-low-latency.enable", "1");
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81918a1a", new Object[]{mediaCodecInfo, str})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                if (mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported("low-latency")) {
                    TrtcLog.d("MediaCodecHelper", "low-latency supported");
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static boolean b(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f0628", new Object[]{list, str})).booleanValue();
        }
        for (String str2 : list) {
            if (str.length() >= str2.length() && str.substring(0, str2.length()).equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }
}
