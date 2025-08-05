package com.taobao.taolive.movehighlight.utils;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.g;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;
import java.util.Iterator;
import tb.kge;
import tb.pkm;
import tb.poy;
import tb.poz;
import tb.pqj;

/* loaded from: classes8.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f21481a;

    static {
        kge.a(1411643999);
        f21481a = l.class.getSimpleName();
    }

    public static com.taobao.taolive.movehighlight.bean.a a(VideoInfo videoInfo, String str, String str2) {
        com.taobao.taolive.movehighlight.bean.a b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.movehighlight.bean.a) ipChange.ipc$dispatch("554c1888", new Object[]{videoInfo, str, str2});
        }
        if (videoInfo == null) {
            return null;
        }
        if (c.b() && TimeMovingType.checkContentTimeMove(videoInfo) && !TextUtils.isEmpty(str2)) {
            b = b(videoInfo, str2);
        } else {
            b = b(videoInfo, str, str2);
        }
        h.a("roomStatus:" + videoInfo.roomStatus + "liveId:" + videoInfo.liveId + " sSjsdItemId:" + str + " getKandianPlayInfo: spfPlayVideo" + JSON.toJSONString(b));
        return b;
    }

    private static com.taobao.taolive.movehighlight.bean.a b(VideoInfo videoInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.movehighlight.bean.a) ipChange.ipc$dispatch("cba1d41d", new Object[]{videoInfo, str});
        }
        poy.i("0", com.taobao.taolive.room.utils.n.a());
        if (videoInfo == null || videoInfo.timeMovingPlayInfo == null || TextUtils.isEmpty(videoInfo.timeMovingPlayInfo.timeMovingType) || videoInfo.timeMovingPlayInfo.spfPlayVideo == null || TextUtils.isEmpty(videoInfo.timeMovingPlayInfo.spfPlayVideo.playInfo) || TextUtils.isEmpty(videoInfo.timeMovingPlayInfo.spfPlayVideo.videoType)) {
            return null;
        }
        if (videoInfo.timeMovingPlayInfo.isMounting) {
            poy.i("1", com.taobao.taolive.room.utils.n.a());
        }
        LiveItem.SpfPlayVideo spfPlayVideo = videoInfo.timeMovingPlayInfo.spfPlayVideo;
        poy.a(spfPlayVideo.timeMovingUtParams, com.taobao.taolive.room.utils.n.a());
        return new com.taobao.taolive.movehighlight.bean.a(spfPlayVideo.playInfo, spfPlayVideo.videoType, videoInfo.timeMovingPlayInfo.timeMovingType, str);
    }

    private static com.taobao.taolive.movehighlight.bean.a b(VideoInfo videoInfo, String str, String str2) {
        LiveItem liveItem;
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.movehighlight.bean.a) ipChange.ipc$dispatch("43dea467", new Object[]{videoInfo, str, str2});
        }
        poy.i("0", com.taobao.taolive.room.utils.n.a());
        if (videoInfo == null) {
            return null;
        }
        if (videoInfo.timeMovingPlayInfo != null && videoInfo.timeMovingPlayInfo.spfPlayVideo != null && !TextUtils.isEmpty(videoInfo.timeMovingPlayInfo.spfPlayVideo.playInfo) && !TextUtils.isEmpty(videoInfo.timeMovingPlayInfo.spfPlayVideo.videoType)) {
            if (videoInfo.timeMovingPlayInfo.isMounting) {
                poy.i("1", com.taobao.taolive.room.utils.n.a());
            }
            LiveItem.SpfPlayVideo spfPlayVideo = videoInfo.timeMovingPlayInfo.spfPlayVideo;
            poy.a(spfPlayVideo.timeMovingUtParams, com.taobao.taolive.room.utils.n.a());
            return new com.taobao.taolive.movehighlight.bean.a(spfPlayVideo.playInfo, spfPlayVideo.videoType, "1", str2);
        }
        poy.a((String) null, com.taobao.taolive.room.utils.n.a());
        if (videoInfo.curItemList != null && videoInfo.curItemList.size() > 0 && c.k() && (liveItem = videoInfo.curItemList.get(0)) != null && !TextUtils.isEmpty(str) && str.equals(String.valueOf(liveItem.itemId)) && liveItem.extendVal != null && !TextUtils.isEmpty(liveItem.extendVal.timeMovingPlayInfo) && (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) pqj.a(liveItem.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class)) != null) {
            if (!TextUtils.isEmpty(timeMovingPlayInfo.videoId)) {
                return new com.taobao.taolive.movehighlight.bean.a(timeMovingPlayInfo.videoId, com.taobao.android.litecreator.comprehension.f.FILE_TYPE_VIDEO_MP4, "1", str2);
            }
            if (!TextUtils.isEmpty(timeMovingPlayInfo.timeMovingM3u8Url)) {
                return new com.taobao.taolive.movehighlight.bean.a(timeMovingPlayInfo.timeMovingM3u8Url, "m3u8", "1", str2);
            }
        }
        return null;
    }

    public static void a(VideoFrame2 videoFrame2, String str, Context context, boolean z, boolean z2, pkm pkmVar, String str2, String str3, com.taobao.taolive.movehighlight.bean.a aVar, com.taobao.alilive.aliliveframework.frame.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52db6bd9", new Object[]{videoFrame2, str, context, new Boolean(z), new Boolean(z2), pkmVar, str2, str3, aVar, aVar2});
        } else if (videoFrame2 == null) {
        } else {
            if (!TextUtils.isEmpty(videoFrame2.getVideoViewToken())) {
                videoFrame2.setVideoViewToken(null);
                return;
            }
            if (a(str)) {
                a(str, z, videoFrame2, context);
            }
            videoFrame2.enableRenderType();
            if (z2) {
                videoFrame2.toHalfscreen(b.a());
            }
            videoFrame2.setHighLightLooping(true);
            if (pkmVar != null) {
                if (!videoFrame2.hasPreloaded()) {
                    pkmVar.e("mtopTimeShiftUrl");
                } else {
                    pkmVar.e("mtopTimeShiftUrlPreload");
                }
                pkmVar.f(str2);
            }
            if (com.taobao.taolive.sdk.playcontrol.c.d(aVar2)) {
                i.a(aVar2, 0L);
            }
            videoFrame2.setToken(str3);
            if (aVar == null || TextUtils.isEmpty(aVar.b) || TextUtils.isEmpty(aVar.f21437a)) {
                return;
            }
            if (com.taobao.android.litecreator.comprehension.f.FILE_TYPE_VIDEO_MP4.equals(aVar.f21437a)) {
                f.a().a(com.taobao.android.litecreator.comprehension.f.FILE_TYPE_VIDEO_MP4);
                videoFrame2.directPlayHighlight(null, aVar.b, 0);
                return;
            }
            f.a().a("m3u8");
            videoFrame2.directPlayHighlight(aVar.b, null, 0);
        }
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str);
    }

    private static void a(String str, final boolean z, final VideoFrame2 videoFrame2, final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c1636a5", new Object[]{str, new Boolean(z), videoFrame2, context});
        } else if (TextUtils.isEmpty(str)) {
            videoFrame2.setCoverImg(context.getResources().getDrawable(R.drawable.taolive_slice_scroll_common), true);
        } else {
            View view = null;
            if (videoFrame2 != null) {
                view = videoFrame2.getContentView();
            }
            com.taobao.taolive.room.utils.g.a(str, view, -1, -1, new g.a() { // from class: com.taobao.taolive.movehighlight.utils.l.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.room.utils.g.a
                public void a(BitmapDrawable bitmapDrawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0084d5d", new Object[]{this, bitmapDrawable});
                        return;
                    }
                    VideoFrame2 videoFrame22 = VideoFrame2.this;
                    if (videoFrame22 == null || z) {
                        return;
                    }
                    videoFrame22.setCoverImg(bitmapDrawable, true);
                }

                @Override // com.taobao.taolive.room.utils.g.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        VideoFrame2.this.setCoverImg(context.getResources().getDrawable(R.drawable.taolive_slice_scroll_common), true);
                    }
                }
            });
        }
    }

    public static LiveItem a(VideoInfo videoInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItem) ipChange.ipc$dispatch("de831f22", new Object[]{videoInfo, str});
        }
        if (TextUtils.isEmpty(str) || videoInfo == null || videoInfo.curItemList == null) {
            return null;
        }
        Iterator<LiveItem> it = videoInfo.curItemList.iterator();
        while (it.hasNext()) {
            LiveItem next = it.next();
            if (next.itemId == com.taobao.taolive.sdk.utils.l.b(str)) {
                return next;
            }
        }
        return null;
    }

    private static LiveItem.TimeMovingPlayInfo a(LiveItem liveItem) {
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItem.TimeMovingPlayInfo) ipChange.ipc$dispatch("123aeac7", new Object[]{liveItem});
        }
        if (liveItem != null && !TextUtils.isEmpty(liveItem.extendVal.timeMovingPlayInfo) && (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) pqj.a(liveItem.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class)) != null) {
            return timeMovingPlayInfo;
        }
        return null;
    }

    public static void a(LiveItem liveItem, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c02922", new Object[]{liveItem, aVar});
        } else if (liveItem == null || liveItem.extendVal == null) {
        } else {
            if (!TextUtils.isEmpty(liveItem.extendVal.timeMovingPlayInfo)) {
                LiveItem.TimeMovingPlayInfo a2 = a(liveItem);
                if (a2 == null || TextUtils.isEmpty(a2.timeMovingId)) {
                    return;
                }
                poy.g(a2.timeMovingId, aVar);
                if (!d.f21479a) {
                    return;
                }
                poz.T(a2.timeMovingId, com.taobao.taolive.room.utils.n.b(aVar));
            } else if (TextUtils.isEmpty(liveItem.extendVal.timeMovingContentId)) {
            } else {
                JSONObject b = pqj.b(liveItem.extendVal.timeMovingContentId);
                if (b.get(String.valueOf(liveItem.itemId)) == null) {
                    return;
                }
                poy.g(String.valueOf(b.get(String.valueOf(liveItem.itemId))), aVar);
                if (!d.f21479a) {
                    return;
                }
                poz.T(String.valueOf(b.get(String.valueOf(liveItem.itemId))), com.taobao.taolive.room.utils.n.b(aVar));
            }
        }
    }
}
