package com.taobao.android.detail.sdk.model.node;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ItemNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String attraction50;
    public String beautyEffectsId;
    public String beautyEffectsUrl;
    public String brandValueId;
    public String categoryId;
    public Long commentCount;
    public ArrayList<MultipleCountItem> countList;
    public String couponUrl;
    public int descType;
    public String groupId;
    public String h5moduleDescUrl;
    public ArrayList<String> images;
    public boolean isElecVoucher;
    public boolean isHideQuantity;
    public boolean isShowAddress;
    public String itemId;
    public int itemPoint;
    public String itemUrl;
    public Long maxDonateCount;
    public Map<String, String> moduleDescParams;
    public String moduleDescUrl;
    public boolean openDecoration;
    public String pointTimes;
    public long rootCategoryId;
    public String sellCount;
    public String shareIcon;
    public String shortTitle;
    public int showShopActivitySize;
    public String skuH5Url;
    public String skuText;
    public String spatialFileSize;
    public String spatialHdVideoUrl;
    public String spatialVideoFileId;
    public String spatialVideoUrl;
    public String subtitle;
    public String taobaoDescUrl;
    public String taobaoPcDescUrl;
    public String themeType;
    public String title;
    public String titleIcon;
    public String tmallDescUrl;
    public int unitBuy;
    public ArrayList<VideoItem> videos;

    /* loaded from: classes4.dex */
    public static class MultipleCountItem {
        public String name;
        public String value;

        static {
            kge.a(1065725226);
        }

        public MultipleCountItem(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.name = c.a(jSONObject.getString("name"));
                this.value = c.a(jSONObject.getString("value"));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class VideoItem {
        public List<AnchorInfo> anchors;
        public String interactiveId;
        public String spatialVideoDimension;
        public int type;
        public String url;
        public String userId;
        public String videoId;
        public String videoThumbnailURL;
        public String weexRecommendUrl;

        /* loaded from: classes4.dex */
        public static class AnchorInfo {
            public String desc;
            public int endTime;

            static {
                kge.a(-294209087);
            }
        }

        static {
            kge.a(-1758353722);
        }

        public VideoItem(JSONObject jSONObject) {
            this.anchors = new ArrayList();
            this.url = c.a(jSONObject.getString("url"));
            this.type = jSONObject.getIntValue("type");
            this.videoThumbnailURL = c.a(jSONObject.getString("videoThumbnailURL"));
            this.videoId = c.a(jSONObject.getString("videoId"));
            this.spatialVideoDimension = c.a(jSONObject.getString("spatialVideoDimension"));
            this.weexRecommendUrl = c.a(jSONObject.getString("weexRecommendUrl"));
            this.spatialVideoDimension = this.spatialVideoDimension.replace(" ", "");
            JSONObject jSONObject2 = jSONObject.getJSONObject("interactiveInfo");
            if (jSONObject2 != null) {
                this.interactiveId = c.a(jSONObject2.getString("interactiveId"));
                this.userId = c.a(jSONObject2.getString("userId"));
            }
            JSONArray jSONArray = jSONObject.getJSONArray("anchors");
            if (jSONArray != null && !jSONArray.isEmpty()) {
                this.anchors = new ArrayList(jSONArray.size());
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    try {
                        JSONObject jSONObject3 = (JSONObject) it.next();
                        AnchorInfo anchorInfo = new AnchorInfo();
                        anchorInfo.desc = c.a(jSONObject3.getString("desc"));
                        anchorInfo.endTime = Integer.parseInt(jSONObject3.getString("endTime"));
                        this.anchors.add(anchorInfo);
                    } catch (Throwable unused) {
                    }
                }
            }
            List<AnchorInfo> list = this.anchors;
            if (list == null || list.size() == 0) {
                AnchorInfo anchorInfo2 = new AnchorInfo();
                anchorInfo2.desc = c.a("视频");
                anchorInfo2.endTime = Integer.MAX_VALUE;
                this.anchors.add(anchorInfo2);
            }
        }
    }

    static {
        kge.a(712561500);
    }

    public ItemNode() {
        this.openDecoration = false;
    }

    public ItemNode(JSONObject jSONObject) {
        super(jSONObject);
        this.openDecoration = false;
        tpc.a("com.taobao.android.detail.sdk.model.node.ItemNode");
        this.itemId = c.a(jSONObject.getString("itemId"));
        this.itemUrl = c.a(jSONObject.getString("itemUrl"));
        this.title = c.a(jSONObject.getString("title"));
        this.subtitle = c.a(jSONObject.getString("subtitle"));
        this.shortTitle = c.a(jSONObject.getString("shortTitle"));
        this.titleIcon = c.a(jSONObject.getString("titleIcon"));
        this.sellCount = c.a(jSONObject.getString("sellCount"));
        this.itemPoint = jSONObject.getIntValue("itemPoint");
        this.pointTimes = c.a(jSONObject.getString("pointTimes"));
        this.couponUrl = c.a(jSONObject.getString("couponUrl"));
        this.skuText = c.a(jSONObject.getString("skuText"));
        this.spatialVideoFileId = c.a(jSONObject.getString("spatialVideoFileId"));
        this.spatialFileSize = c.a(jSONObject.getString("spatialFileSize"));
        this.skuH5Url = c.a(jSONObject.getString("skuH5Url"));
        this.taobaoDescUrl = c.a(jSONObject.getString("taobaoDescUrl"));
        this.taobaoPcDescUrl = c.a(jSONObject.getString("taobaoPcDescUrl"));
        this.tmallDescUrl = c.a(jSONObject.getString("tmallDescUrl"));
        this.moduleDescUrl = c.a(jSONObject.getString("moduleDescUrl"));
        this.isHideQuantity = jSONObject.getBooleanValue("hideQuantity");
        this.isElecVoucher = jSONObject.getBooleanValue("elecVoucher");
        this.themeType = c.a(jSONObject.getString("themeType"));
        this.spatialVideoUrl = c.a(jSONObject.getString("spatialVideoUrl"));
        this.spatialHdVideoUrl = c.a(jSONObject.getString("spatialHdVideoUrl"));
        this.beautyEffectsUrl = c.a(jSONObject.getString("beautyEffectsUrl"));
        this.beautyEffectsId = c.a(jSONObject.getString("beautyEffectsId"));
        this.openDecoration = jSONObject.getBooleanValue("openDecoration");
        this.groupId = c.a(jSONObject.getString("groupId"));
        this.countList = parseCount();
        this.maxDonateCount = Long.valueOf(jSONObject.getLongValue("maxDonateCount"));
        try {
            this.commentCount = Long.valueOf(jSONObject.getLongValue("commentCount"));
        } catch (Exception unused) {
            this.commentCount = 0L;
        }
        this.descType = jSONObject.getIntValue("descType");
        this.h5moduleDescUrl = c.a(jSONObject.getString("h5moduleDescUrl"));
        this.categoryId = c.a(jSONObject.getString("categoryId"));
        this.shareIcon = c.a(jSONObject.getString("shareIcon"));
        this.rootCategoryId = jSONObject.getLongValue("rootCategoryId");
        this.brandValueId = c.a(jSONObject.getString("brandValueId"));
        this.attraction50 = c.a(jSONObject.getString("attraction50"));
        this.images = initImages();
        this.unitBuy = initUnitBuy();
        this.isShowAddress = initShowAddress();
        this.moduleDescParams = (Map) jSONObject.getObject("moduleDescParams", Map.class);
        this.videos = parseVideos();
        try {
            this.showShopActivitySize = jSONObject.getIntValue("showShopActivitySize");
        } catch (Exception unused2) {
            this.showShopActivitySize = 0;
        }
    }

    private boolean initShowAddress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11369412", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.root.getBoolean("showAddress");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private ArrayList<String> initImages() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("42422e89", new Object[]{this}) : c.a(this.root.getJSONArray("images"), new g<String>() { // from class: com.taobao.android.detail.sdk.model.node.ItemNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ String b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public String a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
            }
        });
    }

    private ArrayList<VideoItem> parseVideos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("3d88fdcc", new Object[]{this}) : c.a(this.root.getJSONArray("videos"), new g<VideoItem>() { // from class: com.taobao.android.detail.sdk.model.node.ItemNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.node.ItemNode$VideoItem] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ VideoItem b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public VideoItem a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (VideoItem) ipChange2.ipc$dispatch("ab97a16f", new Object[]{this, obj});
                }
                VideoItem videoItem = new VideoItem((JSONObject) obj);
                if (StringUtils.isEmpty(videoItem.url)) {
                    return null;
                }
                return videoItem;
            }
        });
    }

    private ArrayList<MultipleCountItem> parseCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("6d6e48fd", new Object[]{this}) : c.a(this.root.getJSONArray("countMultiple"), new g<MultipleCountItem>() { // from class: com.taobao.android.detail.sdk.model.node.ItemNode.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.ItemNode$MultipleCountItem, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ MultipleCountItem b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public MultipleCountItem a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (MultipleCountItem) ipChange2.ipc$dispatch("7d668d8b", new Object[]{this, obj}) : new MultipleCountItem((JSONObject) obj);
            }
        });
    }

    public int initUnitBuy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3e08aac", new Object[]{this})).intValue();
        }
        Integer integer = this.root.getInteger("unitBuy");
        if (integer == null) {
            return 1;
        }
        return integer.intValue();
    }
}
