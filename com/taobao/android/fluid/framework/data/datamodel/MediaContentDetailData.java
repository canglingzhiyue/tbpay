package com.taobao.android.fluid.framework.data.datamodel;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;
import tb.obo;

/* loaded from: classes5.dex */
public final class MediaContentDetailData implements Serializable, IMTOPDataObject {
    public Account account;
    public Map adParam;
    public BGInteractive bginteractive;
    public Map businessExtraMap;
    public Config config;
    public Content content;
    public Map contentAdParams;
    public Map contentPassParams;
    public boolean hasExposed;
    public String id;
    public int index;
    public Interaction interaction;
    public boolean isLocalPreCacheVideo;
    public PlayletInfo playletInfo;
    public String publishStatus;
    public int relativeIndex;
    public int sequenceNumber;
    public boolean slideUpIncludeMultiCard;
    public int slideUpTransparency;
    public TopTitle topTitle;
    public String trackInfo;
    public String type;
    public String utLogMapEdge;
    public Map<String, String> utPairs;

    /* loaded from: classes5.dex */
    public static final class Account implements Serializable, IMTOPDataObject {
        public Pic avatar;
        public String id;
        public String idStr;
        public String keyName;
        public String name;
        public PreLiveVO preLiveVO;
        public String targetUrl;
        public String type;

        static {
            kge.a(335849605);
            kge.a(-350052935);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class BGInteractive implements Serializable, IMTOPDataObject {
        public int status = 0;

        static {
            kge.a(-1656173099);
            kge.a(-350052935);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class Config implements Serializable, IMTOPDataObject {
        public boolean collectionRelatedFlowRec;
        public boolean disableRecord;
        public String forbidPreDownload;
        public String shareUrl;
        public String slidePageUrl;

        static {
            kge.a(633682410);
            kge.a(-350052935);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static final class Content implements Serializable, IMTOPDataObject {
        public String coverUrl;
        public List<JSONObject> elements;
        public String errorType;
        public String errorUtpairs;
        public String id;
        public String interactiveId;
        public boolean isSecondPageUpBar;
        public List<String> itemIds;
        public Material material;
        public String music;
        public MusicInfoVO musicInfoVO;
        public String status;
        public String summary;
        public String title;
        public VideoElement videoElement;
        public boolean isValid = true;
        public String errorText = "";
        public String errorUrl = "";

        static {
            kge.a(-1830268207);
            kge.a(-350052935);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class Interaction implements Serializable, IMTOPDataObject {
        public InteractionItem collect;
        public InteractionItem comment;
        public InteractionItem disLike;
        public InteractionItem follow;
        public InteractionItem lead2Purchase;
        public InteractionItem like;
        public InteractionItem oralFollow;
        public InteractionItem play;
        public InteractionItem praise;
        public InteractionItem share;
        public InteractionItem view;

        static {
            kge.a(-214630294);
            kge.a(-350052935);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static final class InteractionItem implements Serializable, IMTOPDataObject {
        public int count;
        public String countFmt;
        public String link;
        public String namespace;
        public String targetId;

        static {
            kge.a(1454221981);
            kge.a(-350052935);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class MusicInfoVO implements Serializable, IMTOPDataObject {
        public List<AudioResources> audioResources;
        @JSONField(name = obo.BUSINESS_EXTRA_MAP)
        public Map businessExtraMap;
        public String fromType;
        public MusicParams musicParams;
        public String uploadMusicActor;
        public int uploadMusicId;
        public String uploadMusicName;

        /* loaded from: classes5.dex */
        public static class AudioResources implements Serializable, IMTOPDataObject {
            public int audioId;
            public String cacheKey;
            public int duration;
            public int fileSize;
            public String format;
            public int quality;
            public int rate;
            public String type;
            public String url;

            static {
                kge.a(-519850257);
                kge.a(-350052935);
                kge.a(1028243835);
            }
        }

        /* loaded from: classes5.dex */
        public static class MusicParams implements Serializable, IMTOPDataObject {
            public PlayPairs playPairs;
            public int venderType;

            static {
                kge.a(-2078154741);
                kge.a(-350052935);
                kge.a(1028243835);
            }
        }

        /* loaded from: classes5.dex */
        public static class PlayPairs implements Serializable, IMTOPDataObject {
            public long endTime;
            public long startTime;

            static {
                kge.a(2060016133);
                kge.a(-350052935);
                kge.a(1028243835);
            }
        }

        static {
            kge.a(-1104340796);
            kge.a(-350052935);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static final class Pic implements Serializable, IMTOPDataObject {
        public String height;
        public String type;
        public String url;
        public String width;

        static {
            kge.a(795851746);
            kge.a(-350052935);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static final class PlayletInfo implements Serializable, IMTOPDataObject {
        public String contentPayableImgUrl;
        public boolean free;
        public boolean locked;
        public String tagHeight;
        public String tagWidth;

        static {
            kge.a(61889037);
            kge.a(-350052935);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static final class PreLiveVO implements Serializable, IMTOPDataObject {
        public String id;
        public String living;
        public String subscribed;
        public String time;
        public String title;
        public String url;

        static {
            kge.a(421392768);
            kge.a(-350052935);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class TopTitle implements Serializable, IMTOPDataObject {
        @JSONField(name = "iconPosition")
        public String iconPosition;
        @JSONField(name = "icon")
        public String iconUrl;
        @JSONField(name = "title")
        public String title;
        @JSONField(name = "type")
        public String type;

        static {
            kge.a(-1312904533);
            kge.a(-350052935);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1955926812);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    /* loaded from: classes5.dex */
    public static class Material implements Serializable, IMTOPDataObject {
        @JSONField(name = "cover")
        public String cover;
        @JSONField(name = "id")
        public String id;
        @JSONField(name = "loadingUrl")
        public String loadingUrl;
        @JSONField(name = "url")
        public String url;

        static {
            kge.a(-37350961);
            kge.a(-350052935);
            kge.a(1028243835);
        }

        public String toString() {
            return "Material{cover='" + this.cover + "', id='" + this.id + "', url='" + this.url + "', loadingUrl='" + this.loadingUrl + "'}";
        }
    }
}
