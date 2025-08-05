package com.taobao.android.fluid.framework.data.remote;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.tao.infoflow.multitab.e;
import java.io.Serializable;
import java.util.List;
import tb.fjp;
import tb.kge;

/* loaded from: classes5.dex */
public class TaskList implements Serializable {
    @JSONField(name = "tasks")
    public List<Task> tasks;
    @JSONField(name = "userId")
    public String userId;

    /* loaded from: classes5.dex */
    public static class BackParams implements Serializable {
        @JSONField(name = "subId")
        public String subId;
        @JSONField(name = e.KEY_TAB_ID)
        public String tabId;

        static {
            kge.a(-1175960127);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class Data implements Serializable {
        @JSONField(name = "contentId")
        public String contentId;
        @JSONField(name = "failedCode")
        public String failedCode;
        @JSONField(name = "publishInfo")
        public PublishInfo publishInfo;
        @JSONField(name = "type")
        public String type;

        static {
            kge.a(222182174);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class ExtraParams implements Serializable {
        @JSONField(name = "online_time")
        public String online_time;
        @JSONField(name = "videoHeight")
        public String videoHeight;
        @JSONField(name = "videoWidth")
        public String videoWidth;

        static {
            kge.a(1232787394);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class InputInfo implements Serializable {
        @JSONField(name = fjp.SCENE_MEDIA_PLAYER)
        public List<Media> media;
        @JSONField(name = "music")
        public Music music;

        static {
            kge.a(-344786780);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class Media implements Serializable {
        @JSONField(name = "height")
        public String height;
        @JSONField(name = "mediaType")
        public String mediaType;
        @JSONField(name = "path")
        public String path;
        @JSONField(name = "url")
        public String url;
        @JSONField(name = "width")
        public String width;

        static {
            kge.a(-1693871376);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class Music implements Serializable {
        @JSONField(name = "audioId")
        public String audioId;
        @JSONField(name = "id")
        public String id;
        @JSONField(name = "path")
        public String path;
        @JSONField(name = "url")
        public String url;
        @JSONField(name = "vendorType")
        public int vendorType;

        static {
            kge.a(-1693380303);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class PublishInfo implements Serializable {
        @JSONField(name = "extraParams")
        public ExtraParams extraParams;
        @JSONField(name = "inputInfo")
        public InputInfo inputInfo;

        static {
            kge.a(-644415383);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class Task implements Serializable {
        @JSONField(name = "backParams")
        public BackParams backParams;
        @JSONField(name = "data")
        public Data data;
        @JSONField(name = "progress")
        public String progress;
        @JSONField(name = "status")
        public String status;
        @JSONField(name = com.taobao.tao.powermsg.model.a.COL_TASK)
        public String taskId;
        @JSONField(name = "type")
        public int type;

        static {
            kge.a(222658809);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(341342416);
        kge.a(1028243835);
    }
}
