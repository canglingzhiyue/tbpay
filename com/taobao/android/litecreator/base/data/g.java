package com.taobao.android.litecreator.base.data;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.EditorInfo;
import com.taobao.android.litecreator.sdk.editor.data.ImageEditInfo;
import com.taobao.android.litecreator.sdk.editor.data.MultiVideoClips;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.android.litecreator.sdk.editor.data.TemplateInfo;
import com.taobao.android.litecreator.util.MediaUtils;
import com.taobao.android.litecreator.util.ax;
import com.taobao.android.litecreator.util.k;
import com.taobao.android.mediapick.media.VideoMedia;
import com.taobao.login4android.qrcode.data.QrCodeData;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_MEDIA_ID = "mediaId";
    public static final String KEY_MEDIA_MIME_TYPE = "mediaMimeType";
    public static final String KEY_MEDIA_URI = "mediaUri";
    public static final String MEDIA_RESOURCE_EXTRA_VIDEO_MIME_TYPE = "video_media_type";
    public static final String MEDIA_RESOURCE_EXTRA_VIDEO_URI = "video_uri";

    /* renamed from: a  reason: collision with root package name */
    public static String f13306a;
    private static String b;
    private static String c;

    public static ImageBean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageBean) ipChange.ipc$dispatch("ca540db3", new Object[]{str});
        }
        if (!k.a(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        ImageBean imageBean = new ImageBean();
        imageBean.path = str;
        imageBean.width = options.outWidth;
        imageBean.height = options.outHeight;
        imageBean.rotate = k.d(str);
        return imageBean;
    }

    public static ImageBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageBean) ipChange.ipc$dispatch("3dca7dbd", new Object[0]) : new ImageBean();
    }

    public static VideoBean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoBean) ipChange.ipc$dispatch("3491597c", new Object[0]) : new VideoBean();
    }

    public static VideoBean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoBean) ipChange.ipc$dispatch("da558fb2", new Object[]{str}) : a(str, true);
    }

    public static VideoBean a(VideoMedia videoMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoBean) ipChange.ipc$dispatch("fc70f53d", new Object[]{videoMedia});
        }
        VideoBean videoBean = new VideoBean();
        videoBean.path = videoMedia.path;
        videoBean.fileSize = videoMedia.fileSize;
        videoBean.width = videoMedia.width;
        videoBean.height = videoMedia.height;
        videoBean.rotate = videoMedia.orientation;
        videoBean.duration = videoMedia.duration;
        videoBean.ratioType = 128;
        return videoBean;
    }

    public static VideoBean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoBean) ipChange.ipc$dispatch("58ad17e3", new Object[]{str, new Boolean(z)});
        }
        long b2 = k.b(str);
        if (b2 == 0) {
            return null;
        }
        VideoBean videoBean = new VideoBean();
        videoBean.path = str;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            a(videoBean, mediaMetadataRetriever);
            videoBean.fileSize = b2;
            if (z) {
                videoBean.ratioType = 128;
            } else {
                videoBean.ratioType = MediaUtils.c(videoBean.width, videoBean.height, videoBean.rotate);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
        mediaMetadataRetriever.release();
        return videoBean;
    }

    public static VideoBean a(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoBean) ipChange.ipc$dispatch("c7508bbe", new Object[]{context, uri});
        }
        if (uri == null || !ax.b(context, uri)) {
            return null;
        }
        VideoBean videoBean = new VideoBean();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(context, uri);
            a(videoBean, mediaMetadataRetriever);
            videoBean.ratioType = 128;
        } catch (Exception unused) {
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
        mediaMetadataRetriever.release();
        return videoBean;
    }

    private static void a(VideoBean videoBean, MediaMetadataRetriever mediaMetadataRetriever) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fcb4678", new Object[]{videoBean, mediaMetadataRetriever});
            return;
        }
        videoBean.duration = a(mediaMetadataRetriever.extractMetadata(9), 0);
        videoBean.width = a(mediaMetadataRetriever.extractMetadata(18), 0);
        videoBean.height = a(mediaMetadataRetriever.extractMetadata(19), 0);
        videoBean.rotate = a(mediaMetadataRetriever.extractMetadata(24), 0);
        videoBean.framerate = a(mediaMetadataRetriever.extractMetadata(25), 0.0f);
        videoBean.bitRate = a(mediaMetadataRetriever.extractMetadata(20), 0);
    }

    private static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    private static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue();
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return f;
        }
    }

    public static void a(UGCVideo uGCVideo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99abb64", new Object[]{uGCVideo});
        } else if (uGCVideo == null) {
        } else {
            EditorInfo editorInfo = new EditorInfo();
            editorInfo.resource = new Resource();
            if (uGCVideo.raw != null) {
                MultiVideoClips multiVideoClips = new MultiVideoClips();
                multiVideoClips.data.add(new MultiVideoClips.MediaResource(uGCVideo.raw.path, uGCVideo.raw.duration, uGCVideo.raw.getDisplayWidth(), uGCVideo.raw.getDisplayHeight(), uGCVideo.raw.framerate));
                editorInfo.resource.rawData = multiVideoClips;
            }
            if (uGCVideo.origin != null) {
                MultiVideoClips multiVideoClips2 = new MultiVideoClips();
                multiVideoClips2.data.add(new MultiVideoClips.MediaResource(uGCVideo.origin.path, uGCVideo.origin.duration, uGCVideo.origin.getDisplayWidth(), uGCVideo.origin.getDisplayHeight(), uGCVideo.origin.framerate));
                editorInfo.resource.originData = multiVideoClips2;
            }
            if (uGCVideo.compress != null) {
                MultiVideoClips multiVideoClips3 = new MultiVideoClips();
                multiVideoClips3.data.add(new MultiVideoClips.MediaResource(uGCVideo.compress.path, uGCVideo.compress.duration, uGCVideo.compress.getDisplayWidth(), uGCVideo.compress.getDisplayHeight(), uGCVideo.compress.framerate));
                editorInfo.resource.compressData = multiVideoClips3;
            }
            uGCVideo.editorInfo = editorInfo;
        }
    }

    static {
        kge.a(1124820597);
        b = "VideoClipBegin";
        c = "VideoClipEnd";
        f13306a = "mediaType";
    }

    public static void a(UGCVideo uGCVideo, List<UGCVideo> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59b2bd1f", new Object[]{uGCVideo, list, new Boolean(z)});
        } else if (uGCVideo != null && list != null && list.size() > 0) {
            EditorInfo editorInfo = new EditorInfo();
            editorInfo.resource = new Resource();
            MultiVideoClips multiVideoClips = new MultiVideoClips();
            MultiVideoClips multiVideoClips2 = new MultiVideoClips();
            MultiVideoClips multiVideoClips3 = new MultiVideoClips();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                UGCVideo uGCVideo2 = list.get(i);
                if (uGCVideo2 != null) {
                    if (uGCVideo2.raw != null) {
                        multiVideoClips.data.add(b(uGCVideo2));
                        editorInfo.resource.rawData = multiVideoClips;
                    }
                    if (uGCVideo2.origin != null) {
                        multiVideoClips2.data.add(c(uGCVideo2));
                        editorInfo.resource.originData = multiVideoClips2;
                    }
                    if (uGCVideo2.compress != null) {
                        multiVideoClips3.data.add(d(uGCVideo2));
                        editorInfo.resource.compressData = multiVideoClips3;
                    }
                    if (uGCVideo2.compress == null && z) {
                        multiVideoClips3.data.add(b(uGCVideo2));
                        editorInfo.resource.compressData = multiVideoClips3;
                    }
                }
            }
            if (size == 1 && list.get(0) != null) {
                uGCVideo.raw = list.get(0).raw;
                uGCVideo.origin = list.get(0).origin;
                uGCVideo.compress = list.get(0).compress;
            }
            uGCVideo.editorInfo = editorInfo;
        }
    }

    private static MultiVideoClips.MediaResource b(UGCVideo uGCVideo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiVideoClips.MediaResource) ipChange.ipc$dispatch("417ff26f", new Object[]{uGCVideo});
        }
        MultiVideoClips.MediaResource mediaResource = new MultiVideoClips.MediaResource(uGCVideo.raw.path, uGCVideo.raw.duration, uGCVideo.raw.getDisplayWidth(), uGCVideo.raw.getDisplayHeight(), uGCVideo.raw.framerate);
        if (uGCVideo.raw.attach.containsKey(b) && uGCVideo.raw.attach.containsKey(c)) {
            mediaResource.startTimeMs = ((Long) uGCVideo.raw.attach.get(b)).longValue();
            mediaResource.endTimeMs = ((Long) uGCVideo.raw.attach.get(c)).longValue();
            mediaResource.clipDurationMs = mediaResource.endTimeMs - mediaResource.startTimeMs;
        }
        mediaResource.mediaType = StringUtils.isEmpty((CharSequence) uGCVideo.getMeta(f13306a)) ? "video" : (String) uGCVideo.getMeta(f13306a);
        if (StringUtils.equals(mediaResource.mediaType, "video")) {
            mediaResource.originDurationMs = uGCVideo.raw.duration;
        }
        if (uGCVideo.getMeta().containsKey("mediaId")) {
            mediaResource.mediaId = ((Integer) uGCVideo.getMeta("mediaId")).intValue();
        }
        if (uGCVideo.getMeta().containsKey(KEY_MEDIA_MIME_TYPE)) {
            mediaResource.extra.put(MEDIA_RESOURCE_EXTRA_VIDEO_MIME_TYPE, uGCVideo.getMeta(KEY_MEDIA_MIME_TYPE));
        }
        if (uGCVideo.getMeta().containsKey(KEY_MEDIA_URI)) {
            mediaResource.extra.put(MEDIA_RESOURCE_EXTRA_VIDEO_URI, uGCVideo.getMeta(KEY_MEDIA_URI));
        }
        return mediaResource;
    }

    private static MultiVideoClips.MediaResource c(UGCVideo uGCVideo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiVideoClips.MediaResource) ipChange.ipc$dispatch("4c54f9f0", new Object[]{uGCVideo});
        }
        MultiVideoClips.MediaResource mediaResource = new MultiVideoClips.MediaResource(uGCVideo.origin.path, uGCVideo.origin.duration, uGCVideo.origin.getDisplayWidth(), uGCVideo.origin.getDisplayHeight(), uGCVideo.origin.framerate);
        if (uGCVideo.origin.attach.containsKey(b) && uGCVideo.origin.attach.containsKey(c)) {
            mediaResource.startTimeMs = ((Long) uGCVideo.origin.attach.get(b)).longValue();
            mediaResource.endTimeMs = ((Long) uGCVideo.origin.attach.get(c)).longValue();
            mediaResource.clipDurationMs = mediaResource.endTimeMs - mediaResource.startTimeMs;
        }
        mediaResource.mediaType = StringUtils.isEmpty((CharSequence) uGCVideo.getMeta(f13306a)) ? "video" : (String) uGCVideo.getMeta(f13306a);
        if (uGCVideo.getMeta().containsKey("mediaId")) {
            mediaResource.mediaId = ((Integer) uGCVideo.getMeta("mediaId")).intValue();
        }
        return mediaResource;
    }

    private static MultiVideoClips.MediaResource d(UGCVideo uGCVideo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiVideoClips.MediaResource) ipChange.ipc$dispatch("572a0171", new Object[]{uGCVideo});
        }
        MultiVideoClips.MediaResource mediaResource = new MultiVideoClips.MediaResource(uGCVideo.compress.path, uGCVideo.compress.duration, uGCVideo.compress.getDisplayWidth(), uGCVideo.compress.getDisplayHeight(), uGCVideo.compress.framerate);
        if (uGCVideo.compress.attach.containsKey(b) && uGCVideo.compress.attach.containsKey(c)) {
            mediaResource.startTimeMs = ((Long) uGCVideo.compress.attach.get(b)).longValue();
            mediaResource.endTimeMs = ((Long) uGCVideo.compress.attach.get(c)).longValue();
            mediaResource.clipDurationMs = mediaResource.endTimeMs - mediaResource.startTimeMs;
        }
        mediaResource.mediaType = StringUtils.isEmpty((CharSequence) uGCVideo.getMeta(f13306a)) ? "video" : (String) uGCVideo.getMeta(f13306a);
        if (uGCVideo.getMeta().containsKey("mediaId")) {
            mediaResource.mediaId = ((Integer) uGCVideo.getMeta("mediaId")).intValue();
        }
        return mediaResource;
    }

    public static List<UGCVideo> a(List<UGCVideo> list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8d19d25c", new Object[]{list, new Long(j)});
        }
        if (j <= 0) {
            j = QrCodeData.QR_CODE_VALID_PERIOD;
        }
        if (list != null && list.size() > 0) {
            long j2 = 0;
            for (UGCVideo uGCVideo : list) {
                j2 += uGCVideo.origin.duration;
                if (j2 >= j) {
                    break;
                }
            }
            if (j2 <= j) {
                return list;
            }
            long j3 = 0;
            long j4 = 0;
            for (UGCVideo uGCVideo2 : list) {
                if (uGCVideo2.origin.duration <= 60000) {
                    j3 += uGCVideo2.origin.duration;
                } else {
                    j4 += uGCVideo2.origin.duration;
                }
            }
            long j5 = j - j3;
            if (j5 <= 0) {
                return list;
            }
            double d = j5 / j4;
            for (UGCVideo uGCVideo3 : list) {
                if (uGCVideo3.origin.duration > 60000) {
                    uGCVideo3.origin.attach.put(b, 0L);
                    uGCVideo3.origin.attach.put(c, Long.valueOf(new Double(uGCVideo3.origin.duration * d).longValue()));
                }
            }
        }
        return list;
    }

    public static void a(UGCImage uGCImage) {
        ImageEditInfo imageEditInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61bd7a84", new Object[]{uGCImage});
        } else if (uGCImage == null) {
        } else {
            EditorInfo editorInfo = new EditorInfo();
            editorInfo.resource = new Resource();
            if (uGCImage.origin != null) {
                MultiVideoClips multiVideoClips = new MultiVideoClips();
                multiVideoClips.data.add(new MultiVideoClips.MediaResource(uGCImage.origin.path, 3000L, uGCImage.origin.getDisplayWidth(), uGCImage.origin.getDisplayHeight(), 30.0f));
                editorInfo.resource.originData = multiVideoClips;
            }
            if (uGCImage.compress != null) {
                MultiVideoClips multiVideoClips2 = new MultiVideoClips();
                multiVideoClips2.data.add(new MultiVideoClips.MediaResource(uGCImage.compress.path, 3000L, uGCImage.compress.getDisplayWidth(), uGCImage.compress.getDisplayHeight(), 30.0f));
                editorInfo.resource.compressData = multiVideoClips2;
            }
            TemplateInfo templateInfo = null;
            Object meta = uGCImage.getMeta("imageEditDraft");
            if ((meta instanceof String) && (imageEditInfo = (ImageEditInfo) JSON.parseObject((String) meta, ImageEditInfo.class)) != null && imageEditInfo.templateInfo != null) {
                editorInfo.resource.type = imageEditInfo.templateInfo.resourceType;
                templateInfo = imageEditInfo.templateInfo;
            }
            uGCImage.editorInfo = editorInfo;
            uGCImage.templateInfo = templateInfo;
        }
    }
}
