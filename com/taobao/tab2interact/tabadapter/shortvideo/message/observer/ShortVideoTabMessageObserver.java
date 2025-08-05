package com.taobao.tab2interact.tabadapter.shortvideo.message.observer;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.sur;
import tb.suv;
import tb.suz;

/* loaded from: classes8.dex */
public class ShortVideoTabMessageObserver extends suv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* loaded from: classes8.dex */
    public enum ContentType {
        VIDEO,
        LIVE,
        PICTURE_ALBUM,
        GG_GAME,
        COLLECTION,
        EXT
    }

    /* loaded from: classes8.dex */
    public enum VideoState {
        START,
        PAUSE,
        PROGRESS_UPDATE,
        PROGRESS_FINISH
    }

    static {
        kge.a(1948913268);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(ShortVideoTabMessageObserver shortVideoTabMessageObserver, String str, Object... objArr) {
        if (str.hashCode() == -8925560) {
            super.a((sur) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(1050769596);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.suv, tb.suu
    public void a(sur message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff77ce88", new Object[]{this, message});
            return;
        }
        q.d(message, "message");
        super.a(message);
        String c = message.c();
        int hashCode = c.hashCode();
        if (hashCode != -1543801311) {
            if (hashCode == -319898197) {
                if (c.equals(suz.CARD_DATA_CHANGE_NAME)) {
                    b(message);
                    return;
                }
            } else if (hashCode == -30145277 && c.equals(suz.VIDEO_STATE_CHANGE_NAME)) {
                c(message);
                return;
            }
        } else if (c.equals(suz.FIRST_FRAME_RENDER_FINISH_NAME)) {
            d(message);
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoMessageObserver", "收到其他消息，message=" + message);
    }

    private final void b(sur surVar) {
        ContentType contentType;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfad509", new Object[]{this, surVar});
            return;
        }
        JSONObject d = surVar.d();
        if (d == null) {
            return;
        }
        Object obj = d.get("args");
        if (!(obj instanceof Map)) {
            com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoMessageObserver", "处理当前Active卡片的数据发生改变的消息，innerArgs无效");
            return;
        }
        Map map = (Map) obj;
        Object obj2 = map.get("id");
        if (obj2 instanceof String) {
            if (((CharSequence) obj2).length() != 0) {
                z = false;
            }
            if (!z) {
                Object obj3 = map.get("type");
                if (q.a(obj3, (Object) "VIDEO")) {
                    contentType = ContentType.VIDEO;
                } else if (q.a(obj3, (Object) "LIVE")) {
                    contentType = ContentType.LIVE;
                } else if (q.a(obj3, (Object) "PICTURE_ALBUM")) {
                    contentType = ContentType.PICTURE_ALBUM;
                } else if (q.a(obj3, (Object) "ggGame")) {
                    contentType = ContentType.GG_GAME;
                } else if (q.a(obj3, (Object) "COLLECTION")) {
                    contentType = ContentType.COLLECTION;
                } else if (!q.a(obj3, (Object) "EXT")) {
                    com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoMessageObserver", "处理当前Active卡片的数据发生改变的消息，type无效");
                    return;
                } else {
                    contentType = ContentType.EXT;
                }
                a((String) obj2, contentType, surVar.e());
                return;
            }
        }
        com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoMessageObserver", "处理当前Active卡片的数据发生改变的消息，id无效");
    }

    private final void c(sur surVar) {
        VideoState videoState;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc7ddb8a", new Object[]{this, surVar});
            return;
        }
        JSONObject d = surVar.d();
        if (d == null) {
            return;
        }
        Object obj = d.get("args");
        if (!(obj instanceof Map)) {
            com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoMessageObserver", "处理卡片的视频状态发生改变的消息，innerArgs无效");
            return;
        }
        Object obj2 = ((Map) obj).get("state");
        if (q.a(obj2, (Object) "play")) {
            videoState = VideoState.START;
        } else if (q.a(obj2, (Object) "pause")) {
            videoState = VideoState.PAUSE;
        } else if (q.a(obj2, (Object) suz.VIDEO_STATE_CHANGE_ARGS_STATE_PROGRESS_UPDATE)) {
            videoState = VideoState.PROGRESS_UPDATE;
        } else if (q.a(obj2, (Object) "finished")) {
            videoState = VideoState.PROGRESS_FINISH;
        } else {
            com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoMessageObserver", "处理卡片的视频状态发生改变的消息，state无效");
            return;
        }
        a(videoState, surVar.e());
    }

    private final void d(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb00e20b", new Object[]{this, surVar});
        } else {
            f(surVar.e());
        }
    }

    public void a(String contentId, ContentType contentType, String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13c0d1b6", new Object[]{this, contentId, contentType, tabId});
            return;
        }
        q.d(contentId, "contentId");
        q.d(contentType, "contentType");
        q.d(tabId, "tabId");
        com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoMessageObserver", "当前Active卡片的数据发生改变的时机，contentId=" + contentId + "，contentType=" + contentType + "，tabId=" + tabId);
    }

    public void a(VideoState videoState, String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ac5f0bb", new Object[]{this, videoState, tabId});
            return;
        }
        q.d(videoState, "videoState");
        q.d(tabId, "tabId");
        com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoMessageObserver", "卡片的视频状态发生改变的时机，videoState=" + videoState + "，tabId=" + tabId);
    }

    public void f(String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, tabId});
            return;
        }
        q.d(tabId, "tabId");
        com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoMessageObserver", "首卡首帧渲染完成的时机，tabId=" + tabId);
    }
}
