package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.io.Serializable;
import java.util.List;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public class GalleryNode extends DetailNode {
    public static final String TAG = "gallery";
    public List<GalleryItemNode> center;
    public List<GalleryItemNode> left;
    public List<GalleryItemNode> right;

    /* loaded from: classes4.dex */
    public static class ContentOpenUrl implements Serializable {
        public String url;

        static {
            kge.a(940430089);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes4.dex */
    public static class ContentVideo implements Serializable {
        public String coverUrl;
        public String videoId;
        public String videoRatio;
        public String videoUrl;

        static {
            kge.a(-546955841);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes4.dex */
    public static class IndicatorImage implements Serializable {
        public String icon;
        public String text;

        static {
            kge.a(278076297);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-1977486489);
    }

    public GalleryNode() {
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.GalleryNode");
    }

    public GalleryNode(JSONObject jSONObject) {
        super(jSONObject);
        if (jSONObject == null) {
            return;
        }
        this.left = epw.a(jSONObject.getJSONArray("left"), new epy<GalleryItemNode>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.GalleryNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.node.GalleryNode$GalleryItemNode] */
            @Override // tb.epy
            public /* synthetic */ GalleryItemNode b(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public GalleryItemNode a(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (GalleryItemNode) ipChange.ipc$dispatch("8f655337", new Object[]{this, obj}) : new GalleryItemNode((JSONObject) obj);
            }
        });
        jSONObject.getJSONArray("center");
        this.right = epw.a(jSONObject.getJSONArray("right"), new epy<GalleryItemNode>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.GalleryNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.node.GalleryNode$GalleryItemNode] */
            @Override // tb.epy
            public /* synthetic */ GalleryItemNode b(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public GalleryItemNode a(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (GalleryItemNode) ipChange.ipc$dispatch("8f655337", new Object[]{this, obj}) : new GalleryItemNode((JSONObject) obj);
            }
        });
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.GalleryNode");
    }

    /* loaded from: classes4.dex */
    public static class GalleryItemNode implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public GalleryContent content;
        public GalleryIndicator indicator;

        static {
            kge.a(-685607478);
            kge.a(1028243835);
        }

        public GalleryItemNode(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.content = (GalleryContent) JSON.toJavaObject(jSONObject.getJSONObject("content"), GalleryContent.class);
                this.indicator = (GalleryIndicator) JSON.toJavaObject(jSONObject.getJSONObject(WXBasicComponentType.INDICATOR), GalleryIndicator.class);
            }
        }

        public int getContentType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4c75c817", new Object[]{this})).intValue();
            }
            GalleryContent galleryContent = this.content;
            if (galleryContent == null) {
                return 0;
            }
            return galleryContent.verifyType();
        }

        public int getIndicatorType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7fa1112d", new Object[]{this})).intValue();
            }
            GalleryIndicator galleryIndicator = this.indicator;
            if (galleryIndicator == null) {
                return 0;
            }
            return galleryIndicator.verifyType();
        }
    }

    /* loaded from: classes4.dex */
    public static class GalleryContent implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int IMAGE = 1;
        public static final int OPEN_URL = 3;
        private static final String TYPE_IMAGE = "image";
        private static final String TYPE_OPEN_URL = "openUrl";
        private static final String TYPE_VIDEO = "video";
        public static final int UNKNOWN = 0;
        public static final int VIDEO = 2;
        public JSONObject data;
        public String type;

        static {
            kge.a(-632585276);
            kge.a(1028243835);
        }

        public int verifyType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f9e94a4d", new Object[]{this})).intValue();
            }
            String str = this.type;
            if (str == null) {
                return 0;
            }
            if ("image".equals(str)) {
                return 1;
            }
            if ("video".equals(this.type)) {
                return 2;
            }
            return "openUrl".equals(this.type) ? 3 : 0;
        }

        public ContentOpenUrl getOpenUrlContentData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ContentOpenUrl) ipChange.ipc$dispatch("5d8e7c43", new Object[]{this});
            }
            if (!"openUrl".equals(this.type)) {
                return null;
            }
            return (ContentOpenUrl) JSON.toJavaObject(this.data, ContentOpenUrl.class);
        }

        public ContentVideo getVideoContentData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ContentVideo) ipChange.ipc$dispatch("59da8597", new Object[]{this});
            }
            if (!"video".equals(this.type)) {
                return null;
            }
            return (ContentVideo) JSON.toJavaObject(this.data, ContentVideo.class);
        }
    }

    /* loaded from: classes4.dex */
    public static class GalleryIndicator implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int IMAGE = 1;
        private static final String TYPE_IMAGE = "image";
        private static final String TYPE_VIDEO = "video";
        public static final int UNKNOWN = 0;
        public static final int VIDEO = 2;
        public JSONObject data;
        public String type;

        static {
            kge.a(1666016922);
            kge.a(1028243835);
        }

        public int verifyType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f9e94a4d", new Object[]{this})).intValue();
            }
            String str = this.type;
            if (str == null) {
                return 0;
            }
            if ("image".equals(str)) {
                return 1;
            }
            return "video".equals(this.type) ? 2 : 0;
        }

        public IndicatorImage getImageIndicatorData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IndicatorImage) ipChange.ipc$dispatch("12c884c3", new Object[]{this});
            }
            if (!"image".equals(this.type)) {
                return null;
            }
            return (IndicatorImage) JSON.toJavaObject(this.data, IndicatorImage.class);
        }
    }
}
