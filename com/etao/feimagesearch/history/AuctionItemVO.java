package com.etao.feimagesearch.history;

import android.net.Uri;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.kge;
import tb.nog;

/* loaded from: classes3.dex */
public class AuctionItemVO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int allowanceStatus;
    public String auctionURL;
    public String duration;
    public String fileUrl;
    public boolean isVideo;
    @JSONField(name = "item_id")
    public String itemId;
    public Map<String, String> mExtraJSKV;
    public Integer mSource;
    public String photofrom;
    @JSONField(name = nog.PRD_PICURL)
    public Uri picPath;
    public String price;
    public String priceWithRate;
    public String spuId;
    public String srpTarget;
    public Long timeStr;
    public String uniqpid;

    /* loaded from: classes3.dex */
    public enum ItemSource {
        REMOTE_TFS(0, "远程tfs key"),
        LOCAL_ALBUM(1, "本地相册");
        
        private String mDesc;
        private int mValue;

        ItemSource(int i, String str) {
            this.mValue = i;
            this.mDesc = str;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    static {
        kge.a(747029637);
        kge.a(1028243835);
    }

    public boolean hasAllowance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("62347829", new Object[]{this})).booleanValue() : this.allowanceStatus == 1;
    }

    public AuctionItemVO deepClone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionItemVO) ipChange.ipc$dispatch("4eb0cb48", new Object[]{this});
        }
        AuctionItemVO auctionItemVO = new AuctionItemVO();
        auctionItemVO.picPath = this.picPath;
        auctionItemVO.price = this.price;
        auctionItemVO.priceWithRate = this.priceWithRate;
        auctionItemVO.auctionURL = this.auctionURL;
        auctionItemVO.uniqpid = this.uniqpid;
        auctionItemVO.itemId = this.itemId;
        auctionItemVO.spuId = this.spuId;
        auctionItemVO.srpTarget = this.srpTarget;
        auctionItemVO.timeStr = this.timeStr;
        auctionItemVO.photofrom = this.photofrom;
        auctionItemVO.mExtraJSKV = this.mExtraJSKV;
        auctionItemVO.isVideo = this.isVideo;
        auctionItemVO.duration = this.duration;
        auctionItemVO.fileUrl = this.fileUrl;
        auctionItemVO.mSource = this.mSource;
        auctionItemVO.allowanceStatus = this.allowanceStatus;
        return auctionItemVO;
    }
}
