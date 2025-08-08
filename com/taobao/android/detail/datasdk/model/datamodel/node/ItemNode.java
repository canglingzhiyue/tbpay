package com.taobao.android.detail.datasdk.model.datamodel.node;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.fho;
import tb.kge;

/* loaded from: classes4.dex */
public class ItemNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "item";
    public String attraction50;
    public String beautyEffectsId;
    public String beautyEffectsUrl;
    public String brandValueId;
    public String categoryId;
    public Long commentCount;
    public String containerDimension;
    public ArrayList<MultipleCountItem> countList;
    public String couponUrl;
    public int descType;
    public JSONObject exParams;
    public JSONObject extraMap;
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
    public JSONObject picGallaryOverScroll;
    public String platformItemId;
    public String pointTimes;
    public long rootCategoryId;
    public String sellCount;
    public String shareBizCode;
    public String shareIcon;
    public String shareItemLink;
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
    public String wxShareUrl;

    /* loaded from: classes4.dex */
    public static class MultipleCountItem {
        public String name;
        public String value;

        static {
            kge.a(768260592);
        }

        public MultipleCountItem(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.name = epw.a(jSONObject.getString("name"));
                this.value = epw.a(jSONObject.getString("value"));
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
                kge.a(-1545588933);
            }
        }

        static {
            kge.a(869980556);
        }

        public VideoItem(JSONObject jSONObject) {
            this.anchors = new ArrayList();
            this.url = epw.a(jSONObject.getString("url"));
            this.type = jSONObject.getIntValue("type");
            this.videoThumbnailURL = epw.a(jSONObject.getString("videoThumbnailURL"));
            this.videoId = epw.a(jSONObject.getString("videoId"));
            this.spatialVideoDimension = epw.a(jSONObject.getString("spatialVideoDimension"));
            this.weexRecommendUrl = epw.a(jSONObject.getString("weexRecommendUrl"));
            this.spatialVideoDimension = this.spatialVideoDimension.replace(" ", "");
            JSONObject jSONObject2 = jSONObject.getJSONObject("interactiveInfo");
            if (jSONObject2 != null) {
                this.interactiveId = epw.a(jSONObject2.getString("interactiveId"));
                this.userId = epw.a(jSONObject2.getString("userId"));
            }
            JSONArray jSONArray = jSONObject.getJSONArray("anchors");
            if (jSONArray != null && !jSONArray.isEmpty()) {
                this.anchors = new ArrayList(jSONArray.size());
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    try {
                        JSONObject jSONObject3 = (JSONObject) it.next();
                        AnchorInfo anchorInfo = new AnchorInfo();
                        anchorInfo.desc = epw.a(jSONObject3.getString("desc"));
                        anchorInfo.endTime = Integer.parseInt(jSONObject3.getString("endTime"));
                        this.anchors.add(anchorInfo);
                    } catch (Throwable unused) {
                    }
                }
            }
            List<AnchorInfo> list = this.anchors;
            if (list == null || list.size() == 0) {
                AnchorInfo anchorInfo2 = new AnchorInfo();
                anchorInfo2.desc = epw.a("视频");
                anchorInfo2.endTime = Integer.MAX_VALUE;
                this.anchors.add(anchorInfo2);
            }
        }
    }

    static {
        kge.a(460826018);
    }

    public ItemNode() {
        this.openDecoration = false;
        this.exParams = null;
    }

    public ItemNode(JSONObject jSONObject) {
        super(jSONObject);
        this.openDecoration = false;
        this.exParams = null;
        this.itemId = epw.a(jSONObject.getString("itemId"));
        this.itemUrl = epw.a(jSONObject.getString("itemUrl"));
        this.title = epw.a(jSONObject.getString("title"));
        this.subtitle = epw.a(jSONObject.getString("subtitle"));
        this.shortTitle = epw.a(jSONObject.getString("shortTitle"));
        this.titleIcon = epw.a(jSONObject.getString("titleIcon"));
        this.sellCount = epw.a(jSONObject.getString("sellCount"));
        this.itemPoint = jSONObject.getIntValue("itemPoint");
        this.pointTimes = epw.a(jSONObject.getString("pointTimes"));
        this.couponUrl = epw.a(jSONObject.getString("couponUrl"));
        this.skuText = epw.a(jSONObject.getString("skuText"));
        this.spatialVideoFileId = epw.a(jSONObject.getString("spatialVideoFileId"));
        this.spatialFileSize = epw.a(jSONObject.getString("spatialFileSize"));
        this.skuH5Url = epw.a(jSONObject.getString("skuH5Url"));
        this.taobaoDescUrl = epw.a(jSONObject.getString("taobaoDescUrl"));
        this.taobaoPcDescUrl = epw.a(jSONObject.getString("taobaoPcDescUrl"));
        this.tmallDescUrl = epw.a(jSONObject.getString("tmallDescUrl"));
        this.moduleDescUrl = epw.a(jSONObject.getString("moduleDescUrl"));
        this.isHideQuantity = jSONObject.getBooleanValue("hideQuantity");
        this.isElecVoucher = jSONObject.getBooleanValue("elecVoucher");
        this.themeType = epw.a(jSONObject.getString("themeType"));
        this.spatialVideoUrl = epw.a(jSONObject.getString("spatialVideoUrl"));
        this.spatialHdVideoUrl = epw.a(jSONObject.getString("spatialHdVideoUrl"));
        this.beautyEffectsUrl = epw.a(jSONObject.getString("beautyEffectsUrl"));
        this.beautyEffectsId = epw.a(jSONObject.getString("beautyEffectsId"));
        this.openDecoration = jSONObject.getBooleanValue("openDecoration");
        this.groupId = epw.a(jSONObject.getString("groupId"));
        this.countList = parseCount();
        this.maxDonateCount = Long.valueOf(jSONObject.getLongValue("maxDonateCount"));
        try {
            this.commentCount = Long.valueOf(jSONObject.getLongValue("commentCount"));
        } catch (Exception unused) {
            this.commentCount = 0L;
        }
        this.descType = jSONObject.getIntValue("descType");
        this.h5moduleDescUrl = epw.a(jSONObject.getString("h5moduleDescUrl"));
        this.categoryId = epw.a(jSONObject.getString("categoryId"));
        this.shareIcon = epw.a(jSONObject.getString("shareIcon"));
        this.rootCategoryId = jSONObject.getLongValue("rootCategoryId");
        this.brandValueId = epw.a(jSONObject.getString("brandValueId"));
        this.attraction50 = epw.a(jSONObject.getString("attraction50"));
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
        this.exParams = jSONObject.getJSONObject("exParams");
        this.extraMap = jSONObject.getJSONObject("extraMap");
        this.picGallaryOverScroll = jSONObject.getJSONObject("picGallaryOverScroll");
        this.containerDimension = epw.a(jSONObject.getString(fho.KEY_CONTAINER_DIMENSION));
        this.shareItemLink = epw.a(jSONObject.getString("shareItemLink"));
        this.shareBizCode = epw.a(jSONObject.getString("shareBizCode"));
        this.wxShareUrl = epw.a(jSONObject.getString("wxShareUrl"));
        this.platformItemId = epw.a(jSONObject.getString("platformItemId"));
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode");
    }

    private boolean initShowAddress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11369412", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.data.getBoolean("showAddress");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private ArrayList<String> initImages() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("42422e89", new Object[]{this}) : epw.a(this.data.getJSONArray("images"), new epy<String>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // tb.epy
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
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("3d88fdcc", new Object[]{this}) : epw.a(this.data.getJSONArray("videos"), new epy<VideoItem>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode$VideoItem] */
            @Override // tb.epy
            public /* synthetic */ VideoItem b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public VideoItem a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (VideoItem) ipChange2.ipc$dispatch("8fdc99e9", new Object[]{this, obj});
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
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("6d6e48fd", new Object[]{this}) : epw.a(this.data.getJSONArray("countMultiple"), new epy<MultipleCountItem>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode$MultipleCountItem, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ MultipleCountItem b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public MultipleCountItem a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (MultipleCountItem) ipChange2.ipc$dispatch("d1d06c05", new Object[]{this, obj}) : new MultipleCountItem((JSONObject) obj);
            }
        });
    }

    public int initUnitBuy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3e08aac", new Object[]{this})).intValue();
        }
        Integer integer = this.data.getInteger("unitBuy");
        if (integer == null) {
            return 1;
        }
        return integer.intValue();
    }
}
