package com.taobao.detail.rate.v2;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import tb.eby;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0004QRSTB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR(\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010?\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001c\u0010B\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010H\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001c\u0010K\u001a\u0004\u0018\u00010LX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006U"}, d2 = {"Lcom/taobao/detail/rate/v2/PreviewItemV2;", "Ljava/io/Serializable;", "()V", "browseNamespace", "", "getBrowseNamespace", "()Ljava/lang/String;", "setBrowseNamespace", "(Ljava/lang/String;)V", "cLikeNamespace", "getCLikeNamespace", "setCLikeNamespace", "commentNamespace", "getCommentNamespace", "setCommentNamespace", "content", "getContent", "setContent", "contentId", "getContentId", "setContentId", "contentInteract", "Lcom/taobao/detail/rate/v2/PreviewItemV2$ContentInteract;", "getContentInteract", "()Lcom/taobao/detail/rate/v2/PreviewItemV2$ContentInteract;", "setContentInteract", "(Lcom/taobao/detail/rate/v2/PreviewItemV2$ContentInteract;)V", "contentTitle", "getContentTitle", "setContentTitle", "detailUrl", "getDetailUrl", "setDetailUrl", "newDetailUrl", "getNewDetailUrl", "setNewDetailUrl", "orderIndex", "", "getOrderIndex", "()I", "setOrderIndex", "(I)V", "pLikeNamespace", "getPLikeNamespace", "setPLikeNamespace", "pic", "Lcom/taobao/detail/rate/v2/PreviewItemV2$PicInfo;", "getPic", "()Lcom/taobao/detail/rate/v2/PreviewItemV2$PicInfo;", "setPic", "(Lcom/taobao/detail/rate/v2/PreviewItemV2$PicInfo;)V", "rateSearchParam", "getRateSearchParam", "setRateSearchParam", "repeatBusiness", "getRepeatBusiness", "setRepeatBusiness", "skuMap", "", "getSkuMap", "()Ljava/util/Map;", "setSkuMap", "(Ljava/util/Map;)V", "uniqueId", "getUniqueId", "setUniqueId", "userInfo", "Lcom/taobao/detail/rate/v2/PreviewItemV2$UserInfo;", "getUserInfo", "()Lcom/taobao/detail/rate/v2/PreviewItemV2$UserInfo;", "setUserInfo", "(Lcom/taobao/detail/rate/v2/PreviewItemV2$UserInfo;)V", "vLikeNamespace", "getVLikeNamespace", "setVLikeNamespace", "video", "Lcom/taobao/detail/rate/v2/PreviewItemV2$VideoInfo;", "getVideo", "()Lcom/taobao/detail/rate/v2/PreviewItemV2$VideoInfo;", "setVideo", "(Lcom/taobao/detail/rate/v2/PreviewItemV2$VideoInfo;)V", "ContentInteract", "PicInfo", "UserInfo", "VideoInfo", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class PreviewItemV2 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String browseNamespace;
    private String cLikeNamespace;
    private String commentNamespace;
    private String content;
    private String contentId;
    private ContentInteract contentInteract;
    private String contentTitle;
    private String detailUrl;
    private String newDetailUrl;
    private int orderIndex;
    private String pLikeNamespace;
    private PicInfo pic;
    private String rateSearchParam;
    private String repeatBusiness;
    private Map<String, String> skuMap;
    private String uniqueId;
    private UserInfo userInfo;
    private String vLikeNamespace;
    private VideoInfo video;

    public final String getBrowseNamespace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2de061e", new Object[]{this}) : this.browseNamespace;
    }

    public final void setBrowseNamespace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130a9280", new Object[]{this, str});
        } else {
            this.browseNamespace = str;
        }
    }

    public final String getCLikeNamespace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13321682", new Object[]{this}) : this.cLikeNamespace;
    }

    public final void setCLikeNamespace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63dcdb34", new Object[]{this, str});
        } else {
            this.cLikeNamespace = str;
        }
    }

    public final String getCommentNamespace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18c89907", new Object[]{this}) : this.commentNamespace;
    }

    public final void setCommentNamespace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8d164f", new Object[]{this, str});
        } else {
            this.commentNamespace = str;
        }
    }

    public final String getVLikeNamespace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b54851d5", new Object[]{this}) : this.vLikeNamespace;
    }

    public final void setVLikeNamespace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e0a41", new Object[]{this, str});
        } else {
            this.vLikeNamespace = str;
        }
    }

    public final String getContentId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8392bcfb", new Object[]{this}) : this.contentId;
    }

    public final void setContentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71029e43", new Object[]{this, str});
        } else {
            this.contentId = str;
        }
    }

    public final String getContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this}) : this.content;
    }

    public final void setContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
        } else {
            this.content = str;
        }
    }

    public final String getContentTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2bdde244", new Object[]{this}) : this.contentTitle;
    }

    public final void setContentTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e07cdab2", new Object[]{this, str});
        } else {
            this.contentTitle = str;
        }
    }

    public final String getDetailUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dbf62f51", new Object[]{this}) : this.detailUrl;
    }

    public final void setDetailUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("250d76ad", new Object[]{this, str});
        } else {
            this.detailUrl = str;
        }
    }

    public final String getNewDetailUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dbf75f65", new Object[]{this}) : this.newDetailUrl;
    }

    public final void setNewDetailUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339301b1", new Object[]{this, str});
        } else {
            this.newDetailUrl = str;
        }
    }

    public final int getOrderIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e3acb194", new Object[]{this})).intValue() : this.orderIndex;
    }

    public final void setOrderIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c08ef6", new Object[]{this, new Integer(i)});
        } else {
            this.orderIndex = i;
        }
    }

    public final String getPLikeNamespace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4c33d34f", new Object[]{this}) : this.pLikeNamespace;
    }

    public final void setPLikeNamespace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b12b807", new Object[]{this, str});
        } else {
            this.pLikeNamespace = str;
        }
    }

    public final String getRateSearchParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("301a81ca", new Object[]{this}) : this.rateSearchParam;
    }

    public final void setRateSearchParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d5d8c54", new Object[]{this, str});
        } else {
            this.rateSearchParam = str;
        }
    }

    public final String getRepeatBusiness() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("939f1c28", new Object[]{this}) : this.repeatBusiness;
    }

    public final void setRepeatBusiness(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1108a4e", new Object[]{this, str});
        } else {
            this.repeatBusiness = str;
        }
    }

    public final String getUniqueId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("206169f7", new Object[]{this}) : this.uniqueId;
    }

    public final void setUniqueId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a92f5f", new Object[]{this, str});
        } else {
            this.uniqueId = str;
        }
    }

    public final VideoInfo getVideo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoInfo) ipChange.ipc$dispatch("bd9c15f0", new Object[]{this}) : this.video;
    }

    public final void setVideo(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("731852f4", new Object[]{this, videoInfo});
        } else {
            this.video = videoInfo;
        }
    }

    public final PicInfo getPic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PicInfo) ipChange.ipc$dispatch("7d1117d0", new Object[]{this}) : this.pic;
    }

    public final void setPic(PicInfo picInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65665f16", new Object[]{this, picInfo});
        } else {
            this.pic = picInfo;
        }
    }

    public final ContentInteract getContentInteract() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContentInteract) ipChange.ipc$dispatch("468dd0fe", new Object[]{this}) : this.contentInteract;
    }

    public final void setContentInteract(ContentInteract contentInteract) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb3701a", new Object[]{this, contentInteract});
        } else {
            this.contentInteract = contentInteract;
        }
    }

    public final UserInfo getUserInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UserInfo) ipChange.ipc$dispatch("1911c49a", new Object[]{this}) : this.userInfo;
    }

    public final void setUserInfo(UserInfo userInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d0ebcbc", new Object[]{this, userInfo});
        } else {
            this.userInfo = userInfo;
        }
    }

    public final Map<String, String> getSkuMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("1dfd8d31", new Object[]{this}) : this.skuMap;
    }

    public final void setSkuMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e342187d", new Object[]{this, map});
        } else {
            this.skuMap = map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/taobao/detail/rate/v2/PreviewItemV2$PicInfo;", "Ljava/io/Serializable;", "()V", "fileId", "", "getFileId", "()Ljava/lang/String;", "setFileId", "(Ljava/lang/String;)V", "height", "", "getHeight", "()Ljava/lang/Integer;", "setHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", eby.KEY_PIC_URL, "getPicUrl", "setPicUrl", "width", "getWidth", "setWidth", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class PicInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String fileId;
        private Integer height;
        private String picUrl;
        private Integer width;

        public final Integer getWidth() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("ce3617fe", new Object[]{this}) : this.width;
        }

        public final void setWidth(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9df9f8c", new Object[]{this, num});
            } else {
                this.width = num;
            }
        }

        public final Integer getHeight() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("9786c04b", new Object[]{this}) : this.height;
        }

        public final void setHeight(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71fd9c47", new Object[]{this, num});
            } else {
                this.height = num;
            }
        }

        public final String getFileId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbadda6c", new Object[]{this}) : this.fileId;
        }

        public final void setFileId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59b7608a", new Object[]{this, str});
            } else {
                this.fileId = str;
            }
        }

        public final String getPicUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a92c3f5e", new Object[]{this}) : this.picUrl;
        }

        public final void setPicUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0599d8", new Object[]{this, str});
            } else {
                this.picUrl = str;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/taobao/detail/rate/v2/PreviewItemV2$VideoInfo;", "Ljava/io/Serializable;", "()V", "bizCode", "", "getBizCode", "()Ljava/lang/String;", "setBizCode", "(Ljava/lang/String;)V", "height", "", "getHeight", "()Ljava/lang/Integer;", "setHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", eby.KEY_PIC_URL, "getPicUrl", "setPicUrl", "videoId", "getVideoId", "setVideoId", "videoUrl", "getVideoUrl", "setVideoUrl", "width", "getWidth", "setWidth", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class VideoInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String bizCode;
        private Integer height;
        private String picUrl;
        private String videoId;
        private String videoUrl;
        private Integer width;

        public final Integer getWidth() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("ce3617fe", new Object[]{this}) : this.width;
        }

        public final void setWidth(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9df9f8c", new Object[]{this, num});
            } else {
                this.width = num;
            }
        }

        public final Integer getHeight() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("9786c04b", new Object[]{this}) : this.height;
        }

        public final void setHeight(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71fd9c47", new Object[]{this, num});
            } else {
                this.height = num;
            }
        }

        public final String getVideoId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this}) : this.videoId;
        }

        public final void setVideoId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("805acfc5", new Object[]{this, str});
            } else {
                this.videoId = str;
            }
        }

        public final String getVideoUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this}) : this.videoUrl;
        }

        public final void setVideoUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
            } else {
                this.videoUrl = str;
            }
        }

        public final String getPicUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a92c3f5e", new Object[]{this}) : this.picUrl;
        }

        public final void setPicUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0599d8", new Object[]{this, str});
            } else {
                this.picUrl = str;
            }
        }

        public final String getBizCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this}) : this.bizCode;
        }

        public final void setBizCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
            } else {
                this.bizCode = str;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/taobao/detail/rate/v2/PreviewItemV2$ContentInteract;", "Ljava/io/Serializable;", "()V", "alreadyLike", "", "getAlreadyLike", "()Ljava/lang/String;", "setAlreadyLike", "(Ljava/lang/String;)V", "commentCount", "getCommentCount", "setCommentCount", "likeCount", "getLikeCount", "setLikeCount", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class ContentInteract implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String alreadyLike;
        private String commentCount;
        private String likeCount;

        public final String getAlreadyLike() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6eb6f1c0", new Object[]{this}) : this.alreadyLike;
        }

        public final void setAlreadyLike(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fde751e", new Object[]{this, str});
            } else {
                this.alreadyLike = str;
            }
        }

        public final String getCommentCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e2a6253", new Object[]{this}) : this.commentCount;
        }

        public final void setCommentCount(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7c05c83", new Object[]{this, str});
            } else {
                this.commentCount = str;
            }
        }

        public final String getLikeCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c66dfb37", new Object[]{this}) : this.likeCount;
        }

        public final void setLikeCount(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("898f2787", new Object[]{this, str});
            } else {
                this.likeCount = str;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/taobao/detail/rate/v2/PreviewItemV2$UserInfo;", "Ljava/io/Serializable;", "()V", "detailUrl", "", "getDetailUrl", "()Ljava/lang/String;", "setDetailUrl", "(Ljava/lang/String;)V", "iconUrl", "getIconUrl", "setIconUrl", "nick", "getNick", "setNick", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class UserInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String detailUrl;
        private String iconUrl;
        private String nick;

        public final String getDetailUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dbf62f51", new Object[]{this}) : this.detailUrl;
        }

        public final void setDetailUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("250d76ad", new Object[]{this, str});
            } else {
                this.detailUrl = str;
            }
        }

        public final String getIconUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43d20f9", new Object[]{this}) : this.iconUrl;
        }

        public final void setIconUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a6a8705", new Object[]{this, str});
            } else {
                this.iconUrl = str;
            }
        }

        public final String getNick() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this}) : this.nick;
        }

        public final void setNick(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a04e97b6", new Object[]{this, str});
            } else {
                this.nick = str;
            }
        }
    }
}
