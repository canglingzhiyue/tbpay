package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.z;
import java.util.ArrayList;
import tb.kge;

@MappingKey(key = "item")
/* loaded from: classes4.dex */
public class Item extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String businessId;
    private final String categoryId;
    private long commentCount;
    private final JSONObject exParams;
    private final String groupId;
    private final String h5ItemUrl;
    private ArrayList<String> images;
    private final String itemId;
    private final JSONObject moduleDescParams;
    private final String platformItemId;
    private final String rootCategoryId;
    private final String shareBizCode;
    private final String shareItemLink;
    private final String title;
    private final String wxShareUrl;

    static {
        kge.a(1462972331);
    }

    public Item(JSONObject jSONObject) {
        super(jSONObject);
        this.itemId = jSONObject.getString("itemId");
        this.title = jSONObject.getString("title");
        this.shareItemLink = jSONObject.getString("shareItemLink");
        this.wxShareUrl = jSONObject.getString("wxShareUrl");
        this.h5ItemUrl = jSONObject.getString("h5ItemUrl");
        this.platformItemId = jSONObject.getString("platformItemId");
        this.shareBizCode = jSONObject.getString("shareBizCode");
        this.categoryId = jSONObject.getString("categoryId");
        this.rootCategoryId = jSONObject.getString("rootCategoryId");
        this.images = initImages(jSONObject);
        try {
            this.commentCount = jSONObject.getLongValue("commentCount");
        } catch (Throwable unused) {
            this.commentCount = 0L;
        }
        this.groupId = jSONObject.getString("groupId");
        this.exParams = jSONObject.getJSONObject("exParams");
        this.moduleDescParams = jSONObject.getJSONObject("moduleDescParams");
        this.businessId = jSONObject.getString("businessId");
    }

    private ArrayList<String> initImages(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("7a8f4dfb", new Object[]{this, jSONObject}) : z.a(jSONObject.getJSONArray("images"), new z.a<String>() { // from class: com.taobao.android.detail.ttdetail.data.meta.Item.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // com.taobao.android.detail.ttdetail.utils.z.a
            public /* synthetic */ String convert(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("cbc0bfdc", new Object[]{this, obj}) : a(obj);
            }

            public String a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj});
                }
                if (!(obj instanceof String)) {
                    return null;
                }
                return (String) obj;
            }
        });
    }

    public String getFirstImageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2875328b", new Object[]{this});
        }
        ArrayList<String> arrayList = this.images;
        if (arrayList != null && arrayList.size() > 0) {
            return this.images.get(0);
        }
        return null;
    }

    public String getItemId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this}) : this.itemId;
    }

    public String getTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.title;
    }

    public String getShareItemLink() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("392e45c3", new Object[]{this}) : this.shareItemLink;
    }

    public String getWxShareUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("797df252", new Object[]{this}) : this.wxShareUrl;
    }

    public String getH5ItemUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a610780", new Object[]{this}) : this.h5ItemUrl;
    }

    public String getPlatformItemId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84056082", new Object[]{this}) : this.platformItemId;
    }

    public String getShareBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cdf5b822", new Object[]{this}) : this.shareBizCode;
    }

    public String getCategoryId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ab8b4baa", new Object[]{this}) : this.categoryId;
    }

    public String getRootCategoryId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("67d3168", new Object[]{this}) : this.rootCategoryId;
    }

    public ArrayList<String> getImages() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("9e939a4f", new Object[]{this}) : this.images;
    }

    public long getCommentCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3109e1", new Object[]{this})).longValue() : this.commentCount;
    }

    public String getGroupId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99b7d9b5", new Object[]{this}) : this.groupId;
    }

    public JSONObject getExParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("512995b6", new Object[]{this}) : this.exParams;
    }

    public JSONObject getModuleDescParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("37fa11a0", new Object[]{this}) : this.moduleDescParams;
    }

    public String getBusinessId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58f54ea8", new Object[]{this}) : this.businessId;
    }
}
