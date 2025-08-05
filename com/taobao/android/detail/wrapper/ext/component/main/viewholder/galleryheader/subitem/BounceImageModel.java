package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class BounceImageModel implements SubItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean hasPicGallaryOverScroll;
    private int index;
    public JSONArray lightOffAction;
    public String lightOffText;
    private ItemNode mItemNode;
    public JSONArray mainPicAction;
    public String mainPicText;
    public TBMultiMediaModel parentModel;

    static {
        kge.a(887911281);
        kge.a(1162456369);
    }

    public BounceImageModel() {
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.BounceImageModel");
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel
    public int getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue() : this.index;
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel
    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.index = i;
        }
    }

    public void setItemNode(ItemNode itemNode) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749e3f61", new Object[]{this, itemNode});
            return;
        }
        this.mItemNode = itemNode;
        if (itemNode == null || itemNode.picGallaryOverScroll == null) {
            z = false;
        }
        this.hasPicGallaryOverScroll = z;
        if (!this.hasPicGallaryOverScroll) {
            return;
        }
        try {
            JSONObject jSONObject = this.mItemNode.picGallaryOverScroll;
            JSONArray jSONArray = null;
            this.mainPicText = jSONObject.containsKey("mainPic") ? jSONObject.getJSONObject("mainPic").getString("text") : null;
            this.lightOffText = jSONObject.containsKey("lightoff") ? jSONObject.getJSONObject("lightoff").getString("text") : null;
            this.mainPicAction = jSONObject.containsKey("mainPic") ? jSONObject.getJSONObject("mainPic").getJSONArray("action") : null;
            if (jSONObject.containsKey("lightoff")) {
                jSONArray = jSONObject.getJSONObject("lightoff").getJSONArray("action");
            }
            this.lightOffAction = jSONArray;
        } catch (Exception unused) {
        }
    }

    public boolean hasPicGallaryOverScroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("782ed20a", new Object[]{this})).booleanValue() : this.hasPicGallaryOverScroll;
    }

    public String getMainPicText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2893eb51", new Object[]{this});
        }
        if (!this.hasPicGallaryOverScroll) {
            return null;
        }
        return this.mainPicText;
    }

    public JSONArray getMainPicAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("331f1446", new Object[]{this});
        }
        if (!this.hasPicGallaryOverScroll) {
            return null;
        }
        return this.mainPicAction;
    }

    public String getLightOffText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce2f54bd", new Object[]{this});
        }
        if (!this.hasPicGallaryOverScroll) {
            return null;
        }
        return this.lightOffText;
    }

    public JSONArray getLightOffAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("f67225b2", new Object[]{this});
        }
        if (!this.hasPicGallaryOverScroll) {
            return null;
        }
        return this.lightOffAction;
    }
}
